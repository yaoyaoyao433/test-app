package com.sankuai.waimai.store.search.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.bus.a;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.modular.eventbus.sharedata.SharedData;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.search.model.BrandFilter;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.DrugB2CFilterTabInfo;
import com.sankuai.waimai.store.search.model.ExpAbInfo;
import com.sankuai.waimai.store.search.model.GlobalSearchExtraInfo;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.RecommendedSearchKeyword;
import com.sankuai.waimai.store.search.model.SGActivityFilterEntity;
import com.sankuai.waimai.store.search.model.SGSearchFilterEntity;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.model.SearchFilterTabGroup;
import com.sankuai.waimai.store.search.statistics.f;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.result.mach.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SearchShareData extends SharedData {
    public static ChangeQuickRedirect a = null;
    public static String b = "supermarket";
    public String A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public Map<String, String> H;
    public Map<String, String> I;
    public int J;
    public BrandFilter K;
    public f L;
    public long M;
    public final Map<String, String> N;
    public int O;
    public final Map<String, List<String>> P;
    public final Map<String, List<String>> Q;
    public SGSearchFilterEntity R;
    public final Map<String, SearchFilterGroup> S;
    public final Map<String, GuidedItem> T;
    public final List<GuidedItem> U;
    public List<SearchFilterTabGroup> V;
    public SGActivityFilterEntity W;
    public final Map<Object, String> X;
    public final List<GuidedItem> Y;
    public Serializable Z;
    public boolean aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public String aE;
    public boolean aF;
    public boolean aG;
    public int aH;
    public int aI;
    public int aJ;
    public int aK;
    public int aL;
    public String aM;
    public String aN;
    public b.a aO;
    public boolean aP;
    public MetricsSpeedMeterTask aQ;
    public MetricsSpeedMeterTask aR;
    public MetricsSpeedMeterTask aS;
    public boolean aT;
    public boolean aU;
    public int aV;
    public boolean aW;
    public MetricsSpeedMeterTask aX;
    public String aY;
    public String aZ;
    public int aa;
    public int ab;
    public final List<String> ac;
    public String ad;
    public String ae;
    public String af;
    public String ag;
    public String ah;
    public String ai;
    public int aj;
    public boolean ak;
    public String al;
    public String am;
    public DrugB2CFilterTabInfo an;
    public boolean ao;
    public String ap;
    public final List<GuidedItem> aq;
    public final Map<String, List<String>> ar;
    public String as;
    public final Map<String, List<String>> at;
    public GlobalSearchExtraInfo.SearchSidebarDrugIm au;
    public int av;
    public int aw;
    public boolean ax;
    public boolean ay;
    public String az;
    public String ba;
    public SearchCarouselText bb;
    public String bc;
    @Deprecated
    public ExpAbInfo bd;
    public Map<String, String> be;
    public int bf;
    public boolean bg;
    public String bh;
    public String bi;
    public String bj;
    public String bk;
    public String bl;
    public String bm;
    public String bn;
    public String bo;
    public String bp;
    public String bq;
    public String br;
    public boolean bs;
    public int bt;
    public String bu;
    public String bv;
    public a bw;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public String l;
    public List<String> m;
    public int n;
    public String o;
    public int p;
    public String q;
    public String r;
    public RecommendedSearchKeyword s;
    public com.sankuai.waimai.mach.recycler.b t;
    public Map<Serializable, CommonMachData> u;
    public String v;
    public String w;
    public int x;
    public long y;
    public int z;

    public SearchShareData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd0107265c529c7f166443b5982d8eb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd0107265c529c7f166443b5982d8eb5");
            return;
        }
        this.f = "";
        this.n = 0;
        this.p = 1;
        this.q = "";
        this.t = new com.sankuai.waimai.mach.recycler.b(b);
        this.u = new ConcurrentHashMap();
        this.x = -1;
        this.F = false;
        this.G = false;
        this.H = new ConcurrentHashMap();
        this.I = new ConcurrentHashMap();
        this.L = new f();
        this.M = 0L;
        this.N = new HashMap();
        this.O = 0;
        this.P = new HashMap();
        this.Q = new HashMap();
        this.S = new HashMap();
        this.T = new HashMap();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.X = new HashMap();
        this.Y = new ArrayList();
        this.Z = null;
        this.aa = 0;
        this.ab = 0;
        this.ac = new ArrayList();
        this.ad = "";
        this.ae = "";
        this.af = "";
        this.ag = "";
        this.ah = "";
        this.ai = "";
        this.aj = -1;
        this.ak = false;
        this.al = "";
        this.am = "";
        this.ap = "";
        this.aq = new CopyOnWriteArrayList();
        this.ar = new HashMap();
        this.as = "";
        this.at = new HashMap();
        this.aI = 0;
        this.bh = "";
        this.bt = -1;
        this.bw = a.a(new a.C0185a());
    }

    public static SearchShareData a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d757c79567c657e0f5f68a12f27d3f86", RobustBitConfig.DEFAULT_VALUE)) {
            return (SearchShareData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d757c79567c657e0f5f68a12f27d3f86");
        }
        if (context instanceof FragmentActivity) {
            return b(context);
        }
        return (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(context, SearchShareData.class);
    }

    @Nullable
    public static SearchShareData b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51614a30564fb35603effcd7a19401e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (SearchShareData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51614a30564fb35603effcd7a19401e6");
        }
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (!fragmentActivity.isFinishing() && fragmentActivity.getSupportFragmentManager() != null && !fragmentActivity.getSupportFragmentManager().isDestroyed()) {
                return (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(context, SearchShareData.class);
            }
        }
        return new SearchShareData();
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae50c6484eb88b4bd320439ef253e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae50c6484eb88b4bd320439ef253e13");
        } else if (this.bw != null) {
            this.bw.c(obj);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b37ae7570f6aed46a87db7a1ca7411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b37ae7570f6aed46a87db7a1ca7411");
            return;
        }
        this.L.a().a("search_global_id", this.r).a("cat_id", Integer.valueOf(this.z)).a("stid", g.f(this)).a("keyword", this.h).a("label_word", this.l).a("template_type", Integer.valueOf(this.D)).a("filter_type", g.d(this)).a("rank_type", Long.valueOf(g.c(this))).a("is_filter_result", g.b(this)).a("is_filter_sec_result", g.e(this)).a("search_source", Integer.valueOf(this.aw)).a("tab_code", "-999").a("qw_type_id", this.g);
        if (this.bg) {
            this.L.a("sec_cat_id", Integer.valueOf(this.C > 0 ? this.C : this.B)).a("search_log_id", this.q).a("suggest_log_id", this.w).a("suggest_global_id", this.v).a("if_med_poi", 0);
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ebe01f98858e434b1bd9a03d73e67d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ebe01f98858e434b1bd9a03d73e67d")).booleanValue() : this.M > 0 || com.sankuai.shangou.stone.util.a.a((Collection<?>) g()) || com.sankuai.shangou.stone.util.a.a((Collection<?>) f());
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28804b97beab388f431321adafa0d748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28804b97beab388f431321adafa0d748");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            if (str2.equals("_search_quick_filer")) {
                this.ap = str;
            }
            if (str2.equals("_search_second_filer")) {
                this.ad = str;
            }
            if (str2.equals("_search_over_page_filer")) {
                this.ac.add(str);
            }
        }
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a178236f23a23a5bf73542bc5d0275a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a178236f23a23a5bf73542bc5d0275a7");
        } else if (str2.equals("_search_over_page_search_group")) {
            this.af = str;
        } else if (str2.equals("_search_second_search")) {
            this.ag = str;
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81420cf6a22adf4c5fc88d991f25c9b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81420cf6a22adf4c5fc88d991f25c9b1");
        } else if (!TextUtils.isEmpty(str)) {
            Iterator<Map.Entry<String, String>> it = this.N.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                if (TextUtils.equals(next == null ? null : next.getValue(), str)) {
                    it.remove();
                }
            }
            for (Map.Entry<String, List<String>> entry : this.P.entrySet()) {
                List<String> value = entry.getValue();
                if (!com.sankuai.shangou.stone.util.a.b(value)) {
                    Iterator<String> it2 = value.iterator();
                    while (it2.hasNext()) {
                        if (TextUtils.equals(it2.next(), str)) {
                            it2.remove();
                        }
                    }
                }
            }
            for (Map.Entry<String, List<String>> entry2 : this.Q.entrySet()) {
                List<String> value2 = entry2.getValue();
                if (!com.sankuai.shangou.stone.util.a.b(value2)) {
                    Iterator<String> it3 = value2.iterator();
                    while (it3.hasNext()) {
                        if (TextUtils.equals(it3.next(), str)) {
                            it3.remove();
                        }
                    }
                }
            }
            if (TextUtils.equals(this.ap, str)) {
                this.ap = "";
            }
            if (TextUtils.equals(this.ad, str)) {
                this.ad = "";
            }
            if (TextUtils.equals(this.ae, str)) {
                this.ae = "";
            }
            if (TextUtils.equals(this.al, str)) {
                this.al = "";
            }
            this.ac.remove(str);
            for (Map.Entry<String, List<String>> entry3 : this.ar.entrySet()) {
                List<String> value3 = entry3.getValue();
                if (!com.sankuai.shangou.stone.util.a.b(value3)) {
                    Iterator<String> it4 = value3.iterator();
                    while (it4.hasNext()) {
                        if (TextUtils.equals(it4.next(), str)) {
                            it4.remove();
                        }
                    }
                }
            }
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5630d307bd4cb2be5dc74d6bbd8958d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5630d307bd4cb2be5dc74d6bbd8958d3");
            return;
        }
        if (TextUtils.equals(this.as, str)) {
            this.ap = "";
        }
        for (Map.Entry<String, List<String>> entry : this.at.entrySet()) {
            List<String> value = entry.getValue();
            if (!com.sankuai.shangou.stone.util.a.b(value)) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), str)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49e90926140a1740e83dc443b6d09d7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49e90926140a1740e83dc443b6d09d7a");
            return;
        }
        this.af = "";
        c("");
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0080971daf2bf720ac277bbbf6aea8c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0080971daf2bf720ac277bbbf6aea8c7");
            return;
        }
        this.ag = "";
        this.ah = "";
        this.ai = "";
        c("");
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "027a252638e65872623a4b4fa4cf28fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "027a252638e65872623a4b4fa4cf28fb");
        } else if (t.a(str)) {
            if (!TextUtils.isEmpty(this.d)) {
                if (this.bg && this.x == 18 && this.s != null && !TextUtils.isEmpty(this.s.searchKeyword)) {
                    this.h = this.s.searchKeyword;
                } else {
                    this.h = this.d;
                }
            } else if (this.s != null) {
                this.h = this.s.searchKeyword;
            }
        } else {
            this.h = str;
        }
    }

    public final List<String> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8e4915a044876d653fe1c60de1041c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8e4915a044876d653fe1c60de1041c");
        }
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(this.as)) {
            hashSet.add(this.as);
        }
        for (Map.Entry<String, List<String>> entry : this.at.entrySet()) {
            hashSet.addAll(entry.getValue());
        }
        return new ArrayList(hashSet);
    }

    public final List<String> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2977690efb7ff38c5368859b2d505bc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2977690efb7ff38c5368859b2d505bc3");
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, String> entry : this.N.entrySet()) {
            hashSet.add(entry.getValue());
        }
        for (Map.Entry<String, List<String>> entry2 : this.P.entrySet()) {
            hashSet.addAll(entry2.getValue());
        }
        for (Map.Entry<String, List<String>> entry3 : this.Q.entrySet()) {
            hashSet.addAll(entry3.getValue());
        }
        if (!TextUtils.isEmpty(this.ap)) {
            hashSet.add(this.ap);
        }
        if (!TextUtils.isEmpty(this.ad)) {
            hashSet.add(this.ad);
        }
        if (!TextUtils.isEmpty(this.ae)) {
            hashSet.add(this.ae);
        }
        hashSet.addAll(this.ac);
        for (Map.Entry<String, List<String>> entry4 : this.ar.entrySet()) {
            hashSet.addAll(entry4.getValue());
        }
        if (!TextUtils.isEmpty(this.al)) {
            hashSet.add(this.al);
        }
        if (!TextUtils.isEmpty(this.am)) {
            hashSet.add(this.am);
        }
        return new ArrayList(hashSet);
    }

    private List<String> o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff418393d5f1003046ee4e895727c9b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff418393d5f1003046ee4e895727c9b0");
        }
        ArrayList arrayList = new ArrayList();
        if (this.R == null) {
            return arrayList;
        }
        int size = this.R.filterGroups.size();
        for (int i = 0; i < size; i++) {
            a(this.R.filterGroups.get(i), arrayList);
        }
        return arrayList;
    }

    private List<String> f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7818a43e99fef8e89286a2c26dbcb202", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7818a43e99fef8e89286a2c26dbcb202");
        }
        ArrayList arrayList = new ArrayList();
        a(this.S.get(str), arrayList);
        return arrayList;
    }

    public final void a(SearchFilterGroup searchFilterGroup, List<String> list) {
        Object[] objArr = {searchFilterGroup, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50950213efcae85553f874357a842040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50950213efcae85553f874357a842040");
        } else if (searchFilterGroup != null && !com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
            List<String> g = g();
            for (SearchFilterGroup.SearchFilterItem searchFilterItem : searchFilterGroup.filterItems) {
                if (searchFilterItem != null && g.contains(searchFilterItem.filterCode)) {
                    list.add(searchFilterItem.filterCode);
                }
            }
            if (searchFilterGroup.slideFilter != null) {
                String str = this.N.get(searchFilterGroup.groupTitle);
                if (TextUtils.isEmpty(str) || list.contains(str)) {
                    return;
                }
                list.add(str);
            }
        }
    }

    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9bb5d629ee80a93ba34c1303c7aebf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9bb5d629ee80a93ba34c1303c7aebf")).intValue();
        }
        if (this.T == null) {
            return 0;
        }
        List<String> g = g();
        for (Map.Entry<String, GuidedItem> entry : this.T.entrySet()) {
            GuidedItem value = entry.getValue();
            if (value != null) {
                List<SearchFilterGroup.SearchFilterItem> list = value.mDropDownItems;
                if (com.sankuai.shangou.stone.util.a.b(list)) {
                    continue;
                } else {
                    for (SearchFilterGroup.SearchFilterItem searchFilterItem : list) {
                        if (searchFilterItem != null && g.contains(searchFilterItem.filterCode)) {
                            return value.filterItemStatus;
                        }
                    }
                    continue;
                }
            }
        }
        return 0;
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "785c4f0aeadf30911554ea422bf903ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "785c4f0aeadf30911554ea422bf903ca");
        }
        String a2 = t.a(o(), CommonConstant.Symbol.COMMA);
        return TextUtils.isEmpty(a2) ? "-999" : a2;
    }

    public final String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb7f9fe39d43030f294815eb6e2bb37", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb7f9fe39d43030f294815eb6e2bb37");
        }
        String a2 = t.a(f(str), CommonConstant.Symbol.COMMA);
        return TextUtils.isEmpty(a2) ? "-999" : a2;
    }

    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8347f587906c6d762a9fcc95fc3b5f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8347f587906c6d762a9fcc95fc3b5f")).intValue() : com.sankuai.shangou.stone.util.a.a((List) o());
    }

    public final int e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c2317f5a35679ebc273b0afa2ed566", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c2317f5a35679ebc273b0afa2ed566")).intValue() : com.sankuai.shangou.stone.util.a.a((List) f(str));
    }

    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a825ec84f9b8cb15e3b0f8399133096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a825ec84f9b8cb15e3b0f8399133096");
        } else if (obj == null) {
        } else {
            this.X.put(obj, str);
        }
    }

    public final String b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c3ba88a4a4cb0d70f176a3aca9f134", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c3ba88a4a4cb0d70f176a3aca9f134");
        }
        if (obj == null) {
            return "";
        }
        String str = this.X.get(obj);
        if (t.a(str)) {
            if (k.a()) {
                throw new IllegalStateException("search log id is empty");
            }
            return "";
        }
        return str;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a881a4f42d570090d7422fc69f4ecce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a881a4f42d570090d7422fc69f4ecce2");
        } else {
            this.J += z ? 1 : -1;
        }
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7302b2f07e1ea2b6dd9d01e6c30f3601", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7302b2f07e1ea2b6dd9d01e6c30f3601")).booleanValue() : "1".equals(this.br);
    }

    public final int l() {
        if (this.bt != -1) {
            return this.bt;
        }
        return this.aw;
    }

    public final boolean m() {
        return this.bf != 1;
    }

    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d5a92b93f5dfe99f66d6a252b47ceaf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d5a92b93f5dfe99f66d6a252b47ceaf")).booleanValue() : m() && TextUtils.equals(this.bn, ErrorCode.ERROR_TYPE_B);
    }
}
