package com.sankuai.waimai.bussiness.order.detail;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final WMOrderDetailActivity b;

    public b(WMOrderDetailActivity wMOrderDetailActivity) {
        this.b = wMOrderDetailActivity;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09d7e4f5d6d8545852c87cab10ee7e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09d7e4f5d6d8545852c87cab10ee7e4e");
        } else {
            WMOrderDetailActivity.a(this.b, (com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.a) obj);
        }
    }
}
