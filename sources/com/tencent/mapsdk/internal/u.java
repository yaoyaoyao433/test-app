package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.internal.sd;
import java.io.File;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class u implements rz, sa, sc {
    private static final u c = new u();
    s b;
    public sa a = new sa() { // from class: com.tencent.mapsdk.internal.u.1
        @Override // com.tencent.mapsdk.internal.sd.a
        public final void a(Context context, String str) {
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final int c() {
            return 0;
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final File d() {
            return null;
        }

        @Override // com.tencent.mapsdk.internal.sd.a
        public final void i() {
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final Object b(String str) {
            return Util.newInstance(a(str), new Object[0]);
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final <T> T a(Class<T> cls, Object... objArr) {
            return (T) Util.newInstance(cls, objArr);
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final ClassLoader b() {
            return getClass().getClassLoader();
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final Object a(Object obj, String str, Object... objArr) {
            return Util.invokeMethod(obj, str, objArr);
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final Object a(Object obj, String str, Class[] clsArr, Object[] objArr) {
            return Util.invokeMethod(obj, str, clsArr, objArr);
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final Object a(Class cls, String str, Class[] clsArr, Object[] objArr) {
            return Util.invokeStaticMethod(cls, str, clsArr, objArr);
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final Class a(String str) {
            return Util.findClass(str, getClass().getClassLoader());
        }

        @Override // com.tencent.mapsdk.internal.sa
        public final <T> Class<? extends T> a(String str, Class<T> cls) {
            return Util.findClass(str, cls, getClass().getClassLoader());
        }
    };
    private rz d = new rz() { // from class: com.tencent.mapsdk.internal.u.2
        @Override // com.tencent.mapsdk.internal.sd.a
        public final void a(Context context, String str) {
        }

        @Override // com.tencent.mapsdk.internal.rz
        public final void h() {
        }

        @Override // com.tencent.mapsdk.internal.sd.a
        public final void i() {
        }
    };
    private sc e = new sc() { // from class: com.tencent.mapsdk.internal.u.3
        @Override // com.tencent.mapsdk.internal.sd.a
        public final void a(Context context, String str) {
        }

        @Override // com.tencent.mapsdk.internal.sc
        public final void e() {
        }

        @Override // com.tencent.mapsdk.internal.sc
        public final void f() {
        }

        @Override // com.tencent.mapsdk.internal.sc
        public final void g() {
        }

        @Override // com.tencent.mapsdk.internal.sd.a
        public final void i() {
        }
    };

    @Override // com.tencent.mapsdk.internal.sc
    public final void e() {
    }

    @Override // com.tencent.mapsdk.internal.sc
    public final void f() {
    }

    @Override // com.tencent.mapsdk.internal.sc
    public final void g() {
    }

    @Override // com.tencent.mapsdk.internal.rz
    public final void h() {
    }

    @Override // com.tencent.mapsdk.internal.sd.a
    public final void i() {
    }

    public static u a() {
        return c;
    }

    private u() {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.u$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass4 implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ Handler c;
        final /* synthetic */ Callback d;

        public AnonymousClass4(Context context, String str, Handler handler, Callback callback) {
            this.a = context;
            this.b = str;
            this.c = handler;
            this.d = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            u.this.a(this.a, this.b);
            this.c.post(new Runnable() { // from class: com.tencent.mapsdk.internal.u.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AnonymousClass4.this.d != null) {
                        AnonymousClass4.this.d.callback(null);
                    }
                }
            });
        }
    }

    private void a(Context context, String str, Callback<Void> callback) {
        new Thread(new AnonymousClass4(context, str, new Handler(Looper.getMainLooper()), callback), "tms-plugin").start();
    }

    @Override // com.tencent.mapsdk.internal.sd.a
    public final void a(Context context, String str) {
        sd.a(context);
        if (!sd.p.isEmpty()) {
            Iterator<sd.b> it = sd.p.iterator();
            while (it.hasNext()) {
                String str2 = "com.tencent.mapsdk." + it.next().d;
                Object b = Util.findClass(str2, getClass().getClassLoader()) != null ? this.a.b(str2) : null;
                if (b instanceof sd.a) {
                    ((sd.a) b).a(context, str);
                }
                if (b instanceof sa) {
                    this.a = (sa) b;
                } else if (b instanceof sc) {
                    this.e = (sc) b;
                } else if (b instanceof rz) {
                    this.d = (rz) b;
                }
            }
        }
        this.b = (s) this.a.b("com.tencent.mapsdk.core.MapDelegateFactoryImpl");
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final Class a(String str) {
        return this.a.a(str);
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final <T> Class<? extends T> a(String str, Class<T> cls) {
        return this.a.a(str, cls);
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final Object b(String str) {
        return this.a.b(str);
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final <T> T a(Class<T> cls, Object... objArr) {
        return (T) this.a.a(cls, objArr);
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final ClassLoader b() {
        return this.a.b();
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final Object a(Object obj, String str, Object... objArr) {
        return this.a.a(obj, str, objArr);
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final Object a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        return this.a.a(obj, str, clsArr, objArr);
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final Object a(Class cls, String str, Class[] clsArr, Object[] objArr) {
        return this.a.a(cls, str, clsArr, objArr);
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final int c() {
        return this.a.c();
    }

    @Override // com.tencent.mapsdk.internal.sa
    public final File d() {
        return this.a.d();
    }

    private s j() {
        return this.b;
    }

    private File k() {
        return this.a.d();
    }
}
