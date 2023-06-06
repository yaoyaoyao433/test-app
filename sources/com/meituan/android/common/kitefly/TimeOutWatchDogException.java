package com.meituan.android.common.kitefly;

import android.os.Debug;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TimeOutWatchDogException implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final ScheduledExecutorService sScheduledThreadPool = c.b("babel-timeout", 5);
    private final String TAG;
    private volatile boolean mCanceled;
    private final CatchException mCatchException;
    private final ScheduledFuture<?> mFuture;
    private final Throwable mThrowable;

    public TimeOutWatchDogException(@NonNull String str, long j, @NonNull CatchException catchException) {
        Object[] objArr = {str, new Long(j), catchException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4de4b3be8102dc7eabf62409567b793a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4de4b3be8102dc7eabf62409567b793a");
            return;
        }
        this.TAG = "TimeOutWatchDog";
        this.mCanceled = false;
        this.mThrowable = new Throwable("timeout(" + str + "): " + catchException.toString());
        this.mFuture = sScheduledThreadPool.schedule(this, j, TimeUnit.MILLISECONDS);
        this.mCatchException = catchException;
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2eb6bc7c320d585e88d33320ffeeb5f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2eb6bc7c320d585e88d33320ffeeb5f8");
            return;
        }
        this.mCanceled = true;
        this.mFuture.cancel(false);
    }

    @Override // java.lang.Runnable
    @CallSuper
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eab94d64a04513bb357efca25ac406a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eab94d64a04513bb357efca25ac406a");
        } else if (this.mCanceled || Debug.isDebuggerConnected()) {
        } else {
            this.mCatchException.reportException(this.mThrowable);
        }
    }
}
