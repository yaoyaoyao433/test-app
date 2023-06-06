package com.meituan.android.ptcommonim.video.play.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final int c;
    private final String d;

    private c(a aVar, int i, String str) {
        this.b = aVar;
        this.c = i;
        this.d = str;
    }

    public static Runnable a(a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b89bc1dfa9608c08c867cee13dc0a22", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b89bc1dfa9608c08c867cee13dc0a22") : new c(aVar, i, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a118e7e96fb3efd5ca8405faf4eb37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a118e7e96fb3efd5ca8405faf4eb37");
            return;
        }
        a aVar = this.b;
        int i = this.c;
        String str = this.d;
        Object[] objArr2 = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2d105593ab040cb5b14fe593ff3622cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2d105593ab040cb5b14fe593ff3622cd");
        } else if (aVar.g != null) {
            aVar.g.a(i, str);
        }
    }
}
