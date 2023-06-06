package com.meituan.android.common.aidata.feature;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.AiSwitchConfig;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.producer.FeatureProducerManager;
import com.meituan.android.common.aidata.feature.producer.IFeatureProducerListener;
import com.meituan.android.common.aidata.feature.producer.ProduceRequest;
import com.meituan.android.common.aidata.feature.repo.IFeatureTable;
import com.meituan.android.common.aidata.feature.utils.AiFeatureListenerUtil;
import com.meituan.android.common.aidata.feature.utils.ITaskListener;
import com.meituan.android.common.aidata.feature.utils.MultiTaskListener;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.android.common.aidata.resources.manager.CepResourceManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureManager extends AbsFeatureManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.feature.IFeatureManager
    public Map<String, List<ResultRow>> getFeature(@NonNull MLContext mLContext, GetFeatureRequest getFeatureRequest, boolean z, int i, int i2, boolean z2) {
        Map<String, List<ResultRow>> feature;
        Object[] objArr = {mLContext, getFeatureRequest, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa3033edc6e1a2345a387ebbbbf27692", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa3033edc6e1a2345a387ebbbbf27692");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        IFeatureTable featureTable = getFeatureTable(getFeatureRequest);
        if (z) {
            FeatureBean featureBean = CepResourceManager.getInstance().getFeatureBean(getFeatureRequest.feature);
            if (featureBean == null || featureBean.sqlBean == null || featureBean.sqlBean.mSql == null) {
                return null;
            }
            String uniqueId = AppUtil.getUniqueId();
            CatMonitorManager.getInstance().recordSqlFeatureProduceForRealTime(featureBean, uniqueId, z2);
            feature = FeatureProducerManager.getInstance().produceFeature(new ProduceRequest(featureBean.feature, featureBean.feature, featureBean.sqlBean.mSql, featureBean));
            if (feature != null && featureTable != null) {
                UpdateFeatureRequest updateFeatureRequest = new UpdateFeatureRequest();
                updateFeatureRequest.feature = feature;
                featureTable.updateFeature(updateFeatureRequest);
            }
            int i3 = feature == null ? 1 : 0;
            CatMonitorManager.getInstance().recordSqlFeatureProduceFinish(featureBean, uniqueId, i3, "", i3 != 0 ? "-1" : "0", SystemClock.elapsedRealtime() - elapsedRealtime, feature, true, mLContext.modelName, null);
        } else if (featureTable == null) {
            return null;
        } else {
            feature = featureTable.getFeature(getFeatureRequest);
        }
        LoganManager.getInstance().recordGetFeatureRequest(getFeatureRequest, SystemClock.elapsedRealtime() - elapsedRealtime, feature);
        if (i != -1) {
            CatMonitorManager.getInstance().recordFeatureQuery(getFeatureRequest.feature, AppUtil.getUniqueId(), i, feature);
        }
        if (i2 != -1) {
            CatMonitorManager.getInstance().recordFeatureQuery(getFeatureRequest.feature, AppUtil.getUniqueId(), i2, feature);
        }
        return feature;
    }

    @Override // com.meituan.android.common.aidata.feature.IFeatureManager
    public void getFeature(@NonNull final MLContext mLContext, List<GetFeatureRequest> list, final IFeatureListener iFeatureListener, final int i) {
        boolean z;
        ArrayList arrayList;
        MultiTaskListener<String, Map<String, List<ResultRow>>, Exception> multiTaskListener;
        FeatureManager featureManager = this;
        Object[] objArr = {mLContext, list, iFeatureListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff2ee01b606064acd97e40766296b5c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, featureManager, changeQuickRedirect2, false, "ff2ee01b606064acd97e40766296b5c3");
        } else if (!AiSwitchConfig.getInstance().isDisableFeatureService() && list != null && iFeatureListener != null) {
            if (list == null || list.size() <= 0) {
                z = false;
            } else {
                MultiTaskListener<String, Map<String, List<ResultRow>>, Exception> multiTaskListener2 = new MultiTaskListener<String, Map<String, List<ResultRow>>, Exception>() { // from class: com.meituan.android.common.aidata.feature.FeatureManager.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.feature.utils.MultiTaskListener
                    public void onAllTaskComplete(@NonNull Map<String, MultiTaskListener.ResultHolder<Map<String, List<ResultRow>>, Exception>> map) {
                        Map<String, List<ResultRow>> map2;
                        boolean z2 = false;
                        Object[] objArr2 = {map};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b5e84bfe12c836da5b1fe4747a546ef", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b5e84bfe12c836da5b1fe4747a546ef");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, MultiTaskListener.ResultHolder<Map<String, List<ResultRow>>, Exception>> entry : map.entrySet()) {
                            if (entry != null) {
                                new StringBuilder("FeatureManager getFeature onAllTaskComplete entry key=").append(entry.getKey());
                                MultiTaskListener.ResultHolder<Map<String, List<ResultRow>>, Exception> value = entry.getValue();
                                if (value != null && value.resultCode == 2 && (map2 = value.resultValue) != null) {
                                    try {
                                        for (String str : map2.keySet()) {
                                            try {
                                                new StringBuilder("FeatureManager getFeature onAllTaskComplete entry value=").append(map2.get(str));
                                                hashMap.put(str, map2.get(str));
                                            } catch (Exception e) {
                                                new StringBuilder("getFeature onAllTaskComplete exception=").append(e.getMessage());
                                            }
                                        }
                                        z2 = true;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                        if (z2) {
                            AiFeatureListenerUtil.callSuccess(iFeatureListener, new FeatureResult(hashMap));
                            new StringBuilder("FeatureManager getFeature entry main callback:result:").append(hashMap.toString());
                            return;
                        }
                        AiFeatureListenerUtil.callFailed(iFeatureListener, new Exception("MultiTaskListener : feature is null"));
                    }
                };
                ArrayList<Runnable> arrayList2 = new ArrayList();
                z = false;
                for (final GetFeatureRequest getFeatureRequest : list) {
                    new StringBuilder("FeatureManager getFeature request=").append(getFeatureRequest.toString());
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    final IFeatureTable featureTable = featureManager.getFeatureTable(getFeatureRequest);
                    if (getFeatureRequest.isRealTime) {
                        final FeatureBean featureBean = CepResourceManager.getInstance().getFeatureBean(getFeatureRequest.feature);
                        new StringBuilder("FeatureManager getFeature feature bean=").append(featureBean != null ? featureBean.toString() : StringUtil.NULL);
                        if (featureBean == null || featureBean.sqlBean == null || featureBean.sqlBean.mSql == null) {
                            arrayList = arrayList2;
                            multiTaskListener = multiTaskListener2;
                        } else {
                            new StringBuilder("FeatureManager getFeature feature bean=").append(featureBean.toString());
                            final ITaskListener<Map<String, List<ResultRow>>, Exception> createOneTaskListener = multiTaskListener2.createOneTaskListener(featureBean.feature);
                            arrayList = arrayList2;
                            multiTaskListener = multiTaskListener2;
                            arrayList.add(new Runnable() { // from class: com.meituan.android.common.aidata.feature.FeatureManager.2
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c09c824ad3afccae9b69b00776eef874", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c09c824ad3afccae9b69b00776eef874");
                                        return;
                                    }
                                    final String uniqueId = AppUtil.getUniqueId();
                                    CatMonitorManager.getInstance().recordSqlFeatureProduceForRealTime(featureBean, uniqueId, true);
                                    FeatureProducerManager.getInstance().produceFeature(new ProduceRequest(featureBean.feature, featureBean.feature, featureBean.sqlBean.mSql, featureBean), new IFeatureProducerListener() { // from class: com.meituan.android.common.aidata.feature.FeatureManager.2.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducerListener
                                        public void onSuccess(@Nullable Map<String, List<ResultRow>> map) {
                                            Object[] objArr3 = {map};
                                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b5983b5e7bbb74441f5315c9cc7da329", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b5983b5e7bbb74441f5315c9cc7da329");
                                                return;
                                            }
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            new StringBuilder("FeatureManager getFeature entry one callback success ： ").append(map);
                                            if (featureTable != null) {
                                                UpdateFeatureRequest updateFeatureRequest = new UpdateFeatureRequest();
                                                updateFeatureRequest.feature = map;
                                                featureTable.updateFeature(updateFeatureRequest);
                                            }
                                            createOneTaskListener.onSuccess(map);
                                            LoganManager.getInstance().recordGetFeatureRequest(getFeatureRequest, SystemClock.elapsedRealtime() - elapsedRealtime, map);
                                            CatMonitorManager.getInstance().recordSqlFeatureProduceFinish(featureBean, uniqueId, 0, "", "0", elapsedRealtime2, map, true, mLContext.modelName, null);
                                            CatMonitorManager.getInstance().recordFeatureQuery(featureBean.feature, AppUtil.getUniqueId(), i, map);
                                        }

                                        @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducerListener
                                        public void onFailed(@Nullable BlueException blueException) {
                                            Object[] objArr3 = {blueException};
                                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "29e7b141b8d9bec2b366532d4ed0d666", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "29e7b141b8d9bec2b366532d4ed0d666");
                                                return;
                                            }
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            createOneTaskListener.onFailed(blueException);
                                            LoganManager.getInstance().recordGetFeatureRequest(getFeatureRequest, SystemClock.elapsedRealtime() - elapsedRealtime, null);
                                            String str = "error message is empty";
                                            String str2 = "-1";
                                            if (blueException != null) {
                                                str = blueException.getMessage();
                                                str2 = blueException.getErrorCode();
                                            }
                                            CatMonitorManager.getInstance().recordSqlFeatureProduceFinish(featureBean, uniqueId, 1, str, str2, elapsedRealtime2, null, true, mLContext.modelName, null);
                                        }
                                    });
                                }
                            });
                            z = true;
                        }
                        multiTaskListener2 = multiTaskListener;
                        arrayList2 = arrayList;
                    } else {
                        ArrayList arrayList3 = arrayList2;
                        MultiTaskListener<String, Map<String, List<ResultRow>>, Exception> multiTaskListener3 = multiTaskListener2;
                        final ITaskListener<Map<String, List<ResultRow>>, Exception> createOneTaskListener2 = multiTaskListener3.createOneTaskListener(getFeatureRequest.feature);
                        arrayList3.add(new Runnable() { // from class: com.meituan.android.common.aidata.feature.FeatureManager.3
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "567f003b803294516abc77eb59a90ef5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "567f003b803294516abc77eb59a90ef5");
                                } else if (featureTable != null) {
                                    featureTable.getFeature(getFeatureRequest, new IFeatureListener() { // from class: com.meituan.android.common.aidata.feature.FeatureManager.3.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        @Override // com.meituan.android.common.aidata.feature.IFeatureListener
                                        public void onSuccess(@Nullable FeatureResult featureResult) {
                                            Object[] objArr3 = {featureResult};
                                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "dea3c7678746d2e17cda01e19f4aa055", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "dea3c7678746d2e17cda01e19f4aa055");
                                                return;
                                            }
                                            StringBuilder sb = new StringBuilder("FeatureManager getOneFeature success, tableName=");
                                            sb.append(featureTable.getTableName());
                                            sb.append(", request=");
                                            sb.append(getFeatureRequest.toString());
                                            sb.append(", result=");
                                            sb.append(featureResult.getJsonString());
                                            createOneTaskListener2.onSuccess(featureResult != null ? featureResult.getData() : null);
                                            LoganManager.getInstance().recordGetFeatureRequest(getFeatureRequest, SystemClock.elapsedRealtime() - elapsedRealtime, featureResult != null ? featureResult.getData() : null);
                                            CatMonitorManager.getInstance().recordFeatureQuery(getFeatureRequest.feature, AppUtil.getUniqueId(), i, featureResult != null ? featureResult.getData() : null);
                                        }

                                        @Override // com.meituan.android.common.aidata.feature.IFeatureListener
                                        public void onFailed(@Nullable Exception exc) {
                                            Object[] objArr3 = {exc};
                                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5c6d30b2b502ed201d0c66ed51ed77b4", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5c6d30b2b502ed201d0c66ed51ed77b4");
                                                return;
                                            }
                                            createOneTaskListener2.onFailed(new Exception("FeatureManager getOneFeature fail, tableName=" + featureTable.getTableName() + ", request=" + getFeatureRequest.toString() + ", err=" + exc.getMessage()));
                                            LoganManager.getInstance().recordGetFeatureRequest(getFeatureRequest, SystemClock.elapsedRealtime() - elapsedRealtime, null);
                                        }
                                    });
                                } else {
                                    iFeatureListener.onSuccess(null);
                                }
                            }
                        });
                        multiTaskListener2 = multiTaskListener3;
                        arrayList2 = arrayList3;
                        z = true;
                    }
                    featureManager = this;
                }
                for (Runnable runnable : arrayList2) {
                    runnable.run();
                }
            }
            if (z) {
                return;
            }
            StringBuilder sb = new StringBuilder("no feature request is available, requestList=");
            sb.append(list);
            sb.append(",requestList size=");
            sb.append(list == null ? 0 : list.size());
            iFeatureListener.onFailed(new Exception(sb.toString()));
        }
    }

    @Override // com.meituan.android.common.aidata.feature.IFeatureManager
    public void replaceFeature(UpdateFeatureRequest updateFeatureRequest) {
        IFeatureTable featureTable;
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9a9e2b27e8f6bc38303e35d4858dfab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9a9e2b27e8f6bc38303e35d4858dfab");
        } else if (updateFeatureRequest == null || (featureTable = getFeatureTable(updateFeatureRequest)) == null) {
        } else {
            featureTable.replaceFeature(updateFeatureRequest);
        }
    }

    @Override // com.meituan.android.common.aidata.feature.IFeatureManager
    public void removeFeature(UpdateFeatureRequest updateFeatureRequest) {
        IFeatureTable featureTable;
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "529d27efb628dc7cd5a0a28d4be9b2af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "529d27efb628dc7cd5a0a28d4be9b2af");
        } else if (updateFeatureRequest == null || (featureTable = getFeatureTable(updateFeatureRequest)) == null) {
        } else {
            featureTable.clearAll();
        }
    }

    @Override // com.meituan.android.common.aidata.feature.IFeatureManager
    public void updateFeature(UpdateFeatureRequest updateFeatureRequest) {
        IFeatureTable featureTable;
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e71aea4138f78b1d93334a77cb886c33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e71aea4138f78b1d93334a77cb886c33");
        } else if (updateFeatureRequest == null || (featureTable = getFeatureTable(updateFeatureRequest)) == null) {
        } else {
            featureTable.updateFeature(updateFeatureRequest);
        }
    }
}
