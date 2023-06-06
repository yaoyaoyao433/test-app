package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import com.meituan.msc.common.utils.al;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.modules.container.v;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f extends com.meituan.msc.common.aov_task.task.a<List<PackageInfoWrapper>> {
    public static ChangeQuickRedirect d;
    private final com.meituan.msc.modules.engine.h e;
    private int f;
    private boolean g;

    @Override // com.meituan.msc.common.aov_task.task.b, com.meituan.msc.common.aov_task.task.c
    public final void a(com.meituan.msc.common.aov_task.context.b bVar) {
    }

    public static /* synthetic */ boolean b(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "31134167d0e720c271624c21a10f92e3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "31134167d0e720c271624c21a10f92e3")).booleanValue() : fVar.e.b().i() <= 1;
    }

    public static /* synthetic */ int d(f fVar) {
        int i = fVar.f;
        fVar.f = i + 1;
        return i;
    }

    public f(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("DownLoadBuzPkgTask");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d7e8615a80f08b48deff0a9a24e731", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d7e8615a80f08b48deff0a9a24e731");
            return;
        }
        this.g = false;
        this.e = hVar;
    }

    @Override // com.meituan.msc.common.aov_task.task.a
    public final com.meituan.msc.common.support.java.util.concurrent.a<List<PackageInfoWrapper>> b(final com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa70ed65242e7b60e81cdc05a05972f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa70ed65242e7b60e81cdc05a05972f");
        }
        if (!MSCHornRollbackConfig.d().c().isRollbackPageNotFoundStrategy1) {
            if (!this.e.B) {
                this.e.B = true;
            } else {
                this.e.C = true;
            }
        }
        com.meituan.msc.common.aov_task.task.c<?> b = aVar.b(m.class);
        final String str = b != null ? (String) aVar.a((m) b) : null;
        final com.meituan.msc.common.support.java.util.concurrent.a<List<PackageInfoWrapper>> aVar2 = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        ((com.meituan.msc.modules.update.c) this.e.c(com.meituan.msc.modules.update.c.class)).a(str, new com.meituan.msc.modules.update.i() { // from class: com.meituan.msc.modules.apploader.launchtasks.f.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.update.i
            public final void a(PackageInfoWrapper packageInfoWrapper) {
                Object[] objArr2 = {packageInfoWrapper};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8a70f7ec90486bff077b33002186203", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8a70f7ec90486bff077b33002186203");
                } else if (((com.meituan.msc.modules.apploader.a) f.this.e.c(com.meituan.msc.modules.apploader.a.class)).c() && packageInfoWrapper.isBasePackage()) {
                    com.meituan.msc.common.utils.m.a(packageInfoWrapper.getServiceFile());
                } else if (packageInfoWrapper.isMainPackage()) {
                    a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f76c86f52532c359eb5dc5941b278bc0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f76c86f52532c359eb5dc5941b278bc0");
                    } else if (!MSCHornRollbackConfig.d().c().isRollbackPageNotFoundStrategy1) {
                        if (f.this.e.C) {
                            com.meituan.msc.modules.reporter.g.d("DownLoadBuzPkgTask@" + Integer.toHexString(hashCode()), "forbid re fetch metaInfo");
                            return;
                        }
                        String b2 = am.b(str);
                        if (!f.b(f.this) || !q.a(f.this.e, b2)) {
                            com.meituan.msc.modules.reporter.g.d("DownLoadBuzPkgTask@" + Integer.toHexString(hashCode()), "not need re fetch", Boolean.valueOf(f.b(f.this)), b2);
                            f.this.g = false;
                        } else if (f.this.e.r.h != null) {
                            boolean isFromCache = f.this.e.r.h.isFromCache();
                            if (isFromCache && f.this.f < 3) {
                                com.meituan.msc.modules.reporter.g.d("DownLoadBuzPkgTask@" + Integer.toHexString(hashCode()), "page not found trigger refetch", "targetPath:", b2, "resetCount:", Integer.valueOf(f.this.f));
                                f.d(f.this);
                                f.this.g = true;
                                aVar.a().d(g.class).a(new com.meituan.msc.common.support.java.util.function.d<com.meituan.msc.common.aov_task.f, Object>() { // from class: com.meituan.msc.modules.apploader.launchtasks.f.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.msc.common.support.java.util.function.d
                                    public final /* synthetic */ Object a(com.meituan.msc.common.aov_task.f fVar) {
                                        Object[] objArr4 = {fVar};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e7a4dc040867f69fc64ed4d2ba66e13c", RobustBitConfig.DEFAULT_VALUE)) {
                                            return PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e7a4dc040867f69fc64ed4d2ba66e13c");
                                        }
                                        aVar.a().b();
                                        return null;
                                    }
                                });
                                v.a(f.this.e, b2, 1);
                                return;
                            }
                            com.meituan.msc.modules.reporter.g.d("DownLoadBuzPkgTask@" + Integer.toHexString(hashCode()), "page not found but don't reset", "isMetaInfoFromCache:", Boolean.valueOf(isFromCache), "resetCount:", Integer.valueOf(f.this.f));
                            f.this.g = false;
                        }
                    } else {
                        com.meituan.msc.modules.reporter.g.d("DownLoadBuzPkgTask@" + Integer.toHexString(hashCode()), "isRollbackPageNotFoundStrategy true");
                    }
                }
            }

            private boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6f0f3d89e544e1c0083214f4a4062f8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6f0f3d89e544e1c0083214f4a4062f8")).booleanValue();
                }
                try {
                    f.this.e.s.d();
                    ((com.meituan.msc.modules.msi.a) f.this.e.c(com.meituan.msc.modules.msi.a.class)).b();
                    return true;
                } catch (Exception e) {
                    a("applyConfigError", e);
                    com.meituan.msc.modules.reporter.g.b("DownLoadBuzPkgTask@", e, "onPackagePrepared");
                    return false;
                }
            }

            @Override // com.meituan.msc.modules.update.i
            public final void a(List<PackageInfoWrapper> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6036c21f852bedd72ef28a28172f1d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6036c21f852bedd72ef28a28172f1d6");
                    return;
                }
                if (!f.this.g) {
                    ((com.meituan.msc.modules.engine.c) f.this.e.c(com.meituan.msc.modules.engine.c.class)).a(!f.this.g);
                    f.this.e.a(new com.meituan.msc.modules.manager.f("AllPackagesReadyForLaunch", list));
                    al a2 = al.a();
                    com.meituan.msc.modules.update.f fVar = f.this.e.r;
                    Object[] objArr3 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect3 = al.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f30177f0eac7285e7980463acb4e77b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f30177f0eac7285e7980463acb4e77b9");
                    } else {
                        a2.b = fVar.a(SocialConstants.TYPE_REQUEST);
                        a2.c = fVar.a("connectSocket");
                        a2.d = fVar.a("uploadFile");
                        a2.e = fVar.a("downloadFile");
                    }
                }
                if (MSCHornRollbackConfig.d().c().isRollbackInitConfigChange ? true : a()) {
                    aVar2.d((com.meituan.msc.common.support.java.util.concurrent.a) list);
                }
            }

            @Override // com.meituan.msc.modules.update.i
            public final void a(String str2, Exception exc) {
                Object[] objArr2 = {str2, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5efade7c7e59462121cf0b45e5d14418", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5efade7c7e59462121cf0b45e5d14418");
                } else {
                    aVar2.b((Throwable) new com.meituan.msc.modules.apploader.events.a(2002, str2, exc));
                }
            }
        });
        return aVar2;
    }
}
