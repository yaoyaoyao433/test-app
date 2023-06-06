package com.sankuai.waimai.business.restaurant.base.shopcart.tip;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("tip_text")
    public String b;
    @SerializedName("tip_button")
    public b c;
    public boolean d;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746627bcac5bcda4b9cf30de74f12c1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746627bcac5bcda4b9cf30de74f12c1f");
        } else {
            this.d = false;
        }
    }
}
