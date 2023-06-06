package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallRingRsp extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short code;
    private String legid;
    private String reason;
    private String sid;

    public CSCallRingRsp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8e9b4f0a79595683979e29a477a397c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8e9b4f0a79595683979e29a477a397c");
        } else {
            setMethod(CSCallUris.SVID_CALL_RINGRSP);
        }
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setCode(short s) {
        this.code = s;
    }

    public void setReason(String str) {
        this.reason = str;
    }
}
