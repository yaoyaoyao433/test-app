package com.sankuai.waimai.store.order.prescription.block;

import android.content.Intent;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.confirm.block.a;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.store.order.prescription.model.OrderRecipeInfo;
import com.sankuai.waimai.store.order.prescription.model.PrescriptionInquiryTemplateParam;
import com.sankuai.waimai.store.order.prescription.model.PrescriptionTemplate;
import com.sankuai.waimai.store.order.prescription.model.PrescriptionUpdateParam;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DynamicBinder(modelType = OrderRecipeInfo.class, nativeId = {"wm_confirm_order_prescription_drug"}, viewModel = com.sankuai.waimai.store.order.prescription.model.d.class)
/* loaded from: classes5.dex */
public class g extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.prescription.view.f, com.sankuai.waimai.store.order.prescription.model.d, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06935d577acb9c7faf6c2941a18bcdd", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.model.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06935d577acb9c7faf6c2941a18bcdd") : new com.sankuai.waimai.store.order.prescription.model.d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.prescription.view.f z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309fe2e29b16f59578d042a5a432d1e7", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.view.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309fe2e29b16f59578d042a5a432d1e7") : new com.sankuai.waimai.store.order.prescription.view.f(m());
    }

    public g(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174a76bedcadc1c79128479a025edc66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174a76bedcadc1c79128479a025edc66");
            return;
        }
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).g().a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.store.order.prescription.block.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar2) {
                b.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f97093bd4360407bac4139300be305e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f97093bd4360407bac4139300be305e6");
                    return;
                }
                com.sankuai.waimai.store.order.prescription.view.f fVar = (com.sankuai.waimai.store.order.prescription.view.f) g.this.g;
                int i = aVar3.a;
                int i2 = aVar3.b;
                Intent intent = aVar3.c;
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.prescription.view.f.d;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "c825a498c36adcad7f5c3c344eeb4ae1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "c825a498c36adcad7f5c3c344eeb4ae1");
                } else if (i == 3 && i2 == -1) {
                    if (intent != null) {
                        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "resultData");
                        try {
                            if (t.a(a2)) {
                                fVar.g = "";
                                return;
                            } else {
                                fVar.g = new JSONObject(a2).optString("medical_user_id", "");
                                return;
                            }
                        } catch (Exception e) {
                            com.sankuai.waimai.store.base.log.a.a(e);
                            fVar.g = "";
                            return;
                        }
                    }
                    fVar.g = "";
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).n().a(new com.sankuai.waimai.business.order.api.a<i.c<Integer, Map<String, Object>>>(i()) { // from class: com.sankuai.waimai.store.order.prescription.block.g.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.order.api.a
            public final /* synthetic */ void b(i.c<Integer, Map<String, Object>> cVar) {
                PrescriptionInquiryTemplateParam prescriptionInquiryTemplateParam;
                PrescriptionUpdateParam prescriptionUpdateParam;
                i.c<Integer, Map<String, Object>> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "553cd4fa0cf040526d08b25d62124f58", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "553cd4fa0cf040526d08b25d62124f58");
                } else if (cVar2 == null || cVar2.d == null) {
                } else {
                    if (cVar2.c.intValue() == 1) {
                        Map<String, Object> map = cVar2.d;
                        com.sankuai.waimai.store.order.prescription.view.f r2 = g.this.r();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.prescription.view.f.d;
                        if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "6ebddf4c7618f2632e9b51eff615ae6f", RobustBitConfig.DEFAULT_VALUE)) {
                            prescriptionUpdateParam = (PrescriptionUpdateParam) PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "6ebddf4c7618f2632e9b51eff615ae6f");
                        } else {
                            PrescriptionUpdateParam prescriptionUpdateParam2 = new PrescriptionUpdateParam();
                            prescriptionUpdateParam2.medicialserd = r2.g;
                            prescriptionUpdateParam = prescriptionUpdateParam2;
                        }
                        map.put("prescription_info", prescriptionUpdateParam);
                    } else if (cVar2.c.intValue() == 2) {
                        Map<String, Object> map2 = cVar2.d;
                        com.sankuai.waimai.store.order.prescription.view.f r3 = g.this.r();
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.order.prescription.view.f.d;
                        if (PatchProxy.isSupport(objArr4, r3, changeQuickRedirect4, false, "998bc618fca97a743b29c91cbc9d70a6", RobustBitConfig.DEFAULT_VALUE)) {
                            prescriptionInquiryTemplateParam = (PrescriptionInquiryTemplateParam) PatchProxy.accessDispatch(objArr4, r3, changeQuickRedirect4, false, "998bc618fca97a743b29c91cbc9d70a6");
                        } else {
                            PrescriptionInquiryTemplateParam prescriptionInquiryTemplateParam2 = new PrescriptionInquiryTemplateParam();
                            prescriptionInquiryTemplateParam2.medicialserd = r3.g;
                            prescriptionInquiryTemplateParam2.inquiryId = r3.j == null ? "" : r3.j.a;
                            prescriptionInquiryTemplateParam = prescriptionInquiryTemplateParam2;
                        }
                        map2.put("prescription_info", prescriptionInquiryTemplateParam);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).q().a(new com.meituan.android.cube.pga.action.c<a.C0751a, Boolean>() { // from class: com.sankuai.waimai.store.order.prescription.block.g.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ Boolean a(a.C0751a c0751a) {
                a.C0751a c0751a2 = c0751a;
                Object[] objArr2 = {c0751a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c684ac66e0b67b6f97bc8422840cade6", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c684ac66e0b67b6f97bc8422840cade6");
                }
                if (g.this.r().m && t.a(g.this.r().g)) {
                    c0751a2.c = g.this.l().getString(R.string.wm_sc_please_select_medical_user);
                    c0751a2.a = true;
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7feee5c087c2bdeaa34ecbb94ab4370a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7feee5c087c2bdeaa34ecbb94ab4370a");
            return;
        }
        super.I();
        a(0, com.sankuai.shangou.stone.util.h.a(l(), 7.0f), 0, 0);
        r().b(ExpInfo.getExpName(((com.sankuai.waimai.business.order.api.confirm.block.a) F()).j().a(), 15));
        final com.sankuai.waimai.store.order.prescription.view.f fVar = (com.sankuai.waimai.store.order.prescription.view.f) this.g;
        OrderRecipeInfo e = ((com.sankuai.waimai.store.order.prescription.model.d) this.n).e();
        Long l = ((com.sankuai.waimai.business.order.api.confirm.block.a) F()).i().a().b;
        Object[] objArr2 = {e, l};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.prescription.view.f.d;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "1917c6f9aa2b50279e4880d7a5a4aad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "1917c6f9aa2b50279e4880d7a5a4aad5");
        } else if (e == null || e.prescriptionTemplate == null || e.prescriptionTemplate.inquiry == null) {
            fVar.a().setVisibility(8);
        } else {
            fVar.m = true;
            fVar.h = l;
            PrescriptionTemplate prescriptionTemplate = e.prescriptionTemplate;
            if (prescriptionTemplate != null) {
                u.a(fVar.e, prescriptionTemplate.prescriptionTip);
                fVar.a(prescriptionTemplate.inquiry);
                fVar.a(prescriptionTemplate.medicalUser);
                final String str = prescriptionTemplate.prescriptionIntroduceUrl;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.prescription.view.f.d;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "55e01419e4210bd7df3ed08ff996c2b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "55e01419e4210bd7df3ed08ff996c2b3");
                } else {
                    fVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.prescription.view.f.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4a43808d8991e9cbfdaccb987d086a61", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4a43808d8991e9cbfdaccb987d086a61");
                            } else if (t.a(str)) {
                            } else {
                                com.sankuai.waimai.store.router.d.a(f.this.c, str);
                            }
                        }
                    });
                }
            }
            fVar.l = e.foodList;
            fVar.a("b_waimai_j733itdr_mv", (Map<String, Object>) null);
        }
    }
}
