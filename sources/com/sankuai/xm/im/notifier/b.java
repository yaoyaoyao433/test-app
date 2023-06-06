package com.sankuai.xm.im.notifier;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b {
    public static ChangeQuickRedirect e;
    private Class<?> a;
    public int f;

    public abstract void a() throws Exception;

    public b(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "194d17b267525d09b2201bdc3cad312f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "194d17b267525d09b2201bdc3cad312f");
            return;
        }
        this.f = 0;
        this.a = cls;
    }

    public final Class<?> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c059bf67e191d0618749cdb0478adbb", 6917529027641081856L) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c059bf67e191d0618749cdb0478adbb") : this.a == null ? getClass() : this.a;
    }

    public final boolean c() {
        return this.f == 1;
    }

    public final boolean d() {
        return this.f == 2;
    }

    public final boolean e() {
        return this.f == 3;
    }
}
