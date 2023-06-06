package com.sankuai.android.jarvis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j extends AbstractExecutorService {
    public static ChangeQuickRedirect a;
    private final ArrayDeque<Runnable> b;
    private Runnable c;
    private final String d;
    private final boolean e;
    private boolean f;
    private final n g;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    public j(String str) {
        this(str, false);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a85469504e70590e8f0af3bb8d9e70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a85469504e70590e8f0af3bb8d9e70");
        }
    }

    private j(String str, boolean z) {
        this(str, false, null);
        Object[] objArr = {str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79d4b5e7d890da973fb9b87f672cf999", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79d4b5e7d890da973fb9b87f672cf999");
        }
    }

    public j(String str, boolean z, n nVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d31e0d6030968c700de87813c0e8b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d31e0d6030968c700de87813c0e8b5");
            return;
        }
        this.b = new ArrayDeque<>();
        this.f = false;
        this.d = str;
        this.e = z;
        this.g = nVar;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42a2099865d4a61ae7d67be9d79dc53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42a2099865d4a61ae7d67be9d79dc53");
        } else if (isShutdown()) {
        } else {
            this.b.offer(new h(runnable, this.d, this.g) { // from class: com.sankuai.android.jarvis.j.1
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.android.jarvis.h, java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "905de64d4ae473c0ff3430b343eb8d4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "905de64d4ae473c0ff3430b343eb8d4e");
                        return;
                    }
                    try {
                        super.run();
                    } finally {
                        j.this.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b90fa5873f43b00493ee674ea3fbc7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b90fa5873f43b00493ee674ea3fbc7d");
            return;
        }
        Runnable poll = this.b.poll();
        this.c = poll;
        if (poll != null) {
            f.a().e().execute(this.c);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        if (this.e) {
            this.f = true;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized List<Runnable> shutdownNow() {
        ArrayList arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e43b88b3dfeeab51d7eb70c7d1c1942", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e43b88b3dfeeab51d7eb70c7d1c1942");
        } else if (this.e) {
            this.f = true;
            synchronized (this) {
                arrayList = new ArrayList(this.b);
                this.b.clear();
            }
            return arrayList;
        } else {
            return null;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f;
    }
}
