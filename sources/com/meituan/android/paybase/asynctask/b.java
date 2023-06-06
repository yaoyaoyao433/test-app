package com.meituan.android.paybase.asynctask;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b<Params, Progress, Result> {
    public static ChangeQuickRedirect j;
    static final HandlerC0328b k = new HandlerC0328b();
    private final d<Params, Result> a;
    private final FutureTask<Result> b;
    private final AtomicBoolean c;
    public volatile c l;

    public abstract Result a(Params... paramsArr);

    public void a(Result result) {
    }

    public static /* synthetic */ void b(b bVar, Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3df6c044f26b6ff34f980f5680536ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3df6c044f26b6ff34f980f5680536ce0");
        } else if (bVar.c.get()) {
        } else {
            bVar.b(obj);
        }
    }

    public static /* synthetic */ void c(b bVar, Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "9b9dff78f5b07ad96ec30cd3bf1a4163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "9b9dff78f5b07ad96ec30cd3bf1a4163");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "56a01d9a3360ef300eeee2055b22b255", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "56a01d9a3360ef300eeee2055b22b255")).booleanValue() : bVar.b.isCancelled()) {
            Object[] objArr3 = {obj};
            ChangeQuickRedirect changeQuickRedirect3 = j;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "905833c43f0ed08e89c1b69351151072", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "905833c43f0ed08e89c1b69351151072");
            }
        } else {
            bVar.a((b) obj);
        }
        bVar.l = c.FINISHED;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum c {
        PENDING,
        RUNNING,
        FINISHED;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe2fb374eebbabfbd28c1155414469e6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe2fb374eebbabfbd28c1155414469e6");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f8f4c1cc0cba160962488fad4edd18a", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f8f4c1cc0cba160962488fad4edd18a") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa62fe2fdd618a2df6fdf16fec468b12", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa62fe2fdd618a2df6fdf16fec468b12") : (c[]) values().clone();
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb35d3aa1a2449312f5bbee0aedf442b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb35d3aa1a2449312f5bbee0aedf442b");
            return;
        }
        this.l = c.PENDING;
        this.c = new AtomicBoolean();
        this.a = new d<Params, Result>() { // from class: com.meituan.android.paybase.asynctask.b.1
            public static ChangeQuickRedirect a;

            @Override // java.util.concurrent.Callable
            public final Result call() throws Exception {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f15f3169a2c91dabfdf8526d249c1e32", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Result) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f15f3169a2c91dabfdf8526d249c1e32");
                }
                b.this.c.set(true);
                Process.setThreadPriority(10);
                return (Result) b.this.b(b.this.a((Object[]) this.c));
            }
        };
        this.b = new FutureTask<Result>(this.a) { // from class: com.meituan.android.paybase.asynctask.b.2
            public static ChangeQuickRedirect a;

            @Override // java.util.concurrent.FutureTask
            public final void done() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a87fdc9076fbbe9d2b75968c035fc84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a87fdc9076fbbe9d2b75968c035fc84");
                    return;
                }
                try {
                    b.b(b.this, super.get());
                } catch (InterruptedException e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "ModernAsyncTask_done", (Map<String, Object>) null);
                } catch (CancellationException e2) {
                    com.meituan.android.paybase.common.analyse.a.a(e2, "ModernAsyncTask_done", (Map<String, Object>) null);
                    b.b(b.this, null);
                } catch (ExecutionException e3) {
                    com.meituan.android.paybase.common.analyse.a.a(e3, "ModernAsyncTask_done", (Map<String, Object>) null);
                    throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
                } catch (Throwable th) {
                    com.meituan.android.paybase.common.analyse.a.a(th, "ModernAsyncTask_done", (Map<String, Object>) null);
                    throw new RuntimeException("An error occured while executing doInBackground()", th);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result b(Result result) {
        Object[] objArr = {result};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ef541b5e32ddfd9235432ffaa10a0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Result) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ef541b5e32ddfd9235432ffaa10a0e");
        }
        k.obtainMessage(1, new a(this, result)).sendToTarget();
        return result;
    }

    public final boolean cancel(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6c0a1fbdab64870d165604c2899c0f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6c0a1fbdab64870d165604c2899c0f")).booleanValue() : this.b.cancel(z);
    }

    public final b<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        Object[] objArr = {executor, paramsArr};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3fdf9a27be70ca4a36908f0744dbed1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3fdf9a27be70ca4a36908f0744dbed1");
        }
        if (this.l != c.PENDING) {
            switch (this.l) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.l = c.RUNNING;
        this.a.c = paramsArr;
        com.sankuai.waimai.launcher.util.aop.b.a(executor, this.b);
        return this;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.asynctask.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class HandlerC0328b extends Handler {
        public static ChangeQuickRedirect a;

        public HandlerC0328b() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db7a52efd6e3dfd9ca4bd39e69c1b96", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db7a52efd6e3dfd9ca4bd39e69c1b96");
                return;
            }
            a aVar = (a) message.obj;
            if (message.what != 1) {
                return;
            }
            b.c(aVar.a, aVar.b[0]);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class d<Params, Result> implements Callable<Result> {
        public Params[] c;

        public d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a<Data> {
        public final b a;
        public final Data[] b;

        public a(b bVar, Data... dataArr) {
            this.a = bVar;
            this.b = dataArr;
        }
    }
}
