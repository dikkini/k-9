package com.fsck.k9.bouncycastle2.jce.interfaces;

import java.security.SecureRandom;

/**
 * all BC provider keystores implement this interface.
 */
public interface BCKeyStore
{
    /**
     * set the random source for the key store
     */
    public void setRandom(SecureRandom random);
}
