package com.sankuai.waimai.business.search.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect b;
    @SerializedName("code")
    public int c;
    @SerializedName("msg")
    public String d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c200aa180052a5e2995a154e05852372", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c200aa180052a5e2995a154e05852372");
        } else {
            this.c = -1;
        }
    }
}
