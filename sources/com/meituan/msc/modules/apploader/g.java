package com.meituan.msc.modules.apploader;

import com.meituan.msc.modules.apploader.launchtasks.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements com.meituan.msc.common.support.java.util.function.d {
    public static ChangeQuickRedirect a;
    private final j b;

    private g(j jVar) {
        this.b = jVar;
    }

    public static com.meituan.msc.common.support.java.util.function.d a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0a65f408a7b598eeded891134876fc6", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.function.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0a65f408a7b598eeded891134876fc6") : new g(jVar);
    }

    @Override // com.meituan.msc.common.support.java.util.function.d
    public final Object a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e63731cba4f84c4d0a21369eca8d26", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e63731cba4f84c4d0a21369eca8d26") : e.a(this.b, (com.meituan.msc.common.aov_task.f) obj);
    }
}
