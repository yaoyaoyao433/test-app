package com.meituan.android.mrn.module;

import com.facebook.common.logging.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.gson.JsonObject;
import com.meituan.android.mrn.config.horn.b;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.monitor.l;
import com.meituan.android.mrn.utils.g;
import com.meituan.msi.metrics.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = MRNBundleModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNReportModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNReportModule";
    private static final String TAG = MRNBundleModule.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;
    private l mrnModuleMonitor;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return MODULE_NAME;
    }

    public MRNReportModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4db1305006f37b794fbaf1e5f82e373", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4db1305006f37b794fbaf1e5f82e373");
        } else {
            this.mrnModuleMonitor = new l();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Map<String, Object> map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdd845e111709bfd636da3442711ad46", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdd845e111709bfd636da3442711ad46");
        }
        HashMap hashMap = new HashMap();
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("commonRate", b.b.a());
        b bVar = b.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        JsonObject jsonObject = PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "ae7de71e9635da1899606fe9e565a0bb", RobustBitConfig.DEFAULT_VALUE) ? (JsonObject) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "ae7de71e9635da1899606fe9e565a0bb") : (JsonObject) t.b.a("singleBridgeRate");
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        HashMap hashMap2 = new HashMap();
        try {
            map = g.b(new JSONObject(jsonObject.toString()));
        } catch (JSONException e) {
            e.printStackTrace();
            map = hashMap2;
        }
        createMap.putMap("singleRate", (WritableMap) Arguments.makeNativeMap(map));
        hashMap.put("configs", createMap);
        return hashMap;
    }

    @ReactMethod
    public void reportMethod(ReadableMap readableMap) {
        Map<String, String> map;
        Map<String, String> hashMap;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a03c30a9ece89a615ea6b2fa277d6f16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a03c30a9ece89a615ea6b2fa277d6f16");
            return;
        }
        try {
            String string = readableMap.getString("methodName");
            if ("start".equals(readableMap.getString("type"))) {
                l lVar = this.mrnModuleMonitor;
                Object[] objArr2 = {string};
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect3, false, "aadc4dc7305586cffccb48bdf66520af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect3, false, "aadc4dc7305586cffccb48bdf66520af");
                } else {
                    Object[] objArr3 = {string};
                    ChangeQuickRedirect changeQuickRedirect4 = l.a;
                    if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect4, false, "c6dae3446e8aa46fca4e1f3764c64114", RobustBitConfig.DEFAULT_VALUE)) {
                        hashMap = (Map) PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect4, false, "c6dae3446e8aa46fca4e1f3764c64114");
                    } else {
                        hashMap = new HashMap<>();
                        hashMap.put("methodName", string);
                    }
                    lVar.a("MRNBridgeStart", 1L, hashMap);
                }
                float a = b.b.a();
                b.a aVar = new b.a();
                aVar.b = b.EnumC0496b.MRN;
                aVar.e = a;
                aVar.d = string;
                com.meituan.msi.metrics.b.a(aVar);
                return;
            }
            double d = readableMap.getDouble("cost");
            boolean z = readableMap.getBoolean("success");
            l lVar2 = this.mrnModuleMonitor;
            long longValue = Double.valueOf(d).longValue();
            Object[] objArr4 = {string, new Long(longValue), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect5 = l.a;
            if (PatchProxy.isSupport(objArr4, lVar2, changeQuickRedirect5, false, "31af2ce36312630ca016017aea0b7a2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, lVar2, changeQuickRedirect5, false, "31af2ce36312630ca016017aea0b7a2e");
                return;
            }
            Object[] objArr5 = {string, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect6 = l.a;
            if (PatchProxy.isSupport(objArr5, lVar2, changeQuickRedirect6, false, "58238ae3d308a474abdc54a37a7b50b0", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr5, lVar2, changeQuickRedirect6, false, "58238ae3d308a474abdc54a37a7b50b0");
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("methodName", string);
                hashMap2.put("success", String.valueOf(z ? 1 : 0));
                map = hashMap2;
            }
            lVar2.a("MRNBridgeEnd", longValue, map);
        } catch (Throwable th) {
            a.d("MRNReportModule@reportMethod", null, th);
        }
    }
}
