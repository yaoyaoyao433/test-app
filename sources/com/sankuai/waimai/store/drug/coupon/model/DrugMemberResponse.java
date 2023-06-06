package com.sankuai.waimai.store.drug.coupon.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugMemberResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bind_success_text")
    public String bindSuccessText;
    @SerializedName("bind_type")
    public int bindType;
    @SerializedName("coupon")
    public CouponEntity couponEntity;
    @SerializedName("schema")
    public String scheme;
    @SerializedName("tip")
    public String tip;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CouponEntity implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("count")
        public int count;
        @SerializedName("count_unit")
        public String countUnit;
        @SerializedName("name")
        public String name;
        @SerializedName(PayLabelConstants.TYPE_REDUCE)
        public String reduce;
    }
}
