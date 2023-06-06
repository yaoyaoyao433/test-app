package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements com.meituan.android.cube.pga.action.b {
    public static ChangeQuickRedirect a;
    private final g b;

    public h(g gVar) {
        this.b = gVar;
    }

    @Override // com.meituan.android.cube.pga.action.b
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d024209cbc7c65879bd1853c237a49f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d024209cbc7c65879bd1853c237a49f3");
        } else {
            g.a(this.b, (Integer) obj);
        }
    }
}
