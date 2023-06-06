package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.IPoiItem;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiBoughtItem extends PoiItem implements IPoiItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String foodsName;
    @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
    public int latitude;
    @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
    public int longitude;
    public ArrayList<OrderedFood> mGoodsList;
    @SerializedName("order_id")
    public long orderId;
    @SerializedName("order_time")
    public long orderTime;
    private String tag;
    @SerializedName("total")
    public double total;

    public String getFoodsName() {
        return this.foodsName;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
    public void setTag(String str) {
        this.tag = str;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
    public String getTag() {
        return this.tag;
    }
}
