package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GlobalSearchCouponCard implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("card_type")
    public int b;
    @SerializedName("card_content")
    public String c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements Serializable {
        @SerializedName("channelUrlKey")
        public String a;
        @SerializedName("channelType")
        public long b;
        @SerializedName("couponId")
        public long c;
        @SerializedName("couponType")
        public int d;
        @SerializedName("couponName")
        public String e;
        @SerializedName("couponStatus")
        public int f;
        @SerializedName("couponSource")
        public int g;
        @SerializedName("couponViewId")
        public String h;
        @SerializedName("priceValue")
        public int i;
        @SerializedName("limitPriceValue")
        public int j;
        @SerializedName("useRule")
        public String k;
        @SerializedName("validityText")
        public String l;
        @SerializedName("limitText")
        public String m;
    }

    public final CardContent a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ccd91ec6c28d496f53b7bce57ad503", RobustBitConfig.DEFAULT_VALUE)) {
            return (CardContent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ccd91ec6c28d496f53b7bce57ad503");
        }
        try {
            return (CardContent) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(this.c, (Class<Object>) CardContent.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class CardContent implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isCouponExposed = false;
        @SerializedName("medicine_coupon_data")
        public a medicineCouponData;
        @SerializedName("sg_medicine_bg_icon")
        public String medicineIcon;
        @SerializedName("sg_medicine_scheme")
        public String medicineScheme;

        public CardContent() {
        }
    }
}
