package com.android.meituan.multiprocess;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.meituan.multiprocess.IPCTask;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e {
    private static Context a = null;
    private static boolean b = false;
    private static Object c = new Object();
    private static HashMap<String, CountDownLatch> d = new HashMap<>();

    public static synchronized void a(Context context, com.android.meituan.multiprocess.init.a aVar) {
        synchronized (e.class) {
            a(context, aVar, (String) null);
        }
    }

    public static synchronized void a(Context context, com.android.meituan.multiprocess.init.a aVar, String str) {
        synchronized (e.class) {
            if (context != null) {
                try {
                    a = context.getApplicationContext();
                } catch (Throwable th) {
                    throw th;
                }
            }
            c cVar = new c() { // from class: com.android.meituan.multiprocess.e.1
                @Override // com.android.meituan.multiprocess.c
                public final void a(String str2, String str3) {
                    f a2 = f.a();
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    a2.a.put(str2, str3);
                }

                @Override // com.android.meituan.multiprocess.c
                public final void a(a aVar2) {
                    d.a(aVar2);
                }
            };
            aVar.addService(cVar);
            aVar.addServiceManager(cVar);
            aVar.onAddTypeTransfer(new com.android.meituan.multiprocess.init.b() { // from class: com.android.meituan.multiprocess.e.2
                @Override // com.android.meituan.multiprocess.init.b
                public final void a(com.android.meituan.multiprocess.transfer.e eVar) {
                    com.android.meituan.multiprocess.transfer.j.a(eVar);
                }
            });
            aVar.setLog(cVar);
            CountDownLatch b2 = b(str);
            if (b2 != null) {
                b2.countDown();
            }
            if (b) {
                if (TextUtils.isEmpty(str)) {
                    d.a("IPC init end");
                    return;
                }
                d.a("IPC init end。 channel " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context a() {
        return a;
    }

    private static CountDownLatch b(String str) {
        CountDownLatch countDownLatch;
        if (TextUtils.isEmpty(str)) {
            str = IPCBaseContentProvider.IPC_DEFAULT_CHANNEL;
        }
        synchronized (c) {
            countDownLatch = d.get(str);
            if (countDownLatch == null) {
                countDownLatch = new CountDownLatch(1);
                d.put(str, countDownLatch);
            }
        }
        return countDownLatch;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(String str, int i) {
        if (b) {
            d.a("waitInit start " + str);
        }
        CountDownLatch b2 = b(str);
        if (b2 != null) {
            try {
                if (i < 0) {
                    b2.await();
                } else {
                    b2.await(i, TimeUnit.SECONDS);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return -1;
            }
        }
        if (b) {
            d.a("waitInit end " + str);
            return 0;
        }
        return 0;
    }

    public static void a(boolean z) {
        b = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return b;
    }

    public static <T extends com.android.meituan.multiprocess.invoker.c<InputType, ResultType>, InputType, ResultType> ResultType a(String str, InputType inputtype, Class<T> cls) throws com.android.meituan.multiprocess.exception.a {
        long currentTimeMillis = System.currentTimeMillis();
        IPCTask.a aVar = new IPCTask.a(IPCTask.a(str), cls);
        aVar.a = null;
        ResultType resulttype = (ResultType) aVar.a();
        d.a("invoker_sync", cls, null, System.currentTimeMillis() - currentTimeMillis);
        return resulttype;
    }

    public static <T extends com.android.meituan.multiprocess.invoker.a<InputType, ResultType>, InputType, ResultType> void a(String str, InputType inputtype, Class<T> cls, com.android.meituan.multiprocess.invoker.b<ResultType> bVar) throws com.android.meituan.multiprocess.exception.a {
        final IPCTask.Async async = new IPCTask.Async(IPCTask.a(str), cls);
        async.a = inputtype;
        async.c = bVar;
        if (async.d == null || async.b == null) {
            d.a("invoke failed, task is null or taskClass is null");
        } else if (async.a != null && com.android.meituan.multiprocess.transfer.j.a(async.a) == null) {
            throw com.android.meituan.multiprocess.exception.a.a(async.a.getClass().getName());
        } else {
            k.a(new Runnable() { // from class: com.android.meituan.multiprocess.IPCTask.Async.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = Async.this.d.a;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = ProcessUtils.getCurrentProcessName(e.a());
                    }
                    if (i.a(str2)) {
                        ((com.android.meituan.multiprocess.invoker.a) g.a(Async.this.b.getName())).a(Async.this.a, Async.this.c);
                        return;
                    }
                    IIPCBrige a2 = b.a().a(str2);
                    if (a2 != null) {
                        try {
                            a2.invokeAsync(IPCTask.a(new WrapperParcelable(Async.this.a)), Async.this.b.getName(), Async.this.c != null ? new CallbackWrapper(Async.this.c) : null);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            d.a("invoker_async", Async.this.b, e.getMessage(), -1L);
                        }
                    }
                }
            });
        }
        d.a("invoker_async", cls, null, -1L);
    }

    public static void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final b a2 = b.a();
        k.a(new Runnable() { // from class: com.android.meituan.multiprocess.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(str, IPCBaseContentProvider.METHOD_BINDER_INVOKER, null, e.a());
            }
        });
    }
}
