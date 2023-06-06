package com.meituan.android.common.aidata.ai;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.bundle.AiBundleManager;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager;
import com.meituan.android.common.aidata.async.AsyncManager;
import com.meituan.android.common.aidata.async.tasks.DependencyTask;
import com.meituan.android.common.aidata.async.tasks.EmptyTask;
import com.meituan.android.common.aidata.async.tasks.ErrorTask;
import com.meituan.android.common.aidata.async.tasks.HolderTask;
import com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener;
import com.meituan.android.common.aidata.async.tasks.ResultTask;
import com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable;
import com.meituan.android.common.aidata.async.tasks.TaskAsyncNotifier;
import com.meituan.android.common.aidata.async.tasks.TaskSyncCallable;
import com.meituan.android.common.aidata.cep.rule.IRuleTrigger;
import com.meituan.android.common.aidata.cep.rule.cep.CepRuleTrigger;
import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.android.common.aidata.feature.FeatureService;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.JSFeatureManager;
import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.android.common.aidata.feature.optimize.cep.CEPSubTableCEPServiceManager;
import com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper;
import com.meituan.android.common.aidata.feature.persona.PersonaManager;
import com.meituan.android.common.aidata.feature.producer.FeatureProducerManager;
import com.meituan.android.common.aidata.feature.producer.SQLFeatureProducer;
import com.meituan.android.common.aidata.feature.task.GenerateFeatureTask;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.android.common.aidata.resources.bean.BundleWaitTime;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.android.common.aidata.resources.bean.SubTableConfigBean;
import com.meituan.android.common.aidata.resources.config.DDPresetConfig;
import com.meituan.android.common.aidata.resources.config.DDResourceRequest;
import com.meituan.android.common.aidata.resources.config.ResourceConfigManager;
import com.meituan.android.common.aidata.resources.downloader.DDResResponse;
import com.meituan.android.common.aidata.resources.downloader.DDResResultCallback;
import com.meituan.android.common.aidata.resources.manager.CepResourceManager;
import com.meituan.android.common.aidata.resources.manager.EventDataCacheManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AIDispatcher {
    private static final String HORN_INIT_TAG = "HornInit";
    private static final String TAG = "AIDispatcher";
    private static final String TEMP_HOLD_BUNDLE_TASK_PREFIX = "temp_hold_bundle_task_prefix_";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<BundleInfo, DependencyTask<BundleInfo, AiBundle>> bundleTaskMap;
    private final Map<BundleInfo, AiBundle> cacheBundleMap;
    private final Map<DDResourceRequest, List<FeatureBean>> cacheCEPMap;
    private final Map<DDResourceRequest, DependencyTask<DDResourceRequest, List<FeatureBean>>> cepTaskMap;
    public volatile EmptyTask<String, Boolean> hornInitTask;

    public AIDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a2e6f89b2280ed4e421d4cb06f66612", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a2e6f89b2280ed4e421d4cb06f66612");
            return;
        }
        this.cacheBundleMap = new HashMap();
        this.cacheCEPMap = new HashMap();
        this.bundleTaskMap = new HashMap();
        this.cepTaskMap = new HashMap();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final AIDispatcher STUB = new AIDispatcher();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static AIDispatcher getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e10e69d09e465776812a306006e5bac", RobustBitConfig.DEFAULT_VALUE) ? (AIDispatcher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e10e69d09e465776812a306006e5bac") : InnerClass.STUB;
    }

    public void addHornInitTask(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3436208d12eebea9cbac7ca723ad6ce6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3436208d12eebea9cbac7ca723ad6ce6");
            return;
        }
        HashSet hashSet = new HashSet();
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
        }
        this.hornInitTask = new EmptyTask<>(HORN_INIT_TAG, hashSet);
        this.hornInitTask.setBasicWaitTime(10);
        this.hornInitTask.setChildAttachWaitTime(5);
        this.hornInitTask.setSyncCall(new TaskSyncCallable<String, Boolean>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.tasks.TaskSyncCallable
            public Boolean syncCall(String str2, long j, boolean z) {
                Object[] objArr2 = {str2, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "28c6256a3658d2bfb77da51d7adee543", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "28c6256a3658d2bfb77da51d7adee543") : Boolean.TRUE;
            }
        });
        AsyncManager.executeSingle(this.hornInitTask, 2);
    }

    public void notifyHornSyncParseFinish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b60e18161fdfd35c1e67f69c77c53a3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b60e18161fdfd35c1e67f69c77c53a3d");
        } else if (this.hornInitTask == null || this.hornInitTask.isFinish() || !this.hornInitTask.isWaitingTask(str)) {
        } else {
            this.hornInitTask.countDown(str);
            new StringBuilder("horn sync parse task is finish : ").append(str);
        }
    }

    public void addStartBizTask(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d20b406dd4cbc2391e6a22c1f22b4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d20b406dd4cbc2391e6a22c1f22b4c9");
        } else {
            AsyncManager.executeAsync(new Runnable() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3a03b1e38e5d0d34d05208aa9074468c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3a03b1e38e5d0d34d05208aa9074468c");
                    } else if (AIDispatcher.this.hornInitTask.isFinish()) {
                        AIDispatcher.this.realAddStartBizTask(str);
                    } else {
                        new StringBuilder("addStartBizTask waiting for horn init finish, biz : ").append(str);
                        AIDispatcher.this.hornInitTask.addOnTaskFinishListener(new OnTaskFinishListener<String, Boolean>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.2.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                            public /* bridge */ /* synthetic */ void onTaskFinish(Map<String, Boolean> map, Boolean bool, long j, List list) {
                                onTaskFinish2(map, bool, j, (List<Exception>) list);
                            }

                            /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                            public void onTaskFinish2(Map<String, Boolean> map, Boolean bool, long j, List<Exception> list) {
                                Object[] objArr3 = {map, bool, new Long(j), list};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d7d96cd57a7d8c6f044108bc5fc90abf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d7d96cd57a7d8c6f044108bc5fc90abf");
                                } else {
                                    AIDispatcher.this.realAddStartBizTask(str);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realAddStartBizTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03b2b15532177e69b261f18921c79598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03b2b15532177e69b261f18921c79598");
            return;
        }
        new StringBuilder("biz bundle task start : ").append(str);
        generateBizBundleTask(str);
        generateBizCEPTask(str);
    }

    public void addExecuteMLTask(final String str, final JSONObject jSONObject, final JSFeatureOutParamsCallback jSFeatureOutParamsCallback, final IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {str, jSONObject, jSFeatureOutParamsCallback, iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a7352c9160f547c770d7afc2a5cdadb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a7352c9160f547c770d7afc2a5cdadb");
        } else if (TextUtils.isEmpty(str) || iPredictionJsonListener == null) {
        } else {
            AsyncManager.executeAsync(new Runnable() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5664f9182838373dae7b6d43a5c412d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5664f9182838373dae7b6d43a5c412d8");
                        return;
                    }
                    final MLContext mLContext = new MLContext();
                    mLContext.modelName = str;
                    mLContext.feature = jSONObject;
                    mLContext.outParamsCallback = jSFeatureOutParamsCallback;
                    mLContext.startTime = SystemClock.elapsedRealtime();
                    mLContext.listener = iPredictionJsonListener;
                    mLContext.modelUniqueId = AppUtil.getUniqueId();
                    if (AIDispatcher.this.hornInitTask.isFinish()) {
                        AIDispatcher.this.realAddExecuteMLTask(mLContext);
                        return;
                    }
                    mLContext.addBundleWaitTime(new BundleWaitTime(AIDispatcher.HORN_INIT_TAG, true));
                    new StringBuilder("addExecuteMLTask waiting for horn init finish, modelName : ").append(str);
                    AIDispatcher.this.hornInitTask.addOnTaskFinishListener(new OnTaskFinishListener<String, Boolean>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.3.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                        public /* bridge */ /* synthetic */ void onTaskFinish(Map<String, Boolean> map, Boolean bool, long j, List list) {
                            onTaskFinish2(map, bool, j, (List<Exception>) list);
                        }

                        /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                        public void onTaskFinish2(Map<String, Boolean> map, Boolean bool, long j, List<Exception> list) {
                            Object[] objArr3 = {map, bool, new Long(j), list};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9d34a06e96bc7f9ca612d921572c0d2a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9d34a06e96bc7f9ca612d921572c0d2a");
                                return;
                            }
                            mLContext.addBundleWaitTime(new BundleWaitTime(AIDispatcher.HORN_INIT_TAG, false));
                            AIDispatcher.this.realAddExecuteMLTask(mLContext);
                        }
                    });
                }
            });
        }
    }

    public void addExecuteMLTask(final MLContext mLContext) {
        Object[] objArr = {mLContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "137fd5e3cefc9b776c241262b9463656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "137fd5e3cefc9b776c241262b9463656");
        } else if (mLContext == null) {
        } else {
            AsyncManager.executeAsync(new Runnable() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "32672e9acad8a080cec4ef96b58be999", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "32672e9acad8a080cec4ef96b58be999");
                    } else if (AIDispatcher.this.hornInitTask.isFinish()) {
                        AIDispatcher.this.realAddExecuteMLTask(mLContext);
                    } else {
                        mLContext.addBundleWaitTime(new BundleWaitTime(AIDispatcher.HORN_INIT_TAG, true));
                        new StringBuilder("addExecuteMLTask waiting for horn init finish, modelName : ").append(mLContext.modelName);
                        AIDispatcher.this.hornInitTask.addOnTaskFinishListener(new OnTaskFinishListener<String, Boolean>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.4.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                            public /* bridge */ /* synthetic */ void onTaskFinish(Map<String, Boolean> map, Boolean bool, long j, List list) {
                                onTaskFinish2(map, bool, j, (List<Exception>) list);
                            }

                            /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                            public void onTaskFinish2(Map<String, Boolean> map, Boolean bool, long j, List<Exception> list) {
                                Object[] objArr3 = {map, bool, new Long(j), list};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fc7c29a6431426208edb31f52045b0af", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fc7c29a6431426208edb31f52045b0af");
                                    return;
                                }
                                mLContext.addBundleWaitTime(new BundleWaitTime(AIDispatcher.HORN_INIT_TAG, false));
                                AIDispatcher.this.realAddExecuteMLTask(mLContext);
                            }
                        });
                    }
                }
            });
        }
    }

    public synchronized void realAddExecuteMLTask(@NonNull final MLContext mLContext) {
        int i = 1;
        Object[] objArr = {mLContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf317a24e6a73b2fcac8194726030f9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf317a24e6a73b2fcac8194726030f9b");
            return;
        }
        if (!AiSwitchConfig.getInstance().isDisableFeatureService() && !AiSwitchConfig.getInstance().isDisableModelService()) {
            BundleInfo modelBundleInfo = ResourceConfigManager.getInstance().getModelBundleInfo(mLContext.modelName);
            AiBundle aiBundle = this.cacheBundleMap.get(modelBundleInfo);
            if (aiBundle != null) {
                if (aiBundle.checkValid()) {
                    StringBuilder sb = new StringBuilder("bundle safe : ");
                    sb.append(mLContext.modelName);
                    sb.append(" and execute ml");
                    mLContext.setAiBundle(aiBundle);
                    MLModelEngineManager.getInstance().executeMLModelBundle(mLContext);
                    return;
                }
                removeBundle(modelBundleInfo);
            }
            mLContext.addBundleWaitTime(new BundleWaitTime(mLContext.modelName, true));
            DependencyTask<BundleInfo, AiBundle> addOnTaskFinishListener = generateBundleTask(modelBundleInfo).addOnTaskFinishListener(new OnTaskFinishListener<BundleInfo, AiBundle>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                public /* bridge */ /* synthetic */ void onTaskFinish(Map<BundleInfo, AiBundle> map, AiBundle aiBundle2, long j, List list) {
                    onTaskFinish2(map, aiBundle2, j, (List<Exception>) list);
                }

                /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                public void onTaskFinish2(Map<BundleInfo, AiBundle> map, AiBundle aiBundle2, long j, List<Exception> list) {
                    Object[] objArr2 = {map, aiBundle2, new Long(j), list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8ce37d3f78193031facc1592ec59b096", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8ce37d3f78193031facc1592ec59b096");
                        return;
                    }
                    mLContext.addBundleWaitTime(new BundleWaitTime(mLContext.modelName, false));
                    if (AiSwitchConfig.getInstance().isDisableFeatureService() || AiSwitchConfig.getInstance().isDisableModelService()) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("model bundle task : ");
                    sb2.append(mLContext.modelName);
                    sb2.append(" finish and execute ml task start");
                    mLContext.setAiBundle(aiBundle2);
                    mLContext.addErrorList(list);
                    MLModelEngineManager.getInstance().executeMLModelBundle(mLContext);
                }
            });
            if (!addOnTaskFinishListener.isOriginalTask()) {
                i = 2;
            }
            AsyncManager.executeSingle(addOnTaskFinishListener, i);
        }
    }

    public void addGetFeatureTask(final List<GetFeatureRequest> list, final JSFeatureOutParamsCallback jSFeatureOutParamsCallback, final IFeatureListener iFeatureListener) {
        Object[] objArr = {list, jSFeatureOutParamsCallback, iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "653e2864c0dc722613a51d1ebb1524e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "653e2864c0dc722613a51d1ebb1524e6");
        } else if (iFeatureListener == null) {
        } else {
            AsyncManager.executeAsync(new Runnable() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "89818e1ab1ad9608e65f077593b1d800", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "89818e1ab1ad9608e65f077593b1d800");
                    } else if (AIDispatcher.this.hornInitTask.isFinish()) {
                        AIDispatcher.this.realAddGetFeatureTask(list, jSFeatureOutParamsCallback, iFeatureListener);
                    } else {
                        AIDispatcher.this.hornInitTask.addOnTaskFinishListener(new OnTaskFinishListener<String, Boolean>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.6.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                            public /* bridge */ /* synthetic */ void onTaskFinish(Map<String, Boolean> map, Boolean bool, long j, List list2) {
                                onTaskFinish2(map, bool, j, (List<Exception>) list2);
                            }

                            /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                            public void onTaskFinish2(Map<String, Boolean> map, Boolean bool, long j, List<Exception> list2) {
                                Object[] objArr3 = {map, bool, new Long(j), list2};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f55db4b64868f9173bb572988883462a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f55db4b64868f9173bb572988883462a");
                                } else {
                                    AIDispatcher.this.realAddGetFeatureTask(list, jSFeatureOutParamsCallback, iFeatureListener);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public synchronized void realAddGetFeatureTask(List<GetFeatureRequest> list, JSFeatureOutParamsCallback jSFeatureOutParamsCallback, IFeatureListener iFeatureListener) {
        Object[] objArr = {list, jSFeatureOutParamsCallback, iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8510836febaaf87d4d34195a8dd7286c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8510836febaaf87d4d34195a8dd7286c");
            return;
        }
        MLContext mLContext = new MLContext();
        mLContext.isGetFeature = true;
        mLContext.iFeatureListener = iFeatureListener;
        mLContext.outParamsCallback = jSFeatureOutParamsCallback;
        FeatureService.getInstance().getFeature(mLContext, list, iFeatureListener, 0);
    }

    public synchronized void addGenerateFeatureTask(@NonNull final MLContext mLContext, List<GetFeatureRequest> list, final GenerateFeatureTask generateFeatureTask) {
        Object[] objArr = {mLContext, list, generateFeatureTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a9e19536ae0075f1ff845e373227d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a9e19536ae0075f1ff845e373227d9c");
        } else if (generateFeatureTask != null) {
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (GetFeatureRequest getFeatureRequest : list) {
                    if (getFeatureRequest != null) {
                        if (mLContext.isGetFeature && PersonaManager.getInstance().isPersonaFeature(getFeatureRequest.feature) && mLContext.iFeatureListener != null) {
                            mLContext.iFeatureListener.onFailed(new Exception("Cannot get the feature which belong to Persona and feature name is " + getFeatureRequest.feature));
                        }
                        BundleInfo jSFeatureBundleInfo = JSFeatureManager.getInstance().getJSFeatureBundleInfo(getFeatureRequest.feature);
                        if (jSFeatureBundleInfo != null) {
                            AiBundle aiBundle = this.cacheBundleMap.get(jSFeatureBundleInfo);
                            if (aiBundle != null) {
                                if (!aiBundle.isJsBundleValid()) {
                                    removeBundle(jSFeatureBundleInfo);
                                }
                            }
                            StringBuilder sb = new StringBuilder("prepare generate feature task dependency on feature bundle : ");
                            sb.append(getFeatureRequest.feature);
                            sb.append(", bundleVersion : ");
                            sb.append(jSFeatureBundleInfo.getBundleVersion());
                            arrayList.add(new HolderTask(getFeatureRequest.feature, generateBundleTask(jSFeatureBundleInfo)));
                        } else {
                            DDResourceRequest featureDDRequest = ResourceConfigManager.getInstance().getFeatureDDRequest(getFeatureRequest.feature);
                            if (featureDDRequest != null && !isValidSQLFeature(featureDDRequest)) {
                                removeCEP(featureDDRequest);
                                StringBuilder sb2 = new StringBuilder("prepare generate feature task dependency on feature bundle : ");
                                sb2.append(getFeatureRequest.feature);
                                sb2.append(", bundleVersion : ");
                                sb2.append(featureDDRequest.mVer);
                                arrayList.add(new HolderTask(getFeatureRequest.feature, generateCEPTask(featureDDRequest)));
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    generateFeatureTask.execute();
                    return;
                }
                final String str = "temp_hold_bundle_task_prefix_GenerateFeatureTask_" + SystemClock.elapsedRealtime();
                DependencyTask dependencyTask = new DependencyTask(str);
                dependencyTask.dependencyOn(arrayList);
                mLContext.addBundleWaitTime(new BundleWaitTime("generateFeature", true));
                dependencyTask.setSyncCall(new TaskSyncCallable<String, Boolean>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.7
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.async.tasks.TaskSyncCallable
                    public Boolean syncCall(String str2, long j, boolean z) {
                        Object[] objArr2 = {str2, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cba67d8dd2d117fe415c46c69b2c2474", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cba67d8dd2d117fe415c46c69b2c2474");
                        }
                        mLContext.addBundleWaitTime(new BundleWaitTime("generateFeature", false));
                        synchronized (AIDispatcher.getInstance()) {
                            generateFeatureTask.execute();
                        }
                        new StringBuilder("prepare generate feature task finish with all feature bundle task finish and generate feature task start: ").append(str);
                        return null;
                    }
                });
                AsyncManager.executeByOneLevelRoot(dependencyTask, 2);
                new StringBuilder("prepare generate feature task start : ").append(str);
                return;
            }
            generateFeatureTask.execute();
        }
    }

    public synchronized void addJSOperatorTask(@NonNull final MLContext mLContext, final String str, final TaskSyncCallable<AiBundle, Boolean> taskSyncCallable) {
        int i = 1;
        Object[] objArr = {mLContext, str, taskSyncCallable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc722571d983350bb12efa9ee7135e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc722571d983350bb12efa9ee7135e0c");
        } else if (taskSyncCallable == null) {
        } else {
            BundleInfo jSBundleInfo = ResourceConfigManager.getInstance().getJSBundleInfo(str);
            AiBundle aiBundle = this.cacheBundleMap.get(jSBundleInfo);
            if (aiBundle != null) {
                if (aiBundle.isJsBundleValid()) {
                    new StringBuilder("bundle safe and js operator task start : ").append(str);
                    taskSyncCallable.syncCall(aiBundle, SystemClock.elapsedRealtime(), false);
                    return;
                }
                removeBundle(jSBundleInfo);
            }
            DependencyTask<BundleInfo, AiBundle> generateBundleTask = generateBundleTask(jSBundleInfo);
            mLContext.addBundleWaitTime(new BundleWaitTime(str, true));
            generateBundleTask.addOnTaskFinishListener(new OnTaskFinishListener<BundleInfo, AiBundle>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                public /* bridge */ /* synthetic */ void onTaskFinish(Map<BundleInfo, AiBundle> map, AiBundle aiBundle2, long j, List list) {
                    onTaskFinish2(map, aiBundle2, j, (List<Exception>) list);
                }

                /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                public void onTaskFinish2(Map<BundleInfo, AiBundle> map, AiBundle aiBundle2, long j, List<Exception> list) {
                    Object[] objArr2 = {map, aiBundle2, new Long(j), list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "60a265722ed375674cb6029e5ef807b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "60a265722ed375674cb6029e5ef807b2");
                        return;
                    }
                    new StringBuilder("bundle safe and js operator task start : ").append(str);
                    mLContext.addBundleWaitTime(new BundleWaitTime(str, false));
                    taskSyncCallable.syncCall(aiBundle2, SystemClock.elapsedRealtime(), false);
                }
            });
            StringBuilder sb = new StringBuilder("js operator task ");
            sb.append(str);
            sb.append(" dependency on js bundle task : ");
            sb.append(generateBundleTask.getTaskUniqueId());
            if (!generateBundleTask.isOriginalTask()) {
                i = 2;
            }
            AsyncManager.executeSingle(generateBundleTask, i);
        }
    }

    private void generateBizBundleTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ef0f01d13f059b5d2ae0bc1dec29113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ef0f01d13f059b5d2ae0bc1dec29113");
        } else if (!TextUtils.isEmpty(str)) {
            List<BundleInfo> allResourceConfig = ResourceConfigManager.getInstance().getAllResourceConfig(str);
            if (allResourceConfig == null) {
                StringBuilder sb = new StringBuilder("biz task : ");
                sb.append(str);
                sb.append(" contains no bundle task");
                return;
            }
            for (BundleInfo bundleInfo : allResourceConfig) {
                if (bundleInfo != null && this.cacheBundleMap.get(bundleInfo) == null && this.bundleTaskMap.get(bundleInfo) == null) {
                    StringBuilder sb2 = new StringBuilder("biz task : ");
                    sb2.append(str);
                    sb2.append(" contains bundle task :");
                    sb2.append(bundleInfo.getDDBundleName());
                    sb2.append(" ,version : ");
                    sb2.append(bundleInfo.getBundleVersion());
                    DependencyTask<BundleInfo, AiBundle> generateBundleTask = generateBundleTask(bundleInfo);
                    if (generateBundleTask.isOriginalTask()) {
                        AsyncManager.executeSingle(generateBundleTask, 1);
                    }
                }
            }
        }
    }

    private void generateBizCEPTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e8e2348d2b7bd2b602b563cc0116358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e8e2348d2b7bd2b602b563cc0116358");
        } else if (!TextUtils.isEmpty(str)) {
            List<DDResourceRequest> cepResourceConfig = ResourceConfigManager.getInstance().getCepResourceConfig(str);
            if (cepResourceConfig == null) {
                StringBuilder sb = new StringBuilder("biz task : ");
                sb.append(str);
                sb.append(" contains no cep task");
                return;
            }
            for (final DDResourceRequest dDResourceRequest : cepResourceConfig) {
                if (dDResourceRequest != null) {
                    List<FeatureBean> list = this.cacheCEPMap.get(dDResourceRequest);
                    if (list != null) {
                        if (!dDResourceRequest.isStart) {
                            dDResourceRequest.isStart = true;
                            startCEP(list);
                        }
                    } else {
                        DependencyTask<DDResourceRequest, List<FeatureBean>> generateCEPTask = generateCEPTask(dDResourceRequest);
                        generateCEPTask.addOnTaskFinishListener(new OnTaskFinishListener<DDResourceRequest, List<FeatureBean>>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.9
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                            public /* bridge */ /* synthetic */ void onTaskFinish(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list2, long j, List list3) {
                                onTaskFinish2(map, list2, j, (List<Exception>) list3);
                            }

                            /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                            public void onTaskFinish2(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list2, long j, List<Exception> list3) {
                                Object[] objArr2 = {map, list2, new Long(j), list3};
                                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fcce74089224da08645cd7957580ab23", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fcce74089224da08645cd7957580ab23");
                                } else if (dDResourceRequest.isStart) {
                                } else {
                                    dDResourceRequest.isStart = true;
                                    AIDispatcher.this.startCEP(list2);
                                }
                            }
                        });
                        StringBuilder sb2 = new StringBuilder("biz task : ");
                        sb2.append(str);
                        sb2.append(" contains cep task :");
                        sb2.append(dDResourceRequest.mResName);
                        sb2.append(" ,version : ");
                        sb2.append(dDResourceRequest.mVer);
                        AsyncManager.executeSingle(generateCEPTask, generateCEPTask.isOriginalTask() ? 1 : 2);
                    }
                }
            }
        }
    }

    @NonNull
    public synchronized DependencyTask<DDResourceRequest, List<FeatureBean>> generateCEPTask(DDResourceRequest dDResourceRequest) {
        boolean z = true;
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c95a531d52575c6f48116261b2cd94cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c95a531d52575c6f48116261b2cd94cd");
        }
        if (dDResourceRequest != null) {
            String str = dDResourceRequest.mResName;
            if (!TextUtils.isEmpty(str)) {
                String str2 = dDResourceRequest.mVer;
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = dDResourceRequest.mBiz;
                    if (!TextUtils.isEmpty(str3)) {
                        List<FeatureBean> list = this.cacheCEPMap.get(dDResourceRequest);
                        if (list != null) {
                            StringBuilder sb = new StringBuilder("generate cep task hit cache, biz : ");
                            sb.append(str3);
                            sb.append(" ,bundleName : ");
                            sb.append(str);
                            sb.append(" ,bundleVersion : ");
                            sb.append(str2);
                            return new ResultTask(dDResourceRequest, list);
                        }
                        DependencyTask<DDResourceRequest, List<FeatureBean>> dependencyTask = this.cepTaskMap.get(dDResourceRequest);
                        if (dependencyTask != null) {
                            StringBuilder sb2 = new StringBuilder("generate cep task exist, biz : ");
                            sb2.append(str3);
                            sb2.append(" ,bundleName : ");
                            sb2.append(str);
                            sb2.append(", bundleVersion : ");
                            sb2.append(str2);
                            return new HolderTask(dependencyTask);
                        }
                        return realGenerateCEPTask(dDResourceRequest);
                    }
                }
            }
        }
        StringBuilder sb3 = new StringBuilder("CEP request is null : ");
        if (dDResourceRequest != null) {
            z = false;
        }
        sb3.append(z);
        sb3.append(", CEP name is ");
        sb3.append(dDResourceRequest == null ? StringUtil.NULL : dDResourceRequest.mResourcePackName);
        sb3.append(", CEP version is ");
        sb3.append(dDResourceRequest == null ? StringUtil.NULL : dDResourceRequest.mVer);
        sb3.append(", biz name is ");
        sb3.append(dDResourceRequest == null ? StringUtil.NULL : dDResourceRequest.mBiz);
        String sb4 = sb3.toString();
        new StringBuilder("generate CEP task fail : ").append(sb4);
        return new ErrorTask(dDResourceRequest, new IllegalArgumentException(sb4));
    }

    @NonNull
    public synchronized DependencyTask<BundleInfo, AiBundle> generateBundleTask(BundleInfo bundleInfo) {
        boolean z = true;
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "283521152cd5a12742d44533eaf485c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "283521152cd5a12742d44533eaf485c9");
        }
        if (bundleInfo != null) {
            String dDBundleName = bundleInfo.getDDBundleName();
            if (!TextUtils.isEmpty(dDBundleName)) {
                String bundleVersion = bundleInfo.getBundleVersion();
                if (!TextUtils.isEmpty(bundleVersion)) {
                    AiBundle aiBundle = this.cacheBundleMap.get(bundleInfo);
                    if (aiBundle != null) {
                        StringBuilder sb = new StringBuilder("generate bundle task hit cache, biz : ");
                        sb.append(bundleInfo.getTags());
                        sb.append(" ,bundleName : ");
                        sb.append(dDBundleName);
                        sb.append(" ,bundleVersion : ");
                        sb.append(bundleVersion);
                        return new ResultTask(bundleInfo, aiBundle);
                    }
                    DependencyTask<BundleInfo, AiBundle> dependencyTask = this.bundleTaskMap.get(bundleInfo);
                    if (dependencyTask != null) {
                        StringBuilder sb2 = new StringBuilder("generate bundle task exist, biz : ");
                        sb2.append(bundleInfo.getTags());
                        sb2.append(" ,bundleName : ");
                        sb2.append(dDBundleName);
                        sb2.append(", bundleVersion : ");
                        sb2.append(bundleVersion);
                        return new HolderTask(dependencyTask);
                    }
                    return realGenerateBundleTask(bundleInfo);
                }
            }
        }
        StringBuilder sb3 = new StringBuilder("Bundle info is null : ");
        if (bundleInfo != null) {
            z = false;
        }
        sb3.append(z);
        sb3.append(", bundleName is ");
        sb3.append(bundleInfo == null ? "null : " : bundleInfo.getDDBundleName());
        sb3.append(", bundleVersion is ");
        sb3.append(bundleInfo == null ? "null : " : bundleInfo.getBundleVersion());
        sb3.append(", biz name is ");
        sb3.append(bundleInfo == null ? "null : " : bundleInfo.getTags());
        String sb4 = sb3.toString();
        new StringBuilder("generate bundle task fail : ").append(sb4);
        return new ErrorTask(bundleInfo, new IllegalArgumentException(sb4));
    }

    private synchronized DependencyTask<BundleInfo, AiBundle> realGenerateBundleTask(@NonNull final BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "983ed2cbca77f14e75ffe5b246d900f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "983ed2cbca77f14e75ffe5b246d900f8");
        }
        final String tags = bundleInfo.getTags();
        final String dDBundleName = bundleInfo.getDDBundleName();
        final String bundleVersion = bundleInfo.getBundleVersion();
        StringBuilder sb = new StringBuilder("generate bundle task create , biz : ");
        sb.append(tags);
        sb.append(" ,bundleName : ");
        sb.append(dDBundleName);
        sb.append(", bundleVersion : ");
        sb.append(bundleVersion);
        DependencyTask<BundleInfo, AiBundle> dependencyTask = new DependencyTask<>(bundleInfo);
        this.bundleTaskMap.put(bundleInfo, dependencyTask);
        dependencyTask.setAsyncCall(new TaskAsyncCallable<BundleInfo, AiBundle>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.10
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable
            public void asyncCall(DependencyTask<BundleInfo, AiBundle> dependencyTask2, final TaskAsyncNotifier<AiBundle> taskAsyncNotifier, long j, final boolean z) {
                Object[] objArr2 = {dependencyTask2, taskAsyncNotifier, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4596ba9272716add7b9a290de527662a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4596ba9272716add7b9a290de527662a");
                    return;
                }
                StringBuilder sb2 = new StringBuilder("generate bundle task start, biz : ");
                sb2.append(tags);
                sb2.append(" ,bundleName : ");
                sb2.append(dDBundleName);
                sb2.append(", bundleVersion : ");
                sb2.append(bundleVersion);
                AiBundleManager.getInstance().loadTemplate(bundleInfo, new AiBundleManager.DownloadBundleCallback() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.10.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.bundle.AiBundleManager.DownloadBundleCallback
                    public void onLoadSuccess(AiBundle aiBundle) {
                        Object[] objArr3 = {aiBundle};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "867f968a0b2dc7e5ea314860349b3f02", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "867f968a0b2dc7e5ea314860349b3f02");
                            return;
                        }
                        StringBuilder sb3 = new StringBuilder("generate bundle task finish with success, biz : ");
                        sb3.append(tags);
                        sb3.append(" ,bundleName : ");
                        sb3.append(dDBundleName);
                        sb3.append(" ,bundleVersion : ");
                        sb3.append(bundleVersion);
                        sb3.append(" ,taskTimeOut : ");
                        sb3.append(z);
                        AiBundleManager.getInstance().registerBundle(tags, aiBundle);
                        AIDispatcher.this.handleBundle(bundleInfo, aiBundle);
                        if (taskAsyncNotifier != null) {
                            taskAsyncNotifier.notify(aiBundle, aiBundle == null ? new Exception("onLoadSuccess with null") : null);
                        }
                    }

                    @Override // com.meituan.android.common.aidata.ai.bundle.AiBundleManager.DownloadBundleCallback
                    public void onError(Exception exc) {
                        Object[] objArr3 = {exc};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2c45aca1c81284ed4d23990cbaefa3be", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2c45aca1c81284ed4d23990cbaefa3be");
                            return;
                        }
                        StringBuilder sb3 = new StringBuilder("generate bundle task finish with fail, biz : ");
                        sb3.append(tags);
                        sb3.append(" ,bundleName : ");
                        sb3.append(dDBundleName);
                        sb3.append(", bundleVersion : ");
                        sb3.append(bundleVersion);
                        sb3.append(" ,taskTimeOut : ");
                        sb3.append(z);
                        AIDispatcher.this.handleBundle(bundleInfo, null);
                        if (taskAsyncNotifier != null) {
                            taskAsyncNotifier.notify(null, exc);
                        }
                    }
                });
            }
        });
        return dependencyTask;
    }

    private synchronized DependencyTask<DDResourceRequest, List<FeatureBean>> realGenerateCEPTask(@NonNull final DDResourceRequest dDResourceRequest) {
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8f62c9355bdf68fad365e76488ce9d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8f62c9355bdf68fad365e76488ce9d3");
        }
        String str = dDResourceRequest.mBiz;
        final String str2 = dDResourceRequest.mResourcePackName;
        final String str3 = dDResourceRequest.mVer;
        StringBuilder sb = new StringBuilder("generate CEP task create , biz : ");
        sb.append(str);
        sb.append(" ,bundleName : ");
        sb.append(str2);
        sb.append(", bundleVersion : ");
        sb.append(str3);
        DependencyTask<DDResourceRequest, List<FeatureBean>> dependencyTask = new DependencyTask<>(dDResourceRequest);
        this.cepTaskMap.put(dDResourceRequest, dependencyTask);
        dependencyTask.setAsyncCall(new TaskAsyncCallable<DDResourceRequest, List<FeatureBean>>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.11
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable
            public void asyncCall(DependencyTask<DDResourceRequest, List<FeatureBean>> dependencyTask2, final TaskAsyncNotifier<List<FeatureBean>> taskAsyncNotifier, long j, final boolean z) {
                Object[] objArr2 = {dependencyTask2, taskAsyncNotifier, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9904a667ae6ec39101704ce8cd0f6c84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9904a667ae6ec39101704ce8cd0f6c84");
                    return;
                }
                StringBuilder sb2 = new StringBuilder("generate CEP task start, CEP name : ");
                sb2.append(str2);
                sb2.append(", CEP version : ");
                sb2.append(str3);
                sb2.append(" ,taskTimeOut : ");
                sb2.append(z);
                AiBundleManager.getInstance().loadCEP(dDResourceRequest, new DDResResultCallback() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.11.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.resources.downloader.DDResResultCallback
                    public void onSuccess(DDResResponse dDResResponse) {
                        Object[] objArr3 = {dDResResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cac664b2baabb8dbf09dbae190807bc1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cac664b2baabb8dbf09dbae190807bc1");
                        } else {
                            AIDispatcher.this.handleCepDownloadSuccess(dDResourceRequest, dDResResponse, taskAsyncNotifier, z);
                        }
                    }

                    @Override // com.meituan.android.common.aidata.resources.downloader.DDResResultCallback
                    public void onFail(Exception exc) {
                        Object[] objArr3 = {exc};
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8d5450ca0b798216afd9fc7a43f66cbd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8d5450ca0b798216afd9fc7a43f66cbd");
                            return;
                        }
                        StringBuilder sb3 = new StringBuilder("generate CEP task finish with fail , CEP name : ");
                        sb3.append(str2);
                        sb3.append(", CEP version : ");
                        sb3.append(str3);
                        sb3.append(" ,taskTimeOut : ");
                        sb3.append(z);
                        sb3.append(" , error info : ");
                        sb3.append(exc != null ? exc.toString() : RaptorConstants.ERROR_UNKNOWN_VALUE);
                        AIDispatcher.this.handleCEP(dDResourceRequest, null);
                        if (taskAsyncNotifier != null) {
                            taskAsyncNotifier.notify(null, exc);
                        }
                    }
                });
            }
        });
        return dependencyTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleCEP(@NonNull DDResourceRequest dDResourceRequest, List<FeatureBean> list) {
        Object[] objArr = {dDResourceRequest, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f466486252c496802278a9694bd89bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f466486252c496802278a9694bd89bb");
            return;
        }
        this.cacheCEPMap.put(dDResourceRequest, list);
        this.cepTaskMap.remove(dDResourceRequest);
        CepResourceManager.getInstance().addFeatureBeanList(dDResourceRequest.mBiz, list);
        if (AIDataDelegate.getInstance().isDebugEnable() && dDResourceRequest != null && list != null) {
            for (FeatureBean featureBean : list) {
                if (featureBean != null) {
                    LogUtil.aiLogD("add CEP , CEP name : " + featureBean.packageName + " , CEP version : " + featureBean.packageVersion + " , CEP biz : " + featureBean.biz);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleBundle(@NonNull BundleInfo bundleInfo, AiBundle aiBundle) {
        Object[] objArr = {bundleInfo, aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0155fdae5a779651e09a3009a6bb242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0155fdae5a779651e09a3009a6bb242");
            return;
        }
        if (AIDataDelegate.getInstance().isDebugEnable() && bundleInfo != null) {
            LogUtil.aiLogD("add bundle info , bundleName : " + bundleInfo.getDDBundleName() + " , bundleVersion : " + bundleInfo.getBundleVersion() + " , biz : " + bundleInfo.getTags());
        }
        this.cacheBundleMap.put(bundleInfo, aiBundle);
        this.bundleTaskMap.remove(bundleInfo);
    }

    public synchronized void removeBundle(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc65b9e8c15f5ef11748bcca48bd01b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc65b9e8c15f5ef11748bcca48bd01b7");
        } else if (bundleInfo == null) {
        } else {
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("remove bundle info , bundleName : " + bundleInfo.getDDBundleName() + " , bundleVersion : " + bundleInfo.getBundleVersion() + " , biz : " + bundleInfo.getTags());
            }
            StringBuilder sb = new StringBuilder("remove bundle info , bundleName : ");
            sb.append(bundleInfo.getDDBundleName());
            sb.append(" ,bundleVersion : ");
            sb.append(bundleInfo.getBundleVersion());
            AiBundleManager.getInstance().removeCacheBundle(bundleInfo);
            AiBundleManager.getInstance().deleteBundle(bundleInfo);
        }
    }

    public synchronized void removeCache(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0bfc7010c3e32a9b611d2a01c70405a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0bfc7010c3e32a9b611d2a01c70405a");
        } else {
            this.cacheBundleMap.remove(bundleInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeCEP(DDResourceRequest dDResourceRequest) {
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f28686bd1cc2b7c605076b3c145fbb71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f28686bd1cc2b7c605076b3c145fbb71");
        } else if (dDResourceRequest != null) {
            StringBuilder sb = new StringBuilder("remove CEP info , CEP name : ");
            sb.append(dDResourceRequest.mResourcePackName);
            sb.append(" , version : ");
            sb.append(dDResourceRequest.mVer);
            sb.append(" , biz : ");
            sb.append(dDResourceRequest.mBiz);
            List<FeatureBean> list = this.cacheCEPMap.get(dDResourceRequest);
            this.cacheCEPMap.remove(dDResourceRequest);
            if (list != null) {
                for (FeatureBean featureBean : list) {
                    if (featureBean != null) {
                        CEPSubTableCEPServiceManager.getInstance().unsubscribeCepServiceCallback(featureBean.feature);
                        DBCEPSubTableDataHelper.getInstance().dropTable(featureBean);
                        FeatureProducerManager.getInstance().unregisterFeatureProducer(new SQLFeatureProducer(featureBean.feature));
                        AIDataDelegate.getInstance().stopRuleTrigger(featureBean);
                        CepResourceManager.getInstance().removeFeatureBean(featureBean);
                        if (AIDataDelegate.getInstance().isDebugEnable()) {
                            LogUtil.aiLogD("remove CEP , CEP name : " + featureBean.packageName + " , CEP version : " + featureBean.packageVersion + " , CEP biz : " + featureBean.biz);
                        }
                    }
                }
            }
            AiBundleManager.getInstance().deleteCepFile(dDResourceRequest);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
        if (r13.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
        configDeleteBundle(r13.next());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void updateBundleInfo(java.lang.String r12, java.util.List<com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo> r13, java.util.List<com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo> r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.AIDispatcher.updateBundleInfo(java.lang.String, java.util.List, java.util.List):void");
    }

    private synchronized void configUpdateBundle(BundleInfo bundleInfo, BundleInfo bundleInfo2) {
        Object[] objArr = {bundleInfo, bundleInfo2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7d51b9424d4416d6d6553fc8ff77a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7d51b9424d4416d6d6553fc8ff77a0f");
            return;
        }
        if (bundleInfo2 != null && !this.cacheBundleMap.containsKey(bundleInfo2) && !this.bundleTaskMap.containsKey(bundleInfo2)) {
            String tags = bundleInfo2.getTags();
            String dDBundleName = bundleInfo2.getDDBundleName();
            String bundleVersion = bundleInfo2.getBundleVersion();
            StringBuilder sb = new StringBuilder("update bundle info , bundleName : ");
            sb.append(bundleInfo2.getDDBundleName());
            sb.append(" ,old bundleVersion : ");
            sb.append(bundleInfo == null ? "" : bundleInfo.getBundleVersion());
            sb.append(" , new bundleVersion : ");
            sb.append(bundleInfo2.getBundleVersion());
            StringBuilder sb2 = new StringBuilder("generate bundle task create , biz : ");
            sb2.append(tags);
            sb2.append(" ,bundleName : ");
            sb2.append(dDBundleName);
            sb2.append(", bundleVersion : ");
            sb2.append(bundleVersion);
            DependencyTask<BundleInfo, AiBundle> dependencyTask = new DependencyTask<>(bundleInfo2);
            this.bundleTaskMap.put(bundleInfo2, dependencyTask);
            dependencyTask.setAsyncCall(new AnonymousClass12(tags, dDBundleName, bundleVersion, bundleInfo2, bundleInfo));
            AsyncManager.executeSingle(dependencyTask, 1);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.common.aidata.ai.AIDispatcher$12  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass12 implements TaskAsyncCallable<BundleInfo, AiBundle> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ String val$biz;
        public final /* synthetic */ String val$bundleName;
        public final /* synthetic */ String val$bundleVersion;
        public final /* synthetic */ BundleInfo val$newInfo;
        public final /* synthetic */ BundleInfo val$oldInfo;

        public AnonymousClass12(String str, String str2, String str3, BundleInfo bundleInfo, BundleInfo bundleInfo2) {
            this.val$biz = str;
            this.val$bundleName = str2;
            this.val$bundleVersion = str3;
            this.val$newInfo = bundleInfo;
            this.val$oldInfo = bundleInfo2;
        }

        @Override // com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable
        public void asyncCall(DependencyTask<BundleInfo, AiBundle> dependencyTask, final TaskAsyncNotifier<AiBundle> taskAsyncNotifier, long j, final boolean z) {
            Object[] objArr = {dependencyTask, taskAsyncNotifier, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a68bb37a1a7313acb9b82713240b6dc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a68bb37a1a7313acb9b82713240b6dc8");
                return;
            }
            StringBuilder sb = new StringBuilder("generate bundle task start, biz : ");
            sb.append(this.val$biz);
            sb.append(" ,bundleName : ");
            sb.append(this.val$bundleName);
            sb.append(", bundleVersion : ");
            sb.append(this.val$bundleVersion);
            AiBundleManager.getInstance().loadTemplate(this.val$newInfo, new AiBundleManager.DownloadBundleCallback() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.12.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.bundle.AiBundleManager.DownloadBundleCallback
                public void onLoadSuccess(final AiBundle aiBundle) {
                    Object[] objArr2 = {aiBundle};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f00918e26c3a183e113bc449edf39e90", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f00918e26c3a183e113bc449edf39e90");
                    } else if (!AIDispatcher.this.cacheBundleMap.containsKey(AnonymousClass12.this.val$oldInfo)) {
                        final DependencyTask dependencyTask2 = (DependencyTask) AIDispatcher.this.bundleTaskMap.get(AnonymousClass12.this.val$oldInfo);
                        if (dependencyTask2 != null) {
                            dependencyTask2.addOnTaskFinishListener(new OnTaskFinishListener<BundleInfo, AiBundle>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.12.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                                public /* bridge */ /* synthetic */ void onTaskFinish(Map<BundleInfo, AiBundle> map, AiBundle aiBundle2, long j2, List list) {
                                    onTaskFinish2(map, aiBundle2, j2, (List<Exception>) list);
                                }

                                /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                                public void onTaskFinish2(Map<BundleInfo, AiBundle> map, AiBundle aiBundle2, long j2, List<Exception> list) {
                                    Object[] objArr3 = {map, aiBundle2, new Long(j2), list};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "21f50d4b93defb84065996b0706e5588", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "21f50d4b93defb84065996b0706e5588");
                                        return;
                                    }
                                    AIDispatcher.this.removeBundle((BundleInfo) dependencyTask2.getTaskUniqueId());
                                    handleDownloadBundleSuccess(aiBundle);
                                }
                            });
                        } else {
                            handleDownloadBundleSuccess(aiBundle);
                        }
                    } else {
                        AIDispatcher.this.removeBundle(AnonymousClass12.this.val$oldInfo);
                        handleDownloadBundleSuccess(aiBundle);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void handleDownloadBundleSuccess(AiBundle aiBundle) {
                    Object[] objArr2 = {aiBundle};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eac9510096b271a8547059e94f01652b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eac9510096b271a8547059e94f01652b");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("generate bundle task finish with success, biz : ");
                    sb2.append(AnonymousClass12.this.val$biz);
                    sb2.append(" ,bundleName : ");
                    sb2.append(AnonymousClass12.this.val$bundleName);
                    sb2.append(" ,bundleVersion : ");
                    sb2.append(AnonymousClass12.this.val$bundleVersion);
                    sb2.append(" ,taskTimeOut : ");
                    sb2.append(z);
                    AiBundleManager.getInstance().registerBundle(AnonymousClass12.this.val$biz, aiBundle);
                    AIDispatcher.this.handleBundle(AnonymousClass12.this.val$newInfo, aiBundle);
                    if (taskAsyncNotifier != null) {
                        taskAsyncNotifier.notify(aiBundle, null);
                    }
                }

                @Override // com.meituan.android.common.aidata.ai.bundle.AiBundleManager.DownloadBundleCallback
                public void onError(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8acbaf5e35c9a31605c23a9a9c7818d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8acbaf5e35c9a31605c23a9a9c7818d8");
                        return;
                    }
                    AIDispatcher.this.handleBundle(AnonymousClass12.this.val$newInfo, null);
                    if (taskAsyncNotifier != null) {
                        taskAsyncNotifier.notify(null, exc);
                    }
                }
            });
        }
    }

    private synchronized void configAddBundle(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e628e3a0e86b126dac9e6a14f72a48ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e628e3a0e86b126dac9e6a14f72a48ba");
            return;
        }
        if (bundleInfo != null && this.cacheBundleMap.get(bundleInfo) == null && this.bundleTaskMap.get(bundleInfo) == null) {
            StringBuilder sb = new StringBuilder("add bundle info , bundleName : ");
            sb.append(bundleInfo.getDDBundleName());
            sb.append(" ,bundleVersion : ");
            sb.append(bundleInfo.getBundleVersion());
            AsyncManager.executeSingle(realGenerateBundleTask(bundleInfo), 1);
        }
    }

    private synchronized void configDeleteBundle(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed303d04ebc93775913884010fde9ddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed303d04ebc93775913884010fde9ddd");
        } else if (bundleInfo == null) {
        } else {
            if (this.cacheBundleMap.get(bundleInfo) != null) {
                StringBuilder sb = new StringBuilder("delete bundle info form cache , bundleName : ");
                sb.append(bundleInfo.getDDBundleName());
                sb.append(" ,bundleVersion : ");
                sb.append(bundleInfo.getBundleVersion());
                removeBundle(bundleInfo);
            }
            final DependencyTask<BundleInfo, AiBundle> dependencyTask = this.bundleTaskMap.get(bundleInfo);
            if (dependencyTask == null) {
                return;
            }
            if (LogUtil.isLogEnabled()) {
                StringBuilder sb2 = new StringBuilder("delete bundle info from task, bundleName ");
                sb2.append(dependencyTask.getTaskUniqueId().getDDBundleName());
                sb2.append(" ,bundleVersion : ");
                sb2.append(dependencyTask.getTaskUniqueId().getBundleVersion());
            }
            dependencyTask.addOnTaskFinishListener(new OnTaskFinishListener<BundleInfo, AiBundle>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.13
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                public /* bridge */ /* synthetic */ void onTaskFinish(Map<BundleInfo, AiBundle> map, AiBundle aiBundle, long j, List list) {
                    onTaskFinish2(map, aiBundle, j, (List<Exception>) list);
                }

                /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                public void onTaskFinish2(Map<BundleInfo, AiBundle> map, AiBundle aiBundle, long j, List<Exception> list) {
                    Object[] objArr2 = {map, aiBundle, new Long(j), list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "74812381139dcf2b5d0ec76d7b7cde9d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "74812381139dcf2b5d0ec76d7b7cde9d");
                    } else {
                        AIDispatcher.this.removeBundle((BundleInfo) dependencyTask.getTaskUniqueId());
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
        if (r13.hasNext() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
        configDeleteCEP(r13.next());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void updateCEPInfo(java.lang.String r12, java.util.List<com.meituan.android.common.aidata.resources.config.DDResourceRequest> r13, java.util.List<com.meituan.android.common.aidata.resources.config.DDResourceRequest> r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.AIDispatcher.updateCEPInfo(java.lang.String, java.util.List, java.util.List):void");
    }

    private synchronized void configUpdateCEP(@NonNull DDResourceRequest dDResourceRequest, @NonNull DDResourceRequest dDResourceRequest2) {
        Object[] objArr = {dDResourceRequest, dDResourceRequest2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "983f9c68e57f849291a61191be9202ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "983f9c68e57f849291a61191be9202ee");
            return;
        }
        if (dDResourceRequest2 != null && !this.cacheCEPMap.containsKey(dDResourceRequest2) && !this.cepTaskMap.containsKey(dDResourceRequest2)) {
            StringBuilder sb = new StringBuilder("update CEP , CEP name : ");
            sb.append(dDResourceRequest2.mResourcePackName);
            sb.append(" ,old version : ");
            sb.append(dDResourceRequest == null ? "" : dDResourceRequest.mVer);
            sb.append(" , new version : ");
            sb.append(dDResourceRequest2.mVer);
            StringBuilder sb2 = new StringBuilder("generate CEP task create , biz : ");
            sb2.append(dDResourceRequest2.mBiz);
            sb2.append(" ,bundleName : ");
            sb2.append(dDResourceRequest2.mResourcePackName);
            sb2.append(", bundleVersion : ");
            sb2.append(dDResourceRequest2.mVer);
            DependencyTask<DDResourceRequest, List<FeatureBean>> dependencyTask = new DependencyTask<>(dDResourceRequest2);
            this.cepTaskMap.put(dDResourceRequest2, dependencyTask);
            dependencyTask.setAsyncCall(new AnonymousClass14(dDResourceRequest2, dDResourceRequest));
            AsyncManager.executeSingle(dependencyTask, 1);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.common.aidata.ai.AIDispatcher$14  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass14 implements TaskAsyncCallable<DDResourceRequest, List<FeatureBean>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ DDResourceRequest val$newRequest;
        public final /* synthetic */ DDResourceRequest val$oldRequest;

        public AnonymousClass14(DDResourceRequest dDResourceRequest, DDResourceRequest dDResourceRequest2) {
            this.val$newRequest = dDResourceRequest;
            this.val$oldRequest = dDResourceRequest2;
        }

        @Override // com.meituan.android.common.aidata.async.tasks.TaskAsyncCallable
        public void asyncCall(DependencyTask<DDResourceRequest, List<FeatureBean>> dependencyTask, final TaskAsyncNotifier<List<FeatureBean>> taskAsyncNotifier, long j, final boolean z) {
            Object[] objArr = {dependencyTask, taskAsyncNotifier, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e564723906e567e77d2b9fd282fa9ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e564723906e567e77d2b9fd282fa9ff");
                return;
            }
            StringBuilder sb = new StringBuilder("generate CEP task start, CEP name : ");
            sb.append(this.val$newRequest.mResourcePackName);
            sb.append(", CEP version : ");
            sb.append(this.val$newRequest.mVer);
            sb.append(" ,taskTimeOut : ");
            sb.append(z);
            AiBundleManager.getInstance().loadCEP(this.val$newRequest, new DDResResultCallback() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.14.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.resources.downloader.DDResResultCallback
                public void onSuccess(final DDResResponse dDResResponse) {
                    Object[] objArr2 = {dDResResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c491af4789bb80f314003628e1e5249e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c491af4789bb80f314003628e1e5249e");
                    } else if (AIDispatcher.this.cacheCEPMap.containsKey(AnonymousClass14.this.val$oldRequest)) {
                        AIDispatcher.this.removeCEP(AnonymousClass14.this.val$oldRequest);
                        AIDispatcher.this.handleCepDownloadSuccess(AnonymousClass14.this.val$newRequest, dDResResponse, taskAsyncNotifier, z);
                    } else {
                        final DependencyTask dependencyTask2 = (DependencyTask) AIDispatcher.this.cepTaskMap.get(AnonymousClass14.this.val$oldRequest);
                        if (dependencyTask2 == null) {
                            AIDispatcher.this.handleCepDownloadSuccess(AnonymousClass14.this.val$newRequest, dDResResponse, taskAsyncNotifier, z);
                        } else {
                            dependencyTask2.addOnTaskFinishListener(new OnTaskFinishListener<DDResourceRequest, List<FeatureBean>>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.14.1.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                                public /* bridge */ /* synthetic */ void onTaskFinish(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list, long j2, List list2) {
                                    onTaskFinish2(map, list, j2, (List<Exception>) list2);
                                }

                                /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                                public void onTaskFinish2(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list, long j2, List<Exception> list2) {
                                    Object[] objArr3 = {map, list, new Long(j2), list2};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cbe25f563583c1bf329cc859ee804b98", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cbe25f563583c1bf329cc859ee804b98");
                                        return;
                                    }
                                    AIDispatcher.this.removeCEP((DDResourceRequest) dependencyTask2.getTaskUniqueId());
                                    AIDispatcher.this.handleCepDownloadSuccess(AnonymousClass14.this.val$newRequest, dDResResponse, taskAsyncNotifier, z);
                                }
                            });
                        }
                    }
                }

                @Override // com.meituan.android.common.aidata.resources.downloader.DDResResultCallback
                public void onFail(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a740800e7509415a2506be4294ca4a13", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a740800e7509415a2506be4294ca4a13");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("generate CEP task finish with fail , CEP name : ");
                    sb2.append(AnonymousClass14.this.val$newRequest.mResourcePackName);
                    sb2.append(", CEP version : ");
                    sb2.append(AnonymousClass14.this.val$newRequest.mVer);
                    sb2.append(" ,taskTimeOut : ");
                    sb2.append(z);
                    sb2.append(" , error info : ");
                    sb2.append(exc != null ? exc.toString() : RaptorConstants.ERROR_UNKNOWN_VALUE);
                    AIDispatcher.this.handleCEP(AnonymousClass14.this.val$newRequest, null);
                    if (taskAsyncNotifier != null) {
                        taskAsyncNotifier.notify(null, exc);
                    }
                }
            });
        }
    }

    private synchronized void configAddCEP(DDResourceRequest dDResourceRequest) {
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e87034b0cf1a11529a0606b6b8ddc0a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e87034b0cf1a11529a0606b6b8ddc0a6");
            return;
        }
        if (dDResourceRequest != null && !this.cacheCEPMap.containsKey(dDResourceRequest) && !this.cepTaskMap.containsKey(dDResourceRequest)) {
            StringBuilder sb = new StringBuilder("add CEP : ");
            sb.append(dDResourceRequest.mResourcePackName);
            sb.append(" ,version : ");
            sb.append(dDResourceRequest.mVer);
            AsyncManager.executeSingle(realGenerateCEPTask(dDResourceRequest), 1);
        }
    }

    private synchronized void configDeleteCEP(DDResourceRequest dDResourceRequest) {
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dcbcad17b7c02164d869ab2470fc11f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dcbcad17b7c02164d869ab2470fc11f");
        } else if (dDResourceRequest == null) {
        } else {
            if (this.cacheCEPMap.get(dDResourceRequest) != null) {
                StringBuilder sb = new StringBuilder("remove CEP form cache , CEP name : ");
                sb.append(dDResourceRequest.mResourcePackName);
                sb.append(" ,version : ");
                sb.append(dDResourceRequest.mVer);
                removeCEP(dDResourceRequest);
            }
            final DependencyTask<DDResourceRequest, List<FeatureBean>> dependencyTask = this.cepTaskMap.get(dDResourceRequest);
            if (dependencyTask != null) {
                StringBuilder sb2 = new StringBuilder("remove CEP form task , CEP name ");
                sb2.append(dependencyTask.getTaskUniqueId().mResourcePackName);
                sb2.append(" ,version : ");
                sb2.append(dependencyTask.getTaskUniqueId().mVer);
                dependencyTask.addOnTaskFinishListener(new OnTaskFinishListener<DDResourceRequest, List<FeatureBean>>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.15
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                    public /* bridge */ /* synthetic */ void onTaskFinish(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list, long j, List list2) {
                        onTaskFinish2(map, list, j, (List<Exception>) list2);
                    }

                    /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                    public void onTaskFinish2(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list, long j, List<Exception> list2) {
                        Object[] objArr2 = {map, list, new Long(j), list2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "184c67c5b44bbae62963b1001a8e7b69", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "184c67c5b44bbae62963b1001a8e7b69");
                        } else {
                            AIDispatcher.this.removeCEP((DDResourceRequest) dependencyTask.getTaskUniqueId());
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleCepDownloadSuccess(@NonNull DDResourceRequest dDResourceRequest, DDResResponse dDResResponse, TaskAsyncNotifier<List<FeatureBean>> taskAsyncNotifier, boolean z) {
        List<DDResResponse.PackageBean> result;
        List<FeatureBean> parsePackageContent;
        Object[] objArr = {dDResourceRequest, dDResResponse, taskAsyncNotifier, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e4143e790507bd763099261fe1c554b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e4143e790507bd763099261fe1c554b");
            return;
        }
        StringBuilder sb = new StringBuilder("generate CEP task finish with success , CEP name : ");
        sb.append(dDResourceRequest.mResourcePackName);
        sb.append(", CEP version : ");
        sb.append(dDResourceRequest.mVer);
        sb.append(" ,taskTimeOut : ");
        sb.append(z);
        if (dDResResponse != null && (result = dDResResponse.getResult()) != null && (parsePackageContent = CepResourceManager.parsePackageContent(result)) != null && !parsePackageContent.isEmpty()) {
            for (FeatureBean featureBean : parsePackageContent) {
                if (featureBean != null) {
                    FeatureProducerManager.getInstance().registerFeatureProducer(new SQLFeatureProducer(featureBean.feature));
                    tryCreateCEPSubTable(featureBean);
                }
            }
            if (AIDataDelegate.getInstance().isBizStart(dDResourceRequest.mBiz)) {
                startCEP(parsePackageContent);
                dDResourceRequest.isStart = true;
            }
            handleCEP(dDResourceRequest, parsePackageContent);
            if (taskAsyncNotifier != null) {
                taskAsyncNotifier.notify(parsePackageContent, null);
            }
            return;
        }
        handleCEP(dDResourceRequest, null);
        if (taskAsyncNotifier != null) {
            taskAsyncNotifier.notify(null, new Exception("result is null"));
        }
    }

    private void tryCreateCEPSubTable(@NonNull FeatureBean featureBean) {
        SubTableConfigBean subTableConfigBean;
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cf93d6ad5a2627d39e3be7f02e0c2a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cf93d6ad5a2627d39e3be7f02e0c2a5");
            return;
        }
        String str = featureBean.feature;
        new StringBuilder("try create CEP SubTable for feature ").append(str);
        if (TextUtils.isEmpty(str) || featureBean.cep == null || featureBean.sqlBean != null || (subTableConfigBean = featureBean.subTableConfigBean) == null) {
            return;
        }
        String subTableName = subTableConfigBean.getSubTableName();
        if (!TextUtils.isEmpty(subTableName) && DBCEPSubTableDataHelper.getInstance().createTable(featureBean, subTableName, subTableConfigBean.getTableIndexList())) {
            CEPSubTableCEPServiceManager.getInstance().subscribeCepServiceCallback(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCEP(List<FeatureBean> list) {
        Map<String, DDPresetConfig> dDPresetConfig;
        DDPresetConfig dDPresetConfig2;
        List<EventData> cacheQueue;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce28c3117a99b49680e892377db2169e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce28c3117a99b49680e892377db2169e");
        } else if (list != null && list.size() > 0) {
            for (FeatureBean featureBean : list) {
                if (featureBean != null) {
                    if (EventDataCacheManager.getInstance().hasProcessedCacheBundles(featureBean.packageName) || (dDPresetConfig = ResourceConfigManager.getInstance().getDDPresetConfig()) == null || dDPresetConfig.isEmpty() || (dDPresetConfig2 = dDPresetConfig.get(featureBean.packageName)) == null || dDPresetConfig2.getUseCache() == 0) {
                        AIDataDelegate.getInstance().startRuleTrigger(featureBean);
                        StringBuilder sb = new StringBuilder("start trigger : ");
                        sb.append(featureBean.packageName);
                        sb.append(CommonConstant.Symbol.COLON);
                        sb.append(featureBean.packageVersion);
                    } else {
                        synchronized (EventDataCacheManager.getInstance()) {
                            IRuleTrigger ruleTrigger = AIDataDelegate.getInstance().getRuleTrigger(featureBean);
                            StringBuilder sb2 = new StringBuilder("start trigger : ");
                            sb2.append(featureBean.packageName);
                            sb2.append(CommonConstant.Symbol.COLON);
                            sb2.append(featureBean.packageVersion);
                            if ((ruleTrigger instanceof CepRuleTrigger) && (cacheQueue = EventDataCacheManager.getInstance().getCacheQueue()) != null && !cacheQueue.isEmpty()) {
                                for (EventData eventData : cacheQueue) {
                                    eventData.is_cache = 1;
                                    ((CepRuleTrigger) ruleTrigger).run4Cache(eventData);
                                }
                                StringBuilder sb3 = new StringBuilder("add linxi data to ");
                                sb3.append(featureBean.packageName);
                                sb3.append(CommonConstant.Symbol.COLON);
                                sb3.append(featureBean.packageVersion);
                                EventDataCacheManager.getInstance().addHasProcessedCacheBundle(featureBean.packageName);
                                CepResourceManager.getInstance().cacheEvent4InValid(ruleTrigger, cacheQueue.get(cacheQueue.size() - 1));
                            }
                            ruleTrigger.start();
                            if (AIDataDelegate.getInstance().isDebugEnable()) {
                                LogUtil.aiLogD("CEP start , CEP name : " + featureBean.packageName + " , CEP version : " + featureBean.packageVersion + " , CEP biz : " + featureBean.biz);
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean isValidSQLFeature(DDResourceRequest dDResourceRequest) {
        Object[] objArr = {dDResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f444112f1f6bb7c35a72a36b71192018", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f444112f1f6bb7c35a72a36b71192018")).booleanValue();
        }
        List<FeatureBean> list = this.cacheCEPMap.get(dDResourceRequest);
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void stopCepByBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65ee948d2d5877ea5b1547f1f8511d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65ee948d2d5877ea5b1547f1f8511d65");
        } else if (!TextUtils.isEmpty(str)) {
            List<DDResourceRequest> cepResourceConfig = ResourceConfigManager.getInstance().getCepResourceConfig(str);
            if (cepResourceConfig == null) {
                StringBuilder sb = new StringBuilder("stopCepByBiz : ");
                sb.append(str);
                sb.append(" contains no cep task");
                return;
            }
            for (DDResourceRequest dDResourceRequest : cepResourceConfig) {
                if (dDResourceRequest != null && dDResourceRequest.isStart) {
                    dDResourceRequest.isStart = false;
                    final List<FeatureBean> list = this.cacheCEPMap.get(dDResourceRequest);
                    if (list != null) {
                        for (FeatureBean featureBean : list) {
                            AIDataDelegate.getInstance().stopRuleTrigger(featureBean);
                        }
                    } else {
                        DependencyTask<DDResourceRequest, List<FeatureBean>> dependencyTask = this.cepTaskMap.get(dDResourceRequest);
                        if (dependencyTask != null) {
                            dependencyTask.addOnTaskFinishListener(new OnTaskFinishListener<DDResourceRequest, List<FeatureBean>>() { // from class: com.meituan.android.common.aidata.ai.AIDispatcher.16
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                                public /* bridge */ /* synthetic */ void onTaskFinish(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list2, long j, List list3) {
                                    onTaskFinish2(map, list2, j, (List<Exception>) list3);
                                }

                                /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                                public void onTaskFinish2(Map<DDResourceRequest, List<FeatureBean>> map, List<FeatureBean> list2, long j, List<Exception> list3) {
                                    Object[] objArr2 = {map, list2, new Long(j), list3};
                                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "35bfa8634ad9711bf1fbcbca78d1dec2", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "35bfa8634ad9711bf1fbcbca78d1dec2");
                                    } else if (list != null) {
                                        for (FeatureBean featureBean2 : list) {
                                            AIDataDelegate.getInstance().stopRuleTrigger(featureBean2);
                                        }
                                    }
                                }
                            });
                        } else {
                            StringBuilder sb2 = new StringBuilder("stopCepByBiz : ");
                            sb2.append(str);
                            sb2.append(" contains cep task :");
                            sb2.append(dDResourceRequest.mResName);
                            sb2.append(" ,version : ");
                            sb2.append(dDResourceRequest.mVer);
                        }
                    }
                }
            }
        }
    }

    public String getBundleVersion(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d4a33dbe0202df14efa3a487c3206e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d4a33dbe0202df14efa3a487c3206e4");
        }
        AiBundle aiBundle = this.cacheBundleMap.get(bundleInfo);
        return aiBundle == null ? "" : aiBundle.getBundleVersion();
    }
}
