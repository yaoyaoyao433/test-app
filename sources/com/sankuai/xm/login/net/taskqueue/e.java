package com.sankuai.xm.login.net.taskqueue;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends a {
    public static ChangeQuickRedirect e;
    private c a;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43fa26413d239d3ebc82e94df63e44ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43fa26413d239d3ebc82e94df63e44ea");
        } else {
            this.a = new c();
        }
    }

    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b0c6a109f0aef839b816477d23c146", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b0c6a109f0aef839b816477d23c146")).booleanValue();
        }
        com.sankuai.xm.login.d.b("TaskPump::processNextMessage");
        return false;
    }

    @Override // com.sankuai.xm.login.net.taskqueue.a
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd5e36f66c82a0ee7073b274d8ba486b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd5e36f66c82a0ee7073b274d8ba486b");
            return;
        }
        com.sankuai.xm.login.d.b("TaskPump::notifySignal");
        c cVar = this.a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "3a0ebb76d2e970a0fd3d736c39fd3165", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "3a0ebb76d2e970a0fd3d736c39fd3165");
            return;
        }
        synchronized (cVar.b) {
            cVar.c++;
            cVar.b.notify();
        }
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25dca4633f21b543f28300850672a3ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25dca4633f21b543f28300850672a3ec");
            return;
        }
        com.sankuai.xm.login.d.b("TaskPump::waitSignal => timeout = " + j);
        c cVar = this.a;
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "bdc580433e95c7174d0b48abe46ab0cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "bdc580433e95c7174d0b48abe46ab0cb");
            return;
        }
        synchronized (cVar.b) {
            if (cVar.c == 0) {
                Object[] objArr3 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "7e7f1ec4be8e09d70fc28e31c78623aa", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "7e7f1ec4be8e09d70fc28e31c78623aa");
                } else if (j > 0) {
                    try {
                        cVar.b.wait(j);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            cVar.c = 0L;
        }
    }

    @Override // com.sankuai.xm.login.net.taskqueue.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd45abf63178842d6e6f73d117b214d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd45abf63178842d6e6f73d117b214d2");
            return;
        }
        while (true) {
            boolean b = b();
            if (this.d.a()) {
                return;
            }
            this.d.a.f();
            if (this.d.a()) {
                return;
            }
            long g = this.d.a.g();
            if (this.d.a()) {
                return;
            }
            if (!b) {
                a(g);
            }
        }
    }
}
