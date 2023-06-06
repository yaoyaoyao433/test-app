package com.meituan.msc.common.aov_task;

import android.net.Uri;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msc.common.utils.ad;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f {
    public static ChangeQuickRedirect a;
    final String b;
    public final com.meituan.msc.common.aov_task.d c;
    final com.meituan.msc.common.aov_task.c d;
    final Map<com.meituan.msc.common.aov_task.task.c<?>, e> e;
    public com.meituan.msc.common.aov_task.a f;
    public final Map<Class, com.meituan.msc.common.aov_task.task.c<?>> g;
    public final Queue<b> h;
    protected String i;
    public ExecutorService j;
    public boolean k;
    private final Executor l;
    private volatile boolean m;
    private final AtomicBoolean n;
    private com.meituan.msc.common.support.java.util.concurrent.a<f> o;

    public f() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7dc55f32302d3ab755c96d7e8e07a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7dc55f32302d3ab755c96d7e8e07a0");
        }
    }

    private f(Executor executor) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa504160461a131506d43354a1169cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa504160461a131506d43354a1169cb");
            return;
        }
        this.b = "TaskManager@" + Integer.toHexString(hashCode());
        this.m = false;
        this.n = new AtomicBoolean(false);
        this.e = new ad();
        this.f = null;
        this.g = new ad();
        this.h = new LinkedBlockingQueue();
        this.c = new com.meituan.msc.common.aov_task.d();
        this.l = null;
        this.d = new com.meituan.msc.common.aov_task.c(this.c);
    }

    public final Collection<com.meituan.msc.common.aov_task.task.c<?>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fddb816e517c6df035216feacd326f68", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fddb816e517c6df035216feacd326f68") : this.e.keySet();
    }

    public final com.meituan.msc.common.support.java.util.concurrent.a<f> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e0cc131f998b57af9aa01843406e34", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e0cc131f998b57af9aa01843406e34") : a(new com.meituan.msc.common.aov_task.task.c[0]);
    }

    public com.meituan.msc.common.support.java.util.concurrent.a<f> a(final com.meituan.msc.common.aov_task.task.c<?>... cVarArr) {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d522476dc3c6eddbcc5eb07e0505818a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d522476dc3c6eddbcc5eb07e0505818a") : e().a(new com.meituan.msc.common.support.java.util.function.d<f, f>() { // from class: com.meituan.msc.common.aov_task.f.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.d
            public final /* synthetic */ f a(f fVar) {
                f fVar2 = fVar;
                Object[] objArr2 = {fVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d0dcd7ef2feca2e8b3e806d52b2d211", RobustBitConfig.DEFAULT_VALUE)) {
                    return (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d0dcd7ef2feca2e8b3e806d52b2d211");
                }
                com.meituan.msc.common.aov_task.c cVar = fVar2.d;
                com.meituan.msc.common.aov_task.task.c<?>[] cVarArr2 = cVarArr;
                Object[] objArr3 = {cVarArr2};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.common.aov_task.c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "17cd53a79b9be6e3058165f2cb68fad7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "17cd53a79b9be6e3058165f2cb68fad7");
                } else {
                    if (cVar.d == null || cVar.d.isDone()) {
                        cVar.d = new com.meituan.msc.common.support.java.util.concurrent.a<>();
                    }
                    if (MSCHornRollbackConfig.d().c().isRollbackTargetExecuteTasksReCalculateCheck && Arrays.equals(cVar.b, cVarArr2)) {
                        com.meituan.msc.modules.reporter.g.d("ExecuteTargetState", "setTargetExecuteTasks targetExecuteTasks equals");
                    } else {
                        cVar.b = cVarArr2;
                        cVar.c = null;
                    }
                }
                return fVar2;
            }
        }).b((com.meituan.msc.common.support.java.util.function.d<? super U, ? extends com.meituan.msc.common.support.java.util.concurrent.c<U>>) new com.meituan.msc.common.support.java.util.function.d<f, com.meituan.msc.common.support.java.util.concurrent.c<f>>() { // from class: com.meituan.msc.common.aov_task.f.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.d
            public final /* synthetic */ com.meituan.msc.common.support.java.util.concurrent.c<f> a(f fVar) {
                f fVar2 = fVar;
                Object[] objArr2 = {fVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "982b23cd16032a49f40e7fe01345408c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "982b23cd16032a49f40e7fe01345408c") : fVar2.c();
            }
        }).b((com.meituan.msc.common.support.java.util.function.d) new com.meituan.msc.common.support.java.util.function.d<f, com.meituan.msc.common.support.java.util.concurrent.c<f>>() { // from class: com.meituan.msc.common.aov_task.f.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.support.java.util.function.d
            public final /* synthetic */ com.meituan.msc.common.support.java.util.concurrent.c<f> a(f fVar) {
                f fVar2 = fVar;
                Object[] objArr2 = {fVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53a6e21687e0066fd3e9f7da06d15104", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.msc.common.support.java.util.concurrent.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53a6e21687e0066fd3e9f7da06d15104");
                }
                com.meituan.msc.common.aov_task.task.c<?>[] cVarArr2 = cVarArr;
                Object[] objArr3 = {cVarArr2};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr3, fVar2, changeQuickRedirect3, false, "03054be6c1837659bd52b9cfff08238a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr3, fVar2, changeQuickRedirect3, false, "03054be6c1837659bd52b9cfff08238a");
                }
                if (cVarArr2.length == 1) {
                    com.meituan.msc.common.support.java.util.concurrent.a<Object> aVar = fVar2.d(cVarArr2[0]).f;
                    Object[] objArr4 = {fVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                    return aVar.a((com.meituan.msc.common.support.java.util.function.d<? super Object, ? extends U>) (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "44fc0f7bccc61b166ab186a83f60be43", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.function.d) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "44fc0f7bccc61b166ab186a83f60be43") : new g(fVar2)));
                } else if (cVarArr2.length > 1) {
                    com.meituan.msc.common.support.java.util.concurrent.a[] aVarArr = new com.meituan.msc.common.support.java.util.concurrent.a[cVarArr2.length];
                    for (int i = 0; i < cVarArr2.length; i++) {
                        aVarArr[i] = fVar2.d(cVarArr2[i]).f;
                    }
                    com.meituan.msc.common.support.java.util.concurrent.a<Void> a2 = com.meituan.msc.common.support.java.util.concurrent.a.a((com.meituan.msc.common.support.java.util.concurrent.a<?>[]) aVarArr);
                    Object[] objArr5 = {fVar2};
                    ChangeQuickRedirect changeQuickRedirect5 = h.a;
                    return a2.a(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "22e97f8e23ed7affe1abf3017d1fc54e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.function.d) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "22e97f8e23ed7affe1abf3017d1fc54e") : new h(fVar2));
                } else {
                    return fVar2.d.d;
                }
            }
        });
    }

    public final <TaskResult> TaskResult a(com.meituan.msc.common.aov_task.task.c<TaskResult> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75fdad61e10f9f245c6dd324e54629d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (TaskResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75fdad61e10f9f245c6dd324e54629d6");
        }
        e d2 = d((com.meituan.msc.common.aov_task.task.c<?>) cVar);
        if (d2.e.get() != com.meituan.msc.common.aov_task.b.SUCCEED) {
            throw new com.meituan.msc.common.aov_task.exception.f(cVar);
        }
        return (TaskResult) d2.b;
    }

    public final com.meituan.msc.common.aov_task.b b(@NonNull com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f6f825efb23c10bb15bb55e5cb0d4a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.aov_task.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f6f825efb23c10bb15bb55e5cb0d4a") : d(cVar).e.get();
    }

    public final <TaskResult> com.meituan.msc.common.aov_task.b a(@NonNull Class<? extends com.meituan.msc.common.aov_task.task.c<TaskResult>> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ebbad4f1654204447cb666cfdd5defc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.aov_task.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ebbad4f1654204447cb666cfdd5defc");
        }
        com.meituan.msc.common.aov_task.task.c<TaskResult> b2 = b(cls);
        if (b2 == null) {
            return com.meituan.msc.common.aov_task.b.NOT_EXIST;
        }
        return b((com.meituan.msc.common.aov_task.task.c<?>) b2);
    }

    public final <TaskResult> com.meituan.msc.common.aov_task.task.c<TaskResult> b(@NonNull Class<? extends com.meituan.msc.common.aov_task.task.c<TaskResult>> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea04f96d21bbe358e45a77d3fcc51f21", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.aov_task.task.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea04f96d21bbe358e45a77d3fcc51f21");
        }
        com.meituan.msc.common.aov_task.task.c<TaskResult> cVar = (com.meituan.msc.common.aov_task.task.c<TaskResult>) this.g.get(cls);
        if (cVar != null) {
            return cVar;
        }
        Iterator<com.meituan.msc.common.aov_task.task.c<?>> it = a().iterator();
        while (it.hasNext()) {
            com.meituan.msc.common.aov_task.task.c<TaskResult> cVar2 = (com.meituan.msc.common.aov_task.task.c<TaskResult>) it.next();
            if (cVar2.getClass().isAssignableFrom(cls)) {
                return cVar2;
            }
        }
        for (b bVar : this.h) {
            if (bVar instanceof a) {
                a aVar = (a) bVar;
                if (aVar.b.getClass().equals(cls)) {
                    com.meituan.msc.common.aov_task.task.c<TaskResult> cVar3 = (com.meituan.msc.common.aov_task.task.c<TaskResult>) aVar.b;
                    com.meituan.msc.modules.reporter.g.d(toString(), "findTaskByClassOrThrow in pendingQueue", cVar3);
                    return cVar3;
                }
            }
        }
        return null;
    }

    public final <TaskResult> com.meituan.msc.common.aov_task.task.c<TaskResult> c(@NonNull Class<? extends com.meituan.msc.common.aov_task.task.c<TaskResult>> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb6746b6c3c4771904dc34f49707a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.aov_task.task.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb6746b6c3c4771904dc34f49707a0d");
        }
        com.meituan.msc.common.aov_task.task.c<TaskResult> cVar = (com.meituan.msc.common.aov_task.task.c<TaskResult>) this.g.get(cls);
        if (cVar != null) {
            return cVar;
        }
        for (b bVar : this.h) {
            if (bVar instanceof a) {
                a aVar = (a) bVar;
                if (aVar.b.getClass().equals(cls)) {
                    return (com.meituan.msc.common.aov_task.task.c<TaskResult>) aVar.b;
                }
            }
        }
        if (this.g.containsKey(cls)) {
            throw new com.meituan.msc.common.aov_task.exception.b(cls);
        }
        throw new com.meituan.msc.common.aov_task.exception.c(cls);
    }

    public final com.meituan.msc.common.support.java.util.concurrent.a<f> a(com.meituan.msc.common.aov_task.task.c<?> cVar, com.meituan.msc.common.aov_task.task.c<?>... cVarArr) {
        Object[] objArr = {cVar, cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e8c14348859281a2738cecaa968b6e2", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e8c14348859281a2738cecaa968b6e2") : a(new a(cVar, cVarArr));
    }

    public final com.meituan.msc.common.support.java.util.concurrent.a<f> c(@NonNull com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549add6dd8ed1b5c358f77055d918d96", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549add6dd8ed1b5c358f77055d918d96") : a(new d(cVar));
    }

    public final <TaskResult> com.meituan.msc.common.support.java.util.concurrent.a<f> d(@NonNull Class<? extends com.meituan.msc.common.aov_task.task.c<TaskResult>> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5eaaa448c5b2ddcd49bcea049d130a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5eaaa448c5b2ddcd49bcea049d130a") : c((com.meituan.msc.common.aov_task.task.c<?>) c(cls));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e d(com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d8b7205c86481b588b25f16fc2a3a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d8b7205c86481b588b25f16fc2a3a9");
        }
        e eVar = this.e.get(cVar);
        if (eVar == null) {
            for (b bVar : this.h) {
                if ((bVar instanceof a) && ((a) bVar).b == cVar) {
                    String obj = toString();
                    com.meituan.msc.modules.reporter.g.a(obj, "getTaskState in pendingOperationQueue" + cVar);
                    return new e();
                }
            }
        }
        if (eVar != null) {
            return eVar;
        }
        String obj2 = toString();
        com.meituan.msc.modules.reporter.g.a(obj2, "getTaskState TaskNonexistentException" + cVar);
        throw new com.meituan.msc.common.aov_task.exception.e(cVar);
    }

    private boolean f(com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce7bf0f20ba07a876bd532b409b44ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce7bf0f20ba07a876bd532b409b44ee2")).booleanValue();
        }
        if (b(cVar) != com.meituan.msc.common.aov_task.b.PENDING) {
            return false;
        }
        for (com.meituan.msc.common.aov_task.task.c<?> cVar2 : this.c.a(cVar)) {
            if (b(cVar2) != com.meituan.msc.common.aov_task.b.SUCCEED) {
                return false;
            }
        }
        return true;
    }

    private void a(List<com.meituan.msc.common.aov_task.task.c<?>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45a1e92745380385bc4f04b3d7c60609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45a1e92745380385bc4f04b3d7c60609");
        } else if (!list.isEmpty()) {
            if (this.l == null) {
                for (com.meituan.msc.common.aov_task.task.c<?> cVar : list) {
                    if (cVar.a()) {
                        e(cVar);
                    }
                }
                for (com.meituan.msc.common.aov_task.task.c<?> cVar2 : list) {
                    if (!cVar2.a()) {
                        e(cVar2);
                    }
                }
                return;
            }
            for (com.meituan.msc.common.aov_task.task.c<?> cVar3 : list) {
                com.sankuai.waimai.launcher.util.aop.b.a(this.l, i.a(this, cVar3));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(final com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a077c28ad8fca048c4415cfbcd3e4341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a077c28ad8fca048c4415cfbcd3e4341");
            return;
        }
        try {
            e d2 = d(cVar);
            if (!d2.e.compareAndSet(com.meituan.msc.common.aov_task.b.PENDING, com.meituan.msc.common.aov_task.b.RUNNING)) {
                b(this.d.a());
                return;
            }
            d2.a();
            a(cVar, (com.meituan.msc.common.aov_task.context.a) new com.meituan.msc.common.aov_task.context.c(this, cVar)).a(new com.meituan.msc.common.support.java.util.function.b<Object, Throwable, Void>() { // from class: com.meituan.msc.common.aov_task.f.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.support.java.util.function.b
                public final /* synthetic */ Void a(Object obj, Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr2 = {obj, th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e8aec6dc26bff17d58edcee5521835d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e8aec6dc26bff17d58edcee5521835d");
                    }
                    if (th2 != null) {
                        f.this.a((Exception) th2, cVar);
                        return null;
                    }
                    f.this.a(cVar, obj);
                    return null;
                }
            });
        } catch (Exception e2) {
            a(e2, cVar);
        }
    }

    public com.meituan.msc.common.support.java.util.concurrent.a<?> a(com.meituan.msc.common.aov_task.task.c<?> cVar, com.meituan.msc.common.aov_task.context.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b25139f1448099ae4d3a16c142c95318", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b25139f1448099ae4d3a16c142c95318") : cVar.a(aVar);
    }

    public void a(Exception exc, com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {exc, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b180246653902f38a8df60facc40a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b180246653902f38a8df60facc40a2");
            return;
        }
        com.meituan.msc.common.aov_task.exception.g gVar = new com.meituan.msc.common.aov_task.exception.g(cVar, exc);
        this.d.e = gVar;
        e d2 = d(cVar);
        Object[] objArr2 = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, d2, changeQuickRedirect2, false, "ae7e1aedc17ab3ec3b24ded7cce255b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, d2, changeQuickRedirect2, false, "ae7e1aedc17ab3ec3b24ded7cce255b2");
        } else {
            d2.e.set(com.meituan.msc.common.aov_task.b.FAILED);
            d2.b();
            d2.f.b((Throwable) exc);
        }
        b(this.d.a());
        if (this.f != null) {
            this.f.a(exc, cVar, this);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), gVar);
            return;
        }
        throw gVar;
    }

    public void a(com.meituan.msc.common.aov_task.task.c<?> cVar, Object obj) {
        Object[] objArr = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13cf9fa0436dcd1304d41ef70ff17113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13cf9fa0436dcd1304d41ef70ff17113");
            return;
        }
        e eVar = this.e.get(cVar);
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "8330baa3429ca86446ff2f10599f1c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "8330baa3429ca86446ff2f10599f1c83");
        } else {
            eVar.b = obj;
            eVar.e.set(com.meituan.msc.common.aov_task.b.SUCCEED);
            eVar.b();
            eVar.f.d((com.meituan.msc.common.support.java.util.concurrent.a<Object>) obj);
        }
        b(this.d.a());
    }

    private boolean a(Collection<com.meituan.msc.common.aov_task.task.c<?>> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0112692bc52761e45a52d7cdec22501c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0112692bc52761e45a52d7cdec22501c")).booleanValue();
        }
        boolean z = false;
        for (com.meituan.msc.common.aov_task.task.c<?> cVar : collection) {
            com.meituan.msc.common.aov_task.b b2 = b(cVar);
            if (b2 == com.meituan.msc.common.aov_task.b.FAILED) {
                this.m = false;
                this.d.d.b((Throwable) this.d.e);
                return true;
            } else if (b2 != com.meituan.msc.common.aov_task.b.SUCCEED) {
                z = true;
            }
        }
        if (z) {
            return false;
        }
        this.m = false;
        this.d.d.d((com.meituan.msc.common.support.java.util.concurrent.a<f>) this);
        return true;
    }

    private boolean a(Collection<com.meituan.msc.common.aov_task.task.c<?>> collection, com.meituan.msc.common.aov_task.b bVar) {
        Object[] objArr = {collection, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8038e10e54bb76749387f5b96781edb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8038e10e54bb76749387f5b96781edb3")).booleanValue();
        }
        for (com.meituan.msc.common.aov_task.task.c<?> cVar : collection) {
            if (b(cVar) == bVar) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b4816fc21511b2c15db4b30a4aa67c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b4816fc21511b2c15db4b30a4aa67c9")).booleanValue() : this.n.get() || !this.h.isEmpty();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba6a555e7e3fab60e657cb99faa4695e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba6a555e7e3fab60e657cb99faa4695e");
        } else if (this.h.isEmpty()) {
        } else {
            while (!this.h.isEmpty()) {
                b poll = this.h.poll();
                poll.a();
                poll.f.d((com.meituan.msc.common.support.java.util.concurrent.a<f>) this);
            }
        }
    }

    private void b(Collection<com.meituan.msc.common.aov_task.task.c<?>> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b797009096beadc9a1c615923276dd8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b797009096beadc9a1c615923276dd8f");
        } else if (f()) {
            if (a(collection, com.meituan.msc.common.aov_task.b.RUNNING) || !f()) {
                return;
            }
            g();
            this.m = false;
            if (this.n.compareAndSet(true, false)) {
                if (this.o != null) {
                    this.o.d((com.meituan.msc.common.support.java.util.concurrent.a<f>) this);
                }
                if (MSCHornRollbackConfig.d().c().isRollbackTaskManagerChangeOfFixPreloadBizReuseRuntime) {
                    a(collection);
                    return;
                }
                return;
            }
            c();
        } else if (!a(collection)) {
            ArrayList arrayList = new ArrayList();
            for (com.meituan.msc.common.aov_task.task.c<?> cVar : collection) {
                if (f(cVar)) {
                    arrayList.add(cVar);
                }
            }
            a((List<com.meituan.msc.common.aov_task.task.c<?>>) arrayList);
        }
    }

    public final String d() {
        String sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cdec2ad990244c44403e16cf642ad53", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cdec2ad990244c44403e16cf642ad53");
        }
        com.meituan.msc.common.aov_task.e eVar = new com.meituan.msc.common.aov_task.e(this.c);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.aov_task.e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "7e9ba18653afaa262391f354da6818cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "7e9ba18653afaa262391f354da6818cd");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.common.aov_task.e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "99ed80172cd1683228e132dddd5548e9", RobustBitConfig.DEFAULT_VALUE)) {
            sb = (String) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "99ed80172cd1683228e132dddd5548e9");
        } else {
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder("digraph MSC {\n");
            for (Map.Entry<com.meituan.msc.common.aov_task.task.c<?>, List<com.meituan.msc.common.aov_task.task.c<?>>> entry : eVar.b.b().entrySet()) {
                com.meituan.msc.common.aov_task.task.c<?> key = entry.getKey();
                List<com.meituan.msc.common.aov_task.task.c<?>> value = entry.getValue();
                for (com.meituan.msc.common.aov_task.task.c<?> cVar : value) {
                    sb2.append(eVar.a(cVar));
                    sb2.append(" -> ");
                    sb2.append(eVar.a(key));
                    sb2.append(";\n");
                    hashSet.add(cVar);
                }
                if (value.isEmpty()) {
                    sb2.append(DiagnoseLog.ITEM_START);
                    sb2.append(" -> ");
                    sb2.append(eVar.a(key));
                    sb2.append(";\n");
                }
                hashSet.add(key);
            }
            for (com.meituan.msc.common.aov_task.task.c<?> cVar2 : eVar.b.b().keySet()) {
                if (!hashSet.contains(cVar2)) {
                    sb2.append(eVar.a(cVar2));
                    sb2.append(";\n");
                }
            }
            sb2.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            sb = sb2.toString();
        }
        return "http://g.gravizo.com/g?" + Uri.encode(sb);
    }

    private boolean b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb38ffa8e85923244c596e1eb3b37d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb38ffa8e85923244c596e1eb3b37d9")).booleanValue();
        }
        com.meituan.msc.common.aov_task.task.c<?>[] cVarArr = ((a) bVar).c;
        if (cVarArr.length == 0) {
            return true;
        }
        for (com.meituan.msc.common.aov_task.task.c<?> cVar : cVarArr) {
            if (this.e.get(cVar) == null) {
                com.meituan.msc.modules.reporter.g.d(this.b, "isDependTaskExecuted", cVar);
                this.k = true;
                return false;
            } else if (d(cVar).e.get() != com.meituan.msc.common.aov_task.b.SUCCEED) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class e {
        public static ChangeQuickRedirect a;
        Object b;
        public long c;
        public long d;
        public AtomicReference<com.meituan.msc.common.aov_task.b> e;
        public com.meituan.msc.common.support.java.util.concurrent.a<Object> f;

        private e() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9afcd628aeb00c3ad8b1766fbb458cc3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9afcd628aeb00c3ad8b1766fbb458cc3");
                return;
            }
            this.c = -1L;
            this.d = -1L;
            this.e = new AtomicReference<>(com.meituan.msc.common.aov_task.b.PENDING);
            this.f = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18db81a0b3c60493c7d547acf70f0117", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18db81a0b3c60493c7d547acf70f0117");
            } else {
                this.c = SystemClock.elapsedRealtime();
            }
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19a04b226c3c1ad65465a0c201d27e77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19a04b226c3c1ad65465a0c201d27e77");
            } else {
                this.d = SystemClock.elapsedRealtime();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public abstract class b {
        public static ChangeQuickRedirect e;
        final com.meituan.msc.common.support.java.util.concurrent.a<f> f;

        public abstract void a();

        public abstract com.meituan.msc.common.aov_task.task.c<?> b();

        private b() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70d8077aa9011f2b30626f23559ea931", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70d8077aa9011f2b30626f23559ea931");
            } else {
                this.f = new com.meituan.msc.common.support.java.util.concurrent.a<>();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends b {
        public static ChangeQuickRedirect a;
        public final com.meituan.msc.common.aov_task.task.c<?> b;
        final com.meituan.msc.common.aov_task.task.c<?>[] c;

        public a(com.meituan.msc.common.aov_task.task.c<?> cVar, com.meituan.msc.common.aov_task.task.c<?>... cVarArr) {
            super();
            Object[] objArr = {f.this, cVar, cVarArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa59f7c964bb162881de7555a84a1646", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa59f7c964bb162881de7555a84a1646");
                return;
            }
            this.b = cVar;
            this.c = cVarArr;
        }

        @Override // com.meituan.msc.common.aov_task.f.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d1d7b304833b24cabe7f810444e61f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d1d7b304833b24cabe7f810444e61f8");
                return;
            }
            f fVar = f.this;
            com.meituan.msc.common.aov_task.task.c<?> cVar = this.b;
            Object[] objArr2 = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "87bae1d22ac9457d378d9c1cedc75b0f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "87bae1d22ac9457d378d9c1cedc75b0f")).booleanValue() : fVar.e.containsKey(cVar)) {
                throw new com.meituan.msc.common.aov_task.exception.d(this.b, "Can't add same task twice");
            }
            com.meituan.msc.modules.reporter.g.d(f.this.b, "AddTaskOperation", this.b);
            synchronized (f.this) {
                com.meituan.msc.common.aov_task.d dVar = f.this.c;
                com.meituan.msc.common.aov_task.task.c<?> cVar2 = this.b;
                com.meituan.msc.common.aov_task.task.c<?>[] cVarArr = this.c;
                Object[] objArr3 = {cVar2, cVarArr};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.common.aov_task.d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "79e1303f725666abb5f410f67d66ec7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "79e1303f725666abb5f410f67d66ec7c");
                } else {
                    for (com.meituan.msc.common.aov_task.task.c<?> cVar3 : cVarArr) {
                        if (!dVar.b.containsKey(cVar3)) {
                            throw new IllegalStateException(String.format("Please add %s first, then add %s", cVar3, cVar2));
                        }
                    }
                    dVar.a(cVar2, new ArrayList(Arrays.asList(cVarArr)));
                }
                f.this.e.put(this.b, new e());
                Class<?> cls = this.b.getClass();
                if (f.this.g.containsKey(cls)) {
                    f.this.g.put(cls, null);
                } else {
                    f.this.g.put(cls, this.b);
                }
            }
            f.this.d.c = null;
        }

        @Override // com.meituan.msc.common.aov_task.f.b
        public final com.meituan.msc.common.aov_task.task.c<?> b() {
            return this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c extends b {
        public static ChangeQuickRedirect a;
        private final com.meituan.msc.common.aov_task.task.c<?> c;

        public c(com.meituan.msc.common.aov_task.task.c<?> cVar) {
            super();
            Object[] objArr = {f.this, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd6d224dc3a8676068d3132f35cb7f88", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd6d224dc3a8676068d3132f35cb7f88");
            } else {
                this.c = cVar;
            }
        }

        @Override // com.meituan.msc.common.aov_task.f.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab43062ad0a689fcaae44f1e591fd400", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab43062ad0a689fcaae44f1e591fd400");
                return;
            }
            synchronized (f.this) {
                com.meituan.msc.common.aov_task.d dVar = f.this.c;
                com.meituan.msc.common.aov_task.task.c<?> cVar = this.c;
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.aov_task.d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "a07cc269dd2aa0da59a8221e023a9512", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "a07cc269dd2aa0da59a8221e023a9512");
                } else {
                    dVar.b.remove(cVar);
                    Iterator<List<com.meituan.msc.common.aov_task.task.c<?>>> it = dVar.b.values().iterator();
                    while (it.hasNext() && !it.next().remove(cVar)) {
                    }
                    dVar.c = null;
                }
                f.this.e.remove(this.c);
                Class<?> cls = this.c.getClass();
                if (f.this.g.get(cls) != null) {
                    f.this.g.remove(cls);
                } else {
                    f.this.g.remove(cls);
                    Iterator<com.meituan.msc.common.aov_task.task.c<?>> it2 = f.this.a().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        com.meituan.msc.common.aov_task.task.c<?> next = it2.next();
                        if (next.getClass() == cls) {
                            if (f.this.g.containsKey(cls)) {
                                f.this.g.put(cls, null);
                                break;
                            }
                            f.this.g.put(cls, next);
                        }
                    }
                }
            }
            f.this.d.c = null;
        }

        @Override // com.meituan.msc.common.aov_task.f.b
        public final com.meituan.msc.common.aov_task.task.c<?> b() {
            return this.c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class d extends b {
        public static ChangeQuickRedirect a;
        private final com.meituan.msc.common.aov_task.task.c<?> c;

        public d(com.meituan.msc.common.aov_task.task.c<?> cVar) {
            super();
            Object[] objArr = {f.this, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4494d4306a2f4274de1532e88dd84468", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4494d4306a2f4274de1532e88dd84468");
            } else {
                this.c = cVar;
            }
        }

        @Override // com.meituan.msc.common.aov_task.f.b
        public final void a() {
            Collection<com.meituan.msc.common.aov_task.task.c<?>> collection;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7446863315307c0688f90f603e45bc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7446863315307c0688f90f603e45bc8");
                return;
            }
            f fVar = f.this;
            com.meituan.msc.common.aov_task.task.c<?> cVar = this.c;
            Object[] objArr2 = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "be3b4db70fdc0b3016a67f54dbe71fca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "be3b4db70fdc0b3016a67f54dbe71fca");
            } else if (fVar.d(cVar).e.get().a()) {
                e eVar = fVar.e.get(cVar);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "7d1819dcf8e78c90b3c6aa54bfae7c40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "7d1819dcf8e78c90b3c6aa54bfae7c40");
                } else {
                    eVar.b = null;
                    eVar.e.set(com.meituan.msc.common.aov_task.b.PENDING);
                    eVar.f = new com.meituan.msc.common.support.java.util.concurrent.a<>();
                }
                com.meituan.msc.common.aov_task.d dVar = fVar.c;
                Object[] objArr4 = {cVar};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.common.aov_task.d.a;
                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "b000cab05d063eb82dd557e275b32eed", RobustBitConfig.DEFAULT_VALUE)) {
                    collection = (Collection) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "b000cab05d063eb82dd557e275b32eed");
                } else {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.common.aov_task.d.a;
                    if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "d419ffdf023143c1292cb861ceeda6fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "d419ffdf023143c1292cb861ceeda6fa");
                    } else if (dVar.c == null) {
                        ad adVar = new ad();
                        for (Map.Entry<com.meituan.msc.common.aov_task.task.c<?>, List<com.meituan.msc.common.aov_task.task.c<?>>> entry : dVar.b.entrySet()) {
                            com.meituan.msc.common.aov_task.task.c<?> key = entry.getKey();
                            if (!adVar.containsKey(key)) {
                                adVar.put(key, null);
                            }
                            for (com.meituan.msc.common.aov_task.task.c<?> cVar2 : entry.getValue()) {
                                List list = (List) adVar.get(cVar2);
                                if (list == null) {
                                    list = new ArrayList();
                                    adVar.put(cVar2, list);
                                }
                                list.add(key);
                            }
                        }
                        dVar.c = adVar;
                    }
                    collection = dVar.c.get(cVar);
                    if (collection == null) {
                        collection = Collections.emptyList();
                    }
                }
                for (com.meituan.msc.common.aov_task.task.c<?> cVar3 : collection) {
                    if (fVar.d(cVar3).e.get().a()) {
                        fVar.c(cVar3);
                    }
                }
                cVar.a(new com.meituan.msc.common.aov_task.context.d(fVar, cVar));
            }
        }

        @Override // com.meituan.msc.common.aov_task.f.b
        public final com.meituan.msc.common.aov_task.task.c<?> b() {
            return this.c;
        }
    }

    public final void a(String str) {
        this.i = str;
    }

    private com.meituan.msc.common.support.java.util.concurrent.a<f> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d09840c0f8f3acc610dc0f64aea535", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d09840c0f8f3acc610dc0f64aea535");
        }
        if (!this.m) {
            return com.meituan.msc.common.support.java.util.concurrent.a.c(this);
        }
        if (this.n.compareAndSet(false, true)) {
            com.meituan.msc.common.support.java.util.concurrent.a<f> aVar = new com.meituan.msc.common.support.java.util.concurrent.a<>();
            this.o = aVar;
            return aVar;
        }
        return this.o;
    }

    public final com.meituan.msc.common.support.java.util.concurrent.a<f> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21934f7146c01161926c49e660477abd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21934f7146c01161926c49e660477abd");
        }
        if (this.m) {
            return com.meituan.msc.common.support.java.util.concurrent.a.c(this);
        }
        this.m = true;
        b(this.d.a());
        return com.meituan.msc.common.support.java.util.concurrent.a.c(this);
    }

    public com.meituan.msc.common.support.java.util.concurrent.a<f> a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae77daf2c20f0d9094bb647967ef431", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae77daf2c20f0d9094bb647967ef431");
        }
        if (!this.m) {
            if (MSCHornRollbackConfig.d().c().enableExecuteAllPendingOperations) {
                g();
            }
            bVar.a();
            bVar.f.d((com.meituan.msc.common.support.java.util.concurrent.a<f>) this);
        } else if (MSCHornRollbackConfig.d().c().isRollbackTaskManagerExecutePendingTaskChange) {
            com.meituan.msc.modules.reporter.g.d(this.b, "addOperation", bVar.b());
            this.h.add(bVar);
        } else {
            com.meituan.msc.common.aov_task.task.c<?> b2 = bVar.b();
            if ((bVar instanceof a) && b(bVar)) {
                com.meituan.msc.modules.reporter.g.d(this.b, "executeTasksImmediately", b2);
                bVar.a();
                e(b2);
            } else {
                com.meituan.msc.modules.reporter.g.d(this.b, "addOperation", b2);
                this.h.add(bVar);
            }
        }
        return bVar.f;
    }
}
