package com.sankuai.xm.im.notifier;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.w;
import com.sankuai.xm.im.d;
import com.sankuai.xm.im.f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static Set<String> c = new HashSet();
    private static Map<Class<?>, Class<? extends AbstractC1394a>> d = new ConcurrentHashMap();

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5662f8a9bf695a8e83bf80840f733d15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5662f8a9bf695a8e83bf80840f733d15");
        } else if (context instanceof Application) {
            b = w.g(context);
        }
    }

    public static void a(Class<?> cls, Class<? extends AbstractC1394a> cls2) {
        Object[] objArr = {cls, cls2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e29a556f9e9c5630e4c8f2ff66aeaa6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e29a556f9e9c5630e4c8f2ff66aeaa6");
        } else {
            d.put(cls, cls2);
        }
    }

    public static void a(com.sankuai.xm.im.notifier.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9081e142f8dcfc63031cc13dc4b37449", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9081e142f8dcfc63031cc13dc4b37449");
        } else if (bVar == null) {
        } else {
            a(bVar, 0L);
        }
    }

    public static void a(final com.sankuai.xm.im.notifier.b bVar, long j) {
        Object[] objArr = {bVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af500fced76cb8c528113506c57dcb1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af500fced76cb8c528113506c57dcb1a");
        } else if (bVar == null) {
        } else {
            Runnable a2 = j.a(new Runnable() { // from class: com.sankuai.xm.im.notifier.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fea30bbafab25186cbe8df0bfbd8fdd8", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fea30bbafab25186cbe8df0bfbd8fdd8");
                    } else {
                        a.c(com.sankuai.xm.im.notifier.b.this);
                    }
                }
            });
            if (bVar.c() && !a(16)) {
                com.sankuai.xm.threadpool.scheduler.a.b().a(16, 2, a2, j);
            } else if (bVar.e() && !a(17)) {
                com.sankuai.xm.threadpool.scheduler.a.b().a(17, a2, j);
            } else if (bVar.d() && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                com.sankuai.xm.threadpool.scheduler.a.b().a(a2, j);
            } else {
                c(bVar);
            }
        }
    }

    public static <T, B> B a(T t, Class<B> cls, int i) {
        Object[] objArr = {t, cls, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91eb7e9ab8f89ca1aed151f45c643dd3", 6917529027641081856L)) {
            return (B) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91eb7e9ab8f89ca1aed151f45c643dd3");
        }
        if (t == 0) {
            return null;
        }
        try {
            if (a(t.getClass().getName())) {
                return cls.cast(t);
            }
            return cls.cast(Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new c(t, i, d.get(cls))));
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.c("NotifyCenter::wrapNotifyProxy::" + e.getMessage(), new Object[0]);
            synchronized (a.class) {
                c.add(t.getClass().getName());
                return t;
            }
        }
    }

    private static <B, T> B a(T t, B b2, int i, Class<?> cls) {
        Object[] objArr = {t, b2, Integer.valueOf(i), cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71a4a5c214e0884720d647fa020fa36d", 6917529027641081856L)) {
            return (B) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71a4a5c214e0884720d647fa020fa36d");
        }
        if (t == 0 || b2 == null) {
            return null;
        }
        try {
            return a(t.getClass().getName()) ? t : (B) Proxy.newProxyInstance(b2.getClass().getClassLoader(), b2.getClass().getInterfaces(), new c(t, i, cls));
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.c("NotifyCenter::wrapNotifyProxy(T,B)::" + e.getMessage(), new Object[0]);
            synchronized (a.class) {
                c.add(t.getClass().getName());
                return t;
            }
        }
    }

    public static <T> com.sankuai.xm.im.a<T> a(com.sankuai.xm.im.a<T> aVar, T t, int i) {
        Object obj;
        int i2 = 1;
        Object[] objArr = {aVar, t, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbfb1533964d5ac42783d05eed2610b4", 6917529027641081856L)) {
            return (com.sankuai.xm.im.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbfb1533964d5ac42783d05eed2610b4");
        }
        if (aVar == null) {
            return null;
        }
        if (t == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.notifier.c.a;
            obj = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "18c81cb6e5f1beaf992ecbd7c8f2f6ef", 6917529027641081856L) ? (com.sankuai.xm.im.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "18c81cb6e5f1beaf992ecbd7c8f2f6ef") : new com.sankuai.xm.im.a<Void>() { // from class: com.sankuai.xm.im.notifier.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj2) {
                    Object[] objArr3 = {(Void) obj2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d37863c6f614cd37a2dedcdec828698", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d37863c6f614cd37a2dedcdec828698");
                    } else {
                        com.sankuai.xm.im.utils.a.b("getEmptyCallbackInstance onSuccess", new Object[0]);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i3, String str) {
                    Object[] objArr3 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "70f651921e960aa11048dd6474d3410f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "70f651921e960aa11048dd6474d3410f");
                    } else {
                        com.sankuai.xm.im.utils.a.b("getEmptyCallbackInstance onFailure", new Object[0]);
                    }
                }
            };
        } else {
            Object[] objArr3 = {t};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.notifier.c.a;
            obj = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "80e7d48dbc959837864160d2b9ea7d14", 6917529027641081856L) ? (com.sankuai.xm.im.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "80e7d48dbc959837864160d2b9ea7d14") : new com.sankuai.xm.im.a<T>() { // from class: com.sankuai.xm.im.notifier.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onSuccess(T t2) {
                    Object[] objArr4 = {t2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a0724ba272cf3f22aec04bb664bd3060", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a0724ba272cf3f22aec04bb664bd3060");
                    } else {
                        com.sankuai.xm.im.utils.a.b("getEmptyCallbackInstance onSuccess", new Object[0]);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i3, String str) {
                    Object[] objArr4 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f656502c18c9fb99bf5b3ff36b25e2ac", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f656502c18c9fb99bf5b3ff36b25e2ac");
                    } else {
                        com.sankuai.xm.im.utils.a.b("getEmptyCallbackInstance onFailure", new Object[0]);
                    }
                }
            };
        }
        return (com.sankuai.xm.im.a) a(aVar, obj, ((aVar instanceof f) || (aVar instanceof d)) ? 2 : 2, b.class);
    }

    private static synchronized boolean a(String str) {
        synchronized (a.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6e74c62371c190b7cb6e7d068f09450", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6e74c62371c190b7cb6e7d068f09450")).booleanValue();
            }
            return c.contains(str);
        }
    }

    private static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb625aa27bb90c9a454929ff08d62850", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb625aa27bb90c9a454929ff08d62850")).booleanValue() : com.sankuai.xm.threadpool.scheduler.a.b().a(Thread.currentThread().getName(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.sankuai.xm.im.notifier.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1abbfa5aad7d41ec49a3c2cee461ff51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1abbfa5aad7d41ec49a3c2cee461ff51");
            return;
        }
        try {
            com.sankuai.xm.im.utils.a.a("NotifyProxy, thread:" + bVar.f + ",method:" + bVar.b().getName(), new Object[0]);
            bVar.a();
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e, "NotifyCenter::notify, " + bVar.b().getName(), new Object[0]);
            if (b) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c implements InvocationHandler {
        public static ChangeQuickRedirect a;
        private Object b;
        private int c;

        public static /* synthetic */ void a(c cVar, Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "74f177a01fb84dfc4ad98048e1963fa0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "74f177a01fb84dfc4ad98048e1963fa0");
                return;
            }
            com.sankuai.xm.im.utils.a.a(exc, "NotifyCenter::notify, " + cVar.b.getClass().getName(), new Object[0]);
            if (a.b) {
                throw new RuntimeException(exc);
            }
        }

        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object] */
        public c(Object obj, int i, Class<?> cls) {
            Object[] objArr = {obj, Integer.valueOf(i), cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046ad5e6240c4fd5239cb74f16f0590f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046ad5e6240c4fd5239cb74f16f0590f");
                return;
            }
            this.c = 0;
            this.b = obj;
            if (cls != null && AbstractC1394a.class.isAssignableFrom(cls)) {
                try {
                    AbstractC1394a abstractC1394a = (AbstractC1394a) cls.newInstance();
                    abstractC1394a.c = this.b;
                    this.b = abstractC1394a;
                } catch (Exception e) {
                    com.sankuai.xm.im.utils.a.a(e);
                }
            }
            this.c = i;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "24290046060b1bfc63e5a3d7a019498a", 6917529027641081856L)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "24290046060b1bfc63e5a3d7a019498a");
            }
            com.sankuai.xm.im.notifier.b bVar = new com.sankuai.xm.im.notifier.b(this.b.getClass()) { // from class: com.sankuai.xm.im.notifier.a.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.notifier.b
                public final void a() throws Exception {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "74e476eac8fa1fc915434dca5d7cdc2e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "74e476eac8fa1fc915434dca5d7cdc2e");
                        return;
                    }
                    com.sankuai.xm.im.utils.a.a("NotifyProxy, thread:" + c.this.c + ",method:" + c.this.b.getClass().getName() + "::" + method.getName(), new Object[0]);
                    try {
                        method.invoke(c.this.b, objArr);
                    } catch (IllegalAccessException e) {
                        synchronized (a.class) {
                            a.c.add(c.this.b.getClass().getName());
                            c.a(c.this, e);
                        }
                    } catch (InvocationTargetException e2) {
                        synchronized (a.class) {
                            a.c.add(c.this.b.getClass().getName());
                            c.a(c.this, e2);
                        }
                    }
                }
            };
            bVar.f = this.c;
            a.a(bVar);
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.notifier.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC1394a<T> {
        public static ChangeQuickRedirect b;
        private String a;
        protected T c;
        private long d;

        public AbstractC1394a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae1842734c4f55fed5d6a1eb8918b60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae1842734c4f55fed5d6a1eb8918b60");
                return;
            }
            this.a = com.sankuai.xm.login.a.a().h();
            this.d = com.sankuai.xm.login.a.a().e();
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad10fb353b7da3b849584d709da76c8", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad10fb353b7da3b849584d709da76c8")).booleanValue();
            }
            String h = com.sankuai.xm.login.a.a().h();
            long e = com.sankuai.xm.login.a.a().e();
            return !ac.a(this.a) ? this.a.equals(h) ? (this.d == e || this.d == 0) ? false : true : (!ac.a(h) && e == 0) || e != this.d : !ac.a(h) ? this.d != e || e == 0 : (this.d == e || this.d == 0) ? false : true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b extends AbstractC1394a<com.sankuai.xm.im.a> implements com.sankuai.xm.im.a {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.xm.base.callback.Callback
        public void onSuccess(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f4133827d936ed652ff1658f29a3b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f4133827d936ed652ff1658f29a3b4");
            } else if (a()) {
                onFailure(19100, "account changed during requesting.");
            } else {
                com.sankuai.xm.base.callback.a.a((Callback) this.c, obj);
            }
        }

        @Override // com.sankuai.xm.base.callback.Callback
        public void onFailure(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8109dcd2367a992ed19fe51edc915649", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8109dcd2367a992ed19fe51edc915649");
            } else {
                com.sankuai.xm.base.callback.a.a((Callback) this.c, i, str);
            }
        }
    }
}
