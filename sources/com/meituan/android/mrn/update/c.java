package com.meituan.android.mrn.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends Exception {
    public static ChangeQuickRedirect a;
    public int b;
    private f c;

    public c(f fVar, int i) {
        super(String.format("errorCode = %s, type = %s", Integer.valueOf(i), fVar));
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a890cb2c75deb20f2f03dc6df68bfd1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a890cb2c75deb20f2f03dc6df68bfd1d");
            return;
        }
        this.c = fVar;
        this.b = i;
    }
}
