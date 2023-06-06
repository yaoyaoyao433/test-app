package com.sankuai.waimai.store.order.prescription.block;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.store.order.prescription.model.InquiryTemplateModel;
import com.sankuai.waimai.store.order.prescription.model.OrderRecipeInfo;
import com.sankuai.waimai.store.order.prescription.model.PrescriptionInquiryTemplateParam;
import com.sankuai.waimai.store.util.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DynamicBinder(modelType = OrderRecipeInfo.class, nativeId = {"wm_confirm_order_prescription_inquiry_template"}, viewModel = com.sankuai.waimai.store.order.prescription.model.d.class)
/* loaded from: classes5.dex */
public class h extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.prescription.view.e, com.sankuai.waimai.store.order.prescription.model.d, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec2084871febeaa8756d442c78c8c0e4", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.model.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec2084871febeaa8756d442c78c8c0e4") : new com.sankuai.waimai.store.order.prescription.model.d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.prescription.view.e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53a7511659c5009ce6f49d17f99c0819", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.view.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53a7511659c5009ce6f49d17f99c0819") : new com.sankuai.waimai.store.order.prescription.view.e(m());
    }

    public h(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c957a3323ae219fce2b56e92dd9538", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c957a3323ae219fce2b56e92dd9538");
            return;
        }
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).g().a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.store.order.prescription.block.h.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar2) {
                b.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc7b3ca644112ec66e498e1d879bacb5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc7b3ca644112ec66e498e1d879bacb5");
                    return;
                }
                com.sankuai.waimai.store.order.prescription.view.e eVar = (com.sankuai.waimai.store.order.prescription.view.e) h.this.g;
                int i = aVar3.a;
                int i2 = aVar3.b;
                Intent intent = aVar3.c;
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.prescription.view.e.d;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "05867ca1ff48cef085c9f3016276f43f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "05867ca1ff48cef085c9f3016276f43f");
                } else if (i == 3 && i2 == -1 && intent != null) {
                    String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "resultData");
                    try {
                        if (t.a(a2)) {
                            eVar.i = "";
                        } else {
                            eVar.i = new JSONObject(a2).optString("inquiry_id", "");
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).n().a(new com.sankuai.waimai.business.order.api.a<i.c<Integer, Map<String, Object>>>(i()) { // from class: com.sankuai.waimai.store.order.prescription.block.h.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.order.api.a
            public final /* synthetic */ void b(i.c<Integer, Map<String, Object>> cVar) {
                PrescriptionInquiryTemplateParam prescriptionInquiryTemplateParam;
                i.c<Integer, Map<String, Object>> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5367b3a7797654f3fd0afa4f7d8f122", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5367b3a7797654f3fd0afa4f7d8f122");
                } else if (cVar2 == null || cVar2.d == null || !h.this.r().e) {
                } else {
                    Map<String, Object> map = cVar2.d;
                    com.sankuai.waimai.store.order.prescription.view.e r2 = h.this.r();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.prescription.view.e.d;
                    if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "85b253bfe1ceaa01ec1afc5e8bf43862", RobustBitConfig.DEFAULT_VALUE)) {
                        prescriptionInquiryTemplateParam = (PrescriptionInquiryTemplateParam) PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "85b253bfe1ceaa01ec1afc5e8bf43862");
                    } else {
                        PrescriptionInquiryTemplateParam prescriptionInquiryTemplateParam2 = new PrescriptionInquiryTemplateParam();
                        prescriptionInquiryTemplateParam2.inquiryId = r2.i;
                        prescriptionInquiryTemplateParam = prescriptionInquiryTemplateParam2;
                    }
                    map.put("prescription_info", prescriptionInquiryTemplateParam);
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).k().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.store.order.prescription.block.h.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7980142aafe860cb7e346d008402caea", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7980142aafe860cb7e346d008402caea");
                }
                com.sankuai.waimai.store.order.prescription.view.e r2 = h.this.r();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.prescription.view.e.d;
                if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "c5da891daf95d16512843c448eec194f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "c5da891daf95d16512843c448eec194f");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", r2.k);
                hashMap.put("spu_id", r2.e());
                hashMap.put("stid", r2.m);
                return hashMap;
            }
        };
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).l().b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.store.order.prescription.block.h.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cb25536fa784de16d0d8b362ec485b5", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cb25536fa784de16d0d8b362ec485b5");
                }
                com.sankuai.waimai.store.order.prescription.view.e r2 = h.this.r();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.prescription.view.e.d;
                return PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "6d5666a84622d9b65b3b33e40348349c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "6d5666a84622d9b65b3b33e40348349c") : r2.l == null ? "" : r2.a(r2.l.scheme);
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "274922e99b89c070aff8c1fb6db9bda0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "274922e99b89c070aff8c1fb6db9bda0");
            return;
        }
        super.I();
        a(0, com.sankuai.shangou.stone.util.h.a(l(), 6.0f), 0, 0);
        r().b(ExpInfo.getExpName(((com.sankuai.waimai.business.order.api.confirm.block.a) F()).j().a(), 15));
        final com.sankuai.waimai.store.order.prescription.view.e r2 = r();
        OrderRecipeInfo e = ((com.sankuai.waimai.store.order.prescription.model.d) this.n).e();
        Long l = ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).i().a().b;
        Object[] objArr2 = {e, l};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.prescription.view.e.d;
        if (PatchProxy.isSupport(objArr2, r2, changeQuickRedirect2, false, "d9a0a6e648f7ae24df9b9af40368f491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, r2, changeQuickRedirect2, false, "d9a0a6e648f7ae24df9b9af40368f491");
        } else if (e == null || t.a(e.inquiryTemplateModel)) {
            r2.a().setVisibility(8);
        } else {
            r2.l = (InquiryTemplateModel) com.sankuai.waimai.store.util.i.a(e.inquiryTemplateModel, InquiryTemplateModel.class);
            if (r2.l != null) {
                r2.f.setText(r2.l.title);
                r2.g.setText(r2.l.subTitle);
                r2.h.setText(l.a(r2.l.schemeName, "#FF8000"));
                final HashMap hashMap = new HashMap();
                hashMap.put("status", Integer.valueOf(r2.l.status));
                r2.a().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.prescription.view.e.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d7dca9de8e94a4887c774c9f23ae0bb1", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d7dca9de8e94a4887c774c9f23ae0bb1");
                        } else if (t.a(r2.l.scheme)) {
                        } else {
                            com.sankuai.waimai.store.router.d.b(r2.c, r2.a(r2.l.scheme), new Bundle(), 3);
                            e eVar = r2;
                            Map<String, Object> map = hashMap;
                            Object[] objArr4 = {"b_waimai_j733itdr_mc", map};
                            ChangeQuickRedirect changeQuickRedirect4 = e.d;
                            if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "26142eb66260549489841bfd4a44be99", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "26142eb66260549489841bfd4a44be99");
                            } else {
                                eVar.a(com.sankuai.waimai.store.manager.judas.b.a("c_ykhs39e", "b_waimai_j733itdr_mc"), "b_waimai_j733itdr_mc", map);
                            }
                        }
                    }
                });
                r2.j = e.foodList;
                r2.e = true;
                r2.k = l;
                r2.a(null, "b_waimai_j733itdr_mv", hashMap);
            }
        }
    }
}
