package com.sankuai.xm.login.net.taskqueue;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a {
    public static ChangeQuickRedirect c;
    protected C1413a d;

    public abstract void a();

    public abstract void d();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b46109b777540c5bc4ea4c4e51f06327", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b46109b777540c5bc4ea4c4e51f06327");
        } else {
            this.d = new C1413a();
        }
    }

    public final int a(com.sankuai.xm.login.net.taskqueue.base.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "008b83eb952f7c887fb27eff3bf73dc6", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "008b83eb952f7c887fb27eff3bf73dc6")).intValue();
        }
        com.sankuai.xm.login.d.b("AbstractPump::run => pump running.");
        this.d.a = (b) aVar;
        this.d.a(false);
        this.d.a(0);
        d();
        int b = this.d.b();
        this.d.a = null;
        com.sankuai.xm.login.d.b("AbstractPump::run => pump stopped, code is " + b);
        return b;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667c222c5ae9c798ae0e2591d8485c32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667c222c5ae9c798ae0e2591d8485c32");
        } else {
            a();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.login.net.taskqueue.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1413a {
        public b a;
        private boolean b;
        private int c;

        public final synchronized boolean a() {
            return this.b;
        }

        public final synchronized void a(boolean z) {
            this.b = false;
        }

        public final synchronized int b() {
            return this.c;
        }

        public final synchronized void a(int i) {
            this.c = 0;
        }
    }
}
