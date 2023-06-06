package com.meituan.android.legwork.mrn.bridge;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EnvironmentBridgeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BMLWEnvironment";
    }

    public EnvironmentBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f399b5ada188b8d03ea2fa7d9df8f9d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f399b5ada188b8d03ea2fa7d9df8f9d5");
        }
    }

    @ReactMethod
    public void fetchRealtimeEnvironment(Promise promise) {
        String str;
        boolean isAddressInfoDegrade;
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d0223c4a6704b2b467b5e7117f424fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d0223c4a6704b2b467b5e7117f424fe");
            return;
        }
        x.c("EnvironmentBridgeModule.fetchRealtimeEnvironment()", "调用桥fetchRealtimeEnvironment");
        Map<String, String> a = com.meituan.android.legwork.net.util.a.a();
        HashMap hashMap = new HashMap(a.size());
        for (Map.Entry<String, String> entry : a.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        com.meituan.android.legwork.statistics.a.a(hashMap);
        com.meituan.android.legwork.statistics.a.b(hashMap);
        try {
            JSONObject jSONObject = new JSONObject();
            com.meituan.android.legwork.utils.b.a().a(jSONObject);
            hashMap.put("abtestinfo", Arguments.makeNativeMap((Map) new Gson().fromJson(jSONObject.toString(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.legwork.mrn.bridge.EnvironmentBridgeModule.1
            }.getType())));
        } catch (Exception e) {
            x.e("EnvironmentBridgeModule.fetchRealtimeEnvironment()", "exception msg:", e);
            x.a(e);
        }
        com.meituan.android.legwork.common.hostInfo.b.e();
        hashMap.put("ctype", com.meituan.android.legwork.common.hostInfo.b.h());
        hashMap.put("customPushtoken", com.meituan.android.legwork.common.hostInfo.b.e().b());
        hashMap.put("token", com.meituan.android.legwork.common.user.a.a().f());
        com.meituan.android.legwork.utils.b a2 = com.meituan.android.legwork.utils.b.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.utils.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "fb1e2dd35d62b2ec0b3d55e93420efd6", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "fb1e2dd35d62b2ec0b3d55e93420efd6");
        } else {
            str = (a2.d == null || TextUtils.isEmpty(a2.d.get("address_page_map"))) ? ErrorCode.ERROR_TYPE_B : a2.d.get("address_page_map");
        }
        hashMap.put("address_page_map", str);
        com.meituan.android.legwork.common.util.a a3 = com.meituan.android.legwork.common.util.a.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.legwork.common.util.a.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect4, false, "6f1250c1b0d60e5915ef8d05bbaa811e", RobustBitConfig.DEFAULT_VALUE)) {
            isAddressInfoDegrade = ((Boolean) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect4, false, "6f1250c1b0d60e5915ef8d05bbaa811e")).booleanValue();
        } else {
            isAddressInfoDegrade = a3.b != null ? a3.b.isAddressInfoDegrade() : true;
        }
        hashMap.put("isAddressInfoDegrade", Boolean.valueOf(isAddressInfoDegrade));
        x.c("EnvironmentBridgeModule.fetchRealtimeEnvironment()", "桥返回结果：" + hashMap.toString());
        promise.resolve(Arguments.makeNativeMap(hashMap));
    }

    @ReactMethod
    public void fetchFingerPrint(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d63925b982ef4873ee37e4b232c074d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d63925b982ef4873ee37e4b232c074d1");
            return;
        }
        x.c("EnvironmentBridgeModule.fetchFingerPrint()", "调用桥fetchFingerPrint");
        HashMap hashMap = new HashMap(2);
        hashMap.put(FingerprintManager.TAG, com.meituan.android.legwork.common.hostInfo.b.e().g());
        x.c("EnvironmentBridgeModule.fetchFingerPrint()", "桥返回结果：" + hashMap.toString());
        promise.resolve(Arguments.makeNativeMap(hashMap));
    }
}
