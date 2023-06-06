package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import android.content.Context;
import android.support.constraint.R;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public FrameLayout e;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_status_operatearea_group_view;
    }

    public i(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de95eca7208c0d44c4695628b7e25072", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de95eca7208c0d44c4695628b7e25072");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541d790eba7188758554e4e0958cdcde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541d790eba7188758554e4e0958cdcde");
            return;
        }
        super.b();
        this.e = (FrameLayout) this.b.findViewById(R.id.fl_order_status_operation_area_group);
    }
}
