package com.meituan.android.common.statistics.ipc;

import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RemoteProxyThread {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void submitOnThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93eb9677371fa646bfbbc41aa80b0e94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93eb9677371fa646bfbbc41aa80b0e94");
        } else {
            StatisticsHandler.getInstance().commit(runnable);
        }
    }

    public static <T> Future<T> submitOnThread(Callable<T> callable) {
        Object[] objArr = {callable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47dd4f6927d834aea4212d868db0f2b0", 6917529027641081856L) ? (Future) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47dd4f6927d834aea4212d868db0f2b0") : StatisticsHandler.getInstance().syncCommit(callable);
    }
}
