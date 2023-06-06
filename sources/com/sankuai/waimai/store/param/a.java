package com.sankuai.waimai.store.param;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.recycler.b;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.preLoad.e;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int A;
    public boolean B;
    public int C;
    public boolean D;
    public String E;
    @Deprecated
    public boolean F;
    public String G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public int P;
    public String Q;
    public int R;
    public Map<String, Object> S;
    public String T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public Map<String, String> aA;
    public int aB;
    public Map<String, Object> aC;
    public int aD;
    public boolean aE;
    public String aF;
    public String aG;
    public String aH;
    public String aI;
    public String aJ;
    public String aK;
    public String aL;
    public String aM;
    public String aN;
    public boolean aO;
    public final Map<String, String> aP;
    public final Map<String, Long> aQ;
    public boolean aR;
    public boolean aS;
    public String aT;
    public boolean aU;
    public int aV;
    public int aW;
    public boolean aX;
    public boolean aY;
    public int aZ;
    public boolean aa;
    public boolean ab;
    public b ac;
    public b ad;
    public String ae;
    public String af;
    public long ag;
    public String ah;
    public boolean ai;
    public String aj;
    public String ak;
    public String al;
    public long am;
    public long an;
    public String ao;
    public String ap;
    public long aq;
    public String ar;
    public boolean as;
    public boolean at;
    public boolean au;
    public MetricsSpeedMeterTask av;
    public MetricsSpeedMeterTask aw;
    public MetricsSpeedMeterTask ax;
    public String ay;
    public Map<String, Boolean> az;
    public long b;
    public boolean bA;
    public int bB;
    private String bC;
    public boolean ba;
    public boolean bb;
    public boolean bc;
    public int bd;
    public boolean be;
    public boolean bf;
    public int bg;
    public e bh;
    public boolean bi;
    public boolean bj;
    public boolean bk;
    public boolean bl;
    public boolean bm;
    public boolean bn;
    public boolean bo;
    public boolean bp;
    public boolean bq;
    public boolean br;
    public boolean bs;
    public String bt;
    public int bu;
    public int bv;
    public int bw;
    public int bx;
    public int by;
    public boolean bz;
    public long c;
    public long d;
    @Deprecated
    public long e;
    public String f;
    public long g;
    public String h;
    public String i;
    public String j;
    public String k;
    public final Map<String, String> l;
    public String m;
    public int n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public boolean t;
    public boolean u;
    public String v;
    public long w;
    public String x;
    public boolean y;
    public boolean z;

    public final void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff283aed953e04e019f1c329a3b180a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff283aed953e04e019f1c329a3b180a");
            return;
        }
        this.x = str;
        ab.b().a(context, "store_search_back_path_exp", str);
    }

    public final int a() {
        if (this.n == 101) {
            return 4;
        }
        if (this.n == 102) {
            return 0;
        }
        return this.n;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80852a880664110abc5886b34859576b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80852a880664110abc5886b34859576b");
            return;
        }
        this.l = new HashMap();
        this.y = false;
        this.z = false;
        this.A = 0;
        this.B = false;
        this.C = 0;
        this.D = false;
        this.F = false;
        this.K = 0;
        this.L = false;
        this.Q = "";
        this.W = false;
        this.X = false;
        this.Y = true;
        this.Z = true;
        this.aa = false;
        this.ab = false;
        this.ag = -1L;
        this.ai = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.ay = "";
        this.az = new HashMap();
        this.aA = new HashMap();
        this.aB = 0;
        this.aD = 0;
        this.aE = true;
        this.aL = "";
        this.aP = new HashMap();
        this.aQ = new HashMap();
        this.aR = true;
        this.aS = false;
        this.aU = false;
        this.aW = -1;
        this.aX = false;
        this.aY = false;
        this.aZ = 1;
        this.ba = false;
        this.bb = false;
        this.bc = false;
        this.bd = 0;
        this.be = false;
        this.bf = false;
        this.bg = 0;
        this.bi = false;
        this.bj = false;
        this.bk = false;
        this.bl = false;
        this.bm = false;
        this.bn = false;
        this.bo = true;
        this.bp = false;
        this.bq = false;
        this.br = false;
        this.bs = false;
        this.bu = 0;
        this.bv = 0;
        this.bw = 0;
        this.bx = 0;
        this.by = 0;
        this.bz = false;
        this.bA = false;
        this.bB = 0;
        this.b = 0L;
        this.u = false;
        this.t = false;
    }

    public final long b() {
        if (0 < this.w) {
            return this.w;
        }
        return this.c;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5670dcc050e251a3bc95fb0070c7dbaa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5670dcc050e251a3bc95fb0070c7dbaa") : !TextUtils.isEmpty(this.V) ? this.V : this.T;
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c2483b829a41b9edda679f690b345b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c2483b829a41b9edda679f690b345b");
            return;
        }
        try {
            Intent intent = activity.getIntent();
            this.ak = aa.a(intent, "cat_id", "");
            this.aq = aa.a(intent, "wm_poi_id", -1L);
            this.ar = aa.a(intent, "shelf_id", "");
            this.al = aa.a(intent, "spu_sku_id_list", "");
            this.am = aa.a(intent, "first_category_code", -1L);
            this.an = aa.a(intent, "second_category_code", -1L);
            this.ao = aa.a(intent, "rank_trace_id", "");
            this.ap = aa.a(intent, "cate_type", "");
            this.aj = aa.a(intent, "extra", "");
            this.ae = aa.a(intent, "key_pre_request_cache", "");
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public final void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab017ecd3ab4bc66f50980263200b73c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab017ecd3ab4bc66f50980263200b73c");
            return;
        }
        try {
            Intent intent = activity.getIntent();
            this.c = aa.a(intent, "navigate_type", 0L);
            this.e = aa.a(intent, "category_type", 0L);
            if (this.e == 0) {
                this.e = aa.a(intent, "categorytype", 0L);
            }
            this.f = aa.a(intent, "subcategorytype", "0");
            if ("0".equals(this.f)) {
                this.f = aa.a(intent, "second_category_type", "0");
            }
            this.o = aa.a(intent, "category_text", (String) null);
            if (TextUtils.isEmpty(this.o)) {
                this.o = aa.a(intent, "categorytext", (String) null);
                if (TextUtils.isEmpty(this.o)) {
                    this.o = aa.a(intent, "category_name", (String) null);
                }
            }
            this.p = aa.a(intent, "subcategorytext", (String) null);
            this.q = aa.a(intent, "scene_code", (String) null);
            this.s = aa.a(intent, "navigatetext", (String) null);
            if (TextUtils.isEmpty(this.s)) {
                this.s = this.o;
            }
            this.r = aa.a(intent, "titletext", (String) null);
            this.bC = aa.a(intent, "needlocate", (String) null);
            this.w = aa.a(intent, "search_category_type", 0L);
            this.m = aa.a(intent, "g_source", "");
            this.aj = aa.a(intent, "extra", "");
            this.I = aa.a(intent, "pageSource", "other");
            this.J = this.I;
            this.ae = aa.a(intent, "key_pre_request_cache", "");
            this.af = aa.a(intent, "key_pre_request_cache2", "");
            this.ag = aa.a(intent, "home router_start_time", -1L);
            this.ai = aa.a(intent, "handle_locate_before_api_request ", false);
            c(intent, this);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public final void c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1be6718478d7f85648c2c5f008dbb33f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1be6718478d7f85648c2c5f008dbb33f");
            return;
        }
        try {
            a(activity.getIntent(), this);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public static a a(Intent intent, a aVar) {
        Object[] objArr = {intent, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f645a28b5964754cdda7e01a61353d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f645a28b5964754cdda7e01a61353d3");
        }
        if (intent == null) {
            return null;
        }
        try {
            aVar.t = true;
            aVar.ak = d.a(intent, "cat_id", "");
            aVar.aq = d.a(intent, "wm_poi_id", -1L);
            aVar.ar = d.a(intent, "shelf_id", "");
            aVar.al = d.a(intent, "spu_sku_id_list", "");
            aVar.am = d.a(intent, "first_category_code", -1L);
            aVar.an = d.a(intent, "second_category_code", -1L);
            aVar.ao = d.a(intent, "rank_trace_id", "");
            aVar.ap = d.a(intent, "cate_type", "");
            aVar.aj = d.a(intent, "extra", "");
            aVar.ae = aa.a(intent, "key_pre_request_cache", "");
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return aVar;
    }

    private void c(Intent intent, a aVar) {
        String[] split;
        Object[] objArr = {intent, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a8fb9167cb0d066aa0f9f5b428b547b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a8fb9167cb0d066aa0f9f5b428b547b");
            return;
        }
        HashMap hashMap = new HashMap();
        String uri = intent.getData().toString();
        if (!t.a(uri)) {
            if (uri.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                String[] split2 = uri.split("\\?");
                uri = split2.length >= 2 ? split2[1] : "";
            }
            if (!t.a(uri) && uri.contains("&")) {
                for (String str : uri.split("&")) {
                    if (!t.a(str) && str.split("=").length >= 2) {
                        hashMap.put(str.split("=")[0], str.split("=")[1]);
                    }
                }
            }
        }
        aVar.aA = hashMap;
    }

    public final void d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b9c6ca22b54899a2dad5b02b6a04486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b9c6ca22b54899a2dad5b02b6a04486");
            return;
        }
        try {
            Intent intent = activity.getIntent();
            b(intent, this);
            c(intent, this);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public static a b(Intent intent, a aVar) {
        Object[] objArr = {intent, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1dfa45f3c96710071b192e948cf171f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1dfa45f3c96710071b192e948cf171f");
        }
        try {
            aVar.c = d.a(intent, "navigate_type", 0L);
            aVar.e = d.a(intent, "category_type", 0L);
            if (aVar.e == 0) {
                aVar.e = d.a(intent, "categorytype", 0L);
            }
            aVar.f = d.a(intent, "subcategorytype", "0");
            if ("0".equals(aVar.f)) {
                aVar.f = d.a(intent, "second_category_type", "0");
            }
            aVar.o = d.a(intent, "category_text", (String) null);
            if (TextUtils.isEmpty(aVar.o)) {
                aVar.o = d.a(intent, "categorytext", (String) null);
                if (TextUtils.isEmpty(aVar.o)) {
                    aVar.o = d.a(intent, "category_name", (String) null);
                }
            }
            aVar.p = d.a(intent, "subcategorytext", (String) null);
            aVar.q = d.a(intent, "scene_code", (String) null);
            aVar.r = d.a(intent, "titletext", (String) null);
            aVar.s = aa.a(intent, "navigatetext", (String) null);
            if (TextUtils.isEmpty(aVar.s)) {
                aVar.s = aVar.o;
            }
            aVar.t = true;
            aVar.bC = d.a(intent, "needlocate", (String) null);
            aVar.w = d.a(intent, "search_category_type", 0L);
            aVar.m = d.a(intent, "g_source", "");
            aVar.I = d.a(intent, "pageSource", (String) null);
            aVar.aj = d.a(intent, "extra", (String) null);
            if (TextUtils.isEmpty(aVar.I)) {
                aVar.I = aa.a(intent, "pageSource", "other");
            }
            aVar.J = aVar.I;
            aVar.ae = aa.a(intent, "key_pre_request_cache", "");
            aVar.af = aa.a(intent, "key_pre_request_cache2", "");
            aVar.ag = aa.a(intent, "home router_start_time", -1L);
            aVar.ai = aa.a(intent, "handle_locate_before_api_request ", false);
            if (intent.getData() != null && TextUtils.equals(intent.getData().getPath(), "/supermarket/superstore/home")) {
                aVar.z = true;
            }
            if (intent.getData() != null && TextUtils.equals(intent.getData().getPath(), "/supermarket/flashbuy/home")) {
                aVar.y = true;
            }
            if (!TextUtils.isEmpty(aVar.aj)) {
                JSONObject jSONObject = new JSONObject(aVar.aj);
                aVar.aS = jSONObject.optInt("is_minute_buy") == 1;
                aVar.aV = jSONObject.optInt("page_scene_code");
                aVar.be = aVar.aS && jSONObject.optString("type").equals("new_youhuayang_page");
                aVar.aW = jSONObject.optInt("anchor_index", -1);
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        if (!aVar.y && !aVar.z) {
            aVar.B = d.a(intent, "show_tabbar", 0) == 1;
            return aVar;
        }
        if (aVar.y && aVar.aS) {
            aVar.B = d.a(intent, "show_tabbar", 0) == 1;
        } else {
            aVar.B = true;
        }
        return aVar;
    }

    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedfc1b01ccd35e2615d84e106b038c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedfc1b01ccd35e2615d84e106b038c8");
        } else if (bundle == null) {
        } else {
            try {
                this.c = bundle.getLong("navigate_type", 0L);
                this.e = bundle.getLong("category_type", 0L);
                if (this.e == 0) {
                    this.e = bundle.getLong("categorytype", 0L);
                }
                this.f = bundle.getString("subcategorytype", "0");
                this.p = bundle.getString("subcategorytext", null);
                this.q = bundle.getString("scene_code", null);
                this.o = bundle.getString("category_text", null);
                if (TextUtils.isEmpty(this.o)) {
                    this.o = bundle.getString("categorytext", null);
                    if (TextUtils.isEmpty(this.o)) {
                        this.o = bundle.getString("category_name", null);
                    }
                }
                this.r = bundle.getString("titletext", null);
                this.s = bundle.getString("navigatetext", null);
                if (TextUtils.isEmpty(this.s)) {
                    this.s = this.o;
                }
                this.bC = bundle.getString("needlocate", null);
                this.w = bundle.getLong("search_category_type", 0L);
                this.y = bundle.getBoolean("is_home", false);
                this.z = bundle.getBoolean("is_new_home", false);
                this.m = bundle.getString("g_source", "");
                this.I = bundle.getString("pageSource", "other");
                this.aj = bundle.getString("extra", "");
                this.J = this.I;
                this.B = bundle.getBoolean("show_home_tab", false);
                this.C = bundle.getInt("home_tab_select_index", 0);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12cec0b700334e100c083c0a8bb1acd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12cec0b700334e100c083c0a8bb1acd");
        } else if (bundle == null) {
        } else {
            bundle.putLong("navigate_type", this.c);
            bundle.putLong("category_type", this.e);
            bundle.putLong("categorytype", this.e);
            bundle.putString("subcategorytype", this.f);
            bundle.putString("subcategorytext", this.p);
            bundle.putString("scene_code", this.q);
            bundle.putString("category_text", this.o);
            bundle.putString("categorytext", this.o);
            bundle.putString("category_name", this.o);
            bundle.putString("titletext", this.r);
            bundle.putString("navigatetext", this.s);
            bundle.putString("needlocate", this.bC);
            bundle.putLong("search_category_type", this.w);
            bundle.putBoolean("is_home", this.y);
            bundle.putBoolean("is_new_home", this.z);
            bundle.putString("g_source", this.m);
            bundle.putString("pageSource", this.I);
            bundle.putBoolean("show_home_tab", this.B);
            bundle.putInt("home_tab_select_index", this.C);
            bundle.putString("extra", this.aj);
        }
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957bf10d457613ee1699884847da4bfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957bf10d457613ee1699884847da4bfb");
        }
        if (TextUtils.isEmpty(this.r)) {
            if (TextUtils.isEmpty(this.o)) {
                return this.s;
            }
            return this.o;
        }
        return this.r;
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc7a3098c0812f06d22a9c718bcc42a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc7a3098c0812f06d22a9c718bcc42a")).booleanValue() : TextUtils.equals("1", this.bC);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9037cf14957b0a39315e9216f31505b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9037cf14957b0a39315e9216f31505b7");
            return;
        }
        this.y = z;
        this.G = z ? "c_waimai_w6xdt3ip" : "c_waimai_mosdf5bw";
    }

    public final boolean f() {
        return 1 == this.M || 1 == this.N;
    }

    private boolean w() {
        return this.M == 2;
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800b9060a1ce48a730b380fca02aa159", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800b9060a1ce48a730b380fca02aa159")).booleanValue() : l() && 2 == this.M;
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54bf58094f7eeb2f5298233cd95887b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54bf58094f7eeb2f5298233cd95887b0")).booleanValue() : (l() && f()) || m();
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1d67a740492da3d99fe4dadd34ae83", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1d67a740492da3d99fe4dadd34ae83")).booleanValue() : this.D || this.c == 102530 || this.c == 224140 || w();
    }

    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fbb5497aba5c8296335eb6379870bd0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fbb5497aba5c8296335eb6379870bd0")).intValue();
        }
        if ("wm_homepage".equals(this.I)) {
            return 1;
        }
        return "sg_homepage".equals(this.I) ? 2 : 3;
    }

    public final boolean k() {
        return !this.aE;
    }

    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce87e7f01973e33bf261ed425f5494a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce87e7f01973e33bf261ed425f5494a")).booleanValue() : this.K == 1 || this.K == 3 || m();
    }

    public final boolean m() {
        return this.be && this.K == 9;
    }

    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "066ffe69dc710d57dedaa0f0c728b8bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "066ffe69dc710d57dedaa0f0c728b8bf");
        }
        if (!l()) {
            return this.i == null ? "" : this.i;
        }
        String str = this.j;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getJSONObject(i).optString("code"));
            }
            return t.a(arrayList, CommonConstant.Symbol.COMMA);
        } catch (JSONException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return "";
        }
    }

    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe3e571ea22994492c5356186241cd8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe3e571ea22994492c5356186241cd8") : this.aP.get(this.f);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85880d085c6db6b72e472e2101dec2d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85880d085c6db6b72e472e2101dec2d9");
        } else {
            this.aP.put(this.f, str);
        }
    }

    public final long p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c34ae7e3f112ef74eae982de7b3af804", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c34ae7e3f112ef74eae982de7b3af804")).longValue();
        }
        Long l = this.aQ.get(this.f);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac7fa3830848290362163b0c091c636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac7fa3830848290362163b0c091c636");
        } else {
            this.aQ.put(this.f, Long.valueOf(this.b));
        }
    }

    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db74a971697a832e77cc434d80829645", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db74a971697a832e77cc434d80829645") : this.l.get(this.f);
    }

    public final boolean s() {
        return this.K == 4;
    }

    public final String a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf0413786647ccfdf8cc8356d6111fc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf0413786647ccfdf8cc8356d6111fc8");
        }
        if (poiVerticalityDataResponse == null) {
            return "";
        }
        List<CategoryInfo> list = poiVerticalityDataResponse.subNaviInfo != null ? poiVerticalityDataResponse.subNaviInfo.categoryInfos : null;
        if (list == null || com.sankuai.shangou.stone.util.a.c(list) == 0) {
            return "";
        }
        for (CategoryInfo categoryInfo : list) {
            if (categoryInfo != null && !TextUtils.isEmpty(this.f) && this.f.equals(categoryInfo.code)) {
                return categoryInfo.name;
            }
        }
        return "";
    }

    public final String t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c6bc0a515c47488479d735d604474c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c6bc0a515c47488479d735d604474c") : this.y ? (j.h().a("sm_home_new_strategy_page_scene_code", false) && this.aV == 2) ? "sc-native-home-superstore" : "sc-native-home2" : "sc-native-channel";
    }

    public final boolean u() {
        return this.y || this.z;
    }

    public final boolean v() {
        return this.R == 6;
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3dae0a83a93075ebfed61434733711", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3dae0a83a93075ebfed61434733711")).intValue();
        }
        int i2 = this.bn ? 30 : 0;
        return i <= 1 ? i2 - 79 : (i <= 1 || i > 4) ? (i <= 4 || i > 8) ? i2 + 0 : i2 - 30 : i2 - 69;
    }
}
