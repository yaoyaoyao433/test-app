package com.dianping.widget.view;

import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements Cloneable {
    public static ChangeQuickRedirect a;
    public String A;
    public String B;
    public String C;
    public String D;
    public Integer E;
    public Integer F;
    public String G;
    public String H;
    public Map<String, String> I;
    public boolean J;
    public String b;
    public Integer c;
    public String d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public long i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public String o;
    public Integer p;
    public Integer q;
    public Integer r;
    public Integer s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public Integer y;
    public String z;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678dbff9f4c88b27634802abeae484b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678dbff9f4c88b27634802abeae484b9");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = Long.MAX_VALUE;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = new HashMap();
        this.J = false;
    }

    public final Object clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434180eee244eafa8d59bcbc5bf049d5", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434180eee244eafa8d59bcbc5bf049d5");
        }
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final void a(Map<String, String> map, d dVar) {
        Object[] objArr = {map, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bfa9a88bba9f8e04b2176a343e93d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bfa9a88bba9f8e04b2176a343e93d88");
            return;
        }
        a(map, "query_id", (dVar == null || dVar.b == null) ? this.b : dVar.b);
        a(map, "sort_id", (dVar == null || dVar.c == null) ? this.c : dVar.c);
        a(map, "keyword", (dVar == null || dVar.d == null) ? this.d : dVar.d);
        a(map, "dealgroup_id", (dVar == null || dVar.e == null) ? this.e : dVar.e);
        a(map, "deal_id", (dVar == null || dVar.f == null) ? this.f : dVar.f);
        a(map, DataConstants.CATEGORY_ID, (dVar == null || dVar.g == null) ? this.g : dVar.g);
        a(map, Constants.Business.KEY_RECEIPT_ID, (dVar == null || dVar.h == null) ? this.h : dVar.h);
        if (dVar != null && dVar.i != Long.MAX_VALUE) {
            a(map, "order_id", Long.valueOf(dVar.i));
        } else if (this.i != Long.MAX_VALUE) {
            a(map, "order_id", Long.valueOf(this.i));
        } else {
            a(map, "order_id", null);
        }
        a(map, "region_id", (dVar == null || dVar.j == null) ? this.j : dVar.j);
        a(map, Constants.Business.KEY_PROMOT_ID, (dVar == null || dVar.k == null) ? this.k : dVar.k);
        a(map, Constants.Business.KEY_CHECKIN_ID, (dVar == null || dVar.l == null) ? this.l : dVar.l);
        a(map, Constants.Business.KEY_BOOK_ID, (dVar == null || dVar.m == null) ? this.m : dVar.m);
        a(map, Constants.Business.KEY_MEMBER_CARD_ID, (dVar == null || dVar.n == null) ? this.n : dVar.n);
        a(map, Constants.Environment.KEY_UTM, (dVar == null || dVar.o == null) ? this.o : dVar.o);
        a(map, "shop_id", (dVar == null || dVar.p == null) ? this.p : dVar.p);
        a(map, Constants.Business.KEY_REVIEW_ID, (dVar == null || dVar.q == null) ? this.q : dVar.q);
        a(map, "index", (dVar == null || dVar.r == null) ? this.r : dVar.r);
        a(map, "butag", (dVar == null || dVar.s == null) ? this.s : dVar.s);
        a(map, "url", (dVar == null || dVar.t == null) ? this.t : dVar.t);
        a(map, "title", (dVar == null || dVar.u == null) ? this.u : dVar.u);
        a(map, "marketing_source", (dVar == null || dVar.v == null) ? this.v : dVar.v);
        a(map, "ad_id", (dVar == null || dVar.w == null) ? this.w : dVar.w);
        a(map, "biz_id", (dVar == null || dVar.x == null) ? this.x : dVar.x);
        a(map, "sectionIndex", (dVar == null || dVar.y == null) ? this.y : dVar.y);
        a(map, Constants.Business.KEY_PREPAY_INFO, (dVar == null || dVar.z == null) ? this.z : dVar.z);
        a(map, Constants.Business.KEY_BU_ID, (dVar == null || dVar.A == null) ? this.A : dVar.A);
        a(map, "abtest", (dVar == null || dVar.B == null) ? this.B : dVar.B);
        a(map, "ugc_feed_id", (dVar == null || dVar.D == null) ? this.D : dVar.D);
        a(map, "content_id", (dVar == null || dVar.E == null) ? this.E : dVar.E);
        a(map, "live_id", (dVar == null || dVar.F == null) ? this.F : dVar.F);
        a(map, "experiment", (dVar == null || dVar.G == null) ? this.G : dVar.G);
        a(map, "lx_channel", (dVar == null || dVar.H == null) ? this.H : dVar.H);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.I.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (dVar != null && dVar.I != null && dVar.I.size() > 0) {
            for (Map.Entry<String, String> entry2 : dVar.I.entrySet()) {
                try {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        a(map, "custom", jSONObject.length() > 0 ? jSONObject : null);
    }

    private void a(Map<String, String> map, String str, Object obj) {
        Object[] objArr = {map, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f626e074155ebee60f92f9acc2a157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f626e074155ebee60f92f9acc2a157");
        } else if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    private Integer a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0543ab6867f417265b711180929f59bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0543ab6867f417265b711180929f59bd");
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final void a(Map<String, String> map) {
        JSONObject jSONObject;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69792e5296eb6d55e9c435837437c3fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69792e5296eb6d55e9c435837437c3fc");
        } else if (map.isEmpty()) {
        } else {
            if (this.b == null && map.containsKey("query_id")) {
                this.b = map.get("query_id");
            }
            if (this.c == null && map.containsKey("sort_id")) {
                this.c = a(map.get("sort_id"));
            }
            if (this.d == null && map.containsKey("keyword")) {
                this.d = map.get("keyword");
            }
            if (this.e == null && map.containsKey("dealgroup_id")) {
                this.e = a(map.get("dealgroup_id"));
            }
            if (this.f == null && map.containsKey("deal_id")) {
                this.f = a(map.get("deal_id"));
            }
            if (this.g == null && map.containsKey(DataConstants.CATEGORY_ID)) {
                this.g = a(map.get(DataConstants.CATEGORY_ID));
            }
            if (this.h == null && map.containsKey(Constants.Business.KEY_RECEIPT_ID)) {
                this.h = a(map.get(Constants.Business.KEY_RECEIPT_ID));
            }
            if (this.i == Long.MAX_VALUE && map.containsKey("order_id")) {
                Long valueOf = Long.valueOf(map.get("order_id"));
                this.i = valueOf != null ? valueOf.longValue() : Long.MAX_VALUE;
            }
            if (this.j == null && map.containsKey("region_id")) {
                this.j = a(map.get("region_id"));
            }
            if (this.k == null && map.containsKey(Constants.Business.KEY_PROMOT_ID)) {
                this.k = a(map.get(Constants.Business.KEY_PROMOT_ID));
            }
            if (this.l == null && map.containsKey(Constants.Business.KEY_CHECKIN_ID)) {
                this.l = a(map.get(Constants.Business.KEY_CHECKIN_ID));
            }
            if (this.m == null && map.containsKey(Constants.Business.KEY_BOOK_ID)) {
                this.m = a(map.get(Constants.Business.KEY_BOOK_ID));
            }
            if (this.n == null && map.containsKey(Constants.Business.KEY_MEMBER_CARD_ID)) {
                this.n = a(map.get(Constants.Business.KEY_MEMBER_CARD_ID));
            }
            if (this.o == null && map.containsKey(Constants.Environment.KEY_UTM)) {
                this.o = map.get(Constants.Environment.KEY_UTM);
            }
            if (this.p == null && map.containsKey("shop_id")) {
                this.p = a(map.get("shop_id"));
            }
            if (this.q == null && map.containsKey(Constants.Business.KEY_REVIEW_ID)) {
                this.q = a(map.get(Constants.Business.KEY_REVIEW_ID));
            }
            if (this.r == null && map.containsKey("index")) {
                this.r = a(map.get("index"));
            }
            if (this.s == null && map.containsKey("butag")) {
                this.s = a(map.get("butag"));
            }
            if (this.t == null && map.containsKey("url")) {
                this.t = map.get("url");
            }
            if (this.u == null && map.containsKey("title")) {
                this.u = map.get("title");
            }
            if (this.v == null && map.containsKey("marketing_source")) {
                this.v = map.get("marketing_source");
            }
            if (this.w == null && map.containsKey("ad_id")) {
                this.w = map.get("ad_id");
            }
            if (this.x == null && map.containsKey("biz_id")) {
                this.x = map.get("biz_id");
            }
            if (this.y == null && map.containsKey("sectionIndex")) {
                this.y = a(map.get("sectionIndex"));
            }
            if (this.z == null && map.containsKey(Constants.Business.KEY_PREPAY_INFO)) {
                this.z = map.get(Constants.Business.KEY_PREPAY_INFO);
            }
            if (this.A == null && map.containsKey(Constants.Business.KEY_BU_ID)) {
                this.A = map.get(Constants.Business.KEY_BU_ID);
            }
            if (this.B == null && map.containsKey("abtest")) {
                this.B = map.get("abtest");
            }
            if (this.C == null && map.containsKey("bid")) {
                this.C = map.get("bid");
            }
            if (this.D == null && map.containsKey("ugc_feed_id")) {
                this.D = map.get("ugc_feed_id");
            }
            if (this.E == null && map.containsKey("content_id")) {
                this.E = a(map.get("content_id"));
            }
            if (this.F == null && map.containsKey("live_id")) {
                this.F = a(map.get("live_id"));
            }
            if (this.G == null && map.containsKey("experiment")) {
                this.G = map.get("experiment");
            }
            if (this.H == null && map.containsKey("lx_channel")) {
                this.H = map.get("lx_channel");
            }
            if ((this.I == null || this.I.isEmpty()) && map.containsKey("custom")) {
                if (this.I == null) {
                    this.I = new HashMap();
                }
                try {
                    jSONObject = new JSONObject(map.get("custom"));
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.I.put(next, jSONObject.optString(next));
                }
            }
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c296132456184fc24b1bb77514b5cb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c296132456184fc24b1bb77514b5cb2")).intValue();
        }
        int hashCode = this.b != null ? 0 ^ this.b.hashCode() : 0;
        if (this.c != null) {
            hashCode ^= this.c.hashCode();
        }
        if (this.d != null) {
            hashCode ^= this.d.hashCode();
        }
        if (this.e != null) {
            hashCode ^= this.e.hashCode();
        }
        if (this.f != null) {
            hashCode ^= this.f.hashCode();
        }
        if (this.g != null) {
            hashCode ^= this.g.hashCode();
        }
        if (this.h != null) {
            hashCode ^= this.h.hashCode();
        }
        if (this.i != Long.MAX_VALUE) {
            hashCode ^= Long.valueOf(this.i).hashCode();
        }
        if (this.j != null) {
            hashCode ^= this.j.hashCode();
        }
        if (this.k != null) {
            hashCode ^= this.k.hashCode();
        }
        if (this.l != null) {
            hashCode ^= this.l.hashCode();
        }
        if (this.m != null) {
            hashCode ^= this.m.hashCode();
        }
        if (this.n != null) {
            hashCode ^= this.n.hashCode();
        }
        if (this.o != null) {
            hashCode ^= this.o.hashCode();
        }
        if (this.p != null) {
            hashCode ^= this.p.hashCode();
        }
        if (this.q != null) {
            hashCode ^= this.q.hashCode();
        }
        if (this.r != null) {
            hashCode ^= this.r.hashCode();
        }
        if (this.s != null) {
            hashCode ^= this.s.hashCode();
        }
        if (this.t != null) {
            hashCode ^= this.t.hashCode();
        }
        if (this.u != null) {
            hashCode ^= this.u.hashCode();
        }
        if (this.v != null) {
            hashCode ^= this.v.hashCode();
        }
        if (this.w != null) {
            hashCode ^= this.w.hashCode();
        }
        if (this.x != null) {
            hashCode ^= this.x.hashCode();
        }
        if (this.y != null) {
            hashCode ^= this.y.hashCode();
        }
        if (this.z != null) {
            hashCode ^= this.z.hashCode();
        }
        if (this.A != null) {
            hashCode ^= this.A.hashCode();
        }
        if (this.B != null) {
            hashCode ^= this.B.hashCode();
        }
        if (this.C != null) {
            hashCode ^= this.C.hashCode();
        }
        if (this.D != null) {
            hashCode ^= this.D.hashCode();
        }
        if (this.E != null) {
            hashCode ^= this.E.hashCode();
        }
        if (this.F != null) {
            hashCode ^= this.F.hashCode();
        }
        if (this.G != null) {
            hashCode ^= this.G.hashCode();
        }
        for (Map.Entry<String, String> entry : this.I.entrySet()) {
            hashCode ^= entry.getValue().hashCode();
        }
        return hashCode;
    }
}
