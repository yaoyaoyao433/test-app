package com.sankuai.waimai.business.search.statistics;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class StatisticsEntity implements d, Serializable {
    public static final int DELIVERY = 1;
    public static final int NO_DELIVERY = 3;
    public static final int PAO_TUI = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int incard_index;
    private int region;
    private int statisticsIndex;
    private Map<Integer, String> traceInfo;

    public StatisticsEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69d03dfd4ac2c825d394a79d59a23d12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69d03dfd4ac2c825d394a79d59a23d12");
        } else {
            this.region = 1;
        }
    }

    public int getStatisticsIndex() {
        return this.statisticsIndex;
    }

    public int getInCardIndex() {
        return this.incard_index;
    }

    @Override // com.sankuai.waimai.business.search.statistics.d
    public void setStatisticsIndex(int i) {
        this.statisticsIndex = i;
    }

    public void setInCardIndex(int i) {
        this.incard_index = i;
    }

    public int getRegion() {
        return this.region;
    }

    public void setRegion(int i) {
        this.region = i;
    }

    public Map<Integer, String> getTraceInfo() {
        return this.traceInfo;
    }

    public void setTraceInfo(Map<Integer, String> map) {
        this.traceInfo = map;
    }
}
