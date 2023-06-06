package com.meituan.msc.modules.reporter;

import android.app.Activity;
import android.view.View;
import com.meituan.msc.lib.interfaces.IMSCNavigationReporter;
import com.meituan.msc.lib.interfaces.c;
import com.meituan.msc.modules.container.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static IMSCNavigationReporter b;
    private static boolean c;

    private static IMSCNavigationReporter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd298496d1d91b431a3a01c2e66c8995", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMSCNavigationReporter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd298496d1d91b431a3a01c2e66c8995");
        }
        if (b == null && !c) {
            List a2 = com.sankuai.meituan.serviceloader.b.a(IMSCNavigationReporter.class, "msc_navigation_start_time_reporter");
            if (a2 != null && a2.size() > 0) {
                b = (IMSCNavigationReporter) a2.get(0);
            }
            c = true;
        }
        return b;
    }

    public static void a(String str, String str2, com.meituan.msc.modules.engine.h hVar, p pVar, Activity activity, View view) {
        Object[] objArr = {str, str2, hVar, pVar, activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d68c0291d0bfe8818f8c806ebfc9a1ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d68c0291d0bfe8818f8c806ebfc9a1ed");
            return;
        }
        if (b == null) {
            a();
        }
        if (b != null) {
            String a2 = hVar.a();
            com.meituan.msc.modules.update.f fVar = hVar.r;
            String k = fVar.k();
            String n = fVar.n();
            int F = pVar.F();
            String a3 = com.meituan.msc.b.a(fVar.o(str));
            c.a aVar = new c.a(str, a2, k);
            aVar.i = activity;
            aVar.e = n;
            aVar.f = F;
            aVar.g = str2;
            aVar.h = a3;
            aVar.j = pVar.A();
            aVar.k = view;
            b.navigationStartTime(aVar.a());
        }
    }
}
