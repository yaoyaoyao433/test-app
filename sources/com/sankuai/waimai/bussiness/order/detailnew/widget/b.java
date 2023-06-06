package com.sankuai.waimai.bussiness.order.detailnew.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    private RecyclerView b;

    public b(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d069578dbffd65993c934a069e88fd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d069578dbffd65993c934a069e88fd1");
        } else {
            this.b = recyclerView;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.d
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258e630e44a7668353e053ebcf894b5b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258e630e44a7668353e053ebcf894b5b")).booleanValue() : (this.b == null || this.b.canScrollVertically(-1)) ? false : true;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.d
    public final View b() {
        return this.b;
    }
}
