package com.fsck.k9.bouncycastle2.jce.provider.symmetric;

import java.util.HashMap;

public class Grain128Mappings
    extends HashMap
{
    public Grain128Mappings()
    {
        put("Cipher.Grain128", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.Grain128$Base");
        put("KeyGenerator.Grain128", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.Grain128$KeyGen");
    }
}
