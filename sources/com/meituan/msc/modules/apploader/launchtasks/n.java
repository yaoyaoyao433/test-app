package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.preload.MSCHornPreloadConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class n extends com.meituan.msc.common.aov_task.task.d<Void> {
    public static ChangeQuickRedirect d;
    final com.meituan.msc.modules.engine.h e;
    private boolean f;

    @Override // com.meituan.msc.common.aov_task.task.d
    public final /* synthetic */ Void b(com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49cf9660709245986b32abedef13ff77", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49cf9660709245986b32abedef13ff77");
        }
        if (MSCHornRollbackConfig.d().c().disablePreInitRender) {
            return null;
        }
        com.meituan.msc.common.aov_task.task.c<?> b = aVar.b(m.class);
        final String b2 = am.b(b != null ? (String) aVar.a((m) b) : null);
        com.meituan.msc.modules.reporter.g.d("PreInitRenderTask", "path:", b2);
        com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.modules.apploader.launchtasks.n.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85e3adce16aab0b68fb884555aea647f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85e3adce16aab0b68fb884555aea647f");
                } else if (q.a(n.this.e, b2)) {
                } else {
                    String str = b2;
                    if (TextUtils.isEmpty(str)) {
                        str = n.this.e.r.f();
                    }
                    if (n.this.e.r.o(str) != com.meituan.msc.b.WEBVIEW) {
                        return;
                    }
                    com.meituan.msc.modules.engine.c cVar = (com.meituan.msc.modules.engine.c) n.this.e.c(com.meituan.msc.modules.engine.c.class);
                    if (n.this.f) {
                        final n nVar = n.this;
                        Object[] objArr3 = {cVar, str};
                        ChangeQuickRedirect changeQuickRedirect3 = n.d;
                        if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "eb28a418d2aa9c6facb84991096fa697", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "eb28a418d2aa9c6facb84991096fa697");
                            return;
                        }
                        com.meituan.msc.modules.update.f fVar = nVar.e.r;
                        if (!com.meituan.msc.common.utils.n.a(nVar.e, fVar.f())) {
                            com.meituan.msc.modules.reporter.g.d("PreInitRenderTask", "root path is not webview render, don't prelod");
                            return;
                        }
                        if (TextUtils.equals(fVar.f(), str) && com.meituan.msc.modules.page.render.webview.l.a(fVar, str) && MSCHornPreloadConfig.d().c(nVar.e.a())) {
                            cVar.a(MSCEnvHelper.getContext());
                        }
                        Object[] objArr4 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect4 = n.d;
                        if (PatchProxy.isSupport(objArr4, nVar, changeQuickRedirect4, false, "4beaab071fc53701c239e1e1f7215aa6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, nVar, changeQuickRedirect4, false, "4beaab071fc53701c239e1e1f7215aa6");
                            return;
                        } else {
                            cVar.a(MSCEnvHelper.getContext(), new com.meituan.msc.modules.engine.o() { // from class: com.meituan.msc.modules.apploader.launchtasks.n.2
                                public static ChangeQuickRedirect a;

                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(String str2) {
                                    String str3 = str2;
                                    Object[] objArr5 = {str3};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0f888fdf772bfa6b61288d1dda0244c9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0f888fdf772bfa6b61288d1dda0244c9");
                                    } else {
                                        com.meituan.msc.modules.reporter.g.d("PreInitRenderTask", "preloadDefaultResources sucessed:", str3);
                                    }
                                }

                                @Override // com.meituan.msc.modules.engine.o
                                public final void a(Exception exc) {
                                    Object[] objArr5 = {exc};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6a37f77d8ba5b1428d83486b9a0c863f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6a37f77d8ba5b1428d83486b9a0c863f");
                                        return;
                                    }
                                    Object[] objArr6 = new Object[2];
                                    objArr6[0] = "preloadDefaultResources failed:";
                                    objArr6[1] = exc != null ? exc.toString() : "";
                                    com.meituan.msc.modules.reporter.g.d("PreInitRenderTask", objArr6);
                                }
                            });
                            return;
                        }
                    }
                    cVar.b(MSCEnvHelper.getContext(), str);
                }
            }
        });
        return null;
    }

    public n(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("PreInitWebViewTask");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7a4dc118dc71c21e7ff65ce139c9c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7a4dc118dc71c21e7ff65ce139c9c9");
            return;
        }
        this.f = false;
        this.e = hVar;
    }

    public n(@NonNull com.meituan.msc.modules.engine.h hVar, boolean z) {
        this(hVar);
        Object[] objArr = {hVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b3829d03ffbf240a7449bb2aaa9969", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b3829d03ffbf240a7449bb2aaa9969");
        } else {
            this.f = true;
        }
    }
}
