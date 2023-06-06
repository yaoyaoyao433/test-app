package com.sankuai.waimai.store.poi.list.newp.home;

import android.arch.lifecycle.q;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.convenient.model.SGBaseTileResponse;
import com.sankuai.waimai.store.k;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.SCViewPagerCompat;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.home.callback.NoneEvent;
import com.sankuai.waimai.store.poi.list.newp.home.model.BaseContainerViewModel;
import com.sankuai.waimai.store.poi.list.newp.home.view.RefreshLayout;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageLifecycleManager;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageLifecycleObserver;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BaseBlockContainer extends k implements PoiPageLifecycleObserver {
    public static ChangeQuickRedirect j;
    protected SGBaseTileResponse.SubNaviInfo A;
    public final int B;
    public final int C;
    public ImageView D;
    private boolean E;
    private Set<com.sankuai.waimai.store.poi.list.newp.home.callback.e> F;
    private float G;
    private PoiPageLifecycleManager H;
    private List<BaseCard> I;
    private RefreshLayout i;
    protected FrameLayout k;
    protected ViewGroup l;
    protected View m;
    protected LinearLayout n;
    protected FrameLayout o;
    protected SCViewPagerCompat p;
    protected NetInfoLoadView q;
    protected AppBarLayout r;
    protected RecyclerView s;
    protected CoordinatorLayout t;
    protected com.sankuai.waimai.store.param.a u;
    protected b v;
    public com.sankuai.waimai.store.poi.list.newp.home.model.a w;
    protected PageEventHandler x;
    protected Map<String, Object> y;
    protected BaseContainerViewModel z;

    public abstract void a(com.sankuai.waimai.store.poi.list.newp.home.callback.c cVar);

    public abstract void a(com.sankuai.waimai.store.poi.list.newp.home.model.a aVar);

    public abstract Map<String, Object> b(boolean z);

    @Override // com.sankuai.waimai.store.poi.list.refactor.PoiPageLifecycleObserver
    public final void f(int i) {
    }

    @Subscribe
    public void none(NoneEvent noneEvent) {
    }

    public void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f47f85822cbcfa31b9caa8e648dbe77d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f47f85822cbcfa31b9caa8e648dbe77d");
        }
    }

    public abstract void s();

    public void u() {
    }

    public void v() {
    }

    public BaseBlockContainer(@NonNull Fragment fragment, com.sankuai.waimai.store.param.a aVar) {
        super(fragment);
        Object[] objArr = {fragment, aVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3afc2bce25d4a91789694afde72a03f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3afc2bce25d4a91789694afde72a03f5");
            return;
        }
        this.w = new com.sankuai.waimai.store.poi.list.newp.home.model.a();
        this.E = false;
        this.F = new HashSet();
        this.B = 1;
        this.C = 2;
        this.I = new ArrayList();
        this.u = aVar;
    }

    @Override // com.meituan.android.cube.core.f
    /* renamed from: w */
    public final SCBaseActivity l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e67211a515232138bbf662c4094f9e22", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e67211a515232138bbf662c4094f9e22") : (SCBaseActivity) this.b.b();
    }

    @Override // com.meituan.android.cube.core.f
    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8226aaca50a7c6282fa013bf5aea4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8226aaca50a7c6282fa013bf5aea4a");
            return;
        }
        super.a(bundle);
        l().s().recordStep("convenient_page_create");
        this.z = (BaseContainerViewModel) q.a((FragmentActivity) l()).a(BaseContainerViewModel.class);
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d787c9855468f1730b06c808e96390f", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d787c9855468f1730b06c808e96390f") : layoutInflater.inflate(R.layout.wm_sc_common_container, (ViewGroup) null);
    }

    @Override // com.meituan.android.cube.core.f
    public void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e58a8c751b26e07a4b59b1d66061f35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e58a8c751b26e07a4b59b1d66061f35");
            return;
        }
        super.a_(view);
        a(this.w);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cd7828ef41305ffb67748b142f59949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cd7828ef41305ffb67748b142f59949");
        } else {
            this.z = (BaseContainerViewModel) q.a((FragmentActivity) l()).a(BaseContainerViewModel.class);
            BaseContainerViewModel baseContainerViewModel = this.z;
            com.sankuai.waimai.store.param.a aVar = this.u;
            Object[] objArr3 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = BaseContainerViewModel.a;
            if (PatchProxy.isSupport(objArr3, baseContainerViewModel, changeQuickRedirect3, false, "8f3c877aca542615b865ec5289c18457", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, baseContainerViewModel, changeQuickRedirect3, false, "8f3c877aca542615b865ec5289c18457");
            } else {
                baseContainerViewModel.b.b((android.arch.lifecycle.k<com.sankuai.waimai.store.param.a>) aVar);
            }
            this.x = (PageEventHandler) q.a((FragmentActivity) l()).a(PageEventHandler.class);
            this.w.q = this.x;
            this.i = (RefreshLayout) a(R.id.rec);
            this.i.setEnabled(this.w.b);
            this.i.setRefreshListener(new RefreshLayout.b() { // from class: com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.poi.list.newp.home.view.RefreshLayout.b
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0a08250fbe9374a78d3826335fa7be59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0a08250fbe9374a78d3826335fa7be59");
                    } else {
                        BaseBlockContainer.this.y();
                    }
                }
            });
            this.k = (FrameLayout) a(R.id.convenient_content_root);
            this.r = (AppBarLayout) a(R.id.appbar);
            this.l = (ViewGroup) a(R.id.wm_sc_action_bar);
            this.m = a(R.id.head);
            this.n = (LinearLayout) a(R.id.head_container);
            this.o = (FrameLayout) a(R.id.tab_container);
            this.p = (SCViewPagerCompat) a(R.id.vp);
            this.s = (RecyclerView) a(R.id.rv_wm_sc_skeleton);
            this.t = (CoordinatorLayout) a(R.id.coordinator_layout);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            marginLayoutParams.topMargin = this.w.i;
            this.o.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
            marginLayoutParams2.topMargin = this.w.j;
            this.m.setLayoutParams(marginLayoutParams2);
            this.p.setViewTouchMode(!this.w.e);
            this.q = (NetInfoLoadView) a(R.id.wm_sc_mach_tile_net_info);
            this.q.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ee52183b59ff76a635299557c29e8e6b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ee52183b59ff76a635299557c29e8e6b");
                        return;
                    }
                    BaseBlockContainer.this.B();
                    BaseBlockContainer.this.c(true);
                }
            });
            this.q.setVisibility(8);
            this.r.a(new AppBarLayout.a() { // from class: com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer.3
                public static ChangeQuickRedirect a;

                @Override // android.support.design.widget.AppBarLayout.a
                public final void a(AppBarLayout appBarLayout, int i) {
                    Object[] objArr4 = {appBarLayout, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2161e59d9ad1cc1ab9fb24ef888319ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2161e59d9ad1cc1ab9fb24ef888319ce");
                        return;
                    }
                    if (BaseBlockContainer.this.m.getMeasuredHeight() + i == 0) {
                        BaseBlockContainer.this.E = true;
                    } else {
                        BaseBlockContainer.this.E = false;
                    }
                    BaseBlockContainer.this.G = Math.abs(i) / appBarLayout.getTotalScrollRange();
                    if (BaseBlockContainer.this.G == 0.0f) {
                        BaseBlockContainer.this.i.setEnabled(BaseBlockContainer.this.w.b);
                    } else {
                        BaseBlockContainer.this.i.setEnabled(false);
                    }
                    for (com.sankuai.waimai.store.poi.list.newp.home.callback.e eVar : BaseBlockContainer.this.F) {
                        if (eVar != null) {
                            boolean unused = BaseBlockContainer.this.E;
                            float unused2 = BaseBlockContainer.this.G;
                        }
                    }
                }
            });
            this.v = new b(l(), this.w.f, this.n);
            b((View) null);
            u.a((View) this.o, 8);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = j;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9fcb448e9505face77087560f4b73892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9fcb448e9505face77087560f4b73892");
        } else if (!this.w.a) {
            c(true);
        }
        com.meituan.android.bus.a.a().a(this);
        this.H = new PoiPageLifecycleManager(l());
        this.H.b = this;
    }

    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5995e8796c6e311f1cb6b607c5ba80c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5995e8796c6e311f1cb6b607c5ba80c4");
        } else {
            this.z.c.b((android.arch.lifecycle.k<Map<String, Object>>) b(false));
        }
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75511d1f865dc66e7cb556e0bcf15591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75511d1f865dc66e7cb556e0bcf15591");
        } else if (view == null || this.l == null) {
        } else {
            this.l.removeAllViews();
            this.l.addView(view);
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd85f4a25286306f5c6c813d580c89a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd85f4a25286306f5c6c813d580c89a2");
            return;
        }
        if (this.w.c) {
            r();
        }
        t();
    }

    public void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1ab7ca96672a78b6f7f8b7f250d9352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1ab7ca96672a78b6f7f8b7f250d9352");
        } else {
            s();
        }
    }

    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5f6ab93353112fbb16e00f5d4c5abb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5f6ab93353112fbb16e00f5d4c5abb");
        } else {
            c(true);
        }
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6c006b17a58af3022963a381ca6e34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6c006b17a58af3022963a381ca6e34");
        } else if (this.q != null) {
            this.q.a(i, str);
        }
    }

    public final void a(SGBaseTileResponse.SubNaviInfo subNaviInfo) {
        Object[] objArr = {subNaviInfo};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a830fb0600a015b59ee60ee84192de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a830fb0600a015b59ee60ee84192de");
            return;
        }
        this.o.removeAllViews();
        this.A = subNaviInfo;
        if (subNaviInfo.categoryInfos == null || com.sankuai.waimai.foundation.utils.b.b(subNaviInfo.categoryInfos)) {
            return;
        }
        ListPagerAdapter listPagerAdapter = new ListPagerAdapter(l(), this.u, this.w, new com.sankuai.waimai.store.poi.list.newp.home.callback.b() { // from class: com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.newp.home.callback.b
            public final void a(com.sankuai.waimai.store.poi.list.newp.home.callback.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23440d0c1801cd86cf2e5d85f06226e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23440d0c1801cd86cf2e5d85f06226e3");
                } else {
                    BaseBlockContainer.this.a(cVar);
                }
            }
        });
        List<CategoryInfo> list = subNaviInfo.categoryInfos;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = ListPagerAdapter.a;
        if (PatchProxy.isSupport(objArr2, listPagerAdapter, changeQuickRedirect2, false, "7babf856129bdf6f52c25f9ba932e7b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, listPagerAdapter, changeQuickRedirect2, false, "7babf856129bdf6f52c25f9ba932e7b7");
        } else {
            listPagerAdapter.b.clear();
            if (!com.sankuai.shangou.stone.util.a.b(list)) {
                listPagerAdapter.b.addAll(list);
            }
            listPagerAdapter.notifyDataSetChanged();
        }
        this.p.setAdapter(listPagerAdapter);
        u.a((View) this.o, 8);
        this.p.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer.5
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb46de8c2be954ce62f222de7c0e230f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb46de8c2be954ce62f222de7c0e230f");
                }
            }
        });
        if (com.sankuai.waimai.foundation.utils.b.c(subNaviInfo.categoryInfos) <= 0) {
            u.a((View) this.o, 8);
        } else {
            u.a((View) this.o, 0);
        }
    }

    public final void a(List<BaseModuleDesc> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb366fa986ba4249ab7349756dfb827f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb366fa986ba4249ab7349756dfb827f");
            return;
        }
        e d = d(i);
        if (d != null) {
            d.a(list, (com.sankuai.waimai.store.convenient.base.b) null);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2cbd3df0260383d7f7f49704d934e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2cbd3df0260383d7f7f49704d934e5a");
            return;
        }
        e d = d(i);
        if (d != null) {
            d.c();
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e592db584bad7d391d38296d1890948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e592db584bad7d391d38296d1890948");
            return;
        }
        e d = d(i);
        if (d != null) {
            d.j = true;
        }
    }

    public final e d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510d2fd87a508423e248694f84817c8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510d2fd87a508423e248694f84817c8a");
        }
        if (this.p != null) {
            PagerAdapter adapter = this.p.getAdapter();
            if (adapter instanceof ListPagerAdapter) {
                com.sankuai.waimai.store.base.b a = ((ListPagerAdapter) adapter).a(i, this.p);
                if (a instanceof e) {
                    return (e) a;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9edb5bbe6acf770494ead5dc39ed9738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9edb5bbe6acf770494ead5dc39ed9738");
            return;
        }
        super.aR_();
        l().s().recordStep("convenient_page_start");
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3431967a5de23f930abf563b403a5575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3431967a5de23f930abf563b403a5575");
            return;
        }
        super.aX_();
        l().s().recordStep("convenient_page_resume");
    }

    public final void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58cefc694b32b79c0d61c2521eeb0d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58cefc694b32b79c0d61c2521eeb0d38");
        } else if (this.i != null) {
            this.i.a();
        }
    }

    @Override // com.sankuai.waimai.store.k
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0399e4695cb4ebaf462e916853f27acc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0399e4695cb4ebaf462e916853f27acc");
            return;
        }
        super.a(z);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24bc73a4b8fe076821652a538b072311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24bc73a4b8fe076821652a538b072311");
        } else if (z) {
            if (this.y == null) {
                this.y = com.sankuai.waimai.store.poi.list.util.c.a(l());
            }
            u();
            com.sankuai.waimai.store.manager.judas.a.a(this.y);
            com.sankuai.waimai.store.manager.judas.d.a(l(), this.u.G, this.y);
            com.sankuai.waimai.store.manager.judas.d.a(l(), this.u.G);
        } else {
            com.sankuai.waimai.store.manager.judas.d.d(l(), this.u.G);
        }
    }

    public final void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e11d67a4a05e920ace253ef8a8a53f3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e11d67a4a05e920ace253ef8a8a53f3a");
            return;
        }
        z();
        a(3, "");
        d(false);
    }

    public final void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f80f678c04bc9f76f76d50b4e50e284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f80f678c04bc9f76f76d50b4e50e284");
        } else {
            a(0, "");
        }
    }

    private void d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b9be6ba1f6e3da8df8e820c897edb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b9be6ba1f6e3da8df8e820c897edb0");
        } else if (this.k != null) {
            this.k.addView(view);
        }
    }

    public final void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "530cd2e319da035c05aafb7ad42e4f47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "530cd2e319da035c05aafb7ad42e4f47");
        } else if (this.k != null) {
            this.k.addView(view, 0);
        }
    }

    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d40a91571ace7df1764d96e9852b389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d40a91571ace7df1764d96e9852b389");
            return;
        }
        e d = d(i);
        if (d != null) {
            d.d();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a21681d0b84c137a4853cd6334b82b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a21681d0b84c137a4853cd6334b82b");
            return;
        }
        super.bE_();
        com.meituan.android.bus.a.a().b(this);
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab582126ad09963c604c575bbeb2fa04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab582126ad09963c604c575bbeb2fa04");
            return;
        }
        if (this.D == null) {
            this.D = new ImageView(l());
            m.a((int) R.drawable.wm_sc_nox_search_actionbar_ic_back, this.D);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(com.sankuai.shangou.stone.util.h.a(l(), 24.0f), com.sankuai.shangou.stone.util.h.a(l(), 24.0f));
            layoutParams.gravity = 51;
            layoutParams.leftMargin = com.sankuai.shangou.stone.util.h.a(l(), 12.0f);
            layoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(l(), 54.0f);
            this.D.setLayoutParams(layoutParams);
            d(this.D);
            this.D.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe6f5fb5e8e32d59d83564f589e0f0a7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe6f5fb5e8e32d59d83564f589e0f0a7");
                    } else {
                        BaseBlockContainer.this.v();
                    }
                }
            });
        }
        this.D.setVisibility(z ? 0 : 8);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.newp.home.BaseBlockContainer$7  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] a = new int[com.sankuai.waimai.store.assembler.component.f.valuesCustom().length];

        static {
            try {
                a[com.sankuai.waimai.store.assembler.component.f.Float.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final void a(@NonNull BaseCard baseCard, boolean z) {
        Object[] objArr = {baseCard, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0360e26a3ba8df3aab3ec638724be25b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0360e26a3ba8df3aab3ec638724be25b");
            return;
        }
        if (!z) {
            Object[] objArr2 = {baseCard};
            ChangeQuickRedirect changeQuickRedirect2 = j;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9959d8780a331665bb5d06bd5453acb6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9959d8780a331665bb5d06bd5453acb6")).booleanValue() : this.I.contains(baseCard)) {
                return;
            }
        }
        if (AnonymousClass7.a[baseCard.c.a.ordinal()] == 1) {
            if (this.I.size() > 0 && z) {
                while (this.I.size() > 0) {
                    BaseCard remove = this.I.remove(0);
                    if (remove != null && remove.b != null) {
                        this.k.removeView(remove.b);
                    }
                }
            }
            this.I.add(baseCard);
            C();
        }
        if (baseCard instanceof com.sankuai.waimai.store.assembler.component.a) {
            this.F.add((com.sankuai.waimai.store.poi.list.newp.home.callback.e) baseCard);
        }
    }

    private void C() {
        BaseCard next;
        com.sankuai.waimai.store.assembler.component.e a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864e89ae9f806979d67f8ddd24a5de3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864e89ae9f806979d67f8ddd24a5de3d");
            return;
        }
        Iterator<BaseCard> it = this.I.iterator();
        while (it.hasNext() && (a = (next = it.next()).a()) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (a.a == 3 && a.b == 2) {
                layoutParams.gravity = 83;
            } else if (a.a == 4 && a.b == 2) {
                layoutParams.gravity = 85;
            } else if (a.a == 3 && a.b == 1) {
                layoutParams.gravity = 51;
            } else if (a.a == 4 && a.b == 1) {
                layoutParams.gravity = 53;
            }
            this.k.addView(next.b, layoutParams);
        }
    }

    @Subscribe
    public void onConvenientHomeSurveyCancelEventReceive(com.sankuai.waimai.store.poi.list.newp.home.event.a aVar) {
        e d;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd405183363a53c797b24667dc5d50e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd405183363a53c797b24667dc5d50e8");
        } else if (aVar != null && (d = d(0)) != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "ac55bbb8742e47551ea3990655318fbe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "ac55bbb8742e47551ea3990655318fbe");
            } else if (d.d != null) {
                c cVar = d.d;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "6cd6b20264f2fdfedf95f9a1ebd088dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "6cd6b20264f2fdfedf95f9a1ebd088dc");
                } else if (cVar.b != null) {
                    for (int i = 0; i < cVar.b.size(); i++) {
                        if (cVar.b.get(i) != null && cVar.b.get(i).a != null && cVar.c.equals(cVar.b.get(i).a.templateId)) {
                            cVar.b.remove(i);
                            cVar.b(i, cVar.b.size() - i > 0 ? cVar.b.size() - i : 1);
                            return;
                        }
                    }
                }
            }
        }
    }
}
