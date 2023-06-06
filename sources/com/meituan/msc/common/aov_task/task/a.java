package com.meituan.msc.common.aov_task.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a<ExecuteResult> extends b<ExecuteResult> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.common.aov_task.task.c
    public final boolean a() {
        return true;
    }

    public abstract com.meituan.msc.common.support.java.util.concurrent.a<ExecuteResult> b(com.meituan.msc.common.aov_task.context.a aVar);

    public a(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60864461d6c9d0715465538990e5658b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60864461d6c9d0715465538990e5658b");
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.c
    public final com.meituan.msc.common.support.java.util.concurrent.a<ExecuteResult> a(com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "747840931736ee77716eae3056d37c1f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "747840931736ee77716eae3056d37c1f") : b(aVar);
    }
}
