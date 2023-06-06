package com.sankuai.meituan.retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.e;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ag {
    public static ChangeQuickRedirect a;
    private static final ag b = d();

    public Executor b() {
        return null;
    }

    public Executor c() {
        return null;
    }

    public static ag a() {
        return b;
    }

    private static ag d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93b423a3dd159f8928c57b7c74e21562", 6917529027641081856L)) {
            return (ag) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93b423a3dd159f8928c57b7c74e21562");
        }
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        return new ag();
    }

    public e.a a(Executor executor) {
        Object[] objArr = {executor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36e12c0e50d8ba653b440d5bf7a1ba11", 6917529027641081856L)) {
            return (e.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36e12c0e50d8ba653b440d5bf7a1ba11");
        }
        if (executor != null) {
            return new l(executor);
        }
        return j.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends ag {
        public static ChangeQuickRedirect b;
        private static final Executor c = Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.sankuai.meituan.retrofit2.ag.a.1
            public static ChangeQuickRedirect a;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                Object[] objArr = {runnable};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06756daba1ad5be0fe88ac015e4ea5f4", 6917529027641081856L) ? (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06756daba1ad5be0fe88ac015e4ea5f4") : new Thread(new Runnable() { // from class: com.sankuai.meituan.retrofit2.ag.a.1.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4d806c82bb588f05e26ca08d4cd6f50", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4d806c82bb588f05e26ca08d4cd6f50");
                            return;
                        }
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "Retrofit-MT-Idle");
            }
        });

        @Override // com.sankuai.meituan.retrofit2.ag
        public final Executor b() {
            return c;
        }

        @Override // com.sankuai.meituan.retrofit2.ag
        public final Executor c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afaa852cf9df52e0f570c934c2e59648", 6917529027641081856L) ? (Executor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afaa852cf9df52e0f570c934c2e59648") : new ExecutorC0626a();
        }

        @Override // com.sankuai.meituan.retrofit2.ag
        public final e.a a(Executor executor) {
            Object[] objArr = {executor};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11aede66c47450787d90c6f485ceb4dc", 6917529027641081856L) ? (e.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11aede66c47450787d90c6f485ceb4dc") : new l(executor);
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.meituan.retrofit2.ag$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static class ExecutorC0626a implements Executor {
            public static ChangeQuickRedirect a;
            private final Handler b;

            public ExecutorC0626a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e9c6e13a870d02b2a7b4c7df6f3123", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e9c6e13a870d02b2a7b4c7df6f3123");
                } else {
                    this.b = new Handler(Looper.getMainLooper());
                }
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Object[] objArr = {runnable};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd8b698eba83b4758711c2ffcbe4b81", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd8b698eba83b4758711c2ffcbe4b81");
                } else {
                    this.b.post(runnable);
                }
            }
        }
    }
}
