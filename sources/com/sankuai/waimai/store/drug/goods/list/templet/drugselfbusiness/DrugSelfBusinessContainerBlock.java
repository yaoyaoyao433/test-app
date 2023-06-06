package com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.shangou.stone.whiteboard.e;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.drug.goods.list.delegate.d;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.m;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugSelfBusinessContainerBlock extends com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a implements c.a, d, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    private PrioritySmoothNestedScrollView d;
    private b e;
    private com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.header.a f;
    private View g;

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final void a(long j) {
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final void c() {
    }

    public DrugSelfBusinessContainerBlock(@NonNull c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077c59952d871f1b25605505bb96c044", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077c59952d871f1b25605505bb96c044");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4f27aae77753e84affd0ccf75578f3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4f27aae77753e84affd0ccf75578f3c");
        }
        this.g = layoutInflater.inflate(R.layout.wm_drug_goods_list_drug_self_business_market_layout, viewGroup, false);
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
        this.f = new com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.header.a(this.a);
        this.f.a((ViewGroup) this.g.findViewById(R.id.shop_action_bar_container), findViewById);
        this.f.createAndReplaceView(viewGroup3);
        this.d.a(viewGroup2, this.f.b());
        return this.g;
    }

    private void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f162351e4280e1aeb5370935f8ecc331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f162351e4280e1aeb5370935f8ecc331");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = u.a(view.getContext()) + h.a(k(), i);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f2f4d5bae209b3b583d0d23531296b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f2f4d5bae209b3b583d0d23531296b");
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
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a1a298624440191b65ee98fde04cfe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a1a298624440191b65ee98fde04cfe8");
        } else {
            m.b(poi.headPicUrl).a(new b.a() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.DrugSelfBusinessContainerBlock.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr3 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8e9be28861133e33152f032cc7081231", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8e9be28861133e33152f032cc7081231");
                    } else {
                        DrugSelfBusinessContainerBlock.this.g.setBackground(new a(DrugSelfBusinessContainerBlock.this.getContext().getResources(), bitmap));
                    }
                }
            });
        }
    }

    @Subscribe
    public void poiPageScrollToTopEvent(com.sankuai.waimai.store.mrn.event.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2317282a3918a94098577cd69540a40d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2317282a3918a94098577cd69540a40d");
        } else if (p.a(this.b, cVar, this.a) || p.a(this.a.k()) || !this.a.k().x() || !com.sankuai.waimai.store.platform.domain.manager.poi.a.a(cVar.b, this.b.h(), NumberUtils.parseLong(cVar.a, -1L), this.b.g())) {
        } else {
            a();
            this.d.setForbidScroll(true);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final com.sankuai.waimai.store.shopping.cart.delegate.b o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca5abacef87f1325fe48f09b4d917c1e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.shopping.cart.delegate.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca5abacef87f1325fe48f09b4d917c1e") : this.a.o();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13630acf4a643b389b6a12052ee7af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13630acf4a643b389b6a12052ee7af2");
        } else {
            this.d.a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final PrioritySmoothNestedScrollView e() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b0f1722957200f9949cb016b29673a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b0f1722957200f9949cb016b29673a")).intValue() : this.f.a() + h.a(getContext(), 50.0f);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4df0d5a19c1482533d218d9511afa32", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4df0d5a19c1482533d218d9511afa32")).intValue() : this.f.d();
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94405e46facea4ed8c5212425fd6a09e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94405e46facea4ed8c5212425fd6a09e");
            return;
        }
        float a = n.a((i * 1.0f) / this.f.d(), 0.0f, 1.0f);
        com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.header.a aVar = this.f;
        Object[] objArr2 = {Float.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.header.a.c;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "314a221fcea90ca9a4ed409fbd67e8c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "314a221fcea90ca9a4ed409fbd67e8c0");
        } else {
            aVar.f.a(a);
            aVar.g.setAlpha(a);
        }
        this.e.a(a);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ca7ecc9dc05242ebd034906d8b80151", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ca7ecc9dc05242ebd034906d8b80151")).booleanValue() : this.a.n();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33070bedd77d543b7051c50d99afff47", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33070bedd77d543b7051c50d99afff47") : this.a.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final SCBaseActivity k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f51ee73c82a31eb060f2926cb0c8492", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f51ee73c82a31eb060f2926cb0c8492") : this.a.k();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a9a5383bb17153063b9ea2a1b52aa7b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a9a5383bb17153063b9ea2a1b52aa7b") : this.a.l();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final e m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7d49e04cb2c92def5d4bcdada9ac8d", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7d49e04cb2c92def5d4bcdada9ac8d") : this.a.m();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6396c492a8ee0e7fdc6b51af6bb688", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6396c492a8ee0e7fdc6b51af6bb688") : this.a.b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
        Object[] objArr = {context, view, str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cb63f75018ed8da435d0e4d065277f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cb63f75018ed8da435d0e4d065277f");
        } else {
            this.a.a(context, view, str, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {context, view, str, goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc91425c7e803b8801015e352507ea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc91425c7e803b8801015e352507ea3");
        } else {
            this.a.a(context, view, str, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
        Object[] objArr = {activity, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c889967c27adf8d9274704c192d1710d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c889967c27adf8d9274704c192d1710d");
        } else {
            this.a.a(activity, goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
        Object[] objArr = {goodsSpu, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf75772ead51d4046257430ee9ed5d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf75772ead51d4046257430ee9ed5d1");
        } else {
            this.a.a(goodsSpu, j, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, Poi poi) {
        Object[] objArr = {goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66141db8f493a3289f49ee6d686470f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66141db8f493a3289f49ee6d686470f1");
        } else {
            this.a.a(goodsSpu, poi);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1057ad848ff93077bd9ee766c71ee5f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1057ad848ff93077bd9ee766c71ee5f1");
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

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef69d954ec19b6531bc5f91c6496160", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef69d954ec19b6531bc5f91c6496160")).booleanValue() : super.h();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffbf9a3b3ceab6a355d63a135fe5057d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffbf9a3b3ceab6a355d63a135fe5057d");
        } else if (this.e != null) {
            this.e.a(kVar);
        }
    }
}
