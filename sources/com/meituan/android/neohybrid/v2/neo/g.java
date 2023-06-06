package com.meituan.android.neohybrid.v2.neo;

import com.meituan.android.neohybrid.v2.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements b.a {
    public static ChangeQuickRedirect a;
    private static final g b = new g();

    public static b.a a() {
        return b;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de5d89b37ea07bd61e8911e282261959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de5d89b37ea07bd61e8911e282261959");
        } else {
            aVar.b();
        }
    }
}
