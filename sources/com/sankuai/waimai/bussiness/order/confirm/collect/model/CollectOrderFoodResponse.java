package com.sankuai.waimai.bussiness.order.confirm.collect.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CollectOrderFoodResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_title")
    public String activityTitle;
    @SerializedName("food_spus")
    public List<GoodsSpu> mGoodsSpus;
    @SerializedName("max_stock_tip")
    public String mMaxStockTip;
    @SerializedName("min_count_tip")
    public String mMinCountTtip;
    @SerializedName("text_for_activity_min_threshold")
    public String minThresholdText;
}
