package com.meituan.msc.common.aov_task.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d extends a {
    public static ChangeQuickRedirect a;
    private final com.meituan.msc.common.aov_task.task.c<?> b;

    public d(com.meituan.msc.common.aov_task.task.c<?> cVar, String str) {
        this(cVar, str, null);
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8aae9f46bbc8f9483fa2e21dc73f604", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8aae9f46bbc8f9483fa2e21dc73f604");
        }
    }

    public d(com.meituan.msc.common.aov_task.task.c<?> cVar, String str, Throwable th) {
        super(str, th);
        Object[] objArr = {cVar, str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c109eb8f9b05ecb45f10ed01f2ada0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c109eb8f9b05ecb45f10ed01f2ada0");
        } else {
            this.b = cVar;
        }
    }
}
