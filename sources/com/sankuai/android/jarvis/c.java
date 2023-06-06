package com.sankuai.android.jarvis;

import android.os.AsyncTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static Executor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe273cd00cd1d9e8ccaa347c65f2120b", RobustBitConfig.DEFAULT_VALUE) ? (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe273cd00cd1d9e8ccaa347c65f2120b") : f.a().g();
    }

    public static Executor b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ad1555ac70d3ebab3b3ff2bb527e6e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ad1555ac70d3ebab3b3ff2bb527e6e3");
        }
        f a2 = f.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2320241be67bd55173754e18e8014555", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2320241be67bd55173754e18e8014555");
        }
        if (a2.f()) {
            return a2.e;
        }
        return AsyncTask.SERIAL_EXECUTOR;
    }

    public static Thread a(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d13647e3ced9fa91825def3b238ff1d8", RobustBitConfig.DEFAULT_VALUE) ? (Thread) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d13647e3ced9fa91825def3b238ff1d8") : f.a().a(str, runnable);
    }

    public static ExecutorService a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "439873b0cf295c959bfb071c4ce63103", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "439873b0cf295c959bfb071c4ce63103") : f.a().a(str);
    }

    public static ExecutorService a(String str, n nVar) {
        Object[] objArr = {str, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a396095b3358e994caf64e79c6e7ce6", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a396095b3358e994caf64e79c6e7ce6") : f.a().a(str, nVar);
    }

    public static ExecutorService a(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50c103b1539878f56bd3073e1ce69e31", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50c103b1539878f56bd3073e1ce69e31") : f.a().a(str, str2, j);
    }

    public static ExecutorService a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4afedd46d1f7af87db27d3f4acf1cb8", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4afedd46d1f7af87db27d3f4acf1cb8") : f.a().a(str, i);
    }

    public static ExecutorService a(String str, int i, ThreadFactory threadFactory) {
        Object[] objArr = {str, Integer.valueOf(i), threadFactory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdc883d6aababc0866a23d92976f0445", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdc883d6aababc0866a23d92976f0445") : f.a().a(str, i, threadFactory, (n) null);
    }

    public static ExecutorService b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cf7082f91ab8e5b316a7ba105c64bc9", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cf7082f91ab8e5b316a7ba105c64bc9") : f.a().b(str);
    }

    public static ScheduledExecutorService c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "020db8252bf5346d14e107bdd6d4abbc", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "020db8252bf5346d14e107bdd6d4abbc") : f.a().c(str);
    }

    public static ScheduledExecutorService b(String str, n nVar) {
        Object[] objArr = {str, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47f295ef21aea3cf089577d1c8d38180", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47f295ef21aea3cf089577d1c8d38180") : f.a().b(str, nVar);
    }

    public static ScheduledExecutorService b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9e0c3a94f8232eeb2af1f07e6ee864b", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9e0c3a94f8232eeb2af1f07e6ee864b") : f.a().b(str, i);
    }

    public static ScheduledExecutorService b(String str, int i, ThreadFactory threadFactory) {
        Object[] objArr = {str, Integer.valueOf(i), threadFactory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "202fe984f789c06917366fbf25848037", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "202fe984f789c06917366fbf25848037") : f.a().b(str, i, threadFactory, null);
    }

    public static ThreadPoolExecutor a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "365cba9748cdd230f763f7161eccc00f", RobustBitConfig.DEFAULT_VALUE) ? (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "365cba9748cdd230f763f7161eccc00f") : f.a().a(str, i, i2, j, timeUnit, blockingQueue, null, null, null);
    }

    public static ThreadPoolExecutor a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, n nVar) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd00dbb5c8abcfc7466f72e0a6046077", RobustBitConfig.DEFAULT_VALUE) ? (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd00dbb5c8abcfc7466f72e0a6046077") : f.a().a(str, i, i2, j, timeUnit, blockingQueue, null, null, nVar);
    }

    public static ThreadPoolExecutor a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc9e5a2be3b4ad41415d0a50c10e2b68", RobustBitConfig.DEFAULT_VALUE) ? (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc9e5a2be3b4ad41415d0a50c10e2b68") : f.a().a(str, i, i2, j, timeUnit, blockingQueue, threadFactory, null, null);
    }

    public static ThreadPoolExecutor a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5277f5105a94ca4803331303116b25b3", RobustBitConfig.DEFAULT_VALUE) ? (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5277f5105a94ca4803331303116b25b3") : f.a().a(str, i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, null);
    }

    public static ThreadPoolExecutor a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, n nVar) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b193098efd971ce7439c012cfece7079", RobustBitConfig.DEFAULT_VALUE) ? (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b193098efd971ce7439c012cfece7079") : f.a().a(str, i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, nVar);
    }
}
