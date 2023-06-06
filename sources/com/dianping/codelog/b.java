package com.dianping.codelog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.codelog.Appender.c;
import com.dianping.codelog.Utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private static a c;
    private static final List<com.dianping.codelog.Appender.a> d;
    private static Context e;
    private static AtomicBoolean f;

    static {
        com.dianping.codelog.Appender.b bVar;
        com.dianping.codelog.Appender.a[] aVarArr = new com.dianping.codelog.Appender.a[2];
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = com.dianping.codelog.Appender.b.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "144d13785ad52b8898de2c8eaa4ebfa1", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.dianping.codelog.Appender.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "144d13785ad52b8898de2c8eaa4ebfa1");
        } else {
            if (com.dianping.codelog.Appender.b.b == null) {
                com.dianping.codelog.Appender.b.b = new com.dianping.codelog.Appender.b();
            }
            bVar = com.dianping.codelog.Appender.b.b;
        }
        aVarArr[0] = bVar;
        aVarArr[1] = c.a.a;
        d = Arrays.asList(aVarArr);
        f = new AtomicBoolean(false);
    }

    public static a a() {
        return c;
    }

    public static void a(Class cls, @NonNull String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63c636b33e5259164ebd411e2b10329f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63c636b33e5259164ebd411e2b10329f");
        } else {
            a(cls, "", str);
        }
    }

    public static void b(Class cls, @NonNull String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fb31e4524346a296baf48888486b73a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fb31e4524346a296baf48888486b73a");
        } else {
            b(cls, null, str);
        }
    }

    public static void a(Class cls, String str, @NonNull String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40ccee35bf25580832193959ceb9806c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40ccee35bf25580832193959ceb9806c");
        } else if (cls == null) {
            throw new NullPointerException("clazz can not null...");
        } else {
            a("normal", cls, str, str2);
        }
    }

    public static void b(Class cls, String str, @NonNull String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fce74379618eefcc81815108d134f7e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fce74379618eefcc81815108d134f7e3");
        } else if (cls == null) {
            throw new NullPointerException("clazz can not null...");
        } else {
            a("error", cls, str, str2);
        }
    }

    public static void a(Context context, a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77111b7473aa88110e2f7941c424375c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77111b7473aa88110e2f7941c424375c");
        } else if (!f.get() && f.compareAndSet(false, true)) {
            e = context;
            c = aVar;
            if (d != null && !d.isEmpty()) {
                for (com.dianping.codelog.Appender.a aVar2 : d) {
                    aVar2.a();
                }
            }
            f.a();
        }
    }

    private static void a(String str, Class cls, String str2, String str3) {
        Object[] objArr = {str, cls, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afcb7fe6cd8359ddd02bb214a00f4b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afcb7fe6cd8359ddd02bb214a00f4b10");
        } else if (d != null && !d.isEmpty() && !TextUtils.isEmpty(str3)) {
            boolean isAssignableFrom = Throwable.class.isAssignableFrom(cls);
            String b2 = f.b(str2);
            String c2 = f.c(TextUtils.isEmpty(b2) ? cls.getName() : cls.getName() + "::" + b2);
            for (int i = 0; i < d.size(); i++) {
                if (isAssignableFrom && (d.get(i) instanceof c)) {
                    c cVar = (c) d.get(i);
                    Object[] objArr2 = {cVar, str, c2, str3, Byte.valueOf(isAssignableFrom ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ed8dd6c054bcf93e73f6f6f8297f34f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ed8dd6c054bcf93e73f6f6f8297f34f7");
                    } else if (cVar != null) {
                        if ("normal".equalsIgnoreCase(str)) {
                            cVar.a(str, c2, str3, isAssignableFrom);
                        } else if ("error".equalsIgnoreCase(str)) {
                            cVar.b(str, c2, str3, isAssignableFrom);
                        }
                    }
                } else {
                    com.dianping.codelog.Appender.a aVar = d.get(i);
                    Object[] objArr3 = {aVar, str, c2, str3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "80b92fbc9b103baefbd21e5e8e397fb1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "80b92fbc9b103baefbd21e5e8e397fb1");
                    } else if (aVar != null) {
                        if ("normal".equalsIgnoreCase(str)) {
                            aVar.a(str, c2, str3);
                        } else if ("error".equalsIgnoreCase(str)) {
                            aVar.b(str, c2, str3);
                        }
                    }
                }
            }
        }
    }

    public static Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b15e14dbe0f42bf71324c8400a2296bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b15e14dbe0f42bf71324c8400a2296bd");
        }
        if (e == null) {
            return null;
        }
        return e.getApplicationContext();
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59c038d7e68718ba3e91dab4e3418b0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59c038d7e68718ba3e91dab4e3418b0e")).booleanValue() : f.get();
    }
}
