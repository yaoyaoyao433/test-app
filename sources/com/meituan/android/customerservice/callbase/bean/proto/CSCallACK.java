package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallACK extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short code;
    private String legid;
    private String reason;
    private String sid;

    public CSCallACK() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afaf8f02f3394386f972d149bf1bd83e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afaf8f02f3394386f972d149bf1bd83e");
        } else {
            setMethod(CSCallUris.SVID_CALL_ACK);
        }
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setCode(short s) {
        this.code = s;
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public String getReason() {
        return this.reason;
    }

    public String getLegid() {
        return this.legid;
    }

    public String getSid() {
        return this.sid;
    }

    public short getCode() {
        return this.code;
    }
}
