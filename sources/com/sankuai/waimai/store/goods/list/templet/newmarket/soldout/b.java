package com.sankuai.waimai.store.goods.list.templet.newmarket.soldout;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.z;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b implements c.b, e, n {
    public static ChangeQuickRedirect a;
    public final c.a b;
    public a c;
    @NonNull
    private final com.sankuai.waimai.store.goods.list.templet.newmarket.e d;
    private LoadingFooterView e;
    private NetInfoLoadView f;
    private ViewGroup g;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    public b(@Nonnull Context context, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "570b77e5e66d413155d1911a0df21a45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "570b77e5e66d413155d1911a0df21a45");
            return;
        }
        this.d = eVar;
        this.b = new f(this, this.d.x());
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d91fdc2d919b94122d83477d857fe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d91fdc2d919b94122d83477d857fe2");
        } else if (getContext() instanceof Activity) {
            this.g = (ViewGroup) ((Activity) getContext()).findViewById(R.id.sold_out_root_view);
            this.g.removeAllViews();
            z.a(getContext(), R.layout.wm_st_poi_market_sold_out_list, this.g, true);
            SCRecyclerView sCRecyclerView = (SCRecyclerView) this.g.findViewById(R.id.sold_out_spu_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.g.getContext());
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e3c23f18b5948621c7487c869eaa385", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e3c23f18b5948621c7487c869eaa385");
                    } else {
                        b.this.hide();
                    }
                }
            });
            this.f = (NetInfoLoadView) this.g.findViewById(R.id.sold_out_net_info);
            this.e = new LoadingFooterView(this.g.getContext());
            sCRecyclerView.b(this.e);
            sCRecyclerView.setOnScrollToBottomOrTopListener(this);
            sCRecyclerView.setLayoutManager(linearLayoutManager);
            this.c = new a(this);
            sCRecyclerView.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) this.c);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11de8e69e55f25d1a9826a9e400e6b5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11de8e69e55f25d1a9826a9e400e6b5c");
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451b13b4d9e73dc780fd7afebd0e9822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451b13b4d9e73dc780fd7afebd0e9822");
            return;
        }
        this.d.D().d(this.g);
        this.g.setVisibility(0);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2039810722c8283a678e314f9c3c9d40", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2039810722c8283a678e314f9c3c9d40") : this.d.H();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.b
    public final void a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964c170f7647d71ac7a0c8726a645c8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964c170f7647d71ac7a0c8726a645c8e");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            if (this.c.g()) {
                this.c.b_(list);
            } else {
                this.c.c_(list);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.b
    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bac8613c7692399010f65646bf5097d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bac8613c7692399010f65646bf5097d0");
        } else {
            this.e.a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9182e0fbcc495b0a45eb2e98f9b33075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9182e0fbcc495b0a45eb2e98f9b33075");
        } else if (this.c.g()) {
            this.f.b();
        } else {
            this.e.d();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.c.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df804bd88c17f156a4b25d5502b86780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df804bd88c17f156a4b25d5502b86780");
        } else if (this.c.g()) {
            this.f.c();
        } else {
            this.f.e();
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35536fc2a4cb47ea1036c79e71def8e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35536fc2a4cb47ea1036c79e71def8e1");
            return;
        }
        this.b.a(this.c.h(this.c.getItemCount() - 1));
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final GoodsPoiCategory f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4761ee54eae819cf065555ba41c4c67", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4761ee54eae819cf065555ba41c4c67") : this.b.a();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "520cedb0135c8bf26c97bc1a5e650a11", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "520cedb0135c8bf26c97bc1a5e650a11") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c017518b32496f8918e2d79f6d314562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c017518b32496f8918e2d79f6d314562");
        } else {
            this.d.D().a(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final void a(GoodsSpu goodsSpu, int i, View view) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae0d5744c99ebaaaea1568488a8af6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae0d5744c99ebaaaea1568488a8af6f");
        } else {
            this.d.D().a(goodsSpu, i, view);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b69b9fab13e8ae1781fdf0d0b2a0b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b69b9fab13e8ae1781fdf0d0b2a0b4");
        } else {
            this.d.D().b(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb817d2cfb42a9e120ca1db13f831984", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb817d2cfb42a9e120ca1db13f831984")).booleanValue() : this.g != null && this.g.getVisibility() == 0;
    }
}
