package com.dianping.gryphon;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static HashMap<b, a> c = new HashMap<>();
    public static boolean b = false;

    public static a a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea114d62ddb992a5dbd15f814cba09cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea114d62ddb992a5dbd15f814cba09cf");
        }
        if (bVar == null) {
            bVar = b.DEFAULT;
        }
        a aVar = c.get(bVar);
        if (aVar == null) {
            c cVar = new c(bVar);
            c.put(bVar, cVar);
            return cVar;
        }
        return aVar;
    }

    public static void a(Context context) {
        b[] valuesCustom;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b86124b434a865966780878f79fce640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b86124b434a865966780878f79fce640");
        } else if (!b) {
            com.dianping.cache.a.a(context);
            for (b bVar : b.valuesCustom()) {
                com.dianping.cache.a a2 = com.dianping.cache.a.a();
                String str = bVar.f;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = com.dianping.cache.a.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "7f7c971c11a10038d3703a4d45871a13", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "7f7c971c11a10038d3703a4d45871a13");
                } else {
                    a2.e.add(str);
                }
            }
            b = true;
        }
    }
}
