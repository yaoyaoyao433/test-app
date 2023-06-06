package com.sankuai.waimai.store.platform.domain.core.shopcart.tip;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("tip_text")
    public String b;
    @SerializedName("tip_button")
    private b c;

    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3941f2b7fc8663c296d04e5472200aea", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3941f2b7fc8663c296d04e5472200aea") : this.c == null ? new b() : this.c;
    }
}
