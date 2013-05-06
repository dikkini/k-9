package com.fsck.k9.bouncycastle2.crypto.generators;

import java.math.BigInteger;

import com.fsck.k9.bouncycastle2.crypto.AsymmetricCipherKeyPair;
import com.fsck.k9.bouncycastle2.crypto.AsymmetricCipherKeyPairGenerator;
import com.fsck.k9.bouncycastle2.crypto.KeyGenerationParameters;
import com.fsck.k9.bouncycastle2.crypto.params.DHParameters;
import com.fsck.k9.bouncycastle2.crypto.params.ElGamalKeyGenerationParameters;
import com.fsck.k9.bouncycastle2.crypto.params.ElGamalParameters;
import com.fsck.k9.bouncycastle2.crypto.params.ElGamalPrivateKeyParameters;
import com.fsck.k9.bouncycastle2.crypto.params.ElGamalPublicKeyParameters;

/**
 * a ElGamal key pair generator.
 * <p>
 * This generates keys consistent for use with ElGamal as described in
 * page 164 of "Handbook of Applied Cryptography".
 */
public class ElGamalKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{
    private ElGamalKeyGenerationParameters param;

    public void init(
        KeyGenerationParameters param)
    {
        this.param = (ElGamalKeyGenerationParameters)param;
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        DHKeyGeneratorHelper helper = DHKeyGeneratorHelper.INSTANCE;
        ElGamalParameters egp = param.getParameters();
        DHParameters dhp = new DHParameters(egp.getP(), egp.getG(), null, egp.getL());  

        BigInteger x = helper.calculatePrivate(dhp, param.getRandom()); 
        BigInteger y = helper.calculatePublic(dhp, x);

        return new AsymmetricCipherKeyPair(
            new ElGamalPublicKeyParameters(y, egp),
            new ElGamalPrivateKeyParameters(x, egp));
    }
}
