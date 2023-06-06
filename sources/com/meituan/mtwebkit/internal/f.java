package com.meituan.mtwebkit.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public volatile int b;
    private AtomicBoolean c;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static f a = new f();
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b4aa16c7c5ef0e35d3df09a602a621a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b4aa16c7c5ef0e35d3df09a602a621a");
            return;
        }
        this.c = new AtomicBoolean(false);
        this.b = 0;
    }
}
