package com.meituan.android.quickpass.qpdev.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OnlineLogConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isOnlineLogOn;
    private StringBuilder onlineLogBuilder;

    public OnlineLogConfig() {
    }

    public OnlineLogConfig(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae9eb269c61b2204750c115c2ba4a9ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae9eb269c61b2204750c115c2ba4a9ea");
        } else {
            this.isOnlineLogOn = z;
        }
    }

    public boolean isOnlineLogOn() {
        return this.isOnlineLogOn;
    }

    public void setOnlineLogOn(boolean z) {
        this.isOnlineLogOn = z;
    }

    public StringBuilder getOnlineLogBuilder() {
        return this.onlineLogBuilder;
    }

    public void setOnlineLogBuilder(StringBuilder sb) {
        this.onlineLogBuilder = sb;
    }

    public void addOnlineLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e02a370b7df2e9a38b7543cbb0aa1dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e02a370b7df2e9a38b7543cbb0aa1dd");
            return;
        }
        if (this.onlineLogBuilder == null) {
            this.onlineLogBuilder = new StringBuilder();
        }
        StringBuilder sb = this.onlineLogBuilder;
        sb.append(str + "\n");
    }
}
