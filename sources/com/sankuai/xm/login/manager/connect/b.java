package com.sankuai.xm.login.manager.connect;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.login.net.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    private a b;
    private volatile long c;
    private volatile int d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, boolean z, boolean z2);
    }

    public static /* synthetic */ int a(b bVar) {
        int i = bVar.d;
        bVar.d = i + 1;
        return i;
    }

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "badb6aa965a109fca10d675df4494532", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "badb6aa965a109fca10d675df4494532");
            return;
        }
        this.b = aVar;
        this.c = -1L;
        this.d = 0;
    }

    public final synchronized boolean a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0b3ada583e40de6287c63f7fb5a2a1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0b3ada583e40de6287c63f7fb5a2a1")).booleanValue();
        } else if (this.c != -1) {
            return true;
        } else {
            this.c = g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.connect.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "840e1db69ab3289b74725198ad61b6ff", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "840e1db69ab3289b74725198ad61b6ff");
                        return;
                    }
                    b.a(b.this);
                    boolean k = m.a().k();
                    boolean z = b.this.d >= 10;
                    b.this.b.a(i, k, z);
                    if (k || z) {
                        b.this.a();
                    }
                }
            }, 500L, true);
            return this.c != -1;
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1067239260050ba251090fb7f2bdb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1067239260050ba251090fb7f2bdb9");
            return;
        }
        if (this.c != -1) {
            g.a().a(this.c);
            this.c = -1L;
            this.d = 0;
        }
    }
}
