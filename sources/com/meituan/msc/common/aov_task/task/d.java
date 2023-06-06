package com.meituan.msc.common.aov_task.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class d<ExecuteResult> extends b<ExecuteResult> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.common.aov_task.task.c
    public final boolean a() {
        return false;
    }

    public abstract ExecuteResult b(com.meituan.msc.common.aov_task.context.a aVar);

    public d(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9596de0390a680c5201d9f8c2b93de01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9596de0390a680c5201d9f8c2b93de01");
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.c
    public final com.meituan.msc.common.support.java.util.concurrent.a<ExecuteResult> a(com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06cbc2967cc520924cc2146a37b1294", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06cbc2967cc520924cc2146a37b1294") : com.meituan.msc.common.support.java.util.concurrent.a.c(b(aVar));
    }
}
