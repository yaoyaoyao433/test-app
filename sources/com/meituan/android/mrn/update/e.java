package com.meituan.android.mrn.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public boolean b;
    int c;
    public boolean d;

    public e() {
        this(true);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a64dfa14d4aae127779b475a77f2b31d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a64dfa14d4aae127779b475a77f2b31d");
        }
    }

    public e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36d800e6f6f1aa5fa74ae016510fbfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36d800e6f6f1aa5fa74ae016510fbfd");
            return;
        }
        this.c = 5;
        this.d = true;
        this.b = z;
    }
}
