package com.sankuai.titans.protocol.services;

import com.sankuai.titans.protocol.services.statisticInfo.AccessTimingInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeErrorInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeInfo;
import com.sankuai.titans.protocol.services.statisticInfo.BridgeTimingInfo;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleInfo;
import com.sankuai.titans.protocol.services.statisticInfo.PluginErrorInfo;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IStatisticsService {
    void reportBridgeErrorInfo(BridgeErrorInfo bridgeErrorInfo);

    void reportBridgeInfo(BridgeInfo bridgeInfo);

    void reportBridgeTimingInfo(BridgeTimingInfo bridgeTimingInfo);

    void reportClassError(String str, String str2, Throwable th);

    void reportClassError(String str, String str2, Throwable th, Map<String, Object> map);

    void reportErrorInfo(PluginErrorInfo pluginErrorInfo);

    void reportGeneralInfo(Map<String, Object> map);

    void reportLifeCycleInfo(LifeCycleInfo lifeCycleInfo);

    void reportResponseError(int i, String str, String str2, String str3, boolean z);

    void reportTimingInfo(AccessTimingInfo accessTimingInfo);

    void reportVisitInfo(String str, AccessTimingInfo accessTimingInfo);
}
