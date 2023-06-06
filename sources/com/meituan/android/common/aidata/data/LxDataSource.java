package com.meituan.android.common.aidata.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.config.DBConfig;
import com.meituan.android.common.aidata.core.ThreadPoolManager;
import com.meituan.android.common.aidata.data.api.IDateSource;
import com.meituan.android.common.aidata.data.api.ISubscribeConfig;
import com.meituan.android.common.aidata.database.DBAIDataHelper;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.CollectionUtils;
import com.meituan.android.common.aidata.utils.JSONUtils;
import com.meituan.android.common.aidata.utils.NumberUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.dispatcher.EventManager;
import com.meituan.android.common.statistics.dispatcher.FilterConfig;
import com.meituan.android.common.statistics.dispatcher.IEventCallback;
import com.meituan.android.common.statistics.exposure.ExposureMvTimeStampManager;
import com.meituan.android.common.statistics.gesture.GestureManager;
import com.meituan.android.common.statistics.gesture.data.GestureEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LxDataSource implements IDateSource, IEventCallback, ExposureMvTimeStampManager.IExposureMvEvent, GestureManager.IGestureListener {
    public static String APP_LAUNCH_ID = "";
    private static final String TAG = "LxDataSource";
    public static ChangeQuickRedirect changeQuickRedirect;
    private DataManager mDM;

    public LxDataSource(@NonNull DataManager dataManager) {
        Object[] objArr = {dataManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d6cb6fc7273298caf9e20db3616c1c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d6cb6fc7273298caf9e20db3616c1c4");
            return;
        }
        this.mDM = dataManager;
        DataStrategy.init();
    }

    @Override // com.meituan.android.common.aidata.data.api.IDateSource
    public void subscribeData(ISubscribeConfig iSubscribeConfig) {
        Object[] objArr = {iSubscribeConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24f1fba3b3024fa3baac13139351b679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24f1fba3b3024fa3baac13139351b679");
            return;
        }
        if (iSubscribeConfig != null) {
            EventManager.getInstance().subscribeData((FilterConfig) iSubscribeConfig.getConfig(), this);
            ExposureMvTimeStampManager.getInstance().register(this);
        }
        GestureManager.getInstance().register(this);
    }

    @Override // com.meituan.android.common.statistics.exposure.ExposureMvTimeStampManager.IExposureMvEvent
    public void onEvent(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a26a67d9c2bcf22aff4621253ba841f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a26a67d9c2bcf22aff4621253ba841f");
            return;
        }
        new StringBuilder("receive mv event:\n").append(str);
        ThreadPoolManager.commit(new Runnable() { // from class: com.meituan.android.common.aidata.data.LxDataSource.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fce90a84d60df56ab67f219a7c8ceaf0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fce90a84d60df56ab67f219a7c8ceaf0");
                    return;
                }
                MVTimeStampEvent assembleMVTimeStampEvent = LxDataSource.assembleMVTimeStampEvent(JSONUtils.parseToJSONObject(str, null));
                if (assembleMVTimeStampEvent != null) {
                    LxDataSource.this.mDM.onMVTimeStampEventReceived(assembleMVTimeStampEvent);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static MVTimeStampEvent assembleMVTimeStampEvent(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a44ac3d0dabe61642ae72464e38b467d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MVTimeStampEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a44ac3d0dabe61642ae72464e38b467d");
        }
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("mreq_id");
        long optLong = jSONObject.optLong("current_tm");
        if (TextUtils.isEmpty(optString) || optLong <= 0) {
            return null;
        }
        MVTimeStampEvent mVTimeStampEvent = new MVTimeStampEvent();
        mVTimeStampEvent.mreq_id = optString;
        mVTimeStampEvent.current_tm = optLong;
        mVTimeStampEvent.mduration_gaplist = calcMDurationGapList(optString, optLong);
        return mVTimeStampEvent;
    }

    @Nullable
    private static String calcMDurationGapList(String str, long j) {
        ResultRow resultRow;
        JSONArray jSONArray;
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d07564b0a7cb9c228fc8ae9316cb34f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d07564b0a7cb9c228fc8ae9316cb34f5");
        }
        List<ResultRow> query = DBAIDataHelper.getInstance().query("SELECT mduration_gaplist, last_mv_tm, last_md_tm FROM BaseTable WHERE mreq_id='" + str + "' LIMIT 1", null, null);
        if (CollectionUtils.isEmpty(query) || (resultRow = query.get(0)) == null) {
            return null;
        }
        try {
            long j2 = resultRow.getValueByName(DataConstants.LAST_MD_TM).toLong();
            if (j2 == 0) {
                return null;
            }
            String resultColumnValue = resultRow.getValueByName("mduration_gaplist").toString();
            if (!TextUtils.isEmpty(resultColumnValue)) {
                jSONArray = new JSONArray(resultColumnValue);
                if (resultRow.getValueByName(DataConstants.LAST_MV_TM).toString() != null) {
                    jSONArray.remove(jSONArray.length() - 1);
                }
            } else {
                jSONArray = new JSONArray();
            }
            jSONArray.put(j - j2);
            return jSONArray.toString();
        } catch (Exception e) {
            new StringBuilder("query data failed: ").append(e);
            return null;
        }
    }

    @Override // com.meituan.android.common.statistics.gesture.GestureManager.IGestureListener
    public void callback(final GestureEntity gestureEntity) {
        Object[] objArr = {gestureEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d9fe2a33cd870b0f057ade78c7d3fd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d9fe2a33cd870b0f057ade78c7d3fd0");
        } else if (gestureEntity == null) {
        } else {
            ThreadPoolManager.commit(new Runnable() { // from class: com.meituan.android.common.aidata.data.LxDataSource.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fbb7f5b93a60a7e58077c2f51e816e85", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fbb7f5b93a60a7e58077c2f51e816e85");
                        return;
                    }
                    GestureBean processGestureData = LxDataSource.processGestureData(gestureEntity);
                    if (processGestureData == null || LxDataSource.this.mDM == null) {
                        return;
                    }
                    new StringBuilder("received gesture data: \n").append(processGestureData);
                    LxDataSource.this.mDM.onGestureDataReceived(processGestureData);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static GestureBean processGestureData(GestureEntity gestureEntity) {
        Object[] objArr = {gestureEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb3c13d8267eb94b98c07dcb6cfc6250", RobustBitConfig.DEFAULT_VALUE)) {
            return (GestureBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb3c13d8267eb94b98c07dcb6cfc6250");
        }
        if (gestureEntity == null) {
            return null;
        }
        GestureBean gestureBean = new GestureBean();
        gestureBean.cid = gestureEntity.pvCid;
        gestureBean.req_id = gestureEntity.pvReqId;
        gestureBean.msid = gestureEntity.pvSession;
        gestureBean.tm = gestureEntity.tm;
        gestureBean.stm = gestureEntity.stm;
        gestureBean.seq = gestureEntity.seq;
        gestureBean.start_time = gestureEntity.startTime;
        gestureBean.end_time = gestureEntity.endTime;
        gestureBean.time_gap = gestureEntity.timeGap;
        gestureBean.time_interval = gestureEntity.timeInterval;
        JSONArray jSONArray = gestureEntity.trails;
        if (jSONArray != null) {
            gestureBean.trail = jSONArray.toString();
            new StringBuilder("trail is ").append(gestureBean.trail);
        }
        gestureBean.collect_id = gestureEntity.collectId;
        gestureBean.report_id = gestureEntity.reportId;
        gestureBean.app = AppUtil.getVersionName();
        gestureBean.lat = NumberUtils.parseDouble(gestureEntity.lat, 0.0d);
        gestureBean.lng = NumberUtils.parseDouble(gestureEntity.lng, 0.0d);
        gestureBean.sdk_ver = gestureEntity.sdkVersion;
        gestureBean.app_launch_id = APP_LAUNCH_ID;
        JSONObject jSONObject = gestureEntity.startXY;
        if (jSONObject != null) {
            gestureBean.start_x = jSONObject.optString(Constants.GestureMoveEvent.KEY_X);
            gestureBean.start_y = jSONObject.optString(Constants.GestureMoveEvent.KEY_Y);
            gestureBean.start_pressure = jSONObject.optString("p", "-999");
        }
        JSONObject jSONObject2 = gestureEntity.endXY;
        if (jSONObject2 != null) {
            gestureBean.end_x = jSONObject2.optString(Constants.GestureMoveEvent.KEY_X);
            gestureBean.end_y = jSONObject2.optString(Constants.GestureMoveEvent.KEY_Y);
            gestureBean.end_pressure = jSONObject2.optString("p", "-999");
        }
        JSONObject jSONObject3 = gestureEntity.xyGap;
        if (jSONObject3 != null) {
            gestureBean.x_gap = jSONObject3.optString(Constants.GestureMoveEvent.KEY_X);
            gestureBean.y_gap = jSONObject3.optString(Constants.GestureMoveEvent.KEY_Y);
        }
        gestureBean.scale = gestureEntity.scale;
        return gestureBean;
    }

    @Override // com.meituan.android.common.statistics.dispatcher.IEventCallback
    public void onEvent(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8094de2ac9a41b85e06a55a9cad81797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8094de2ac9a41b85e06a55a9cad81797");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        ThreadPoolManager.commit(new Runnable() { // from class: com.meituan.android.common.aidata.data.LxDataSource.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86dccb17a163e09a4b88bb1149a4d3ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86dccb17a163e09a4b88bb1149a4d3ea");
                } else if (DataStrategy.dataAllowed(jSONObject)) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    EventBean processData = LxDataSource.this.processData(jSONObject);
                    processData.receive_tm = currentTimeMillis;
                    processData.transform_begin_tm = currentTimeMillis2;
                    LoganManager.getInstance().recordLxSourceEvent(processData);
                    if (LxDataSource.this.mDM != null) {
                        LxDataSource.this.mDM.onData(processData);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public EventBean processData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aed544d2401a4f804a0f797e32bf7a12", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aed544d2401a4f804a0f797e32bf7a12");
        }
        EventBean eventBean = new EventBean();
        if (jSONObject == null) {
            return eventBean;
        }
        try {
            parseEnv(eventBean, jSONObject);
            parseEvs(eventBean, jSONObject.optJSONObject("evs"));
            parseRttEnv(eventBean, jSONObject);
        } catch (Exception e) {
            new StringBuilder("error happened when processing lx data: ").append(e);
        }
        return eventBean;
    }

    private void parseRttEnv(@NonNull EventBean eventBean, @NonNull JSONObject jSONObject) {
        String[] strArr;
        Object[] objArr = {eventBean, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36f575ec9370e77d53b1d26fe56d9627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36f575ec9370e77d53b1d26fe56d9627");
            return;
        }
        String optString = jSONObject.optString(DataConstants.RTT_ENV);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        eventBean.rttEnv = optString;
        JSONObject parseToJSONObject = JSONUtils.parseToJSONObject(optString, null);
        if (parseToJSONObject == null) {
            return;
        }
        String startOperator = DBConfig.getInstance().getStartOperator();
        String endOperator = DBConfig.getInstance().getEndOperator();
        StringBuilder sb = new StringBuilder();
        for (String str : DataConstants.RTT_ENV_FIELDS) {
            String optString2 = parseToJSONObject.optString(str, null);
            if (optString2 != null) {
                sb.append(startOperator);
                sb.append("rtt_env.");
                sb.append(str);
                sb.append(endOperator);
                sb.append(optString2);
            }
        }
        eventBean.rttEnvFlatten = sb.toString();
    }

    private void parseEnv(@NonNull EventBean eventBean, @NonNull JSONObject jSONObject) {
        Object[] objArr = {eventBean, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b5c8b341832422fb36286e50d09bb34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b5c8b341832422fb36286e50d09bb34");
            return;
        }
        new StringBuilder("LxDataSource origin lx data=").append(jSONObject.toString());
        eventBean.category = jSONObject.optString("category", "");
        if (!TextUtils.isEmpty(eventBean.category) && eventBean.category.startsWith(Constants.PREFIX)) {
            eventBean.category = eventBean.category.replaceFirst(Constants.PREFIX, "");
        }
        eventBean.uid = jSONObject.optLong("uid", -1L);
        eventBean.cityId = jSONObject.optLong(Constants.Environment.KEY_CITYID, -1L);
        eventBean.locateCityId = jSONObject.optLong("locate_city_id", -1L);
        eventBean.sc = jSONObject.optString(Constants.Environment.KEY_SC, "");
        eventBean.net = jSONObject.optString("net", "");
        eventBean.msid = jSONObject.optString("msid", "");
        eventBean.lch = jSONObject.optString("lch", "");
        eventBean.local_source = jSONObject.optString(Constants.Environment.KEY_LOCAL_SOURCE, "");
        eventBean.ps = jSONObject.optString("ps", "");
        eventBean.apn = jSONObject.optString(Constants.Environment.KEY_APN, "");
        eventBean.mno = jSONObject.optString(Constants.Environment.KEY_MNO, "");
        eventBean.wifi = jSONObject.optString("wifi", "");
        eventBean.bht = jSONObject.optString("bht", "");
        eventBean.loginType = jSONObject.optString(Constants.Environment.KEY_LOGINTYPE, "");
        eventBean.pushId = jSONObject.optString(Constants.Environment.KEY_PUSHID, "");
        eventBean.sdk_ver = jSONObject.optString("sdk_ver", "");
        eventBean.utmSource = jSONObject.optString("utm_source", "");
        String optString = jSONObject.optString(Constants.Environment.KEY_UTM, "");
        if (TextUtils.isEmpty(eventBean.utmSource) && !TextUtils.isEmpty(optString)) {
            try {
                eventBean.utmSource = new JSONObject(optString).optString("utm_source");
            } catch (JSONException unused) {
            }
        }
        eventBean.utmMedium = jSONObject.optString("utm_medium", "");
        if (TextUtils.isEmpty(eventBean.utmMedium) && !TextUtils.isEmpty(optString)) {
            try {
                eventBean.utmMedium = new JSONObject(optString).optString("utm_medium");
            } catch (JSONException unused2) {
            }
        }
        eventBean.utmCampaign = jSONObject.optString("utm_campaign", "");
        if (TextUtils.isEmpty(eventBean.utmCampaign) && !TextUtils.isEmpty(optString)) {
            try {
                eventBean.utmCampaign = new JSONObject(optString).optString("utm_campaign");
            } catch (JSONException unused3) {
            }
        }
        eventBean.utmContent = jSONObject.optString("utm_content", "");
        if (TextUtils.isEmpty(eventBean.utmContent) && !TextUtils.isEmpty(optString)) {
            try {
                eventBean.utmContent = new JSONObject(optString).optString("utm_content");
            } catch (JSONException unused4) {
            }
        }
        eventBean.utmTerm = jSONObject.optString("utm_term", "");
        if (TextUtils.isEmpty(eventBean.utmTerm) && !TextUtils.isEmpty(optString)) {
            try {
                eventBean.utmTerm = new JSONObject(optString).optString("utm_term");
            } catch (JSONException unused5) {
            }
        }
        eventBean.app = jSONObject.optString("app", "");
        eventBean.os = jSONObject.optString("os", "");
        eventBean.bssid = jSONObject.optString(Constants.Environment.KEY_BSSID, "");
        eventBean.scale = jSONObject.optString("scale");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:8|(2:10|(11:14|15|(1:66)(2:18|(1:20)(1:65))|21|22|23|24|(1:26)|(2:59|60)|28|(1:57)(4:32|(2:52|(1:56))(4:36|(4:43|44|(3:47|48|45)|49)|38|(1:40))|41|42)))(1:68)|67|15|(0)|66|21|22|23|24|(0)|(0)|28|(2:30|57)(1:58)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x017b, code lost:
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseEvs(@android.support.annotation.NonNull com.meituan.android.common.aidata.data.EventBean r14, @android.support.annotation.Nullable org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.data.LxDataSource.parseEvs(com.meituan.android.common.aidata.data.EventBean, org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0455  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.meituan.android.common.aidata.data.EventBean parseVallab(com.meituan.android.common.aidata.data.EventBean r17, org.json.JSONObject r18, org.json.JSONObject r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.data.LxDataSource.parseVallab(com.meituan.android.common.aidata.data.EventBean, org.json.JSONObject, org.json.JSONObject, boolean):com.meituan.android.common.aidata.data.EventBean");
    }

    private void parse30EventData(EventBean eventBean, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        JSONObject optJSONObject;
        Object[] objArr = {eventBean, jSONObject, jSONObject2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2dd53bf8feceb89320ccc2c2d7c45e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2dd53bf8feceb89320ccc2c2d7c45e7");
        } else if (eventBean == null || jSONObject == null) {
        } else {
            if (jSONObject2 != null) {
                eventBean.index = jSONObject2.optLong("index", -1L);
            }
            if (z && eventBean.index == -1) {
                eventBean.index = jSONObject.optLong("index", -1L);
            }
            if (jSONObject2 != null) {
                eventBean.element_id = jSONObject2.optString("element_id", "");
            }
            if (TextUtils.isEmpty(eventBean.element_id) && AppUtil.isDPApp() && jSONObject2 != null && (optJSONObject = jSONObject2.optJSONObject("custom")) != null) {
                eventBean.element_id = optJSONObject.optString("element_id", "");
            }
            if (z && TextUtils.isEmpty(eventBean.element_id)) {
                eventBean.element_id = jSONObject.optString("element_id", "");
            }
            if (jSONObject2 != null) {
                eventBean.val_act = jSONObject2.optString("val_act", "");
            }
            if (z && TextUtils.isEmpty(eventBean.val_act)) {
                eventBean.val_act = jSONObject.optString("val_act", "");
            }
        }
    }

    private EventBean parseInnterData(EventBean eventBean, JSONObject jSONObject) {
        Object[] objArr = {eventBean, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bc7602c27240b6fd594f5429c12a8d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bc7602c27240b6fd594f5429c12a8d2");
        }
        if (jSONObject == null || eventBean == null) {
            return eventBean;
        }
        eventBean.appLaunchId = jSONObject.optString("app_launch_id", "");
        if (!TextUtils.isEmpty(eventBean.appLaunchId)) {
            APP_LAUNCH_ID = eventBean.appLaunchId;
        }
        return eventBean;
    }

    private StringBuilder parseObjectFlattenByPart(JSONObject jSONObject, String str, List<List<String>> list, boolean z) {
        Object[] objArr = {jSONObject, str, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "385fd198ccbc04eeb9e52c6e20bc35f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (StringBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "385fd198ccbc04eeb9e52c6e20bc35f0");
        }
        StringBuilder sb = new StringBuilder();
        if (list == null || list.size() == 0) {
            return sb;
        }
        for (List<String> list2 : list) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            JSONObject jSONObject2 = jSONObject;
            String str2 = "";
            for (int i = 0; i < list2.size(); i++) {
                String str3 = list2.get(i);
                sb2.append(str3);
                try {
                    if (i < list2.size() - 1) {
                        sb2.append(CommonConstant.Symbol.DOT);
                        jSONObject2 = jSONObject2.getJSONObject(str3);
                    } else {
                        str2 = jSONObject2.getString(str3);
                    }
                } catch (JSONException unused) {
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(sb3)) {
                sb.append(DBConfig.getInstance().getStartOperator());
                sb.append(sb3);
                sb.append(DBConfig.getInstance().getEndOperator());
                sb.append(str2);
            }
        }
        return sb;
    }

    private String parseObjectFlattenForAll(Object obj, String str, String str2, String str3, int i) {
        Object[] objArr = {obj, str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ceb87725b71fec899ae4aa601061431", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ceb87725b71fec899ae4aa601061431");
        }
        String unflattenJson = unflattenJson(obj, str, str2, str3, 1, i, new StringBuilder());
        new StringBuilder("parse result:").append(unflattenJson);
        return unflattenJson;
    }

    private String unflattenJson(Object obj, String str, String str2, String str3, int i, int i2, StringBuilder sb) {
        Object[] objArr = {obj, str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), sb};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4383dd69692eec189af3fa0d1d1cb25a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4383dd69692eec189af3fa0d1d1cb25a");
        }
        if (obj == null || sb == null) {
            return null;
        }
        try {
            if (i <= i2) {
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    sb.append(str2);
                    sb.append(str);
                    sb.append(str3);
                    sb.append(jSONArray.toString());
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        unflattenJson(jSONArray.get(i3), str + "[" + i3 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, str2, str3, i + 1, i2, sb);
                    }
                } else if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String obj2 = keys.next().toString();
                        Object obj3 = jSONObject.get(obj2);
                        if (obj3 != null) {
                            if (obj3 instanceof JSONArray) {
                                JSONArray jSONArray2 = (JSONArray) obj3;
                                if (!TextUtils.isEmpty(str)) {
                                    obj2 = str + CommonConstant.Symbol.DOT + obj2;
                                }
                                unflattenJson(jSONArray2, obj2, str2, str3, i + 1, i2, sb);
                            } else if (obj3 instanceof JSONObject) {
                                if (!TextUtils.isEmpty(str)) {
                                    obj2 = str + CommonConstant.Symbol.DOT + obj2;
                                }
                                unflattenJson((JSONObject) obj3, obj2, str2, str3, i + 1, i2, sb);
                            } else {
                                if (!TextUtils.isEmpty(str)) {
                                    obj2 = str + CommonConstant.Symbol.DOT + obj2;
                                }
                                sb.append(str2);
                                sb.append(obj2);
                                sb.append(str3);
                                sb.append(obj3.toString());
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str2);
                                sb2.append(obj2);
                                sb2.append(str3);
                                sb2.append(obj3.toString());
                                sb2.append(StringUtil.SPACE);
                            }
                        }
                    }
                } else {
                    sb.append(str2);
                    sb.append(str);
                    sb.append(str3);
                    sb.append(obj.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(str);
                    sb3.append(str3);
                    sb3.append(obj.toString());
                    sb3.append(StringUtil.SPACE);
                }
            } else {
                sb.append(str2);
                sb.append(str);
                sb.append(str3);
                sb.append(obj.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(str);
                sb4.append(str3);
                sb4.append(obj.toString());
                sb4.append(StringUtil.SPACE);
            }
        } catch (Throwable unused) {
        }
        return sb != null ? sb.toString() : "";
    }
}
