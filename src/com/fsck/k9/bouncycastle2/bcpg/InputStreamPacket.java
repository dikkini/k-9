package com.fsck.k9.bouncycastle2.bcpg;

/**
 *
 */
public class InputStreamPacket
    extends Packet
{
    private BCPGInputStream        in;
    
    public InputStreamPacket(
        BCPGInputStream  in)
    {
        this.in = in;
    }
    
    /**
     * Note: you can only read from this once...
     *
     * @return the InputStream
     */
    public BCPGInputStream getInputStream()
    {
        return in;
    }
}
