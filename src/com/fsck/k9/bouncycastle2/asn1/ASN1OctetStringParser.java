package com.fsck.k9.bouncycastle2.asn1;

import java.io.InputStream;

public interface ASN1OctetStringParser
    extends DEREncodable
{
    public InputStream getOctetStream();
}
