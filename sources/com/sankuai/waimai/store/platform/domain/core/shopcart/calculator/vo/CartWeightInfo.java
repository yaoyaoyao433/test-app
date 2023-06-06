package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CartWeightInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("over_weight")
    private boolean overweight;
    @SerializedName("over_weight_text")
    private String overweightText;
    @SerializedName("total_weight_text")
    private String totalWeightText;

    public String getTotalWeightText() {
        return this.totalWeightText;
    }

    public void setTotalWeightText(String str) {
        this.totalWeightText = str;
    }

    public String getOverweightText() {
        return this.overweightText;
    }

    public void setOverweightText(String str) {
        this.overweightText = str;
    }

    public boolean isOverweight() {
        return this.overweight;
    }

    public void setOverweight(boolean z) {
        this.overweight = z;
    }
}
