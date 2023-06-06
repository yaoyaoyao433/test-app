package com.sankuai.waimai.business.restaurant.base.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private Context b;
    private ViewGroup c;
    private SparseArray<a> d;
    private boolean e;
    private String f;
    private a g;

    public d(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4d174486d2102e8efdfb7393fed7e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4d174486d2102e8efdfb7393fed7e5");
            return;
        }
        this.d = new SparseArray<>();
        this.e = false;
        this.b = context;
        this.c = viewGroup;
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.ui.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bc022a1ccda81724b705f3195d7466a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bc022a1ccda81724b705f3195d7466a");
                }
            }
        });
    }

    public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, a.InterfaceC0850a interfaceC0850a, int i) {
        Object[] objArr = {goodsSpu, gVar, interfaceC0850a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5cdf3b43c4e799b9e30d8ffb330a161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5cdf3b43c4e799b9e30d8ffb330a161");
        } else if (goodsSpu == null || com.sankuai.waimai.restaurant.shopcart.utils.b.a(goodsSpu.packageList) || goodsSpu.packageList.get(0) == null || com.sankuai.waimai.restaurant.shopcart.utils.b.a(goodsSpu.packageList.get(0).productList) || goodsSpu.packageList.get(0).productList.size() <= 1) {
            this.c.setVisibility(8);
        } else {
            this.g = a(goodsSpu);
            this.e = this.g instanceof h;
            this.f = "attached_package_" + this.e + CommonConstant.Symbol.UNDERLINE + goodsSpu.id + CommonConstant.Symbol.UNDERLINE + i;
            if (this.g != null) {
                this.g.a(goodsSpu, gVar, interfaceC0850a, i);
                this.c.setVisibility(0);
                return;
            }
            this.c.setVisibility(8);
        }
    }

    private a a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b642d56812cdc9df32662563851a6200", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b642d56812cdc9df32662563851a6200");
        }
        a aVar = this.d.get(goodsSpu.packageStyleType);
        if (aVar != null) {
            return aVar;
        }
        if (goodsSpu.packageStyleType == 2) {
            aVar = new h(this.b, this.c);
        }
        this.d.put(goodsSpu.packageStyleType, aVar);
        return aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        public Context b;
        public ViewGroup c;
        public GoodsSpu d;
        public com.sankuai.waimai.business.restaurant.base.manager.order.g e;
        public a.InterfaceC0850a f;
        public int g;

        public abstract void a();

        public a(Context context, ViewGroup viewGroup) {
            Object[] objArr = {context, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda628a8ba941c1af81c5d84bdd4a6d5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda628a8ba941c1af81c5d84bdd4a6d5");
                return;
            }
            this.b = context;
            this.c = viewGroup;
        }

        public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, a.InterfaceC0850a interfaceC0850a, int i) {
            Object[] objArr = {goodsSpu, gVar, interfaceC0850a, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03ac0ce838ec4ea5446215cc8ea9cb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03ac0ce838ec4ea5446215cc8ea9cb8");
                return;
            }
            this.d = goodsSpu;
            this.e = gVar;
            this.f = interfaceC0850a;
            this.g = i;
            this.c.removeAllViews();
            a();
        }
    }
}
