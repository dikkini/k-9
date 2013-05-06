package com.fsck.k9.bouncycastle2.jce.interfaces;

import java.security.PublicKey;
import java.math.BigInteger;

public interface GOST3410PublicKey extends GOST3410Key, PublicKey
{

    public BigInteger getY();
}
