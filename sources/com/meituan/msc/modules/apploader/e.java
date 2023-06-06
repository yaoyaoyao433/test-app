package com.meituan.msc.modules.apploader;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.msc.common.aov_task.f;
import com.meituan.msc.common.executor.a;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.apploader.launchtasks.i;
import com.meituan.msc.modules.apploader.launchtasks.j;
import com.meituan.msc.modules.apploader.launchtasks.m;
import com.meituan.msc.modules.apploader.launchtasks.n;
import com.meituan.msc.modules.container.b;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.s;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.service.IServiceEngine;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@ModuleName(name = "AppLoader")
/* loaded from: classes3.dex */
public final class e extends k implements a {
    public static ChangeQuickRedirect a;
    public final String b;
    protected final Context c;
    protected volatile boolean d;
    public volatile String e;
    public volatile String f;
    public volatile boolean g;
    public b h;
    public d i;
    private volatile boolean j;
    private volatile boolean k;
    private volatile boolean l;
    private volatile boolean m;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26749bae8a501ef51aed1d9780f606be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26749bae8a501ef51aed1d9780f606be");
            return;
        }
        this.b = "MSCAppLoader@" + Integer.toHexString(hashCode());
        this.j = false;
        this.c = context.getApplicationContext();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09191d56929099083b32b3ff96a8b74b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09191d56929099083b32b3ff96a8b74b");
            return;
        }
        this.i = new d();
        this.i.f = new com.meituan.msc.common.aov_task.a() { // from class: com.meituan.msc.modules.apploader.e.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e1 -> B:28:0x00e4). Please submit an issue!!! */
            @Override // com.meituan.msc.common.aov_task.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Exception r26, com.meituan.msc.common.aov_task.task.c<?> r27, com.meituan.msc.common.aov_task.f r28) {
                /*
                    Method dump skipped, instructions count: 283
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.apploader.e.AnonymousClass1.a(java.lang.Exception, com.meituan.msc.common.aov_task.task.c, com.meituan.msc.common.aov_task.f):void");
            }
        };
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(com.meituan.msc.modules.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d16bf75bc8b46c23f3fb33bd8cc446c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d16bf75bc8b46c23f3fb33bd8cc446c");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.b, this.i, "onAppStart", eVar.b);
        if (this.g) {
            String str = this.b;
            com.meituan.msc.modules.reporter.g.a(str, "already used: " + s().b);
            return;
        }
        this.g = true;
        com.meituan.msc.common.framework.d.a(eVar.b, this);
        v();
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96b3d465dd01fba4ac52a2b01aabc1d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96b3d465dd01fba4ac52a2b01aabc1d4");
            return;
        }
        super.a(hVar);
        com.meituan.msc.modules.reporter.g.d(this.b, "onRuntimeAttached", hVar);
        c cVar = new c();
        h U_ = U_();
        Class[] clsArr = new Class[0];
        Object[] objArr2 = {cVar, clsArr};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, U_, changeQuickRedirect2, false, "6688d49bd4d9682cd61a716449c56dc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, U_, changeQuickRedirect2, false, "6688d49bd4d9682cd61a716449c56dc1");
        } else {
            U_.e.a(cVar, clsArr);
        }
        com.meituan.msc.modules.apploader.launchtasks.b bVar = new com.meituan.msc.modules.apploader.launchtasks.b(U_());
        com.meituan.msc.modules.apploader.launchtasks.e eVar = new com.meituan.msc.modules.apploader.launchtasks.e(U_());
        i iVar = new i(U_());
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) bVar, new com.meituan.msc.common.aov_task.task.c[0]);
        if (MSCHornRollbackConfig.d().c().isRollbackCreateRenderChange) {
            a(bVar);
        }
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) eVar, new com.meituan.msc.common.aov_task.task.c[0]);
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) iVar, bVar, eVar);
    }

    private void a(com.meituan.msc.common.aov_task.task.c<IServiceEngine> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d879d985ae62899f422f2884959ca5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d879d985ae62899f422f2884959ca5b");
            return;
        }
        a(cVar);
        b(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [com.meituan.msc.common.support.java.util.function.d] */
    public final com.meituan.msc.common.support.java.util.concurrent.a<PackageInfoWrapper> a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46e2736326b674ce9a5af7e84719f51", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46e2736326b674ce9a5af7e84719f51");
        }
        com.meituan.msc.modules.reporter.g.d(this.b, "injectBasePackage", str, str2);
        if (DebugHelper.a()) {
            com.meituan.msc.modules.reporter.g.b(str, "加载基础库包，依赖关系图:", this.i.d());
        }
        this.i.a(str);
        d(str2);
        if (!MSCHornRollbackConfig.d().c().isRollbackCreateRenderChange) {
            a(this.i.c(com.meituan.msc.modules.apploader.launchtasks.b.class));
        }
        com.meituan.msc.common.aov_task.task.c c = this.i.c(i.class);
        com.meituan.msc.common.support.java.util.concurrent.a<com.meituan.msc.common.aov_task.f> b = this.i.b();
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        return b.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3fe6b8df052583757e0ebf66c0a3bee2", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.function.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3fe6b8df052583757e0ebf66c0a3bee2") : new f(c));
    }

    public static /* synthetic */ PackageInfoWrapper a(com.meituan.msc.common.aov_task.task.c cVar, com.meituan.msc.common.aov_task.f fVar) {
        Object[] objArr = {cVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ec3dbbfef0f2ea2285d5a9a71d41d4d", RobustBitConfig.DEFAULT_VALUE) ? (PackageInfoWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ec3dbbfef0f2ea2285d5a9a71d41d4d") : (PackageInfoWrapper) fVar.a(cVar);
    }

    public com.meituan.msc.common.support.java.util.concurrent.a<Void> a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f7cb17d3385ffdca4dd4dd1fa5f74f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f7cb17d3385ffdca4dd4dd1fa5f74f");
        }
        this.i.a(str);
        m mVar = new m(str2);
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) mVar, new com.meituan.msc.common.aov_task.task.c[0]);
        com.meituan.msc.modules.apploader.launchtasks.f fVar = new com.meituan.msc.modules.apploader.launchtasks.f(U_());
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) fVar, mVar, v());
        a(mVar, fVar);
        j jVar = new j(U_());
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) jVar, fVar, this.i.c(com.meituan.msc.modules.apploader.launchtasks.b.class));
        if (z) {
            this.i.a((com.meituan.msc.common.aov_task.task.c<?>) new n(U_(), true), mVar, fVar, this.i.b(com.meituan.msc.modules.apploader.launchtasks.e.class));
        }
        if (DebugHelper.a()) {
            com.meituan.msc.modules.reporter.g.b(this.b, "preloadAppPackage，依赖关系图:", this.i.d());
        }
        this.i.a(str);
        return this.i.b().a(g.a(jVar));
    }

    public static /* synthetic */ Void a(j jVar, com.meituan.msc.common.aov_task.f fVar) {
        Object[] objArr = {jVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddd91daa8668db165553be74b5abbeb6", RobustBitConfig.DEFAULT_VALUE) ? (Void) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddd91daa8668db165553be74b5abbeb6") : (Void) fVar.a(jVar);
    }

    private void a(com.meituan.msc.common.aov_task.task.c<String> cVar, com.meituan.msc.modules.apploader.launchtasks.f fVar) {
        Object[] objArr = {cVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f93b331f75b0a02262706527e267acb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f93b331f75b0a02262706527e267acb");
            return;
        }
        com.meituan.msc.common.aov_task.task.c<?> c = this.i.c(com.meituan.msc.modules.apploader.launchtasks.b.class);
        a(c, cVar, fVar);
        b(c, cVar, fVar);
    }

    public void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98acaf16008f476419138ef51fc073e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98acaf16008f476419138ef51fc073e0");
        } else if (TextUtils.isEmpty(str) || MSCEnvHelper.getEnvInfo().isProdEnv()) {
        } else {
            com.meituan.msc.common.aov_task.task.c c = this.i.c(com.meituan.msc.modules.apploader.launchtasks.e.class);
            if (c instanceof com.meituan.msc.modules.apploader.launchtasks.e) {
                ((com.meituan.msc.modules.apploader.launchtasks.e) c).f = str;
            }
        }
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db66dba659a927e67d72adca2e277ae6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db66dba659a927e67d72adca2e277ae6")).intValue() : hashCode();
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean c() {
        return this.k;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean d() {
        return (this.l || this.m) ? false : true;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914728be322aee4bf328c98d6966f653", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914728be322aee4bf328c98d6966f653")).booleanValue() : this.i.a(i.class).equals(com.meituan.msc.common.aov_task.b.SUCCEED);
    }

    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bedccfac56fad7b01b6a7f053d943adb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bedccfac56fad7b01b6a7f053d943adb")).booleanValue() : this.i.a(j.class).equals(com.meituan.msc.common.aov_task.b.SUCCEED);
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final void a(String str, com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6680f88e278fc5b2d69ffa5611b04e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6680f88e278fc5b2d69ffa5611b04e9f");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.b, "launchPage", this.i.m, str, cVar);
        m mVar = new m(str);
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) mVar, new com.meituan.msc.common.aov_task.task.c[0]);
        com.meituan.msc.modules.apploader.launchtasks.f fVar = new com.meituan.msc.modules.apploader.launchtasks.f(U_());
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) fVar, mVar, v());
        a(mVar, fVar);
        com.meituan.msc.modules.apploader.launchtasks.k kVar = new com.meituan.msc.modules.apploader.launchtasks.k(U_());
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) kVar, this.i.b(com.meituan.msc.modules.apploader.launchtasks.e.class), fVar);
        j jVar = new j(U_());
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) jVar, fVar, this.i.c(com.meituan.msc.modules.apploader.launchtasks.b.class));
        n nVar = new n(U_());
        this.i.a((com.meituan.msc.common.aov_task.task.c<?>) nVar, mVar, fVar, this.i.b(com.meituan.msc.modules.apploader.launchtasks.e.class));
        this.i.a(cVar, this.i.c(i.class), this.i.c(com.meituan.msc.modules.apploader.launchtasks.d.class), this.i.c(com.meituan.msc.modules.apploader.launchtasks.c.class), jVar, kVar, nVar);
        if (DebugHelper.a()) {
            com.meituan.msc.modules.reporter.g.b("Launch", "launchPage，依赖关系图:", this.i.d());
        }
        this.i.a("Launch");
        final d dVar = this.i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.aov_task.f.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8e3c36cd57fc0b0f24c0ff8d4b7eb4a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8e3c36cd57fc0b0f24c0ff8d4b7eb4a0");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (dVar.j == null) {
                dVar.j = com.sankuai.android.jarvis.c.b("MSC-TaskManager");
            }
            dVar.j.submit(new a.b(new Runnable() { // from class: com.meituan.msc.common.aov_task.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8168944ca015cb05ed74bdf27c7a47a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8168944ca015cb05ed74bdf27c7a47a4");
                    } else {
                        dVar.a(new com.meituan.msc.common.aov_task.task.c[0]);
                    }
                }
            }));
        } else {
            dVar.a(new com.meituan.msc.common.aov_task.task.c[0]);
        }
    }

    private com.meituan.msc.common.aov_task.task.c<AppMetaInfoWrapper> v() {
        com.meituan.msc.common.aov_task.task.c<AppMetaInfoWrapper> b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0fa7a7afa4df18b1fb771146377072", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.aov_task.task.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0fa7a7afa4df18b1fb771146377072");
        }
        synchronized (this) {
            b = this.i.b(com.meituan.msc.modules.apploader.launchtasks.g.class);
            if (b == null) {
                com.meituan.msc.modules.reporter.g.d(this.b, "addFetchMetaInfoTaskIfNotExist fetchMetaInfoTask is null");
                b = new com.meituan.msc.modules.apploader.launchtasks.g(U_());
                this.i.a((com.meituan.msc.common.aov_task.task.c<?>) b, new com.meituan.msc.common.aov_task.task.c[0]);
            }
        }
        return b;
    }

    private void a(com.meituan.msc.common.aov_task.task.c<?>... cVarArr) {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03912e326e1d952be205013a10e63f16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03912e326e1d952be205013a10e63f16");
            return;
        }
        synchronized (this) {
            if (this.i.b(com.meituan.msc.modules.apploader.launchtasks.d.class) == null) {
                com.meituan.msc.modules.reporter.g.d(this.b, "addCreateRNRenderTaskIfNotExist createRNRenderTask is null");
                this.i.a((com.meituan.msc.common.aov_task.task.c<?>) new com.meituan.msc.modules.apploader.launchtasks.d(U_()), cVarArr);
            }
        }
    }

    private void b(com.meituan.msc.common.aov_task.task.c<?>... cVarArr) {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a5e785a52b22fee21e7f0f0f1b2ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a5e785a52b22fee21e7f0f0f1b2ba4");
            return;
        }
        synchronized (this) {
            if (this.i.b(com.meituan.msc.modules.apploader.launchtasks.c.class) == null) {
                com.meituan.msc.modules.reporter.g.d(this.b, "addCreateMSCRenderTaskIfNotExist createMSCRenderTask is null");
                this.i.a((com.meituan.msc.common.aov_task.task.c<?>) new com.meituan.msc.modules.apploader.launchtasks.c(U_()), cVarArr);
            }
        }
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c24347a321c7cd54c448ea9714871011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c24347a321c7cd54c448ea9714871011");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.b, LaunchMode.LAUNCH_MODE_PRELOAD, str);
        a("Launch", str, false);
    }

    @Override // com.meituan.msc.modules.manager.k, com.meituan.msc.modules.manager.c
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38d3b549584cc24903d92bdbab5bca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38d3b549584cc24903d92bdbab5bca3");
        } else if (this.m) {
            String str = this.b;
            com.meituan.msc.modules.reporter.g.e(str, "already destroyed: " + U_());
        } else {
            this.m = true;
            com.meituan.msc.modules.reporter.g.d(this.b, "engine destroy: ", U_());
        }
    }

    @MSCMethod
    public final void onRuntimeLaunch(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad2d01156b60440eba0953ce3afc1b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad2d01156b60440eba0953ce3afc1b7");
        } else {
            com.meituan.msc.common.framework.c.a().c.a(U_().a());
        }
    }

    public void a(com.meituan.msc.modules.apploader.events.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce81d79d29047fa9284958faffac6709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce81d79d29047fa9284958faffac6709");
        } else if (aVar == null) {
        } else {
            this.l = true;
            com.meituan.msc.modules.engine.j jVar = U_().p;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.engine.j.d;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "fa02d80b38c9bd72d4bd3ae1705365c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "fa02d80b38c9bd72d4bd3ae1705365c0");
            } else {
                jVar.a("msc.app.load.fail").a("errorMessage", aVar != null ? aVar.getMessage() : null).a("errorCode", Integer.valueOf(aVar != null ? aVar.b : -1)).c();
            }
            U_().a(new com.meituan.msc.modules.manager.f("LoadFailed", aVar));
        }
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean a() {
        return this.g;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b25912c69e8b7fceeb7e8fc24f4e61f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b25912c69e8b7fceeb7e8fc24f4e61f");
        }
        StringBuilder sb = new StringBuilder("AppEngine{");
        sb.append(this.q != null ? this.q.b : null);
        sb.append(" @");
        sb.append(f());
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        return sb.toString();
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final void a(boolean z) {
        this.d = true;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean g() {
        return this.d;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final void b(String str) {
        this.e = str;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0127f1a3289ddcaf05c92322bd7361", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0127f1a3289ddcaf05c92322bd7361");
        }
        if (MSCEnvHelper.getEnvInfo().isProdEnv()) {
            return null;
        }
        return this.e;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final void b(boolean z) {
        this.j = z;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean i() {
        return this.j;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final void c(String str) {
        this.f = str;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final String j() {
        return this.f;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final void a(b bVar) {
        this.h = bVar;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f05e8339f44bf5fc3782d8ec2593c06a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f05e8339f44bf5fc3782d8ec2593c06a");
        } else if (!this.k) {
            this.k = true;
            com.meituan.msc.modules.reporter.g.b(this.b, "setLaunched", U_().a());
            if (this.h != null) {
                U_();
            }
        }
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209891aaa4d57d6558c530562fd41e81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209891aaa4d57d6558c530562fd41e81")).booleanValue();
        }
        com.meituan.msc.common.aov_task.task.c<?> b = this.i.b(com.meituan.msc.modules.apploader.launchtasks.b.class);
        if (b == null) {
            return false;
        }
        return this.i.b(b).equals(com.meituan.msc.common.aov_task.b.SUCCEED);
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab404bb918a1daa526d17c5f23ff8ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab404bb918a1daa526d17c5f23ff8ae")).booleanValue();
        }
        com.meituan.msc.common.aov_task.task.c<?> b = this.i.b(com.meituan.msc.modules.apploader.launchtasks.g.class);
        if (b == null) {
            com.meituan.msc.modules.reporter.g.e(toString(), "fetchMetaInfoTask is null");
            return false;
        }
        try {
            return this.i.b(b).equals(com.meituan.msc.common.aov_task.b.SUCCEED);
        } catch (com.meituan.msc.common.aov_task.exception.e e) {
            com.meituan.msc.modules.reporter.g.a(toString(), "fetchMetaInfoTask getExecuteStatus error");
            if (MSCHornRollbackConfig.d().c().needCatchTaskNonexistentException) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final <TaskResult> List<com.meituan.msc.common.aov_task.task.c<TaskResult>> a(@NonNull Class<? extends com.meituan.msc.common.aov_task.task.c<TaskResult>> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985977ebb3c5311ba68bdad497ecea3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985977ebb3c5311ba68bdad497ecea3e");
        }
        d dVar = this.i;
        Object[] objArr2 = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.aov_task.f.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "fbac1ef5493fa00d3a54f96e69de81da", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "fbac1ef5493fa00d3a54f96e69de81da");
        }
        ArrayList arrayList = new ArrayList();
        for (com.meituan.msc.common.aov_task.task.c<?> cVar : dVar.a()) {
            if (cVar.getClass().isAssignableFrom(cls)) {
                arrayList.add(cVar);
            }
        }
        for (f.b bVar : dVar.h) {
            if (bVar instanceof f.a) {
                f.a aVar = (f.a) bVar;
                if (aVar.b.getClass().equals(cls)) {
                    arrayList.add(aVar.b);
                }
            }
        }
        return arrayList;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final s m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7429032c512686522d6e71fa3844d46", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7429032c512686522d6e71fa3844d46");
        }
        s sVar = U_().H;
        if (sVar == s.BIZ_PRELOADING_FROM_NEW) {
            if (w()) {
                return s.BIZ_PRELOADING_FROM_NEW;
            }
            return s.BIZ_PRELOAD_FROM_NEW;
        } else if (sVar == s.BIZ_PRELOADING_FROM_BASE) {
            if (w()) {
                return s.BIZ_PRELOADING_FROM_BASE;
            }
            return s.BIZ_PRELOAD_FROM_BASE;
        } else if (sVar == s.BASE_PRELOADING) {
            if (x()) {
                return s.BASE_PRELOADING;
            }
            return s.BASE_PRELOAD;
        } else {
            return sVar;
        }
    }

    private boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83c3ee98b4284621cae5dd81be774cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83c3ee98b4284621cae5dd81be774cf")).booleanValue();
        }
        if (x()) {
            return true;
        }
        j jVar = (j) this.i.b(j.class);
        if (jVar == null || this.i.b(jVar) == com.meituan.msc.common.aov_task.b.SUCCEED) {
            n nVar = (n) this.i.b(n.class);
            return (nVar == null || this.i.b(nVar) == com.meituan.msc.common.aov_task.b.SUCCEED) ? false : true;
        }
        return true;
    }

    private boolean x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2379de1e536cc840bf278bbd7ffb902d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2379de1e536cc840bf278bbd7ffb902d")).booleanValue();
        }
        i iVar = (i) this.i.b(i.class);
        if (iVar == null || this.i.b(iVar) == com.meituan.msc.common.aov_task.b.SUCCEED) {
            com.meituan.msc.modules.apploader.launchtasks.c cVar = (com.meituan.msc.modules.apploader.launchtasks.c) this.i.b(com.meituan.msc.modules.apploader.launchtasks.c.class);
            if (cVar == null || this.i.b(cVar) == com.meituan.msc.common.aov_task.b.SUCCEED) {
                com.meituan.msc.modules.apploader.launchtasks.d dVar = (com.meituan.msc.modules.apploader.launchtasks.d) this.i.b(com.meituan.msc.modules.apploader.launchtasks.d.class);
                return (dVar == null || this.i.b(dVar) == com.meituan.msc.common.aov_task.b.SUCCEED) ? false : true;
            }
            return true;
        }
        return true;
    }

    @Override // com.meituan.msc.modules.apploader.a
    public final boolean K_() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6f3903428d012b92dfd2f86d0dfede7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6f3903428d012b92dfd2f86d0dfede7")).booleanValue();
        }
        if (this.k && this.q != null && !this.q.d) {
            com.meituan.msc.common.aov_task.task.c<?> b = this.i.b(b.C0462b.class);
            com.meituan.msc.modules.reporter.g.d("isFirstPageInLaunchStatus", "task found", b);
            if (b != null) {
                com.meituan.msc.common.aov_task.b b2 = this.i.b(b);
                b.C0462b c0462b = (b.C0462b) b;
                if (!c0462b.h) {
                    if (b2 == com.meituan.msc.common.aov_task.b.PENDING) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = b.C0462b.f;
                        if (PatchProxy.isSupport(objArr2, c0462b, changeQuickRedirect2, false, "613b8615d24c5792a28d40d46f07fc59", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, c0462b, changeQuickRedirect2, false, "613b8615d24c5792a28d40d46f07fc59")).booleanValue();
                        } else {
                            z = SystemClock.elapsedRealtime() - c0462b.i > 1000;
                        }
                        this.q.c.p.a("msc.launch.multi.skip").a("isAdded1SecondsAgo", Boolean.valueOf(z)).b();
                        return !z;
                    }
                }
            }
        }
        return false;
    }
}
