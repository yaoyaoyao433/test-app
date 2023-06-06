package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallRing extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String legid;
    private String sKey;
    private String sid;
    private String vCid;
    private byte vendor;

    public CSCallRing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ada6f7f25d29f37395fbda4f6e83df0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ada6f7f25d29f37395fbda4f6e83df0");
        } else {
            setMethod(CSCallUris.SVID_CALL_RING);
        }
    }

    public String getLegid() {
        return this.legid;
    }

    public String getSid() {
        return this.sid;
    }

    public String getsKey() {
        return this.sKey;
    }

    public String getvCid() {
        return this.vCid;
    }

    public byte getVendor() {
        return this.vendor;
    }
}
