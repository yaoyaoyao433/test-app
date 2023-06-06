package com.meituan.msc.common.aov_task.context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.common.aov_task.f;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;
    private final f b;
    private final com.meituan.msc.common.aov_task.task.c<?> c;

    public c(f fVar, com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {fVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cda48566e6dea89d0b76179d9bec788", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cda48566e6dea89d0b76179d9bec788");
            return;
        }
        this.b = fVar;
        this.c = cVar;
    }

    @Override // com.meituan.msc.common.aov_task.context.a
    public final <T> T a(@NonNull com.meituan.msc.common.aov_task.task.c<T> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5eff27cf6f90990ebf73aba2979a518", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5eff27cf6f90990ebf73aba2979a518") : (T) this.b.a(cVar);
    }

    @Override // com.meituan.msc.common.aov_task.context.a
    public final <TaskResult> TaskResult a(@NonNull Class<? extends com.meituan.msc.common.aov_task.task.c<TaskResult>> cls) {
        com.meituan.msc.common.aov_task.task.c<?> cVar;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c631030870ec4307fa4d6cdc8088b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (TaskResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c631030870ec4307fa4d6cdc8088b8");
        }
        f fVar = this.b;
        f fVar2 = this.b;
        com.meituan.msc.common.aov_task.task.c<?> cVar2 = this.c;
        Object[] objArr2 = {cls, cVar2};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar2, changeQuickRedirect2, false, "99befc844225ad0ad69fb3f4045d66b2", RobustBitConfig.DEFAULT_VALUE)) {
            cVar = (com.meituan.msc.common.aov_task.task.c) PatchProxy.accessDispatch(objArr2, fVar2, changeQuickRedirect2, false, "99befc844225ad0ad69fb3f4045d66b2");
        } else {
            com.meituan.msc.common.aov_task.task.c<?> cVar3 = fVar2.g.get(cls);
            if (cVar3 != null) {
                cVar = cVar3;
            } else {
                Iterator<f.b> it = fVar2.h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (cVar2 == null) {
                            if (fVar2.g.containsKey(cls)) {
                                throw new com.meituan.msc.common.aov_task.exception.b(cls);
                            }
                            throw new com.meituan.msc.common.aov_task.exception.c(cls);
                        }
                        ArrayDeque arrayDeque = new ArrayDeque();
                        arrayDeque.add(cVar2);
                        while (!arrayDeque.isEmpty()) {
                            cVar = (com.meituan.msc.common.aov_task.task.c) arrayDeque.poll();
                            Collection<com.meituan.msc.common.aov_task.task.c<?>> a2 = fVar2.c.a(cVar);
                            if (!cVar.getClass().isAssignableFrom(cls)) {
                                arrayDeque.addAll(a2);
                            }
                        }
                        throw new com.meituan.msc.common.aov_task.exception.c(cls);
                    }
                    f.b next = it.next();
                    if (next instanceof f.a) {
                        f.a aVar = (f.a) next;
                        if (aVar.b.getClass().equals(cls)) {
                            cVar = aVar.b;
                            g.d(fVar2.toString(), "findTaskByClassOrThrow in pendingQueue", cVar);
                            break;
                        }
                    }
                }
            }
        }
        return (TaskResult) fVar.a(cVar);
    }

    @Override // com.meituan.msc.common.aov_task.context.a
    @NonNull
    public final f a() {
        return this.b;
    }

    @Override // com.meituan.msc.common.aov_task.context.a
    @Nullable
    public final com.meituan.msc.common.aov_task.task.c<?> b(Class<? extends com.meituan.msc.common.aov_task.task.c<?>> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e484b5d82be553a1a44242aec5edc22", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.aov_task.task.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e484b5d82be553a1a44242aec5edc22");
        }
        f fVar = this.b;
        com.meituan.msc.common.aov_task.task.c<?> cVar = this.c;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        for (com.meituan.msc.common.aov_task.task.c<?> cVar2 : PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "3d3ec74a73ca3ae62b586e024d9b681b", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "3d3ec74a73ca3ae62b586e024d9b681b") : Collections.unmodifiableCollection(fVar.c.a(cVar))) {
            if (cVar2.getClass().equals(cls)) {
                return cVar2;
            }
        }
        return null;
    }
}
