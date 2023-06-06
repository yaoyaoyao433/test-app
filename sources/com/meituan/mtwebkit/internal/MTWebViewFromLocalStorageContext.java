package com.meituan.mtwebkit.internal;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.UserHandle;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import com.meituan.mtwebkit.MTWebViewFactory;
import com.meituan.mtwebkit.MTWebViewFactoryProvider;
import com.meituan.mtwebkit.internal.process.MultiProcessManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import dalvik.system.DexClassLoader;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebViewFromLocalStorageContext extends ContextThemeWrapper {
    public static ChangeQuickRedirect a;
    public final PackageInfo b;
    private ClassLoader c;
    private final ClassLoader d;
    private final ClassLoader e;
    private final AssetManager f;
    private final Resources g;
    private final PackageManager h;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    public MTWebViewFromLocalStorageContext(PackageInfo packageInfo) {
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e175e9c712b9865093ffa79ae1bcd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e175e9c712b9865093ffa79ae1bcd0");
            return;
        }
        this.d = MTWebViewFromLocalStorageContext.class.getClassLoader();
        this.e = Context.class.getClassLoader();
        attachBaseContext(a.a().getBaseContext());
        if (packageInfo == null) {
            throw new IllegalArgumentException("PackageInfo is null");
        }
        this.b = packageInfo;
        Context baseContext = getBaseContext();
        String absolutePath = g.b(packageInfo.versionCode).getAbsolutePath();
        String absolutePath2 = g.c(packageInfo.versionCode).getAbsolutePath();
        String absolutePath3 = g.e(packageInfo.versionCode).getAbsolutePath();
        packageInfo.applicationInfo.sourceDir = absolutePath;
        packageInfo.applicationInfo.nativeLibraryDir = absolutePath2;
        this.f = a.a(absolutePath, baseContext.getApplicationInfo().sourceDir);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(baseContext.getResources().getDisplayMetrics());
        Configuration configuration = new Configuration();
        configuration.setTo(baseContext.getResources().getConfiguration());
        this.g = new Resources(this.f, displayMetrics, configuration);
        this.h = new o(baseContext, packageInfo);
        if (e() && Build.VERSION.SDK_INT == 28) {
            String str = absolutePath2 + CommonConstant.Symbol.COLON + baseContext.getApplicationInfo().nativeLibraryDir;
            Object[] objArr2 = {absolutePath, absolutePath3, str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.c = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11b0c9ba83e018bbf81b8be8de12a94c", RobustBitConfig.DEFAULT_VALUE) ? (ClassLoader) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11b0c9ba83e018bbf81b8be8de12a94c") : new DexClassLoader(absolutePath, absolutePath3, str, this.e) { // from class: com.meituan.mtwebkit.internal.MTWebViewFromLocalStorageContext.2
                public static ChangeQuickRedirect a;

                private Class<?> a(String str2) throws ClassNotFoundException {
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "804f52cf733200f5517ce8376d03bffc", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Class) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "804f52cf733200f5517ce8376d03bffc");
                    }
                    if (str2.startsWith("com.meituan.mtwebkit.")) {
                        return MTWebViewFromLocalStorageContext.this.d.loadClass(str2);
                    }
                    return super.findClass(str2);
                }

                @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
                public final Class<?> findClass(String str2) throws ClassNotFoundException {
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ebd7ca6c0f79c942346bab7aa9503ff4", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Class) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ebd7ca6c0f79c942346bab7aa9503ff4");
                    }
                    try {
                        return a(str2);
                    } catch (ClassNotFoundException unused) {
                        e.c("MTWebViewContextWrapper", str2 + " not found! currentThread = " + Thread.currentThread() + ", ContextClassLoader = " + Thread.currentThread().getContextClassLoader());
                        Thread.currentThread().setContextClassLoader(this);
                        return a(str2);
                    }
                }
            };
            return;
        }
        this.c = a(absolutePath, absolutePath3, absolutePath2 + CommonConstant.Symbol.COLON + baseContext.getApplicationInfo().nativeLibraryDir);
    }

    private ClassLoader a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359ce6eb9b3bf499a118508743bf0b0d", RobustBitConfig.DEFAULT_VALUE) ? (ClassLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359ce6eb9b3bf499a118508743bf0b0d") : new DexClassLoader(str, str2, str3, this.e) { // from class: com.meituan.mtwebkit.internal.MTWebViewFromLocalStorageContext.1
            public static ChangeQuickRedirect a;

            @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
            public final Class<?> findClass(String str4) throws ClassNotFoundException {
                Object[] objArr2 = {str4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8883a0cb2840dca30458467f59d573f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Class) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8883a0cb2840dca30458467f59d573f");
                }
                if (str4.startsWith("com.meituan.mtwebkit.")) {
                    return MTWebViewFromLocalStorageContext.this.d.loadClass(str4);
                }
                return super.findClass(str4);
            }
        };
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        Object[] objArr = {intent, serviceConnection, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfaed3fa5e17628c056146f10b8b4038", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfaed3fa5e17628c056146f10b8b4038")).booleanValue();
        }
        if (MultiProcessManager.a(intent.getComponent()) != -1) {
            return MultiProcessManager.a(getBaseContext(), this.b, intent, serviceConnection, i);
        }
        return super.bindService(intent, serviceConnection, i);
    }

    @Keep
    public boolean bindServiceAsUser(Intent intent, ServiceConnection serviceConnection, int i, Handler handler, UserHandle userHandle) throws ReflectiveOperationException {
        Object[] objArr = {intent, serviceConnection, Integer.valueOf(i), handler, userHandle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397d3852a71987df411d8787a1ea42b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397d3852a71987df411d8787a1ea42b4")).booleanValue() : MultiProcessManager.a(getBaseContext(), this.b, intent, serviceConnection, i, handler, userHandle);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(ServiceConnection serviceConnection) {
        Object[] objArr = {serviceConnection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49766fca53461c3c68dc153757957bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49766fca53461c3c68dc153757957bf8");
            return;
        }
        ServiceConnection a2 = MultiProcessManager.a(serviceConnection);
        if (a2 != null) {
            serviceConnection = a2;
        }
        super.unbindService(serviceConnection);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public PackageManager getPackageManager() {
        return this.h;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return this.c;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.g;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b73bb375f0479cf86ad085aabdc1f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b73bb375f0479cf86ad085aabdc1f7");
        }
        if (!str.startsWith(MTWebViewFactory.DIRECTORY_SUFFIX_FOR_MTWEBVIEW)) {
            str = "mt_webview_" + str;
        }
        return h.p() ? q.a(this, str) : getBaseContext().getSharedPreferences(str, i);
    }

    public final MTWebViewFactoryProvider a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282f5597ac15c75f168f91e102bed8ae", RobustBitConfig.DEFAULT_VALUE) ? (MTWebViewFactoryProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282f5597ac15c75f168f91e102bed8ae") : d();
    }

    private MTWebViewFactoryProvider d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "514be4ced33d51d05ba7420a39a353a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebViewFactoryProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "514be4ced33d51d05ba7420a39a353a8");
        }
        try {
            if (Build.VERSION.SDK_INT == 21) {
                return (MTWebViewFactoryProvider) d.a("com.meituan.mtwebview.chromium.MTWebViewChromiumFactoryProvider", this.c).a(new Object[0]).b;
            }
            return (MTWebViewFactoryProvider) d.a("com.meituan.mtwebview.chromium.MTWebViewChromiumFactoryProvider", this.c).a("create", d.a("android.webkit.WebViewDelegate", this.e).a(new Object[0])).b;
        } catch (Throwable th) {
            l.b(th);
            e.b("MTWebViewContextWrapper", "Hack Fail!", th);
            return null;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c05bdac9c0edcde4b9b60177d27ffcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c05bdac9c0edcde4b9b60177d27ffcc");
            return;
        }
        try {
            Class.forName("com.meituan.mtwebkit.MTWebView", true, this.c);
            Class.forName("com.meituan.mtwebview.chromium.MTWebViewChromium", true, this.c);
        } catch (Throwable th) {
            i.a(th);
        }
    }

    @Override // android.content.Context
    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        Object[] objArr = {componentCallbacks};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728945e3589abee5a5b3e1f005300a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728945e3589abee5a5b3e1f005300a11");
        } else {
            getBaseContext().registerComponentCallbacks(componentCallbacks);
        }
    }

    @Override // android.content.Context
    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        Object[] objArr = {componentCallbacks};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28e62af73babd310e07e0ce0aab949d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28e62af73babd310e07e0ce0aab949d1");
        } else {
            getBaseContext().unregisterComponentCallbacks(componentCallbacks);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
        r0 = new java.io.File(r2, "libmtwebview_plat_support.so");
        r0.delete();
        android.system.Os.symlink(r4.getAbsolutePath(), r0.getAbsolutePath());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mtwebkit.internal.MTWebViewFromLocalStorageContext.a
            java.lang.String r10 = "811ac2a2b7ad6f6d18631065f4c2103f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r14
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r14, r9, r0, r10)
            return
        L18:
            android.content.Context r1 = r14.getBaseContext()
            android.content.pm.PackageInfo r2 = r14.b
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r1
            r11 = 1
            r3[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.meituan.mtwebkit.internal.MTWebViewFromLocalStorageContext.a
            java.lang.String r13 = "0e9b40cff06affdf841fab339a1c42e8"
            r5 = 0
            r7 = 1
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r3
            r6 = r12
            r8 = r13
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L3d
            r0 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r3, r0, r12, r11, r13)
            goto Lb7
        L3d:
            int r3 = r2.versionCode
            java.io.File r3 = com.meituan.mtwebkit.internal.g.c(r3)
            int r2 = r2.versionCode
            java.io.File r2 = com.meituan.mtwebkit.internal.g.d(r2)
            java.io.File[] r3 = r3.listFiles()     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> Le2
            java.io.File[] r3 = (java.io.File[]) r3     // Catch: java.lang.Throwable -> Le2
            int r4 = r3.length     // Catch: java.lang.Throwable -> Le2
            r5 = 0
        L55:
            if (r5 >= r4) goto L76
            r6 = r3[r5]     // Catch: java.lang.Throwable -> Le2
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> Le2
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> Le2
            r7.<init>(r2, r8)     // Catch: java.lang.Throwable -> Le2
            boolean r8 = r7.exists()     // Catch: java.lang.Throwable -> Le2
            if (r8 != 0) goto L73
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Le2
            android.system.Os.symlink(r6, r7)     // Catch: java.lang.Throwable -> Le2
        L73:
            int r5 = r5 + 1
            goto L55
        L76:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Le2
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = r1.nativeLibraryDir     // Catch: java.lang.Throwable -> Le2
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Le2
            java.io.File[] r1 = r3.listFiles()     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> Le2
            java.io.File[] r1 = (java.io.File[]) r1     // Catch: java.lang.Throwable -> Le2
            int r3 = r1.length     // Catch: java.lang.Throwable -> Le2
        L8c:
            if (r0 >= r3) goto Lb7
            r4 = r1[r0]     // Catch: java.lang.Throwable -> Le2
            java.lang.String r5 = "libmtwebview_plat_support.so"
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> Le2
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> Le2
            if (r5 == 0) goto Lb4
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = "libmtwebview_plat_support.so"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> Le2
            r0.delete()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> Le2
            android.system.Os.symlink(r1, r0)     // Catch: java.lang.Throwable -> Le2
            goto Lb7
        Lb4:
            int r0 = r0 + 1
            goto L8c
        Lb7:
            android.content.pm.PackageInfo r0 = r14.b
            int r0 = r0.versionCode
            java.io.File r0 = com.meituan.mtwebkit.internal.g.b(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            android.content.pm.PackageInfo r1 = r14.b
            int r1 = r1.versionCode
            java.io.File r1 = com.meituan.mtwebkit.internal.g.e(r1)
            java.lang.String r1 = r1.getAbsolutePath()
            android.content.pm.PackageInfo r2 = r14.b
            int r2 = r2.versionCode
            java.io.File r2 = com.meituan.mtwebkit.internal.g.d(r2)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.ClassLoader r0 = r14.a(r0, r1, r2)
            r14.c = r0
            return
        Le2:
            r0 = move-exception
            com.meituan.mtwebkit.internal.c$a<java.lang.String, java.lang.Boolean> r1 = com.meituan.mtwebkit.internal.c.b
            com.meituan.mtwebkit.internal.c.a(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtwebkit.internal.MTWebViewFromLocalStorageContext.c():void");
    }

    private static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82d107139e08a9a9d74ed994fffc1ed2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82d107139e08a9a9d74ed994fffc1ed2")).booleanValue();
        }
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return "oneplus".equals(str.toLowerCase());
        } catch (Throwable unused) {
            return false;
        }
    }
}
