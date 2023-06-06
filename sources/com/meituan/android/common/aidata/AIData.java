package com.meituan.android.common.aidata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.AiSwitchConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.AutoPredictManager;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.IPredictionJsonListener;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.cep.ICustomCepServiceListener;
import com.meituan.android.common.aidata.config.ConfigManager;
import com.meituan.android.common.aidata.data.DataManager;
import com.meituan.android.common.aidata.data.EventFilter;
import com.meituan.android.common.aidata.data.api.EventFilterListener;
import com.meituan.android.common.aidata.data.rule.CEPSubscriberConfig;
import com.meituan.android.common.aidata.data.rule.ICepArrayServiceListener;
import com.meituan.android.common.aidata.data.rule.ICepServiceListener;
import com.meituan.android.common.aidata.database.DBManager;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.JSFeatureOutParamsCallback;
import com.meituan.android.common.aidata.jsengine.AbsJSExecuteObserver;
import com.meituan.android.common.aidata.jsengine.AutoJSServiceManager;
import com.meituan.android.common.aidata.jsengine.IAutoJSRunInterceptor;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.aidata.resources.config.JSFrameworkResourceManager;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AIData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SuppressLint({"StaticFieldLeak"})
    private static Context mContext;
    private static final Object lock = new Object();
    private static volatile boolean isInit = false;
    private static final List<AIDataInitCompleteListener> initCompleteListeners = new ArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface AIDataInitCompleteListener {
        void onComplete();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ResourceConfigUpdateListener {
        void onUpdate(@Nullable Map<String, List<String>> map);
    }

    public static String getSDKVersion() {
        return "0.0.9.77";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum AIDataUpStreamType {
        FeatureAndLabel;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        AIDataUpStreamType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f37ce2b8e28749e1bc2a0b78fdca7d71", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f37ce2b8e28749e1bc2a0b78fdca7d71");
            }
        }

        public static AIDataUpStreamType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8fcbc4e66fe7c98a3e2cb2aaee6248d3", RobustBitConfig.DEFAULT_VALUE) ? (AIDataUpStreamType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8fcbc4e66fe7c98a3e2cb2aaee6248d3") : (AIDataUpStreamType) Enum.valueOf(AIDataUpStreamType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AIDataUpStreamType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "296035192c65d95752f12a70767a8f25", RobustBitConfig.DEFAULT_VALUE) ? (AIDataUpStreamType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "296035192c65d95752f12a70767a8f25") : (AIDataUpStreamType[]) values().clone();
        }
    }

    public static void init(Context context) throws IllegalArgumentException {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e056bddefb128cd20fda55f87a960f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e056bddefb128cd20fda55f87a960f1");
        } else {
            init(context, null);
        }
    }

    public static void init(Context context, InitConfig initConfig) throws IllegalArgumentException {
        Object[] objArr = {context, initConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8531941a15886d4cfe861aa1a1154108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8531941a15886d4cfe861aa1a1154108");
        } else if (isInit) {
        } else {
            if (context == null) {
                throw new IllegalArgumentException("init error: context is null");
            }
            synchronized (lock) {
                if (!isInit) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    mContext = context.getApplicationContext();
                    CatMonitorManager.getInstance().initCat(mContext, 82);
                    JSFrameworkResourceManager.getInstance().init();
                    DBManager.getInstance().registerAllTable();
                    AIDataDelegate.getInstance().init(initConfig);
                    ConfigManager.getInstance().init();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    HashMap hashMap = new HashMap();
                    hashMap.put(RaptorUploaderImpl.BLUE_INIT_DURATION, Long.valueOf(elapsedRealtime2 - elapsedRealtime));
                    new RaptorUploaderImpl().uploadBlueSdkInit(hashMap, 100);
                    isInit = true;
                    notifyInitComplete();
                }
            }
        }
    }

    public static void writePV(String str, Map<String, Object> map, String str2, String str3) {
        Object[] objArr = {str, map, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4cb96814023f767bba2176e4062d4b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4cb96814023f767bba2176e4062d4b68");
            return;
        }
        LoganManager.getInstance().recordPvData(str, str2, map, str3, Boolean.valueOf(isInit));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("pageInfoKey is empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("val_cid is empty");
        }
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("category is empty");
        }
        if (Statistics.isInitialized()) {
            Statistics.getChannel(str3).writePageView(str, str2, map);
        }
    }

    public static void writePD(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1886154d225e43776256a595ba4496e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1886154d225e43776256a595ba4496e");
            return;
        }
        LoganManager.getInstance().recordPdData(str, str2, Boolean.valueOf(isInit));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("pageInfoKey is empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("category is empty");
        }
        if (Statistics.isInitialized()) {
            Statistics.getChannel(str2).writePageDisappear(str, "", null);
        }
    }

    public static void writeModuleEvent(EventName eventName, String str, String str2, Map<String, Object> map, String str3, String str4, boolean z) {
        EventInfo obtainMcEvent;
        Object[] objArr = {eventName, str, str2, map, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6047cc2f05dddf6c0b16f421ead057b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6047cc2f05dddf6c0b16f421ead057b");
            return;
        }
        LoganManager.getInstance().recordMdData(eventName.toString(), str, str3, str2, map, str4, Boolean.valueOf(z), Boolean.valueOf(isInit));
        if (eventName == null) {
            throw new IllegalArgumentException("event name is null");
        }
        if (TextUtils.isEmpty(str4)) {
            throw new IllegalArgumentException("category is empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("val_bid is empty");
        }
        switch (eventName) {
            case CLICK:
                obtainMcEvent = EventInfo.obtainMcEvent(str3, str2, map);
                break;
            case MODEL_VIEW:
                obtainMcEvent = EventInfo.obtainMvEvent(str3, str2, map);
                break;
            case ORDER:
                obtainMcEvent = EventInfo.obtainBOEvent(str3, str2, map);
                break;
            case PAY:
                obtainMcEvent = EventInfo.obtainBPEvent(str3, str2, map);
                break;
            default:
                throw new IllegalArgumentException("event name is not valid");
        }
        EventInfo eventInfo = obtainMcEvent;
        eventInfo.mCacheControl = z ? EventInfo.CacheControl.CACHE_LOCAL : EventInfo.CacheControl.CACHE_REPORT;
        if (Statistics.isInitialized()) {
            Statistics.getChannel(str4).writeEvent(str, eventInfo);
        }
    }

    public static void writeCustomEvent(String str, String str2, String str3, Map<String, Object> map, String str4, String str5, boolean z) {
        Object[] objArr = {str, str2, str3, map, str4, str5, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7aae6da98fdf1b1e502d997e955d6a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7aae6da98fdf1b1e502d997e955d6a6a");
            return;
        }
        LoganManager.getInstance().recordUdData(str, str2, str4, str3, map, str5, Boolean.valueOf(z), Boolean.valueOf(isInit));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("eventName is empty");
        }
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("val_bid is empty");
        }
        String str6 = TextUtils.isEmpty(str4) ? "custom_cid" : str4;
        String str7 = TextUtils.isEmpty(str5) ? "custom_category" : str5;
        EventInfo obtainUDEvent = EventInfo.obtainUDEvent(str, str6, str3, map);
        obtainUDEvent.mCacheControl = z ? EventInfo.CacheControl.CACHE_LOCAL : EventInfo.CacheControl.CACHE_REPORT;
        if (Statistics.isInitialized()) {
            Statistics.getChannel(str7).writeEvent(str2, obtainUDEvent);
        }
    }

    public static void writeUpstreamDataWithType(AIDataUpStreamType aIDataUpStreamType, Map<String, Object> map) {
        Object[] objArr = {aIDataUpStreamType, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95cf53231761a43b64a3d550002e50a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95cf53231761a43b64a3d550002e50a4");
        } else if (map == null || map.size() <= 0) {
            throw new IllegalArgumentException("data is empty");
        } else {
            if (AnonymousClass1.$SwitchMap$com$meituan$android$common$aidata$AIData$AIDataUpStreamType[aIDataUpStreamType.ordinal()] == 1) {
                writeCustomEvent("featureDataType", null, "b_techportal_92es55v1_sc", map, "c_techportal_jvnk06h2", "techportal", false);
                return;
            }
            throw new IllegalArgumentException("invaid type");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.common.aidata.AIData$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$meituan$android$common$aidata$AIData$AIDataUpStreamType = new int[AIDataUpStreamType.valuesCustom().length];
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            try {
                $SwitchMap$com$meituan$android$common$aidata$AIData$AIDataUpStreamType[AIDataUpStreamType.FeatureAndLabel.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $SwitchMap$com$meituan$android$common$statistics$entity$EventName = new int[EventName.valuesCustom().length];
            try {
                $SwitchMap$com$meituan$android$common$statistics$entity$EventName[EventName.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$meituan$android$common$statistics$entity$EventName[EventName.MODEL_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$meituan$android$common$statistics$entity$EventName[EventName.ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$meituan$android$common$statistics$entity$EventName[EventName.PAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Nullable
    public static List<ResultRow> query(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ce9f7e3ae14b3dab5c9ed4296e7d11ef", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ce9f7e3ae14b3dab5c9ed4296e7d11ef") : query(null, str, str2, str3, str4, str5, str6, str7);
    }

    @Nullable
    public static List<ResultRow> query(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef11a2ed85cd74ea2b8aae4c941f807c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef11a2ed85cd74ea2b8aae4c941f807c");
        }
        if (isInit) {
            return AIDataDelegate.getInstance().query(str, str2, str3, str4, str5, str6, str7, str8);
        }
        return null;
    }

    @Nullable
    public static List<ResultRow> querySubTable(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aac04d1e79028fa27fbc4671739ded89", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aac04d1e79028fa27fbc4671739ded89");
        }
        if (isInit) {
            return AIDataDelegate.getInstance().querySubTable(str, str2, str3, str4, str5, str6, str7, str8);
        }
        return null;
    }

    public static void subscribeRealTimeData(EventFilter eventFilter, EventFilterListener eventFilterListener) {
        Object[] objArr = {eventFilter, eventFilterListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fabf9412c4a199aca65d498f102131d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fabf9412c4a199aca65d498f102131d");
        } else {
            subscribeRealTimeData(null, eventFilter, eventFilterListener);
        }
    }

    public static void subscribeRealTimeData(String str, EventFilter eventFilter, EventFilterListener eventFilterListener) {
        Object[] objArr = {str, eventFilter, eventFilterListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49e76408d60764e4c4f10a096a8339e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49e76408d60764e4c4f10a096a8339e7");
        } else if (mContext != null && isInit) {
            LoganManager.getInstance().recordAddListener(eventFilterListener == null ? "" : eventFilterListener.toString(), eventFilter);
            DataManager.getInstance().subscribeData(str, eventFilter, eventFilterListener);
        }
    }

    public static void unsubscribeRealTimeData(EventFilterListener eventFilterListener) {
        Object[] objArr = {eventFilterListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67bc53178078a2a9797e4ea23a1eea6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67bc53178078a2a9797e4ea23a1eea6f");
        } else if (mContext != null && isInit) {
            LoganManager.getInstance().recordRemoveListener(eventFilterListener == null ? "" : eventFilterListener.toString(), null);
            DataManager.getInstance().unsubscribeData(eventFilterListener);
        }
    }

    public static boolean isInitCompleted() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86a6ac0e667b9ba6c5df4632ecaa848a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86a6ac0e667b9ba6c5df4632ecaa848a")).booleanValue();
        }
        synchronized (lock) {
            z = isInit;
        }
        return z;
    }

    public static void startServiceWithBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fce63314a3530ec68e512973b20281af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fce63314a3530ec68e512973b20281af");
        } else if (isInit) {
            AIDataDelegate.getInstance().startServiceWithBiz(str);
        }
    }

    public static void stopServiceWithBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d6a9762e3375ee2e1de8e42950eadcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d6a9762e3375ee2e1de8e42950eadcb");
        } else if (isInit) {
            AIDataDelegate.getInstance().stopServiceWithBiz(str);
        }
    }

    public static void getFeature(@Nullable List<GetFeatureRequest> list, @Nullable IFeatureListener iFeatureListener) {
        Object[] objArr = {list, iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82a68bc238e2a94245c3d4e9d9ca02e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82a68bc238e2a94245c3d4e9d9ca02e7");
        } else {
            getFeature(list, null, iFeatureListener);
        }
    }

    public static void getFeature(@Nullable List<GetFeatureRequest> list, JSFeatureOutParamsCallback jSFeatureOutParamsCallback, @Nullable IFeatureListener iFeatureListener) {
        Object[] objArr = {list, jSFeatureOutParamsCallback, iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4882550dc1e3e3007731986024628bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4882550dc1e3e3007731986024628bf");
            return;
        }
        boolean isDisableFeatureService = AiSwitchConfig.getInstance().isDisableFeatureService();
        if (isInit && !isDisableFeatureService) {
            AIDispatcher.getInstance().addGetFeatureTask(list, jSFeatureOutParamsCallback, iFeatureListener);
        } else if (iFeatureListener == null) {
        } else {
            iFeatureListener.onFailed(isDisableFeatureService ? new BlueException("feature service is disable", (int) BaseRaptorUploader.ERROR_SERVICE_DEGRADE) : new BlueException("has not been initialized", 403));
        }
    }

    public static void subscribeCepServiceCallback(CEPSubscriberConfig cEPSubscriberConfig, ICepServiceListener iCepServiceListener) {
        Object[] objArr = {cEPSubscriberConfig, iCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d672c4f2b091d68f55371b2f5fa1be4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d672c4f2b091d68f55371b2f5fa1be4d");
        } else if (isInit) {
            AIDataDelegate.getInstance().subscribeCepServiceCallback(cEPSubscriberConfig, iCepServiceListener);
        }
    }

    public static void unsubscribeCepServiceCallback(ICepServiceListener iCepServiceListener) {
        Object[] objArr = {iCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88123139ca8ba1878e5ab1ece46d9e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88123139ca8ba1878e5ab1ece46d9e76");
        } else if (isInit) {
            AIDataDelegate.getInstance().unsubscribeCepServiceCallback(iCepServiceListener);
        }
    }

    public static void subscribeCepServiceCallback(CEPSubscriberConfig cEPSubscriberConfig, ICepArrayServiceListener iCepArrayServiceListener) {
        Object[] objArr = {cEPSubscriberConfig, iCepArrayServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9202fe44c8dba2971c6cfb81aa7637d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9202fe44c8dba2971c6cfb81aa7637d0");
        } else if (isInit) {
            AIDataDelegate.getInstance().subscribeCepServiceCallback(cEPSubscriberConfig, iCepArrayServiceListener);
        }
    }

    public static void unsubscribeCepServiceCallback(ICepArrayServiceListener iCepArrayServiceListener) {
        Object[] objArr = {iCepArrayServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "655e9d6d351684c7503793ace525ff85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "655e9d6d351684c7503793ace525ff85");
        } else if (isInit) {
            AIDataDelegate.getInstance().unsubscribeCepServiceCallback(iCepArrayServiceListener);
        }
    }

    public static void subscribeCepServiceCallback(CEPSubscriberConfig cEPSubscriberConfig, ICustomCepServiceListener iCustomCepServiceListener) {
        Object[] objArr = {cEPSubscriberConfig, iCustomCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e28036699e15f0f1a0aa96fb2ca41fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e28036699e15f0f1a0aa96fb2ca41fa");
        } else if (isInit) {
            AIDataDelegate.getInstance().subscribeCustomCepServiceCallback(cEPSubscriberConfig, iCustomCepServiceListener);
        }
    }

    public static void unsubscribeCepServiceCallback(ICustomCepServiceListener iCustomCepServiceListener) {
        Object[] objArr = {iCustomCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55fc7a69f531326bf70359a4c1822c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55fc7a69f531326bf70359a4c1822c90");
        } else if (isInit) {
            AIDataDelegate.getInstance().unsubscribeCepServiceCallback(iCustomCepServiceListener);
        }
    }

    public static void executeMLModel(String str, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {str, iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b183a8eb33e8b9921e16b269022e0bad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b183a8eb33e8b9921e16b269022e0bad");
        } else {
            executeMLModel(str, (JSFeatureOutParamsCallback) null, iPredictionJsonListener);
        }
    }

    public static void executeMLModel(String str, boolean z, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b14c7a5bbe548c52bcab756ba2607210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b14c7a5bbe548c52bcab756ba2607210");
        } else {
            executeMLModel(str, (JSFeatureOutParamsCallback) null, z, iPredictionJsonListener);
        }
    }

    public static void executeMLModel(String str, JSFeatureOutParamsCallback jSFeatureOutParamsCallback, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {str, jSFeatureOutParamsCallback, iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82e3510084f9b7b0883cbe283256bab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82e3510084f9b7b0883cbe283256bab8");
        } else {
            executeMLModel(str, jSFeatureOutParamsCallback, true, iPredictionJsonListener);
        }
    }

    public static void executeMLModel(String str, JSFeatureOutParamsCallback jSFeatureOutParamsCallback, boolean z, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {str, jSFeatureOutParamsCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bdb241128a4db1faed1efec4faf8e631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bdb241128a4db1faed1efec4faf8e631");
            return;
        }
        boolean isDisableModelService = AiSwitchConfig.getInstance().isDisableModelService();
        boolean isDisableFeatureService = AiSwitchConfig.getInstance().isDisableFeatureService();
        new StringBuilder("AIData executeMLModel isDisableModelService=").append(isDisableModelService);
        new StringBuilder("AIData executeMLModel isDisableFeatureService=").append(isDisableFeatureService);
        if (!isInit || isDisableModelService || isDisableFeatureService) {
            return;
        }
        AIDataDelegate.getInstance().executeMLModel(null, str, jSFeatureOutParamsCallback, z, iPredictionJsonListener);
    }

    public static void executeMLModel(@NonNull JSONObject jSONObject, String str, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {jSONObject, str, iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f00bb8178fd24c2010a3c77949aabe6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f00bb8178fd24c2010a3c77949aabe6c");
        } else {
            executeMLModel(jSONObject, str, (JSFeatureOutParamsCallback) null, iPredictionJsonListener);
        }
    }

    public static void executeMLModel(@NonNull JSONObject jSONObject, String str, boolean z, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {jSONObject, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "234547723795fa9741e337cf5247ee38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "234547723795fa9741e337cf5247ee38");
        } else {
            executeMLModel(jSONObject, str, null, z, iPredictionJsonListener);
        }
    }

    public static void executeMLModel(@NonNull JSONObject jSONObject, String str, JSFeatureOutParamsCallback jSFeatureOutParamsCallback, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {jSONObject, str, jSFeatureOutParamsCallback, iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3321be09c9c82072ab040528c26ab0d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3321be09c9c82072ab040528c26ab0d1");
        } else {
            executeMLModel(jSONObject, str, jSFeatureOutParamsCallback, true, iPredictionJsonListener);
        }
    }

    public static void executeMLModel(@NonNull JSONObject jSONObject, String str, JSFeatureOutParamsCallback jSFeatureOutParamsCallback, boolean z, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {jSONObject, str, jSFeatureOutParamsCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38e62adc92c5558fe8bfdf6734e7061c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38e62adc92c5558fe8bfdf6734e7061c");
            return;
        }
        boolean isDisableModelService = AiSwitchConfig.getInstance().isDisableModelService();
        boolean isDisableFeatureService = AiSwitchConfig.getInstance().isDisableFeatureService();
        new StringBuilder("AIData executeMLModel isDisableModelService=").append(isDisableModelService);
        new StringBuilder("AIData executeMLModel isDisableFeatureService=").append(isDisableFeatureService);
        if (!isInit || isDisableModelService || isDisableFeatureService) {
            return;
        }
        if (jSONObject != null) {
            AIDataDelegate.getInstance().executeMLModel(jSONObject, str, jSFeatureOutParamsCallback, z, iPredictionJsonListener);
        } else {
            iPredictionJsonListener.onFailed(new Exception("executeMLModel : output feature is null"));
        }
    }

    public static void registerInitCompleteListener(AIDataInitCompleteListener aIDataInitCompleteListener) {
        Object[] objArr = {aIDataInitCompleteListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bac8bff0b714f395681bd805ca522957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bac8bff0b714f395681bd805ca522957");
        } else if (aIDataInitCompleteListener != null) {
            if (isInitCompleted()) {
                aIDataInitCompleteListener.onComplete();
                return;
            }
            synchronized (AIData.class) {
                initCompleteListeners.add(aIDataInitCompleteListener);
            }
        }
    }

    private static void notifyInitComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "561ef67a9c58a3527f7cd45c3f4c79ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "561ef67a9c58a3527f7cd45c3f4c79ec");
            return;
        }
        synchronized (AIData.class) {
            if (initCompleteListeners.size() > 0) {
                for (AIDataInitCompleteListener aIDataInitCompleteListener : initCompleteListeners) {
                    aIDataInitCompleteListener.onComplete();
                }
                initCompleteListeners.clear();
            }
        }
    }

    @Nullable
    public static Object addAutoPredictObserver(String str, IPredictionJsonListener iPredictionJsonListener) {
        Object[] objArr = {str, iPredictionJsonListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "966691cbbcbb2d274470e3a6a8af6b17", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "966691cbbcbb2d274470e3a6a8af6b17") : AutoPredictManager.getInstance().addAutoPredictObserver(str, iPredictionJsonListener);
    }

    public static void removeAutoPredictObserver(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "746e379d2042f10bfea605c4915b8057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "746e379d2042f10bfea605c4915b8057");
        } else {
            AutoJSServiceManager.getInstance().unregisterJSExecuteObserver(str);
        }
    }

    public static void removeAutoPredictObserver(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1736cd44594e7ced447fce5a9198725a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1736cd44594e7ced447fce5a9198725a");
        } else if (obj instanceof AbsJSExecuteObserver) {
            AutoJSServiceManager.getInstance().unregisterJSExecuteObserver((AbsJSExecuteObserver) obj);
        }
    }

    @Nullable
    public static Object addAutoRunJSObserver(String str, AbsJSExecuteObserver absJSExecuteObserver) {
        Object[] objArr = {str, absJSExecuteObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c3a3d74e491f330d61c5637c7740e38", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c3a3d74e491f330d61c5637c7740e38") : AutoJSServiceManager.getInstance().registerJSExecuteObserver(str, absJSExecuteObserver);
    }

    public static void removeAutoRunJSObserver(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de6590540f0c27aab6441c56a8c2730c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de6590540f0c27aab6441c56a8c2730c");
        } else {
            AutoJSServiceManager.getInstance().unregisterJSExecuteObserver(str);
        }
    }

    public static void removeAutoRunJSObserver(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89e33ff01268becc5e5e77c28773209c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89e33ff01268becc5e5e77c28773209c");
        } else if (obj instanceof AbsJSExecuteObserver) {
            AutoJSServiceManager.getInstance().unregisterJSExecuteObserver((AbsJSExecuteObserver) obj);
        }
    }

    public static void setAutoRunJSInterceptor(String str, IAutoJSRunInterceptor iAutoJSRunInterceptor) {
        Object[] objArr = {str, iAutoJSRunInterceptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b854ffa5bbe3431ea2bd09f3a60c9539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b854ffa5bbe3431ea2bd09f3a60c9539");
        } else {
            AutoJSServiceManager.getInstance().setJSRunInterceptor(str, iAutoJSRunInterceptor);
        }
    }

    public static void removeAutoRunJSInterceptor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18f23e3ba952ca68fe97fd4c6596bc8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18f23e3ba952ca68fe97fd4c6596bc8d");
        } else {
            AutoJSServiceManager.getInstance().removeJSRunInterceptor(str);
        }
    }

    public static void executeJSBundle(String str, Object obj, AbsJSExecuteObserver absJSExecuteObserver) {
        Object[] objArr = {str, obj, absJSExecuteObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c2f6adcf47fa625ca1936774b69fe94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c2f6adcf47fa625ca1936774b69fe94");
        } else {
            AutoJSServiceManager.getInstance().executeJSBundle(str, obj, absJSExecuteObserver);
        }
    }

    public static Context getContext() {
        return mContext;
    }

    public static int getErrorType(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ed380e5dfd97cf94cc3470ab072baaa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ed380e5dfd97cf94cc3470ab072baaa")).intValue();
        }
        if (exc instanceof BlueException) {
            return ((BlueException) exc).getErrorType();
        }
        return -1;
    }

    public static void registerResourceConfigUpdateListener(String str, ResourceConfigUpdateListener resourceConfigUpdateListener) {
        Object[] objArr = {str, resourceConfigUpdateListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05802aad5ae0a06c35b3d3148c734618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05802aad5ae0a06c35b3d3148c734618");
        } else {
            ConfigManager.getInstance().registerResourceConfigUpdateListener(str, resourceConfigUpdateListener);
        }
    }

    public static void unregisterResourceConfigUpdateListener(ResourceConfigUpdateListener resourceConfigUpdateListener) {
        Object[] objArr = {resourceConfigUpdateListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18bf99fdd8b61fbf431a34311f5f113c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18bf99fdd8b61fbf431a34311f5f113c");
        } else {
            ConfigManager.getInstance().removeResourceConfigUpdateListener(resourceConfigUpdateListener);
        }
    }
}
