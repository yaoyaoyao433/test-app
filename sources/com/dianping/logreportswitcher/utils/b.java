package com.dianping.logreportswitcher.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.dianping.logreportswitcher.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Object b = new Object();
    private static volatile SharedPreferences c;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b5c2a71d7d298e680920c227674970b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b5c2a71d7d298e680920c227674970b");
            return;
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            a2.edit().putString(str, str2).apply();
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31b705089a283d621f8bf7b19a53370c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31b705089a283d621f8bf7b19a53370c");
            return;
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            a2.edit().remove(str).apply();
        }
    }

    public static void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe9318a0c55a2c8e7f81c9b0920ed809", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe9318a0c55a2c8e7f81c9b0920ed809");
            return;
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            a2.edit().putLong(str, j).apply();
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6b9432453dc87d3ad58d81540588eaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6b9432453dc87d3ad58d81540588eaa");
            return;
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            a2.edit().remove(str).apply();
        }
    }

    public static void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd7854c360cc7f8e4934de7d00ebe2b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd7854c360cc7f8e4934de7d00ebe2b6");
            return;
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            a2.edit().putBoolean(str, z).apply();
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc6940ae9aadfd2bcbcf6a9bc0304697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc6940ae9aadfd2bcbcf6a9bc0304697");
            return;
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            a2.edit().remove(str).apply();
        }
    }

    public static long d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae74e93103d86ff125fa90ee6b486ba0", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae74e93103d86ff125fa90ee6b486ba0")).longValue();
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            return a2.getLong(str, 0L);
        }
        return 0L;
    }

    public static long b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f620c60362e92d5b6a15454f77c6eae1", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f620c60362e92d5b6a15454f77c6eae1")).longValue();
        }
        SharedPreferences a2 = a();
        return a2 != null ? a2.getLong(str, j) : j;
    }

    public static boolean b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2214cdc0e84a42a9370a725edd40260", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2214cdc0e84a42a9370a725edd40260")).booleanValue();
        }
        SharedPreferences a2 = a();
        return a2 != null ? a2.getBoolean(str, z) : z;
    }

    public static boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adbe54c1089d1b083d39e3493e85df19", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adbe54c1089d1b083d39e3493e85df19")).booleanValue();
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            return a2.contains(str);
        }
        return false;
    }

    public static String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ae7fa202b901af7cb166b93a2b2a8a8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ae7fa202b901af7cb166b93a2b2a8a8");
        }
        SharedPreferences a2 = a();
        if (a2 != null) {
            return a2.getString(str, null);
        }
        return null;
    }

    private static SharedPreferences a() {
        Context context;
        SharedPreferences sharedPreferences;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a52d23a27c14cd2a49489ec91f672a3", 6917529027641081856L)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a52d23a27c14cd2a49489ec91f672a3");
        }
        SharedPreferences sharedPreferences2 = c;
        if (sharedPreferences2 == null && (context = c.b.a.b) != null) {
            synchronized (b) {
                sharedPreferences2 = c;
                if (sharedPreferences2 == null) {
                    try {
                        sharedPreferences = context.getSharedPreferences("logreportswitcher.config", 0);
                        try {
                            c = sharedPreferences;
                        } catch (RuntimeException unused) {
                        }
                    } catch (RuntimeException unused2) {
                        sharedPreferences = sharedPreferences2;
                    }
                    sharedPreferences2 = sharedPreferences;
                }
            }
        }
        return sharedPreferences2;
    }
}
