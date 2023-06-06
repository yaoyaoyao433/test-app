package com.meituan.android.common.statistics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatisticsHandler {
    private static final StatisticsHandler INSTANCE = new StatisticsHandler();
    public static final String THREAD_TAG = "Statistics-";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ExecutorService configThread;
    private final ExecutorService mGestureThread;
    private final ExecutorService mInnerStatisticThread;
    private final ExecutorService mReportThreadExecutor;
    private final ExecutorService mWriteThreadExecutor;

    public static StatisticsHandler getInstance() {
        return INSTANCE;
    }

    public StatisticsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58cd9b5df94ddc27cb909111aa169d2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58cd9b5df94ddc27cb909111aa169d2a");
            return;
        }
        this.mWriteThreadExecutor = c.a("Statistics-WriteData");
        this.mReportThreadExecutor = c.a("Statistics-ReportData");
        this.configThread = c.a("Statistics-GetConfig");
        this.mInnerStatisticThread = c.a("Statistics-InnerDataBuild");
        this.mGestureThread = c.a("Statistics-Gesture");
    }

    public void commit(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f5d964044a8348fac20b12353cfd756", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f5d964044a8348fac20b12353cfd756");
            return;
        }
        try {
            if (this.mWriteThreadExecutor != null) {
                this.mWriteThreadExecutor.execute(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void commitReport(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b49218edf4c2278c3ecb5892c7c0937", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b49218edf4c2278c3ecb5892c7c0937");
            return;
        }
        try {
            if (this.mReportThreadExecutor != null) {
                this.mReportThreadExecutor.execute(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getConfig(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeab9dff7f9f51bc609f8f8f16410fa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeab9dff7f9f51bc609f8f8f16410fa0");
            return;
        }
        try {
            if (this.configThread != null) {
                this.configThread.execute(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void innerStatistic(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "400cb5e758c9189b23222ff97850a720", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "400cb5e758c9189b23222ff97850a720");
            return;
        }
        try {
            if (this.mInnerStatisticThread != null) {
                this.mInnerStatisticThread.execute(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gestureStatistic(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13eec6107a76a76b57bdd515bf86b499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13eec6107a76a76b57bdd515bf86b499");
            return;
        }
        try {
            if (this.mGestureThread != null) {
                this.mGestureThread.execute(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Future syncCommit(Callable callable) {
        Object[] objArr = {callable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d5fab8a98c727d7a9a83b3daa7e00d8", 6917529027641081856L)) {
            return (Future) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d5fab8a98c727d7a9a83b3daa7e00d8");
        }
        try {
            if (this.mWriteThreadExecutor != null) {
                return this.mWriteThreadExecutor.submit(callable);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
