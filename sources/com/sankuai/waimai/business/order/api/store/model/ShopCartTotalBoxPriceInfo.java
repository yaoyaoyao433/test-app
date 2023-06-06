package com.sankuai.waimai.business.order.api.store.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.b;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ShopCartTotalBoxPriceInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_packing_bag_price")
    public String activityPackingBagPrice;
    @SerializedName("activity_total_order_box_price")
    public String activityTotalOrderBoxPrice;
    @SerializedName("activity_total_order_box_price_desc")
    public String activityTotalOrderBoxPriceDesc;
    @SerializedName("box_price_items")
    public List<a> boxPriceItems;
    @SerializedName("explain_icon")
    public String explainIcon;
    @SerializedName("explain_text")
    public String explainText;
    @SerializedName("explain_text_pre")
    public String explainTextPre;
    @SerializedName("explain_text_pre_color")
    public String explainTextPreColor;
    @SerializedName("packing_bag_price_subtitle")
    public String packingBagPriceSubtitle;
    @SerializedName("packing_bag_price_subtitle_suffix")
    public String packingBagPriceSubtitleSuffix;
    @SerializedName("total_box_price")
    public String totalBoxPrice;
    @SerializedName("total_box_price_desc")
    public String totalBoxPriceDesc;
    @SerializedName("total_box_price_subtitle")
    public String totalBoxPriceSubtitle;
    @SerializedName("total_box_price_title")
    public String totalBoxPriceTitle;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements Serializable {
        @SerializedName("name")
        public String a;
        @SerializedName("box_price")
        public String b;
        @SerializedName("box_price_desc")
        public String c;
        @SerializedName("item_count")
        public int d;
    }

    public boolean isPackingFeeValued() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6c22479e5fd968ca6c2205ba8b569d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6c22479e5fd968ca6c2205ba8b569d6")).booleanValue() : b.a(this.boxPriceItems) || !aa.a(this.activityPackingBagPrice);
    }
}
