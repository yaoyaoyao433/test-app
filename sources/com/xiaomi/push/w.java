package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* loaded from: classes6.dex */
public class w implements v, InvocationHandler {
    private static final String[][] a = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};
    private Context k;
    private Class b = null;
    private Class c = null;
    private Method d = null;
    private Method e = null;
    private Method f = null;
    private Method g = null;
    private Method h = null;
    private Method i = null;
    private Method j = null;
    private final Object l = new Object();
    private volatile int m = 0;
    private volatile long n = 0;
    private volatile a o = null;

    /* loaded from: classes6.dex */
    public class a {
        Boolean a;
        String b;
        String c;
        String d;
        String e;

        private a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    public w(Context context) {
        this.k = context.getApplicationContext();
        a(context);
        b(context);
    }

    private static Class<?> a(Context context, String str) {
        try {
            return jr.a(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static <T> T a(Method method, Object obj, Object... objArr) {
        if (method != null) {
            try {
                T t = (T) method.invoke(obj, objArr);
                if (t != null) {
                    return t;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls != null) {
            try {
                return cls.getMethod(str, clsArr);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private void a(Context context) {
        Class<?> a2 = a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            if (i >= a.length) {
                break;
            }
            String[] strArr = a[i];
            Class<?> a3 = a(context, strArr[0]);
            Class<?> a4 = a(context, strArr[1]);
            if (a3 != null && a4 != null) {
                b("found class in index " + i);
                cls2 = a4;
                cls = a3;
                break;
            }
            i++;
            cls2 = a4;
            cls = a3;
        }
        this.b = a2;
        this.d = a(a2, "InitSdk", Context.class, cls);
        this.c = cls;
        this.e = a(cls2, "getUDID", new Class[0]);
        this.f = a(cls2, "getOAID", new Class[0]);
        this.g = a(cls2, "getVAID", new Class[0]);
        this.h = a(cls2, "getAAID", new Class[0]);
        this.i = a(cls2, "isSupported", new Class[0]);
        this.j = a(cls2, "shutDown", new Class[0]);
    }

    private void a(String str) {
        if (this.o != null) {
            return;
        }
        long j = this.n;
        long elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
        int i = this.m;
        if (elapsedRealtime > PayTask.j && i < 3) {
            synchronized (this.l) {
                if (this.n == j && this.m == i) {
                    b("retry, current count is " + i);
                    this.m = this.m + 1;
                    b(this.k);
                    j = this.n;
                    elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
                }
            }
        }
        if (this.o != null || j < 0 || elapsedRealtime > PayTask.j || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.l) {
            if (this.o == null) {
                try {
                    b(str + " wait...");
                    this.l.wait(PayTask.j);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void b(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -elapsedRealtime;
        if (this.c != null) {
            try {
                ClassLoader classLoader = this.c.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                a(this.d, this.b.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.c}, this));
            } catch (Throwable th) {
                b("call init sdk error:" + th);
            }
            this.n = elapsedRealtime;
        }
        elapsedRealtime = j;
        this.n = elapsedRealtime;
    }

    private static void b(String str) {
        com.xiaomi.channel.commonutils.logger.c.a("mdid:" + str);
    }

    @Override // com.xiaomi.push.v
    public final boolean a() {
        a("isSupported");
        return this.o != null && Boolean.TRUE.equals(this.o.a);
    }

    @Override // com.xiaomi.push.v
    public final String b() {
        a("getOAID");
        if (this.o == null) {
            return null;
        }
        return this.o.c;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.n = SystemClock.elapsedRealtime();
        if (objArr != null) {
            a aVar = new a();
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr[i];
                if (obj2 != null) {
                    if ((obj2 instanceof Boolean) || (obj2 instanceof Character) || (obj2 instanceof Byte) || (obj2 instanceof Short) || (obj2 instanceof Integer) || (obj2 instanceof Long) || (obj2 instanceof Float) || (obj2 instanceof Double)) {
                        continue;
                    } else {
                        aVar.b = (String) a(this.e, obj2, new Object[0]);
                        aVar.c = (String) a(this.f, obj2, new Object[0]);
                        aVar.d = (String) a(this.g, obj2, new Object[0]);
                        aVar.e = (String) a(this.h, obj2, new Object[0]);
                        aVar.a = (Boolean) a(this.i, obj2, new Object[0]);
                        a(this.j, obj2, new Object[0]);
                        if (!TextUtils.isEmpty(aVar.b) || !TextUtils.isEmpty(aVar.c) || !TextUtils.isEmpty(aVar.d) || !TextUtils.isEmpty(aVar.e)) {
                            aVar.a = Boolean.TRUE;
                        }
                        if (aVar.a != null) {
                            StringBuilder sb = new StringBuilder("has get succ, check duplicate:");
                            sb.append(this.o != null);
                            b(sb.toString());
                            synchronized (w.class) {
                                if (this.o == null) {
                                    this.o = aVar;
                                }
                            }
                        }
                    }
                }
                i++;
            }
        }
        synchronized (this.l) {
            try {
                this.l.notifyAll();
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
