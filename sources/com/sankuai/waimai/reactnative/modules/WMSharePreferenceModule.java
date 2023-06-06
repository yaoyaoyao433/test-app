package com.sankuai.waimai.reactnative.modules;

import android.content.Context;
import android.support.annotation.Keep;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WMSharePreferenceModule extends ReactContextBaseJavaModule {
    public static final int TYPE_ARRAY = 6;
    public static final int TYPE_BOOL = 1;
    public static final int TYPE_DOUBLE = 4;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_INT = 0;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_MAP = 7;
    public static final int TYPE_STRING = 5;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMPreferenceStorage";
    }

    public WMSharePreferenceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c422c6bc302dd80f9f750a0ca0af5d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c422c6bc302dd80f9f750a0ca0af5d0");
        }
    }

    @ReactMethod
    public void setStorage(ReadableMap readableMap, Promise promise) {
        boolean z = true;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74fbf2df5e287e9ef85bdca82f6a34be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74fbf2df5e287e9ef85bdca82f6a34be");
            return;
        }
        try {
            String string = readableMap.getString("key");
            switch (readableMap.getInt("dataType")) {
                case 0:
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) getReactApplicationContext(), string, Integer.parseInt(readableMap.getString("value")));
                    break;
                case 1:
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(getReactApplicationContext(), string, readableMap.getBoolean("value"));
                    break;
                case 2:
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) getReactApplicationContext(), string, Long.parseLong(readableMap.getString("value")));
                    break;
                case 3:
                    String string2 = readableMap.getString("value");
                    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                    float parseFloat = Float.parseFloat(string2);
                    Object[] objArr2 = {reactApplicationContext, string, Float.valueOf(parseFloat)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.a;
                    if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "684e63ad43868e4ddcf51fb829954923", RobustBitConfig.DEFAULT_VALUE)) {
                        if (reactApplicationContext != null) {
                            q.a(reactApplicationContext, "waimai_takeout", 1).a(string, parseFloat);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "684e63ad43868e4ddcf51fb829954923");
                        break;
                    }
                    break;
                case 4:
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(getReactApplicationContext(), string, Double.parseDouble(readableMap.getString("value")));
                    break;
                case 5:
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) getReactApplicationContext(), string, readableMap.getString("value"));
                    break;
                case 6:
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) getReactApplicationContext(), string, readableMap.getString("value"));
                    break;
                case 7:
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) getReactApplicationContext(), string, readableMap.getString("value"));
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                promise.resolve("store success");
            } else {
                promise.reject("store fail");
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void getStorage(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48e115fef1d17194ffbeecdcd490b01b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48e115fef1d17194ffbeecdcd490b01b");
            return;
        }
        try {
            String string = readableMap.getString("key");
            switch (readableMap.getInt("dataType")) {
                case 0:
                    promise.resolve(Integer.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) getReactApplicationContext(), string, -1)));
                    return;
                case 1:
                    promise.resolve(Boolean.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) getReactApplicationContext(), string, false)));
                    return;
                case 2:
                    promise.resolve(Long.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) getReactApplicationContext(), string, -1L)));
                    return;
                case 3:
                    promise.resolve(Float.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) getReactApplicationContext(), string, -1.0f)));
                    return;
                case 4:
                    promise.resolve(Double.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) getReactApplicationContext(), string, -1.0d)));
                    return;
                case 5:
                    promise.resolve(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(getReactApplicationContext(), string, ""));
                    return;
                case 6:
                    promise.resolve(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(getReactApplicationContext(), string, ""));
                    return;
                case 7:
                    promise.resolve(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(getReactApplicationContext(), string, ""));
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void removeStorage(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c61edbc2b8b669a6ee8cea010cd0c30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c61edbc2b8b669a6ee8cea010cd0c30");
            return;
        }
        try {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(getReactApplicationContext(), readableMap.getString("key"));
            promise.resolve("remove success");
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
