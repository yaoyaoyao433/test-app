package com.meituan.msc.modules.container;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final String c;
    private final int d;
    private final Throwable e;

    private f(b bVar, String str, int i, Throwable th) {
        this.b = bVar;
        this.c = str;
        this.d = i;
        this.e = th;
    }

    public static Runnable a(b bVar, String str, int i, Throwable th) {
        Object[] objArr = {bVar, str, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76190a757632763c7e53dc03f635fd10", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76190a757632763c7e53dc03f635fd10") : new f(bVar, str, i, th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b20e6a86082c0db1b58ff54623ffea89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b20e6a86082c0db1b58ff54623ffea89");
        } else {
            b.a(this.b, this.c, this.d, this.e);
        }
    }
}
