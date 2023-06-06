package com.sankuai.waimai.business.ugc.live.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    public static String b = "WMLive_Logan";
    public static String c = b + ": Player_View ";
    public static String d = b + ": Preload_Manager ";

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e71ace06852dc44698d925b20069f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e71ace06852dc44698d925b20069f81");
            return;
        }
        com.dianping.networklog.c.a(str, 3);
        com.sankuai.waimai.foundation.utils.log.a.b(b, str, new Object[0]);
    }
}
