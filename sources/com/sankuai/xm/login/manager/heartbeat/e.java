package com.sankuai.xm.login.manager.heartbeat;

import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protosingal.q;
import com.sankuai.xm.base.proto.protosingal.t;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.z;
import com.sankuai.xm.login.manager.f;
import com.sankuai.xm.login.manager.heartbeat.a;
import com.sankuai.xm.login.net.g;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends a {
    public static ChangeQuickRedirect b = null;
    private static int c = 30;
    private static short d = 120;
    private f e;
    private volatile long f;
    private b g;
    private volatile long h;
    private volatile long i;
    private volatile long j;
    private boolean k;
    private int l;
    private volatile boolean m;
    private volatile short n;
    private volatile int o;

    public static /* synthetic */ boolean a(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "f6bd516f866780651db5608e0f2fe332", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "f6bd516f866780651db5608e0f2fe332")).booleanValue();
        }
        com.sankuai.xm.login.d.a("SmartHeartDetector::sendPing");
        q qVar = new q();
        qVar.c(com.sankuai.xm.login.a.a().d);
        qVar.b = com.sankuai.xm.login.a.a().b;
        qVar.c = System.currentTimeMillis();
        return eVar.e.a(qVar.bS_());
    }

    public e(f fVar, a.InterfaceC1410a interfaceC1410a) {
        Object[] objArr = {fVar, interfaceC1410a};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946ec1325b6e99f503964c404e4b13ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946ec1325b6e99f503964c404e4b13ce");
            return;
        }
        this.e = fVar;
        this.a = interfaceC1410a;
        this.f = -1L;
        this.m = true;
        this.n = d;
        this.o = d - c;
        this.g = new b();
        this.g.g = 2;
        this.h = -1L;
        this.i = -1L;
        this.j = -1L;
    }

    @Override // com.sankuai.xm.login.manager.heartbeat.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a9b64c1a34d25f6b6e732535d9c54b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a9b64c1a34d25f6b6e732535d9c54b")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "959cd43672e4b82c1c6eb8a308722e92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "959cd43672e4b82c1c6eb8a308722e92");
        } else {
            try {
                String a = m.c().a("heart_config");
                if (!ac.a(a)) {
                    JSONObject jSONObject = new JSONObject(a);
                    this.m = jSONObject.optInt("isFixedDetect", 1) == 1;
                    this.n = (short) jSONObject.optInt("heartInterval", d);
                    this.o = (this.n - c <= 0 ? d : this.n) - c;
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f != -1) {
            e();
        }
        if (this.m) {
            return d();
        }
        if (com.sankuai.xm.base.f.m().i()) {
            return d();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "141508f0585a28851a4ca6897d0a0d49", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "141508f0585a28851a4ca6897d0a0d49")).booleanValue();
        }
        this.g = a(d.a());
        if (this.g.f >= this.n) {
            a((short) (this.g.f + 30));
        }
        b bVar = this.g;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b.a;
        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "78ba8ec8e02246b675dc679cf43cc777", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "78ba8ec8e02246b675dc679cf43cc777");
        } else {
            bVar.h = System.currentTimeMillis();
        }
        com.sankuai.xm.login.d.a("SmartHeartDetector::smartDetect:: " + this.g.f + "  detect type:" + this.g.g);
        this.f = g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.heartbeat.e.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "842923b79df26004e489c852fad76e14", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "842923b79df26004e489c852fad76e14");
                    return;
                }
                e.a(e.this);
                e.this.e.a(5, 5000);
            }
        }, (long) (this.g.f * 1000), false);
        return this.f != -1;
    }

    @Override // com.sankuai.xm.login.manager.heartbeat.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49c4f5e17ef74bdf46ca827371ab479c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49c4f5e17ef74bdf46ca827371ab479c");
            return;
        }
        e();
        f();
    }

    @Override // com.sankuai.xm.login.manager.heartbeat.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f57a3b485e2943741a8a8bb6b6ced5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f57a3b485e2943741a8a8bb6b6ced5")).booleanValue();
        }
        if (this.k) {
            com.sankuai.xm.login.d.c("SmartHeartDetector::quickDetect:: detect task has exist.", new Object[0]);
            return true;
        }
        this.k = true;
        this.l = 0;
        this.h = g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.heartbeat.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76843a63d14978ff42b049a607bb216c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76843a63d14978ff42b049a607bb216c");
                    return;
                }
                e.a(e.this);
                e.this.e.a(7, 5000);
            }
        }, 0L, false);
        this.i = g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.heartbeat.e.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22a17efc7ab7e1f70918740535bd91eb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22a17efc7ab7e1f70918740535bd91eb");
                    return;
                }
                e.a(e.this);
                e.this.e.a(8, 4000);
            }
        }, 1000L, false);
        this.j = g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.heartbeat.e.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4af2fc78d47fda9617726da1d2095ee6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4af2fc78d47fda9617726da1d2095ee6");
                    return;
                }
                e.a(e.this);
                e.this.e.a(9, 3000);
            }
        }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, false);
        return (this.h == -1 || this.i == -1 || this.j == -1) ? false : true;
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.g
    public final void b(int i, byte[] bArr) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac0ad63b06234eaa38b5992d0138156", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac0ad63b06234eaa38b5992d0138156");
        } else if (i != 196723) {
            if (i == 196728) {
                com.sankuai.xm.login.d.a("SmartHeartDetector::onData:: receive server detect res.");
            }
        } else {
            q qVar = new q();
            qVar.a(bArr);
            if (!this.k && this.g.b()) {
                b bVar = this.g;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c5772df4bf521d30ba620acac6b9644c", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c5772df4bf521d30ba620acac6b9644c")).booleanValue();
                } else {
                    z = bVar.h != 0 && System.currentTimeMillis() - bVar.h >= ((long) bVar.f);
                }
                if (z) {
                    b bVar2 = this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "b42aaadba6602e74de7182cb258d4863", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "b42aaadba6602e74de7182cb258d4863");
                    } else if (bVar2.f >= bVar2.c) {
                        bVar2.e = bVar2.c;
                        bVar2.f = bVar2.c;
                        bVar2.g = 0;
                    } else {
                        bVar2.e = bVar2.f;
                        bVar2.f += bVar2.d;
                    }
                    a(this.g);
                }
            }
            this.a.a(this.k ? 1 : 0, true);
            f();
            a();
            long currentTimeMillis = System.currentTimeMillis() - qVar.c;
            Object[] objArr4 = {new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.base.c.d;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f1ab83672c9e18dbf0a59b19babace7f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f1ab83672c9e18dbf0a59b19babace7f");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("net", Integer.valueOf(m.a().j()));
            hashMap.put("time", Long.valueOf(currentTimeMillis));
            m.d().a("pdt", hashMap);
        }
    }

    @Override // com.sankuai.xm.login.manager.c, com.sankuai.xm.login.manager.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a787042157a326789867b2e7684e23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a787042157a326789867b2e7684e23");
        } else if (i == 5) {
            c();
        } else if (i == 7 || i == 8 || i == 9) {
            this.l++;
            if (this.l >= 3) {
                if (this.g.b() || this.g.a()) {
                    b bVar = this.g;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4ac46859443f6fefbf74cedebb8c1d3a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4ac46859443f6fefbf74cedebb8c1d3a");
                    } else if (bVar.b()) {
                        if (bVar.e <= bVar.b) {
                            bVar.f = bVar.b;
                            bVar.g = 1;
                        } else {
                            bVar.f = bVar.e;
                            bVar.g = 0;
                        }
                    } else if (bVar.a()) {
                        bVar.f = bVar.b;
                        bVar.e = bVar.f;
                        bVar.g = 1;
                    }
                    a(this.g);
                }
                f();
                this.a.a(1, false);
            }
        }
    }

    @Override // com.sankuai.xm.login.manager.heartbeat.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e82d2e9d63d44ffc0ab1420617007bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e82d2e9d63d44ffc0ab1420617007bf");
            return;
        }
        if (this.f != -1) {
            e();
        }
        if (i == 1) {
            c();
        } else {
            d();
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77d95d4b130897c72e842169d3f07e4a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77d95d4b130897c72e842169d3f07e4a")).booleanValue();
        }
        a(this.n);
        this.g = a(d.a());
        this.g.g = 2;
        this.f = g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.heartbeat.e.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93e88deaa414255a487f0e67c631ad04", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93e88deaa414255a487f0e67c631ad04");
                    return;
                }
                e.a(e.this);
                e.this.e.a(5, 5000);
            }
        }, this.o * 1000, true);
        return this.f != -1;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b19e8df60da0ffdfdfcb6d20055c81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b19e8df60da0ffdfdfcb6d20055c81");
            return;
        }
        com.sankuai.xm.login.d.a("SmartHeartDetector::stopNormalDetect");
        if (this.f != -1) {
            g.a().a(this.f);
            this.f = -1L;
        }
        this.e.c(5);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39fdbd9befcad8e66ba008d39f9fc459", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39fdbd9befcad8e66ba008d39f9fc459");
            return;
        }
        com.sankuai.xm.login.d.a("SmartHeartDetector::stopQuickDetect");
        if (this.h != -1) {
            g.a().a(this.h);
            this.h = -1L;
        }
        if (this.i != -1) {
            g.a().a(this.i);
            this.i = -1L;
        }
        if (this.j != -1) {
            g.a().a(this.j);
            this.j = -1L;
        }
        this.k = false;
        this.l = 0;
        this.e.c(7);
        this.e.c(8);
        this.e.c(9);
    }

    private void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b2c839c516f4c4730427e30a73ebdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b2c839c516f4c4730427e30a73ebdd");
            return;
        }
        String a = d.a();
        if (ac.a(a)) {
            return;
        }
        z.a(bVar, a);
    }

    private boolean a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "269f86800b95c0142577fe47ddd0834a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "269f86800b95c0142577fe47ddd0834a")).booleanValue();
        }
        com.sankuai.xm.login.d.a("SmartHeartDetector::setServerKeepAliveTimeout:: " + ((int) s));
        t tVar = new t();
        tVar.b = s;
        return this.e.a(tVar.bS_());
    }

    private b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b52f7c4e34a491345f542170978f14", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b52f7c4e34a491345f542170978f14");
        }
        if (ac.a(str)) {
            return new b();
        }
        b bVar = (b) z.a(str);
        return bVar == null ? new b() : bVar;
    }
}
