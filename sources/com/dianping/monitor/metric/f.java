package com.dianping.monitor.metric;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static f b = new f();
    private final List<WeakReference<d>> c;

    public static f a() {
        return b;
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfef5d6a4fcf9f6aa91e66c8889c64e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfef5d6a4fcf9f6aa91e66c8889c64e6");
        } else {
            this.c = new ArrayList();
        }
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f95edfbecdece03db1f3e172b16f011", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f95edfbecdece03db1f3e172b16f011");
            return;
        }
        synchronized (this) {
            this.c.add(new WeakReference<>(dVar));
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e0cf420554634eaabaa238a58e1f1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e0cf420554634eaabaa238a58e1f1f");
            return;
        }
        synchronized (this) {
            for (WeakReference<d> weakReference : this.c) {
                d dVar = weakReference.get();
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
    }
}
