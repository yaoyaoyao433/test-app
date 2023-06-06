package com.sankuai.waimai.store.search.mach.dropdownfilter;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.search.common.view.d;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.template.dropdownfilter.SGSearchDropDownFilterFragment;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Mach.d {
    public static ChangeQuickRedirect a;
    SearchShareData b;
    int c;
    public ViewGroup d;
    public Mach e;
    public CommonMachData f;
    private Context g;
    private SGSearchDropDownFilterFragment h;
    private long i;

    public static /* synthetic */ void a(a aVar, GuidedItem guidedItem, int i, boolean z) {
        Object[] objArr = {guidedItem, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "9f23f4239e7652c1a0a8308ed22164ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "9f23f4239e7652c1a0a8308ed22164ad");
        } else if (aVar.e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("currentPos", Integer.valueOf(i));
            hashMap.put("isSelected", Boolean.valueOf(guidedItem.isSelected));
            hashMap.put("isFragmentOpen", Boolean.valueOf(guidedItem.isFragmentOpen));
            hashMap.put("selectedCodeStr", guidedItem.selectedCodeStr);
            guidedItem.itemWidth = com.sankuai.waimai.store.search.util.a.a(aVar.g, TextUtils.isEmpty(guidedItem.selectedCodeStr) ? guidedItem.text : guidedItem.selectedCodeStr, "PingFangSC-Regular", false, 78, 12);
            hashMap.put("itemWidth", Integer.valueOf(guidedItem.itemWidth));
            hashMap.put("needScroll", Boolean.valueOf(z));
            hashMap.put("needShowDot", Boolean.FALSE);
            aVar.e.sendJsEvent("refresh_group_filter_item", hashMap);
        }
    }

    public a(Context context, SearchShareData searchShareData) {
        Object[] objArr = {context, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2d4d082d1c2b1f8ce0f5310f79cf92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2d4d082d1c2b1f8ce0f5310f79cf92");
            return;
        }
        this.c = -1;
        this.i = 0L;
        this.g = context;
        this.b = searchShareData;
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        boolean z;
        GuidedItem guidedItem;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d172a4117688d9f17a68fe687aa14a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d172a4117688d9f17a68fe687aa14a3");
        } else if (map != null) {
            if (TextUtils.equals(str, "drop_down_filter_search_request") || TextUtils.equals(str, "item_has_been_exposed")) {
                if (TextUtils.equals(str, "item_has_been_exposed")) {
                    SearchShareData searchShareData = this.b;
                    Object[] objArr2 = {searchShareData, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7532d99b7d642883465e9f96d0f510f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7532d99b7d642883465e9f96d0f510f5");
                        return;
                    }
                    Object obj = map.get("sub_index");
                    if (obj instanceof Number) {
                        int intValue = ((Number) obj).intValue();
                        if (com.sankuai.shangou.stone.util.a.b(searchShareData.aq) || (guidedItem = (GuidedItem) com.sankuai.shangou.stone.util.a.a((List<Object>) searchShareData.aq, intValue)) == null) {
                            return;
                        }
                        guidedItem.isExposed = true;
                        return;
                    }
                    return;
                }
                Object obj2 = map.get("selected_item_index");
                if (!(obj2 instanceof Number)) {
                    com.sankuai.waimai.store.base.log.a.a("mach dropdown template js1 error, position = " + obj2);
                    return;
                }
                final int intValue2 = ((Number) obj2).intValue();
                Object obj3 = map.get("selected_item");
                if (!(obj3 instanceof Map)) {
                    com.sankuai.waimai.store.base.log.a.a("mach dropdown template js2 error, selectedItem = " + obj3);
                    return;
                }
                final GuidedItem guidedItem2 = (GuidedItem) i.a(i.a(obj3), GuidedItem.class);
                if (guidedItem2 == null || this.b == null) {
                    return;
                }
                if (com.sankuai.shangou.stone.util.a.b(guidedItem2.mDropDownItems)) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e61ab9988db8312cdc32112d520615c8", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e61ab9988db8312cdc32112d520615c8")).booleanValue();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - this.i < 400) {
                            z = true;
                        } else {
                            this.i = currentTimeMillis;
                            z = false;
                        }
                    }
                    if (z) {
                        return;
                    }
                    this.b.ab = intValue2;
                    Object[] objArr4 = {Integer.valueOf(intValue2), guidedItem2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9a6b71d56c9adb57294a229aa114473e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9a6b71d56c9adb57294a229aa114473e");
                        return;
                    }
                    d.a(this.g, guidedItem2.searchFilterDot, this.b);
                    this.c = intValue2;
                    String str2 = guidedItem2.isNewTextFilter() ? guidedItem2.cpvKey : guidedItem2.code;
                    if (guidedItem2.isSelected) {
                        if (guidedItem2.isNewTextFilter()) {
                            this.b.b(str2);
                        } else {
                            this.b.a(str2);
                        }
                    } else {
                        Map<String, List<String>> map2 = guidedItem2.isNewTextFilter() ? this.b.at : this.b.ar;
                        List<String> list = map2.get(guidedItem2.isNewTextFilter() ? guidedItem2.cpvKey : String.valueOf(intValue2));
                        if (list == null) {
                            list = new ArrayList<>();
                            map2.put(guidedItem2.isNewTextFilter() ? guidedItem2.cpvKey : String.valueOf(intValue2), list);
                        }
                        list.clear();
                        list.add(str2);
                    }
                    this.b.b();
                    a(guidedItem2, this.b);
                    Object[] objArr5 = {guidedItem2, Integer.valueOf(intValue2)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f67942c3a16a082673ed9e7de1c8405d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f67942c3a16a082673ed9e7de1c8405d");
                    } else if (this.e != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("currentPos", Integer.valueOf(intValue2));
                        hashMap.put("isSelected", Boolean.valueOf(guidedItem2.isSelected));
                        hashMap.put("needShowDot", Boolean.FALSE);
                        this.e.sendJsEvent("refresh_single_filter_item", hashMap);
                    }
                    SearchShareData searchShareData2 = this.b;
                    f.b bVar = new f.b(7);
                    bVar.h = true;
                    searchShareData2.a(bVar);
                    return;
                }
                this.b.ab = intValue2;
                Object[] objArr6 = {Integer.valueOf(intValue2), guidedItem2};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1d8e910b79ede1154c7ee264581764ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1d8e910b79ede1154c7ee264581764ca");
                    return;
                }
                d.a(this.g, guidedItem2.searchFilterDot, this.b);
                Rect rect = new Rect();
                this.d.getGlobalVisibleRect(rect);
                if (guidedItem2.isFragmentOpen) {
                    if (this.h != null) {
                        this.h.u();
                        return;
                    }
                    return;
                }
                if (this.h == null || this.c != intValue2) {
                    this.h = new SGSearchDropDownFilterFragment();
                    this.c = intValue2;
                }
                this.h.c = new com.sankuai.waimai.store.search.template.dropdownfilter.b() { // from class: com.sankuai.waimai.store.search.mach.dropdownfilter.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.search.template.dropdownfilter.b
                    public final void a() {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "57c49122b3c4f6aebcad98fd3fc6d565", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "57c49122b3c4f6aebcad98fd3fc6d565");
                            return;
                        }
                        SearchShareData searchShareData3 = a.this.b;
                        f.b bVar2 = new f.b(7);
                        bVar2.h = true;
                        searchShareData3.a(bVar2);
                    }

                    @Override // com.sankuai.waimai.store.search.template.dropdownfilter.b
                    public final void b() {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a48700484b1ff61cc1b55c0ef3aed79a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a48700484b1ff61cc1b55c0ef3aed79a");
                            return;
                        }
                        guidedItem2.isFragmentOpen = true;
                        a.a(a.this, guidedItem2, intValue2, true);
                        a.this.b.ao = true;
                    }

                    @Override // com.sankuai.waimai.store.search.template.dropdownfilter.b
                    public final void c() {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "065d6a3abd720fb3cb2c61d0a0128c40", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "065d6a3abd720fb3cb2c61d0a0128c40");
                            return;
                        }
                        guidedItem2.isFragmentOpen = false;
                        a.b(guidedItem2, a.this.b);
                        a.a(a.this, guidedItem2, intValue2, intValue2 == a.this.c);
                    }
                };
                this.h.d = rect.bottom - h.a(this.g, 45.0f);
                SGSearchDropDownFilterFragment sGSearchDropDownFilterFragment = this.h;
                CommonMachData commonMachData = this.f;
                Object[] objArr7 = {guidedItem2, Integer.valueOf(intValue2), commonMachData};
                ChangeQuickRedirect changeQuickRedirect7 = SGSearchDropDownFilterFragment.a;
                if (PatchProxy.isSupport(objArr7, sGSearchDropDownFilterFragment, changeQuickRedirect7, false, "9f98058180a368ac6d907c3a03543036", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, sGSearchDropDownFilterFragment, changeQuickRedirect7, false, "9f98058180a368ac6d907c3a03543036");
                } else if (guidedItem2 != null && !com.sankuai.shangou.stone.util.a.b(guidedItem2.mDropDownItems)) {
                    sGSearchDropDownFilterFragment.g = intValue2;
                    sGSearchDropDownFilterFragment.e = guidedItem2;
                    sGSearchDropDownFilterFragment.f = commonMachData;
                }
                SGSearchDropDownFilterFragment sGSearchDropDownFilterFragment2 = this.h;
                Object[] objArr8 = {sGSearchDropDownFilterFragment2};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "a725c4fa9d2f76e0e9d4fc0b8284af15", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "a725c4fa9d2f76e0e9d4fc0b8284af15");
                } else if (this.g instanceof FragmentActivity) {
                    ((FragmentActivity) this.g).getSupportFragmentManager().beginTransaction().replace(R.id.sort_filter_mask_container, sGSearchDropDownFilterFragment2).commitAllowingStateLoss();
                }
            }
        }
    }

    public static void a(GuidedItem guidedItem, SearchShareData searchShareData) {
        Object[] objArr = {guidedItem, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16246e9916e8d7c5eef2713f94fd4cc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16246e9916e8d7c5eef2713f94fd4cc3");
        } else if (guidedItem != null) {
            if (TextUtils.isEmpty(guidedItem.code) && TextUtils.isEmpty(guidedItem.cpvKey)) {
                return;
            }
            List<String> g = searchShareData.g();
            List<String> f = searchShareData.f();
            if (guidedItem.isNewTextFilter()) {
                guidedItem.isSelected = f.contains(guidedItem.cpvKey);
            } else {
                guidedItem.isSelected = g.contains(guidedItem.code);
            }
        }
    }

    public static void b(GuidedItem guidedItem, SearchShareData searchShareData) {
        Object[] objArr = {guidedItem, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff6df442d0ab2b3848cf12cc25fab0d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff6df442d0ab2b3848cf12cc25fab0d0");
            return;
        }
        StringBuilder sb = new StringBuilder();
        List<String> g = searchShareData.g();
        List<String> f = searchShareData.f();
        int a2 = com.sankuai.shangou.stone.util.a.a((List) guidedItem.mDropDownItems);
        boolean z = false;
        for (int i = 0; i < a2; i++) {
            SearchFilterGroup.SearchFilterItem searchFilterItem = (SearchFilterGroup.SearchFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) guidedItem.mDropDownItems, i);
            if (searchFilterItem != null && ((!TextUtils.isEmpty(searchFilterItem.filterCode) || !TextUtils.isEmpty(searchFilterItem.cpvValue)) && ((!guidedItem.isNewTextFilter() && g.contains(searchFilterItem.filterCode)) || (guidedItem.isNewTextFilter() && f.contains(searchFilterItem.cpvValue))))) {
                sb.append(searchFilterItem.filterName);
                sb.append(CommonConstant.Symbol.COMMA);
                z = true;
            }
        }
        guidedItem.isSelected = z;
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            guidedItem.selectedCodeStr = sb.toString();
            return;
        }
        guidedItem.selectedCodeStr = null;
    }
}
