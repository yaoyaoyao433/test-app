package com.sankuai.titans.config;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ConfigManager {
    private static final String CONFIG_GLOBAL = "webview";
    private static final String CONFIG_GLOBAL_TITANS20 = "titans20";
    public static final int RESULT_CODE_FAIL = -1;
    public static final int RESULT_CODE_SUCCESS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, String> cloudConfigInfos = new HashMap();
    private static volatile Gson sExcludeGson = null;
    private static final Object cacheLock = new Object();
    private static final Map<String, HornResult> cacheResults = new HashMap();
    private static final Map<String, List<HornCallback>> registeredCallbacks = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ICloudConfigCallback {
        void onFinish(int i, String str);
    }

    public static void pullCloudConfig(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fae661968c590e4d5d39e31a05f00e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fae661968c590e4d5d39e31a05f00e17");
        } else {
            pullCloudConfig(str, map, null);
        }
    }

    public static void pullCloudConfig(final String str, Map<String, Object> map, final ICloudConfigCallback iCloudConfigCallback) {
        Object[] objArr = {str, map, iCloudConfigCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df52e663af6fb518621407ed55290ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df52e663af6fb518621407ed55290ccc");
            return;
        }
        HornCallback hornCallback = new HornCallback() { // from class: com.sankuai.titans.config.ConfigManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6cc153c01763221767a79addacd1a76b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6cc153c01763221767a79addacd1a76b");
                    return;
                }
                if ("webview".equals(str)) {
                    try {
                        String optString = new JSONObject(str2).optString(ConfigManager.CONFIG_GLOBAL_TITANS20);
                        if (!TextUtils.isEmpty(optString)) {
                            str2 = optString;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (iCloudConfigCallback != null) {
                    iCloudConfigCallback.onFinish(z ? 0 : -1, str2);
                }
                if (z) {
                    ConfigManager.updateConfig(str, str2);
                }
            }
        };
        String accessCache = Horn.accessCache(str);
        if (!TextUtils.isEmpty(accessCache)) {
            if ("webview".equals(str)) {
                try {
                    String optString = new JSONObject(accessCache).optString(CONFIG_GLOBAL_TITANS20);
                    if (!TextUtils.isEmpty(optString)) {
                        accessCache = optString;
                    }
                } catch (Throwable unused) {
                }
            }
            updateConfig(str, accessCache);
            if (iCloudConfigCallback != null) {
                iCloudConfigCallback.onFinish(0, accessCache);
            }
        }
        pullConfig(str, hornCallback, map);
    }

    public static void pullConfig(final String str, HornCallback hornCallback, Map<String, Object> map) {
        Object[] objArr = {str, hornCallback, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a5958d05d577523dc7afcd912e236d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a5958d05d577523dc7afcd912e236d7");
            return;
        }
        synchronized (cacheLock) {
            if (!registeredCallbacks.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hornCallback);
                registeredCallbacks.put(str, arrayList);
                Horn.register(str, new HornCallback() { // from class: com.sankuai.titans.config.ConfigManager.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str2) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25f5a405c39ca60c0fe8e5a19f21b7ec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25f5a405c39ca60c0fe8e5a19f21b7ec");
                            return;
                        }
                        synchronized (ConfigManager.cacheLock) {
                            ConfigManager.cacheResults.put(str, new HornResult(z, str2));
                            List<HornCallback> list = (List) ConfigManager.registeredCallbacks.get(str);
                            if (list == null) {
                                return;
                            }
                            for (HornCallback hornCallback2 : list) {
                                hornCallback2.onChanged(z, str2);
                            }
                        }
                    }
                }, map);
            } else if (hornCallback == null) {
            } else {
                registeredCallbacks.get(str).add(hornCallback);
                HornResult hornResult = cacheResults.get(str);
                if (hornResult != null) {
                    hornCallback.onChanged(hornResult.isEnable(), hornResult.getResult());
                }
            }
        }
    }

    public static String getConfigStr(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5858ea2be9fd65079b477d48b21ba7c9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5858ea2be9fd65079b477d48b21ba7c9") : cloudConfigInfos.get(str);
    }

    public static <T> T getConfig(String str, Class<T> cls, T t) {
        Object[] objArr = {str, cls, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49bdeae5d9d6b9a559bf1a2101382db6", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49bdeae5d9d6b9a559bf1a2101382db6");
        }
        try {
            String str2 = cloudConfigInfos.get(str);
            return TextUtils.isEmpty(str2) ? t : (T) getExcludeGson().fromJson(str2, (Class<Object>) cls);
        } catch (JsonSyntaxException unused) {
            return t;
        }
    }

    public static Config getConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61656b8774c08e02fc1437df8b960576", RobustBitConfig.DEFAULT_VALUE) ? (Config) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61656b8774c08e02fc1437df8b960576") : (Config) getConfig("webview", Config.class, new Config());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateConfig(String str, String str2) {
        JSONObject jSONObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a52dd84b0e453f30022e74dee8dd09b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a52dd84b0e453f30022e74dee8dd09b6");
            return;
        }
        try {
            jSONObject = new JSONObject(str2);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        synchronized (cloudConfigInfos) {
            cloudConfigInfos.put(str, str2);
        }
    }

    public static Gson getExcludeGson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f463538482298f098a0bed052c8c117", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f463538482298f098a0bed052c8c117");
        }
        if (sExcludeGson == null) {
            synchronized (ConfigManager.class) {
                if (sExcludeGson == null) {
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.excludeFieldsWithoutExposeAnnotation();
                    sExcludeGson = gsonBuilder.create();
                }
            }
        }
        return sExcludeGson;
    }
}
