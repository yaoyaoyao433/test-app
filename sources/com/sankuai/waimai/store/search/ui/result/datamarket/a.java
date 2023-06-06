package com.sankuai.waimai.store.search.ui.result.datamarket;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a m;
    public final Set<Integer> b;
    final Set<String> c;
    final Set<String> d;
    public final Set<String> e;
    final Set<String> f;
    final Map<String, String> g;
    final Map<String, List<String>> h;
    final Map<String, String> i;
    private final Set<String> j;
    private final Set<Integer> k;
    private final Set<String> l;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd15e021428ce7baf2cca6002c98a664", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd15e021428ce7baf2cca6002c98a664");
            return;
        }
        this.b = new HashSet();
        this.c = new HashSet();
        this.j = new HashSet();
        this.k = new HashSet();
        this.l = new HashSet();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46d9d3df0ffe00936f30cbeaec6bcd05", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46d9d3df0ffe00936f30cbeaec6bcd05");
        }
        if (m == null) {
            synchronized (a.class) {
                if (m == null) {
                    m = new a();
                }
            }
        }
        return m;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1658c4a37728ea85a7419e13fa67905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1658c4a37728ea85a7419e13fa67905");
            return;
        }
        Integer[] numArr = (Integer[]) j.h().a("store_search_monitor/search_action_set", new TypeToken<Integer[]>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.1
        }.getType());
        if (numArr != null) {
            this.b.addAll(Arrays.asList(numArr));
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36bd5580f62b93b50c844f2f084be65c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36bd5580f62b93b50c844f2f084be65c");
            return;
        }
        String[] strArr = (String[]) j.h().a("store_search_monitor/denominator_set", new TypeToken<String[]>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.4
        }.getType());
        if (strArr != null) {
            this.c.addAll(Arrays.asList(strArr));
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798a6acf102bdec96454b06023added9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798a6acf102bdec96454b06023added9");
            return;
        }
        String[] strArr = (String[]) j.h().a("store_search_monitor/molecule_set", new TypeToken<String[]>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.5
        }.getType());
        if (strArr != null) {
            this.j.addAll(Arrays.asList(strArr));
            this.f.addAll(Arrays.asList(strArr));
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beaff6b637b8a6cd3c28d72fd385ea97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beaff6b637b8a6cd3c28d72fd385ea97");
            return;
        }
        Integer[] numArr = (Integer[]) j.h().a("store_search_monitor/drug_kingkong_id_set", new TypeToken<Integer[]>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.6
        }.getType());
        if (numArr != null) {
            this.k.addAll(Arrays.asList(numArr));
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ad1a94d89729100e607efce5cf5ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ad1a94d89729100e607efce5cf5ce0");
            return;
        }
        String[] strArr = (String[]) j.h().a("store_search_monitor/business_template_id_set", new TypeToken<String[]>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.7
        }.getType());
        if (strArr != null) {
            this.l.addAll(Arrays.asList(strArr));
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb527117832404184eeccbd2761767aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb527117832404184eeccbd2761767aa");
            return;
        }
        String[] strArr = (String[]) j.h().a("store_search_monitor/stid_set", new TypeToken<String[]>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.8
        }.getType());
        if (strArr != null) {
            this.d.addAll(Arrays.asList(strArr));
        }
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283f409d4647a85aa3453724b71dfd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283f409d4647a85aa3453724b71dfd01");
            return;
        }
        String[] strArr = (String[]) j.h().a("store_search_monitor/in_shop_stid_set", new TypeToken<String[]>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.9
        }.getType());
        if (strArr != null) {
            this.e.addAll(Arrays.asList(strArr));
        }
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "becf9e283194475e49d1f23f97e0992e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "becf9e283194475e49d1f23f97e0992e");
            return;
        }
        String[] strArr = (String[]) j.h().a("store_search_monitor/check_bid_set", new TypeToken<String[]>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.10
        }.getType());
        if (strArr != null) {
            this.f.addAll(Arrays.asList(strArr));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c44cc094dc264f10e207a23a70d12b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c44cc094dc264f10e207a23a70d12b8");
            return;
        }
        Map map = (Map) j.h().a("store_search_monitor/check_bid_white_list", new TypeToken<Map<String, String>>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.11
        }.getType());
        if (map == null || map.size() == 0) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                this.h.put(entry.getKey(), Arrays.asList(TextUtils.split((String) entry.getValue(), ";")));
            }
        }
    }

    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4b68fd62a799a58d02e3412fa8f4c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4b68fd62a799a58d02e3412fa8f4c28");
            return;
        }
        Map<? extends String, ? extends String> map = (Map) j.h().a("store_search_monitor/custom_check_bid_set", new TypeToken<Map<String, String>>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.2
        }.getType());
        if (map != null) {
            this.g.putAll(map);
        }
    }

    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb1e406b295b899135500f8d00c650c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb1e406b295b899135500f8d00c650c");
            return;
        }
        Map<? extends String, ? extends String> map = (Map) j.h().a("store_search_monitor/statistic_param_regex", new TypeToken<Map<String, String>>() { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.a.3
        }.getType());
        if (map != null) {
            this.i.putAll(map);
        }
    }

    @NonNull
    public final Set<String> m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad31bb0e3db504b0c13172d7e210a621", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad31bb0e3db504b0c13172d7e210a621");
        }
        if (this.j.isEmpty()) {
            d();
        }
        return this.j;
    }

    @NonNull
    public final Set<Integer> n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff22aa0de95f8e1d055f44c8a13ae194", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff22aa0de95f8e1d055f44c8a13ae194");
        }
        if (this.k.isEmpty()) {
            e();
        }
        return this.k;
    }

    @NonNull
    public final Set<String> o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ea87f27fb7a3848dc215449017314c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ea87f27fb7a3848dc215449017314c");
        }
        if (this.l.isEmpty()) {
            f();
        }
        return this.l;
    }
}
