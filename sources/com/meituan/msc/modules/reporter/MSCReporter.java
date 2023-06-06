package com.meituan.msc.modules.reporter;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCReporter extends com.meituan.msc.common.report.a {
    public static ChangeQuickRedirect o;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface ReportValue {
        public static final int FAILED = 0;
        public static final int SUCCESS = 1;
    }

    private static Log a(com.meituan.msc.common.report.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d55766e15b85514fa0f04bf82e94ac0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Log) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d55766e15b85514fa0f04bf82e94ac0c");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.report.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "5c168010204f7d7dfcbbd0ed9ca93df2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "5c168010204f7d7dfcbbd0ed9ca93df2");
        } else if (dVar.e != null && !dVar.e.isEmpty()) {
            for (com.meituan.msc.common.report.c cVar : dVar.e) {
                cVar.a(dVar);
            }
            dVar.e.clear();
        }
        Log.Builder builder = new Log.Builder(null);
        builder.tag(dVar.f);
        builder.value(dVar.g);
        builder.optional(dVar.d);
        builder.reportChannel("prism-report-mmp");
        builder.lv4LocalStatus(true);
        return builder.build();
    }

    @Override // com.meituan.msc.common.report.a
    public final void b(com.meituan.msc.common.report.d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358cf9f4543e4088d7474d60376e59a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358cf9f4543e4088d7474d60376e59a9");
            return;
        }
        Log a = a(dVar);
        if (z) {
            Babel.logRT(a);
        } else {
            Babel.log(a);
        }
        g.d("MSCReporter", dVar);
    }

    @Override // com.meituan.msc.common.report.a
    public final void a(List<com.meituan.msc.common.report.d> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "525a2514a0aa7755a4f06060b44cf26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "525a2514a0aa7755a4f06060b44cf26e");
            return;
        }
        ArrayList<Log> arrayList = new ArrayList();
        for (com.meituan.msc.common.report.d dVar : list) {
            arrayList.add(a(dVar));
            g.d("MSCReporter", dVar);
        }
        if (z) {
            Babel.logRT(arrayList);
            return;
        }
        for (Log log : arrayList) {
            Babel.log(log);
        }
    }
}
