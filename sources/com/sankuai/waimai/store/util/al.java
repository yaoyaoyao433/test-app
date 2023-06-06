package com.sankuai.waimai.store.util;

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
public final class al {
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

        public abstract void a(T t);
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

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Void[] voidArr) {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e3b8d31c54b18ef83446c717dca29e", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e3b8d31c54b18ef83446c717dca29e");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14dcb09df173617f45ef904fa5337b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14dcb09df173617f45ef904fa5337b4");
                return;
            }
            this.b = bVar;
            this.c = null;
            this.d = str;
        }

        private c(@NonNull a aVar, @Nullable String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb83adaa1c7e06f0d9b8234cce72fce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb83adaa1c7e06f0d9b8234cce72fce");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef557a3ea1019ed58f6d2aef2fcaf14d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef557a3ea1019ed58f6d2aef2fcaf14d");
            } else {
                al.c(this, this.d);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7b269ad74a93f1751b9117b5b8ed61", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7b269ad74a93f1751b9117b5b8ed61");
                return;
            }
            al.d(this, this.d);
            if (this.b != null) {
                try {
                    this.b.a(t);
                } catch (Exception e) {
                    al.b(e);
                }
            } else if (this.c != null) {
                try {
                    this.c.b();
                } catch (Exception e2) {
                    al.b(e2);
                }
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74da3070eea9820332f77d7a6071765", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74da3070eea9820332f77d7a6071765");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(this, ac.a(), new Void[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f32635b912009db44d78b6e67e2bfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f32635b912009db44d78b6e67e2bfc4");
        } else {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
    }

    public static <T> void a(@NonNull final b<T> bVar, @Nullable final String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a8b045a9c41cf1cb1659a697b483ea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a8b045a9c41cf1cb1659a697b483ea4");
        } else {
            a(new Runnable() { // from class: com.sankuai.waimai.store.util.al.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c726c60375e42cb2303ca59ace3baf49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c726c60375e42cb2303ca59ace3baf49");
                        return;
                    }
                    try {
                        new c(b.this, str).a();
                    } catch (Exception e) {
                        al.b(e);
                    }
                }
            }, str);
        }
    }

    public static <T> void a(@NonNull final a aVar, @Nullable final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40165f9c9697d23f7304e305f2095588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40165f9c9697d23f7304e305f2095588");
        } else {
            a(new Runnable() { // from class: com.sankuai.waimai.store.util.al.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6c4d8ba2475ac1d2cd2e0eeebbbdc93", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6c4d8ba2475ac1d2cd2e0eeebbbdc93");
                        return;
                    }
                    try {
                        new c(a.this, str).a();
                    } catch (Exception e) {
                        al.b(e);
                    }
                }
            }, str);
        }
    }

    public static void a(@NonNull Runnable runnable, @Nullable String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f5fd85149e56b66a3eb0a6b109568b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f5fd85149e56b66a3eb0a6b109568b5");
        } else if (a()) {
            b(runnable);
        } else {
            b(runnable, str);
        }
    }

    public static void b(@NonNull final Runnable runnable, @Nullable final String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc0eda109c361da65245ef74f50d6bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc0eda109c361da65245ef74f50d6bea");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.store.util.al.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfb3fbc20c1246913a0d1c3e4a0a5cb7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfb3fbc20c1246913a0d1c3e4a0a5cb7");
                    return;
                }
                al.b(runnable);
                al.e(this, str);
            }
        };
        d(runnable2, str);
        if (d != null) {
            d.post(runnable2);
        }
    }

    public static void a(@NonNull final Runnable runnable, int i, @Nullable final String str) {
        Object[] objArr = {runnable, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04d1ae584acc12f25a8ecc04ec32d7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04d1ae584acc12f25a8ecc04ec32d7aa");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.store.util.al.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41b5a943630882be67a90683a24213d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41b5a943630882be67a90683a24213d4");
                    return;
                }
                al.b(runnable);
                al.e(this, str);
            }
        };
        d(runnable2, str);
        d.postDelayed(runnable2, i);
    }

    @MainThread
    public static void cancel(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8def3fa93c526463452f104abede586e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8def3fa93c526463452f104abede586e");
        } else if (str == null) {
        } else {
            Object[] objArr2 = {"TaskHelper.cancel"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "71634cccc024d5974a1f6b0fb58e4092", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "71634cccc024d5974a1f6b0fb58e4092");
            } else if (!a()) {
                b(new RuntimeException("TaskHelper.cancel要在主线程调用!"));
            }
            synchronized (b) {
                a(b.remove(str));
            }
            synchronized (c) {
                b(c.remove(str));
            }
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2e32c67374f5600243765fbe470a7a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2e32c67374f5600243765fbe470a7a5")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0530860094cf06feb93f99ff05f4b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0530860094cf06feb93f99ff05f4b71");
            return;
        }
        try {
            runnable.run();
        } catch (Exception e) {
            b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(@NonNull c cVar, @Nullable String str) {
        synchronized (al.class) {
            Object[] objArr = {cVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f145e2f0a94ff664ea3cde21bf1b45d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f145e2f0a94ff664ea3cde21bf1b45d0");
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
        synchronized (al.class) {
            Object[] objArr = {cVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8a3511ae4e43ac57d7f8711e5ddfdc0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8a3511ae4e43ac57d7f8711e5ddfdc0");
                return;
            }
            List<c> list = b.get(str);
            if (list != null) {
                list.remove(cVar);
            } else {
                com.sankuai.shangou.stone.util.log.a.d("TaskHelper", "Cannot find completed task in running tasks.", new Object[0]);
            }
        }
    }

    private static synchronized void d(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (al.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "203fa4315b024f72590309b575f71e9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "203fa4315b024f72590309b575f71e9e");
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
        synchronized (al.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b92db71d5c48e8d88ec836aa01b4a24f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b92db71d5c48e8d88ec836aa01b4a24f");
                return;
            }
            List<Runnable> list = c.get(str);
            if (list != null) {
                list.remove(runnable);
            } else {
                com.sankuai.shangou.stone.util.log.a.d("TaskHelper", "Cannot find completed runnable in scheduled runnables.", new Object[0]);
            }
        }
    }

    private static void a(List<c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21e0a5e9b040dd6b72b9cd6ead5d473d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21e0a5e9b040dd6b72b9cd6ead5d473d");
        } else if (list != null) {
            for (c cVar : list) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "e18316f3049a9832f47f189303e69268", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "e18316f3049a9832f47f189303e69268");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c58cab94316faa6f35412c3d5f968bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c58cab94316faa6f35412c3d5f968bb7");
        } else if (list != null) {
            for (Runnable runnable : list) {
                d.removeCallbacks(runnable);
            }
            list.clear();
        }
    }
}
