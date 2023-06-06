package com.meituan.android.common.aidata.resources.config;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.feature.JSFeatureManager;
import com.meituan.android.common.aidata.utils.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResourceConfigManager {
    public static final String DD_AUTO_JS_PREFIX = "ddblue_custom_js_";
    public static final String DD_JS_FEATURE_PREFIX = "ddblue_js_feature_";
    public static final String DD_MODEL_PREFIX = "ddblue_model_";
    public static final String DD_OPERATOR_PREFIX = "ddblue_operator_";
    public static final String DD_RESOURCE_PREFIX = "ddblue_";
    public static final String FLAG_PRESET = "PRESET";
    public static final String KEY_CEP_FEATURE_CONFIG_LIST = "feature_src_list";
    public static final String KEY_CUSTOM_JS_RESOURCE_LIST = "custom_js_src_list";
    public static final String KEY_JS_CONFIG_RESOURCE_LIST = "js_src_list";
    public static final String KEY_JS_FEATURE_CONFIG_RESOURCE_LIST = "js_feature_src_list";
    public static final String KEY_ML_CONFIG_RESOURCE_LIST = "ml_src_list";
    public static final String KEY_PRESET_CONFIG_RESOURCE_LIST = "preset_src_list";
    public static final String TAG = "ResourceConfigManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile ResourceConfigManager mInstance;
    private volatile Map<String, BundleInfo> autoJsCacheMap;
    private volatile Map<String, DDResourceRequest> cepCacheMap;
    private String configData;
    private volatile Map<String, DDPresetConfig> mAllPresetConfig;
    private volatile Map<String, List<BundleInfo>> mAllResourceConfig;
    private volatile Map<String, List<DDResourceRequest>> mCepResourceConfig;
    private volatile Map<String, BundleInfo> modelCacheMap;
    private volatile Map<String, BundleInfo> operatorCacheMap;

    public static ResourceConfigManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a19af567ae1456f6a6558461de60e327", RobustBitConfig.DEFAULT_VALUE)) {
            return (ResourceConfigManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a19af567ae1456f6a6558461de60e327");
        }
        if (mInstance == null) {
            synchronized (ResourceConfigManager.class) {
                if (mInstance == null) {
                    mInstance = new ResourceConfigManager();
                }
            }
        }
        return mInstance;
    }

    public void handleConfigDataResponse(String str, boolean z) {
        JSONObject jSONObject;
        Iterator<String> it;
        List<BundleInfo> list;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57734c396a2b9e93c4789af0204e8c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57734c396a2b9e93c4789af0204e8c47");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            Map<String, DDPresetConfig> parsePresetResource = DDPresetConfig.parsePresetResource(jSONObject);
            HashMap hashMap2 = new HashMap();
            Map<String, List<DDResourceRequest>> parseResourceConfigResponse = ResourceConfigParser.parseResourceConfigResponse(jSONObject, KEY_CEP_FEATURE_CONFIG_LIST, hashMap2, parsePresetResource);
            HashMap hashMap3 = new HashMap();
            ResourceConfigParser.parseResourceConfigByType(jSONObject, KEY_ML_CONFIG_RESOURCE_LIST, hashMap3, hashMap);
            HashMap hashMap4 = new HashMap();
            ResourceConfigParser.parseResourceConfigByType(jSONObject, KEY_JS_FEATURE_CONFIG_RESOURCE_LIST, hashMap4, hashMap);
            HashMap hashMap5 = new HashMap();
            ResourceConfigParser.parseResourceConfigByType(jSONObject, KEY_JS_CONFIG_RESOURCE_LIST, hashMap5, hashMap);
            HashMap hashMap6 = new HashMap();
            ResourceConfigParser.parseResourceConfigByType(jSONObject, KEY_CUSTOM_JS_RESOURCE_LIST, hashMap6, hashMap);
            synchronized (AIDispatcher.getInstance()) {
                Set<String> triggerBizSet = AIDataDelegate.getInstance().getTriggerBizSet();
                if (!triggerBizSet.isEmpty()) {
                    boolean z2 = this.mAllResourceConfig == null;
                    boolean z3 = this.mCepResourceConfig == null;
                    Iterator<String> it2 = triggerBizSet.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        AIDispatcher aIDispatcher = AIDispatcher.getInstance();
                        if (z2) {
                            it = it2;
                            list = null;
                        } else {
                            it = it2;
                            list = this.mAllResourceConfig.get(next);
                        }
                        boolean z4 = z2;
                        aIDispatcher.updateBundleInfo(next, list, (List) hashMap.get(next));
                        AIDispatcher.getInstance().updateCEPInfo(next, z3 ? null : this.mCepResourceConfig.get(next), parseResourceConfigResponse.get(next));
                        it2 = it;
                        z2 = z4;
                    }
                }
                this.mCepResourceConfig = parseResourceConfigResponse;
                this.mAllResourceConfig = hashMap;
                this.modelCacheMap = hashMap3;
                this.operatorCacheMap = hashMap5;
                this.cepCacheMap = hashMap2;
                JSFeatureManager.getInstance().createJSFeatureMap(hashMap4);
                this.mAllPresetConfig = parsePresetResource;
                this.autoJsCacheMap = hashMap6;
            }
            this.configData = str;
        }
    }

    public static boolean isResourceConfigValid(@Nullable String str) {
        JSONObject jSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0306237bc6554717c8895cd632bc1027", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0306237bc6554717c8895cd632bc1027")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("parse resource config ");
            sb.append(str);
            sb.append(" failed: ");
            sb.append(e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String[] strArr = {KEY_CEP_FEATURE_CONFIG_LIST, KEY_ML_CONFIG_RESOURCE_LIST, KEY_JS_FEATURE_CONFIG_RESOURCE_LIST, KEY_JS_CONFIG_RESOURCE_LIST, KEY_CUSTOM_JS_RESOURCE_LIST};
        for (int i = 0; i < 5; i++) {
            ResourceConfigParser.parseResourceConfigByType(jSONObject, strArr[i], new HashMap(), hashMap);
        }
        for (String str2 : hashMap.keySet()) {
            if (!CollectionUtils.isEmpty((List) hashMap.get(str2))) {
                return true;
            }
        }
        return false;
    }

    public List<BundleInfo> getAllResourceConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c0b20fde1c93d75c575e7a2a0c1df66", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c0b20fde1c93d75c575e7a2a0c1df66");
        }
        if (TextUtils.isEmpty(str) || this.mAllResourceConfig == null || !this.mAllResourceConfig.containsKey(str)) {
            return null;
        }
        return this.mAllResourceConfig.get(str);
    }

    public List<DDResourceRequest> getCepResourceConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0762f5c98f287f63f4cf332927ae6f6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0762f5c98f287f63f4cf332927ae6f6b");
        }
        if (TextUtils.isEmpty(str) || this.mCepResourceConfig == null || this.mCepResourceConfig.isEmpty() || !this.mCepResourceConfig.containsKey(str)) {
            return null;
        }
        return this.mCepResourceConfig.get(str);
    }

    public Map<String, DDPresetConfig> getDDPresetConfig() {
        return this.mAllPresetConfig;
    }

    public BundleInfo getModelBundleInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17770a356b3cffcb0564079e2fbe7e87", RobustBitConfig.DEFAULT_VALUE)) {
            return (BundleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17770a356b3cffcb0564079e2fbe7e87");
        }
        if (TextUtils.isEmpty(str) || this.modelCacheMap == null) {
            return null;
        }
        BundleInfo bundleInfo = this.modelCacheMap.get(str);
        if (bundleInfo == null) {
            Map<String, BundleInfo> map = this.modelCacheMap;
            return map.get(DD_MODEL_PREFIX + str);
        }
        return bundleInfo;
    }

    public BundleInfo getJSBundleInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "808697795ab342f007630da1ebbc34d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (BundleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "808697795ab342f007630da1ebbc34d5");
        }
        if (TextUtils.isEmpty(str) || this.operatorCacheMap == null) {
            return null;
        }
        BundleInfo bundleInfo = this.operatorCacheMap.get(str);
        if (bundleInfo == null) {
            Map<String, BundleInfo> map = this.operatorCacheMap;
            return map.get(DD_OPERATOR_PREFIX + str);
        }
        return bundleInfo;
    }

    public DDResourceRequest getFeatureDDRequest(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ef23a8a0daddb3c1989a6cf8707d83c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DDResourceRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ef23a8a0daddb3c1989a6cf8707d83c");
        }
        if (TextUtils.isEmpty(str) || this.cepCacheMap == null) {
            return null;
        }
        DDResourceRequest dDResourceRequest = this.cepCacheMap.get(str);
        if (dDResourceRequest == null) {
            Map<String, DDResourceRequest> map = this.cepCacheMap;
            return map.get(DD_RESOURCE_PREFIX + str);
        }
        return dDResourceRequest;
    }

    public BundleInfo getAutoJSBundleInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc443236c0d84d6a6bf151e40fae0fe0", RobustBitConfig.DEFAULT_VALUE)) {
            return (BundleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc443236c0d84d6a6bf151e40fae0fe0");
        }
        if (TextUtils.isEmpty(str) || this.autoJsCacheMap == null) {
            return null;
        }
        BundleInfo bundleInfo = this.autoJsCacheMap.get(str);
        if (bundleInfo == null) {
            Map<String, BundleInfo> map = this.autoJsCacheMap;
            return map.get(DD_AUTO_JS_PREFIX + str);
        }
        return bundleInfo;
    }

    public String getConfigData() {
        return this.configData;
    }

    public Map<String, List<BundleInfo>> getAllResourceConfig() {
        return this.mAllResourceConfig;
    }

    public Map<String, List<DDResourceRequest>> getAllCepConfig() {
        return this.mCepResourceConfig;
    }

    public String getBundleVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61c340c689f37a41110798fa06d256aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61c340c689f37a41110798fa06d256aa");
        }
        BundleInfo jSBundleInfo = getJSBundleInfo(str);
        if (jSBundleInfo != null) {
            return AIDispatcher.getInstance().getBundleVersion(jSBundleInfo);
        }
        BundleInfo jSFeatureBundleInfo = JSFeatureManager.getInstance().getJSFeatureBundleInfo(str);
        if (jSFeatureBundleInfo != null) {
            return AIDispatcher.getInstance().getBundleVersion(jSFeatureBundleInfo);
        }
        BundleInfo autoJSBundleInfo = getAutoJSBundleInfo(str);
        if (autoJSBundleInfo != null) {
            return AIDispatcher.getInstance().getBundleVersion(autoJSBundleInfo);
        }
        BundleInfo modelBundleInfo = getModelBundleInfo(str);
        return modelBundleInfo != null ? AIDispatcher.getInstance().getBundleVersion(modelBundleInfo) : "";
    }

    public Map<String, BundleInfo> getOperatorCacheMap() {
        return this.operatorCacheMap;
    }

    public Map<String, BundleInfo> getModelCacheMap() {
        return this.modelCacheMap;
    }

    public Map<String, DDResourceRequest> getCepCacheMap() {
        return this.cepCacheMap;
    }

    public Map<String, BundleInfo> getAutoJsCacheMap() {
        return this.autoJsCacheMap;
    }
}
