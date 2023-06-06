package com.meituan.android.hybridcashier.config.horn;

import android.support.annotation.Nullable;
import com.meituan.android.hybridcashier.cashier.HybridCashierSetting;
import com.meituan.android.hybridcashier.config.bean.HybridCashierConfig;
import com.meituan.android.hybridcashier.hook.d;
import com.meituan.android.hybridcashier.hook.e;
import com.meituan.android.neohybrid.core.hook.WebViewCreateHooker;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static Map<String, HybridCashierConfig> b = new HashMap();
    private static Map<String, HybridCashierConfig> c = new HashMap();
    private static Map<String, HybridCashierConfig> d = new HashMap();

    public static void a(@Nullable List<HybridCashierConfig> list) throws IllegalStateException {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90df73a20df513c24ffcd3829919ac65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90df73a20df513c24ffcd3829919ac65");
        } else if (!i.a((Collection) list)) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                HybridCashierConfig hybridCashierConfig = list.get(i);
                if (hybridCashierConfig != null) {
                    if (i == 0) {
                        hashMap.put("default_feature", hybridCashierConfig);
                    }
                    a(hashMap, hybridCashierConfig);
                    b(hashMap2, hybridCashierConfig);
                    c(hashMap3, hybridCashierConfig);
                    d a2 = d.a();
                    Object[] objArr2 = {hybridCashierConfig};
                    ChangeQuickRedirect changeQuickRedirect2 = d.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "22341a6bd98c03405795dca21d401f2b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "22341a6bd98c03405795dca21d401f2b");
                    } else if (hybridCashierConfig != null && hybridCashierConfig.isNSREnabled() && hybridCashierConfig.isNSRAllPagesEnabled() && !com.meituan.android.neohybrid.neo.nsr.b.a(hybridCashierConfig.getCashierUrlForNSR()) && hybridCashierConfig.isOfflinePkgCheckAvailable(false)) {
                        HybridCashierSetting a3 = com.meituan.android.hybridcashier.config.a.a(hybridCashierConfig);
                        WebViewCreateHooker a4 = WebViewCreateHooker.a();
                        Runnable a5 = e.a(a2, a3);
                        Object[] objArr3 = {a5};
                        ChangeQuickRedirect changeQuickRedirect3 = WebViewCreateHooker.a;
                        if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "90562735f66c6b2a8def2811ab420a21", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "90562735f66c6b2a8def2811ab420a21");
                        } else if (a4.b == 2) {
                            a5.run();
                        } else if (a4.b == 0 || a4.b == 1) {
                            if (a4.d == null) {
                                a4.d = new ArrayList();
                            }
                            a4.d.add(a5);
                        }
                    }
                }
            }
            b.clear();
            c.clear();
            d.clear();
            b = hashMap;
            c = hashMap2;
            d = hashMap3;
            com.meituan.android.neohybrid.cache.a.a();
        }
    }

    private static void a(Map<String, HybridCashierConfig> map, HybridCashierConfig hybridCashierConfig) {
        Object[] objArr = {map, hybridCashierConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "175293357aca3fe2949a75a3ea1600b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "175293357aca3fe2949a75a3ea1600b1");
        } else if (hybridCashierConfig != null && hybridCashierConfig.isHybridCashierEnable()) {
            Set<String> enabledHybridPages = hybridCashierConfig.getEnabledHybridPages();
            if (i.a(enabledHybridPages)) {
                return;
            }
            for (String str : enabledHybridPages) {
                if (!map.containsKey(str)) {
                    map.put(str, hybridCashierConfig);
                }
            }
        }
    }

    private static void b(Map<String, HybridCashierConfig> map, HybridCashierConfig hybridCashierConfig) {
        Object[] objArr = {map, hybridCashierConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de534f1f6449c044669ea7d55a861d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de534f1f6449c044669ea7d55a861d4e");
        } else if (hybridCashierConfig != null && hybridCashierConfig.isNSREnabled()) {
            Set<String> nSRPages = hybridCashierConfig.getNSRPages();
            if (i.a(nSRPages)) {
                return;
            }
            for (String str : nSRPages) {
                if (!map.containsKey(str)) {
                    map.put(str, hybridCashierConfig);
                }
            }
        }
    }

    private static void c(Map<String, HybridCashierConfig> map, HybridCashierConfig hybridCashierConfig) {
        Object[] objArr = {map, hybridCashierConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c5a190bf669f2ae8010c34293e83fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c5a190bf669f2ae8010c34293e83fe3");
        } else if (hybridCashierConfig != null && hybridCashierConfig.isPreloadEnabled()) {
            Set<String> nSRPages = hybridCashierConfig.getNSRPages();
            if (i.a(nSRPages)) {
                return;
            }
            for (String str : nSRPages) {
                if (!map.containsKey(str)) {
                    map.put(str, hybridCashierConfig);
                }
            }
        }
    }

    public static HybridCashierConfig a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d7c42eb9f6b02f0388bb61489ccc87f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HybridCashierConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d7c42eb9f6b02f0388bb61489ccc87f");
        }
        HybridCashierConfig hybridCashierConfig = b.get(str);
        if (hybridCashierConfig == null) {
            com.meituan.android.hybridcashier.report.a.a("b_pay_hybrid_horn_match_fail_sc", com.meituan.android.neohybrid.neo.report.a.c("feature", str).b);
            com.meituan.android.hybridcashier.report.a.a("cat:paybiz_hybrid_horn_match_fail", "horn match fail");
        }
        if (hybridCashierConfig != null) {
            return hybridCashierConfig;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c9b9f4409c53ef7e845541eaa148f9ca", RobustBitConfig.DEFAULT_VALUE) ? (HybridCashierConfig) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c9b9f4409c53ef7e845541eaa148f9ca") : b.get("default_feature");
    }

    public static HybridCashierConfig b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a598faada30a75751fdd737016873d93", RobustBitConfig.DEFAULT_VALUE) ? (HybridCashierConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a598faada30a75751fdd737016873d93") : c.get(str);
    }

    public static HybridCashierConfig c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "263f79a3902648c4ea04b3d23814bcad", RobustBitConfig.DEFAULT_VALUE) ? (HybridCashierConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "263f79a3902648c4ea04b3d23814bcad") : d.get(str);
    }

    public static boolean a(HybridCashierConfig hybridCashierConfig) {
        Object[] objArr = {hybridCashierConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed981010d46a7cbcd550d389b5efac5b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed981010d46a7cbcd550d389b5efac5b")).booleanValue() : b.get("default_feature") == hybridCashierConfig;
    }
}
