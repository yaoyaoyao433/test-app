package com.sankuai.waimai.foundation.core.init;

import android.app.Application;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbsInit implements a {
    public static boolean ENABLE_LOG = false;
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mAsyncInitTime;
    private boolean mHasAsyncInit;
    private boolean mHasIdleAsyncInit;
    private boolean mHasIdleInit;
    private boolean mHasInit;
    private long mIdleAsyncInitTime;
    private long mIdleInitTime;
    private long mInitTime;
    private long mThreadAsyncInitTime;
    private long mThreadIdleAsyncInitTime;
    private long mThreadIdleInitTime;
    private long mThreadInitTime;

    public void asyncInit(Application application) {
    }

    public void idleAsyncInit(Application application) {
    }

    public void idleInit(Application application) {
    }

    public void init(Application application) {
    }

    public boolean needPermission() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public int process() {
        return 1;
    }

    public AbsInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5c2700b3088012b904141b835178251", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5c2700b3088012b904141b835178251");
            return;
        }
        this.mHasInit = false;
        this.mHasAsyncInit = false;
        this.mHasIdleInit = false;
        this.mHasIdleAsyncInit = false;
        this.mInitTime = -1L;
        this.mAsyncInitTime = -1L;
        this.mIdleInitTime = -1L;
        this.mIdleAsyncInitTime = -1L;
        this.mThreadInitTime = -1L;
        this.mThreadAsyncInitTime = -1L;
        this.mThreadIdleInitTime = -1L;
        this.mThreadIdleAsyncInitTime = -1L;
    }

    public static void setEnableLog(boolean z) {
        ENABLE_LOG = z;
    }

    public final long getInitTime() {
        return this.mInitTime;
    }

    public final long getAsyncInitTime() {
        return this.mAsyncInitTime;
    }

    public final long getIdleInitTime() {
        return this.mIdleInitTime;
    }

    public final long getIdleAsyncInitTime() {
        return this.mIdleAsyncInitTime;
    }

    public final long getThreadInitTime() {
        return this.mThreadInitTime;
    }

    public final long getThreadAsyncInitTime() {
        return this.mThreadAsyncInitTime;
    }

    public final long getThreadIdleInitTime() {
        return this.mThreadIdleInitTime;
    }

    public final long getThreadAsyncIdleInitTime() {
        return this.mThreadIdleAsyncInitTime;
    }

    @MainThread
    public final void performInit(Application application) {
        long j;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff41bc4ed66bc3dd68d8528b4a5d3860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff41bc4ed66bc3dd68d8528b4a5d3860");
        } else if (this.mHasInit) {
        } else {
            this.mHasInit = true;
            long j2 = 0;
            if (ENABLE_LOG) {
                long threadTimestamp = threadTimestamp();
                j2 = timestamp();
                j = threadTimestamp;
            } else {
                j = 0;
            }
            try {
                init(application);
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.core.exception.a.a(th);
            }
            if (ENABLE_LOG) {
                this.mInitTime = timestamp() - j2;
                this.mThreadInitTime = threadTimestamp() - j;
            }
        }
    }

    @WorkerThread
    public final synchronized void performAsyncInit(Application application) {
        long j;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78f99264f8727f8b7ae1078186a5b622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78f99264f8727f8b7ae1078186a5b622");
            return;
        }
        if (!this.mHasAsyncInit) {
            this.mHasAsyncInit = true;
            long j2 = 0;
            if (ENABLE_LOG) {
                long threadTimestamp = threadTimestamp();
                j2 = timestamp();
                j = threadTimestamp;
            } else {
                j = 0;
            }
            asyncInit(application);
            if (ENABLE_LOG) {
                this.mAsyncInitTime = timestamp() - j2;
                this.mThreadAsyncInitTime = threadTimestamp() - j;
            }
        }
    }

    @MainThread
    public final synchronized void performIdleInit(Application application) {
        long j;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71c57194f0ecf48d0aa9a78c4a935a62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71c57194f0ecf48d0aa9a78c4a935a62");
            return;
        }
        if (!this.mHasIdleInit) {
            this.mHasIdleInit = true;
            long j2 = 0;
            if (ENABLE_LOG) {
                long threadTimestamp = threadTimestamp();
                j2 = timestamp();
                j = threadTimestamp;
            } else {
                j = 0;
            }
            idleInit(application);
            if (ENABLE_LOG) {
                this.mIdleInitTime = timestamp() - j2;
                this.mThreadIdleInitTime = threadTimestamp() - j;
            }
        }
    }

    @WorkerThread
    public final synchronized void performAsyncIdleInit(Application application) {
        long j;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f170deb1440704a63d6e07ef010734a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f170deb1440704a63d6e07ef010734a4");
            return;
        }
        if (!this.mHasIdleAsyncInit) {
            this.mHasIdleAsyncInit = true;
            long j2 = 0;
            if (ENABLE_LOG) {
                long threadTimestamp = threadTimestamp();
                j2 = timestamp();
                j = threadTimestamp;
            } else {
                j = 0;
            }
            idleAsyncInit(application);
            if (ENABLE_LOG) {
                this.mIdleAsyncInitTime = timestamp() - j2;
                this.mThreadIdleAsyncInitTime = threadTimestamp() - j;
            }
        }
    }

    @NonNull
    private String asyncTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a300acf4d411e4cceed4d3508a286c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a300acf4d411e4cceed4d3508a286c");
        }
        return tag() + "-Async";
    }

    private static long timestamp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dcca899cbd648db578bb6fce0c98a31d", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dcca899cbd648db578bb6fce0c98a31d")).longValue() : SystemClock.elapsedRealtime();
    }

    private static long threadTimestamp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02b15199f63a7d71fbea17902c4de5ec", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02b15199f63a7d71fbea17902c4de5ec")).longValue() : SystemClock.currentThreadTimeMillis();
    }
}
