package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGCalculatePriceModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNCalculatePrice";
    }

    public SGCalculatePriceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99a0f1b42d3c0a26c82041101ffa342f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99a0f1b42d3c0a26c82041101ffa342f");
        }
    }

    @ReactMethod
    public void calculatePriceWithoutPulsDiscountInShoppingCart(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "324ead43904bb1efdf1dca2d68215ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "324ead43904bb1efdf1dca2d68215ea8");
            return;
        }
        a a = b.a(str);
        if (a == null) {
            d.a(promise, null);
            return;
        }
        try {
            onSuccess(com.sankuai.waimai.store.order.a.e().k(a.a()).g.mThresholdPrice, promise);
        } catch (Exception e) {
            d.a(promise, e);
            com.dianping.judas.util.a.a(e);
        }
    }

    @ReactMethod
    public void pulsDiscountThresholdPrice(String str, Promise promise) {
        boolean z;
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "141d8bfc3edb844857e3ab82f9f3a1a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "141d8bfc3edb844857e3ab82f9f3a1a2");
            return;
        }
        a a = b.a(str);
        if (a == null) {
            d.a(promise, null);
            return;
        }
        try {
            com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(a.a());
            if (l != null) {
                PoiShoppingCart.ActivityInfo q = l.q();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a;
                if (PatchProxy.isSupport(objArr2, l, changeQuickRedirect3, false, "77c06c534c20debdf42c2fe67ceb03f2", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, l, changeQuickRedirect3, false, "77c06c534c20debdf42c2fe67ceb03f2")).booleanValue();
                } else {
                    PoiShoppingCart.ActivityInfo q2 = l.q();
                    z = (q2 == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) q2.policy) || q2.policy.get(0) == null) ? false : true;
                }
                onSuccess(z ? q.policy.get(0).priceLower : 0.0d, promise);
            }
        } catch (Exception e) {
            d.a(promise, e);
            com.dianping.judas.util.a.a(e);
        }
    }

    private void onSuccess(double d, Promise promise) {
        Object[] objArr = {Double.valueOf(d), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e29a49c3a203efaf477686b509cbf309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e29a49c3a203efaf477686b509cbf309");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("price", d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("data", createMap);
        promise.resolve(createMap2);
    }
}
