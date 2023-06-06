package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.g;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.i;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.k;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private i b;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.a c;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.f d;
    private g e;
    private j f;

    public b(@NonNull Context context, j jVar) {
        super(context);
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e4bb3b96ac83b86370793578f1368e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e4bb3b96ac83b86370793578f1368e");
        } else {
            this.f = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674864e193c5b910f57a64c010d594a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674864e193c5b910f57a64c010d594a5");
            return;
        }
        super.onViewCreated();
        this.b = new i(this.mContext, this.f);
        this.b.bindView(getView());
        FrameLayout frameLayout = (FrameLayout) findView(R.id.fl_slogan_container);
        this.e = new g(this.mContext, this.f);
        frameLayout.addView(this.e.createView(frameLayout));
        this.d = new com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.f(this.mContext);
        frameLayout.addView(this.d.createView(frameLayout));
        this.c = new com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.a(this.mContext, this.f);
        this.c.bindView(getView());
    }

    public final void a(k kVar, int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        Object[] objArr = {kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f751aaa647b2e2b78c773f2e231d8836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f751aaa647b2e2b78c773f2e231d8836");
        } else if (kVar == null) {
        } else {
            if (kVar.c != null && !com.sankuai.shangou.stone.util.a.b(kVar.c.childGoodPoiCategory)) {
                this.b.a(kVar.b);
            } else {
                this.b.a(kVar.c);
            }
            com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.a aVar = this.c;
            Object[] objArr2 = {kVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "26ab00dd59e4c3657a137baec6138bbb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "26ab00dd59e4c3657a137baec6138bbb");
            } else if (kVar != null && kVar.b != null) {
                aVar.g = kVar.b;
                aVar.c.setVisibility(8);
                if (aVar.a(aVar.g)) {
                    u.a(aVar.b);
                    aVar.d.a(aVar.g.sortType, aVar.g.sortList);
                } else {
                    aVar.d.a(aVar.g.sortType, (List<SGSortModel>) null);
                }
                if (aVar.b(aVar.g)) {
                    aVar.b.setVisibility(0);
                    aVar.e.a(aVar.g.getBrandIds(), aVar.g.brandInfo);
                    aVar.e.a(kVar.e);
                    if (!aVar.f.h()) {
                        aVar.e.b();
                    } else if (kVar.e) {
                        aVar.e.a();
                    }
                } else {
                    aVar.e.a((List<Long>) null, (SGSortModel) null);
                    if (!aVar.f.h()) {
                        aVar.e.b();
                    }
                }
                if (aVar.a(aVar.g) || aVar.b(aVar.g)) {
                    aVar.c.setVisibility(0);
                } else {
                    aVar.c.setVisibility(8);
                }
            }
            GoodsPoiCategory goodsPoiCategory = kVar.b;
            Object[] objArr3 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d8bd54f9d60928b07561125dde00abb", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d8bd54f9d60928b07561125dde00abb")).booleanValue();
            } else {
                z = (goodsPoiCategory.mutilReceiveCouponTip == null || t.a(goodsPoiCategory.mutilReceiveCouponTip.activityDesc)) ? false : true;
            }
            if (z) {
                this.b.hide();
                this.d.hide();
                this.e.show();
                this.e.a(kVar, i, 0);
                return;
            }
            GoodsPoiCategory goodsPoiCategory2 = kVar.b;
            Object[] objArr4 = {goodsPoiCategory2};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "353ae04f34ca9eb544d5526590c909e8", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "353ae04f34ca9eb544d5526590c909e8")).booleanValue();
            } else {
                z2 = (goodsPoiCategory2.activityInfo == null || t.a(goodsPoiCategory2.activityInfo.activityText)) ? false : true;
            }
            if (z2) {
                this.b.hide();
                this.e.hide();
                this.d.show();
                this.d.a(kVar, i, 0);
                return;
            }
            GoodsPoiCategory goodsPoiCategory3 = kVar.c;
            Object[] objArr5 = {goodsPoiCategory3};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dec68d11d906dd3b6e674c7826493f78", RobustBitConfig.DEFAULT_VALUE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dec68d11d906dd3b6e674c7826493f78")).booleanValue();
            } else if (goodsPoiCategory3.mDescriptionBar != null && !t.a(goodsPoiCategory3.mDescriptionBar.content)) {
                z3 = true;
            }
            if (z3) {
                this.b.hide();
                this.e.hide();
                this.d.show();
                this.d.a(kVar, i, 1);
                return;
            }
            this.b.show();
            this.d.hide();
            this.e.hide();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f33d346f75025fc738545d9534904923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f33d346f75025fc738545d9534904923");
            return;
        }
        super.onDestroy();
        if (this.e != null) {
            this.e.onDestroy();
        }
        if (this.d != null) {
            this.d.onDestroy();
        }
    }
}
