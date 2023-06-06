package com.sankuai.waimai.store.widgets.filterbar.sortlist;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends f<SGSortModel, c> {
    public static ChangeQuickRedirect a;

    public a(@NonNull c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3231b1238b9acd1c0ded5594543f524", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3231b1238b9acd1c0ded5594543f524");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3df4cc92790307a12c4122075a1d4ff", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3df4cc92790307a12c4122075a1d4ff") : new d(i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0358602c172dc0e3bcbeb8ed4403db6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0358602c172dc0e3bcbeb8ed4403db6")).intValue();
        }
        SGSortModel h = h(i);
        if (h != null) {
            return h.style;
        }
        return 1;
    }
}
