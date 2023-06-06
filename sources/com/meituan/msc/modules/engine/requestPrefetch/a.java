package com.meituan.msc.modules.engine.requestPrefetch;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.y;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.page.render.MSCHornPerfConfig;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static void a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "42524ebb95c49fb1a05bdb5b253dd43d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "42524ebb95c49fb1a05bdb5b253dd43d");
        } else {
            com.meituan.msc.modules.reporter.g.d("DataPrefetchManager", objArr);
        }
    }

    public static void a(@Nullable Activity activity, Intent intent) {
        boolean z;
        com.meituan.msc.modules.update.f fVar;
        int a2;
        Object[] objArr = {null, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1c3a5cdfc8042571d431e22e67fcca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1c3a5cdfc8042571d431e22e67fcca7");
            return;
        }
        a("prefetchDataIfNeededInMSCInstrumentation");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7c25ecf6f49b30e826bfb659d1a5a558", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7c25ecf6f49b30e826bfb659d1a5a558")).booleanValue();
        } else {
            z = com.meituan.msc.common.process.a.f() || com.meituan.msc.common.process.a.STANDARD.c();
        }
        if (!z) {
            a("only support in msc related process");
        } else if (a()) {
            a("horn rollback");
        } else {
            String a3 = y.a(intent, "appId");
            if (!MSCHornPerfConfig.d().c(a3)) {
                a("do not in instrument prefetch white list");
                return;
            }
            com.meituan.msc.modules.engine.h a4 = q.a(a3);
            if (a4 == null || (fVar = a4.r) == null) {
                a("runtime:", a4);
            } else if (fVar.h == null) {
                a("metaInfo is null");
            } else {
                String a5 = y.a(intent, "targetPath");
                f e = a4.e();
                if (!b() && e.a(a5)) {
                    a("exist cached data or isSyncPrefetching");
                    return;
                }
                e.c();
                Object[] objArr3 = {intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e582e1b6d3b23c87e970261666400c5c", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e582e1b6d3b23c87e970261666400c5c")).intValue();
                } else {
                    a2 = !TextUtils.isEmpty(y.a(intent, "extraData")) ? 1037 : y.a(intent, KnbConstants.PARAMS_SCENE, 1001);
                }
                h hVar = h.ROUTER;
                Object[] objArr4 = {null, a5, Integer.valueOf(a2), hVar};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, e, changeQuickRedirect4, false, "38560f0a4a8e6bb545792e97cf45744b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, e, changeQuickRedirect4, false, "38560f0a4a8e6bb545792e97cf45744b");
                } else {
                    e.b = System.currentTimeMillis();
                    e.c = hVar;
                    e.d = a5;
                    if (e.b()) {
                        e.e.a().d("msc.duration.request.prefetch.total");
                        PerfTrace.online().a("request_prefetch").a("targetPath", a5);
                        PerfTrace.online().a("request_prefetch_prepare");
                        e.a((Activity) null, a5, a2, true);
                    }
                }
                aw.b("在页面路由时发起数据预拉取", new Object[0]);
                a("startPrefetchBeforeActivityCreate");
            }
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1147f85040705595782fc0d9cac986f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1147f85040705595782fc0d9cac986f1")).booleanValue() : MSCHornRollbackConfig.d().c().isRollbackInstrumentPrefetch;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb01f5cd173b667a5dd03b7b2970cc67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb01f5cd173b667a5dd03b7b2970cc67")).booleanValue() : MSCHornRollbackConfig.d().c().isRollbackShanGouRouterPrefetch;
    }
}
