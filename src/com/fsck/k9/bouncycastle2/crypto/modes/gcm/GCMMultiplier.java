package com.fsck.k9.bouncycastle2.crypto.modes.gcm;

public interface GCMMultiplier
{
    void init(byte[] H);
    void multiplyH(byte[] x);
}
