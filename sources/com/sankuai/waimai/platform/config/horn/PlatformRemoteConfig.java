package com.sankuai.waimai.platform.config.horn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PlatformRemoteConfig implements RemoteConfigCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.horn.RemoteConfigCallback
    public void onChanged(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e332948b81a04f3ba1e5840112fbf44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e332948b81a04f3ba1e5840112fbf44");
            return;
        }
        List a = cVar.a("failover_paths", (List) null);
        if (a != null) {
            com.sankuai.waimai.platform.net.util.d.a(a);
        }
        com.sankuai.waimai.platform.utils.sharedpreference.a.h(cVar.a("poilist_annimation", false));
        com.sankuai.waimai.platform.net.b.a(cVar.a("reuse_fingerprint_urls", (Set) null));
        e a2 = e.a();
        Set<String> a3 = cVar.a("preload_uri_paths", (Set) null);
        Object[] objArr2 = {a3};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "53f8061e901ccf68b31746d950df1c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "53f8061e901ccf68b31746d950df1c5f");
        } else if (a3 != null) {
            a2.b = a3;
            com.sankuai.waimai.platform.utils.sharedpreference.a.c(a3);
        }
        com.sankuai.waimai.platform.utils.lifecycle.c a4 = com.sankuai.waimai.platform.utils.lifecycle.c.a();
        Set<String> a5 = cVar.a("record_router_time_paths", (Set) null);
        Object[] objArr3 = {a5};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.utils.lifecycle.c.a;
        if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect4, false, "282877f8e8c9062d532efd8c26ae137e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect4, false, "282877f8e8c9062d532efd8c26ae137e");
        } else if (a5 != null) {
            a4.b = a5;
            com.sankuai.waimai.platform.utils.sharedpreference.a.d(a5);
        }
        boolean a6 = cVar.a("dynamic_pga_reporter_on", false);
        Object[] objArr4 = {Byte.valueOf(a6 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.dynamic.e.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "e5ee22cc3d3a2cdf8a578afd107bf28a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "e5ee22cc3d3a2cdf8a578afd107bf28a");
        } else {
            com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.KEY_DYNAMIC_HORN_CONFIG, a6);
        }
        com.sankuai.waimai.platform.utils.sharedpreference.a.i(cVar.a("enable_json_cache_factory", true));
        com.sankuai.waimai.platform.utils.sharedpreference.a.j(cVar.a("disable_remove_view_hierarchy_state", false));
        com.sankuai.waimai.platform.utils.sharedpreference.a.e(cVar.a("network_strip_location_info_black_list", (Set) null));
        com.sankuai.waimai.platform.utils.sharedpreference.a.f(cVar.a("network_strip_wm_did_info_black_list", (Set) null));
        com.sankuai.waimai.platform.utils.sharedpreference.a.g(cVar.a("dovemon_allow_list", (Set) null));
        com.sankuai.waimai.platform.utils.sharedpreference.a.f(cVar.a("dovemon_timeout", 5000));
        com.sankuai.waimai.platform.utils.sharedpreference.a.g(cVar.a("locate_timeout_backup", 0));
        com.sankuai.waimai.platform.utils.sharedpreference.a.h(cVar.a("privacy_api_white_list_switch", 0));
        com.sankuai.waimai.platform.utils.sharedpreference.a.h(cVar.a("deeplink_boost_biz", (Set) null));
    }
}
