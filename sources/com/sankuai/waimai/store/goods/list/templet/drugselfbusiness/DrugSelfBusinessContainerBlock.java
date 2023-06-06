package com.sankuai.waimai.store.goods.list.templet.drugselfbusiness;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.mrn.event.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.util.m;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugSelfBusinessContainerBlock extends com.sankuai.waimai.store.goods.list.viewblocks.base.a implements d.a, e, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    private PrioritySmoothNestedScrollView d;
    private b e;
    private com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.header.a f;
    private View g;
    @NonNull
    private final com.sankuai.waimai.store.goods.list.delegate.impl.d h;

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final void a(long j) {
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void c() {
    }

    public DrugSelfBusinessContainerBlock(@NonNull com.sankuai.waimai.store.goods.list.delegate.impl.d dVar, @NonNull d dVar2) {
        super(dVar2);
        Object[] objArr = {dVar, dVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c528356ea0b2e285b1a2659045cd73f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c528356ea0b2e285b1a2659045cd73f");
        } else {
            this.h = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e329b72268809f785eac2c9f0d28dac1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e329b72268809f785eac2c9f0d28dac1");
        }
        this.g = layoutInflater.inflate(R.layout.wm_sc_goods_list_drug_self_business_market_layout, viewGroup, false);
        this.d = (PrioritySmoothNestedScrollView) this.g.findViewById(R.id.container_scrollview);
        this.d.a(this);
        com.meituan.android.bus.a.a().a(this);
        ViewGroup viewGroup2 = (ViewGroup) this.g.findViewById(R.id.layout_content_container);
        this.e = new b(this);
        viewGroup2.addView(this.e.createView(viewGroup2));
        ViewGroup viewGroup3 = (ViewGroup) this.g.findViewById(R.id.layout_header_container);
        a(viewGroup3, 127);
        View findViewById = this.g.findViewById(R.id.gradient_helper_layout);
        a(findViewById, 15);
        this.f = new com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.header.a(this.a);
        this.f.a((ViewGroup) this.g.findViewById(R.id.shop_action_bar_container), findViewById);
        this.f.createAndReplaceView(viewGroup3);
        this.d.a(viewGroup2, this.f.b());
        return this.g;
    }

    private void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bd693e868df3afbb2cda32001d05db1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bd693e868df3afbb2cda32001d05db1");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = u.a(view.getContext()) + h.a(k(), i);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bccf90cfd1c43d08efe53feda81a9991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bccf90cfd1c43d08efe53feda81a9991");
            return;
        }
        super.a(restMenuResponse);
        this.e.a(restMenuResponse);
        this.f.a(restMenuResponse);
        Poi poi = restMenuResponse.getPoi();
        if (poi == null) {
            return;
        }
        Object[] objArr2 = {poi};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8163658193d897ac766584d4f4051b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8163658193d897ac766584d4f4051b07");
        } else {
            m.b(poi.headPicUrl).a(new b.a() { // from class: com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.DrugSelfBusinessContainerBlock.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr3 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc9f7e383bb20b41db94c9c9fc8ecfd0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc9f7e383bb20b41db94c9c9fc8ecfd0");
                    } else {
                        DrugSelfBusinessContainerBlock.this.g.setBackground(new a(DrugSelfBusinessContainerBlock.this.getContext().getResources(), bitmap));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final SCShopCartDelegate n() {
        return this.h.B;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.e
    public final void a(@NonNull RestMenuResponse.NavigateItem navigateItem) {
        Object[] objArr = {navigateItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b54f2fd902dab772415c65cff435271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b54f2fd902dab772415c65cff435271");
        } else if (this.e != null) {
            this.e.a(navigateItem);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bd620d3a92f7667b264514ec629a773", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bd620d3a92f7667b264514ec629a773");
        } else {
            this.d.a();
        }
    }

    @Subscribe
    public void poiPageScrollToTopEvent(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29906762278e1dccede94f2d4b953022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29906762278e1dccede94f2d4b953022");
        } else if (p.a(this.b, cVar, this.a) || p.a(this.a.k()) || !this.a.k().x() || !com.sankuai.waimai.store.order.a.e().b(this.b.d(), cVar.a)) {
        } else {
            a();
            this.d.setForbidScroll(true);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final PrioritySmoothNestedScrollView e() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.e
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1494a7a4e2a005ebe8eb04834ec1df2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1494a7a4e2a005ebe8eb04834ec1df2")).intValue() : this.f.a() + h.a(getContext(), 50.0f);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.e
    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be917077c855206db4da780280cf2c2d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be917077c855206db4da780280cf2c2d")).intValue() : this.f.d();
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0a0bc092971da8da902014f2a6efef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0a0bc092971da8da902014f2a6efef");
            return;
        }
        float a = n.a((i * 1.0f) / this.f.d(), 0.0f, 1.0f);
        com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.header.a aVar = this.f;
        Object[] objArr2 = {Float.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.header.a.c;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f3a40ee79eb42fab1df0f2b7dc532224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f3a40ee79eb42fab1df0f2b7dc532224");
        } else {
            aVar.g.b(a);
            aVar.h.setAlpha(a);
        }
        this.e.a(a);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e933d3efd5150a4f16dfabc9e7849e2", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e933d3efd5150a4f16dfabc9e7849e2") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final SCBaseActivity k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18e1c6cb0d2c4bb564aa186c6f34790", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18e1c6cb0d2c4bb564aa186c6f34790") : this.a.k();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76f0bbc4fd02be215b6cba0b8d6f3df", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76f0bbc4fd02be215b6cba0b8d6f3df") : this.a.l();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final com.sankuai.shangou.stone.whiteboard.e m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7112f8edae7cb3a1e1b029606adba6f1", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7112f8edae7cb3a1e1b029606adba6f1") : this.a.m();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158b030109e08ef1297a73a8b880c7a7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158b030109e08ef1297a73a8b880c7a7") : this.a.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
        Object[] objArr = {context, view, str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aea351d0e1d055ab2d11cb98cc34342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aea351d0e1d055ab2d11cb98cc34342");
        } else {
            this.a.a(context, view, str, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {context, view, str, goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdbfd3995ec55d759ff90a426c99e4b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdbfd3995ec55d759ff90a426c99e4b9");
        } else {
            this.a.a(context, view, str, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
        Object[] objArr = {activity, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "318dde160034a7271d45eaadf68ea9c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "318dde160034a7271d45eaadf68ea9c7");
        } else {
            this.a.a(activity, goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
        Object[] objArr = {goodsSpu, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a705646c1ad00717501401f01b6c03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a705646c1ad00717501401f01b6c03");
        } else {
            this.a.a(goodsSpu, j, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, Poi poi) {
        Object[] objArr = {goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ca0759cd1fe7af81f631feddd861f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ca0759cd1fe7af81f631feddd861f6");
        } else {
            this.a.a(goodsSpu, poi);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f56ddc5420f4725c1eafc894564376cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f56ddc5420f4725c1eafc894564376cc");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
        if (this.e != null) {
            this.e.onDestroy();
        }
        if (this.f != null) {
            this.f.onDestroy();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fcdfa4f8ee5cd2690da10cf08f6a73e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fcdfa4f8ee5cd2690da10cf08f6a73e")).booleanValue() : super.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb44c05822cea43e9fa72a0bc0e915c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb44c05822cea43e9fa72a0bc0e915c4");
        } else if (this.e != null) {
            this.e.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    @Nullable
    public final MetricsSpeedMeterTask j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b34a699453cf1fe7ac1c468778639f", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b34a699453cf1fe7ac1c468778639f") : this.a.j();
    }
}
