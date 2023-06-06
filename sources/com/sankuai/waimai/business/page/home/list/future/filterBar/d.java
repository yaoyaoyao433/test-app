package com.sankuai.waimai.business.page.home.list.future.filterBar;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.view.nested.NestedSmoothRecyclerView;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.list.future.FutureViewModel;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.f;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.domain.usecase.d;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.business.page.common.arch.a<List<b.a.C1086a>> {
    public static ChangeQuickRedirect v;
    private RelativeLayout A;
    private FrameLayout B;
    private FrameLayout C;
    private RecyclerView D;
    private com.sankuai.waimai.rocks.expose.d E;
    private FrameLayout F;
    private c G;
    private HomePageViewModel H;
    private FutureViewModel I;
    private com.sankuai.waimai.platform.widget.filterbar.domain.repository.b J;
    private ImageView K;
    private NestedSmoothRecyclerView L;
    public List<b.a.C1086a> w;
    public b x;
    public boolean y;
    private String z;

    public d(PageFragment pageFragment, NestedSmoothRecyclerView nestedSmoothRecyclerView, String str) {
        super(pageFragment);
        Object[] objArr = {pageFragment, nestedSmoothRecyclerView, str};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b394cca9dcba01516b624a51b05978e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b394cca9dcba01516b624a51b05978e8");
            return;
        }
        this.z = str;
        this.L = nestedSmoothRecyclerView;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    /* renamed from: a */
    public final void d(List<b.a.C1086a> list) {
        boolean z = true;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2b3a9c6306a6e540064d6455889b9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2b3a9c6306a6e540064d6455889b9e");
            return;
        }
        this.w = list;
        if (list == null || list.isEmpty()) {
            j();
            return;
        }
        k();
        this.G.a(this.w);
        if (this.D != null) {
            this.D.scrollToPosition(0);
            this.E.a(true);
            this.E.b();
        }
        this.G.a((this.H == null || !this.H.I) ? false : false);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a4e2bad3859713d7650b94a47075912", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a4e2bad3859713d7650b94a47075912");
        }
        this.A = (RelativeLayout) viewGroup.findViewById(R.id.future_filterBar_container);
        this.C = (FrameLayout) viewGroup.findViewById(R.id.fast_filter_bar_container);
        this.B = (FrameLayout) viewGroup.findViewById(R.id.future_filter_bar_dialog);
        this.D = (RecyclerView) viewGroup.findViewById(R.id.future_filterBar);
        this.F = (FrameLayout) viewGroup.findViewById(R.id.all_category_bg);
        this.K = (ImageView) viewGroup.findViewById(R.id.btn_all_category);
        this.J = com.sankuai.waimai.platform.widget.filterbar.implement.injection.a.a(this.t, this.s.q());
        this.x = new b(this.t, this.L, this.C, this.B, this.s, this.J);
        com.sankuai.waimai.rocks.expose.c cVar = new com.sankuai.waimai.rocks.expose.c() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.expose.c
            public final void a(int i) {
                b.a.C1086a c1086a;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9babff31a136e54658f3af171a35c1d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9babff31a136e54658f3af171a35c1d1");
                } else if (d.this.w == null || i < 0 || i >= d.this.w.size() || (c1086a = (b.a.C1086a) d.this.w.get(i)) == null) {
                } else {
                    JudasManualManager.b("b_waimai_6afw2cyj_mv").a("c_m84bv26").a("index", i).a("code", c1086a.a).a(RaptorUploaderImpl.IS_CACHE, d.this.y ? 1 : 0).a();
                }
            }

            @Override // com.sankuai.waimai.rocks.expose.c
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06077c6b4bf5f5e83fcf0366b985193e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06077c6b4bf5f5e83fcf0366b985193e");
                    return;
                }
                b.a.C1086a c1086a = (b.a.C1086a) d.this.w.get(i);
                if (c1086a != null) {
                    JudasManualManager.a("b_waimai_6afw2cyj_mc").a("c_m84bv26").a("index", i).a("code", c1086a.a).a(RaptorUploaderImpl.IS_CACHE, d.this.y ? 1 : 0).a();
                }
            }
        };
        this.E = new com.sankuai.waimai.rocks.expose.d(cVar);
        this.E.a((View) this.D);
        this.G = new c(this.J, cVar);
        this.D.setAdapter(this.G);
        this.G.c = new b.c() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.b.c
            public final void a(b.a.C1086a c1086a, boolean z, boolean z2, boolean z3) {
                Object[] objArr2 = {c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, (byte) 0};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe9699e0b21cdae509da79f87d1d2000", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe9699e0b21cdae509da79f87d1d2000");
                    return;
                }
                d.this.J.a(d.this.J.j());
                d.this.J.a(d.this.J.m());
                if (z) {
                    d.this.J.a(c1086a.a);
                } else {
                    d.this.J.b(c1086a.a);
                }
                d.this.J.n();
                d.this.H.f(true);
                d.this.G.a();
                d.this.I.a(new com.sankuai.waimai.business.page.home.list.future.net.b(d.this.J.z()));
            }
        };
        this.K.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.d.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c39664e98fce294b25ed6553bf384ad", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c39664e98fce294b25ed6553bf384ad");
                    return;
                }
                d.this.H.f(true);
                final b bVar = d.this.x;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e1dcbc8b6315eb0a4282f9d8d8bc4f4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e1dcbc8b6315eb0a4282f9d8d8bc4f4e");
                } else if (bVar.c) {
                    bVar.b(true);
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "c0abb8af6f4755b1e2a05ddafbb57bac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "c0abb8af6f4755b1e2a05ddafbb57bac");
                    } else {
                        JudasManualManager.b("b_waimai_q3fn954m_mv").a("c_m84bv26").a();
                        bVar.b.d = true;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = b.a;
                        if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "bfa7348d474069ae702320855d761725", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "bfa7348d474069ae702320855d761725");
                        } else {
                            bVar.c = true;
                            if (bVar.d != null) {
                                bVar.a(false);
                                bVar.d.a();
                                bVar.d.b(true);
                                bVar.d.c(false);
                                bVar.d.d(false);
                            }
                        }
                        com.sankuai.waimai.platform.widget.filterbar.clean.c.a().a((com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<com.sankuai.waimai.platform.widget.filterbar.domain.usecase.d, R>) new com.sankuai.waimai.platform.widget.filterbar.domain.usecase.d(bVar.e), (com.sankuai.waimai.platform.widget.filterbar.domain.usecase.d) new d.a(true, 0L, 0L, 0, 1), (c.InterfaceC1084c) new c.InterfaceC1084c<d.b>() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.b.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                            public final /* synthetic */ void a(d.b bVar2) {
                                Map<String, g> map;
                                d.b bVar3 = bVar2;
                                int i = 0;
                                Object[] objArr6 = {bVar3};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "055f3331db6cc629ac764e8f1cf82e42", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "055f3331db6cc629ac764e8f1cf82e42");
                                } else if (bVar3 == null) {
                                    if (bVar.d != null) {
                                        bVar.d.b(false);
                                        bVar.d.c(true);
                                    }
                                } else {
                                    com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar4 = bVar3.b;
                                    b bVar5 = bVar;
                                    Object[] objArr7 = {bVar4};
                                    ChangeQuickRedirect changeQuickRedirect7 = b.a;
                                    if (PatchProxy.isSupport(objArr7, bVar5, changeQuickRedirect7, false, "3ef48b62b645b915235340e8f2bf5862", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, bVar5, changeQuickRedirect7, false, "3ef48b62b645b915235340e8f2bf5862");
                                    } else if (bVar5.e != null) {
                                        bVar5.e.a(bVar4);
                                    }
                                    b bVar6 = bVar;
                                    Object[] objArr8 = {bVar4};
                                    ChangeQuickRedirect changeQuickRedirect8 = b.a;
                                    if (PatchProxy.isSupport(objArr8, bVar6, changeQuickRedirect8, false, "679dc5a5a7654eb08c8a9b935db7725a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr8, bVar6, changeQuickRedirect8, false, "679dc5a5a7654eb08c8a9b935db7725a");
                                    } else {
                                        Set<String> set = null;
                                        if (bVar6.e != null) {
                                            set = bVar6.e.j();
                                            map = bVar6.e.m();
                                        } else {
                                            map = null;
                                        }
                                        if (bVar6.d != null) {
                                            bVar6.d.b(false);
                                            if (bVar4 == null || bVar4.b == null || bVar4.b.isEmpty()) {
                                                bVar6.d.c(true);
                                            } else {
                                                bVar6.d.a(bVar4, set, map);
                                            }
                                        }
                                    }
                                    StringBuffer stringBuffer = new StringBuffer("");
                                    if (bVar4 != null && !com.sankuai.waimai.foundation.utils.d.a(bVar4.b)) {
                                        Iterator<b.a> it = bVar4.b.iterator();
                                        while (it.hasNext()) {
                                            b.a next = it.next();
                                            if (next != null && !com.sankuai.waimai.foundation.utils.d.a(next.c)) {
                                                for (b.a.C1086a c1086a : next.c) {
                                                    if (c1086a != null && !TextUtils.isEmpty(c1086a.a)) {
                                                        if (i == 0) {
                                                            stringBuffer.append(c1086a.a);
                                                        } else {
                                                            stringBuffer.append(CommonConstant.Symbol.COMMA);
                                                            stringBuffer.append(c1086a.a);
                                                        }
                                                        i++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    JudasManualManager.b("b_waimai_u31wd7zv_mv").a("c_m84bv26").a("code", stringBuffer.toString()).a();
                                }
                            }

                            @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c.InterfaceC1084c
                            public final void a(Error error) {
                                Object[] objArr6 = {error};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3c0bea149a648feefd5fc16ed76048a7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3c0bea149a648feefd5fc16ed76048a7");
                                } else if (bVar.d != null) {
                                    bVar.d.b(false);
                                    bVar.d.d(true);
                                }
                            }
                        });
                    }
                }
                JudasManualManager.a("b_waimai_0rka4ilm_mc").a("c_m84bv26").a(RaptorUploaderImpl.IS_CACHE, d.this.y ? 1 : 0).a();
            }
        });
        a(this.s);
        HomeGrayManager.a().a(this.D, 3, 2, "", 0);
        return this.A;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db253d600aaf833003048dc59c18ee9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db253d600aaf833003048dc59c18ee9f");
            return;
        }
        this.H = (HomePageViewModel) q.a(pageFragment).a(HomePageViewModel.class);
        this.I = (FutureViewModel) q.a(pageFragment).a(FutureViewModel.class);
        this.H.q.a(pageFragment, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.d.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff06ce3550309be0cc2f17dd92cfff30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff06ce3550309be0cc2f17dd92cfff30");
                } else if (bool2 == null || d.this.D == null) {
                } else {
                    d.this.C.setBackgroundColor(bool2.booleanValue() ? -1 : 0);
                    d.this.F.setBackgroundResource(bool2.booleanValue() ? R.drawable.wm_page_home_future_tab_all_category_bg_white : R.drawable.wm_page_home_future_tab_all_category_bg_gray);
                    d.this.G.a(bool2.booleanValue());
                }
            }
        });
        this.H.d.a(pageFragment, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.d.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Object[] objArr2 = {bool};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e37c755466bc602bae3d8428d79c1e3e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e37c755466bc602bae3d8428d79c1e3e");
                } else if (d.this.x == null || !d.this.x.c) {
                } else {
                    d.this.x.b(true);
                }
            }
        });
        this.H.z.a(pageFragment, new l<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.d.6
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Void r12) {
                Object[] objArr2 = {r12};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43debdf29c8e27b12fc2ea62648896d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43debdf29c8e27b12fc2ea62648896d3");
                    return;
                }
                b bVar = d.this.x;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "44b7bfee66d7d8ac38e37ce16ab8b112", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "44b7bfee66d7d8ac38e37ce16ab8b112");
                } else if (bVar.e != null) {
                    bVar.e.a((f) null);
                    bVar.e.p();
                    bVar.e.o();
                    bVar.e.n();
                }
                d.this.G.a();
            }
        });
        this.I.c.a(pageFragment, new l<com.sankuai.waimai.business.page.home.list.future.net.b>() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.d.7
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.business.page.home.list.future.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fa924ddd4a3e5ab5b65cabf5626d7c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fa924ddd4a3e5ab5b65cabf5626d7c0");
                } else {
                    d.this.G.a();
                }
            }
        });
    }

    @Override // com.meituan.android.cube.core.f
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b297849185242c02a685f8150c08076b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b297849185242c02a685f8150c08076b");
        } else {
            this.A.setVisibility(8);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01d6d22f1a92631883b1183e4d226416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01d6d22f1a92631883b1183e4d226416");
            return;
        }
        JudasManualManager.b("b_waimai_0rka4ilm_mv").a("c_m84bv26").a(RaptorUploaderImpl.IS_CACHE, this.y ? 1 : 0).a();
        this.A.setVisibility(0);
    }

    public final boolean P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fea728e55914bf920552d8c116c42d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fea728e55914bf920552d8c116c42d")).booleanValue() : this.A != null && this.A.getVisibility() == 0;
    }

    public final int Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84f01018c9819752453f7ddd851912ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84f01018c9819752453f7ddd851912ba")).intValue();
        }
        if (this.A == null || this.A.getVisibility() != 0) {
            return 0;
        }
        return com.meituan.android.singleton.b.a.getResources().getDimensionPixelSize(R.dimen.wm_page_home_future_filter_bar_layout_height);
    }
}
