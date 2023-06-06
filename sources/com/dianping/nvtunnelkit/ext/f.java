package com.dianping.nvtunnelkit.ext;

import com.dianping.nvtunnelkit.conn.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f<T extends com.dianping.nvtunnelkit.conn.c> {
    public static ChangeQuickRedirect a;
    public String b;
    public AtomicBoolean c;
    public long d;
    public boolean e;
    public e f;
    public boolean g;
    public boolean h;
    public ScheduledExecutorService i;
    private com.dianping.nvtunnelkit.core.f<T> j;

    public static /* synthetic */ void a(f fVar, Runnable runnable) {
        List<T> b2;
        String str;
        Throwable th;
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "d5929acd072c2a40270b7770d0aecff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "d5929acd072c2a40270b7770d0aecff6");
            return;
        }
        com.dianping.nvtunnelkit.core.e<T> a2 = fVar.j.a();
        if (a2 == null || (b2 = a2.b()) == null) {
            fVar.a(runnable);
            return;
        }
        String str2 = fVar.b;
        com.dianping.nvtunnelkit.logger.b.a(str2, "heart beat thread....,conn size: " + b2.size());
        synchronized (b2) {
            if (!b2.isEmpty()) {
                ArrayList<T> arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                for (T t : b2) {
                    try {
                        if (com.dianping.nvtunnelkit.logger.b.a()) {
                            if (!com.dianping.nvtunnelkit.utils.f.a(sb.toString())) {
                                sb.append(", ");
                            }
                            if (t instanceof com.dianping.nvtunnelkit.conn.b) {
                                str = ((com.dianping.nvtunnelkit.conn.b) t).q;
                                try {
                                    sb.append("[");
                                    sb.append("addressIp:");
                                    sb.append(str);
                                    sb.append(", connect time:");
                                    sb.append(((com.dianping.nvtunnelkit.conn.b) t).o());
                                    sb.append("ms");
                                    sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                } catch (Throwable th2) {
                                    th = th2;
                                    String str3 = fVar.b;
                                    com.dianping.nvtunnelkit.logger.b.a(str3, "heartbeat error, remove the connection. ip: " + str, th);
                                    arrayList.add(t);
                                }
                            }
                        }
                        if (t.l()) {
                            arrayList.add(t);
                        } else if (t.b(t.v().c)) {
                            t.p();
                        }
                    } catch (Throwable th3) {
                        str = "";
                        th = th3;
                    }
                }
                if (com.dianping.nvtunnelkit.logger.b.a()) {
                    String str4 = fVar.b;
                    com.dianping.nvtunnelkit.logger.b.a(str4, "heart beat thread conn info: " + sb.toString() + CommonConstant.Symbol.DOT);
                }
                if (!com.dianping.nvtunnelkit.utils.a.b(arrayList)) {
                    for (T t2 : arrayList) {
                        if (t2 != null) {
                            if (fVar.g) {
                                t2.t();
                            }
                            a2.c(t2);
                        }
                    }
                    arrayList.clear();
                }
            } else {
                try {
                    if (!fVar.e) {
                        b2.wait();
                    }
                } catch (InterruptedException e) {
                    com.dianping.nvtunnelkit.logger.b.a(fVar.b, e);
                }
            }
        }
        fVar.a(runnable);
    }

    public f(com.dianping.nvtunnelkit.core.f<T> fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2419b92d0cf6a15b56f15b6c3f965dcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2419b92d0cf6a15b56f15b6c3f965dcc");
            return;
        }
        this.b = com.dianping.nvtunnelkit.logger.a.a("NvHeartConnectionManager");
        this.c = new AtomicBoolean(false);
        this.d = 10000L;
        this.e = false;
        this.j = fVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        private final Runnable c;

        private b() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ba16b347bf9e5c4f808b4093cfdb559", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ba16b347bf9e5c4f808b4093cfdb559");
            } else {
                this.c = new Runnable() { // from class: com.dianping.nvtunnelkit.ext.f.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07a86488d6a669e1eff101d4c741f9f1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07a86488d6a669e1eff101d4c741f9f1");
                            return;
                        }
                        try {
                            Thread.sleep(f.this.d);
                        } catch (Throwable th) {
                            com.dianping.nvtunnelkit.logger.b.a(f.this.b, th);
                        }
                    }
                };
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b13ec3c253663244b98d0a134369bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b13ec3c253663244b98d0a134369bb");
                return;
            }
            while (f.this.c.get()) {
                f.a(f.this, this.c);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private final Runnable c;

        private a() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd6b6a62ec463f22a587c566886a4ea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd6b6a62ec463f22a587c566886a4ea");
            } else {
                this.c = new Runnable() { // from class: com.dianping.nvtunnelkit.ext.f.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e49354b1e2b726416d1bb9c8166c5430", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e49354b1e2b726416d1bb9c8166c5430");
                        } else if (f.this.i != null) {
                            f.this.i.schedule(a.this, f.this.d, TimeUnit.MILLISECONDS);
                        }
                    }
                };
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934a8d65a2b43ccf4fed9dc1f0e51eae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934a8d65a2b43ccf4fed9dc1f0e51eae");
            } else {
                f.a(f.this, this.c);
            }
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081b3320e34a6558b16801301f0aceda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081b3320e34a6558b16801301f0aceda");
            return;
        }
        try {
            if (this.f != null) {
                this.f.a();
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            com.dianping.nvtunnelkit.logger.b.a(this.b, th);
        }
    }
}
