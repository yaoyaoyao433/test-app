package com.meituan.android.common.aidata.ai.mlmodel.preprocess;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MLFeatureProcessConfig {
    private static final String KEY_FEATURE_NAME = "feature";
    private static final String KEY_FEATURE_SUB_KEY = "featureSubKey";
    private static final String KEY_IS_REAL_TIME = "isRealTime";
    private static final String KEY_OPERATOR_RULE_LIST = "operators";
    private static final String KEY_OUTPUT_NAME = "outName";
    private static final String KEY_OUTPUT_SIZE = "outSize";
    private static final String SEPERATOR_BIZ_TABLE_FEATURE = "\\.";
    private static final String SEPERATOR_FEATURE_SUB_KEY = "\\$";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isRealTime;
    private String mBizName;
    private String mFeatureName;
    private String mFeatureSubKey;
    private List<OperatorConfig> operatorRuleList;
    private String outputName;
    private int outputSize;

    public MLFeatureProcessConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7291e8e6d4269adb3d242b76c2b6ebcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7291e8e6d4269adb3d242b76c2b6ebcc");
            return;
        }
        this.mFeatureName = "";
        this.mFeatureSubKey = "";
        this.outputSize = 0;
        this.outputName = "";
        this.isRealTime = false;
        this.mBizName = "";
    }

    @Nullable
    public static MLFeatureProcessConfig fromJson(@Nullable JSONObject jSONObject) {
        OperatorConfig fromJson;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        MLFeatureProcessConfig mLFeatureProcessConfig = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df068c03f28f751ac4fe40e81cd9cf3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MLFeatureProcessConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df068c03f28f751ac4fe40e81cd9cf3d");
        }
        if (jSONObject != null) {
            mLFeatureProcessConfig = new MLFeatureProcessConfig();
            mLFeatureProcessConfig.mFeatureName = jSONObject.optString("feature");
            mLFeatureProcessConfig.outputSize = jSONObject.optInt(KEY_OUTPUT_SIZE);
            mLFeatureProcessConfig.outputName = jSONObject.optString(KEY_OUTPUT_NAME);
            mLFeatureProcessConfig.isRealTime = jSONObject.optBoolean("isRealTime", true);
            JSONArray optJSONArray = jSONObject.optJSONArray(KEY_OPERATOR_RULE_LIST);
            if (optJSONArray != null) {
                mLFeatureProcessConfig.operatorRuleList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null && (fromJson = OperatorConfig.fromJson(optJSONObject)) != null) {
                        mLFeatureProcessConfig.operatorRuleList.add(fromJson);
                    }
                }
            }
            mLFeatureProcessConfig.mFeatureSubKey = jSONObject.optString(KEY_FEATURE_SUB_KEY);
        }
        return mLFeatureProcessConfig;
    }

    public static boolean isSameFeature(@Nullable MLFeatureProcessConfig mLFeatureProcessConfig, @Nullable MLFeatureProcessConfig mLFeatureProcessConfig2) {
        Object[] objArr = {mLFeatureProcessConfig, mLFeatureProcessConfig2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38193a256e78b964f7adabcd978d9ad9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38193a256e78b964f7adabcd978d9ad9")).booleanValue() : mLFeatureProcessConfig == mLFeatureProcessConfig2 || (mLFeatureProcessConfig != null && mLFeatureProcessConfig2 != null && TextUtils.equals(mLFeatureProcessConfig.getFeatureName(), mLFeatureProcessConfig2.getFeatureName()) && TextUtils.equals(mLFeatureProcessConfig.getFeatureSubKey(), mLFeatureProcessConfig2.getFeatureSubKey()));
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4261878011197cf2f79d53872ddbd20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4261878011197cf2f79d53872ddbd20")).booleanValue();
        }
        boolean equals = super.equals(obj);
        return (equals || !(obj instanceof MLFeatureProcessConfig)) ? equals : isSameFeature(this, (MLFeatureProcessConfig) obj);
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "107c58cb7dc9019ef7989c77466d8bb4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "107c58cb7dc9019ef7989c77466d8bb4")).booleanValue() : (TextUtils.isEmpty(getFeatureName()) || TextUtils.isEmpty(getFeatureSubKey()) || TextUtils.isEmpty(getOutputName())) ? false : true;
    }

    public int getOutputSize() {
        return this.outputSize;
    }

    @Nullable
    public List<OperatorConfig> getOperatorRuleList() {
        return this.operatorRuleList;
    }

    @Nullable
    public String getFeatureName() {
        return this.mFeatureName;
    }

    @Nullable
    public String getFeatureSubKey() {
        return this.mFeatureSubKey;
    }

    public boolean getIsRealTime() {
        return this.isRealTime;
    }

    public void setIsRealTime(boolean z) {
        this.isRealTime = z;
    }

    public String getOutputName() {
        return this.outputName;
    }

    public void setBizName(String str) {
        this.mBizName = str;
    }
}
