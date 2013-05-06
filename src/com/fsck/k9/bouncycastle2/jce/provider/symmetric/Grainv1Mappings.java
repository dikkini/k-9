package com.fsck.k9.bouncycastle2.jce.provider.symmetric;

import java.util.HashMap;

public class Grainv1Mappings
    extends HashMap
{
    public Grainv1Mappings()
    {
        put("Cipher.Grainv1", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.Grainv1$Base");
        put("KeyGenerator.Grainv1", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.Grainv1$KeyGen");
    }
}
