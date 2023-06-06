package com.meituan.android.common.aidata.ai.mlmodel.predictor.bean;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureConfig {
    private static final String KEY_FEATURES = "features";
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<MLFeatureProcessConfig> featureList;

    @Nullable
    public static FeatureConfig fromJson(JSONObject jSONObject) {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a13db0188884dba11bac6649d6cebb9", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a13db0188884dba11bac6649d6cebb9");
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("features")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            MLFeatureProcessConfig fromJson = MLFeatureProcessConfig.fromJson(optJSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        if (arrayList.size() > 0) {
            FeatureConfig featureConfig = new FeatureConfig();
            featureConfig.featureList = arrayList;
            return featureConfig;
        }
        return null;
    }

    public Collection<OperatorMergeConfig> createLocalMergeOperatorConfig() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "505d1e5d6552524268621bba63e13d5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "505d1e5d6552524268621bba63e13d5e");
        }
        if (this.featureList == null || this.featureList.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (MLFeatureProcessConfig mLFeatureProcessConfig : this.featureList) {
            if (mLFeatureProcessConfig == null || !mLFeatureProcessConfig.isValid()) {
                return null;
            }
            sb.setLength(0);
            List<OperatorConfig> operatorRuleList = mLFeatureProcessConfig.getOperatorRuleList();
            if (operatorRuleList != null) {
                for (OperatorConfig operatorConfig : operatorRuleList) {
                    if (operatorConfig != null && !TextUtils.isEmpty(operatorConfig.opName)) {
                        sb.append("_Merge_FeatureConfig_");
                        sb.append(operatorConfig.opName);
                    }
                }
            }
            String sb2 = sb.toString();
            new StringBuilder("current merge operator Key is ").append(sb2);
            OperatorMergeConfig operatorMergeConfig = (OperatorMergeConfig) hashMap.get(sb2);
            boolean z2 = true;
            if (operatorMergeConfig == null) {
                operatorMergeConfig = new OperatorMergeConfig();
                hashMap.put(sb2, operatorMergeConfig);
                z = true;
            } else {
                z = false;
            }
            if (operatorRuleList != null) {
                for (OperatorConfig operatorConfig2 : operatorRuleList) {
                    if (operatorConfig2 == null || TextUtils.isEmpty(operatorConfig2.opName)) {
                        new StringBuilder("one OperatorMergeConfig operatorConfig is null or empty ,featureName : ").append(mLFeatureProcessConfig.getFeatureName());
                    } else {
                        if (z2) {
                            operatorMergeConfig.outNameFirstOperatorParamMap.put(mLFeatureProcessConfig.getOutputName(), operatorConfig2.getParamArray());
                            z2 = false;
                        }
                        if (z) {
                            operatorMergeConfig.optionOperatorNameList.add(operatorConfig2.opName);
                        }
                        String outputName = mLFeatureProcessConfig.getOutputName();
                        Map<String, JSONArray> map = operatorMergeConfig.outNameOperatorParamMap.get(outputName);
                        if (map == null) {
                            map = new HashMap<>();
                            operatorMergeConfig.outNameOperatorParamMap.put(outputName, map);
                        }
                        map.put(operatorConfig2.opName, operatorConfig2.getParamArray());
                    }
                }
            }
            operatorMergeConfig.optionFeatureList.add(mLFeatureProcessConfig);
        }
        new StringBuilder("merge count is ").append(hashMap.size());
        return hashMap.values();
    }
}
