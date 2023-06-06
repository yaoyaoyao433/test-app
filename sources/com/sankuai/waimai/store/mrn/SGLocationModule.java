package com.sankuai.waimai.store.mrn;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGLocationModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNLocation";
    }

    public SGLocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "615804c2d71d5d0f9aa4a31dc4522d5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "615804c2d71d5d0f9aa4a31dc4522d5c");
        }
    }

    @ReactMethod
    public void getCurrentLocation(boolean z, final Promise promise) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55982fb28ecb90840901304a3a427ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55982fb28ecb90840901304a3a427ab6");
            return;
        }
        try {
            WMLocation b = com.sankuai.waimai.store.locate.a.b();
            if (b != null && !z) {
                resolve(com.sankuai.waimai.store.locate.a.d(), b, promise);
                return;
            }
            com.sankuai.waimai.store.locate.a.a(getCurrentActivity(), new com.sankuai.waimai.store.i.locate.a() { // from class: com.sankuai.waimai.store.mrn.SGLocationModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.i.locate.a
                public final void a(boolean z2, String str, WMLocation wMLocation) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str, wMLocation};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "44086674aac26c6f29aa65cc36273d63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "44086674aac26c6f29aa65cc36273d63");
                    } else if (z2) {
                        SGLocationModule.this.resolve(str, wMLocation, promise);
                    } else {
                        d.a(promise, new IllegalStateException("没有定位信息"));
                    }
                }
            }, true);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void getCurrentLocationWithBusinessId(boolean z, String str, final Promise promise) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b2d37b9680ab82bb18b6f6bdcf1d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b2d37b9680ab82bb18b6f6bdcf1d53");
            return;
        }
        try {
            WMLocation b = com.sankuai.waimai.store.locate.a.b();
            if (b != null && !z) {
                resolve(com.sankuai.waimai.store.locate.a.d(), b, promise);
                return;
            }
            com.sankuai.waimai.store.locate.a.a(getCurrentActivity(), str, new com.sankuai.waimai.store.i.locate.a() { // from class: com.sankuai.waimai.store.mrn.SGLocationModule.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.i.locate.a
                public final void a(boolean z2, String str2, WMLocation wMLocation) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, wMLocation};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1761c32ebcda3ff5ad23b54c35971ce0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1761c32ebcda3ff5ad23b54c35971ce0");
                    } else if (z2) {
                        SGLocationModule.this.resolve(str2, wMLocation, promise);
                    } else {
                        d.a(promise, new IllegalStateException("没有定位信息"));
                    }
                }
            }, true);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolve(String str, WMLocation wMLocation, @NonNull Promise promise) {
        Object[] objArr = {str, wMLocation, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93b0972cd4be270d95c2d17a7b0c39de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93b0972cd4be270d95c2d17a7b0c39de");
        } else if (wMLocation == null) {
            throw new IllegalStateException("没有定位信息");
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putString(GearsLocator.ADDRESS, str);
            createMap.putDouble(Constants.PRIVACY.KEY_LATITUDE, wMLocation.getLatitude());
            createMap.putDouble(Constants.PRIVACY.KEY_LONGITUDE, wMLocation.getLongitude());
            promise.resolve(createMap);
        }
    }

    @ReactMethod
    public void setCurrentLocation(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71a3c93dd31f0a95511c7eb940bec284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71a3c93dd31f0a95511c7eb940bec284");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        createMap.putString("message", "success");
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90797c06c5dae556bb4230347927f090", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90797c06c5dae556bb4230347927f090");
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString(GearsLocator.ADDRESS, com.sankuai.waimai.store.locate.a.d());
        WMLocation b = com.sankuai.waimai.store.locate.a.b();
        if (b != null) {
            createMap.putDouble(Constants.PRIVACY.KEY_LATITUDE, b.getLatitude());
            createMap.putDouble(Constants.PRIVACY.KEY_LONGITUDE, b.getLongitude());
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("currentLocation", createMap);
        return createMap2.toHashMap();
    }
}
