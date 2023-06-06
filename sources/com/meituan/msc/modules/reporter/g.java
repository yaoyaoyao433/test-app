package com.meituan.msc.modules.reporter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final e b = new e();
    private static final ExecutorService c = com.sankuai.android.jarvis.c.a("msc-log");
    private static volatile c d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013f, code lost:
        if (r27.equals("V") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.lang.String r27, java.lang.String r28, java.lang.Throwable r29, java.lang.String r30, java.lang.Object... r31) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.reporter.g.b(java.lang.String, java.lang.String, java.lang.Throwable, java.lang.String, java.lang.Object[]):void");
    }

    private static void a(final String str, final String str2, final Throwable th, final Object... objArr) {
        Object[] objArr2 = {str, str2, th, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5333f1843f0ebeff89e3c568a40cfc64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5333f1843f0ebeff89e3c568a40cfc64");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        final String name = PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "af9252fa0de3bf7610a3370e72e7bea4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "af9252fa0de3bf7610a3370e72e7bea4") : Thread.currentThread().getName();
        c.execute(new Runnable() { // from class: com.meituan.msc.modules.reporter.g.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "8aa99c5347dff4d9801675100df5364f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "8aa99c5347dff4d9801675100df5364f");
                } else {
                    g.b(str, str2, th, name, objArr);
                }
            }
        });
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "1a633d76addca7142d74fdfb310a09c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "1a633d76addca7142d74fdfb310a09c0");
        } else if (a()) {
            a("V", str, null, objArr);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8f9b8bc3a5a5c1cfe7a361fe1a86ec1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8f9b8bc3a5a5c1cfe7a361fe1a86ec1");
        } else {
            b((String) null, str);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e289479097f3ad04a28e7d9402a35f0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e289479097f3ad04a28e7d9402a35f0c");
        } else if (a()) {
            a("D", str, null, objArr);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3e78f41b1bf1c067d6db33c8ecd3377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3e78f41b1bf1c067d6db33c8ecd3377");
        } else {
            d(null, str);
        }
    }

    public static void c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "f27c62e185d239479400aee72b3e32d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "f27c62e185d239479400aee72b3e32d2");
        } else {
            b("I", str, null, null, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5fcab3a1cce170cc4e67bf8223881162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5fcab3a1cce170cc4e67bf8223881162");
        } else {
            a("I", str, null, objArr);
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5069b1ace0323d347222ead592587517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5069b1ace0323d347222ead592587517");
        } else {
            e(null, str);
        }
    }

    public static void e(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "6ead8768ccc38b97f6510a4469c81819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "6ead8768ccc38b97f6510a4469c81819");
        } else {
            a(str, null, objArr);
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "b7fe58aa49506775b2b066ef8a1f8a2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "b7fe58aa49506775b2b066ef8a1f8a2f");
        } else {
            a("W", str, th, objArr);
        }
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ff1693515638e64256776161c31827b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ff1693515638e64256776161c31827b");
        } else {
            a((String) null, str);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fb1f7dea42a7f5d1019d852b9a2c7b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fb1f7dea42a7f5d1019d852b9a2c7b1");
        } else {
            b(str, null, str2);
        }
    }

    public static void b(String str, Throwable th, Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "ed8919f53124dd5de1f499944dd6a1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "ed8919f53124dd5de1f499944dd6a1b4");
        } else {
            a("E", str, th, objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a05a3579d4c6defb4a10ed1076724cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a05a3579d4c6defb4a10ed1076724cb");
        } else {
            a((String) null, th);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dde1133333b5d957a8e45816f52695a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dde1133333b5d957a8e45816f52695a");
        } else {
            a(str, c(th));
        }
    }

    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c862dec2c52775b35b98f474d022f8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c862dec2c52775b35b98f474d022f8f");
        } else {
            b(str, (Throwable) null);
        }
    }

    public static void b(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c000237acb371bf399600acf9c406a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c000237acb371bf399600acf9c406a3");
        } else if (!a()) {
            a(str, th);
        } else if (th != null) {
            if (!(th instanceof RuntimeException)) {
                throw new RuntimeException(th);
            }
        } else {
            throw new RuntimeException(str);
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95400ddfeeaed7e3f845f451c75795d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95400ddfeeaed7e3f845f451c75795d9")).booleanValue() : d != null && d.a();
    }

    private static String c(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7fa839a72e9a3fcb4dc3901be9dfa03", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7fa839a72e9a3fcb4dc3901be9dfa03");
        }
        String th2 = th != null ? th.toString() : "";
        StringBuilder sb = new StringBuilder();
        sb.append(th2);
        sb.append(th != null ? b(th) : "");
        return sb.toString();
    }

    public static String b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4d5a71d1ef94b204fa8afa7b154e55c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4d5a71d1ef94b204fa8afa7b154e55c");
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable th2) {
            d("class MSCTrace.java - method getAllStackInformation(Throwable) catch error " + th2);
            return "unknown: get stack information error";
        }
    }

    public static synchronized void a(c cVar) {
        synchronized (g.class) {
            d = cVar;
        }
    }
}
