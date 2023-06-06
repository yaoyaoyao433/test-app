package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallBye extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short code;
    private byte dType;
    private String legid;
    private String reason;
    private String sid;

    public CSCallBye() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b262905766e923346075c6e0d12b15d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b262905766e923346075c6e0d12b15d");
        } else {
            setMethod(CSCallUris.SVID_CALL_BYE);
        }
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public String getSid() {
        return this.sid;
    }

    public String getLegid() {
        return this.legid;
    }

    public void setdType(byte b) {
        this.dType = b;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }

    public void setCode(short s) {
        this.code = s;
    }

    public short getCode() {
        return this.code;
    }
}
