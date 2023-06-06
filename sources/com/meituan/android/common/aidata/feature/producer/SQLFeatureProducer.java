package com.meituan.android.common.aidata.feature.producer;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.cache.result.ResultColumnValue;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.database.DBAIDataHelper;
import com.meituan.android.common.aidata.database.SQLPlaceholder;
import com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper;
import com.meituan.android.common.aidata.feature.task.ProduceFeatureTask;
import com.meituan.android.common.aidata.feature.task.TaskQueueExecter;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.resources.bean.FeatureSqlBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SQLFeatureProducer extends AbsFeatureProducer {
    private static final String TAG = "SQLFeatureProducer";
    public static ChangeQuickRedirect changeQuickRedirect;

    public SQLFeatureProducer(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41226b40971fcad30d4df51dfd4c058b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41226b40971fcad30d4df51dfd4c058b");
        }
    }

    @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducer
    public Map<String, List<ResultRow>> produceFeature(ProduceRequest produceRequest) {
        Object[] objArr = {produceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8e0bc66310138bc79c33760e3cf6243", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8e0bc66310138bc79c33760e3cf6243");
        }
        if (produceRequest == null || TextUtils.isEmpty(produceRequest.mFeatureKey) || produceRequest.mParam == null) {
            return null;
        }
        try {
            return executeQueryTask(produceRequest);
        } catch (Exception e) {
            new BaseRaptorUploader().addTags("path", "aidata_140001_info").addTags("errorType", 1).addValues("aidata_140001_info", 1).addExtra("errorInfo", e.getMessage()).send();
            return null;
        }
    }

    @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducer
    public void produceFeature(final ProduceRequest produceRequest, @Nullable final IFeatureProducerListener iFeatureProducerListener) {
        Object[] objArr = {produceRequest, iFeatureProducerListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8050236d5c11439e670d210d24f2e4cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8050236d5c11439e670d210d24f2e4cf");
        } else if (produceRequest != null && !TextUtils.isEmpty(produceRequest.mFeatureKey) && produceRequest.mParam != null) {
            TaskQueueExecter.getInstance().submitTask(new ProduceFeatureTask(produceRequest) { // from class: com.meituan.android.common.aidata.feature.producer.SQLFeatureProducer.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.feature.task.ProduceFeatureTask
                public void runOnce() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "59b0b6aecd888fbc226298e4ff29398e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "59b0b6aecd888fbc226298e4ff29398e");
                        return;
                    }
                    try {
                        Map<String, List<ResultRow>> executeQueryTask = SQLFeatureProducer.this.executeQueryTask(produceRequest);
                        if (iFeatureProducerListener != null) {
                            iFeatureProducerListener.onSuccess(executeQueryTask);
                            return;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (iFeatureProducerListener != null) {
                        iFeatureProducerListener.onFailed(new BlueException("unknown", "-1"));
                    }
                }
            });
        } else if (iFeatureProducerListener != null) {
            iFeatureProducerListener.onFailed(new BlueException("param invalid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<String, List<ResultRow>> executeQueryTask(@NonNull ProduceRequest produceRequest) {
        List<ResultRow> query;
        Object[] objArr = {produceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f912903f9d419d2f19fabaa22e8e7f87", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f912903f9d419d2f19fabaa22e8e7f87");
        }
        Object param = produceRequest.getParam();
        String obj = param != null ? param.toString() : "";
        new StringBuilder("executeQueryTask originSql=").append(obj);
        String subTableName = produceRequest.getSubTableName();
        if (subTableName == null) {
            subTableName = "";
        }
        if (DBCEPSubTableDataHelper.getInstance().isSubTableCreated(subTableName)) {
            String placeHolder = SQLPlaceholder.EVENT_TABLE_NAME.getPlaceHolder();
            if (obj.contains(placeHolder)) {
                obj = obj.replace(placeHolder, subTableName);
            }
            String replaceHolder = FeatureSqlBean.replaceHolder(obj);
            StringBuilder sb = new StringBuilder("Use subTable ");
            sb.append(subTableName);
            sb.append(" to executeQueryTask featureSql=");
            sb.append(replaceHolder);
            query = DBCEPSubTableDataHelper.getInstance().query(replaceHolder, null, null, false);
        } else {
            String replaceHolder2 = FeatureSqlBean.replaceHolder(obj);
            new StringBuilder("executeQueryTask featureSql=").append(replaceHolder2);
            query = DBAIDataHelper.getInstance().query(replaceHolder2, null, null);
        }
        HashMap hashMap = new HashMap();
        String str = produceRequest.mFeatureKey;
        if (query == null) {
            query = Collections.emptyList();
        }
        hashMap.put(str, query);
        return hashMap;
    }

    private List<Map<String, Object>> convertResultRowTo(List<ResultRow> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac44ff1e91273f8cbc6e8deaf12e1b41", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac44ff1e91273f8cbc6e8deaf12e1b41");
        }
        LinkedList linkedList = null;
        if (list != null && list.size() > 0) {
            linkedList = new LinkedList();
            for (int i = 0; i < list.size(); i++) {
                Map<String, Object> convertRowToMap = convertRowToMap(list.get(i));
                if (convertRowToMap != null) {
                    linkedList.add(convertRowToMap);
                }
            }
        }
        return linkedList;
    }

    private Map<String, Object> convertRowToMap(ResultRow resultRow) {
        Object[] objArr = {resultRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad1b8c3d53b4b9fd087fb4ef65c5177d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad1b8c3d53b4b9fd087fb4ef65c5177d");
        }
        if (resultRow == null) {
            return null;
        }
        int columnCount = resultRow.getColumnCount();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < columnCount; i++) {
            ResultColumnValue valueAtIndex = resultRow.getValueAtIndex(i);
            String columnName = resultRow.getColumnName(i);
            Object covertValue = covertValue(resultRow.getType(i), valueAtIndex);
            if (covertValue != null && !TextUtils.isEmpty(columnName)) {
                hashMap.put(columnName, covertValue);
            }
        }
        return hashMap;
    }

    private JSONArray formatResult(List<Map<String, Object>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "017d3f57aefa0383dbb5eaea774b0eb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "017d3f57aefa0383dbb5eaea774b0eb5");
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(new JSONObject(list.get(i)));
            }
            return jSONArray;
        } catch (Exception unused) {
            return null;
        }
    }

    private Object covertValue(int i, ResultColumnValue resultColumnValue) {
        Object[] objArr = {Integer.valueOf(i), resultColumnValue};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7017b5aa832b4432ae3ff46d9abb97fc", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7017b5aa832b4432ae3ff46d9abb97fc");
        }
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return Integer.valueOf(resultColumnValue.toInt());
        }
        if (i == 2) {
            return Long.valueOf(resultColumnValue.toLong());
        }
        if (i == 11) {
            return Double.valueOf(resultColumnValue.toDouble());
        }
        if (i == 21) {
            return resultColumnValue.toString();
        }
        return null;
    }
}
