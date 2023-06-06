package com.dianping.nvnetwork.shark.monitor;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dianping.nvnetwork.util.c;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class n implements i {
    public static ChangeQuickRedirect a;
    private static volatile n e;
    public final AtomicBoolean b;
    volatile e c;
    volatile g d;
    private final Context f;
    private final j g;
    private final o h;
    private final m i;

    public static /* synthetic */ void d(n nVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "7f873ef627457339c8d8aaa97d7f5952", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "7f873ef627457339c8d8aaa97d7f5952");
        } else {
            com.dianping.nvnetwork.util.c.a(nVar.f, TrafficRecord.Detail.TUNNEL_SHARK, new c.b() { // from class: com.dianping.nvnetwork.shark.monitor.n.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.nvnetwork.util.c.b
                public final void a(int i, int i2, final boolean z) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d795edd9f382bbe44d35d249709d41ee", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d795edd9f382bbe44d35d249709d41ee");
                        return;
                    }
                    com.dianping.nvtunnelkit.logger.b.b("TNNetMonitor", "net status has changed, connectionType=" + i + ",subNetworkType=" + i2 + ",isConnected=" + z);
                    a.a().a(new Runnable() { // from class: com.dianping.nvnetwork.shark.monitor.n.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4acc093b9f0af55834cacc57e6d93e41", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4acc093b9f0af55834cacc57e6d93e41");
                                return;
                            }
                            o oVar = n.this.h;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = o.a;
                            if (PatchProxy.isSupport(objArr4, oVar, changeQuickRedirect4, false, "11f623832cb54f56e99a1c43cf5d16f6", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, oVar, changeQuickRedirect4, false, "11f623832cb54f56e99a1c43cf5d16f6");
                            } else {
                                oVar.b.clear();
                                oVar.b();
                                oVar.f = o.a();
                            }
                            m mVar = n.this.i;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = m.a;
                            if (PatchProxy.isSupport(objArr5, mVar, changeQuickRedirect5, false, "9a199bce671cbb64a1cf9cd1faccedd6", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, mVar, changeQuickRedirect5, false, "9a199bce671cbb64a1cf9cd1faccedd6");
                            } else {
                                mVar.b.clear();
                            }
                            c a2 = c.a();
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = c.a;
                            if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "bfd914f28fe60df81a1b32503a0fed95", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "bfd914f28fe60df81a1b32503a0fed95");
                            } else {
                                a2.b.a();
                                a2.c.a();
                                a2.d.a();
                                a2.g = a2.f.a(f.a());
                                if (a2.g != null) {
                                    a2.e = a2.a(a2.g);
                                } else {
                                    a2.e = e.UNKNOWN;
                                }
                                a2.j = com.dianping.nvnetwork.shark.g.a();
                                a2.i = 0L;
                                a2.k = 0;
                                a2.l = 0;
                                a2.m = 0;
                            }
                            if (!z) {
                                n.this.b(e.OFFLINE, new g(8));
                                return;
                            }
                            g gVar = c.a().g;
                            e eVar = c.a().e;
                            if (gVar == null) {
                                gVar = new g(8);
                                eVar = e.UNKNOWN;
                            } else {
                                gVar.g = 8;
                            }
                            n.this.b(eVar, gVar);
                        }
                    });
                }
            });
        }
    }

    private n(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7833d51c5274e013c02d08904aff8a5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7833d51c5274e013c02d08904aff8a5c");
            return;
        }
        this.b = new AtomicBoolean();
        this.c = e.UNKNOWN;
        this.f = context;
        com.dianping.nvtunnelkit.utils.c.a(context);
        d a2 = d.a();
        double b = a2.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        double doubleValue = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b545dfab662b97692c7956de9c0aafbc", 6917529027641081856L) ? ((Double) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b545dfab662b97692c7956de9c0aafbc")).doubleValue() : a2.c.optDouble("NetMonitor.PingInterval", 60000.0d);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        this.g = new j(b, doubleValue, PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "da9f7570111e6d7a6a7212506705505a", 6917529027641081856L) ? ((Double) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "da9f7570111e6d7a6a7212506705505a")).doubleValue() : a2.c.optDouble("NetMonitor.PingIntervalForWeak", 10000.0d), this);
        c.a().h = this;
        this.i = new m(this);
        this.h = new o();
    }

    public static n a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4769194d6e7c15a6b34859dd35a90bdb", 6917529027641081856L)) {
            return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4769194d6e7c15a6b34859dd35a90bdb");
        }
        if (e == null) {
            synchronized (n.class) {
                if (e == null) {
                    e = new n(context.getApplicationContext());
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull e eVar, g gVar) {
        Object[] objArr = {eVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0442609b793eba8081b09cda13523a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0442609b793eba8081b09cda13523a7");
            return;
        }
        this.d = gVar;
        if (eVar != this.c) {
            StringBuilder sb = new StringBuilder("net status has changed, ");
            sb.append(this.c);
            sb.append(" ==> ");
            sb.append(eVar);
            sb.append(" ，source = ");
            sb.append(gVar != null ? gVar.g : 0);
            com.dianping.nvtunnelkit.logger.b.b("TNNetMonitor", sb.toString());
            this.c = eVar;
            h.a().a(eVar);
        }
        if (gVar == null || gVar.g == 1) {
            return;
        }
        j jVar = this.g;
        Object[] objArr2 = {Integer.valueOf((int) UserCenter.TYPE_LOGOUT_NEGATIVE)};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "51c70c52c28e3c5abab6ae3baa58df76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "51c70c52c28e3c5abab6ae3baa58df76");
        } else {
            jVar.a(UserCenter.TYPE_LOGOUT_NEGATIVE);
        }
    }

    @Override // com.dianping.nvnetwork.shark.monitor.i
    public final void a(e eVar, g gVar) {
        Object[] objArr = {eVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe221d00d6d2aa06555e82d73f0fe34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe221d00d6d2aa06555e82d73f0fe34");
        } else {
            b(eVar, gVar);
        }
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7906c590201621d0fb69098940410715", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7906c590201621d0fb69098940410715")).booleanValue() : d.a().d && this.b.get();
    }
}
