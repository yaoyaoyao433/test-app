package com.meituan.android.legwork.monitor;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.legwork.bean.monitor.AppMonitorConfigs;
import com.meituan.android.legwork.monitor.report.ReportService;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class BaseMonitorManager {
    private static volatile BaseMonitorManager INSTANCE = null;
    private static final String TAG = "BaseMonitorManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static Context sApplication;
    private String reportProcessName;

    public static BaseMonitorManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f93bd368b519b9703e8bf8cf85bc82d", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseMonitorManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f93bd368b519b9703e8bf8cf85bc82d");
        }
        if (INSTANCE == null) {
            synchronized (BaseMonitorManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new BaseMonitorManager();
                }
            }
        }
        return INSTANCE;
    }

    public void init(Context context) {
        sApplication = context;
    }

    public void setReportProcess(String str) {
        this.reportProcessName = str;
    }

    public void start(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d9a5a238c4baf684a5a7f93aa8e1edb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d9a5a238c4baf684a5a7f93aa8e1edb");
            return;
        }
        sApplication = context;
        if (d.a()) {
            if (TextUtils.isEmpty(this.reportProcessName)) {
                this.reportProcessName = context.getPackageName();
            }
            if (com.meituan.android.legwork.monitor.utils.c.a().equals(this.reportProcessName)) {
                ReportService.startReport();
            }
        }
    }

    public void stop(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5840b97807beb7666885e45fd29e3eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5840b97807beb7666885e45fd29e3eb");
        } else if (d.a()) {
            if (TextUtils.isEmpty(this.reportProcessName)) {
                this.reportProcessName = context.getPackageName();
            }
            if (com.meituan.android.legwork.monitor.utils.c.a().equals(this.reportProcessName)) {
                ReportService.stopReport();
            }
        }
    }

    public static Context getApplication() {
        return sApplication;
    }

    public void setCallback(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "926c12069758808ca5f0bd23a569bac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "926c12069758808ca5f0bd23a569bac8");
        } else {
            MonitorCallbackManager.getInstance().setCallback(cVar);
        }
    }

    public void updateMonitorConfig(AppMonitorConfigs appMonitorConfigs) {
        Object[] objArr = {appMonitorConfigs};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7f149f4e954df3e700055860d4c4d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7f149f4e954df3e700055860d4c4d13");
        } else if (appMonitorConfigs != null) {
            boolean isOpenMonitor = appMonitorConfigs.isOpenMonitor();
            Object[] objArr2 = {Byte.valueOf(isOpenMonitor ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "fa162a1a692d45381df05ed308d4a60b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "fa162a1a692d45381df05ed308d4a60b");
            } else {
                z.a(com.meituan.android.legwork.a.a(), "is_open_monitor", isOpenMonitor);
            }
            d.a(appMonitorConfigs.isAutoReport());
            if (appMonitorConfigs.reportInterval < 30000) {
                appMonitorConfigs.reportInterval = 30000;
            }
            int i = appMonitorConfigs.reportInterval;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "6bc74330732584c9dbfe17fbac80a621", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "6bc74330732584c9dbfe17fbac80a621");
            } else {
                z.a(com.meituan.android.legwork.a.a(), "monitor_report_interval", i);
            }
            int i2 = appMonitorConfigs.monitorFlags;
            Object[] objArr4 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect5 = d.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "d7ffe3f66a564c68ff1289018f0866f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "d7ffe3f66a564c68ff1289018f0866f8");
            } else {
                z.a(com.meituan.android.legwork.a.a(), "monitor_flags", i2);
            }
            int i3 = appMonitorConfigs.unifyReportTime;
            Object[] objArr5 = {Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect6 = d.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect6, true, "3e9853a090c474b946318dc20deae266", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect6, true, "3e9853a090c474b946318dc20deae266");
            } else {
                z.a(com.meituan.android.legwork.a.a(), "use_monitor_time", i3);
            }
        }
    }

    public void setAutoReport(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b09e85d8b46e23520e9b51a187746dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b09e85d8b46e23520e9b51a187746dfc");
        } else {
            d.a(z);
        }
    }
}
