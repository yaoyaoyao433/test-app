package com.meituan.android.neohybrid.neo;

import com.meituan.android.neohybrid.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements b.a {
    public static ChangeQuickRedirect a;
    private static final i b = new i();

    public static b.a a() {
        return b;
    }

    @Override // com.meituan.android.neohybrid.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3fc57bfdfb9f21c4305b6ac14d5a663", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3fc57bfdfb9f21c4305b6ac14d5a663");
        } else {
            aVar.d();
        }
    }
}
