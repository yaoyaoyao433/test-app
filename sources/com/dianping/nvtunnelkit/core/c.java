package com.dianping.nvtunnelkit.core;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.d;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final c c = new c();
    public final rx.g b;
    private final Map<Runnable, a> d;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public rx.d a;
        public k b;
    }

    public static c a() {
        return c;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d6d23cdfbb2fc1e864e1c865e33040f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d6d23cdfbb2fc1e864e1c865e33040f");
            return;
        }
        this.d = new ConcurrentHashMap();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 8, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.dianping.nvtunnelkit.core.c.1
            public static ChangeQuickRedirect a;
            private final AtomicInteger c = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(@NonNull Runnable runnable) {
                Object[] objArr2 = {runnable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33f875bd074db8ec6b3fc805ba469653", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33f875bd074db8ec6b3fc805ba469653");
                }
                return new Thread(runnable, "tunnelkit_exec#" + this.c.getAndIncrement());
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.b = rx.schedulers.a.a(threadPoolExecutor);
    }

    public final void a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d463fd80cb5e25052c27cad1c1a22bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d463fd80cb5e25052c27cad1c1a22bf0");
        } else if (runnable == null) {
        } else {
            rx.d b = rx.d.a((d.a) new d.a<Object>() { // from class: com.dianping.nvtunnelkit.core.c.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    rx.j jVar = (rx.j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e4383222fb88749c93fee783793bc7a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e4383222fb88749c93fee783793bc7a");
                        return;
                    }
                    try {
                        runnable.run();
                        jVar.onNext("");
                        jVar.onCompleted();
                    } finally {
                        c.this.d.remove(runnable);
                    }
                }
            }).b(this.b);
            a aVar = new a();
            aVar.a = b;
            this.d.put(runnable, aVar);
            aVar.b = rx.d.a(new j(), b);
        }
    }

    public final void a(final Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7321156ec8a25d25f9cc5b6196abf225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7321156ec8a25d25f9cc5b6196abf225");
        } else if (runnable == null) {
        } else {
            rx.d<Long> b = rx.d.a(j, TimeUnit.MILLISECONDS, this.b).b(new rx.functions.b<Long>() { // from class: com.dianping.nvtunnelkit.core.c.3
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Long l) {
                    Object[] objArr2 = {l};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6b94ebfb7d7b5a18e72aa8391062ea6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6b94ebfb7d7b5a18e72aa8391062ea6");
                        return;
                    }
                    try {
                        runnable.run();
                    } finally {
                        c.this.d.remove(runnable);
                    }
                }
            });
            a aVar = new a();
            aVar.a = b;
            this.d.put(runnable, aVar);
            aVar.b = rx.d.a(new j(), b);
        }
    }

    public final void b(Runnable runnable) {
        a remove;
        k kVar;
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34edb8710a42fac2a0c47244ef32489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34edb8710a42fac2a0c47244ef32489");
        } else if (runnable == null || (remove = this.d.remove(runnable)) == null || (kVar = remove.b) == null || kVar.isUnsubscribed()) {
        } else {
            kVar.unsubscribe();
        }
    }
}
