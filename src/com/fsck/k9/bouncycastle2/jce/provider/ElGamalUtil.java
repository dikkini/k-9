package com.fsck.k9.bouncycastle2.jce.provider;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

import com.fsck.k9.bouncycastle2.crypto.params.AsymmetricKeyParameter;
import com.fsck.k9.bouncycastle2.crypto.params.ElGamalParameters;
import com.fsck.k9.bouncycastle2.crypto.params.ElGamalPrivateKeyParameters;
import com.fsck.k9.bouncycastle2.crypto.params.ElGamalPublicKeyParameters;
import com.fsck.k9.bouncycastle2.jce.interfaces.ElGamalPrivateKey;
import com.fsck.k9.bouncycastle2.jce.interfaces.ElGamalPublicKey;

/**
 * utility class for converting jce/jca ElGamal objects
 * objects into their com.fsck.k9.bouncycastle2.crypto counterparts.
 */
public class ElGamalUtil
{
    static public AsymmetricKeyParameter generatePublicKeyParameter(
        PublicKey    key)
        throws InvalidKeyException
    {
        if (key instanceof ElGamalPublicKey)
        {
            ElGamalPublicKey    k = (ElGamalPublicKey)key;

            return new ElGamalPublicKeyParameters(k.getY(),
                new ElGamalParameters(k.getParameters().getP(), k.getParameters().getG()));
        }
        else if (key instanceof DHPublicKey)
        {
            DHPublicKey    k = (DHPublicKey)key;

            return new ElGamalPublicKeyParameters(k.getY(),
                new ElGamalParameters(k.getParams().getP(), k.getParams().getG()));
        }

        throw new InvalidKeyException("can't identify public key for El Gamal.");
    }

    static public AsymmetricKeyParameter generatePrivateKeyParameter(
        PrivateKey    key)
        throws InvalidKeyException
    {
        if (key instanceof ElGamalPrivateKey)
        {
            ElGamalPrivateKey    k = (ElGamalPrivateKey)key;

            return new ElGamalPrivateKeyParameters(k.getX(),
                new ElGamalParameters(k.getParameters().getP(), k.getParameters().getG()));
        }
        else if (key instanceof DHPrivateKey)
        {
            DHPrivateKey    k = (DHPrivateKey)key;

            return new ElGamalPrivateKeyParameters(k.getX(),
                new ElGamalParameters(k.getParams().getP(), k.getParams().getG()));
        }
                        
        throw new InvalidKeyException("can't identify private key for El Gamal.");
    }
}
