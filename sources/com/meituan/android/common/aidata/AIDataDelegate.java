package com.meituan.android.common.aidata;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.bundle.AiBundleManager;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorManager;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorService;
import com.meituan.android.common.aidata.ai.mlmodel.operator.producer.common.CommonOperatorProducer;
import com.meituan.android.common.aidata.ai.mlmodel.operator.producer.date.DateOperatorProducer;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.PredictorInitializer;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.android.common.aidata.async.AsyncHashSet;
import com.meituan.android.common.aidata.cache.DBCacheHandler;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.cep.CustomCepContext;
import com.meituan.android.common.aidata.cep.ICustomCepServiceListener;
import com.meituan.android.common.aidata.cep.rule.IRuleTrigger;
import com.meituan.android.common.aidata.cep.rule.IRuleTriggerCallback;
import com.meituan.android.common.aidata.cep.rule.RuleTriggerManager;
import com.meituan.android.common.aidata.cep.rule.cep.CepRuleTrigger;
import com.meituan.android.common.aidata.config.DBAuthConfig;
import com.meituan.android.common.aidata.core.QueryBuilder;
import com.meituan.android.common.aidata.core.ThreadPoolManager;
import com.meituan.android.common.aidata.data.DataManager;
import com.meituan.android.common.aidata.data.rule.CEPSubscriberConfig;
import com.meituan.android.common.aidata.data.rule.ICepArrayServiceListener;
import com.meituan.android.common.aidata.data.rule.ICepServiceListener;
import com.meituan.android.common.aidata.feature.FeatureService;
import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.android.common.aidata.feature.UpdateFeatureRequest;
import com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper;
import com.meituan.android.common.aidata.feature.producer.FeatureProducerManager;
import com.meituan.android.common.aidata.feature.producer.IFeatureProducerListener;
import com.meituan.android.common.aidata.feature.producer.ProduceRequest;
import com.meituan.android.common.aidata.feature.producer.SQLFeatureProducer;
import com.meituan.android.common.aidata.jsengine.modules.IJSNativeModule;
import com.meituan.android.common.aidata.jsengine.modules.INativeModuleProvider;
import com.meituan.android.common.aidata.jsengine.modules.NativeModuleManager;
import com.meituan.android.common.aidata.jsengine.modules.autopredict.AIDataModule;
import com.meituan.android.common.aidata.jsengine.modules.core.CoreNativeModule;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.android.common.aidata.resources.manager.CepResourceManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.stateparser.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AIDataDelegate implements IRuleTriggerCallback, CepResourceManager.OnFeatureConfigUpdateListener {
    private static final String TAG = "AIDataDelegate";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ConcurrentHashMap<String, Set<ICustomCepServiceListener>> mCustomRuleMatchedCbList;
    private boolean mEnableDebug;
    private boolean mEnableRemoteJSEngine;
    private final ConcurrentHashMap<String, Set<ICepArrayServiceListener>> mRuleArrayMatchedCbList;
    private final ConcurrentHashMap<String, Set<ICepServiceListener>> mRuleMatchedCbList;
    private final Set<String> mTriggeredBizSet;

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAiWithBiz(String str) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        private static final AIDataDelegate INSTANCE = new AIDataDelegate();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public AIDataDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aac095749a648392e7bd1c7ba5dc5ee1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aac095749a648392e7bd1c7ba5dc5ee1");
            return;
        }
        this.mTriggeredBizSet = new AsyncHashSet();
        this.mRuleMatchedCbList = new AsyncHashMap();
        this.mRuleArrayMatchedCbList = new AsyncHashMap();
        this.mCustomRuleMatchedCbList = new AsyncHashMap();
        this.mEnableDebug = false;
        this.mEnableRemoteJSEngine = false;
    }

    public static AIDataDelegate getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7f30e224e6fdbfa763da7775e37229ab", RobustBitConfig.DEFAULT_VALUE) ? (AIDataDelegate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7f30e224e6fdbfa763da7775e37229ab") : Holder.INSTANCE;
    }

    public void init(InitConfig initConfig) {
        Object[] objArr = {initConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f60ac73003cb8ca7f87533858c6e7e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f60ac73003cb8ca7f87533858c6e7e5");
            return;
        }
        if (initConfig == null) {
            CatMonitorManager.getInstance().reportInitMonitor(0, 2);
        } else {
            AppUtil.setEnv(initConfig.getEnv());
            int cachePeriod = initConfig.getCachePeriod();
            initConfig.checkValid();
            CatMonitorManager.getInstance().reportInitMonitor(cachePeriod, initConfig.getCachePeriod());
        }
        DataManager.getInstance().initConfig(initConfig);
        DataManager.getInstance().subscribeData();
        initCoreNativeModule();
        CepResourceManager.getInstance().subscribeFeatureConfigListener(this);
        initStaticOperator();
        AiBundleManager.getInstance().init(AiDownloadEnv.DEBUG);
        PredictorInitializer.initPredictor();
    }

    private void initCoreNativeModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "651ec201c8f1f03200d0db758963d561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "651ec201c8f1f03200d0db758963d561");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new INativeModuleProvider() { // from class: com.meituan.android.common.aidata.AIDataDelegate.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.jsengine.modules.INativeModuleProvider
            public List<IJSNativeModule> getModulePackageList() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db8e6def7a9f5205646b87d4a131a9aa", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db8e6def7a9f5205646b87d4a131a9aa");
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new CoreNativeModule());
                arrayList2.add(new AIDataModule());
                List a = b.a(IJSNativeModule.class, (String) null);
                if (a != null && a.size() > 0) {
                    arrayList2.addAll(a);
                }
                return arrayList2;
            }
        });
        NativeModuleManager.getInstance().registerNativeModule(arrayList);
    }

    public List<ResultRow> query(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68991856f317ea71f0a72ab2f679278b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68991856f317ea71f0a72ab2f679278b");
        }
        if (AIData.getContext() == null) {
            return null;
        }
        String buildQueryString = QueryBuilder.buildQueryString(str2, str3, str4, str5, str6, str7, str8);
        new StringBuilder("original query sql: ").append(buildQueryString);
        String transform = DBAuthConfig.transform(str, buildQueryString);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" final query sql is ");
        sb.append(transform);
        if (TextUtils.isEmpty(transform)) {
            CatMonitorManager.getInstance().reportDbQueryFailData("", "", "", "", "", "", "", buildQueryString, true, "db auth fail : check failed", "0.0.9.77", str);
            return null;
        }
        return DBCacheHandler.getInstance().query(transform, null, str, true);
    }

    @Nullable
    public List<ResultRow> querySubTable(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65244bcb6e241c9926ed88e14ff91c32", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65244bcb6e241c9926ed88e14ff91c32");
        }
        if (TextUtils.isEmpty(str)) {
            RaptorUploaderImpl.reportSubTableQuery(str, 0L, new BlueException("token is empty"));
            return null;
        } else if (TextUtils.isEmpty(str3)) {
            RaptorUploaderImpl.reportSubTableQuery(str, 0L, new BlueException("sql from clause is empty"));
            return null;
        } else if (AIData.getContext() == null) {
            RaptorUploaderImpl.reportSubTableQuery(str, 0L, new BlueException("context is null when query subTable"));
            return null;
        } else {
            try {
                String buildQueryString = QueryBuilder.buildQueryString(str2, str3, str4, str5, str6, str7, str8);
                new StringBuilder("query subTable sql: ").append(buildQueryString);
                if (DBAuthConfig.checkAccessSubTableAllowed(str, buildQueryString)) {
                    return DBCEPSubTableDataHelper.getInstance().query(buildQueryString, null, str, true);
                }
                RaptorUploaderImpl.reportSubTableQuery(str, 0L, new BlueException("subTable is not allowed"));
                return null;
            } catch (Exception e) {
                new StringBuilder("build query sql failed: ").append(e);
                RaptorUploaderImpl.reportSubTableQuery(str, 0L, new BlueException(e.getMessage()));
                return null;
            }
        }
    }

    public void startServiceWithBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e65741bac554b9d01bdc4ed98d5f749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e65741bac554b9d01bdc4ed98d5f749");
            return;
        }
        new StringBuilder("AIData enableFeature biz:").append(str);
        this.mTriggeredBizSet.add(str);
        CatMonitorManager.getInstance().recordStartCepServiceByBiz(str);
        AIDispatcher.getInstance().addStartBizTask(str);
    }

    public void stopServiceWithBiz(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b1af29ba20505497f21685b7abafb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b1af29ba20505497f21685b7abafb5");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mTriggeredBizSet.remove(str);
            CatMonitorManager.getInstance().recordStopCepServiceByBiz(str);
            ThreadPoolManager.commitCepTask(new Runnable() { // from class: com.meituan.android.common.aidata.AIDataDelegate.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e9fc0782494ee5371fa535ae84cf4c14", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e9fc0782494ee5371fa535ae84cf4c14");
                        return;
                    }
                    AIDispatcher.getInstance().stopCepByBiz(str);
                    AIDataDelegate.this.stopAiWithBiz(str);
                }
            });
        }
    }

    @Override // com.meituan.android.common.aidata.cep.rule.IRuleTriggerCallback
    public void ruleMatchSucceed(final String str, final String str2, final a aVar, final List<StreamData> list, final JSONObject jSONObject, final int i, final String str3) {
        Object[] objArr = {str, str2, aVar, list, jSONObject, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b0409f58d854d836f1bd07404f7386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b0409f58d854d836f1bd07404f7386");
            return;
        }
        StringBuilder sb = new StringBuilder("ruleMatchSucceed success : biz:");
        sb.append(str);
        sb.append(" feature identifier:");
        sb.append(str2);
        sb.append(" rule identifier:");
        sb.append(aVar.e);
        final FeatureBean featureBeanList = CepResourceManager.getInstance().getFeatureBeanList(str, str2);
        if (featureBeanList != null && featureBeanList.sqlBean != null && featureBeanList.sqlBean.mSql != null) {
            LoganManager.getInstance().recordSqlFeatureProduce(str, featureBeanList, aVar.e, list, i);
            final String str4 = featureBeanList.feature + AppUtil.getUniqueId();
            CatMonitorManager.getInstance().recordSqlFeatureProduceForCep(featureBeanList, str4, aVar.e, aVar.d, str3);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            FeatureProducerManager.getInstance().produceFeature(new ProduceRequest(featureBeanList.feature, featureBeanList.feature, featureBeanList.sqlBean.mSql, featureBeanList), new IFeatureProducerListener() { // from class: com.meituan.android.common.aidata.AIDataDelegate.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducerListener
                public void onSuccess(@Nullable Map<String, List<ResultRow>> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "68e0b7513cb409146ca36bee332469a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "68e0b7513cb409146ca36bee332469a9");
                        return;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    StringBuilder sb2 = new StringBuilder("ruleMatchSucceed produceFeature success : biz:");
                    sb2.append(str);
                    sb2.append(" featureKey:");
                    sb2.append(str2);
                    sb2.append(" ruleId:");
                    sb2.append(aVar.e);
                    if (map != null && map.size() > 0) {
                        for (Map.Entry<String, List<ResultRow>> entry : map.entrySet()) {
                            new StringBuilder("      result entry key:").append(entry.getKey());
                            List<ResultRow> value = entry.getValue();
                            if (value != null && value.size() > 0) {
                                new StringBuilder("             each row item:").append(value.toString());
                            }
                        }
                    }
                    if (FeatureService.getInstance().getFeatureManager() != null) {
                        UpdateFeatureRequest updateFeatureRequest = new UpdateFeatureRequest();
                        updateFeatureRequest.feature = map;
                        FeatureService.getInstance().getFeatureManager().updateFeature(updateFeatureRequest);
                    }
                    AIDataDelegate.this.ruleMatchCallback(str2, aVar.e, list, jSONObject, i, featureBeanList.ver, str3);
                    CatMonitorManager.getInstance().recordSqlFeatureProduceFinish(featureBeanList, str4, 0, "", "0", elapsedRealtime2, map, true, "", aVar);
                }

                @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducerListener
                public void onFailed(@Nullable BlueException blueException) {
                    Object[] objArr2 = {blueException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "14762bde84eedba0d61f0a9e344e6154", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "14762bde84eedba0d61f0a9e344e6154");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("ruleMatchSucceed produceFeature failure : biz:");
                    sb2.append(str);
                    sb2.append(" featureKey:");
                    sb2.append(str2);
                    AIDataDelegate.this.ruleMatchCallback(str2, aVar.e, list, jSONObject, i, featureBeanList.ver, str3);
                    String str5 = "error message is empty";
                    String str6 = "-1";
                    if (blueException != null) {
                        str5 = blueException.getMessage();
                        str6 = blueException.getErrorCode();
                    }
                    CatMonitorManager.getInstance().recordSqlFeatureProduceFinish(featureBeanList, str4, 1, str5, str6, SystemClock.elapsedRealtime() - elapsedRealtime, null, true, "", aVar);
                }
            });
            return;
        }
        ruleMatchCallback(str2, aVar.e, list, jSONObject, i, featureBeanList.ver, str3);
    }

    @Override // com.meituan.android.common.aidata.resources.manager.CepResourceManager.OnFeatureConfigUpdateListener
    public synchronized void onFeatureConfigUpdate(final List<FeatureBean> list, final List<FeatureBean> list2, final List<FeatureBean> list3) {
        Object[] objArr = {list, list2, list3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48e6de7b33f4619810d139e0b9612ece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48e6de7b33f4619810d139e0b9612ece");
        } else {
            ThreadPoolManager.commitCepTask(new Runnable() { // from class: com.meituan.android.common.aidata.AIDataDelegate.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5df2197f9d1ac86b63a1893cb7ddf072", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5df2197f9d1ac86b63a1893cb7ddf072");
                        return;
                    }
                    if (list != null && list.size() > 0) {
                        for (FeatureBean featureBean : list) {
                            LoganManager.getInstance().recordFeatureUpdateData("aidata_cep_insert", featureBean);
                            FeatureProducerManager.getInstance().registerFeatureProducer(new SQLFeatureProducer(featureBean.feature));
                            if (!TextUtils.isEmpty(featureBean.biz) && AIDataDelegate.this.mTriggeredBizSet.contains(featureBean.biz)) {
                                AIDataDelegate.this.stopRuleTrigger(featureBean);
                                AIDataDelegate.this.startRuleTrigger(featureBean);
                            }
                        }
                    }
                    if (list2 != null && list2.size() > 0) {
                        for (FeatureBean featureBean2 : list2) {
                            LoganManager.getInstance().recordFeatureUpdateData("aidata_cep_update", featureBean2);
                            if (!TextUtils.isEmpty(featureBean2.biz) && AIDataDelegate.this.mTriggeredBizSet.contains(featureBean2.biz)) {
                                AIDataDelegate.this.stopRuleTrigger(featureBean2);
                                AIDataDelegate.this.startRuleTrigger(featureBean2);
                            }
                        }
                    }
                    if (list3 == null || list3.size() <= 0) {
                        return;
                    }
                    for (FeatureBean featureBean3 : list3) {
                        LoganManager.getInstance().recordFeatureUpdateData("aidata_cep_delete", featureBean3);
                        if (!TextUtils.isEmpty(featureBean3.biz) && AIDataDelegate.this.mTriggeredBizSet.contains(featureBean3.biz)) {
                            AIDataDelegate.this.stopRuleTrigger(featureBean3);
                            LoganManager.getInstance().recordCancelCepRule(featureBean3, RuleTriggerManager.getInstance().getRuleTrigger(featureBean3.feature));
                        }
                        FeatureProducerManager.getInstance().unregisterFeatureProducer(new SQLFeatureProducer(featureBean3.feature));
                    }
                }
            });
        }
    }

    private IRuleTrigger buildRuleTrigger(FeatureBean featureBean) {
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb0a4e76f617c277ccee739d7c8f3536", RobustBitConfig.DEFAULT_VALUE)) {
            return (IRuleTrigger) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb0a4e76f617c277ccee739d7c8f3536");
        }
        if (featureBean.cep != null) {
            return new CepRuleTrigger.RuleTriggerBuilder().addFeatureConfig(featureBean).addRuleTriggerCallback(this).build();
        }
        return null;
    }

    public void startRuleTrigger(FeatureBean featureBean) {
        IRuleTrigger ruleTrigger;
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea59d743ab39bd143e9e196e5222da4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea59d743ab39bd143e9e196e5222da4c");
            return;
        }
        if (!RuleTriggerManager.getInstance().hasAdded(featureBean.feature)) {
            ruleTrigger = buildRuleTrigger(featureBean);
            if (ruleTrigger != null) {
                RuleTriggerManager.getInstance().addRuleTrigger(ruleTrigger);
            }
        } else {
            ruleTrigger = RuleTriggerManager.getInstance().getRuleTrigger(featureBean.feature);
        }
        if (ruleTrigger != null) {
            if (getInstance().isDebugEnable()) {
                LogUtil.aiLogD("CEP start , CEP name : " + featureBean.packageName + " , CEP version : " + featureBean.packageVersion + " , CEP biz : " + featureBean.biz);
            }
            ruleTrigger.start();
        }
    }

    public IRuleTrigger getRuleTrigger(FeatureBean featureBean) {
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7418153115537a395b47b443955be61b", RobustBitConfig.DEFAULT_VALUE)) {
            return (IRuleTrigger) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7418153115537a395b47b443955be61b");
        }
        if (!RuleTriggerManager.getInstance().hasAdded(featureBean.feature)) {
            IRuleTrigger buildRuleTrigger = buildRuleTrigger(featureBean);
            if (buildRuleTrigger != null) {
                RuleTriggerManager.getInstance().addRuleTrigger(buildRuleTrigger);
                return buildRuleTrigger;
            }
            return buildRuleTrigger;
        }
        return RuleTriggerManager.getInstance().getRuleTrigger(featureBean.feature);
    }

    public void stopRuleTrigger(FeatureBean featureBean) {
        Object[] objArr = {featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6fcc566560bd0cd073871dc5f513635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6fcc566560bd0cd073871dc5f513635");
        } else if (featureBean == null) {
        } else {
            IRuleTrigger iRuleTrigger = null;
            if (RuleTriggerManager.getInstance().hasAdded(featureBean.feature) && (iRuleTrigger = RuleTriggerManager.getInstance().getRuleTrigger(featureBean.feature)) != null) {
                iRuleTrigger.stop();
                if (getInstance().isDebugEnable()) {
                    LogUtil.aiLogD("CEP stop , CEP name : " + featureBean.packageName + " , CEP version : " + featureBean.packageVersion + " , CEP biz : " + featureBean.biz);
                }
            }
            if (iRuleTrigger != null) {
                RuleTriggerManager.getInstance().removeRuleTrigger(iRuleTrigger);
            }
        }
    }

    public void subscribeCepServiceCallback(CEPSubscriberConfig cEPSubscriberConfig, ICepServiceListener iCepServiceListener) {
        Object[] objArr = {cEPSubscriberConfig, iCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b71d721451a6dd35783dafc1326516eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b71d721451a6dd35783dafc1326516eb");
            return;
        }
        synchronized (this) {
            if (cEPSubscriberConfig != null) {
                try {
                    if (cEPSubscriberConfig.getFeatureList() != null && cEPSubscriberConfig.getFeatureList().size() > 0 && iCepServiceListener != null) {
                        for (String str : cEPSubscriberConfig.getFeatureList()) {
                            if (!TextUtils.isEmpty(str) && this.mRuleMatchedCbList != null) {
                                Set<ICepServiceListener> set = this.mRuleMatchedCbList.get(str);
                                if (set == null) {
                                    set = new LinkedHashSet<>();
                                    this.mRuleMatchedCbList.put(str, set);
                                }
                                set.add(iCepServiceListener);
                            }
                        }
                        LoganManager.getInstance().recordCepSubscribeState("aidata_cep_listener_add", cEPSubscriberConfig, iCepServiceListener);
                    }
                } finally {
                }
            }
        }
    }

    public void unsubscribeCepServiceCallback(ICepServiceListener iCepServiceListener) {
        Object[] objArr = {iCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d24439521f31372a3656636c5127643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d24439521f31372a3656636c5127643");
        } else if (iCepServiceListener != null) {
            synchronized (this) {
                if (this.mRuleMatchedCbList != null && this.mRuleMatchedCbList.size() > 0) {
                    for (Map.Entry<String, Set<ICepServiceListener>> entry : this.mRuleMatchedCbList.entrySet()) {
                        if (entry.getValue() != null && entry.getValue().size() > 0) {
                            entry.getValue().remove(iCepServiceListener);
                        }
                    }
                }
            }
            LoganManager.getInstance().recordCepSubscribeState("aidata_cep_listener_remove", (CEPSubscriberConfig) null, iCepServiceListener);
        }
    }

    public void unsubscribeSpecifyCepServiceCallback(ICepServiceListener iCepServiceListener, String str) {
        Object[] objArr = {iCepServiceListener, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eebd270ea1d4a8e364f49a00252fe033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eebd270ea1d4a8e364f49a00252fe033");
        } else if (iCepServiceListener == null) {
        } else {
            synchronized (this) {
                if (this.mRuleMatchedCbList != null && !TextUtils.isEmpty(str)) {
                    this.mRuleMatchedCbList.remove(str);
                }
            }
        }
    }

    public void unsubscribeSpecificCepServiceCallback(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a332bfbf17f261402b7a296a16efc44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a332bfbf17f261402b7a296a16efc44");
            return;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                this.mRuleArrayMatchedCbList.remove(str);
            }
        }
    }

    public void subscribeCepServiceCallback(CEPSubscriberConfig cEPSubscriberConfig, ICepArrayServiceListener iCepArrayServiceListener) {
        Object[] objArr = {cEPSubscriberConfig, iCepArrayServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53063393642d5168ee72f15c560e0292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53063393642d5168ee72f15c560e0292");
            return;
        }
        synchronized (this) {
            if (cEPSubscriberConfig != null) {
                try {
                    if (cEPSubscriberConfig.getFeatureList() != null && cEPSubscriberConfig.getFeatureList().size() > 0 && iCepArrayServiceListener != null) {
                        for (String str : cEPSubscriberConfig.getFeatureList()) {
                            if (!TextUtils.isEmpty(str) && this.mRuleArrayMatchedCbList != null) {
                                Set<ICepArrayServiceListener> set = this.mRuleArrayMatchedCbList.get(str);
                                if (set == null) {
                                    set = new LinkedHashSet<>();
                                    this.mRuleArrayMatchedCbList.put(str, set);
                                }
                                set.add(iCepArrayServiceListener);
                            }
                        }
                        LoganManager.getInstance().recordCepSubscribeState("aidata_cep_listener_add", cEPSubscriberConfig, iCepArrayServiceListener);
                    }
                } finally {
                }
            }
        }
    }

    public void unsubscribeCepServiceCallback(ICepArrayServiceListener iCepArrayServiceListener) {
        Object[] objArr = {iCepArrayServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "628ac944011b92966cccf57b405182e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "628ac944011b92966cccf57b405182e5");
        } else if (iCepArrayServiceListener != null) {
            synchronized (this) {
                if (this.mRuleArrayMatchedCbList != null && this.mRuleArrayMatchedCbList.size() > 0) {
                    for (Map.Entry<String, Set<ICepArrayServiceListener>> entry : this.mRuleArrayMatchedCbList.entrySet()) {
                        if (entry.getValue() != null && entry.getValue().size() > 0) {
                            entry.getValue().remove(iCepArrayServiceListener);
                        }
                    }
                }
            }
            LoganManager.getInstance().recordCepSubscribeState("aidata_cep_listener_remove", (CEPSubscriberConfig) null, iCepArrayServiceListener);
        }
    }

    public void subscribeCustomCepServiceCallback(CEPSubscriberConfig cEPSubscriberConfig, ICustomCepServiceListener iCustomCepServiceListener) {
        Object[] objArr = {cEPSubscriberConfig, iCustomCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed252777bb423a8ea5f50bae001382a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed252777bb423a8ea5f50bae001382a9");
            return;
        }
        synchronized (this) {
            if (cEPSubscriberConfig != null) {
                try {
                    if (cEPSubscriberConfig.getFeatureList() != null && cEPSubscriberConfig.getFeatureList().size() > 0 && iCustomCepServiceListener != null) {
                        for (String str : cEPSubscriberConfig.getFeatureList()) {
                            if (!TextUtils.isEmpty(str) && this.mCustomRuleMatchedCbList != null) {
                                Set<ICustomCepServiceListener> set = this.mCustomRuleMatchedCbList.get(str);
                                if (set == null) {
                                    set = new LinkedHashSet<>();
                                    this.mCustomRuleMatchedCbList.put(str, set);
                                }
                                set.add(iCustomCepServiceListener);
                            }
                        }
                        LoganManager.getInstance().recordCepSubscribeState("aidata_cep_listener_add", cEPSubscriberConfig, iCustomCepServiceListener);
                    }
                } finally {
                }
            }
        }
    }

    public void unsubscribeCepServiceCallback(ICustomCepServiceListener iCustomCepServiceListener) {
        Object[] objArr = {iCustomCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c23cb44ec870044336c5906db507077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c23cb44ec870044336c5906db507077");
        } else if (iCustomCepServiceListener != null) {
            synchronized (this) {
                if (this.mCustomRuleMatchedCbList != null && this.mCustomRuleMatchedCbList.size() > 0) {
                    for (Map.Entry<String, Set<ICustomCepServiceListener>> entry : this.mCustomRuleMatchedCbList.entrySet()) {
                        if (entry.getValue() != null && entry.getValue().size() > 0) {
                            entry.getValue().remove(iCustomCepServiceListener);
                        }
                    }
                }
            }
            LoganManager.getInstance().recordCepSubscribeState("aidata_cep_listener_remove", (CEPSubscriberConfig) null, iCustomCepServiceListener);
        }
    }

    public void ruleMatchCallback(final String str, final String str2, final List<StreamData> list, final JSONObject jSONObject, final int i, final String str3, final String str4) {
        Object[] objArr = {str, str2, list, jSONObject, Integer.valueOf(i), str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1536be953626921f03cf87531158fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1536be953626921f03cf87531158fae");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ThreadPoolManager.commitCepTask(new Runnable() { // from class: com.meituan.android.common.aidata.AIDataDelegate.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "258266477190f030b264c071f8b5a1d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "258266477190f030b264c071f8b5a1d4");
                        return;
                    }
                    synchronized (AIDataDelegate.this) {
                        Set<ICepServiceListener> set = (Set) AIDataDelegate.this.mRuleMatchedCbList.get(str);
                        if (set != null && set.size() > 0) {
                            for (ICepServiceListener iCepServiceListener : set) {
                                if (iCepServiceListener != null) {
                                    iCepServiceListener.onRuleMatchSucceed(str, list, i);
                                }
                            }
                        }
                        Set<ICepArrayServiceListener> set2 = (Set) AIDataDelegate.this.mRuleArrayMatchedCbList.get(str);
                        if (set2 != null && set2.size() > 0) {
                            for (ICepArrayServiceListener iCepArrayServiceListener : set2) {
                                if (iCepArrayServiceListener != null) {
                                    iCepArrayServiceListener.onRuleMatchSucceed(str, str2, list, i);
                                }
                            }
                        }
                        Set<ICustomCepServiceListener> set3 = (Set) AIDataDelegate.this.mCustomRuleMatchedCbList.get(str);
                        if (set3 != null && set3.size() > 0) {
                            CustomCepContext customCepContext = new CustomCepContext();
                            customCepContext.cepVer = str3;
                            customCepContext.cepUniqueId = str4;
                            customCepContext.mReturnResult = jSONObject;
                            for (ICustomCepServiceListener iCustomCepServiceListener : set3) {
                                if (iCustomCepServiceListener != null) {
                                    iCustomCepServiceListener.onRuleMatchSucceed(str, str2, list, i, customCepContext);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void executeMLModel(@Nullable JSONObject jSONObject, String str, JSFeatureOutParamsCallback jSFeatureOutParamsCallback, boolean z, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {jSONObject, str, jSFeatureOutParamsCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7d24dec9e8ada745385d9a6d9126035", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7d24dec9e8ada745385d9a6d9126035");
        } else {
            AIDispatcher.getInstance().addExecuteMLTask(str, jSONObject, jSFeatureOutParamsCallback, iPredictionJsonListener);
        }
    }

    @NonNull
    public Set<String> getTriggerBizSet() {
        return this.mTriggeredBizSet;
    }

    private void initStaticOperator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9739d4a6099753592453eb60b5ce4dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9739d4a6099753592453eb60b5ce4dea");
            return;
        }
        OperatorManager operatorManager = OperatorService.getInstance().getOperatorManager();
        if (operatorManager != null) {
            operatorManager.registerOperatorProducer(new CommonOperatorProducer());
            operatorManager.registerOperatorProducer(new DateOperatorProducer());
        }
    }

    public void stopCepService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56ccfa749ecd3c1a79890f905d924d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56ccfa749ecd3c1a79890f905d924d7b");
        } else {
            RuleTriggerManager.getInstance().clearCepRuleTrigger();
        }
    }

    public void setDebugEnable(boolean z) {
        this.mEnableDebug = z;
    }

    public boolean isDebugEnable() {
        return this.mEnableDebug;
    }

    public void setRemoteJSEngineEnable(boolean z) {
        this.mEnableRemoteJSEngine = z;
    }

    public boolean isRemoteJSEngineEnable() {
        return this.mEnableRemoteJSEngine;
    }

    public boolean isBizStart(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82902a20b394cd1b254d21e8022d62a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82902a20b394cd1b254d21e8022d62a1")).booleanValue() : this.mTriggeredBizSet.contains(str);
    }
}
