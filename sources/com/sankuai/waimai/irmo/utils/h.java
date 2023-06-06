package com.sankuai.waimai.irmo.utils;

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
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    @NonNull
    private static final HashMap<String, List<d>> b = new HashMap<>();
    @NonNull
    private static final HashMap<String, List<Runnable>> c = new HashMap<>();
    @NonNull
    private static final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public abstract void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class c<T> {
        public abstract T a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b<T> extends AsyncTask<Void, Void, T> implements d {
        public static ChangeQuickRedirect a;
        @Nullable
        private final String b;
        @Nullable
        private c<T> c;
        @Nullable
        private a d;

        public /* synthetic */ b(a aVar, String str, AnonymousClass1 anonymousClass1) {
            this(aVar, str);
        }

        public /* synthetic */ b(c cVar, String str, AnonymousClass1 anonymousClass1) {
            this(cVar, str);
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Void[] voidArr) {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f79c7165112efe82e7f939453df71b", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f79c7165112efe82e7f939453df71b");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23e7050091d9cbcbc2bf0acd1458798", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23e7050091d9cbcbc2bf0acd1458798");
                return;
            }
            this.c = cVar;
            this.d = null;
            this.b = str;
        }

        private b(@NonNull a aVar, @Nullable String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3e0236f0146ffbdf258c6fd4edd665a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3e0236f0146ffbdf258c6fd4edd665a");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437fa631baa980eb144ef218b42ef2fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437fa631baa980eb144ef218b42ef2fb");
            } else {
                h.c(this, this.b);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83412af8328b1eef9d5c557b21d90c13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83412af8328b1eef9d5c557b21d90c13");
                return;
            }
            h.d(this, this.b);
            if (this.c == null && this.d != null) {
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a388c1c2196969220f1d289eba05eea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a388c1c2196969220f1d289eba05eea");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(this, i.a(), new Void[0]);
            }
        }

        @Override // com.sankuai.waimai.irmo.utils.h.d
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46fc8400220a54afa89586d2c9ed1c68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46fc8400220a54afa89586d2c9ed1c68");
                return;
            }
            cancel(true);
            this.c = null;
            this.d = null;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3706b9b3c1ee1ad426467b16209fd50d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3706b9b3c1ee1ad426467b16209fd50d");
            }
            return "Task of Action " + this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d2312173ff7ded2f80e0e157f32aa67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d2312173ff7ded2f80e0e157f32aa67");
        } else {
            com.sankuai.waimai.foundation.core.exception.a.b(th);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.utils.h$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ c b;
        public final /* synthetic */ String c;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8fabd3bfcb1b16bff05a5fe2e3e426", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8fabd3bfcb1b16bff05a5fe2e3e426");
                return;
            }
            try {
                new b(this.b, this.c, (AnonymousClass1) null).a();
            } catch (Exception e) {
                h.b(e);
            }
        }
    }

    public static <T> void a(@NonNull final a aVar, @Nullable final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d3e1cdd18995aee426a392314ec5800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d3e1cdd18995aee426a392314ec5800");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.irmo.utils.h.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3262b70f1c781125c93488178f263af5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3262b70f1c781125c93488178f263af5");
                    return;
                }
                try {
                    new b(a.this, str, (AnonymousClass1) null).a();
                } catch (Exception e) {
                    h.b(e);
                }
            }
        };
        Object[] objArr2 = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f0512405e3f401c2516676705e4ea4b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f0512405e3f401c2516676705e4ea4b4");
            return;
        }
        Object[] objArr3 = {runnable, (byte) 0, str};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7292cf524b707e68f5cd68b0a44c3990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7292cf524b707e68f5cd68b0a44c3990");
        } else if (a()) {
            b(runnable);
        } else {
            a(runnable, false, str);
        }
    }

    public static void a(@NonNull Runnable runnable, @Nullable String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b378e355a8679f0c3f4a47aa93998e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b378e355a8679f0c3f4a47aa93998e8");
        } else {
            a(runnable, false, str);
        }
    }

    private static void a(@NonNull final Runnable runnable, boolean z, @Nullable final String str) {
        Object[] objArr = {runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3adca0c457ed67760647acbde92681a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3adca0c457ed67760647acbde92681a5");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.irmo.utils.h.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad2f22009d8074e7fa0cf4d4cc017ee2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad2f22009d8074e7fa0cf4d4cc017ee2");
                    return;
                }
                h.b(runnable);
                h.d(this, str);
            }
        };
        c(runnable2, str);
        if (z) {
            d.postAtFrontOfQueue(runnable2);
        } else {
            d.post(runnable2);
        }
    }

    @MainThread
    public static void cancel(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fd4f54209904d03072965f8e5b315ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fd4f54209904d03072965f8e5b315ff");
        } else if (str == null) {
        } else {
            Object[] objArr2 = {"TaskHelper.cancel"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a35144f041f710845cae362ea0a9f4b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a35144f041f710845cae362ea0a9f4b9");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cad48ae1b6c368d633522093c8a4eaad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cad48ae1b6c368d633522093c8a4eaad")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac9ffcc1e80649d2e12465e506d0c6b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac9ffcc1e80649d2e12465e506d0c6b2");
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
        synchronized (h.class) {
            Object[] objArr = {dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ea38d840a1cfa05c0a1bae9a1f4e7d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ea38d840a1cfa05c0a1bae9a1f4e7d3");
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
        synchronized (h.class) {
            Object[] objArr = {dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8452c15353902478a0c7c1cbdc3fda33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8452c15353902478a0c7c1cbdc3fda33");
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

    private static synchronized void c(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (h.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e079a3eea5db648adc1aae8c83e7c750", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e079a3eea5db648adc1aae8c83e7c750");
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
        synchronized (h.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7251599392dbf969dde389bb9d2f8ac5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7251599392dbf969dde389bb9d2f8ac5");
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

    private static void a(List<d> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b633daba2889094d2cb102b64ea358da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b633daba2889094d2cb102b64ea358da");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9f42096bcb8b45f7ba5572935ceb8a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9f42096bcb8b45f7ba5572935ceb8a6");
        } else if (list != null) {
            for (Runnable runnable : list) {
                d.removeCallbacks(runnable);
            }
            list.clear();
        }
    }
}
