package com.meituan.android.neohybrid.v2.neo;

import com.meituan.android.neohybrid.v2.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements b.a {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.neohybrid.neo.n b;

    public f(com.meituan.android.neohybrid.neo.n nVar) {
        this.b = nVar;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8250163177d2aeda1122d28d4a0c0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8250163177d2aeda1122d28d4a0c0a");
            return;
        }
        com.meituan.android.neohybrid.neo.n nVar = this.b;
        Object[] objArr2 = {nVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a56ff05320757f4a1ac4fb00609037ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a56ff05320757f4a1ac4fb00609037ce");
        } else {
            aVar.a(nVar);
        }
    }
}
