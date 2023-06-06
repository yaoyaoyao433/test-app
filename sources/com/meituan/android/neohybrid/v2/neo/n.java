package com.meituan.android.neohybrid.v2.neo;

import com.meituan.android.neohybrid.v2.neo.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements b.a {
    public static ChangeQuickRedirect a;
    private static final n b = new n();

    public static b.a a() {
        return b;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.b.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ab647ecf4b281d0eef9f9042ef2794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ab647ecf4b281d0eef9f9042ef2794");
        } else {
            aVar.g();
        }
    }
}
