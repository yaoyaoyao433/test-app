package com.meituan.android.common.aidata.ai.mlmodel.predictor.bean;

import com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessConfig;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OperatorMergeConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<MLFeatureProcessConfig> optionFeatureList = new ArrayList();
    public List<String> optionOperatorNameList = new ArrayList();
    public Map<String, Map<String, JSONArray>> outNameOperatorParamMap = new HashMap();
    public Map<String, JSONArray> outNameFirstOperatorParamMap = new HashMap();
}
