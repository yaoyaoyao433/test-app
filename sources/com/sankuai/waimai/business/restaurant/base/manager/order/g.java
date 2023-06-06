package com.sankuai.waimai.business.restaurant.base.manager.order;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements Serializable {
    public static int A = 0;
    public static int B = 1;
    public static int D = 0;
    public static int E = 1;
    public static int F = 2;
    public static int G = 3;
    public static ChangeQuickRedirect a;
    public int C;
    public boolean H;
    @Expose
    public int I;
    public boolean J;
    private boolean K;
    private Poi.PoiLabel L;
    @Expose
    private boolean M;
    @Expose
    private int N;
    public com.sankuai.waimai.platform.domain.core.shop.b b;
    public boolean c;
    public boolean d;
    public String e;
    public int f;
    public Poi g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public String n;
    public int o;
    public int p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public Poi.PoiCouponItem v;
    public boolean w;
    public a x;
    public String y;
    public int z;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc4d4a489e896cd59dd7ca44ea11e9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc4d4a489e896cd59dd7ca44ea11e9f");
            return;
        }
        this.d = true;
        this.p = 0;
        this.z = 0;
        this.C = -1;
        this.H = false;
        this.M = false;
        this.N = 0;
        this.I = 0;
        this.J = false;
        this.g = D();
    }

    public g(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0544f84f1b8d96fb37cfcf48acad5cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0544f84f1b8d96fb37cfcf48acad5cd");
            return;
        }
        this.d = true;
        this.p = 0;
        this.z = 0;
        this.C = -1;
        this.H = false;
        this.M = false;
        this.N = 0;
        this.I = 0;
        this.J = false;
        this.g = poi == null ? D() : poi;
    }

    public static boolean a(Activity activity, String str, String str2, String str3, String str4) {
        Object[] objArr = {activity, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4858d26e758a3a851773f98cff60b7fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4858d26e758a3a851773f98cff60b7fc")).booleanValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI, str);
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str2);
        hashMap.put("spuid", str3);
        hashMap.put(FoodDetailNetWorkPreLoader.URI_SKU, str4);
        hashMap.put("source_type", "1");
        Uri a2 = com.sankuai.waimai.router.utils.f.a(new Uri.Builder().scheme(com.sankuai.waimai.foundation.router.interfaces.d.d(activity)).authority(com.sankuai.waimai.foundation.router.interfaces.d.e(activity)).path(com.sankuai.waimai.foundation.router.interfaces.d.a(activity) ? "/supermarket/detail" : "/takeout/supermarket/spu/detail").build(), hashMap);
        Object[] objArr2 = {activity, a2, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b50084a205275b5ccdb0e0bfa76ec781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b50084a205275b5ccdb0e0bfa76ec781");
        } else {
            com.sankuai.waimai.foundation.router.a.a().a(new com.sankuai.waimai.router.activity.d() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.activity.d
                public final boolean a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull Intent intent) throws ActivityNotFoundException, SecurityException {
                    Object[] objArr3 = {jVar, intent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "44997d2dbb6274bea2faaf30e8a98128", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "44997d2dbb6274bea2faaf30e8a98128")).booleanValue();
                    }
                    jVar.c.startActivity(intent);
                    ((Activity) jVar.c).overridePendingTransition(0, 0);
                    return true;
                }
            }).a(activity, a2);
        }
        return true;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbafedcf74be0a5e3b4c21bd62e4feb6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbafedcf74be0a5e3b4c21bd62e4feb6")).booleanValue() : !com.sankuai.waimai.business.restaurant.poicontainer.b.b(f());
    }

    public final void a(com.sankuai.waimai.platform.domain.core.shop.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1cebbce92a6378adc40b8348a2b5757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1cebbce92a6378adc40b8348a2b5757");
            return;
        }
        this.b = bVar;
        if (bVar != null) {
            this.c = bVar.a;
            this.d = bVar.b;
            this.K = bVar.c;
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cfffe1918d12bb283319b23a964467", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cfffe1918d12bb283319b23a964467") : e() ? this.g.getAllowanceAllianceScenes() : "";
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7af62b6544845e57e03ab3316b5be59", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7af62b6544845e57e03ab3316b5be59") : e() ? this.g.getAdActivityFlag() : "";
    }

    public final void a(Poi poi, int i) {
        Object[] objArr = {poi, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a36ecac3d4c8f9e56437c8e49496184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a36ecac3d4c8f9e56437c8e49496184");
            return;
        }
        if (poi != null) {
            this.L = poi.getNewPoiLabels();
        }
        if (poi == null) {
            poi = D();
        }
        this.g = poi;
    }

    public final Poi d() {
        return this.g;
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9203b01461139ff8be98646f27a97cce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9203b01461139ff8be98646f27a97cce")).booleanValue() : (this.g == null || TextUtils.isEmpty(this.g.getPoiIDStr())) ? false : true;
    }

    private boolean C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75cc155b982e6b9c6cddf0d780405297", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75cc155b982e6b9c6cddf0d780405297")).booleanValue() : (this.g == null || TextUtils.isEmpty(this.g.getPoiIDStr())) ? false : true;
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a440d03afb81567539c992e9868f6659", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a440d03afb81567539c992e9868f6659") : C() ? this.g.getPoiIDStr() : "";
    }

    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2061962da98af35437bd3a16af6fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2061962da98af35437bd3a16af6fcd");
            return;
        }
        if (this.g == null) {
            this.g = D();
        }
        this.g.setId(j);
        this.g.setPoiIDStr(str);
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c442fe512047a2377c1cdc6e7dff750d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c442fe512047a2377c1cdc6e7dff750d")).booleanValue() : e() && this.g.isSelfDelivery;
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260b1d64eb4c8c13886c50d1d04efed2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260b1d64eb4c8c13886c50d1d04efed2") : this.g.getName();
    }

    @NonNull
    private Poi D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f349dadd8a71ff147de7004299ece7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f349dadd8a71ff147de7004299ece7e");
        }
        Poi poi = new Poi();
        poi.setState(1);
        return poi;
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acd0099e5c94572c068c50ba98bb1e43", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acd0099e5c94572c068c50ba98bb1e43") : this.g.getShippingFeeCartTip();
    }

    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45a1c3bf8c6240bd45313a8bddaa8afb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45a1c3bf8c6240bd45313a8bddaa8afb") : this.g.getSelfDeliveryTip();
    }

    public final PoiShoppingCart.CartIcon k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6ba7134848c83f8397c16bbcd29684", RobustBitConfig.DEFAULT_VALUE) ? (PoiShoppingCart.CartIcon) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6ba7134848c83f8397c16bbcd29684") : this.g.getCartIcon();
    }

    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c90e1eea282533c25314d30eb5c253d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c90e1eea282533c25314d30eb5c253d") : this.g.getShopcartBgColor();
    }

    public final String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de6f2919f953fe37ff3cae6587198b52", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de6f2919f953fe37ff3cae6587198b52") : this.g.getPromptText();
    }

    public final PoiShoppingCart.ActivityInfo n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5a3c0c2c6a7bd25d05c41bd93ca8921", RobustBitConfig.DEFAULT_VALUE) ? (PoiShoppingCart.ActivityInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5a3c0c2c6a7bd25d05c41bd93ca8921") : this.g.getActivityInfo();
    }

    public final int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b9c0f2a2c2993847226d3d09f62ce4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b9c0f2a2c2993847226d3d09f62ce4")).intValue() : this.g.getState();
    }

    public final int p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206daf8afb3585187c0f08e47aee596c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206daf8afb3585187c0f08e47aee596c")).intValue() : this.g.getPoiSellStatus();
    }

    public final double q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75ca2388cdd6a7ebffd5d82f1619166", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75ca2388cdd6a7ebffd5d82f1619166")).doubleValue() : this.g.getMinPrice();
    }

    public final boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc2537fdcaf4925d3335b27d00458f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc2537fdcaf4925d3335b27d00458f2")).booleanValue() : this.g == null || this.g.getState() == 3;
    }

    public final boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096ae4509640a749b7706b782a4e380f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096ae4509640a749b7706b782a4e380f")).booleanValue();
        }
        if (this.g == null || com.sankuai.waimai.platform.model.c.a().b() == 3) {
            return false;
        }
        int state = this.g.getState();
        return state == 2 || state == 1;
    }

    public final String v() {
        if (this.g == null) {
            return null;
        }
        return this.g.publicityContent;
    }

    public final boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d95512f2d6abf08857e075ae815c8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d95512f2d6abf08857e075ae815c8c")).booleanValue();
        }
        int s = s();
        return s == 1 || s == 3 || s == 4;
    }

    public final boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51ca55a9c03944f6e5e01af7ab2fe6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51ca55a9c03944f6e5e01af7ab2fe6f")).booleanValue();
        }
        Poi.PoiLabel poiLabel = this.L;
        ArrayList<Poi.PoiImpressLabel> arrayList = poiLabel == null ? null : poiLabel.labels;
        if (com.sankuai.waimai.foundation.utils.d.a(arrayList)) {
            return false;
        }
        Iterator<Poi.PoiImpressLabel> it = arrayList.iterator();
        while (it.hasNext()) {
            Poi.PoiImpressLabel next = it.next();
            if (next != null && next.mLabelType == 6) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bec797a39ac5cc45d30282811f7b774", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bec797a39ac5cc45d30282811f7b774")).booleanValue() : this.p == 1 || this.p == 2 || this.k;
    }

    public final long A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984fd2f7e040318f9f181d64114496c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984fd2f7e040318f9f181d64114496c9")).longValue();
        }
        if (this.g != null) {
            return this.g.getOriginBrandId();
        }
        return -1L;
    }

    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563c096f0524a02750699375bc6e8b18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563c096f0524a02750699375bc6e8b18")).booleanValue();
        }
        this.J = z;
        return z;
    }

    public final boolean B() {
        return this.z == B;
    }

    public final a a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f653d1cc34f2cb2e9ef762233adc05da", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f653d1cc34f2cb2e9ef762233adc05da");
        }
        if (this.x == null) {
            this.x = new a(false, activity);
        }
        return this.x;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b implements Serializable {
        public final String a;
        public final int b;

        private b(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        private boolean b;
        private b[] c;

        private a(boolean z, Activity activity) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58fe490a36c9e750fc7ab56039a90001", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58fe490a36c9e750fc7ab56039a90001");
                return;
            }
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9efb15665bbefa67ccf82510a8b15dea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9efb15665bbefa67ccf82510a8b15dea");
                return;
            }
            this.b = z;
            if (this.b) {
                Object[] objArr3 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                this.c = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c5aa0ba320d0f725158951b78144e7a0", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c5aa0ba320d0f725158951b78144e7a0") : new b[]{new b(activity.getString(R.string.wm_restaurant_tab_poi_publicity), a()), new b(activity.getString(R.string.wm_restaurant_tab_food_menu), b()), new b(activity.getString(R.string.wm_restaurant_tab_comment), c()), new b(activity.getString(R.string.wm_restaurant_tab_poi_detail), d())};
                return;
            }
            Object[] objArr4 = {activity};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            this.c = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f95da3005507626844376477fb5a589", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f95da3005507626844376477fb5a589") : new b[]{new b(activity.getString(R.string.wm_restaurant_tab_food_menu), b()), new b(activity.getString(R.string.wm_restaurant_tab_comment), c()), new b(activity.getString(R.string.wm_restaurant_tab_poi_detail), d())};
        }

        public final int a() {
            return this.b ? 0 : -1;
        }

        public final int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3184e3704a92fda513618a9d9b44071a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3184e3704a92fda513618a9d9b44071a")).intValue() : a() + 1;
        }

        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed020d73fff2d23981d144c0bc5581c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed020d73fff2d23981d144c0bc5581c")).intValue() : b() + 1;
        }

        public final int d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd482bcf2d8785627cbdc8fb09157b66", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd482bcf2d8785627cbdc8fb09157b66")).intValue() : c() + 1;
        }

        public final String[] e() {
            String[] strArr = new String[this.c.length];
            for (int i = 0; i < this.c.length; i++) {
                strArr[i] = this.c[i].a;
            }
            return strArr;
        }
    }

    public final boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f1fc0480e3b5e64f8b4d9f53479c22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f1fc0480e3b5e64f8b4d9f53479c22")).booleanValue();
        }
        try {
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            com.sankuai.waimai.foundation.utils.log.a.b("PoiHelper", e.getMessage(), e);
        }
        return this.g.getBuzType() == 9;
    }

    public final int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3ccf41efee347b26e74299aea6fa62", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3ccf41efee347b26e74299aea6fa62")).intValue() : this.g.getTemplateType();
    }

    public final boolean x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9510ee9d466539483875d45b6752771", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9510ee9d466539483875d45b6752771")).booleanValue() : this.l == 2;
    }
}
