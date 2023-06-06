package com.sankuai.waimai.business.page.common.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.config.horn.RemoteConfigCallback;
import com.sankuai.waimai.platform.config.horn.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageRemoteConfig implements RemoteConfigCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.horn.RemoteConfigCallback
    public void onChanged(final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba01315310eef3dd070c3f2becde3e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba01315310eef3dd070c3f2becde3e75");
            return;
        }
        PageSP.a(cVar.a("rcmd_boot_preload_valid_time", 0));
        com.sankuai.waimai.business.page.home.head.banner.a.a(cVar.a("main_page_banner_timer_enable_delta", false), cVar.a("main_page_banner_timer_max_delta", 0));
        ad.c(new Runnable() { // from class: com.sankuai.waimai.business.page.common.config.PageRemoteConfig.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6944b6a7455845ac3cedf982931f66ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6944b6a7455845ac3cedf982931f66ae");
                    return;
                }
                com.sankuai.waimai.business.page.homepage.manager.c a2 = com.sankuai.waimai.business.page.homepage.manager.c.a();
                boolean a3 = cVar.a("enabled_patch", false);
                Object[] objArr3 = {Byte.valueOf(a3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.homepage.manager.c.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "06c89346ccae05d9139246d4bb20710b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "06c89346ccae05d9139246d4bb20710b");
                    return;
                }
                a2.e = a3;
                if (a3) {
                    a2.c.f = 1;
                }
            }
        });
        PageSP.c(cVar.a("launch_report_devices", false));
    }
}
