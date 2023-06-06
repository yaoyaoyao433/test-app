package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.SGSearchFilterEntity;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g implements b.d {
    public static ChangeQuickRedirect a;
    b.f b;
    SearchShareData c;
    private SGSearchFilterEntity d;
    private Context e;
    private List<String> f;
    private StringBuilder g;
    private List<Boolean> h;

    public g(b.f fVar, Context context) {
        Object[] objArr = {fVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b65fbd231d61122faed5aa2c486e0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b65fbd231d61122faed5aa2c486e0f");
            return;
        }
        this.b = fVar;
        this.c = SearchShareData.a(context);
        this.e = context;
        this.f = new ArrayList();
        this.g = new StringBuilder();
        this.h = new ArrayList();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "836e07f427e1fbeb3aa84a7dfc2be6b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "836e07f427e1fbeb3aa84a7dfc2be6b5");
        } else if (this.c.R != null) {
            a(this.c.R);
        } else {
            e();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.d
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dfe6f99ce58f9967019dea0e39d4e3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dfe6f99ce58f9967019dea0e39d4e3f");
        } else {
            e();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c3260d4c572a003f88ee20335d3887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c3260d4c572a003f88ee20335d3887");
        } else {
            com.sankuai.waimai.store.search.common.api.net.a.a(this.b.q()).a(this.c.aH, this.c.h, this.c.y, this.c.z, this.c.B, new k<SGSearchFilterEntity>() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    SGSearchFilterEntity sGSearchFilterEntity = (SGSearchFilterEntity) obj;
                    Object[] objArr2 = {sGSearchFilterEntity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8bc1d8d7130f0d08d65a7611b3151b21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8bc1d8d7130f0d08d65a7611b3151b21");
                        return;
                    }
                    g.this.b.i();
                    g.this.c.R = sGSearchFilterEntity;
                    g.this.a(sGSearchFilterEntity);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bd7bfad84ebb993e85c283b847f18bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bd7bfad84ebb993e85c283b847f18bf");
                    } else {
                        g.this.b.h();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cbb29b5257a2d5355e4309cb5d80247", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cbb29b5257a2d5355e4309cb5d80247");
                        return;
                    }
                    g.this.b.i();
                    g.this.b.j();
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef779d0de5464606eb77775040dc83a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef779d0de5464606eb77775040dc83a7");
                    } else {
                        g.this.b.i();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.c
    public final void a(com.sankuai.waimai.store.search.ui.result.controller.quickfilter.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcec24f1d453f296129937bccf57c0bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcec24f1d453f296129937bccf57c0bf");
            return;
        }
        this.d = (SGSearchFilterEntity) aVar;
        if (this.d == null || com.sankuai.shangou.stone.util.a.b(this.d.filterGroups)) {
            this.b.j();
            return;
        }
        f();
        g();
        h();
        if (this.b instanceof b.e) {
            ((b.e) this.b).b_(this.d.globalNumberOfSelectedItems > 0);
        }
        this.b.a(this.d);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6658b83ccafae8967cfa186a4e2911a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6658b83ccafae8967cfa186a4e2911a1");
        } else if (this.d != null && !com.sankuai.shangou.stone.util.a.b(this.d.filterGroups)) {
            for (SearchFilterGroup searchFilterGroup : this.d.filterGroups) {
                if (searchFilterGroup != null && !TextUtils.isEmpty(searchFilterGroup.groupTitle) && !com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
                    for (SearchFilterGroup.SearchFilterItem searchFilterItem : searchFilterGroup.filterItems) {
                        if (searchFilterItem != null) {
                            searchFilterItem.groupTitle = searchFilterGroup.groupTitle;
                        }
                    }
                }
            }
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "655afb56da671140aead093a86e802bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "655afb56da671140aead093a86e802bf");
        } else if (this.d != null && !com.sankuai.shangou.stone.util.a.b(this.d.filterGroups)) {
            this.d.globalNumberOfSelectedItems = 0;
            for (SearchFilterGroup searchFilterGroup : this.d.filterGroups) {
                if (searchFilterGroup != null) {
                    searchFilterGroup.localNumberOfSelectedItems = 0;
                    b(searchFilterGroup);
                }
            }
        }
    }

    private void b(SearchFilterGroup searchFilterGroup) {
        Object[] objArr = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcf31f0840845364905a8b792df60d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcf31f0840845364905a8b792df60d33");
        } else if (searchFilterGroup != null && !TextUtils.isEmpty(searchFilterGroup.groupTitle) && !com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
            List<String> g = this.c.g();
            this.g.delete(0, this.g.length());
            int i = 0;
            for (SearchFilterGroup.SearchFilterItem searchFilterItem : searchFilterGroup.filterItems) {
                if (searchFilterItem != null && !TextUtils.isEmpty(searchFilterItem.filterCode)) {
                    if (g.contains(searchFilterItem.filterCode)) {
                        searchFilterItem.selected = true;
                        i++;
                        StringBuilder sb = this.g;
                        sb.append(searchFilterItem.filterName);
                        sb.append(CommonConstant.Symbol.COMMA);
                    } else {
                        searchFilterItem.selected = false;
                    }
                }
            }
            if (searchFilterGroup.slideFilter != null && i == 0 && !TextUtils.isEmpty(this.c.N.get(searchFilterGroup.groupTitle))) {
                i = 1;
            }
            searchFilterGroup.localNumberOfSelectedItems = i;
            this.d.globalNumberOfSelectedItems += i;
            if (this.g.length() > 0) {
                this.g.deleteCharAt(this.g.length() - 1);
            }
            searchFilterGroup.selectedItemsStr = this.g.toString();
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730173df473bfd29c0ba70c7d53e6547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730173df473bfd29c0ba70c7d53e6547");
        } else if (this.d != null && !com.sankuai.shangou.stone.util.a.b(this.d.filterGroups)) {
            for (SearchFilterGroup searchFilterGroup : this.d.filterGroups) {
                if (searchFilterGroup != null) {
                    searchFilterGroup.expanded = false;
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61741bc58ea70465664315daec5fb7a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61741bc58ea70465664315daec5fb7a4");
        } else if (this.d != null && !com.sankuai.shangou.stone.util.a.b(this.d.filterGroups)) {
            for (SearchFilterGroup searchFilterGroup : this.d.filterGroups) {
                if (searchFilterGroup != null && !com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
                    e(searchFilterGroup);
                    f(searchFilterGroup);
                    g(searchFilterGroup);
                }
            }
            this.b.a(this.d);
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.c
    public final void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e658aeaec87e7692c5019bd76ccae0a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e658aeaec87e7692c5019bd76ccae0a6");
        } else if (this.d == null || com.sankuai.shangou.stone.util.a.b(this.d.filterGroups)) {
            this.b.e();
        } else {
            for (SearchFilterGroup searchFilterGroup : this.d.filterGroups) {
                if (searchFilterGroup != null && !TextUtils.isEmpty(searchFilterGroup.groupTitle) && !com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
                    List<String> list = this.c.P.get(searchFilterGroup.groupTitle);
                    if (list == null) {
                        list = new ArrayList<>();
                        this.c.P.put(searchFilterGroup.groupTitle, list);
                    }
                    d(searchFilterGroup);
                    a(searchFilterGroup, this.f);
                    list.clear();
                    list.addAll(this.f);
                    Object[] objArr2 = {searchFilterGroup};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "058416fcf31ead3f078cce9a7b435cae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "058416fcf31ead3f078cce9a7b435cae");
                    } else {
                        this.c.N.put(searchFilterGroup.groupTitle, "");
                        this.c.N.put(searchFilterGroup.groupTitle, c(searchFilterGroup));
                    }
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2b4623b27632fcc5449b48ba3842452", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2b4623b27632fcc5449b48ba3842452")).booleanValue();
            } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.h) && this.h.contains(Boolean.TRUE)) {
                z = true;
            }
            if (z) {
                this.b.a();
            } else {
                this.b.e();
            }
        }
    }

    private String c(SearchFilterGroup searchFilterGroup) {
        int[] g;
        Object[] objArr = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b75dc78761a1e70ca5d7fb4f90b02ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b75dc78761a1e70ca5d7fb4f90b02ad");
        }
        if (searchFilterGroup.slideFilter == null || (g = this.b.g()) == null || g.length < 2) {
            return "";
        }
        int i = g[0];
        int i2 = g[1];
        if (i2 != -1 && i > i2) {
            i = i2;
            i2 = i;
        }
        if ((i2 == -1 && i == -1) || (i2 != -1 && i != -1)) {
            this.c.O = 0;
        } else if (i2 == -1) {
            i2 = 99999999;
            this.c.O = 2;
        } else {
            this.c.O = 1;
            i = 0;
        }
        if (i == -1 && i2 == -1) {
            return "";
        }
        return "product_PRICE_price_" + i + '-' + i2;
    }

    private void d(SearchFilterGroup searchFilterGroup) {
        Object[] objArr = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a2c96a4d5e73bb386c8409e734d692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a2c96a4d5e73bb386c8409e734d692");
            return;
        }
        this.f.clear();
        if (searchFilterGroup == null || com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
            return;
        }
        for (SearchFilterGroup.SearchFilterItem searchFilterItem : searchFilterGroup.filterItems) {
            if (searchFilterItem != null && searchFilterItem.selected) {
                this.f.add(searchFilterItem.filterCode);
            }
        }
        if (searchFilterGroup.slideFilter != null) {
            String c = c(searchFilterGroup);
            if (TextUtils.isEmpty(c) || this.f.contains(c)) {
                return;
            }
            this.f.add(c);
        }
    }

    private void a(SearchFilterGroup searchFilterGroup, List<String> list) {
        Object[] objArr = {searchFilterGroup, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aeba3101bd5d7e72c0033807480ea3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aeba3101bd5d7e72c0033807480ea3b");
        } else if (this.c != null) {
            ArrayList arrayList = new ArrayList();
            this.c.a(searchFilterGroup, arrayList);
            a(list, arrayList);
            if (com.sankuai.shangou.stone.util.a.b(arrayList) || list == null) {
                return;
            }
            int a2 = com.sankuai.shangou.stone.util.a.a((List) arrayList);
            for (int i = 0; i < a2; i++) {
                String str = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i);
                if (!TextUtils.isEmpty(str) && !list.contains(str)) {
                    this.c.a(new f.d(str));
                    this.c.a(str);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.c
    public final void a(SearchFilterGroup.SearchFilterItem searchFilterItem) {
        SearchFilterGroup searchFilterGroup;
        Object[] objArr = {searchFilterItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c27ce85b457adab1b79fc3c11e6cbfa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c27ce85b457adab1b79fc3c11e6cbfa7");
        } else if (searchFilterItem != null && !TextUtils.isEmpty(searchFilterItem.groupTitle)) {
            String str = searchFilterItem.groupTitle;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            SearchFilterGroup searchFilterGroup2 = null;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b6347ecc0cd2960d7df69680832c6a8", RobustBitConfig.DEFAULT_VALUE)) {
                searchFilterGroup2 = (SearchFilterGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b6347ecc0cd2960d7df69680832c6a8");
            } else if (!TextUtils.isEmpty(str) && this.d != null && !com.sankuai.shangou.stone.util.a.b(this.d.filterGroups)) {
                for (SearchFilterGroup searchFilterGroup3 : this.d.filterGroups) {
                    if (searchFilterGroup3 != null && !TextUtils.isEmpty(searchFilterGroup3.groupTitle) && searchFilterGroup3.groupTitle.equals(str)) {
                        searchFilterGroup = searchFilterGroup3;
                        break;
                    }
                }
            }
            searchFilterGroup = searchFilterGroup2;
            if (searchFilterGroup == null) {
                return;
            }
            Object[] objArr3 = {searchFilterGroup, searchFilterItem};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f8180aa6d6ea2f9f953f644290e4671", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f8180aa6d6ea2f9f953f644290e4671");
            } else if (searchFilterGroup.slideFilter != null) {
                if (searchFilterItem.selected) {
                    this.b.a(-1, -1);
                } else {
                    int[] a2 = a(searchFilterItem.filterCode, 0);
                    if (a2 != null) {
                        this.b.a(a2[0], a2[1]);
                    }
                }
            }
            if (searchFilterGroup.supportMultiChoice == 0) {
                boolean z = searchFilterItem.selected;
                e(searchFilterGroup);
                searchFilterItem.selected = !z;
            } else {
                searchFilterItem.selected = !searchFilterItem.selected;
            }
            f(searchFilterGroup);
            g(searchFilterGroup);
            com.sankuai.waimai.store.search.common.view.d.a(this.e, searchFilterItem.searchFilterDot, this.c);
            this.b.a(this.d);
        }
    }

    @Nullable
    private int[] a(String str, int i) {
        int lastIndexOf;
        int lastIndexOf2;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a597c1af4fa26ec2daa49c0a176fc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a597c1af4fa26ec2daa49c0a176fc5");
        }
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(95)) < (lastIndexOf2 = str.lastIndexOf(45))) {
            try {
                return new int[]{Integer.parseInt(str.substring(lastIndexOf + 1, lastIndexOf2)), Integer.parseInt(str.substring(lastIndexOf2 + 1)), i};
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.c
    @Nullable
    public final int[] a(SearchFilterGroup searchFilterGroup) {
        Object[] objArr = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed0e6049baab8507b5df1395f56a0a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed0e6049baab8507b5df1395f56a0a7");
        }
        ArrayList arrayList = new ArrayList();
        this.c.a(searchFilterGroup, arrayList);
        String str = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, 0);
        if (!TextUtils.isEmpty(str)) {
            return a(str, 0);
        }
        String str2 = this.c.N.get(searchFilterGroup.groupTitle);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return a(str2, 1);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.item.sortFilter.b.c
    public final void a(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd0de7f291540b5443f720ff2c8e7f6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd0de7f291540b5443f720ff2c8e7f6a");
            return;
        }
        SearchFilterGroup searchFilterGroup = null;
        Iterator<SearchFilterGroup> it = this.d.filterGroups.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SearchFilterGroup next = it.next();
            if (next != null && next.slideFilter != null) {
                searchFilterGroup = next;
                break;
            }
        }
        if (searchFilterGroup == null || com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
            return;
        }
        for (SearchFilterGroup.SearchFilterItem searchFilterItem : searchFilterGroup.filterItems) {
            if (searchFilterItem != null) {
                String str = searchFilterItem.filterCode;
                searchFilterItem.selected = TextUtils.equals(str, "product_PRICE_price_" + i + '-' + i2);
            }
        }
        searchFilterGroup.localNumberOfSelectedItems = (i == -1 && i2 == -1) ? 1 : 1;
        this.b.a(this.d);
    }

    private void e(SearchFilterGroup searchFilterGroup) {
        Object[] objArr = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5403322c4a46c0482af3ebb42b936564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5403322c4a46c0482af3ebb42b936564");
        } else if (searchFilterGroup != null && !com.sankuai.shangou.stone.util.a.b(searchFilterGroup.filterItems)) {
            for (SearchFilterGroup.SearchFilterItem searchFilterItem : searchFilterGroup.filterItems) {
                if (searchFilterItem != null && searchFilterItem.selected) {
                    searchFilterItem.selected = false;
                }
            }
        }
    }

    private void f(SearchFilterGroup searchFilterGroup) {
        Object[] objArr = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6730c8e061d8fba52a9761bbb9d393", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6730c8e061d8fba52a9761bbb9d393");
        } else if (searchFilterGroup != null && this.d != null) {
            this.d.globalNumberOfSelectedItems -= searchFilterGroup.localNumberOfSelectedItems;
            searchFilterGroup.localNumberOfSelectedItems = 0;
            int a2 = com.sankuai.shangou.stone.util.a.a((List) searchFilterGroup.filterItems);
            for (int i = 0; i < a2; i++) {
                SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) searchFilterGroup.filterItems, i);
                if (searchFilterItem != null && searchFilterItem.selected) {
                    searchFilterGroup.localNumberOfSelectedItems++;
                }
            }
            this.d.globalNumberOfSelectedItems += searchFilterGroup.localNumberOfSelectedItems;
        }
    }

    private void a(@NonNull List<String> list, @NonNull List<String> list2) {
        int i = 0;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b05cfe16099fdd7a7b7aecf02f834a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b05cfe16099fdd7a7b7aecf02f834a1b");
        } else if (list == null) {
        } else {
            if (com.sankuai.shangou.stone.util.a.a((List) list2) != com.sankuai.shangou.stone.util.a.a((List) list)) {
                this.h.add(Boolean.TRUE);
                return;
            }
            while (true) {
                if (i >= com.sankuai.shangou.stone.util.a.a((List) list)) {
                    break;
                } else if (!list.contains(list2.get(i))) {
                    this.h.add(Boolean.TRUE);
                    break;
                } else {
                    i++;
                }
            }
            this.h.add(Boolean.FALSE);
        }
    }

    private void g(SearchFilterGroup searchFilterGroup) {
        Object[] objArr = {searchFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75f731824716082c61ab635095a36e1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75f731824716082c61ab635095a36e1a");
        } else if (searchFilterGroup != null) {
            this.g.delete(0, this.g.length());
            int a2 = com.sankuai.shangou.stone.util.a.a((List) searchFilterGroup.filterItems);
            for (int i = 0; i < a2; i++) {
                SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) searchFilterGroup.filterItems, i);
                if (searchFilterItem != null && !TextUtils.isEmpty(searchFilterItem.filterName) && searchFilterItem.selected) {
                    StringBuilder sb = this.g;
                    sb.append(searchFilterItem.filterName);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
            if (this.g.length() > 0) {
                this.g.deleteCharAt(this.g.length() - 1);
            }
            searchFilterGroup.selectedItemsStr = this.g.toString();
        }
    }
}
