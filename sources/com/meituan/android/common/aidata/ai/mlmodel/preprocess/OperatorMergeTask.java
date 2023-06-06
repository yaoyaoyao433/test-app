package com.meituan.android.common.aidata.ai.mlmodel.preprocess;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.OperatorMergeConfig;
import com.meituan.android.common.aidata.async.AsyncManager;
import com.meituan.android.common.aidata.async.tasks.DependencyTask;
import com.meituan.android.common.aidata.async.tasks.OrderTask;
import com.meituan.android.common.aidata.async.tasks.ResultTask;
import com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable;
import com.meituan.android.common.aidata.async.tasks.TaskAsyncNotifier;
import com.meituan.android.common.aidata.async.tasks.TaskSyncCallable;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.utils.JSCallback;
import com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OperatorMergeTask extends DependencyTask<String, Map<String, JSONArray>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final JSONObject options = getMergeOperatorOptions();
    private final byte[] lock;
    private List<DependencyTask<String, Map<String, JSONArray>>> operatorTaskList;

    public OperatorMergeTask() {
        super("OperatorMergeTask-" + SystemClock.elapsedRealtime());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83f4bdf8cdd7bf62c6452802e6783d90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83f4bdf8cdd7bf62c6452802e6783d90");
        } else {
            this.lock = new byte[0];
        }
    }

    public boolean checkValid(@NonNull MLContext mLContext, @NonNull FeatureResult featureResult, @NonNull Collection<OperatorMergeConfig> collection) {
        List<DependencyTask<String, Map<String, JSONArray>>> generateOperatorTask;
        Object[] objArr = {mLContext, featureResult, collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "448927be0d2f8118d9890b6b4a5f2584", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "448927be0d2f8118d9890b6b4a5f2584")).booleanValue();
        }
        Map<String, Map<String, JSONArray>> feature2SubKeyMap = getFeature2SubKeyMap(featureResult);
        if (feature2SubKeyMap == null || feature2SubKeyMap.isEmpty() || (generateOperatorTask = generateOperatorTask(mLContext, collection, feature2SubKeyMap)) == null || generateOperatorTask.isEmpty()) {
            return false;
        }
        this.operatorTaskList = generateOperatorTask;
        return true;
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask
    public void addChildResult(String str, Map<String, JSONArray> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c83b31276028467b36ddc66c5706c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c83b31276028467b36ddc66c5706c2e");
        } else if (this.isFinish) {
        } else {
            if (map == null) {
                synchronized (this.lock) {
                    this.childResult.clear();
                    notify(null, new BlueException(AppUtil.getErrorContent(this.errorList)));
                }
                return;
            }
            super.addChildResult((OperatorMergeTask) str, (String) map);
        }
    }

    private List<DependencyTask<String, Map<String, JSONArray>>> generateOperatorTask(@NonNull MLContext mLContext, @NonNull Collection<OperatorMergeConfig> collection, @NonNull Map<String, Map<String, JSONArray>> map) {
        JSONArray jSONArray;
        Object[] objArr = {mLContext, collection, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed84c8b563e7e081262735f6b5ce269c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed84c8b563e7e081262735f6b5ce269c");
        }
        List<DependencyTask<String, Map<String, JSONArray>>> linkedList = new LinkedList<>();
        for (OperatorMergeConfig operatorMergeConfig : collection) {
            if (operatorMergeConfig != null) {
                Map<String, JSONArray> hashMap = new HashMap<>();
                JSONArray jSONArray2 = new JSONArray();
                boolean z = operatorMergeConfig.optionOperatorNameList.size() > 0;
                Iterator<MLFeatureProcessConfig> it = operatorMergeConfig.optionFeatureList.iterator();
                while (it.hasNext()) {
                    MLFeatureProcessConfig next = it.next();
                    if (next == null || !next.isValid()) {
                        new StringBuilder("Merge Task finish with one featureConfig is null or invalid,featureName : ").append(next == null ? StringUtil.NULL : next.getFeatureName());
                        return null;
                    }
                    String featureName = next.getFeatureName();
                    String featureSubKey = next.getFeatureSubKey();
                    String outputName = next.getOutputName();
                    Map<String, JSONArray> map2 = map.get(featureName);
                    if (map2 == null || (jSONArray = map2.get(featureSubKey)) == null) {
                        jSONArray = new JSONArray();
                    }
                    hashMap.put(next.getOutputName(), jSONArray);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("feature", jSONArray);
                        JSONArray jSONArray3 = operatorMergeConfig.outNameFirstOperatorParamMap.get(outputName);
                        if (jSONArray3 == null) {
                            StringBuilder sb = new StringBuilder("operator param is null, featureName : ");
                            sb.append(featureName);
                            sb.append(",subKey : ");
                            sb.append(featureSubKey);
                            jSONArray3 = new JSONArray();
                        }
                        jSONObject.put("params", jSONArray3);
                        jSONArray2.put(jSONObject);
                    } catch (JSONException e) {
                        StringBuilder sb2 = new StringBuilder("operator param is null, featureName : ");
                        sb2.append(featureName);
                        sb2.append(",subKey : ");
                        sb2.append(featureSubKey);
                        e.printStackTrace();
                        return null;
                    }
                }
                if (!z) {
                    handleNotMergeOption(hashMap, linkedList);
                } else {
                    DependencyTask<String, Map<String, JSONArray>> dependencyTask = null;
                    for (String str : operatorMergeConfig.optionOperatorNameList) {
                        if (!TextUtils.isEmpty(str)) {
                            if (dependencyTask == null) {
                                dependencyTask = createOperatorTask(mLContext, str, operatorMergeConfig, jSONArray2, false);
                                linkedList.add(dependencyTask);
                            } else {
                                DependencyTask<String, Map<String, JSONArray>> createOperatorTask = createOperatorTask(mLContext, str, operatorMergeConfig, jSONArray2, true);
                                createOperatorTask.dependencyOn(dependencyTask);
                                dependencyTask = createOperatorTask;
                            }
                        }
                    }
                    if (dependencyTask == null) {
                        handleNotMergeOption(hashMap, linkedList);
                    } else {
                        dependencyOn(dependencyTask);
                    }
                }
            }
        }
        return linkedList;
    }

    private void handleNotMergeOption(@NonNull Map<String, JSONArray> map, @NonNull List<DependencyTask<String, Map<String, JSONArray>>> list) {
        Object[] objArr = {map, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac7d01918051291361b6cd2e4ae5a6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac7d01918051291361b6cd2e4ae5a6bf");
            return;
        }
        new StringBuilder("one OperatorMergeConfig not need merge with original result : ").append(new JSONObject(map));
        ResultTask resultTask = new ResultTask("OperatorMergeTask-ResultTask-" + SystemClock.elapsedRealtime(), map);
        list.add(resultTask);
        dependencyOn(resultTask);
    }

    private DependencyTask<String, Map<String, JSONArray>> createOperatorTask(@NonNull final MLContext mLContext, @NonNull final String str, @NonNull final OperatorMergeConfig operatorMergeConfig, @NonNull final JSONArray jSONArray, final boolean z) {
        Object[] objArr = {mLContext, str, operatorMergeConfig, jSONArray, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c1df84d0aa7dbda07766d53635595cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c1df84d0aa7dbda07766d53635595cb");
        }
        return new OrderTask(str + CommonConstant.Symbol.MINUS + AppUtil.getUniqueId(), 3).setAsyncCall(new TaskAsyncCallable<String, Map<String, JSONArray>>() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.OperatorMergeTask.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable
            public void asyncCall(final DependencyTask<String, Map<String, JSONArray>> dependencyTask, final TaskAsyncNotifier<Map<String, JSONArray>> taskAsyncNotifier, long j, boolean z2) {
                Object[] objArr2 = {dependencyTask, taskAsyncNotifier, new Long(j), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "585c3a8fc43bec0a521a0834b2d03786", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "585c3a8fc43bec0a521a0834b2d03786");
                } else {
                    AIDispatcher.getInstance().addJSOperatorTask(mLContext, str, new TaskSyncCallable<AiBundle, Boolean>() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.OperatorMergeTask.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.async.tasks.TaskSyncCallable
                        public Boolean syncCall(AiBundle aiBundle, long j2, boolean z3) {
                            Object[] objArr3 = {aiBundle, new Long(j2), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e0f6ec1fe9c8d7f376fea0d316dc7f2f", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e0f6ec1fe9c8d7f376fea0d316dc7f2f");
                            }
                            OperatorMergeTask.this.realOperate(mLContext, aiBundle, str, operatorMergeConfig, dependencyTask, jSONArray, z, taskAsyncNotifier);
                            return null;
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realOperate(final MLContext mLContext, AiBundle aiBundle, final String str, final OperatorMergeConfig operatorMergeConfig, final DependencyTask<String, Map<String, JSONArray>> dependencyTask, JSONArray jSONArray, final boolean z, final TaskAsyncNotifier<Map<String, JSONArray>> taskAsyncNotifier) {
        Object[] objArr = {mLContext, aiBundle, str, operatorMergeConfig, dependencyTask, jSONArray, Byte.valueOf(z ? (byte) 1 : (byte) 0), taskAsyncNotifier};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97379229fc059b6fb4aa1de569a61386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97379229fc059b6fb4aa1de569a61386");
        } else if (this.isFinish) {
        } else {
            final BaseRaptorUploader addTags = new BaseRaptorUploader().addTags("path", "blue_operator_clean").addTags("operator_name", str).addTags("operator_unique_id", dependencyTask.getTaskUniqueId()).addTags("model_name", mLContext.modelName).addTags("biz", mLContext.getBiz());
            JSONArray createOptionParams = z ? createOptionParams(str, operatorMergeConfig, dependencyTask, taskAsyncNotifier, addTags) : jSONArray;
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD(MLFeatureProcessHelper.TAG + " merge operate task params : " + createOptionParams);
            }
            if (createOptionParams == null) {
                sendRaptor(addTags, mLContext, str, operatorMergeConfig, dependencyTask, null, false, 0L);
                return;
            }
            final JSONArray jSONArray2 = createOptionParams;
            JSExecuteUtil.execute(2, str, aiBundle, createOptionParams, options, new JSCallback() { // from class: com.meituan.android.common.aidata.ai.mlmodel.preprocess.OperatorMergeTask.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                public void onSuccess(String str2, JSValueWrapper jSValueWrapper, int i, long j) {
                    Set<OrderTask> orderChildSet;
                    boolean z2 = true;
                    Object[] objArr2 = {str2, jSValueWrapper, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "23807975157b0e9e9f73a00dc0d855c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "23807975157b0e9e9f73a00dc0d855c5");
                        return;
                    }
                    if (LogUtil.isLogEnabled()) {
                        if ((taskAsyncNotifier instanceof OrderTask) && (orderChildSet = ((OrderTask) taskAsyncNotifier).getOrderChildSet()) != null) {
                            boolean z3 = true;
                            for (OrderTask orderTask : orderChildSet) {
                                if (orderTask != null) {
                                    StringBuilder sb = new StringBuilder("multi operator : \npre operator task : ");
                                    sb.append((String) orderTask.getTaskUniqueId());
                                    sb.append("\npre is waiting task : ");
                                    sb.append(orderTask.getOrderChildSet().size() > 0);
                                    sb.append("\npre result : ");
                                    sb.append(new JSONObject((Map) orderTask.getResult()));
                                    sb.append("\ncur task :");
                                    sb.append((String) dependencyTask.getTaskUniqueId());
                                    sb.append("\ncur is waiting task : ");
                                    sb.append(z);
                                    sb.append("\ncur params : ");
                                    sb.append(jSONArray2);
                                    sb.append("\nall result :");
                                    sb.append(jSValueWrapper != null ? jSValueWrapper.stringValue() : StringUtil.NULL);
                                    z3 = false;
                                }
                            }
                            z2 = z3;
                        }
                        if (z2) {
                            StringBuilder sb2 = new StringBuilder("cur operator task all result : ");
                            sb2.append((String) dependencyTask.getTaskUniqueId());
                            sb2.append("\nis waiting task : ");
                            sb2.append(z);
                            sb2.append("\nparams : ");
                            sb2.append(jSONArray2);
                            sb2.append("\nall result : ");
                            sb2.append(jSValueWrapper != null ? jSValueWrapper.stringValue() : StringUtil.NULL);
                        }
                    }
                    OperatorMergeTask.this.handleResult(jSValueWrapper, (String) dependencyTask.getTaskUniqueId(), operatorMergeConfig, taskAsyncNotifier, addTags);
                    OperatorMergeTask.this.sendRaptor(addTags, mLContext, str, operatorMergeConfig, dependencyTask, jSONArray2, true, j);
                }

                @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                public void onFailed(String str2, BlueException blueException, int i, long j) {
                    Object[] objArr2 = {str2, blueException, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a051621be85f175a1c1f2160147df52b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a051621be85f175a1c1f2160147df52b");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("cur task failed\ntask : ");
                    sb.append((String) dependencyTask.getTaskUniqueId());
                    sb.append("\nis waiting task : ");
                    sb.append(z);
                    sb.append("\nparams : ");
                    sb.append(jSONArray2);
                    sb.append("\nerror : ");
                    sb.append(blueException.getMessage());
                    taskAsyncNotifier.notify(null, blueException);
                    OperatorMergeTask.this.sendRaptor(addTags, mLContext, str, operatorMergeConfig, dependencyTask, jSONArray2, false, j);
                }
            });
        }
    }

    private JSONArray createOptionParams(@NonNull String str, @NonNull OperatorMergeConfig operatorMergeConfig, @NonNull DependencyTask<String, Map<String, JSONArray>> dependencyTask, @NonNull TaskAsyncNotifier<Map<String, JSONArray>> taskAsyncNotifier, @NonNull BaseRaptorUploader baseRaptorUploader) {
        Map<String, JSONArray> map;
        Object[] objArr = {str, operatorMergeConfig, dependencyTask, taskAsyncNotifier, baseRaptorUploader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78a93435e51f5d1113e6ea84a183bbe3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78a93435e51f5d1113e6ea84a183bbe3");
        }
        Map<String, Map<String, JSONArray>> childResult = dependencyTask.getChildResult();
        if (childResult == null || childResult.isEmpty()) {
            taskAsyncNotifier.notify(null, new IllegalArgumentException("waiting operator child result is empty"));
            return null;
        }
        Iterator<Map.Entry<String, Map<String, JSONArray>>> it = childResult.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                map = null;
                break;
            }
            Map.Entry<String, Map<String, JSONArray>> next = it.next();
            if (next != null) {
                map = next.getValue();
                break;
            }
        }
        if (map == null) {
            taskAsyncNotifier.notify(null, new IllegalArgumentException("pre operator execute result is null,pre operator : " + str));
            return null;
        } else if (map.size() != operatorMergeConfig.optionFeatureList.size()) {
            taskAsyncNotifier.notify(null, new IllegalArgumentException("pre operator result size : " + map.size() + " not equals featureList size : " + operatorMergeConfig.optionFeatureList.size() + ",cur operator name is " + str + ",pre result content is " + map));
            return null;
        } else {
            JSONArray jSONArray = new JSONArray();
            for (MLFeatureProcessConfig mLFeatureProcessConfig : operatorMergeConfig.optionFeatureList) {
                JSONObject jSONObject = new JSONObject();
                try {
                    String outputName = mLFeatureProcessConfig.getOutputName();
                    jSONObject.put("feature", map.get(outputName));
                    Map<String, JSONArray> map2 = operatorMergeConfig.outNameOperatorParamMap.get(outputName);
                    JSONArray jSONArray2 = map2 != null ? map2.get(str) : null;
                    if (jSONArray2 == null) {
                        jSONArray2 = new JSONArray();
                    }
                    jSONObject.put("params", jSONArray2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    taskAsyncNotifier.notify(null, new IllegalArgumentException("JSON put error : " + e));
                    return null;
                }
            }
            return jSONArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResult(JSValueWrapper jSValueWrapper, @NonNull String str, @NonNull OperatorMergeConfig operatorMergeConfig, @NonNull TaskAsyncNotifier<Map<String, JSONArray>> taskAsyncNotifier, BaseRaptorUploader baseRaptorUploader) {
        Object[] objArr = {jSValueWrapper, str, operatorMergeConfig, taskAsyncNotifier, baseRaptorUploader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "487650f6045383fef2e27284ab983e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "487650f6045383fef2e27284ab983e6d");
        } else if (jSValueWrapper == null) {
            taskAsyncNotifier.notify(null, new IllegalArgumentException("js execute success but callback null : " + str));
        } else {
            JSONArray jSONArrayData = jSValueWrapper.getJSONArrayData();
            if (jSONArrayData == null) {
                jSONArrayData = new JSONArray();
            }
            int length = jSONArrayData.length();
            if (length != operatorMergeConfig.optionFeatureList.size()) {
                taskAsyncNotifier.notify(null, new IllegalArgumentException("js execute success but merge result size (" + length + ") not equals optionFeatureList size (" + operatorMergeConfig.optionFeatureList.size() + ") : " + str));
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArrayData.optJSONObject(i);
                if (optJSONObject == null) {
                    taskAsyncNotifier.notify(null, new IllegalArgumentException("js execute success but one item result is null : " + str));
                    return;
                }
                boolean optBoolean = optJSONObject.optBoolean("isSuccess", false);
                JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                MLFeatureProcessConfig mLFeatureProcessConfig = operatorMergeConfig.optionFeatureList.get(i);
                if (!optBoolean) {
                    StringBuilder sb = new StringBuilder("js execute success but one item fail : ");
                    sb.append(str);
                    sb.append(" : ");
                    sb.append(optJSONArray == null ? StringUtil.NULL : optJSONArray.toString());
                    taskAsyncNotifier.notify(null, new IllegalArgumentException(sb.toString()));
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(mLFeatureProcessConfig.getFeatureName(), mLFeatureProcessConfig.getFeatureSubKey());
                        baseRaptorUploader.addExtra(RaptorConstants.OPERATOR_FAIL_KV, jSONObject);
                        return;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                hashMap.put(mLFeatureProcessConfig.getOutputName(), optJSONArray);
            }
            taskAsyncNotifier.notify(hashMap, null);
        }
    }

    private Map<String, Map<String, JSONArray>> getFeature2SubKeyMap(FeatureResult featureResult) {
        Map<String, List<ResultRow>> data;
        Map<String, Object> map;
        String key;
        Object[] objArr = {featureResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecf8ad2a5d2b9217e53a4dd59640e95a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecf8ad2a5d2b9217e53a4dd59640e95a");
        }
        if (featureResult == null || (data = featureResult.getData()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<ResultRow>> entry : data.entrySet()) {
            if (entry != null) {
                HashMap hashMap2 = new HashMap();
                List<ResultRow> value = entry.getValue();
                if (value == null || value.isEmpty()) {
                    new StringBuilder("one feature result is empty, featureName : ").append(entry.getKey());
                    hashMap.put(entry.getKey(), hashMap2);
                } else {
                    for (ResultRow resultRow : value) {
                        if (resultRow == null || (map = resultRow.toMap()) == null) {
                            new StringBuilder("one feature result is null, featureName : ").append(entry.getKey());
                        } else {
                            for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                                if (entry2 == null || (key = entry2.getKey()) == null) {
                                    new StringBuilder("one feature subKey is null featureName : ").append(entry.getKey());
                                } else {
                                    JSONArray jSONArray = (JSONArray) hashMap2.get(key);
                                    if (jSONArray == null) {
                                        jSONArray = new JSONArray();
                                        hashMap2.put(key, jSONArray);
                                    }
                                    jSONArray.put(entry2.getValue());
                                }
                            }
                        }
                    }
                    hashMap.put(entry.getKey(), hashMap2);
                }
            }
        }
        new StringBuilder("feature->(subKey->data) : ").append(new JSONObject(hashMap));
        return hashMap;
    }

    public static JSONObject getMergeOperatorOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "535ca4f50c3c31155a2e954c6176fd80", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "535ca4f50c3c31155a2e954c6176fd80");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(JSExecuteUtil.KEY_JS_OPTIONS_EXECUTE_MODE, JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH);
        hashMap.put(JSExecuteUtil.KEY_JS_OPTIONS_CATCH_ERROR_MODE, JSExecuteUtil.VALUE_JS_OPTIONS_CATCH_ERROR_MODE_RETURN_ERROR_ONLY);
        return new JSONObject(hashMap);
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e190a57554a331c5dfceb49b25f2e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e190a57554a331c5dfceb49b25f2e51");
        } else if (this.operatorTaskList == null) {
        } else {
            if (LogUtil.isLogEnabled()) {
                StringBuilder sb = new StringBuilder("Merge Task start\nExecute task list : ");
                sb.append(this.operatorTaskList);
                sb.append("\ndependency task list : ");
                sb.append(getChildren());
            }
            AsyncManager.executeSingle(this, 4);
            AsyncManager.executeList(this.operatorTaskList, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRaptor(BaseRaptorUploader baseRaptorUploader, MLContext mLContext, String str, OperatorMergeConfig operatorMergeConfig, DependencyTask<String, Map<String, JSONArray>> dependencyTask, JSONArray jSONArray, boolean z, long j) {
        int i;
        int i2;
        int i3;
        JSONArray optJSONArray;
        Object[] objArr = {baseRaptorUploader, mLContext, str, operatorMergeConfig, dependencyTask, jSONArray, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "269fdacf4474cdfe42e137fe10956651", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "269fdacf4474cdfe42e137fe10956651");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (jSONArray != null) {
            i3 = jSONArray.length();
            int size = operatorMergeConfig.optionFeatureList.size();
            i = 0;
            i2 = 0;
            for (int i4 = 0; i4 < i3; i4++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("feature")) != null) {
                    if (i4 < size) {
                        sb.append(operatorMergeConfig.optionFeatureList.get(i4).getFeatureName());
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                    i += optJSONArray.toString().getBytes().length;
                    i2 += optJSONArray.length();
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        baseRaptorUploader.addValues("blue_operator_value_size", Integer.valueOf(i)).addValues("blue_operator_value_num", Integer.valueOf(i2)).addValues("blue_operator_duration", Long.valueOf(j != 0 ? SystemClock.elapsedRealtime() - j : 0L)).addTags(RaptorConstants.JS_BATCH_NUM, i3).addTags("feature", sb.length() == 0 ? StringUtil.NULL : sb.substring(0, sb.length() - 1));
        if (z) {
            baseRaptorUploader.addTags("status", "success").addTags("errorCode", "0");
        } else {
            baseRaptorUploader.addTags("status", "fail").addExtra("fail_detail", dependencyTask.getErrorContent());
            List<Exception> errorList = dependencyTask.getErrorList();
            if (!errorList.isEmpty()) {
                Exception exc = errorList.get(0);
                baseRaptorUploader.addTags("errorCode", exc instanceof BlueException ? ((BlueException) exc).getErrorCode() : "-1");
            }
        }
        baseRaptorUploader.send();
        senCat(str, dependencyTask, z, j);
    }

    private void senCat(String str, DependencyTask<String, Map<String, JSONArray>> dependencyTask, boolean z, long j) {
        Object[] objArr = {str, dependencyTask, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f707fbdeebc7f035ae12a0db67439819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f707fbdeebc7f035ae12a0db67439819");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            CatMonitorManager.getInstance().addCommonParam(jSONObject);
            CatMonitorManager.addEnv(jSONObject);
            jSONObject.put("operator_name", str);
            jSONObject.put("operator_unique_id", dependencyTask.getTaskUniqueId());
            long j2 = 0;
            if (j != 0) {
                j2 = SystemClock.elapsedRealtime() - j;
            }
            jSONObject.put("duration", j2);
            if (!z) {
                jSONObject.put("error", dependencyTask.getErrorContent());
                jSONObject.put("status", 1);
            } else {
                jSONObject.put("status", 0);
            }
            jSONObject.put("resultData", this.result);
            CatMonitorManager.getInstance().startService("", "aidata_operator_finish", 0, 0, 0, 0L, jSONObject.toString(), CatMonitorManager.getInstance().getSampleRate());
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_operator_finish】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }
}
