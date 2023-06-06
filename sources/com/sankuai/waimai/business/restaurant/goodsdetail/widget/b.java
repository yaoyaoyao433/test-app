package com.sankuai.waimai.business.restaurant.goodsdetail.widget;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;
    private g b;
    private String c;
    private k d;
    private boolean e;
    private Context f;
    private ab g;

    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd43230715de8a124b2eaa3bc5dad2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd43230715de8a124b2eaa3bc5dad2d");
        }
    }

    public b(g gVar, Context context, ab abVar) {
        Object[] objArr = {gVar, context, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa6b6f0defa481a98c62e5396e80efb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa6b6f0defa481a98c62e5396e80efb");
            return;
        }
        this.f = context;
        this.b = gVar;
        this.g = abVar;
    }

    public final void a(@NonNull List<RecommendPackage.c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e204d4471e2155c01fee93fcff19796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e204d4471e2155c01fee93fcff19796");
        } else if (!p.f(this.f) && (this.f instanceof Activity)) {
            ae.a((Activity) this.f, this.f.getString(R.string.wm_restaurant_bad_net_retry_later_1));
        } else if (d.a(list) || !(this.f instanceof Activity)) {
        } else {
            this.c = this.b.f();
            a((Activity) this.f, list);
        }
    }

    private void a(Activity activity, @NonNull List<RecommendPackage.c> list) {
        Object[] objArr = {activity, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "108c8f398fb54e944769cb6f25f3f16d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "108c8f398fb54e944769cb6f25f3f16d");
            return;
        }
        this.e = false;
        this.d = k.a();
        this.d.a(this.c);
        for (RecommendPackage.c cVar : list) {
            GoodsSpu goodsSpu = cVar.m;
            GoodsSku goodsSku = cVar.l;
            if (goodsSpu == null || goodsSku == null) {
                break;
            }
            int i = cVar.c;
            GoodsAttr[] goodsAttrArr = cVar.o;
            try {
                a(activity, goodsSpu, goodsSku, i, goodsAttrArr);
            } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
                this.e = true;
                a(goodsSpu, goodsSku, goodsAttrArr);
                if (!TextUtils.isEmpty(e.getMessage())) {
                    ae.a(activity, e.getMessage());
                }
            }
        }
        this.d.b(this.c, this);
    }

    private void a(@NonNull Activity activity, @NonNull GoodsSpu goodsSpu, @NonNull GoodsSku goodsSku, int i, @Nullable GoodsAttr[] goodsAttrArr) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        Object[] objArr = {activity, goodsSpu, goodsSku, Integer.valueOf(i), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a6be2fc76779b117012202c4f619249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a6be2fc76779b117012202c4f619249");
            return;
        }
        int a2 = com.sankuai.waimai.business.restaurant.base.manager.order.b.a(goodsSku, k.a().n(this.c).a(goodsSpu.getId(), goodsSku.getSkuId()), 1);
        if (i < a2) {
            throw new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_cart_must_reach_min_count));
        }
        int i2 = (i - a2) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.d.a(activity, this.c, goodsSpu, goodsSku, goodsAttrArr);
        }
    }

    private void a(@NonNull GoodsSpu goodsSpu, @NonNull GoodsSku goodsSku, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91579b59004b5db71e17bc1a9123a5ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91579b59004b5db71e17bc1a9123a5ca");
            return;
        }
        OrderedFood orderedFood = new OrderedFood(goodsSpu, goodsSku, goodsAttrArr, 0);
        orderedFood.ignoreAttrs = true;
        this.d.a(this.c, orderedFood);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bf77b31410a488f01d6844fc25bd441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bf77b31410a488f01d6844fc25bd441");
            return;
        }
        if (this.g != null && !this.e) {
            this.g.r();
        }
        this.d.b(this.c);
        this.d.e(this.c);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
    public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c443e638ba43449d67b5eaf98ec382a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c443e638ba43449d67b5eaf98ec382a8");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.a(aVar);
        }
    }
}
