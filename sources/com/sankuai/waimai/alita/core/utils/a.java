package com.sankuai.waimai.alita.core.utils;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final ScheduledExecutorService b = com.sankuai.android.jarvis.c.c("alita_timer");
    @NonNull
    private static final HashMap<String, List<d>> c = new HashMap<>();
    @NonNull
    private static final HashMap<String, List<Runnable>> d = new HashMap<>();
    @NonNull
    private static final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0713a {
        public abstract void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class c<T> {
        public abstract T a();

        public abstract void a(T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        void b();
    }

    public static /* synthetic */ void a(Throwable th) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class b<T> extends AsyncTask<Void, Void, T> implements d {
        public static ChangeQuickRedirect a;
        @Nullable
        private final String b;
        @Nullable
        private c<T> c;
        @Nullable
        private AbstractC0713a d;

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Void[] voidArr) {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7405128e11d63490e80ef7623624a68", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7405128e11d63490e80ef7623624a68");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd7927b5b7cea55246e3773a8cc7ad8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd7927b5b7cea55246e3773a8cc7ad8");
                return;
            }
            this.c = cVar;
            this.d = null;
            this.b = str;
        }

        private b(@NonNull AbstractC0713a abstractC0713a, @Nullable String str) {
            Object[] objArr = {abstractC0713a, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3824e9473a01df0c98a66096ef567804", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3824e9473a01df0c98a66096ef567804");
                return;
            }
            this.c = null;
            this.d = abstractC0713a;
            this.b = str;
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7187d15a80c29dbaea91851a371d3dab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7187d15a80c29dbaea91851a371d3dab");
            } else {
                a.c(this, this.b);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a63b9ee6bbc0257440d8c84960e4e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a63b9ee6bbc0257440d8c84960e4e2");
                return;
            }
            a.d(this, this.b);
            if (this.c != null) {
                try {
                    this.c.a(t);
                } catch (Throwable th) {
                    a.a(th);
                }
            } else if (this.d != null) {
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f201824b9eebe0d4ef8f50c569e919d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f201824b9eebe0d4ef8f50c569e919d9");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(this, com.sankuai.waimai.alita.bundle.c.a, new Void[0]);
            }
        }

        @Override // com.sankuai.waimai.alita.core.utils.a.d
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f836c516a3e5a0e7a4469d1281ab3a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f836c516a3e5a0e7a4469d1281ab3a");
                return;
            }
            cancel(true);
            this.c = null;
            this.d = null;
        }
    }

    public static <T> void a(@NonNull final c<T> cVar, @Nullable final String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53136e299038e2947e49e071cef187e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53136e299038e2947e49e071cef187e5");
        } else {
            b(new Runnable() { // from class: com.sankuai.waimai.alita.core.utils.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "680d55876d4f28fb8fbf6414e9d4dab8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "680d55876d4f28fb8fbf6414e9d4dab8");
                        return;
                    }
                    try {
                        new b(c.this, str).a();
                    } catch (Exception e2) {
                        a.a(e2);
                    }
                }
            }, str);
        }
    }

    public static <T> void a(@NonNull final AbstractC0713a abstractC0713a, @Nullable final String str) {
        Object[] objArr = {abstractC0713a, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6b0e5a9af9a2513bf1d401cb7f66599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6b0e5a9af9a2513bf1d401cb7f66599");
        } else {
            b(new Runnable() { // from class: com.sankuai.waimai.alita.core.utils.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f2374df13d295f0fa25bf79cb0423ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f2374df13d295f0fa25bf79cb0423ee");
                        return;
                    }
                    try {
                        new b(AbstractC0713a.this, str).a();
                    } catch (Exception e2) {
                        a.a(e2);
                    }
                }
            }, str);
        }
    }

    private static void b(@NonNull Runnable runnable, @Nullable String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a13303d91eb653449ca573b44cb1a54f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a13303d91eb653449ca573b44cb1a54f");
        } else {
            a(runnable, false, str);
        }
    }

    private static void a(@NonNull Runnable runnable, boolean z, @Nullable String str) {
        Object[] objArr = {runnable, (byte) 0, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77ef350a2456250f22e46268cced7600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77ef350a2456250f22e46268cced7600");
        } else if (a()) {
            b(runnable);
        } else {
            b(runnable, false, str);
        }
    }

    private static void b(@NonNull final Runnable runnable, boolean z, @Nullable final String str) {
        Object[] objArr = {runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "427823ed4a0c10e71161c11008d5d2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "427823ed4a0c10e71161c11008d5d2f6");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.alita.core.utils.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8279162238a50bb66f6edd56436df9c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8279162238a50bb66f6edd56436df9c");
                    return;
                }
                a.b(runnable);
                a.d(this, str);
            }
        };
        c(runnable2, str);
        if (z) {
            e.postAtFrontOfQueue(runnable2);
        } else {
            e.post(runnable2);
        }
    }

    public static void a(@NonNull final Runnable runnable, int i, @Nullable final String str) {
        Object[] objArr = {runnable, 3000, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13d2df64e22e3e176feb547fe1e80080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13d2df64e22e3e176feb547fe1e80080");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.alita.core.utils.a.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ac1dceab857962c6156b54eff63d701", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ac1dceab857962c6156b54eff63d701");
                    return;
                }
                a.b(runnable);
                a.d(this, str);
            }
        };
        c(runnable2, str);
        e.postDelayed(runnable2, PayTask.j);
    }

    @MainThread
    public static void cancel(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d3aeb3bcfd2f2c74dca3e5a015fcd94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d3aeb3bcfd2f2c74dca3e5a015fcd94");
        } else if (str == null) {
        } else {
            Object[] objArr2 = {"TaskHelper.cancel"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7efc7be4df684ca4fa55297de196fb5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7efc7be4df684ca4fa55297de196fb5e");
            } else if (!a()) {
                new RuntimeException("TaskHelper.cancel要在主线程调用!");
            }
            synchronized (c) {
                a(c.remove(str));
            }
            synchronized (d) {
                b(d.remove(str));
            }
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7027a57372e8855a685de87f5538dd96", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7027a57372e8855a685de87f5538dd96")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55ffd4bcaaace6149ae55a0b4ac36d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55ffd4bcaaace6149ae55a0b4ac36d34");
            return;
        }
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(@NonNull d dVar, @Nullable String str) {
        synchronized (a.class) {
            Object[] objArr = {dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0121874bd19fa6e71a29a61dc3d2b077", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0121874bd19fa6e71a29a61dc3d2b077");
                return;
            }
            List<d> list = c.get(str);
            if (list == null) {
                list = new ArrayList<>();
                c.put(str, list);
            }
            list.add(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(@NonNull d dVar, @Nullable String str) {
        synchronized (a.class) {
            Object[] objArr = {dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af4f81267df801b21885d6d756148133", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af4f81267df801b21885d6d756148133");
                return;
            }
            List<d> list = c.get(str);
            if (list != null) {
                list.remove(dVar);
            }
        }
    }

    private static synchronized void c(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (a.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b043e11a9e2075a349edeba835dd3fe6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b043e11a9e2075a349edeba835dd3fe6");
                return;
            }
            List<Runnable> list = d.get(str);
            if (list == null) {
                list = new ArrayList<>();
                d.put(str, list);
            }
            list.add(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (a.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b90f860722bf5ccd31020d9f2c84d5a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b90f860722bf5ccd31020d9f2c84d5a8");
                return;
            }
            List<Runnable> list = d.get(str);
            if (list != null) {
                list.remove(runnable);
            }
        }
    }

    private static void a(List<d> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90ba7237aad74e8a2665811c523c830e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90ba7237aad74e8a2665811c523c830e");
        } else if (list != null) {
            for (d dVar : list) {
                dVar.b();
            }
            list.clear();
        }
    }

    private static void b(List<Runnable> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7596e4ff4b64835896cbeff5bb231661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7596e4ff4b64835896cbeff5bb231661");
        } else if (list != null) {
            for (Runnable runnable : list) {
                e.removeCallbacks(runnable);
            }
            list.clear();
        }
    }

    public static void a(Runnable runnable, long j, TimeUnit timeUnit) {
        Object[] objArr = {runnable, 15000L, timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb3973a34b0c23f50db6a85ba370fd1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb3973a34b0c23f50db6a85ba370fd1e");
        } else {
            b.schedule(runnable, 15000L, timeUnit);
        }
    }
}
