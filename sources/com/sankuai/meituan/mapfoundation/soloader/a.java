package com.sankuai.meituan.mapfoundation.soloader;

import com.meituan.android.loader.DynLoader;
import com.meituan.android.loader.c;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d83ec8ff20aed1910d6e4e2ae71f4b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d83ec8ff20aed1910d6e4e2ae71f4b6")).booleanValue();
        }
        b = false;
        if (b(str)) {
            return c(str);
        }
        return d(str);
    }

    private static boolean c(String str) {
        boolean z = true;
        boolean z2 = false;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10880400ad23785d062a2d10b169394e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10880400ad23785d062a2d10b169394e")).booleanValue();
        }
        com.sankuai.meituan.mapfoundation.logcenter.a.b("Local load so by SoLoader");
        try {
            k.b(str);
            z2 = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z2) {
            com.sankuai.meituan.mapfoundation.logcenter.a.b("Local load so by SoLoader load failed! try to load by System API");
            try {
                System.loadLibrary(str);
            } catch (Error e2) {
                e2.printStackTrace();
                com.sankuai.meituan.mapfoundation.logcenter.a.b(e2.getLocalizedMessage());
            }
            com.sankuai.meituan.mapfoundation.logcenter.a.b("Local load so, status:" + z);
            return z;
        }
        z = z2;
        com.sankuai.meituan.mapfoundation.logcenter.a.b("Local load so, status:" + z);
        return z;
    }

    private static boolean d(String str) {
        boolean available;
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47aa577edf4c2631d4e3886095144210", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47aa577edf4c2631d4e3886095144210")).booleanValue();
        }
        com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so");
        if (com.sankuai.meituan.mapfoundation.base.a.b != null) {
            available = DynLoader.available(com.sankuai.meituan.mapfoundation.base.a.b, str, 1);
            com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so, judge so by DynLoader.available(context, name, Type_LIB), available = " + available);
        } else {
            available = DynLoader.available(str, 1);
            com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so, judge so by DynLoader.available(name, Type_LIB), available = " + available);
        }
        com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so, judge so by DynLoader.available(context, name, Type_LIB), available = " + available);
        if (available) {
            boolean load = DynLoader.load(str);
            com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so, status:" + load);
            if (!load) {
                com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so, load failed! try to load by System API");
                try {
                    System.loadLibrary(str);
                } catch (Error e) {
                    e.printStackTrace();
                }
                com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so, status:" + z);
                return z;
            }
            z = load;
            com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so, status:" + z);
            return z;
        }
        com.sankuai.meituan.mapfoundation.logcenter.a.b("DynLoader load so, but so file not exist, try to download from server");
        b = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        DynLoader.toggleDownload(new com.meituan.android.loader.a() { // from class: com.sankuai.meituan.mapfoundation.soloader.a.1
            @Override // com.meituan.android.loader.a
            public final void onDynDownloadSuccess() {
                a.b = false;
            }

            @Override // com.meituan.android.loader.a
            public final void onDynDownloadFailure() {
                a.b = false;
            }
        }, new c.a().a(arrayList).b, false);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r3.getEntry("lib/armeabi/lib" + r12 + ".so") != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.mapfoundation.soloader.a.a
            java.lang.String r11 = "04ec8f1678545e2caddb31d98d6880cd"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L22:
            android.content.Context r1 = com.sankuai.meituan.mapfoundation.base.a.b
            if (r1 != 0) goto L27
            return r9
        L27:
            android.content.Context r1 = com.sankuai.meituan.mapfoundation.base.a.b
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            if (r1 != 0) goto L30
            return r9
        L30:
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = r1.sourceDir     // Catch: java.lang.Exception -> L8e
            r3.<init>(r1)     // Catch: java.lang.Exception -> L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "lib/"
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> L7c
            r1.append(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "/lib"
            r1.append(r4)     // Catch: java.lang.Throwable -> L7c
            r1.append(r12)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = ".so"
            r1.append(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            java.util.zip.ZipEntry r1 = r3.getEntry(r1)     // Catch: java.lang.Throwable -> L7c
            if (r1 != 0) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "lib/armeabi/lib"
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L7c
            r1.append(r12)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r12 = ".so"
            r1.append(r12)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            java.util.zip.ZipEntry r12 = r3.getEntry(r12)     // Catch: java.lang.Throwable -> L7c
            if (r12 == 0) goto L76
        L75:
            r9 = 1
        L76:
            r3.close()     // Catch: java.lang.Exception -> L8e
            goto L92
        L7a:
            r12 = move-exception
            goto L7f
        L7c:
            r12 = move-exception
            r2 = r12
            throw r2     // Catch: java.lang.Throwable -> L7a
        L7f:
            if (r2 == 0) goto L8a
            r3.close()     // Catch: java.lang.Throwable -> L85
            goto L8d
        L85:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Exception -> L8e
            goto L8d
        L8a:
            r3.close()     // Catch: java.lang.Exception -> L8e
        L8d:
            throw r12     // Catch: java.lang.Exception -> L8e
        L8e:
            r12 = move-exception
            r12.printStackTrace()
        L92:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapfoundation.soloader.a.b(java.lang.String):boolean");
    }
}
