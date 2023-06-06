package com.meituan.mmp;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.d;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.MMPBaseActivity;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.mmp.main.l;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static boolean e;
    private static final com.meituan.mmp.lib.utils.a f = new com.meituan.mmp.lib.utils.a();
    public static c b = new c("application");
    public static c c = new c("hera") { // from class: com.meituan.mmp.a.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.a.c
        public final boolean a(Class<? extends Activity> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d707f3445145c845162e09f981fc1a47", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d707f3445145c845162e09f981fc1a47")).booleanValue() : HeraActivity.class.isAssignableFrom(cls);
        }
    };
    public static c d = new c(ContainerInfo.ENV_MMP) { // from class: com.meituan.mmp.a.3
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.a.c
        public final boolean a(Class<? extends Activity> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4fc2002d805fc9e495eee01384d5ec4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4fc2002d805fc9e495eee01384d5ec4")).booleanValue() : MMPBaseActivity.class.isAssignableFrom(cls);
        }
    };
    private static final InterfaceC0390a g = (InterfaceC0390a) IPCInvoke.a(b.class, com.meituan.mmp.lib.mp.a.MAIN);

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0390a {
        void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity);
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942fac9498b44a3e35ce738b4a706a7c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942fac9498b44a3e35ce738b4a706a7c");
            } else if (e) {
            } else {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof Application)) {
                    com.meituan.mmp.lib.trace.b.d("ApplicationLifecycleMonitor", "cannot get Application from context to register lifecycle callbacks");
                    return;
                }
                ((Application) applicationContext).registerActivityLifecycleCallbacks(f);
                f.a(b.j);
                f.a(c.j);
                f.a(d.j);
                if (!com.meituan.mmp.lib.mp.a.f()) {
                    f.a(new InterfaceC0390a() { // from class: com.meituan.mmp.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.a.InterfaceC0390a
                        public final void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity) {
                            Object[] objArr2 = {aVar, cls, activity};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d637b49af5dc86bd79463b41c1ac2dbf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d637b49af5dc86bd79463b41c1ac2dbf");
                            } else {
                                a.g.a(aVar, cls, null);
                            }
                        }
                    });
                }
                e = true;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect b;
        private final Map<C0391a, Queue<Runnable>> a;
        WeakReference<Activity> c;
        public d.b d;
        d.b e;
        int f;
        int g;
        int h;
        final String i;
        public InterfaceC0390a j;

        public boolean a(Class<? extends Activity> cls) {
            return true;
        }

        private c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575b7b6a5ebd5cb9f7b7249c8aa4b644", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575b7b6a5ebd5cb9f7b7249c8aa4b644");
                return;
            }
            this.d = d.b.INITIALIZED;
            this.e = d.b.INITIALIZED;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.j = new InterfaceC0390a() { // from class: com.meituan.mmp.a.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.a.InterfaceC0390a
                public final void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity) {
                    Object[] objArr2 = {aVar, cls, activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8259d387a5688c2ecb035b9cb570e042", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8259d387a5688c2ecb035b9cb570e042");
                    } else if (c.this.a(cls)) {
                        switch (aVar) {
                            case ON_CREATE:
                                c.this.f++;
                                break;
                            case ON_START:
                                c.this.g++;
                                break;
                            case ON_RESUME:
                                c.this.h++;
                                if (activity != null) {
                                    c.this.c = new WeakReference<>(activity);
                                    break;
                                }
                                break;
                            case ON_PAUSE:
                                c.this.h--;
                                break;
                            case ON_STOP:
                                c.this.g--;
                                break;
                            case ON_DESTROY:
                                c.this.f--;
                                if (c.this.b() == activity) {
                                    c.this.c = null;
                                    break;
                                }
                                break;
                        }
                        c cVar = c.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = c.b;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "f245f2ff28be7f523b3e87a99ac1780e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "f245f2ff28be7f523b3e87a99ac1780e");
                            return;
                        }
                        if (cVar.h > cVar.g) {
                            cVar.g = cVar.h;
                        }
                        if (cVar.g > cVar.f) {
                            cVar.f = cVar.g;
                        }
                        if (cVar.h < 0) {
                            cVar.h = 0;
                        }
                        if (cVar.g < 0) {
                            cVar.g = 0;
                        }
                        if (cVar.f < 0) {
                            cVar.f = 0;
                        }
                        d.b bVar = cVar.d;
                        if (cVar.h > 0) {
                            cVar.d = d.b.RESUMED;
                        } else if (cVar.g > 0) {
                            cVar.d = d.b.STARTED;
                        } else if (cVar.f > 0) {
                            cVar.d = d.b.CREATED;
                        } else {
                            cVar.d = d.b.DESTROYED;
                        }
                        if (!bVar.a(d.b.STARTED) && cVar.d.a(d.b.STARTED)) {
                            com.meituan.mmp.lib.trace.b.b("ApplicationLifecycleMonitor", cVar.i + " enter foreground");
                            if (cVar.e.a(d.b.STARTED)) {
                                cVar.b(C0391a.a);
                            }
                        } else if (bVar.a(d.b.STARTED) && !cVar.d.a(d.b.STARTED)) {
                            com.meituan.mmp.lib.trace.b.b("ApplicationLifecycleMonitor", cVar.i + " enter background");
                            cVar.b(C0391a.b);
                        }
                        if (cVar.e.a(cVar.d)) {
                            return;
                        }
                        if (!cVar.e.a(d.b.CREATED) && cVar.d.a(d.b.CREATED)) {
                            cVar.b(C0391a.c);
                        }
                        cVar.e = cVar.d;
                    }
                }
            };
            this.a = new HashMap();
            this.i = str;
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8c7958104836b410e7397b69705870", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8c7958104836b410e7397b69705870")).booleanValue() : this.d.a(d.b.STARTED);
        }

        @Nullable
        public final Activity b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9435256e85cae1005b0688cc9627912", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9435256e85cae1005b0688cc9627912");
            }
            if (this.c != null) {
                return this.c.get();
            }
            return null;
        }

        public final boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66a0b2dc1bb20fb81fb2a518602ecc9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66a0b2dc1bb20fb81fb2a518602ecc9")).booleanValue() : this.e.a(d.b.CREATED);
        }

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.mmp.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0391a extends l {
            public static final C0391a a = new C0391a("reEnterForeground");
            public static final C0391a b = new C0391a("enterBackground");
            public static final C0391a c = new C0391a("firstCreate");

            private C0391a(@NonNull String str) {
                super(str);
            }
        }

        @NonNull
        public synchronized Queue<Runnable> a(C0391a c0391a) {
            Object[] objArr = {c0391a};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebadea2d6b790968b82bbb880743e594", RobustBitConfig.DEFAULT_VALUE)) {
                return (Queue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebadea2d6b790968b82bbb880743e594");
            }
            Queue<Runnable> queue = this.a.get(c0391a);
            if (queue == null) {
                queue = new ConcurrentLinkedDeque<>();
                this.a.put(c0391a, queue);
            }
            return queue;
        }

        void b(C0391a c0391a) {
            Object[] objArr = {c0391a};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e2aaf16b38eeb99d2f858cd4e6526c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e2aaf16b38eeb99d2f858cd4e6526c1");
                return;
            }
            for (Runnable runnable : a(c0391a)) {
                runnable.run();
            }
        }

        public final void a(@Nullable Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f171be563b7f4dd9c7a0c8789844754c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f171be563b7f4dd9c7a0c8789844754c");
            } else {
                a(C0391a.a).add(runnable);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC0390a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.a.InterfaceC0390a
        public final void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity) {
            Object[] objArr = {aVar, cls, activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378332b7fb8054f60441c31de5e4fab8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378332b7fb8054f60441c31de5e4fab8");
            } else {
                a.f.a(aVar, cls, activity);
            }
        }
    }
}
