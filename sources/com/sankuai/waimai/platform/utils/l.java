package com.sankuai.waimai.platform.utils;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l {
    public static ChangeQuickRedirect a;
    @NonNull
    private static final HashMap<String, List<d>> b = new HashMap<>();
    @NonNull
    private static final HashMap<String, List<Runnable>> c = new HashMap<>();
    @NonNull
    private static final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public abstract void a();

        public void b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class c<T> {
        public abstract T a();

        public abstract void a(T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static final class b<T> extends AsyncTask<Void, Void, T> implements d {
        public static ChangeQuickRedirect a;
        @Nullable
        private final String b;
        @Nullable
        private c<T> c;
        @Nullable
        private a d;

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Void[] voidArr) {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "624d110a943f859481cd429083fb9fcc", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "624d110a943f859481cd429083fb9fcc");
            }
            if (this.c != null) {
                return this.c.a();
            }
            if (this.d != null) {
                this.d.a();
                return null;
            }
            return null;
        }

        private b(@NonNull c<T> cVar, @Nullable String str) {
            Object[] objArr = {cVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f279029308a21473e7022afdbdb0f5c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f279029308a21473e7022afdbdb0f5c");
                return;
            }
            this.c = cVar;
            this.d = null;
            this.b = str;
        }

        private b(@NonNull a aVar, @Nullable String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c47fa25484d4d62a17fcccee0df538c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c47fa25484d4d62a17fcccee0df538c");
                return;
            }
            this.c = null;
            this.d = aVar;
            this.b = str;
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d9bb30429b71b5fd1ce20dbb43c2163", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d9bb30429b71b5fd1ce20dbb43c2163");
            } else {
                l.c(this, this.b);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b085416310babe98f0062afde5def9a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b085416310babe98f0062afde5def9a0");
                return;
            }
            l.d(this, this.b);
            if (this.c != null) {
                try {
                    this.c.a(t);
                } catch (Throwable th) {
                    l.b(th);
                }
            } else if (this.d != null) {
                try {
                    this.d.b();
                } catch (Throwable th2) {
                    l.b(th2);
                }
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3e2f771a32bb31ef3e54439ecf9aae7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3e2f771a32bb31ef3e54439ecf9aae7");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(this, o.a(), new Void[0]);
            }
        }

        @Override // com.sankuai.waimai.platform.utils.l.d
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db7e36e86673c592c3be559e69b9f9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db7e36e86673c592c3be559e69b9f9d");
                return;
            }
            cancel(true);
            this.c = null;
            this.d = null;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa39db1db47162904d8f03c5a50ed66c", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa39db1db47162904d8f03c5a50ed66c");
            }
            return "Task of Action " + this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "039a3313b71cadd542892cc4ad298475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "039a3313b71cadd542892cc4ad298475");
        } else {
            com.sankuai.waimai.foundation.core.exception.a.b(th);
        }
    }

    public static <T> void a(@NonNull final c<T> cVar, @Nullable final String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "061ef1288f4d6ad6081b0e17203fd4b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "061ef1288f4d6ad6081b0e17203fd4b5");
        } else {
            a(new Runnable() { // from class: com.sankuai.waimai.platform.utils.l.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9964a61e96d2e02354ae017fcb3fcde4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9964a61e96d2e02354ae017fcb3fcde4");
                        return;
                    }
                    try {
                        new b(c.this, str).a();
                    } catch (Exception e) {
                        l.b(e);
                    }
                }
            }, str);
        }
    }

    public static <T> void a(@NonNull final a aVar, @Nullable final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08e63291e3603b9e93f4df10353276aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08e63291e3603b9e93f4df10353276aa");
        } else {
            a(new Runnable() { // from class: com.sankuai.waimai.platform.utils.l.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ee47e94294c851eb4e0b47a26c65834", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ee47e94294c851eb4e0b47a26c65834");
                        return;
                    }
                    try {
                        new b(a.this, str).a();
                    } catch (Exception e) {
                        l.b(e);
                    }
                }
            }, str);
        }
    }

    public static <T> void b(@NonNull final a aVar, @Nullable String str) {
        Object[] objArr = {aVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b00e4a528353b9a8cc45b068e4db227d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b00e4a528353b9a8cc45b068e4db227d");
        } else {
            a(new Runnable() { // from class: com.sankuai.waimai.platform.utils.l.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61c2cde405ae4f7fddb00c6426b34144", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61c2cde405ae4f7fddb00c6426b34144");
                        return;
                    }
                    try {
                        b bVar = new b(a.this, r2);
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e4e6410c5305c8e36c080eda880aea86", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e4e6410c5305c8e36c080eda880aea86");
                        } else {
                            com.sankuai.waimai.launcher.util.aop.b.a(bVar, AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                        }
                    } catch (Exception e) {
                        l.b(e);
                    }
                }
            }, (String) null);
        }
    }

    public static void a(@NonNull Runnable runnable, @Nullable String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d62b48fea1eb10375bf7056d9aa7b87c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d62b48fea1eb10375bf7056d9aa7b87c");
        } else {
            a(runnable, false, str);
        }
    }

    public static void a(@NonNull Runnable runnable, boolean z, @Nullable String str) {
        Object[] objArr = {runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0df7b5948aa6e58f2d1a67b453162650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0df7b5948aa6e58f2d1a67b453162650");
        } else if (a()) {
            b(runnable);
        } else {
            b(runnable, z, str);
        }
    }

    public static void b(@NonNull Runnable runnable, @Nullable String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6a3f6b0812fd165264ac35796166ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6a3f6b0812fd165264ac35796166ec6");
        } else {
            b(runnable, false, str);
        }
    }

    private static void b(@NonNull final Runnable runnable, boolean z, @Nullable final String str) {
        Object[] objArr = {runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02517bcf686d1b9d1a5dc384734b1b3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02517bcf686d1b9d1a5dc384734b1b3a");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.platform.utils.l.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3a19a29151c8a49e8100a6df8c17e6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3a19a29151c8a49e8100a6df8c17e6c");
                    return;
                }
                l.b(runnable);
                l.e(this, str);
            }
        };
        d(runnable2, str);
        if (z) {
            d.postAtFrontOfQueue(runnable2);
        } else {
            d.post(runnable2);
        }
    }

    public static void a(@NonNull final Runnable runnable, int i, @Nullable final String str) {
        Object[] objArr = {runnable, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc3432fee4bce3574c98a52bf871d160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc3432fee4bce3574c98a52bf871d160");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.platform.utils.l.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c80803dab57b4bb45cad24bc660bd5cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c80803dab57b4bb45cad24bc660bd5cd");
                    return;
                }
                l.b(runnable);
                l.e(this, str);
            }
        };
        d(runnable2, str);
        d.postDelayed(runnable2, i);
    }

    @MainThread
    public static void cancel(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5b614978551734f89b85e4fac6350e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5b614978551734f89b85e4fac6350e3");
        } else if (str != null) {
            a("TaskHelper.cancel");
            synchronized (b) {
                List<d> remove = b.remove(str);
                Object[] objArr2 = {remove};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0e2208f7c4688f2aa8f5a5fb4cdd4a8a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0e2208f7c4688f2aa8f5a5fb4cdd4a8a");
                } else if (remove != null) {
                    for (d dVar : remove) {
                        dVar.b();
                    }
                    remove.clear();
                }
            }
            synchronized (c) {
                List<Runnable> remove2 = c.remove(str);
                Object[] objArr3 = {remove2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "44f49a0691cd221fce99c50ffaa81023", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "44f49a0691cd221fce99c50ffaa81023");
                } else if (remove2 != null) {
                    for (Runnable runnable : remove2) {
                        d.removeCallbacks(runnable);
                    }
                    remove2.clear();
                }
            }
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3c5f183b6704d6d274573f7d7ab1b58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3c5f183b6704d6d274573f7d7ab1b58");
        } else if (a()) {
        } else {
            b(new RuntimeException(str + "要在主线程调用!"));
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a56a4dc2afca0bd24e4ae54113128b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a56a4dc2afca0bd24e4ae54113128b3")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01152b7c0510c9c2a19c5c9931012d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01152b7c0510c9c2a19c5c9931012d55");
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            b(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(@NonNull d dVar, @Nullable String str) {
        synchronized (l.class) {
            Object[] objArr = {dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da0039e5929629a9d9a765bdbd77f533", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da0039e5929629a9d9a765bdbd77f533");
                return;
            }
            List<d> list = b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                b.put(str, list);
            }
            list.add(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(@NonNull d dVar, @Nullable String str) {
        synchronized (l.class) {
            Object[] objArr = {dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "faaab0fd823837110d54b57478a070da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "faaab0fd823837110d54b57478a070da");
                return;
            }
            List<d> list = b.get(str);
            if (list != null) {
                list.remove(dVar);
            } else {
                com.sankuai.waimai.foundation.utils.log.a.e("TaskHelper", "Cannot find completed task in running tasks.", new Object[0]);
            }
        }
    }

    private static synchronized void d(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (l.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a75e7ff79887dcf0246ec4915bc43980", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a75e7ff79887dcf0246ec4915bc43980");
                return;
            }
            List<Runnable> list = c.get(str);
            if (list == null) {
                list = new ArrayList<>();
                c.put(str, list);
            }
            list.add(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void e(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (l.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55e0755d84ddd7ce6faa3d0e5cc5b819", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55e0755d84ddd7ce6faa3d0e5cc5b819");
                return;
            }
            List<Runnable> list = c.get(str);
            if (list != null) {
                list.remove(runnable);
            } else {
                com.sankuai.waimai.foundation.utils.log.a.e("TaskHelper", "Cannot find completed runnable in scheduled runnables.", new Object[0]);
            }
        }
    }
}
