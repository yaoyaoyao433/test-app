package com.meituan.android.cube.pga.dynamic.generated;

import com.meituan.android.cube.pga.dynamic.IDynamicInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DynamicInit_585d3bb03f06d22f528159131ce7e992 implements IDynamicInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.cube.pga.dynamic.IDynamicInit
    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a064eb8275570d81054de85ab4e1edf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a064eb8275570d81054de85ab4e1edf8");
            return;
        }
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_order_detail_sg_drug_consultation_template", new an());
        com.meituan.android.cube.pga.dynamic.a.a().a("drug_order_order_status_rx_status_style_1", new av());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_order_detail_sg_medicine_instruction_template", new aq());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_order_detail_order_node_status_template", new as());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_order_detail_sg_group_chat_template", new ao());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_order_detail_sg_inquiry_info_template", new ap());
        com.meituan.android.cube.pga.dynamic.a.a().a("supermarket_order_order_status_logistics_entrance_style_1", new au());
        com.meituan.android.cube.pga.dynamic.a.a().a("sc_order_detail_recommend_area", new ar());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_order_detail_order_promotion_template", new at());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_prescription_drug", new bb());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_order_detail_bottom_drug_protocal_block", new aw());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_prescription_inquiry_template", new bc());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_supermarket_switch_merchant", new az());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_supermarket_merchant_memberInfo_mach", new ay());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_supermarket_mach_info", new ax());
        com.meituan.android.cube.pga.dynamic.a.a().a("wm_confirm_order_drug_upload_prescription_mach_block", new ba());
    }
}
