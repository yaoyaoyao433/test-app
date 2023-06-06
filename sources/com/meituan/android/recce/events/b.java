package com.meituan.android.recce.events;

import com.meituan.android.recce.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b extends f {
    public static ChangeQuickRedirect a;

    public abstract String d();

    public b(int i) {
        super(i, 144);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a1c62ffbfc61c04f8a4ec4614b11ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a1c62ffbfc61c04f8a4ec4614b11ce");
        }
    }

    @Override // com.meituan.android.recce.events.c
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66740a6575127443f298cab65e2f376", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66740a6575127443f298cab65e2f376") : new c.a().a("name", b()).a("data", d()).b.toString();
    }
}
