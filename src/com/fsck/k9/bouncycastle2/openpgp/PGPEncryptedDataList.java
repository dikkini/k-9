package com.fsck.k9.bouncycastle2.openpgp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fsck.k9.bouncycastle2.bcpg.BCPGInputStream;
import com.fsck.k9.bouncycastle2.bcpg.InputStreamPacket;
import com.fsck.k9.bouncycastle2.bcpg.PacketTags;
import com.fsck.k9.bouncycastle2.bcpg.PublicKeyEncSessionPacket;
import com.fsck.k9.bouncycastle2.bcpg.SymmetricKeyEncSessionPacket;

/**
 * A holder for a list of PGP encryption method packets.
 */
public class PGPEncryptedDataList
{
    List                 list = new ArrayList();
    InputStreamPacket    data;
    
    public PGPEncryptedDataList(
        BCPGInputStream    pIn)
        throws IOException
    {
        while (pIn.nextPacketTag() == PacketTags.PUBLIC_KEY_ENC_SESSION
            || pIn.nextPacketTag() == PacketTags.SYMMETRIC_KEY_ENC_SESSION)
        {
            list.add(pIn.readPacket());
        }

        data = (InputStreamPacket)pIn.readPacket();
        
        for (int i = 0; i != list.size(); i++)
        {
            if (list.get(i) instanceof SymmetricKeyEncSessionPacket)
            {
                list.set(i, new PGPPBEEncryptedData((SymmetricKeyEncSessionPacket)list.get(i), data));
            }
            else 
            {
                list.set(i, new PGPPublicKeyEncryptedData((PublicKeyEncSessionPacket)list.get(i), data));
            }
        }
    }
    
    public Object get(
        int    index)
    {
        return list.get(index);
    }
    
    public int size()
    {
        return list.size();
    }
    
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    /**
     * @deprecated misspelt - use getEncryptedDataObjects()
     */
    public Iterator getEncyptedDataObjects()
    {
        return list.iterator();
    }
    
    public Iterator getEncryptedDataObjects()
    {
        return list.iterator();
    }
}
