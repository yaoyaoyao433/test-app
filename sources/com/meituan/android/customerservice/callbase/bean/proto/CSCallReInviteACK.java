package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallReInviteACK extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short code;
    private String legid;
    private String reason;
    private String sid;

    public CSCallReInviteACK() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1261696647ca909e92a10293da1201d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1261696647ca909e92a10293da1201d2");
        } else {
            setMethod(CSCallUris.SVID_CALL_REINVITE_ACK);
        }
    }

    public short getCode() {
        return this.code;
    }

    public String getReason() {
        return this.reason;
    }

    public String getSid() {
        return this.sid;
    }

    public String getLegid() {
        return this.legid;
    }
}
