package com.sankuai.waimai.alita.core.mlmodel.predictor.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.alita.core.mlmodel.predictor.h;
import com.sankuai.waimai.alita.core.mlmodel.predictor.i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public ScheduledExecutorService b;
    ConcurrentHashMap<String, com.sankuai.waimai.alita.core.mlmodel.predictor.base.b> c;

    public a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3562b83fc353223f14f27a669d7cd811", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3562b83fc353223f14f27a669d7cd811");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.b = c.c("alita_model_thread_" + j);
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2225984083c78932f9d45f59e3ac4d35", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2225984083c78932f9d45f59e3ac4d35");
        }
        return "PREDICTOR_" + str.replaceAll(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE);
    }

    public void a(final Exception exc, final h hVar) {
        Object[] objArr = {exc, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9959f9d443d3d2422a9aae108c73f815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9959f9d443d3d2422a9aae108c73f815");
        } else {
            this.b.execute(new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6472aa4d8f599ddaebb9c124fc6f3a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6472aa4d8f599ddaebb9c124fc6f3a8");
                    } else {
                        hVar.a(exc);
                    }
                }
            });
        }
    }

    void a(final i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ccd3140823ceed2b016143b65e315b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ccd3140823ceed2b016143b65e315b0");
        } else {
            this.b.execute(new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b28b1e8602a43ab4d81b2149f145c818", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b28b1e8602a43ab4d81b2149f145c818");
                    } else {
                        iVar.a();
                    }
                }
            });
        }
    }

    public synchronized boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed09e20d546fd77ed6d622937096afef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed09e20d546fd77ed6d622937096afef")).booleanValue();
        }
        return (this.b == null || this.b.isShutdown()) ? false : true;
    }
}
