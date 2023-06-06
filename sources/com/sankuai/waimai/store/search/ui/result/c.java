package com.sankuai.waimai.store.search.ui.result;

import android.app.Activity;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.OasisModule;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(int i, g gVar);

        void a(GlobalPageResponse globalPageResponse, MetricsSpeedMeterTask metricsSpeedMeterTask, boolean z);

        void a(com.sankuai.waimai.store.search.ui.actionbar.b bVar);

        void a(String str, int i, int i2, boolean z, boolean z2, String str2, String str3, int i3, long j, int i4, boolean z3, String str4, MetricsSpeedMeterTask metricsSpeedMeterTask, int i5, long j2);

        void b();

        void c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(com.sankuai.waimai.store.repository.net.b bVar, boolean z, MetricsSpeedMeterTask metricsSpeedMeterTask);

        void a(GlobalPageResponse globalPageResponse, boolean z, boolean z2, MetricsSpeedMeterTask metricsSpeedMeterTask);

        void a(List<OasisModule> list, int i);

        void b(boolean z);

        String bH_();

        void c();

        Activity r();
    }
}
