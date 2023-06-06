package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.drugdynamictags.DynamicTagPoiDelivery;
import com.sankuai.waimai.store.search.statistics.StatisticsEntity;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiEntity extends Poi implements com.sankuai.waimai.store.search.statistics.i {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("deliver_type_info")
    @Expose
    public DeliverTypeInfoVo deliverTypeInfo;
    private final StatisticsEntity entity;
    @SerializedName("kano_tag")
    @Expose
    public DynamicTagPoiDelivery mDynammicTagPoiDevilivy;
    public com.sankuai.waimai.store.search.statistics.f nodePoiCate;
    public com.sankuai.waimai.store.search.statistics.f nodeSubscribe;
    public int subIndex;
    public int templateDetail;
    public int type;

    public PoiEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d134fda66ba55efe5c221b40a559e66a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d134fda66ba55efe5c221b40a559e66a");
            return;
        }
        this.type = 0;
        this.entity = new StatisticsEntity();
        this.subIndex = -999;
        this.nodePoiCate = new com.sankuai.waimai.store.search.statistics.f();
        this.nodeSubscribe = new com.sankuai.waimai.store.search.statistics.f();
    }

    @Override // com.sankuai.waimai.store.search.statistics.i
    public int getStatisticsIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e4c19e824a82453d8dc5f1d8b39d4da", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e4c19e824a82453d8dc5f1d8b39d4da")).intValue() : this.entity.getStatisticsIndex();
    }

    @Override // com.sankuai.waimai.store.search.statistics.i
    public void setStatisticsIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "294ea25a60dc43ca93bbdc67617aaa89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "294ea25a60dc43ca93bbdc67617aaa89");
        } else {
            this.entity.setStatisticsIndex(i);
        }
    }

    public int getInCardIndex() {
        return this.subIndex;
    }

    public void setInCardIndex(int i) {
        this.subIndex = i;
    }
}
