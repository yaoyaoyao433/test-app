package com.sankuai.waimai.platform.mach.statistics;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static final String b = "a";
    private static String c = "MachLogan";
    private static boolean d = true;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffa03d1aa427a63ea48cdd26c2f6fc70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffa03d1aa427a63ea48cdd26c2f6fc70");
            return;
        }
        String str3 = str + CommonConstant.Symbol.COMMA + str2;
        i.b(new c().a(c).d(str3).b());
        if (d) {
            com.sankuai.waimai.foundation.utils.log.a.b(b, "log=" + str3, new Object[0]);
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca2d4a6326241768f7736eac254898bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca2d4a6326241768f7736eac254898bc");
            return;
        }
        String str3 = str + CommonConstant.Symbol.COMMA + str2;
        i.a(new c().a(c).d(str3).b());
        if (d) {
            com.sankuai.waimai.foundation.utils.log.a.e(b, "log=" + str3, new Object[0]);
        }
    }
}
