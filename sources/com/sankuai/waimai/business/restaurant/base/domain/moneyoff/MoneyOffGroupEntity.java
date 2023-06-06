package com.sankuai.waimai.business.restaurant.base.domain.moneyoff;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.robust.ChangeQuickRedirect;
import com.tencent.connect.common.Constants;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MoneyOffGroupEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(PayLabel.ITEM_TYPE_DISCOUNT)
    public String discount;
    @SerializedName("sku_list")
    public List<MoneyOffSpu> mSpus;
    @SerializedName("sell_status")
    public MoneyOffSellStatus mStatusInfo;
    @SerializedName("origin_total_price")
    public double originTotalPrice;
    @SerializedName("pack_price")
    public double packPrice;
    @SerializedName(Constants.PACKAGE_ID)
    public String packageId;
    @SerializedName("package_trace_id")
    public String packageTraceId;
    @SerializedName("price_desc")
    public String priceDesc;
    @SerializedName("recommend_icon")
    public String recommendIcon;
    @SerializedName("recommend_reason")
    public String recommendReason;
    @SerializedName("total_price")
    public double totalPrice;
}
