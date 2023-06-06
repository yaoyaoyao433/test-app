package com.sankuai.waimai.store.manager.judas;

import com.meituan.android.common.statistics.entity.EventInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface JudasMonitorService {
    public static final String KEY = "drug_judas_monitor_service";

    void onCommit(EventInfo eventInfo);
}
