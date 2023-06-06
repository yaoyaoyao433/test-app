package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallJoinrsp extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short code;
    private String legid;
    private MeetingStatusItems[] mbers;
    private String reason;
    private String sid;

    public CSCallJoinrsp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a216905fb3a856b8bc479aae4fb04d04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a216905fb3a856b8bc479aae4fb04d04");
        } else {
            setMethod(CSCallUris.SVID_CALL_JOINRSP);
        }
    }

    public void setSid(String str) {
        this.sid = str;
    }

    @Override // com.meituan.android.customerservice.callbase.bean.proto.CSCallProto
    public void setVer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8313ea3c54d73c97dea9eccee31dd586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8313ea3c54d73c97dea9eccee31dd586");
        } else {
            super.setVer(str);
        }
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public String getSid() {
        return this.sid;
    }

    public String getLegid() {
        return this.legid;
    }

    public void setCode(short s) {
        this.code = s;
    }

    public short getCode() {
        return this.code;
    }

    public String getReason() {
        return this.reason;
    }

    public MeetingStatusItems[] getMbers() {
        return this.mbers;
    }
}
