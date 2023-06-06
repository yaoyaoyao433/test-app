package com.sankuai.waimai.platform.domain.core.activities;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ActivityPolicy implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("discount_by_count")
    @Expose
    public DiscountByCount discountByCount;

    public DiscountByCount getDiscountByCount() {
        return this.discountByCount;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd306842f68d23394726eceb0232fc39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd306842f68d23394726eceb0232fc39");
        } else if (jSONObject == null) {
        } else {
            try {
                this.discountByCount = new DiscountByCount();
                this.discountByCount.parseJson(jSONObject.optJSONObject("discount_by_count"));
            } catch (Exception e) {
                a.a(e);
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DiscountByCount implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("count")
        @Expose
        public int count;
        @SerializedName(PayLabel.ITEM_TYPE_DISCOUNT)
        @Expose
        public double discount;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7736a856bcd76c5501bdd94717bdcbf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7736a856bcd76c5501bdd94717bdcbf6");
                return;
            }
            try {
                this.count = jSONObject.optInt("count");
                this.discount = jSONObject.optDouble(PayLabel.ITEM_TYPE_DISCOUNT);
            } catch (Exception e) {
                a.a(e);
            }
        }

        public int getCount() {
            return this.count;
        }

        public double getDiscount() {
            return this.discount;
        }
    }
}
