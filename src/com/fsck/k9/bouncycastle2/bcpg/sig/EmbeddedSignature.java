package com.fsck.k9.bouncycastle2.bcpg.sig;

import com.fsck.k9.bouncycastle2.bcpg.SignatureSubpacket;
import com.fsck.k9.bouncycastle2.bcpg.SignatureSubpacketTags;

/**
 * Packet embedded signature
 */
public class EmbeddedSignature
    extends SignatureSubpacket
{
    public EmbeddedSignature(
        boolean    critical,
        byte[]     data)
    {
        super(SignatureSubpacketTags.EMBEDDED_SIGNATURE, critical, data);
    }
}