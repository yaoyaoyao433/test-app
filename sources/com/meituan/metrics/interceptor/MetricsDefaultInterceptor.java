package com.meituan.metrics.interceptor;

import com.meituan.metrics.laggy.LaggyEvent;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.metrics.sampler.cpu.CpuEvent;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.metrics.sampler.memory.MemoryEvent;
import com.meituan.metrics.speedmeter.SpeedMeterEvent;
import com.meituan.metrics.traffic.TrafficEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsDefaultInterceptor implements MetricsInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void onNewCpuEvent(CpuEvent cpuEvent) {
    }

    public void onNewFpsEvent(FpsEvent fpsEvent) {
    }

    public void onNewLaggyEvent(LaggyEvent laggyEvent) {
    }

    public void onNewMemoryEvent(MemoryEvent memoryEvent) {
    }

    public void onNewSpeedMeterEvent(SpeedMeterEvent speedMeterEvent) {
    }

    public void onNewTrafficEvent(TrafficEvent trafficEvent) {
    }

    public void onReportCpuEvent(CpuEvent cpuEvent) {
    }

    public void onReportFpsEvent(FpsEvent fpsEvent) {
    }

    public void onReportLaggyEvent(LaggyEvent laggyEvent) {
    }

    public void onReportMemoryEvent(MemoryEvent memoryEvent) {
    }

    public void onReportSpeedMeterEvent(SpeedMeterEvent speedMeterEvent) {
    }

    public void onReportTrafficEvent(TrafficEvent trafficEvent) {
    }

    @Override // com.meituan.metrics.interceptor.MetricsInterceptor
    public void onNewEvent(AbstractEvent abstractEvent) {
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "712d9fb2604f3f0d32611a4709707889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "712d9fb2604f3f0d32611a4709707889");
        } else if (abstractEvent instanceof CpuEvent) {
            onNewCpuEvent((CpuEvent) abstractEvent);
        } else if (abstractEvent instanceof MemoryEvent) {
            onNewMemoryEvent((MemoryEvent) abstractEvent);
        } else if (abstractEvent instanceof FpsEvent) {
            onNewFpsEvent((FpsEvent) abstractEvent);
        } else if (abstractEvent instanceof SpeedMeterEvent) {
            onNewSpeedMeterEvent((SpeedMeterEvent) abstractEvent);
        } else if (abstractEvent instanceof TrafficEvent) {
            onNewTrafficEvent((TrafficEvent) abstractEvent);
        } else if (abstractEvent instanceof LaggyEvent) {
            onNewLaggyEvent((LaggyEvent) abstractEvent);
        }
    }

    @Override // com.meituan.metrics.interceptor.MetricsInterceptor
    public void onReportEvent(AbstractEvent abstractEvent) {
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a92af689097a0f23231f8b04d0f9702c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a92af689097a0f23231f8b04d0f9702c");
        } else if (abstractEvent instanceof CpuEvent) {
            onReportCpuEvent((CpuEvent) abstractEvent);
        } else if (abstractEvent instanceof MemoryEvent) {
            onReportMemoryEvent((MemoryEvent) abstractEvent);
        } else if (abstractEvent instanceof FpsEvent) {
            onReportFpsEvent((FpsEvent) abstractEvent);
        } else if (abstractEvent instanceof SpeedMeterEvent) {
            onReportSpeedMeterEvent((SpeedMeterEvent) abstractEvent);
        } else if (abstractEvent instanceof TrafficEvent) {
            onReportTrafficEvent((TrafficEvent) abstractEvent);
        } else if (abstractEvent instanceof LaggyEvent) {
            onReportLaggyEvent((LaggyEvent) abstractEvent);
        }
    }
}
