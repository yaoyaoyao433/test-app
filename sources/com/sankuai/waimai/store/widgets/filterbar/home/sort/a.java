package com.sankuai.waimai.store.widgets.filterbar.home.sort;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends f<SortItem, com.sankuai.waimai.store.newwidgets.list.b> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a b;

    public a(@NonNull com.sankuai.waimai.store.newwidgets.list.b bVar, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(bVar);
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162a0815b1920763636b066973fcdcd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162a0815b1920763636b066973fcdcd6");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad145611b78c12165249448129069a6a", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad145611b78c12165249448129069a6a") : new d(this.b);
    }
}
