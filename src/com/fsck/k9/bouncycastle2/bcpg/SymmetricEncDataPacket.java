package com.fsck.k9.bouncycastle2.bcpg;

/**
 * Basic type for a symmetric key encrypted packet
 */
public class SymmetricEncDataPacket 
    extends InputStreamPacket
{
    public SymmetricEncDataPacket(
        BCPGInputStream  in)
    {
        super(in);
    }
}
