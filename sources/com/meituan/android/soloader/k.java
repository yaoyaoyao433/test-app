package com.meituan.android.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class k {
    public static ChangeQuickRedirect a = null;
    public static final boolean b;
    @Nullable
    public static boolean c = false;
    public static j d;
    @Nullable
    private static o[] h;
    @Nullable
    private static d i;
    private static int n;
    private static volatile boolean o;
    private static final ReentrantReadWriteLock e = new ReentrantReadWriteLock();
    @Nullable
    private static m[] f = null;
    private static int g = 0;
    private static final HashSet<String> j = new HashSet<>();
    private static final Map<String, Object> k = new HashMap();
    private static final Set<String> l = Collections.newSetFromMap(new ConcurrentHashMap());
    @Nullable
    private static n m = null;
    private static com.meituan.android.loader.f p = new com.meituan.android.loader.d();

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        b = z;
    }

    public static void a(com.meituan.android.loader.f fVar) {
        p = fVar;
    }

    public static com.meituan.android.loader.f a() {
        return p;
    }

    public static void a(Context context, boolean z) {
        Object[] objArr = {context, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c20b569d5767b28a472bc5ea2837060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c20b569d5767b28a472bc5ea2837060");
            return;
        }
        try {
            Object[] objArr2 = {context, 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3696a9091a1dc52691161e758a6eb99c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3696a9091a1dc52691161e758a6eb99c");
                return;
            }
            Object[] objArr3 = {context, 0, null};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a7a2ebc1fd6a1709549b4271db8e4f26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a7a2ebc1fd6a1709549b4271db8e4f26");
            } else if (o) {
            } else {
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                com.meituan.android.loader.g.a(context.getFilesDir() + File.separator);
                a((j) null);
                a(context.getApplicationContext(), 0, (j) null);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                o = true;
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void a(Context context, int i2, @Nullable j jVar) throws IOException {
        int i3;
        int i4 = 0;
        Object[] objArr = {context, Integer.valueOf(i2), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c8ecb01a3e2e7d2fab7bd42bc6955a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c8ecb01a3e2e7d2fab7bd42bc6955a9");
            return;
        }
        e.writeLock().lock();
        try {
            if (f == null) {
                n = 0;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(CommonConstant.Symbol.COLON);
                for (int i5 = 0; i5 < split.length; i5++) {
                    new StringBuilder("adding system library source: ").append(split[i5]);
                    arrayList.add(new e(new File(split[i5]), 2));
                }
                if (context != null) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                        i3 = 0;
                    } else {
                        i = new d(context, Build.VERSION.SDK_INT <= 17 ? 1 : 0);
                        new StringBuilder("adding application source: ").append(i.toString());
                        arrayList.add(0, i);
                        i3 = 1;
                    }
                    if ((n & 8) != 0) {
                        h = null;
                    } else {
                        File file = new File(context.getApplicationInfo().sourceDir);
                        ArrayList arrayList2 = new ArrayList();
                        c cVar = new c(context, file, "lib-main", i3);
                        arrayList2.add(cVar);
                        new StringBuilder("adding backup source from : ").append(cVar.toString());
                        if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                            String[] strArr = context.getApplicationInfo().splitSourceDirs;
                            int length = strArr.length;
                            int i6 = 0;
                            while (i4 < length) {
                                c cVar2 = new c(context, new File(strArr[i4]), "lib-" + i6, i3);
                                new StringBuilder("adding backup source: ").append(cVar2.toString());
                                arrayList2.add(cVar2);
                                i4++;
                                i6++;
                            }
                        }
                        h = (o[]) arrayList2.toArray(new o[arrayList2.size()]);
                    }
                }
                m[] mVarArr = (m[]) arrayList.toArray(new m[arrayList.size()]);
                int b2 = b();
                int length2 = mVarArr.length;
                while (true) {
                    int i7 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    new StringBuilder("Preparing SO source: ").append(mVarArr[i7]);
                    mVarArr[i7].a(b2);
                    length2 = i7;
                }
                f = mVarArr;
                p.a(">>>Dynloader initSoSources success~");
                g++;
                StringBuilder sb = new StringBuilder("init finish: ");
                sb.append(f.length);
                sb.append(" SO sources prepared");
            } else {
                p.a(">>>Dynloader initSoSources sSoSources is not null");
            }
        } finally {
            e.writeLock().unlock();
        }
    }

    private static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b46f9656b00400ac550ae9f78c44fc86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b46f9656b00400ac550ae9f78c44fc86")).intValue();
        }
        e.writeLock().lock();
        try {
            return (n & 2) != 0 ? 1 : 0;
        } finally {
            e.writeLock().unlock();
        }
    }

    private static synchronized void a(@Nullable j jVar) {
        synchronized (k.class) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            String str = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e13f46ed4cea737242aeb483116b2e9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e13f46ed4cea737242aeb483116b2e9b");
            } else if (jVar != null) {
                d = jVar;
            } else {
                final Runtime runtime = Runtime.getRuntime();
                final Method c2 = c();
                final boolean z = c2 != null;
                String a2 = z ? a.a() : null;
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e68ffb93d00f4c110a23c8ad10986c85", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e68ffb93d00f4c110a23c8ad10986c85");
                } else if (a2 != null) {
                    String[] split = a2.split(CommonConstant.Symbol.COLON);
                    ArrayList arrayList = new ArrayList(split.length);
                    for (String str2 : split) {
                        if (!str2.contains("!")) {
                            arrayList.add(str2);
                        }
                    }
                    str = TextUtils.join(CommonConstant.Symbol.COLON, arrayList);
                }
                final String str3 = str;
                final String str4 = a2;
                d = new j() { // from class: com.meituan.android.soloader.k.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
                        if (r4 == null) goto L27;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
                        if (com.meituan.android.soloader.k.c == false) goto L26;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
                        android.util.Log.e("SoLoader", "Error when loading lib: " + r4 + " lib hash: " + a(r16) + " search path is " + r2);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
                        return;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
                        return;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
                        return;
                     */
                    @Override // com.meituan.android.soloader.j
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(java.lang.String r16, int r17) {
                        /*
                            Method dump skipped, instructions count: 266
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.soloader.k.AnonymousClass1.a(java.lang.String, int):void");
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
                        if (r1 == null) goto L21;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
                        if (r1 == null) goto L21;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.String] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private java.lang.String a(java.lang.String r13) {
                        /*
                            r12 = this;
                            r0 = 1
                            java.lang.Object[] r8 = new java.lang.Object[r0]
                            r9 = 0
                            r8[r9] = r13
                            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.soloader.k.AnonymousClass1.a
                            java.lang.String r11 = "f125d42d26bd33ebbf4724e2d6418300"
                            r4 = 0
                            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r1 = r8
                            r2 = r12
                            r3 = r10
                            r5 = r11
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            if (r1 == 0) goto L1e
                            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                            java.lang.String r13 = (java.lang.String) r13
                            return r13
                        L1e:
                            r1 = 0
                            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L5f java.security.NoSuchAlgorithmException -> L62 java.lang.SecurityException -> L6d java.io.IOException -> L75
                            r2.<init>(r13)     // Catch: java.lang.Throwable -> L5f java.security.NoSuchAlgorithmException -> L62 java.lang.SecurityException -> L6d java.io.IOException -> L75
                            java.lang.String r13 = "MD5"
                            java.security.MessageDigest r13 = java.security.MessageDigest.getInstance(r13)     // Catch: java.lang.Throwable -> L5f java.security.NoSuchAlgorithmException -> L62 java.lang.SecurityException -> L6d java.io.IOException -> L75
                            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5f java.security.NoSuchAlgorithmException -> L62 java.lang.SecurityException -> L6d java.io.IOException -> L75
                            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f java.security.NoSuchAlgorithmException -> L62 java.lang.SecurityException -> L6d java.io.IOException -> L75
                            r1 = 4096(0x1000, float:5.74E-42)
                            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                        L33:
                            int r2 = r3.read(r1)     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                            if (r2 <= 0) goto L3d
                            r13.update(r1, r9, r2)     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                            goto L33
                        L3d:
                            java.lang.String r1 = "%32x"
                            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                            java.math.BigInteger r4 = new java.math.BigInteger     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                            byte[] r13 = r13.digest()     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                            r4.<init>(r0, r13)     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                            r2[r9] = r4     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                            java.lang.String r13 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L54 java.security.NoSuchAlgorithmException -> L56 java.lang.SecurityException -> L59 java.io.IOException -> L5c
                            r3.close()     // Catch: java.io.IOException -> L7d
                            goto L7d
                        L54:
                            r13 = move-exception
                            goto L7e
                        L56:
                            r13 = move-exception
                            r1 = r3
                            goto L63
                        L59:
                            r13 = move-exception
                            r1 = r3
                            goto L6e
                        L5c:
                            r13 = move-exception
                            r1 = r3
                            goto L76
                        L5f:
                            r13 = move-exception
                            r3 = r1
                            goto L7e
                        L62:
                            r13 = move-exception
                        L63:
                            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L5f
                            if (r1 == 0) goto L7d
                        L69:
                            r1.close()     // Catch: java.io.IOException -> L7d
                            goto L7d
                        L6d:
                            r13 = move-exception
                        L6e:
                            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L5f
                            if (r1 == 0) goto L7d
                            goto L69
                        L75:
                            r13 = move-exception
                        L76:
                            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L5f
                            if (r1 == 0) goto L7d
                            goto L69
                        L7d:
                            return r13
                        L7e:
                            if (r3 == 0) goto L83
                            r3.close()     // Catch: java.io.IOException -> L83
                        L83:
                            throw r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.soloader.k.AnonymousClass1.a(java.lang.String):java.lang.String");
                    }
                };
            }
        }
    }

    @Nullable
    private static Method c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dc717fe9b7253d1bc2e6ec44e7cecc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dc717fe9b7253d1bc2e6ec44e7cecc5");
        }
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

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class b extends UnsatisfiedLinkError {
        public b(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "611fffa88f2fe1e85c145d96e806df79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "611fffa88f2fe1e85c145d96e806df79");
        } else {
            a(str, 0);
        }
    }

    private static void a(String str, int i2) throws UnsatisfiedLinkError {
        Object[] objArr = {str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79bb6372baa5c99e05d35df320dff651", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79bb6372baa5c99e05d35df320dff651");
            return;
        }
        d();
        e.readLock().lock();
        try {
            if (f == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    e();
                } else {
                    synchronized (k.class) {
                        if ((!j.contains(str)) && m == null) {
                            System.loadLibrary(str);
                        }
                    }
                    return;
                }
            }
            e.readLock().unlock();
            a(System.mapLibraryName(str), str, null, i2 | 2, null);
        } finally {
            e.readLock().unlock();
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fd300bf0034e78666651d59d1db3961", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fd300bf0034e78666651d59d1db3961");
            return;
        }
        Object[] objArr2 = {str, 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a5889537e9c0b09a996fac231146bfe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a5889537e9c0b09a996fac231146bfe9");
        } else {
            a(str, (List<String>) null, 0);
        }
    }

    public static void a(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e8a32d22a6eee7647b6fe271a80d688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e8a32d22a6eee7647b6fe271a80d688");
        } else {
            a(str, list, 0);
        }
    }

    public static void a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        Object[] objArr = {str, Integer.valueOf(i2), threadPolicy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a92f83b7c07b17376fb94c4b462a033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a92f83b7c07b17376fb94c4b462a033");
        } else {
            a(str, null, null, i2, threadPolicy);
        }
    }

    private static void a(String str, @Nullable String str2, @Nullable String str3, int i2, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2 = false;
        Object[] objArr = {str, str2, str3, Integer.valueOf(i2), threadPolicy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e61a320f4310aabe66d0bae1de56bcef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e61a320f4310aabe66d0bae1de56bcef");
        } else if (TextUtils.isEmpty(str2) || !l.contains(str2)) {
            synchronized (k.class) {
                if (!j.contains(str)) {
                    z = false;
                } else if (str3 == null) {
                    return;
                } else {
                    z = true;
                }
                if (k.containsKey(str)) {
                    obj = k.get(str);
                } else {
                    obj = new Object();
                    k.put(str, obj);
                }
                synchronized (obj) {
                    if (!z) {
                        try {
                            synchronized (k.class) {
                                if (j.contains(str)) {
                                    if (str3 == null) {
                                        return;
                                    }
                                    z = true;
                                }
                                if (!z) {
                                    try {
                                        new StringBuilder("About to load: ").append(str);
                                        b(str, i2, threadPolicy);
                                        synchronized (k.class) {
                                            new StringBuilder("Loaded: ").append(str);
                                            j.add(str);
                                        }
                                    } catch (IOException e2) {
                                        throw new RuntimeException(e2);
                                    } catch (UnsatisfiedLinkError e3) {
                                        String message = e3.getMessage();
                                        if (message != null && message.contains("unexpected e_machine:")) {
                                            throw new b(e3);
                                        }
                                        throw e3;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!TextUtils.isEmpty(str2) && l.contains(str2)) {
                        z2 = true;
                    }
                    if (str3 != null && !z2) {
                        if (b) {
                            com.meituan.android.soloader.a.a("MergedSoMapping.invokeJniOnload[" + str2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                        }
                        StringBuilder sb = new StringBuilder("About to merge: ");
                        sb.append(str2);
                        sb.append(" / ");
                        sb.append(str);
                        h.a(str2);
                        l.add(str2);
                        if (b) {
                            com.meituan.android.soloader.a.a();
                        }
                    }
                }
            }
        }
    }

    public static File c(String str) throws UnsatisfiedLinkError {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8692a522f479d1ba44789ed33d003fd5", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8692a522f479d1ba44789ed33d003fd5");
        }
        e();
        try {
            return d(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void b(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        StrictMode.ThreadPolicy threadPolicy2;
        boolean z;
        UnsatisfiedLinkError unsatisfiedLinkError;
        boolean z2;
        boolean z3;
        boolean z4;
        Object[] objArr = {str, Integer.valueOf(i2), threadPolicy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "869070db7f10021c827096195546263c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "869070db7f10021c827096195546263c");
            return;
        }
        e.readLock().lock();
        try {
            if (f == null) {
                Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
                throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
            }
            if (threadPolicy == null) {
                threadPolicy2 = StrictMode.allowThreadDiskReads();
                z = true;
            } else {
                threadPolicy2 = threadPolicy;
                z = false;
            }
            if (b) {
                com.meituan.android.soloader.a.a("SoLoader.loadLibrary[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
            int i3 = 0;
            do {
                try {
                    e.readLock().lock();
                    int i4 = g;
                    int i5 = 0;
                    while (true) {
                        if (i3 != 0) {
                            break;
                        }
                        try {
                            if (i5 >= f.length) {
                                break;
                            }
                            int a2 = f[i5].a(str, i2, threadPolicy2);
                            if (a2 == 3) {
                                try {
                                    if (h != null) {
                                        new StringBuilder("Trying backup SoSource for ").append(str);
                                        o[] oVarArr = h;
                                        int length = oVarArr.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= length) {
                                                i3 = a2;
                                                break;
                                            }
                                            o oVar = oVarArr[i6];
                                            oVar.b(str);
                                            int a3 = oVar.a(str, i2, threadPolicy2);
                                            if (a3 == 1) {
                                                i3 = a3;
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            i5++;
                            i3 = a2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    if ((i2 & 2) == 2 && i3 == 0) {
                        try {
                            if (i == null || !i.a()) {
                                z4 = false;
                            } else {
                                z4 = e.writeLock().tryLock();
                                if (z4) {
                                    try {
                                        i.b();
                                        g++;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z3 = z4;
                                        if (z3) {
                                            e.writeLock().unlock();
                                        }
                                        throw th;
                                    }
                                }
                            }
                            z2 = g != i4;
                            if (z4) {
                                e.writeLock().unlock();
                                continue;
                            } else {
                                continue;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z3 = false;
                        }
                    } else {
                        z2 = false;
                        continue;
                    }
                } finally {
                    if (i3 == 0 || i3 == r3) {
                    }
                }
            } while (z2);
            if (b) {
                com.meituan.android.soloader.a.a();
            }
            if (z) {
                StrictMode.setThreadPolicy(threadPolicy2);
            }
            if (i3 == 0 || i3 == 3) {
                String str2 = "couldn't find DSO to load: " + str;
                Log.e("SoLoader", str2);
                throw new UnsatisfiedLinkError(str2);
            }
        } finally {
            e.readLock().unlock();
        }
    }

    private static File d(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60ead1e09d0b20ab08edf7ac26fb2ef7", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60ead1e09d0b20ab08edf7ac26fb2ef7");
        }
        e.readLock().lock();
        for (int i2 = 0; i2 < f.length; i2++) {
            try {
                File a2 = f[i2].a(str);
                if (a2 != null) {
                    return a2;
                }
            } finally {
                e.readLock().unlock();
            }
        }
        e.readLock().unlock();
        throw new FileNotFoundException(str);
    }

    private static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61b90f8e7034b112a868c879cde7d16e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61b90f8e7034b112a868c879cde7d16e");
            return;
        }
        e.readLock().lock();
        try {
            d();
            if (f != null) {
                return;
            }
            throw new RuntimeException("SoLoader.init() not yet called");
        } finally {
            e.readLock().unlock();
        }
    }

    public static void a(m mVar) throws IOException {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cff863a28c05d832b64862b76ddcfa64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cff863a28c05d832b64862b76ddcfa64");
            return;
        }
        e.writeLock().lock();
        try {
            p.a(">>>SoLoader Prepending to SO sources: " + mVar);
            new StringBuilder("Prepending to SO sources: ").append(mVar);
            e();
            mVar.a(b());
            m[] mVarArr = new m[f.length + 1];
            mVarArr[0] = mVar;
            System.arraycopy(f, 0, mVarArr, 1, f.length);
            f = mVarArr;
            g++;
            p.a(">>>SoLoader Prepended to SO sources: " + mVar);
        } finally {
            e.writeLock().unlock();
        }
    }

    public static boolean b(m mVar) throws IOException {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5fbf9d50dd49f034ca1dd4a7832797d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5fbf9d50dd49f034ca1dd4a7832797d")).booleanValue();
        }
        if (e.writeLock().tryLock()) {
            try {
                p.a(">>>SoLoader Prepending to SO sources: " + mVar);
                new StringBuilder("Prepending to SO sources: ").append(mVar);
                mVar.a(b());
                m[] mVarArr = new m[f.length + 1];
                mVarArr[0] = mVar;
                System.arraycopy(f, 0, mVarArr, 1, f.length);
                f = mVarArr;
                g++;
                p.a(">>>SoLoader Prepended to SO sources: " + mVar);
                return true;
            } finally {
                e.writeLock().unlock();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @TargetApi(14)
    @DoNotOptimize
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        public static String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cb72823fbec834d6ab543fd2ed002ab", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cb72823fbec834d6ab543fd2ed002ab");
            }
            ClassLoader classLoader = k.class.getClassLoader();
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

    private static void a(String str, List<String> list, int i2) throws UnsatisfiedLinkError {
        Object[] objArr = {str, list, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dfe9dee413ac8441e84ab7898797cfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dfe9dee413ac8441e84ab7898797cfd");
            return;
        }
        com.meituan.android.loader.f fVar = p;
        fVar.a(">>>SoLoader loadLibraryWithRelink: " + str);
        try {
            a(str, i2);
        } catch (Throwable th) {
            com.meituan.android.loader.f fVar2 = p;
            fVar2.a(">>>SoLoader loadLibraryWithRelink throw a exception, soName is " + str + ", error message:" + th.getMessage());
            p.a(th);
            if (!l.a(System.mapLibraryName(str), list)) {
                throw th;
            }
        }
    }

    private static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5c1c7f3f2b51ebafcee268d18cfaf90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5c1c7f3f2b51ebafcee268d18cfaf90");
        } else if (com.meituan.android.singleton.b.a == null) {
            p.a(">>>SoLoader skip init, ContextSingleton.getInstance() = null");
        } else {
            if (!o) {
                a(com.meituan.android.singleton.b.a, false);
            } else {
                p.a(">>>SoLoader skip init, isInit = true");
            }
            com.meituan.android.loader.g.a(com.meituan.android.singleton.b.a, 2);
        }
    }
}
