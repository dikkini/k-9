package com.fsck.k9.bouncycastle2.jce.interfaces;

import com.fsck.k9.bouncycastle2.jce.spec.GOST3410PublicKeyParameterSetSpec;

public interface GOST3410Params
{

    public String getPublicKeyParamSetOID();

    public String getDigestParamSetOID();

    public String getEncryptionParamSetOID();
    
    public GOST3410PublicKeyParameterSetSpec getPublicKeyParameters();
}
