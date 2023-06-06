package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.DownloadPriority;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lg {
    public ExecutorService b;
    ExecutorService c;
    private le e;
    public final Map<String, a> a = new Hashtable();
    final Set<lf> d = new CopyOnWriteArraySet();

    private void a(ExecutorService executorService) {
        this.b = executorService;
    }

    public final void a(lf lfVar) {
        if (lfVar != null) {
            this.d.remove(lfVar);
            this.d.add(lfVar);
        }
    }

    public final void b(lf lfVar) {
        this.d.remove(lfVar);
    }

    public final synchronized void a() {
        b();
    }

    private synchronized void b() {
        this.e = null;
        if (this.b != null) {
            this.b.shutdownNow();
            this.b = null;
        }
        if (this.c != null) {
            this.c.shutdownNow();
            this.c = null;
        }
        this.d.clear();
    }

    public final synchronized void a(String str, le leVar) {
        a(str, leVar, DownloadPriority.NONE.getValue());
    }

    public final synchronized void a(final String str, final le leVar, final int i) {
        if (leVar == null) {
            return;
        }
        if (this.b == null || hd.a(this.b)) {
            this.b = hd.c();
        }
        try {
            if (!hd.a(this.b)) {
                a aVar = new a((byte) 0);
                this.a.put(str, aVar);
                aVar.a = new Runnable() { // from class: com.tencent.mapsdk.internal.lg.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Exception e;
                        a aVar2;
                        byte[] bArr;
                        lg lgVar = lg.this;
                        String str2 = str;
                        le leVar2 = leVar;
                        int i2 = i;
                        try {
                            try {
                                if (DownloadPriority.get(i2) != DownloadPriority.NONE) {
                                    Thread.currentThread().setPriority(DownloadPriority.getThreadPriority(i2));
                                }
                                aVar2 = lgVar.a.get(str2);
                                try {
                                    if (aVar2 == null) {
                                        lgVar.a(str2, (byte[]) null, lh.ERROR);
                                    } else if (aVar2.a()) {
                                        lgVar.a(str2, (byte[]) null, lh.CANCEL);
                                    } else {
                                        InputStream e2 = leVar2.e(str2);
                                        lgVar.a(str2, (byte[]) null, aVar2.d);
                                        aVar2.b();
                                        lh lhVar = aVar2.d;
                                        if (e2 != null) {
                                            bArr = new byte[102400];
                                            while (bArr.length != 0) {
                                                bArr = kd.a(e2);
                                                if (bArr == null) {
                                                    throw new IllegalStateException("下载过程读取失败");
                                                }
                                                lgVar.a(str2, bArr, lhVar);
                                                if (aVar2.a()) {
                                                    lgVar.a(str2, (byte[]) null, lh.CANCEL);
                                                    return;
                                                }
                                            }
                                            kd.a((Closeable) e2);
                                        } else {
                                            byte[] f = leVar2.f(str2);
                                            bArr = (f == null || f.length != 0) ? f : null;
                                            lgVar.a(str2, bArr, lhVar);
                                        }
                                        if (aVar2.a()) {
                                            lgVar.a(str2, (byte[]) null, lh.CANCEL);
                                            return;
                                        }
                                        aVar2.e();
                                        lgVar.a(str2, bArr, aVar2.d);
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    e.printStackTrace();
                                    if (aVar2 != null) {
                                        aVar2.f();
                                    }
                                    lgVar.a(str2, (byte[]) null, aVar2 != null ? aVar2.d : lh.ERROR);
                                }
                            } catch (Exception e4) {
                                e = e4;
                                aVar2 = null;
                            }
                        } finally {
                            leVar2.b();
                        }
                    }
                };
                aVar.c = leVar;
                aVar.a(this.b);
            }
        } catch (IllegalMonitorStateException e) {
            e.printStackTrace();
        }
    }

    public final synchronized void a(String str) {
        a remove = this.a.remove(str);
        if (remove != null) {
            remove.d();
        }
    }

    public final synchronized void b(String str) {
        a remove = this.a.remove(str);
        if (remove != null) {
            remove.c();
        }
    }

    private void b(String str, le leVar, int i) {
        Exception e;
        a aVar;
        byte[] bArr;
        try {
            try {
                if (DownloadPriority.get(i) != DownloadPriority.NONE) {
                    Thread.currentThread().setPriority(DownloadPriority.getThreadPriority(i));
                }
                aVar = this.a.get(str);
                try {
                    if (aVar == null) {
                        a(str, (byte[]) null, lh.ERROR);
                    } else if (aVar.a()) {
                        a(str, (byte[]) null, lh.CANCEL);
                    } else {
                        InputStream e2 = leVar.e(str);
                        a(str, (byte[]) null, aVar.d);
                        aVar.b();
                        lh lhVar = aVar.d;
                        if (e2 != null) {
                            bArr = new byte[102400];
                            while (bArr.length != 0) {
                                bArr = kd.a(e2);
                                if (bArr == null) {
                                    throw new IllegalStateException("下载过程读取失败");
                                }
                                a(str, bArr, lhVar);
                                if (aVar.a()) {
                                    a(str, (byte[]) null, lh.CANCEL);
                                    return;
                                }
                            }
                            kd.a((Closeable) e2);
                        } else {
                            byte[] f = leVar.f(str);
                            bArr = (f == null || f.length != 0) ? f : null;
                            a(str, bArr, lhVar);
                        }
                        if (aVar.a()) {
                            a(str, (byte[]) null, lh.CANCEL);
                            return;
                        }
                        aVar.e();
                        a(str, bArr, aVar.d);
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (aVar != null) {
                        aVar.f();
                    }
                    a(str, (byte[]) null, aVar != null ? aVar.d : lh.ERROR);
                }
            } catch (Exception e4) {
                e = e4;
                aVar = null;
            }
        } finally {
            leVar.b();
        }
    }

    final void a(final String str, final byte[] bArr, final lh lhVar) {
        if (this.d.isEmpty() || lhVar == null) {
            return;
        }
        if (this.c == null || hd.a(this.c)) {
            this.c = hd.b();
        }
        if (this.c.isShutdown()) {
            return;
        }
        this.c.execute(new Runnable() { // from class: com.tencent.mapsdk.internal.lg.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (lf lfVar : lg.this.d) {
                        if (!lg.this.c.isShutdown() && !lg.this.c.isTerminated()) {
                            lfVar.a(lhVar);
                            switch (AnonymousClass3.a[lhVar.ordinal()]) {
                                case 1:
                                    lfVar.a(str);
                                    break;
                                case 2:
                                    lfVar.b(str);
                                    lfVar.a(str, bArr);
                                    break;
                                case 3:
                                case 4:
                                    if (bArr == null) {
                                        lfVar.d(str);
                                    }
                                    lfVar.a(str, bArr);
                                    break;
                                case 5:
                                    if (bArr == null) {
                                        lfVar.d(str);
                                    }
                                    lfVar.a(str, bArr);
                                    lfVar.c(str);
                                    break;
                            }
                        }
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.lg$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[lh.values().length];

        static {
            try {
                a[lh.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[lh.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[lh.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[lh.RUNNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[lh.FINISH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private Runnable c(String str) {
        a aVar = this.a.get(str);
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public Runnable a;
        Future b;
        le c;
        lh d;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final boolean a() {
            return this.d == lh.CANCEL;
        }

        public final synchronized void a(ExecutorService executorService) {
            if (this.d == null && this.a != null && executorService != null && !hd.a(executorService)) {
                this.d = lh.START;
                this.b = executorService.submit(this.a);
            }
        }

        public final synchronized void b() {
            if (this.d == lh.START) {
                this.d = lh.RUNNING;
            }
        }

        public final synchronized void c() {
            if (this.d == null) {
                return;
            }
            if (this.b != null) {
                this.b.cancel(true);
            }
            if (this.c != null) {
                this.c.a();
            }
            this.d = lh.CANCEL;
        }

        public final synchronized void d() {
            if (this.d != null && this.d != lh.RUNNING) {
                c();
            }
        }

        public final synchronized void e() {
            if (this.d == lh.RUNNING || this.d == lh.FINISH) {
                this.d = lh.FINISH;
            }
        }

        public final synchronized void f() {
            if (this.d != lh.FINISH && this.d != lh.CANCEL) {
                this.d = lh.ERROR;
            }
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("RequestBody{");
            stringBuffer.append("runnable=");
            stringBuffer.append(this.a);
            stringBuffer.append(", requestFuture=");
            stringBuffer.append(this.b);
            stringBuffer.append(", executor=");
            stringBuffer.append(this.c);
            stringBuffer.append(", status=");
            stringBuffer.append(this.d);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    private static /* synthetic */ void a(lg lgVar, String str, le leVar, int i) {
        Exception e;
        a aVar;
        byte[] bArr;
        try {
            try {
                if (DownloadPriority.get(i) != DownloadPriority.NONE) {
                    Thread.currentThread().setPriority(DownloadPriority.getThreadPriority(i));
                }
                aVar = lgVar.a.get(str);
                try {
                    if (aVar == null) {
                        lgVar.a(str, (byte[]) null, lh.ERROR);
                    } else if (aVar.a()) {
                        lgVar.a(str, (byte[]) null, lh.CANCEL);
                    } else {
                        InputStream e2 = leVar.e(str);
                        lgVar.a(str, (byte[]) null, aVar.d);
                        aVar.b();
                        lh lhVar = aVar.d;
                        if (e2 != null) {
                            bArr = new byte[102400];
                            while (bArr.length != 0) {
                                bArr = kd.a(e2);
                                if (bArr == null) {
                                    throw new IllegalStateException("下载过程读取失败");
                                }
                                lgVar.a(str, bArr, lhVar);
                                if (aVar.a()) {
                                    lgVar.a(str, (byte[]) null, lh.CANCEL);
                                    return;
                                }
                            }
                            kd.a((Closeable) e2);
                        } else {
                            byte[] f = leVar.f(str);
                            bArr = (f == null || f.length != 0) ? f : null;
                            lgVar.a(str, bArr, lhVar);
                        }
                        if (aVar.a()) {
                            lgVar.a(str, (byte[]) null, lh.CANCEL);
                            return;
                        }
                        aVar.e();
                        lgVar.a(str, bArr, aVar.d);
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (aVar != null) {
                        aVar.f();
                    }
                    lgVar.a(str, (byte[]) null, aVar != null ? aVar.d : lh.ERROR);
                }
            } catch (Exception e4) {
                e = e4;
                aVar = null;
            }
        } finally {
            leVar.b();
        }
    }
}
