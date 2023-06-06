package com.sankuai.waimai.bussiness.order.confirm.pgablock.root;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements com.meituan.android.cube.pga.action.d {
    public static ChangeQuickRedirect a;
    private final b b;

    public c(b bVar) {
        this.b = bVar;
    }

    @Override // com.meituan.android.cube.pga.action.d
    public final Object a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363cf3f1540b7a9a2ed70050ceff93c0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363cf3f1540b7a9a2ed70050ceff93c0");
        }
        b bVar = this.b;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.f;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "233e3477828a5b8b8df559a8a3b4e7f1", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "233e3477828a5b8b8df559a8a3b4e7f1") : Boolean.valueOf(bVar.F().aO_());
    }
}
