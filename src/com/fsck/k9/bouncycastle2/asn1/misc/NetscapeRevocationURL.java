package com.fsck.k9.bouncycastle2.asn1.misc;

import com.fsck.k9.bouncycastle2.asn1.*;

public class NetscapeRevocationURL
    extends DERIA5String
{
    public NetscapeRevocationURL(
        DERIA5String str)
    {
        super(str.getString());
    }

    public String toString()
    {
        return "NetscapeRevocationURL: " + this.getString();
    }
}
