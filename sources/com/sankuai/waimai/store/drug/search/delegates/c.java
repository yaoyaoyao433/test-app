package com.sankuai.waimai.store.drug.search.delegates;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.search.ui.block.sortfilter.BrandQuickFilterListView;
import com.sankuai.waimai.store.drug.search.ui.block.sortfilter.g;
import com.sankuai.waimai.store.router.c;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.model.BrandFilter;
import com.sankuai.waimai.store.search.model.BrandFilterItem;
import com.sankuai.waimai.store.search.model.SGSearchSortFilterEntity;
import com.sankuai.waimai.store.search.model.SearchFilterTabGroup;
import com.sankuai.waimai.store.search.model.SearchLocation;
import com.sankuai.waimai.store.search.model.TabStyleSortFilterEntity;
import com.sankuai.waimai.store.search.statistics.f;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.search.adapterdelegates.b<TabStyleSortFilterEntity, b> {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    int e;
    SearchShareData f;
    com.sankuai.waimai.store.search.ui.result.b g;
    f h;
    TabStyleSortFilterEntity i;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ b a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46e056c1589d010810c626b07731fd6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46e056c1589d010810c626b07731fd6a");
        }
        com.sankuai.waimai.store.view.f fVar = new com.sankuai.waimai.store.view.f(this.k);
        fVar.setUpwardSticky(true);
        fVar.setDownwardSticky(false);
        fVar.setClipChildren(false);
        fVar.setBackgroundColor(this.k.getResources().getColor(R.color.wm_sc_nox_search_background));
        fVar.setLayoutParams(new RecyclerView.g(-1, -2));
        layoutInflater.inflate(R.layout.wm_drug_search_tab_filter_view, (ViewGroup) fVar, true);
        return new b(fVar);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull TabStyleSortFilterEntity tabStyleSortFilterEntity, @NonNull b bVar, int i) {
        List<SearchFilterTabGroup> list;
        BrandFilter brandFilter;
        byte b2;
        Map<String, Object> map;
        TabStyleSortFilterEntity tabStyleSortFilterEntity2 = tabStyleSortFilterEntity;
        b bVar2 = bVar;
        Object[] objArr = {tabStyleSortFilterEntity2, bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f7178609e584426fc8d9bf004ba868e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f7178609e584426fc8d9bf004ba868e");
            return;
        }
        Object[] objArr2 = {tabStyleSortFilterEntity2, bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "43e18f0e94cf9c73726935328cdd2d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "43e18f0e94cf9c73726935328cdd2d00");
        } else if (tabStyleSortFilterEntity2 == null) {
        } else {
            c.this.i = tabStyleSortFilterEntity2;
            Object[] objArr3 = {tabStyleSortFilterEntity2};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "044c34ad9ba85245f7303a23596e1ec5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "044c34ad9ba85245f7303a23596e1ec5");
            } else {
                Object[] objArr4 = {tabStyleSortFilterEntity2};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "8f4834c120826d974afb1436eb312e6f", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "8f4834c120826d974afb1436eb312e6f");
                } else {
                    list = tabStyleSortFilterEntity2.filterList;
                    if (com.sankuai.shangou.stone.util.a.b(c.this.l.V)) {
                        c.this.l.V = list;
                    } else {
                        list = c.this.l.V;
                    }
                }
                if (!com.sankuai.shangou.stone.util.a.b(list)) {
                    bVar2.c.removeAllViews();
                    bVar2.a(list, tabStyleSortFilterEntity2.getTabDefaultStatus(list), tabStyleSortFilterEntity2.isCodeEqual(list, c.this.l));
                }
            }
            Object[] objArr5 = {tabStyleSortFilterEntity2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect5 = b.a;
            if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "624b95f391dec16da3795f006de0b9cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "624b95f391dec16da3795f006de0b9cd");
            } else {
                bVar2.e.removeAllViews();
                if (com.sankuai.shangou.stone.util.a.b(tabStyleSortFilterEntity2.sortListButton) && com.sankuai.shangou.stone.util.a.b(tabStyleSortFilterEntity2.sortList) && com.sankuai.shangou.stone.util.a.b(tabStyleSortFilterEntity2.priceSortList)) {
                    u.c(bVar2.e);
                } else {
                    u.a(bVar2.e);
                    bVar2.e.addView(bVar2.f.createView(bVar2.e));
                    g gVar = bVar2.f;
                    Object[] objArr6 = {tabStyleSortFilterEntity2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect6 = g.a;
                    if (PatchProxy.isSupport(objArr6, gVar, changeQuickRedirect6, false, "67831e14692fd865b7e3721cc561305f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, gVar, changeQuickRedirect6, false, "67831e14692fd865b7e3721cc561305f");
                    } else {
                        Object[] objArr7 = {tabStyleSortFilterEntity2, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect7 = g.a;
                        if (PatchProxy.isSupport(objArr7, gVar, changeQuickRedirect7, false, "03a162d8ae4f46affbbd5c2021f0b0df", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, gVar, changeQuickRedirect7, false, "03a162d8ae4f46affbbd5c2021f0b0df");
                        } else if (com.sankuai.shangou.stone.util.a.b(tabStyleSortFilterEntity2.sortList) && com.sankuai.shangou.stone.util.a.b(tabStyleSortFilterEntity2.priceSortList)) {
                            u.c(gVar.e);
                        } else {
                            u.a(gVar.e);
                            gVar.e.removeAllViews();
                            if (!com.sankuai.shangou.stone.util.a.b(tabStyleSortFilterEntity2.sortList)) {
                                gVar.a(tabStyleSortFilterEntity2.sortList, SGSearchSortFilterEntity.getSelectItem(tabStyleSortFilterEntity2.sortList, gVar.b.M), false, i);
                            }
                            if (!com.sankuai.shangou.stone.util.a.b(tabStyleSortFilterEntity2.priceSortList)) {
                                gVar.a(tabStyleSortFilterEntity2.priceSortList, SGSearchSortFilterEntity.getSelectItem(tabStyleSortFilterEntity2.priceSortList, gVar.b.M), true, i);
                            }
                        }
                        gVar.a(tabStyleSortFilterEntity2);
                        Object[] objArr8 = {tabStyleSortFilterEntity2};
                        ChangeQuickRedirect changeQuickRedirect8 = g.a;
                        if (PatchProxy.isSupport(objArr8, gVar, changeQuickRedirect8, false, "fb56c3991a82162d8fa8d512cac374f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, gVar, changeQuickRedirect8, false, "fb56c3991a82162d8fa8d512cac374f8");
                        } else {
                            gVar.f.removeAllViews();
                            gVar.f.addView(gVar.g.createView(gVar.f));
                            com.sankuai.waimai.store.drug.search.ui.block.sortfilter.a aVar = gVar.g;
                            Object[] objArr9 = {tabStyleSortFilterEntity2};
                            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.store.drug.search.ui.block.sortfilter.a.a;
                            if (PatchProxy.isSupport(objArr9, aVar, changeQuickRedirect9, false, "4576a45e79131a4ef425398b46a4e025", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, aVar, changeQuickRedirect9, false, "4576a45e79131a4ef425398b46a4e025");
                            } else {
                                aVar.a(tabStyleSortFilterEntity2.isExpose);
                                aVar.a(aVar.c.j());
                            }
                        }
                    }
                }
            }
            Object[] objArr10 = {tabStyleSortFilterEntity2};
            ChangeQuickRedirect changeQuickRedirect10 = b.a;
            if (PatchProxy.isSupport(objArr10, bVar2, changeQuickRedirect10, false, "f6c7ffc5827439a5656502a7a4fb1bd7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, bVar2, changeQuickRedirect10, false, "f6c7ffc5827439a5656502a7a4fb1bd7");
            } else {
                final com.sankuai.waimai.store.drug.search.common.utils.b bVar3 = new com.sankuai.waimai.store.drug.search.common.utils.b(c.this.l);
                final SearchLocation searchLocation = tabStyleSortFilterEntity2.searchLocation;
                View view = bVar2.g;
                Object[] objArr11 = {searchLocation, view};
                ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.store.drug.search.common.utils.b.a;
                if (PatchProxy.isSupport(objArr11, bVar3, changeQuickRedirect11, false, "f2622344b6ed4454f2fe47f2134acd72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, bVar3, changeQuickRedirect11, false, "f2622344b6ed4454f2fe47f2134acd72");
                } else if (view != null) {
                    String d = com.sankuai.waimai.store.locate.a.d();
                    View findViewById = view.findViewById(R.id.ll_addr_area);
                    if (TextUtils.isEmpty(d) || searchLocation == null || !searchLocation.showAddressLocation || searchLocation.addressLocationShowType == -1) {
                        u.c(findViewById);
                    } else {
                        u.a(findViewById);
                        if (!searchLocation.isExposed) {
                            searchLocation.isExposed = true;
                            com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_f6mznhgc_mv").a("cat_id", Integer.valueOf(bVar3.b.z)).a("search_log_id", bVar3.b.q).a("stid", com.sankuai.waimai.store.search.statistics.g.f(bVar3.b)).a("keyword", bVar3.b.h).a("media_type", Integer.valueOf(searchLocation.addressLocationShowType)).a("search_source", Integer.valueOf(bVar3.b.aw)).a("if_med_poi", 0).a();
                        }
                        u.a((TextView) view.findViewById(R.id.search_location_address), d);
                        u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.search.common.utils.b.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object[] objArr12 = {view2};
                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d4625695b8759ee22edcef6c7cef8c40", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d4625695b8759ee22edcef6c7cef8c40");
                                    return;
                                }
                                com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_f6mznhgc_mc").a("cat_id", Integer.valueOf(bVar3.b.z)).a("search_log_id", bVar3.b.q).a("stid", com.sankuai.waimai.store.search.statistics.g.f(bVar3.b)).a("keyword", bVar3.b.h).a("media_type", Integer.valueOf(searchLocation.addressLocationShowType)).a("search_source", Integer.valueOf(bVar3.b.aw)).a("if_med_poi", 0).a();
                                d.a(view2.getContext(), c.j);
                            }
                        }, findViewById);
                    }
                }
            }
            Object[] objArr12 = {tabStyleSortFilterEntity2, bVar2};
            ChangeQuickRedirect changeQuickRedirect12 = b.a;
            if (PatchProxy.isSupport(objArr12, bVar2, changeQuickRedirect12, false, "47b10c61d627cead4fb783388c400a3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, bVar2, changeQuickRedirect12, false, "47b10c61d627cead4fb783388c400a3b");
            } else {
                bVar2.h.removeAllViews();
                bVar2.j = false;
                Object[] objArr13 = {tabStyleSortFilterEntity2};
                ChangeQuickRedirect changeQuickRedirect13 = b.a;
                if (PatchProxy.isSupport(objArr13, bVar2, changeQuickRedirect13, false, "7680a6ae671da7ad2280b6684f5ffd4e", RobustBitConfig.DEFAULT_VALUE)) {
                    brandFilter = (BrandFilter) PatchProxy.accessDispatch(objArr13, bVar2, changeQuickRedirect13, false, "7680a6ae671da7ad2280b6684f5ffd4e");
                } else if (c.this.l.K == null) {
                    bVar2.j = true;
                    bVar2.k = c.this.l.h;
                    brandFilter = tabStyleSortFilterEntity2.mBrandFilter;
                    c.this.l.K = tabStyleSortFilterEntity2.mBrandFilter;
                } else {
                    bVar2.j = false;
                    brandFilter = c.this.l.K;
                }
                BrandFilter brandFilter2 = brandFilter;
                if (brandFilter2 == null) {
                    u.c(bVar2.h);
                } else {
                    u.a(bVar2.h);
                    bVar2.h.addView(bVar2.i.createView(bVar2.h));
                    com.sankuai.waimai.store.drug.search.ui.block.sortfilter.c cVar = bVar2.i;
                    boolean z = bVar2.j;
                    SearchShareData searchShareData = c.this.l;
                    String str = bVar2.k;
                    Object[] objArr14 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect14 = b.a;
                    if (PatchProxy.isSupport(objArr14, bVar2, changeQuickRedirect14, false, "0b9d70cb5018cd023aa28277459d8ef9", RobustBitConfig.DEFAULT_VALUE)) {
                        b2 = ((Boolean) PatchProxy.accessDispatch(objArr14, bVar2, changeQuickRedirect14, false, "0b9d70cb5018cd023aa28277459d8ef9")).booleanValue();
                    } else if ((bVar2.itemView instanceof ViewGroup) && ((ViewGroup) bVar2.itemView).getChildCount() == 0) {
                        b2 = 0;
                    } else {
                        bVar2.i.a(false);
                        b2 = 1;
                    }
                    Object[] objArr15 = {brandFilter2, Byte.valueOf(z ? (byte) 1 : (byte) 0), searchShareData, str, Byte.valueOf(b2)};
                    ChangeQuickRedirect changeQuickRedirect15 = com.sankuai.waimai.store.drug.search.ui.block.sortfilter.c.a;
                    if (PatchProxy.isSupport(objArr15, cVar, changeQuickRedirect15, false, "f16b04194adf2b9dfa2d0515027e6817", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr15, cVar, changeQuickRedirect15, false, "f16b04194adf2b9dfa2d0515027e6817");
                    } else {
                        cVar.e = str;
                        BrandQuickFilterListView brandQuickFilterListView = cVar.b;
                        Object[] objArr16 = {searchShareData};
                        ChangeQuickRedirect changeQuickRedirect16 = com.sankuai.waimai.store.drug.search.ui.block.sortfilter.c.a;
                        if (PatchProxy.isSupport(objArr16, cVar, changeQuickRedirect16, false, "410aa262c601101231e279f253dff14b", RobustBitConfig.DEFAULT_VALUE)) {
                            map = (Map) PatchProxy.accessDispatch(objArr16, cVar, changeQuickRedirect16, false, "410aa262c601101231e279f253dff14b");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("search_log_id", searchShareData.q);
                            hashMap.put("if_med_poi", 0);
                            hashMap.put("cat_id", Integer.valueOf(searchShareData.z));
                            hashMap.put("sec_cat_id", Integer.valueOf(searchShareData.C > 0 ? searchShareData.C : searchShareData.B));
                            hashMap.put("keyword", searchShareData.h);
                            hashMap.put("stid", com.sankuai.waimai.store.search.statistics.g.f(searchShareData));
                            map = hashMap;
                        }
                        brandQuickFilterListView.setCommonLxReportData(map);
                        List<BrandFilterItem> list2 = brandFilter2.mBrandFilterList;
                        Object[] objArr17 = {list2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect17 = com.sankuai.waimai.store.drug.search.ui.block.sortfilter.c.a;
                        if (PatchProxy.isSupport(objArr17, cVar, changeQuickRedirect17, false, "223ce2632935780cca5df259ed6ae0da", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr17, cVar, changeQuickRedirect17, false, "223ce2632935780cca5df259ed6ae0da");
                        } else if (com.sankuai.shangou.stone.util.a.b(list2)) {
                            u.c(cVar.b);
                        } else {
                            BrandQuickFilterListView brandQuickFilterListView2 = cVar.b;
                            Object[] objArr18 = {list2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect18 = BrandQuickFilterListView.a;
                            if (PatchProxy.isSupport(objArr18, brandQuickFilterListView2, changeQuickRedirect18, false, "ec51f525364a12c812973822e5b73786", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr18, brandQuickFilterListView2, changeQuickRedirect18, false, "ec51f525364a12c812973822e5b73786");
                            } else {
                                BrandQuickFilterListView.b bVar4 = brandQuickFilterListView2.b;
                                Object[] objArr19 = {list2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect19 = BrandQuickFilterListView.b.a;
                                if (PatchProxy.isSupport(objArr19, bVar4, changeQuickRedirect19, false, "5750af6a39325ae4ecc9d2426f08f646", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr19, bVar4, changeQuickRedirect19, false, "5750af6a39325ae4ecc9d2426f08f646");
                                } else if (!com.sankuai.shangou.stone.util.a.b(list2)) {
                                    if (z) {
                                        bVar4.e = -1;
                                    }
                                    if (bVar4.d == null) {
                                        bVar4.d = new ArrayList();
                                    }
                                    bVar4.d.clear();
                                    bVar4.d.addAll(list2);
                                    bVar4.notifyDataSetChanged();
                                }
                                if (z) {
                                    brandQuickFilterListView2.scrollToPosition(0);
                                }
                            }
                        }
                        String str2 = brandFilter2.mFilterTips;
                        Object[] objArr20 = {str2, Byte.valueOf(b2)};
                        ChangeQuickRedirect changeQuickRedirect20 = com.sankuai.waimai.store.drug.search.ui.block.sortfilter.c.a;
                        if (PatchProxy.isSupport(objArr20, cVar, changeQuickRedirect20, false, "b349e173ebae5db9cafd6f05c40f56d4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr20, cVar, changeQuickRedirect20, false, "b349e173ebae5db9cafd6f05c40f56d4");
                        } else if (TextUtils.isEmpty(str2) || b2 == 0) {
                            u.c(cVar.c);
                        } else {
                            u.a(cVar.d, str2);
                        }
                    }
                }
            }
            List<SearchFilterTabGroup> list3 = tabStyleSortFilterEntity2.filterList;
            SearchLocation searchLocation2 = tabStyleSortFilterEntity2.searchLocation;
            Object[] objArr21 = {list3, searchLocation2};
            ChangeQuickRedirect changeQuickRedirect21 = b.a;
            if (PatchProxy.isSupport(objArr21, bVar2, changeQuickRedirect21, false, "c3601ed414351e31bc99cb2a9342d15c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr21, bVar2, changeQuickRedirect21, false, "c3601ed414351e31bc99cb2a9342d15c");
            } else if (com.sankuai.shangou.stone.util.a.b(list3) && p.a(searchLocation2)) {
                u.c(bVar2.b);
            } else {
                u.a(bVar2.b);
            }
            c.this.i.isExpose = true;
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* bridge */ /* synthetic */ void a(@NonNull TabStyleSortFilterEntity tabStyleSortFilterEntity, @NonNull f fVar) {
        this.h = fVar;
    }

    public c(Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f44ede0c903e9ef85b6ec0077d45e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f44ede0c903e9ef85b6ec0077d45e4");
            return;
        }
        this.g = bVar;
        this.f = SearchShareData.a(context);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bf32dc3745a0cdc6e5ec909cf90c61c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bf32dc3745a0cdc6e5ec909cf90c61c");
        } else if (this.k == null) {
        } else {
            this.b = h.a(this.k, 2.0f);
            this.c = h.a(this.k, 10.0f);
            this.d = h.a(this.k, 12.0f);
            this.e = h.a(this.k, 20.0f);
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a9e238b87ba16477395e853bd3fb5c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a9e238b87ba16477395e853bd3fb5c")).booleanValue() : str.equals("wm_shangou_drug_merge_sort_quick_filter_v2");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.s implements com.sankuai.waimai.store.search.ui.result.f {
        public static ChangeQuickRedirect a;
        public LinearLayout b;
        public LinearLayout c;
        public TextView d;
        public LinearLayout e;
        public g f;
        View g;
        LinearLayout h;
        public com.sankuai.waimai.store.drug.search.ui.block.sortfilter.c i;
        boolean j;
        String k;

        public b(View view) {
            super(view);
            Object[] objArr = {c.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8346f3f8bf81fb6d1bb8ef87544a6203", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8346f3f8bf81fb6d1bb8ef87544a6203");
                return;
            }
            this.j = false;
            this.b = (LinearLayout) view.findViewById(R.id.tab_container);
            this.g = view.findViewById(R.id.ll_merge_filter_container);
            this.c = (LinearLayout) view.findViewById(R.id.tab_root_view);
            this.d = (TextView) view.findViewById(R.id.search_location_address);
            this.e = (LinearLayout) view.findViewById(R.id.ll_bottom_filter_area);
            this.h = (LinearLayout) view.findViewById(R.id.brand_list_container);
            this.i = new com.sankuai.waimai.store.drug.search.ui.block.sortfilter.c(c.this.k, c.this.g);
            this.f = new g(c.this.k, c.this.h);
            ((com.sankuai.waimai.store.view.f) view).setViewHolder(this);
        }

        void a(@NonNull List<SearchFilterTabGroup> list, boolean z, boolean z2) {
            Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163ff93d33c1dfb5463780866202cb3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163ff93d33c1dfb5463780866202cb3c");
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                View a2 = a(i, 10.0f);
                if (a2 != null) {
                    ImageView imageView = (ImageView) a2.findViewById(R.id.item_v3_image);
                    TextView textView = (TextView) a2.findViewById(R.id.tab_item_content);
                    SearchFilterTabGroup searchFilterTabGroup = (SearchFilterTabGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                    if (searchFilterTabGroup == null || TextUtils.isEmpty(searchFilterTabGroup.selectedItemImage) || TextUtils.isEmpty(searchFilterTabGroup.unSelectItemImage)) {
                        u.c(a2);
                    } else {
                        u.a(a2);
                        a(searchFilterTabGroup, true);
                        a(searchFilterTabGroup.tabTipContent, textView);
                        if (z) {
                            if (searchFilterTabGroup.isHit) {
                                a(searchFilterTabGroup.selectedItemImage, imageView);
                            } else {
                                a(searchFilterTabGroup.unSelectItemImage, imageView);
                            }
                        } else if (z2) {
                            if (TextUtils.equals(searchFilterTabGroup.code, c.this.l.am)) {
                                a(searchFilterTabGroup.selectedItemImage, imageView);
                            } else {
                                a(searchFilterTabGroup.unSelectItemImage, imageView);
                            }
                        } else if (i == 0) {
                            a(searchFilterTabGroup.selectedItemImage, imageView);
                        } else {
                            a(searchFilterTabGroup.unSelectItemImage, imageView);
                        }
                        a2.setOnClickListener(new a(searchFilterTabGroup, a(searchFilterTabGroup.code), true));
                    }
                }
            }
        }

        private View a(int i, float f) {
            Object[] objArr = {Integer.valueOf(i), Float.valueOf(10.0f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc9bde7f9d0ff56846c86e287d35d0fa", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc9bde7f9d0ff56846c86e287d35d0fa");
            }
            View inflate = LayoutInflater.from(c.this.k).inflate(R.layout.wm_drug_search_tab_item_v3_view, (ViewGroup) this.c, false);
            if (inflate == null) {
                return null;
            }
            this.c.addView(inflate, a(inflate, i, 10.0f));
            return inflate;
        }

        private ViewGroup.LayoutParams a(@NonNull View view, int i, float f) {
            Object[] objArr = {view, Integer.valueOf(i), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c9bbb535ca89e37858b3688bb74e1f8", RobustBitConfig.DEFAULT_VALUE)) {
                return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c9bbb535ca89e37858b3688bb74e1f8");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = h.a(c.this.k, f);
                if (i != 0) {
                    marginLayoutParams.leftMargin = h.a(c.this.k, 24.0f);
                } else {
                    marginLayoutParams.leftMargin = h.a(c.this.k, 4.0f);
                }
            }
            return layoutParams;
        }

        private void a(String str, @NonNull ImageView imageView) {
            Object[] objArr = {str, imageView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30243e2396ffb574d016a43d4e06b442", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30243e2396ffb574d016a43d4e06b442");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                m.d(str, c.this.e).a(imageView);
            }
        }

        private void a(@NonNull SearchFilterTabGroup searchFilterTabGroup, boolean z) {
            Object[] objArr = {searchFilterTabGroup, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289b0a67d8b6fe9ca223df84e8eba1e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289b0a67d8b6fe9ca223df84e8eba1e4");
            } else if (c.this.i.isExpose) {
            } else {
                Map<String, Object> a2 = a(searchFilterTabGroup.code);
                a2.put("type", c.this.l.bl + searchFilterTabGroup.groupTitle);
                com.sankuai.waimai.store.manager.judas.b.b(c.this.k, "b_waimai_med_xzszx8qn_mv").b(a2).a();
            }
        }

        private void a(String str, TextView textView) {
            Object[] objArr = {str, textView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3ce5edd4c74c36b51bad88077307f37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3ce5edd4c74c36b51bad88077307f37");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                u.c(textView);
            }
            textView.setText(str);
            textView.setBackground(new e.a().a(c.this.c, c.this.d, c.this.d, c.this.b).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(c.this.k, R.color.wm_sc_nox_search_color_FF7C62), ContextCompat.getColor(c.this.k, R.color.wm_sc_nox_search_color_FF4A26)}).a());
        }

        private Map<String, Object> a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed6e34054467dcf3b2cbe8cb8204b59a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed6e34054467dcf3b2cbe8cb8204b59a");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cat_id", Integer.valueOf(c.this.f.z));
            hashMap.put("keyword", c.this.f.h);
            hashMap.put("search_global_id", c.this.f.r);
            hashMap.put("search_log_id", c.this.f.q);
            hashMap.put("stid", com.sankuai.waimai.store.search.statistics.g.f(c.this.f));
            hashMap.put("tab_code", str);
            hashMap.put("if_med_poi", 0);
            hashMap.put("area_index", 1);
            hashMap.put("sec_cat_id", Integer.valueOf(c.this.f.C > 0 ? c.this.f.C : c.this.f.B));
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.search.ui.result.f
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3b72b42f378d099c36e10a7b6b67c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3b72b42f378d099c36e10a7b6b67c9");
            } else if (this.i == null || this.i.mView == null || this.i.mView.getParent() == null) {
            } else {
                this.i.a(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        public SearchFilterTabGroup b;
        public Map<String, Object> c;
        public boolean d;

        public a(SearchFilterTabGroup searchFilterTabGroup, Map<String, Object> map, boolean z) {
            Object[] objArr = {c.this, searchFilterTabGroup, map, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2301726d90bfdf36d32ea754bea022a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2301726d90bfdf36d32ea754bea022a");
                return;
            }
            this.b = searchFilterTabGroup;
            this.c = map;
            this.d = true;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9580f96f9cfc7935d0960920763a020e", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9580f96f9cfc7935d0960920763a020e");
            } else if (c.this.g == null) {
            } else {
                SearchFilterTabGroup searchFilterTabGroup = this.b;
                Object[] objArr2 = {searchFilterTabGroup};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10fb1c4e46e6af0fa77c5d4c08c21804", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10fb1c4e46e6af0fa77c5d4c08c21804");
                } else {
                    Map<String, Object> map = this.c;
                    if (this.d) {
                        str = c.this.l.bl + searchFilterTabGroup.groupTitle;
                    } else {
                        str = searchFilterTabGroup.groupTitle;
                    }
                    map.put("type", str);
                    com.sankuai.waimai.store.manager.judas.b.a(c.this.k, "b_waimai_med_xzszx8qn_mc").b(map).a();
                }
                if (TextUtils.equals(c.this.l.am, this.b.code)) {
                    return;
                }
                c.this.l.am = this.b.code;
                c.this.g.a(25, c.this.l.am);
            }
        }
    }
}
