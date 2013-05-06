package com.fsck.k9.bouncycastle2.jce.interfaces;

import com.fsck.k9.bouncycastle2.jce.spec.ECParameterSpec;

/**
 * generic interface for an Elliptic Curve Key.
 */
public interface ECKey
{
    /**
     * return a parameter specification representing the EC domain parameters
     * for the key.
     */
    public ECParameterSpec getParameters();
}
