package com.sankuai.waimai.contextual.computing.storage.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @SerializedName("strategyCode")
    public int b;
    @SerializedName("matchedNum")
    public int c;
    @SerializedName("totalNum")
    public int d;
    @SerializedName("deliveryAddressCount")
    public int e;

    public c(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), 1, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78cdaf2c6e3bd04368065e3f3d8cebdf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78cdaf2c6e3bd04368065e3f3d8cebdf");
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = 1;
        this.e = i4;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6fb7d8a3083574a5a864c97a045f847", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6fb7d8a3083574a5a864c97a045f847") : d.a().toJson(this);
    }
}
