package com.sankuai.waimai.store.goods.list.viewblocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.helper.a;
import com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.util.monitor.monitor.SGStoreContentRender;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b implements View.OnClickListener, a.InterfaceC1183a, DrugPoiTabMRNFragment.b {
    public static ChangeQuickRedirect a;
    a.InterfaceC1266a b;
    List<RecyclerView.k> c;
    ViewTreeObserver.OnScrollChangedListener d;
    private FragmentManager e;
    private DrugPoiTabMRNFragment f;
    private com.facebook.react.views.scroll.e g;
    private final int h;
    private com.sankuai.waimai.store.goods.list.delegate.d i;
    private ImageView j;
    private com.sankuai.waimai.store.goods.list.helper.c k;
    private ViewTreeObserver.OnScrollChangedListener l;
    private com.sankuai.waimai.store.goods.list.helper.a m;

    public static /* synthetic */ void a(c cVar, final ScrollView scrollView) {
        Object[] objArr = {scrollView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "811e104212f0257a6f74d0b0bacc2007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "811e104212f0257a6f74d0b0bacc2007");
        } else if (scrollView != null) {
            cVar.l = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.c.3
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a96f8410f566390db53391d1f68d3ed3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a96f8410f566390db53391d1f68d3ed3");
                        return;
                    }
                    if (c.this.d != null) {
                        c.this.d.onScrollChanged();
                    }
                    if (Math.max(scrollView.getScrollY(), 0) > com.sankuai.shangou.stone.util.h.b(c.this.mContext)) {
                        c.this.j.setVisibility(0);
                    } else {
                        c.this.j.setVisibility(8);
                    }
                    c.this.k.b();
                }
            };
            cVar.k.a(scrollView, cVar.c);
            scrollView.getViewTreeObserver().addOnScrollChangedListener(cVar.l);
        }
    }

    public c(@NonNull Context context, com.sankuai.waimai.store.goods.list.delegate.d dVar, DrugPoiTabMRNFragment drugPoiTabMRNFragment, FragmentManager fragmentManager, int i) {
        super(context);
        Object[] objArr = {context, dVar, drugPoiTabMRNFragment, fragmentManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "496f939ce71f76fed769cbc2aedbf00d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "496f939ce71f76fed769cbc2aedbf00d");
            return;
        }
        this.i = dVar;
        this.e = fragmentManager;
        this.f = drugPoiTabMRNFragment;
        this.h = i;
        this.k = new com.sankuai.waimai.store.goods.list.helper.c();
        this.m = new com.sankuai.waimai.store.goods.list.helper.a();
        this.m.a(this.i, this);
        this.f.n = this;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9440268e7e190bb7115a562685f6c24", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9440268e7e190bb7115a562685f6c24");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_shop_content_fragment_tab_mrn_container, viewGroup, false);
        this.j = (ImageView) this.i.k().findViewById(R.id.back_to_top);
        this.j.setOnClickListener(this);
        inflate.setId(this.h);
        return inflate;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80a9f921d7f7f7f4ec82de11e95f66a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80a9f921d7f7f7f4ec82de11e95f66a");
            return;
        }
        super.onViewCreated();
        this.f.a(new DrugPoiTabMRNFragment.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.a
            public final void a(@NonNull com.facebook.react.views.scroll.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38ffb4aaf8557acac2b05186a298eeaf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38ffb4aaf8557acac2b05186a298eeaf");
                    return;
                }
                c.this.g = eVar;
                c.a(c.this, (ScrollView) c.this.g);
            }
        });
        this.f.m = this.k;
        if (this.f.isAdded()) {
            return;
        }
        try {
            getView().post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f73939ac159147967de1965f1b13e07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f73939ac159147967de1965f1b13e07");
                    } else {
                        c.this.e.beginTransaction().add(c.this.h, c.this.f).commitAllowingStateLoss();
                    }
                }
            });
        } catch (Exception e) {
            View findViewById = this.i.k().findViewById(this.h);
            View findViewById2 = getView() != null ? getView().findViewById(this.h) : null;
            SGStoreContentRender sGStoreContentRender = SGStoreContentRender.FoodComposeContainerLoad;
            StringBuilder sb = new StringBuilder("parentView:");
            sb.append(findViewById == null);
            sb.append("getView():");
            sb.append(getView() == null);
            sb.append("layoutView:");
            sb.append(findViewById2 == null);
            String sb2 = sb.toString();
            com.sankuai.waimai.store.util.monitor.c.a(sGStoreContentRender, sb2, "监控page加载时机问题：" + e.getMessage());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7444b11bf57637af976b69d68cf5cbbc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7444b11bf57637af976b69d68cf5cbbc");
        } else if (view.getId() == R.id.back_to_top) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73af3215da9d6317d126598dce123f26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73af3215da9d6317d126598dce123f26");
            } else if (this.g != null) {
                this.g.fullScroll(33);
                this.g.scrollTo(0, 0);
                this.g.smoothScrollTo(0, 0);
            }
            this.j.setVisibility(8);
            if (this.b != null) {
                this.b.b(true);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d440718df64cc6af1ce7643dd5d469e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d440718df64cc6af1ce7643dd5d469e");
            return;
        }
        super.onDestroy();
        if (this.g != null && this.l != null) {
            this.g.getViewTreeObserver().removeOnScrollChangedListener(this.l);
        }
        if (this.k != null) {
            this.k.a();
        }
        if (this.m != null) {
            this.m.a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.helper.a.InterfaceC1183a
    public final ReactContext a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68075f4d740abce46886f695cdfc1e9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68075f4d740abce46886f695cdfc1e9f");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1861d80c558770cd69efe704214de302", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1861d80c558770cd69efe704214de302");
        }
        if (this.f == null || this.f.l() == null) {
            return null;
        }
        return this.f.l().getCurrentReactContext();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46e01a7daf87aa2aa74fa4a458b71d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46e01a7daf87aa2aa74fa4a458b71d5");
        } else {
            getView().setBackgroundColor(-1);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb4c9d8f015b648dfce152ae9705a4af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb4c9d8f015b648dfce152ae9705a4af");
        } else {
            getView().setBackgroundColor(0);
        }
    }
}
