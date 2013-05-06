package com.fsck.k9.bouncycastle2.jce.provider.symmetric;

import com.fsck.k9.bouncycastle2.asn1.kisa.KISAObjectIdentifiers;

import java.util.HashMap;

public class SEEDMappings
    extends HashMap
{
    public SEEDMappings()
    {
        put("AlgorithmParameters.SEED", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.SEED$AlgParams");
        put("Alg.Alias.AlgorithmParameters." + KISAObjectIdentifiers.id_seedCBC, "SEED");

        put("AlgorithmParameterGenerator.SEED", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.SEED$AlgParamGen");
        put("Alg.Alias.AlgorithmParameterGenerator." + KISAObjectIdentifiers.id_seedCBC, "SEED");

        put("Cipher.SEED", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.SEED$ECB");
        put("Cipher." + KISAObjectIdentifiers.id_seedCBC, "com.fsck.k9.bouncycastle2.jce.provider.symmetric.SEED$CBC");

        put("Cipher.SEEDWRAP", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.SEED$Wrap");
        put("Alg.Alias.Cipher." + KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap, "SEEDWRAP");

        put("KeyGenerator.SEED", "com.fsck.k9.bouncycastle2.jce.provider.symmetric.SEED$KeyGen");
        put("KeyGenerator." + KISAObjectIdentifiers.id_seedCBC, "com.fsck.k9.bouncycastle2.jce.provider.symmetric.SEED$KeyGen");
        put("KeyGenerator." + KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap, "com.fsck.k9.bouncycastle2.jce.provider.symmetric.SEED$KeyGen");
    }
}
