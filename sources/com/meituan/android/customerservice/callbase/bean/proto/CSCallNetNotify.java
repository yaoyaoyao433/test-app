package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.android.customerservice.callbase.bean.proto.inner.InnerNotifyNet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallNetNotify extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String legid;
    private InnerNotifyNet msgs;
    private String sid;
    private byte type;
    private String vCid;

    public CSCallNetNotify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6065ade2bb51aa5933dff45d111e8080", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6065ade2bb51aa5933dff45d111e8080");
        } else {
            setMethod(CSCallUris.SVID_CALL_NOTIFY);
        }
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setType(byte b) {
        this.type = b;
    }

    public String getSid() {
        return this.sid;
    }

    public String getLegid() {
        return this.legid;
    }

    public byte getType() {
        return this.type;
    }

    public InnerNotifyNet getMsgs() {
        return this.msgs;
    }

    public String getvCid() {
        return this.vCid;
    }
}
