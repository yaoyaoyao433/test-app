package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_status_group_layout;
    }

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837cd81e7f0bfe0f2e9cfa5a48638d71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837cd81e7f0bfe0f2e9cfa5a48638d71");
        }
    }
}
