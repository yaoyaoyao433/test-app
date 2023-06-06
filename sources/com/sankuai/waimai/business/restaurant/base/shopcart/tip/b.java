package com.sankuai.waimai.business.restaurant.base.shopcart.tip;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("type")
    public int b;
    public int c;
    @SerializedName("text")
    public String d;
    @SerializedName("tip_threshold_price")
    public double e;

    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3479a12b2dce89398603028209bf82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3479a12b2dce89398603028209bf82");
        } else {
            this.e = d;
        }
    }
}
