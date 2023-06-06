package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements com.meituan.android.cube.pga.action.b {
    public static ChangeQuickRedirect a;
    private final g b;

    public i(g gVar) {
        this.b = gVar;
    }

    @Override // com.meituan.android.cube.pga.action.b
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1a625f2f018eae55267afa0bc8fe8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1a625f2f018eae55267afa0bc8fe8a");
        } else {
            g.a(this.b, (Map) obj);
        }
    }
}
