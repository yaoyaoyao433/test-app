package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.JsonParser;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.common.CommonConstant;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h {
    static final boolean a;
    @Nullable
    static g b;
    @Nullable
    private static l[] f;
    @Nullable
    private static b g;
    private static int l;
    private static q m;
    private static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    @Nullable
    private static i[] d = null;
    private static int e = 0;
    private static final HashSet<String> h = new HashSet<>();
    private static final Map<String, Object> i = new HashMap();
    private static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap());
    @Nullable
    private static k k = null;

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        a = z;
    }

    private static void a(Context context, int i2, @Nullable g gVar) throws IOException {
        int i3;
        c.writeLock().lock();
        try {
            if (d == null) {
                a(context);
                l = i2;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(CommonConstant.Symbol.COLON);
                for (int i4 = 0; i4 < split.length; i4++) {
                    new StringBuilder("adding system library source: ").append(split[i4]);
                    arrayList.add(new c(new File(split[i4]), 2));
                }
                if (context != null) {
                    if ((i2 & 1) != 0) {
                        f = null;
                        arrayList.add(0, new d(context, "lib-main"));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                            i3 = 0;
                        } else {
                            g = new b(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                            new StringBuilder("adding application source: ").append(g.toString());
                            arrayList.add(0, g);
                            i3 = 1;
                        }
                        if ((l & 8) != 0) {
                            f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            com.facebook.soloader.a aVar = new com.facebook.soloader.a(context, file, "lib-main", i3);
                            arrayList2.add(aVar);
                            new StringBuilder("adding backup source from : ").append(aVar.toString());
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < length) {
                                    com.facebook.soloader.a aVar2 = new com.facebook.soloader.a(context, new File(strArr[i5]), "lib-" + i6, i3);
                                    new StringBuilder("adding backup source: ").append(aVar2.toString());
                                    arrayList2.add(aVar2);
                                    i5++;
                                    i6++;
                                }
                            }
                            f = (l[]) arrayList2.toArray(new l[arrayList2.size()]);
                            if (m != null && !m.b("key_enable_apksosource", true)) {
                                arrayList.addAll(0, arrayList2);
                            }
                        }
                    }
                }
                i[] iVarArr = (i[]) arrayList.toArray(new i[arrayList.size()]);
                int b2 = b();
                int length2 = iVarArr.length;
                while (true) {
                    int i7 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    new StringBuilder("Preparing SO source: ").append(iVarArr[i7]);
                    iVarArr[i7].a(b2);
                    length2 = i7;
                }
                d = iVarArr;
                e++;
                StringBuilder sb = new StringBuilder("init finish: ");
                sb.append(d.length);
                sb.append(" SO sources prepared");
            }
        } finally {
            c.writeLock().unlock();
        }
    }

    private static void a(Context context) {
        if (m == null) {
            m = q.a(context, "mrn_default");
        }
        Horn.register("mrn_soloader_android", new HornCallback() { // from class: com.facebook.soloader.h.1
            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                new StringBuilder("Horn ").append(str);
                if (z) {
                    try {
                        boolean asBoolean = new JsonParser().parse(str).getAsJsonObject().get("disableApkSoSource").getAsBoolean();
                        if (h.m != null) {
                            h.m.a("key_enable_apksosource", asBoolean);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    private static int b() {
        c.writeLock().lock();
        try {
            return (l & 2) != 0 ? 1 : 0;
        } finally {
            c.writeLock().unlock();
        }
    }

    private static synchronized void a(@Nullable g gVar) {
        final String join;
        synchronized (h.class) {
            if (gVar != null) {
                b = gVar;
                return;
            }
            final Runtime runtime = Runtime.getRuntime();
            final Method c2 = c();
            final boolean z = c2 != null;
            final String a2 = z ? a.a() : null;
            if (a2 == null) {
                join = null;
            } else {
                String[] split = a2.split(CommonConstant.Symbol.COLON);
                ArrayList arrayList = new ArrayList(split.length);
                for (String str : split) {
                    if (!str.contains("!")) {
                        arrayList.add(str);
                    }
                }
                join = TextUtils.join(CommonConstant.Symbol.COLON, arrayList);
            }
            b = new g() { // from class: com.facebook.soloader.h.2
            };
        }
    }

    @Nullable
    private static Method c() {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException e2) {
            Log.w("SoLoader", "Cannot get nativeLoad method", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @DoNotOptimize
    @TargetApi(14)
    /* loaded from: classes2.dex */
    public static class a {
        public static String a() {
            ClassLoader classLoader = h.class.getClassLoader();
            if (!(classLoader instanceof BaseDexClassLoader)) {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e);
            }
        }
    }

    public static void a(Context context, boolean z) {
        try {
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            a((g) null);
            a(context.getApplicationContext(), 0, null);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
