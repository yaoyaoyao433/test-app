package com.sankuai.waimai.store.search.ui.result.datamarket;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile e i;
    private Set<String> b;
    private Map<String, List<String>> c;
    private List<String> d;
    private Map<String, String> e;
    private Map<String, String> f;
    private final Map<String, Integer> g;
    private final Map<String, Integer> h;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4febf6b4e9c27f2acbad18c358b27eaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4febf6b4e9c27f2acbad18c358b27eaa");
            return;
        }
        this.g = new HashMap();
        this.h = new HashMap();
    }

    public static e a() {
        Set<String> set;
        Map<String, String> map;
        Map<String, List<String>> map2;
        Map<String, String> map3;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e08e70b9415bba9150f886e8a06be40d", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e08e70b9415bba9150f886e8a06be40d");
        }
        if (i == null) {
            synchronized (e.class) {
                if (i == null) {
                    e eVar = new e();
                    i = eVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "0c044397d6d4775b07ebc869042422a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "0c044397d6d4775b07ebc869042422a6");
                    } else {
                        a a2 = a.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "65b8e6ca9401c1bb9e3135cf17f6b29f", RobustBitConfig.DEFAULT_VALUE)) {
                            set = (Set) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "65b8e6ca9401c1bb9e3135cf17f6b29f");
                        } else {
                            if (a2.f.isEmpty()) {
                                a2.i();
                            }
                            set = a2.f;
                        }
                        eVar.b = set;
                        a a3 = a.a();
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "878ecc24867972b690dd21a1bd2ce453", RobustBitConfig.DEFAULT_VALUE)) {
                            map = (Map) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "878ecc24867972b690dd21a1bd2ce453");
                        } else {
                            if (a3.g.isEmpty()) {
                                a3.k();
                            }
                            map = a3.g;
                        }
                        eVar.e = map;
                        a a4 = a.a();
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr5, a4, changeQuickRedirect5, false, "465f96163dd5efee46dbae44e87b69f0", RobustBitConfig.DEFAULT_VALUE)) {
                            map2 = (Map) PatchProxy.accessDispatch(objArr5, a4, changeQuickRedirect5, false, "465f96163dd5efee46dbae44e87b69f0");
                        } else {
                            if (a4.h.isEmpty()) {
                                a4.j();
                            }
                            map2 = a4.h;
                        }
                        eVar.c = map2;
                        a a5 = a.a();
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a.a;
                        if (PatchProxy.isSupport(objArr6, a5, changeQuickRedirect6, false, "603c40a85d64b4045a631b90af4100de", RobustBitConfig.DEFAULT_VALUE)) {
                            map3 = (Map) PatchProxy.accessDispatch(objArr6, a5, changeQuickRedirect6, false, "603c40a85d64b4045a631b90af4100de");
                        } else {
                            if (a5.i.isEmpty()) {
                                a5.l();
                            }
                            map3 = a5.i;
                        }
                        eVar.f = map3;
                    }
                }
            }
        }
        return i;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a456348dc324cf5cca0c24681179ceb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a456348dc324cf5cca0c24681179ceb5");
        } else {
            this.g.clear();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba1c55d12b98fce97f6d8810cdec566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba1c55d12b98fce97f6d8810cdec566");
        } else {
            this.h.clear();
        }
    }

    public final void a(EventInfo eventInfo) {
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e5aac4ce9d52414dea8d9cdb8afc547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e5aac4ce9d52414dea8d9cdb8afc547");
            return;
        }
        if (TextUtils.equals(eventInfo.val_cid, "c_nfqbfvw")) {
            a(eventInfo.val_bid, eventInfo.val_lab);
            a(eventInfo.val_bid, eventInfo.val_lab, 1);
        }
        if ("rn_sgc_flashbuy-restaurant-search-new".equals(eventInfo.val_lab.get("mrn_bundle_name"))) {
            if (TextUtils.equals(eventInfo.val_bid, "b_bx5fhk5t")) {
                c();
            }
            b(eventInfo.val_bid, eventInfo.val_lab);
            a(eventInfo.val_bid, eventInfo.val_lab, 2);
        }
    }

    private void a(@NonNull String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "235217bc0a2ed0dfb700ceecf6a5e369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "235217bc0a2ed0dfb700ceecf6a5e369");
        } else if (this.b.contains(str)) {
            a(SGSearchStatistic.SearchLogId, str, map, "search_log_id", 7, 1);
            a(SGSearchStatistic.CatId, str, map, "cat_id", 9, 1);
            a(SGSearchStatistic.Stid, str, map, "stid", 7, 1);
            a(SGSearchStatistic.Keyword, str, map, "keyword", 7, 1);
            a(SGSearchStatistic.SearchSource, str, map, "search_source", 17, 1);
            a(SGSearchStatistic.SearchGlobalId, str, map, "search_global_id", 7, 1);
            a(SGSearchStatistic.Index, str, map, "index", 17, 1);
            a(SGSearchStatistic.TemplateType, str, map, "template_type", 17, 1);
            a(SGSearchStatistic.RankType, str, map, "rank_type", 17, 1);
            a(SGSearchStatistic.FilterType, str, map, "filter_type", 7, 1);
            a(SGSearchStatistic.IsLbs, str, map, "is_lbs", 17, 1);
        }
    }

    private void b(@NonNull String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e132b7966e4904b2d2693a348d5679ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e132b7966e4904b2d2693a348d5679ac");
        } else if (this.b.contains(str)) {
            a(SGSearchStatistic.InShopGlobalId, str, map, "poisearch_global_id", 7, 2);
            a(SGSearchStatistic.InShopLogId, str, map, "poisearch_log_id", 7, 2);
            a(SGSearchStatistic.InShopStid, str, map, "stid", 7, 2);
            a(SGSearchStatistic.InShopPoiId, str, map, "poi_id", 7, 2);
            a(SGSearchStatistic.InShopKeyword, str, map, "keyword", 7, 2);
            a(SGSearchStatistic.InShopIndex, str, map, "index", 17, 2);
            a(SGSearchStatistic.InShopSpuId, str, map, "spu_id", 87, 2);
            a(SGSearchStatistic.InShopSkuId, str, map, "sku_id", 87, 2);
            a(SGSearchStatistic.InShopPositionIndex, str, map, "position_index", 9, 2);
        }
    }

    private void a(@NonNull String str, @NonNull Map<String, Object> map, int i2) {
        String[] split;
        int i3;
        Object[] objArr = {str, map, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1af69d133b5b1cb36d9e8c131f4ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1af69d133b5b1cb36d9e8c131f4ffe");
            return;
        }
        String str2 = this.e.get(str);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        for (String str3 : str2.split(";")) {
            if (!TextUtils.isEmpty(str3)) {
                String[] split2 = str3.split(CommonConstant.Symbol.MINUS);
                if (split2.length >= 2) {
                    String str4 = split2[0];
                    try {
                        i3 = Integer.parseInt(split2[1], 2);
                    } catch (Exception unused) {
                        i3 = 0;
                    }
                    if (!TextUtils.isEmpty(str4) && i3 != 0) {
                        a(SGSearchStatistic.Custom, str, map, str4, i3, i2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.sankuai.waimai.store.util.monitor.monitor.IMonitor r16, @android.support.annotation.NonNull java.lang.String r17, @android.support.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> r18, @android.support.annotation.NonNull java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.ui.result.datamarket.e.a(com.sankuai.waimai.store.util.monitor.monitor.IMonitor, java.lang.String, java.util.Map, java.lang.String, int, int):void");
    }

    private void b(IMonitor iMonitor, @NonNull String str, @NonNull Map<String, Object> map, @NonNull String str2, int i2, int i3) {
        Object[] objArr = {iMonitor, str, map, str2, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "456ae1422b882bc686a52b1f1072972c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "456ae1422b882bc686a52b1f1072972c");
            return;
        }
        String str3 = str + str2;
        Map<String, Integer> map2 = i3 == 1 ? this.g : this.h;
        Integer num = map2.containsKey(str3) ? map2.get(str3) : null;
        int intValue = num == null ? 0 : num.intValue();
        int i4 = (intValue ^ i2) & i2;
        if (i4 > 0) {
            map2.put(str3, Integer.valueOf(i4 | intValue));
            HashMap hashMap = new HashMap();
            hashMap.put("bid", str);
            hashMap.putAll(map);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("page", i3 == 1 ? "channel" : "inshop");
            hashMap2.put("bid", str);
            hashMap2.put("param_key", str2);
            hashMap2.put("error", a(i2));
            com.sankuai.waimai.store.util.monitor.c.a(iMonitor, i.a(hashMap), null, hashMap2);
            if (this.b.isEmpty() || !this.c.isEmpty()) {
                return;
            }
            JsonObject g = j.h().g();
            com.sankuai.waimai.store.util.monitor.b.a().a(SGSearchStatistic.Horn).a(((((g == null ? StringUtil.NULL : g.toString()) + "&&inspect=" + this.b.toString()) + "&&white=" + this.c.toString()) + "bid=" + str) + "param_key" + str2).a();
        }
    }

    private String a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f76a29aa910d96563cff3854906e1f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f76a29aa910d96563cff3854906e1f7");
        }
        if (i2 != 4) {
            if (i2 != 8) {
                if (i2 != 16) {
                    if (i2 != 32) {
                        if (i2 != 64) {
                            switch (i2) {
                                case 1:
                                    return "not_report";
                                case 2:
                                    return "report_null";
                                default:
                                    return String.valueOf(i2);
                            }
                        }
                        return "report_0";
                    }
                    return "report_-999";
                }
                return "report_<0";
            }
            return "regex_match";
        }
        return "string_empty";
    }
}
