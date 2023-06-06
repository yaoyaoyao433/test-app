package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CouponPoiCardInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2140617231820324382L;
    @SerializedName("card_area")
    public List<CardArea> cardAreaList;
    @SerializedName("common_coupon_area")
    public List<CommonCouponAreaList> commonCouponAreaList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CardArea implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 3605180761909472454L;
        @SerializedName("card_list")
        public List<CardList> cardLists;
        @SerializedName("category_name")
        public String categoryName;
        @SerializedName("scheme_url")
        public String schemeUrl;
        @SerializedName("show_more_text")
        public String showMoreText;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CardList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 8375140155143775478L;
        @SerializedName("card_biz_id")
        public String cardBizId;
        @SerializedName("card_status")
        public String cardStatus;
        @SerializedName("card_sub_title")
        public String cardSubTitle;
        @SerializedName("card_title")
        public String cardTitle;
        @SerializedName("card_type")
        public String cardType;
        @SerializedName("product_num")
        public String productNum;
        @SerializedName("product_url")
        public String productUrl;
        @SerializedName("scheme_url")
        public String schemeUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CommonCouponAreaList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 957546295557754053L;
        @SerializedName(DataConstants.CATEGORY_ID)
        public String categoryId;
        @SerializedName("category_name")
        public String categoryName;
        @SerializedName("coupon_list")
        public List<Poi.PoiCouponItem> poiCouponItems;
        @SerializedName("show_more_text")
        public String showMoreText;
        @SerializedName("show_num")
        public int showNum;
        @SerializedName("tab_type")
        public int tabType;
    }

    public static CouponPoiCardInfo fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a082cd085605d8db92585a47a79c8913", RobustBitConfig.DEFAULT_VALUE)) {
            return (CouponPoiCardInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a082cd085605d8db92585a47a79c8913");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (CouponPoiCardInfo) i.a(str, CouponPoiCardInfo.class);
    }
}
