package com.meituan.android.common.aidata.raptoruploader;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RaptorUploaderImpl extends BaseRaptorUploader {
    public static final String BASIC = "basic";
    public static final String BLUE_CEP_COMPUTE = "blue_cep_compute";
    public static final String BLUE_CEP_DELAY_DURATION = "blue_cep_delay_duration";
    public static final String BLUE_CEP_SUCC_RATE = "blue_cep_succ_rate";
    public static final String BLUE_DD_LOAD = "blue_dd_load";
    public static final String BLUE_DD_LOAD_DURATION = "blue_dd_load_duration";
    public static final String BLUE_DD_LOAD_SUCC_RATE = "blue_dd_load_succ_rate";
    public static final String BLUE_DD_UNZIP = "blue_dd_unzip";
    public static final String BLUE_DD_UNZIP_DURATION = "blue_dd_unzip_duration";
    public static final String BLUE_DD_UNZIP_SUCC_RATE = "blue_dd_unzip_succ_rate";
    public static final String BLUE_FEATURE_CONSUME = "blue_feature_consume";
    public static final float BLUE_FEATURE_CONSUME_COUNT = 1.0f;
    public static final String BLUE_FEATURE_PRODUCE = "blue_feature_produce";
    public static final String BLUE_FEATURE_PRODUCE_DURATION = "blue_feature_produce_duration";
    public static final String BLUE_FEATURE_PRODUCE_NUM = "blue_feature_produce_num";
    public static final String BLUE_FEATURE_PRODUCE_SIZE = "blue_feature_produce_size";
    public static final String BLUE_FEATURE_PRODUCE_SUCC_RATE = "blue_feature_produce_succ_rate";
    public static final String BLUE_INIT_DURATION = "blue_init_duration";
    public static final String BLUE_MODEL_PREDICT = "blue_model_predict";
    public static final String BLUE_MODEL_PREDICT_DURATION = "blue_model_predict_duration";
    public static final String BLUE_MODEL_PREDICT_SUCC_RATE = "blue_model_predict_succ_rate";
    public static final String BLUE_MODEL_PREDICT_WAITING_SRC_DURATION = "blue_model_predict_waiting_src_duration";
    public static final String BLUE_MODEL_PREDICT_WHOLE = "blue_model_predict_whole";
    public static final String BLUE_MODEL_PREDICT_WHOLE_DURATION = "blue_model_predict_whole_duration";
    public static final String BLUE_MODEL_PREDICT_WHOLE_SUCC_RATE = "blue_model_predict_whole_succ_rate";
    public static final String BLUE_OPERATOR_CLEAN = "blue_operator_clean";
    public static final String BLUE_OPERATOR_DURATION = "blue_operator_duration";
    public static final String BLUE_OPERATOR_SUCC_RATE = "blue_operator_succ_rate";
    public static final String BLUE_OPERATOR_VALUE_NUM = "blue_operator_value_num";
    public static final String BLUE_OPERATOR_VALUE_SIZE = "blue_operator_value_size";
    private static final String BLUE_SDK_INIT = "blue_sdk_init";
    public static final String BLUE_SRC_LOAD = "blue_src_load";
    public static final String BLUE_SRC_LOAD_SUCC_DURATION = "blue_src_load_succ_duration";
    public static final String BLUE_SRC_LOAD_SUCC_RATE = "blue_src_load_succ_rate";
    private static final String BLUE_START_BIZ = "blue_start_biz";
    private static final String BLUE_SUB_TABLE_CREATE = "blue_sub_table_create";
    private static final String BLUE_SUB_TABLE_CREATE_DURATION = "blue_sub_table_create_duration";
    private static final String BLUE_SUB_TABLE_CREATE_SUCC_RATE = "blue_sub_table_create_succ_rate";
    private static final String BLUE_SUB_TABLE_DELETE = "blue_sub_table_delete";
    private static final String BLUE_SUB_TABLE_DELETE_DURATION = "blue_sub_table_delete_duration";
    private static final String BLUE_SUB_TABLE_DELETE_SUCC_RATE = "blue_sub_table_delete_succ_rate";
    private static final String BLUE_SUB_TABLE_QUERY = "blue_sub_table_query";
    private static final String BLUE_SUB_TABLE_QUERY_DURATION = "blue_sub_table_query_duration";
    private static final String BLUE_SUB_TABLE_QUERY_SUCC_RATE = "blue_sub_table_query_succ_rate";
    public static final String CACHE_FALSE = "false";
    public static final String CACHE_TRUE = "true";
    public static final String CACHE_UNKNOWN = "unknown";
    public static final String CEP_ID = "cepId";
    public static final String CEP_UNIQUE_ID = "cep_unique_id";
    public static final String CEP_VERSION = "cepVersion";
    public static final String CONSUME_TYPE = "consume_type";
    public static final String CONSUME_UNIQUE_ID = "consume_unique_id";
    public static final String DATA_EMPTY = "1";
    public static final String DATA_NOT_EMPTY = "0";
    public static final String FEATURE_JS = "2";
    public static final String FEATURE_SIZE = "featureSize";
    public static final String FEATURE_SQL = "1";
    public static final String FEATURE_SUBKEY = "feature_subkey";
    public static final String FEATURE_TYPE = "feature_type";
    public static final String FEATURE_UNIQUE_ID = "feature_unique_id";
    public static final String FEATURE_VER = "featureVer";
    public static final String IS_CACHE = "is_cache";
    public static final String IS_DATA_EMPTY = "isDataEmpty";
    public static final String IS_FROM_CACHE = "isFromCache";
    public static final String LOAD_TYPE = "load_type";
    public static final String MODEL_POST_PROCESS_DURATION = "blue_model_post_process_duration";
    public static final String MODEL_POST_PROCESS_PATH = "blue_model_post_process";
    public static final String MODEL_POST_PROCESS_SUCC_RATE = "blue_model_post_process_succ_rate";
    public static final String MODEL_UNIQUE_ID = "model_unique_id";
    public static final String MODEL_VERSION = "model_version";
    public static final String OPERATOR_NAME = "operator_name";
    public static final String OPERATOR_UNIQUE_ID = "operator_unique_id";
    public static final String PRODUCE_TYPE = "produce_type";
    public static final String REPRODUCE = "reproduce";
    public static final String SRC = "src";
    public static final String SRC_VERSION = "src_version";
    public static final String SUB_CEP_ID = "subCepId";
    public static final String TOKEN = "token";
    public static ChangeQuickRedirect changeQuickRedirect;

    public void uploadBlueSdkInit(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eee7119bec4ee12909ccd1823981492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eee7119bec4ee12909ccd1823981492");
            return;
        }
        Object obj = map.get(BLUE_INIT_DURATION);
        if (obj != null) {
            this.mMetricMonitorService.a(BLUE_INIT_DURATION, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj)))));
        }
        this.mMetricMonitorService.a("path", BLUE_SDK_INIT);
        send(i);
    }

    public void uploadStartCepService(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b779617c78df9cf1876f57c00767cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b779617c78df9cf1876f57c00767cda");
            return;
        }
        this.mMetricMonitorService.a(BLUE_START_BIZ, Collections.singletonList(Float.valueOf(1.0f)));
        this.mMetricMonitorService.a("biz", str);
        this.mMetricMonitorService.a("path", BLUE_START_BIZ);
        send(i);
    }

    public void uploadDealCepMsg(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "227c79c239e89ab6a5f8e6defaaa80e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "227c79c239e89ab6a5f8e6defaaa80e2");
            return;
        }
        this.mMetricMonitorService.a(BLUE_CEP_SUCC_RATE, Collections.singletonList(Float.valueOf(((Float) map.get(BLUE_CEP_SUCC_RATE)).floatValue())));
        Object obj = map.get(BLUE_CEP_DELAY_DURATION);
        if (obj != null) {
            this.mMetricMonitorService.a(BLUE_CEP_DELAY_DURATION, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj)))));
        }
        this.mMetricMonitorService.a("path", BLUE_CEP_COMPUTE);
        this.mMetricMonitorService.a("status", (String) map.get("status"));
        this.mMetricMonitorService.a("cepId", (String) map.get("cepId"));
        this.mMetricMonitorService.a(SUB_CEP_ID, (String) map.get(SUB_CEP_ID));
        this.mMetricMonitorService.a(CEP_VERSION, (String) map.get(CEP_VERSION));
        this.mMetricMonitorService.a("biz", (String) map.get("biz"));
        m mVar = this.mMetricMonitorService;
        StringBuilder sb = new StringBuilder();
        sb.append(map.get(IS_CACHE));
        mVar.a(IS_CACHE, sb.toString());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(CEP_UNIQUE_ID, map.get(CEP_UNIQUE_ID));
            this.mMetricMonitorService.a(jSONObject.toString());
        } catch (Exception e) {
            new StringBuilder("uploadDealCepMsg got an exception = ").append(e);
        }
        send(i);
    }

    public void uploadBlueFeatureProduce(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8dfe079702254e9dd85ea7b850ac0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8dfe079702254e9dd85ea7b850ac0d4");
            return;
        }
        this.mMetricMonitorService.a(BLUE_FEATURE_PRODUCE_SUCC_RATE, Collections.singletonList(Float.valueOf(((Float) map.get(BLUE_FEATURE_PRODUCE_SUCC_RATE)).floatValue())));
        Object obj = map.get(BLUE_FEATURE_PRODUCE_DURATION);
        if (obj != null) {
            this.mMetricMonitorService.a(BLUE_FEATURE_PRODUCE_DURATION, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj)))));
        }
        Object obj2 = map.get(BLUE_FEATURE_PRODUCE_NUM);
        if (obj2 != null) {
            this.mMetricMonitorService.a(BLUE_FEATURE_PRODUCE_NUM, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(((Integer) obj2).intValue())))));
        }
        Object obj3 = map.get(BLUE_FEATURE_PRODUCE_SIZE);
        if (obj3 != null) {
            this.mMetricMonitorService.a(BLUE_FEATURE_PRODUCE_SIZE, Collections.singletonList(Float.valueOf(((Float) obj3).floatValue())));
        }
        this.mMetricMonitorService.a("path", BLUE_FEATURE_PRODUCE);
        this.mMetricMonitorService.a("status", (String) map.get("status"));
        this.mMetricMonitorService.a("feature", (String) map.get("feature"));
        this.mMetricMonitorService.a(FEATURE_VER, (String) map.get(FEATURE_VER));
        this.mMetricMonitorService.a(FEATURE_UNIQUE_ID, (String) map.get(FEATURE_UNIQUE_ID));
        this.mMetricMonitorService.a(PRODUCE_TYPE, (String) map.get(PRODUCE_TYPE));
        this.mMetricMonitorService.a(FEATURE_TYPE, (String) map.get(FEATURE_TYPE));
        this.mMetricMonitorService.a("errorCode", (String) map.get("errorCode"));
        this.mMetricMonitorService.a("model_name", (String) map.get("model_name"));
        this.mMetricMonitorService.a("biz", (String) map.get("biz"));
        this.mMetricMonitorService.a("cepId", (String) map.get("cepId"));
        this.mMetricMonitorService.a(CEP_VERSION, (String) map.get(CEP_VERSION));
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty((String) map.get("fail_detail"))) {
                jSONObject.put("fail_detail", map.get("fail_detail"));
            }
            this.mMetricMonitorService.a(jSONObject.toString());
        } catch (Exception e) {
            new StringBuilder("uploadModelPredictFinish got an exception = ").append(e);
        }
        send(i);
    }

    public void uploadBlueOperator(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "475ff0a6ea597b40b2a19ffa49dea1e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "475ff0a6ea597b40b2a19ffa49dea1e3");
            return;
        }
        this.mMetricMonitorService.a("blue_operator_succ_rate", Collections.singletonList(Float.valueOf(((Float) map.get("blue_operator_succ_rate")).floatValue())));
        Object obj = map.get("blue_operator_duration");
        if (obj != null) {
            this.mMetricMonitorService.a("blue_operator_duration", Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj)))));
        }
        this.mMetricMonitorService.a("blue_operator_value_size", Collections.singletonList(Float.valueOf(((Integer) map.get("blue_operator_value_size")).intValue())));
        this.mMetricMonitorService.a("blue_operator_value_num", Collections.singletonList(Float.valueOf(((Integer) map.get("blue_operator_value_num")).intValue())));
        this.mMetricMonitorService.a("path", "blue_operator_clean");
        this.mMetricMonitorService.a("status", (String) map.get("status"));
        this.mMetricMonitorService.a("operator_name", (String) map.get("operator_name"));
        this.mMetricMonitorService.a("operator_unique_id", (String) map.get("operator_unique_id"));
        this.mMetricMonitorService.a("errorCode", (String) map.get("errorCode"));
        this.mMetricMonitorService.a("model_name", (String) map.get("model_name"));
        this.mMetricMonitorService.a("feature", (String) map.get("feature"));
        this.mMetricMonitorService.a("biz", (String) map.get("biz"));
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty((String) map.get("fail_detail"))) {
                jSONObject.put("fail_detail", map.get("fail_detail"));
            }
            if (!TextUtils.isEmpty((String) map.get(BaseRaptorUploader.INPUT_DATA))) {
                jSONObject.put(BaseRaptorUploader.INPUT_DATA, map.get(BaseRaptorUploader.INPUT_DATA));
            }
            if (!TextUtils.isEmpty((String) map.get(BaseRaptorUploader.OUTPUT_DATA))) {
                jSONObject.put(BaseRaptorUploader.OUTPUT_DATA, map.get(BaseRaptorUploader.OUTPUT_DATA));
            }
            this.mMetricMonitorService.a(jSONObject.toString());
        } catch (Exception e) {
            new StringBuilder("uploadModelPredictFinish got an exception = ").append(e);
        }
        send(i);
    }

    public void uploadModelPredictFinish(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fbc1a014fe4ee007663a386078a7286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fbc1a014fe4ee007663a386078a7286");
            return;
        }
        this.mMetricMonitorService.a(BLUE_MODEL_PREDICT_SUCC_RATE, Collections.singletonList(Float.valueOf(((Float) map.get(BLUE_MODEL_PREDICT_SUCC_RATE)).floatValue())));
        Object obj = map.get(BLUE_MODEL_PREDICT_DURATION);
        if (obj != null) {
            this.mMetricMonitorService.a(BLUE_MODEL_PREDICT_DURATION, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj)))));
        }
        this.mMetricMonitorService.a("path", BLUE_MODEL_PREDICT);
        this.mMetricMonitorService.a("status", (String) map.get("status"));
        this.mMetricMonitorService.a("model_name", (String) map.get("model_name"));
        this.mMetricMonitorService.a(MODEL_VERSION, (String) map.get(MODEL_VERSION));
        this.mMetricMonitorService.a("model_unique_id", (String) map.get("model_unique_id"));
        this.mMetricMonitorService.a("errorCode", (String) map.get("errorCode"));
        this.mMetricMonitorService.a("biz", (String) map.get("biz"));
        this.mMetricMonitorService.a(FEATURE_SIZE, String.valueOf(map.get(FEATURE_SIZE)));
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty((String) map.get("fail_detail"))) {
                jSONObject.put("fail_detail", map.get("fail_detail"));
            }
            this.mMetricMonitorService.a(jSONObject.toString());
        } catch (Exception e) {
            new StringBuilder("uploadModelPredictFinish got an exception = ").append(e);
        }
        send(i);
    }

    public void uploadWholeModelPredictFinish(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65dd1e052a5870967faa919171608a1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65dd1e052a5870967faa919171608a1f");
            return;
        }
        this.mMetricMonitorService.a(BLUE_MODEL_PREDICT_WHOLE_SUCC_RATE, Collections.singletonList(Float.valueOf(((Float) map.get(BLUE_MODEL_PREDICT_WHOLE_SUCC_RATE)).floatValue())));
        Object obj = map.get(BLUE_MODEL_PREDICT_WHOLE_DURATION);
        if (obj != null) {
            this.mMetricMonitorService.a(BLUE_MODEL_PREDICT_WHOLE_DURATION, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj)))));
        }
        Object obj2 = map.get(BLUE_MODEL_PREDICT_WAITING_SRC_DURATION);
        if (obj2 != null) {
            this.mMetricMonitorService.a(BLUE_MODEL_PREDICT_WAITING_SRC_DURATION, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj2)))));
        }
        this.mMetricMonitorService.a("path", BLUE_MODEL_PREDICT_WHOLE);
        this.mMetricMonitorService.a("status", (String) map.get("status"));
        this.mMetricMonitorService.a("model_name", (String) map.get("model_name"));
        this.mMetricMonitorService.a(MODEL_VERSION, (String) map.get(MODEL_VERSION));
        this.mMetricMonitorService.a("model_unique_id", (String) map.get("model_unique_id"));
        this.mMetricMonitorService.a("errorCode", (String) map.get("errorCode"));
        this.mMetricMonitorService.a("biz", (String) map.get("biz"));
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty((String) map.get("fail_detail"))) {
                jSONObject.put("fail_detail", map.get("fail_detail"));
            }
            this.mMetricMonitorService.a(jSONObject.toString());
        } catch (Exception e) {
            new StringBuilder("uploadWholeModelPredictFinish got an exception = ").append(e);
        }
        send(i);
    }

    public void uploadDdLoad(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89bebf310768bb611b813a81ce3fa6f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89bebf310768bb611b813a81ce3fa6f1");
            return;
        }
        this.mMetricMonitorService.a(BLUE_DD_LOAD_SUCC_RATE, Collections.singletonList(Float.valueOf(((Float) map.get(BLUE_DD_LOAD_SUCC_RATE)).floatValue())));
        Object obj = map.get(BLUE_DD_LOAD_DURATION);
        if (obj != null) {
            this.mMetricMonitorService.a(BLUE_DD_LOAD_DURATION, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj)))));
        }
        this.mMetricMonitorService.a("path", BLUE_DD_LOAD);
        this.mMetricMonitorService.a("status", (String) map.get("status"));
        this.mMetricMonitorService.a(SRC, (String) map.get(SRC));
        this.mMetricMonitorService.a(SRC_VERSION, (String) map.get(SRC_VERSION));
        this.mMetricMonitorService.a(IS_FROM_CACHE, (String) map.get(IS_FROM_CACHE));
        this.mMetricMonitorService.a("errorCode", (String) map.get("errorCode"));
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty((String) map.get("fail_detail"))) {
                jSONObject.put("fail_detail", map.get("fail_detail"));
            }
            this.mMetricMonitorService.a(jSONObject.toString());
        } catch (Exception e) {
            new StringBuilder("uploadDdLoad got an exception = ").append(e);
        }
        send(i);
    }

    public void uploadDdUnzip(Map<String, Object> map, int i) {
        Object[] objArr = {map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abcebe2dba6d97453bc9788f06608247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abcebe2dba6d97453bc9788f06608247");
            return;
        }
        this.mMetricMonitorService.a(BLUE_DD_UNZIP_SUCC_RATE, Collections.singletonList(Float.valueOf(((Float) map.get(BLUE_DD_UNZIP_SUCC_RATE)).floatValue())));
        Object obj = map.get(BLUE_DD_UNZIP_DURATION);
        if (obj != null) {
            this.mMetricMonitorService.a(BLUE_DD_UNZIP_DURATION, Collections.singletonList(Float.valueOf(Float.parseFloat(String.valueOf(obj)))));
        }
        this.mMetricMonitorService.a("path", BLUE_DD_UNZIP);
        this.mMetricMonitorService.a("status", (String) map.get("status"));
        this.mMetricMonitorService.a(SRC, (String) map.get(SRC));
        this.mMetricMonitorService.a(SRC_VERSION, (String) map.get(SRC_VERSION));
        this.mMetricMonitorService.a("errorCode", (String) map.get("errorCode"));
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty((String) map.get("fail_detail"))) {
                jSONObject.put("fail_detail", map.get("fail_detail"));
            }
            this.mMetricMonitorService.a(jSONObject.toString());
        } catch (Exception e) {
            new StringBuilder("uploadDdUnzip got an exception = ").append(e);
        }
        send(i);
    }

    public static void reportSubTableCreate(@NonNull FeatureBean featureBean, long j, @Nullable BlueException blueException) {
        Object[] objArr = {featureBean, new Long(j), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cab29fdda1c0bf330ad7f9f5fcfe707a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cab29fdda1c0bf330ad7f9f5fcfe707a");
            return;
        }
        RaptorEntity addTag = new RaptorEntity().addTag("path", BLUE_SUB_TABLE_CREATE).addTag("cepId", featureBean.feature).addTag(CEP_VERSION, featureBean.ver);
        if (blueException == null) {
            addTag.addTag("status", "success").addTag("errorCode", "0").addValue(BLUE_SUB_TABLE_CREATE_SUCC_RATE, 1.0f).addValue(BLUE_SUB_TABLE_CREATE_DURATION, (float) j);
        } else {
            addTag.addTag("status", "fail").addTag("errorCode", blueException.getErrorCode()).addValue(BLUE_SUB_TABLE_CREATE_SUCC_RATE, 0.0f).addExtra("fail_detail", blueException.getErrorMsg());
        }
        addTag.send();
    }

    public static void reportSubTableDelete(@NonNull FeatureBean featureBean, long j, @Nullable BlueException blueException) {
        Object[] objArr = {featureBean, new Long(j), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5284050b9ad8529ab8a054cc289f24ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5284050b9ad8529ab8a054cc289f24ce");
            return;
        }
        RaptorEntity addTag = new RaptorEntity().addTag("path", BLUE_SUB_TABLE_DELETE).addTag("cepId", featureBean.feature).addTag(CEP_VERSION, featureBean.ver);
        if (blueException == null) {
            addTag.addTag("status", "success").addTag("errorCode", "0").addValue(BLUE_SUB_TABLE_DELETE_SUCC_RATE, 1.0f).addValue(BLUE_SUB_TABLE_DELETE_DURATION, (float) j);
        } else {
            addTag.addTag("status", "fail").addTag("errorCode", blueException.getErrorCode()).addValue(BLUE_SUB_TABLE_DELETE_SUCC_RATE, 0.0f).addExtra("fail_detail", blueException.getErrorMsg());
        }
        addTag.send();
    }

    public static void reportSubTableQuery(@Nullable String str, long j, @Nullable BlueException blueException) {
        Object[] objArr = {str, new Long(j), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c6491e7828948d6a6839827b53a3bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c6491e7828948d6a6839827b53a3bbf");
            return;
        }
        RaptorEntity addTag = new RaptorEntity().addTag("path", BLUE_SUB_TABLE_QUERY).addTag("token", str);
        if (blueException == null) {
            addTag.addTag("status", "success").addTag("errorCode", "0").addValue(BLUE_SUB_TABLE_QUERY_SUCC_RATE, 1.0f).addValue(BLUE_SUB_TABLE_QUERY_DURATION, (float) j);
        } else {
            addTag.addTag("status", "fail").addTag("errorCode", blueException.getErrorCode()).addValue(BLUE_SUB_TABLE_QUERY_SUCC_RATE, 0.0f).addExtra("fail_detail", blueException.getErrorMsg());
        }
        addTag.send();
    }

    public void commonRaptorUploader(RaptorEntity raptorEntity, int i) {
        Object[] objArr = {raptorEntity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd430a2d9a90c69b54af1d6dce774c6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd430a2d9a90c69b54af1d6dce774c6a");
        } else if (raptorEntity != null) {
            if (raptorEntity.getValueMap() != null) {
                for (Map.Entry<String, Float> entry : raptorEntity.getValueMap().entrySet()) {
                    this.mMetricMonitorService.a(entry.getKey(), Collections.singletonList(entry.getValue()));
                }
            }
            if (raptorEntity.getTagMap() != null) {
                for (Map.Entry<String, String> entry2 : raptorEntity.getTagMap().entrySet()) {
                    this.mMetricMonitorService.a(entry2.getKey(), entry2.getValue());
                }
            }
            if (raptorEntity.getExtraMap() != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, String> entry3 : raptorEntity.getExtraMap().entrySet()) {
                        jSONObject.put(entry3.getKey(), entry3.getValue());
                    }
                    this.mMetricMonitorService.a(jSONObject.toString());
                } catch (Exception e) {
                    new StringBuilder("commomRaptorUpload got an exception = ").append(e);
                }
            }
            send(i);
        }
    }
}
