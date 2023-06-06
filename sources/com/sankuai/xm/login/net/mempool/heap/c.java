package com.sankuai.xm.login.net.mempool.heap;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends com.sankuai.xm.login.net.mempool.base.c<ByteBuffer> {
    public static ChangeQuickRedirect a;
    private static c b;
    private e c;
    private com.sankuai.xm.login.net.mempool.heap.a d;
    private f e;
    private b f;
    private int g;
    private volatile boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class b {
        public abstract com.sankuai.xm.login.net.mempool.heap.b a(int i);
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "046a928367b13bb403889a6fa4d88ae9", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "046a928367b13bb403889a6fa4d88ae9");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a68bba9c0bc7f334bb11a81d0c5d80c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a68bba9c0bc7f334bb11a81d0c5d80c");
            return;
        }
        this.g = 0;
        this.h = false;
    }

    public final void a(int i, int i2, b bVar) {
        Object[] objArr = {3145728, 4096, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16bf6833ae9b376f6598af8c5633e883", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16bf6833ae9b376f6598af8c5633e883");
        } else if (this.h) {
        } else {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.c = new e(3145728, 4096);
                this.d = new com.sankuai.xm.login.net.mempool.heap.a(this.c);
                this.e = new f(this.c);
                this.f = null;
                if (this.f == null) {
                    this.f = new a();
                }
                this.h = true;
            }
        }
    }

    public final com.sankuai.xm.login.net.mempool.heap.b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9899eb7a9feaea605f13de9dce5571c", 6917529027641081856L)) {
            return (com.sankuai.xm.login.net.mempool.heap.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9899eb7a9feaea605f13de9dce5571c");
        }
        if (!this.h) {
            a(3145728, 4096, null);
        }
        com.sankuai.xm.login.net.mempool.heap.b a2 = this.d.a(i);
        if (a2 == null) {
            b();
            a2 = this.d.a(i);
        }
        this.g++;
        this.e.a(a2);
        if (a2 == null && this.f != null) {
            com.sankuai.xm.login.net.mempool.heap.b a3 = this.f.a(i);
            this.g = 0;
            return a3;
        } else if (this.g > 5) {
            this.g = 0;
            return a2;
        } else {
            return a2;
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce8fb8271e6073a777e6e58f79780e9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce8fb8271e6073a777e6e58f79780e9f");
        } else if (this.e != null) {
            this.e.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.xm.login.net.mempool.heap.c.b
        public final com.sankuai.xm.login.net.mempool.heap.b a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53044d657496017bc592b980df110a2f", 6917529027641081856L)) {
                return (com.sankuai.xm.login.net.mempool.heap.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53044d657496017bc592b980df110a2f");
            }
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.login.net.mempool.heap.b.l;
            com.sankuai.xm.login.net.mempool.heap.b bVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7de385ae38a01771674638b0fdaf9d7c", 6917529027641081856L) ? (com.sankuai.xm.login.net.mempool.heap.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7de385ae38a01771674638b0fdaf9d7c") : new com.sankuai.xm.login.net.mempool.heap.b(i);
            bVar.a(d.d(i));
            bVar.b(i);
            return bVar;
        }
    }
}
