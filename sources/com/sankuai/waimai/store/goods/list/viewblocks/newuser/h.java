package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.goods.list.model.SGNewUserOptModel;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.d;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor.SGNewUserRaptorEvent;
import com.sankuai.waimai.store.mrn.SGUtilsModule;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandPoisResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.util.SGLocationUtils;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends d.a implements com.sankuai.waimai.store.i.locate.b {
    public static ChangeQuickRedirect c = null;
    public static int h = 1;
    public static int i = 2;
    public static int j = 3;
    public static int k = 4;
    public static int l = 5;
    public static int m = 1;
    public static int n = 2;
    public static int o = 3;
    public static int p = 4;
    public static int q = 5;
    public static int r = 999;
    public static int s = 0;
    public static int t = 1;
    public static int u = 2;
    public static int v = 3;
    public static int w = 0;
    public static int x = 1;
    public static int y = 2;
    l<WMLocation> A;
    l<WmAddress> B;
    public int C;
    public int D;
    public String E;
    public HashMap<Integer, c> F;
    private com.sankuai.waimai.store.pagingload.c<b, b> G;
    private final HashMap<String, com.sankuai.waimai.mach.recycler.b> H;
    private WMLocation I;
    private String J;
    private HashMap<Integer, Integer> K;
    private SGNewUserLandPoisResponse L;
    private boolean M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private boolean S;
    private boolean T;
    private long U;
    private SGNewUserLandResponse.ProductList V;
    g d;
    final Set e;
    HashMap<String, Object> f;
    public int g;
    String z;

    public static /* synthetic */ l a(h hVar, l lVar) {
        hVar.A = null;
        return null;
    }

    public static /* synthetic */ g a(h hVar, int i2, b bVar) {
        Object[] objArr = {0, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "8aea3df016181dfe184fbd1639782074", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "8aea3df016181dfe184fbd1639782074");
        }
        if (hVar.d == null) {
            hVar.d = new g(hVar.b.a(), new com.sankuai.waimai.store.poilist.mach.g(hVar.b.a(), hVar.b.a().b(), hVar.e), "supermrket", new com.sankuai.waimai.mach.recycler.b("supermarket"));
        }
        hVar.d.c = 0;
        hVar.d.d = bVar;
        return hVar.d;
    }

    public static /* synthetic */ void a(h hVar, SGNewUserLandResponse.ProductList productList, List list) {
        Object[] objArr = {productList, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "6e571ea98974371e502cddd776e0c00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "6e571ea98974371e502cddd776e0c00c");
        } else if (com.sankuai.shangou.stone.util.a.b(list) || productList.extraInfo == null || t.a(productList.extraInfo.strategyId)) {
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null) {
                    bVar.d = productList.extraInfo.strategyId;
                }
            }
        }
    }

    public static /* synthetic */ void a(h hVar, SGNewUserLandResponse sGNewUserLandResponse, int i2, int i3) {
        List<b> list;
        b bVar;
        Object[] objArr = {sGNewUserLandResponse, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "908bb47fb23ef64d473a0fbd4c599052", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "908bb47fb23ef64d473a0fbd4c599052");
            return;
        }
        if (!t.a(sGNewUserLandResponse.hasNewProduct)) {
            hVar.z = com.sankuai.shangou.stone.util.f.c(sGNewUserLandResponse.hasNewProduct) > 0.0f ? "1" : "0";
        }
        hVar.C = sGNewUserLandResponse.locateModuleType;
        hVar.D = sGNewUserLandResponse.light_type;
        hVar.E = sGNewUserLandResponse.undertake;
        hVar.Q = sGNewUserLandResponse.actPageCode;
        hVar.R = sGNewUserLandResponse.homepageScheme;
        hVar.b.a(sGNewUserLandResponse);
        hVar.b.b(sGNewUserLandResponse);
        hVar.b.a(sGNewUserLandResponse, sGNewUserLandResponse.sideBarEntry);
        hVar.P = sGNewUserLandResponse.isNewUser;
        if (i3 == y && !t.a(hVar.P) && TextUtils.equals(hVar.P, "0")) {
            am.a((Activity) hVar.b.a(), "您是老朋友，无法享受新用户优惠呦");
        }
        hVar.b.a(sGNewUserLandResponse.callBackInfo);
        Object[] objArr2 = {sGNewUserLandResponse};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "91e5846dd060642f9c8454ba8e9dd444", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "91e5846dd060642f9c8454ba8e9dd444");
        } else {
            ArrayList arrayList = new ArrayList();
            Object[] objArr3 = {sGNewUserLandResponse};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "41cff05b9fbf06da0f02f3f1ad639b70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "41cff05b9fbf06da0f02f3f1ad639b70");
            } else {
                SGNewUserLandResponse.ExtraInfo extraInfo = null;
                if (sGNewUserLandResponse.majorProducts != null && sGNewUserLandResponse.majorProducts.extraInfo != null) {
                    extraInfo = sGNewUserLandResponse.majorProducts.extraInfo;
                }
                if (extraInfo != null && !t.a(extraInfo.strategyId)) {
                    hVar.O = extraInfo.strategyId;
                }
                if (sGNewUserLandResponse.hotsaleProducts != null && sGNewUserLandResponse.hotsaleProducts.extraInfo != null) {
                    extraInfo = sGNewUserLandResponse.hotsaleProducts.extraInfo;
                }
                if (extraInfo != null && !t.a(extraInfo.strategyId)) {
                    hVar.O = extraInfo.strategyId;
                }
                if (sGNewUserLandResponse.normalProducts != null && sGNewUserLandResponse.normalProducts.extraInfo != null) {
                    extraInfo = sGNewUserLandResponse.normalProducts.extraInfo;
                }
                if (sGNewUserLandResponse.hotsaleTabProducts != null && sGNewUserLandResponse.hotsaleTabProducts.extraInfo != null) {
                    extraInfo = sGNewUserLandResponse.hotsaleTabProducts.extraInfo;
                }
                if (extraInfo != null && !t.a(extraInfo.strategyId)) {
                    hVar.O = extraInfo.strategyId;
                }
            }
            if (sGNewUserLandResponse.marJorTitle != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(sGNewUserLandResponse.marJorTitle);
                arrayList.addAll(hVar.a(arrayList2, 1, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, m, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.majorProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.majorProducts.products)) {
                arrayList.addAll(hVar.a(sGNewUserLandResponse.majorProducts.products, hVar.a(sGNewUserLandResponse.majorProducts, m, 2), com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, m, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.majorProducts != null && sGNewUserLandResponse.majorProducts.extraInfo != null && sGNewUserLandResponse.majorProducts.extraInfo.morePage) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new BaseModuleDesc());
                arrayList.addAll(hVar.a(arrayList3, 3, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, m, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.majorProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.majorProducts.currentIds) && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.majorProducts.ids)) {
                hVar.f.put("major_current_ids", sGNewUserLandResponse.majorProducts.currentIds);
                hVar.f.put("major_ids", sGNewUserLandResponse.majorProducts.ids);
                hVar.a(1, true);
            }
            if (sGNewUserLandResponse.hotsaleTitle != null) {
                hVar.a(sGNewUserLandResponse, arrayList);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(sGNewUserLandResponse.hotsaleTitle);
                arrayList.addAll(hVar.a(arrayList4, 4, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, n, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.hotsaleTab != null) {
                hVar.a(sGNewUserLandResponse, arrayList);
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(sGNewUserLandResponse.hotsaleTab);
                arrayList.addAll(hVar.a(arrayList5, 16, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, n, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.hotsaleTitle == null && sGNewUserLandResponse.hotsaleTab == null && (bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, com.sankuai.shangou.stone.util.a.c(arrayList) - 1)) != null && bVar.q == 3) {
                bVar.o = true;
            }
            if (sGNewUserLandResponse.hotsaleTabProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.hotsaleTabProducts.products)) {
                b bVar2 = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, com.sankuai.shangou.stone.util.a.a((List) arrayList) - 1);
                if (bVar2 != null && bVar2.q == 16 && sGNewUserLandResponse.hotsaleTabProducts.extraInfo != null) {
                    bVar2.n.pageTraceId = sGNewUserLandResponse.hotsaleTabProducts.extraInfo.pageTraceId;
                    bVar2.n.hasNext = sGNewUserLandResponse.hotsaleTabProducts.extraInfo.hasNext;
                }
                arrayList.addAll(hVar.a(sGNewUserLandResponse.hotsaleTabProducts.products, 5, com.sankuai.shangou.stone.util.a.a((List) arrayList), 2, q, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.hotsaleProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.hotsaleProducts.products)) {
                arrayList.addAll(hVar.a(sGNewUserLandResponse.hotsaleProducts.products, 5, com.sankuai.shangou.stone.util.a.a((List) arrayList), 2, n, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.hotsaleProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.hotsaleProducts.currentIds) && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.hotsaleProducts.ids)) {
                hVar.f.put("detonate_current_ids", sGNewUserLandResponse.hotsaleProducts.currentIds);
                hVar.f.put("detonate_ids", sGNewUserLandResponse.hotsaleProducts.ids);
                hVar.a(2, true);
            }
            if (sGNewUserLandResponse.hotsaleTabProducts != null && sGNewUserLandResponse.hotsaleTabProducts.extraInfo != null && sGNewUserLandResponse.hotsaleTabProducts.extraInfo.hasNext) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new BaseModuleDesc());
                arrayList.addAll(hVar.a(arrayList6, 17, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, q, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.hotsaleProducts != null && sGNewUserLandResponse.hotsaleProducts.extraInfo != null && sGNewUserLandResponse.hotsaleProducts.extraInfo.morePage) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(new BaseModuleDesc());
                arrayList.addAll(hVar.a(arrayList7, 6, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, n, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.normalTitle != null) {
                ArrayList arrayList8 = new ArrayList();
                arrayList8.add(sGNewUserLandResponse.normalTitle);
                arrayList.addAll(hVar.a(arrayList8, 7, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, o, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.couponInfo != null) {
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(sGNewUserLandResponse.couponInfo);
                arrayList.addAll(hVar.a(arrayList9, 10, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, o, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.normalProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.normalProducts.products)) {
                arrayList.addAll(hVar.a(sGNewUserLandResponse.normalProducts.products, 8, com.sankuai.shangou.stone.util.a.a((List) arrayList), 3, o, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.normalProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.normalProducts.currentIds) && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.normalProducts.ids)) {
                hVar.f.put("triple_current_ids", sGNewUserLandResponse.normalProducts.currentIds);
                hVar.f.put("triple_ids", sGNewUserLandResponse.normalProducts.ids);
                hVar.a(3, true);
            }
            if (sGNewUserLandResponse.normalProducts != null && sGNewUserLandResponse.normalProducts.extraInfo != null && sGNewUserLandResponse.normalProducts.extraInfo.morePage) {
                ArrayList arrayList10 = new ArrayList();
                arrayList10.add(new BaseModuleDesc());
                arrayList.addAll(hVar.a(arrayList10, 9, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, o, sGNewUserLandResponse.light_type));
            }
            if (sGNewUserLandResponse.otherNormalTitle != null) {
                ArrayList arrayList11 = new ArrayList();
                arrayList11.add(sGNewUserLandResponse.otherNormalTitle);
                arrayList.addAll(hVar.a(arrayList11, 13, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, p, -1));
            }
            if (sGNewUserLandResponse.otherNormalProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.otherNormalProducts.products)) {
                arrayList.addAll(hVar.a(sGNewUserLandResponse.otherNormalProducts.products, 8, com.sankuai.shangou.stone.util.a.a((List) arrayList), 3, p, -1));
            }
            if (sGNewUserLandResponse.otherNormalProducts != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.otherNormalProducts.currentIds) && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandResponse.otherNormalProducts.ids)) {
                hVar.f.put("other_triple_current_ids", sGNewUserLandResponse.otherNormalProducts.currentIds);
                hVar.f.put("other_triple_ids", sGNewUserLandResponse.otherNormalProducts.ids);
                hVar.a(p, true);
            }
            if (sGNewUserLandResponse.otherNormalProducts != null && sGNewUserLandResponse.otherNormalProducts.extraInfo != null && sGNewUserLandResponse.otherNormalProducts.extraInfo.morePage) {
                ArrayList arrayList12 = new ArrayList();
                arrayList12.add(new BaseModuleDesc());
                arrayList.addAll(hVar.a(arrayList12, 14, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, p, -1));
            }
            list = arrayList;
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return;
        }
        hVar.a(list, 0, i2);
    }

    public static /* synthetic */ boolean a(h hVar, WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "eb4ada08145afb9315336b74534c2d5c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "eb4ada08145afb9315336b74534c2d5c")).booleanValue() : wmAddress == null || wmAddress.getStatusCode() == 1202;
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        hVar.M = true;
        return true;
    }

    public static /* synthetic */ l b(h hVar, l lVar) {
        hVar.B = null;
        return null;
    }

    public static /* synthetic */ boolean b(h hVar, boolean z) {
        hVar.S = true;
        return true;
    }

    public static /* synthetic */ boolean c(h hVar, boolean z) {
        hVar.T = true;
        return true;
    }

    public h(d.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86bd00067a47432d5c3314cf45c1a959", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86bd00067a47432d5c3314cf45c1a959");
            return;
        }
        this.G = new com.sankuai.waimai.store.pagingload.c<>();
        this.e = new HashSet();
        this.H = new HashMap<>();
        this.f = new HashMap<>();
        this.g = 9;
        this.K = new HashMap<>();
        this.M = false;
        this.N = "-999";
        this.O = "-999";
        this.P = "-999";
        this.Q = "";
        this.z = "-999";
        this.R = "";
        this.S = false;
        this.T = false;
        this.U = 0L;
        this.C = -1;
        this.D = 0;
        this.E = "-999";
        this.F = new HashMap<>();
        this.e.clear();
        this.K.put(2, 0);
        this.K.put(15, 0);
        this.K.put(5, 0);
        this.K.put(8, 0);
        this.K.put(11, 0);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, final int i2, @NonNull SGNewUserOptModel sGNewUserOptModel) {
        int i3;
        char c2;
        String str10;
        String str11;
        boolean a;
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, str9, Integer.valueOf(i2), sGNewUserOptModel};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6464ad5427ac1dd3247cb96727260b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6464ad5427ac1dd3247cb96727260b6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7cee47b6f70818d6c62d0e4ebb5ddc33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7cee47b6f70818d6c62d0e4ebb5ddc33");
        } else {
            this.M = false;
            this.e.clear();
            this.L = null;
            this.R = "";
            this.K.put(2, 0);
            this.K.put(5, 0);
            this.K.put(8, 0);
            this.K.put(11, 0);
            if (this.f != null) {
                this.f.clear();
            }
            if (this.F != null) {
                this.F.clear();
            }
        }
        this.N = str8;
        if (this.G != null) {
            this.G.c();
        }
        a(this.b.a(), "sg.newuser.apistart.native");
        com.sankuai.waimai.store.fsp.a.a().a(this.b.a(), "sg_perf_api_start");
        Object[] objArr3 = {str, str2, str3, str4, str5, str6, str7, str8, str9, Integer.valueOf(i2), sGNewUserOptModel};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "955569edafbcdb3807610883339b468e", RobustBitConfig.DEFAULT_VALUE)) {
            a = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "955569edafbcdb3807610883339b468e")).booleanValue();
            str10 = str8;
            str11 = str4;
            i3 = 8;
            c2 = 0;
        } else {
            final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("sgc_newuser_land_request");
            createCustomSpeedMeterTask.recordStep("start_request");
            final HashMap hashMap = new HashMap();
            hashMap.put("source_id", str8);
            hashMap.put("pageSourceType", str4);
            hashMap.put("preRequestRandomKey", str);
            com.sankuai.waimai.store.base.net.sg.a a2 = com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.a().w());
            com.sankuai.waimai.store.base.net.j<SGNewUserLandResponse> jVar = new com.sankuai.waimai.store.base.net.j<SGNewUserLandResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e93f0085af7a4921f7ea28669bc76034", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e93f0085af7a4921f7ea28669bc76034");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(SGNewUserLandResponse sGNewUserLandResponse) {
                    SGNewUserLandResponse sGNewUserLandResponse2 = sGNewUserLandResponse;
                    Object[] objArr4 = {sGNewUserLandResponse2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2d80fe02dfcad310930d05150dda1380", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2d80fe02dfcad310930d05150dda1380");
                        return;
                    }
                    com.sankuai.waimai.store.fsp.a.a().a(h.this.b.a(), "sg_perf_api_end");
                    createCustomSpeedMeterTask.recordStep("request_success");
                    if (sGNewUserLandResponse2 != null) {
                        if (sGNewUserLandResponse2.bgInfo != null && !t.a(sGNewUserLandResponse2.bgInfo.headPic)) {
                            com.sankuai.waimai.store.fsp.a.a().a(h.this.b.a(), "ffp_dataset_start");
                            h.a(h.this, sGNewUserLandResponse2, h.h, i2);
                            com.sankuai.waimai.store.fsp.a.a().a(h.this.b.a(), "ffp_dataset_end");
                            h.a(h.this, true);
                        } else {
                            h.this.b.b(h.h);
                            h.this.b.a(h.v);
                        }
                        com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask.recordStep("request_assemble_data_finish"), hashMap);
                        return;
                    }
                    h.this.b.b(h.h);
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr4 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "43a231feb603a640eb602036a275a77e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "43a231feb603a640eb602036a275a77e");
                        return;
                    }
                    com.sankuai.waimai.store.fsp.a.a().a(h.this.b.a(), "sg_perf_api_end");
                    h.this.b.b(h.h);
                    h.this.b.a(h.u);
                }
            };
            i3 = 8;
            c2 = 0;
            str10 = str8;
            str11 = str4;
            a = a2.a(str, str2, str3, str4, str5, str6, str7, str8, str9, sGNewUserOptModel, jVar);
        }
        com.sankuai.waimai.store.fsp.a.a().a(this.b.a(), LaunchMode.LAUNCH_MODE_PRELOAD, a ? "1" : "2");
        a(this.b.a(), "sg.newuser.apistart2.native");
        com.sankuai.waimai.store.fsp.a.a().a(this.b.a(), "ffp_api2_start");
        Object[] objArr4 = new Object[i3];
        objArr4[c2] = str2;
        objArr4[1] = str3;
        objArr4[2] = str11;
        objArr4[3] = str5;
        objArr4[4] = str6;
        objArr4[5] = str7;
        objArr4[6] = str10;
        objArr4[7] = str9;
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0897dc736f4b8407931f2499bbbbaa69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0897dc736f4b8407931f2499bbbbaa69");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.a().w()).a(str2, str3, str4, str5, str6, str7, str8, str9, new com.sankuai.waimai.store.base.net.j<SGNewUserLandPoisResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ec7549aefc3408c9fc65974081daa9d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ec7549aefc3408c9fc65974081daa9d8");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(SGNewUserLandPoisResponse sGNewUserLandPoisResponse) {
                    SGNewUserLandPoisResponse sGNewUserLandPoisResponse2 = sGNewUserLandPoisResponse;
                    Object[] objArr5 = {sGNewUserLandPoisResponse2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3069a512e04c43ac9968d890bcfa833a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3069a512e04c43ac9968d890bcfa833a");
                    } else if (sGNewUserLandPoisResponse2 != null) {
                        h.this.L = sGNewUserLandPoisResponse2;
                        h.this.a();
                        com.sankuai.waimai.store.fsp.a.a().a(h.this.b.a(), "ffp_api2_end");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr5 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a71c006291b5b46806120ff8e1deed47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a71c006291b5b46806120ff8e1deed47");
                        return;
                    }
                    com.sankuai.waimai.store.fsp.a.a().a(h.this.b.a(), "ffp_api2_end");
                    h.this.b.b(h.j);
                }
            });
        }
    }

    public final void a(final int i2, final int i3) {
        String valueOf;
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d32afc1d0f0960590977a5c5ab7af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d32afc1d0f0960590977a5c5ab7af7");
            return;
        }
        this.b.d();
        com.sankuai.waimai.store.base.net.sg.a a = com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.a().w());
        String a2 = a(i2, false);
        Object[] objArr2 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60e1119f8d78d3b611a3fc2c6fd8477d", RobustBitConfig.DEFAULT_VALUE)) {
            valueOf = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60e1119f8d78d3b611a3fc2c6fd8477d");
        } else {
            valueOf = i2 == 4 ? "3" : String.valueOf(i2);
        }
        a.b(a2, valueOf, new com.sankuai.waimai.store.base.net.j<SGNewUserLandResponse.ProductList>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37c49ac1a9dc69b8d67b26f47c14b7b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37c49ac1a9dc69b8d67b26f47c14b7b0");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(SGNewUserLandResponse.ProductList productList) {
                SGNewUserLandResponse.ProductList productList2 = productList;
                Object[] objArr3 = {productList2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "47ae140583e04094b3b1be570d4ef1a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "47ae140583e04094b3b1be570d4ef1a8");
                    return;
                }
                List list = null;
                if (productList2 != null && !com.sankuai.shangou.stone.util.a.b(productList2.products)) {
                    if (i2 == 1) {
                        list = h.this.a(productList2.products, h.this.a(h.this.V, h.m, 2), i3, 1, h.m, -1);
                    } else if (i2 == 2) {
                        list = h.this.a(productList2.products, 5, i3, 2, h.n, -1);
                    } else if (i2 == 3) {
                        list = h.this.a(productList2.products, 8, i3, 3, h.o, -1);
                    } else if (i2 == h.p) {
                        list = h.this.a(productList2.products, 8, i3, 3, h.p, -1);
                    }
                    h.this.a(list, i3, h.i);
                    h.this.a(i2, true);
                } else {
                    h.this.b.b(h.i);
                }
                h.this.b.e();
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13f7449362afd89b7a49248f7b152ca5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13f7449362afd89b7a49248f7b152ca5");
                    return;
                }
                h.this.b.b(h.i);
                h.this.b.e();
            }
        });
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb5aac58b421c7f4d280da00318313c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb5aac58b421c7f4d280da00318313c");
        } else if (this.M) {
            com.sankuai.waimai.store.fsp.a.a().a(this.b.a(), "ffp_dataset2_start");
            SGNewUserLandPoisResponse sGNewUserLandPoisResponse = this.L;
            int i2 = j;
            Object[] objArr2 = {sGNewUserLandPoisResponse, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ccfd841793c5d52db2f4f2c38aba954", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ccfd841793c5d52db2f4f2c38aba954");
            } else if (sGNewUserLandPoisResponse != null && !com.sankuai.shangou.stone.util.a.b(sGNewUserLandPoisResponse.pois)) {
                this.M = false;
                int itemCount = this.b.b() != null ? this.b.b().getItemCount() - 1 : 0;
                ArrayList arrayList = new ArrayList();
                if (sGNewUserLandPoisResponse.title != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(sGNewUserLandPoisResponse.title);
                    arrayList.addAll(a(arrayList2, 12, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, r, this.D));
                }
                arrayList.addAll(a(sGNewUserLandPoisResponse.pois, 11, itemCount, 1, r, this.D));
                if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                    a(arrayList, itemCount, i2);
                }
            }
            com.sankuai.waimai.store.fsp.a.a().a(this.b.a(), "ffp_dataset2_end");
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ffc1b18d2f7085946c29765dd4f20b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ffc1b18d2f7085946c29765dd4f20b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d7052d8df88bc29b3db606b10d90836", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d7052d8df88bc29b3db606b10d90836")).booleanValue() : com.sankuai.waimai.store.locate.a.g()) {
            f();
            String str = this.J;
            WMLocation wMLocation = this.I;
            this.J = com.sankuai.waimai.store.locate.a.d();
            this.I = com.sankuai.waimai.store.locate.a.b();
            this.b.a(0, this.J, this.I, str, wMLocation);
            return;
        }
        a(this.b.a(), "sg.newuser.locationstart.native");
        this.b.a(1, "", null, "", null);
    }

    @Override // com.sankuai.waimai.store.i.locate.b
    public final void a(WMLocation wMLocation, String str, boolean z) {
        Object[] objArr = {wMLocation, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f7ab4ba277feb280418eb9c27c25d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f7ab4ba277feb280418eb9c27c25d3e");
        } else if (e()) {
            if (z) {
                String str2 = this.J;
                WMLocation wMLocation2 = this.I;
                if (!a(wMLocation)) {
                    this.I = wMLocation;
                    this.J = str;
                    this.b.a(2, this.J, this.I, str2, wMLocation2);
                } else {
                    this.b.a(3, this.J, this.I, str2, wMLocation2);
                }
            } else if (SGLocationUtils.a(this.I, this.J)) {
                this.J = str;
                this.I = wMLocation;
                this.b.a(this.J, this.I);
                this.b.c(w);
            }
            this.U = System.currentTimeMillis();
        }
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497d75e239bdf2e75142984ac5ecd4c1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497d75e239bdf2e75142984ac5ecd4c1") : Arrays.asList("1", "801", "6", "7", "12", "42").contains(this.N) ? "" : (com.sankuai.shangou.stone.util.f.c(this.N) <= 1000.0f || com.sankuai.shangou.stone.util.f.c(this.N) >= 2000.0f) ? this.R : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(SGNewUserLandResponse.ProductList productList, int i2, int i3) {
        Object[] objArr = {productList, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b66f71965b09812a19f2d16e2da43ff0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b66f71965b09812a19f2d16e2da43ff0")).intValue();
        }
        if (productList == null) {
            return i3;
        }
        this.V = productList;
        if (productList.extraInfo != null && i2 == 1) {
            int i4 = productList.extraInfo.displayType;
            if (i4 == 1) {
                return 2;
            }
            if (i4 == 2) {
                return 15;
            }
        }
        return i3;
    }

    private void a(@NotNull SGNewUserLandResponse sGNewUserLandResponse, List<b> list) {
        Object[] objArr = {sGNewUserLandResponse, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e569ed8f06844d76baedb4a6df27697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e569ed8f06844d76baedb4a6df27697");
        } else if (sGNewUserLandResponse.marJorTitle == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BaseModuleDesc());
            list.addAll(a(arrayList, 1, com.sankuai.shangou.stone.util.a.a((List) list), 1, m, sGNewUserLandResponse.light_type));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<b> a(@NotNull List<BaseModuleDesc> list, int i2, int i3, int i4, int i5, int i6) {
        SGNewUserLandResponse.HotSaleProductTabs hotSaleProductTabs;
        Object[] objArr = {list, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d8603a6ed2e8ce6f2ed1dc07a07715", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d8603a6ed2e8ce6f2ed1dc07a07715");
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i3;
        for (BaseModuleDesc baseModuleDesc : list) {
            if (baseModuleDesc != null) {
                b bVar = new b();
                bVar.q = i2;
                bVar.t = baseModuleDesc;
                if (!t.a(baseModuleDesc.nativeId)) {
                    bVar.u = baseModuleDesc.nativeId;
                } else {
                    bVar.u = "native";
                }
                bVar.r = i4;
                i7++;
                bVar.b = i7;
                bVar.f = i5;
                bVar.d = this.O;
                bVar.e = this.N;
                bVar.g = this.P;
                bVar.h = this.z;
                bVar.j = this.Q;
                bVar.i = "0";
                if (i2 == 16 && (hotSaleProductTabs = (SGNewUserLandResponse.HotSaleProductTabs) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(baseModuleDesc.jsonData), SGNewUserLandResponse.HotSaleProductTabs.class)) != null && !com.sankuai.shangou.stone.util.a.b(hotSaleProductTabs.tabs)) {
                    hotSaleProductTabs.pageIndex++;
                    if (!p.a(hotSaleProductTabs.tabs.get(0))) {
                        hotSaleProductTabs.currentTabId = hotSaleProductTabs.tabs.get(0).tabId;
                    }
                    bVar.n = hotSaleProductTabs;
                }
                if (this.K.get(Integer.valueOf(i2)) != null && this.K.get(Integer.valueOf(i2)) != null) {
                    Integer num = this.K.get(Integer.valueOf(i2));
                    bVar.c = num.intValue();
                    this.K.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() + 1));
                    if (i2 == 11 && bVar.c == com.sankuai.shangou.stone.util.a.a((List) list) - 1) {
                        bVar.i = "1";
                    }
                }
                arrayList.add(bVar);
            }
        }
        if (com.sankuai.shangou.stone.util.a.c(arrayList) > 0) {
            b bVar2 = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, 0);
            if (i6 > 0 && bVar2 != null) {
                if (i6 == 1 && (i2 == 2 || i2 == 15)) {
                    bVar2.l = true;
                } else if (i6 == 2 && i2 == 5) {
                    bVar2.l = true;
                } else if (i6 == 3 && i2 == 8) {
                    bVar2.l = true;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<b> list, int i2, final int i3) {
        Object[] objArr = {list, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f3beb7f23dde44d911b93b98d1510b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f3beb7f23dde44d911b93b98d1510b");
            return;
        }
        final int[] iArr = {i2};
        com.sankuai.waimai.store.pagingload.c<b, b> cVar = this.G;
        cVar.g = new a.InterfaceC1262a<b, b>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.6
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.sankuai.waimai.store.pagingload.a.InterfaceC1262a
            public b a(@NonNull b bVar) {
                String str;
                String str2;
                String str3;
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab968a47b3c35fe82a7d083a83540ed4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab968a47b3c35fe82a7d083a83540ed4");
                }
                try {
                    if (t.a(bVar.u) || !"mach".equals(bVar.u)) {
                        return bVar;
                    }
                    if (bVar.t != null && bVar.t.jsonData != null) {
                        HashMap hashMap = new HashMap();
                        if (bVar != null) {
                            if (!t.a(bVar.e)) {
                                hashMap.put("source_id", bVar.e);
                            }
                            if (!t.a(bVar.d)) {
                                hashMap.put("st_id", bVar.d);
                            }
                            hashMap.put("product_index", Integer.valueOf(bVar.c));
                            hashMap.put("module_index", Integer.valueOf(bVar.f));
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = b.a;
                            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "56b23b1412747911e341fa1a6d75f6c5", RobustBitConfig.DEFAULT_VALUE)) {
                                str = (String) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "56b23b1412747911e341fa1a6d75f6c5");
                            } else {
                                str = t.a(bVar.h) ? "-999" : bVar.h;
                            }
                            hashMap.put("is_supply", str);
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = b.a;
                            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "5c0494239b1faa25010dd3d2d66b1595", RobustBitConfig.DEFAULT_VALUE)) {
                                str2 = (String) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "5c0494239b1faa25010dd3d2d66b1595");
                            } else {
                                str2 = t.a(bVar.g) ? "-999" : bVar.g;
                            }
                            hashMap.put("is_new_user", str2);
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = b.a;
                            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "2796bb096389183faea24cf0f8c89d05", RobustBitConfig.DEFAULT_VALUE)) {
                                str3 = (String) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "2796bb096389183faea24cf0f8c89d05");
                            } else {
                                str3 = t.a(bVar.i) ? "0" : bVar.i;
                            }
                            hashMap.put("is_poi_last", str3);
                        }
                        bVar.t.jsonData.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap);
                    }
                    b bVar2 = new b(bVar.r, bVar.t, h.a(h.this, 0, bVar).a(bVar.t, bVar.c), bVar.q, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, bVar.h, bVar.j, bVar.i);
                    bVar2.l = bVar.l;
                    return bVar2;
                } catch (Throwable unused) {
                    return bVar;
                }
            }
        };
        cVar.h = new a.b<b, b>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(List<b> list2, int i4) {
                Object[] objArr2 = {list2, Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce94051bea6ce50ee1e6d4b7e438fa22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce94051bea6ce50ee1e6d4b7e438fa22");
                    return;
                }
                super.a(list2, i4);
                if (iArr[0] > 0) {
                    h.this.b.a(list2, iArr[0], i3);
                } else {
                    h.this.b.a(list2, i3);
                }
                int[] iArr2 = iArr;
                iArr2[0] = iArr2[0] + com.sankuai.shangou.stone.util.a.a((List) list2);
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a(int i4, @Nullable Throwable th, List<b> list2) {
                Object[] objArr2 = {Integer.valueOf(i4), th, list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d21f24c0f4e4beba0cf5313ab128fd2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d21f24c0f4e4beba0cf5313ab128fd2");
                } else {
                    super.a(i4, th, list2);
                }
            }

            @Override // com.sankuai.waimai.store.pagingload.a.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf9d54180b3b07754a6d960ee5ee052c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf9d54180b3b07754a6d960ee5ee052c");
                    return;
                }
                super.a();
                h.this.b.b(i3);
            }
        };
        cVar.a(list);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c385e5c9c0705d619f0a20cc84121fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c385e5c9c0705d619f0a20cc84121fae");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb35bf334ba91d316e31ec8d3dfb4ac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb35bf334ba91d316e31ec8d3dfb4ac5");
        } else {
            this.A = new l<WMLocation>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.9
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable WMLocation wMLocation) {
                    WMLocation wMLocation2 = wMLocation;
                    Object[] objArr3 = {wMLocation2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5058d1fe03b81834cf82ab6306c8612d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5058d1fe03b81834cf82ab6306c8612d");
                        return;
                    }
                    if (h.this.A != null) {
                        com.sankuai.waimai.store.poilist.preload.b.a().b.b(h.this.A);
                        h.a(h.this, (l) null);
                    }
                    if (h.this.S) {
                        return;
                    }
                    h.b(h.this, true);
                    String str = h.this.J;
                    WMLocation wMLocation3 = h.this.I;
                    if (!h.this.a(wMLocation2)) {
                        h.this.I = wMLocation2;
                        h.this.b.a(0, h.this.J, h.this.I, str, wMLocation3);
                    } else {
                        h.this.b.a(3, h.this.J, h.this.I, str, wMLocation3);
                    }
                    h.this.U = System.currentTimeMillis();
                    h.this.f();
                }
            };
            this.B = new l<WmAddress>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.10
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable WmAddress wmAddress) {
                    WmAddress wmAddress2 = wmAddress;
                    Object[] objArr3 = {wmAddress2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f8858032a7b4ebcad496e0d248cc8005", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f8858032a7b4ebcad496e0d248cc8005");
                        return;
                    }
                    if (h.this.B != null) {
                        com.sankuai.waimai.store.poilist.preload.b.a().c.b(h.this.B);
                        h.b(h.this, (l) null);
                    }
                    if (h.this.T) {
                        return;
                    }
                    h.c(h.this, true);
                    if (!h.a(h.this, wmAddress2)) {
                        h.this.J = wmAddress2.getAddress();
                        h.this.b.a(h.this.J, h.this.I);
                    } else {
                        h.this.b.a("", (WMLocation) null);
                    }
                    h.this.U = System.currentTimeMillis();
                }
            };
        }
        com.sankuai.waimai.store.poilist.preload.b.a().b.a(this.A);
        com.sankuai.waimai.store.poilist.preload.b.a().c.a(this.B);
        com.sankuai.waimai.store.poilist.preload.c.a().b(this.b.a(), com.sankuai.waimai.store.poilist.preload.b.a(), "dj-463886d6a4beb2bb");
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a8560e6aa2cf92e6c73653e41258c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a8560e6aa2cf92e6c73653e41258c8")).booleanValue() : System.currentTimeMillis() - this.U > 1500;
    }

    public final void a(int i2, final int i3, @NotNull final SGNewUserLandResponse.HotSaleProductTabs hotSaleProductTabs, final int i4) {
        Object[] objArr = {2, Integer.valueOf(i3), hotSaleProductTabs, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ec30ffc4a2b3d67c6b567d719f0054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ec30ffc4a2b3d67c6b567d719f0054");
        } else if (com.sankuai.shangou.stone.util.a.b(hotSaleProductTabs.tabs) || hotSaleProductTabs.tabs.size() <= i4 || i4 < 0) {
        } else {
            SGNewUserLandResponse.TabItem tabItem = (SGNewUserLandResponse.TabItem) com.sankuai.shangou.stone.util.a.a((List<Object>) hotSaleProductTabs.tabs, i4);
            if (p.a(tabItem)) {
                return;
            }
            final int i5 = tabItem.tabId;
            if (this.F.get(Integer.valueOf(i5)) == null) {
                Object[] objArr2 = {Integer.valueOf(i5), 0, "", 2, Integer.valueOf(i3), hotSaleProductTabs, Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1de5c792ea2e217ea8a5f9b71feb26d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1de5c792ea2e217ea8a5f9b71feb26d");
                    return;
                }
                this.b.d();
                com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.a().w()).a(i5, String.valueOf(2), 0, "", new com.sankuai.waimai.store.base.net.j<SGNewUserLandResponse.ProductList>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e45a64ec86b367e3404fb3fea1cc408", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e45a64ec86b367e3404fb3fea1cc408");
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(SGNewUserLandResponse.ProductList productList) {
                        SGNewUserLandResponse.ProductList productList2 = productList;
                        Object[] objArr3 = {productList2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8377bc93863777750e89a5b199050fc2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8377bc93863777750e89a5b199050fc2");
                            return;
                        }
                        h.this.b.e();
                        if (productList2 == null || com.sankuai.shangou.stone.util.a.b(productList2.products)) {
                            return;
                        }
                        List a2 = h.this.a(productList2.products, 5, i3, 2, h.n, -1);
                        h.a(h.this, productList2, a2);
                        if (productList2.extraInfo != null && productList2.extraInfo.hasNext) {
                            hotSaleProductTabs.pageIndex = r4 + 1;
                            hotSaleProductTabs.pageTraceId = productList2.extraInfo.pageTraceId;
                            hotSaleProductTabs.currentTabId = i5;
                            hotSaleProductTabs.hasNext = true;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new BaseModuleDesc());
                            a2.addAll(h.this.a(arrayList, 17, com.sankuai.shangou.stone.util.a.a(a2), 1, h.n, -1));
                        } else {
                            hotSaleProductTabs.hasNext = false;
                        }
                        h.this.b.j();
                        h.this.b.a(hotSaleProductTabs, i4);
                        h.this.a(a2, i3, h.k);
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "175449d4373f7c1cdda818e63ad88be6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "175449d4373f7c1cdda818e63ad88be6");
                            return;
                        }
                        if (h.this.b != null) {
                            am.a((Activity) h.this.b.a(), bVar.b);
                        }
                        h.this.b.e();
                    }
                });
                return;
            }
            c cVar = this.F.get(Integer.valueOf(i5));
            if (cVar != null) {
                hotSaleProductTabs.pageIndex = cVar.c;
                hotSaleProductTabs.pageTraceId = cVar.d;
                hotSaleProductTabs.hasNext = cVar.e;
                hotSaleProductTabs.currentTabId = i5;
                List<b> list = cVar.b;
                ArrayList arrayList = new ArrayList();
                if (com.sankuai.shangou.stone.util.a.b(list)) {
                    return;
                }
                this.b.a(hotSaleProductTabs, i4);
                arrayList.addAll(list);
                if (hotSaleProductTabs.hasNext) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new BaseModuleDesc());
                    arrayList.addAll(a(arrayList2, 17, com.sankuai.shangou.stone.util.a.a((List) arrayList), 1, n, -1));
                }
                this.b.a(arrayList, i3, l);
                this.b.j();
            }
        }
    }

    public final void a(int i2, final int i3, final SGNewUserLandResponse.HotSaleProductTabs hotSaleProductTabs) {
        Object[] objArr = {2, Integer.valueOf(i3), hotSaleProductTabs};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "388ae6619057f67ff68e56f08a17b8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "388ae6619057f67ff68e56f08a17b8f0");
            return;
        }
        this.b.d();
        com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.a().w()).a(hotSaleProductTabs.currentTabId, "2", hotSaleProductTabs.pageIndex, hotSaleProductTabs.pageTraceId, new com.sankuai.waimai.store.base.net.j<SGNewUserLandResponse.ProductList>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "329431e5aa266de373d33beaf9ccb07d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "329431e5aa266de373d33beaf9ccb07d");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(SGNewUserLandResponse.ProductList productList) {
                SGNewUserLandResponse.ProductList productList2 = productList;
                Object[] objArr2 = {productList2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "702ee5ba64aabda38fc5efceee3d42b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "702ee5ba64aabda38fc5efceee3d42b4");
                    return;
                }
                h.this.b.e();
                if (productList2 != null && !com.sankuai.shangou.stone.util.a.b(productList2.products)) {
                    List a2 = h.this.a(productList2.products, 5, i3, 2, h.n, -1);
                    h.a(h.this, productList2, a2);
                    if (productList2.extraInfo != null && productList2.extraInfo.hasNext) {
                        hotSaleProductTabs.pageIndex++;
                        hotSaleProductTabs.hasNext = true;
                        hotSaleProductTabs.pageTraceId = productList2.extraInfo.pageTraceId;
                    } else {
                        hotSaleProductTabs.hasNext = false;
                    }
                    h.this.a(a2, i3, h.k);
                    return;
                }
                hotSaleProductTabs.hasNext = false;
                h.this.b.b(h.k);
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9d903f8c7758102ba1af76c1cccae38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9d903f8c7758102ba1af76c1cccae38");
                    return;
                }
                h.this.b.e();
                h.this.b.b(h.k);
                if (h.this.b != null) {
                    am.a((Activity) h.this.b.a(), bVar.b);
                }
            }
        });
    }

    public final void a(List<b> list, SGNewUserLandResponse.HotSaleProductTabs hotSaleProductTabs) {
        Object[] objArr = {list, hotSaleProductTabs};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21cc5f72220ac771203bdbc1390158e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21cc5f72220ac771203bdbc1390158e2");
        } else if (hotSaleProductTabs != null && !com.sankuai.shangou.stone.util.a.b(list)) {
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (bVar.q == 5) {
                    arrayList.add(bVar);
                }
            }
            c cVar = this.F.get(Integer.valueOf(hotSaleProductTabs.currentTabId));
            if (cVar == null) {
                c cVar2 = new c();
                cVar2.c = hotSaleProductTabs.currentTabId;
                cVar2.d = hotSaleProductTabs.pageTraceId;
                cVar2.e = hotSaleProductTabs.hasNext;
                cVar2.b = arrayList;
                this.F.put(Integer.valueOf(hotSaleProductTabs.currentTabId), cVar2);
                return;
            }
            cVar.c = hotSaleProductTabs.pageIndex;
            cVar.d = hotSaleProductTabs.pageTraceId;
            cVar.e = hotSaleProductTabs.hasNext;
            List<b> list2 = cVar.b;
            list2.addAll(arrayList);
            cVar.b = list2;
            this.F.put(Integer.valueOf(hotSaleProductTabs.currentTabId), cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7892f037b22c99a17b7b910a6547e61a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7892f037b22c99a17b7b910a6547e61a");
            return;
        }
        com.sankuai.waimai.store.locate.a.b(this);
        com.sankuai.waimai.store.locate.a.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3384bef25486e48db887bf2b83daffa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3384bef25486e48db887bf2b83daffa")).booleanValue() : wMLocation == null || wMLocation.getLocationResultCode() == null || wMLocation.getLocationResultCode().a != 1200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7ef18ea1afe232532f51556da137a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7ef18ea1afe232532f51556da137a2");
        }
        new ArrayList();
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        if (i2 == m) {
            this.g = 9;
            arrayList = a(this.f.get("major_current_ids"));
            arrayList2 = a(this.f.get("major_ids"));
        } else if (i2 == n) {
            this.g = 10;
            arrayList = a(this.f.get("detonate_current_ids"));
            arrayList2 = a(this.f.get("detonate_ids"));
        } else if (i2 == o) {
            this.g = 9;
            arrayList = a(this.f.get("triple_current_ids"));
            arrayList2 = a(this.f.get("triple_ids"));
        } else if (i2 == p) {
            this.g = 9;
            arrayList = a(this.f.get("other_triple_current_ids"));
            arrayList2 = a(this.f.get("other_triple_ids"));
        }
        List<String> a = com.sankuai.shangou.stone.util.a.a(arrayList2, 0, this.g);
        StringBuilder sb = new StringBuilder();
        if (!com.sankuai.shangou.stone.util.a.b(a)) {
            for (String str : a) {
                if (!t.a(str)) {
                    sb.append(str);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        if (z) {
            List a2 = com.sankuai.shangou.stone.util.a.a(arrayList2, com.sankuai.shangou.stone.util.a.a((List) arrayList), com.sankuai.shangou.stone.util.a.a((List) arrayList2));
            if (i2 == 1) {
                this.f.put("major_current_ids", a);
                this.f.put("major_ids", a2);
            } else if (i2 == 2) {
                this.f.put("detonate_current_ids", a);
                this.f.put("detonate_ids", a2);
            } else if (i2 == 3) {
                this.f.put("triple_current_ids", a);
                this.f.put("triple_ids", a2);
            } else if (i2 == p) {
                this.f.put("other_triple_current_ids", a);
                this.f.put("other_triple_ids", a2);
            }
        }
        return sb.toString();
    }

    private List<String> a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba47aabc33f4283761ba92d3947ee768", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba47aabc33f4283761ba92d3947ee768");
        }
        try {
            return (List) obj;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    public final void a(SGNewUserLandResponse.SGNewUserItemData sGNewUserItemData, String str) {
        GoodsSpu goodsSpu;
        Object[] objArr = {sGNewUserItemData, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38991ed818ce145e7bab8a87cf8687b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38991ed818ce145e7bab8a87cf8687b8");
        } else if (sGNewUserItemData == null || sGNewUserItemData.spus == null || (goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) sGNewUserItemData.spus, 0)) == null) {
        } else {
            long a = r.a(sGNewUserItemData.poiID, 0L);
            long j2 = goodsSpu.id;
            GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0);
            long j3 = goodsSku.id;
            int i2 = goodsSku.minOrderCount;
            int i3 = i2 == 0 ? 1 : i2;
            String str2 = goodsSku.activityTag;
            HashMap hashMap = null;
            int i4 = goodsSpu.skuType;
            if (i4 == 2) {
                hashMap = new HashMap();
                hashMap.put("activity_operation_site", 3);
            } else if (i4 == 3) {
                hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("page_source_code", "new_user_landing_page");
                hashMap.put("i_input_param", new JSONObject(hashMap2));
            }
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new WmOrderedFood(j2, j3, null, i3, 0, 0, str2, ""));
            Poi poi = new Poi();
            poi.id = a;
            poi.poiIdStr = sGNewUserItemData.poiIdStr;
            com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi);
            try {
                ae.a("SGNewUserLandPresenter", "previewExtra " + com.sankuai.waimai.store.util.i.a(hashMap));
                ae.a("SGNewUserLandPresenter", "food_list=" + com.sankuai.waimai.store.util.i.a(arrayList));
                ae.a("SGNewUserLandPresenter", "poi_id=" + a + " poi_id_str=" + sGNewUserItemData.poiIdStr);
                c.a aVar2 = new c.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.shopping.cart.c.a
                    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
                        Object[] objArr2 = {jSONObject, jSONObject2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95e1b27715e6ad5a9deb36b680063e9d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95e1b27715e6ad5a9deb36b680063e9d");
                        } else {
                            com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject);
                        }
                    }

                    @Override // com.sankuai.waimai.store.shopping.cart.c.a
                    public final void a(d.a aVar3) {
                        Object[] objArr2 = {aVar3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b63a936ad3d8332b0410e40f89fedd7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b63a936ad3d8332b0410e40f89fedd7");
                        } else {
                            aVar3.n = arrayList;
                        }
                    }
                };
                d.a aVar3 = new d.a();
                aVar3.b = this.b.a();
                d.a a2 = aVar3.a(aVar.f());
                a2.c = aVar.h();
                a2.d = aVar.i();
                a2.f = SGUtilsModule.class.getSimpleName();
                a2.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
                a2.j = false;
                a2.g = "from_sc_restaurant";
                a2.i = 3;
                a2.n = arrayList;
                a2.m = a(aVar, aVar2, str, hashMap);
                if (!t.a(goodsSpu.couponIdentity) && i4 == 3) {
                    aVar3.l = goodsSpu.couponIdentity;
                    ae.a("SGNewUserLandPresenter", "couponIdentity=" + goodsSpu.couponIdentity);
                }
                com.sankuai.waimai.store.manager.order.b.a(aVar3.b(), aVar.t());
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
                if (this.b != null) {
                    com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserRaptorEvent.SGNewUserOrderError, this.b.k(), false, this.b.l());
                }
            }
        }
    }

    private String a(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, c.a aVar2, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, aVar2, str, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a9e862b9df83b2b0d5a1352e696928", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a9e862b9df83b2b0d5a1352e696928");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject H = aVar.H();
            aVar2.a(H, jSONObject);
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry != null && !t.a(entry.getKey())) {
                        if (H == null) {
                            H = new JSONObject();
                        }
                        H.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            jSONObject.put("preview_order_callback_info", H);
            if (!t.a(str)) {
                jSONObject.put("act_page_code", str);
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return jSONObject.toString();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da38c3a5ab8a4f845bd6944f87e37cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da38c3a5ab8a4f845bd6944f87e37cc");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.a().w()).a(str);
        }
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c765f90abc29f3f574d9f843e807ef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c765f90abc29f3f574d9f843e807ef9");
        } else {
            com.sankuai.waimai.store.deeplink.a.a(activity, str, com.sankuai.waimai.store.goods.list.utils.e.a(b(str)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r12.equals("sg.newuser.locationstart.native") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.c
            java.lang.String r11 = "fdcd8fa78c03fdd6ddb70660b6b20c4e"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -2006100847: goto L80;
                case -658704580: goto L75;
                case -618502721: goto L6a;
                case -440701408: goto L5f;
                case -428138155: goto L55;
                case 145750727: goto L4a;
                case 410000313: goto L3f;
                case 1288719448: goto L34;
                case 1890669023: goto L28;
                default: goto L27;
            }
        L27:
            goto L8b
        L28:
            java.lang.String r0 = "sg.newuser.setdataend2.native"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L8b
            r0 = 8
            goto L8c
        L34:
            java.lang.String r0 = "sg.newuser.apistart2.native"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L8b
            r0 = 5
            goto L8c
        L3f:
            java.lang.String r0 = "sg.newuser.setdataend.native"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L8b
            r0 = 7
            goto L8c
        L4a:
            java.lang.String r0 = "sg.newuser.apiend.native"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L8b
            r0 = 4
            goto L8c
        L55:
            java.lang.String r2 = "sg.newuser.locationstart.native"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L8b
            goto L8c
        L5f:
            java.lang.String r0 = "sg.newuser.apistart.native"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L8b
            r0 = 3
            goto L8c
        L6a:
            java.lang.String r0 = "sg.newuser.ready.native"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L8b
            r0 = 0
            goto L8c
        L75:
            java.lang.String r0 = "sg.newuser.locationend.native"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L8b
            r0 = 2
            goto L8c
        L80:
            java.lang.String r0 = "sg.newuser.apiend2.native"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L8b
            r0 = 6
            goto L8c
        L8b:
            r0 = -1
        L8c:
            switch(r0) {
                case 0: goto Lb3;
                case 1: goto Laf;
                case 2: goto Lab;
                case 3: goto La7;
                case 4: goto La3;
                case 5: goto L9f;
                case 6: goto L9b;
                case 7: goto L97;
                case 8: goto L93;
                default: goto L8f;
            }
        L8f:
            java.lang.String r12 = "自定义指标名称"
            goto Lb6
        L93:
            java.lang.String r12 = "精选商家接口数据设置完成"
            goto Lb6
        L97:
            java.lang.String r12 = "主接口数据设置完成"
            goto Lb6
        L9b:
            java.lang.String r12 = "精选商家请求结束"
            goto Lb6
        L9f:
            java.lang.String r12 = "精选商家请求开始"
            goto Lb6
        La3:
            java.lang.String r12 = "主接口请求结束"
            goto Lb6
        La7:
            java.lang.String r12 = "主接口请求开始"
            goto Lb6
        Lab:
            java.lang.String r12 = "定位结束"
            goto Lb6
        Laf:
            java.lang.String r12 = "定位开始"
            goto Lb6
        Lb3:
            java.lang.String r12 = "落地页启动"
        Lb6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.viewblocks.newuser.h.b(java.lang.String):java.lang.String");
    }
}
