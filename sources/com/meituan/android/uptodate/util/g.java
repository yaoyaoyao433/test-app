package com.meituan.android.uptodate.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.widget.Toast;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "895362faf3bba4d41935328b10933e9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "895362faf3bba4d41935328b10933e9f")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        String c = d.c(context);
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        File file = new File(c);
        if (file.exists()) {
            boolean z = a(context, c) >= ((long) i);
            if (!z) {
                file.delete();
            }
            return z;
        }
        return false;
    }

    public static long a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b70597f223d0f19a2889edf5e49ddd56", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b70597f223d0f19a2889edf5e49ddd56")).longValue();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 128);
                if (packageInfo != null) {
                    return a(packageInfo);
                }
                return 0L;
            } catch (Exception e) {
                e.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    private static long a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16abbdef44246901f1d7125ea7f92d74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16abbdef44246901f1d7125ea7f92d74")).longValue();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 128);
                if (packageArchiveInfo != null) {
                    return a(packageArchiveInfo);
                }
                return 0L;
            } catch (Exception e) {
                e.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    private static long a(@NonNull PackageInfo packageInfo) {
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64b83d948afd29606956d41e7029c74f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64b83d948afd29606956d41e7029c74f")).longValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return packageInfo.versionCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.uptodate.util.g.a
            java.lang.String r11 = "9ce6a4616ab613e884113eacfb9a880e"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0086: FILL_ARRAY_DATA  , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            java.lang.String r12 = "MD5"
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r12)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r5 = r1.read(r4, r9, r3)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
        L38:
            if (r5 < 0) goto L42
            r12.update(r4, r9, r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r5 = r1.read(r4, r9, r3)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            goto L38
        L42:
            byte[] r12 = r12.digest()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r3 = r12.length     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r4 = r3 * 2
            char[] r4 = new char[r4]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r5 = 0
        L4c:
            if (r9 >= r3) goto L65
            r6 = r12[r9]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r7 = r5 + 1
            int r8 = r6 >>> 4
            r8 = r8 & 15
            char r8 = r0[r8]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r4[r5] = r8     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r5 = r7 + 1
            r6 = r6 & 15
            char r6 = r0[r6]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r4[r7] = r6     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r9 = r9 + 1
            goto L4c
        L65:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r12.<init>(r4)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r1.close()     // Catch: java.io.IOException -> L6d
        L6d:
            return r12
        L6e:
            r12 = move-exception
            goto L75
        L70:
            r12 = move-exception
            r1 = r2
            goto L7f
        L73:
            r12 = move-exception
            r1 = r2
        L75:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L7d
            r1.close()     // Catch: java.io.IOException -> L7d
        L7d:
            return r2
        L7e:
            r12 = move-exception
        L7f:
            if (r1 == 0) goto L84
            r1.close()     // Catch: java.io.IOException -> L84
        L84:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.uptodate.util.g.a(java.io.File):java.lang.String");
    }

    public static void a(final Context context, final String str, final int i, final com.meituan.android.uptodate.interfac.c cVar) {
        Object[] objArr = {context, str, Integer.valueOf(i), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "582bef03b1204c8920d08e43b02d3fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "582bef03b1204c8920d08e43b02d3fae");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTask<Void, Void, String>() { // from class: com.meituan.android.uptodate.util.g.1
                public static ChangeQuickRedirect a;

                @Override // android.os.AsyncTask
                public final /* synthetic */ String doInBackground(Void[] voidArr) {
                    Object[] objArr2 = {voidArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a607f7c93091a2a30457fbedc770742", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a607f7c93091a2a30457fbedc770742") : c.a(context, new File(d.c(context)));
                }

                @Override // android.os.AsyncTask
                public final /* synthetic */ void onPostExecute(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b2a0238ce5aeba05564458f6ce4abfe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b2a0238ce5aeba05564458f6ce4abfe");
                        return;
                    }
                    super.onPostExecute(str3);
                    String c = d.c(context);
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (!com.meituan.android.uptodate.a.a() && !TextUtils.equals(str3, str) && !TextUtils.isEmpty(c)) {
                        File file = new File(c);
                        if (!(file.exists() ? file.delete() : false)) {
                            c = "";
                        }
                    }
                    if (cVar != null) {
                        if (TextUtils.equals(str3, str)) {
                            cVar.a(14, null, null);
                        } else {
                            cVar.a(16, null, new IllegalStateException("checkSign error"));
                            return;
                        }
                    }
                    f a2 = f.a(context);
                    Object[] objArr3 = {"update_apk", c};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "1a823d2c4c344e47f18984d043dcccb4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "1a823d2c4c344e47f18984d043dcccb4");
                    } else {
                        a2.a().a("update_apk", c);
                    }
                    int i2 = i;
                    Object[] objArr4 = {"update_apk_versioncode", Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect4 = f.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "42f7f234215a101196528b7563b042f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "42f7f234215a101196528b7563b042f3");
                    } else {
                        a2.a().a("update_apk_versioncode", i2);
                    }
                    g.a(context, TextUtils.isEmpty(c) ? null : d.c(context), cVar);
                }
            }, com.meituan.android.uptodate.a.a(context).h, new Void[0]);
        }
    }

    public static void a(Context context, String str, com.meituan.android.uptodate.interfac.c cVar) {
        Object[] objArr = {context, str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9151f489034b0053aba1b495e3c96ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9151f489034b0053aba1b495e3c96ec");
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            File file = !TextUtils.isEmpty(str) ? new File(str) : null;
            if (file == null || !file.exists()) {
                if (cVar != null) {
                    cVar.a(11, null, null);
                } else {
                    Toast.makeText(context, context.getString(R.string.update_no_install_file), 1).show();
                }
            } else if (!TextUtils.equals(c.a(context, file), com.meituan.android.uptodate.a.a(context).c)) {
                cVar.a(16, null, new IllegalStateException("checkSign error"));
            } else {
                try {
                    Intent intent = new Intent();
                    intent.addFlags(y.a);
                    intent.setAction("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.addFlags(1);
                        intent.setDataAndType(FileProvider.getUriForFile(context, context.getPackageName() + "android.upgrade.fileprovider", file), "application/vnd.android.package-archive");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                    }
                    context.startActivity(intent);
                    a(context, "install success", 16);
                } catch (Exception e) {
                    e.printStackTrace();
                    a(context, "install error", 17);
                    b.a(e);
                    if (cVar != null) {
                        cVar.a(12, null, e);
                    } else {
                        Toast.makeText(context, context.getString(R.string.update_install_failed), 0).show();
                    }
                }
            }
        }
    }

    public static void a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e4639389719292cd73180dee7d9d7ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e4639389719292cd73180dee7d9d7ee");
            return;
        }
        String str2 = com.meituan.android.uptodate.a.a(context).e;
        if (TextUtils.isEmpty(str2)) {
            str2 = context.getPackageName();
        }
        b.a(str, i, str2);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bb5d483435ce5066c7820fb560f55e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bb5d483435ce5066c7820fb560f55e6");
            return;
        }
        Activity b = h.a().b();
        if (b != null) {
            com.sankuai.meituan.android.ui.widget.a.a(b, str, -1).a();
        }
    }

    public static String a(VersionInfo versionInfo, String str) {
        Object[] objArr = {versionInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa618f1842b4be32e51ea3ac17ed48a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa618f1842b4be32e51ea3ac17ed48a3");
        }
        if (versionInfo == null) {
            return "";
        }
        return str + versionInfo.publishType + CommonConstant.Symbol.UNDERLINE + versionInfo.publishId + CommonConstant.Symbol.UNDERLINE + com.meituan.android.upgrade.e.a().e;
    }
}
