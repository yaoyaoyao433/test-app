package com.sankuai.waimai.launcher.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.launcher.init.mainly.x;
import com.sankuai.waimai.launcher.util.aop.b;
import com.sankuai.waimai.launcher.util.constants.a;
import com.sankuai.waimai.platform.config.horn.RemoteConfigCallback;
import com.sankuai.waimai.platform.config.horn.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LauncherRemoteConfig implements RemoteConfigCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.horn.RemoteConfigCallback
    public void onChanged(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8925ba7443e00451b982a91963377b79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8925ba7443e00451b982a91963377b79");
            return;
        }
        com.sankuai.meituan.mtimageloader.config.a.b(cVar.a("webp", false));
        b.a(cVar.a("jarvis", (Map) null));
        WaimaiLauncherSP.d(cVar.a("async_init_delay_time", 5000));
        WaimaiLauncherSP.d(cVar.a("disable_crash_with_logan", false));
        int a = cVar.a("image_loader_okhttp_timeout", 10);
        Object[] objArr2 = {Integer.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.launcher.util.constants.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "0a7e09eeaa0b906c6fab364f3cde077e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "0a7e09eeaa0b906c6fab364f3cde077e");
        } else {
            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((e) a.EnumC0995a.IMAGE_LOADER_TIMEOUT, a);
        }
        WaimaiLauncherSP.e(cVar.a("login_imei_switch", false));
        WaimaiLauncherSP.f(cVar.a("login_privacy_tips_switch", true));
        WaimaiLauncherSP.e(cVar.a("mrn_launch_delay", 5000));
        x.a(cVar.a("permission_period", -1));
        WaimaiLauncherSP.g(cVar.a("picasso_resize_switch", false));
        WaimaiLauncherSP.h(cVar.a("mrn_cdn_resize_switch", false));
    }
}
