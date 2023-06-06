package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public GoodsSpu d;
    public GoodsSku e;
    public GoodsAttr[] f;
    @Nullable
    public com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b g;
    public Runnable h;

    public f(String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baa0183e06978718f97fa64261063c8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baa0183e06978718f97fa64261063c8a");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13b6b7410877e077a284244ea51f2c95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13b6b7410877e077a284244ea51f2c95");
        } else {
            com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(str);
            if (l == null) {
                this.c = str;
                this.b = str;
            } else {
                this.c = l.h();
                this.b = String.valueOf(l.g());
            }
        }
        this.d = goodsSpu;
        this.e = goodsSku;
        this.f = goodsAttrArr;
        this.g = bVar;
    }

    public final boolean a() {
        return this.h != null;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b37bae7ceeb91e75936137bf923bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b37bae7ceeb91e75936137bf923bd7");
        } else if (this.h == null) {
        } else {
            this.h.run();
        }
    }
}
