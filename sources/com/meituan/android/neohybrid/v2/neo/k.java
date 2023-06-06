package com.meituan.android.neohybrid.v2.neo;

import com.meituan.android.neohybrid.v2.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements b.a {
    public static ChangeQuickRedirect a;
    private static final k b = new k();

    public static b.a a() {
        return b;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de79328d9c4cefb8fe21b9e7d2762829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de79328d9c4cefb8fe21b9e7d2762829");
        } else {
            aVar.d();
        }
    }
}
