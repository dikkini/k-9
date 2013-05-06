package com.fsck.k9.bouncycastle2.openssl;

import java.io.IOException;

public class EncryptionException
    extends IOException
{
    private Throwable cause;

    public EncryptionException(String msg)
    {
        super(msg);
    }

    public EncryptionException(String msg, Throwable ex)
    {
        super(msg);
        this.cause = ex;
    }

    public Throwable getCause()
    {
        return cause;
    }
}