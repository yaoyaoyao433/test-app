package com.meituan.android.neohybrid.v2.neo.bridge;

import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Map<String, String[]> b = new HashMap();

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, String... strArr) {
        Object[] objArr = {aVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2989b0a3a4dad651bb321152342711c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2989b0a3a4dad651bb321152342711c3");
        } else {
            a(aVar.n(), strArr);
        }
    }

    public static void a(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ea2c06fe22f729f2442523a9c7a0a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ea2c06fe22f729f2442523a9c7a0a5a");
            return;
        }
        if (b == null) {
            b = new HashMap();
        }
        b.put(str, strArr);
    }

    public static Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e52bd8cf7b2a70641c8201f7236595db", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e52bd8cf7b2a70641c8201f7236595db");
        }
        if (b != null && !b.isEmpty() && b.containsKey(str)) {
            HashMap hashMap = new HashMap();
            a(hashMap, b.get(str));
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        a(hashMap2, (String[]) null);
        return hashMap2;
    }

    private static void a(Map<String, com.meituan.android.neohybrid.v2.neo.bridge.handler.b> map, String[] strArr) {
        List a2;
        Object[] objArr = {map, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9aff8394c8b408970a3877fdc4a744d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9aff8394c8b408970a3877fdc4a744d");
        } else if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                try {
                    a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.android.neohybrid.v2.neo.bridge.handler.b.class, str);
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "HybridCashierFragment_getStaticCustomizeHandlersMap", (Map<String, Object>) null);
                    com.meituan.android.paybase.common.analyse.cat.a.a("HybridCashierFragment_getStaticCustomizeHandlersMap", "NeoBridge register failed, e=" + e.toString());
                }
                if (i.a((Collection) a2)) {
                    return;
                }
                for (int i = 0; i < a2.size(); i++) {
                    com.meituan.android.neohybrid.v2.neo.bridge.handler.b bVar = (com.meituan.android.neohybrid.v2.neo.bridge.handler.b) a2.get(i);
                    map.put(bVar.a(), bVar);
                }
            }
        } else {
            try {
                List a3 = com.sankuai.meituan.serviceloader.b.a(com.meituan.android.neohybrid.v2.neo.bridge.handler.b.class, "");
                if (i.a((Collection) a3)) {
                    return;
                }
                for (int i2 = 0; i2 < a3.size(); i2++) {
                    com.meituan.android.neohybrid.v2.neo.bridge.handler.b bVar2 = (com.meituan.android.neohybrid.v2.neo.bridge.handler.b) a3.get(i2);
                    map.put(bVar2.a(), bVar2);
                }
            } catch (Exception e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "HybridCashierFragment_getStaticCustomizeHandlersMap", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("HybridCashierFragment_getStaticCustomizeHandlersMap", "NeoBridge register failed, e=" + e2.toString());
            }
        }
    }
}
