package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import com.meituan.msc.common.executor.a;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g extends com.meituan.msc.common.aov_task.task.a<AppMetaInfoWrapper> {
    public static ChangeQuickRedirect d;
    public com.meituan.msc.modules.engine.h e;
    private boolean f;

    public g(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("FetchMetaInfo");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b51a5712baa1c4ef977ae202f2377764", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b51a5712baa1c4ef977ae202f2377764");
        } else {
            this.e = hVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    @Override // com.meituan.msc.common.aov_task.task.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.msc.common.support.java.util.concurrent.a<com.meituan.msc.modules.update.bean.AppMetaInfoWrapper> b(com.meituan.msc.common.aov_task.context.a r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.msc.modules.apploader.launchtasks.g.d
            java.lang.String r10 = "35e261d378c8b36a174a6823d6824977"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r13
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r13, r9, r10)
            com.meituan.msc.common.support.java.util.concurrent.a r13 = (com.meituan.msc.common.support.java.util.concurrent.a) r13
            return r13
        L1e:
            com.meituan.msc.modules.engine.h r13 = r12.e
            com.meituan.msc.util.perf.PerfEventRecorder r13 = r13.o
            java.lang.String r1 = "fetch_meta_info"
            r13.a(r1)
            com.meituan.msc.modules.update.bean.LaunchPageParams r13 = new com.meituan.msc.modules.update.bean.LaunchPageParams
            r13.<init>()
            com.meituan.msc.modules.engine.h r1 = r12.e
            java.lang.String r1 = r1.a()
            r13.appId = r1
            com.meituan.msc.modules.engine.h r1 = r12.e
            java.lang.Class<com.meituan.msc.modules.apploader.a> r2 = com.meituan.msc.modules.apploader.a.class
            java.lang.Object r1 = r1.c(r2)
            com.meituan.msc.modules.apploader.a r1 = (com.meituan.msc.modules.apploader.a) r1
            java.lang.String r2 = r1.h()
            r13.checkUpdateUrl = r2
            boolean r1 = r1.i()
            if (r1 != 0) goto L96
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.modules.apploader.launchtasks.g.d
            java.lang.String r11 = "d85d339484b7219d7bb0ba66ce7d0c0f"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r1
            r3 = r12
            r4 = r10
            r6 = r11
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L68
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r12, r10, r9, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L91
        L68:
            com.meituan.msc.modules.engine.MSCHornRollbackConfig r1 = com.meituan.msc.modules.engine.MSCHornRollbackConfig.d()
            java.lang.Object r1 = r1.c()
            com.meituan.msc.modules.engine.MSCHornRollbackConfig$Config r1 = (com.meituan.msc.modules.engine.MSCHornRollbackConfig.Config) r1
            boolean r1 = r1.isRollbackPageNotFoundStrategy1
            if (r1 == 0) goto L78
            r1 = 0
            goto L91
        L78:
            com.meituan.msc.modules.engine.h r1 = r12.e
            com.meituan.msc.modules.update.f r1 = r1.r
            int r1 = r1.j
            if (r1 != r0) goto L82
        L80:
            r1 = 1
            goto L91
        L82:
            com.meituan.msc.modules.engine.h r1 = r12.e
            java.lang.String r1 = r1.a()
            boolean r1 = com.meituan.msc.modules.container.v.c(r1)
            if (r1 == 0) goto L8f
            goto L80
        L8f:
            boolean r1 = r12.f
        L91:
            if (r1 == 0) goto L94
            goto L96
        L94:
            r1 = 0
            goto L97
        L96:
            r1 = 1
        L97:
            r13.needForceUpdate = r1
            com.meituan.msc.modules.engine.h r1 = r12.e
            java.lang.Class<com.meituan.msc.modules.update.c> r2 = com.meituan.msc.modules.update.c.class
            java.lang.Object r1 = r1.c(r2)
            com.meituan.msc.modules.update.c r1 = (com.meituan.msc.modules.update.c) r1
            com.meituan.msc.common.support.java.util.concurrent.a r13 = r1.a(r13)
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msc.modules.apploader.launchtasks.h.a
            java.lang.String r10 = "36036b083e99b76a81c386eaa2934cb7"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto Lc4
            r1 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r1, r9, r0, r10)
            com.meituan.msc.common.support.java.util.function.d r0 = (com.meituan.msc.common.support.java.util.function.d) r0
            goto Lc9
        Lc4:
            com.meituan.msc.modules.apploader.launchtasks.h r0 = new com.meituan.msc.modules.apploader.launchtasks.h
            r0.<init>(r12)
        Lc9:
            com.meituan.msc.common.support.java.util.concurrent.a r13 = r13.a(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.apploader.launchtasks.g.b(com.meituan.msc.common.aov_task.context.a):com.meituan.msc.common.support.java.util.concurrent.a");
    }

    public static /* synthetic */ AppMetaInfoWrapper a(g gVar, AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {gVar, appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b76ffe098ec5abf8fa008f06f0c3969", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppMetaInfoWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b76ffe098ec5abf8fa008f06f0c3969");
        }
        if (!appMetaInfoWrapper.isFromCache()) {
            gVar.f = false;
        }
        gVar.e.a(new com.meituan.msc.modules.manager.f("AppPropUpdated"));
        if (appMetaInfoWrapper.isFromCache()) {
            final com.meituan.msc.modules.update.metainfo.b a = com.meituan.msc.modules.update.metainfo.b.a();
            final com.meituan.msc.modules.engine.h hVar = gVar.e;
            Object[] objArr2 = {hVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.update.metainfo.b.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "afed7c3683e1614e6bd7ab56ef92bcae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "afed7c3683e1614e6bd7ab56ef92bcae");
            } else {
                a.c.a(new Runnable() { // from class: com.meituan.msc.modules.update.metainfo.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8e2636906b27eb9964a1d6b19afa9dd6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8e2636906b27eb9964a1d6b19afa9dd6");
                        } else {
                            b.a(b.this, hVar);
                        }
                    }
                }, 1000L);
            }
        }
        gVar.e.o.b("fetch_meta_info");
        return appMetaInfoWrapper;
    }

    @Override // com.meituan.msc.common.aov_task.task.b, com.meituan.msc.common.aov_task.task.c
    public final void a(com.meituan.msc.common.aov_task.context.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb045f7e293d791cdaf19020bc1f850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb045f7e293d791cdaf19020bc1f850");
            return;
        }
        this.f = true;
        this.e.r.k = 1;
    }
}
