package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallTrying extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String legid;
    private String sid;

    public CSCallTrying() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69cfa78a132a4aac89d71feb0bfe503f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69cfa78a132a4aac89d71feb0bfe503f");
        } else {
            setMethod(CSCallUris.SVID_CALL_TRYING);
        }
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public String getLegid() {
        return this.legid;
    }

    public String getSid() {
        return this.sid;
    }
}
