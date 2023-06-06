package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugOrderConfirmPoiCouponMrnReactPackage implements MRNReactPackageInterface {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.shell.MRNReactPackageInterface
    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d152093367c1cc79f32dbab02be009b5", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d152093367c1cc79f32dbab02be009b5") : Collections.singletonList(new i() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.rn.DrugOrderConfirmPoiCouponMrnReactPackage.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d4325f06790db953d71a3eaaf883203", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d4325f06790db953d71a3eaaf883203") : Collections.singletonList(new CouponPopupCallbackModule(reactApplicationContext));
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "434265fcb5feb62d769dbf89ec976456", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "434265fcb5feb62d769dbf89ec976456") : Collections.emptyList();
            }
        });
    }
}
