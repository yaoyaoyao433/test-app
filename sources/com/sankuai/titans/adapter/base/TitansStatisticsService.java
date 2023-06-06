package com.sankuai.titans.adapter.base;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.babel.BabelConfig;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.statisticInfo.AccessTimingInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeErrorInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeTimingInfo;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleInfo;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleType;
import com.sankuai.titans.protocol.services.statisticInfo.PluginErrorInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansStatisticsService implements IStatisticsService {
    private static final String BRIDGE_ERROR_TAG = "titans-bridge-error";
    private static final String BRIDGE_TIMING_TAG = "titans-bridge-timing";
    private static final String CLASS_ERROR_TAG = "titans-class-error";
    private static final String PLUGIN_ERROR_TAG = "titans-plugin-error";
    private static final String REPORT_BRIDGE_TAG = "titans-bridge";
    private static final String REPORT_CHANNEL = "prism-report-knb";
    private static final String REPORT_INFO_TAG = "titans-info";
    private static final String REPORT_PLUGIN_TAG = "titans-plugin";
    private static final String REPORT_RESPONSE_ERROR_TAG = "titans-response-error";
    private static final String REPORT_TIMING_TAG = "titans-timing";
    private static final String REPORT_VISIT_TAG = "titans-visit";
    public static ChangeQuickRedirect changeQuickRedirect;

    public TitansStatisticsService(Context context, final IServiceManagerConfig iServiceManagerConfig) {
        Object[] objArr = {context, iServiceManagerConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74e6ae50a8a199998f1442c52d0465e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74e6ae50a8a199998f1442c52d0465e7");
        } else {
            Babel.init(context, new BabelConfig() { // from class: com.sankuai.titans.adapter.base.TitansStatisticsService.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.babel.BabelConfig
                public String getAppVersion() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d327000f4afd1dd6c457c5d883ea0e24", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d327000f4afd1dd6c457c5d883ea0e24") : iServiceManagerConfig.appVersion();
                }

                @Override // com.meituan.android.common.babel.BabelConfig
                public String getToken() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33ac4c30f3ee2ebb42343f10d517f00d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33ac4c30f3ee2ebb42343f10d517f00d") : iServiceManagerConfig.appToken();
                }

                @Override // com.meituan.android.common.babel.BabelConfig
                public String getApkHash() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c89243bf5d93e6f4ecb9e77bc8003f52", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c89243bf5d93e6f4ecb9e77bc8003f52") : iServiceManagerConfig.apkHash();
                }

                @Override // com.meituan.android.common.babel.BabelConfig
                public String getChannel() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0948542ad1380391b7f71cea1650689a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0948542ad1380391b7f71cea1650689a") : iServiceManagerConfig.apkChannel();
                }

                @Override // com.meituan.android.common.babel.BabelConfig
                public String getUuid() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "174adb25aa515a65dd77e15956afdfd5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "174adb25aa515a65dd77e15956afdfd5") : iServiceManagerConfig.UUID();
                }

                @Override // com.meituan.android.common.babel.BabelConfig
                public String getBuildVersion() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5a9fceae826b1f720d4a792fb97073bf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5a9fceae826b1f720d4a792fb97073bf") : iServiceManagerConfig.appBuildVersion();
                }
            });
        }
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportLifeCycleInfo(LifeCycleInfo lifeCycleInfo) {
        Object[] objArr = {lifeCycleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c84e666cfbe7fe15d0b1713a41a1491e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c84e666cfbe7fe15d0b1713a41a1491e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", lifeCycleInfo.getPluginName());
        hashMap.put("version", lifeCycleInfo.getPluginVersion());
        hashMap.put("type", lifeCycleInfo.getType().getName());
        hashMap.put("lifecycle", lifeCycleInfo.getEventNodeName());
        hashMap.put("start", Long.valueOf(lifeCycleInfo.getStartTime()));
        hashMap.put("titansVersion", lifeCycleInfo.getTitansVersion());
        if (!lifeCycleInfo.getType().equals(LifeCycleType.Titans)) {
            hashMap.put(NetLogConstants.Details.SCHEME, lifeCycleInfo.getScheme());
        }
        if (lifeCycleInfo.getType().equals(LifeCycleType.WebPage)) {
            hashMap.put("sourceURL", lifeCycleInfo.getSourceUrl());
            hashMap.put("targetURL", lifeCycleInfo.getTargetUrl());
        }
        reportToBabelRT(REPORT_PLUGIN_TAG, hashMap, Long.valueOf(lifeCycleInfo.timeCost()));
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportBridgeInfo(BridgeInfo bridgeInfo) {
        Object[] objArr = {bridgeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e909e7e338bcd2ed2d6b77df2eadbb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e909e7e338bcd2ed2d6b77df2eadbb1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("method", bridgeInfo.getMethod());
        hashMap.put("source", bridgeInfo.getSource());
        hashMap.put("page", bridgeInfo.getPageOriginalUrl());
        hashMap.put("pageTargetUrl", bridgeInfo.getPageUrl());
        reportToBabelRT(REPORT_BRIDGE_TAG, hashMap, 1L);
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportBridgeTimingInfo(BridgeTimingInfo bridgeTimingInfo) {
        Object[] objArr = {bridgeTimingInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c7b2f51854cedd51fcd5b9a5f562816", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c7b2f51854cedd51fcd5b9a5f562816");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("method", bridgeTimingInfo.getMethod());
        hashMap.put("source", bridgeTimingInfo.getSource());
        hashMap.put("page", bridgeTimingInfo.getPageOriginalUrl());
        hashMap.put("pageTargetUrl", bridgeTimingInfo.getPageUrl());
        reportToBabelRT(BRIDGE_TIMING_TAG, hashMap, Long.valueOf(bridgeTimingInfo.totalTimeCost()), bridgeTimingInfo.getBridgeTimingDetailsJsonStr());
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportBridgeErrorInfo(BridgeErrorInfo bridgeErrorInfo) {
        Object[] objArr = {bridgeErrorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd5502d6211cf05d25778ce90d63c613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd5502d6211cf05d25778ce90d63c613");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("method", bridgeErrorInfo.getMethod());
        hashMap.put("args", bridgeErrorInfo.getArgs());
        hashMap.put("source", bridgeErrorInfo.getSource());
        hashMap.put("page", bridgeErrorInfo.getPageOriginalUrl());
        hashMap.put("pageTargetUrl", bridgeErrorInfo.getPageUrl());
        if (!TextUtils.isEmpty(bridgeErrorInfo.getErrorCode())) {
            hashMap.put("errorCode", bridgeErrorInfo.getErrorCode());
        }
        if (!TextUtils.isEmpty(bridgeErrorInfo.getErrorMessage())) {
            hashMap.put("errorMessage", bridgeErrorInfo.getErrorMessage());
        }
        hashMap.put(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
        reportToBabelRT(BRIDGE_ERROR_TAG, hashMap, 1L);
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportTimingInfo(AccessTimingInfo accessTimingInfo) {
        Object[] objArr = {accessTimingInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3402ce54572a46fddce9530a93a484df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3402ce54572a46fddce9530a93a484df");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", accessTimingInfo.getType());
        hashMap.put("isTitansInited", Integer.valueOf(accessTimingInfo.getIsTitansInited()));
        hashMap.put("titansVersion", accessTimingInfo.getTitansVersion());
        if (!TextUtils.isEmpty(accessTimingInfo.getPageUrl())) {
            hashMap.put("page", accessTimingInfo.getPageUrl());
        }
        if (!TextUtils.isEmpty(accessTimingInfo.getPageReferer())) {
            hashMap.put(com.meituan.metrics.common.Constants.TRAFFIC_REFERER, accessTimingInfo.getPageReferer());
        }
        if (!TextUtils.isEmpty(accessTimingInfo.getPageRefererSource())) {
            hashMap.put(FoodDetailNetWorkPreLoader.INTENT_REFERER_SOURCE, accessTimingInfo.getPageRefererSource());
        }
        if (accessTimingInfo.isNeedReportConnectTime()) {
            hashMap.put("netLoad", Long.valueOf(accessTimingInfo.getNetConnectTime()));
        }
        hashMap.put("typeStartTimestamp", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("isNewFrame", 1);
        Map<String, Object> extraParams = accessTimingInfo.getExtraParams();
        if (extraParams != null) {
            hashMap.putAll(extraParams);
        }
        reportToBabelRT(REPORT_TIMING_TAG, hashMap, Long.valueOf(accessTimingInfo.getTimeCost()));
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportVisitInfo(String str, AccessTimingInfo accessTimingInfo) {
        Object[] objArr = {str, accessTimingInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67fc325f142f6d851f430a8ff408a6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67fc325f142f6d851f430a8ff408a6eb");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("lifecycle", str);
        hashMap.put("isTitansInited", Integer.valueOf(accessTimingInfo.getIsTitansInited()));
        hashMap.put("titansVersion", accessTimingInfo.getTitansVersion());
        hashMap.put(NetLogConstants.Details.SCHEME, accessTimingInfo.getScheme());
        if (!TextUtils.isEmpty(accessTimingInfo.getPageUrl())) {
            hashMap.put("page", accessTimingInfo.getPageUrl());
        }
        if (!TextUtils.isEmpty(accessTimingInfo.getPageReferer())) {
            hashMap.put(com.meituan.metrics.common.Constants.TRAFFIC_REFERER, accessTimingInfo.getPageReferer());
        }
        reportToBabelRT(REPORT_VISIT_TAG, hashMap, 1L);
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportErrorInfo(PluginErrorInfo pluginErrorInfo) {
        Object[] objArr = {pluginErrorInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e96565518c15d115cc1fbfd9ab8d048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e96565518c15d115cc1fbfd9ab8d048");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", pluginErrorInfo.getType() != null ? pluginErrorInfo.getType().getName() : "$null");
        hashMap.put("name", pluginErrorInfo.getPluginName() != null ? pluginErrorInfo.getPluginName() : "$null");
        hashMap.put("version", pluginErrorInfo.getPluginVersion() != null ? pluginErrorInfo.getPluginVersion() : "$null");
        hashMap.put("lifecycle", pluginErrorInfo.getLifecycle() != null ? pluginErrorInfo.getLifecycle() : "$null");
        hashMap.put("error", pluginErrorInfo.getError());
        hashMap.put("sourceURL", pluginErrorInfo.getErrorUrl() != null ? pluginErrorInfo.getErrorUrl() : "$null");
        hashMap.put("start", Long.valueOf(System.currentTimeMillis()));
        reportToBabelRT(PLUGIN_ERROR_TAG, hashMap, 1L);
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportResponseError(int i, String str, String str2, String str3, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4aff2106ed8f7613d064b978d9048aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4aff2106ed8f7613d064b978d9048aa");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorStatus", Integer.valueOf(i));
        hashMap.put("errorURL", !TextUtils.isEmpty(str) ? str : "");
        hashMap.put("sourceURL", !TextUtils.isEmpty(str2) ? str2 : "");
        hashMap.put("referURL", !TextUtils.isEmpty(str3) ? str3 : "");
        hashMap.put("isMainFrame", Integer.valueOf(z ? 1 : 0));
        reportToBabelRT(REPORT_RESPONSE_ERROR_TAG, hashMap, 1L);
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportGeneralInfo(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdc749ff197fcad505b040163e8f25a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdc749ff197fcad505b040163e8f25a1");
        } else {
            reportToBabelRT(REPORT_INFO_TAG, map, 1L);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportClassError(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a53d4e01afe251a38997a4feba8eaba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a53d4e01afe251a38997a4feba8eaba3");
        } else {
            reportClassError(str, str2, th, null);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IStatisticsService
    public void reportClassError(String str, String str2, Throwable th, Map<String, Object> map) {
        Object[] objArr = {str, str2, th, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b2c97201a9ba619bdba00b81091510c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b2c97201a9ba619bdba00b81091510c");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("className", str);
        map.put("methodName", str2);
        map.put("error", Log.getStackTraceString(th));
        map.put(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
        reportToBabelRT(CLASS_ERROR_TAG, map, 1L);
    }

    private void reportToBabelRT(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3220cc45844d527773fe44bc5b764aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3220cc45844d527773fe44bc5b764aa4");
        } else {
            reportToBabelRT(str, map, l, "");
        }
    }

    private void reportToBabelRT(String str, Map<String, Object> map, Long l, String str2) {
        Object[] objArr = {str, map, l, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d2a905feb52170951b06dbf7542141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d2a905feb52170951b06dbf7542141");
        } else {
            Babel.logRT(createBabelBuilder(str, map, l, str2).build());
        }
    }

    private Log.Builder createBabelBuilder(String str, Map<String, Object> map, Long l, String str2) {
        Object[] objArr = {str, map, l, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c7cd806e301350befa489f7c886d7c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Log.Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c7cd806e301350befa489f7c886d7c0");
        }
        Log.Builder optional = new Log.Builder("").reportChannel(REPORT_CHANNEL).tag(str).lv4LocalStatus(true).optional(map);
        if (!TextUtils.isEmpty(str2)) {
            optional.details(str2);
        }
        optional.value(l.longValue());
        return optional;
    }
}
