package com.sankuai.waimai.kit.utils;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    @NonNull
    private static final HashMap<String, List<c>> b = new HashMap<>();
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
    public static abstract class b<T> {
        public abstract T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class c<T> extends AsyncTask<Void, Void, T> {
        public static ChangeQuickRedirect a;
        @Nullable
        b<T> b;
        @Nullable
        a c;
        @Nullable
        private final String d;

        public /* synthetic */ c(a aVar, String str, AnonymousClass1 anonymousClass1) {
            this(aVar, str);
        }

        public /* synthetic */ c(b bVar, String str, AnonymousClass1 anonymousClass1) {
            this(bVar, str);
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Void[] voidArr) {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236c1f4a675dac147b95b604fd5c13e2", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236c1f4a675dac147b95b604fd5c13e2");
            }
            if (this.b != null) {
                return this.b.a();
            }
            if (this.c != null) {
                this.c.a();
                return null;
            }
            return null;
        }

        private c(@NonNull b<T> bVar, @Nullable String str) {
            Object[] objArr = {bVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f29da0429110180fa6ec249ff639cf9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f29da0429110180fa6ec249ff639cf9");
                return;
            }
            this.b = bVar;
            this.c = null;
            this.d = str;
        }

        private c(@NonNull a aVar, @Nullable String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97aa06d73eed79a9f9670cfca5c3b98a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97aa06d73eed79a9f9670cfca5c3b98a");
                return;
            }
            this.b = null;
            this.c = aVar;
            this.d = str;
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa9fc2bf3bc026a8a3ff189a02106b2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa9fc2bf3bc026a8a3ff189a02106b2f");
            } else {
                d.c(this, this.d);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f5cc0465b288db61a351502a93b451b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f5cc0465b288db61a351502a93b451b");
                return;
            }
            d.d(this, this.d);
            if (this.b == null && this.c != null) {
                try {
                    this.c.b();
                } catch (Throwable th) {
                    d.b(th);
                }
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe9b7c0153f61999fac0f5e8a33fccc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe9b7c0153f61999fac0f5e8a33fccc");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(this, AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176cb9978b3a4d3729dea8ff062cfd51", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176cb9978b3a4d3729dea8ff062cfd51");
            }
            return "Task of Action " + this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f9a7e1e4793f716032ee745113a29c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f9a7e1e4793f716032ee745113a29c1");
            return;
        }
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f8224d9204b155543345d5420e6fb9c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f8224d9204b155543345d5420e6fb9c7");
        } else if (th != null) {
            Metrics.storeCrash(th, 1, MetricsActivityLifecycleManager.currentActivity, false);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.kit.utils.d$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ b b;
        public final /* synthetic */ String c;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5558fa8681a6dbf48e5013e121e41fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5558fa8681a6dbf48e5013e121e41fd");
                return;
            }
            try {
                new c(this.b, this.c, (AnonymousClass1) null).a();
            } catch (Exception e) {
                d.b(e);
            }
        }
    }

    public static <T> void a(@NonNull final a aVar, @Nullable final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff48f574cb4707fadc3a08b97c62e6d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff48f574cb4707fadc3a08b97c62e6d7");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.kit.utils.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a811da9e3203d812e656ce1771ed5670", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a811da9e3203d812e656ce1771ed5670");
                    return;
                }
                try {
                    new c(a.this, str, (AnonymousClass1) null).a();
                } catch (Exception e) {
                    d.b(e);
                }
            }
        };
        Object[] objArr2 = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7aed15f98352517a63fb9f41a4a4c209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7aed15f98352517a63fb9f41a4a4c209");
        } else if (a()) {
            b(runnable);
        } else {
            a(runnable, str);
        }
    }

    public static void a(@NonNull final Runnable runnable, @Nullable final String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "868fb3eb6182c8d0c9f14568fcc73c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "868fb3eb6182c8d0c9f14568fcc73c54");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.kit.utils.d.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a20eef78cb2b2de24f7606309bc585b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a20eef78cb2b2de24f7606309bc585b8");
                    return;
                }
                d.b(runnable);
                d.d(this, str);
            }
        };
        c(runnable2, str);
        d.post(runnable2);
    }

    @MainThread
    public static void cancel(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4addea7b19e853e9e2eff64265c8c2ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4addea7b19e853e9e2eff64265c8c2ca");
        } else if (str == null) {
        } else {
            Object[] objArr2 = {"TaskHelper.cancel"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bdba58f659c2fcca183ea82a6db71084", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bdba58f659c2fcca183ea82a6db71084");
            } else if (!a()) {
                b(new RuntimeException("TaskHelper.cancel" + com.meituan.android.singleton.b.a.getString(R.string.wm_kit_main_must_in_main_thread)));
            }
            synchronized (b) {
                a(b.remove(str));
            }
            synchronized (c) {
                b(c.remove(str));
            }
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8f33e71c887ebb9ccf4bc251daab9b7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8f33e71c887ebb9ccf4bc251daab9b7")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c05d7614322d97e71c81a65917530f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c05d7614322d97e71c81a65917530f9");
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            b(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(@NonNull c cVar, @Nullable String str) {
        synchronized (d.class) {
            Object[] objArr = {cVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe8194f295eeb8a715a755ff312ed3e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe8194f295eeb8a715a755ff312ed3e0");
                return;
            }
            List<c> list = b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                b.put(str, list);
            }
            list.add(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(@NonNull c cVar, @Nullable String str) {
        synchronized (d.class) {
            Object[] objArr = {cVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4b6ca7e31fc26564746e5513c3a6595", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4b6ca7e31fc26564746e5513c3a6595");
                return;
            }
            List<c> list = b.get(str);
            if (list != null) {
                list.remove(cVar);
            }
        }
    }

    private static synchronized void c(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (d.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6aa062c081c72d843b86944451a48a6c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6aa062c081c72d843b86944451a48a6c");
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
    public static synchronized void d(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (d.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b34df4438b99e8ee8d1b7c5826dc483", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b34df4438b99e8ee8d1b7c5826dc483");
                return;
            }
            List<Runnable> list = c.get(str);
            if (list != null) {
                list.remove(runnable);
            }
        }
    }

    private static void a(List<c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a766fd898feb39e04f917f39772a9f11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a766fd898feb39e04f917f39772a9f11");
        } else if (list != null) {
            for (c cVar : list) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "c3b81d6ff13cba0158f7340ec244f5e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "c3b81d6ff13cba0158f7340ec244f5e9");
                } else {
                    cVar.cancel(true);
                    cVar.b = null;
                    cVar.c = null;
                }
            }
            list.clear();
        }
    }

    private static void b(List<Runnable> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a0cf422a0395102fda5254387fbd5d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a0cf422a0395102fda5254387fbd5d2");
        } else if (list != null) {
            for (Runnable runnable : list) {
                d.removeCallbacks(runnable);
            }
            list.clear();
        }
    }
}
