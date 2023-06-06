package com.meituan.mtwebkit.internal.mode;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.IBinder;
import com.meituan.mtwebkit.internal.system.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Enumeration;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a extends e {
    public static ChangeQuickRedirect g;
    private static Application i = com.meituan.mtwebkit.internal.a.a();
    private static PackageInfo j;
    private static String k;
    private static String l;
    private static String m;

    @Override // com.meituan.mtwebkit.internal.mode.e, com.meituan.mtwebkit.internal.m
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f176df26f246cc4b6e31fbacca2a21a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f176df26f246cc4b6e31fbacca2a21a");
            return;
        }
        try {
            b = new y();
        } finally {
            k();
        }
    }

    private static PackageInfo j() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a4364912e67811566fc9b05182c32f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a4364912e67811566fc9b05182c32f6");
        }
        File file = new File(i.getFilesDir(), "sw");
        com.meituan.mtwebkit.internal.c.a(file, com.meituan.mtwebkit.internal.c.b);
        file.mkdirs();
        File file2 = new File(file, "webview.apk");
        com.meituan.mtwebkit.internal.c.a(i.getAssets().open("SystemWebView.apk"), file2);
        File file3 = new File(file, "libs");
        file3.mkdirs();
        File file4 = new File(file, "opt");
        file4.mkdirs();
        PackageInfo packageArchiveInfo = com.meituan.mtwebkit.internal.a.a().getPackageManager().getPackageArchiveInfo(file2.getAbsolutePath(), 9408);
        boolean b = com.meituan.mtwebkit.internal.a.b();
        ZipFile zipFile = new ZipFile(file2);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (b) {
                if (name.startsWith("lib/arm64-v8a/")) {
                    com.meituan.mtwebkit.internal.c.a(zipFile.getInputStream(nextElement), new File(file3, name.substring(14)));
                }
            } else if (name.startsWith("lib/armeabi-v7a/")) {
                com.meituan.mtwebkit.internal.c.a(zipFile.getInputStream(nextElement), new File(file3, name.substring(16)));
            } else if (name.startsWith("lib/x86/")) {
                com.meituan.mtwebkit.internal.c.a(zipFile.getInputStream(nextElement), new File(file3, name.substring(8)));
            }
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        String absolutePath = file2.getAbsolutePath();
        applicationInfo.sourceDir = absolutePath;
        k = absolutePath;
        ApplicationInfo applicationInfo2 = packageArchiveInfo.applicationInfo;
        String absolutePath2 = file3.getAbsolutePath();
        applicationInfo2.nativeLibraryDir = absolutePath2;
        l = absolutePath2;
        m = file4.getAbsolutePath();
        if (Build.VERSION.SDK_INT < 28) {
            com.meituan.mtwebkit.internal.d.a(packageArchiveInfo.applicationInfo).a("primaryCpuAbi", com.meituan.mtwebkit.internal.d.a(i.getApplicationInfo()).b("primaryCpuAbi"));
        }
        return packageArchiveInfo;
    }

    private static void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9819b4a4b896e1232efb988d25b7bdde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9819b4a4b896e1232efb988d25b7bdde");
        } else if (com.meituan.mtwebkit.internal.d.a("android.webkit.WebViewFactory").b("sProviderInstance").a()) {
            throw new IllegalStateException("inited");
        } else {
            try {
                j = j();
                ((Map) com.meituan.mtwebkit.internal.d.a("android.os.ServiceManager").b("sCache").b).put("webviewupdate", (IBinder) Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{Class.forName("android.webkit.IWebViewUpdateService"), IBinder.class}, new InvocationHandler() { // from class: com.meituan.mtwebkit.internal.mode.a.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
                        if (r3.equals("waitForRelroCreationCompleted") != false) goto L17;
                     */
                    @Override // java.lang.reflect.InvocationHandler
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r16, java.lang.reflect.Method r17, java.lang.Object[] r18) throws java.lang.Throwable {
                        /*
                            r15 = this;
                            r1 = 3
                            java.lang.Object[] r9 = new java.lang.Object[r1]
                            r10 = 0
                            r9[r10] = r16
                            r11 = 1
                            r9[r11] = r17
                            r12 = 2
                            r9[r12] = r18
                            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.mtwebkit.internal.mode.a.AnonymousClass1.a
                            java.lang.String r14 = "e14c42cae5fe747a9a47fd4ca0c5a8a2"
                            r5 = 0
                            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r2 = r9
                            r3 = r15
                            r4 = r13
                            r6 = r14
                            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
                            if (r2 == 0) goto L25
                            r2 = r15
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r15, r13, r10, r14)
                            java.lang.Object r0 = (java.lang.Object) r0
                            return r0
                        L25:
                            r2 = r15
                            java.lang.String r3 = r17.getName()
                            r4 = -1
                            int r5 = r3.hashCode()
                            r6 = -554320650(0xffffffffdef5bcf6, float:-8.8536492E18)
                            if (r5 == r6) goto L64
                            r6 = 1449763946(0x5669a46a, float:6.4223091E13)
                            if (r5 == r6) goto L5a
                            r1 = 1667434977(0x636309e1, float:4.1881228E21)
                            if (r5 == r1) goto L4f
                            r1 = 1748607300(0x6839a144, float:3.5064505E24)
                            if (r5 == r1) goto L44
                            goto L6f
                        L44:
                            java.lang.String r1 = "waitForAndGetProvider"
                            boolean r1 = r3.equals(r1)
                            if (r1 == 0) goto L6f
                            r1 = 1
                            goto L70
                        L4f:
                            java.lang.String r1 = "isMultiProcessEnabled"
                            boolean r1 = r3.equals(r1)
                            if (r1 == 0) goto L6f
                            r1 = 2
                            goto L70
                        L5a:
                            java.lang.String r5 = "waitForRelroCreationCompleted"
                            boolean r3 = r3.equals(r5)
                            if (r3 == 0) goto L6f
                            goto L70
                        L64:
                            java.lang.String r1 = "queryLocalInterface"
                            boolean r1 = r3.equals(r1)
                            if (r1 == 0) goto L6f
                            r1 = 0
                            goto L70
                        L6f:
                            r1 = -1
                        L70:
                            switch(r1) {
                                case 0: goto La2;
                                case 1: goto L81;
                                case 2: goto L7e;
                                case 3: goto L7c;
                                default: goto L73;
                            }
                        L73:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.String r1 = "not support yet"
                            r0.<init>(r1)
                            throw r0
                        L7c:
                            r0 = 0
                            return r0
                        L7e:
                            java.lang.Boolean r0 = java.lang.Boolean.FALSE
                            return r0
                        L81:
                            java.lang.String r0 = "android.webkit.WebViewProviderResponse"
                            com.meituan.mtwebkit.internal.d r0 = com.meituan.mtwebkit.internal.d.a(r0)
                            java.lang.Object[] r1 = new java.lang.Object[r12]
                            android.content.pm.PackageInfo r3 = com.meituan.mtwebkit.internal.mode.a.i()
                            r1[r10] = r3
                            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
                            java.lang.Class r4 = java.lang.Integer.TYPE
                            com.meituan.mtwebkit.internal.d r3 = com.meituan.mtwebkit.internal.d.a(r3, r4)
                            r1[r11] = r3
                            com.meituan.mtwebkit.internal.d r0 = r0.a(r1)
                            java.lang.Object r0 = r0.b
                            return r0
                        La2:
                            return r16
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtwebkit.internal.mode.a.AnonymousClass1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                    }
                }));
                final Object obj = com.meituan.mtwebkit.internal.d.a("android.app.ActivityThread").b("sPackageManager").b;
                IBinder iBinder = (IBinder) Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{Class.forName("android.content.pm.IPackageManager"), IBinder.class}, new InvocationHandler() { // from class: com.meituan.mtwebkit.internal.mode.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj2, Method method, Object[] objArr2) throws Throwable {
                        Object[] objArr3 = {obj2, method, objArr2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "b8026d72e146804279cb1a7b6dba4d94", RobustBitConfig.DEFAULT_VALUE)) {
                            return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "b8026d72e146804279cb1a7b6dba4d94");
                        }
                        String name = method.getName();
                        if ("getPackageInfo".equals(name) && a.j.packageName.equals(objArr2[0])) {
                            return a.j;
                        }
                        if ("getApplicationInfo".equals(name) && a.j.packageName.equals(objArr2[0])) {
                            return a.j.applicationInfo;
                        }
                        if ("getComponentEnabledSetting".equals(name)) {
                            return 2;
                        }
                        if ("getInstallerPackageName".equals(name)) {
                            return null;
                        }
                        return method.invoke(obj, objArr2);
                    }
                });
                com.meituan.mtwebkit.internal.d.a("android.app.ActivityThread").a("sPackageManager", iBinder);
                com.meituan.mtwebkit.internal.d b = com.meituan.mtwebkit.internal.d.a(i.getBaseContext()).b("mPackageManager");
                if (b.a()) {
                    b.a("mPM", iBinder);
                }
                synchronized (com.meituan.mtwebkit.internal.d.a("android.webkit.WebViewFactory").b("sProviderLock").b) {
                    com.meituan.mtwebkit.internal.d.a("android.webkit.WebViewFactory").a("sPackageInfo", j);
                    com.meituan.mtwebkit.internal.d.a("android.webkit.WebViewFactory").a("sProviderInstance", l().a("create", com.meituan.mtwebkit.internal.d.a("android.webkit.WebViewDelegate").a(new Object[0])));
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("hack fail", e);
            }
        }
    }

    private static com.meituan.mtwebkit.internal.d l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a68ef4ae7ef2a2ddd82cceb617d3c2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mtwebkit.internal.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a68ef4ae7ef2a2ddd82cceb617d3c2a");
        }
        if (Build.VERSION.SDK_INT > 23) {
            com.meituan.mtwebkit.internal.d.a(i.getAssets()).a("addAssetPathAsSharedLibrary", k);
        } else {
            com.meituan.mtwebkit.internal.d.a(i.getAssets()).a("addAssetPath", k);
        }
        return com.meituan.mtwebkit.internal.d.a("com.android.webview.chromium.WebViewChromiumFactoryProvider", (ClassLoader) new DexClassLoader(k, m, l, PackageInfo.class.getClassLoader()));
    }
}
