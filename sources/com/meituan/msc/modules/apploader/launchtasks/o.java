package com.meituan.msc.modules.apploader.launchtasks;

import android.support.annotation.NonNull;
import com.meituan.msc.modules.container.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class o extends com.meituan.msc.common.aov_task.task.a<Void> {
    public static ChangeQuickRedirect d;
    protected final WeakReference<p> e;

    public com.meituan.msc.common.support.java.util.concurrent.a<Void> a(@NonNull p pVar, com.meituan.msc.common.aov_task.context.a aVar) {
        return null;
    }

    @Override // com.meituan.msc.common.aov_task.task.b, com.meituan.msc.common.aov_task.task.c
    public void a(com.meituan.msc.common.aov_task.context.b bVar) {
    }

    public o(String str, p pVar) {
        super(str);
        Object[] objArr = {str, pVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263b8fceca6497c3e412f245f87a746f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263b8fceca6497c3e412f245f87a746f");
        } else {
            this.e = new WeakReference<>(pVar);
        }
    }

    @Override // com.meituan.msc.common.aov_task.task.a
    public final com.meituan.msc.common.support.java.util.concurrent.a<Void> b(com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2237d15599fbd449e66b67b776937989", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2237d15599fbd449e66b67b776937989");
        }
        com.meituan.msc.modules.apploader.events.a aVar2 = new com.meituan.msc.modules.apploader.events.a(1005, "activity is destroyed");
        if (this.e == null) {
            return com.meituan.msc.common.support.java.util.concurrent.a.c((Throwable) aVar2);
        }
        p pVar = this.e.get();
        if (pVar == null) {
            return com.meituan.msc.common.support.java.util.concurrent.a.c((Throwable) aVar2);
        }
        if (pVar.C().isFinishing() || pVar.C().isDestroyed()) {
            return com.meituan.msc.common.support.java.util.concurrent.a.c((Throwable) aVar2);
        }
        return a(pVar, aVar);
    }
}
