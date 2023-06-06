package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.GoodsPoiCategory;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.widget.recycler.b {
    public static ChangeQuickRedirect a;
    public final InterfaceC0850a b;
    public GoodsPoiCategory c;
    public GoodsSpu d;
    public int e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0850a {
        g a();

        void a(@NonNull GoodsPoiCategory goodsPoiCategory, @NonNull GoodsSpu goodsSpu, int i);

        void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i, int i2);

        void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i, int i2, View view);

        void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, View view, int i, int i2);
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.b
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "219d89f79584d01d956b952090570cc5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "219d89f79584d01d956b952090570cc5");
            return;
        }
        super.a(view);
        if (this.c == null || this.d == null) {
            return;
        }
        this.b.a(this.c, this.d, this.e);
    }
}
