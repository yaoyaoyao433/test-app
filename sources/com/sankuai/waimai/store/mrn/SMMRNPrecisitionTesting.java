package com.sankuai.waimai.store.mrn;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.i;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SMMRNPrecisitionTesting extends ReactContextBaseJavaModule {
    private static final String NAME = "SMMRNPrecisitionTesting";
    private static final String REQUEST_TAG = "SMMRNPrecisitionTesting";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public final String getName() {
        return "SMMRNPrecisitionTesting";
    }

    public SMMRNPrecisitionTesting(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d7f8492c8ab64eb128c99cfb6832a53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d7f8492c8ab64eb128c99cfb6832a53");
        }
    }

    @ReactMethod
    public final void analyzeBridgeDependencies(ReadableMap readableMap, Promise promise) {
        char c;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b9fada09646cf4d2194df760759fe3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b9fada09646cf4d2194df760759fe3e");
            return;
        }
        HashMap<String, Object> hashMap = readableMap.getMap("native_map").toHashMap();
        ReadableArray array = readableMap.getArray("bridge_cases");
        HashMap hashMap2 = new HashMap();
        LinkedList linkedList = new LinkedList();
        int size = array.size();
        for (int i = 0; i < size; i++) {
            HashMap<String, Object> hashMap3 = array.getMap(i).toHashMap();
            try {
                String lowerCase = (hashMap3.containsKey("npm_package") ? (String) hashMap3.get("npm_package") : "").toLowerCase();
                switch (lowerCase.hashCode()) {
                    case -2078007027:
                        if (lowerCase.equals("@mrn-utils")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -887328209:
                        if (lowerCase.equals("system")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -627072996:
                        if (lowerCase.equals("@mrn/flashbuy-common")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 821076501:
                        if (lowerCase.equals("@mrn/mrn-knb")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1069524816:
                        if (lowerCase.equals("NativeModules")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    locateKNB(hashMap2, linkedList, hashMap3);
                } else {
                    locateOthers(hashMap2, linkedList, hashMap, hashMap3);
                }
            } catch (Exception unused) {
                linkedList.add(hashMap3);
            }
        }
        HashMap hashMap4 = new HashMap();
        hashMap4.put("bridge_map", hashMap2);
        hashMap4.put("error_bridges", linkedList);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("data", i.a(hashMap4));
        promise.resolve(createMap);
    }

    private NativeModule findModuleBy(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70d1dfc5dc9dbc678f962e70fa3f77b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70d1dfc5dc9dbc678f962e70fa3f77b6");
        }
        try {
            return getReactApplicationContext().getCatalystInstance().getNativeModule(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void locateKNB(Map<String, String> map, List<Map<String, Object>> list, Map<String, Object> map2) throws Exception {
        BaseJsHandler baseJsHandler;
        Object[] objArr = {map, list, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4e6ac52d393a09d7f39315e3a6c54ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4e6ac52d393a09d7f39315e3a6c54ae");
            return;
        }
        String str = (String) map2.get("case_name");
        map2.get("npm_package");
        String str2 = (String) map2.get("case_id");
        String str3 = (String) Class.forName("com.dianping.titans.js.JsHandlerFactory").getMethod("getRegisterJsHandlerName", String.class).invoke(null, str);
        if (t.a(str3) && (baseJsHandler = (BaseJsHandler) com.sankuai.shangou.stone.util.a.a((List<Object>) com.sankuai.meituan.serviceloader.b.a(BaseJsHandler.class, str), 0)) != null) {
            str3 = baseJsHandler.getClass().getName();
        }
        if (!t.a(str3)) {
            map.put(str2, str3);
        } else {
            list.add(map2);
        }
    }

    private void locateOthers(Map<String, String> map, List<Map<String, Object>> list, Map<String, Object> map2, Map<String, Object> map3) throws Exception {
        String str;
        String str2;
        Method[] methods;
        NativeModule findModuleBy;
        Object[] objArr = {map, list, map2, map3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50e8c75726923d82229285f417da85f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50e8c75726923d82229285f417da85f3");
            return;
        }
        CatalystInstance catalystInstance = getReactApplicationContext().getCatalystInstance();
        String str3 = (String) map3.get("case_id");
        String[] split = ((String) map3.get("case_name")).split("\\.");
        if (split == null || split.length <= 0) {
            list.add(map3);
            return;
        }
        if (split.length > 1) {
            str = split[0];
            str2 = split[1];
        } else {
            str = split[0];
            str2 = str;
        }
        NativeModule findModuleBy2 = findModuleBy(str);
        if (findModuleBy2 != null) {
            map.put(str3, findModuleBy2.getClass().getName());
            return;
        }
        String str4 = (String) map2.get(str);
        if (!t.a(str4) && (findModuleBy = findModuleBy(str4)) != null) {
            map.put(str3, findModuleBy.getClass().getName());
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (NativeModule nativeModule : catalystInstance.getNativeModules()) {
            for (Method method : Class.forName(nativeModule.getClass().getName()).getMethods()) {
                if (method.getName().equals(str2) && method.getAnnotation(ReactMethod.class) != null) {
                    linkedList.add(nativeModule.getClass().getName());
                }
            }
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) linkedList)) {
            map.put(str3, com.sankuai.shangou.stone.util.a.a((List<Object>) linkedList, 0));
        } else {
            list.add(map3);
        }
    }
}
