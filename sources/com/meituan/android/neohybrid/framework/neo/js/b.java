package com.meituan.android.neohybrid.framework.neo.js;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final String c;

    private b(a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public static Runnable a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87f520794afa93640ca9c4a0ee7a7834", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87f520794afa93640ca9c4a0ee7a7834") : new b(aVar, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515e7f4dccc6df7ffa8eb10e50a60aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515e7f4dccc6df7ffa8eb10e50a60aaa");
        } else {
            a.b(this.b, this.c);
        }
    }
}
