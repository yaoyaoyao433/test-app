package com.meituan.android.common.aidata.ai.mlmodel.preprocess;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.IAiFeatureListener;
import com.meituan.android.common.aidata.ai.base.FeatureListenerUtil;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorListener;
import com.meituan.android.common.aidata.ai.mlmodel.operator.ISingleOperatorListener;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorService;
import com.meituan.android.common.aidata.ai.mlmodel.operator.util.OperatorListenerUtil;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.OperatorMergeConfig;
import com.meituan.android.common.aidata.ai.mlmodel.preprocess.excption.FeatureException;
import com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.FeatureService;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.JSFeatureManager;
import com.meituan.android.common.aidata.feature.utils.AiFeatureUtil;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MLFeatureProcessHelper {
    public static final String TAG = "MLFeatureProcessHelper";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IKeyGetter<K, V> {
        K getKey(@NonNull V v);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface PreprocessListener {
        void onFailed(@Nullable BlueException blueException);

        void onSuccess(@Nullable Map<String, JSONArray> map, @NonNull List<String> list);
    }

    public void process(@NonNull final MLContext mLContext, @Nullable final PreprocessListener preprocessListener) {
        Object[] objArr = {mLContext, preprocessListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2c34604eeddacb0092c50079e3f08c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2c34604eeddacb0092c50079e3f08c3");
            return;
        }
        final List<MLFeatureProcessConfig> featureList = mLContext.getFeatureList();
        if (featureList != null && !featureList.isEmpty()) {
            getAllFeature(mLContext, featureList, new IAiFeatureListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.IAiFeatureListener
                public void onSuccess(@Nullable FeatureResult featureResult) {
                    Object[] objArr2 = {featureResult};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e09e606807aede6c7bb6a0aa4b2e0fe4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e09e606807aede6c7bb6a0aa4b2e0fe4");
                    } else {
                        MLFeatureProcessHelper.this.processAllFeature(mLContext, featureResult, featureList, preprocessListener);
                    }
                }

                @Override // com.meituan.android.common.aidata.ai.IAiFeatureListener
                public void onFailed(@Nullable BlueException blueException) {
                    Object[] objArr2 = {blueException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "af2b642c63bd940d8a48d006622c6173", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "af2b642c63bd940d8a48d006622c6173");
                    } else {
                        MLFeatureProcessHelper.this.notifyProcessFailed(preprocessListener, blueException);
                    }
                }
            });
        } else {
            notifyProcessFailed(preprocessListener, new BlueException("config list is empty", BaseRaptorUploader.ERROR_PRODUCER_NOT_FIND));
        }
    }

    public void process(@NonNull final MLContext mLContext, @NonNull JSONObject jSONObject, @Nullable final PreprocessListener preprocessListener) {
        Object[] objArr = {mLContext, jSONObject, preprocessListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "806c6a0fd489ee8f322d40d3682b5ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "806c6a0fd489ee8f322d40d3682b5ede");
            return;
        }
        final List<MLFeatureProcessConfig> featureList = mLContext.getFeatureList();
        if (featureList != null && !featureList.isEmpty()) {
            List<MLFeatureProcessConfig> filterNeedProduceFeatureConfig = filterNeedProduceFeatureConfig(jSONObject, featureList);
            final Map<String, List<ResultRow>> multiFeatureFormJson = JSFeatureManager.getInstance().getMultiFeatureFormJson(jSONObject);
            if (filterNeedProduceFeatureConfig.size() > 0) {
                getAllFeature(mLContext, filterNeedProduceFeatureConfig, new IAiFeatureListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.IAiFeatureListener
                    public void onSuccess(@Nullable FeatureResult featureResult) {
                        Object[] objArr2 = {featureResult};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "511c02f9dfe229924c0d84716a585028", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "511c02f9dfe229924c0d84716a585028");
                            return;
                        }
                        Map<String, List<ResultRow>> map = null;
                        if (featureResult != null && (map = featureResult.getData()) != null) {
                            map.putAll(multiFeatureFormJson);
                        }
                        if (map == null) {
                            map = new HashMap<>();
                        }
                        MLFeatureProcessHelper.this.processAllFeature(mLContext, new FeatureResult(map), featureList, preprocessListener);
                    }

                    @Override // com.meituan.android.common.aidata.ai.IAiFeatureListener
                    public void onFailed(@Nullable BlueException blueException) {
                        Object[] objArr2 = {blueException};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b922efb8c5e572acda97e153a92f4c2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b922efb8c5e572acda97e153a92f4c2");
                        } else {
                            MLFeatureProcessHelper.this.notifyProcessFailed(preprocessListener, blueException);
                        }
                    }
                });
                return;
            } else {
                processAllFeature(mLContext, new FeatureResult(multiFeatureFormJson), featureList, preprocessListener);
                return;
            }
        }
        notifyProcessFailed(preprocessListener, new BlueException("config list is empty", BaseRaptorUploader.ERROR_PRODUCER_NOT_FIND));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAllFeature(@NonNull MLContext mLContext, @NonNull FeatureResult featureResult, @NonNull List<MLFeatureProcessConfig> list, @Nullable final PreprocessListener preprocessListener) {
        Collection<OperatorMergeConfig> mergeOptionList;
        Object[] objArr = {mLContext, featureResult, list, preprocessListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b14973096af06eebfa08d9501a51c573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b14973096af06eebfa08d9501a51c573");
            return;
        }
        if (mLContext.isFrameWorkSupportMerge() && (mergeOptionList = mLContext.getMergeOptionList()) != null && mergeOptionList.size() > 0) {
            OperatorMergeTask operatorMergeTask = new OperatorMergeTask();
            if (operatorMergeTask.checkValid(mLContext, featureResult, mergeOptionList)) {
                new StringBuilder("merge operator execute start : ").append(SystemClock.elapsedRealtime());
                operatorMergeTask.addOnTaskFinishListener(new OnTaskFinishListener<String, Map<String, JSONArray>>() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                    public /* bridge */ /* synthetic */ void onTaskFinish(Map<String, Map<String, JSONArray>> map, Map<String, JSONArray> map2, long j, List list2) {
                        onTaskFinish2(map, map2, j, (List<Exception>) list2);
                    }

                    /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                    public void onTaskFinish2(Map<String, Map<String, JSONArray>> map, Map<String, JSONArray> map2, long j, List<Exception> list2) {
                        Object[] objArr2 = {map, map2, new Long(j), list2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df6c18258f6bb4c7c81e0236ac94ecb3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df6c18258f6bb4c7c81e0236ac94ecb3");
                            return;
                        }
                        new StringBuilder("merge operator execute end : ").append(SystemClock.elapsedRealtime());
                        if (map == null || map.isEmpty()) {
                            MLFeatureProcessHelper.this.notifyProcessFailed(preprocessListener, new BlueException(AppUtil.getErrorContent(list2)));
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, Map<String, JSONArray>> entry : map.entrySet()) {
                            if (entry != null) {
                                hashMap.putAll(entry.getValue());
                                arrayList.add(entry.getKey());
                            }
                        }
                        new StringBuilder("operator result is ").append(new JSONObject(hashMap));
                        MLFeatureProcessHelper.this.notifyProcessSuccess(preprocessListener, hashMap, arrayList);
                    }
                });
                operatorMergeTask.start();
                return;
            }
        }
        new StringBuilder("original operator execute start : ").append(SystemClock.elapsedRealtime());
        JSONObject jsonObject = featureResult.toJsonObject();
        if (jsonObject == null) {
            jsonObject = new JSONObject();
        }
        processAllFeatureWithoutMerge(mLContext, jsonObject, list, preprocessListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
        r0 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
        if (r0.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011a, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0124, code lost:
        if (r10 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
        notifyProcessFailed(r20, new com.meituan.android.common.aidata.raptoruploader.BlueException("none result is available", com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader.ERROR_INVALID_OPERATOR_RESULT));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void processAllFeatureWithoutMerge(@android.support.annotation.NonNull final com.meituan.android.common.aidata.ai.mlmodel.MLContext r17, @android.support.annotation.NonNull final org.json.JSONObject r18, @android.support.annotation.NonNull java.util.List<com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessConfig> r19, @android.support.annotation.Nullable final com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.PreprocessListener r20) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.processAllFeatureWithoutMerge(com.meituan.android.common.aidata.ai.mlmodel.MLContext, org.json.JSONObject, java.util.List, com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper$PreprocessListener):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processOneFeature(@NonNull MLContext mLContext, @NonNull JSONObject jSONObject, @NonNull final MLFeatureProcessConfig mLFeatureProcessConfig, @Nullable final IOperatorListener iOperatorListener) {
        Object[] objArr = {mLContext, jSONObject, mLFeatureProcessConfig, iOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6acc204505c1e0ccecd72e5e9fcef8fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6acc204505c1e0ccecd72e5e9fcef8fd");
            return;
        }
        LogUtil.aiLogD(TAG + " processOneFeature(): featureName = " + mLFeatureProcessConfig.getFeatureName() + ", featureSubKey= " + mLFeatureProcessConfig.getFeatureSubKey() + ", size = " + mLFeatureProcessConfig.getOutputSize() + ", feature = " + jSONObject.toString() + ", outName= " + mLFeatureProcessConfig.getOutputName());
        try {
            Object featureFromCacheWithSubKey = getFeatureFromCacheWithSubKey(jSONObject, mLFeatureProcessConfig);
            if (featureFromCacheWithSubKey != null) {
                if (AIDataDelegate.getInstance().isDebugEnable()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(TAG);
                    sb.append(" featureName = ");
                    sb.append(mLFeatureProcessConfig.getFeatureName());
                    sb.append(", featureSubKey= ");
                    sb.append(mLFeatureProcessConfig.getFeatureSubKey());
                    sb.append(" getFeatureFromCacheWithSubKey result=");
                    sb.append(AiFeatureUtil.objectToString(featureFromCacheWithSubKey));
                    if ((featureFromCacheWithSubKey instanceof JSONArray) && ((JSONArray) featureFromCacheWithSubKey).length() == 0) {
                        LogUtil.aiLogE(TAG, "feature is empty");
                    }
                }
                processWithOperatorList(mLContext, featureFromCacheWithSubKey, mLFeatureProcessConfig, new IOperatorListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.6
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorListener
                    public void onSuccess(@Nullable JSONArray jSONArray, @Nullable List<String> list) {
                        Object[] objArr2 = {jSONArray, list};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb3e76f9342f92f629741ab959027920", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb3e76f9342f92f629741ab959027920");
                            return;
                        }
                        if (LogUtil.isLogEnabled()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(MLFeatureProcessHelper.TAG);
                            sb2.append(" processOneFeature(): process success, featureName = ");
                            sb2.append(mLFeatureProcessConfig.getFeatureName());
                            sb2.append(", featureSubKey = ");
                            sb2.append(mLFeatureProcessConfig.getFeatureSubKey());
                            sb2.append(", result = ");
                            sb2.append(AiFeatureUtil.objectToString(jSONArray));
                        }
                        if (jSONArray != null) {
                            MLFeatureProcessHelper.this.notifyOperatorSuccess(iOperatorListener, jSONArray, list);
                        } else {
                            onFailed(new Exception("result is null"));
                        }
                    }

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorListener
                    public void onFailed(@Nullable Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f24eac1bf550eb0764f0b3ab0146e20a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f24eac1bf550eb0764f0b3ab0146e20a");
                            return;
                        }
                        String str = MLFeatureProcessHelper.TAG;
                        LogUtil.aiLogE(str, " processOneFeature(): process failed, featureName = " + mLFeatureProcessConfig.getFeatureName() + ", e = " + AiFeatureUtil.exceptionToString(exc));
                        MLFeatureProcessHelper.this.notifyOperatorFailed(iOperatorListener, exc);
                    }
                });
                return;
            }
            String str = " processOneFeature(): process failed, featureName = " + mLFeatureProcessConfig.getFeatureName() + ", feature is null";
            LogUtil.aiLogE(TAG, str);
            notifyOperatorFailed(iOperatorListener, new Exception(str));
        } catch (Exception e) {
            String str2 = " getFeatureFromCacheWithSubKey() failed, " + e.getMessage() + ", featureName = " + mLFeatureProcessConfig.getFeatureName();
            LogUtil.aiLogE(TAG, str2);
            notifyOperatorFailed(iOperatorListener, new FeatureException(str2));
        }
    }

    private void processWithOperatorList(@NonNull final MLContext mLContext, @NonNull Object obj, @Nullable MLFeatureProcessConfig mLFeatureProcessConfig, @Nullable final IOperatorListener iOperatorListener) {
        Object[] objArr = {mLContext, obj, mLFeatureProcessConfig, iOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36655c5c88c4b07493f446aca0a8f2d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36655c5c88c4b07493f446aca0a8f2d0");
            return;
        }
        final List<OperatorConfig> operatorRuleList = mLFeatureProcessConfig.getOperatorRuleList();
        final String featureName = mLFeatureProcessConfig.getFeatureName();
        final String featureSubKey = mLFeatureProcessConfig.getFeatureSubKey();
        if (operatorRuleList != null && !operatorRuleList.isEmpty()) {
            final int size = operatorRuleList.size();
            final int[] iArr = {0};
            final ArrayList arrayList = new ArrayList();
            processWithOperator(mLContext, featureName, featureSubKey, obj, operatorRuleList.get(0), new ISingleOperatorListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.ISingleOperatorListener
                public void onSuccess(@Nullable JSONArray jSONArray, String str) {
                    Object[] objArr2 = {jSONArray, str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "47a950ea00a0cd026dfb467389b623f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "47a950ea00a0cd026dfb467389b623f0");
                    } else if (jSONArray != null) {
                        arrayList.add(str);
                        StringBuilder sb = new StringBuilder();
                        sb.append(MLFeatureProcessHelper.TAG);
                        sb.append(" processWithOperatorList operatorUniqueIdList=");
                        sb.append(arrayList != null ? arrayList.toString() : "empty");
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + 1;
                        if (iArr[0] < size) {
                            MLFeatureProcessHelper.this.processWithOperator(mLContext, featureName, featureSubKey, jSONArray, (OperatorConfig) operatorRuleList.get(iArr[0]), this, arrayList);
                        } else {
                            MLFeatureProcessHelper.this.notifyOperatorSuccess(iOperatorListener, jSONArray, arrayList);
                        }
                    } else {
                        onFailed(new Exception("operate result is null"));
                    }
                }

                @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.ISingleOperatorListener
                public void onFailed(@Nullable Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5254b7416ca0e8639b7e4e394c9faaca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5254b7416ca0e8639b7e4e394c9faaca");
                    } else {
                        MLFeatureProcessHelper.this.notifyOperatorFailed(iOperatorListener, exc);
                    }
                }
            }, arrayList);
        } else if (obj instanceof Number) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(obj);
            notifyOperatorSuccess(iOperatorListener, jSONArray, new ArrayList());
        } else if (obj instanceof JSONArray) {
            notifyOperatorSuccess(iOperatorListener, (JSONArray) obj, new ArrayList());
        } else {
            notifyOperatorFailed(iOperatorListener, new Exception("has no operator and feature type is illegal, feature=" + featureName + ",featureSubKey=" + featureSubKey));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processWithOperator(@NonNull MLContext mLContext, @NonNull String str, @NonNull String str2, @NonNull Object obj, @NonNull OperatorConfig operatorConfig, @Nullable final ISingleOperatorListener iSingleOperatorListener, @NonNull List<String> list) {
        Object[] objArr = {mLContext, str, str2, obj, operatorConfig, iSingleOperatorListener, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c79c12469697e78b2b918c292d310318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c79c12469697e78b2b918c292d310318");
        } else {
            OperatorService.getInstance().getOperatorManager().operate(mLContext, obj, str, str2, operatorConfig, new ISingleOperatorListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.ISingleOperatorListener
                public void onSuccess(@Nullable JSONArray jSONArray, String str3) {
                    Object[] objArr2 = {jSONArray, str3};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a8d36a3d6870ec7b14ce80a0938ca18", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a8d36a3d6870ec7b14ce80a0938ca18");
                    } else {
                        MLFeatureProcessHelper.this.notifyInnerOperatorSuccess(iSingleOperatorListener, jSONArray, str3);
                    }
                }

                @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.ISingleOperatorListener
                public void onFailed(@Nullable Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "05cdd774d799f3d66e1e53bbaeec6914", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "05cdd774d799f3d66e1e53bbaeec6914");
                    } else {
                        MLFeatureProcessHelper.this.notifyInnerOperatorFailed(iSingleOperatorListener, exc);
                    }
                }
            }, list);
        }
    }

    @Nullable
    private Object getFeatureFromCacheWithSubKey(@NonNull JSONObject jSONObject, @Nullable MLFeatureProcessConfig mLFeatureProcessConfig) {
        Object[] objArr = {jSONObject, mLFeatureProcessConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2cda7a1afda05e57f314130383c5ef2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2cda7a1afda05e57f314130383c5ef2");
        }
        JSONArray jSONArray = new JSONArray();
        if (mLFeatureProcessConfig != null && mLFeatureProcessConfig.isValid()) {
            String featureName = mLFeatureProcessConfig.getFeatureName();
            String featureSubKey = mLFeatureProcessConfig.getFeatureSubKey();
            JSONArray optJSONArray = jSONObject.optJSONArray(featureName);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        jSONArray.put(optJSONObject.opt(featureSubKey));
                    }
                }
            }
        }
        return jSONArray;
    }

    private void saveFeatureToCache(@NonNull Map<String, JSONObject> map, @Nullable JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbb1b5f40f5760a454158c5d9522191d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbb1b5f40f5760a454158c5d9522191d");
        } else if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                    map.put(next, optJSONObject);
                }
            }
        }
    }

    private void getAllFeature(@NonNull MLContext mLContext, @Nullable List<MLFeatureProcessConfig> list, final IAiFeatureListener iAiFeatureListener) {
        Object[] objArr = {mLContext, list, iAiFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbccc1d8ffd0cbc65c11840fba0931cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbccc1d8ffd0cbc65c11840fba0931cc");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append(" getAllFeature");
        if (list != null) {
            List<GetFeatureRequest> generateGetFeatureConfigList = generateGetFeatureConfigList(uniqueByFeature(list));
            if (!generateGetFeatureConfigList.isEmpty()) {
                FeatureService.getInstance().getFeature(mLContext, generateGetFeatureConfigList, new IFeatureListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.MLFeatureProcessHelper.9
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.feature.IFeatureListener
                    public void onSuccess(@Nullable FeatureResult featureResult) {
                        Object[] objArr2 = {featureResult};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fa7f1cd0cd8aa31aba553fb91a0eba7f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fa7f1cd0cd8aa31aba553fb91a0eba7f");
                            return;
                        }
                        new StringBuilder("FeatureService getFeature success, origin feature result = ").append(featureResult.getJsonString());
                        FeatureListenerUtil.callSuccess(iAiFeatureListener, featureResult);
                    }

                    @Override // com.meituan.android.common.aidata.feature.IFeatureListener
                    public void onFailed(@Nullable Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a59f45e04a4eef61f9635e87678c481", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a59f45e04a4eef61f9635e87678c481");
                            return;
                        }
                        new StringBuilder("xFeatureService getFeature fail, result = ").append(exc.getMessage());
                        FeatureListenerUtil.callFailed(iAiFeatureListener, new BlueException(exc, BaseRaptorUploader.ERROR_PRODUCER_NOT_FIND));
                    }
                }, 1);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(TAG);
            sb2.append(" getAllFeature configList is empty");
            FeatureListenerUtil.callFailed(iAiFeatureListener, new BlueException("configList is empty", BaseRaptorUploader.ERROR_PRODUCER_NOT_FIND));
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(TAG);
        sb3.append(" getAllFeature configList is null");
        FeatureListenerUtil.callFailed(iAiFeatureListener, new BlueException("configList is null", BaseRaptorUploader.ERROR_PRODUCER_NOT_FIND));
    }

    @NonNull
    private List<MLFeatureProcessConfig> uniqueByFeature(@NonNull List<MLFeatureProcessConfig> list) {
        boolean z;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ea13f19b5da7a8f7efcade5a759529", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ea13f19b5da7a8f7efcade5a759529");
        }
        LinkedList linkedList = new LinkedList();
        for (MLFeatureProcessConfig mLFeatureProcessConfig : list) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                MLFeatureProcessConfig mLFeatureProcessConfig2 = (MLFeatureProcessConfig) it.next();
                if (mLFeatureProcessConfig2 != null && isSameFeatureRequest(mLFeatureProcessConfig2, mLFeatureProcessConfig)) {
                    if (mLFeatureProcessConfig.getIsRealTime()) {
                        mLFeatureProcessConfig2.setIsRealTime(true);
                    }
                    z = true;
                }
            }
            if (!z) {
                linkedList.add(mLFeatureProcessConfig);
            }
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyProcessSuccess(@Nullable PreprocessListener preprocessListener, @Nullable Map<String, JSONArray> map, @NonNull List<String> list) {
        Object[] objArr = {preprocessListener, map, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31618972e4b0e837f30d38b987c997d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31618972e4b0e837f30d38b987c997d5");
        } else if (preprocessListener != null) {
            preprocessListener.onSuccess(map, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyProcessFailed(@Nullable PreprocessListener preprocessListener, @Nullable BlueException blueException) {
        Object[] objArr = {preprocessListener, blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a066a790b73f1878023f0407be439318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a066a790b73f1878023f0407be439318");
        } else if (preprocessListener != null) {
            preprocessListener.onFailed(blueException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyInnerOperatorSuccess(@Nullable ISingleOperatorListener iSingleOperatorListener, @Nullable JSONArray jSONArray, @Nullable String str) {
        Object[] objArr = {iSingleOperatorListener, jSONArray, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7092396e333f258a0c255db8421309a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7092396e333f258a0c255db8421309a");
        } else {
            OperatorListenerUtil.callSingleSuccess(iSingleOperatorListener, jSONArray, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyInnerOperatorFailed(@Nullable ISingleOperatorListener iSingleOperatorListener, @Nullable Exception exc) {
        Object[] objArr = {iSingleOperatorListener, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84e52710636ff729d9cb88989ee71d75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84e52710636ff729d9cb88989ee71d75");
        } else {
            OperatorListenerUtil.callSingleFailed(iSingleOperatorListener, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyOperatorSuccess(@Nullable IOperatorListener iOperatorListener, @Nullable JSONArray jSONArray, @Nullable List<String> list) {
        Object[] objArr = {iOperatorListener, jSONArray, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "387b8718850e488e9e304fffe220a8f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "387b8718850e488e9e304fffe220a8f5");
        } else {
            OperatorListenerUtil.callSuccess(iOperatorListener, jSONArray, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyOperatorFailed(@Nullable IOperatorListener iOperatorListener, @Nullable Exception exc) {
        Object[] objArr = {iOperatorListener, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea338aa910b1b7cf5192afd038293f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea338aa910b1b7cf5192afd038293f9a");
        } else {
            OperatorListenerUtil.callFailed(iOperatorListener, exc);
        }
    }

    private boolean isTypeValid(@NonNull List list, @NonNull Class cls) {
        Object[] objArr = {list, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80a9791243adc09871cabc9b9cac35fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80a9791243adc09871cabc9b9cac35fa")).booleanValue();
        }
        for (Object obj : list) {
            if (!cls.isInstance(obj)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    private <K, V> Map<K, List<V>> classify(@Nullable List<V> list, IKeyGetter<K, V> iKeyGetter) {
        K key;
        Object[] objArr = {list, iKeyGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13fac4c990981882233fbd26a88ae936", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13fac4c990981882233fbd26a88ae936");
        }
        HashMap hashMap = null;
        if (list != null) {
            hashMap = new HashMap();
            for (V v : list) {
                if (v != null && (key = iKeyGetter.getKey(v)) != null) {
                    List<V> list2 = hashMap.get(key);
                    if (list2 == null) {
                        list2 = new ArrayList<>();
                        hashMap.put(key, list2);
                    }
                    list2.add(v);
                }
            }
        }
        return hashMap;
    }

    private List<GetFeatureRequest> generateGetFeatureConfigList(List<MLFeatureProcessConfig> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5158d4574e15c3ea9450aa584f0a2fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5158d4574e15c3ea9450aa584f0a2fe");
        }
        ArrayList arrayList = new ArrayList();
        for (MLFeatureProcessConfig mLFeatureProcessConfig : list) {
            GetFeatureRequest getFeatureRequest = new GetFeatureRequest();
            getFeatureRequest.feature = mLFeatureProcessConfig.getFeatureName();
            getFeatureRequest.isRealTime = mLFeatureProcessConfig.getIsRealTime();
            arrayList.add(getFeatureRequest);
        }
        return arrayList;
    }

    private boolean isSameFeatureRequest(@Nullable MLFeatureProcessConfig mLFeatureProcessConfig, @Nullable MLFeatureProcessConfig mLFeatureProcessConfig2) {
        Object[] objArr = {mLFeatureProcessConfig, mLFeatureProcessConfig2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33d5b66f15641bbd9cf7c693bf317034", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33d5b66f15641bbd9cf7c693bf317034")).booleanValue();
        }
        if (mLFeatureProcessConfig == mLFeatureProcessConfig2) {
            return true;
        }
        if (mLFeatureProcessConfig == null || mLFeatureProcessConfig2 == null) {
            return false;
        }
        return TextUtils.equals(mLFeatureProcessConfig.getFeatureName(), mLFeatureProcessConfig2.getFeatureName());
    }

    private List<MLFeatureProcessConfig> filterNeedProduceFeatureConfig(JSONObject jSONObject, List<MLFeatureProcessConfig> list) {
        Object[] objArr = {jSONObject, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27cbbf08a2ee20ee4892c43d36699350", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27cbbf08a2ee20ee4892c43d36699350");
        }
        ArrayList arrayList = new ArrayList();
        for (MLFeatureProcessConfig mLFeatureProcessConfig : list) {
            if (!TextUtils.isEmpty(mLFeatureProcessConfig.getFeatureName()) && !jSONObject.has(mLFeatureProcessConfig.getFeatureName())) {
                arrayList.add(mLFeatureProcessConfig);
            }
        }
        return arrayList;
    }
}
