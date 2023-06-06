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
import com.sankuai.waimai.store.config.drug.DrugConfigPath;
import com.sankuai.waimai.store.config.j;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGApiEnvModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNAPIEnv";
    }

    public SGApiEnvModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21d8bd6b4f59d83cd362fd5c48a0a0d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21d8bd6b4f59d83cd362fd5c48a0a0d7");
        }
    }

    @ReactMethod
    public void getAPIEnv(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1e2a3bf2f02f965fc6624e5f3bce31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1e2a3bf2f02f965fc6624e5f3bce31f");
            return;
        }
        try {
            String b = com.sankuai.waimai.store.base.net.sg.c.a().b();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("APIEnv", b);
            promise.resolve(createMap);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void getWMApiHost(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a441533f44b962d5ceb536d1ab8b9e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a441533f44b962d5ceb536d1ab8b9e70");
            return;
        }
        try {
            String a = com.sankuai.meituan.switchtestenv.a.a(com.sankuai.waimai.store.util.b.a(), new com.sankuai.waimai.store.base.net.wm.b().b());
            WritableMap createMap = Arguments.createMap();
            createMap.putString("wmApiHost", a);
            promise.resolve(createMap);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void getSGApiHost(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db2106800ace9cbf1496823fe7afc0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db2106800ace9cbf1496823fe7afc0d4");
            return;
        }
        try {
            String a = com.sankuai.meituan.switchtestenv.a.a(com.sankuai.waimai.store.util.b.a(), "http://scapi.waimai.meituan.com");
            WritableMap createMap = Arguments.createMap();
            createMap.putString("sgApiHost", a);
            promise.resolve(createMap);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void getDrugApiHost(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71aa9a5e6123d1eb8528f783ef97a55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71aa9a5e6123d1eb8528f783ef97a55b");
            return;
        }
        try {
            if (j.h().a(DrugConfigPath.DRUG_API_SWITCH, true)) {
                String a = com.sankuai.meituan.switchtestenv.a.a(com.sankuai.waimai.store.util.b.a(), "http://hcapi.waimai.meituan.com");
                WritableMap createMap = Arguments.createMap();
                createMap.putString("drugApiHost", a);
                promise.resolve(createMap);
                return;
            }
            getSGApiHost(promise);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0f0008dc33a88f4892ae662e7e09b9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0f0008dc33a88f4892ae662e7e09b9c");
        }
        String b = com.sankuai.waimai.store.base.net.sg.c.a().b();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("APIEnv", b);
        return createMap.toHashMap();
    }
}
