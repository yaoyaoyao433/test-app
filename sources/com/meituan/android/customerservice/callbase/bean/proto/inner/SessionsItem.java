package com.meituan.android.customerservice.callbase.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SessionsItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MeetingStatusItems[] mbers;
    private String sKey;
    private String sid;
    private String vCid;

    public String getSid() {
        return this.sid;
    }

    public String getvCid() {
        return this.vCid;
    }

    public String getsKey() {
        return this.sKey;
    }

    public MeetingStatusItems[] getMbers() {
        return this.mbers;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8da92bcd1e2fb20ae19ee8f2688591f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8da92bcd1e2fb20ae19ee8f2688591f");
        }
        StringBuilder sb = new StringBuilder("sid ");
        sb.append(this.sid);
        sb.append(", vCid ");
        sb.append(this.vCid);
        sb.append(", sKey ");
        sb.append(this.sKey);
        sb.append(", members ");
        sb.append(this.mbers);
        return sb.toString() != null ? Arrays.toString(this.mbers) : "";
    }
}
