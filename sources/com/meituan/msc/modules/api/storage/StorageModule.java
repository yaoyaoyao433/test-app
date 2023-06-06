package com.meituan.msc.modules.api.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.utils.FileUtil;
import com.meituan.msc.common.utils.af;
import com.meituan.msc.extern.IApiCallback;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.ServiceApi;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StorageModule extends ServiceApi {
    public static ChangeQuickRedirect f;
    private final HashMap<String, SharedPreferences> g;

    public StorageModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4162702dbaa44d39a557c40cc6d7688b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4162702dbaa44d39a557c40cc6d7688b");
        } else {
            this.g = new HashMap<>();
        }
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public synchronized SharedPreferences getSharedPreferences(String str) {
        String str2;
        SharedPreferences sharedPreferences;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2afa90167a43311033af2e5966aad34f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2afa90167a43311033af2e5966aad34f");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2eadc1bf5600b1a1c9b4935adf54e4ec", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2eadc1bf5600b1a1c9b4935adf54e4ec");
        } else {
            str2 = "msc_" + str;
        }
        if (this.g.containsKey(str2)) {
            sharedPreferences = this.g.get(str2);
        } else {
            SharedPreferences sharedPreferences2 = super.getSharedPreferences(str2);
            this.g.put(str2, sharedPreferences2);
            sharedPreferences = sharedPreferences2;
        }
        return sharedPreferences;
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0a9a3b686a935050ff9961a6a000ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0a9a3b686a935050ff9961a6a000ec");
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1908087954:
                if (str.equals("clearStorage")) {
                    c = '\b';
                    break;
                }
                break;
            case -1274627634:
                if (str.equals("getStorageInfoSync")) {
                    c = 5;
                    break;
                }
                break;
            case -1166168941:
                if (str.equals("getStorageInfo")) {
                    c = 4;
                    break;
                }
                break;
            case -1165860224:
                if (str.equals("getStorageSync")) {
                    c = 3;
                    break;
                }
                break;
            case -847413691:
                if (str.equals("getStorage")) {
                    c = 2;
                    break;
                }
                break;
            case -688781993:
                if (str.equals("removeStorage")) {
                    c = 6;
                    break;
                }
                break;
            case 1089391545:
                if (str.equals("setStorage")) {
                    c = 0;
                    break;
                }
                break;
            case 1357370868:
                if (str.equals("setStorageSync")) {
                    c = 1;
                    break;
                }
                break;
            case 1364265769:
                if (str.equals("clearStorageSync")) {
                    c = '\t';
                    break;
                }
                break;
            case 1499009170:
                if (str.equals("removeStorageSync")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "002be24eceed569d5213bcb860a17691", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "002be24eceed569d5213bcb860a17691");
                    return;
                }
                String optString = jSONObject.optString("key");
                Object opt = jSONObject.opt("data");
                String a = a(getMSCAppModule());
                long c2 = c(a);
                if (getContext() == null || c2 >= 10485760 || TextUtils.isEmpty(optString) || opt == null) {
                    iApiCallback.onFail();
                    return;
                }
                getSharedPreferences(a).edit().putString(optString, a(opt).toString()).apply();
                iApiCallback.onSuccess(null);
                if (getDevTools() != null) {
                    Object[] objArr3 = {opt};
                    ChangeQuickRedirect changeQuickRedirect3 = f;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b911c38fa58bbafe271e796c1c2d81cd", RobustBitConfig.DEFAULT_VALUE)) {
                        String str2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b911c38fa58bbafe271e796c1c2d81cd");
                        return;
                    } else if ((opt instanceof JSONObject) || (opt instanceof JSONArray) || (opt instanceof Boolean)) {
                        return;
                    } else {
                        boolean z = opt instanceof Number;
                        return;
                    }
                }
                return;
            case 2:
            case 3:
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = f;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0a55d7fa3e8643d49361595850de13bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0a55d7fa3e8643d49361595850de13bc");
                    return;
                }
                String optString2 = jSONObject.optString("key");
                if (TextUtils.isEmpty(optString2)) {
                    iApiCallback.onFail();
                    return;
                }
                try {
                    String string = TextUtils.isEmpty(MSCEnvHelper.getEnvInfo().getUserID()) ? "" : getSharedPreferences(b(getMSCAppModule())).getString(optString2, "");
                    if (TextUtils.isEmpty(string)) {
                        string = getSharedPreferences(c(this.c.r)).getString(optString2, "");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", TextUtils.isEmpty(string) ? "" : a(string));
                    iApiCallback.onSuccess(jSONObject2);
                    return;
                } catch (JSONException unused) {
                    g.a("InnerApi", "getStorage assemble result exception!");
                    iApiCallback.onFail();
                    return;
                }
            case 4:
            case 5:
                a(iApiCallback);
                return;
            case 6:
            case 7:
                Object[] objArr5 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect5 = f;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8a6b80f353e4798eb8b4968d88a54102", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8a6b80f353e4798eb8b4968d88a54102");
                    return;
                }
                String optString3 = jSONObject.optString("key");
                if (getContext() == null || TextUtils.isEmpty(optString3)) {
                    iApiCallback.onFail();
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(MSCEnvHelper.getEnvInfo().getUserID())) {
                        SharedPreferences sharedPreferences = getSharedPreferences(b(getMSCAppModule()));
                        if (!TextUtils.isEmpty(sharedPreferences.getString(optString3, ""))) {
                            sharedPreferences.edit().remove(optString3).apply();
                        }
                    }
                    SharedPreferences sharedPreferences2 = getSharedPreferences(c(getMSCAppModule()));
                    String string2 = sharedPreferences2.getString(optString3, "");
                    if (!TextUtils.isEmpty(string2)) {
                        sharedPreferences2.edit().remove(optString3).apply();
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("data", TextUtils.isEmpty(string2) ? "" : a(string2));
                    iApiCallback.onSuccess(jSONObject3);
                } catch (JSONException unused2) {
                    g.a("InnerApi", "removeStorage assemble result exception!");
                    iApiCallback.onFail();
                }
                getDevTools();
                return;
            case '\b':
            case '\t':
                Object[] objArr6 = {iApiCallback};
                ChangeQuickRedirect changeQuickRedirect6 = f;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4b7ccc3965548beeb20de2d8a15187f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4b7ccc3965548beeb20de2d8a15187f8");
                    return;
                }
                String a2 = a(getMSCAppModule());
                getSharedPreferences(a2).edit().clear().apply();
                File b = b(a2);
                if (b != null && b.exists()) {
                    if (b.delete()) {
                        iApiCallback.onSuccess(null);
                        return;
                    } else {
                        iApiCallback.onFail();
                        return;
                    }
                }
                iApiCallback.onSuccess(null);
                getDevTools();
                return;
            default:
                return;
        }
    }

    private static JSONObject a(Object obj) {
        int i = 1;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb97e4e9fb5455bbf665e92df016fd58", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb97e4e9fb5455bbf665e92df016fd58");
        }
        if (!(obj instanceof JSONObject)) {
            if (obj instanceof JSONArray) {
                i = 2;
            } else if (obj instanceof Boolean) {
                i = 4;
            } else {
                i = obj instanceof Number ? 5 : 3;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", obj);
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3902eb7da22b5bce0717c0e5397b8ce4", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3902eb7da22b5bce0717c0e5397b8ce4");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 2 && jSONObject.has("data") && jSONObject.has("type")) {
                Object opt = jSONObject.opt("data");
                return opt == null ? JSONObject.NULL : opt;
            }
        } catch (JSONException e) {
            g.a("InnerApi", "Get JSONObject for Js Failed! " + e.toString());
        }
        return JSONObject.NULL;
    }

    private void a(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0062a5762015124a610cef05a5b6a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0062a5762015124a610cef05a5b6a0f");
            return;
        }
        String a = a(getMSCAppModule());
        long c = c(a);
        if (getContext() == null || TextUtils.isEmpty(a)) {
            iApiCallback.onFail();
            return;
        }
        try {
            Set<String> keySet = getSharedPreferences(a).getAll().keySet();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : keySet) {
                jSONArray.put(str);
            }
            jSONObject.put("keys", jSONArray);
            jSONObject.put("currentSize", c / 1024);
            jSONObject.put("limitSize", FileUtil.LOCAL_REPORT_FILE_MAX_SIZE);
            iApiCallback.onSuccess(jSONObject);
        } catch (JSONException unused) {
            g.a("InnerApi", "getStorageInfo assemble result exception!");
            iApiCallback.onFail();
        }
    }

    private File b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1fedfc8fc13d842320f83761650d3ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1fedfc8fc13d842320f83761650d3ea");
        }
        return new File(getContext().getApplicationInfo().dataDir + "/shared_prefs/" + str + ".xml");
    }

    public static String a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8db0ac328c9873cb195242de27b63b47", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8db0ac328c9873cb195242de27b63b47");
        }
        String b = b(fVar);
        return b == null ? c(fVar) : b;
    }

    private static String b(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ebcfebf0bc796fa7c248096bfe823ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ebcfebf0bc796fa7c248096bfe823ce");
        }
        String userID = MSCEnvHelper.getEnvInfo().getUserID();
        if (TextUtils.isEmpty(userID)) {
            return null;
        }
        return String.format("%s%s", fVar.j(), userID);
    }

    private static String c(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69c15f76440819828df81151faa4bcb3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69c15f76440819828df81151faa4bcb3") : fVar.j();
    }

    private long c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f06f68dfda5594dc7141348984284c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f06f68dfda5594dc7141348984284c")).longValue();
        }
        if (TextUtils.isEmpty(str) || getContext() == null) {
            return 0L;
        }
        File b = b(str);
        if (b.exists()) {
            return b.length();
        }
        Context context = getContext();
        return af.a(context, "mmp_" + str);
    }
}
