package com.meituan.msc.modules.preload;

import com.meituan.msc.common.utils.n;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.m;
import com.meituan.msc.modules.engine.o;
import com.meituan.msc.modules.page.render.webview.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends f implements com.meituan.msc.modules.apploader.b {
    public static ChangeQuickRedirect a;

    public c(e eVar) {
        super(eVar);
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e183b186cd7c492b432e00ac6e86ce1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e183b186cd7c492b432e00ac6e86ce1");
        }
    }

    @Override // com.meituan.msc.modules.apploader.b
    public final void a(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3ded67875806d0f519f43315d54e0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3ded67875806d0f519f43315d54e0e");
        } else if (z) {
            e.a().b(hVar.a(), new com.meituan.msc.common.framework.a<h>() { // from class: com.meituan.msc.modules.preload.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.framework.a
                public final void a() {
                }

                @Override // com.meituan.msc.common.framework.a
                public final /* synthetic */ void a(h hVar2) {
                    h hVar3 = hVar2;
                    Object[] objArr2 = {hVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eca641d59e0bfe6e4823d8e78c13c80", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eca641d59e0bfe6e4823d8e78c13c80");
                    } else {
                        com.meituan.msc.modules.reporter.g.d("PreloadBiz", "rePreloadBiz after runtime destroy:", hVar3);
                    }
                }

                @Override // com.meituan.msc.common.framework.a
                public final void a(String str, Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ca9ca60ea72e9f02e52a9d7263f6e49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ca9ca60ea72e9f02e52a9d7263f6e49");
                    } else {
                        com.meituan.msc.modules.reporter.g.b("PreloadBiz", exc, "rePreloadBiz after runtime destroy error", str);
                    }
                }
            });
        } else {
            com.meituan.msc.modules.reporter.g.d("PreloadBiz", "EngineStatusChangeListener shouldRePreload is false");
        }
    }

    @Override // com.meituan.msc.modules.apploader.b
    public final void a(final h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c8043c37ef03a5f721282e408dfbe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c8043c37ef03a5f721282e408dfbe6");
            return;
        }
        long h = com.meituan.msc.common.config.b.h();
        if (!MSCHornPreloadConfig.d().e() || h <= 0) {
            return;
        }
        com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.preload.c.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9acae9352ad46db60c73e4d03305fa1d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9acae9352ad46db60c73e4d03305fa1d");
                } else if (!((com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class)).d() || hVar.g()) {
                } else {
                    com.meituan.msc.modules.reporter.g.b("EngineStatusChangeListener", "re-preloadPage when engine enter keep alive");
                    m mVar = hVar.g;
                    com.meituan.msc.modules.update.f fVar = hVar.r;
                    if (!n.a(hVar, fVar.f())) {
                        com.meituan.msc.modules.reporter.g.d("EngineStatusChangeListener", "root path is not webview render, don't prelod");
                        return;
                    }
                    if (l.a(fVar, fVar.f())) {
                        mVar.a(MSCEnvHelper.getContext());
                    }
                    mVar.a(MSCEnvHelper.getContext(), new o() { // from class: com.meituan.msc.modules.preload.c.2.1
                        public static ChangeQuickRedirect a;

                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str) {
                            String str2 = str;
                            Object[] objArr3 = {str2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14b96936e01a3831317d9ddc6c60beec", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14b96936e01a3831317d9ddc6c60beec");
                            } else {
                                com.meituan.msc.modules.reporter.g.d("EngineStatusChangeListener", "preloadDefaultResources sucessed:", str2);
                            }
                        }

                        @Override // com.meituan.msc.modules.engine.o
                        public final void a(Exception exc) {
                            Object[] objArr3 = {exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec49138a88a7378a60c0a7a6b5a49d27", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec49138a88a7378a60c0a7a6b5a49d27");
                                return;
                            }
                            Object[] objArr4 = new Object[2];
                            objArr4[0] = "preloadDefaultResources failed:";
                            objArr4[1] = exc != null ? exc.toString() : "";
                            com.meituan.msc.modules.reporter.g.d("EngineStatusChangeListener", objArr4);
                        }
                    });
                }
            }
        }, 1000L);
    }
}
