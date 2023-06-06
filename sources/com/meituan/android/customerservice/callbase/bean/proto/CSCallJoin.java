package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallJoin extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short appid;
    private short cid;
    private byte dType;
    private String legid;
    private String mber;
    private String sid;
    private HashMap<String, String> uData;
    private byte vendor;

    public CSCallJoin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dade05d4edd10eb2a546684fe79bacb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dade05d4edd10eb2a546684fe79bacb");
        } else {
            setMethod(CSCallUris.SVID_CALL_JOIN);
        }
    }

    public void setMber(String str) {
        this.mber = str;
    }

    public void setdType(byte b) {
        this.dType = b;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    @Override // com.meituan.android.customerservice.callbase.bean.proto.CSCallProto
    public void setVer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3695fb85effc799c8db0565b7eaf72ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3695fb85effc799c8db0565b7eaf72ef");
        } else {
            super.setVer(str);
        }
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setuData(HashMap<String, String> hashMap) {
        this.uData = hashMap;
    }

    public void setCid(short s) {
        this.cid = s;
    }

    public void setVendor(byte b) {
        this.vendor = b;
    }

    public String getSid() {
        return this.sid;
    }

    public String getLegid() {
        return this.legid;
    }

    public byte getVendor() {
        return this.vendor;
    }

    public String getMber() {
        return this.mber;
    }

    public void setAppid(short s) {
        this.appid = s;
    }

    public short getAppid() {
        return this.appid;
    }
}
