package com.meituan.android.neohybrid.neo.bridge;

import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
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
public final class c {
    public static ChangeQuickRedirect a;
    private static Map<String, String[]> b = new HashMap();

    public static void a(com.meituan.android.neohybrid.core.a aVar, String... strArr) {
        Object[] objArr = {aVar, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10cbde73890f0114b8e0b9b131d53160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10cbde73890f0114b8e0b9b131d53160");
        } else {
            a(aVar.p(), strArr);
        }
    }

    public static void a(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b84a1602d63405604c79f85832694652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b84a1602d63405604c79f85832694652");
            return;
        }
        if (b == null) {
            b = new HashMap();
        }
        b.put(str, strArr);
    }

    public static Map<String, NeoBridgeCustomizeInterface> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14ca626f2d1dfb64ff9b73319adb24e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14ca626f2d1dfb64ff9b73319adb24e9");
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

    private static void a(Map<String, NeoBridgeCustomizeInterface> map, String[] strArr) {
        List a2;
        Object[] objArr = {map, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79bc64c46b3e70f0ae207a568e7b673f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79bc64c46b3e70f0ae207a568e7b673f");
        } else if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                try {
                    a2 = com.sankuai.meituan.serviceloader.b.a(NeoBridgeCustomizeInterface.class, str);
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "HybridCashierFragment_getStaticCustomizeHandlersMap", (Map<String, Object>) null);
                    com.meituan.android.paybase.common.analyse.cat.a.a("HybridCashierFragment_getStaticCustomizeHandlersMap", "NeoBridge register failed, e=" + e.toString());
                }
                if (i.a((Collection) a2)) {
                    return;
                }
                for (int i = 0; i < a2.size(); i++) {
                    NeoBridgeCustomizeInterface neoBridgeCustomizeInterface = (NeoBridgeCustomizeInterface) a2.get(i);
                    map.put(neoBridgeCustomizeInterface.a(), neoBridgeCustomizeInterface);
                }
            }
        } else {
            try {
                List a3 = com.sankuai.meituan.serviceloader.b.a(NeoBridgeCustomizeInterface.class, "");
                if (i.a((Collection) a3)) {
                    return;
                }
                for (int i2 = 0; i2 < a3.size(); i2++) {
                    NeoBridgeCustomizeInterface neoBridgeCustomizeInterface2 = (NeoBridgeCustomizeInterface) a3.get(i2);
                    map.put(neoBridgeCustomizeInterface2.a(), neoBridgeCustomizeInterface2);
                }
            } catch (Exception e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "HybridCashierFragment_getStaticCustomizeHandlersMap", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a("HybridCashierFragment_getStaticCustomizeHandlersMap", "NeoBridge register failed, e=" + e2.toString());
            }
        }
    }
}
