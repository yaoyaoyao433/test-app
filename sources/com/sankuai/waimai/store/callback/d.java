package com.sankuai.waimai.store.callback;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect e;
    public GoodsSpu f;
    public Poi g;
    public int h;

    public com.sankuai.waimai.store.shopping.cart.a a() {
        return null;
    }

    public String b() {
        return "";
    }

    public d(GoodsSpu goodsSpu, Poi poi, int i) {
        Object[] objArr = {goodsSpu, poi, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e2729341f5a8c5c61305b548c93194a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e2729341f5a8c5c61305b548c93194a");
            return;
        }
        this.f = goodsSpu;
        this.g = poi;
        this.h = i;
    }
}
