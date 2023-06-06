package com.sankuai.waimai.business.restaurant.base.domain.moneyoff;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MoneyOffGradientEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_text")
    public String activityText;
    @SerializedName("product_list")
    public List<MoneyOffGroupEntity> productList;
}
