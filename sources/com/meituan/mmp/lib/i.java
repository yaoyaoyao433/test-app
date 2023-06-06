package com.meituan.mmp.lib;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final int c;
    private final int d;
    private final Intent e;

    private i(a aVar, int i, int i2, Intent intent) {
        this.b = aVar;
        this.c = i;
        this.d = i2;
        this.e = intent;
    }

    public static Runnable a(a aVar, int i, int i2, Intent intent) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b3fb776339eac36b74d1c275c606a1b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b3fb776339eac36b74d1c275c606a1b") : new i(aVar, i, i2, intent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6f75298fd0ffe134d21a873b650af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6f75298fd0ffe134d21a873b650af7");
        } else {
            a.a(this.b, this.c, this.d, this.e);
        }
    }
}
