package com.meituan.android.customerservice.callbase.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Timer {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TimeoutCallback mCallback;
    private Handler mHandler;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface TimeoutCallback {
        void onTimeout(int i);
    }

    public Timer(TimeoutCallback timeoutCallback) {
        Object[] objArr = {timeoutCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6cde29832c1c4afe64f448625e3e2a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6cde29832c1c4afe64f448625e3e2a3");
            return;
        }
        this.mHandler = new Handler(Looper.getMainLooper()) { // from class: com.meituan.android.customerservice.callbase.utils.Timer.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7dc5122347a3d2e6df20d5556046a4a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7dc5122347a3d2e6df20d5556046a4a");
                } else {
                    Timer.this.mCallback.onTimeout(message.what);
                }
            }
        };
        this.mCallback = timeoutCallback;
    }

    public void schedule(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d16d6f85ebc7d1364a1c21fa743c862f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d16d6f85ebc7d1364a1c21fa743c862f");
        } else {
            this.mHandler.sendEmptyMessageDelayed(i, i2);
        }
    }

    public void cancel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7cf14fbb1f7db9c1c44137eed9ab665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7cf14fbb1f7db9c1c44137eed9ab665");
        } else {
            this.mHandler.removeMessages(i);
        }
    }

    public void cancelAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68cd52c6c764540b39ea6e764ef3a636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68cd52c6c764540b39ea6e764ef3a636");
        } else {
            this.mHandler.removeCallbacksAndMessages(null);
        }
    }
}
