package com.sankuai.waimai.machpro.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.f;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "257e5347296c0b2dc1f6accb7adffffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "257e5347296c0b2dc1f6accb7adffffa");
            return;
        }
        com.sankuai.waimai.machpro.monitor.a aVar = f.a().j;
        if (aVar != null) {
            aVar.a(com.sankuai.waimai.mach.log.a.b, "machpro_log_sdk: ", str);
        }
        com.sankuai.waimai.machpro.c cVar = f.a().i;
        if (cVar == null || !cVar.i) {
            return;
        }
        b("machpro_log_sdk: ", str);
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35ab087e2c35e47a69711ff7800fe484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35ab087e2c35e47a69711ff7800fe484");
            return;
        }
        com.sankuai.waimai.machpro.monitor.a aVar = f.a().j;
        if (aVar != null) {
            aVar.a(com.sankuai.waimai.mach.log.a.a, "machpro_log_sdk: ", str);
        }
        com.sankuai.waimai.machpro.c cVar = f.a().i;
        if (cVar == null || !cVar.i) {
            return;
        }
        b("machpro_log_sdk: ", str);
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7121f4769a96ff7546aa2b8e27cf15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7121f4769a96ff7546aa2b8e27cf15b");
            return;
        }
        com.sankuai.waimai.machpro.c cVar = f.a().i;
        if (cVar == null || !cVar.i) {
            return;
        }
        b(str, str2);
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2df8009e192f36dd398d969fe449737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2df8009e192f36dd398d969fe449737");
            return;
        }
        com.sankuai.waimai.machpro.monitor.a aVar = f.a().j;
        if (aVar != null) {
            aVar.a(com.sankuai.waimai.mach.log.a.a, "machpro_log_sdk: ", str);
        }
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ffd1c74107d172782c6b378e28667ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ffd1c74107d172782c6b378e28667ec");
            return;
        }
        com.sankuai.waimai.machpro.c cVar = f.a().i;
        if (cVar == null || !cVar.i) {
            return;
        }
        b("machpro_log_sdk: ", str);
    }

    private static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdf43cf0200d854362bc0b98bc722757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdf43cf0200d854362bc0b98bc722757");
            return;
        }
        PrintStream printStream = System.out;
        printStream.println(str + str2);
    }
}
