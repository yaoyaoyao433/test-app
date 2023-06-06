package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class AppMonitorConfigs implements Serializable {
    public static final int CLOSE = 2;
    public static final int FLAG_APP_ERROR = 128;
    public static final int OPEN = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int autoReport;
    public int isOpenMonitor;
    public int monitorFlags;
    public int reportInterval;
    public int unifyReportTime;

    public AppMonitorConfigs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f2d87d68ead094b0cd05027c9e4e50e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f2d87d68ead094b0cd05027c9e4e50e");
        } else {
            this.unifyReportTime = 1;
        }
    }

    public boolean isOpenMonitor() {
        return this.isOpenMonitor == 1;
    }

    public boolean isFlagEnable(int i) {
        return (i & this.monitorFlags) > 0;
    }

    public boolean isAutoReport() {
        return this.autoReport == 1;
    }
}
