package com.meituan.android.common.aidata.resources.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.config.ConfigManager;
import com.meituan.android.common.aidata.feature.persona.PersonaManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResourceConfigParser {
    private static final String TAG = "ResourceConfigParser";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Map<String, List<DDResourceRequest>> parseResourceConfigResponse(JSONObject jSONObject, String str, Map<String, DDResourceRequest> map, Map<String, DDPresetConfig> map2) {
        Object[] objArr = {jSONObject, str, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0f89512331ddbaa7db01c1e89e543764", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0f89512331ddbaa7db01c1e89e543764");
        }
        new StringBuilder("horn download config info:").append(jSONObject != null ? jSONObject.toString() : "");
        LoganManager.getInstance().recordHornConfig(ConfigManager.KEY_CEP_CONFIG_VER, TextUtils.isEmpty(jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, "")) ? "" : jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, ""));
        return parseResourceConfigs(jSONObject, str, map, map2);
    }

    private static Map<String, List<DDResourceRequest>> parseResourceConfigs(JSONObject jSONObject, String str, Map<String, DDResourceRequest> map, Map<String, DDPresetConfig> map2) {
        DDResourceRequest parseSingleBizResource;
        Object[] objArr = {jSONObject, str, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e83c41a569ed7be4c643667f0d1822e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e83c41a569ed7be4c643667f0d1822e");
        }
        if (jSONObject != null) {
            Map<String, List<String>> parseAllResourceConfigList = parseAllResourceConfigList(jSONObject.optString(str));
            HashMap hashMap = new HashMap();
            if (parseAllResourceConfigList != null && parseAllResourceConfigList.size() > 0) {
                for (String str2 : parseAllResourceConfigList.keySet()) {
                    List<String> list = parseAllResourceConfigList.get(str2);
                    if (list != null && list.size() != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str3 : list) {
                            String optString = jSONObject.optString(str3);
                            if (TextUtils.isEmpty(optString) && map2 != null && map2.get(str3) != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append("是预置资源，添加默认版本号");
                                optString = ResourceConfigManager.FLAG_PRESET;
                            }
                            if (!TextUtils.isEmpty(optString) && (parseSingleBizResource = parseSingleBizResource(str3, optString)) != null) {
                                parseSingleBizResource.mBiz = str2;
                                arrayList.add(parseSingleBizResource);
                                if (map != null) {
                                    map.put(str3, parseSingleBizResource);
                                }
                            }
                        }
                        hashMap.put(str2, arrayList);
                    }
                }
            }
            return hashMap;
        }
        return null;
    }

    public static Map<String, List<String>> parseAllResourceConfigList(String str) {
        List<String> parseResourceConfigListByBizName;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a1ca30af0851d794790ac8e961f4fee", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a1ca30af0851d794790ac8e961f4fee");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (!TextUtils.isEmpty(optString) && (parseResourceConfigListByBizName = parseResourceConfigListByBizName(optString)) != null && parseResourceConfigListByBizName.size() > 0) {
                        List list = (List) hashMap.get(next);
                        if (list == null) {
                            hashMap.put(next, parseResourceConfigListByBizName);
                        } else {
                            list.addAll(parseResourceConfigListByBizName);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    private static List<String> parseResourceConfigListByBizName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c96751220dccf3efd0be9163df7e2fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c96751220dccf3efd0be9163df7e2fa");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    private static DDResourceRequest parseSingleBizResource(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eba8839cb15d467df6cf6584904423aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (DDResourceRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eba8839cb15d467df6cf6584904423aa");
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return new DDResourceRequest(str, str2);
    }

    public static void parseResourceConfigByType(JSONObject jSONObject, String str, @NonNull Map<String, BundleInfo> map, @NonNull Map<String, List<BundleInfo>> map2) {
        Object[] objArr = {jSONObject, str, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f69176fb6cdc40a9490088fae27ca1e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f69176fb6cdc40a9490088fae27ca1e6");
            return;
        }
        Map<String, List<String>> parseAllResourceConfigList = parseAllResourceConfigList(jSONObject.optString(str));
        if (parseAllResourceConfigList == null) {
            return;
        }
        for (Map.Entry<String, List<String>> entry : parseAllResourceConfigList.entrySet()) {
            ArrayList arrayList = new ArrayList();
            String key = entry.getKey();
            for (String str2 : entry.getValue()) {
                String optString = jSONObject.optString(str2);
                if (!TextUtils.isEmpty(optString)) {
                    BundleInfo bundleInfo = new BundleInfo();
                    bundleInfo.setDDBundleName(str2);
                    bundleInfo.setBundleVersion(optString);
                    bundleInfo.setTags(key);
                    arrayList.add(bundleInfo);
                    map.put(str2, bundleInfo);
                }
            }
            List<BundleInfo> list = map2.get(key);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.addAll(arrayList);
            map2.put(key, list);
        }
    }

    public static Map<String, Map<String, List<String>>> parseResourceConfigByBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "123db960b1a718ba5a074c3b97d8c3c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "123db960b1a718ba5a074c3b97d8c3c5");
        }
        new StringBuilder("ResourceConfigParser parseResourceConfigByBiz, resourceConfigStr").append(str);
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            HashMap hashMap2 = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            String[] strArr = {ResourceConfigManager.KEY_CEP_FEATURE_CONFIG_LIST, ResourceConfigManager.KEY_JS_CONFIG_RESOURCE_LIST, ResourceConfigManager.KEY_ML_CONFIG_RESOURCE_LIST, ResourceConfigManager.KEY_JS_FEATURE_CONFIG_RESOURCE_LIST};
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                Map<String, List<String>> parseAllResourceConfigList = parseAllResourceConfigList(jSONObject.optString(str2));
                if (parseAllResourceConfigList != null) {
                    String str3 = "";
                    char c = 65535;
                    int hashCode = str2.hashCode();
                    if (hashCode != -2136484488) {
                        if (hashCode != 461989186) {
                            if (hashCode != 1344258127) {
                                if (hashCode == 1623965881 && str2.equals(ResourceConfigManager.KEY_ML_CONFIG_RESOURCE_LIST)) {
                                    c = 3;
                                }
                            } else if (str2.equals(ResourceConfigManager.KEY_JS_CONFIG_RESOURCE_LIST)) {
                                c = 1;
                            }
                        } else if (str2.equals(ResourceConfigManager.KEY_CEP_FEATURE_CONFIG_LIST)) {
                            c = 0;
                        }
                    } else if (str2.equals(ResourceConfigManager.KEY_JS_FEATURE_CONFIG_RESOURCE_LIST)) {
                        c = 2;
                    }
                    switch (c) {
                        case 0:
                            str3 = ResourceConfigManager.DD_RESOURCE_PREFIX;
                            break;
                        case 1:
                            str3 = ResourceConfigManager.DD_OPERATOR_PREFIX;
                            break;
                        case 2:
                            str3 = "ddblue_js_feature_";
                            break;
                        case 3:
                            str3 = ResourceConfigManager.DD_MODEL_PREFIX;
                            break;
                    }
                    for (String str4 : parseAllResourceConfigList.keySet()) {
                        Map map = (Map) hashMap.get(str4);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(str4, map);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String str5 : parseAllResourceConfigList.get(str4)) {
                            arrayList.add(str5.replace(str3, ""));
                        }
                        map.put(str2, arrayList);
                    }
                }
            }
            new StringBuilder("ResourceConfigParser parseResourceConfigByBiz, parse res=").append(hashMap2.toString());
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static Set<String> parseResourceBizSet(@Nullable String str) {
        JSONObject jSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "facd248e0c16a88bd6d09070736c379e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "facd248e0c16a88bd6d09070736c379e");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("parse resource biz failed: ");
            sb.append(e);
            sb.append(" for ");
            sb.append(str);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        String[] strArr = {ResourceConfigManager.KEY_CEP_FEATURE_CONFIG_LIST, ResourceConfigManager.KEY_JS_CONFIG_RESOURCE_LIST, ResourceConfigManager.KEY_ML_CONFIG_RESOURCE_LIST, ResourceConfigManager.KEY_JS_FEATURE_CONFIG_RESOURCE_LIST, ResourceConfigManager.KEY_CUSTOM_JS_RESOURCE_LIST};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 5; i++) {
            JSONObject optJSONObject = jSONObject.optJSONObject(strArr[i]);
            Iterator<String> keys = optJSONObject != null ? optJSONObject.keys() : null;
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        hashSet.add(next);
                    }
                }
            }
        }
        return hashSet;
    }
}
