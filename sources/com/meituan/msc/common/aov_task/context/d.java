package com.meituan.msc.common.aov_task.context;

import com.meituan.msc.common.aov_task.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;
    private final f b;
    private final com.meituan.msc.common.aov_task.task.c<?> c;

    public d(f fVar, com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {fVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "070f9c3ee5d87e71d547002704d02816", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "070f9c3ee5d87e71d547002704d02816");
            return;
        }
        this.b = fVar;
        this.c = cVar;
    }
}
