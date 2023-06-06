package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.android.customerservice.callbase.bean.proto.inner.SessionsItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallGsidListRsp extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short code;
    private long gid;
    private String legid;
    private SessionsItem[] sessions;
    private String tenantId;

    public CSCallGsidListRsp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55da10f7ad4b0c08e77fd17e931c1ec6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55da10f7ad4b0c08e77fd17e931c1ec6");
        } else {
            setMethod(CSCallUris.SVID_CALL_GSIDLISTRSP);
        }
    }

    public String getLegid() {
        return this.legid;
    }

    public long getGid() {
        return this.gid;
    }

    public short getCode() {
        return this.code;
    }

    public SessionsItem[] getSessions() {
        return this.sessions;
    }
}
