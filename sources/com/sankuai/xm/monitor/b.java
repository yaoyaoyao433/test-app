package com.sankuai.xm.monitor;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.component.e;
import com.sankuai.xm.base.db.DBCorruptException;
import com.sankuai.xm.base.db.DBFullException;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.db.l;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.w;
import com.sankuai.xm.monitor.report.db.ReportBean;
import com.sankuai.xm.monitor.report.db.ReportDB;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class b extends com.sankuai.xm.base.service.a implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    private static a d = new a();
    private static boolean e = false;
    public Context b;
    private e f;
    private com.sankuai.xm.monitor.trace.a j;
    private final ConcurrentHashMap<String, Object> k;
    private final Object l;

    private e e() {
        if (this.f == null) {
            synchronized (this.l) {
                if (this.f == null) {
                    this.f = new e(com.sankuai.xm.monitor.report.a.class, "mReportHandler", this);
                }
            }
        }
        return this.f;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c514c916339c98f9385f0fbae278e27", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c514c916339c98f9385f0fbae278e27");
        }
        com.sankuai.xm.monitor.report.a aVar = ("mReportHandler".equals(str) && cls == com.sankuai.xm.monitor.report.a.class) ? new com.sankuai.xm.monitor.report.a() : null;
        if (aVar instanceof com.sankuai.xm.base.component.a) {
            ((com.sankuai.xm.base.component.a) aVar).a(bVar);
        }
        if (cls.isInstance(aVar)) {
            return cls.cast(aVar);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabd179a1e5e4cd23a1bdee06673fae4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabd179a1e5e4cd23a1bdee06673fae4");
        } else if (bVar != null) {
            e().a(bVar);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fa9f1eb1ee715a3b8c440956d7f89c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fa9f1eb1ee715a3b8c440956d7f89c8");
            return;
        }
        this.k = new ConcurrentHashMap<>();
        this.l = new Object();
        this.f = null;
    }

    public static /* synthetic */ com.sankuai.xm.monitor.report.a a(b bVar) {
        return (com.sankuai.xm.monitor.report.a) bVar.e().a();
    }

    public static /* synthetic */ void a(b bVar, final ReportBean reportBean, int i) {
        Object[] objArr = {reportBean, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "bf3f4591caa76bfd4d6c08bea16e1817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "bf3f4591caa76bfd4d6c08bea16e1817");
        } else if (reportBean == null) {
            com.sankuai.xm.log.c.b("ElephantMonitorService", "logEvent:: reportBean is null", new Object[0]);
        } else if (!TextUtils.isEmpty(reportBean.value) && reportBean.value.length() > 10240) {
            com.sankuai.xm.log.c.b("ElephantMonitorService", "logEvent:: value is to large" + reportBean.value.length(), new Object[0]);
        } else {
            if (i < 11) {
                if (i == 3) {
                    com.sankuai.xm.log.c.b("ElephantMonitorService", "logEvent:: error event = " + reportBean.value, new Object[0]);
                } else {
                    com.sankuai.xm.log.c.b("ElephantMonitorService", "logEvent:: realtime event = " + reportBean.value, new Object[0]);
                }
            } else if (!"trace".equals(reportBean.name)) {
                com.sankuai.xm.log.c.b("ElephantMonitorService", "logEvent:: event = " + reportBean.value, new Object[0]);
            }
            reportBean.priority = i;
            if (e) {
                return;
            }
            final com.sankuai.xm.monitor.report.c b = com.sankuai.xm.monitor.report.c.b();
            Object[] objArr2 = {reportBean};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.monitor.report.c.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "a69987c487e361e292250c1a132d986a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "a69987c487e361e292250c1a132d986a");
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.sankuai.xm.monitor.report.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d76372cdbaa81fe3c6a199a21bd35b2a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d76372cdbaa81fe3c6a199a21bd35b2a");
                    } else if (!c.this.f) {
                        com.sankuai.xm.log.c.b("ReportManager", "ReportManager::Runnable::report:: not init", new Object[0]);
                    } else {
                        try {
                            c.a(c.this, reportBean);
                        } catch (DBCorruptException e2) {
                            final ReportDB l = ReportDB.l();
                            Object[] objArr4 = {ReportBean.TABLE_NAME};
                            ChangeQuickRedirect changeQuickRedirect4 = ReportDB.j;
                            if (PatchProxy.isSupport(objArr4, l, changeQuickRedirect4, false, "2d0fb71fa2ee092287d51bc99d2a7bd2", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, l, changeQuickRedirect4, false, "2d0fb71fa2ee092287d51bc99d2a7bd2");
                            } else {
                                l.a(new Runnable() { // from class: com.sankuai.xm.monitor.report.db.ReportDB.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9af15668758cb49a46c89c216e53e120", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9af15668758cb49a46c89c216e53e120");
                                            return;
                                        }
                                        if (r2 != null) {
                                            try {
                                                c bR_ = ReportDB.this.bR_();
                                                if (bR_ != null) {
                                                    bR_.a("drop table " + r2);
                                                    return;
                                                }
                                            } catch (Exception e3) {
                                                com.sankuai.xm.log.c.a("ReportDB", e3);
                                            }
                                        }
                                        File databasePath = ReportDB.this.k.getDatabasePath("dx_sdk_statistics_report.db");
                                        if (ReportDB.this.k != null && databasePath != null && databasePath.exists() && l.a(databasePath)) {
                                            ReportDB.this.a(ReportDB.this.k);
                                        }
                                    }
                                }, (Callback) null);
                            }
                            com.sankuai.xm.log.c.a("ReportManager", e2);
                        } catch (DBFullException e3) {
                            com.sankuai.xm.log.c.a("ReportManager", e3);
                            return;
                        } catch (Exception e4) {
                            com.sankuai.xm.log.c.a("ReportManager", e4);
                        }
                        if (c.this.c == null) {
                            com.sankuai.xm.log.c.b("ReportManager", "ReportManager::Runnable::report:: mReportDispatcher not init", new Object[0]);
                        } else if (reportBean.priority < 11) {
                            b bVar2 = c.this.c;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = b.a;
                            if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "eb8357e75245b41ed1a38181e4f8dbe3", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "eb8357e75245b41ed1a38181e4f8dbe3");
                            } else {
                                bVar2.a(52, PayTask.j);
                            }
                        } else {
                            c.this.c.a(c.this.b);
                        }
                    }
                }
            };
            Object[] objArr3 = {runnable};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.monitor.report.c.a;
            if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "a85d46154f015446c95979a0a1e906d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "a85d46154f015446c95979a0a1e906d4");
            } else if (com.sankuai.xm.threadpool.scheduler.a.b().a(Thread.currentThread().getName(), 22)) {
                runnable.run();
            } else {
                com.sankuai.xm.threadpool.scheduler.a.b().a(22, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6aaf73b55ea87e4036edebd69bc3a8b", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6aaf73b55ea87e4036edebd69bc3a8b");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89acb4d30e7ae2157fb54a2506df0d24", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89acb4d30e7ae2157fb54a2506df0d24")).intValue();
        }
        this.b = f.m().g();
        this.j = new com.sankuai.xm.monitor.trace.a(new com.sankuai.xm.monitor.trace.repository.b(ReportDB.l()));
        j.a((com.sankuai.xm.base.trace.c) this.j);
        com.sankuai.xm.log.c.b("ElephantMonitorService", "new", new Object[0]);
        return super.a();
    }

    @Override // com.sankuai.xm.base.service.a
    public final void k() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc15155410a269681f7953df452d46f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc15155410a269681f7953df452d46f3");
            return;
        }
        m.a(com.sankuai.xm.monitor.report.c.class);
        this.j.d = new com.sankuai.xm.monitor.trace.rule.e();
        switch (f.m().f()) {
            case ENV_TEST:
                str = "test";
                break;
            case ENV_STAGING:
                str = "st";
                break;
            default:
                str = "prod";
                break;
        }
        Context g = f.m().g();
        b().b = f.m().c();
        b().e = w.a(g, g.getPackageName());
        b().f = w.a(this.b, f.m().c());
        b().g = w.a();
        b().h = Build.MANUFACTURER;
        a b = b();
        com.sankuai.xm.base.extendimpl.a.a();
        b.i = b("4.46.113");
        b().m = str;
        if (TextUtils.isEmpty(b().d)) {
            b().d = w.b(this.b);
        }
        com.sankuai.xm.monitor.report.sample.e.a(g);
        com.sankuai.xm.monitor.report.c.b().c();
        super.k();
    }

    public static b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a33f99471427ba10ce9442bda45c822f", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a33f99471427ba10ce9442bda45c822f");
        }
        if (c == null) {
            c = (b) m.a(b.class);
        }
        return c;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7aebe076a93f0e4695a0936c4e79654", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7aebe076a93f0e4695a0936c4e79654");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.xm.base.extendimpl.a.a();
            if (str.equals("4.46.113")) {
                str = b(str);
            }
        }
        com.sankuai.xm.log.c.b("ElephantMonitorService", "setAppVersion:: appVersion is " + str, new Object[0]);
        b().d = str;
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efdf3a26f0247329203511e11dc21ed9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efdf3a26f0247329203511e11dc21ed9");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 3) {
                return str;
            }
            return split[0] + CommonConstant.Symbol.DOT + split[1] + CommonConstant.Symbol.DOT + split[2];
        } catch (Exception unused) {
            return str;
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada5618da9371b028f50751a4f333986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada5618da9371b028f50751a4f333986");
        } else {
            a(str, map, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, Map<String, Object> map, final int i) {
        Object[] objArr = {str, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81d7466c5b39bd355c8761c3b260373c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81d7466c5b39bd355c8761c3b260373c");
        } else if (((com.sankuai.xm.monitor.report.a) e().a()) == null) {
            com.sankuai.xm.log.c.b("ElephantMonitorService", "logEvent:: is not create", new Object[0]);
        } else {
            a(str, map, new Callback<ReportBean>() { // from class: com.sankuai.xm.monitor.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i2, String str2) {
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(ReportBean reportBean) {
                    ReportBean reportBean2 = reportBean;
                    Object[] objArr2 = {reportBean2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fddc4ae8865aada77b51f298f2b504d1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fddc4ae8865aada77b51f298f2b504d1");
                    } else {
                        b.a(b.this, reportBean2, i);
                    }
                }
            }, false);
        }
    }

    private void a(final String str, final Map<String, Object> map, final Callback<ReportBean> callback, boolean z) {
        Object[] objArr = {str, map, callback, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1911a87921d6778ea02bdb5780a50732", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1911a87921d6778ea02bdb5780a50732");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("ts_preset", Long.valueOf(System.currentTimeMillis()));
            com.sankuai.xm.threadpool.scheduler.a.b().a(22, new Runnable() { // from class: com.sankuai.xm.monitor.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "066d414af235d88c7888705aa7365965", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "066d414af235d88c7888705aa7365965");
                    } else {
                        callback.onSuccess(b.a(b.this).a(str, map));
                    }
                }
            });
        } else {
            callback.onSuccess(((com.sankuai.xm.monitor.report.a) e().a()).a(str, map));
        }
    }

    public static a d() {
        return d;
    }
}
