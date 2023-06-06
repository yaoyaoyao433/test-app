package com.sankuai.xm.monitor.report.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.db.i;
import com.sankuai.xm.base.tinyorm.f;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.db.i
    public final void b(c cVar, int i, int i2) {
    }

    @Override // com.sankuai.xm.base.db.i
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa485c76591e5aa1de677b4d4dc6681", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa485c76591e5aa1de677b4d4dc6681");
            return;
        }
        cVar.b();
        f.a().a(cVar, ReportBean.class);
        f.a().a(cVar, TraceBean.class);
        cVar.d();
        cVar.c();
    }

    @Override // com.sankuai.xm.base.db.i
    public final void a(c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3392f65fdc4a08334cec178c134c316", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3392f65fdc4a08334cec178c134c316");
            return;
        }
        com.sankuai.xm.log.c.b("ReportSQLiteHelper", "ReportSQLiteHelper::onUpgrade, oldVersion:" + i + ",newVersion:" + i2 + " ,path:" + cVar.h(), new Object[0]);
        switch (i) {
            case 1:
            case 2:
                try {
                    cVar.a("drop table statistics_report");
                    f.a().a(cVar, ReportBean.class);
                } catch (Exception e) {
                    com.sankuai.xm.log.c.a("ReportSQLiteHelper", e);
                }
            case 3:
                f.a().a(cVar, TraceBean.class);
            case 4:
                if (i >= 3) {
                    try {
                        cVar.a("drop table chain_trace");
                    } catch (Exception e2) {
                        com.sankuai.xm.log.c.a("ReportSQLiteHelper", e2);
                    }
                }
                f.a().a(cVar, TraceBean.class);
                break;
            case 5:
                break;
            default:
                return;
        }
        cVar.a(String.format("alter table %s add COLUMN %s %s default %s", TraceBean.TABLE_NAME, "action", "text", ""));
    }
}
