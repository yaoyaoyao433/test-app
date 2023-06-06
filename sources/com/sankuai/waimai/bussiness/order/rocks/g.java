package com.sankuai.waimai.bussiness.order.rocks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements com.meituan.android.cube.pga.action.c {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static com.meituan.android.cube.pga.action.c a() {
        return b;
    }

    @Override // com.meituan.android.cube.pga.action.c
    public final Object a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f2defca068e6868911b40a0fa2540bf", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f2defca068e6868911b40a0fa2540bf") : f.b((OrderRocksServerModel) obj);
    }
}
