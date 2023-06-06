package com.sankuai.waimai.platform.machpro;

import android.app.Application;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.machpro.module.WMABTestModule;
import com.sankuai.waimai.platform.machpro.module.WMActivityIndicatorModule;
import com.sankuai.waimai.platform.machpro.module.WMAudioModule;
import com.sankuai.waimai.platform.machpro.module.WMCommonUtilsModule;
import com.sankuai.waimai.platform.machpro.module.WMEventCenter;
import com.sankuai.waimai.platform.machpro.module.WMLoginModule;
import com.sankuai.waimai.platform.machpro.module.WMNetworkModule;
import com.sankuai.waimai.platform.machpro.module.WMPayModule;
import com.sankuai.waimai.platform.machpro.module.WMRouterModule;
import com.sankuai.waimai.platform.machpro.module.WMStatisticsModule;
import com.sankuai.waimai.platform.machpro.module.WMStorageModule;
import com.sankuai.waimai.platform.machpro.module.WMToastModule;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;

    public static void a(Application application) {
        boolean containsKey;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c6fa9af3ffc810b81cd01faa182760f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c6fa9af3ffc810b81cd01faa182760f");
            return;
        }
        f.a().a("WMNetwork", WMNetworkModule.class);
        f.a().a("WMRouter", WMRouterModule.class);
        f.a().a("WMStatistics", WMStatisticsModule.class);
        f.a().a("WMEventCenter", WMEventCenter.class);
        f.a().a("WMStorage", WMStorageModule.class);
        f.a().b("refresh", com.sankuai.waimai.platform.machpro.refresh.a.class);
        f.a().b("wm-scroll-pull", com.sankuai.waimai.platform.machpro.scrollerpull.a.class);
        f.a().a("WMToast", WMToastModule.class);
        f.a().a("WMLogin", WMLoginModule.class);
        f.a().a("WMCommonUtils", WMCommonUtilsModule.class);
        f.a().a("WMABTest", WMABTestModule.class);
        f.a().a("WMActivityIndicator", WMActivityIndicatorModule.class);
        f.a().a("WMAudio", WMAudioModule.class);
        f.a().a("WMPay", WMPayModule.class);
        f a2 = f.a();
        com.sankuai.waimai.platform.machpro.container.c cVar = new com.sankuai.waimai.platform.machpro.container.c();
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "aa9f87aa0201dda12fff35bde72040c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "aa9f87aa0201dda12fff35bde72040c6");
        } else if (!a2.k.contains(cVar)) {
            a2.k.add(cVar);
        }
        Map<String, Map<String, String>> b = com.sankuai.meituan.serviceloader.b.b();
        if (b != null && b.size() > 0) {
            try {
                for (Map.Entry<String, String> entry : b.get(MPModule.class.getName()).entrySet()) {
                    f a3 = f.a();
                    String key = entry.getKey();
                    Object[] objArr3 = {key};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "b327deba7a82be2adcc81372e2e85257", RobustBitConfig.DEFAULT_VALUE)) {
                        containsKey = ((Boolean) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "b327deba7a82be2adcc81372e2e85257")).booleanValue();
                    } else {
                        containsKey = TextUtils.isEmpty(key) ? false : a3.f.containsKey(key);
                    }
                    if (containsKey) {
                        com.sankuai.waimai.machpro.util.a.a("Native Module 重复注册! ModuleName" + entry.getKey());
                    }
                    f.a().a(entry.getKey(), b.class.getClassLoader().loadClass(entry.getValue()));
                }
            } catch (ClassNotFoundException e) {
                com.sankuai.waimai.machpro.util.a.a("ServiceLoader 加载Module失败" + e.getMessage());
            }
        }
        Map<String, Map<String, String>> b2 = com.sankuai.meituan.serviceloader.b.b();
        if (b2 == null || b2.size() <= 0) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry2 : b2.get(MPComponent.class.getName()).entrySet()) {
                f.a().b(entry2.getKey(), b.class.getClassLoader().loadClass(entry2.getValue()));
            }
        } catch (ClassNotFoundException e2) {
            com.sankuai.waimai.machpro.util.a.a("ServiceLoader 加载自定义UIComponent失败" + e2.getMessage());
        }
    }
}
