package com.sankuai.xm.base.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a extends TimerTask {
    public static ChangeQuickRedirect a;
    public f b;

    public abstract void b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503ea8e8755d87cad14a02fda73f9ff4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503ea8e8755d87cad14a02fda73f9ff4");
            return;
        }
        this.b = new f();
        this.b.a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d6b4a3b1203efd599ffd0441274de5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d6b4a3b1203efd599ffd0441274de5b");
        } else {
            this.b.a();
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b66d3aa1ccc39d59fece2478d012ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b66d3aa1ccc39d59fece2478d012ca");
            return;
        }
        try {
            this.b.b();
            b();
            this.b.c();
        } catch (Throwable th) {
            this.b.a(th);
            throw th;
        }
    }
}
