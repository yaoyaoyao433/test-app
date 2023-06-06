package com.sankuai.waimai.store.search.mach.secondfilter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.search.common.view.d;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Mach.d {
    public static ChangeQuickRedirect a;
    private Context b;
    private SearchShareData c;

    public a(Context context, SearchShareData searchShareData) {
        Object[] objArr = {context, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a08312cd5365884b53fac3bfd231c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a08312cd5365884b53fac3bfd231c6");
            return;
        }
        this.b = context;
        this.c = searchShareData;
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        GuidedItem guidedItem;
        GuidedItem guidedItem2;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113014141bb3daa698a46c7cb0942bd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113014141bb3daa698a46c7cb0942bd8");
        } else if (map != null) {
            if (TextUtils.equals(str, "second_filter_search_request") || TextUtils.equals(str, "item_has_been_exposed")) {
                if (TextUtils.equals(str, "item_has_been_exposed")) {
                    SearchShareData searchShareData = this.c;
                    Object[] objArr2 = {searchShareData, map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7de46eddaea7c9a1dea9508abb28ca8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7de46eddaea7c9a1dea9508abb28ca8e");
                        return;
                    }
                    Object obj = map.get("sub_index");
                    if (obj instanceof Number) {
                        int intValue = ((Number) obj).intValue();
                        if (com.sankuai.shangou.stone.util.a.b(searchShareData.Y) || (guidedItem2 = (GuidedItem) com.sankuai.shangou.stone.util.a.a((List<Object>) searchShareData.Y, intValue)) == null) {
                            return;
                        }
                        guidedItem2.isExposed = true;
                        return;
                    }
                    return;
                }
                Object obj2 = map.get("selected_item_index");
                map.get("selected_item");
                boolean z = obj2 instanceof Number;
                int intValue2 = z ? ((Number) obj2).intValue() : 0;
                this.c.aa = intValue2;
                if (!z) {
                    com.sankuai.waimai.store.base.log.a.a("mach poi template js error, position = " + obj2);
                } else if (com.sankuai.shangou.stone.util.a.b(this.c.Y) || (guidedItem = (GuidedItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c.Y, intValue2)) == null || this.c == null) {
                } else {
                    this.c.a(new f.c(guidedItem, "_search_second_filer", false));
                    d.a(this.b, guidedItem.searchFilterDot, this.c);
                }
            }
        }
    }
}
