package com.sankuai.waimai.store.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public GoodsSpu c;
    public GoodsSpu d;

    public a(String str, GoodsSpu goodsSpu, GoodsSpu goodsSpu2) {
        Object[] objArr = {str, goodsSpu, goodsSpu2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "001455c7e41e9cd7e6252f127d3844e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "001455c7e41e9cd7e6252f127d3844e2");
            return;
        }
        this.b = str;
        this.c = goodsSpu;
        this.d = goodsSpu2;
    }
}
