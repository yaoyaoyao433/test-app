package com.sankuai.waimai.store.mach.page;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.Pair;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.mach.page.b;
import com.sankuai.waimai.store.mach.page.d;
import com.sankuai.waimai.store.mach.page.mach.MachCommonData;
import com.sankuai.waimai.store.mach.page.mach.f;
import com.sankuai.waimai.store.mach.page.widget.SlidingTabLayout;
import com.sankuai.waimai.store.manager.coupon.b;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.MachBackgroundConfig;
import com.sankuai.waimai.store.repository.model.MachNavigationConfig;
import com.sankuai.waimai.store.repository.model.SimpleTile;
import com.sankuai.waimai.store.repository.model.TileList;
import com.sankuai.waimai.store.repository.model.TileListConfig;
import com.sankuai.waimai.store.repository.model.TileTab;
import com.sankuai.waimai.store.repository.model.TileTabInner;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.an;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelPageLoad;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.functions.i;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MachTilePresenter extends b.a implements b.a {
    public static ChangeQuickRedirect c = null;
    public static boolean e = true;
    final b d;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private BaseTile<BaseModuleDesc, MachNavigationConfig> j;
    private List<SimpleTile<BaseModuleDesc>> k;
    private k l;
    private List<String> m;
    private int n;
    private String o;
    private String p;
    private String q;
    private String r;
    private com.sankuai.waimai.store.mach.page.d<d.a> s;
    private BaseTile<TileList, TileListConfig> t;
    private List<com.sankuai.waimai.store.mach.page.d> u;

    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.sankuai.waimai.store.mach.page.d$a] */
    public static /* synthetic */ com.sankuai.waimai.store.mach.page.d a(TileTab tileTab) {
        Object[] objArr = {tileTab};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b208fd8f30b5d6e9eeb764f2c596d7df", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.mach.page.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b208fd8f30b5d6e9eeb764f2c596d7df");
        }
        if (tileTab == null || tileTab.jsonData == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) tileTab.jsonData.tabList)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < tileTab.jsonData.tabList.size(); i++) {
            TileTabInner.TileTabItem tileTabItem = (TileTabInner.TileTabItem) com.sankuai.shangou.stone.util.a.a((List<Object>) tileTab.jsonData.tabList, i);
            if (tileTabItem != null) {
                arrayList.add(tileTabItem.categoryName);
                arrayList2.add(Integer.valueOf(tileTabItem.categoryCode));
            }
        }
        com.sankuai.waimai.store.mach.page.d dVar = new com.sankuai.waimai.store.mach.page.d();
        dVar.b = 2;
        dVar.d = new d.a((CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]), (Integer[]) arrayList2.toArray(new Integer[arrayList2.size()]), 0);
        return dVar;
    }

    public static /* synthetic */ rx.d a(MachTilePresenter machTilePresenter, final BaseTile baseTile, final Map map, final Map map2) {
        Object[] objArr = {baseTile, map, map2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "3c0009670ca89cb8a4d1992d54655416", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "3c0009670ca89cb8a4d1992d54655416") : rx.d.a((d.a) new d.a<com.sankuai.waimai.store.mach.page.d<MachCommonData>>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.4
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r6v5, types: [T, java.util.HashMap] */
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0714dbc470827598440262577ac5c1e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0714dbc470827598440262577ac5c1e9");
                    return;
                }
                com.sankuai.waimai.store.mach.page.mach.a aVar = new com.sankuai.waimai.store.mach.page.mach.a();
                SCBaseActivity n = MachTilePresenter.this.b.n();
                BaseTile baseTile2 = baseTile;
                Map map3 = map;
                Map map4 = map2;
                String str = MachTilePresenter.this.d.g;
                Object[] objArr3 = {n, baseTile2, map3, map4, str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.mach.page.mach.a.a;
                com.sankuai.waimai.store.mach.page.d dVar = null;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cdbf72480f88db342c02216ad28711d1", RobustBitConfig.DEFAULT_VALUE)) {
                    dVar = (com.sankuai.waimai.store.mach.page.d) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cdbf72480f88db342c02216ad28711d1");
                } else if (n != null && baseTile2 != null) {
                    com.sankuai.waimai.mach.recycler.b bVar = aVar.b;
                    int a2 = g.a((Context) n);
                    com.sankuai.waimai.store.mach.page.d dVar2 = new com.sankuai.waimai.store.mach.page.d();
                    dVar2.b = 4;
                    if (!t.a(baseTile2.sourceId)) {
                        dVar2.c = baseTile2.sourceId;
                        dVar2.d = new HashMap();
                        dVar2.e = baseTile2.layoutInfo;
                        MachCommonData a3 = f.a(dVar2, bVar, n, a2, map3, map4, str);
                        if (a3 != null) {
                            dVar = dVar2.a(a3);
                        }
                    }
                }
                jVar.onNext(dVar);
            }
        });
    }

    public static /* synthetic */ rx.d a(MachTilePresenter machTilePresenter, final String str, final TileList tileList, final Map map) {
        Object[] objArr = {str, tileList, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "c028b5c46c3ecfd0c1d3e99543e886bc", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "c028b5c46c3ecfd0c1d3e99543e886bc") : rx.d.a((d.a) new d.a<List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.6
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d10486f647a2957e413076b7120c351", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d10486f647a2957e413076b7120c351");
                } else {
                    jVar.onNext(new com.sankuai.waimai.store.mach.page.mach.a().a(MachTilePresenter.this.b.n(), str, tileList, map, MachTilePresenter.this.d.g));
                }
            }
        });
    }

    public static /* synthetic */ rx.d a(MachTilePresenter machTilePresenter, final String str, final List list, final Map map) {
        Object[] objArr = {str, list, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "b622f008e934ee3ba78f40a183f024b4", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "b622f008e934ee3ba78f40a183f024b4") : rx.d.a((d.a) new d.a<List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.7
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66aaa56d13890db41c3803ecf1da3bb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66aaa56d13890db41c3803ecf1da3bb6");
                } else {
                    jVar.onNext(new com.sankuai.waimai.store.mach.page.mach.a().a(MachTilePresenter.this.b.n(), str, list, map, MachTilePresenter.this.d.g));
                }
            }
        });
    }

    public static /* synthetic */ rx.d a(MachTilePresenter machTilePresenter, final List list, final Map map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "98c85286e1610c648d399275a61ef011", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "98c85286e1610c648d399275a61ef011") : rx.d.a((d.a) new d.a<List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.5
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r12v7, types: [java.util.Map<java.lang.String, java.lang.Object>, T] */
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                List list2;
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90aa9863e92b5e31115b00ed7811a943", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90aa9863e92b5e31115b00ed7811a943");
                    return;
                }
                com.sankuai.waimai.store.mach.page.mach.a aVar = new com.sankuai.waimai.store.mach.page.mach.a();
                SCBaseActivity n = MachTilePresenter.this.b.n();
                List<SimpleTile> list3 = list;
                Map map2 = map;
                String str = MachTilePresenter.this.d.g;
                Object[] objArr3 = {n, list3, map2, str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.mach.page.mach.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "bc4763a8ce994d4b5e50f6f60f7faf30", RobustBitConfig.DEFAULT_VALUE)) {
                    list2 = (List) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "bc4763a8ce994d4b5e50f6f60f7faf30");
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (n != null && !com.sankuai.waimai.foundation.utils.b.b(list3)) {
                        com.sankuai.waimai.mach.recycler.b bVar = aVar.b;
                        int a2 = g.a((Context) n);
                        for (SimpleTile simpleTile : list3) {
                            if (simpleTile != null && simpleTile.data != 0 && ((BaseModuleDesc) simpleTile.data).jsonData != null) {
                                com.sankuai.waimai.store.mach.page.d dVar = new com.sankuai.waimai.store.mach.page.d();
                                dVar.b = 1;
                                if (!t.a(simpleTile.sourceId)) {
                                    dVar.c = simpleTile.sourceId;
                                } else if (!t.a(((BaseModuleDesc) simpleTile.data).templateId)) {
                                    dVar.c = ((BaseModuleDesc) simpleTile.data).templateId;
                                }
                                dVar.d = ((BaseModuleDesc) simpleTile.data).jsonData;
                                dVar.e = simpleTile.layoutInfo;
                                MachCommonData a3 = f.a(dVar, bVar, n, a2, map2, null, str);
                                if (a3 != null) {
                                    arrayList.add(dVar.a(a3));
                                }
                            }
                        }
                    }
                    list2 = arrayList;
                }
                jVar.onNext(list2);
            }
        });
    }

    public static /* synthetic */ void a(MachTilePresenter machTilePresenter, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "b43ca8f7f4a823df837ff1a49cd63588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "b43ca8f7f4a823df837ff1a49cd63588");
        } else {
            machTilePresenter.u.addAll(list);
        }
    }

    public static /* synthetic */ boolean a(MachTilePresenter machTilePresenter, boolean z) {
        machTilePresenter.i = false;
        return false;
    }

    public static /* synthetic */ Map b(MachTilePresenter machTilePresenter, boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "38ca8e0cae3dc96524603282960199dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "38ca8e0cae3dc96524603282960199dc");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("banner_ad_icon", "http://p0.meituan.net/aichequan/133ad479c38a30dbb0173543f9af2e6e438.png");
        hashMap.put("cat_id", Long.valueOf(machTilePresenter.d.j));
        if (z) {
            if (!com.sankuai.shangou.stone.util.a.b(machTilePresenter.k)) {
                for (SimpleTile<BaseModuleDesc> simpleTile : machTilePresenter.k) {
                    if (simpleTile != null && simpleTile.data != null) {
                        break;
                    }
                }
            }
            z2 = false;
            hashMap.put("total_height", Integer.valueOf(h.b(machTilePresenter.b.n(), h.a(machTilePresenter.b.n(), 78.0f))));
            hashMap.put("status_bar_height", Integer.valueOf(h.b(machTilePresenter.b.n(), u.a())));
            hashMap.put("shadow_height", Integer.valueOf(z2 ? machTilePresenter.d.f : 0));
        }
        hashMap.put("api_stids", machTilePresenter.r);
        hashMap.put("rank_trace_id", machTilePresenter.p);
        hashMap.put("sub_category_name", machTilePresenter.o);
        hashMap.put("sub_category_code", Integer.valueOf(machTilePresenter.n));
        hashMap.put("current_page_start", Integer.valueOf(machTilePresenter.u.size()));
        return hashMap;
    }

    public static /* synthetic */ void b(MachTilePresenter machTilePresenter, com.sankuai.waimai.store.mach.page.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "7f375e32fc1f6dcef2d0089be2709314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "7f375e32fc1f6dcef2d0089be2709314");
        } else if (machTilePresenter.b.e() != null && dVar != null && dVar.d != 0 && !com.sankuai.shangou.stone.util.a.b(((d.a) dVar.d).a)) {
            for (int i = 0; i < ((d.a) dVar.d).a.length; i++) {
                SlidingTabLayout e2 = machTilePresenter.b.e();
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = SlidingTabLayout.a;
                TextView textView = PatchProxy.isSupport(objArr2, e2, changeQuickRedirect2, false, "3ffb03719f35388efc8772622a51d813", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr2, e2, changeQuickRedirect2, false, "3ffb03719f35388efc8772622a51d813") : (TextView) e2.b.getChildAt(i).findViewById(R.id.tv_tab_title);
                if (textView != null) {
                    com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_nh9wxvrk", "b_waimai_29wacx9x_mv", textView, "b_waimai_29wacx9x_mv" + i + textView.getText().hashCode());
                    bVar.a("stid", machTilePresenter.r).a("cat_id", Long.valueOf(machTilePresenter.d.j)).a("index", Integer.valueOf(i)).a("sub_category_code", ((d.a) dVar.d).b[i]).a("sub_category_name", ((d.a) dVar.d).a[i]).a("rank_trace_id", machTilePresenter.p);
                    com.sankuai.waimai.store.expose.v2.b.a().a(machTilePresenter.b.n(), bVar);
                }
            }
        }
    }

    public static /* synthetic */ boolean b(MachTilePresenter machTilePresenter, BaseTile baseTile) {
        Object[] objArr = {baseTile};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "8971dd81818e8a571205dfaae143bd3b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "8971dd81818e8a571205dfaae143bd3b")).booleanValue() : (baseTile == null || baseTile.data == 0 || com.sankuai.shangou.stone.util.a.b(machTilePresenter.m) || machTilePresenter.m.size() <= machTilePresenter.h * (machTilePresenter.g + 1)) ? false : true;
    }

    public static /* synthetic */ Map d(MachTilePresenter machTilePresenter, BaseTile baseTile) {
        MachNavigationConfig machNavigationConfig;
        Object[] objArr = {baseTile};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, machTilePresenter, changeQuickRedirect, false, "a0184f0abddc7a765c2943f35333d5f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, machTilePresenter, changeQuickRedirect, false, "a0184f0abddc7a765c2943f35333d5f8");
        }
        HashMap hashMap = new HashMap();
        if (baseTile != null && (machNavigationConfig = (MachNavigationConfig) baseTile.propsData) != null) {
            hashMap.put("icon_url", machNavigationConfig.iconUrl);
            hashMap.put("search_text", machNavigationConfig.searchText);
        }
        return hashMap;
    }

    public MachTilePresenter(b.InterfaceC1220b interfaceC1220b) {
        super(interfaceC1220b);
        Object[] objArr = {interfaceC1220b};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0428e724e372e0515ee3b319a0b222c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0428e724e372e0515ee3b319a0b222c");
            return;
        }
        this.d = new b();
        this.f = 0;
        this.g = 0;
        this.h = 10;
        this.i = false;
        this.m = new ArrayList();
        this.u = new ArrayList();
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7818240513444a6b8ac8e096218ba50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7818240513444a6b8ac8e096218ba50");
            return;
        }
        b bVar = this.d;
        Intent intent = this.b.n().getIntent();
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "67e91e974d9c5c34c0fb67f1cf9089c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "67e91e974d9c5c34c0fb67f1cf9089c2");
        } else {
            bVar.b = aa.a(intent, "need_location", "need_location", 0);
            bVar.c = aa.c(intent, "backup_url", "backup_url");
            bVar.d = aa.a(intent, "need_refresh", "need_refresh", true);
            bVar.e = aa.a(intent, "need_shopcar", "need_shopcar", false);
            bVar.f = aa.a(intent, "shadow_height", "shadow_height", 0);
            bVar.g = aa.c(intent, "cid", "cid");
            bVar.h = aa.c(intent, "title", "title");
            bVar.i = aa.c(intent, "page_id", "page_id");
            bVar.j = aa.b(intent, "king_kong_code", "king_kong_code");
            bVar.k = aa.b(intent, "search_category_type", "search_category_type");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3e25d8e1f22f9a4543939795dd45269b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3e25d8e1f22f9a4543939795dd45269b");
        } else {
            this.g = 0;
            if (this.d.f > 0) {
                e = true;
            }
            this.b.a(this.d.h, h.a(this.b.n(), this.d.f));
            this.b.a(0, "");
            if (this.d.b == 1 || this.d.b == 2) {
                if (com.sankuai.waimai.store.locate.a.b() != null && this.d.b == 1) {
                    a(false);
                } else {
                    com.sankuai.waimai.store.locate.a.a(this.b.n(), new d(this), true, 3, "dj-f2e8ac938836e20f");
                }
            } else {
                a(false);
            }
        }
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.manager.coupon.b a2 = com.sankuai.waimai.store.manager.coupon.b.a();
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.manager.coupon.b.a;
        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "2b12bf191166f6435e2ef11f16030513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "2b12bf191166f6435e2ef11f16030513");
        } else {
            a2.b.add(this);
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f189ce118441e277082d2145e40d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f189ce118441e277082d2145e40d6e");
            return;
        }
        if (this.l != null) {
            this.l.unsubscribe();
            this.l = null;
        }
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.manager.coupon.b a2 = com.sankuai.waimai.store.manager.coupon.b.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.coupon.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2f3646fa2e5d267998c86f9fc259f8c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2f3646fa2e5d267998c86f9fc259f8c4");
        } else {
            a2.b.remove(this);
        }
        com.sankuai.waimai.store.mach.page.event.f a3 = com.sankuai.waimai.store.mach.page.event.f.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.mach.page.event.f.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "b17045f9820b64e8afb37aa2a823e11a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "b17045f9820b64e8afb37aa2a823e11a");
        } else if (com.sankuai.shangou.stone.util.a.b(a3.b)) {
        } else {
            a3.b.clear();
        }
    }

    @Subscribe
    public void onMachBackChange(com.sankuai.waimai.store.mach.page.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1899ea83edbaaee88822cbd2ddbf1fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1899ea83edbaaee88822cbd2ddbf1fe5");
        } else if (aVar == null || this.b == null || this.b.n() == null) {
        } else {
            this.b.n().finish();
            this.b.n().overridePendingTransition(R.anim.wm_common_slide_in_from_left, R.anim.wm_sc_slide_out_to_right);
        }
    }

    @Subscribe
    public void onMachRenderSuccess(com.sankuai.waimai.store.mach.page.event.g gVar) {
        Pair pair;
        int i = 0;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16166fe93784775936c0a1f6e8d78be7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16166fe93784775936c0a1f6e8d78be7");
        } else if (gVar == null || gVar.a == null) {
        } else {
            List<com.sankuai.waimai.store.mach.page.d> list = this.u;
            com.sankuai.waimai.mach.recycler.c cVar = gVar.a;
            Object[] objArr2 = {list, cVar};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e80e706e53ab203db7c30e84318e771e", RobustBitConfig.DEFAULT_VALUE)) {
                while (true) {
                    if (i >= list.size()) {
                        pair = null;
                        break;
                    }
                    com.sankuai.waimai.store.mach.page.d dVar = list.get(i);
                    if (dVar != null && (dVar.d instanceof CommonMachData) && ((CommonMachData) dVar.d).mItem == cVar) {
                        pair = new Pair(Integer.valueOf(i), (CommonMachData) dVar.d);
                        break;
                    }
                    i++;
                }
            } else {
                pair = (Pair) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e80e706e53ab203db7c30e84318e771e");
            }
            if (pair == null || this.b == null) {
                return;
            }
            this.b.a(((Integer) pair.first).intValue(), pair.second);
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final String c() {
        return this.d.g;
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a31340a5d9ffc6040ba9cf4433fc1efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a31340a5d9ffc6040ba9cf4433fc1efb");
        } else if (this.f == i) {
        } else {
            this.i = true;
            this.f = i;
            this.g = 0;
            b(this.f);
            this.m.clear();
            this.u.clear();
            this.b.bz_();
            this.b.a((List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>) null, false);
            this.b.n().u();
            com.sankuai.waimai.store.manager.judas.b.a("c_waimai_nh9wxvrk", "b_waimai_29wacx9x_mc").a(AppUtil.generatePageInfoKey(this.b.n())).a("stid", this.r).a("cat_id", Long.valueOf(this.d.j)).a("index", Integer.valueOf(this.f)).a("sub_category_code", Integer.valueOf(this.n)).a("sub_category_name", this.o).a("rank_trace_id", this.p).a();
            a(new com.sankuai.waimai.store.base.net.k<a>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    a aVar = (a) obj;
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df02c874db651d394d8dd8bcf4da913e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df02c874db651d394d8dd8bcf4da913e");
                        return;
                    }
                    super.a((AnonymousClass1) aVar);
                    MachTilePresenter.a(MachTilePresenter.this, false);
                    MachTilePresenter.this.b.n().v();
                    MachTilePresenter.this.b.a(aVar.a, aVar.b);
                    MachTilePresenter.a(MachTilePresenter.this, aVar.a);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a713ad566509d1f02ddbe5eda87017a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a713ad566509d1f02ddbe5eda87017a");
                        return;
                    }
                    super.a(bVar);
                    MachTilePresenter.a(MachTilePresenter.this, false);
                    MachTilePresenter.this.b.n().v();
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2e5d5e804660b88020ba6035dc36ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2e5d5e804660b88020ba6035dc36ab");
            return;
        }
        this.b.a(0, "");
        a(true);
    }

    private Map<String, Object> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49df6b2e2a7a767d80bedc286a5fafed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49df6b2e2a7a767d80bedc286a5fafed");
        }
        Intent intent = this.b.n().getIntent();
        Map<String, Object> hashMap = new HashMap<>();
        if (intent.getData() != null) {
            hashMap = an.b(intent.getData().getQuery());
        }
        hashMap.put("king_kong_code", String.valueOf(this.d.j));
        StringBuilder sb = new StringBuilder();
        sb.append(this.n);
        hashMap.put("category_code", sb.toString());
        if (this.m.size() > 0) {
            int min = Math.min((this.g + 1) * this.h, this.m.size());
            ArrayList arrayList = new ArrayList();
            for (int i = this.g * this.h; i < min; i++) {
                arrayList.add(this.m.get(i));
            }
            hashMap.put("item_id_list", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        hashMap.put("s_type", this.q);
        hashMap.put("rank_trace_id", this.p);
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48120157847962ee2d1ab9c546af11f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48120157847962ee2d1ab9c546af11f7");
        } else if (this.i) {
        } else {
            this.i = true;
            this.g++;
            a(new com.sankuai.waimai.store.base.net.k<a>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    a aVar = (a) obj;
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f58a576dc0d0de97f19b7c58cbf33c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f58a576dc0d0de97f19b7c58cbf33c5");
                        return;
                    }
                    super.a((AnonymousClass2) aVar);
                    MachTilePresenter.a(MachTilePresenter.this, false);
                    MachTilePresenter.this.b.bA_();
                    MachTilePresenter.this.b.b(aVar.a, aVar.b);
                    MachTilePresenter.a(MachTilePresenter.this, aVar.a);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17752db2a5c28764dec4f4071753825f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17752db2a5c28764dec4f4071753825f");
                        return;
                    }
                    super.a(bVar);
                    MachTilePresenter.a(MachTilePresenter.this, false);
                    MachTilePresenter.this.b.bA_();
                }
            });
        }
    }

    private void a(@NonNull final com.sankuai.waimai.store.base.net.k<a> kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046a1839f657dcebe861b36192417447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046a1839f657dcebe861b36192417447");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.n().w()).d(this.d.i, i(), new com.sankuai.waimai.store.base.net.k<MachTileResponse>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    MachTileResponse machTileResponse = (MachTileResponse) obj;
                    Object[] objArr2 = {machTileResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d65bb52a28e6caf4bb4cf2a5d915aa5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d65bb52a28e6caf4bb4cf2a5d915aa5");
                        return;
                    }
                    super.a((AnonymousClass3) machTileResponse);
                    if (machTileResponse == null || machTileResponse.blocks == null || machTileResponse.blocks.listBlock == null || machTileResponse.blocks.listBlock.data == null) {
                        MachTilePresenter.this.b.a(MachTilePresenter.this.g == 0);
                        kVar.a(new com.sankuai.waimai.store.repository.net.b(""));
                        return;
                    }
                    MachTilePresenter.this.t = machTileResponse.blocks.listBlock;
                    TileList tileList = machTileResponse.blocks.listBlock.data;
                    if (MachTilePresenter.this.g == 0) {
                        MachTilePresenter.this.p = ((TileList) MachTilePresenter.this.t.data).traceId;
                        MachTilePresenter.this.m.clear();
                        if (tileList.itemIdList != null) {
                            MachTilePresenter.this.m.addAll(tileList.itemIdList);
                        }
                    }
                    if (com.sankuai.shangou.stone.util.a.b(tileList.itemList)) {
                        MachTilePresenter.this.b.a(MachTilePresenter.this.g == 0);
                        kVar.a(new com.sankuai.waimai.store.repository.net.b(""));
                        return;
                    }
                    if (MachTilePresenter.this.l != null) {
                        MachTilePresenter.this.l.unsubscribe();
                    }
                    MachTilePresenter.this.l = MachTilePresenter.a(MachTilePresenter.this, machTileResponse.blocks.listBlock != null ? machTileResponse.blocks.listBlock.sourceId : "", tileList, MachTilePresenter.b(MachTilePresenter.this, false)).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).a((rx.e) new rx.e<List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.3.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final void onCompleted() {
                        }

                        @Override // rx.e
                        public final /* synthetic */ void onNext(List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list) {
                            List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list2 = list;
                            Object[] objArr3 = {list2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e0ad6219e5fdcffd0f79bcc17f87e53c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e0ad6219e5fdcffd0f79bcc17f87e53c");
                                return;
                            }
                            a aVar = new a();
                            aVar.b = MachTilePresenter.b(MachTilePresenter.this, MachTilePresenter.this.t);
                            aVar.a = list2;
                            kVar.a((com.sankuai.waimai.store.base.net.k) aVar);
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr3 = {th};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90ba6bb867ab5d3e1769ed60e32dab08", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90ba6bb867ab5d3e1769ed60e32dab08");
                                return;
                            }
                            MachTilePresenter.this.b.a(MachTilePresenter.this.g == 0);
                            kVar.a(new com.sankuai.waimai.store.repository.net.b(th));
                        }
                    });
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2f49322ab617c059cd43b9ebe2171b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2f49322ab617c059cd43b9ebe2171b7");
                        return;
                    }
                    super.a(bVar);
                    MachTilePresenter.this.b.a(MachTilePresenter.this.g == 0);
                    kVar.a(bVar);
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final long f() {
        return this.d.j;
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final long g() {
        return this.d.k;
    }

    @Override // com.sankuai.waimai.store.mach.page.b.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429a94ad050bd9c8105ce7944a489164", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429a94ad050bd9c8105ce7944a489164")).booleanValue();
        }
        if (this.b == null || this.b.n() == null) {
            return false;
        }
        this.b.n().finish();
        this.b.n().overridePendingTransition(R.anim.wm_common_slide_in_from_left, R.anim.wm_sc_slide_out_to_right);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69b62a00e99ec4f563cc3038d8c3918d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69b62a00e99ec4f563cc3038d8c3918d");
        } else if (this.i) {
        } else {
            this.g = 0;
            this.i = true;
            this.u.clear();
            if (z) {
                this.b.a(0, "");
            }
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.n().w()).c(this.d.i, i(), new AnonymousClass8());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.mach.page.MachTilePresenter$8  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass8 extends com.sankuai.waimai.store.base.net.k<MachTileResponse> {
        public static ChangeQuickRedirect a;

        public AnonymousClass8() {
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final /* synthetic */ void a(Object obj) {
            final MachTileResponse machTileResponse = (MachTileResponse) obj;
            Object[] objArr = {machTileResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac987f710ae29e30b46b93de789f645a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac987f710ae29e30b46b93de789f645a");
                return;
            }
            super.a((AnonymousClass8) machTileResponse);
            if (machTileResponse == null || machTileResponse.blocks == null) {
                MachTilePresenter.this.b.a(4, "");
                return;
            }
            SimpleTile<TileTab> simpleTile = machTileResponse.blocks.tabBlock;
            MachTilePresenter.this.t = machTileResponse.blocks.listBlock;
            List<SimpleTile<BaseModuleDesc>> list = machTileResponse.blocks.banner;
            MachTilePresenter.this.k = list;
            MachTilePresenter.this.j = machTileResponse.blocks.navigation;
            if (MachTilePresenter.this.t != null) {
                MachTilePresenter.this.q = MachTilePresenter.this.t.sType;
                if (MachTilePresenter.this.t.data != 0) {
                    MachTilePresenter.this.p = ((TileList) MachTilePresenter.this.t.data).traceId;
                    MachTilePresenter.this.m.clear();
                    MachTilePresenter.this.m.addAll(((TileList) MachTilePresenter.this.t.data).itemIdList);
                }
            }
            if (machTileResponse.apiExtra != null) {
                MachTilePresenter.this.r = machTileResponse.apiExtra.stids;
            }
            if (simpleTile != null && simpleTile.data != null) {
                MachTilePresenter.this.s = MachTilePresenter.a(simpleTile.data);
                MachTilePresenter.this.b(0);
            }
            rx.d a2 = MachTilePresenter.a(MachTilePresenter.this, MachTilePresenter.this.j, MachTilePresenter.b(MachTilePresenter.this, true), MachTilePresenter.d(MachTilePresenter.this, MachTilePresenter.this.j));
            rx.d a3 = MachTilePresenter.a(MachTilePresenter.this, list, MachTilePresenter.b(MachTilePresenter.this, false));
            rx.d a4 = MachTilePresenter.a(MachTilePresenter.this, MachTilePresenter.this.t != null ? MachTilePresenter.this.t.sourceId : "", MachTilePresenter.this.t != null ? (TileList) MachTilePresenter.this.t.data : null, MachTilePresenter.b(MachTilePresenter.this, false));
            if (MachTilePresenter.this.t == null || MachTilePresenter.this.t.data == 0 || com.sankuai.shangou.stone.util.a.b(((TileList) MachTilePresenter.this.t.data).itemList) || !o.h()) {
                if (MachTilePresenter.this.l != null) {
                    MachTilePresenter.this.l.unsubscribe();
                }
                MachTilePresenter.this.l = rx.d.a(a2, a3, a4, new i<com.sankuai.waimai.store.mach.page.d<MachCommonData>, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>, c>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.8.4
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.i
                    public final /* synthetic */ c a(com.sankuai.waimai.store.mach.page.d<MachCommonData> dVar, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list2, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list3) {
                        com.sankuai.waimai.store.mach.page.d<MachCommonData> dVar2 = dVar;
                        List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list4 = list2;
                        List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list5 = list3;
                        Object[] objArr2 = {dVar2, list4, list5};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc4eeb93540b448d3cd766266f546413", RobustBitConfig.DEFAULT_VALUE)) {
                            return (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc4eeb93540b448d3cd766266f546413");
                        }
                        c cVar = new c();
                        cVar.a = list4;
                        cVar.b = list5;
                        if (machTileResponse.blocks != null && machTileResponse.blocks.background != null) {
                            cVar.d = machTileResponse.blocks.background.propsData;
                        }
                        cVar.e = dVar2;
                        cVar.c = MachTilePresenter.this.s;
                        return cVar;
                    }
                }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).a((rx.e) new rx.e<c>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.8.3
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final void onCompleted() {
                    }

                    @Override // rx.e
                    public final /* synthetic */ void onNext(c cVar) {
                        c cVar2 = cVar;
                        Object[] objArr2 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b115b726b79ba4c8de4e217f50c6fe5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b115b726b79ba4c8de4e217f50c6fe5");
                            return;
                        }
                        MachTilePresenter.a(MachTilePresenter.this, false);
                        MachTilePresenter.this.b.a(3, "");
                        MachTilePresenter.this.b.bA_();
                        if (cVar2 != null && (!com.sankuai.shangou.stone.util.a.b(cVar2.a) || cVar2.c != null || !com.sankuai.shangou.stone.util.a.b(cVar2.b))) {
                            MachTilePresenter.this.b(0);
                            MachTilePresenter.this.b.a(cVar2.c, cVar2.e, cVar2.d, cVar2.a, cVar2.b, MachTilePresenter.b(MachTilePresenter.this, MachTilePresenter.this.t), MachTilePresenter.this.d.d);
                            MachTilePresenter.b(MachTilePresenter.this, cVar2.c);
                            MachTilePresenter.a(MachTilePresenter.this, cVar2.b);
                            return;
                        }
                        MachTilePresenter.this.b.a(4, "");
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr2 = {th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f144cd7674ee9d29f54d7a991af389e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f144cd7674ee9d29f54d7a991af389e");
                        } else {
                            AnonymousClass8.this.a(new com.sankuai.waimai.store.repository.net.b(th));
                        }
                    }
                });
                return;
            }
            int size = ((TileList) MachTilePresenter.this.t.data).itemList.size() / 2;
            rx.d a5 = MachTilePresenter.a(MachTilePresenter.this, MachTilePresenter.this.t.sourceId, ((TileList) MachTilePresenter.this.t.data).itemList.subList(0, size), MachTilePresenter.b(MachTilePresenter.this, false));
            rx.d a6 = MachTilePresenter.a(MachTilePresenter.this, MachTilePresenter.this.t.sourceId, ((TileList) MachTilePresenter.this.t.data).itemList.subList(size, ((TileList) MachTilePresenter.this.t.data).itemList.size()), MachTilePresenter.b(MachTilePresenter.this, false));
            if (MachTilePresenter.this.l != null) {
                MachTilePresenter.this.l.unsubscribe();
            }
            MachTilePresenter.this.l = rx.d.a(a2, a3, a5, a6, new rx.functions.j<com.sankuai.waimai.store.mach.page.d<MachCommonData>, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>>, c>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.8.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.j
                public final /* synthetic */ c a(com.sankuai.waimai.store.mach.page.d<MachCommonData> dVar, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list2, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list3, List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list4) {
                    com.sankuai.waimai.store.mach.page.d<MachCommonData> dVar2 = dVar;
                    List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list5 = list2;
                    List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list6 = list3;
                    List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> list7 = list4;
                    Object[] objArr2 = {dVar2, list5, list6, list7};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1eefa0b535327f3a2aab1b420af993a6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1eefa0b535327f3a2aab1b420af993a6");
                    }
                    c cVar = new c();
                    cVar.a = list5;
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list6);
                    arrayList.addAll(list7);
                    cVar.b = arrayList;
                    if (machTileResponse.blocks != null && machTileResponse.blocks.background != null) {
                        cVar.d = machTileResponse.blocks.background.propsData;
                    }
                    cVar.e = dVar2;
                    cVar.c = MachTilePresenter.this.s;
                    return cVar;
                }
            }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).a((rx.e) new rx.e<c>() { // from class: com.sankuai.waimai.store.mach.page.MachTilePresenter.8.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(c cVar) {
                    c cVar2 = cVar;
                    Object[] objArr2 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81f43d61d5973a7b8689c468807760f4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81f43d61d5973a7b8689c468807760f4");
                        return;
                    }
                    MachTilePresenter.a(MachTilePresenter.this, false);
                    MachTilePresenter.this.b.a(3, "");
                    MachTilePresenter.this.b.bA_();
                    if (cVar2 != null && (!com.sankuai.shangou.stone.util.a.b(cVar2.a) || cVar2.c != null || !com.sankuai.shangou.stone.util.a.b(cVar2.b))) {
                        MachTilePresenter.this.b(0);
                        MachTilePresenter.this.b.a(cVar2.c, cVar2.e, cVar2.d, cVar2.a, cVar2.b, MachTilePresenter.b(MachTilePresenter.this, MachTilePresenter.this.t), MachTilePresenter.this.d.d);
                        MachTilePresenter.b(MachTilePresenter.this, cVar2.c);
                        MachTilePresenter.a(MachTilePresenter.this, cVar2.b);
                        return;
                    }
                    MachTilePresenter.this.b.a(4, "");
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9c6dab732697122d4001a34ab9b2ef9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9c6dab732697122d4001a34ab9b2ef9");
                    } else {
                        AnonymousClass8.this.a(new com.sankuai.waimai.store.repository.net.b(th));
                    }
                }
            });
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db82374970d17d30f199e21f82012ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db82374970d17d30f199e21f82012ad");
                return;
            }
            super.a(bVar);
            MachTilePresenter.a(MachTilePresenter.this, false);
            MachTilePresenter.this.b.a(1, bVar.getMessage());
            MachTilePresenter.this.b.bA_();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "932263d00ed14dfdf816fa6a857b1d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "932263d00ed14dfdf816fa6a857b1d88");
            return;
        }
        if (this.s != null && this.s.d != null && this.s.d.b != null && this.s.d.b.length > 0 && i >= 0 && i < this.s.d.b.length) {
            this.n = this.s.d.b[i].intValue();
        }
        if (this.s == null || this.s.d == null || this.s.d.a == null || this.s.d.a.length <= 0 || i < 0 || i >= this.s.d.a.length || this.s.d.a[i] == null) {
            return;
        }
        this.o = this.s.d.a[i].toString();
    }

    @Override // com.sankuai.waimai.store.manager.coupon.b.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1bfc5cfda131fa3196e5264fdc3941e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1bfc5cfda131fa3196e5264fdc3941e");
        } else {
            this.b.a(poiCouponItem);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> a;
        public boolean b;

        public a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c {
        public List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> a;
        public List<com.sankuai.waimai.store.mach.page.d<MachCommonData>> b;
        public com.sankuai.waimai.store.mach.page.d<d.a> c;
        public MachBackgroundConfig d;
        public com.sankuai.waimai.store.mach.page.d<MachCommonData> e;

        public c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public int b;
        public String c;
        public boolean d;
        public boolean e;
        public int f;
        public String g;
        public String h;
        public String i;
        public long j;
        public long k;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53b3432b8b19b89f5b24d019678e042a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53b3432b8b19b89f5b24d019678e042a");
                return;
            }
            this.b = 0;
            this.c = "";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d implements com.sankuai.waimai.store.i.locate.d {
        public static ChangeQuickRedirect a;
        private WeakReference<MachTilePresenter> b;

        public d(MachTilePresenter machTilePresenter) {
            Object[] objArr = {machTilePresenter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c80ad9b348f866b0ee1e18c963312d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c80ad9b348f866b0ee1e18c963312d");
            } else {
                this.b = new WeakReference<>(machTilePresenter);
            }
        }

        @Override // com.sankuai.waimai.store.i.locate.d
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7e5225e220cbb6d9302de62c8529ced", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7e5225e220cbb6d9302de62c8529ced");
                return;
            }
            MachTilePresenter machTilePresenter = this.b.get();
            if (machTilePresenter != null) {
                machTilePresenter.b.a(1, "定位失败");
            }
            com.sankuai.waimai.store.util.monitor.c.a(SGChannelPageLoad.BrandLocationError, "", "KingKong_Home");
        }

        @Override // com.sankuai.waimai.store.i.locate.a
        public final void a(boolean z, String str, WMLocation wMLocation) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, wMLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c68e521a83b0a6372640aed844cf425", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c68e521a83b0a6372640aed844cf425");
                return;
            }
            MachTilePresenter machTilePresenter = this.b.get();
            if (machTilePresenter != null) {
                machTilePresenter.a(false);
            }
            com.sankuai.waimai.store.util.monitor.c.b(SGChannelPageLoad.BrandLocationSuccess, "", "KingKong_Home");
        }
    }
}
