package com.meituan.android.customerservice.callbase.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallHandleWorker {
    private static final String TAG = "CallHandleWorker";
    public static ChangeQuickRedirect changeQuickRedirect;
    private TaskCounter mCounter;
    private Handler mHandler;
    private Looper mLooper;
    private HandlerThread mThread;

    public CallHandleWorker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dfb26eff45c4a059bafde721b18fe99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dfb26eff45c4a059bafde721b18fe99");
            return;
        }
        this.mThread = null;
        this.mLooper = null;
        this.mHandler = null;
        this.mCounter = new TaskCounter(TAG);
        init();
    }

    public static CallHandleWorker getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "824b1c63323172f6479d500d81e46267", RobustBitConfig.DEFAULT_VALUE) ? (CallHandleWorker) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "824b1c63323172f6479d500d81e46267") : CallHandleWorkerHolder.sInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CallHandleWorkerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final CallHandleWorker sInstance = new CallHandleWorker();
    }

    public synchronized void post(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b466c2e2326c0d5712c6441e971b035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b466c2e2326c0d5712c6441e971b035");
            return;
        }
        if (this.mThread == null || this.mHandler == null || this.mLooper == null) {
            init();
        }
        this.mCounter.add();
        if (this.mHandler != null && !this.mHandler.post(runnable)) {
            CallLog.error(TAG, "CallHandleWorker.post, failed!!!.");
            release();
        }
    }

    public synchronized void post(Runnable runnable, int i) {
        Object[] objArr = {runnable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c235aaecb876ebc0c316f149f956e0b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c235aaecb876ebc0c316f149f956e0b1");
            return;
        }
        if (this.mThread == null || this.mHandler == null || this.mLooper == null) {
            init();
        }
        this.mCounter.add();
        if (this.mHandler != null && !this.mHandler.postDelayed(runnable, i)) {
            CallLog.error(TAG, "CallHandleWorker.post, failed!!!, delay=" + i);
            release();
        }
    }

    public synchronized void cannel(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7d87054e83f8b1be8babf14eef2b0fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7d87054e83f8b1be8babf14eef2b0fa");
            return;
        }
        this.mHandler.removeCallbacks(runnable);
        this.mCounter.sub();
    }

    public synchronized void release() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baa988c445c9f647c06bee1fc01baf4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baa988c445c9f647c06bee1fc01baf4a");
            return;
        }
        CallLog.log(TAG, "CallHandleWorker.release.");
        this.mCounter.reset();
        if (this.mLooper != null && this.mThread != null && this.mHandler != null) {
            this.mLooper.quit();
            while (true) {
                if (i >= 100) {
                    break;
                } else if (!this.mThread.isAlive()) {
                    CallLog.log(TAG, "CallHandleWorker.release, stopped at i=" + i);
                    break;
                } else {
                    sleep(20);
                    i++;
                }
            }
            this.mThread = null;
            this.mLooper = null;
            this.mHandler = null;
            CallLog.log(TAG, "CallHandleWorker.release, done.");
        }
    }

    public Looper getLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94e9723a249b6df0125c660bbbf9ebf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94e9723a249b6df0125c660bbbf9ebf2");
        }
        if (this.mHandler != null) {
            return this.mHandler.getLooper();
        }
        return null;
    }

    public void runOnWorkerThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2ae58f659d9e91524d62ccd24830735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2ae58f659d9e91524d62ccd24830735");
        } else if (Looper.myLooper() == getLooper()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private synchronized void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16de0a41a58cb0b48467d306edb5fbc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16de0a41a58cb0b48467d306edb5fbc6");
            return;
        }
        this.mCounter.reset();
        this.mThread = new HandlerThread(TAG);
        this.mThread.start();
        this.mLooper = this.mThread.getLooper();
        this.mHandler = new BaseHandler(this.mCounter, this.mLooper);
    }

    private void sleep(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e803a285153a1410e00ebf0867b23e2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e803a285153a1410e00ebf0867b23e2b");
            return;
        }
        try {
            Thread.sleep(i);
        } catch (Exception unused) {
        }
    }
}
