package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SkuLadderBoxInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ladder_package_food_num")
    public int ladderPackageFoodNnum;
    @SerializedName("ladder_package_price")
    public double ladderPackagePrice;
}
