package com.fsck.k9.bouncycastle2.jce.provider;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

import com.fsck.k9.bouncycastle2.crypto.params.AsymmetricKeyParameter;
import com.fsck.k9.bouncycastle2.crypto.params.DHParameters;
import com.fsck.k9.bouncycastle2.crypto.params.DHPrivateKeyParameters;
import com.fsck.k9.bouncycastle2.crypto.params.DHPublicKeyParameters;

/**
 * utility class for converting jce/jca DH objects
 * objects into their com.fsck.k9.bouncycastle2.crypto counterparts.
 */
public class DHUtil
{
    static public AsymmetricKeyParameter generatePublicKeyParameter(
        PublicKey    key)
        throws InvalidKeyException
    {
        if (key instanceof DHPublicKey)
        {
            DHPublicKey    k = (DHPublicKey)key;

            return new DHPublicKeyParameters(k.getY(),
                new DHParameters(k.getParams().getP(), k.getParams().getG(), null, k.getParams().getL()));
        }

        throw new InvalidKeyException("can't identify DH public key.");
    }

    static public AsymmetricKeyParameter generatePrivateKeyParameter(
        PrivateKey    key)
        throws InvalidKeyException
    {
        if (key instanceof DHPrivateKey)
        {
            DHPrivateKey    k = (DHPrivateKey)key;

            return new DHPrivateKeyParameters(k.getX(),
                new DHParameters(k.getParams().getP(), k.getParams().getG(), null, k.getParams().getL()));
        }
                        
        throw new InvalidKeyException("can't identify DH private key.");
    }
}
