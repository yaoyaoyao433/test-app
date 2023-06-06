package com.sankuai.waimai.store.widgets.filterbar.home.quickfilter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends f<FilterConditionResponse.FilterGroup.FilterItem, c> {
    public static ChangeQuickRedirect a;
    private boolean b;

    public a(@NonNull c cVar, boolean z) {
        super(cVar);
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "937685e8c40ad3edfa62f18d4eedb646", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "937685e8c40ad3edfa62f18d4eedb646");
            return;
        }
        this.b = false;
        this.b = z;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67c4cd507462df0cbd3391553c6e0b4", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67c4cd507462df0cbd3391553c6e0b4") : new d(f(), this.b);
    }
}
