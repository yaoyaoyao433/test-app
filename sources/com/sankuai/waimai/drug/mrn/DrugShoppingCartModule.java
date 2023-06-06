package com.sankuai.waimai.drug.mrn;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.mrn.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugShoppingCartModule extends ReactContextBaseJavaModule {
    private static final String TAG = "com.sankuai.waimai.drug.mrn.DrugShoppingCartModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MEDMRNShoppingCart";
    }

    public DrugShoppingCartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5be9a0dee1435b2b0b733d1ee74a8ab2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5be9a0dee1435b2b0b733d1ee74a8ab2");
        }
    }

    @ReactMethod
    public void getPoiListAddedGoodsNum(ReadableArray readableArray, Promise promise) {
        Object[] objArr = {readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cde2ae3792316e99e43e9a07c9a0ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cde2ae3792316e99e43e9a07c9a0ec5");
            return;
        }
        try {
            if (readableArray == null) {
                throw new IllegalArgumentException("poiIds为null");
            }
            if (readableArray.size() == 0) {
                throw new IllegalArgumentException("poiIds长度为0");
            }
            WritableArray createArray = Arguments.createArray();
            for (int i = 0; i < readableArray.size(); i++) {
                if (readableArray.getType(0) != ReadableType.String) {
                    throw new IllegalArgumentException("poiIds(" + i + ")类型不是String");
                } else if (readableArray.getString(i) == null) {
                    throw new IllegalArgumentException("poiIds(" + i + ")为null");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("poi_id", readableArray.getString(i));
                    createMap.putInt("total", com.sankuai.waimai.store.order.a.e().f(Long.parseLong(readableArray.getString(i))));
                    createArray.pushMap(createMap);
                }
            }
            promise.resolve(createArray);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void getPoiListAddedGoodsNumNew(ReadableArray readableArray, Promise promise) {
        Object[] objArr = {readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20723aa246dcfd50cccf0e4c6dd1ba3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20723aa246dcfd50cccf0e4c6dd1ba3d");
            return;
        }
        try {
            if (readableArray == null) {
                throw new IllegalArgumentException("poiIdStrs为null");
            }
            if (readableArray.size() == 0) {
                throw new IllegalArgumentException("poiIdStrs长度为0");
            }
            WritableArray createArray = Arguments.createArray();
            for (int i = 0; i < readableArray.size(); i++) {
                if (readableArray.getType(0) != ReadableType.String) {
                    throw new IllegalArgumentException("poiIdStrs(" + i + ")类型不是String");
                } else if (readableArray.getString(i) == null) {
                    throw new IllegalArgumentException("poiIdStrs(" + i + ")为null");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, readableArray.getString(i));
                    createMap.putInt("total", com.sankuai.waimai.store.order.a.e().a(readableArray.getString(i)));
                    createArray.pushMap(createMap);
                }
            }
            promise.resolve(createArray);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    private String getOfficialPoiId(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03e553b1145446bbca6e66e67b08f171", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03e553b1145446bbca6e66e67b08f171") : !t.a(str2) ? str2 : str;
    }

    private static String getStringFromReadableMap(ReadableMap readableMap, @NonNull String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42a4a7f0aeecb383e50fa0a18d93330b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42a4a7f0aeecb383e50fa0a18d93330b") : readableMap.hasKey(str) ? readableMap.getString(str) : "";
    }
}
