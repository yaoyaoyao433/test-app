package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutputAttr;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AdditionalBargain implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bargain_list")
    public List<AdditionalBargainDetail> bargainList;
    @SerializedName("description")
    public String description;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class AdditionalBargainDetail implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_extra")
        public String activityExtra;
        @SerializedName("activity_tag")
        public String activityTag;
        @SerializedName("attrs")
        public List<OrderFoodOutputAttr> attrs;
        @SerializedName("count")
        public int count;
        @SerializedName("label")
        public String label;
        @SerializedName("name")
        public String name;
        @SerializedName("original_price")
        public double originalPrice;
        @SerializedName("picture")
        public String picture;
        @SerializedName("price")
        public double price;
        @SerializedName(DMKeys.KEY_SELECTED)
        public boolean selected;
        @SerializedName("sku_id")
        public long skuId;
    }
}
