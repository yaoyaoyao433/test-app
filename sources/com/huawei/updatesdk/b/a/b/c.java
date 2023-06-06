package com.huawei.updatesdk.b.a.b;

import android.util.ArrayMap;
import android.util.ArraySet;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.PublicKey;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        ArrayMap<String, ArraySet<PublicKey>> a = null;
        ArraySet<String> b = null;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(File file) {
        a aVar = new a();
        Object b = b(file);
        if (b != null) {
            Object a2 = a(b, "mKeySetMapping");
            if (a2 instanceof ArrayMap) {
                aVar.a = (ArrayMap) a2;
            }
            Object a3 = a(b, "mUpgradeKeySets");
            if (a3 instanceof ArraySet) {
                aVar.b = (ArraySet) a3;
            }
        }
        return aVar;
    }

    private static Object a(Object obj, String str) {
        String str2;
        String str3;
        try {
            return Class.forName("android.content.pm.PackageParser$Package").getDeclaredField(str).get(obj);
        } catch (ClassNotFoundException unused) {
            str2 = "KeySetsUtils";
            str3 = "can not find class,ClassNotFoundException";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str2, str3);
            return null;
        } catch (IllegalAccessException unused2) {
            str2 = "KeySetsUtils";
            str3 = "can not find field,IllegalAccessException";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str2, str3);
            return null;
        } catch (NoSuchFieldError unused3) {
            str2 = "KeySetsUtils";
            str3 = "can not find field,NoSuchFieldError";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str2, str3);
            return null;
        } catch (NoSuchFieldException unused4) {
            str2 = "KeySetsUtils";
            str3 = "can not find field,NoSuchFieldException";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str2, str3);
            return null;
        }
    }

    private static Object b(File file) {
        String str;
        String str2;
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            return cls.getDeclaredMethod("parsePackage", File.class, Integer.TYPE).invoke(cls.newInstance(), file, 0);
        } catch (ClassNotFoundException unused) {
            str = "KeySetsUtils";
            str2 = "can not get PackageParser,ClassNotFoundException";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str, str2);
            return null;
        } catch (IllegalAccessException unused2) {
            str = "KeySetsUtils";
            str2 = "can not get PackageParser,IllegalAccessException";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str, str2);
            return null;
        } catch (InstantiationException unused3) {
            str = "KeySetsUtils";
            str2 = "can not get PackageParser,InstantiationException";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str, str2);
            return null;
        } catch (NoSuchMethodException unused4) {
            str = "KeySetsUtils";
            str2 = "can not get PackageParser,NoSuchMethodException";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str, str2);
            return null;
        } catch (InvocationTargetException unused5) {
            str = "KeySetsUtils";
            str2 = "can not get PackageParser,InvocationTargetException";
            com.huawei.updatesdk.a.a.c.a.a.a.c(str, str2);
            return null;
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.c("KeySetsUtils", "can not get PackageParser," + e.getMessage());
            return null;
        }
    }
}
