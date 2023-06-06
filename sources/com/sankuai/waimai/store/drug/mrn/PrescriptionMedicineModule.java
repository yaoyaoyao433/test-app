package com.sankuai.waimai.store.drug.mrn;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.net.c;
import com.sankuai.waimai.store.manager.order.b;
import com.sankuai.waimai.store.util.al;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PrescriptionMedicineModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mVolleyTAG;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PrescriptionMedicineModule";
    }

    public PrescriptionMedicineModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bb43d66bd65165e2f59646c8a1f8743", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bb43d66bd65165e2f59646c8a1f8743");
        }
    }

    @ReactMethod
    public void goPreviewPage(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbac7a03d6b928b12ec42c5363ece257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbac7a03d6b928b12ec42c5363ece257");
            return;
        }
        String string = readableMap.getString("submitData");
        String string2 = readableMap.getString("poiId");
        String string3 = readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) ? readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return;
        }
        d.a aVar = new d.a();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        aVar.b = currentActivity;
        aVar.f = getVolleyTAG();
        aVar.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
        aVar.j = false;
        aVar.g = "from_sc_restaurant";
        d.a a = aVar.a(r.a(string2, 0L));
        a.c = string3;
        a.i = 3;
        d a2 = aVar.a();
        Object[] objArr2 = {a2, string};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "41caeac9dfd2a8db8e0bf6e5a3589e7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "41caeac9dfd2a8db8e0bf6e5a3589e7f");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "bfb437090910a5581e9e8290cc16ffef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "bfb437090910a5581e9e8290cc16ffef")).booleanValue() : com.sankuai.waimai.store.config.d.h().a("order/scheme_order_confirm", true)) {
            b.a(a2, 2, string);
        } else {
            ((ISubmitOrderManager) com.sankuai.waimai.router.a.a(ISubmitOrderManager.class, "IOrderSubmitService")).rxInquiryPreOrder(a2, string);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1203332f7aacd40c154ba5905ad0b5bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1203332f7aacd40c154ba5905ad0b5bd");
            return;
        }
        al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.PrescriptionMedicineModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a4368d8bf79eaf526013dfd90de8b222", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a4368d8bf79eaf526013dfd90de8b222");
                    return;
                }
                al.cancel(PrescriptionMedicineModule.this.getVolleyTAG());
                c.a(PrescriptionMedicineModule.this.getVolleyTAG());
            }
        }, getVolleyTAG());
        super.onCatalystInstanceDestroy();
    }

    public String getVolleyTAG() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79993e8cbae734004324ba760f855c16", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79993e8cbae734004324ba760f855c16");
        }
        if (!TextUtils.isEmpty(this.mVolleyTAG)) {
            return this.mVolleyTAG;
        }
        this.mVolleyTAG = getClass().getSimpleName() + System.currentTimeMillis();
        return this.mVolleyTAG;
    }
}
