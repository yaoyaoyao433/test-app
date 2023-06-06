package com.meituan.msc.common.aov_task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public static ChangeQuickRedirect a;
    private final f b;
    private final com.meituan.msc.common.aov_task.task.c c;

    private i(f fVar, com.meituan.msc.common.aov_task.task.c cVar) {
        this.b = fVar;
        this.c = cVar;
    }

    public static Runnable a(f fVar, com.meituan.msc.common.aov_task.task.c cVar) {
        Object[] objArr = {fVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2189704c982f9eaa08e692f9ba61d2a5", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2189704c982f9eaa08e692f9ba61d2a5") : new i(fVar, cVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb1ab42926c84bd3ea80d82ae9463239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb1ab42926c84bd3ea80d82ae9463239");
            return;
        }
        f fVar = this.b;
        com.meituan.msc.common.aov_task.task.c<?> cVar = this.c;
        Object[] objArr2 = {fVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3f1d089e214bf899f92f96c0eeecde0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3f1d089e214bf899f92f96c0eeecde0e");
        } else {
            fVar.e(cVar);
        }
    }
}
