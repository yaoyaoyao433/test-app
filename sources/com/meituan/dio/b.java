package com.meituan.dio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    protected final boolean b;
    protected final boolean c;

    public b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4401e56d5f7431a210f441b2219c60c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4401e56d5f7431a210f441b2219c60c");
            return;
        }
        this.b = (i & 1) != 0;
        this.c = (i & 2) != 0;
    }

    public final boolean a() {
        return this.c;
    }
}
