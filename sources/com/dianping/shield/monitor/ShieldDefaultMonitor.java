package com.dianping.shield.monitor;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/monitor/ShieldDefaultMonitor;", "Lcom/dianping/shield/monitor/ShieldMonitorInterface;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "()V", "TAG", "", "getContext", "()Landroid/content/Context;", "setContext", "sendByMetricsData", "", "data", "Lcom/dianping/shield/monitor/ShieldMetricsData;", "sendBySpeedData", "Lcom/dianping/shield/monitor/ShieldSpeedData;", "switchMonitorConfigure", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ShieldDefaultMonitor implements ShieldMonitorInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String TAG;
    @Nullable
    private Context context;

    @Override // com.dianping.shield.monitor.ShieldMonitorInterface
    public void switchMonitorConfigure() {
    }

    public ShieldDefaultMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27db3363b702f791934f4c4bac2d8480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27db3363b702f791934f4c4bac2d8480");
        } else {
            this.TAG = "ShieldDefaultMonitor";
        }
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    public final void setContext(@Nullable Context context) {
        this.context = context;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShieldDefaultMonitor(@NotNull Context context) {
        this();
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e210e54d467e1df8ed862da69fadc15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e210e54d467e1df8ed862da69fadc15");
        } else {
            this.context = context;
        }
    }

    @Override // com.dianping.shield.monitor.ShieldMonitorInterface
    public void sendByMetricsData(@NotNull ShieldMetricsData shieldMetricsData) {
        Object[] objArr = {shieldMetricsData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87de2bc303f0ea6433fe7ec49ef714c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87de2bc303f0ea6433fe7ec49ef714c1");
            return;
        }
        h.b(shieldMetricsData, "data");
        new StringBuilder("MetricsValue : ").append(shieldMetricsData.getMetricsValues());
        new StringBuilder("MetricsTags : ").append(shieldMetricsData.getMetricsTags());
        new StringBuilder("MetricsExtra : ").append(shieldMetricsData.getExtraInfo());
    }

    @Override // com.dianping.shield.monitor.ShieldMonitorInterface
    public void sendBySpeedData(@NotNull ShieldSpeedData shieldSpeedData) {
        Object[] objArr = {shieldSpeedData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2850edfee6c8218cb53df25a6ed4499b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2850edfee6c8218cb53df25a6ed4499b");
            return;
        }
        h.b(shieldSpeedData, "data");
        new StringBuilder("SpeedPage : ").append(shieldSpeedData.getPage());
        new StringBuilder("SpeedStartTime : ").append(shieldSpeedData.getStartTime());
        new StringBuilder("SpeedEvents : ").append(shieldSpeedData.getStepEvents());
    }
}
