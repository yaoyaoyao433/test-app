package com.meituan.msc.modules.preload;

import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final e c = new e();
    public String b;
    private volatile boolean d;

    public static e a() {
        return c;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dfeddc54ab37c1a9dcb6fdb928eeac8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dfeddc54ab37c1a9dcb6fdb928eeac8");
            return;
        }
        this.b = "no trigger preload base";
        this.d = false;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2034565c75f01581e34f19e89d9c342f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2034565c75f01581e34f19e89d9c342f");
        } else if (this.d) {
        } else {
            synchronized (this) {
                if (this.d) {
                    return;
                }
                d();
                this.d = true;
            }
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "679e350488ad55a8c0795e496d9807cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "679e350488ad55a8c0795e496d9807cc");
        } else if (!MSCHornPreloadConfig.h()) {
            c.b = "enable preload is off";
            com.meituan.msc.modules.reporter.g.d("Preload", "enablePreload is off");
        } else {
            q.a();
            q.a(new c(this));
            g.b.a();
            g.b.b();
            com.meituan.msc.modules.update.pkg.d.a().c();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6caabc5758a2f4e08cba7ce12475fd81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6caabc5758a2f4e08cba7ce12475fd81");
            return;
        }
        MSCEnvHelper.ensureFullInited();
        b();
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7b2a86e5004422f2b4f9d0a1a458ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7b2a86e5004422f2b4f9d0a1a458ae")).booleanValue();
        }
        if (MSCEnvHelper.getContext() != null) {
            return !ProcessUtils.isMainProcess(MSCEnvHelper.getContext());
        }
        com.meituan.msc.modules.reporter.g.d("PreloadManager", "isMainProcess context is null");
        return true;
    }

    @Deprecated
    public final void a(String str, final com.meituan.msc.common.framework.a<com.meituan.msc.modules.apploader.a> aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c3b1cdc3904b05c574adf6e3f3cd72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c3b1cdc3904b05c574adf6e3f3cd72");
        } else if (e()) {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "only main process trigger bizPreload");
        } else {
            Object[] objArr2 = {str, null, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1618079fe880ab6e98743bf771387272", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1618079fe880ab6e98743bf771387272");
            } else if (e()) {
                com.meituan.msc.modules.reporter.g.d("PreloadBiz", "only main process trigger bizPreload");
            } else {
                final g gVar = g.b;
                Object[] objArr3 = {str, null, null, null, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = g.a;
                if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "d1103315e773e9596f256c62ae765edb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "d1103315e773e9596f256c62ae765edb");
                } else if (gVar.c()) {
                    com.meituan.msc.modules.reporter.g.d("PreloadBiz", "only main process trigger bizPreload");
                } else {
                    com.meituan.msc.common.framework.a<h> aVar2 = new com.meituan.msc.common.framework.a<h>() { // from class: com.meituan.msc.modules.preload.g.5
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.common.framework.a
                        public final /* synthetic */ void a(h hVar) {
                            h hVar2 = hVar;
                            Object[] objArr4 = {hVar2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a130ba6ed0be74cc216a2df6f7b1afd1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a130ba6ed0be74cc216a2df6f7b1afd1");
                            } else if (aVar != null) {
                                aVar.a(hVar2.c(com.meituan.msc.modules.apploader.a.class));
                            }
                        }

                        @Override // com.meituan.msc.common.framework.a
                        public final void a(String str2, Exception exc) {
                            Object[] objArr4 = {str2, exc};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "522f994942efd2cb27b11ffa7fc24933", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "522f994942efd2cb27b11ffa7fc24933");
                            } else if (aVar != null) {
                                aVar.a(str2, exc);
                            }
                        }

                        @Override // com.meituan.msc.common.framework.a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0cd05a519b116d730d08caef21b46320", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0cd05a519b116d730d08caef21b46320");
                            } else if (aVar != null) {
                                aVar.a();
                            }
                        }
                    };
                    Object[] objArr4 = {str, null, null, null, aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                    if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "b22b1064c474cda0e5d8e5bfb073653b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "b22b1064c474cda0e5d8e5bfb073653b");
                    } else {
                        gVar.a(str, (String) null, false, (String) null, (String) null, aVar2);
                    }
                }
            }
        }
    }

    @Deprecated
    public final void a(String str, String str2, com.meituan.msc.common.framework.a<h> aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5034b8dd6127c416154ea3ce097051cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5034b8dd6127c416154ea3ce097051cc");
        } else {
            a(str, str2, aVar, false);
        }
    }

    @Deprecated
    public final void b(String str, com.meituan.msc.common.framework.a<h> aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40c9602f47f43d5aa5601e2094734f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40c9602f47f43d5aa5601e2094734f7");
        } else if (e()) {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "only main process trigger bizPreload");
        } else {
            a(str, null, aVar, false);
        }
    }

    @Deprecated
    private void a(String str, String str2, com.meituan.msc.common.framework.a<h> aVar, boolean z) {
        Object[] objArr = {str, str2, aVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a910b01ef333f5df04b2503bedef13b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a910b01ef333f5df04b2503bedef13b0");
        } else if (e()) {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "only main process trigger bizPreload");
        } else {
            g.b.a(str, str2, false, (String) null, (String) null, aVar);
        }
    }
}
