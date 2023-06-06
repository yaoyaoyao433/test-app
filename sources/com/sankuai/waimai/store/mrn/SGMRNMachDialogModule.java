package com.sankuai.waimai.store.mrn;

import android.app.Activity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.store.base.SGDialogMachContainer;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNMachDialogModule extends ReactContextBaseJavaModule {
    private static final String EVENT_NAME_MACH = "ReceiveCouponSuccess";
    private static final String EVENT_NAME_MRN = "MachDialogReceiveCouponSuccess";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "SMMRNMachDialog";
    }

    public SGMRNMachDialogModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c2a5a3dedd082535b8eba07003f4c78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c2a5a3dedd082535b8eba07003f4c78");
        }
    }

    @ReactMethod
    public void showMachDialog(final String str, final String str2, final String str3, final Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be521558a09b41897fdbb372b0827a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be521558a09b41897fdbb372b0827a5f");
            return;
        }
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        ad.c(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGMRNMachDialogModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "10d396a50a0faaf727941e4532697ef6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "10d396a50a0faaf727941e4532697ef6");
                } else if (!t.a(str2) && !t.a(str3)) {
                    Activity currentActivity = SGMRNMachDialogModule.this.getCurrentActivity();
                    if (currentActivity != null && !currentActivity.isFinishing() && !currentActivity.isDestroyed()) {
                        SGDialogMachContainer sGDialogMachContainer = new SGDialogMachContainer(currentActivity, str);
                        sGDialogMachContainer.b = new com.sankuai.waimai.store.mach.event.b() { // from class: com.sankuai.waimai.store.mrn.SGMRNMachDialogModule.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.mach.event.b
                            public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str4, Map<String, Object> map) {
                                Object[] objArr3 = {aVar, str4, map};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1ac402ab617e1ee43968ec2c5fd1f4b3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1ac402ab617e1ee43968ec2c5fd1f4b3");
                                    return;
                                }
                                Object obj = map.get("couponId");
                                if (!SGMRNMachDialogModule.EVENT_NAME_MACH.equals(str4) || obj == null) {
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("couponId", obj.toString());
                                com.sankuai.waimai.store.mrn.shopcartbridge.a.a(reactApplicationContext, SGMRNMachDialogModule.EVENT_NAME_MRN, createMap);
                            }
                        };
                        if (sGDialogMachContainer.a(str2, str3)) {
                            sGDialogMachContainer.show();
                            d.a(promise);
                            return;
                        }
                        d.a(promise, new Exception("SMMRNMachDialog:SGDialogMachContainer prepareToShow fail"));
                        return;
                    }
                    d.a(promise, new Exception("SMMRNMachDialog:Invalid Activity"));
                } else {
                    d.a(promise, new Exception("SMMRNMachDialog:Mach data error"));
                }
            }
        });
    }
}
