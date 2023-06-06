package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.android.customerservice.callbase.bean.proto.inner.InnerNotifyMer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallNotify extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long gid;
    private String legid;
    private InnerNotifyMer msgs;
    private String sKey;
    private String sid;
    private byte type;
    private String vCid;

    public CSCallNotify() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6aecc2ac1add65fc445aaf61b6a9981", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6aecc2ac1add65fc445aaf61b6a9981");
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

    public InnerNotifyMer getMsgs() {
        return this.msgs;
    }

    public String getvCid() {
        return this.vCid;
    }

    public long getGid() {
        return this.gid;
    }

    public String getsKey() {
        return this.sKey;
    }
}
