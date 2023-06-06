package com.meituan.msc.modules.apploader;

import com.facebook.react.bridge.BaseJavaModule;
import com.meituan.msc.common.aov_task.f;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends com.meituan.msc.common.aov_task.f {
    public static ChangeQuickRedirect l;
    public final String m;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8cb4ee232134c0f8d1c2324dacb955", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8cb4ee232134c0f8d1c2324dacb955");
            return;
        }
        this.m = "LaunchTaskManager@" + Integer.toHexString(hashCode());
    }

    @Override // com.meituan.msc.common.aov_task.f
    public final com.meituan.msc.common.support.java.util.concurrent.a<?> a(com.meituan.msc.common.aov_task.task.c<?> cVar, com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27550820fd64ae8c747a892e99f9d25f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27550820fd64ae8c747a892e99f9d25f");
        }
        String b = cVar.b();
        String str = this.m;
        Object[] objArr2 = new Object[6];
        objArr2[0] = "start to execute ";
        objArr2[1] = cVar.a() ? BaseJavaModule.METHOD_TYPE_ASYNC : BaseJavaModule.METHOD_TYPE_SYNC;
        objArr2[2] = "task: ";
        objArr2[3] = cVar;
        objArr2[4] = ",source:";
        objArr2[5] = this.i;
        com.meituan.msc.modules.reporter.g.d(str, objArr2);
        PerfTrace.begin(b).a(cVar.hashCode());
        return super.a(cVar, aVar);
    }

    @Override // com.meituan.msc.common.aov_task.f
    public final void a(com.meituan.msc.common.aov_task.task.c<?> cVar, Object obj) {
        int i;
        Object[] objArr = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b03bd816f699a0a990f697c9561332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b03bd816f699a0a990f697c9561332");
            return;
        }
        String b = cVar.b();
        super.a(cVar, obj);
        String str = this.m;
        Object[] objArr2 = new Object[10];
        objArr2[0] = "Succeed to execute ";
        objArr2[1] = cVar.a() ? BaseJavaModule.METHOD_TYPE_ASYNC : BaseJavaModule.METHOD_TYPE_SYNC;
        objArr2[2] = "task: ";
        objArr2[3] = cVar;
        objArr2[4] = "Result: ";
        objArr2[5] = obj;
        objArr2[6] = "SpendTime:";
        Object[] objArr3 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.aov_task.f.a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "2a2181cde1fe98f03bba593d9b5b1e58", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "2a2181cde1fe98f03bba593d9b5b1e58")).intValue();
        } else {
            f.e d = super.d(cVar);
            i = (d.c < 0 || d.c > d.d) ? -1 : (int) (d.d - d.c);
        }
        objArr2[7] = Integer.valueOf(i);
        objArr2[8] = ",source:";
        objArr2[9] = this.i;
        com.meituan.msc.modules.reporter.g.d(str, objArr2);
        PerfTrace.end(b).a(cVar.hashCode());
    }

    @Override // com.meituan.msc.common.aov_task.f
    public final void a(Exception exc, com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {exc, cVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb95d25dbd8bb77736304e55d34ee915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb95d25dbd8bb77736304e55d34ee915");
            return;
        }
        String str = this.m;
        Object[] objArr2 = new Object[8];
        objArr2[0] = "Failed to execute ";
        objArr2[1] = cVar.a() ? BaseJavaModule.METHOD_TYPE_ASYNC : BaseJavaModule.METHOD_TYPE_SYNC;
        objArr2[2] = "task: ";
        objArr2[3] = cVar;
        objArr2[4] = "Exception: ";
        objArr2[5] = exc;
        objArr2[6] = ",source:";
        objArr2[7] = this.i;
        com.meituan.msc.modules.reporter.g.b(str, exc, objArr2);
        super.a(exc, cVar);
    }

    public final String toString() {
        return this.m;
    }
}
