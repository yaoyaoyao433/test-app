package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PreDecision implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("pay_by_friend_pop_tip")
    public String payByFriendPopTip;
    @SerializedName("pay_second_title_tip")
    public String paySecondTitleTip;
    @SerializedName("product_list")
    public List<ProductListItem> productList;
    @SerializedName("unique_identify_code")
    public String uniqueIdentifyCode;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class ProductListItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("pre_promo_info")
        public c prePromoInfo;

        public ProductListItem() {
        }
    }
}
