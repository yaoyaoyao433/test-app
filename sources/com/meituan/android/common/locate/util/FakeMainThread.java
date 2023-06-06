package com.meituan.android.common.locate.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.LogPrinter;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class FakeMainThread {
    private static final String NAME = "fakeMainThread";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile FakeMainThread instance;
    private HandlerThread fakeMainThread;
    private Handler logHandler;
    private Handler mHandler;

    /* loaded from: classes2.dex */
    public static class a extends HandlerThread {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(String str, int i) {
            super(str, i);
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ca4d4a8e40d0308a23722c6953e4ae0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ca4d4a8e40d0308a23722c6953e4ae0");
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6735286e10387669b766d88ccd25fdf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6735286e10387669b766d88ccd25fdf");
            } else {
                while (true) {
                    try {
                        Looper.loop();
                    } catch (Throwable unused) {
                        com.meituan.android.common.locate.platform.logs.c.a("fakemainthread-throwable", 3);
                    }
                }
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c7362e59a247178c04bcad880ef87ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c7362e59a247178c04bcad880ef87ad");
                return;
            }
            try {
                super.run();
            } catch (Throwable th) {
                LogUtils.a(getClass(), th);
                a();
            }
        }
    }

    public FakeMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "969d51aa89a1bbf29518eba50176b6f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "969d51aa89a1bbf29518eba50176b6f6");
            return;
        }
        this.fakeMainThread = (LocationUtils.a < -19 || LocationUtils.a > 19) ? new a(NAME, -19) : new a(NAME, LocationUtils.a);
        this.fakeMainThread.start();
        this.mHandler = new Handler(this.fakeMainThread.getLooper());
        initLogHandler();
        this.fakeMainThread.getLooper().setMessageLogging(new LogPrinter(1, "locate_sdk") { // from class: com.meituan.android.common.locate.util.FakeMainThread.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.util.LogPrinter, android.util.Printer
            public void println(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "da82f94982ec7bba54f177cce0c4c2fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "da82f94982ec7bba54f177cce0c4c2fe");
                } else if (str == null || FakeMainThread.this.logHandler == null) {
                } else {
                    if (str.contains(">>>>> Dispatching to ")) {
                        FakeMainThread.this.logHandler.sendEmptyMessageDelayed(0, MetricsAnrManager.ANR_THRESHOLD);
                    } else if (str.contains("<<<<< Finished to ")) {
                        FakeMainThread.this.logHandler.removeMessages(0);
                    }
                }
            }
        });
    }

    public static void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29b6063738903b50871735330902ad23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29b6063738903b50871735330902ad23");
        } else if (instance == null || instance.fakeMainThread == null) {
        } else {
            instance.fakeMainThread.quit();
        }
    }

    public static FakeMainThread getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42a3aa7cdef0eb5c21fbadec4c8bee2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (FakeMainThread) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42a3aa7cdef0eb5c21fbadec4c8bee2a");
        }
        if (instance == null) {
            synchronized (FakeMainThread.class) {
                if (instance == null) {
                    instance = new FakeMainThread();
                }
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getStackTrace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11ed6d6e45e86ef86f0547541957f056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11ed6d6e45e86ef86f0547541957f056");
            return;
        }
        try {
            StackTraceElement[] stackTrace = this.fakeMainThread.getLooper().getThread().getStackTrace();
            com.meituan.android.common.locate.platform.logs.c.a("msg run timeout > 5s");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Math.min(20, stackTrace.length); i++) {
                sb.append(stackTrace[i].getClassName());
                sb.append(CommonConstant.Symbol.DOT);
                sb.append(stackTrace[i].getMethodName());
                sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                sb.append(stackTrace[i].getLineNumber());
                sb.append(")\n");
            }
            com.meituan.android.common.locate.platform.logs.c.a("fakeMainThread block log:\n" + sb.toString());
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("fakeMainThread " + e.getMessage(), 3);
        }
    }

    private void initLogHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14373e67a6c4d2b56285490bf17cdd64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14373e67a6c4d2b56285490bf17cdd64");
            return;
        }
        a aVar = new a("fakeMain_log", -19);
        aVar.start();
        this.logHandler = new Handler(aVar.getLooper()) { // from class: com.meituan.android.common.locate.util.FakeMainThread.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8bccb106a14c64e0cb79dd9b8ddedd31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8bccb106a14c64e0cb79dd9b8ddedd31");
                    return;
                }
                FakeMainThread.this.getStackTrace();
                FakeMainThread.this.logHandler.removeMessages(0);
            }
        };
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public Looper getLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de17caa7b28a3162eb83eba710349f48", RobustBitConfig.DEFAULT_VALUE) ? (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de17caa7b28a3162eb83eba710349f48") : this.mHandler.getLooper();
    }

    public void post(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e0664be3b61c2cd7d48f55b6e9c657b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e0664be3b61c2cd7d48f55b6e9c657b");
        } else {
            this.mHandler.post(runnable);
        }
    }

    public void postDelay(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c2156cb270e21fefd7eea91be3f9281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c2156cb270e21fefd7eea91be3f9281");
        } else {
            this.mHandler.postDelayed(runnable, j);
        }
    }
}
