package com.sankuai.waimai.bussiness.order.confirm.coupon.rn;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderConfirmSelectCouponMrnReactPackage implements MRNReactPackageInterface {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.shell.MRNReactPackageInterface
    public final List<i> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8eafc5de1ec3e0b6fe56a32999f8f8c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8eafc5de1ec3e0b6fe56a32999f8f8c") : Collections.singletonList(new i() { // from class: com.sankuai.waimai.bussiness.order.confirm.coupon.rn.OrderConfirmSelectCouponMrnReactPackage.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e39495e27d88272dd2f64b4c9babba3", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e39495e27d88272dd2f64b4c9babba3") : Arrays.asList(new WMRNCouponConvertManager(reactApplicationContext), new CouponPopupCallbackModule(reactApplicationContext));
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ffc2afa7045d9991c72b58f0a9a679a", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ffc2afa7045d9991c72b58f0a9a679a") : Collections.singletonList(new WMMRNGrayImageViewManager());
            }
        });
    }
}
