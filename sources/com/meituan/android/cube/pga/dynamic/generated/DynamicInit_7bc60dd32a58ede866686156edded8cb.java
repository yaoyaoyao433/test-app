package com.meituan.android.cube.pga.dynamic.generated;

import com.meituan.android.cube.pga.dynamic.IDynamicInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DynamicInit_7bc60dd32a58ede866686156edded8cb implements IDynamicInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.cube.pga.dynamic.IDynamicInit
    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d48b65022b9c2816b4b8f082977bfef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d48b65022b9c2816b4b8f082977bfef2");
            return;
        }
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_activity_instructions", new u());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_block_container_mach", new s());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_service", new v());
        com.meituan.android.cube.pga.dynamic.a.a().a("order_confirm_delivery_group", new t());
        com.meituan.android.cube.pga.dynamic.a.a().a("order_status_food_info_group", new ad());
        com.meituan.android.cube.pga.dynamic.a.a().a("order_status_delivery_info_group", new ac());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_order_status_common_lazyload_render", new z());
        com.meituan.android.cube.pga.dynamic.a.a().a("waimai_order_order_status_recommend_info_style_1", new w());
        com.meituan.android.cube.pga.dynamic.a.a().a("waimai_order_order_status_operation_area_style_1", new aa());
        com.meituan.android.cube.pga.dynamic.a.a().a("order_end_area_info", new x());
        com.meituan.android.cube.pga.dynamic.a.a().a("order_status_operatearea_group", new ab());
        com.meituan.android.cube.pga.dynamic.a.a().a("waimai_order_status_feed_flow_style_1", new y());
    }
}
