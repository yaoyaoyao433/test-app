package com.meituan.mmp.lib.widget;

import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final boolean b;
    final float c;
    final float d;
    final float e;
    final float f;

    public a(boolean z, float f, float f2, float f3, float f4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a06b05af721874a57328f2224c73b04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a06b05af721874a57328f2224c73b04");
            return;
        }
        this.b = z;
        this.c = p.b().density * f;
        this.d = p.b().density * f2;
        this.e = p.b().density * f3;
        this.f = p.b().density * f4;
    }
}
