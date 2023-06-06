package com.meituan.android.cube.pga.dynamic.generated;

import com.meituan.android.cube.pga.dynamic.IDynamicInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DynamicInit_708538a8f9fdafa7548699fb03e4fd4 implements IDynamicInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.cube.pga.dynamic.IDynamicInit
    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e61f7e55145057d6dfc080d9bf0d305b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e61f7e55145057d6dfc080d9bf0d305b");
            return;
        }
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_menber_card", new o());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_sliding_bar", new p());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_reviews", new n());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_coupon_popup_container", new r());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_scroll_container", new q());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_shopping_cart", new aj());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_poi_info_mach_pro", new al());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_smart_assist_mach_pro", new ai());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_r_float_container", new ak());
    }
}
