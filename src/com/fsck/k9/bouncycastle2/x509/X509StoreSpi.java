package com.fsck.k9.bouncycastle2.x509;

import com.fsck.k9.bouncycastle2.util.Selector;

import java.util.Collection;

public abstract class X509StoreSpi
{
    public abstract void engineInit(X509StoreParameters parameters);

    public abstract Collection engineGetMatches(Selector selector);
}
