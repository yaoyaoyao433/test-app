package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallDTMF extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String dtmf;
    private String legid;
    private String sid;

    public CSCallDTMF() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ede1fee8452582030e757a403a1432", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ede1fee8452582030e757a403a1432");
        } else {
            setMethod(CSCallUris.SVID_CALL_DTMF);
        }
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setDtmf(String str) {
        this.dtmf = str;
    }

    public String getLegid() {
        return this.legid;
    }

    public String getSid() {
        return this.sid;
    }
}
