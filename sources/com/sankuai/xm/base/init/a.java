package com.sankuai.xm.base.init;

import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.m;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a {
    private static final ConcurrentHashMap<Integer, a> a = new ConcurrentHashMap<>();
    public static ChangeQuickRedirect c;
    private final Object b;
    protected volatile f d;
    public volatile short e;
    public volatile short f;
    public volatile short g;
    public volatile short h;
    private int i;
    private final a j;
    private long k;

    public abstract void a(f fVar);

    public abstract List<a> b();

    public abstract void b(f fVar);

    public abstract String c();

    public abstract void c(f fVar);

    public abstract void d(f fVar);

    public a(int i) {
        this(1, null);
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d6155c74c94b53b59427b2626aa645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d6155c74c94b53b59427b2626aa645");
        }
    }

    public a(int i, a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab1fd8041176c0efbba16961ad48174", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab1fd8041176c0efbba16961ad48174");
            return;
        }
        this.b = new Object();
        this.e = (short) 0;
        this.f = (short) 0;
        this.g = (short) 0;
        this.h = (short) 0;
        this.k = System.currentTimeMillis();
        this.i = i;
        this.j = aVar;
        if (this.j != null) {
            this.j.i = i;
        }
    }

    public final int o() {
        return this.i;
    }

    public final boolean p() {
        return this.e == 1;
    }

    public boolean e(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc689aa3c0119db6493b1c6703a62ea", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc689aa3c0119db6493b1c6703a62ea")).booleanValue();
        }
        if (f(fVar)) {
            this.d = fVar;
            f fVar2 = this.d;
            int i = this.i;
            if (i > fVar2.k) {
                fVar2.k = i;
            }
            boolean e = this.j != null ? this.j.e(fVar) : false;
            if (e) {
                a.put(Integer.valueOf(this.i), this);
                b.a(this.k);
                q();
            }
            return e;
        }
        return false;
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9a16f58897615b5473274cd5b55473", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9a16f58897615b5473274cd5b55473");
        } else if (p()) {
        } else {
            if (this.d == null && f.m().k >= this.i) {
                this.d = f.m();
            }
            if (this.d != null) {
                g(this.d);
            }
        }
    }

    public boolean f(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094dc2bdad2d4be31ba441dae5e18d11", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094dc2bdad2d4be31ba441dae5e18d11")).booleanValue() : fVar != null && fVar.k() > 0 && fVar.c > 0;
    }

    private void g(final f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e74bd468931c333b353cec28df34e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e74bd468931c333b353cec28df34e7");
        } else if (this.e == 1) {
        } else {
            synchronized (this) {
                if (this.e != 1) {
                    com.sankuai.xm.log.a.a("imsdk init " + c() + "::onSyncInit");
                    a(fVar);
                    if (this.j != null) {
                        this.j.a(fVar);
                    }
                }
                this.e = (short) 1;
                if (this.i >= fVar.k && this.f != 1) {
                    com.sankuai.xm.log.a.a("imsdk init " + c() + "::invoke asyncInit");
                    d();
                    m.e().a(11, new Runnable() { // from class: com.sankuai.xm.base.init.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b80b71de75dbf83c3cb63b1c288643b9", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b80b71de75dbf83c3cb63b1c288643b9");
                            } else {
                                a.this.h(fVar);
                            }
                        }
                    });
                }
            }
            a.put(Integer.valueOf(this.i), this);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eccf53b7849867d8449ec7475b0227f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eccf53b7849867d8449ec7475b0227f");
        } else if (this.f != 1) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "310104df95c90408e7a1325dd2f7fc0f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "310104df95c90408e7a1325dd2f7fc0f");
                } else {
                    List<a> b = b();
                    if (!com.sankuai.xm.base.util.b.a(b)) {
                        for (a aVar : b) {
                            aVar.q();
                            aVar.h(aVar.d);
                        }
                    }
                }
                i(fVar);
                j(fVar);
                synchronized (this.b) {
                    if (this.f != 1) {
                        d(fVar);
                        if (this.j != null) {
                            this.j.d(fVar);
                        }
                    }
                    this.f = (short) 1;
                }
            } catch (Throwable th) {
                Object[] objArr3 = {PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "asyncInit", th};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.monitor.statistics.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "561edfa82c01bd1615c1c0e3dc77732d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "561edfa82c01bd1615c1c0e3dc77732d");
                } else {
                    m.e().b(new Runnable() { // from class: com.sankuai.xm.monitor.statistics.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9370ae4ccee51ae67e274e0e26965dfb", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9370ae4ccee51ae67e274e0e26965dfb");
                                return;
                            }
                            String str = null;
                            if (th != null) {
                                StringWriter stringWriter = new StringWriter();
                                th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                                str = stringWriter.toString();
                            }
                            a.a(r2, r3, str);
                        }
                    });
                }
            }
        }
    }

    private void i(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d64b229360e89ea4a2420a4c0504d40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d64b229360e89ea4a2420a4c0504d40");
        } else if (this.g == 1) {
        } else {
            synchronized (this.b) {
                if (this.g != 1) {
                    b(fVar);
                    if (this.j != null) {
                        this.j.b(fVar);
                    }
                }
                this.g = (short) 1;
            }
        }
    }

    private void j(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d0dcdf83a87bb7e8c236c34582a5dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d0dcdf83a87bb7e8c236c34582a5dc");
        } else if (this.h == 1) {
        } else {
            synchronized (this.b) {
                if (this.h != 1) {
                    c(fVar);
                    if (this.j != null) {
                        this.j.c(fVar);
                    }
                }
                this.h = (short) 1;
            }
        }
    }

    public final boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf1ba3b2cd2bb995e6dbde111fd1179", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf1ba3b2cd2bb995e6dbde111fd1179")).booleanValue() : a.containsKey(1);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c7c174a8ec18d844ff2ceda2d287d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c7c174a8ec18d844ff2ceda2d287d4");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", c());
        m.d().b("async_init_invoke", hashMap);
    }

    public static void a(boolean z, boolean z2) {
        Object[] objArr = {(byte) 1, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4fb895f12fe1bd0669e58480b531e58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4fb895f12fe1bd0669e58480b531e58");
            return;
        }
        HashSet hashSet = new HashSet();
        for (a aVar : a.values()) {
            hashSet.add(aVar);
            List<a> a2 = a(aVar);
            if (!com.sankuai.xm.base.util.b.a(a2)) {
                hashSet.addAll(a2);
            }
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            aVar2.q();
            aVar2.i(aVar2.d);
        }
    }

    private static List<a> a(a aVar) {
        List<a> b;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26d24679fed7ac8659998717cedc0848", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26d24679fed7ac8659998717cedc0848");
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b);
        for (a aVar2 : b) {
            List<a> a2 = a(aVar2);
            if (!com.sankuai.xm.base.util.b.a(a2)) {
                arrayList.addAll(a2);
            }
        }
        return arrayList;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a078afac43cc0b6cf09ad2c2d12c3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a078afac43cc0b6cf09ad2c2d12c3d");
        } else if (this.i == f.m().k) {
            b.a();
        }
    }
}
