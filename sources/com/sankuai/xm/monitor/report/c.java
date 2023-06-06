package com.sankuai.xm.monitor.report;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.tinyorm.f;
import com.sankuai.xm.monitor.report.db.ReportBean;
import com.sankuai.xm.monitor.report.db.ReportDB;
import java.util.Calendar;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends com.sankuai.xm.base.service.a implements com.sankuai.xm.base.lifecycle.a {
    public static ChangeQuickRedirect a;
    public long b;
    b c;
    int d;
    int e;
    volatile boolean f;
    private Context j;
    private long k;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0bf1fa66ae34951e69b03e88c6e5ef0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0bf1fa66ae34951e69b03e88c6e5ef0");
            return;
        }
        this.b = 300000L;
        this.d = 0;
        this.e = 0;
        this.k = 0L;
        this.f = false;
    }

    public static /* synthetic */ void a(c cVar, final ReportBean reportBean) {
        Object[] objArr = {reportBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "9b0107b685f45123b405322897d10bac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "9b0107b685f45123b405322897d10bac");
            return;
        }
        synchronized (cVar) {
            final ReportDB l = ReportDB.l();
            Object[] objArr2 = {reportBean};
            ChangeQuickRedirect changeQuickRedirect2 = ReportDB.j;
            if (PatchProxy.isSupport(objArr2, l, changeQuickRedirect2, false, "d4d18a9611efe6eb111de0764e0014bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, l, changeQuickRedirect2, false, "d4d18a9611efe6eb111de0764e0014bc");
            } else {
                l.a(new Runnable() { // from class: com.sankuai.xm.monitor.report.db.ReportDB.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b42b09de5d10652ed21e885422364ec1", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b42b09de5d10652ed21e885422364ec1");
                            return;
                        }
                        c bR_ = l.bR_();
                        if (bR_ == null) {
                            return;
                        }
                        f.a().a(bR_, reportBean);
                    }
                }, (Callback) null);
            }
        }
    }

    public static c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5685933b7b56d16206d264814a683da4", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5685933b7b56d16206d264814a683da4") : a.a;
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39094356e3231c797f4ac0b97b20d235", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39094356e3231c797f4ac0b97b20d235")).intValue();
        }
        com.sankuai.xm.log.c.b("ReportManager", "ReportManager::init", new Object[0]);
        this.j = com.sankuai.xm.base.f.m().g();
        this.c = new b();
        com.sankuai.xm.base.lifecycle.d.d().a(this);
        this.f = true;
        b(com.sankuai.xm.base.lifecycle.d.d().b);
        return super.a();
    }

    @Override // com.sankuai.xm.base.service.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449082bea8cdcde312b07eddb5b71987", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449082bea8cdcde312b07eddb5b71987");
            return;
        }
        ReportDB.l();
        super.k();
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4543cc53e160700121f56a426c0dfb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4543cc53e160700121f56a426c0dfb3");
        } else if (!this.f) {
            com.sankuai.xm.log.c.b("ReportManager", "ReportManager::appStateChanged:: not init", new Object[0]);
        } else {
            com.sankuai.xm.log.c.b("ReportManager", "ReportManager::appStateChanged:: report appStateChanged " + i, new Object[0]);
            this.e = 0;
            if (i == 0 && this.c != null && this.c.b) {
                this.c.b = false;
                this.c.a(this.b);
            }
            if (this.j != null && this.d != i && (this.k == 0 || SystemClock.uptimeMillis() - this.k >= 180000)) {
                this.k = SystemClock.uptimeMillis();
                d();
            }
            this.d = i;
        }
    }

    public final void a(List<ReportBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fbcf9cc9fbc26832f4bc3ecd9cfdac2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fbcf9cc9fbc26832f4bc3ecd9cfdac2");
            return;
        }
        synchronized (this) {
            ReportDB.l().a(list);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b3463b0f8ffff6e5d1728d2a29a894", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b3463b0f8ffff6e5d1728d2a29a894");
            return;
        }
        e();
        d();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e13f5d30e7f2b14cc88dba9535c0322e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e13f5d30e7f2b14cc88dba9535c0322e");
        } else if (this.c != null) {
            this.c.b();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8483b34cce768446f1a896250a8dfa26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8483b34cce768446f1a896250a8dfa26");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 4);
        calendar.set(12, 0);
        calendar.set(13, 0);
        final long timeInMillis = calendar.getTimeInMillis();
        com.sankuai.xm.threadpool.scheduler.a.b().a(22, new Runnable() { // from class: com.sankuai.xm.monitor.report.c.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0dd680e01b33f7cb481a2d9bd7798791", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0dd680e01b33f7cb481a2d9bd7798791");
                    return;
                }
                synchronized (c.this) {
                    final ReportDB l = ReportDB.l();
                    final long j = timeInMillis;
                    Object[] objArr3 = {null, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = ReportDB.j;
                    if (PatchProxy.isSupport(objArr3, l, changeQuickRedirect3, false, "bfc1f25558213d092ea612854b7cc2e4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, l, changeQuickRedirect3, false, "bfc1f25558213d092ea612854b7cc2e4");
                    } else {
                        l.a(new Runnable() { // from class: com.sankuai.xm.monitor.report.db.ReportDB.6
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                String[] strArr;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "86962bb014eca1a290e86cfd3818c1dd", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "86962bb014eca1a290e86cfd3818c1dd");
                                    return;
                                }
                                c bR_ = l.bR_();
                                if (bR_ == null) {
                                    return;
                                }
                                String str = "time < ?";
                                if (TextUtils.isEmpty(r2)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(j);
                                    strArr = new String[]{sb.toString()};
                                } else {
                                    str = "statistics_type= ? and time < ?";
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(j);
                                    strArr = new String[]{r2, sb2.toString()};
                                }
                                bR_.a(ReportBean.TABLE_NAME, str, strArr);
                            }
                        }, (Callback) null);
                    }
                }
            }
        });
    }

    @Override // com.sankuai.xm.base.lifecycle.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a68015997292ae691deadfc00eed3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a68015997292ae691deadfc00eed3b");
        } else {
            b(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        private static final c a = (c) m.a(c.class);
    }
}
