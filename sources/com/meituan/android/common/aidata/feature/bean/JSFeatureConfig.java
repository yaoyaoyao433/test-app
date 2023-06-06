package com.meituan.android.common.aidata.feature.bean;

import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSFeatureConfig extends AiBundle.JSConfig {
    public static final String KEY_BUNDLE_BIZ = "biz";
    public static final String KEY_BUNDLE_FEATURES = "features";
    public static final String KEY_BUNDLE_FEATURE_NAME = "featureName";
    public static final String KEY_BUNDLE_FEATURE_REALTIME = "isRealTime";
    public static final String KEY_BUNDLE_NAME = "name";
    public static final String KEY_BUNDLE_VERSION = "version";
    public static final String PREFIX_JS_FEATURE = "ddblue_js_feature_";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String biz;
    public List<GetFeatureRequest> features;
    public String name;
    public String version;

    public JSFeatureConfig init(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e2f7f120cb04af87643f4ce1d3a1f9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSFeatureConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e2f7f120cb04af87643f4ce1d3a1f9b");
        }
        this.name = jSONObject.optString("name", "");
        this.biz = jSONObject.optString("biz", "");
        this.version = jSONObject.optString("version", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.features = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    GetFeatureRequest getFeatureRequest = new GetFeatureRequest();
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    getFeatureRequest.feature = jSONObject2.optString("featureName", "");
                    getFeatureRequest.isRealTime = jSONObject2.optBoolean(KEY_BUNDLE_FEATURE_REALTIME, false);
                    this.features.add(getFeatureRequest);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return this;
    }

    @Override // com.meituan.android.common.aidata.ai.bundle.model.AiBundle.JSConfig
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7849b446185a2828c1e8a8ee3ee4e647", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7849b446185a2828c1e8a8ee3ee4e647");
        }
        return "super : " + super.toString() + "\nJSFeatureConfig{biz='" + this.biz + "', version='" + this.version + "', features=" + this.features + ", name='" + this.name + "'}";
    }
}
