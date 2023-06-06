package com.sankuai.xm.network.analyse;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    volatile boolean b;
    b c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(int i);
    }

    public c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdcf1febae5edf3c5e9470ef48e2533f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdcf1febae5edf3c5e9470ef48e2533f");
            return;
        }
        this.b = false;
        this.c = bVar;
        this.d = new C1417c("www.baidu.com");
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da4e4123e585ffdf26ac9c7e3cd4fd2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da4e4123e585ffdf26ac9c7e3cd4fd2d");
        } else if (b()) {
        } else {
            this.b = true;
            a aVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e11ae1e0bad57824eeb9b70426cd1861", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e11ae1e0bad57824eeb9b70426cd1861");
            } else {
                m.e().a(32, aVar);
            }
        }
    }

    private synchronized boolean b() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    abstract class a implements Runnable {
        public static ChangeQuickRedirect a;
        protected int b;
        protected int c;
        protected String d;
        private g f;

        public a(String str) {
            Object[] objArr = {c.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "894267e6e90cdb138e47dac3fe000443", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "894267e6e90cdb138e47dac3fe000443");
                return;
            }
            this.c = 10;
            this.d = str;
            this.b = 0;
            this.f = j.a();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.network.analyse.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class C1417c extends a {
        public static ChangeQuickRedirect f;
        private Socket h;
        private g i;

        public C1417c(String str) {
            super(str);
            Object[] objArr = {c.this, str};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc934aa7760b43e7b2f6914ead6db57a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc934aa7760b43e7b2f6914ead6db57a");
            } else {
                this.i = j.a();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e97562a97f90a9fbfd489860bcb45e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e97562a97f90a9fbfd489860bcb45e");
                return;
            }
            try {
                j.a(this.i);
                com.sankuai.xm.login.d.a("NetworkAnalyse::CONN socket begin " + hashCode());
                long currentTimeMillis = System.currentTimeMillis();
                InetSocketAddress inetSocketAddress = new InetSocketAddress(this.d, 80);
                this.h = new Socket();
                int i = -1;
                try {
                    try {
                        try {
                            this.h.connect(inetSocketAddress, this.c * 1000);
                            com.sankuai.xm.login.d.a("NetworkAnalyse::CONN socket done " + hashCode() + StringUtil.SPACE + (System.currentTimeMillis() - currentTimeMillis));
                            if (this.h != null) {
                                try {
                                    this.h.close();
                                    this.h = null;
                                } catch (IOException unused) {
                                }
                            }
                            i = 0;
                        } catch (IOException e) {
                            com.sankuai.xm.login.d.b("NetworkAnalyse::CONN SocketDetector msg " + hashCode() + StringUtil.SPACE + e.getMessage());
                            if (this.h != null) {
                                this.h.close();
                                this.h = null;
                            }
                        }
                    } catch (Exception e2) {
                        com.sankuai.xm.login.d.b("NetworkAnalyse::CONN SocketDetector " + hashCode() + StringUtil.SPACE + e2.getMessage());
                        if (this.h != null) {
                            this.h.close();
                            this.h = null;
                        }
                    }
                } catch (IOException unused2) {
                }
                this.b = i;
                c.this.b = false;
                c.this.c.a(this.b);
                j.c(this.i);
            } catch (Throwable th) {
                j.a(this.i, th);
                throw th;
            }
        }
    }
}
