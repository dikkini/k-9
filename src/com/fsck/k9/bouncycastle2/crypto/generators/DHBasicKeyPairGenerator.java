package com.fsck.k9.bouncycastle2.crypto.generators;

import com.fsck.k9.bouncycastle2.crypto.AsymmetricCipherKeyPair;
import com.fsck.k9.bouncycastle2.crypto.AsymmetricCipherKeyPairGenerator;
import com.fsck.k9.bouncycastle2.crypto.KeyGenerationParameters;
import com.fsck.k9.bouncycastle2.crypto.params.DHKeyGenerationParameters;
import com.fsck.k9.bouncycastle2.crypto.params.DHParameters;
import com.fsck.k9.bouncycastle2.crypto.params.DHPrivateKeyParameters;
import com.fsck.k9.bouncycastle2.crypto.params.DHPublicKeyParameters;

import java.math.BigInteger;

/**
 * a basic Diffie-Hellman key pair generator.
 *
 * This generates keys consistent for use with the basic algorithm for
 * Diffie-Hellman.
 */
public class DHBasicKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{
    private DHKeyGenerationParameters param;

    public void init(
        KeyGenerationParameters param)
    {
        this.param = (DHKeyGenerationParameters)param;
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        DHKeyGeneratorHelper helper = DHKeyGeneratorHelper.INSTANCE;
        DHParameters dhp = param.getParameters();

        BigInteger x = helper.calculatePrivate(dhp, param.getRandom()); 
        BigInteger y = helper.calculatePublic(dhp, x);

        return new AsymmetricCipherKeyPair(
            new DHPublicKeyParameters(y, dhp),
            new DHPrivateKeyParameters(x, dhp));
    }
}
