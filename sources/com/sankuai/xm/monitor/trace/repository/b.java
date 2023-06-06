package com.sankuai.xm.monitor.trace.repository;

import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.db.j;
import com.sankuai.xm.base.tinyorm.f;
import com.sankuai.xm.base.util.m;
import com.sankuai.xm.monitor.report.db.ReportDB;
import com.sankuai.xm.monitor.report.db.TraceBean;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;
    ReportDB b;

    public b(ReportDB reportDB) {
        Object[] objArr = {reportDB};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd21c3849f623bd4ef6e228ab0ea31d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd21c3849f623bd4ef6e228ab0ea31d0");
        } else {
            this.b = reportDB;
        }
    }

    @Override // com.sankuai.xm.monitor.trace.repository.a
    public final void a(final List<TraceBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24763b5f1eaa05401c7ed2b1fdc838b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24763b5f1eaa05401c7ed2b1fdc838b4");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            a(new Runnable() { // from class: com.sankuai.xm.monitor.trace.repository.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean d;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "609039c736e7eeaf5c5004048c4404fe", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "609039c736e7eeaf5c5004048c4404fe");
                        return;
                    }
                    c bR_ = b.this.b.bR_();
                    if (bR_ == null) {
                        return;
                    }
                    try {
                        bR_.b();
                        for (TraceBean traceBean : list) {
                            if (traceBean != null && traceBean.getTraceId() != 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                if (traceBean.getUpdateTime() <= 0) {
                                    traceBean.setUpdateTime(currentTimeMillis);
                                }
                                if (traceBean.getCreateTime() <= 0) {
                                    traceBean.setCreateTime(currentTimeMillis);
                                }
                                if (traceBean.getStatus() == 0) {
                                    d = f.a().a(bR_, traceBean) > 0;
                                } else {
                                    d = f.a().d(bR_, traceBean);
                                }
                                if (!d) {
                                    com.sankuai.xm.log.c.c("TraceDBRepository", "save failed:bean = " + traceBean, new Object[0]);
                                }
                            }
                            com.sankuai.xm.log.c.d("TraceDBRepository", "save:: trace = " + traceBean, new Object[0]);
                        }
                        bR_.d();
                    } finally {
                        bR_.c();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.xm.monitor.trace.repository.a
    public final List<TraceBean> a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4acfee7c89e9e0b632b53fe8b0f12160", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4acfee7c89e9e0b632b53fe8b0f12160");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.b.a(new Runnable() { // from class: com.sankuai.xm.monitor.trace.repository.b.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, T, java.util.ArrayList] */
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String[] strArr;
                Cursor cursor;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f51b3e8b1dd55f142a833a52fb9147b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f51b3e8b1dd55f142a833a52fb9147b");
                    return;
                }
                if (z) {
                    str = "deadline<=?";
                    strArr = new String[]{String.valueOf(System.currentTimeMillis())};
                } else {
                    str = null;
                    strArr = null;
                }
                try {
                    cursor = b.this.b.bR_().a(TraceBean.TABLE_NAME, null, str, strArr, null, null, null, null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() > 0) {
                                ?? arrayList = new ArrayList();
                                while (cursor.moveToNext()) {
                                    TraceBean traceBean = (TraceBean) f.a().a(TraceBean.class, cursor);
                                    if (traceBean != null) {
                                        arrayList.add(traceBean);
                                    }
                                }
                                bVar.c = arrayList;
                                m.a(cursor);
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            m.a(cursor);
                            throw th;
                        }
                    }
                    m.a(cursor);
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
            }
        }, true, null);
        return (List) bVar.c;
    }

    @Override // com.sankuai.xm.monitor.trace.repository.a
    public final void b(final List<TraceBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5cf26980bed0bb6d870bd2cbcd7d6c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5cf26980bed0bb6d870bd2cbcd7d6c9");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            a(new Runnable() { // from class: com.sankuai.xm.monitor.trace.repository.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b798896fd49b14aa451a370a833ca265", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b798896fd49b14aa451a370a833ca265");
                        return;
                    }
                    c bR_ = b.this.b.bR_();
                    try {
                        bR_.b();
                        for (TraceBean traceBean : list) {
                            f.a().b(bR_, traceBean);
                        }
                        bR_.d();
                    } finally {
                        bR_.c();
                    }
                }
            });
        }
    }

    private boolean a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce4e20ae2b442afc877bbc7e1c2e6702", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce4e20ae2b442afc877bbc7e1c2e6702")).booleanValue();
        }
        if (runnable instanceof j) {
            return this.b.a((j) runnable);
        }
        return this.b.a(new j() { // from class: com.sankuai.xm.monitor.trace.repository.b.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38ca8932f783bfd8bdb6485b825fcf1d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38ca8932f783bfd8bdb6485b825fcf1d");
                } else {
                    runnable.run();
                }
            }
        }.a(true));
    }
}
