package com.meituan.android.common.aidata.feature.task;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.async.AsyncManager;
import com.meituan.android.common.aidata.async.CreateTaskListener;
import com.meituan.android.common.aidata.async.tasks.DependencyTask;
import com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener;
import com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable;
import com.meituan.android.common.aidata.async.tasks.TaskAsyncNotifier;
import com.meituan.android.common.aidata.async.tasks.TaskSyncCallable;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.feature.FeatureService;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureManager;
import com.meituan.android.common.aidata.feature.JSFeatureManager;
import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.android.common.aidata.feature.UpdateFeatureRequest;
import com.meituan.android.common.aidata.feature.bean.JSFeatureConfig;
import com.meituan.android.common.aidata.feature.persona.PersonaManager;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.utils.JSCallback;
import com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.resources.bean.BundleWaitTime;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.android.common.aidata.resources.config.DDResourceRequest;
import com.meituan.android.common.aidata.resources.config.ResourceConfigManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GenerateFeatureTask extends DependencyTask<GetFeatureRequest, Map<String, List<ResultRow>>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int consumeType;
    private final Set<GetFeatureRequest> cycleConsumeTypeSet;
    private List<DependencyTask<GetFeatureRequest, Map<String, List<ResultRow>>>> dependencyTasks;
    private IFeatureManager featureManager;
    private List<GetFeatureRequest> featureRequests;
    public final TaskAsyncCallable<GetFeatureRequest, Map<String, List<ResultRow>>> jsCall;
    private MLContext mlContext;
    private final Set<GetFeatureRequest> originConsumeTypeSet;
    private JSFeatureOutParamsCallback outParamsCallback;
    public final TaskSyncCallable<GetFeatureRequest, Map<String, List<ResultRow>>> personaCall;
    private final Set<GetFeatureRequest> produceTypeSet;
    private final Set<GetFeatureRequest> realTimeSet;
    public final TaskAsyncCallable<GetFeatureRequest, Map<String, List<ResultRow>>> sqlAsyncCall;

    public GenerateFeatureTask(@NonNull MLContext mLContext, List<GetFeatureRequest> list, int i, IFeatureManager iFeatureManager) {
        super(new GetFeatureRequest());
        Object[] objArr = {mLContext, list, Integer.valueOf(i), iFeatureManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea4431286a9f33adef663859e68b35e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea4431286a9f33adef663859e68b35e6");
            return;
        }
        this.realTimeSet = new HashSet();
        this.originConsumeTypeSet = new HashSet();
        this.cycleConsumeTypeSet = new HashSet();
        this.produceTypeSet = new HashSet();
        this.sqlAsyncCall = new TaskAsyncCallable<GetFeatureRequest, Map<String, List<ResultRow>>>() { // from class: com.meituan.android.common.aidata.feature.task.GenerateFeatureTask.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable
            public void asyncCall(DependencyTask<GetFeatureRequest, Map<String, List<ResultRow>>> dependencyTask, final TaskAsyncNotifier<Map<String, List<ResultRow>>> taskAsyncNotifier, long j, boolean z) {
                Object[] objArr2 = {dependencyTask, taskAsyncNotifier, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "65082a6169f608cb97ed103c108e44ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "65082a6169f608cb97ed103c108e44ca");
                    return;
                }
                final GetFeatureRequest taskUniqueId = dependencyTask.getTaskUniqueId();
                if (taskUniqueId == null) {
                    taskAsyncNotifier.notify(null, new Exception("TaskUniqueId is null"));
                    return;
                }
                DDResourceRequest featureDDRequest = ResourceConfigManager.getInstance().getFeatureDDRequest(taskUniqueId.feature);
                if (featureDDRequest == null) {
                    taskAsyncNotifier.notify(null, new Exception("Horn config : " + taskUniqueId.feature + " is null"));
                } else if (!AIDispatcher.getInstance().isValidSQLFeature(featureDDRequest)) {
                    MLContext mLContext2 = GenerateFeatureTask.this.mlContext;
                    mLContext2.addBundleWaitTime(new BundleWaitTime("SQLFeature_" + taskUniqueId.feature, true));
                    new StringBuilder("SQL CEP is need download : ").append(taskUniqueId.feature);
                    AsyncManager.executeSingle(AIDispatcher.getInstance().generateCEPTask(featureDDRequest).addOnTaskFinishListener(new OnTaskFinishListener<DDResourceRequest, List<FeatureBean>>() { // from class: com.meituan.android.common.aidata.feature.task.GenerateFeatureTask.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                        public /* bridge */ /* synthetic */ void onTaskFinish(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list2, long j2, List list3) {
                            onTaskFinish2(map, list2, j2, (List<Exception>) list3);
                        }

                        /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                        public void onTaskFinish2(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list2, long j2, List<Exception> list3) {
                            Object[] objArr3 = {map, list2, new Long(j2), list3};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "08489398316ad412d209a0f4c84b14f0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "08489398316ad412d209a0f4c84b14f0");
                                return;
                            }
                            MLContext mLContext3 = GenerateFeatureTask.this.mlContext;
                            mLContext3.addBundleWaitTime(new BundleWaitTime("SQLFeature_" + taskUniqueId.feature, false));
                            if (list2 == null || list2.isEmpty()) {
                                TaskAsyncNotifier taskAsyncNotifier2 = taskAsyncNotifier;
                                taskAsyncNotifier2.notify(null, new Exception("load sql bundle fail : " + taskUniqueId.feature));
                                return;
                            }
                            StringBuilder sb = new StringBuilder("SQL CEP download success : ");
                            sb.append(taskUniqueId.feature);
                            sb.append("，is realTime : ");
                            sb.append(GenerateFeatureTask.this.realTimeSet.contains(taskUniqueId));
                            taskAsyncNotifier.notify(GenerateFeatureTask.this.featureManager.getFeature(GenerateFeatureTask.this.mlContext, taskUniqueId, GenerateFeatureTask.this.realTimeSet.contains(taskUniqueId), GenerateFeatureTask.this.getOriginConsumeType(taskUniqueId), GenerateFeatureTask.this.getCycleConsumeType(taskUniqueId), GenerateFeatureTask.this.produceTypeSet.contains(taskUniqueId)), null);
                        }
                    }), 2);
                } else {
                    StringBuilder sb = new StringBuilder("SQL CEP is ready : ");
                    sb.append(taskUniqueId.feature);
                    sb.append(" : realTime : ");
                    sb.append(GenerateFeatureTask.this.realTimeSet.contains(taskUniqueId));
                    taskAsyncNotifier.notify(GenerateFeatureTask.this.featureManager.getFeature(GenerateFeatureTask.this.mlContext, taskUniqueId, GenerateFeatureTask.this.realTimeSet.contains(taskUniqueId), GenerateFeatureTask.this.getOriginConsumeType(taskUniqueId), GenerateFeatureTask.this.getCycleConsumeType(taskUniqueId), GenerateFeatureTask.this.produceTypeSet.contains(taskUniqueId)), null);
                }
            }
        };
        this.personaCall = new TaskSyncCallable<GetFeatureRequest, Map<String, List<ResultRow>>>() { // from class: com.meituan.android.common.aidata.feature.task.GenerateFeatureTask.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.tasks.TaskSyncCallable
            public Map<String, List<ResultRow>> syncCall(GetFeatureRequest getFeatureRequest, long j, boolean z) {
                Object[] objArr2 = {getFeatureRequest, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "131700ddd34d0c8923ecfe476f7dd77e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "131700ddd34d0c8923ecfe476f7dd77e");
                }
                if (getFeatureRequest == null) {
                    return null;
                }
                return PersonaManager.getInstance().getPersonaFeature(getFeatureRequest.feature, GenerateFeatureTask.this.getOriginConsumeType(getFeatureRequest), GenerateFeatureTask.this.getCycleConsumeType(getFeatureRequest));
            }
        };
        this.jsCall = new TaskAsyncCallable<GetFeatureRequest, Map<String, List<ResultRow>>>() { // from class: com.meituan.android.common.aidata.feature.task.GenerateFeatureTask.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable
            public void asyncCall(final DependencyTask<GetFeatureRequest, Map<String, List<ResultRow>>> dependencyTask, final TaskAsyncNotifier<Map<String, List<ResultRow>>> taskAsyncNotifier, long j, boolean z) {
                final GetFeatureRequest taskUniqueId;
                AiBundle jSFeatureBundle;
                Object[] objArr2 = {dependencyTask, taskAsyncNotifier, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a334044c2aae0b064e7d51ecfce0f4bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a334044c2aae0b064e7d51ecfce0f4bb");
                    return;
                }
                if (dependencyTask != null && (taskUniqueId = dependencyTask.getTaskUniqueId()) != null && (jSFeatureBundle = JSFeatureManager.getInstance().getJSFeatureBundle(taskUniqueId.feature)) != null && jSFeatureBundle.getJSInstance() != null) {
                    new StringBuilder("JSFeature produce type : realTime : ").append(GenerateFeatureTask.this.realTimeSet.contains(taskUniqueId));
                    if (!GenerateFeatureTask.this.realTimeSet.contains(taskUniqueId)) {
                        taskAsyncNotifier.notify(GenerateFeatureTask.this.featureManager.getFeature(GenerateFeatureTask.this.mlContext, taskUniqueId, false, GenerateFeatureTask.this.getOriginConsumeType(taskUniqueId), GenerateFeatureTask.this.getCycleConsumeType(taskUniqueId), GenerateFeatureTask.this.produceTypeSet.contains(taskUniqueId)), null);
                        return;
                    }
                    final String uniqueId = AppUtil.getUniqueId();
                    final FeatureBean featureBean = new FeatureBean();
                    featureBean.feature = taskUniqueId.feature;
                    if (jSFeatureBundle.getJsConfig() instanceof JSFeatureConfig) {
                        featureBean.ver = ((JSFeatureConfig) jSFeatureBundle.getJsConfig()).version;
                    }
                    CatMonitorManager.getInstance().recordSqlFeatureProduceForRealTime(featureBean, uniqueId, GenerateFeatureTask.this.produceTypeSet.contains(taskUniqueId));
                    JSONObject outParams = GenerateFeatureTask.this.outParamsCallback != null ? GenerateFeatureTask.this.outParamsCallback.getOutParams(taskUniqueId.feature) : null;
                    JSONArray generateJSScriptParams = JSFeatureManager.getInstance().generateJSScriptParams(dependencyTask.getChildResult(), outParams);
                    StringBuilder sb = new StringBuilder("JSFeature ==");
                    sb.append(dependencyTask.getTaskUniqueId().feature);
                    sb.append("outParams : ");
                    sb.append(outParams);
                    sb.append("\n final script input params : ");
                    sb.append(generateJSScriptParams.toString());
                    JSExecuteUtil.execute(1, taskUniqueId.feature, jSFeatureBundle, generateJSScriptParams, new JSCallback() { // from class: com.meituan.android.common.aidata.feature.task.GenerateFeatureTask.3.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                        public void onSuccess(String str, JSValueWrapper jSValueWrapper, int i2, long j2) {
                            Object[] objArr3 = {str, jSValueWrapper, Integer.valueOf(i2), new Long(j2)};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2db06afd72d9fd3754a9851791e2fd4a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2db06afd72d9fd3754a9851791e2fd4a");
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(taskUniqueId.feature);
                            sb2.append(" js execute original result is ");
                            sb2.append(jSValueWrapper.stringValue());
                            Map<String, List<ResultRow>> parseJSResult = JSFeatureManager.getInstance().parseJSResult(taskUniqueId.feature, jSValueWrapper);
                            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
                            UpdateFeatureRequest updateFeatureRequest = new UpdateFeatureRequest();
                            updateFeatureRequest.feature = parseJSResult;
                            FeatureService.getInstance().getFeatureManager().updateFeature(updateFeatureRequest);
                            taskAsyncNotifier.notify(parseJSResult, null);
                            int originConsumeType = GenerateFeatureTask.this.getOriginConsumeType(taskUniqueId);
                            if (originConsumeType != -1) {
                                CatMonitorManager.getInstance().recordFeatureQuery(taskUniqueId.feature, uniqueId, originConsumeType, parseJSResult);
                            }
                            int cycleConsumeType = GenerateFeatureTask.this.getCycleConsumeType(taskUniqueId);
                            if (cycleConsumeType != -1) {
                                CatMonitorManager.getInstance().recordFeatureQuery(taskUniqueId.feature, AppUtil.getUniqueId(), cycleConsumeType, parseJSResult);
                            }
                            CatMonitorManager.getInstance().recordSqlFeatureProduceFinish(featureBean, uniqueId, 0, "", "0", elapsedRealtime, parseJSResult, GenerateFeatureTask.this.produceTypeSet.contains(taskUniqueId), GenerateFeatureTask.this.mlContext.modelName, null);
                        }

                        @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                        public void onFailed(String str, BlueException blueException, int i2, long j2) {
                            Object[] objArr3 = {str, blueException, Integer.valueOf(i2), new Long(j2)};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1e9b6471fcabb9d7279bd13cd30dfb4d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1e9b6471fcabb9d7279bd13cd30dfb4d");
                                return;
                            }
                            if (blueException != null) {
                                blueException.printStackTrace();
                            }
                            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
                            StringBuilder sb2 = new StringBuilder("JSFeature ==");
                            sb2.append(((GetFeatureRequest) dependencyTask.getTaskUniqueId()).feature);
                            sb2.append("== script execute failed");
                            taskAsyncNotifier.notify(null, blueException);
                            int originConsumeType = GenerateFeatureTask.this.getOriginConsumeType(taskUniqueId);
                            if (originConsumeType != -1) {
                                CatMonitorManager.getInstance().recordFeatureQuery(taskUniqueId.feature, uniqueId, originConsumeType, null);
                            }
                            int cycleConsumeType = GenerateFeatureTask.this.getCycleConsumeType(taskUniqueId);
                            if (cycleConsumeType != -1) {
                                CatMonitorManager.getInstance().recordFeatureQuery(taskUniqueId.feature, AppUtil.getUniqueId(), cycleConsumeType, null);
                            }
                            String str2 = "error message is empty";
                            String str3 = "-1";
                            if (blueException != null) {
                                str2 = blueException.getMessage();
                                str3 = blueException.getErrorCode();
                            }
                            CatMonitorManager.getInstance().recordSqlFeatureProduceFinish(featureBean, uniqueId, 1, str2, str3, elapsedRealtime, null, GenerateFeatureTask.this.produceTypeSet.contains(taskUniqueId), GenerateFeatureTask.this.mlContext.modelName, null);
                        }
                    });
                    return;
                }
                StringBuilder sb2 = new StringBuilder("JSFeature == ");
                sb2.append((dependencyTask == null || dependencyTask.getTaskUniqueId() == null) ? "" : dependencyTask.getTaskUniqueId().feature);
                sb2.append(" == is not legal");
                taskAsyncNotifier.notify(null, new Exception("JSFeature is not legal"));
            }
        };
        if (iFeatureManager == null) {
            return;
        }
        this.mlContext = mLContext;
        this.outParamsCallback = mLContext.outParamsCallback;
        this.consumeType = i;
        this.featureManager = iFeatureManager;
        this.featureRequests = list;
    }

    private void init(final List<GetFeatureRequest> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df65fc0663fac25c9c8673487ee661b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df65fc0663fac25c9c8673487ee661b0");
            return;
        }
        this.originConsumeTypeSet.addAll(list);
        this.dependencyTasks = AsyncManager.generateTask(getTaskUniqueId(), new CreateTaskListener<GetFeatureRequest, Map<String, List<ResultRow>>>() { // from class: com.meituan.android.common.aidata.feature.task.GenerateFeatureTask.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.CreateTaskListener
            public DependencyTask<GetFeatureRequest, Map<String, List<ResultRow>>> create(GetFeatureRequest getFeatureRequest) {
                Object[] objArr2 = {getFeatureRequest};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f04a928b036876d2a9ec132dad7af551", RobustBitConfig.DEFAULT_VALUE)) {
                    return (DependencyTask) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f04a928b036876d2a9ec132dad7af551");
                }
                if (getFeatureRequest == null) {
                    return null;
                }
                if (GenerateFeatureTask.this.getTaskUniqueId() == getFeatureRequest) {
                    return GenerateFeatureTask.this;
                }
                if (TextUtils.isEmpty(getFeatureRequest.feature)) {
                    return null;
                }
                DependencyTask dependencyTask = new DependencyTask(getFeatureRequest);
                if (getFeatureRequest.isRealTime) {
                    GenerateFeatureTask.this.realTimeSet.add(getFeatureRequest);
                }
                if (JSFeatureManager.getInstance().isJSFeature(getFeatureRequest.feature)) {
                    return dependencyTask.setAsyncCall(GenerateFeatureTask.this.jsCall);
                }
                if (PersonaManager.getInstance().isPersonaFeature(getFeatureRequest.feature)) {
                    return dependencyTask.setSyncCall(GenerateFeatureTask.this.personaCall);
                }
                if (ResourceConfigManager.getInstance().getFeatureDDRequest(getFeatureRequest.feature) != null) {
                    return dependencyTask.setAsyncCall(GenerateFeatureTask.this.sqlAsyncCall);
                }
                return null;
            }

            @Override // com.meituan.android.common.aidata.async.CreateTaskListener
            public void onHitCacheTask(DependencyTask<GetFeatureRequest, Map<String, List<ResultRow>>> dependencyTask, GetFeatureRequest getFeatureRequest) {
                Object[] objArr2 = {dependencyTask, getFeatureRequest};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "56b475fca4b1e6e92b09dfbb15567ef4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "56b475fca4b1e6e92b09dfbb15567ef4");
                } else if (getFeatureRequest == null || !getFeatureRequest.isRealTime) {
                } else {
                    GenerateFeatureTask.this.realTimeSet.add(getFeatureRequest);
                }
            }

            @Override // com.meituan.android.common.aidata.async.CreateTaskListener
            public List<GetFeatureRequest> getChildUniqueId(GetFeatureRequest getFeatureRequest) {
                Object[] objArr2 = {getFeatureRequest};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "887753c23f948109d6de53aadb223730", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "887753c23f948109d6de53aadb223730");
                }
                if (getFeatureRequest == null) {
                    return null;
                }
                if (getFeatureRequest == GenerateFeatureTask.this.getTaskUniqueId()) {
                    return list;
                }
                List<GetFeatureRequest> jSFeatureChild = JSFeatureManager.getInstance().isJSFeature(getFeatureRequest.feature) ? JSFeatureManager.getInstance().getJSFeatureChild(getFeatureRequest.feature) : null;
                if (jSFeatureChild == null || jSFeatureChild.size() <= 0) {
                    GenerateFeatureTask.this.produceTypeSet.add(getFeatureRequest);
                } else {
                    for (GetFeatureRequest getFeatureRequest2 : jSFeatureChild) {
                        if (getFeatureRequest2 != null) {
                            if (getFeatureRequest2.isRealTime) {
                                GenerateFeatureTask.this.realTimeSet.add(getFeatureRequest2);
                            }
                            GenerateFeatureTask.this.cycleConsumeTypeSet.add(getFeatureRequest2);
                        }
                    }
                }
                if (getFeatureRequest.isRealTime) {
                    return jSFeatureChild;
                }
                return null;
            }
        });
    }

    public void execute() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3ab382d486379bab8fcccf3dfeec550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3ab382d486379bab8fcccf3dfeec550");
            return;
        }
        init(this.featureRequests);
        if (this.dependencyTasks == null || this.dependencyTasks.size() <= 0) {
            notify(null, new Exception("no feature task need execute"));
            return;
        }
        new StringBuilder("realTime set : ").append(this.realTimeSet);
        AsyncManager.executeList(this.dependencyTasks, 3);
    }

    public int getOriginConsumeType(GetFeatureRequest getFeatureRequest) {
        Object[] objArr = {getFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "493779d433293639c91ede3210de538c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "493779d433293639c91ede3210de538c")).intValue();
        }
        if (getFeatureRequest == null || !this.originConsumeTypeSet.contains(getFeatureRequest)) {
            return -1;
        }
        return this.consumeType;
    }

    public int getCycleConsumeType(GetFeatureRequest getFeatureRequest) {
        Object[] objArr = {getFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "887d24ce59df79c46ce5f2ee207bb5d7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "887d24ce59df79c46ce5f2ee207bb5d7")).intValue() : (getFeatureRequest == null || !this.cycleConsumeTypeSet.contains(getFeatureRequest)) ? -1 : 2;
    }
}
