package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.statistics.StatisticsEntity;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiEntity extends com.sankuai.waimai.business.search.model.g implements com.sankuai.waimai.business.search.statistics.d {
    public static final int TEMPLATE_DETAIL_CATEGORY = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final StatisticsEntity entity;
    public int type;

    public PoiEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c235ef035df58dff7beaf1089edae54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c235ef035df58dff7beaf1089edae54");
            return;
        }
        this.type = f.a;
        this.entity = new StatisticsEntity();
    }

    public int getStatisticsIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f732abf2960714a57d898f14b2b14c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f732abf2960714a57d898f14b2b14c")).intValue() : this.entity.getStatisticsIndex();
    }

    public int getInCardIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05cfa871ad9192b8d7bd10853ba828c4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05cfa871ad9192b8d7bd10853ba828c4")).intValue() : this.entity.getInCardIndex();
    }

    @Override // com.sankuai.waimai.business.search.statistics.d
    public void setStatisticsIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45aeb101e73348880927d5dc497aeb8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45aeb101e73348880927d5dc497aeb8a");
        } else {
            this.entity.setStatisticsIndex(i);
        }
    }

    public void setInCardIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c91cbb9801c99e91e023f84dc7ca761e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c91cbb9801c99e91e023f84dc7ca761e");
        } else {
            this.entity.setInCardIndex(i);
        }
    }

    public void setRegion(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f239cc8ba0d415983606ec04591e3ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f239cc8ba0d415983606ec04591e3ec0");
        } else {
            this.entity.setRegion(i);
        }
    }

    public int getRegion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78d1dbf78961f3bdf846f2fee21d3e89", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78d1dbf78961f3bdf846f2fee21d3e89")).intValue() : this.entity.getRegion();
    }

    public void setTraceInfo(Map<Integer, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a481d7f3eb1bc875d04246658aaad31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a481d7f3eb1bc875d04246658aaad31f");
        } else {
            this.entity.setTraceInfo(map);
        }
    }

    public Map<Integer, String> getTraceInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5a03e6087578f0698131672b728fb2b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5a03e6087578f0698131672b728fb2b") : this.entity.getTraceInfo();
    }
}
