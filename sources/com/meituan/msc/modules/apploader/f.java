package com.meituan.msc.modules.apploader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements com.meituan.msc.common.support.java.util.function.d {
    public static ChangeQuickRedirect a;
    private final com.meituan.msc.common.aov_task.task.c b;

    public f(com.meituan.msc.common.aov_task.task.c cVar) {
        this.b = cVar;
    }

    @Override // com.meituan.msc.common.support.java.util.function.d
    public final Object a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442f0ac51fc4e81311e951c61b182bbd", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442f0ac51fc4e81311e951c61b182bbd") : e.a(this.b, (com.meituan.msc.common.aov_task.f) obj);
    }
}
