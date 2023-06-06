package com.sankuai.shangou.stone.util;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static boolean a(Bitmap bitmap, @NonNull String str, String str2) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {bitmap, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9623a8116a66f950a4f492a4d9d2f68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9623a8116a66f950a4f492a4d9d2f68")).booleanValue();
        }
        if (bitmap == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str + File.separator + str2);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e2) {
                com.sankuai.shangou.stone.util.log.a.a(e2);
                return false;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
        } catch (IOException e4) {
            e = e4;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (IOException e5) {
                com.sankuai.shangou.stone.util.log.a.a(e5);
            }
            return true;
        } catch (FileNotFoundException e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            com.sankuai.shangou.stone.util.log.a.a(e);
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return false;
        } catch (IOException e7) {
            e = e7;
            fileOutputStream2 = fileOutputStream;
            com.sankuai.shangou.stone.util.log.a.a(e);
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e8) {
                    com.sankuai.shangou.stone.util.log.a.a(e8);
                }
            }
            throw th;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f8d832d7aa853cc213352450096e389", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f8d832d7aa853cc213352450096e389")).booleanValue();
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                return true;
            }
            return file.mkdirs();
        } catch (SecurityException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[Catch: IOException -> 0x0072, TRY_LEAVE, TryCatch #1 {IOException -> 0x0072, blocks: (B:40:0x006e, B:44:0x0076), top: B:48:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.shangou.stone.util.j.a
            java.lang.String r10 = "7028ab3769d22270993a01d80b213671"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L2d:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            if (r3 == 0) goto L37
            r0.append(r3)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            goto L2d
        L37:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            r1.close()     // Catch: java.io.IOException -> L42
            r11.close()     // Catch: java.io.IOException -> L42
            goto L69
        L42:
            r11 = move-exception
            com.sankuai.shangou.stone.util.log.a.a(r11)
            goto L69
        L47:
            r0 = move-exception
            goto L54
        L49:
            r0 = move-exception
            goto L6c
        L4b:
            r0 = move-exception
            r11 = r2
            goto L54
        L4e:
            r0 = move-exception
            r1 = r2
            goto L6c
        L51:
            r0 = move-exception
            r11 = r2
            r1 = r11
        L54:
            com.sankuai.shangou.stone.util.log.a.a(r0)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.io.IOException -> L5d
            goto L5f
        L5d:
            r11 = move-exception
            goto L65
        L5f:
            if (r11 == 0) goto L68
            r11.close()     // Catch: java.io.IOException -> L5d
            goto L68
        L65:
            com.sankuai.shangou.stone.util.log.a.a(r11)
        L68:
            r0 = r2
        L69:
            return r0
        L6a:
            r0 = move-exception
            r2 = r11
        L6c:
            if (r1 == 0) goto L74
            r1.close()     // Catch: java.io.IOException -> L72
            goto L74
        L72:
            r11 = move-exception
            goto L7a
        L74:
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.io.IOException -> L72
            goto L7d
        L7a:
            com.sankuai.shangou.stone.util.log.a.a(r11)
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.shangou.stone.util.j.a(java.io.File):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r11, java.lang.String r12) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.shangou.stone.util.j.a
            java.lang.String r10 = "307e1e75c37f629c34a4882600f6c818"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L21:
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            java.io.InputStream r11 = r11.open(r12)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            java.lang.String r12 = a(r11)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L4e
            if (r11 == 0) goto L4d
            r11.close()     // Catch: java.io.IOException -> L33
            goto L4d
        L33:
            r11 = move-exception
            com.sankuai.shangou.stone.util.log.a.a(r11)
            goto L4d
        L38:
            r12 = move-exception
            goto L3f
        L3a:
            r12 = move-exception
            r11 = r2
            goto L4f
        L3d:
            r12 = move-exception
            r11 = r2
        L3f:
            com.sankuai.shangou.stone.util.log.a.a(r12)     // Catch: java.lang.Throwable -> L4e
            if (r11 == 0) goto L4c
            r11.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r11 = move-exception
            com.sankuai.shangou.stone.util.log.a.a(r11)
        L4c:
            r12 = r2
        L4d:
            return r12
        L4e:
            r12 = move-exception
        L4f:
            if (r11 == 0) goto L59
            r11.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r11 = move-exception
            com.sankuai.shangou.stone.util.log.a.a(r11)
        L59:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.shangou.stone.util.j.a(android.content.Context, java.lang.String):java.lang.String");
    }

    private static String a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a47757c6d8cf9e10454958b79101ee1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a47757c6d8cf9e10454958b79101ee1");
        }
        if (inputStream == null) {
            return "";
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            return new String(bArr, "UTF-8");
        } catch (IOException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return "";
        }
    }
}
