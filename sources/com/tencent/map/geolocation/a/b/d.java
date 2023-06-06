package com.tencent.map.geolocation.a.b;

import android.content.Context;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationManager;
import com.tencent.mapsdk.internal.ki;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d implements Thread.UncaughtExceptionHandler {
    public Thread.UncaughtExceptionHandler a;
    public volatile boolean c = false;
    private Context e;
    private CountDownLatch f;
    private static final String d = TencentLocation.class.getPackage().getName();
    public static d b = null;

    private d(Context context) {
        this.e = context;
    }

    public static d a(Context context) {
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d(context);
                }
            }
        }
        return b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    final class a extends Thread {
        private String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            com.tencent.map.geolocation.a.a.e a = com.tencent.map.geolocation.a.a.e.a(d.this.e);
            String str = this.b;
            if (a.d != null && a.b != null && str != null && str.length() != 0) {
                f.a = 3000;
                a.a((str + a.c()).getBytes());
            }
            d.this.f.countDown();
        }
    }

    private static String a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        boolean z = false;
        if (th != null) {
            loop0: for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if ("TL".equals(stackTraceElement.getFileName()) || ki.a.equals(stackTraceElement.getFileName())) {
                        z = true;
                        break loop0;
                    }
                }
            }
        }
        if (z && this.e != null) {
            String a2 = a(th);
            if (!a2.contains("onLocationChanged") && !a2.contains("onStatusUpdate")) {
                h.a(this.e, "__bad_dex_info__", h.b);
                h.a(this.e, "__loc_sdk_run_duration__", Long.valueOf(System.currentTimeMillis() - h.c));
                String str = "EXP:" + h.b + CommonConstant.Symbol.COMMA + a2;
                if (str.contains("\n")) {
                    str = str.replaceAll("\n", CommonConstant.Symbol.DOLLAR);
                }
                this.f = new CountDownLatch(1);
                new a(str).start();
                try {
                    this.f.await(PayTask.j, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                TencentLocationManager.getInstance(this.e).removeUpdates(null);
                return;
            }
        }
        if (this.a != null) {
            this.a.uncaughtException(thread, th);
        }
    }
}
