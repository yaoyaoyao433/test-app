package com.meituan.android.cube.pga.dynamic.generated;

import com.meituan.android.cube.pga.dynamic.IDynamicInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DynamicInit_d0ce61e28e2e40150eb2910905de73ac implements IDynamicInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.cube.pga.dynamic.IDynamicInit
    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "687139a9046dc82193285172d7e418aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "687139a9046dc82193285172d7e418aa");
            return;
        }
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_home_head_banner", new b());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_home_head_single_banner_mach", new d());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_home_head_live_banner_mach", new c());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_home_head_hot_search", new f());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_home_head_poi_category", new e());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_home_list_platinum_rocks_mach", new g());
        com.meituan.android.cube.pga.dynamic.a.a().a("future_kingkong_rcmd", new i());
        com.meituan.android.cube.pga.dynamic.a.a().a("future_kingkong_tabs", new h());
        com.meituan.android.cube.pga.dynamic.a.a().a("waimai_native_kingkong_nav", new m());
        com.meituan.android.cube.pga.dynamic.a.a().a("waimai_kingkong_platinum_native", new j());
        com.meituan.android.cube.pga.dynamic.a.a().a("module_list_header", new l());
        com.meituan.android.cube.pga.dynamic.a.a().a("waimai_native_kingkong_tab", new k());
    }
}
