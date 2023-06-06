package com.meituan.android.mrn.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static String b;

    public static void a(String str) {
        b = str;
    }

    public static void a() {
        b = null;
    }

    public static String b() {
        return b;
    }

    private static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6160853d45feb67d9c0e988c6baa6a1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6160853d45feb67d9c0e988c6baa6a1b");
        }
        Object[] objArr2 = {str, 500};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f778433ac04cf605505e657a70492c84", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f778433ac04cf605505e657a70492c84") : (str == null || str.length() < 500) ? str : str.substring(0, 500);
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "079363d5c6c1d154e1202ec872b8d921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "079363d5c6c1d154e1202ec872b8d921");
        } else {
            a(str, str2, str3, false);
        }
    }

    public static void a(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baf3181f63a4344c47bbcfea7939d9ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baf3181f63a4344c47bbcfea7939d9ad");
            return;
        }
        if (z) {
            str3 = c(str3);
        }
        com.meituan.crashreporter.c.a(str).a(str2, str3);
    }

    public static void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c051be0cce13fae07d7c639b47ca6380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c051be0cce13fae07d7c639b47ca6380");
        } else {
            com.meituan.crashreporter.c.a(str).b(str2, str3);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42b822694c23b6891b2b2e31369d8d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42b822694c23b6891b2b2e31369d8d7c");
        } else {
            com.meituan.crashreporter.c.a(str).b(str2);
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a263e7119054bd788243d8b9047d7c66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a263e7119054bd788243d8b9047d7c66");
        } else {
            com.meituan.crashreporter.c.a(str).c(str2);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d8c1d5cc08b2a4886f7ff18d5f9553b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d8c1d5cc08b2a4886f7ff18d5f9553b");
        } else {
            com.meituan.crashreporter.c.a(str).b();
        }
    }

    public static void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88658cdc30d0dc18650aadcad949993f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88658cdc30d0dc18650aadcad949993f");
        } else {
            com.meituan.crashreporter.c.a(str).a(str2);
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21d34a084ab3111cd89c66bf7aa2eb93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21d34a084ab3111cd89c66bf7aa2eb93");
            return;
        }
        try {
            com.meituan.crashreporter.c.c().a(new com.meituan.crashreporter.a() { // from class: com.meituan.android.mrn.utils.i.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.crashreporter.a
                public final Map<String, Object> getCrashInfo(String str, boolean z) {
                    Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68c1ebf4567b14dd7041a4be8dc52f4d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68c1ebf4567b14dd7041a4be8dc52f4d");
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("mrnId", i.b());
                    return hashMap;
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
