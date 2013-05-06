package com.fsck.k9.bouncycastle2.util;

public interface Selector
    extends Cloneable
{
    boolean match(Object obj);

    Object clone();
}
