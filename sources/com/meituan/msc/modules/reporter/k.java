package com.meituan.msc.modules.reporter;

import android.app.Activity;
import com.meituan.msc.common.lib.IWhiteScreenCheckReporter;
import com.meituan.msc.common.lib.d;
import com.meituan.msc.modules.container.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private static boolean b;
    private static IWhiteScreenCheckReporter c;

    public static IWhiteScreenCheckReporter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "027d78df8b8e6b4a62889e557323fc1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (IWhiteScreenCheckReporter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "027d78df8b8e6b4a62889e557323fc1d");
        }
        if (c == null && !b) {
            List a2 = com.sankuai.meituan.serviceloader.b.a(IWhiteScreenCheckReporter.class, "mp_white_screen_check_reporter");
            if (a2 != null && a2.size() > 0) {
                c = (IWhiteScreenCheckReporter) a2.get(0);
            }
            b = true;
        }
        return c;
    }

    public static com.meituan.msc.common.lib.d a(com.meituan.msc.modules.engine.h hVar, String str, com.meituan.msc.modules.page.view.d dVar, p pVar, Activity activity) {
        Object[] objArr = {hVar, str, dVar, pVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fc6aacfde7d7223c48e1b2885e34fa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.lib.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fc6aacfde7d7223c48e1b2885e34fa7");
        }
        com.meituan.msc.modules.update.f fVar = hVar.r;
        if (fVar == null) {
            return null;
        }
        String k = fVar.k();
        String n = fVar.n();
        String publishId = fVar.h != null ? fVar.h.getPublishId() : "";
        d.a aVar = new d.a();
        aVar.h = com.meituan.msc.common.lib.c.MSC;
        aVar.c = hVar.a();
        aVar.b = str;
        aVar.d = k;
        aVar.f = publishId;
        aVar.e = n;
        aVar.g = dVar;
        aVar.j = activity;
        aVar.i = pVar.F();
        return aVar.a();
    }
}
