package com.sankuai.xm.log;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.g;
import com.sankuai.xm.base.service.m;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static g b;
    private static g c;

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "d5fbcec735e696443cb718b1184fc07c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "d5fbcec735e696443cb718b1184fc07c");
        } else {
            a().a("BaseLog", str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "c4837bca829fe803ea420fbd6db28918", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "c4837bca829fe803ea420fbd6db28918");
        } else {
            a().b("BaseLog", str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "50a174bcb030fbc733dd06e0ff88b30b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "50a174bcb030fbc733dd06e0ff88b30b");
        } else {
            a().c("BaseLog", str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e6398b34b36ab241f08d03bc19f1eb03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e6398b34b36ab241f08d03bc19f1eb03");
        } else {
            a().d("BaseLog", str, objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21eb77217ba14b72358fcbba6f3adf4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21eb77217ba14b72358fcbba6f3adf4f");
        } else {
            a().a("BaseLog", th);
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Object[] objArr2 = {th, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "535edcc9efc4de8dd58660c8c8465266", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "535edcc9efc4de8dd58660c8c8465266");
        } else {
            a().a("BaseLog", th, str, objArr);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e8f7e06b73f00bb9c7d0493f65ea209", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e8f7e06b73f00bb9c7d0493f65ea209");
        } else {
            a().b("BaseLog", str, new Object[0]);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99c25f9b0d8635830854f8b682c8d707", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99c25f9b0d8635830854f8b682c8d707");
        } else {
            a().d("BaseLog", str, new Object[0]);
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b91ccfbcd7a1ae1c08b8bcd6a0589769", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b91ccfbcd7a1ae1c08b8bcd6a0589769");
        } else {
            a().a("BaseLog", str, new Object[0]);
        }
    }

    @NonNull
    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4aa8bbd663ec49d045ee5f29e367c39", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4aa8bbd663ec49d045ee5f29e367c39");
        }
        if (b != null) {
            return b;
        }
        synchronized (a.class) {
            if (b != null) {
                return b;
            }
            if (m.c(g.class)) {
                b = (g) m.a(g.class);
            }
            if (b != null) {
                return b;
            }
            if (c == null) {
                c = (g) Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{g.class}, new InvocationHandler() { // from class: com.sankuai.xm.log.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr2) {
                        Object[] objArr3 = {obj, method, objArr2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "d066b12d788d1815e23ec8557ce3c60a", 6917529027641081856L)) {
                            return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "d066b12d788d1815e23ec8557ce3c60a");
                        }
                        PrintStream printStream = System.out;
                        printStream.println("ILogger proxy is not available, log is: " + method.getName() + ", " + Arrays.toString(objArr2));
                        return null;
                    }
                });
            }
            return c;
        }
    }
}
