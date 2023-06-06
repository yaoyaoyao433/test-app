package com.sankuai.waimai.business.page.home.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4700b1a5ebeaee23c11257eb6957ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4700b1a5ebeaee23c11257eb6957ed0");
            return;
        }
        boolean b = com.sankuai.waimai.platform.accessibility.a.a().b();
        boolean z = com.sankuai.waimai.platform.accessibility.a.a().b;
        if (z || b) {
            JudasManualManager.a a2 = JudasManualManager.b("b_waimai_me7lii1a_mv").a("c_m84bv26");
            a2.b = str;
            a2.a("accessibility_switch", b ? "1" : "0").a("large_font", z ? "1" : "0").a();
        }
        com.sankuai.waimai.foundation.utils.log.a.a(a.class, "reportStatus largeFontSize : %b , accessibility_switch : %b", Boolean.valueOf(z), Boolean.valueOf(b));
    }
}
