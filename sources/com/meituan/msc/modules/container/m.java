package com.meituan.msc.modules.container;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ModuleName(name = "PageManager")
/* loaded from: classes3.dex */
public class m extends com.meituan.msc.modules.manager.k implements q {
    public static ChangeQuickRedirect a;
    public List<p> b;
    public volatile p c;
    private final AtomicInteger d;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa89b69df1167a62affcd54d8a9c3b6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa89b69df1167a62affcd54d8a9c3b6c");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        this.d = new AtomicInteger(0);
    }

    @Override // com.meituan.msc.modules.container.q
    public final Activity c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9ad1206cd7901c1a44edad5746e57c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9ad1206cd7901c1a44edad5746e57c");
        }
        p pVar = this.c;
        if (pVar != null) {
            return pVar.C();
        }
        return null;
    }

    @Override // com.meituan.msc.modules.container.q
    @NonNull
    public final List<p> d() {
        return this.b;
    }

    @Override // com.meituan.msc.modules.container.q
    public final p e() {
        return this.c;
    }

    @Override // com.meituan.msc.modules.container.q
    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e12677e57ef39afb5a9a04156ece5d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e12677e57ef39afb5a9a04156ece5d4")).booleanValue();
        }
        p pVar = this.c;
        if (pVar == null || pVar.D()) {
            for (p pVar2 : this.b) {
                if (pVar2 != null && !pVar2.D()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.meituan.msc.modules.container.q
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e461bfe4d2563d1018f88485fc3dc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e461bfe4d2563d1018f88485fc3dc6")).booleanValue();
        }
        p f = f(i);
        return f != null && f.A();
    }

    @Override // com.meituan.msc.modules.container.q
    @Nullable
    public final com.meituan.msc.modules.page.e g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc2519bee0be547dfadba9e7d8b29aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc2519bee0be547dfadba9e7d8b29aa");
        }
        p pVar = this.c;
        if (pVar == null || pVar.t() == null) {
            return null;
        }
        return pVar.t().b();
    }

    @Override // com.meituan.msc.modules.container.q
    @Nullable
    public final com.meituan.msc.modules.page.c h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d85ccfa9c2a5eef49bcb9df73373fa9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d85ccfa9c2a5eef49bcb9df73373fa9");
        }
        p pVar = this.c;
        if (pVar != null) {
            return pVar.t();
        }
        return null;
    }

    @Override // com.meituan.msc.modules.container.q
    @Nullable
    public final com.meituan.msc.modules.page.e b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c9ade333acd1e31ea623b112e37722", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c9ade333acd1e31ea623b112e37722");
        }
        com.meituan.msc.modules.page.c d = d(i);
        if (d != null) {
            return d.c(i);
        }
        return null;
    }

    @Override // com.meituan.msc.modules.container.q
    @Nullable
    public final com.meituan.msc.modules.page.e c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66bb8af74b7ed241b1738e6b493263cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66bb8af74b7ed241b1738e6b493263cd");
        }
        com.meituan.msc.modules.page.c d = d(i);
        com.meituan.msc.modules.page.e c = d != null ? d.c(i) : null;
        return c != null ? c : g();
    }

    @Override // com.meituan.msc.modules.container.q
    @Nullable
    public final com.meituan.msc.modules.page.c d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1bb793f45cac24e10a6b467a246356", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1bb793f45cac24e10a6b467a246356");
        }
        p e = e(i);
        if (e != null) {
            return e.t();
        }
        return null;
    }

    @Override // com.meituan.msc.modules.container.q
    @Nullable
    public final p f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "237aefac6602ddc8def7e8023d7bf917", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "237aefac6602ddc8def7e8023d7bf917");
        }
        p e = e(i);
        return e == null ? this.c : e;
    }

    @Override // com.meituan.msc.modules.container.q
    public final void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00fb52656e02a31f9b4f373848ba7f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00fb52656e02a31f9b4f373848ba7f7f");
            return;
        }
        this.c = lVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c817145c49354888c050084efc8e044e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c817145c49354888c050084efc8e044e");
        } else if (this.d.incrementAndGet() > 0) {
            com.meituan.msc.modules.engine.h U_ = U_();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.engine.h.a;
            if (PatchProxy.isSupport(objArr3, U_, changeQuickRedirect3, false, "5f9b9e4bd3ac75c6533f4ddecdb272e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, U_, changeQuickRedirect3, false, "5f9b9e4bd3ac75c6533f4ddecdb272e8");
            } else {
                com.meituan.msc.modules.reporter.g.d(U_.b, "active runtime");
                com.meituan.msc.modules.engine.q.c(U_.d);
                U_.K.removeCallbacksAndMessages(null);
            }
        }
        this.b.add(lVar);
    }

    private void a(p pVar, String str) {
        Object[] objArr = {pVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5892af7ccbaeffcc0810ec5b99e079f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5892af7ccbaeffcc0810ec5b99e079f");
            return;
        }
        this.c = pVar;
        com.meituan.msc.modules.reporter.g.d(toString(), U_(), "focusTopContainer", pVar, "reason", str);
        if (pVar == null || pVar.A()) {
            return;
        }
        com.meituan.msc.modules.container.fusion.c.a(pVar.C(), pVar.F());
    }

    @Override // com.meituan.msc.modules.container.q
    public final void b(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7692e2abe4da4a4bd64080f268bd39a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7692e2abe4da4a4bd64080f268bd39a4");
            return;
        }
        a(lVar, "onContainerResume");
        U_().a(new com.meituan.msc.modules.manager.f("msc_event_container_resumed", lVar));
    }

    @Override // com.meituan.msc.modules.container.q
    public final void a(l lVar, boolean z) {
        Object[] objArr = {lVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f828f3ad599796f9022a8460540e477d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f828f3ad599796f9022a8460540e477d");
            return;
        }
        if (z) {
            a(lVar, "onWindowFocusChanged");
        }
        U_().a(new com.meituan.msc.modules.manager.f("msc_event_window_focus_change", Boolean.valueOf(z)));
    }

    @Override // com.meituan.msc.modules.container.q
    public final void c(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f3e24ac3d1c847dd99a74d88671950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f3e24ac3d1c847dd99a74d88671950");
        } else if (this.c == null || this.c != lVar) {
        } else {
            U_().a(new com.meituan.msc.modules.manager.f("msc_event_container_paused", lVar));
            if (MSCHornRollbackConfig.d().c().isRollbackContainerPauseUpdateTopContainer) {
                return;
            }
            a("find next resumed container after current ContainerPaused");
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a09cad4244d8ab3e19f0208e2b8d2e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a09cad4244d8ab3e19f0208e2b8d2e8");
            return;
        }
        for (p pVar : this.b) {
            if (!pVar.D() && !pVar.M()) {
                a(pVar, str);
                return;
            }
        }
    }

    @Override // com.meituan.msc.modules.container.q
    public final void d(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276e409d268d66ed191b10f8bde14478", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276e409d268d66ed191b10f8bde14478");
            return;
        }
        Object[] objArr2 = {lVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5628278b139c23c414d14db2be1972e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5628278b139c23c414d14db2be1972e");
        } else {
            int i = this.d.get();
            com.meituan.msc.modules.reporter.g.d("ContainerManger", "releaseCount, current retainCount is" + i);
            if (i > 0) {
                int decrementAndGet = this.d.decrementAndGet();
                com.meituan.msc.modules.reporter.g.d("ContainerManger", "releaseCount finish, current retainCount is" + decrementAndGet);
                if (decrementAndGet == 0) {
                    final com.meituan.msc.modules.engine.h U_ = U_();
                    boolean z = !lVar.J();
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.engine.h.a;
                    if (PatchProxy.isSupport(objArr3, U_, changeQuickRedirect3, false, "bd48459cc96db7bc5387aad5c1fa00f4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, U_, changeQuickRedirect3, false, "bd48459cc96db7bc5387aad5c1fa00f4");
                    } else {
                        com.meituan.msc.modules.reporter.g.d(U_.b, "deActive runtime");
                        if (!U_.f.d()) {
                            com.meituan.msc.modules.reporter.g.e(U_.b, "cannot be reused by state");
                            U_.b(false, com.meituan.msc.modules.engine.p.a(com.meituan.msc.modules.engine.p.LOAD_ERROR));
                        } else {
                            byte b = (!z || U_.f.g()) ? (byte) 0 : (byte) 1;
                            if (!U_.w) {
                                b = 0;
                            }
                            Object[] objArr4 = {Byte.valueOf(b)};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.engine.h.a;
                            if (PatchProxy.isSupport(objArr4, U_, changeQuickRedirect4, false, "753ad29bb1a68fa1a1bd73d8dc064a4a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, U_, changeQuickRedirect4, false, "753ad29bb1a68fa1a1bd73d8dc064a4a");
                            } else if (!U_.x && b != 0) {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.engine.h.a;
                                if (PatchProxy.isSupport(objArr5, U_, changeQuickRedirect5, false, "8faaf7bf6adff6509d57f2c69ddc7245", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, U_, changeQuickRedirect5, false, "8faaf7bf6adff6509d57f2c69ddc7245");
                                } else if (U_.d != null) {
                                    com.meituan.msc.modules.reporter.g.d(U_.b, "[MSC][KeepAlive]start:", U_.d.b);
                                    com.meituan.msc.modules.engine.q.b(U_.d);
                                    final long h = com.meituan.msc.common.config.b.h();
                                    U_.K.postDelayed(new Runnable() { // from class: com.meituan.msc.modules.engine.h.4
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z2 = false;
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9233815980d8a6b7acf419c4766b0f93", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9233815980d8a6b7acf419c4766b0f93");
                                                return;
                                            }
                                            com.meituan.msc.modules.reporter.g.d(U_.b, "[MSC][KeepAlive]end:", U_.d.b);
                                            com.meituan.msc.modules.reporter.g.d(U_.b, "normal destroy app engine by keep alive time out: ", Long.valueOf(h / 1000));
                                            aw.b("保活时间到，销毁引擎：" + U_.a(), new Object[0]);
                                            h hVar = U_;
                                            com.meituan.msc.modules.update.a aVar = U_.s;
                                            Object[] objArr7 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect7 = com.meituan.msc.modules.update.a.a;
                                            if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "ee8cbf9270128560b23bccebbc1a6f82", RobustBitConfig.DEFAULT_VALUE)) {
                                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "ee8cbf9270128560b23bccebbc1a6f82")).booleanValue();
                                            } else if (aVar.b != null) {
                                                z2 = aVar.b.optBoolean("preloadAfterKilled", false);
                                            }
                                            hVar.b(z2, p.a(p.KEEP_ALIVE_TIME_EXCEED));
                                        }
                                    }, h);
                                    com.meituan.msc.common.framework.c.a().d.clear();
                                    if (U_.f != null) {
                                        com.meituan.msc.modules.apploader.e eVar = U_.f;
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.modules.apploader.e.a;
                                        if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "1b9db5f176f6abd1fcad3e24a12bd323", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "1b9db5f176f6abd1fcad3e24a12bd323");
                                        } else if (eVar.h != null) {
                                            eVar.h.a(eVar.U_());
                                        }
                                        U_.f.U_().i = com.meituan.msc.modules.engine.r.KEEP_ALIVE;
                                        U_.f.U_().H = com.meituan.msc.modules.engine.s.KEEP_ALIVE;
                                    }
                                }
                            } else {
                                com.meituan.msc.modules.reporter.g.d(U_.b, "normal destroy app engine and keep alive not allowed");
                                U_.a(com.meituan.msc.common.config.b.n(), com.meituan.msc.modules.engine.p.a(com.meituan.msc.modules.engine.p.NORMAL));
                            }
                        }
                    }
                }
            }
        }
        this.b.remove(lVar);
        if (this.c == null || this.c != lVar) {
            return;
        }
        U_().a(new com.meituan.msc.modules.manager.f("msc_event_container_destroyed", lVar));
        a((p) null, "onContainerDestroy");
        a("find next resumed container after current ContainerDestroy ");
    }

    @MSCMethod
    public void pageNotFoundCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be87b9844905ec8dd3a9ac95da5b9327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be87b9844905ec8dd3a9ac95da5b9327");
            return;
        }
        com.meituan.msc.modules.page.c h = h();
        if (h != null) {
            h.a();
        }
    }

    @Override // com.meituan.msc.modules.container.q
    public final int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "555ba742e5554b03efffc201cbe35bfa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "555ba742e5554b03efffc201cbe35bfa")).intValue() : this.d.get();
    }

    @Override // com.meituan.msc.modules.manager.k
    public final boolean a_(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f768c88330675ee1a59af111729254cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f768c88330675ee1a59af111729254cb")).booleanValue();
        }
        com.meituan.msc.modules.exception.c cVar = U_().q;
        String format = String.format("cannot find submodule with name '%s' in PageManger for method %s", str, str2);
        Object[] objArr2 = {format};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.exception.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f809752753889205099dfe9acc15b3d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f809752753889205099dfe9acc15b3d6");
        } else {
            com.meituan.msc.modules.exception.b.d();
            com.meituan.msc.modules.reporter.g.a(null, null, format);
        }
        return true;
    }

    @Override // com.meituan.msc.modules.container.q
    @Nullable
    public final p e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac028bdbf5b883e53342c62f6fa71af", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac028bdbf5b883e53342c62f6fa71af");
        }
        if (i == 0 || i == -1) {
            return null;
        }
        p pVar = this.c;
        if (pVar == null || pVar.t() == null || !pVar.t().b(i)) {
            for (p pVar2 : this.b) {
                com.meituan.msc.modules.page.c t = pVar2.t();
                if (t != null && t.b(i)) {
                    if (this.c == null && pVar2.M()) {
                        a(pVar2, "getContainerDelegateByPageId");
                    }
                    return pVar2;
                }
            }
            return null;
        }
        return pVar;
    }
}
