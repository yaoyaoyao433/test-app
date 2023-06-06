package com.sankuai.waimai.platform.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Map<String, Boolean> b;
    private static Set<String> c;

    static {
        com.sankuai.waimai.platform.provider.a aVar = new com.sankuai.waimai.platform.provider.a();
        for (MtGuardAndEncryptProvider mtGuardAndEncryptProvider : com.sankuai.waimai.router.a.a(MtGuardAndEncryptProvider.class)) {
            if (mtGuardAndEncryptProvider != null) {
                mtGuardAndEncryptProvider.registerEncryptProvider(aVar);
            }
        }
        b = Collections.unmodifiableMap(aVar.b);
    }

    public static void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55ec272cae7f371e05205f1fac236f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55ec272cae7f371e05205f1fac236f4d");
        } else if (set != null) {
            c = set;
            com.sankuai.waimai.platform.utils.sharedpreference.a.b(set);
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e912f1a2dae94d68a2d9e1908ffb45ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e912f1a2dae94d68a2d9e1908ffb45ba")).booleanValue();
        }
        if (c == null) {
            c = com.sankuai.waimai.platform.utils.sharedpreference.a.i();
        }
        return c.contains(str);
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e17192c2acd380e716c19c879fa962fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e17192c2acd380e716c19c879fa962fe")).booleanValue() : b.containsKey(str);
    }
}
