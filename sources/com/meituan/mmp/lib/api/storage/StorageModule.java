package com.meituan.mmp.lib.api.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.utils.FileUtil;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.config.a;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.z;
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
    public static ChangeQuickRedirect a;
    private a h;
    private final HashMap<String, SharedPreferences> i;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final boolean d() {
        return true;
    }

    public StorageModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da87bc0eefc902605278fa8dccfdffd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da87bc0eefc902605278fa8dccfdffd0");
        } else {
            this.i = new HashMap<>();
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public synchronized SharedPreferences getSharedPreferences(String str) {
        String str2;
        SharedPreferences sharedPreferences;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c752c9eb4f50cad9b1876599adf9ad7", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c752c9eb4f50cad9b1876599adf9ad7");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b8bd4c8fb4afcef9430d4f8f7c1ec92b", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b8bd4c8fb4afcef9430d4f8f7c1ec92b");
        } else {
            str2 = "mmp_" + str;
        }
        if (this.i.containsKey(str2)) {
            sharedPreferences = this.i.get(str2);
        } else {
            SharedPreferences sharedPreferences2 = super.getSharedPreferences(str2);
            this.i.put(str2, sharedPreferences2);
            sharedPreferences = sharedPreferences2;
        }
        return sharedPreferences;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f5ae730361389a0721ab71a3484d7a", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f5ae730361389a0721ab71a3484d7a") : new String[]{"setStorage", "setStorageSync", "getStorage", "getStorageSync", "getStorageInfo", "getStorageInfoSync", "removeStorage", "removeStorageSync", "clearStorage", "clearStorageSync"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548aba7a33c904d08021073065ea4ca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548aba7a33c904d08021073065ea4ca8");
            return;
        }
        this.h = getAppConfig();
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
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f2ca1c0618bae6cc515830c8fe5cc33", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f2ca1c0618bae6cc515830c8fe5cc33");
                    return;
                }
                String optString = jSONObject.optString("key");
                Object opt = jSONObject.opt("data");
                String a2 = a(this.h);
                long d = d(a2);
                if (getContext() == null || d >= 10485760 || TextUtils.isEmpty(optString) || opt == null) {
                    iApiCallback.onFail();
                    return;
                }
                getSharedPreferences(a2).edit().putString(optString, a(opt).toString()).apply();
                iApiCallback.onSuccess(null);
                if (getDevTools() != null) {
                    Object[] objArr3 = {opt};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "71f0eeb06e2b1c63d93f05494b9e21ec", RobustBitConfig.DEFAULT_VALUE)) {
                        String str2 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "71f0eeb06e2b1c63d93f05494b9e21ec");
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
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0e078b29674d2186571cd07aba825201", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0e078b29674d2186571cd07aba825201");
                    return;
                }
                String optString2 = jSONObject.optString("key");
                if (TextUtils.isEmpty(optString2)) {
                    iApiCallback.onFail();
                    return;
                }
                try {
                    String string = TextUtils.isEmpty(getAppConfig().b()) ? "" : getSharedPreferences(b(this.h)).getString(optString2, "");
                    if (TextUtils.isEmpty(string)) {
                        string = getSharedPreferences(c(this.h)).getString(optString2, "");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", TextUtils.isEmpty(string) ? "" : a(string));
                    iApiCallback.onSuccess(jSONObject2);
                    return;
                } catch (JSONException unused) {
                    b.d("InnerApi", "getStorage assemble result exception!");
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
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3dca28d0dcce2bd90b1cfafd56eabb6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3dca28d0dcce2bd90b1cfafd56eabb6c");
                    return;
                }
                String optString3 = jSONObject.optString("key");
                if (getContext() == null || TextUtils.isEmpty(optString3)) {
                    iApiCallback.onFail();
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(this.h.b())) {
                        SharedPreferences sharedPreferences = getSharedPreferences(b(this.h));
                        if (!TextUtils.isEmpty(sharedPreferences.getString(optString3, ""))) {
                            sharedPreferences.edit().remove(optString3).apply();
                        }
                    }
                    SharedPreferences sharedPreferences2 = getSharedPreferences(c(this.h));
                    String string2 = sharedPreferences2.getString(optString3, "");
                    if (!TextUtils.isEmpty(string2)) {
                        sharedPreferences2.edit().remove(optString3).apply();
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("data", TextUtils.isEmpty(string2) ? "" : a(string2));
                    iApiCallback.onSuccess(jSONObject3);
                } catch (JSONException unused2) {
                    b.d("InnerApi", "removeStorage assemble result exception!");
                    iApiCallback.onFail();
                }
                getDevTools();
                return;
            case '\b':
            case '\t':
                Object[] objArr6 = {iApiCallback};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "aa6b14137cfa65a098016cd66f976845", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "aa6b14137cfa65a098016cd66f976845");
                    return;
                }
                String a3 = a(getAppConfig());
                getSharedPreferences(a3).edit().clear().apply();
                File a4 = a(getContext(), a3);
                if (a4 != null && a4.exists()) {
                    if (a4.delete()) {
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7164b87167df3c1070aa4f8c384f265a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7164b87167df3c1070aa4f8c384f265a");
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52a65c4255d773d59caa26ebf647f294", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52a65c4255d773d59caa26ebf647f294");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 2 && jSONObject.has("data") && jSONObject.has("type")) {
                Object opt = jSONObject.opt("data");
                return opt == null ? JSONObject.NULL : opt;
            }
        } catch (JSONException e) {
            b.d("InnerApi", "Get JSONObject for Js Failed! " + e.toString());
        }
        return JSONObject.NULL;
    }

    private void a(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d75fde60608b991231d1efa85a505518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d75fde60608b991231d1efa85a505518");
            return;
        }
        String a2 = a(getAppConfig());
        long d = d(a2);
        if (getContext() == null || TextUtils.isEmpty(a2)) {
            iApiCallback.onFail();
            return;
        }
        try {
            Set<String> keySet = getSharedPreferences(a2).getAll().keySet();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : keySet) {
                jSONArray.put(str);
            }
            jSONObject.put("keys", jSONArray);
            jSONObject.put("currentSize", d / 1024);
            jSONObject.put("limitSize", FileUtil.LOCAL_REPORT_FILE_MAX_SIZE);
            iApiCallback.onSuccess(jSONObject);
        } catch (JSONException unused) {
            b.d("InnerApi", "getStorageInfo assemble result exception!");
            iApiCallback.onFail();
        }
    }

    private static File a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfde64946639d4e6e553f73f5b680649", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfde64946639d4e6e553f73f5b680649");
        }
        return new File(context.getApplicationInfo().dataDir + "/shared_prefs/" + str + ".xml");
    }

    public static String a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a218463cff77d642b325ab927964a980", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a218463cff77d642b325ab927964a980");
        }
        String b = b(aVar);
        return b == null ? c(aVar) : b;
    }

    private static String b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9876b28ace99589c2840c4ef7a3e6bc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9876b28ace99589c2840c4ef7a3e6bc3");
        }
        if (TextUtils.isEmpty(aVar.b())) {
            return null;
        }
        return String.format("%s%s", aVar.c(), aVar.b());
    }

    private static String c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c9ad69bdcf658f6d67222c0440d600e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c9ad69bdcf658f6d67222c0440d600e") : aVar.c();
    }

    private long d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d02faf5cd8aa26b378b221a6f006ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d02faf5cd8aa26b378b221a6f006ac")).longValue();
        }
        if (TextUtils.isEmpty(str) || getContext() == null) {
            return 0L;
        }
        File a2 = a(getContext(), str);
        if (a2.exists()) {
            return a2.length();
        }
        Context context = getContext();
        return z.a(context, "mmp_" + str);
    }
}
