package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallInvitersp extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short code;
    private byte dType;
    private String legid;
    private String reason;
    private String sKey;
    private String sid;
    private String vCid;
    private short vendor;

    public CSCallInvitersp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18c3f932e4f06758bbf050010f325a5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18c3f932e4f06758bbf050010f325a5a");
        } else {
            setMethod(CSCallUris.SVID_CALL_INVITERSP);
        }
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setVendor(short s) {
        this.vendor = s;
    }

    public void setdType(byte b) {
        this.dType = b;
    }

    public void setCode(short s) {
        this.code = s;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setvCid(String str) {
        this.vCid = str;
    }

    public String getSid() {
        return this.sid;
    }

    public String getLegid() {
        return this.legid;
    }

    public short getVendor() {
        return this.vendor;
    }

    public short getCode() {
        return this.code;
    }

    public String getReason() {
        return this.reason;
    }

    public String getvCid() {
        return this.vCid;
    }

    public String getsKey() {
        return this.sKey;
    }
}
