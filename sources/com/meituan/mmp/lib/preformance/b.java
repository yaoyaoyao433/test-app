package com.meituan.mmp.lib.preformance;

import android.app.Activity;
import com.meituan.mmp.lib.page.view.g;
import com.meituan.msc.common.lib.IWhiteScreenCheckReporter;
import com.meituan.msc.common.lib.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static boolean b;
    private static IWhiteScreenCheckReporter c;

    private static IWhiteScreenCheckReporter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0b316c6349774d461643063d40126f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (IWhiteScreenCheckReporter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0b316c6349774d461643063d40126f7");
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

    public static void a(com.meituan.mmp.lib.config.a aVar, String str, g gVar, com.meituan.mmp.lib.a aVar2, Activity activity) {
        d c2;
        Object[] objArr = {aVar, str, gVar, aVar2, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6f9ca78abfd48cf1e9919b268db35ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6f9ca78abfd48cf1e9919b268db35ad");
            return;
        }
        IWhiteScreenCheckReporter a2 = a();
        if (a2 == null || aVar == null || aVar2 == null || (c2 = c(aVar, str, gVar, aVar2, activity)) == null) {
            return;
        }
        a2.pageResume(c2);
    }

    public static void b(com.meituan.mmp.lib.config.a aVar, String str, g gVar, com.meituan.mmp.lib.a aVar2, Activity activity) {
        d c2;
        Object[] objArr = {aVar, str, gVar, aVar2, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b243ac9a86200b492107a10a444a3b3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b243ac9a86200b492107a10a444a3b3d");
            return;
        }
        IWhiteScreenCheckReporter a2 = a();
        if (a2 == null || aVar == null || aVar2 == null || (c2 = c(aVar, str, gVar, aVar2, activity)) == null) {
            return;
        }
        a2.pagePause(c2);
    }

    private static d c(com.meituan.mmp.lib.config.a aVar, String str, g gVar, com.meituan.mmp.lib.a aVar2, Activity activity) {
        Object[] objArr = {aVar, str, gVar, aVar2, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aceae1f407bdd3e265d4f46fb949427a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aceae1f407bdd3e265d4f46fb949427a");
        }
        String d = aVar.d();
        if (aVar.l == null || aVar.l.mmpSdk == null) {
            return null;
        }
        String str2 = aVar.l.mmpSdk.d;
        d.a aVar3 = new d.a();
        aVar3.h = com.meituan.msc.common.lib.c.MMP;
        aVar3.c = aVar.c();
        aVar3.b = str;
        aVar3.d = d;
        aVar3.f = aVar.g();
        aVar3.e = str2;
        aVar3.g = gVar;
        aVar3.i = aVar2.L;
        aVar3.j = activity;
        return aVar3.a();
    }
}
