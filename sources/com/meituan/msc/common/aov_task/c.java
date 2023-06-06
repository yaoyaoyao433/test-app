package com.meituan.msc.common.aov_task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    com.meituan.msc.common.aov_task.task.c<?>[] b;
    Set<com.meituan.msc.common.aov_task.task.c<?>> c;
    com.meituan.msc.common.support.java.util.concurrent.a<f> d;
    com.meituan.msc.common.aov_task.exception.g e;
    private final d f;

    public c(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "164c8fe7223166ad64a486977da4df0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "164c8fe7223166ad64a486977da4df0a");
            return;
        }
        this.b = null;
        this.f = dVar;
    }

    public final Collection<com.meituan.msc.common.aov_task.task.c<?>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5de531265f7c0cd90a633bc2e22771", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5de531265f7c0cd90a633bc2e22771");
        }
        if (this.c == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc7af83f5a697329e0eac54fb90e5ba8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc7af83f5a697329e0eac54fb90e5ba8");
            } else {
                HashSet hashSet = new HashSet();
                if (this.b != null) {
                    if (this.b.length == 0) {
                        hashSet.addAll(this.f.a());
                    } else {
                        for (com.meituan.msc.common.aov_task.task.c<?> cVar : this.b) {
                            hashSet.addAll(this.f.b(cVar).a());
                        }
                    }
                }
                this.c = hashSet;
            }
        }
        return this.c;
    }
}
