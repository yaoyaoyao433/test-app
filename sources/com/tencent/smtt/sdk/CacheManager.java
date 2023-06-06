package com.tencent.smtt.sdk;

import java.io.File;
import java.io.InputStream;
import java.util.Map;
@Deprecated
/* loaded from: classes6.dex */
public final class CacheManager {
    @Deprecated
    public static boolean cacheDisabled() {
        Object a;
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            a = com.tencent.smtt.utils.i.a("android.webkit.CacheManager", "cacheDisabled");
            if (a == null) {
                return false;
            }
        } else {
            a = a2.c().c();
        }
        return ((Boolean) a).booleanValue();
    }

    public static InputStream getCacheFile(String str, boolean z) {
        x a = x.a();
        if (a == null || !a.b()) {
            return null;
        }
        return a.c().a(str, z);
    }

    public static Object getCacheFile(String str, Map<String, String> map) {
        x a = x.a();
        if (a == null || !a.b()) {
            try {
                return com.tencent.smtt.utils.i.a(Class.forName("android.webkit.CacheManager"), "getCacheFile", (Class<?>[]) new Class[]{String.class, Map.class}, str, map);
            } catch (Exception unused) {
                return null;
            }
        }
        return a.c().g();
    }

    @Deprecated
    public static File getCacheFileBaseDir() {
        x a = x.a();
        return (File) ((a == null || !a.b()) ? com.tencent.smtt.utils.i.a("android.webkit.CacheManager", "getCacheFileBaseDir") : a.c().g());
    }
}
