package com.fsck.k9.bouncycastle2.jce.provider.symmetric;

import com.fsck.k9.bouncycastle2.crypto.CipherKeyGenerator;
import com.fsck.k9.bouncycastle2.crypto.engines.Grainv1Engine;
import com.fsck.k9.bouncycastle2.jce.provider.JCEKeyGenerator;
import com.fsck.k9.bouncycastle2.jce.provider.JCEStreamCipher;

public final class Grainv1
{
    private Grainv1()
    {
    }
    
    public static class Base
        extends JCEStreamCipher
    {
        public Base()
        {
            super(new Grainv1Engine(), 8);
        }
    }

    public static class KeyGen
        extends JCEKeyGenerator
    {
        public KeyGen()
        {
            super("Grainv1", 80, new CipherKeyGenerator());
        }
    }
}
