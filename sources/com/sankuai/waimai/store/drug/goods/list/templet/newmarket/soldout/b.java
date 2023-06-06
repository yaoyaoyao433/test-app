package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout;

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
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c;
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
    private final h d;
    private LoadingFooterView e;
    private NetInfoLoadView f;
    private ViewGroup g;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    public b(@Nonnull Context context, @NonNull h hVar) {
        super(context);
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c170865b9d1c1674bd9b382fb3d47b5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c170865b9d1c1674bd9b382fb3d47b5d");
            return;
        }
        this.d = hVar;
        this.b = new f(this, this.d.q());
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68fb50dbaba6328dba9540f1e0a17b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68fb50dbaba6328dba9540f1e0a17b61");
        } else if (getContext() instanceof Activity) {
            this.g = (ViewGroup) ((Activity) getContext()).findViewById(R.id.sold_out_root_view);
            this.g.removeAllViews();
            z.a(getContext(), R.layout.wm_drug_poi_market_sold_out_list, this.g, true);
            SCRecyclerView sCRecyclerView = (SCRecyclerView) this.g.findViewById(R.id.sold_out_spu_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.g.getContext());
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbe117e3a71437466fd1f94ef67e5fa0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbe117e3a71437466fd1f94ef67e5fa0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "404f52ca05c88f18838c534c911256dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "404f52ca05c88f18838c534c911256dd");
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c4114ac31bf70f14874624486a6a2ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c4114ac31bf70f14874624486a6a2ae");
            return;
        }
        this.d.w().d(this.g);
        this.g.setVisibility(0);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48821216edeedfc42297ec715720e70c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48821216edeedfc42297ec715720e70c") : this.d.A();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.b
    public final void a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e94e4877e7f480430b9012dd755a1c08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e94e4877e7f480430b9012dd755a1c08");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            if (this.c.g()) {
                this.c.b_(list);
            } else {
                this.c.c_(list);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.b
    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa60e009390d612ab246d719d1245e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa60e009390d612ab246d719d1245e79");
        } else {
            this.e.a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dfd623c743018982e582fac08e074a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dfd623c743018982e582fac08e074a9");
        } else if (this.c.g()) {
            this.f.b();
        } else {
            this.e.d();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.c.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8eaec43264a4d572a312e543d55140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8eaec43264a4d572a312e543d55140");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a6dfcdff9ae27527da3fab7bf21897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a6dfcdff9ae27527da3fab7bf21897");
            return;
        }
        this.b.a(this.c.h(this.c.getItemCount() - 1));
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.e
    public final GoodsPoiCategory f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad54df21ff8eb26dfe9a22738fe1ab1b", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad54df21ff8eb26dfe9a22738fe1ab1b") : this.b.a();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.e
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a26ca33defa5e0f9d4144f26418123", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a26ca33defa5e0f9d4144f26418123") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.e
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927e296c025976d1d266f9c621481486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927e296c025976d1d266f9c621481486");
        } else {
            this.d.w().a(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.e
    public final void a(GoodsSpu goodsSpu, int i, View view) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba70780b35b92a4504549cffed7856dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba70780b35b92a4504549cffed7856dc");
        } else {
            this.d.w().a(goodsSpu, i, view);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.soldout.e
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e9c3086005e515f3cf1abda3797878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e9c3086005e515f3cf1abda3797878");
        } else {
            this.d.w().b(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "866a2e46e5f36db48baa90cd983c79cc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "866a2e46e5f36db48baa90cd983c79cc")).booleanValue() : this.g != null && this.g.getVisibility() == 0;
    }
}
