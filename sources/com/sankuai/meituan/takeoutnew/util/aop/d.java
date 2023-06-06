package com.sankuai.meituan.takeoutnew.util.aop;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;
    private static boolean c = true;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2169842c5fffb1d135cecceafd907fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2169842c5fffb1d135cecceafd907fe");
        } else if (b) {
            com.sankuai.waimai.business.page.home.utils.j.a("location_manager_start");
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "defb027ccd82aaeaed5170637f726d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "defb027ccd82aaeaed5170637f726d42");
        } else if (b) {
            b = false;
            com.sankuai.waimai.business.page.home.utils.j.a("locate_chain_complete");
        }
    }
}
