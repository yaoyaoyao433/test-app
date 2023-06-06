package com.sankuai.waimai.store.widgets.filterbar.home.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.h;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
import com.sankuai.waimai.store.widgets.filterbar.home.model.c;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.FilterBaseDataItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends h.a {
    public static ChangeQuickRedirect c;
    final Map<String, FilterConditionResponse> d;
    boolean e;
    FilterConditionResponse f;
    FilterConditionResponse g;
    FilterConditionResponse h;
    protected c i;
    protected final com.sankuai.waimai.store.widgets.filterbar.home.controller.a j;
    private final Map<Integer, Map<String, List<String>>> k;
    private final Map<Integer, Map<String, List<String>>> l;
    private final Set<String> m;
    private final Context n;
    private final String o;
    private long p;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(FilterConditionResponse filterConditionResponse);
    }

    public i(c cVar, com.sankuai.waimai.store.widgets.filterbar.home.controller.a aVar, boolean z, Context context, String str, h.b... bVarArr) {
        super(bVarArr);
        Object[] objArr = {cVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), context, str, bVarArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad5deaadc883b09b4799b98bc350cca5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad5deaadc883b09b4799b98bc350cca5");
            return;
        }
        this.k = new HashMap();
        this.l = new HashMap();
        this.d = new HashMap();
        this.m = new HashSet();
        this.p = 0L;
        this.i = cVar;
        this.j = aVar;
        this.n = context;
        this.o = str;
        this.e = z;
        a(0, this.k);
        a(0, this.l);
        a(1, this.k);
        a(1, this.l);
        a(2, this.k);
        a(2, this.l);
        a(0L);
        a(2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void a(boolean z) {
        this.e = z;
    }

    private void a(int i, Map<Integer, Map<String, List<String>>> map) {
        Object[] objArr = {Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa06e4a7628a6b2794a516976b806f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa06e4a7628a6b2794a516976b806f45");
        } else {
            map.put(Integer.valueOf(i), new HashMap());
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final long a() {
        return this.p;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e5cdbc438c60f478790ba7f2f6540e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e5cdbc438c60f478790ba7f2f6540e");
            return;
        }
        this.p = j;
        List<SortItem> n = this.i.n();
        String str = null;
        if (com.sankuai.shangou.stone.util.a.b(n)) {
            this.b.a(j, (List<SortItem>) null);
            this.b.b(j, null);
            this.b.b(false);
            return;
        }
        this.b.b(true);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SortItem sortItem : n) {
            if (sortItem != null) {
                if (sortItem.position == 1) {
                    if (j == sortItem.code) {
                        str = sortItem.name;
                    }
                    arrayList.add(sortItem);
                } else if (sortItem.position == 0) {
                    SGSortModel sGSortModel = new SGSortModel();
                    boolean z = com.sankuai.shangou.stone.util.a.a((List) sortItem.allCode) > 1;
                    sGSortModel.style = z ? 2 : 1;
                    sGSortModel.category = sortItem.code;
                    sGSortModel.text = sortItem.shortName;
                    sGSortModel.typeList = new ArrayList();
                    if (z) {
                        sGSortModel.typeList.addAll(sortItem.allCode);
                    } else {
                        sGSortModel.typeList.add(Long.valueOf(sortItem.code));
                    }
                    arrayList2.add(sGSortModel);
                }
            }
        }
        this.b.a(j, arrayList);
        this.b.b(j, arrayList2);
        if (!TextUtils.isEmpty(str)) {
            this.b.a(str, true);
            return;
        }
        SortItem sortItem2 = (SortItem) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, 0);
        if (sortItem2 != null) {
            this.b.a(sortItem2.name, false);
        } else {
            this.b.a("", false);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void a(int i, boolean z, String str, boolean z2, String str2, boolean z3) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1ff531e1ee2c0b9875af7761ae13c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1ff531e1ee2c0b9875af7761ae13c6");
            return;
        }
        Map<String, List<String>> map = this.l.get(Integer.valueOf(i));
        if (map == null) {
            map = this.l.get(2);
        }
        List<String> list = map.get(str);
        if (list == null) {
            list = new ArrayList<>();
            map.put(str, list);
        }
        List<String> list2 = list;
        if (!z) {
            list2.clear();
        }
        if (z2) {
            if (!list2.contains(str2)) {
                list2.add(str2);
            }
        } else {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                List<String> value = entry.getValue();
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) value)) {
                    value.remove(str2);
                }
            }
        }
        if (z3) {
            f(i);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19af8271ef272b82a8a58f9a3281b5e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19af8271ef272b82a8a58f9a3281b5e8");
            return;
        }
        Map<String, List<String>> map = this.k.get(Integer.valueOf(i));
        if (map == null) {
            map = this.k.get(2);
        }
        map.clear();
        Map<String, List<String>> map2 = this.l.get(Integer.valueOf(i));
        if (map2 == null) {
            map2 = this.l.get(2);
        }
        for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) entry.getValue())) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
        }
        a(i);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb45ac34435569e16f7ab7068ce0d102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb45ac34435569e16f7ab7068ce0d102");
            return;
        }
        if (this.k.get(Integer.valueOf(i)) != null) {
            this.k.get(Integer.valueOf(i)).clear();
        }
        if (this.l.get(Integer.valueOf(i)) != null) {
            this.l.get(Integer.valueOf(i)).clear();
        }
        f(i);
        a(i);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cdc1dccf527c02e7a6888203247368c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cdc1dccf527c02e7a6888203247368c");
            return;
        }
        for (Integer num : this.k.keySet()) {
            this.k.get(num).clear();
        }
        for (Integer num2 : this.l.keySet()) {
            this.l.get(num2).clear();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    @NonNull
    public final List<String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4c9b18eeaf1cf85922e1d675d68667", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4c9b18eeaf1cf85922e1d675d68667");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Map<String, List<String>>> entry : this.k.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                for (Map.Entry<String, List<String>> entry2 : entry.getValue().entrySet()) {
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) entry2.getValue())) {
                        String key = entry2.getKey();
                        if (this.e) {
                            if (!this.m.contains(key)) {
                                arrayList.addAll(entry2.getValue());
                            }
                        } else {
                            arrayList.addAll(entry2.getValue());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    @NonNull
    public final List<FilterBaseDataItem> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d4567b892e58195d11fc94f7903939", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d4567b892e58195d11fc94f7903939");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Map<String, List<String>>> entry : this.k.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                for (Map.Entry<String, List<String>> entry2 : entry.getValue().entrySet()) {
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) entry2.getValue())) {
                        String key = entry2.getKey();
                        for (String str : entry2.getValue()) {
                            if (this.m.contains(key)) {
                                FilterBaseDataItem filterBaseDataItem = new FilterBaseDataItem();
                                filterBaseDataItem.groupName = key;
                                filterBaseDataItem.code = str;
                                arrayList.add(filterBaseDataItem);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void a(final int i, long j, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14adc298f2975d698f81ef990d8f24a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14adc298f2975d698f81ef990d8f24a2");
        } else if (i == 2) {
            a(j, str, 0, i2, new k<FilterConditionResponse>() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.controller.i.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    FilterConditionResponse filterConditionResponse = (FilterConditionResponse) obj;
                    Object[] objArr2 = {filterConditionResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3de33c46c2da7452b8edc0263003fa57", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3de33c46c2da7452b8edc0263003fa57");
                        return;
                    }
                    i.this.f = filterConditionResponse;
                    i.this.a(filterConditionResponse);
                    i.this.a(2, filterConditionResponse);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ceed08dcf4e1fb484d568dc4c2198ac8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ceed08dcf4e1fb484d568dc4c2198ac8");
                    } else {
                        i.this.b.a(i, 1, (List<String>) null, (List<FilterConditionResponse.FilterGroup>) null);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ff9ee1dfeace3e09fda02d77671a7f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ff9ee1dfeace3e09fda02d77671a7f1");
                    } else {
                        i.this.b.a(i, 2, (List<String>) null, (List<FilterConditionResponse.FilterGroup>) null);
                    }
                }
            });
        } else {
            Object[] objArr2 = {new Long(j), str, Integer.valueOf(i2), null};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2cdc762b51813320435bd7af43965e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2cdc762b51813320435bd7af43965e8");
            } else {
                a(j, str, 1, i2, new k<FilterConditionResponse>() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.controller.i.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(Object obj) {
                        FilterConditionResponse filterConditionResponse = (FilterConditionResponse) obj;
                        Object[] objArr3 = {filterConditionResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "525e0e60fd3b35a960a44604755a0a2f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "525e0e60fd3b35a960a44604755a0a2f");
                            return;
                        }
                        if (i.this.e) {
                            com.sankuai.shangou.stone.util.a.b(filterConditionResponse.sortList);
                            if (!com.sankuai.shangou.stone.util.a.b(filterConditionResponse.middleFilter)) {
                                i.this.h = filterConditionResponse;
                                i.this.b(filterConditionResponse);
                                i.this.a(0, filterConditionResponse);
                                i.this.a(1, filterConditionResponse);
                            }
                        } else {
                            i.this.g = filterConditionResponse;
                        }
                        i.this.a(filterConditionResponse);
                        i.this.c(filterConditionResponse);
                        if (filterConditionResponse != null) {
                            i.this.b.c(filterConditionResponse.isDisplayFilter());
                        }
                        if (r2 != null) {
                            r2.a(filterConditionResponse);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr3 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c787a7a361d61e33e0c2839404ab906e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c787a7a361d61e33e0c2839404ab906e");
                            return;
                        }
                        i.this.b.a(false, "", (List<String>) null, (List<FilterConditionResponse.FilterGroup.FilterItem>) null);
                        i.this.b.c(false);
                        if (r2 != null) {
                            r2.a(null);
                        }
                    }
                });
            }
        }
    }

    void a(FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "364650f09135107a7a69f7121a48aee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "364650f09135107a7a69f7121a48aee2");
        } else if (filterConditionResponse == null) {
        } else {
            a(filterConditionResponse.getFilterList());
            a(filterConditionResponse.middleFilter);
        }
    }

    private void a(List<FilterConditionResponse.FilterGroup> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f4c58a7eed554c7b05ca67c3f76336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f4c58a7eed554c7b05ca67c3f76336");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (FilterConditionResponse.FilterGroup filterGroup : list) {
                if (filterGroup != null && !com.sankuai.shangou.stone.util.a.b(filterGroup.favourItems)) {
                    c.a.a.a(filterGroup.groupTitle, filterGroup.code);
                    if (filterGroup.type == 1) {
                        this.m.add(filterGroup.groupTitle);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {Integer.valueOf(i), filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c3f9db8c45bdedd10100d5040dadb0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c3f9db8c45bdedd10100d5040dadb0f");
        } else if (i != 2) {
            if (filterConditionResponse != null) {
                this.b.a(i, 0, g(i), filterConditionResponse.middleFilter);
            }
        } else if (filterConditionResponse == null || com.sankuai.shangou.stone.util.a.b(filterConditionResponse.getFilterList())) {
            this.b.a(i, 3, (List<String>) null, (List<FilterConditionResponse.FilterGroup>) null);
        } else {
            this.b.a(i, 0, g(i), filterConditionResponse.getFilterList());
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void a(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a440757c8aed58fc18d67563875ac277", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a440757c8aed58fc18d67563875ac277");
            return;
        }
        Map<String, List<String>> map = this.k.get(Integer.valueOf(i));
        if (map == null) {
            map = this.k.get(2);
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) entry.getValue())) {
                i2 += entry.getValue().size();
            }
        }
        this.b.a(i, i2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void a(long j, String str, int i, a aVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "995f9b242875cec5d245d81f19852c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "995f9b242875cec5d245d81f19852c5f");
            return;
        }
        FilterConditionResponse filterConditionResponse = this.d.get(j + CommonConstant.Symbol.MINUS + str + "-1");
        if (filterConditionResponse != null) {
            if (this.e) {
                com.sankuai.shangou.stone.util.a.b(filterConditionResponse.sortList);
                if (!com.sankuai.shangou.stone.util.a.b(filterConditionResponse.middleFilter)) {
                    this.h = filterConditionResponse;
                    b(filterConditionResponse);
                    a(0, filterConditionResponse);
                    a(1, filterConditionResponse);
                }
            } else {
                this.g = filterConditionResponse;
            }
            a(filterConditionResponse);
            c(filterConditionResponse);
            if (filterConditionResponse != null) {
                this.b.c(filterConditionResponse.isDisplayFilter());
            }
            if (aVar != null) {
                aVar.a(filterConditionResponse);
                return;
            }
            return;
        }
        this.b.a(false, "", (List<String>) null, (List<FilterConditionResponse.FilterGroup.FilterItem>) null);
        this.b.c(false);
        if (aVar != null) {
            aVar.a(null);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ffbcd6ed6c5ab0ea7305f2b09180830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ffbcd6ed6c5ab0ea7305f2b09180830");
        } else if (this.l.get(Integer.valueOf(i)) != null) {
            this.l.get(Integer.valueOf(i)).clear();
            for (Map.Entry<String, List<String>> entry : this.k.get(Integer.valueOf(i)).entrySet()) {
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) entry.getValue())) {
                    this.l.get(Integer.valueOf(i)).put(entry.getKey(), new ArrayList(entry.getValue()));
                }
            }
            f(i);
        }
    }

    private void f(int i) {
        FilterConditionResponse filterConditionResponse;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9f158fe92d5686faee04ed5e7df535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9f158fe92d5686faee04ed5e7df535");
        } else if (this.e) {
            if (i == 2) {
                filterConditionResponse = this.f;
            } else {
                filterConditionResponse = this.h;
            }
            a(i, filterConditionResponse);
            c(this.h);
        } else {
            a(i, this.f);
            c(this.g);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe9f4b70d057abaeda7b58878371b2b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe9f4b70d057abaeda7b58878371b2b7");
        } else if (this.f != null && !com.sankuai.shangou.stone.util.a.b(this.f.getFilterList())) {
            for (FilterConditionResponse.FilterGroup filterGroup : this.f.getFilterList()) {
                if (!com.sankuai.shangou.stone.util.a.b(filterGroup.favourItems)) {
                    for (FilterConditionResponse.FilterGroup.FilterItem filterItem : filterGroup.favourItems) {
                        if (filterItem != null) {
                            com.sankuai.waimai.store.widgets.filterbar.home.model.b.a(this.n, filterItem.code, filterItem.bubbleInfo);
                        }
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "002c5e1a13aad6055563dd03bddeaf04", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "002c5e1a13aad6055563dd03bddeaf04");
        }
        if (this.g == null) {
            return null;
        }
        FilterConditionResponse.FilterGroup filterGroup = (FilterConditionResponse.FilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) this.g.getFilterList(), 0);
        return (filterGroup == null || com.sankuai.shangou.stone.util.a.b(filterGroup.favourItems)) ? "" : t.a(filterGroup.favourItems, new t.a<FilterConditionResponse.FilterGroup.FilterItem>() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.controller.i.3
            @Override // com.sankuai.shangou.stone.util.t.a
            public final /* bridge */ /* synthetic */ String a(FilterConditionResponse.FilterGroup.FilterItem filterItem) {
                FilterConditionResponse.FilterGroup.FilterItem filterItem2 = filterItem;
                if (filterItem2 == null) {
                    return null;
                }
                return filterItem2.code;
            }
        }, CommonConstant.Symbol.COMMA);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final String d(int i) {
        FilterConditionResponse.FilterGroup filterGroup;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a58da32e09b2da3eade9185f76a69a4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a58da32e09b2da3eade9185f76a69a4f");
        }
        ArrayList<FilterConditionResponse.FilterGroup> arrayList = new ArrayList();
        if (i != 2) {
            if (this.h != null && (filterGroup = (FilterConditionResponse.FilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) this.h.middleFilter, i)) != null) {
                arrayList.add(filterGroup);
            }
        } else if (this.f != null && !com.sankuai.shangou.stone.util.a.b(this.f.getFilterList())) {
            arrayList.addAll(this.f.getFilterList());
        }
        if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
            return "";
        }
        ArrayList arrayList2 = new ArrayList();
        for (FilterConditionResponse.FilterGroup filterGroup2 : arrayList) {
            if (!com.sankuai.shangou.stone.util.a.b(filterGroup2.favourItems)) {
                arrayList2.addAll(filterGroup2.favourItems);
            }
        }
        final List<String> c2 = c();
        return t.b(arrayList2, new t.a<FilterConditionResponse.FilterGroup.FilterItem>() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.controller.i.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.shangou.stone.util.t.a
            public final /* synthetic */ String a(FilterConditionResponse.FilterGroup.FilterItem filterItem) {
                FilterConditionResponse.FilterGroup.FilterItem filterItem2 = filterItem;
                Object[] objArr2 = {filterItem2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00413123f2f3f72146694e5455714bbd", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00413123f2f3f72146694e5455714bbd");
                }
                if (filterItem2 == null || !c2.contains(filterItem2.code)) {
                    return null;
                }
                return filterItem2.code;
            }
        }, CommonConstant.Symbol.COMMA);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c50eda03f2895b2c267c2abcc391f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c50eda03f2895b2c267c2abcc391f72");
        } else {
            this.d.clear();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final void a(String str, String str2, @NonNull FilterConditionResponse filterConditionResponse, a aVar) {
        Object[] objArr = {str, str2, filterConditionResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7cc0c3a7e579c911c627e3bc9442924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7cc0c3a7e579c911c627e3bc9442924");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.a(filterConditionResponse.middleFilter, filterConditionResponse.getFilterList()) || filterConditionResponse.hasCouponFilterData()) {
            this.d.put(str + CommonConstant.Symbol.MINUS + str2 + "-1", filterConditionResponse);
            this.h = filterConditionResponse;
            b(filterConditionResponse);
            a(filterConditionResponse);
            a(0, this.h);
            a(1, this.h);
            c(this.h);
            FilterConditionResponse filterConditionResponse2 = this.h;
            Object[] objArr2 = {filterConditionResponse2};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b4318f6e11c45b2a640a89488c753dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b4318f6e11c45b2a640a89488c753dd");
            } else {
                this.b.a(filterConditionResponse2.activityFilterData);
            }
            if (this.h != null) {
                this.b.c(this.h.isDisplayFilter());
            }
        }
        if (aVar != null) {
            aVar.a(filterConditionResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull FilterConditionResponse filterConditionResponse) {
        Object[] objArr = {filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "592792010a1323aeba464cb99d76d9fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "592792010a1323aeba464cb99d76d9fb");
        } else if (com.sankuai.shangou.stone.util.a.a(filterConditionResponse.middleFilter)) {
            ArrayList arrayList = new ArrayList();
            for (FilterConditionResponse.FilterGroup filterGroup : filterConditionResponse.middleFilter) {
                arrayList.add(filterGroup.groupTitle);
            }
            this.b.a(arrayList);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.h.a
    public final String e(int i) {
        FilterConditionResponse.FilterGroup filterGroup;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7493463992be5eabf26b793f3141bc25", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7493463992be5eabf26b793f3141bc25");
        }
        if (i == 2) {
            return BaseRaptorUploader.ERROR_INVALID_SOURCE_CODE;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e4c41fc9134b199502a9254fef7812e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e4c41fc9134b199502a9254fef7812e") : (this.h == null || (filterGroup = (FilterConditionResponse.FilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) this.h.middleFilter, i)) == null) ? "" : filterGroup.code;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(FilterConditionResponse filterConditionResponse) {
        String str;
        List<String> list;
        boolean z;
        h.b bVar;
        List<FilterConditionResponse.FilterGroup.FilterItem> list2;
        Object[] objArr = {filterConditionResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "255693a060f1e3e5c104daa52178aa5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "255693a060f1e3e5c104daa52178aa5b");
            return;
        }
        FilterConditionResponse.FilterGroup filterGroup = filterConditionResponse != null ? (FilterConditionResponse.FilterGroup) com.sankuai.shangou.stone.util.a.a((List<Object>) filterConditionResponse.getFilterList(), 0) : null;
        if (filterGroup == null || (!this.e && com.sankuai.shangou.stone.util.a.a((List) filterGroup.favourItems) < 2)) {
            str = null;
            list = null;
            z = false;
            bVar = this.b;
            list2 = null;
        } else {
            bVar = this.b;
            z = filterGroup.supportMultiChoice == 1;
            str = filterGroup.groupTitle;
            list = g(3);
            list2 = (this.e || com.sankuai.shangou.stone.util.a.a((List) filterGroup.favourItems) <= 4) ? filterGroup.favourItems : filterGroup.favourItems.subList(0, 4);
        }
        bVar.a(z, str, list, list2);
    }

    private List<String> g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d60ebb3015f68d114a0b7d7ce4c5e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d60ebb3015f68d114a0b7d7ce4c5e6");
        }
        ArrayList arrayList = new ArrayList();
        Map<String, List<String>> map = this.l.get(Integer.valueOf(i));
        if (map == null) {
            map = this.l.get(2);
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) entry.getValue())) {
                arrayList.addAll(entry.getValue());
            }
        }
        return arrayList;
    }

    private void a(long j, String str, int i, int i2, @NonNull final k<FilterConditionResponse> kVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ca5d182f8ce87efd730dc9b198b838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ca5d182f8ce87efd730dc9b198b838");
            return;
        }
        final String str2 = j + CommonConstant.Symbol.MINUS + str + CommonConstant.Symbol.MINUS + i;
        FilterConditionResponse filterConditionResponse = this.d.get(str2);
        if (filterConditionResponse != null) {
            kVar.a((k<FilterConditionResponse>) filterConditionResponse);
            return;
        }
        com.sankuai.waimai.store.base.net.sg.a.a((Object) this.o).a(j, str, i, i2, this.e ? 1 : 0, new k<FilterConditionResponse>() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.controller.i.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                FilterConditionResponse filterConditionResponse2 = (FilterConditionResponse) obj;
                Object[] objArr2 = {filterConditionResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73bfcc94f227af659fddf87bfbeb1f19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73bfcc94f227af659fddf87bfbeb1f19");
                    return;
                }
                i.this.d.put(str2, filterConditionResponse2);
                kVar.a((k) filterConditionResponse2);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "595747aaaeb450b1a8fe54ff89ddb112", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "595747aaaeb450b1a8fe54ff89ddb112");
                } else {
                    kVar.a();
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8b150d60c3d0c1f55e7df21b8c72ede", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8b150d60c3d0c1f55e7df21b8c72ede");
                } else {
                    kVar.a(bVar);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec60118fcb377aba7f6a2c3c745dae11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec60118fcb377aba7f6a2c3c745dae11");
                } else {
                    kVar.b();
                }
            }
        });
    }
}
