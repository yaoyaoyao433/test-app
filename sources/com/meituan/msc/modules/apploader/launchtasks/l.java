package com.meituan.msc.modules.apploader.launchtasks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class l<T> extends com.meituan.msc.common.aov_task.task.d<T> {
    public static ChangeQuickRedirect d;
    public T e;

    public l(String str, T t) {
        super(str);
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f40804882563fb36a845aaa2d7b6fb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f40804882563fb36a845aaa2d7b6fb4");
        } else {
            this.e = t;
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.d
    public final T b(com.meituan.msc.common.aov_task.context.a aVar) {
        return this.e;
    }
}
