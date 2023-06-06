package com.sankuai.waimai.store.search.ui.result.nestedheader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.adapterdelegates.c;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider;
import com.sankuai.waimai.store.search.ui.result.adapterDelegate.b;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Context b;
    public AppBarLayout c;
    public AppBarLayout d;
    public View e;
    public View f;
    public View g;
    public boolean h;
    private c i;
    private SearchShareData j;
    private String k;
    private CoordinatorLayout l;
    private ISearchTemplateProvider m;
    private ISearchTemplateProvider n;

    public a(Context context, String str, AppBarLayout appBarLayout, AppBarLayout appBarLayout2, CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {context, str, appBarLayout, appBarLayout2, coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "303a48d98be933c950821497b719e022", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "303a48d98be933c950821497b719e022");
            return;
        }
        this.h = false;
        this.b = context;
        this.c = appBarLayout;
        this.d = appBarLayout2;
        this.l = coordinatorLayout;
        this.j = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(this.b, SearchShareData.class);
        this.k = str;
        this.m = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_STORE_SEARCH);
        this.n = (ISearchTemplateProvider) com.sankuai.waimai.router.a.a(ISearchTemplateProvider.class, ISearchTemplateProvider.ROUTER_SERVICE_KEY_DRUG_SEARCH);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b25e66fb1ef07700fb32569949477c49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b25e66fb1ef07700fb32569949477c49");
            return;
        }
        this.i = new c(this.b, new com.sankuai.waimai.store.search.ui.result.adapterDelegate.a(this.b, null), new b(this.b));
        if (this.m != null) {
            this.i.a(this.m.provideNativeTemplates(this.b, this.k, null));
            this.i.b = this.m.provideMachAdapterDelegate(this.b, null);
        }
        if (this.n != null) {
            this.i.a(this.n.provideNativeTemplates(this.b, this.k, null));
            this.i.c = this.n.provideMachAdapterDelegate(this.b, null);
        }
    }

    private View a(@NonNull ViewGroup viewGroup, OasisModule oasisModule) {
        Object[] objArr = {viewGroup, oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f08bad504a752fe926f834b6fdac46e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f08bad504a752fe926f834b6fdac46e");
        }
        Object[] objArr2 = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        int intValue = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00af83eaa12dd9ed2ece3bbf165052ab", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00af83eaa12dd9ed2ece3bbf165052ab")).intValue() : this.i.a(oasisModule);
        RecyclerView.s a2 = this.i.a(viewGroup, intValue);
        c cVar = this.i;
        Object[] objArr3 = {oasisModule, a2, 0, Integer.valueOf(intValue)};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "4aef269a0d7854633e5b41bb4ab646b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "4aef269a0d7854633e5b41bb4ab646b4");
        } else {
            com.sankuai.waimai.store.search.adapterdelegates.b a3 = cVar.a(intValue);
            if (oasisModule.data != null) {
                a3.a((com.sankuai.waimai.store.search.adapterdelegates.b) oasisModule.data, cVar.d.L);
                a3.a((com.sankuai.waimai.store.search.adapterdelegates.b) oasisModule.data, (Serializable) a2, 0);
            }
        }
        return a2.itemView;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ec4af57f7ce4538078a50c5d27e22b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ec4af57f7ce4538078a50c5d27e22b");
            return;
        }
        if (this.d != null) {
            this.d.removeAllViews();
        }
        if (this.c != null) {
            this.c.removeAllViews();
        }
        if (this.e != null) {
            this.l.removeView(this.e);
            this.e = null;
        }
        if (this.f != null) {
            this.f = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        this.h = false;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1b7a9022935c3a39c6fc3553134648", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1b7a9022935c3a39c6fc3553134648")).intValue();
        }
        if (this.g == null) {
            return 0;
        }
        return this.g.getHeight();
    }

    public final View a(int i, OasisModule oasisModule, int i2) {
        Object[] objArr = {Integer.valueOf(i), oasisModule, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d55b57b46f14dda916e675b784afd90", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d55b57b46f14dda916e675b784afd90");
        }
        View a2 = a(this.c, oasisModule);
        if (i == 0) {
            this.d.addView(a2);
        } else if (i != 1) {
            if (i == 2) {
                a2.setAlpha(0.0f);
                this.l.addView(a2);
                return a2;
            }
            return null;
        } else {
            this.c.addView(a2);
        }
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) a2.getLayoutParams();
        layoutParams.a = i2;
        a2.setLayoutParams(layoutParams);
        return a2;
    }
}
