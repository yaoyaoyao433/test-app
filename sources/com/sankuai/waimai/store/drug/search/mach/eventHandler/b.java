package com.sankuai.waimai.store.drug.search.mach.eventHandler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements Mach.d {
    public static ChangeQuickRedirect a;
    private SearchShareData b;

    public b(Context context, SearchShareData searchShareData) {
        Object[] objArr = {context, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ecda1272e6c1d2ced7ebfdbdd545858", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ecda1272e6c1d2ced7ebfdbdd545858");
        } else {
            this.b = searchShareData;
        }
    }

    @Override // com.sankuai.waimai.mach.Mach.d
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a846f89750f354a69489a014c5a1a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a846f89750f354a69489a014c5a1a6");
        } else if (map == null || !TextUtils.equals(str, "drug_search_middle_filter")) {
        } else {
            Object obj = map.get("selected_item");
            if (!(obj instanceof Map)) {
                com.sankuai.waimai.store.base.log.a.a("mach poi template js error, selectedItem = " + obj);
                return;
            }
            GuidedItem guidedItem = (GuidedItem) i.a(i.a(obj), GuidedItem.class);
            if (guidedItem == null || this.b == null) {
                return;
            }
            this.b.a(new f.c(guidedItem, "_search_over_page_search_group"));
        }
    }
}
