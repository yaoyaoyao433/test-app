package com.sankuai.waimai.business.restaurant.base.domain.moneyoff;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("spu_id")
    public long b;
    @SerializedName("sku_id")
    public long c;
    @SerializedName("name")
    public String d;
    @SerializedName("count")
    public int e;
    @SerializedName("origin_price")
    public double f;
    @SerializedName(PayLabel.ITEM_TYPE_DISCOUNT)
    public boolean g;
    @SerializedName("attrs")
    public GoodsAttr[] h;
}
