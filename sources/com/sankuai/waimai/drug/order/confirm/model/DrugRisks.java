package com.sankuai.waimai.drug.order.confirm.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DrugRisks implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1878933248418938507L;
    @SerializedName("show")
    public boolean isAutoUnFold;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("risk_key")
    public String riskKey;
    @SerializedName("risks")
    public List<DrugRisk> riskList;
    public long updateTime;
}
