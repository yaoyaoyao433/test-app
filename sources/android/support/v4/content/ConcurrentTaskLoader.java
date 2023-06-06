package android.support.v4.content;

import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ConcurrentTaskLoader<D> extends AsyncTaskLoader<D> {
    public static boolean DEBUG = false;
    static final String TAG = "ConcurrentTaskLoader";

    public ConcurrentTaskLoader(Context context) {
        super(context);
    }

    protected Executor dispatchExecutor() {
        return ModernAsyncTask.THREAD_POOL_EXECUTOR;
    }

    @Override // android.support.v4.content.AsyncTaskLoader
    void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.waiting) {
            this.mTask.waiting = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            if (DEBUG) {
                StringBuilder sb = new StringBuilder("Waiting until ");
                sb.append(this.mLastLoadCompleteTime + this.mUpdateThrottle);
                sb.append(" to execute: ");
                sb.append(this.mTask);
            }
            this.mTask.waiting = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        if (DEBUG) {
            new StringBuilder("Executing: ").append(this.mTask);
        }
        this.mTask.executeOnExecutor(dispatchExecutor(), null);
    }
}
