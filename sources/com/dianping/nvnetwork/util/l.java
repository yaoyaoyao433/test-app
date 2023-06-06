package com.dianping.nvnetwork.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class l {
    public static ChangeQuickRedirect a;
    private static volatile l b;
    private final rx.subjects.e c;

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae04919f413267f7df556b22751f9f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae04919f413267f7df556b22751f9f0");
        } else {
            this.c = new rx.subjects.d(rx.subjects.b.g());
        }
    }

    public static l a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfed9e80f421854cc9e5f41946b24d2b", 6917529027641081856L)) {
            return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfed9e80f421854cc9e5f41946b24d2b");
        }
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    b = new l();
                }
            }
        }
        return b;
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e619dde32b5f5f7cd6e64450a13d8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e619dde32b5f5f7cd6e64450a13d8a");
        } else {
            this.c.onNext(obj);
        }
    }

    public final <T> rx.d<T> a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f647e70e11832d8ba841f18b778495ab", 6917529027641081856L) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f647e70e11832d8ba841f18b778495ab") : this.c.a((Class) cls).e();
    }
}
