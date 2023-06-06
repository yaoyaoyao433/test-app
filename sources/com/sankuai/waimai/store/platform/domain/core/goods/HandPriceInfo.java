package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class HandPriceInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("actual_price_coupons")
    public String actualPriceCoupons;
    @SerializedName("discount_detail_list")
    public List<DiscountDetail> discountDetailList;
    @SerializedName("hand_activity_price")
    public double handActivityPrice;
    @SerializedName("hand_activity_price_suffix_text")
    public String handActivityPriceSuffixText;
    @SerializedName("hand_activity_price_text")
    private String handActivityPriceText;
    @SerializedName("hand_price_label")
    public String handPriceLabel;
    @SerializedName("hand_price_unit")
    private String handPriceUnit;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("includeVIPDiscount")
    public boolean includeVIPDiscount;
    @SerializedName("member_hand_price")
    private int memberHandPrice;
    @SerializedName("member_price")
    private double memberPrice;
    @SerializedName("skuCount")
    public int skuCount;
    @SerializedName("style")
    private int style;
    @SerializedName("total_hand_activity_price")
    public double totalHandActivityPrice;
    @SerializedName("total_hand_activity_price_text")
    public String totalHandActivityPriceText;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DiscountDetail implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("price_str")
        public String priceStr;
        @SerializedName("title")
        public String title;
        @SerializedName("type")
        public int type;
    }

    public HandPriceInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad47be042dda6d1727ba9e2acaabac3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad47be042dda6d1727ba9e2acaabac3f");
        } else {
            this.memberPrice = -1.0d;
        }
    }

    public List<DiscountDetail> getDiscountDetailList() {
        return this.discountDetailList;
    }

    public String getHandPriceLabel() {
        return this.handPriceLabel;
    }

    public double getHandActivityPrice() {
        return this.handActivityPrice;
    }

    public double getHandMemberPrice() {
        return this.memberPrice;
    }

    public double getTotalHandActivityPrice() {
        return this.totalHandActivityPrice;
    }

    public String getHandPriceUnit() {
        return this.handPriceUnit;
    }

    public void setHandPriceLabel(String str) {
        this.handPriceLabel = str;
    }

    public void setHandPriceUnit(String str) {
        this.handPriceUnit = str;
    }

    public void setHandActivityPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e72e0a4d407923779780d6b8a38b2624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e72e0a4d407923779780d6b8a38b2624");
        } else {
            this.handActivityPrice = d;
        }
    }

    public int getStyle() {
        return this.style;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public boolean isShowNewStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15f273f21d23cbbe87fa0a6ea54e75b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15f273f21d23cbbe87fa0a6ea54e75b0")).booleanValue() : this.style == 1 && TextUtils.isEmpty(this.handPriceUnit);
    }

    public boolean isShowNewMultiUnitStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "010daf58dbfa008278ca826617c35bfb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "010daf58dbfa008278ca826617c35bfb")).booleanValue() : this.style == 1 && !TextUtils.isEmpty(getHandPriceUnit());
    }

    public String getHandActivityPriceText() {
        return this.handActivityPriceText;
    }

    public void setHandActivityPriceText(String str) {
        this.handActivityPriceText = str;
    }

    public String getHandActivityPriceSuffixText() {
        return this.handActivityPriceSuffixText;
    }

    public void setHandActivityPriceSuffixText(String str) {
        this.handActivityPriceSuffixText = str;
    }
}
