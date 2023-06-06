package com.sankuai.waimai.business.page.home.basal;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.e;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.head.majorcategory.MajorCategoryBlock;
import com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel;
import com.sankuai.waimai.business.page.home.head.promotionbg.PromotionBgResponse;
import com.sankuai.waimai.business.page.home.helper.f;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.dynamic.c;
import com.sankuai.waimai.platform.dynamic.g;
import com.sankuai.waimai.platform.dynamic.h;
import com.sankuai.waimai.platform.dynamic.j;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    final PageFragment b;
    public List<com.meituan.android.cube.pga.block.a> c;
    com.sankuai.waimai.business.page.home.head.a d;
    PromotionBgViewModel e;
    private Map<Integer, Integer> f;
    private c g;
    private HomePageViewModel h;
    private e i;
    private com.sankuai.waimai.business.page.home.list.future.e j;

    /* JADX WARN: Type inference failed for: r2v7, types: [com.meituan.android.cube.pga.viewmodel.a] */
    public static /* synthetic */ C0770a a(a aVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a4cecf43bce78661908c11c06f6df579", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0770a) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a4cecf43bce78661908c11c06f6df579");
        }
        C0770a c0770a = new C0770a();
        if (list == null || d.a(list)) {
            return c0770a;
        }
        c0770a.a = list.size();
        for (int i = 0; i < list.size(); i++) {
            com.meituan.android.cube.pga.block.a aVar2 = aVar.c.get(i);
            if (aVar2 instanceof com.sankuai.waimai.business.page.home.head.banner.a) {
                c0770a.b = true;
            } else if (aVar2 instanceof com.sankuai.waimai.business.page.home.head.banner.mach.a) {
                c0770a.c = true;
            } else if ((aVar2 instanceof g) && "wm_home_head_promotion_card".equals(aVar2.G().k())) {
                c0770a.e = true;
            }
        }
        return c0770a;
    }

    public static /* synthetic */ void a(a aVar, final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e11f3554fd9a7ec1d77c8b434c08a2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e11f3554fd9a7ec1d77c8b434c08a2fd");
        } else if (str != null) {
            com.meituan.android.cube.pga.core.a aVar2 = new com.meituan.android.cube.pga.core.a(aVar.b.getContext());
            aVar2.r = aVar.b;
            ArrayList arrayList = new ArrayList(aVar.c);
            aVar.g.e = com.sankuai.waimai.business.page.home.helper.b.a().b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d5aa38d6d36ac3a715775070d3298089", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d5aa38d6d36ac3a715775070d3298089");
            } else if (aVar.g != null) {
                HomeNewHeadResponse homeNewHeadResponse = new HomeNewHeadResponse();
                homeNewHeadResponse.maxBubbleNum = -1;
                homeNewHeadResponse.primaryCondList = (ArrayList) f.a();
                c cVar = aVar.g;
                String json = new Gson().toJson(homeNewHeadResponse);
                Object[] objArr3 = {"wm_home_head_poi_category", json};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "388f45db47aec57679676a8b8bc4fa5f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "388f45db47aec57679676a8b8bc4fa5f");
                } else {
                    if (cVar.f == null) {
                        cVar.f = new HashMap();
                    }
                    cVar.f.put("wm_home_head_poi_category", json);
                }
            }
            c cVar2 = aVar.g;
            com.meituan.android.cube.pga.dynamic.b bVar = new com.meituan.android.cube.pga.dynamic.b() { // from class: com.sankuai.waimai.business.page.home.basal.a.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.dynamic.b
                public final String b() {
                    return "c_m84bv26";
                }

                /* JADX WARN: Type inference failed for: r2v28, types: [com.meituan.android.cube.pga.viewmodel.a] */
                @Override // com.meituan.android.cube.pga.dynamic.b
                public final void a(List<com.meituan.android.cube.pga.block.a> list) {
                    com.sankuai.waimai.business.page.home.head.a aVar3;
                    Object[] objArr4 = {list};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "09360b694e6ff705a7f269f6c01712b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "09360b694e6ff705a7f269f6c01712b2");
                        return;
                    }
                    a.this.c.clear();
                    List<com.meituan.android.cube.pga.block.a> list2 = a.this.c;
                    a aVar4 = a.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar4, changeQuickRedirect5, false, "81ac6e31315aa6f64622429eef00163b", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar3 = (com.sankuai.waimai.business.page.home.head.a) PatchProxy.accessDispatch(objArr5, aVar4, changeQuickRedirect5, false, "81ac6e31315aa6f64622429eef00163b");
                    } else if (com.sankuai.waimai.platform.model.c.a().b() == 1 || com.sankuai.waimai.platform.model.c.a().c()) {
                        aVar3 = new com.sankuai.waimai.business.page.home.head.a(aVar4.b, (com.sankuai.waimai.platform.model.c.a().b() == 1 ? com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 140.0f) : com.sankuai.waimai.platform.model.c.a().c() ? aVar4.b.getResources().getDimensionPixelSize(R.dimen.wm_privacy_action_bar_max_height) : 0) + (com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) aVar4.b.getActivity()) ? com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a) : 0));
                    } else {
                        if (aVar4.d == null) {
                            aVar4.d = new com.sankuai.waimai.business.page.home.head.a(aVar4.b);
                        } else {
                            aVar4.d.P();
                        }
                        aVar3 = aVar4.d;
                    }
                    list2.add(aVar3);
                    if (!d.a(list)) {
                        a aVar5 = a.this;
                        Object[] objArr6 = {list};
                        ChangeQuickRedirect changeQuickRedirect6 = a.a;
                        if (PatchProxy.isSupport(objArr6, aVar5, changeQuickRedirect6, false, "50a2d9e236f0294498ac6b24cec32985", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, aVar5, changeQuickRedirect6, false, "50a2d9e236f0294498ac6b24cec32985");
                        } else if (com.sankuai.waimai.platform.accessibility.a.a().b()) {
                            com.sankuai.waimai.foundation.utils.log.a.c("HomePageAdapter", "getAccessibilityServiceState == true", new Object[0]);
                            if (list != null && !d.a(list)) {
                                Iterator<com.meituan.android.cube.pga.block.a> it = list.iterator();
                                while (it.hasNext()) {
                                    com.meituan.android.cube.pga.block.a next = it.next();
                                    if (next != null && next.G() != 0) {
                                        String k = next.G().k();
                                        if (!TextUtils.isEmpty(k) && ("wm_home_head_single_banner".equals(k) || "wm_home_head_promotion_card".equals(k))) {
                                            com.sankuai.waimai.foundation.utils.log.a.c("HomePageAdapter", "删除数据：moduleID = " + k, new Object[0]);
                                            it.remove();
                                        }
                                    }
                                }
                            }
                        }
                        a.this.c.addAll(list);
                        C0770a a2 = a.a(a.this, a.this.c);
                        a aVar6 = a.this;
                        Object[] objArr7 = {a2};
                        ChangeQuickRedirect changeQuickRedirect7 = a.a;
                        if (PatchProxy.isSupport(objArr7, aVar6, changeQuickRedirect7, false, "33cde7379b126ae77a8dd844c561ebf8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, aVar6, changeQuickRedirect7, false, "33cde7379b126ae77a8dd844c561ebf8");
                        } else if (aVar6.e != null) {
                            aVar6.e.k = a2.c;
                            aVar6.e.j = a2.b;
                            aVar6.e.l = a2.d;
                            aVar6.e.m = a2.e;
                        }
                    } else if (com.sankuai.waimai.platform.model.c.a().b() == 0) {
                        MajorCategoryBlock majorCategoryBlock = new MajorCategoryBlock(a.this.b);
                        majorCategoryBlock.e(new com.sankuai.waimai.business.page.home.head.majorcategory.b());
                        a.this.c.add(majorCategoryBlock);
                    }
                    a.this.c.add(a.this.a());
                    if (a.this.b.F != null) {
                        a.this.notifyDataSetChanged();
                        PromotionBgViewModel promotionBgViewModel = (PromotionBgViewModel) q.a(a.this.b).a(PromotionBgViewModel.class);
                        List<com.meituan.android.cube.pga.block.a> list3 = a.this.c;
                        PromotionBgResponse a3 = com.sankuai.waimai.business.page.home.head.promotionbg.b.a(str);
                        Object[] objArr8 = {list3, a3};
                        ChangeQuickRedirect changeQuickRedirect8 = PromotionBgViewModel.a;
                        if (PatchProxy.isSupport(objArr8, promotionBgViewModel, changeQuickRedirect8, false, "39ad9c4e411d94bbc6e47671c6af1cea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, promotionBgViewModel, changeQuickRedirect8, false, "39ad9c4e411d94bbc6e47671c6af1cea");
                        } else {
                            promotionBgViewModel.g.b((k<List<com.meituan.android.cube.pga.block.a>>) list3);
                            promotionBgViewModel.a(a3);
                        }
                        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(a.this.b).a(HomePageViewModel.class);
                        List<com.meituan.android.cube.pga.block.a> list4 = a.this.c;
                        Object[] objArr9 = {list4};
                        ChangeQuickRedirect changeQuickRedirect9 = HomePageViewModel.a;
                        if (PatchProxy.isSupport(objArr9, homePageViewModel, changeQuickRedirect9, false, "fcd4e3545d2c02869345d65f2075edca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, homePageViewModel, changeQuickRedirect9, false, "fcd4e3545d2c02869345d65f2075edca");
                        } else {
                            homePageViewModel.s.b((k<List<com.meituan.android.cube.pga.block.a>>) list4);
                        }
                    }
                }

                @Override // com.meituan.android.cube.pga.dynamic.b
                @NonNull
                public final String a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "43352d928f37a49d814e6548bd1cd34c", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "43352d928f37a49d814e6548bd1cd34c");
                    }
                    String a2 = ListIDHelper.a.a.a("page", com.sankuai.waimai.business.page.home.utils.k.a);
                    return TextUtils.isEmpty(a2) ? "" : a2;
                }
            };
            Object[] objArr4 = {str, arrayList, aVar2, bVar};
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "0b26feb37618cb023b57559379b08739", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "0b26feb37618cb023b57559379b08739");
                return;
            }
            com.sankuai.waimai.platform.dynamic.e eVar = cVar2.c;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.dynamic.e.a;
            if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "9666c79436e9bf0a128cc51a4c20f86f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "9666c79436e9bf0a128cc51a4c20f86f");
            } else {
                com.sankuai.waimai.platform.capacity.log.c.a().a(16001, 0, "homepage_head");
            }
            c.a aVar3 = new c.a(str, arrayList, aVar2, bVar);
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = c.a.a;
            if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "e743ded056be8f13bf79e361a0e77124", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "e743ded056be8f13bf79e361a0e77124");
            } else {
                aVar3.a(aVar3.a(new Void[0]));
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2008930c16b719d4be188959092492", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2008930c16b719d4be188959092492");
        }
        com.meituan.android.cube.pga.block.a aVar = this.c.get(this.f.get(Integer.valueOf(i)).intValue());
        if (aVar instanceof com.sankuai.waimai.business.page.common.arch.a) {
            boolean z = aVar instanceof com.sankuai.waimai.business.page.home.list.future.e;
            if (z) {
                m.a().a("HomeFutureBlock+");
            }
            view = ((com.sankuai.waimai.business.page.common.arch.a) aVar).b(viewGroup);
            if (z) {
                m.a().a("HomeFutureBlock-");
            }
        } else {
            View a2 = aVar.a(viewGroup);
            if (aVar instanceof g) {
                final g gVar = (g) aVar;
                Object[] objArr2 = {gVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "452f6326add1213fc39568f25b256498", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "452f6326add1213fc39568f25b256498");
                } else {
                    gVar.a(new Mach.d() { // from class: com.sankuai.waimai.business.page.home.basal.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.Mach.d
                        public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
                            Object[] objArr3 = {str, map};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a2e53ca1657b245cfecfd8b775640fe", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a2e53ca1657b245cfecfd8b775640fe");
                            } else if (a.this.b != null) {
                                com.sankuai.waimai.business.page.common.util.d.b(a.this.b.getActivity());
                            }
                        }
                    });
                    if (this.h != null) {
                        this.h.d.a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.basal.a.2
                            public static ChangeQuickRedirect a;

                            @Override // android.arch.lifecycle.l
                            public final /* synthetic */ void a(@Nullable Boolean bool) {
                                Boolean bool2 = bool;
                                boolean z2 = true;
                                Object[] objArr3 = {bool2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e21a84bee0d3573c788d5372e0e2c9d2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e21a84bee0d3573c788d5372e0e2c9d2");
                                } else if (bool2 != null) {
                                    g gVar2 = gVar;
                                    boolean booleanValue = bool2.booleanValue();
                                    Object[] objArr4 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
                                    ChangeQuickRedirect changeQuickRedirect4 = g.r;
                                    if (PatchProxy.isSupport(objArr4, gVar2, changeQuickRedirect4, false, "4c0e60ade7e565bf1ce5dd15011e12fe", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, gVar2, changeQuickRedirect4, false, "4c0e60ade7e565bf1ce5dd15011e12fe");
                                    } else if (gVar2.s != null) {
                                        gVar2.s.a(gVar2.v && booleanValue);
                                        gVar2.a((gVar2.v && booleanValue) ? false : false);
                                        gVar2.s.b(booleanValue);
                                    }
                                }
                            }
                        });
                        final com.sankuai.waimai.guidepop.manager.b a3 = com.sankuai.waimai.guidepop.manager.b.a();
                        Object[] objArr3 = {gVar};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.guidepop.manager.b.a;
                        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "d49f63bfa55d595ac003a7fd200618b2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "d49f63bfa55d595ac003a7fd200618b2");
                        } else if (gVar != null) {
                            gVar.a(new h() { // from class: com.sankuai.waimai.guidepop.manager.b.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.platform.dynamic.h
                                public final void a() {
                                }

                                @Override // com.sankuai.waimai.platform.dynamic.h
                                public final void a(int i2, int i3) {
                                    com.sankuai.waimai.mach.node.a l;
                                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4c41ad7386614e7c4f319f59c61cc12f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4c41ad7386614e7c4f319f59c61cc12f");
                                    } else if (gVar.G() != 0) {
                                        b bVar = a3;
                                        String str = ((j) gVar.G()).p;
                                        g gVar2 = gVar;
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = g.r;
                                        if (PatchProxy.isSupport(objArr5, gVar2, changeQuickRedirect5, false, "98430a0f7e502b724aff4ada3250763d", RobustBitConfig.DEFAULT_VALUE)) {
                                            l = (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr5, gVar2, changeQuickRedirect5, false, "98430a0f7e502b724aff4ada3250763d");
                                        } else {
                                            l = gVar2.s != null ? gVar2.s.l() : null;
                                        }
                                        bVar.a(str, l);
                                    }
                                }
                            });
                        }
                    }
                }
            }
            view = a2;
        }
        return new b(aVar, view);
    }

    public final com.sankuai.waimai.business.page.home.list.future.e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33aa3a3db601f1377aaab0cfd58f3681", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.home.list.future.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33aa3a3db601f1377aaab0cfd58f3681");
        }
        if (this.j == null) {
            this.j = new com.sankuai.waimai.business.page.home.list.future.e(this.b);
        }
        return this.j;
    }

    public a(PageFragment pageFragment, e eVar, HomePageNestedScrollRecyclerView homePageNestedScrollRecyclerView) {
        Object[] objArr = {pageFragment, eVar, homePageNestedScrollRecyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247ae8dc382d0d3686e636f18a2c76b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247ae8dc382d0d3686e636f18a2c76b9");
            return;
        }
        this.c = new ArrayList();
        this.f = new HashMap();
        this.g = new c();
        this.b = pageFragment;
        this.i = eVar;
        Object[] objArr2 = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b1c2d67a67d5a3bb08536fe519d5804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b1c2d67a67d5a3bb08536fe519d5804");
            return;
        }
        this.h = (HomePageViewModel) q.a(pageFragment).a(HomePageViewModel.class);
        this.h.b.a(pageFragment, new l<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.page.home.basal.a.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable BaseResponse<String> baseResponse) {
                BaseResponse<String> baseResponse2 = baseResponse;
                Object[] objArr3 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21c1d9978d3947449b2c93dd37a59703", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21c1d9978d3947449b2c93dd37a59703");
                } else if (baseResponse2 == null || baseResponse2.data == null) {
                } else {
                    a.a(a.this, baseResponse2.data);
                }
            }
        });
        this.e = (PromotionBgViewModel) q.a(this.b).a(PromotionBgViewModel.class);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.meituan.android.cube.pga.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.meituan.android.cube.pga.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.meituan.android.cube.pga.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.meituan.android.cube.pga.viewmodel.a] */
    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.s sVar, int i) {
        String str;
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e13d2c885969b00eabef956e4b9ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e13d2c885969b00eabef956e4b9ce0");
        } else if (sVar instanceof b) {
            b bVar = (b) sVar;
            if (bVar.a instanceof com.sankuai.waimai.business.page.common.arch.a) {
                ((com.sankuai.waimai.business.page.common.arch.a) bVar.a).O();
            } else if (bVar.a instanceof g) {
                ((g) bVar.a).y = false;
                bVar.a.B();
            }
            if (bVar.a instanceof com.sankuai.waimai.business.page.home.list.future.e) {
                return;
            }
            HomeGrayManager a2 = HomeGrayManager.a();
            View view = sVar.itemView;
            com.meituan.android.cube.pga.block.a aVar = bVar.a;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cad1af37b8a99222b357a24d92dc226b", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cad1af37b8a99222b357a24d92dc226b");
            } else if ((aVar instanceof MajorCategoryBlock) || !(aVar == null || aVar.G() == 0 || (!TextUtils.equals(aVar.G().l(), "wm_home_head_poi_category") && !TextUtils.equals(aVar.G().k(), "wm_home_head_poi_category")))) {
                str = "wm_home_head_poi_category";
            } else {
                str = ((aVar instanceof com.sankuai.waimai.business.page.home.head.recommendwords.a) || !(aVar == null || aVar.G() == 0 || (!TextUtils.equals(aVar.G().l(), "wm_home_head_hot_search") && !TextUtils.equals(aVar.G().k(), "wm_home_head_hot_search")))) ? "wm_home_head_hot_search" : "";
            }
            a2.a(view, 4, 1, str, i);
        }
    }

    public final com.meituan.android.cube.pga.block.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18725cf98f441cf8a3d8f39aa0b0d92", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18725cf98f441cf8a3d8f39aa0b0d92");
        }
        if (!d.a(this.c) && i < this.c.size()) {
            return this.c.get(i);
        }
        return null;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "027eaba50389177ac0d3e1dd07cadaaa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "027eaba50389177ac0d3e1dd07cadaaa")).intValue();
        }
        if (d.a(this.c)) {
            return 0;
        }
        return this.c.size();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed5f0c26bb3ca61be2a498e0c1d74f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed5f0c26bb3ca61be2a498e0c1d74f4")).intValue();
        }
        int hashCode = this.c.get(i).hashCode();
        this.f.put(Integer.valueOf(hashCode), Integer.valueOf(i));
        return hashCode;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b extends RecyclerView.s {
        public com.meituan.android.cube.pga.block.a a;

        public b(com.meituan.android.cube.pga.block.a aVar, View view) {
            super(view);
            this.a = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.basal.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0770a {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;

        public C0770a() {
        }
    }
}
