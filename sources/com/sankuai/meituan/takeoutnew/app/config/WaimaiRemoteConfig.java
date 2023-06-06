package com.sankuai.meituan.takeoutnew.app.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.BootAPICatMonitor;
import com.sankuai.meituan.takeoutnew.util.aop.SystemCallCache;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.platform.config.horn.RemoteConfigCallback;
import com.sankuai.waimai.platform.config.horn.c;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WaimaiRemoteConfig implements RemoteConfigCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.horn.RemoteConfigCallback
    public void onChanged(c cVar) {
        Object obj;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d638cdef0929c2c0bf9d4fd5cca74c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d638cdef0929c2c0bf9d4fd5cca74c7");
            return;
        }
        if (cVar.a("bitmap_guard", false)) {
            com.sankuai.waimai.launcher.util.image.a.a();
        }
        boolean a = cVar.a("mach_weather", false);
        String str = "";
        Object[] objArr2 = {"mach_weather_template", ""};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "880a2abff5bb96768a221f5326bea6da", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "880a2abff5bb96768a221f5326bea6da");
        } else if (cVar.b != null && (obj = cVar.b.get("mach_weather_template")) != null) {
            str = String.valueOf(obj);
        }
        com.sankuai.waimai.business.page.home.weather.a.a(a, str, cVar.a("mach_weather_codes", Collections.emptyList()));
        b.a(cVar.a("shark_switch", true), cVar.a("shark_push_switch", false));
        putPicCdnParamConfig(cVar.a("wm_pic_cdn_params", (Map) null));
        h.a(cVar.a("fdm_page_names", Collections.emptySet()));
        WaimaiSP.a(cVar.a("deliver_location_directly", true));
        BootAPICatMonitor.setBootCMDs(cVar.a("boot_api_monitor_cmds", (Set) null));
        SystemCallCache.updateConfig(cVar.a("cache_system_call", (Map) null));
        com.sankuai.meituan.takeoutnew.util.aop.a.a(cVar.a("babel_upload_delay", 4000));
        WaimaiSP.b(cVar.a("gd_external_jump_param_switch", true));
        WaimaiSP.c(cVar.a("deeplink_boost", false));
    }

    private static void putPicCdnParamConfig(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5102ccbc8b413b27a0f8ef5f04c14c00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5102ccbc8b413b27a0f8ef5f04c14c00");
        } else if (map == null) {
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "goods_feed_pic", map.get("goods_feed"));
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "goods_feed_gif_pic", map.get("goods_feed_gif_pic"));
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "global_cart_goods_list_pic", map.get("global_cart_goods_list"));
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "restaurant_goods_list_pic", map.get("restaurant_goods_list"));
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "goods_detail_header_pic", map.get("goods_detail_header"));
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "recommend_package_list_pic", map.get("recommend_package_list"));
        }
    }
}
