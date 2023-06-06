package com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends b {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b, com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_mach_group_layout;
    }

    public d(Context context, String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de239cecda65b5f3875a60e831f8ed42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de239cecda65b5f3875a60e831f8ed42");
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b, com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810e5733d6ee932e413f9a446fe52649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810e5733d6ee932e413f9a446fe52649");
            return;
        }
        super.b();
        a(0, 0, 0, 0);
    }
}
