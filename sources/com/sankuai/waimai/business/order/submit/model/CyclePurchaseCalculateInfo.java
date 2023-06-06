package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CyclePurchaseCalculateInfo implements Serializable {
    public static final int CYCLE_PURCHASE_ORDER = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7502830341093880158L;
    @SerializedName("cycle_purchase_info")
    public CyclePurchaseInfo mCyclePurchaseInfo;
    @SerializedName("extra")
    public String mExtra;
    @SerializedName("food_list")
    public List<FoodList> mFoodLists;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class FoodList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -5733955854914291381L;
        @SerializedName("attrs")
        public List<GoodsAttrList> attrs;
        @SerializedName("activity_tag")
        public String mActivityTag;
        @SerializedName("count")
        public int mCount;
        @SerializedName("each_nper_count")
        public int mEachNperCount;
        @SerializedName("id")
        public String mSkuId;
        @SerializedName("spu_id")
        public String mSpuId;
    }
}
