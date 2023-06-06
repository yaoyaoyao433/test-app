package com.meituan.android.mrn.debug.interfaces;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Constructor;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static String b = "MRNDebugManagerImpl";
    private static com.meituan.android.mrn.debug.interfaces.a c;

    public static synchronized com.meituan.android.mrn.debug.interfaces.a a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce91e530f0de98654f563896364d8ee0", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.android.mrn.debug.interfaces.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce91e530f0de98654f563896364d8ee0");
            }
            if (c == null) {
                try {
                    Constructor<?> constructor = Class.forName("com.meituan.android.mrn.debug." + b).getConstructor(Context.class);
                    Context a2 = com.meituan.android.mrn.common.a.a();
                    if (a2 == null) {
                        a2 = b();
                    }
                    if (a2 == null) {
                        return new a();
                    }
                    c = (com.meituan.android.mrn.debug.interfaces.a) constructor.newInstance(a2);
                } catch (Exception unused) {
                    return new a();
                }
            }
            return c;
        }
    }

    private static Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab0aa1834ec17ff4e2070f871ee53fbe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab0aa1834ec17ff4e2070f871ee53fbe");
        }
        try {
            return ((Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements com.meituan.android.mrn.debug.interfaces.a {
        public a() {
        }
    }
}
