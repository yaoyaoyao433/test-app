package com.sankuai.waimai.business.restaurant.base.shopcart.tip;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements Serializable {
    public static ChangeQuickRedirect a;
    public double b;
    @SerializedName("toast")
    public String c;
    public boolean d;
    public boolean e;
    @SerializedName("top_tip_info")
    public d f;
    @SerializedName("exchange_info")
    public a g;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afb070b3577097b5504ff8b227563e56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afb070b3577097b5504ff8b227563e56");
            return;
        }
        this.b = 0.0d;
        this.d = false;
    }

    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3e13fc1dc0a008ab9287ceff051519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3e13fc1dc0a008ab9287ceff051519");
        } else {
            this.b = d;
        }
    }
}
