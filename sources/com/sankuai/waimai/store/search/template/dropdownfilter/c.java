package com.sankuai.waimai.store.search.template.dropdownfilter;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.common.view.d;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements b.a {
    public static ChangeQuickRedirect a;
    private b.InterfaceC1323b b;
    private Context c;
    private SearchShareData d;
    private List<String> e;
    private List<String> f;
    private GuidedItem g;

    public c(b.InterfaceC1323b interfaceC1323b, Context context) {
        Object[] objArr = {interfaceC1323b, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc9d85d031c91bf9e74677a00135b9e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc9d85d031c91bf9e74677a00135b9e9");
            return;
        }
        this.b = interfaceC1323b;
        this.c = context;
        this.d = SearchShareData.a(context);
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.a
    public final void a(GuidedItem guidedItem) {
        Object[] objArr = {guidedItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6e1f7dcf6c5098965fe70b00f23d77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6e1f7dcf6c5098965fe70b00f23d77b");
        } else if (guidedItem != null) {
            this.g = guidedItem;
            List<String> g = this.d.g();
            List<String> f = this.d.f();
            guidedItem.localNumberOfSelectedItems = 0;
            int a2 = com.sankuai.shangou.stone.util.a.a((List) guidedItem.mDropDownItems);
            for (int i = 0; i < a2; i++) {
                SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) guidedItem.mDropDownItems, i);
                if (searchFilterItem != null && (!TextUtils.isEmpty(searchFilterItem.filterCode) || !TextUtils.isEmpty(searchFilterItem.cpvValue))) {
                    if (!guidedItem.isNewTextFilter() && g.contains(searchFilterItem.filterCode)) {
                        searchFilterItem.selected = true;
                        guidedItem.localNumberOfSelectedItems++;
                    } else if (guidedItem.isNewTextFilter() && f.contains(searchFilterItem.cpvValue)) {
                        searchFilterItem.selected = true;
                        guidedItem.localNumberOfSelectedItems++;
                    } else {
                        searchFilterItem.selected = false;
                    }
                }
            }
            this.b.a();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a16e8cce9abe6510575e72818a513b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a16e8cce9abe6510575e72818a513b");
        } else if (this.g == null) {
            this.b.e();
        } else {
            int a2 = com.sankuai.shangou.stone.util.a.a((List) this.g.mDropDownItems);
            for (int i = 0; i < a2; i++) {
                SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.g.mDropDownItems, i);
                if (searchFilterItem != null) {
                    searchFilterItem.selected = false;
                }
            }
            this.g.localNumberOfSelectedItems = 0;
            this.b.a();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d970fe19b030ba362eba6f30005813d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d970fe19b030ba362eba6f30005813d");
        } else if (this.g != null) {
            this.e.clear();
            this.f.clear();
            boolean isNewTextFilter = this.g.isNewTextFilter();
            List<String> g = this.d.g();
            List<String> f = this.d.f();
            int a2 = com.sankuai.shangou.stone.util.a.a((List) this.g.mDropDownItems);
            for (int i2 = 0; i2 < a2; i2++) {
                SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.g.mDropDownItems, i2);
                if (searchFilterItem != null && !TextUtils.isEmpty(searchFilterItem.filterCode) && g.contains(searchFilterItem.filterCode)) {
                    this.e.add(searchFilterItem.filterCode);
                }
                if (searchFilterItem != null && !TextUtils.isEmpty(searchFilterItem.cpvValue) && f.contains(searchFilterItem.cpvValue)) {
                    this.f.add(searchFilterItem.cpvValue);
                }
            }
            Map<String, List<String>> map = isNewTextFilter ? this.d.at : this.d.ar;
            List<String> list = map.get(isNewTextFilter ? this.g.cpvKey : String.valueOf(i));
            if (list == null) {
                list = new ArrayList<>();
                map.put(isNewTextFilter ? this.g.cpvKey : String.valueOf(i), list);
            }
            list.clear();
            int a3 = com.sankuai.shangou.stone.util.a.a((List) this.g.mDropDownItems);
            for (int i3 = 0; i3 < a3; i3++) {
                SearchFilterGroup.SearchFilterItem searchFilterItem2 = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.g.mDropDownItems, i3);
                if (searchFilterItem2 != null) {
                    if (searchFilterItem2.selected) {
                        list.add(isNewTextFilter ? searchFilterItem2.cpvValue : searchFilterItem2.filterCode);
                    } else {
                        if (this.e.contains(searchFilterItem2.filterCode)) {
                            this.d.a(searchFilterItem2.filterCode);
                        }
                        if (this.f.contains(searchFilterItem2.cpvValue)) {
                            this.d.b(searchFilterItem2.cpvValue);
                        }
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d43afa821f048f4647d98a42fcb1b97", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d43afa821f048f4647d98a42fcb1b97");
        }
        if (this.g == null) {
            return "-999";
        }
        StringBuilder sb = new StringBuilder();
        List<String> g = this.d.g();
        int a2 = com.sankuai.shangou.stone.util.a.a((List) this.g.mDropDownItems);
        for (int i = 0; i < a2; i++) {
            SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.g.mDropDownItems, i);
            if (searchFilterItem != null && g.contains(searchFilterItem.filterCode)) {
                sb.append(searchFilterItem.filterCode);
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return "-999";
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.a
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f14f3b35eec15311e2387b1001fa3e97", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f14f3b35eec15311e2387b1001fa3e97");
        }
        if (this.g == null) {
            return "-999";
        }
        StringBuilder sb = new StringBuilder();
        List<String> f = this.d.f();
        int a2 = com.sankuai.shangou.stone.util.a.a((List) this.g.mDropDownItems);
        for (int i = 0; i < a2; i++) {
            SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.g.mDropDownItems, i);
            if (searchFilterItem != null && f.contains(searchFilterItem.cpvValue)) {
                sb.append(searchFilterItem.cpvValue);
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return "-999";
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.a
    public final void a(SearchFilterGroup.SearchFilterItem searchFilterItem) {
        Object[] objArr = {searchFilterItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d15761f2c02daaaef41ce260eada054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d15761f2c02daaaef41ce260eada054");
        } else if (this.g == null || searchFilterItem == null) {
            this.b.e();
        } else {
            if (searchFilterItem.selected) {
                searchFilterItem.selected = false;
                this.g.localNumberOfSelectedItems--;
            } else {
                searchFilterItem.selected = true;
                this.g.localNumberOfSelectedItems++;
            }
            d.a(this.c, searchFilterItem.searchFilterDot, this.d);
            this.b.a();
        }
    }
}
