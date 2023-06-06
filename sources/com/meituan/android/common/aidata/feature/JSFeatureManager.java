package com.meituan.android.common.aidata.feature;

import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.feature.bean.JSFeatureConfig;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSFeatureManager {
    public static final String JS_DATA = "data";
    public static final String JS_DATA_KEY = "featureData";
    public static final String JS_INPUT_PARAM_FEATURE_KEY = "feature";
    public static final String JS_INPUT_PARAM_PARAMS_KEY = "params";
    public static final String JS_NAME_INDEX_KEY = "nameToIndexMap";
    public static final String JS_SUCCESS = "isSuccess";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile JSFeatureManager instance;
    private final Map<String, AiBundle> jsFeatureBundleMap;
    private final Map<String, BundleInfo> jsFeatureMap;

    public JSFeatureManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eb453582e6e515a632bf2631c012325", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eb453582e6e515a632bf2631c012325");
            return;
        }
        this.jsFeatureBundleMap = new AsyncHashMap();
        this.jsFeatureMap = new HashMap();
    }

    public static JSFeatureManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3025d326cd03fa4476a8d72997449f38", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSFeatureManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3025d326cd03fa4476a8d72997449f38");
        }
        if (instance == null) {
            synchronized (JSFeatureManager.class) {
                if (instance == null) {
                    instance = new JSFeatureManager();
                }
            }
        }
        return instance;
    }

    public boolean registerJSFeature(AiBundle aiBundle) {
        Object[] objArr = {aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d8eb98ea4db496b9bbe4f8d7cc7318", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d8eb98ea4db496b9bbe4f8d7cc7318")).booleanValue();
        }
        if (aiBundle == null || !(aiBundle.getJsConfig() instanceof JSFeatureConfig)) {
            return false;
        }
        this.jsFeatureBundleMap.put(((JSFeatureConfig) aiBundle.getJsConfig()).name, aiBundle);
        return true;
    }

    public AiBundle unregisterJSFeature(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7da07c7330ef24ee67bd6581f6d53243", RobustBitConfig.DEFAULT_VALUE)) {
            return (AiBundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7da07c7330ef24ee67bd6581f6d53243");
        }
        AiBundle remove = this.jsFeatureBundleMap.remove(str);
        if (remove == null) {
            Map<String, AiBundle> map = this.jsFeatureBundleMap;
            remove = map.remove("ddblue_js_feature_" + str);
        }
        return remove == null ? this.jsFeatureBundleMap.remove(str.replace("ddblue_js_feature_", "")) : remove;
    }

    public boolean isJSFeature(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81dc92a4008296138eec2d86d8814ca5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81dc92a4008296138eec2d86d8814ca5")).booleanValue();
        }
        if (!this.jsFeatureMap.containsKey(str)) {
            Map<String, BundleInfo> map = this.jsFeatureMap;
            if (!map.containsKey("ddblue_js_feature_" + str)) {
                return false;
            }
        }
        return true;
    }

    public boolean isLoadJSFeature(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24010965bc29ddb82edb1ae37b1ae408", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24010965bc29ddb82edb1ae37b1ae408")).booleanValue();
        }
        if (!this.jsFeatureBundleMap.containsKey(str)) {
            Map<String, AiBundle> map = this.jsFeatureBundleMap;
            if (!map.containsKey("ddblue_js_feature_" + str)) {
                return false;
            }
        }
        return true;
    }

    public List<GetFeatureRequest> getJSFeatureChild(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fafd56758b5a19dcf719570a6dbb5d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fafd56758b5a19dcf719570a6dbb5d1");
        }
        AiBundle jSFeatureBundle = getJSFeatureBundle(str);
        if (jSFeatureBundle != null && (jSFeatureBundle.getJsConfig() instanceof JSFeatureConfig)) {
            return ((JSFeatureConfig) jSFeatureBundle.getJsConfig()).features;
        }
        return null;
    }

    public AiBundle getJSFeatureBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cd2f9a03bff50971454adfd77d5df47", RobustBitConfig.DEFAULT_VALUE)) {
            return (AiBundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cd2f9a03bff50971454adfd77d5df47");
        }
        AiBundle aiBundle = this.jsFeatureBundleMap.get(str);
        if (aiBundle == null) {
            Map<String, AiBundle> map = this.jsFeatureBundleMap;
            return map.get("ddblue_js_feature_" + str);
        }
        return aiBundle;
    }

    public BundleInfo getJSFeatureBundleInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bff5088c5065d0a43c4ad6ed1e345ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (BundleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bff5088c5065d0a43c4ad6ed1e345ec");
        }
        BundleInfo bundleInfo = this.jsFeatureMap.get(str);
        if (bundleInfo == null) {
            Map<String, BundleInfo> map = this.jsFeatureMap;
            return map.get("ddblue_js_feature_" + str);
        }
        return bundleInfo;
    }

    public JSONArray generateJSScriptParams(Map<GetFeatureRequest, Map<String, List<ResultRow>>> map, JSONObject jSONObject) {
        Map<String, List<ResultRow>> value;
        JSONObject jSONObject2;
        Object[] objArr = {map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9faf314342a68533760bb2b32454c5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9faf314342a68533760bb2b32454c5f");
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject jSONObject4 = new JSONObject();
            if (map != null) {
                for (Map.Entry<GetFeatureRequest, Map<String, List<ResultRow>>> entry : map.entrySet()) {
                    if (entry != null && (value = entry.getValue()) != null) {
                        if (value.isEmpty()) {
                            GetFeatureRequest key = entry.getKey();
                            if (key != null) {
                                String str = key.feature;
                                if (!TextUtils.isEmpty(str)) {
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put(JS_DATA_KEY, new JSONArray());
                                    jSONObject5.put(JS_NAME_INDEX_KEY, new JSONObject());
                                    jSONObject4.put(str, jSONObject5);
                                }
                            }
                        } else {
                            for (Map.Entry<String, List<ResultRow>> entry2 : value.entrySet()) {
                                if (entry2 != null) {
                                    String key2 = entry2.getKey();
                                    if (!TextUtils.isEmpty(key2)) {
                                        JSONObject jSONObject6 = new JSONObject();
                                        List<ResultRow> value2 = entry2.getValue();
                                        if (value2 != null) {
                                            JSONArray jSONArray2 = new JSONArray();
                                            JSONObject jSONObject7 = new JSONObject();
                                            for (ResultRow resultRow : value2) {
                                                if (resultRow != null && (jSONObject2 = resultRow.toJSONObject()) != null) {
                                                    jSONArray2.put(jSONObject2);
                                                    if (jSONObject7.length() <= 0) {
                                                        int columnCount = resultRow.getColumnCount();
                                                        for (int i = 0; i < columnCount; i++) {
                                                            jSONObject7.put(resultRow.getColumnName(i), i);
                                                        }
                                                    }
                                                }
                                            }
                                            jSONObject6.put(JS_DATA_KEY, jSONArray2);
                                            jSONObject6.put(JS_NAME_INDEX_KEY, jSONObject7);
                                        }
                                        jSONObject4.put(key2, jSONObject6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            jSONObject3.putOpt("feature", jSONObject4);
            jSONObject3.putOpt("params", jSONObject == null ? new JSONObject() : jSONObject);
            jSONArray.put(jSONObject3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    public Map<String, List<ResultRow>> parseJSResult(String str, JSValueWrapper jSValueWrapper) {
        JSONArray jSONArray;
        JSONObject jSONObjectData;
        Object[] objArr = {str, jSValueWrapper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb288d7444a8837b26b9c2e6a7ce2330", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb288d7444a8837b26b9c2e6a7ce2330");
        }
        if (jSValueWrapper == null || (jSONObjectData = jSValueWrapper.getJSONObjectData()) == null || (jSONArray = jSONObjectData.optJSONArray(JS_DATA_KEY)) == null || jSONArray.length() <= 0) {
            jSONArray = new JSONArray();
        }
        return getFeatureFormJson(str, jSONArray);
    }

    @NotNull
    private Map<String, List<ResultRow>> getFeatureFormJson(String str, JSONArray jSONArray) {
        Object[] objArr = {str, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84ad2281558c77896df72a77c8e6631c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84ad2281558c77896df72a77c8e6631c");
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put(str, arrayList);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.length() > 0) {
                ResultRow.RowBuilder rowBuilder = new ResultRow.RowBuilder(optJSONObject.length());
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        rowBuilder.add(next, optJSONObject.opt(next));
                    }
                }
                arrayList.add(rowBuilder.build());
            }
        }
        return hashMap;
    }

    @NotNull
    public Map<String, List<ResultRow>> getMultiFeatureFormJson(JSONObject jSONObject) {
        Iterator<String> keys;
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2a2eb0dd78c9fdd09999ec04a087dd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2a2eb0dd78c9fdd09999ec04a087dd7");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return hashMap;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next) && (optJSONArray = jSONObject.optJSONArray(next)) != null) {
                hashMap.putAll(getFeatureFormJson(next, optJSONArray));
            }
        }
        return hashMap;
    }

    public void createJSFeatureMap(Map<String, BundleInfo> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8cc0c4118572996b56906103a040afd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8cc0c4118572996b56906103a040afd");
            return;
        }
        this.jsFeatureMap.clear();
        this.jsFeatureMap.putAll(map);
    }
}
