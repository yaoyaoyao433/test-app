package com.sankuai.xm.base.util;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k extends o {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5c736a0336c5c29feba621bad46d85d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5c736a0336c5c29feba621bad46d85d");
        }
        if (a() != null) {
            return a().f(str);
        }
        return i(str);
    }

    public static Uri b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a644849cac8b32b62d59e240229fd540", 6917529027641081856L)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a644849cac8b32b62d59e240229fd540");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(d)) {
            return Uri.fromFile(new File(str));
        }
        return Uri.parse(str);
    }

    public static Uri a(Context context, File file, String str) {
        Object[] objArr = {context, file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d28c3ca681f2cac3bdea7415b403d91", 6917529027641081856L)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d28c3ca681f2cac3bdea7415b403d91");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return FileProvider.getUriForFile(context, str, file);
        }
        return Uri.fromFile(file);
    }

    public static String a(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "718f0d22471f12ceffa6209bfccade4d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "718f0d22471f12ceffa6209bfccade4d");
        }
        if (uri == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            String a2 = y.a(context, uri);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        return uri.toString();
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa98f5b6e80a1201c6c9e44028558593", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa98f5b6e80a1201c6c9e44028558593");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = l.a(str);
        if (str.startsWith(AbsApiFactory.HTTP) || str.startsWith(AbsApiFactory.HTTPS)) {
            return TextUtils.isEmpty(a2) ? String.valueOf(str.hashCode()) : a2;
        } else if (str.startsWith("data:image")) {
            return "base64_image_" + a2;
        } else {
            return str;
        }
    }

    public static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da11622234a446d99b65f709fecbf1f8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da11622234a446d99b65f709fecbf1f8")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(d)) {
            return new File(str).isDirectory();
        }
        return false;
    }

    @Deprecated
    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a7b43b2868c5664dee37158c6891130", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a7b43b2868c5664dee37158c6891130");
        } else if (str == null) {
        } else {
            try {
                if (!str.startsWith(d)) {
                    t(str);
                    return;
                }
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e) {
                com.sankuai.xm.log.a.d("FileUtils", e, "::deleteFile, file = %s", str);
            }
        }
    }

    @Deprecated
    public static boolean f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d01a3be855a759b6e53f3893571a7cf6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d01a3be855a759b6e53f3893571a7cf6")).booleanValue();
        }
        try {
            if (!str.startsWith(d)) {
                return o(str);
            }
            File file = new File(str);
            return file.exists() && file.isFile();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55dbc3aef4683ac0cfcb3a88308a5201", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55dbc3aef4683ac0cfcb3a88308a5201")).booleanValue() : "mounted".equals(aa.a(context));
    }

    public static void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bb38c71569cfbdacd6a918e5b3c74c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bb38c71569cfbdacd6a918e5b3c74c6");
            return;
        }
        try {
            File parentFile = new File(str).getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public static boolean h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b67b9cd74c0e0fc79418d71e7950069", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b67b9cd74c0e0fc79418d71e7950069")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.startsWith(d)) {
            try {
                File parentFile = new File(str).getParentFile();
                if (parentFile != null) {
                    if (parentFile.exists()) {
                        return true;
                    }
                    return parentFile.mkdirs();
                }
            } catch (SecurityException e) {
                com.sankuai.xm.log.c.a("FileUtils", e, "makeDirs:: failed in make dir %s", str);
            }
            return false;
        }
        return true;
    }

    public static boolean a(File file, String str, boolean z) {
        Object[] objArr = {file, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileWriter fileWriter = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9747c21bcb6d68645982c323e9aad133", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9747c21bcb6d68645982c323e9aad133")).booleanValue();
        }
        try {
            try {
                if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
                    FileWriter fileWriter2 = new FileWriter(file, false);
                    try {
                        fileWriter2.write(str);
                        try {
                            fileWriter2.flush();
                            fileWriter2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    } catch (Exception e2) {
                        e = e2;
                        fileWriter = fileWriter2;
                        com.sankuai.xm.log.c.a("FileUtils", e);
                        if (fileWriter != null) {
                            try {
                                fileWriter.flush();
                                fileWriter.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            try {
                                fileWriter.flush();
                                fileWriter.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                return false;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String a(java.io.File r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.base.util.k.a
            java.lang.String r10 = "6987b513fdb08c7e962190e57da170c0"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            boolean r0 = r11.exists()
            if (r0 == 0) goto L78
            boolean r0 = r11.isFile()
            if (r0 != 0) goto L2b
            goto L78
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L60
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L60
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L59
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L59
        L3a:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L49
            r0.append(r3)     // Catch: java.lang.Throwable -> L54
            r3 = 10
            r0.append(r3)     // Catch: java.lang.Throwable -> L54
            goto L3a
        L49:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L54
            com.sankuai.xm.base.util.m.a(r1)
            com.sankuai.xm.base.util.m.a(r11)
            goto L6f
        L54:
            r0 = move-exception
            goto L63
        L56:
            r0 = move-exception
            r11 = r2
            goto L71
        L59:
            r0 = move-exception
            r11 = r2
            goto L63
        L5c:
            r0 = move-exception
            r11 = r2
            r1 = r11
            goto L71
        L60:
            r0 = move-exception
            r11 = r2
            r1 = r11
        L63:
            java.lang.String r3 = "FileUtils"
            com.sankuai.xm.log.c.a(r3, r0)     // Catch: java.lang.Throwable -> L70
            com.sankuai.xm.base.util.m.a(r1)
            com.sankuai.xm.base.util.m.a(r11)
            r0 = r2
        L6f:
            return r0
        L70:
            r0 = move-exception
        L71:
            com.sankuai.xm.base.util.m.a(r1)
            com.sankuai.xm.base.util.m.a(r11)
            throw r0
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.k.a(java.io.File):java.lang.String");
    }

    public static String i(String str) {
        int lastIndexOf;
        String a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3ab3247d64e29b7932d1b841fce8aca", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3ab3247d64e29b7932d1b841fce8aca");
        }
        if (n(str).contains(CommonConstant.Symbol.DOT)) {
            str2 = i.a(str);
            if (TextUtils.isEmpty(str2)) {
                str2 = i.b(str.substring(str.lastIndexOf(CommonConstant.Symbol.DOT)).toLowerCase());
            }
        }
        if (str2 == null && (a2 = j.a(str)) != null) {
            str2 = i.b(a2);
        }
        if (str2 == null) {
            return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) == -1) ? str2 : MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.toLowerCase().substring(lastIndexOf + 1));
        }
        return str2;
    }

    public static void a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8653eb592583d84a214d08ec97336cc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8653eb592583d84a214d08ec97336cc8");
        } else if (file != null && !TextUtils.isEmpty(str)) {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            a(file2, str);
                        }
                    }
                } else if (!file.getName().matches(str) && !file.delete()) {
                    com.sankuai.xm.log.c.d("FileUtils", "delete file fail info:%s", file.getAbsolutePath());
                }
            } catch (Exception e) {
                com.sankuai.xm.log.c.a("FileUtils", e);
            }
        }
    }

    public static File j(String str) {
        File a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc2ed2643e5efaea4192d1fe219d1582", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc2ed2643e5efaea4192d1fe219d1582");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e98abae30f79990cd39436886062e62e", 6917529027641081856L)) {
            a2 = (File) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e98abae30f79990cd39436886062e62e");
        } else {
            a2 = com.meituan.android.cipstorage.q.a(com.sankuai.xm.base.lifecycle.d.d().a(), "xm", (String) null, com.meituan.android.cipstorage.u.b);
            if (!a2.exists() && !a2.mkdirs()) {
                com.sankuai.xm.log.c.c("FileUtils", "getCacheFileRoot mkdirs failed.", new Object[0]);
            }
        }
        return new File(a2, str);
    }

    public static File k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87c63e82054089f141c837d946946d72", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87c63e82054089f141c837d946946d72");
        }
        File a2 = com.meituan.android.cipstorage.q.a(com.sankuai.xm.base.lifecycle.d.d().a(), "xm", (String) null);
        a2.mkdirs();
        return new File(a2, str);
    }

    public static File l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a63a0b2cb6fdf468f3a2708957bb4c9b", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a63a0b2cb6fdf468f3a2708957bb4c9b");
        }
        File b = com.meituan.android.cipstorage.q.b(com.sankuai.xm.base.lifecycle.d.d().a(), "xm", (String) null);
        b.mkdirs();
        return new File(b, str);
    }

    public static File a(String str, String str2) {
        File file;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d73cd2952251222d321b4d741f3f3855", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d73cd2952251222d321b4d741f3f3855");
        }
        if (TextUtils.isEmpty(str)) {
            str = "Documents";
        }
        try {
            file = Environment.getExternalStoragePublicDirectory(str);
            file.mkdirs();
        } catch (Exception e) {
            com.sankuai.xm.log.c.a("FileUtils", e, "createExternalPublicFile type:%s, fileName:%s.", str, str2);
            file = null;
        }
        if (file == null || !file.exists() || !file.canWrite()) {
            file = com.meituan.android.cipstorage.q.b(com.sankuai.xm.base.lifecycle.d.d().a(), str, "xm");
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static com.meituan.android.privacy.interfaces.t b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb1fc59d07b601b4e149c25738424383", 6917529027641081856L) ? (com.meituan.android.privacy.interfaces.t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb1fc59d07b601b4e149c25738424383") : Privacy.createContentResolver(context, "jcyf-e4b399808a333f25");
    }
}
