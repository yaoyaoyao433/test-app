package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.android.customerservice.callbase.bean.proto.inner.InnerNotifyFmber;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallFmberNotify extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String legid;
    private InnerNotifyFmber msgs;
    private String sid;
    private byte type;
    private String vCid;

    public CSCallFmberNotify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3443c81cf2310b3d15ed8fb0535b1087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3443c81cf2310b3d15ed8fb0535b1087");
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

    public void setMsgs(InnerNotifyFmber innerNotifyFmber) {
        this.msgs = innerNotifyFmber;
    }

    public InnerNotifyFmber getMsgs() {
        return this.msgs;
    }

    public String getvCid() {
        return this.vCid;
    }
}
