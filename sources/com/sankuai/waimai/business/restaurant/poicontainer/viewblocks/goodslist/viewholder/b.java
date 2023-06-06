package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.GoodsPoiCategory;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.c;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.platform.widget.recycler.b {
    public static ChangeQuickRedirect a;
    public final a.InterfaceC0850a b;
    public final g c;
    public GoodsSpu d;
    public com.sankuai.waimai.business.restaurant.base.ui.b e;
    private final Context h;
    private final c.a i;

    public b(LayoutInflater layoutInflater, ViewGroup viewGroup, a.InterfaceC0850a interfaceC0850a, boolean z, String str) {
        super(layoutInflater.inflate(R.layout.wm_restaurant_market_adapter_goods_dialog_container, viewGroup, false));
        Object[] objArr = {layoutInflater, viewGroup, interfaceC0850a, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e88a33731863778b601f2ca2455aa0a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e88a33731863778b601f2ca2455aa0a5");
            return;
        }
        this.i = new c.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.c.a
            public final void b(GoodsSpu goodsSpu) {
            }

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.c.a
            public final void a(GoodsSpu goodsSpu, View view) {
                Object[] objArr2 = {goodsSpu, view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b72ebec74d8c688052c8d25074ac6fb8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b72ebec74d8c688052c8d25074ac6fb8");
                } else {
                    b.this.b.a((GoodsPoiCategory) null, goodsSpu, view, -1, -1);
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.c.a
            public final void b(GoodsSpu goodsSpu, View view) {
                Object[] objArr2 = {goodsSpu, view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7eebbfed716c6ba38b6abfd3afdafda8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7eebbfed716c6ba38b6abfd3afdafda8");
                } else {
                    b.this.b.a((GoodsPoiCategory) null, goodsSpu, -1, -1, view);
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.c.a
            public final void a(GoodsSpu goodsSpu) {
                Object[] objArr2 = {goodsSpu};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "041dda41cbb53e8601a30c2c6217aa9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "041dda41cbb53e8601a30c2c6217aa9b");
                } else {
                    b.this.b.a(null, goodsSpu, -1, -1);
                }
            }
        };
        this.h = viewGroup.getContext();
        this.b = interfaceC0850a;
        this.c = this.b.a();
        this.e = new com.sankuai.waimai.business.restaurant.base.ui.b(this.h, this.itemView.findViewById(R.id.layout_goods_card_container), this.i, z, str);
        a(true);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.b$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ GoodsPoiCategory b;
        public final /* synthetic */ GoodsSpu c;
        public final /* synthetic */ View d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public AnonymousClass1(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, View view, int i, int i2) {
            this.b = goodsPoiCategory;
            this.c = goodsSpu;
            this.d = view;
            this.e = i;
            this.f = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b25fcc326e51ab4f120da94db59ff9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b25fcc326e51ab4f120da94db59ff9c");
            } else {
                b.this.b.a(this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.b
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac473d49dc94842641bd1faa832d132", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac473d49dc94842641bd1faa832d132");
            return;
        }
        super.a(view);
        if (this.d != null) {
            this.b.a(null, this.d, -1);
        }
    }
}
