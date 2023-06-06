package com.meituan.android.common.sniffer.handler;

import android.os.Handler;
import android.os.Looper;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class MainHandler {
    private Handler mainHandler;

    private MainHandler() {
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Sub {
        public static MainHandler handler = new MainHandler();

        private Sub() {
        }
    }

    public static MainHandler instance() {
        return Sub.handler;
    }

    public void post(Runnable runnable, long j) {
        this.mainHandler.postDelayed(runnable, j);
    }

    public void post(Runnable runnable) {
        this.mainHandler.post(runnable);
    }

    public void remove(Runnable runnable) {
        this.mainHandler.removeCallbacks(runnable);
    }
}
