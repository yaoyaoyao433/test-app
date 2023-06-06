package com.meituan.android.common.aidata.data;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.InitConfig;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.android.common.aidata.cache.DBCacheHandler;
import com.meituan.android.common.aidata.cache.result.OpResult;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.config.AuthConfig;
import com.meituan.android.common.aidata.config.ConfigManager;
import com.meituan.android.common.aidata.config.DBConfig;
import com.meituan.android.common.aidata.config.MobileCloudConsistencyConfig;
import com.meituan.android.common.aidata.core.ThreadPoolManager;
import com.meituan.android.common.aidata.data.SeqBackData;
import com.meituan.android.common.aidata.data.api.EventFilterListener;
import com.meituan.android.common.aidata.data.api.IDateSource;
import com.meituan.android.common.aidata.data.api.ISubscribeConfig;
import com.meituan.android.common.aidata.database.DBAIDataHelper;
import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.android.common.aidata.feature.optimize.cep.DBCEPSubTableDataHelper;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.resources.manager.EventDataCacheManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.DateUtils;
import com.meituan.android.common.aidata.utils.NumberUtils;
import com.meituan.android.common.aidata.utils.SPCacheHelper;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.dispatcher.FilterConfig;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DataManager {
    private static final String TAG = "DataManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DataManager instance;
    private static final Object sGestureDataLock = new Object();
    private final ConcurrentHashMap<EventFilterListener, CallbackWraper> mCbFilterList;
    private InitConfig mConfig;
    private final ConcurrentHashMap<String, IDateSource> mDataSourceList;
    private final ConcurrentHashMap<EventFilterListener, CallbackWraper> mInnerEventListenerList;
    private volatile boolean mOldDataCleared;
    private volatile boolean mOldGestureDataCleared;
    private volatile boolean mSeqDataReportStarted;

    public static /* synthetic */ long[] access$200() {
        return getDataReportTimeSection();
    }

    public static DataManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "971de00d476033fa82907c25fb8149ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (DataManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "971de00d476033fa82907c25fb8149ad");
        }
        if (instance == null) {
            synchronized (DataManager.class) {
                if (instance == null) {
                    instance = new DataManager();
                }
            }
        }
        return instance;
    }

    public DataManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b379a041e4b0de21f6f333a4bca34c07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b379a041e4b0de21f6f333a4bca34c07");
            return;
        }
        this.mConfig = null;
        this.mOldGestureDataCleared = false;
        this.mOldDataCleared = false;
        this.mSeqDataReportStarted = false;
        this.mDataSourceList = new AsyncHashMap();
        this.mDataSourceList.put("lingxi", new LxDataSource(this));
        this.mCbFilterList = new AsyncHashMap();
        this.mInnerEventListenerList = new AsyncHashMap();
    }

    public void initConfig(InitConfig initConfig) {
        Object[] objArr = {initConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b36b52df7bf879a65f77a800fa22dd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b36b52df7bf879a65f77a800fa22dd0");
        } else {
            this.mConfig = initConfig;
        }
    }

    public void subscribeData(String str, EventFilter eventFilter, EventFilterListener eventFilterListener) {
        Object[] objArr = {str, eventFilter, eventFilterListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed3591e3e706629c65c2b1ad2c9964b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed3591e3e706629c65c2b1ad2c9964b2");
        } else if (eventFilterListener == null) {
        } else {
            synchronized (this.mCbFilterList) {
                this.mCbFilterList.put(eventFilterListener, new CallbackWraper(str, eventFilter, eventFilterListener));
            }
        }
    }

    public synchronized void subscribeDataInner(EventFilter eventFilter, EventFilterListener eventFilterListener) {
        Object[] objArr = {eventFilter, eventFilterListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2637d02a6359110d2ee06fcd9e4e4907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2637d02a6359110d2ee06fcd9e4e4907");
        } else if (eventFilterListener == null) {
        } else {
            synchronized (this.mInnerEventListenerList) {
                this.mInnerEventListenerList.put(eventFilterListener, new CallbackWraper(null, eventFilter, eventFilterListener));
            }
        }
    }

    public synchronized void unsubscribeDataInner(EventFilterListener eventFilterListener) {
        Object[] objArr = {eventFilterListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21e36593d9875305749ded0ee3b6281d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21e36593d9875305749ded0ee3b6281d");
        } else if (eventFilterListener != null) {
            synchronized (this.mInnerEventListenerList) {
                this.mInnerEventListenerList.remove(eventFilterListener);
            }
        }
    }

    public synchronized void unsubscribeData(EventFilterListener eventFilterListener) {
        Object[] objArr = {eventFilterListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "531555f27bc243b762599b81205eac14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "531555f27bc243b762599b81205eac14");
        } else if (eventFilterListener != null) {
            synchronized (this.mCbFilterList) {
                this.mCbFilterList.remove(eventFilterListener);
            }
        }
    }

    public synchronized void subscribeData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f411fa4755b80c2cae389f7aeebd143d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f411fa4755b80c2cae389f7aeebd143d");
            return;
        }
        if (this.mDataSourceList != null && this.mDataSourceList.size() > 0) {
            for (Map.Entry<String, IDateSource> entry : this.mDataSourceList.entrySet()) {
                if (entry != null && entry.getValue() != null && entry.getKey() != null && entry.getKey().equals("lingxi")) {
                    entry.getValue().subscribeData(new ISubscribeConfig() { // from class: com.meituan.android.common.aidata.data.DataManager.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.data.api.ISubscribeConfig
                        public Object getConfig() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f5264a8486d2c9992b184e6c2aeb1595", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f5264a8486d2c9992b184e6c2aeb1595") : new FilterConfig(null, new HashSet(Arrays.asList("AS", "AQ", QuickReportConstants.PV_CONFIG, "PD", "MV", "MC", QuickReportConstants.ME_CONFIG, "MVL", "SC", QuickReportConstants.BO_CONFIG, QuickReportConstants.BP_CONFIG, "mpt", "mge", "report", Constants.EventType.PAY, "order", "MD")), null, null, null, null, null);
                        }
                    });
                }
            }
        }
    }

    public void onData(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f58f1c46b10be77bdd2232a424c2244e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f58f1c46b10be77bdd2232a424c2244e");
        } else if (eventBean == null) {
        } else {
            new StringBuilder("DataManager--- onData entry begin event nm：").append(eventBean.nm);
            if (ConfigManager.getInstance().support30EventType() || !AppUtil.is30EventType(eventBean.nm)) {
                new StringBuilder("DataManager--- onData entry begin event nm into database：").append(eventBean.nm);
                clearOldData();
                if (AIData.getContext() != null) {
                    if (DataStrategy.dataCacheAllowed(eventBean, 1)) {
                        SystemClock.elapsedRealtime();
                        if ("MD".equals(eventBean.nm)) {
                            DBCacheHandler.getInstance().updateExposureEvent(eventBean);
                        } else {
                            OpResult writeEvent = DBCacheHandler.getInstance().writeEvent(eventBean);
                            eventBean.save_end_tm = System.currentTimeMillis();
                            if (writeEvent == null || writeEvent.result <= 0) {
                                CatMonitorManager.getInstance().reportDbInsertFailData(SPCacheHelper.getInstance().getTodayCachedCount(), writeEvent != null ? writeEvent.rc : "", eventBean.req_id, eventBean.msid, String.valueOf(eventBean.lseq), String.valueOf(eventBean.tm), "0.0.9.77");
                            }
                        }
                    }
                    if (EventName.MODEL_DISAPPEAR.toString().equals(eventBean.nm)) {
                        DBCEPSubTableDataHelper.getInstance().updateExposeEvent(eventBean);
                    }
                    dispatchEvent(eventBean);
                }
            }
        }
    }

    private void dispatchEvent(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3f9352ff5c98c2a57ad8cad2638366e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3f9352ff5c98c2a57ad8cad2638366e");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final EventData processEvent = processEvent(eventBean);
        new StringBuilder("inner realtime dispatch, data manager realtime parse event tm:").append(SystemClock.elapsedRealtime() - elapsedRealtime);
        if (processEvent == null) {
            return;
        }
        if (EventName.PAGE_DISAPPEAR.toString().equals(processEvent.nm)) {
            DBCEPSubTableDataHelper.getInstance().updateTriggerEvent(processEvent);
        }
        EventDataCacheManager.getInstance().cacheEvent(processEvent);
        for (final CallbackWraper callbackWraper : this.mInnerEventListenerList.values()) {
            if (callbackWraper != null && callbackWraper.mEventCB != null && (callbackWraper.mFilter == null || callbackWraper.mFilter.filter(eventBean))) {
                ThreadPoolManager.dispatch(new Runnable() { // from class: com.meituan.android.common.aidata.data.DataManager.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6cf6cad51258e0c5989c05c67470bfd0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6cf6cad51258e0c5989c05c67470bfd0");
                            return;
                        }
                        processEvent.dispatch_begin_tm = System.currentTimeMillis();
                        new StringBuilder("inner realtime dispatch event: ").append(processEvent);
                        if (callbackWraper.mEventCB != null) {
                            callbackWraper.mEventCB.onData(processEvent);
                        }
                    }
                });
            }
        }
        for (CallbackWraper callbackWraper2 : this.mCbFilterList.values()) {
            tryDispatchEventDataToCallback(eventBean, processEvent, callbackWraper2);
        }
    }

    private void tryDispatchEventDataToCallback(@NonNull EventBean eventBean, @NonNull final EventData eventData, @Nullable final CallbackWraper callbackWraper) {
        Object[] objArr = {eventBean, eventData, callbackWraper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aee8d6d52466ae7c1c6d47e30408f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aee8d6d52466ae7c1c6d47e30408f72");
        } else if (callbackWraper == null || callbackWraper.mEventCB == null) {
        } else {
            if (callbackWraper.mFilter == null || callbackWraper.mFilter.filter(eventBean)) {
                String str = callbackWraper.token;
                String str2 = eventBean.category;
                AuthConfig authConfig = AuthConfig.getInstance();
                if (authConfig.isRealTimeDataAllowed(str, str2)) {
                    if (!eventBean.isMmpEvent() || authConfig.isMmpRealTimeDataAllowed(str)) {
                        ThreadPoolManager.dispatch(new Runnable() { // from class: com.meituan.android.common.aidata.data.DataManager.3
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d3ffd90a469c40940f4b4d706ae906cb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d3ffd90a469c40940f4b4d706ae906cb");
                                    return;
                                }
                                new StringBuilder("out realtime dispatch event: ").append(eventData);
                                if (callbackWraper.mEventCB != null) {
                                    callbackWraper.mEventCB.onData(eventData);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    private EventData processEvent(EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0111adf742c7fdb72a58e8192d78cc86", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0111adf742c7fdb72a58e8192d78cc86");
        }
        if (eventBean == null) {
            return null;
        }
        new StringBuilder("DataManager--- processEvent() receive json:").append(eventBean.toString());
        EventData eventData = new EventData();
        eventData.category = eventBean.category;
        eventData.msid = eventBean.msid;
        eventData.nm = eventBean.nm;
        eventData.val_cid = eventBean.cid;
        eventData.val_ref = eventBean.referCid;
        eventData.val_lab = AppUtil.jsonStrToMap(eventBean.valLab);
        eventData.val_bid = eventBean.bid;
        eventData.isAuto = eventBean.isAuto;
        eventData.nt = eventBean.nt;
        eventData.tag = AppUtil.jsonStrToMap(eventBean.tag);
        eventData.tm = eventBean.tm;
        eventData.seq = eventBean.seq;
        eventData.duration = eventBean.pageDuration;
        eventData.element_id = eventBean.element_id;
        eventData.mge_type = eventBean.mge_type;
        eventData.val_act = eventBean.val_act;
        eventData.item_index = Long.valueOf(eventBean.index);
        eventData.mreq_id = eventBean.mreq_id;
        eventData.mduration_total = eventBean.mduration_total;
        eventData.mduration_cnt = eventBean.mduration_cnt;
        eventData.mduration_list = eventBean.mduration_list;
        eventData.city_id = eventBean.cityId;
        eventData.locate_city_id = eventBean.locateCityId;
        eventData.lat = eventBean.lat;
        eventData.lng = eventBean.lng;
        eventData.app = eventBean.app;
        eventData.push_id = eventBean.pushId;
        eventData.utm_source = eventBean.utmSource;
        eventData.lch = eventBean.lch;
        eventData.uid = eventBean.uid;
        eventData.url = eventBean.url;
        eventData.req_id = eventBean.req_id;
        eventData.receive_tm = eventBean.receive_tm;
        eventData.transform_begin_tm = eventBean.transform_begin_tm;
        eventData.transform_end_tm = eventBean.transform_end_tm;
        eventData.save_end_tm = eventBean.save_end_tm;
        eventData.dispatch_begin_tm = eventBean.dispatch_begin_tm;
        eventData.stm = eventBean.stm;
        eventData.rttEnv = AppUtil.jsonStrToMap(eventBean.rttEnv);
        eventData.queryId = eventBean.queryId;
        eventData.sortId = eventBean.sortId;
        eventData.keyword = eventBean.keyword;
        eventData.dealgroupId = eventBean.dealgroupId;
        eventData.categoryId = eventBean.categoryId;
        eventData.poiId = eventBean.poiId;
        eventData.adId = eventBean.adId;
        eventData.orderId = eventBean.orderId;
        eventData.title = eventBean.title;
        eventData.bizId = eventBean.bizId;
        eventData.stid = eventBean.stid;
        eventData.ct_poi = eventBean.ct_poi;
        eventData.ctPoi = eventBean.ctPoi;
        eventData.abtest = eventBean.abtest;
        eventData.couponId = eventBean.couponId;
        eventData.skuId = eventBean.skuId;
        eventData.dealId = eventBean.dealId;
        eventData.movieId = eventBean.movieId;
        eventData.goodsId = eventBean.goodsId;
        eventData.maitonId = eventBean.maitonId;
        eventData.promotionId = eventBean.promotionId;
        eventData.traceId = eventBean.traceId;
        eventData.cinemaId = eventBean.cinemaId;
        eventData.selectId = eventBean.selectId;
        eventData.searchId = eventBean.searchId;
        eventData.catId = eventBean.catId;
        eventData.shopUuid = eventBean.shopUuid;
        eventData.activityid = eventBean.activityid;
        eventData.regionId = eventBean.regionId;
        eventData.custom = eventBean.custom;
        eventData.mt_aurl = eventBean.mt_aurl;
        eventData.appLaunchId = eventBean.appLaunchId;
        eventData.valLabFlatten = eventBean.valLabFlatten;
        eventData.tagFlatten = eventBean.tagFlatten;
        eventData.isLocal = eventBean.isLocal;
        new StringBuilder("DataManager--- processEvent() parse result:").append(eventData.toString());
        return eventData;
    }

    private synchronized void clearOldData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac195507d5928a1e93c7c18b5b689639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac195507d5928a1e93c7c18b5b689639");
        } else if (this.mOldDataCleared) {
        } else {
            this.mOldDataCleared = true;
            ThreadPoolManager.commit(new Runnable() { // from class: com.meituan.android.common.aidata.data.DataManager.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    long j;
                    String str;
                    LoganManager loganManager;
                    boolean z;
                    long j2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e613a0f4a237b58acd482da34fcd2d00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e613a0f4a237b58acd482da34fcd2d00");
                        return;
                    }
                    long timeForDataLastRemoved = SPCacheHelper.getInstance().timeForDataLastRemoved();
                    if (timeForDataLastRemoved <= 0 || AppUtil.checkOverdue(timeForDataLastRemoved)) {
                        DBStatus dBStatus = new DBStatus();
                        dBStatus.auto_vacuum_mode = DBAIDataHelper.getInstance().getAutoVacuumMode();
                        long count = DBCacheHandler.getInstance().getCount();
                        dBStatus.total_event_data_count_before_delete = count;
                        dBStatus.total_gesture_data_count_before_delete = GestureDataHandler.getInstance().getCount();
                        dBStatus.db_disk_size_before_delete = DBAIDataHelper.getInstance().getDBDiskSize();
                        LoganManager.getInstance().recordPreDeleteExpiredData(count, 0L, timeForDataLastRemoved, "0.0.9.77");
                        OpResult deletePostData = DBCacheHandler.getInstance().deletePostData(AppUtil.getTodayZero() - (((((DataManager.this.mConfig == null ? 2 : DataManager.this.mConfig.getCachePeriod()) * 24) * 60) * 60) * 1000));
                        if (deletePostData != null && deletePostData.result > 0) {
                            SPCacheHelper.getInstance().setTimeForDataRemoved(System.currentTimeMillis());
                            LoganManager loganManager2 = LoganManager.getInstance();
                            j = count - DBCacheHandler.getInstance().getCount();
                            j2 = count;
                            str = deletePostData.rc;
                            z = true;
                            loganManager = loganManager2;
                        } else {
                            long count2 = count - DBCacheHandler.getInstance().getCount();
                            LoganManager loganManager3 = LoganManager.getInstance();
                            j = count2;
                            str = deletePostData != null ? deletePostData.rc : "";
                            loganManager = loganManager3;
                            z = false;
                            j2 = 0;
                        }
                        loganManager.reportPostDeleteExpiredData(j2, 0L, timeForDataLastRemoved, z, str, System.currentTimeMillis() - timeForDataLastRemoved, j, "0.0.9.77");
                        dBStatus.total_event_data_count_after_delete = DBCacheHandler.getInstance().getCount();
                        dBStatus.db_disk_size_after_delete = DBAIDataHelper.getInstance().getDBDiskSize();
                        DataManager.tryStartVacuumDBAndReportDBStatus(dBStatus);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tryStartVacuumDBAndReportDBStatus(@NonNull final DBStatus dBStatus) {
        Object[] objArr = {dBStatus};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c5a578823abc985e4eb74af66e5f1d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c5a578823abc985e4eb74af66e5f1d0");
        } else {
            c.c("aidata-vacuum-db").schedule(new Runnable() { // from class: com.meituan.android.common.aidata.data.DataManager.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ce72ba508d786c997d277e99d95803af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ce72ba508d786c997d277e99d95803af");
                        return;
                    }
                    if (DBConfig.getInstance().isAidataVacuumEnabled()) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        DBCacheHandler.getInstance().execSQL("VACUUM;");
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        DBStatus.this.db_vacuum_duration = elapsedRealtime2;
                        new StringBuilder("vacuum db duration: ").append(elapsedRealtime2);
                        DBStatus.this.vacuum_executed = 1;
                        DBStatus.this.db_disk_size_after_vacuum = DBAIDataHelper.getInstance().getDBDiskSize();
                    } else {
                        DBStatus.this.vacuum_executed = 0;
                    }
                    CatMonitorManager.getInstance().reportAIDataDBStatus(DBStatus.this);
                }
            }, LocationStrategy.LOCATION_TIMEOUT, TimeUnit.MILLISECONDS);
        }
    }

    public void startReportSeqData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5db3ae7e1fc2d44874c4abefb3383dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5db3ae7e1fc2d44874c4abefb3383dd");
        } else if (this.mSeqDataReportStarted) {
        } else {
            this.mSeqDataReportStarted = true;
            startReportEventData();
            startReportGestureData();
        }
    }

    private void startReportEventData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46777c8864a7699972fb1b2484a3bacd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46777c8864a7699972fb1b2484a3bacd");
            return;
        }
        MobileCloudConsistencyConfig mobileCloudConsistencyConfig = MobileCloudConsistencyConfig.getInstance();
        if (mobileCloudConsistencyConfig.isLXReportEnabled()) {
            final SPCacheHelper sPCacheHelper = SPCacheHelper.getInstance();
            long lastReportTimeOfEventData = sPCacheHelper.getLastReportTimeOfEventData();
            if (lastReportTimeOfEventData <= 0 || AppUtil.checkOverdue(lastReportTimeOfEventData)) {
                c.c("aidata-report-event-data").schedule(new Runnable() { // from class: com.meituan.android.common.aidata.data.DataManager.6
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4766870cc4dd770461115a75eff80f7c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4766870cc4dd770461115a75eff80f7c");
                            return;
                        }
                        long[] access$200 = DataManager.access$200();
                        long j = access$200[0];
                        long j2 = access$200[1];
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        List<SeqBackData> transformDBDataToSeqBackData = DataManager.transformDBDataToSeqBackData(DBAIDataHelper.getInstance().query("select msid, min(seq) as min_seq, max(seq) as max_seq, group_concat(seq) as seqs from BaseTable where tm between " + j + " and " + j2 + " group by 1", null, null), j, j2, true);
                        StringBuilder sb = new StringBuilder("assemble event table seq back data consumed ");
                        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        sb.append("ms, with data count: ");
                        sb.append(transformDBDataToSeqBackData.size());
                        CatMonitorManager catMonitorManager = CatMonitorManager.getInstance();
                        for (SeqBackData seqBackData : transformDBDataToSeqBackData) {
                            catMonitorManager.reportEventSeqBackData(seqBackData);
                        }
                        sPCacheHelper.setLastReportTimeOfEventData(System.currentTimeMillis());
                    }
                }, (long) (mobileCloudConsistencyConfig.getReportDelayTime() * 1000.0d), TimeUnit.MILLISECONDS);
            }
        }
    }

    @NonNull
    private static long[] getDataReportTimeSection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01528389df349049d697589b47b83764", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01528389df349049d697589b47b83764");
        }
        MobileCloudConsistencyConfig mobileCloudConsistencyConfig = MobileCloudConsistencyConfig.getInstance();
        int stmStartOffset = mobileCloudConsistencyConfig.getStmStartOffset();
        int stmEndOffset = mobileCloudConsistencyConfig.getStmEndOffset();
        long b = com.meituan.android.time.c.b();
        return new long[]{DateUtils.getZeroTimeWithDayOffset(b, -1) + (stmStartOffset * 1000), DateUtils.getZeroTimeWithDayOffset(b, 0) - (stmEndOffset * 1000)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static List<SeqBackData> transformDBDataToSeqBackData(@Nullable List<ResultRow> list, long j, long j2, boolean z) {
        int i;
        int i2 = 4;
        Object[] objArr = {list, new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3702b9599afdf29df1d894e61fe0dce9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3702b9599afdf29df1d894e61fe0dce9");
        }
        String uniqueId = AppUtil.getUniqueId();
        String time = AppUtil.getTime(j);
        MobileCloudConsistencyConfig mobileCloudConsistencyConfig = MobileCloudConsistencyConfig.getInstance();
        boolean isGestureReportIdFilterEnabled = mobileCloudConsistencyConfig.isGestureReportIdFilterEnabled();
        boolean isGestureCollectIdFilterEnabled = mobileCloudConsistencyConfig.isGestureCollectIdFilterEnabled();
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            SeqBackData seqBackData = new SeqBackData();
            seqBackData.trace_id = uniqueId;
            seqBackData.total = 1;
            seqBackData.index = 0;
            seqBackData.partition_date = time;
            seqBackData.tm_start = j;
            seqBackData.tm_end = j2;
            seqBackData.report_id_filter = isGestureReportIdFilterEnabled;
            seqBackData.collect_id_filter = isGestureCollectIdFilterEnabled;
            arrayList.add(seqBackData);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (ResultRow resultRow : list) {
            if (resultRow.getColumnCount() >= i2) {
                SeqBackData.SeqInfo seqInfo = new SeqBackData.SeqInfo();
                String resultColumnValue = resultRow.getValueAtIndex(0).toString();
                if (z) {
                    seqInfo.msid = resultColumnValue;
                } else {
                    seqInfo.req_id = resultColumnValue;
                }
                seqInfo.min = resultRow.getValueAtIndex(1).toInt();
                seqInfo.max = resultRow.getValueAtIndex(2).toInt();
                updateSeqInfoGaps(seqInfo, resultRow.getValueAtIndex(3).toString());
                arrayList2.add(seqInfo);
            }
            i2 = 4;
        }
        int maxGapCountPerLog = mobileCloudConsistencyConfig.getMaxGapCountPerLog();
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList(size);
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        ArrayList arrayList4 = null;
        while (i4 < size) {
            int i6 = size;
            SeqBackData.SeqInfo seqInfo2 = (SeqBackData.SeqInfo) arrayList2.get(i4);
            if (i5 == i3) {
                ArrayList arrayList5 = new ArrayList();
                arrayList3.add(arrayList5);
                arrayList5.add(seqInfo2);
                arrayList4 = arrayList5;
                i5 = seqInfo2.getGapCount();
            } else {
                i5 += seqInfo2.getGapCount();
                if (i5 <= maxGapCountPerLog) {
                    arrayList4.add(seqInfo2);
                } else {
                    i4--;
                    i = 1;
                    i5 = -1;
                    i4 += i;
                    size = i6;
                    i3 = -1;
                }
            }
            i = 1;
            i4 += i;
            size = i6;
            i3 = -1;
        }
        int size2 = arrayList3.size();
        for (int i7 = 0; i7 < size2; i7++) {
            SeqBackData seqBackData2 = new SeqBackData();
            seqBackData2.trace_id = uniqueId;
            seqBackData2.total = size2;
            seqBackData2.index = i7;
            seqBackData2.partition_date = time;
            seqBackData2.tm_start = j;
            seqBackData2.tm_end = j2;
            seqBackData2.report_id_filter = isGestureReportIdFilterEnabled;
            seqBackData2.collect_id_filter = isGestureCollectIdFilterEnabled;
            seqBackData2.addSeqInfoList((List) arrayList3.get(i7));
            arrayList.add(seqBackData2);
        }
        return arrayList;
    }

    private static void updateSeqInfoGaps(@NonNull SeqBackData.SeqInfo seqInfo, @Nullable String str) {
        Object[] objArr = {seqInfo, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eeec455ec35e696a3fd7a7ec63e67fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eeec455ec35e696a3fd7a7ec63e67fd8");
        } else if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(CommonConstant.Symbol.COMMA);
            int length = split.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = NumberUtils.parseInt(split[i], 0);
            }
            Arrays.sort(iArr);
            for (int i2 = 1; i2 < length; i2++) {
                int i3 = iArr[i2 - 1];
                int i4 = iArr[i2];
                if (i4 - i3 > 1) {
                    seqInfo.addGap(i3 + 1, i4 - 1);
                }
            }
        }
    }

    public void onGestureDataReceived(GestureBean gestureBean) {
        Object[] objArr = {gestureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab43e3bd40002320cf9d3adff1a9dbeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab43e3bd40002320cf9d3adff1a9dbeb");
            return;
        }
        tryClearOldGestureData();
        new StringBuilder(" --- onGestureDataReceived end, store data result: ").append(GestureDataHandler.getInstance().storeData(gestureBean));
    }

    private void tryClearOldGestureData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98256823d7e728b8a175a022de9f0f8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98256823d7e728b8a175a022de9f0f8d");
            return;
        }
        synchronized (sGestureDataLock) {
            new StringBuilder("try clear old gesture data: ").append(this.mOldGestureDataCleared);
            if (this.mOldGestureDataCleared) {
                return;
            }
            this.mOldGestureDataCleared = true;
            ThreadPoolManager.commit(new Runnable() { // from class: com.meituan.android.common.aidata.data.DataManager.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1dc75c4d7806455419e8c38e80ade000", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1dc75c4d7806455419e8c38e80ade000");
                        return;
                    }
                    long lastClearTimeOfGestureData = SPCacheHelper.getInstance().getLastClearTimeOfGestureData();
                    if (lastClearTimeOfGestureData <= 0 || AppUtil.checkOverdue(lastClearTimeOfGestureData)) {
                        DBStatus dBStatus = new DBStatus();
                        dBStatus.auto_vacuum_mode = DBAIDataHelper.getInstance().getAutoVacuumMode();
                        dBStatus.total_gesture_data_count_before_delete = GestureDataHandler.getInstance().getCount();
                        dBStatus.total_event_data_count_before_delete = DBCacheHandler.getInstance().getCount();
                        dBStatus.db_disk_size_before_delete = DBAIDataHelper.getInstance().getDBDiskSize();
                        int deletePostData = GestureDataHandler.getInstance().deletePostData(AppUtil.getTodayZero() - DDLoadConstants.UNKNOWN_FILE_CLEAR_POLL_DURATION);
                        new StringBuilder("delete post data count: ").append(deletePostData);
                        if (deletePostData > 0) {
                            SPCacheHelper.getInstance().setLastClearTimeOfGestureData(System.currentTimeMillis());
                        }
                        dBStatus.total_gesture_data_count_after_delete = GestureDataHandler.getInstance().getCount();
                        dBStatus.db_disk_size_after_delete = DBAIDataHelper.getInstance().getDBDiskSize();
                        DataManager.tryStartVacuumDBAndReportDBStatus(dBStatus);
                    }
                }
            });
        }
    }

    private void startReportGestureData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd52d7d1a26bcd6f044574831e3d6927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd52d7d1a26bcd6f044574831e3d6927");
            return;
        }
        final MobileCloudConsistencyConfig mobileCloudConsistencyConfig = MobileCloudConsistencyConfig.getInstance();
        if (mobileCloudConsistencyConfig.isGestureReportEnabled()) {
            final SPCacheHelper sPCacheHelper = SPCacheHelper.getInstance();
            long lastReportTimeOfGestureData = sPCacheHelper.getLastReportTimeOfGestureData();
            if (lastReportTimeOfGestureData <= 0 || AppUtil.checkOverdue(lastReportTimeOfGestureData)) {
                c.c("aidata-report-gesture-data").schedule(new Runnable() { // from class: com.meituan.android.common.aidata.data.DataManager.8
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ee118fc1502ec888ac5b30011e5d265", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ee118fc1502ec888ac5b30011e5d265");
                            return;
                        }
                        long[] access$200 = DataManager.access$200();
                        long j = access$200[0];
                        long j2 = access$200[1];
                        String str = "select req_id, min(seq) as min_seq, max(seq) as max_seq, group_concat(seq) as seqs from GestureTable where tm between " + j + " and " + j2 + (mobileCloudConsistencyConfig.isGestureCollectIdFilterEnabled() ? " and collect_id not in (1,2) " : "") + (mobileCloudConsistencyConfig.isGestureReportIdFilterEnabled() ? " and report_id != '-999' " : "") + " group by 1";
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        List<SeqBackData> transformDBDataToSeqBackData = DataManager.transformDBDataToSeqBackData(DBAIDataHelper.getInstance().query(str, null, null), j, j2, false);
                        StringBuilder sb = new StringBuilder("assemble gesture table seq back data consumed ");
                        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                        sb.append("ms, with data count: ");
                        sb.append(transformDBDataToSeqBackData.size());
                        CatMonitorManager catMonitorManager = CatMonitorManager.getInstance();
                        for (SeqBackData seqBackData : transformDBDataToSeqBackData) {
                            catMonitorManager.reportGestureSeqBackData(seqBackData);
                        }
                        sPCacheHelper.setLastReportTimeOfGestureData(System.currentTimeMillis());
                    }
                }, (long) (mobileCloudConsistencyConfig.getReportDelayTime() * 1000.0d), TimeUnit.MILLISECONDS);
            }
        }
    }

    public void onMVTimeStampEventReceived(@NonNull MVTimeStampEvent mVTimeStampEvent) {
        Object[] objArr = {mVTimeStampEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bd3f05f50821c28acbdceda17955246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bd3f05f50821c28acbdceda17955246");
        } else {
            new StringBuilder("updateMVTimeStampEvent result: ").append(DBCacheHandler.getInstance().updateMVTimeStampEvent(mVTimeStampEvent).rc);
        }
    }
}
