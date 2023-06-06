package com.sankuai.waimai.drug.order.confirm.rocks.medicareway;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.action.c;
import com.meituan.android.cube.pga.action.d;
import com.meituan.android.cube.pga.block.b;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.confirm.block.a;
import com.sankuai.waimai.business.order.api.pay.a;
import com.sankuai.waimai.drug.order.confirm.model.mach.MedicarePayInfo;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"drug_order_confirm_medicare_way_style_1"}, viewModel = C0940a.class)
/* loaded from: classes4.dex */
public class a extends b<C0940a, com.sankuai.waimai.business.order.api.confirm.block.a> implements a.InterfaceC0754a {
    public static ChangeQuickRedirect f;
    private com.sankuai.waimai.business.order.api.pay.a g;
    private String h;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ C0940a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90c4f5f81ff599fd947f8c8eefc8223f", RobustBitConfig.DEFAULT_VALUE) ? (C0940a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90c4f5f81ff599fd947f8c8eefc8223f") : new C0940a();
    }

    public a(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cde88c94f40bc43cebae206d8876e70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cde88c94f40bc43cebae206d8876e70");
        } else {
            this.h = String.valueOf(System.currentTimeMillis());
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2045a18cf14eb136ffc6aba03bfe5acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2045a18cf14eb136ffc6aba03bfe5acf");
            return;
        }
        super.s();
        F().q().a(new c<a.C0751a, Boolean>() { // from class: com.sankuai.waimai.drug.order.confirm.rocks.medicareway.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ Boolean a(a.C0751a c0751a) {
                a.C0751a c0751a2 = c0751a;
                Object[] objArr2 = {c0751a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40888877063c17111fdb70c339d36623", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40888877063c17111fdb70c339d36623");
                }
                MedicarePayInfo medicarePayInfo = ((C0940a) a.this.n).p;
                if (medicarePayInfo == null || TextUtils.isEmpty(medicarePayInfo.payWayScheme) || !medicarePayInfo.usePayWayPop) {
                    return Boolean.TRUE;
                }
                if (c0751a2 != null) {
                    c0751a2.a = true;
                }
                com.sankuai.waimai.foundation.router.a.a().a(new e() { // from class: com.sankuai.waimai.drug.order.confirm.rocks.medicareway.a.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.router.core.e
                    public final void a(@NonNull j jVar) {
                    }

                    @Override // com.sankuai.waimai.router.core.e
                    public final void a(@NonNull j jVar, int i) {
                        Object[] objArr3 = {jVar, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "06fa8cb4ba72378e70e9cdb8b577824c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "06fa8cb4ba72378e70e9cdb8b577824c");
                        } else {
                            a.this.b(new JSONObject());
                        }
                    }
                }).a(a.this.m(), af.a(Uri.parse(medicarePayInfo.payWayScheme), MedicarePayInfo.MEDICARE_UNIQUE_KEY, a.this.h).toString());
                return Boolean.FALSE;
            }
        });
        F().v().b = new d() { // from class: com.sankuai.waimai.drug.order.confirm.rocks.medicareway.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0d591a7db90729dd870c24806724295", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0d591a7db90729dd870c24806724295");
                }
                MedicarePayInfo medicarePayInfo = ((C0940a) a.this.n).p;
                if (medicarePayInfo == null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(medicarePayInfo.isFromMeidicare);
            }
        };
        F().w().a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.drug.order.confirm.rocks.medicareway.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb949b041c094e9c4c53866c14b82dcc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb949b041c094e9c4c53866c14b82dcc");
                    return;
                }
                MedicarePayInfo medicarePayInfo = ((C0940a) a.this.n).p;
                if (medicarePayInfo != null) {
                    medicarePayInfo.isFromMeidicare = false;
                }
            }
        });
        this.g = new com.sankuai.waimai.drug.order.confirm.mrn.a();
        this.g.a(this);
    }

    @Override // com.sankuai.waimai.business.order.api.pay.a.InterfaceC0754a
    @NonNull
    public final Context aT_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fcd2d10d4d84de0e004e3d980f3fb6", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fcd2d10d4d84de0e004e3d980f3fb6") : m();
    }

    @Override // com.sankuai.waimai.business.order.api.pay.a.InterfaceC0754a
    public final void a(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c7624f5d45c06999f04a9d934baa6d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c7624f5d45c06999f04a9d934baa6d2");
        } else if (TextUtils.equals(jSONObject.optString(MedicarePayInfo.MEDICARE_UNIQUE_KEY), this.h)) {
            b(jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d730ae49b0b2078e40c70848ca63ec4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d730ae49b0b2078e40c70848ca63ec4f");
            return;
        }
        MedicarePayInfo medicarePayInfo = ((C0940a) this.n).p;
        if (medicarePayInfo != null) {
            medicarePayInfo.isFromMeidicare = true;
            medicarePayInfo.usePayWayPop = false;
        }
        c(jSONObject);
        if (medicarePayInfo != null) {
            medicarePayInfo.usePayWayPop = !TextUtils.isEmpty(medicarePayInfo.payWayScheme);
        }
    }

    private void c(@NonNull JSONObject jSONObject) {
        String str;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7311e243c2e14e00335d656d177d5811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7311e243c2e14e00335d656d177d5811");
        } else if (((C0940a) this.n).p == null) {
        } else {
            try {
                str = new JSONObject(jSONObject.optString(MedicarePayInfo.EXTRA)).optString(MedicarePayInfo.MACH_TEMPLATE_CALLBACK_INFO);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                str = "";
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("medical_insurance_order", str);
            hashMap.put("model_input_map", hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("submitData", hashMap);
            hashMap3.put("isUpdate", 2);
            F().p().a((com.meituan.android.cube.pga.common.b<i.c<Integer, Map<String, Object>>>) i.a(1, hashMap3));
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0133961694d59eb8d8d90014a7944e1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0133961694d59eb8d8d90014a7944e1e");
            return;
        }
        super.bE_();
        if (this.g != null) {
            this.g.b(this);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.order.confirm.rocks.medicareway.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0940a extends com.meituan.android.cube.pga.viewmodel.a<HashMap<String, Object>> {
        public static ChangeQuickRedirect o;
        MedicarePayInfo p;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "278a8308138f49d6933648c31d441309", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "278a8308138f49d6933648c31d441309");
                return;
            }
            super.d();
            if (e() != null) {
                this.p = new MedicarePayInfo();
                if (e().get("pay_scheme") != null) {
                    this.p.payWayScheme = String.valueOf(e().get("pay_scheme"));
                    this.p.usePayWayPop = !TextUtils.isEmpty(this.p.payWayScheme);
                }
            }
        }
    }
}
