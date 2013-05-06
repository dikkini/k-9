package com.fsck.k9.bouncycastle2.jce.provider.symmetric;

import com.fsck.k9.bouncycastle2.crypto.CipherKeyGenerator;
import com.fsck.k9.bouncycastle2.crypto.engines.Grain128Engine;
import com.fsck.k9.bouncycastle2.jce.provider.JCEKeyGenerator;
import com.fsck.k9.bouncycastle2.jce.provider.JCEStreamCipher;

public final class Grain128
{
    private Grain128()
    {
    }
    
    public static class Base
        extends JCEStreamCipher
    {
        public Base()
        {
            super(new Grain128Engine(), 12);
        }
    }

    public static class KeyGen
        extends JCEKeyGenerator
    {
        public KeyGen()
        {
            super("Grain128", 128, new CipherKeyGenerator());
        }
    }
}
