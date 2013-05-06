package com.fsck.k9.bouncycastle2.jce.provider.symmetric;

import java.util.HashMap;

public class NoekeonMappings
    extends HashMap
{
    public NoekeonMappings()
    {
        put("AlgorithmParameters.NOEKEON", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.Noekeon$AlgParams");

        put("AlgorithmParameterGenerator.NOEKEON", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.Noekeon$AlgParamGen");
        
        put("Cipher.NOEKEON", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.Noekeon$ECB");

        put("KeyGenerator.NOEKEON", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.Noekeon$KeyGen");
    }
}
