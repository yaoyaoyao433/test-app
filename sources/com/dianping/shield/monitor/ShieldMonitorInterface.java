package com.dianping.shield.monitor;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/monitor/ShieldMonitorInterface;", "", "sendByMetricsData", "", "data", "Lcom/dianping/shield/monitor/ShieldMetricsData;", "sendBySpeedData", "Lcom/dianping/shield/monitor/ShieldSpeedData;", "switchMonitorConfigure", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ShieldMonitorInterface {
    void sendByMetricsData(@NotNull ShieldMetricsData shieldMetricsData);

    void sendBySpeedData(@NotNull ShieldSpeedData shieldSpeedData);

    void switchMonitorConfigure();
}
