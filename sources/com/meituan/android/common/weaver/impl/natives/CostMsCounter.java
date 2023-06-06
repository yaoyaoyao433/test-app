package com.meituan.android.common.weaver.impl.natives;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.android.common.weaver.impl.ErrorReporter;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CostMsCounter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean end;
    private long mDurationMs;
    private ErrorReporter mErrorReporter;
    private long start;

    public CostMsCounter(@NonNull ErrorReporter errorReporter) {
        Object[] objArr = {errorReporter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a531dc5c1476f4bbae419ace6e90053d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a531dc5c1476f4bbae419ace6e90053d");
            return;
        }
        this.end = false;
        this.mErrorReporter = errorReporter;
    }

    public void runSafeSync(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cb9b811d1c3036d5718fc97726b563b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cb9b811d1c3036d5718fc97726b563b");
            return;
        }
        this.start = SystemClock.elapsedRealtime();
        this.end = false;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                this.mErrorReporter.report(th);
                if (this.end) {
                }
            } finally {
                if (!this.end) {
                    this.mDurationMs += SystemClock.elapsedRealtime() - this.start;
                    this.end = true;
                }
            }
        }
    }

    public void runSafeAsync(View view, @NonNull WrapperRunnable wrapperRunnable, long j) {
        Object[] objArr = {view, wrapperRunnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "543ab2e8d7d0339d7d491766a973f1f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "543ab2e8d7d0339d7d491766a973f1f3");
            return;
        }
        wrapperRunnable.setCostCounter(this);
        view.postDelayed(wrapperRunnable, j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class WrapperRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private CostMsCounter costMsCounter;
        private Runnable innerRunnable;

        public WrapperRunnable(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed8b5b164b57ca3f32bae33ef864ca9a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed8b5b164b57ca3f32bae33ef864ca9a");
            } else {
                this.innerRunnable = runnable;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9058d85ebf8c6bd539ee3acb781d584", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9058d85ebf8c6bd539ee3acb781d584");
            } else {
                this.costMsCounter.runSafeSync(this.innerRunnable);
            }
        }

        public void setCostCounter(CostMsCounter costMsCounter) {
            this.costMsCounter = costMsCounter;
        }
    }

    public long getCostMs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef72655bfac39648fdf7c9cc8a636e88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef72655bfac39648fdf7c9cc8a636e88")).longValue();
        }
        if (!this.end) {
            this.mDurationMs += SystemClock.elapsedRealtime() - this.start;
            Logger.getLogger().d("endCost ", Long.valueOf(this.mDurationMs));
            this.end = true;
        }
        return this.mDurationMs;
    }
}
