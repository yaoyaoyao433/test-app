package com.meituan.msc.common.aov_task;

import android.support.annotation.NonNull;
import com.meituan.msc.common.utils.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    final Map<com.meituan.msc.common.aov_task.task.c<?>, List<com.meituan.msc.common.aov_task.task.c<?>>> b;
    Map<com.meituan.msc.common.aov_task.task.c<?>, List<com.meituan.msc.common.aov_task.task.c<?>>> c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e11fbe1895a27916bef12f99104baa1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e11fbe1895a27916bef12f99104baa1c");
        } else {
            this.b = new ad();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull com.meituan.msc.common.aov_task.task.c<?> cVar, List<com.meituan.msc.common.aov_task.task.c<?>> list) {
        Object[] objArr = {cVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82183a32f0b5577b3f10e5936ba71c80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82183a32f0b5577b3f10e5936ba71c80");
        } else if (this.b.containsKey(cVar)) {
            throw new IllegalStateException("Multiple additions are prohibited");
        } else {
            this.b.put(cVar, list);
            this.c = null;
        }
    }

    public final Collection<com.meituan.msc.common.aov_task.task.c<?>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea5c9a4fa21ca479a5a74185de4e91e2", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea5c9a4fa21ca479a5a74185de4e91e2") : this.b.keySet();
    }

    @NonNull
    public final Collection<com.meituan.msc.common.aov_task.task.c<?>> a(@NonNull com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c132c2f62015ebef859588f97617244", RobustBitConfig.DEFAULT_VALUE)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c132c2f62015ebef859588f97617244");
        }
        List<com.meituan.msc.common.aov_task.task.c<?>> list = this.b.get(cVar);
        return list != null ? list : Collections.emptyList();
    }

    public final d b(com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521fc4630d6e859b90d1c5b2a6c686d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521fc4630d6e859b90d1c5b2a6c686d4");
        }
        if (cVar == null) {
            return this;
        }
        d dVar = new d();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(cVar);
        while (!arrayDeque.isEmpty()) {
            com.meituan.msc.common.aov_task.task.c<?> cVar2 = (com.meituan.msc.common.aov_task.task.c) arrayDeque.poll();
            List<com.meituan.msc.common.aov_task.task.c<?>> list = this.b.get(cVar2);
            dVar.a(cVar2, list);
            if (list != null) {
                arrayDeque.addAll(list);
            }
        }
        return dVar;
    }

    public final Map<com.meituan.msc.common.aov_task.task.c<?>, List<com.meituan.msc.common.aov_task.task.c<?>>> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cf374a2706524a54aef6f7181b2af28", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cf374a2706524a54aef6f7181b2af28") : Collections.unmodifiableMap(this.b);
    }
}
