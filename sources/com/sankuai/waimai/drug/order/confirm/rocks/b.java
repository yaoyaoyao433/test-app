package com.sankuai.waimai.drug.order.confirm.rocks;

import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements com.meituan.android.cube.pga.action.b {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.cube.pga.action.b
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d865e50bdf22cd2fb0e1ddba806fb94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d865e50bdf22cd2fb0e1ddba806fb94");
        } else {
            a.a(this.b, (b.a) obj);
        }
    }
}
