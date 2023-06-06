package com.meituan.msc.modules.apploader.launchtasks;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.msc.modules.service.IServiceEngine;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b extends com.meituan.msc.common.aov_task.task.a<IServiceEngine> {
    public static ChangeQuickRedirect d;
    public com.meituan.msc.modules.engine.h e;

    public b(@NonNull com.meituan.msc.modules.engine.h hVar) {
        super("CreateJsEngine");
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61384c030370383ff63694b6e080e2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61384c030370383ff63694b6e080e2d");
        } else {
            this.e = hVar;
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.a
    public final com.meituan.msc.common.support.java.util.concurrent.a<IServiceEngine> b(com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ac15ea73143c67065f19a734543ff2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ac15ea73143c67065f19a734543ff2");
        }
        this.e.o.a("init_js_engine");
        final com.meituan.msc.common.support.java.util.concurrent.a<IServiceEngine> aVar2 = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.sankuai.android.jarvis.c.a("MSC-Launch-CreateJsEngine").submit(new Runnable() { // from class: com.meituan.msc.modules.apploader.launchtasks.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef1e0ebaf12f43e5e244d0fc7de08416", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef1e0ebaf12f43e5e244d0fc7de08416");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d("CreateJsEngine", "switchThreadDuration", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                ((com.meituan.msc.modules.engine.a) b.this.e.c(com.meituan.msc.modules.engine.a.class)).a(new com.meituan.msc.modules.service.d() { // from class: com.meituan.msc.modules.apploader.launchtasks.b.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.service.d
                    public final void a(IServiceEngine iServiceEngine) {
                        Object[] objArr3 = {iServiceEngine};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4dfb230ce730e01cecc0f6d78a1f5a9a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4dfb230ce730e01cecc0f6d78a1f5a9a");
                        } else {
                            aVar2.d((com.meituan.msc.common.support.java.util.concurrent.a) iServiceEngine);
                        }
                    }
                });
            }
        });
        return aVar2;
    }
}
