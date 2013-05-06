package com.fsck.k9.bouncycastle2.jce.interfaces;

import java.security.PublicKey;

import com.fsck.k9.bouncycastle2.math.ec.ECPoint;

/**
 * interface for elliptic curve public keys.
 */
public interface ECPublicKey
    extends ECKey, PublicKey
{
    /**
     * return the public point Q
     */
    public ECPoint getQ();
}
