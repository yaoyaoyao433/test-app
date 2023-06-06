package com.meizu.cloud.pushsdk.b;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes3.dex */
public final class b implements f {
    private ThreadPoolExecutor j;
    private long g = 60;
    private int h = 10;
    private boolean i = false;
    final SimpleDateFormat a = new SimpleDateFormat("MM-dd HH:mm:ss");
    final List<a> b = Collections.synchronizedList(new ArrayList());
    final Handler c = new Handler(Looper.getMainLooper());
    String e = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/pushSdk/defaultLog";
    final e d = new e();
    final String f = String.valueOf(Process.myPid());

    private void a(a aVar) {
        try {
            this.b.add(aVar);
        } catch (Exception e) {
            Log.e("Logger", "add logInfo error " + e.getMessage());
        }
    }

    private void b() {
        if (this.b.size() == 0) {
            this.c.postDelayed(new Runnable() { // from class: com.meizu.cloud.pushsdk.b.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(true);
                }
            }, this.g * 1000);
        }
    }

    private void c() {
        if (this.b.size() == this.h) {
            a(true);
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final void a(String str) {
        this.e = str;
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final void a(String str, String str2) {
        synchronized (this.b) {
            b();
            a(new a("D", str, str2));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final void a(String str, String str2, Throwable th) {
        if (this.i) {
            Log.e(str, str2, th);
        }
        synchronized (this.b) {
            b();
            a(new a("E", str, str2 + "\n" + Log.getStackTraceString(th)));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final void a(boolean z) {
        Runnable runnable = new Runnable() { // from class: com.meizu.cloud.pushsdk.b.b.2
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList<a> arrayList;
                synchronized (b.this.b) {
                    b.this.c.removeCallbacksAndMessages(null);
                    arrayList = new ArrayList(b.this.b);
                    b.this.b.clear();
                }
                try {
                    try {
                        e eVar = b.this.d;
                        String str = b.this.e;
                        File file = new File(str);
                        if (!file.exists() && !file.mkdirs()) {
                            throw new IOException("create " + str + " dir failed!!!");
                        }
                        String format = eVar.a.format(new Date());
                        File file2 = new File(str, format + ".log.txt");
                        if (!file2.exists()) {
                            if (file2.createNewFile()) {
                                eVar.a(file);
                            } else {
                                Log.e("EncryptionWriter", "create new file " + format + " failed !!!");
                            }
                        }
                        eVar.c = new BufferedWriter(new FileWriter(file2, true));
                        for (a aVar : arrayList) {
                            e eVar2 = b.this.d;
                            String str2 = aVar.a;
                            String str3 = aVar.b;
                            String str4 = aVar.c;
                            if (eVar2.c != null) {
                                eVar2.c.write(eVar2.b.a((str2 + str3 + StringUtil.SPACE + str4).getBytes()));
                                eVar2.c.write(StringUtil.CRLF_STRING);
                            }
                        }
                        try {
                            b.this.d.a();
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    b.this.d.a();
                } catch (Throwable th) {
                    try {
                        b.this.d.a();
                    } catch (Exception unused4) {
                    }
                    throw th;
                }
            }
        };
        if (!z || this.j == null) {
            runnable.run();
        } else {
            this.j.execute(runnable);
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final boolean a() {
        return this.i;
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final void b(String str, String str2) {
        synchronized (this.b) {
            b();
            a(new a("I", str, str2));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final void b(boolean z) {
        this.i = z;
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final void c(String str, String str2) {
        synchronized (this.b) {
            b();
            a(new a("W", str, str2));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public final void d(String str, String str2) {
        if (this.i) {
            Log.e(str, str2);
        }
        synchronized (this.b) {
            b();
            a(new a("E", str, str2));
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a {
        final String a;
        final String b;
        final String c;

        public a(String str, String str2, String str3) {
            this.a = b.this.a.format(new Date()) + StringUtil.SPACE + b.this.f + CommonConstant.Symbol.MINUS + Thread.currentThread().getId() + StringUtil.SPACE + str + "/";
            this.b = str2;
            this.c = str3;
        }
    }

    public b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        j jVar = new j();
        String.format("log-pool-%d", 0);
        jVar.a = "log-pool-%d";
        final String str = jVar.a;
        final Boolean bool = jVar.b;
        final Integer num = jVar.c;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = jVar.d;
        final ThreadFactory defaultThreadFactory = jVar.e != null ? jVar.e : Executors.defaultThreadFactory();
        final AtomicLong atomicLong = str != null ? new AtomicLong(0L) : null;
        this.j = new ThreadPoolExecutor(1, 1, 30L, timeUnit, linkedBlockingQueue, new ThreadFactory() { // from class: com.meizu.cloud.pushsdk.b.j.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread = defaultThreadFactory.newThread(runnable);
                if (str != null) {
                    newThread.setName(String.format(str, Long.valueOf(atomicLong.getAndIncrement())));
                }
                if (bool != null) {
                    newThread.setDaemon(bool.booleanValue());
                }
                if (num != null) {
                    newThread.setPriority(num.intValue());
                }
                if (uncaughtExceptionHandler != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return newThread;
            }
        });
        this.j.allowCoreThreadTimeOut(true);
    }
}
