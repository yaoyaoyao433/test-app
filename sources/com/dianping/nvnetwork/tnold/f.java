package com.dianping.nvnetwork.tnold;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    private volatile boolean e;
    private volatile boolean f;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2411ac1ffdafcf4dc8595a0ab1bc9aa6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2411ac1ffdafcf4dc8595a0ab1bc9aa6");
            return;
        }
        this.b = false;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de14e4fb0708fe40dff36569cce52181", 6917529027641081856L) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de14e4fb0708fe40dff36569cce52181") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        private static final f a = new f();
    }
}
