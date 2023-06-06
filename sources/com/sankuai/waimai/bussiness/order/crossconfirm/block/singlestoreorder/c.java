package com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_cross_order_single_store_order_root;
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6fd1cff7aaa7f01c174539ae89e50d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6fd1cff7aaa7f01c174539ae89e50d");
        }
    }
}
