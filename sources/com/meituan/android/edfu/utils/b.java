package com.meituan.android.edfu.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private int b;
    private float c;
    private long d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c377855f8ddca7d36e26e0c01556d4b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c377855f8ddca7d36e26e0c01556d4b5");
            return;
        }
        this.b = 0;
        this.c = 0.0f;
        this.d = 0L;
    }
}
