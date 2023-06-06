package com.sankuai.waimai.store.order;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public GoodsSpu b;
    public GoodsSku c;
    public int d;

    public c(GoodsSpu goodsSpu, GoodsSku goodsSku, int i) {
        Object[] objArr = {goodsSpu, goodsSku, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f24f45c1861fa1c364151a089889bb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f24f45c1861fa1c364151a089889bb8");
            return;
        }
        this.b = goodsSpu;
        this.c = goodsSku;
        this.d = i;
    }
}
