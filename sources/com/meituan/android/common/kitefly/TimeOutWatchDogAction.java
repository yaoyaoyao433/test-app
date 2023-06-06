package com.meituan.android.common.kitefly;

import android.os.Debug;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TimeOutWatchDogAction implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Runnable mAction;
    private final ScheduledFuture<?> mFuture;

    public TimeOutWatchDogAction(@NonNull Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "241ef16de10daf1c6ac8011c4d7cb35d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "241ef16de10daf1c6ac8011c4d7cb35d");
            return;
        }
        this.mAction = runnable;
        this.mFuture = TimeOutWatchDogException.sScheduledThreadPool.schedule(this, j, TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38c43b078ebad246e79173ae6e079a33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38c43b078ebad246e79173ae6e079a33");
        } else if (Debug.isDebuggerConnected()) {
        } else {
            this.mAction.run();
        }
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d24d8c3ada98c3d22f6b12db840866fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d24d8c3ada98c3d22f6b12db840866fe");
        } else {
            this.mFuture.cancel(false);
        }
    }
}
