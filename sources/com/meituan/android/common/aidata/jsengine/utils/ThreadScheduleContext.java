package com.meituan.android.common.aidata.jsengine.utils;

import android.text.TextUtils;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.jsexecutor.JSTaskQueue;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ThreadScheduleContext {
    private static int ThreadSeq;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile ExecutorService mCallbackThread;
    private volatile ExecutorService mJSThread;

    public ThreadScheduleContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c72cf0bbcc2834856823821a032d2141", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c72cf0bbcc2834856823821a032d2141");
            return;
        }
        this.mJSThread = Executors.newSingleThreadExecutor();
        mCallbackThread = Executors.newSingleThreadExecutor();
    }

    public synchronized void submitOnJSThread(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d68fffbce9b1ff057bde043f0b55bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d68fffbce9b1ff057bde043f0b55bdb");
        } else {
            runOnJSThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.utils.ThreadScheduleContext.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5df14bcfa1ae655ca7f4b1d14a8c88ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5df14bcfa1ae655ca7f4b1d14a8c88ab");
                        return;
                    }
                    try {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        new StringBuilder("onUncaughtThrowable erro: ").append(th.getMessage());
                    }
                }
            });
        }
    }

    public void runOnJSThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f911934f2126aa5bf55d7ecb33055530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f911934f2126aa5bf55d7ecb33055530");
        } else if (this.mJSThread == null || runnable == null) {
        } else {
            this.mJSThread.submit(runnable);
        }
    }

    public void runOnJSCallbackThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "772027370911d16dfd8b08159376240a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "772027370911d16dfd8b08159376240a");
        } else if (mCallbackThread == null || runnable == null) {
        } else {
            mCallbackThread.submit(runnable);
        }
    }

    public void callbackSucceed(final IJSCallback iJSCallback, final String str, final String str2, final byte[] bArr) {
        Object[] objArr = {iJSCallback, str, str2, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59de8b4a48a06c7bcca4fa1723dc07ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59de8b4a48a06c7bcca4fa1723dc07ac");
        } else {
            runOnJSCallbackThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.utils.ThreadScheduleContext.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d0a89709baf1c1e1a4d1b1fb89d4cd1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d0a89709baf1c1e1a4d1b1fb89d4cd1");
                    } else if (iJSCallback != null) {
                        iJSCallback.onSuccess(str, str2, new JSValueWrapper(bArr != null ? new String(bArr) : ""));
                    }
                }
            });
        }
    }

    public void callbackSucceed(String str, String str2, IJSCallback iJSCallback, String str3, byte[] bArr) {
        Object[] objArr = {str, str2, iJSCallback, str3, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac05260c037a50e2c7cb6920890e9776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac05260c037a50e2c7cb6920890e9776");
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            JSTaskQueue.getInstance().dequeueTask(str2);
        }
        callbackSucceed(iJSCallback, str, str3, bArr);
    }

    public void callbackFail(final String str, final IJSCallback iJSCallback, final BlueException blueException) {
        Object[] objArr = {str, iJSCallback, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bdbc5f15d29f122a5bcd73603f5797a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bdbc5f15d29f122a5bcd73603f5797a");
        } else {
            runOnJSCallbackThread(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.utils.ThreadScheduleContext.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2b96d5a2582f67d2c7a33e1e3b88e3c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2b96d5a2582f67d2c7a33e1e3b88e3c9");
                    } else if (iJSCallback != null) {
                        iJSCallback.onFailed(str, blueException);
                    }
                }
            });
        }
    }

    public void callbackFail(String str, String str2, IJSCallback iJSCallback, BlueException blueException) {
        Object[] objArr = {str, str2, iJSCallback, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f2bee2647e74bd292284e5b4b508f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f2bee2647e74bd292284e5b4b508f72");
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            JSTaskQueue.getInstance().dequeueTask(str2);
        }
        callbackFail(str, iJSCallback, blueException);
    }
}
