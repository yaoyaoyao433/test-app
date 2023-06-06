package com.meituan.android.common.aidata.monitor;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorConfig;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.config.DBAuthConfig;
import com.meituan.android.common.aidata.data.DBStatus;
import com.meituan.android.common.aidata.data.SeqBackData;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.persona.UserCenterManager;
import com.meituan.android.common.aidata.feature.utils.AiFeatureUtil;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorEntity;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.GsonProvider;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import dianping.com.nvlinker.NVLinker;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.stateparser.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CatMonitorManager {
    private static final String AIDATA_CONSISTENCY_VERIFY_GESTURE_COMMAND = "aidata_consistency_verify_gesture";
    private static final String AIDATA_CONSISTENCY_VERIFY_LX_COMMAND = "aidata_consistency_verify_lx";
    private static final String AIDATA_DB_STATUS_COMMAND = "aidata_db_status";
    private static final String AIDATA_INIT_COMMAND = "aidata_init";
    private static final String DB_INSERT_FAIL_COMMAND = "aidata_db_insert_failed";
    private static final String DB_QUERY_FAIL_COMMAND = "aidata_db_query_invalid";
    private static final String DB_QUERY_SUC_COMMAND = "aidata_db_external_query";
    private static final String DB_UPGRADE_FAIL_COMMAND = "db_upgrade_failed";
    private static final String DDD_LOAD_COMMAND = "aidata_dd_load";
    private static final String DDD_UNZIP_COMMAND = "aidata_dd_unzip";
    private static final String TAG = "CatMonitorManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ExecutorService mCatExecutorService;
    private CatMonitorService mCatMonitorService;
    private int mSampleRate;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class RealResponse {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("status")
        public int status = -1;
    }

    public CatMonitorManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba1bc1d3ccdd857e388a4bcfd75b7381", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba1bc1d3ccdd857e388a4bcfd75b7381");
            return;
        }
        this.mCatMonitorService = null;
        this.mSampleRate = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final CatMonitorManager STUB = new CatMonitorManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static CatMonitorManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "144587ba4470c77dbdfb5027c6dfe7ae", RobustBitConfig.DEFAULT_VALUE) ? (CatMonitorManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "144587ba4470c77dbdfb5027c6dfe7ae") : InnerClass.STUB;
    }

    public void initCat(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c6d9b36e3ba4de3be612b911771a920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c6d9b36e3ba4de3be612b911771a920");
            return;
        }
        this.mCatMonitorService = new CatMonitorService(context, i);
        this.mCatExecutorService = c.a("cat_monitor");
    }

    public void reportInitMonitor(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "772fa1b90a4112fe9df133ad3517d816", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "772fa1b90a4112fe9df133ad3517d816");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("config_cache_period", i);
            jSONObject.put("used_cache_period", i2);
            jSONObject.put("lx_ver", "4.47.1");
            jSONObject.put("sqlite_ver", "");
            jSONObject.put("aidata_ver", "0.0.9.77");
            startService("", AIDATA_INIT_COMMAND, 0, 0, 0, 0L, jSONObject.toString(), 100);
        } catch (Exception unused) {
        }
    }

    public void reportDbInsertFailData(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef7b6a40d265d5f9b07b1a0eda20008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef7b6a40d265d5f9b07b1a0eda20008");
            return;
        }
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                addEnv(jSONObject);
                jSONObject.put("saved_times", i);
                jSONObject.put("error", str);
                jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, str2);
                jSONObject.put("msid", str3);
                jSONObject.put("serial_seq", str4);
                jSONObject.put("tm", str5);
                jSONObject.put("aidata_ver", str6);
                startService("", DB_INSERT_FAIL_COMMAND, 0, 0, 0, 0L, jSONObject.toString(), 100);
            } catch (Exception unused) {
            }
        }
    }

    public void reportDbQueryFailData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, Byte.valueOf(z ? (byte) 1 : (byte) 0), str9, str10, str11};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "460aa55c261b2018eb158394463bed98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "460aa55c261b2018eb158394463bed98");
            return;
        }
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                addEnv(jSONObject);
                jSONObject.put(Constants.SQLConstants.KEY_SELECT, str);
                jSONObject.put("from", str2);
                jSONObject.put(Constants.SQLConstants.KEY_WHERE, str3);
                jSONObject.put("group_by", str4);
                jSONObject.put(Constants.SQLConstants.KEY_HAVING, str5);
                jSONObject.put("order_by", str6);
                jSONObject.put("limit", str7);
                jSONObject.put("is_initialized", z);
                jSONObject.put("error", str9);
                jSONObject.put("sql", str8);
                jSONObject.put("aidata_ver", str10);
                jSONObject.put("token", str11);
                jSONObject.put("ignore_db_auth", DBAuthConfig.isIgnoreDbAuth());
                jSONObject.put("force_db_auth", DBAuthConfig.isForceDbAuth());
                jSONObject.put("auth_is_synchronized", DBAuthConfig.isConfigSynchronized());
                jSONObject.put("auth_identifier", DBAuthConfig.getAuthIdentifier(str11));
                startService("", DB_QUERY_FAIL_COMMAND, 0, 0, 0, 0L, jSONObject.toString(), 100);
            } catch (Exception unused) {
            }
        }
    }

    public void reportDbQuerySucData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i, String str9, String str10) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, new Long(j), Integer.valueOf(i), str9, str10};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed9a79d58b846160d9294cdc38dc2514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed9a79d58b846160d9294cdc38dc2514");
            return;
        }
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                addEnv(jSONObject);
                jSONObject.put(Constants.SQLConstants.KEY_SELECT, str);
                jSONObject.put("from", str2);
                jSONObject.put(Constants.SQLConstants.KEY_WHERE, str3);
                jSONObject.put("group_by", str4);
                jSONObject.put(Constants.SQLConstants.KEY_HAVING, str5);
                jSONObject.put("order_by", str6);
                jSONObject.put("limit", str7);
                jSONObject.put("sql", str8);
                jSONObject.put("query_duration", j);
                jSONObject.put("row_count", i);
                jSONObject.put("token", str10);
                jSONObject.put("ignore_db_auth", DBAuthConfig.isIgnoreDbAuth());
                jSONObject.put("force_db_auth", DBAuthConfig.isForceDbAuth());
                jSONObject.put("auth_is_synchronized", DBAuthConfig.isConfigSynchronized());
                jSONObject.put("auth_identifier", DBAuthConfig.getAuthIdentifier(str10));
                jSONObject.put("auth_categories", DBAuthConfig.getAuthJson());
                jSONObject.put("aidata_ver", str9);
                startService("", DB_QUERY_SUC_COMMAND, 0, 0, 0, 0L, jSONObject.toString(), 1);
            } catch (Exception unused) {
            }
        }
    }

    public void reportDbUpgrade(String str, int i, int i2, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11cae03bf6e1b93208e968707e3408e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11cae03bf6e1b93208e968707e3408e7");
            return;
        }
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                addEnv(jSONObject);
                jSONObject.put("type", str);
                jSONObject.put("fromVer", i);
                jSONObject.put("toVer", i2);
                jSONObject.put("msg", str2);
                startService("", DB_UPGRADE_FAIL_COMMAND, 0, 0, 0, 0L, jSONObject.toString(), 100);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x013a A[Catch: Exception -> 0x0151, TRY_LEAVE, TryCatch #0 {Exception -> 0x0151, blocks: (B:7:0x0042, B:9:0x0082, B:18:0x0116, B:20:0x013a, B:11:0x00b0, B:15:0x00e4, B:17:0x00f0), top: B:23:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reportDDDSdkResponse(java.lang.String r18, java.lang.String r19, long r20, com.meituan.met.mercury.load.core.DDResource r22, com.meituan.android.common.aidata.raptoruploader.BlueException r23) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.monitor.CatMonitorManager.reportDDDSdkResponse(java.lang.String, java.lang.String, long, com.meituan.met.mercury.load.core.DDResource, com.meituan.android.common.aidata.raptoruploader.BlueException):void");
    }

    public void reportBuildCepNFAFailStatus(String str, FeatureBean featureBean, a aVar, Throwable th) {
        Object[] objArr = {str, featureBean, aVar, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18a73a64fcb3cb3ef1eba4dcbbe7fd88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18a73a64fcb3cb3ef1eba4dcbbe7fd88");
        } else if (featureBean == null && aVar == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                addEnv(jSONObject);
                if (featureBean != null) {
                    jSONObject.put("biz", featureBean.biz);
                    jSONObject.put("feature", featureBean.feature);
                    jSONObject.put("featureVersion", featureBean.ver);
                }
                if (aVar != null) {
                    jSONObject.put("cepId", aVar.e);
                    jSONObject.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                    if (aVar.a != null) {
                        jSONObject.put("stateCount", aVar.a.size());
                    }
                    jSONObject.put("windowTime", aVar.c);
                    jSONObject.put("maxTimes", aVar.f);
                }
                jSONObject.put("reason", th != null ? th.toString() : "");
                startService("", str, 0, 0, 0, 0L, jSONObject.toString(), 100);
                StringBuilder sb = new StringBuilder("ai cat ");
                sb.append(str);
                sb.append(CommonConstant.Symbol.COLON);
                sb.append(jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    public void reportCepMatchData(FeatureBean featureBean, a aVar, List<StreamData> list, int i, String str, long j, int i2) {
        Object[] objArr = {featureBean, aVar, list, Integer.valueOf(i), str, new Long(j), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4538e7d2a5f23f8eea4bc46cb62823d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4538e7d2a5f23f8eea4bc46cb62823d");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            addEnv(jSONObject);
            addCommonParam(jSONObject);
            jSONObject.put(RaptorUploaderImpl.CEP_UNIQUE_ID, str);
            if (featureBean != null) {
                jSONObject.put("biz", featureBean.biz);
                jSONObject.put("feature", featureBean.feature);
                jSONObject.put("featureVersion", featureBean.ver);
                hashMap.put("biz", featureBean.biz);
                hashMap.put("cepId", featureBean.feature);
            }
            if (aVar != null) {
                jSONObject.put("cepId", aVar.e);
                jSONObject.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                hashMap.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                hashMap.put(RaptorUploaderImpl.SUB_CEP_ID, aVar.e);
            }
            if (list != null && list.size() > 0) {
                jSONObject.put("eventCount", list.size());
                JSONArray jSONArray = new JSONArray();
                for (StreamData streamData : list) {
                    jSONArray.put(streamData.toJson());
                }
                jSONObject.put("eventArray", jSONArray);
            }
            jSONObject.put("times", i);
            startService("", "aidata_nfa_callback_success", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            hashMap.put(RaptorUploaderImpl.BLUE_CEP_SUCC_RATE, Float.valueOf(1.0f));
            hashMap.put(RaptorUploaderImpl.BLUE_CEP_DELAY_DURATION, Long.valueOf(j));
            hashMap.put("status", "success");
            hashMap.put(RaptorUploaderImpl.CEP_UNIQUE_ID, str);
            hashMap.put(RaptorUploaderImpl.IS_CACHE, Integer.valueOf(i2));
            new RaptorUploaderImpl().uploadDealCepMsg(hashMap, 100);
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_nfa_callback_success】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordCepMatchTimeoutData(FeatureBean featureBean, a aVar, String str) {
        Object[] objArr = {featureBean, aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "432817d410c407cbea91f523be9dbdb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "432817d410c407cbea91f523be9dbdb7");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = new HashMap();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put(RaptorUploaderImpl.CEP_UNIQUE_ID, str);
            if (featureBean != null) {
                jSONObject.put("biz", featureBean.biz);
                jSONObject.put("feature", featureBean.feature);
                jSONObject.put("featureVersion", featureBean.ver);
                hashMap.put("biz", featureBean.biz);
                hashMap.put("cepId", featureBean.feature);
            }
            if (aVar != null) {
                jSONObject.put("cepId", aVar.e);
                jSONObject.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                hashMap.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                hashMap.put(RaptorUploaderImpl.SUB_CEP_ID, aVar.e);
            }
            startService("", "aidata_nfa_callback_timeout", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            hashMap.put(RaptorUploaderImpl.BLUE_CEP_SUCC_RATE, Float.valueOf(0.0f));
            hashMap.put("status", "timeout");
            hashMap.put(RaptorUploaderImpl.CEP_UNIQUE_ID, str);
            new RaptorUploaderImpl().uploadDealCepMsg(hashMap, 100);
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_nfa_callback_timeout】\n " + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordCancelCepRule(FeatureBean featureBean, a aVar, String str) {
        Object[] objArr = {featureBean, aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b0b680bb80374ea28ee2b3c4ab66c03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b0b680bb80374ea28ee2b3c4ab66c03");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = new HashMap();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put(RaptorUploaderImpl.CEP_UNIQUE_ID, str);
            if (aVar != null) {
                jSONObject.put("cepId", aVar.e);
                jSONObject.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                hashMap.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                hashMap.put(RaptorUploaderImpl.SUB_CEP_ID, aVar.e);
            }
            if (featureBean != null) {
                jSONObject.put("biz", featureBean.biz);
                jSONObject.put("feature", featureBean.feature);
                jSONObject.put("featureVersion", featureBean.ver);
                hashMap.put("biz", featureBean.biz);
                hashMap.put("cepId", featureBean.feature);
            }
            startService("", "aidata_nfa_cancel", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            hashMap.put(RaptorUploaderImpl.BLUE_CEP_SUCC_RATE, Float.valueOf(0.0f));
            hashMap.put("status", "cancel");
            hashMap.put(RaptorUploaderImpl.CEP_UNIQUE_ID, str);
            new RaptorUploaderImpl().uploadDealCepMsg(hashMap, 100);
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_nfa_cancel】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordSqlFeatureProduceForCep(FeatureBean featureBean, String str, String str2, String str3, String str4) {
        Object[] objArr = {featureBean, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e3c4ec26ef02a11ce0640bc4c943b1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e3c4ec26ef02a11ce0640bc4c943b1f");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            if (featureBean != null) {
                jSONObject.put("feature", featureBean.feature);
                jSONObject.put("featureVersion", featureBean.ver);
            }
            jSONObject.put("cepId", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(RaptorUploaderImpl.CEP_VERSION, str3);
                jSONObject.put("type", "CEP");
            } else {
                jSONObject.put("type", "SEP");
            }
            jSONObject.put(RaptorUploaderImpl.CEP_UNIQUE_ID, str4);
            jSONObject.put(RaptorUploaderImpl.FEATURE_UNIQUE_ID, str);
            jSONObject.put(RaptorUploaderImpl.PRODUCE_TYPE, "basic");
            startService("", "aidata_feature_produce_cep", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_feature_produce_cep】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordSqlFeatureProduceForRealTime(FeatureBean featureBean, String str, boolean z) {
        Object[] objArr = {featureBean, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51da02695aa9646ad7231ea426f1bda8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51da02695aa9646ad7231ea426f1bda8");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            if (featureBean != null) {
                jSONObject.put("feature", featureBean.feature);
                jSONObject.put("featureVersion", featureBean.ver);
            }
            jSONObject.put(RaptorUploaderImpl.FEATURE_UNIQUE_ID, str);
            jSONObject.put(RaptorUploaderImpl.PRODUCE_TYPE, z ? "basic" : "reproduct");
            startService("", "aidata_feature_produce_realtime", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_feature_produce_realtime】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordSqlFeatureProduceFinish(FeatureBean featureBean, String str, int i, String str2, String str3, long j, Map<String, List<ResultRow>> map, boolean z, String str4, a aVar) {
        Object[] objArr = {featureBean, str, Integer.valueOf(i), str2, str3, new Long(j), map, Byte.valueOf(z ? (byte) 1 : (byte) 0), str4, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5afda5896d6797385221dee0bd6d94b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5afda5896d6797385221dee0bd6d94b");
            return;
        }
        try {
            int sampleRate = getSampleRate();
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = new HashMap();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            if (featureBean != null) {
                jSONObject.put("feature", featureBean.feature);
                jSONObject.put("featureVersion", featureBean.ver);
                hashMap.put("feature", featureBean.feature);
                hashMap.put(RaptorUploaderImpl.FEATURE_VER, featureBean.ver);
                if (featureBean.sqlBean != null && featureBean.sqlBean.mSql != null) {
                    hashMap.put(RaptorUploaderImpl.FEATURE_TYPE, "1");
                } else {
                    hashMap.put(RaptorUploaderImpl.FEATURE_TYPE, "2");
                }
                hashMap.put("biz", featureBean.biz);
            }
            jSONObject.put(RaptorUploaderImpl.FEATURE_UNIQUE_ID, str);
            jSONObject.put("status", i);
            if (i != 0) {
                jSONObject.put("error", str2);
                hashMap.put(RaptorUploaderImpl.BLUE_FEATURE_PRODUCE_SUCC_RATE, Float.valueOf(0.0f));
                hashMap.put("status", "fail");
                hashMap.put("fail_detail", str2);
                hashMap.put("errorCode", str3);
                sampleRate = 100;
            } else {
                hashMap.put(RaptorUploaderImpl.BLUE_FEATURE_PRODUCE_SUCC_RATE, Float.valueOf(1.0f));
                hashMap.put("status", "success");
                hashMap.put("errorCode", "0");
                hashMap.put(RaptorUploaderImpl.BLUE_FEATURE_PRODUCE_DURATION, Long.valueOf(j));
            }
            jSONObject.put("duration", j);
            hashMap.put(RaptorUploaderImpl.BLUE_FEATURE_PRODUCE_NUM, 0);
            hashMap.put(RaptorUploaderImpl.BLUE_FEATURE_PRODUCE_SIZE, Float.valueOf(0.0f));
            if (map != null) {
                FeatureResult featureResult = new FeatureResult(map);
                List<ResultRow> list = map.get(featureBean.feature);
                if (list != null) {
                    jSONObject.put("feature_num", list.size());
                    JSONObject jsonObject = featureResult.toJsonObject();
                    if (jsonObject == null) {
                        jsonObject = new JSONObject();
                    }
                    jSONObject.put("resultData", jsonObject);
                    float length = featureResult.getJsonString().getBytes().length * 1.0f;
                    jSONObject.put("feature_size", length / 1024.0f);
                    hashMap.put(RaptorUploaderImpl.BLUE_FEATURE_PRODUCE_NUM, Integer.valueOf(list.size()));
                    hashMap.put(RaptorUploaderImpl.BLUE_FEATURE_PRODUCE_SIZE, Float.valueOf(length));
                } else {
                    jSONObject.put("feature_num", 0);
                    jSONObject.put("feature_size", 0);
                }
            } else {
                jSONObject.put("feature_num", 0);
                jSONObject.put("feature_size", 0);
            }
            if (aVar != null) {
                hashMap.put("cepId", aVar.e);
                hashMap.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
            } else {
                hashMap.put("cepId", "-999");
                hashMap.put(RaptorUploaderImpl.CEP_VERSION, "-999");
            }
            jSONObject.put(RaptorUploaderImpl.PRODUCE_TYPE, z ? "basic" : "reproduct");
            hashMap.put(RaptorUploaderImpl.FEATURE_UNIQUE_ID, str);
            hashMap.put(RaptorUploaderImpl.PRODUCE_TYPE, z ? "basic" : RaptorUploaderImpl.REPRODUCE);
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("model_name", str4);
            }
            new RaptorUploaderImpl().uploadBlueFeatureProduce(hashMap, 100);
            startService("", "aidata_feature_produce_finish", 0, 0, 0, 0L, jSONObject.toString(), sampleRate);
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_feature_produce_finish】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordOperatorLoad(OperatorConfig operatorConfig, String str, int i, long j, String str2, String str3, int i2, MLContext mLContext) {
        Object[] objArr = {operatorConfig, str, Integer.valueOf(i), new Long(j), str2, str3, Integer.valueOf(i2), mLContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd0d980fc2d454fa3ead25130ef047bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd0d980fc2d454fa3ead25130ef047bf");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            RaptorEntity raptorEntity = new RaptorEntity();
            raptorEntity.addTag("path", RaptorUploaderImpl.BLUE_SRC_LOAD);
            raptorEntity.addTag(RaptorUploaderImpl.SRC, operatorConfig.opName);
            raptorEntity.addTag(RaptorUploaderImpl.SRC_VERSION, mLContext.getModelBundleVersion());
            raptorEntity.addTag("errorCode", str3);
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            raptorEntity.addTag(RaptorUploaderImpl.LOAD_TYPE, sb.toString());
            jSONObject.put("operator_name", operatorConfig.opName);
            jSONObject.put("operator_unique_id", str);
            jSONObject.put("status", i);
            jSONObject.put("duration", j);
            jSONObject.put(RaptorUploaderImpl.LOAD_TYPE, i2);
            if (i != 0) {
                jSONObject.put("error", str2);
                raptorEntity.addValue(RaptorUploaderImpl.BLUE_SRC_LOAD_SUCC_RATE, 0.0f);
                raptorEntity.addTag("status", "fail");
            } else {
                raptorEntity.addValue(RaptorUploaderImpl.BLUE_SRC_LOAD_SUCC_RATE, 1.0f);
                raptorEntity.addValue(RaptorUploaderImpl.BLUE_SRC_LOAD_SUCC_DURATION, (float) j);
                raptorEntity.addTag("status", "success");
            }
            raptorEntity.send();
            startService("", "aidata_operator_load", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            new StringBuilder("ai cat aidata_operator_load:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void recordOperatorStart(OperatorConfig operatorConfig, String str, String str2, Object obj, List<Object> list, List<String> list2, String str3) {
        Object[] objArr = {operatorConfig, str, str2, obj, list, list2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaa70a6d77240b05cee347ad7454cfd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaa70a6d77240b05cee347ad7454cfd0");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("operator_name", operatorConfig.opName);
            jSONObject.put("feature", str);
            jSONObject.put("subKey", str2);
            jSONObject.put("operator_unique_id", str3);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                jSONObject.put("input_value", jSONArray);
                jSONObject.put("value_num", jSONArray.length());
                if (jSONArray.length() > 0) {
                    jSONObject.put("value_size", jSONArray.toString().getBytes().length);
                } else {
                    jSONObject.put("value_size", 0);
                }
            } else {
                jSONObject.put("input_value", obj);
                jSONObject.put("value_num", 0);
                jSONObject.put("value_size", 0);
            }
            jSONObject.put("param", list);
            jSONObject.put("ref_operator_unique_id_list", list2);
            startService("", "aidata_operator_start", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_operator_start】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordOperatorFinish(OperatorConfig operatorConfig, Object obj, String str, int i, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {operatorConfig, obj, str, Integer.valueOf(i), new Long(j), str2, str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63399bd0b3d09abcefbe0725e0576535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63399bd0b3d09abcefbe0725e0576535");
            return;
        }
        try {
            int sampleRate = getSampleRate();
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("operator_name", operatorConfig.opName);
            jSONObject.put("operator_unique_id", str);
            jSONObject.put("status", i);
            jSONObject.put("duration", j);
            hashMap.put("operator_name", operatorConfig.opName);
            hashMap.put("operator_unique_id", str);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                hashMap.put("blue_operator_value_num", Integer.valueOf(jSONArray.length()));
                if (jSONArray.length() > 0) {
                    hashMap.put("blue_operator_value_size", Integer.valueOf(jSONArray.toString().getBytes().length));
                } else {
                    hashMap.put("blue_operator_value_size", 0);
                }
            } else {
                hashMap.put("blue_operator_value_size", 0);
                hashMap.put("blue_operator_value_num", 0);
            }
            if (i != 0) {
                hashMap.put("blue_operator_succ_rate", Float.valueOf(0.0f));
                hashMap.put("status", "fail");
                jSONObject.put("error", str2);
                hashMap.put("errorCode", str3);
                hashMap.put("fail_detail", str2);
                sampleRate = 100;
            } else {
                hashMap.put("blue_operator_duration", Long.valueOf(j));
                hashMap.put("blue_operator_succ_rate", Float.valueOf(1.0f));
                hashMap.put("status", "success");
                hashMap.put("errorCode", "0");
            }
            jSONObject.put("resultData", str4);
            hashMap.put("model_name", str5);
            hashMap.put("feature", str6);
            hashMap.put("feature_subkey", str7);
            hashMap.put(BaseRaptorUploader.INPUT_DATA, AiFeatureUtil.objectToString(obj));
            hashMap.put(BaseRaptorUploader.OUTPUT_DATA, str4);
            hashMap.put("biz", str8);
            new RaptorUploaderImpl().uploadBlueOperator(hashMap, 100);
            startService("", "aidata_operator_finish", 0, 0, 0, 0L, jSONObject.toString(), sampleRate);
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_operator_finish】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordModelLoad(@NonNull MLContext mLContext, int i, String str, String str2) {
        int i2;
        Object[] objArr = {mLContext, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aea84dda0f5c7715a6d2532e1b76a5ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aea84dda0f5c7715a6d2532e1b76a5ef");
            return;
        }
        try {
            int sampleRate = getSampleRate();
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            RaptorEntity raptorEntity = new RaptorEntity();
            raptorEntity.addTag("path", RaptorUploaderImpl.BLUE_SRC_LOAD);
            raptorEntity.addTag(RaptorUploaderImpl.SRC, mLContext.modelName);
            raptorEntity.addTag(RaptorUploaderImpl.SRC_VERSION, mLContext.getModelBundleVersion());
            StringBuilder sb = new StringBuilder();
            sb.append(mLContext.getLoadType());
            raptorEntity.addTag(RaptorUploaderImpl.LOAD_TYPE, sb.toString());
            jSONObject.put("model_name", mLContext.modelName);
            jSONObject.put(RaptorUploaderImpl.MODEL_VERSION, mLContext.getModelBundleVersion());
            jSONObject.put("model_unique_id", mLContext.modelUniqueId);
            jSONObject.put("status", i);
            jSONObject.put("duration", SystemClock.elapsedRealtime() - mLContext.startTime);
            jSONObject.put("loadType", mLContext.getLoadType());
            if (i != 0) {
                jSONObject.put("error", str);
                raptorEntity.addValue(RaptorUploaderImpl.BLUE_SRC_LOAD_SUCC_RATE, 0.0f);
                raptorEntity.addTag("status", "fail");
                raptorEntity.addTag("errorCode", str2);
                i2 = 100;
            } else {
                raptorEntity.addValue(RaptorUploaderImpl.BLUE_SRC_LOAD_SUCC_DURATION, (float) (SystemClock.elapsedRealtime() - mLContext.startTime));
                raptorEntity.addValue(RaptorUploaderImpl.BLUE_SRC_LOAD_SUCC_RATE, 1.0f);
                raptorEntity.addTag("status", "success");
                raptorEntity.addTag("errorCode", "0");
                i2 = sampleRate;
            }
            raptorEntity.send();
            startService("", "aidata_model_load", 0, 0, 0, 0L, jSONObject.toString(), i2);
            new StringBuilder("ai cat aidata_model_load:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void recordModelPredictStart(MLContext mLContext, String str, String str2, String str3, List<String> list) {
        Object[] objArr = {mLContext, str, str2, str3, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c6105a33be8a9d2f67c06f5361e8d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c6105a33be8a9d2f67c06f5361e8d0f");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("model_name", str);
            jSONObject.put(RaptorUploaderImpl.MODEL_VERSION, str2);
            jSONObject.put("model_unique_id", str3);
            jSONObject.put("operator_unique_list", new JSONArray((Collection) list));
            jSONObject.put("feature_data", JsonUtil.mapToJSONObject(mLContext.operatorFeature));
            startService("", "aidata_model_predict_start", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_model_predict_start】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordModelPredictFinish(@NonNull MLContext mLContext, int i, long j, String str, String str2, @Nullable Object obj, Object obj2) {
        Object[] objArr = {mLContext, Integer.valueOf(i), new Long(j), str, str2, obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a616ce1e6c484137cf1acc9fb9e8f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a616ce1e6c484137cf1acc9fb9e8f97");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("model_name", mLContext.modelName);
            jSONObject.put(RaptorUploaderImpl.MODEL_VERSION, mLContext.getModelBundleVersion());
            jSONObject.put("model_unique_id", mLContext.modelUniqueId);
            jSONObject.put("status", i);
            jSONObject.put("duration", j);
            jSONObject.put("detail_data", obj);
            if (i != 0) {
                jSONObject.put("error", str);
                hashMap.put(RaptorUploaderImpl.BLUE_MODEL_PREDICT_SUCC_RATE, Float.valueOf(0.0f));
                hashMap.put(RaptorUploaderImpl.BLUE_MODEL_PREDICT_DURATION, Long.valueOf(j));
                hashMap.put("status", "fail");
                hashMap.put("fail_detail", str);
                hashMap.put("errorCode", str2);
            } else {
                hashMap.put(RaptorUploaderImpl.BLUE_MODEL_PREDICT_SUCC_RATE, Float.valueOf(1.0f));
                hashMap.put(RaptorUploaderImpl.BLUE_MODEL_PREDICT_DURATION, Long.valueOf(j));
                hashMap.put("status", "success");
                hashMap.put("errorCode", "0");
            }
            jSONObject.put(RaptorUploaderImpl.FEATURE_SIZE, mLContext.featureSize);
            jSONObject.put("resultData", AiFeatureUtil.objectToString(obj2));
            hashMap.put("model_name", mLContext.modelName);
            hashMap.put(RaptorUploaderImpl.MODEL_VERSION, mLContext.getModelBundleVersion());
            hashMap.put("model_unique_id", mLContext.modelUniqueId);
            hashMap.put("biz", mLContext.getBiz());
            hashMap.put(RaptorUploaderImpl.FEATURE_SIZE, Integer.valueOf(mLContext.featureSize));
            new RaptorUploaderImpl().uploadModelPredictFinish(hashMap, 100);
            startService("", "aidata_model_predict_finish", 0, 0, 0, 0L, jSONObject.toString(), 100);
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                jSONObject.put("predict_result", obj2 == null ? StringUtil.NULL : obj2);
                LogUtil.aiLogD("【aidata_model_predict_finish】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordModelPredict(@NonNull MLContext mLContext, int i, String str, String str2) {
        Object[] objArr = {mLContext, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f499aa74b1b36846d0d65cd6e93b59a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f499aa74b1b36846d0d65cd6e93b59a2");
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime() - mLContext.startTime;
            new HashMap();
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("model_name", mLContext.modelName);
            jSONObject.put(RaptorUploaderImpl.MODEL_VERSION, mLContext.getModelBundleVersion());
            jSONObject.put("model_unique_id", mLContext.modelUniqueId);
            jSONObject.put("status", i);
            jSONObject.put("duration", elapsedRealtime);
            BaseRaptorUploader baseRaptorUploader = new BaseRaptorUploader();
            if (i != 0) {
                jSONObject.put("error", str);
                baseRaptorUploader.addValues(RaptorUploaderImpl.BLUE_MODEL_PREDICT_WHOLE_SUCC_RATE, Float.valueOf(0.0f));
                baseRaptorUploader.addTags("status", "fail");
                if (!TextUtils.isEmpty(str)) {
                    baseRaptorUploader.addExtra("fail_detail", str);
                }
                baseRaptorUploader.addTags("errorCode", str2);
            } else {
                baseRaptorUploader.addValues(RaptorUploaderImpl.BLUE_MODEL_PREDICT_WHOLE_SUCC_RATE, Float.valueOf(1.0f));
                baseRaptorUploader.addValues(RaptorUploaderImpl.BLUE_MODEL_PREDICT_WHOLE_DURATION, Long.valueOf(elapsedRealtime));
                baseRaptorUploader.addTags("status", "success");
                baseRaptorUploader.addTags("errorCode", "0");
            }
            baseRaptorUploader.addTags("path", RaptorUploaderImpl.BLUE_MODEL_PREDICT_WHOLE);
            baseRaptorUploader.addTags("model_name", mLContext.modelName);
            baseRaptorUploader.addTags(RaptorUploaderImpl.MODEL_VERSION, mLContext.getModelBundleVersion());
            baseRaptorUploader.addTags("model_unique_id", mLContext.modelUniqueId);
            baseRaptorUploader.addTags("biz", mLContext.getBiz());
            baseRaptorUploader.addValues(RaptorUploaderImpl.BLUE_MODEL_PREDICT_WAITING_SRC_DURATION, Integer.valueOf(mLContext.computeBundleWaitTime(elapsedRealtime)));
            if (mLContext.autoPredictInfo != null) {
                baseRaptorUploader.addTags("cepId", mLContext.autoPredictInfo.optString("cepId", "-999"));
                baseRaptorUploader.addTags(RaptorUploaderImpl.CEP_VERSION, mLContext.autoPredictInfo.optString(RaptorUploaderImpl.CEP_VERSION, "-999"));
                baseRaptorUploader.addTags(RaptorUploaderImpl.CEP_UNIQUE_ID, mLContext.autoPredictInfo.optString(RaptorUploaderImpl.CEP_UNIQUE_ID, "-999"));
            }
            baseRaptorUploader.send();
            startService("", "aidata_model_predict", 0, 0, 0, 0L, jSONObject.toString(), 100);
            new StringBuilder("ai cat aidata_model_predict:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void recordModelPredictLongTime(Map<String, Long> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca4bb497e96611fa1413f21372be63d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca4bb497e96611fa1413f21372be63d9");
        } else if (map == null || map.size() <= 0) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(map);
                addCommonParam(jSONObject);
                addEnv(jSONObject);
                startService("", "aidata_model_predict_long_time", 0, 0, 0, 0L, jSONObject.toString(), 100);
            } catch (Exception unused) {
            }
        }
    }

    public void recordFeatureQuery(String str, String str2, int i, Map<String, List<ResultRow>> map) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d490468ed797c92a94043ef7bc6f378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d490468ed797c92a94043ef7bc6f378");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            RaptorEntity raptorEntity = new RaptorEntity();
            raptorEntity.addValue(RaptorUploaderImpl.BLUE_FEATURE_CONSUME, 1.0f);
            raptorEntity.addTag("path", RaptorUploaderImpl.BLUE_FEATURE_CONSUME);
            raptorEntity.addTag("feature", str);
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            raptorEntity.addTag(RaptorUploaderImpl.CONSUME_TYPE, sb.toString());
            jSONObject.put("feature", str);
            jSONObject.put(RaptorUploaderImpl.CONSUME_UNIQUE_ID, str2);
            jSONObject.put(RaptorUploaderImpl.CONSUME_TYPE, i);
            if (map != null && !map.isEmpty() && map.get(str) != null && map.get(str).size() > 0) {
                jSONObject.put("isFeatureDataEmpty", false);
                FeatureResult featureResult = new FeatureResult(map);
                raptorEntity.addTag(RaptorUploaderImpl.IS_DATA_EMPTY, "0");
                JSONObject jsonObject = featureResult.toJsonObject();
                if (jsonObject == null) {
                    jsonObject = new JSONObject();
                }
                jSONObject.put("resultData", jsonObject);
            } else {
                raptorEntity.addTag(RaptorUploaderImpl.IS_DATA_EMPTY, "1");
                jSONObject.put("isFeatureDataEmpty", true);
            }
            raptorEntity.addExtra(RaptorUploaderImpl.CONSUME_UNIQUE_ID, str2);
            raptorEntity.send();
            startService("", "aidata_feature_query", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            new StringBuilder("ai cat aidata_feature_query:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void recordStartCepServiceByBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bef1f5304b46ab4b5b0f951e44f7e195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bef1f5304b46ab4b5b0f951e44f7e195");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("biz", str);
            jSONObject.put(DeviceInfo.TM, currentTimeMillis);
            startService("", "aidata_cep_start_biz", 0, 0, 0, 0L, jSONObject.toString(), 100);
            new RaptorUploaderImpl().uploadStartCepService(str, 100);
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_cep_start_biz】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void recordCepServiceStart(String str, List<FeatureBean> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "897da26dc67c2a799036aef906fa22aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "897da26dc67c2a799036aef906fa22aa");
        } else if (list != null && list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject();
                addEnv(jSONObject);
                jSONObject.put("biz", str);
                jSONObject.put(DeviceInfo.TM, currentTimeMillis);
                JSONArray jSONArray = new JSONArray();
                for (FeatureBean featureBean : list) {
                    jSONArray.put(featureBean.feature);
                }
                jSONObject.put(Constants.SubscriberConstants.KEY_CEP_ID_LIST, jSONArray);
                startService("", "aidata_cep_start_id_array", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            } catch (Exception unused) {
            }
        }
    }

    public void recordCepServiceStop(String str, List<FeatureBean> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd21fb009462e9c85496adfaa703ff01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd21fb009462e9c85496adfaa703ff01");
        } else if (list != null && list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject();
                addEnv(jSONObject);
                jSONObject.put("biz", str);
                jSONObject.put(DeviceInfo.TM, currentTimeMillis);
                JSONArray jSONArray = new JSONArray();
                for (FeatureBean featureBean : list) {
                    jSONArray.put(featureBean.feature);
                }
                jSONObject.put(Constants.SubscriberConstants.KEY_CEP_ID_LIST, jSONArray);
                startService("", "aidata_cep_stop_id_array", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            } catch (Exception unused) {
            }
        }
    }

    public void recordStopCepServiceByBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0acc500f5cb5384beb84ff116cf9f639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0acc500f5cb5384beb84ff116cf9f639");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("biz", str);
            jSONObject.put(DeviceInfo.TM, currentTimeMillis);
            startService("", "aidata_cep_stop_biz", 0, 0, 0, 0L, jSONObject.toString(), getSampleRate());
            if (AIDataDelegate.getInstance().isDebugEnable()) {
                LogUtil.aiLogD("【aidata_cep_stop_biz】\n" + jSONObject.toString());
            }
        } catch (Exception unused) {
        }
    }

    public void addCommonParam(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8926359db45b353b1f66678e1819c06b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8926359db45b353b1f66678e1819c06b");
        } else if (jSONObject != null) {
            try {
                jSONObject.put("aidata_ver", "0.0.9.77");
                jSONObject.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, AppUtil.getVersionName(AIData.getContext()));
                jSONObject.put("event_timestamp", System.currentTimeMillis());
                jSONObject.put(Constants.Environment.KEY_UNION_ID, this.mCatMonitorService.getUnionid());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void terminate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f9b3e5e416c7c655fd852d674406138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f9b3e5e416c7c655fd852d674406138");
            return;
        }
        synchronized (this) {
            if (this.mCatExecutorService != null) {
                this.mCatExecutorService.shutdown();
            }
            this.mCatMonitorService = null;
        }
    }

    public void startService(final String str, final String str2, final int i, final int i2, final int i3, final long j, final String str3, final int i4) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), str3, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e2fba88cb981814e896373ce87240e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e2fba88cb981814e896373ce87240e1");
        } else if (this.mCatMonitorService == null || this.mCatExecutorService == null) {
        } else {
            this.mCatExecutorService.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.CatMonitorManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r14 = this;
                        r0 = 0
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.aidata.monitor.CatMonitorManager.AnonymousClass1.changeQuickRedirect
                        java.lang.String r10 = "8f680a5c35df1d0a7ee917eb9bf0a6b8"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r14
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L18
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r14, r9, r0, r10)
                        return
                    L18:
                        java.lang.String r1 = r2
                        boolean r1 = android.text.TextUtils.isEmpty(r1)
                        if (r1 != 0) goto L38
                        java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L38
                        java.lang.String r2 = r2     // Catch: java.lang.Exception -> L38
                        r1.<init>(r2)     // Catch: java.lang.Exception -> L38
                        java.lang.String r2 = "https"
                        java.lang.String r1 = r1.getProtocol()     // Catch: java.lang.Exception -> L38
                        boolean r1 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L38
                        if (r1 == 0) goto L36
                        r0 = 8
                    L36:
                        r6 = r0
                        goto L39
                    L38:
                        r6 = 0
                    L39:
                        monitor-enter(r14)
                        int r0 = r3     // Catch: java.lang.Throwable -> L7b
                        if (r0 <= 0) goto L5d
                        com.meituan.android.common.aidata.monitor.CatMonitorManager r0 = com.meituan.android.common.aidata.monitor.CatMonitorManager.this     // Catch: java.lang.Throwable -> L7b
                        com.meituan.android.common.aidata.monitor.CatMonitorService r1 = com.meituan.android.common.aidata.monitor.CatMonitorManager.access$100(r0)     // Catch: java.lang.Throwable -> L7b
                        long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7b
                        java.lang.String r4 = r4     // Catch: java.lang.Throwable -> L7b
                        r5 = 0
                        int r7 = r5     // Catch: java.lang.Throwable -> L7b
                        int r8 = r6     // Catch: java.lang.Throwable -> L7b
                        int r9 = r7     // Catch: java.lang.Throwable -> L7b
                        long r10 = r8     // Catch: java.lang.Throwable -> L7b
                        int r10 = (int) r10     // Catch: java.lang.Throwable -> L7b
                        r11 = 0
                        java.lang.String r12 = r10     // Catch: java.lang.Throwable -> L7b
                        int r13 = r3     // Catch: java.lang.Throwable -> L7b
                        r1.pv4(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L7b
                        goto L79
                    L5d:
                        com.meituan.android.common.aidata.monitor.CatMonitorManager r0 = com.meituan.android.common.aidata.monitor.CatMonitorManager.this     // Catch: java.lang.Throwable -> L7b
                        com.meituan.android.common.aidata.monitor.CatMonitorService r1 = com.meituan.android.common.aidata.monitor.CatMonitorManager.access$100(r0)     // Catch: java.lang.Throwable -> L7b
                        long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7b
                        java.lang.String r4 = r4     // Catch: java.lang.Throwable -> L7b
                        r5 = 0
                        int r7 = r5     // Catch: java.lang.Throwable -> L7b
                        int r8 = r6     // Catch: java.lang.Throwable -> L7b
                        int r9 = r7     // Catch: java.lang.Throwable -> L7b
                        long r10 = r8     // Catch: java.lang.Throwable -> L7b
                        int r10 = (int) r10     // Catch: java.lang.Throwable -> L7b
                        r11 = 0
                        java.lang.String r12 = r10     // Catch: java.lang.Throwable -> L7b
                        r1.pv4(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7b
                    L79:
                        monitor-exit(r14)     // Catch: java.lang.Throwable -> L7b
                        return
                    L7b:
                        r0 = move-exception
                        monitor-exit(r14)     // Catch: java.lang.Throwable -> L7b
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.monitor.CatMonitorManager.AnonymousClass1.run():void");
                }
            });
        }
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public void setSampleRate(int i) {
        this.mSampleRate = i;
    }

    public void reportDbCreateView(String str, String str2, List<String> list, int i, String str3) {
        Object[] objArr = {str, str2, list, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d99991c8e74252a0aacd15431f3b0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d99991c8e74252a0aacd15431f3b0ed");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            addEnv(jSONObject);
            jSONObject.put("viewName", str);
            jSONObject.put("token", str2);
            jSONObject.put("categories", new JSONArray((Collection) list));
            jSONObject.put("success", i);
            jSONObject.put("error", str3);
            startService("", "aidata_db_create_view", 0, 0, 0, 0L, jSONObject.toString(), 100);
            new StringBuilder("aidata_db_create_view:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void reportUnzipResult(String str, String str2, long j, BlueException blueException) {
        int i;
        Object[] objArr = {str, str2, new Long(j), blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c6e71cee7603d7fb133a548e0281fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c6e71cee7603d7fb133a548e0281fb8");
            return;
        }
        int sampleRate = getSampleRate();
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            addCommonParam(jSONObject);
            addEnv(jSONObject);
            jSONObject.put("srcName", str);
            jSONObject.put("srcVersion", str2);
            jSONObject.put("duration", j);
            hashMap.put(RaptorUploaderImpl.SRC, str);
            hashMap.put(RaptorUploaderImpl.SRC_VERSION, str2);
            if (blueException != null) {
                jSONObject.put("status", 1);
                jSONObject.put("error", blueException.toString());
                hashMap.put(RaptorUploaderImpl.BLUE_DD_UNZIP_SUCC_RATE, Float.valueOf(0.0f));
                hashMap.put("status", "fail");
                hashMap.put("errorCode", blueException.getErrorCode());
                hashMap.put("fail_detail", blueException.toString());
                i = 100;
            } else {
                jSONObject.put("status", 0);
                hashMap.put(RaptorUploaderImpl.BLUE_DD_UNZIP_SUCC_RATE, Float.valueOf(1.0f));
                hashMap.put(RaptorUploaderImpl.BLUE_DD_UNZIP_DURATION, Long.valueOf(j));
                hashMap.put("status", "success");
                hashMap.put("errorCode", "0");
                i = sampleRate;
            }
            new RaptorUploaderImpl().uploadDdUnzip(hashMap, 100);
            startService("", DDD_UNZIP_COMMAND, 0, 0, 0, 0L, jSONObject.toString(), i);
            new StringBuilder("ai cat: aidata_dd_unzip").append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void reportRequestPersona(JSONArray jSONArray, String str, String str2, long j) {
        Object[] objArr = {jSONArray, str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f0db1cf1ed32aacff0a9d7392cdd9f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f0db1cf1ed32aacff0a9d7392cdd9f8");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            addEnv(jSONObject);
            jSONObject.put(GetFeatureJsHandler.PARAM_NAME_FEATURE_LIST, jSONArray);
            jSONObject.put("featureVersion", str);
            jSONObject.put(RaptorUploaderImpl.FEATURE_UNIQUE_ID, str2);
            jSONObject.put("user_id", j);
            startService("", "aidata_feature_request_persona", 0, 0, 0, 0L, jSONObject.toString(), 1);
            new StringBuilder("aidata_feature_request_persona:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void reportRequestPersonaFailed(JSONArray jSONArray, String str, String str2, long j, String str3) {
        Object[] objArr = {jSONArray, str, str2, new Long(j), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed7706b92a9b7f7615965df56c9627c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed7706b92a9b7f7615965df56c9627c5");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            addEnv(jSONObject);
            jSONObject.put(GetFeatureJsHandler.PARAM_NAME_FEATURE_LIST, jSONArray);
            jSONObject.put("featureVersion", str);
            jSONObject.put(RaptorUploaderImpl.FEATURE_UNIQUE_ID, str2);
            jSONObject.put("user_id", j);
            jSONObject.put("error", str3);
            startService("", "aidata_feature_request_persona_failed", 0, 0, 0, 0L, jSONObject.toString(), 100);
            new StringBuilder("aidata_feature_request_persona_failed:").append(jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void reportAIDataDBStatus(@NonNull DBStatus dBStatus) {
        Object[] objArr = {dBStatus};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "182a3d613c972c69adfd0695fca2998c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "182a3d613c972c69adfd0695fca2998c");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(GsonProvider.getInstance().toJson(dBStatus));
            addEnv(jSONObject);
            long userId = UserCenterManager.getInstance().getUserId();
            jSONObject.put("uid", userId != -1 ? String.valueOf(userId) : "");
            jSONObject.put("app_id", String.valueOf(NVLinker.getAppID()));
            jSONObject.put("platform", "1");
            jSONObject.put("sysVersion", AppUtil.getSystemVersion());
            jSONObject.put("lx_sdk_ver", "4.47.1");
            addCommonParam(jSONObject);
            StringBuilder sb = new StringBuilder("start to report aidata db status: \n");
            sb.append(jSONObject.toString());
            sb.append("\n for command: ");
            sb.append(AIDATA_DB_STATUS_COMMAND);
            startService("", AIDATA_DB_STATUS_COMMAND, 0, 0, 0, 0L, jSONObject.toString(), 100);
        } catch (Exception e) {
            new StringBuilder("report aidata db status failed: ").append(e);
        }
    }

    public void reportGestureSeqBackData(@Nullable SeqBackData seqBackData) {
        Object[] objArr = {seqBackData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3eba1fd74e2940025ced353f315e11b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3eba1fd74e2940025ced353f315e11b");
        } else if (seqBackData == null) {
        } else {
            reportSeqBackData(AIDATA_CONSISTENCY_VERIFY_GESTURE_COMMAND, seqBackData);
        }
    }

    public void reportEventSeqBackData(@Nullable SeqBackData seqBackData) {
        Object[] objArr = {seqBackData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8156d9e16e1154917fa73cac7dd3af53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8156d9e16e1154917fa73cac7dd3af53");
        } else if (seqBackData == null) {
        } else {
            reportSeqBackData(AIDATA_CONSISTENCY_VERIFY_LX_COMMAND, seqBackData);
        }
    }

    private void reportSeqBackData(@NonNull String str, @NonNull SeqBackData seqBackData) {
        Object[] objArr = {str, seqBackData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1beb9fb1f2a1fd8777face05085ffba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1beb9fb1f2a1fd8777face05085ffba");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(GsonProvider.getInstance().toJson(seqBackData));
            addEnv(jSONObject);
            long userId = UserCenterManager.getInstance().getUserId();
            jSONObject.put("uid", userId != -1 ? String.valueOf(userId) : "");
            jSONObject.put("app_id", String.valueOf(NVLinker.getAppID()));
            jSONObject.put("platform", "1");
            jSONObject.put("sysVersion", AppUtil.getSystemVersion());
            jSONObject.put("lx_sdk_ver", "4.47.1");
            addCommonParam(jSONObject);
            StringBuilder sb = new StringBuilder("start to report seq back data: \n");
            sb.append(jSONObject.toString());
            sb.append("\n for command: ");
            sb.append(str);
            startService("", str, 0, 0, 0, 0L, jSONObject.toString(), 100);
        } catch (Exception e) {
            new StringBuilder("report seq back data failed: ").append(e);
        }
    }

    public static void addEnv(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11902dc159b5190f4fab00e3d9b90f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11902dc159b5190f4fab00e3d9b90f4c");
        } else if (jSONObject == null) {
        } else {
            try {
                jSONObject.put("env", AppUtil.getEnv());
            } catch (JSONException unused) {
            }
        }
    }
}
