package com.meituan.mtwebkit.internal.update.tasks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends com.meituan.mtwebkit.internal.task.a<Boolean> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mtwebkit.internal.task.a
    public final /* synthetic */ Boolean b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36fd2dcaf3143bebb7deec936c250cc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36fd2dcaf3143bebb7deec936c250cc2");
        }
        com.meituan.mtwebkit.internal.c.a(com.meituan.mtwebkit.internal.g.d(), com.meituan.mtwebkit.internal.c.b);
        return Boolean.TRUE;
    }
}
