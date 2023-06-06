package com.meituan.msc.modules.container;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.d;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.common.process.ipc.IPCInvoke;
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
    private static boolean d;
    private static final com.meituan.msc.common.utils.a e = new com.meituan.msc.common.utils.a();
    public static c b = new c("application");
    public static c c = new c(ContainerInfo.ENV_MSC) { // from class: com.meituan.msc.modules.container.a.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.msc.modules.container.a.c
        public final boolean a(Class<? extends Activity> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb879b51aeb603268ec759f912e38e32", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb879b51aeb603268ec759f912e38e32")).booleanValue() : MSCActivity.class.isAssignableFrom(cls);
        }
    };
    private static final InterfaceC0460a f = (InterfaceC0460a) IPCInvoke.a(b.class, com.meituan.msc.common.process.a.MAIN);

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.container.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0460a {
        void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity);
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5a1e99133e0c9e87e76b667d7e5db2b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5a1e99133e0c9e87e76b667d7e5db2b");
            } else if (d) {
            } else {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof Application)) {
                    com.meituan.msc.modules.reporter.g.a("ApplicationLifecycleMonitor", "cannot get Application from context to register lifecycle callbacks");
                    return;
                }
                ((Application) applicationContext).registerActivityLifecycleCallbacks(e);
                e.a(b.i);
                e.a(c.i);
                if (!com.meituan.msc.common.process.a.f()) {
                    e.a(new InterfaceC0460a() { // from class: com.meituan.msc.modules.container.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.container.a.InterfaceC0460a
                        public final void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity) {
                            Object[] objArr2 = {aVar, cls, activity};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38d1e8311ed31e1a865618216903c69d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38d1e8311ed31e1a865618216903c69d");
                            } else {
                                a.f.a(aVar, cls, null);
                            }
                        }
                    });
                }
                d = true;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect b;
        private final String a;
        WeakReference<Activity> c;
        public d.b d;
        public d.b e;
        int f;
        int g;
        int h;
        public InterfaceC0460a i;
        private final Map<C0461a, Queue<Runnable>> j;

        public boolean a(Class<? extends Activity> cls) {
            return true;
        }

        public static /* synthetic */ void a(c cVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "e83f96870a37bd9b9e29a43c0915b868", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "e83f96870a37bd9b9e29a43c0915b868");
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
                com.meituan.msc.modules.reporter.g.b("ApplicationLifecycleMonitor", cVar.a, " enter foreground");
                if (cVar.e.a(d.b.STARTED)) {
                    cVar.b(C0461a.c);
                }
            } else if (bVar.a(d.b.STARTED) && !cVar.d.a(d.b.STARTED)) {
                com.meituan.msc.modules.reporter.g.b("ApplicationLifecycleMonitor", cVar.a, " enter background");
                cVar.b(C0461a.d);
            } else if (bVar != d.b.DESTROYED && cVar.d == d.b.DESTROYED) {
                com.meituan.msc.modules.reporter.g.b("ApplicationLifecycleMonitor", cVar.a, " destroyed");
                cVar.b(C0461a.f);
            }
            if (cVar.e.a(cVar.d)) {
                return;
            }
            if (!cVar.e.a(d.b.CREATED) && cVar.d.a(d.b.CREATED)) {
                cVar.b(C0461a.e);
            }
            cVar.e = cVar.d;
        }

        private c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23681d35ab54da94425ac2a82d2bc536", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23681d35ab54da94425ac2a82d2bc536");
                return;
            }
            this.d = d.b.INITIALIZED;
            this.e = d.b.INITIALIZED;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = new InterfaceC0460a() { // from class: com.meituan.msc.modules.container.a.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.container.a.InterfaceC0460a
                public final void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity) {
                    Object[] objArr2 = {aVar, cls, activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8304a1a28d8a8b133405cc4a92555cb5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8304a1a28d8a8b133405cc4a92555cb5");
                    } else if (c.this.a(cls)) {
                        c cVar = c.this;
                        Object[] objArr3 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect3 = c.b;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "46906269adada6d2bb5500313d00c09d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "46906269adada6d2bb5500313d00c09d");
                        } else if (aVar == d.a.ON_PAUSE && (cVar.f == 0 || cVar.g == 0 || cVar.h == 0)) {
                            cVar.f = 1;
                            cVar.g = 1;
                            cVar.h = 1;
                            cVar.d = d.b.RESUMED;
                            cVar.e = d.b.RESUMED;
                        }
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
                        c.a(c.this);
                    }
                }
            };
            this.j = new HashMap();
            this.a = str;
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb70e335e3dcf178a0f379af3a7833c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb70e335e3dcf178a0f379af3a7833c")).booleanValue() : this.d.a(d.b.STARTED);
        }

        @Nullable
        public final Activity b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f5204322513bfcc6438978876a7208", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f5204322513bfcc6438978876a7208");
            }
            if (this.c != null) {
                return this.c.get();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* renamed from: com.meituan.msc.modules.container.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0461a extends com.meituan.msc.common.model.a {
            public static final C0461a c = new C0461a("reEnterForeground");
            public static final C0461a d = new C0461a("enterBackground");
            public static final C0461a e = new C0461a("firstCreate");
            public static final C0461a f = new C0461a("destroyed");

            private C0461a(@NonNull String str) {
                super(str);
            }
        }

        @NonNull
        private synchronized Queue<Runnable> a(C0461a c0461a) {
            Object[] objArr = {c0461a};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ffe888604695089d3f6324d91226c56", RobustBitConfig.DEFAULT_VALUE)) {
                return (Queue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ffe888604695089d3f6324d91226c56");
            }
            Queue<Runnable> queue = this.j.get(c0461a);
            if (queue == null) {
                queue = new ConcurrentLinkedDeque<>();
                this.j.put(c0461a, queue);
            }
            return queue;
        }

        private void b(C0461a c0461a) {
            Object[] objArr = {c0461a};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5add2a5de3eee4dc21bf0bfb0a21f7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5add2a5de3eee4dc21bf0bfb0a21f7a");
                return;
            }
            for (Runnable runnable : a(c0461a)) {
                runnable.run();
            }
        }

        public final void a(@Nullable Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131dd167f4d960618f413b806174f08b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131dd167f4d960618f413b806174f08b");
            } else {
                a(C0461a.c).add(runnable);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC0460a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.msc.modules.container.a.InterfaceC0460a
        public final void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity) {
            Object[] objArr = {aVar, cls, activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3779afaa7dd50ea58dcbc23e203bdfe9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3779afaa7dd50ea58dcbc23e203bdfe9");
            } else {
                a.e.a(aVar, cls, activity);
            }
        }
    }
}
