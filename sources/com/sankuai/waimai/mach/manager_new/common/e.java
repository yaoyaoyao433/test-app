package com.sankuai.waimai.mach.manager_new.common;

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
public final class e {
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
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class c<T> {
        public abstract T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        void b();
    }

    public static /* synthetic */ void a(Throwable th) {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "244adecb355b787afb2a34abc5fbeb33", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "244adecb355b787afb2a34abc5fbeb33");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44624592d1af49d75b3ef6b53127ed3c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44624592d1af49d75b3ef6b53127ed3c");
                return;
            }
            this.c = cVar;
            this.d = null;
            this.b = str;
        }

        private b(@NonNull a aVar, @Nullable String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b20dd2c289fc34bfcd53d81a08cb1f08", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b20dd2c289fc34bfcd53d81a08cb1f08");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "903e115f729aa7fb7b00e08cdcdb8a98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "903e115f729aa7fb7b00e08cdcdb8a98");
            } else {
                e.c(this, this.b);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd0b403dd98cc957f35e7ec94242a8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd0b403dd98cc957f35e7ec94242a8c");
                return;
            }
            e.d(this, this.b);
            if (this.c == null && this.d != null) {
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139891bc9675a9c74061f08d105c095c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139891bc9675a9c74061f08d105c095c");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(this, f.a(), new Void[0]);
            }
        }

        @Override // com.sankuai.waimai.mach.manager_new.common.e.d
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309c0b79ab2826f05eb84db0f641bbd7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309c0b79ab2826f05eb84db0f641bbd7");
                return;
            }
            cancel(true);
            this.c = null;
            this.d = null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.manager_new.common.e$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ c b;
        public final /* synthetic */ String c;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04328fab17021f22a04ce5276bc071ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04328fab17021f22a04ce5276bc071ac");
                return;
            }
            try {
                new b(this.b, this.c, (AnonymousClass1) null).a();
            } catch (Exception e) {
                e.a(e);
            }
        }
    }

    public static <T> void a(@NonNull final a aVar, @Nullable final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2abf071f694e5121a193d2fcfbf9ce4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2abf071f694e5121a193d2fcfbf9ce4");
            return;
        }
        final Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.common.e.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c84c8eec555c96e2c765bbbfb313296", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c84c8eec555c96e2c765bbbfb313296");
                    return;
                }
                try {
                    new b(a.this, str, (AnonymousClass1) null).a();
                } catch (Exception e) {
                    e.a(e);
                }
            }
        };
        Object[] objArr2 = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "45578ef2e968c6162e7d4df918301740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "45578ef2e968c6162e7d4df918301740");
            return;
        }
        Object[] objArr3 = {runnable, (byte) 0, str};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a19c529ace7f33d0008ffb919c3a2358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a19c529ace7f33d0008ffb919c3a2358");
        } else if (a()) {
            b(runnable);
        } else {
            Object[] objArr4 = {runnable, (byte) 0, str};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ec033c31ce467a4c7b7d30c7feeb3787", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ec033c31ce467a4c7b7d30c7feeb3787");
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.common.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fcabde24aa9dc1848e56e9e14cb03b1b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fcabde24aa9dc1848e56e9e14cb03b1b");
                        return;
                    }
                    e.b(runnable);
                    e.c(this, str);
                }
            };
            b(runnable2, str);
            d.post(runnable2);
        }
    }

    @MainThread
    public static void cancel(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e34f0585ac3d0166a2bd35aa52bec45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e34f0585ac3d0166a2bd35aa52bec45");
        } else if (str == null) {
        } else {
            Object[] objArr2 = {"TaskHelper.cancel"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "709def200a1dd665dfe8fc0a59449189", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "709def200a1dd665dfe8fc0a59449189");
            } else if (!a()) {
                new RuntimeException("TaskHelper.cancel要在主线程调用!");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e913f43a0079fdef3e7fb1b7481f38e2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e913f43a0079fdef3e7fb1b7481f38e2")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b82d639ff4dd77dc407540a43326071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b82d639ff4dd77dc407540a43326071");
            return;
        }
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(@NonNull d dVar, @Nullable String str) {
        synchronized (e.class) {
            Object[] objArr = {dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d14fcd6c9f2fa8ea320eeb53ff6ccd5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d14fcd6c9f2fa8ea320eeb53ff6ccd5");
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
        synchronized (e.class) {
            Object[] objArr = {dVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31c7de6a9f6aebb59fce959756ca09fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31c7de6a9f6aebb59fce959756ca09fd");
                return;
            }
            List<d> list = b.get(str);
            if (list != null) {
                list.remove(dVar);
            }
        }
    }

    private static synchronized void b(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (e.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a8bec1626b4ab6fc4af8b69ee674929", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a8bec1626b4ab6fc4af8b69ee674929");
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
    public static synchronized void c(@NonNull Runnable runnable, @Nullable String str) {
        synchronized (e.class) {
            Object[] objArr = {runnable, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9663b8096b2ffeb32235f3d37966112", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9663b8096b2ffeb32235f3d37966112");
                return;
            }
            List<Runnable> list = c.get(str);
            if (list != null) {
                list.remove(runnable);
            }
        }
    }

    private static void a(List<d> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc1d61daf2ffb32b43b7febd1ae30821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc1d61daf2ffb32b43b7febd1ae30821");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "221b80be89a5b22e861717a37986dadf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "221b80be89a5b22e861717a37986dadf");
        } else if (list != null) {
            for (Runnable runnable : list) {
                d.removeCallbacks(runnable);
            }
            list.clear();
        }
    }
}
