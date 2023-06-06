package com.sankuai.waimai.bussiness.order.confirm.pgablock.submitinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.BottomModelInfo;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.order.submit.model.CouponPackage;
import com.sankuai.waimai.business.order.submit.model.PreDecision;
import com.sankuai.waimai.bussiness.order.confirm.model.ap.ApDataWrapper;
import com.sankuai.waimai.foundation.utils.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
    public static ChangeQuickRedirect o;
    com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae8b1b5a927a2995fd188ed28c33993", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae8b1b5a927a2995fd188ed28c33993");
        } else {
            this.p = new com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa6d1762cc8c91855f07af81aee8b92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa6d1762cc8c91855f07af81aee8b92");
            return;
        }
        super.d();
        if (this.c != 0) {
            Map map = (Map) this.c;
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7c1717ad170d258f0e75442d4ad69a7a", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7c1717ad170d258f0e75442d4ad69a7a");
            } else {
                com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d dVar2 = new com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.d();
                dVar2.b = (CouponPackage) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(map.get("coupon_package")), (Class<Object>) CouponPackage.class);
                StringBuilder sb = new StringBuilder();
                sb.append(map.get("original_price"));
                dVar2.c = r.a(sb.toString(), 0.0d);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(map.get("total"));
                dVar2.d = r.a(sb2.toString(), 0.0d);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(map.get("reduced_shipping_fee"));
                dVar2.e = r.a(sb3.toString(), 0.0d);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(map.get("actual_pay_total"));
                dVar2.f = r.a(sb4.toString(), 0.0d);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(map.get("total_discount_price"));
                dVar2.g = r.a(sb5.toString(), 0.0d);
                if (map.containsKey("delivery_pack_fee_desc")) {
                    dVar2.h = String.valueOf(map.get("delivery_pack_fee_desc"));
                }
                dVar2.i = map.get("support_pay_by_friend") == null ? false : ((Boolean) map.get("support_pay_by_friend")).booleanValue();
                dVar2.j = map.get("enhance_pay_by_friend") == null ? false : ((Boolean) map.get("enhance_pay_by_friend")).booleanValue();
                if (map.containsKey("submit_btn_text")) {
                    dVar2.k = String.valueOf(map.get("submit_btn_text"));
                }
                if (map.containsKey("native_bottom_tip")) {
                    dVar2.m = String.valueOf(com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(map.get("native_bottom_tip"))).get("hint_text"));
                } else if (map.containsKey("mach_template_map")) {
                    dVar2.m = com.sankuai.waimai.business.order.submit.model.a.a((ApDataWrapper) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(map.get("mach_template_map")), (Class<Object>) ApDataWrapper.class));
                }
                if (map.containsKey("bottom_module_info")) {
                    dVar2.o = (BottomModelInfo) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(map.get("bottom_module_info")), (Class<Object>) BottomModelInfo.class);
                } else if (map.containsKey("submit_tip_info")) {
                    dVar2.n = String.valueOf(map.get("submit_tip_info"));
                }
                dVar2.q = (PreDecision) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(map.get("pre_decision")), (Class<Object>) PreDecision.class);
                List arrayList = map.get("coupon_info_list") != null ? (List) map.get("coupon_info_list") : new ArrayList();
                if (dVar2.p == null) {
                    dVar2.p = new ArrayList();
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    dVar2.p.add((CouponInfo) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(arrayList.get(i)), (Class<Object>) CouponInfo.class));
                }
                dVar = dVar2;
            }
            this.p = dVar;
            return;
        }
        this.p.b = null;
        this.p.c = 0.0d;
        this.p.d = 0.0d;
        this.p.e = 0.0d;
        this.p.f = 0.0d;
        this.p.g = 0.0d;
        this.p.h = null;
        this.p.i = false;
        this.p.j = false;
        this.p.l = null;
        this.p.m = null;
        this.p.k = null;
        this.p.o = null;
        this.p.p = null;
        this.p.q = null;
    }
}
