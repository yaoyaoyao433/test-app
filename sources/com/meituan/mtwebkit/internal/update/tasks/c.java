package com.meituan.mtwebkit.internal.update.tasks;

import com.meituan.mtwebkit.internal.task.Depend;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.meituan.mtwebkit.internal.task.a<Boolean> {
    public static ChangeQuickRedirect a;
    @Depend
    private a b;

    @Override // com.meituan.mtwebkit.internal.task.a
    public final /* synthetic */ Boolean b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff778c091343057847b179582364a8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff778c091343057847b179582364a8a");
        }
        if (com.meituan.mtwebkit.internal.h.c() == 0) {
            com.meituan.mtwebkit.internal.reporter.c.a(com.meituan.mtwebkit.internal.h.e(), com.meituan.mtwebkit.internal.h.d(), this.b.c());
        }
        return Boolean.TRUE;
    }
}
