package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallPing extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private byte dType;
    private String legid;
    private String sid;
    private String uid;

    public CSCallPing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90e15f65c89321571b70c20ffcc2300d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90e15f65c89321571b70c20ffcc2300d");
        } else {
            setMethod(CSCallUris.SVID_CALL_PING);
        }
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setdType(byte b) {
        this.dType = b;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public String getSid() {
        return this.sid;
    }

    public String getLegid() {
        return this.legid;
    }

    public String getUid() {
        return this.uid;
    }
}
