package com.meituan.msc.modules.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public final String b;
    public final h c;
    public boolean d;

    public e(String str, h hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3111ea55d2ad97634d05787c9fa90f96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3111ea55d2ad97634d05787c9fa90f96");
            return;
        }
        this.b = str;
        this.c = hVar;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a1a7111ff9e6c99838708574fdc319e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a1a7111ff9e6c99838708574fdc319e")).booleanValue() : this.c.b().f();
    }
}
