package com.sankuai.waimai.business.restaurant.poicontainer.machpro.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.list.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.machpro.component.list.d
    public final RecyclerView a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa40cbfff0e59fd08cb10f1e5779dfe", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa40cbfff0e59fd08cb10f1e5779dfe") : new NestedRecyclerView(context);
    }
}
