package com.sankuai.waimai.store.search.statistics;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class StatisticsEntity implements i, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int statisticsIndex;

    @Override // com.sankuai.waimai.store.search.statistics.i
    public int getStatisticsIndex() {
        return this.statisticsIndex;
    }

    @Override // com.sankuai.waimai.store.search.statistics.i
    public void setStatisticsIndex(int i) {
        this.statisticsIndex = i;
    }
}
