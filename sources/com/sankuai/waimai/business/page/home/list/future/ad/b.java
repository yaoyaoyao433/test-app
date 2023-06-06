package com.sankuai.waimai.business.page.home.list.future.ad;

import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.monitor.impl.m;
import com.google.gson.Gson;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.b;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.list.model.b;
import com.sankuai.waimai.business.page.common.list.popuplayer.Config;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.list.future.ad.d;
import com.sankuai.waimai.business.page.home.model.MidAdBanner;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.model.c;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
@DynamicBinder(modelType = MidAdBanner.class, nativeId = {"wm_home_list_platinum_rocks_mach"}, viewModel = c.class)
/* loaded from: classes4.dex */
public class b extends com.sankuai.waimai.rocks.view.block.b<PouchDynamicAd> implements com.sankuai.waimai.business.page.home.head.b, a.b, c.a {
    public static ChangeQuickRedirect r;
    private PageFragment A;
    private boolean B;
    private boolean C;
    private com.sankuai.waimai.pouch.a D;
    private d.a E;
    private d F;
    private com.sankuai.waimai.pouch.model.c G;
    private boolean H;
    private boolean I;
    private final int[] J;
    private PouchDynamicAd K;
    private String L;
    private String M;
    private final l<d.a> N;
    private final l<Boolean> O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private PouchViewModel V;
    private boolean W;
    private b.c X;
    private com.sankuai.waimai.mach.b Y;
    private final com.sankuai.waimai.pouch.unionanim.a Z;
    private final com.sankuai.waimai.pouch.unionanim.a aa;
    private final com.sankuai.waimai.pouch.unionanim.a ab;
    private final com.sankuai.waimai.pouch.unionanim.a ac;
    private final com.sankuai.waimai.pouch.unionanim.a ad;
    private final com.sankuai.waimai.pouch.unionanim.a ae;
    private final HomePageViewModel w;
    private boolean x;
    private List<com.sankuai.waimai.business.page.home.head.c> y;
    private boolean z;

    @Override // com.sankuai.waimai.rocks.view.block.b
    public final /* synthetic */ void d(PouchDynamicAd pouchDynamicAd) {
        PouchDynamicAd pouchDynamicAd2 = pouchDynamicAd;
        Object[] objArr = {pouchDynamicAd2};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf0702256c83c69f89a2f8304729d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf0702256c83c69f89a2f8304729d43");
        } else if (pouchDynamicAd2 == null || TextUtils.isEmpty(pouchDynamicAd2.stringData)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fail_reason", pouchDynamicAd2 == null ? "data is null" : "render data is null");
            } catch (Exception e) {
                e.printStackTrace();
            }
            com.sankuai.waimai.pouch.monitor.e.a(new com.sankuai.waimai.pouch.monitor.d().a("platinum").b("data_error").d(jSONObject.toString()).a(true).b(), (Map<String, String>) null);
        } else if (this.n instanceof c) {
            if (((c) this.n).q != null) {
                a(((c) this.n).q);
            }
            if (this.D != null) {
                if (this.B) {
                    com.sankuai.waimai.pouch.a aVar = this.D;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "24458d9e4ee804b91a7694cd9287d5f8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "24458d9e4ee804b91a7694cd9287d5f8");
                    } else if (aVar.b != null) {
                        aVar.b.h();
                    }
                    this.D.c();
                    this.B = false;
                }
                int i = pouchDynamicAd2.index;
                HashMap hashMap = new HashMap();
                hashMap.put("current_screen", String.valueOf(com.sankuai.waimai.business.page.home.list.a.a().a(com.sankuai.waimai.business.page.home.list.a.d.intValue(), this.u)));
                hashMap.put("first_load_uuid", com.sankuai.waimai.business.page.home.list.a.a().h);
                hashMap.put(RaptorUploaderImpl.LOAD_TYPE, String.valueOf(com.sankuai.waimai.business.page.home.helper.d.a().b));
                if (i != -1) {
                    hashMap.put("api_pos", "P0_" + i);
                    hashMap.put("index", String.valueOf(i));
                }
                hashMap.put("rank_trace_id", this.L);
                hashMap.put("rank_list_id", this.M);
                if (this.D.d != null) {
                    this.D.d.putAll(hashMap);
                } else {
                    this.D.d = hashMap;
                }
                if (i != -1) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("api_pos", "P0_" + i);
                    if (this.D.e != null) {
                        this.D.e.putAll(hashMap2);
                    } else {
                        this.D.e = hashMap2;
                    }
                }
                if (c.r != null && c.r.booleanValue() && this.D != null) {
                    this.D.a((ViewGroup) this.u, pouchDynamicAd2);
                } else if (pouchDynamicAd2 != this.K) {
                    this.D.a(pouchDynamicAd2);
                    this.K = pouchDynamicAd2;
                }
            }
        }
    }

    public static /* synthetic */ PouchDynamicAd a(b bVar, PouchDynamicAd pouchDynamicAd) {
        bVar.K = null;
        return null;
    }

    public static /* synthetic */ void a(b bVar, final com.sankuai.waimai.mach.node.a aVar) {
        ViewGroup viewGroup;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "5b8e82804481ab04d45adeff66f1f061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "5b8e82804481ab04d45adeff66f1f061");
        } else if (aVar == null || aVar.f == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "860771c754569edf7d8d10616eafd424", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "860771c754569edf7d8d10616eafd424");
            } else if (bVar.F == null) {
                if (bVar.E == null) {
                    bVar.E = new d.a();
                }
                bVar.E.a = (ViewGroup) bVar.u;
                bVar.E.d = AppUtil.generatePageInfoKey(bVar.A.getActivity());
                bVar.F = new d(bVar.E);
            }
            final d dVar = bVar.F;
            final d.b bVar2 = new d.b() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.home.list.future.ad.d.b
                public final void a(String str, long j) {
                    Object[] objArr3 = {str, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf52a1fb962c00e3c472655c5987f37e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf52a1fb962c00e3c472655c5987f37e");
                        return;
                    }
                    HashMap hashMap = null;
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i > 0 || !TextUtils.isEmpty(str)) {
                        hashMap = new HashMap();
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                        }
                        if (i > 0) {
                            hashMap.put("poi_id", Long.valueOf(j));
                        }
                    }
                    aVar.f.sendJsEvent("popup_layer_disapear_event", hashMap);
                }
            };
            Object[] objArr3 = {aVar, bVar2};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "b20ed18a6f236ee85dd00d4eab32fce9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "b20ed18a6f236ee85dd00d4eab32fce9");
            } else if (dVar.c == null || (viewGroup = dVar.c.a) == null || aVar == null || aVar.h() == null) {
            } else {
                Object obj = aVar.h().get("popup-layer-data");
                if (obj == null) {
                    obj = aVar.h().get("popupLayerData");
                }
                if (obj instanceof Map) {
                    try {
                        Map<String, Object> map = (Map) obj;
                        com.sankuai.waimai.business.page.home.list.future.mach.d.a().b();
                        Number number = (Number) dVar.a(map, "poi_id", Number.class);
                        long longValue = number == null ? -1L : number.longValue();
                        Number number2 = (Number) dVar.a(map, "card_type_id", Number.class);
                        int intValue = number2 == null ? -1 : number2.intValue();
                        Number number3 = (Number) dVar.a(map, "corner_radius", Number.class);
                        int intValue2 = number3 == null ? 0 : number3.intValue();
                        Number number4 = (Number) dVar.a(map, "horizontal_margin", Number.class);
                        int intValue3 = number4 == null ? 0 : number4.intValue();
                        Object[] objArr4 = {map, FoodDetailNetWorkPreLoader.URI_POI_STR};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        int i = intValue3;
                        String str = null;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "a877d1e844f4ae3da90dbeab0b2ab4bb", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "a877d1e844f4ae3da90dbeab0b2ab4bb");
                        } else if (map != null && map.containsKey(FoodDetailNetWorkPreLoader.URI_POI_STR)) {
                            Object obj2 = map.get(FoodDetailNetWorkPreLoader.URI_POI_STR);
                            if ((obj2 instanceof Number) || (obj2 instanceof String)) {
                                str = obj2.toString();
                            }
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, viewGroup.getHeight());
                        float f = i;
                        layoutParams.leftMargin = g.a(viewGroup.getContext(), f);
                        layoutParams.rightMargin = g.a(viewGroup.getContext(), f);
                        if (dVar.b == null) {
                            dVar.b = new com.sankuai.waimai.business.page.common.list.popuplayer.e();
                        }
                        Config.a aVar2 = new Config.a();
                        aVar2.b = viewGroup;
                        aVar2.c = g.a(viewGroup.getContext(), intValue2);
                        aVar2.d = layoutParams;
                        aVar2.e = intValue;
                        Config.a a = aVar2.a(longValue);
                        a.g = str;
                        a.j = dVar.c.b;
                        a.k = dVar.c.c;
                        a.i = 0;
                        a.l = dVar.c.d;
                        a.h = new com.sankuai.waimai.business.page.common.list.popuplayer.b() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.d.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.page.common.list.popuplayer.b
                            public final void a(String str2, long j, b.a aVar3) {
                                Object[] objArr5 = {str2, new Long(j), aVar3};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8476a1b2403f44302eb8a43a07225223", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8476a1b2403f44302eb8a43a07225223");
                                } else if (bVar2 == null) {
                                } else {
                                    bVar2.a(str2, j);
                                }
                            }
                        };
                        dVar.b.a(a.a());
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.e("PlatinumPopupLayerHelper", "popup-layer-data cast to map failed." + e.getMessage(), new Object[0]);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "652b26373b0b0de4bf4299c6f8907178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "652b26373b0b0de4bf4299c6f8907178");
            return;
        }
        int i = com.sankuai.waimai.foundation.core.lifecycle.b.a().a(bVar.t.hashCode()) ? !z ? 2 : -1 : 1;
        if (i != -1) {
            if (bVar.V != null) {
                bVar.V.b().b((k<Integer>) Integer.valueOf(i));
            }
            if (bVar.D != null) {
                bVar.D.e();
            }
        }
    }

    public static /* synthetic */ void c(b bVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "75edba13ec3b56cab644b46aa990a53b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "75edba13ec3b56cab644b46aa990a53b");
        } else if (bVar.D != null) {
            if (z) {
                if (bVar.V != null) {
                    bVar.V.b().b((k<Integer>) 1);
                }
                bVar.D.c();
                bVar.D.e();
                return;
            }
            bVar.D.i = "change_tab";
            if (bVar.N()) {
                bVar.b("tab_change");
                bVar.D.a();
                bVar.D.d();
            }
        }
    }

    public static /* synthetic */ boolean d(b bVar, boolean z) {
        bVar.B = true;
        return true;
    }

    public static /* synthetic */ void f(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "fe5225fb92192b3477f4e823e6aa7ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "fe5225fb92192b3477f4e823e6aa7ba4");
            return;
        }
        com.sankuai.waimai.business.page.common.superexpose.c.a().b(bVar.Z);
        com.sankuai.waimai.business.page.common.superexpose.c.a().b(bVar.aa);
        com.sankuai.waimai.business.page.common.superexpose.c.a().b(bVar.ab);
        com.sankuai.waimai.business.page.common.superexpose.c.a().b(bVar.ac);
        com.sankuai.waimai.business.page.common.superexpose.c.a().b(bVar.ad);
        com.sankuai.waimai.business.page.common.superexpose.c.a().b(bVar.ae);
    }

    public static /* synthetic */ void o(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3011bcbc9c35c2fe991681cfcfc49e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3011bcbc9c35c2fe991681cfcfc49e46");
        } else {
            bVar.u.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ec75b3ff6135e499b10338b449cf4a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ec75b3ff6135e499b10338b449cf4a0");
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = b.this.u.getLayoutParams();
                    if (layoutParams instanceof RecyclerView.g) {
                        int x = (int) b.this.u.getX();
                        if (x != 0) {
                            RecyclerView.g gVar = (RecyclerView.g) layoutParams;
                            gVar.leftMargin = x * (-1);
                            gVar.rightMargin = ((int) ((g.a(b.this.t) - b.this.u.getWidth()) - b.this.u.getX())) * (-1);
                        }
                        if (b.this.D != null && b.this.D.b() != null && b.this.D.b().getRootNode() != null) {
                            int t = b.this.D.b().getRootNode().t();
                            if (b.this.P != 0) {
                                if (t > g.a(b.this.t, 1.0f)) {
                                    ((RecyclerView.g) layoutParams).topMargin = g.a(b.this.t, b.this.P);
                                } else {
                                    ((RecyclerView.g) layoutParams).topMargin = 0;
                                }
                            }
                            if (b.this.Q != 0) {
                                if (t > g.a(b.this.t, 1.0f)) {
                                    ((RecyclerView.g) layoutParams).bottomMargin = g.a(b.this.t, b.this.Q);
                                } else {
                                    ((RecyclerView.g) layoutParams).bottomMargin = 0;
                                }
                            }
                        } else {
                            RecyclerView.g gVar2 = (RecyclerView.g) layoutParams;
                            gVar2.topMargin = g.a(b.this.t, b.this.P);
                            gVar2.bottomMargin = g.a(b.this.t, b.this.Q);
                        }
                        b.this.u.setLayoutParams(layoutParams);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void p(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "7ed9771526c12e687e3693dfa5620263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "7ed9771526c12e687e3693dfa5620263");
        } else if (bVar.u != null) {
            ViewGroup.LayoutParams layoutParams = bVar.u.getLayoutParams();
            if (layoutParams instanceof RecyclerView.g) {
                RecyclerView.g gVar = (RecyclerView.g) layoutParams;
                gVar.leftMargin = g.a(bVar.t, bVar.R) * (-1);
                gVar.rightMargin = g.a(bVar.t, bVar.S) * (-1);
                bVar.a(gVar);
                bVar.u.setLayoutParams(layoutParams);
            }
        }
    }

    public static /* synthetic */ void x(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "5847d58104bcad9daa550b9a0bfffca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "5847d58104bcad9daa550b9a0bfffca4");
        } else if (bVar.u != null) {
            ViewGroup.LayoutParams layoutParams = bVar.u.getLayoutParams();
            if (layoutParams instanceof RecyclerView.g) {
                bVar.a((RecyclerView.g) layoutParams);
                bVar.u.setLayoutParams(layoutParams);
            }
        }
    }

    public b(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17c8e3ea154ffe55db5e7b049d2a672", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17c8e3ea154ffe55db5e7b049d2a672");
            return;
        }
        this.x = false;
        this.y = new CopyOnWriteArrayList();
        this.B = false;
        this.C = false;
        this.H = false;
        this.J = new int[2];
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = Integer.MIN_VALUE;
        this.U = false;
        this.W = false;
        this.Y = new com.sankuai.waimai.mach.b() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.b
            public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str, view, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54b7ec23019a396d3af3853689190504", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54b7ec23019a396d3af3853689190504")).booleanValue();
                }
                if ("showPopupLayer".equals(str)) {
                    b.a(b.this, aVar2);
                    return true;
                }
                return false;
            }

            @Override // com.sankuai.waimai.mach.b
            public final boolean b(String str, View view, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str, view, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11e09ab0cca63def0c543c9913fb30a7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11e09ab0cca63def0c543c9913fb30a7")).booleanValue();
                }
                if ("showPopupLayer".equals(str)) {
                    b.a(b.this, aVar2);
                    return true;
                }
                return false;
            }
        };
        this.A = (PageFragment) aVar.h();
        this.w = (HomePageViewModel) q.a(this.A).a(HomePageViewModel.class);
        this.N = new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.12
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar2) {
                d.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37294aa2118a0b39424e451193155bb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37294aa2118a0b39424e451193155bb6");
                } else if (aVar3 != null) {
                    switch (AnonymousClass13.a[aVar3.ordinal()]) {
                        case 1:
                            b.a(b.this, b.this.x);
                            return;
                        case 2:
                            if (b.this.D != null) {
                                b.this.D.f();
                                b.this.D.f = null;
                                b.this.D.g = null;
                            }
                            b.this.w.c(false);
                            b.this.w.d.b(b.this.O);
                            b.this.w.f.b(b.this.N);
                            b.f(b.this);
                            com.sankuai.waimai.business.page.common.superexpose.c a2 = com.sankuai.waimai.business.page.common.superexpose.c.a();
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.common.superexpose.c.a;
                            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "81aa26cba438e92f5a35a60d339a4c45", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "81aa26cba438e92f5a35a60d339a4c45");
                                return;
                            }
                            if (a2.b != null) {
                                com.sankuai.waimai.pouch.unionanim.e eVar = a2.b;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.pouch.unionanim.e.a;
                                if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "1010db37f288e3cbb26e956862588f15", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "1010db37f288e3cbb26e956862588f15");
                                } else {
                                    eVar.b = false;
                                    eVar.c = false;
                                    eVar.d = false;
                                    eVar.e = false;
                                    eVar.f.clear();
                                    eVar.g.clear();
                                    eVar.h.clear();
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.pouch.unionanim.e.a;
                                    if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "49bc108a2eeff1ddb44244b3329d2c7a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "49bc108a2eeff1ddb44244b3329d2c7a");
                                    } else if (eVar.j != null) {
                                        eVar.j.clear();
                                        eVar.j = null;
                                    }
                                }
                            }
                            a2.g = false;
                            a2.h.set(0);
                            a2.i = false;
                            a2.f = null;
                            a2.k = false;
                            a2.d = null;
                            a2.e = null;
                            a2.l = null;
                            a2.m = null;
                            return;
                        default:
                            return;
                    }
                }
            }
        };
        this.O = new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.14
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea221e0ef5d5e21a0b7def69127f5cca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea221e0ef5d5e21a0b7def69127f5cca");
                } else if (bool2 == null || b.this.D == null || !bool2.booleanValue()) {
                } else {
                    b.this.D.c();
                    b.this.D.i = "background_to_foreground";
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b15dd1b936a12df8ddd71be9a56351c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b15dd1b936a12df8ddd71be9a56351c");
        } else if (this.b instanceof com.sankuai.waimai.business.page.home.list.future.b) {
            ((com.sankuai.waimai.business.page.home.list.future.b) this.b).u.a(new com.meituan.android.cube.pga.action.b<String>() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(String str) {
                    String str2 = str;
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "93426729200d311182c5ac38c5ef797c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "93426729200d311182c5ac38c5ef797c");
                        return;
                    }
                    if (b.this.E == null) {
                        b.this.E = new d.a();
                    }
                    b.this.E.c = str2;
                    b.this.L = str2;
                }
            });
            ((com.sankuai.waimai.business.page.home.list.future.b) this.b).v.a(new com.meituan.android.cube.pga.action.b<String>() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(String str) {
                    String str2 = str;
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6409236db92edf02b56b05ae7acc7261", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6409236db92edf02b56b05ae7acc7261");
                        return;
                    }
                    if (b.this.E == null) {
                        b.this.E = new d.a();
                    }
                    b.this.E.b = str2;
                    b.this.M = str2;
                }
            });
        }
        this.V = (PouchViewModel) q.a(l()).a(PouchViewModel.class);
        this.Z = new com.sankuai.waimai.pouch.unionanim.a() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final int b() {
                return 4;
            }

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0817b39793df5b0f4ba304ccaddde9c9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0817b39793df5b0f4ba304ccaddde9c9")).booleanValue();
                }
                boolean z = b.this.w.J;
                if (z) {
                    com.sankuai.waimai.business.page.common.superexpose.c.a().a(4);
                }
                return !z;
            }
        };
        this.aa = new com.sankuai.waimai.pouch.unionanim.a() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.16
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final int b() {
                return 5;
            }

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final boolean a() {
                boolean z = false;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c7dc696be922af36d69d04e607482a0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c7dc696be922af36d69d04e607482a0")).booleanValue();
                }
                if (b.this.D != null && b.this.D.b() != null && b.this.D.b().getRootNode() != null && b.this.D.b().getRootNode().t() > 1) {
                    z = true;
                }
                if (!z) {
                    com.sankuai.waimai.business.page.common.superexpose.c.a().a(5);
                }
                return z;
            }
        };
        this.ab = new com.sankuai.waimai.pouch.unionanim.a() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.17
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final int b() {
                return 7;
            }

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2cd5bdf47993f0e1da39c662fb58cb6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2cd5bdf47993f0e1da39c662fb58cb6")).booleanValue();
                }
                boolean z = com.sankuai.waimai.business.page.common.superexpose.c.a().b.c;
                if (!z) {
                    com.sankuai.waimai.business.page.common.superexpose.c.a().a(7);
                }
                return z;
            }
        };
        this.ac = new com.sankuai.waimai.pouch.unionanim.a() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.18
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final int b() {
                return 8;
            }

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a2a14caf71cab12ba0fd8e5762dc2b6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a2a14caf71cab12ba0fd8e5762dc2b6")).booleanValue();
                }
                String str = com.sankuai.waimai.business.page.common.superexpose.c.a().d;
                String str2 = com.sankuai.waimai.business.page.common.superexpose.c.a().e;
                com.sankuai.waimai.foundation.utils.log.a.b("WMUnionTransition", "poiIDSource:%s, poiIDTarget:%s", str, str2);
                boolean equals = TextUtils.equals(str, str2);
                if (!equals) {
                    HashMap hashMap = new HashMap();
                    StringBuilder sb = new StringBuilder();
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(CommonConstant.Symbol.COMMA);
                    if (str2 == null) {
                        str2 = StringUtil.NULL;
                    }
                    sb.append(str2);
                    hashMap.put("poi_id_lists", sb.toString());
                    com.sankuai.waimai.business.page.common.superexpose.c.a().a(8, hashMap);
                }
                return equals;
            }
        };
        this.ad = new com.sankuai.waimai.pouch.unionanim.a() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.19
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final int b() {
                return 9;
            }

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce3252cc9830596c037f43dd5078c712", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce3252cc9830596c037f43dd5078c712")).booleanValue();
                }
                boolean z = com.sankuai.waimai.business.page.common.superexpose.c.a().b.e;
                if (z) {
                    com.sankuai.waimai.business.page.common.superexpose.c.a().a(9);
                }
                return !z;
            }
        };
        this.ae = new com.sankuai.waimai.pouch.unionanim.a() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.20
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final int b() {
                return 10;
            }

            @Override // com.sankuai.waimai.pouch.unionanim.a
            public final boolean a() {
                boolean z = false;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "585ce05b0486533e23d2287ac1ccf283", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "585ce05b0486533e23d2287ac1ccf283")).booleanValue();
                }
                com.sankuai.waimai.pouch.unionanim.e eVar = com.sankuai.waimai.business.page.common.superexpose.c.a().b;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.pouch.unionanim.e.a;
                if (!PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "0c120c86a24b9f9c7cc420dacc62bd47", RobustBitConfig.DEFAULT_VALUE)) {
                    Iterator<String> it = eVar.f.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (eVar.g.containsKey(it.next())) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "0c120c86a24b9f9c7cc420dacc62bd47")).booleanValue();
                }
                if (!z) {
                    com.sankuai.waimai.business.page.common.superexpose.c.a().a(10);
                }
                return z;
            }
        };
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = r;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ea759b1d54583b96bbc82b8063ceb3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ea759b1d54583b96bbc82b8063ceb3d0");
            return;
        }
        com.sankuai.waimai.business.page.common.superexpose.c.a().a(this.Z);
        com.sankuai.waimai.business.page.common.superexpose.c.a().a(this.aa);
        com.sankuai.waimai.business.page.common.superexpose.c.a().a(this.ab);
        com.sankuai.waimai.business.page.common.superexpose.c.a().a(this.ac);
        com.sankuai.waimai.business.page.common.superexpose.c.a().a(this.ad);
        com.sankuai.waimai.business.page.common.superexpose.c.a().a(this.ae);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.list.future.ad.b$13  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass13 {
        public static final /* synthetic */ int[] a = new int[d.a.values().length];

        static {
            try {
                a[d.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.a.ON_ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.sankuai.waimai.rocks.view.block.b, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21c444ed7bc4e31fa0cb824cd839ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21c444ed7bc4e31fa0cb824cd839ee2");
        }
        this.u = LayoutInflater.from(this.t).inflate(R.layout.wm_page_main_head_platinum_banner, viewGroup, false);
        this.u.setTag("ignore_rocks_margin");
        a((com.sankuai.waimai.pouch.a) null);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7e1d3e94d56c3b4baf1685bb152f0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7e1d3e94d56c3b4baf1685bb152f0d4");
        } else {
            this.w.d.a(this.O);
            this.w.e.a(this.A, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.4
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr3 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8472631747b127504f40487465bd5d3c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8472631747b127504f40487465bd5d3c");
                    } else if (bool2 != null) {
                        b.this.x = bool2.booleanValue();
                        b.c(b.this, bool2.booleanValue());
                    }
                }
            });
            this.w.f.a(this.N);
            this.w.k.a(this.A, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.5
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Object[] objArr3 = {bool};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "767f76a0cc1fe03927df1ffdc4340ffc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "767f76a0cc1fe03927df1ffdc4340ffc");
                        return;
                    }
                    b.d(b.this, true);
                    b.this.C = true;
                    b.this.W = false;
                    if (b.this.D != null) {
                        com.sankuai.waimai.pouch.a aVar = b.this.D;
                        Object[] objArr4 = {"startRefresh", null};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.pouch.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "5e1c63539790292548d2fb4aa5c94d55", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "5e1c63539790292548d2fb4aa5c94d55");
                        } else if (aVar.o == null || aVar.o.isEmpty() || TextUtils.isEmpty("startRefresh")) {
                        } else {
                            Iterator<l<Pair<String, Map<String, Object>>>> it = aVar.o.iterator();
                            while (it.hasNext()) {
                                it.next().a(new Pair<>("startRefresh", null));
                            }
                        }
                    }
                }
            });
            this.w.h.a(this.A, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.6
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Integer num) {
                    Integer num2 = num;
                    Object[] objArr3 = {num2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c7f76f54d30f02f5c5c72bef2c490a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c7f76f54d30f02f5c5c72bef2c490a1");
                    } else if (num2 == null || num2.intValue() != 0) {
                    } else {
                        boolean N = b.this.N();
                        if (!N || b.this.I) {
                            if (!N && b.this.I) {
                                com.sankuai.waimai.foundation.utils.log.a.b("PlatinumBannerRocksBlock", "in screen -> out", new Object[0]);
                                if (b.this.D != null) {
                                    b.this.D.e();
                                }
                            }
                        } else {
                            com.sankuai.waimai.foundation.utils.log.a.b("PlatinumBannerRocksBlock", "out of screen -> enter", new Object[0]);
                            if (b.this.D != null) {
                                b.this.D.d();
                                if (b.this.H) {
                                    b.this.b("scroll_in");
                                    b.this.D.a();
                                    b.this.H = false;
                                }
                            }
                        }
                        b.this.I = N;
                    }
                }
            });
            this.w.i.a(this.A, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.7
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Integer num) {
                    Integer num2 = num;
                    Object[] objArr3 = {num2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e681c0720a06430ef7927153cd59e5d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e681c0720a06430ef7927153cd59e5d1");
                    } else if (num2 != null && b.this.U && num2.intValue() == b.this.T) {
                        com.sankuai.waimai.business.page.common.superexpose.c.a().d();
                        b.this.w.b();
                        b.this.U = false;
                    }
                }
            });
        }
        return this.u;
    }

    @Override // com.sankuai.waimai.rocks.view.block.b, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7308e5daa3326ca8cf8495ec268667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7308e5daa3326ca8cf8495ec268667");
            return;
        }
        if (aVar != null && aVar.j() != null) {
            this.P = aVar.j().a;
            this.Q = aVar.j().b;
        }
        com.sankuai.waimai.rocks.model.a aVar2 = this.w.U;
        if (aVar2 != null) {
            this.R = aVar2.e;
            this.S = aVar2.f;
        }
        if (aVar != null && this.D != null && this.D.g() != null) {
            try {
                this.D.g().v();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.D != null && this.D.b() != null && !this.B) {
            this.D.b().sendJsEvent("platinum_update_view_model", null);
        }
        super.a(aVar);
        this.z = false;
    }

    private void a(@Nullable com.sankuai.waimai.pouch.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c242a5729e99f2660cfec632f767547e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c242a5729e99f2660cfec632f767547e");
            return;
        }
        this.G = new com.sankuai.waimai.pouch.model.c();
        this.G.f = "waimai";
        this.G.a = AppUtil.generatePageInfoKey(bC_().b());
        this.G.e = "platinum";
        this.G.b = "c_m84bv26";
        this.G.c = "首页_0";
        this.G.d = this.A.q();
        HashMap hashMap = new HashMap();
        hashMap.put("position", "homepage");
        hashMap.put("rank_list_id", this.M);
        hashMap.put("rank_trace_id", this.L);
        this.G.h = hashMap;
        this.G.j = this;
        if (aVar == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("waimai_common_report_procedure");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("platinum-video");
            arrayList2.add("tile-swiper");
            arrayList2.add("dessert-drink-link");
            com.sankuai.waimai.pouch.plugin.b bVar = new com.sankuai.waimai.pouch.plugin.b();
            bVar.b = arrayList;
            bVar.a = arrayList2;
            a.C1112a c1112a = new a.C1112a();
            c1112a.c = (ViewGroup) this.u;
            c1112a.b = this.t;
            c1112a.f = this.Y;
            c1112a.g = bVar;
            c1112a.d = this.G;
            this.D = c1112a.a();
        } else {
            this.D = aVar;
            this.D.a(this.G);
            this.D.a(this.Y);
        }
        this.D.n = this;
        this.D.f = new AnonymousClass8();
        this.D.g = new com.sankuai.waimai.pouch.view.d() { // from class: com.sankuai.waimai.business.page.home.list.future.ad.b.9
            public static ChangeQuickRedirect a;

            private void a(Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94e98d62ee5c7d5d6a5707c730333604", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94e98d62ee5c7d5d6a5707c730333604");
                } else if (map != null) {
                    try {
                        if (map.containsKey("wmCptBanner")) {
                            Map map2 = (Map) map.get("wmCptBanner");
                            if (map2.containsKey("chargeInfo")) {
                                map2.remove("chargeInfo");
                                map.put("wmCptBanner", map2);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }

            @Override // com.sankuai.waimai.pouch.view.d
            public final void a(String str) {
                MidAdBanner e;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9eab18b442a7bd3f0177e584b66a34b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9eab18b442a7bd3f0177e584b66a34b");
                    return;
                }
                try {
                    if (!(b.this.n instanceof c) || (e = ((c) b.this.n).e()) == null) {
                        return;
                    }
                    String str2 = null;
                    MidAdBanner midAdBanner = new MidAdBanner();
                    if (!TextUtils.isEmpty(e.stringData)) {
                        str2 = e.adTemplateId;
                        Map<String, Object> b = com.sankuai.waimai.pouch.util.c.b(e.stringData);
                        a(b);
                        midAdBanner.stringData = com.sankuai.waimai.pouch.util.c.a(b);
                        midAdBanner.adTemplateId = e.adTemplateId;
                        midAdBanner.adContainerId = e.adContainerId;
                        midAdBanner.defaultID = e.defaultID;
                        midAdBanner.businessName = e.businessName;
                    } else {
                        a aVar2 = e.dynamicPlatinumBanner;
                        if (aVar2 != null) {
                            str2 = aVar2.adTemplateId;
                            Map<String, Object> b2 = com.sankuai.waimai.pouch.util.c.b(aVar2.a);
                            a(b2);
                            a aVar3 = new a();
                            aVar3.a = com.sankuai.waimai.pouch.util.c.a(b2);
                            midAdBanner.dynamicPlatinumBanner = aVar3;
                        }
                    }
                    String json = new Gson().toJson(midAdBanner);
                    if (str2 == null || json == null) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("fail_reason", str);
                    jSONObject.put("original_data", json);
                    com.sankuai.waimai.pouch.monitor.c.a("waimai_platinum_load_module", "template_load_fail", jSONObject.toString(), true);
                } catch (Exception unused) {
                }
            }
        };
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.list.future.ad.b$8  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass8 implements com.sankuai.waimai.pouch.view.c {
        public static ChangeQuickRedirect a;

        public AnonymousClass8() {
        }

        @Override // com.sankuai.waimai.pouch.view.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f909f06f01e09c34f6c5529a710a45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f909f06f01e09c34f6c5529a710a45");
                return;
            }
            if (b.this.R == 0 && b.this.S == 0) {
                b.o(b.this);
            } else {
                b.p(b.this);
            }
            b.this.D.a(b.this.w.p.a());
        }

        @Override // com.sankuai.waimai.pouch.view.c
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b27a0a442aeac36a8ffd758ad469cfc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b27a0a442aeac36a8ffd758ad469cfc");
            } else {
                b.a(b.this, (PouchDynamicAd) null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
        @Override // com.sankuai.waimai.pouch.view.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c() {
            /*
                Method dump skipped, instructions count: 495
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.list.future.ad.b.AnonymousClass8.c():void");
        }
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final boolean ar_() {
        return this.z;
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f3e141e96cbfbd74ab8314bfaeeea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f3e141e96cbfbd74ab8314bfaeeea9");
            return;
        }
        super.y();
        if (this.D != null) {
            if (this.D.i == null) {
                this.D.i = "first_show";
            }
            b("trigger_by_rocks");
            this.D.a();
            this.D.d();
        }
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final void a(com.sankuai.waimai.business.page.home.head.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52935574d10e1c12ee66ed30fe3114f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52935574d10e1c12ee66ed30fe3114f0");
        } else if (this.y.contains(cVar)) {
        } else {
            this.y.add(cVar);
        }
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final void b(com.sankuai.waimai.business.page.home.head.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46135f846aa399531f65a9693089c13c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46135f846aa399531f65a9693089c13c");
        } else if (this.y.contains(cVar)) {
            this.y.remove(cVar);
        }
    }

    private void a(RecyclerView.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c77619d53fa8b9acaf5941a6c6bab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c77619d53fa8b9acaf5941a6c6bab3");
        } else if (this.D != null && this.D.b() != null && this.D.b().getRootNode() != null) {
            int t = this.D.b().getRootNode().t();
            if (this.P != 0) {
                if (t <= g.a(this.t, 1.0f)) {
                    gVar.topMargin = 0;
                } else {
                    gVar.topMargin = g.a(this.t, this.P);
                }
            }
            if (this.Q != 0) {
                if (t <= g.a(this.t, 1.0f)) {
                    gVar.bottomMargin = 0;
                } else {
                    gVar.bottomMargin = g.a(this.t, this.Q);
                }
            }
        } else {
            gVar.topMargin = g.a(this.t, this.P);
            gVar.bottomMargin = g.a(this.t, this.Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1110f6eeb055afcf1b9547486dc71352", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1110f6eeb055afcf1b9547486dc71352")).booleanValue();
        }
        Rect a = this.w.p.a();
        if (this.u == null || a == null) {
            return false;
        }
        this.u.getLocationInWindow(this.J);
        int i = this.J[0];
        int i2 = this.J[1];
        if (i == 0 && i2 == 0) {
            return false;
        }
        return Rect.intersects(new Rect(i, i2, this.u.getWidth() + i, this.u.getHeight() + i2), a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "861472de8b80f7fc5c2ed44be62dad64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "861472de8b80f7fc5c2ed44be62dad64");
            return;
        }
        try {
            new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("home_platinum_expose_trigger", Collections.singletonList(Float.valueOf(1.0f))).a("is_pre_render", c.r.booleanValue() ? "1" : "0").a("trigger_reason", str).a("template_id", this.v == 0 ? "unknown" : ((PouchDynamicAd) this.v).adTemplateId).a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.platform.b.A().i()).a();
        } catch (Throwable unused) {
        }
    }

    private b.c O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455fe257f1d8d1cc09b37e91445cadba", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455fe257f1d8d1cc09b37e91445cadba");
        }
        if (this.X != null) {
            return this.X;
        }
        if (F() instanceof com.sankuai.waimai.ad.b) {
            this.X = ((com.sankuai.waimai.ad.b) F()).at_();
        }
        return this.X;
    }

    @Override // com.sankuai.waimai.pouch.a.b
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d5bd821c3b481f66a5994637f4a9f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d5bd821c3b481f66a5994637f4a9f45");
        } else if (map == null || !(this.n instanceof c)) {
        } else {
            c cVar = (c) this.n;
            if (cVar.g != null) {
                cVar.g.put("interactiveCardId", map.get("data_id_list"));
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.model.c.a
    public final Map<String, Map<String, Object>> M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50568b94356ec2f31bd78c1b2d105d1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50568b94356ec2f31bd78c1b2d105d1c");
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (O() != null && this.D != null && this.D.b() != null && this.D.b().getRootNode() != null) {
            List<String> list = O().p.a(this.D.b().getRootNode()).b;
            if (list != null && list.size() > 0) {
                hashMap2.put("poi_id_list", com.sankuai.waimai.foundation.utils.k.a().toJson(list));
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("msg", "poi_id_list is null");
                    HashMap hashMap3 = new HashMap();
                    String str = StringUtil.NULL;
                    if (this.n instanceof c) {
                        MidAdBanner e = ((c) this.n).e();
                        if (!TextUtils.isEmpty(e.stringData)) {
                            str = e.adTemplateId;
                        } else {
                            a aVar = e.dynamicPlatinumBanner;
                            if (aVar != null) {
                                str = aVar.adTemplateId;
                            }
                        }
                    }
                    hashMap3.put("templateId", str);
                    com.sankuai.waimai.pouch.monitor.e.a(new com.sankuai.waimai.pouch.monitor.d().a("platinum_module").b("get_future_data_error").d(jSONObject.toString()).a(true).b(), hashMap3);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            String str2 = "";
            WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
            if (k != null && k.hasAddress()) {
                str2 = k.getAddress();
            }
            hashMap2.put("address_plaintext", str2);
        }
        hashMap.put("alita-intention", hashMap2);
        return hashMap;
    }
}
