package com.fsck.k9.bouncycastle2.jce.interfaces;

import java.util.Enumeration;

import com.fsck.k9.bouncycastle2.asn1.DEREncodable;
import com.fsck.k9.bouncycastle2.asn1.DERObjectIdentifier;

/**
 * allow us to set attributes on objects that can go into a PKCS12 store.
 */
public interface PKCS12BagAttributeCarrier
{
    void setBagAttribute(
        DERObjectIdentifier oid,
        DEREncodable        attribute);

    DEREncodable getBagAttribute(
        DERObjectIdentifier oid);

    Enumeration getBagAttributeKeys();
}
