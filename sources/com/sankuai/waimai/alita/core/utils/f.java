package com.sankuai.waimai.alita.core.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static Handler b = new Handler(Looper.getMainLooper());

    public static void a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12c75c74f8f04d392e7d11e461bdbe8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12c75c74f8f04d392e7d11e461bdbe8e");
        } else if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(OutputStream outputStream) {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "264b20a4a6220bf890e13a1f66cd87e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "264b20a4a6220bf890e13a1f66cd87e1");
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7218acce7757cc1e7034fcbcad848730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7218acce7757cc1e7034fcbcad848730");
        } else if (file != null && file.exists() && file.isDirectory()) {
            if ((e(file) ? b(file) : false) || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2 != null && file2.isDirectory()) {
                    a(file2);
                }
            }
        }
    }

    public static boolean b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d15b85f671f064824b150c4923b205a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d15b85f671f064824b150c4923b205a6")).booleanValue();
        }
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        if (file2.isDirectory()) {
                            b(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
            }
            return file.delete();
        }
        return false;
    }

    public static void a(File file, String str) {
        File[] listFiles;
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab5a9c8bc80a57ac7c07d7189c3141bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab5a9c8bc80a57ac7c07d7189c3141bb");
        } else if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.getName().equals(str)) {
                    if (file2.isDirectory()) {
                        b(file2);
                    } else {
                        file2.delete();
                    }
                } else {
                    a(file2, str);
                }
            }
        }
    }

    public static void a(InputStream inputStream, FileOutputStream fileOutputStream) {
        Object[] objArr = {inputStream, fileOutputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0e306120a3a16621bdad94fd7e123d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0e306120a3a16621bdad94fd7e123d3");
            return;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    public static <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e63f42b11259b29de08111e66e1ecfa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e63f42b11259b29de08111e66e1ecfa")).booleanValue() : list == null || list.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r12 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        if (r12 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r12 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.alita.core.utils.f.a
            java.lang.String r11 = "5505ec0eeb691081304152de8c7865ac"
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
            if (r12 == 0) goto L80
            boolean r1 = r12.exists()
            if (r1 == 0) goto L80
            boolean r1 = r12.isDirectory()
            if (r1 == 0) goto L80
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = r12.getAbsolutePath()
            r3.append(r12)
            java.lang.String r12 = java.io.File.separator
            r3.append(r12)
            java.lang.String r12 = "__deleted__"
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r1.<init>(r12)
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L71 java.io.IOException -> L78 java.io.FileNotFoundException -> L7c
            r12.<init>(r1, r9)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L71 java.io.IOException -> L78 java.io.FileNotFoundException -> L7c
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            r12.write(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            r12.close()     // Catch: java.io.IOException -> L81
            goto L81
        L67:
            r0 = move-exception
            goto L6b
        L69:
            r0 = move-exception
            r12 = r2
        L6b:
            if (r12 == 0) goto L70
            r12.close()     // Catch: java.io.IOException -> L70
        L70:
            throw r0
        L71:
            r12 = r2
        L72:
            if (r12 == 0) goto L80
        L74:
            r12.close()     // Catch: java.io.IOException -> L80
            goto L80
        L78:
            r12 = r2
        L79:
            if (r12 == 0) goto L80
            goto L74
        L7c:
            r12 = r2
        L7d:
            if (r12 == 0) goto L80
            goto L74
        L80:
            r0 = 0
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.utils.f.c(java.io.File):boolean");
    }

    public static boolean a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f012d6e536bffac88b96f7ccdd5d4b83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f012d6e536bffac88b96f7ccdd5d4b83")).booleanValue();
        }
        if (map == null) {
            return true;
        }
        return map.isEmpty();
    }

    @SuppressLint({"MissingPermission"})
    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae4dd07ce5821721cae74198f223a036", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae4dd07ce5821721cae74198f223a036")).booleanValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0649a2dcf684d56ecd2de358a8b7d2d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0649a2dcf684d56ecd2de358a8b7d2d")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            URI uri = new URI(str);
            if (uri.getHost() == null) {
                return false;
            }
            return uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62e99aa99adc6fff1d883092ab0510cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62e99aa99adc6fff1d883092ab0510cf")).intValue();
        }
        if (str == null || str2 == null) {
            throw new RuntimeException("版本号不能为空");
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = split[i2].length() - split2[i2].length();
            if (i != 0 || (i = split[i2].compareTo(split2[i2])) != 0) {
                break;
            }
        }
        return i != 0 ? i : split.length - split2.length;
    }

    public static void d(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c474d578f72a1cd1976ce792b374fed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c474d578f72a1cd1976ce792b374fed");
        } else if (file != null && file.exists() && file.isDirectory()) {
            Object[] objArr2 = {file};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4524b3714f79f8e83ba01e6b2cec8610", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4524b3714f79f8e83ba01e6b2cec8610");
            } else if (file != null && file.exists() && file.isDirectory()) {
                File file2 = new File(file.getAbsolutePath() + File.separator + "__deleted__");
                if (file2.isFile()) {
                    file2.delete();
                }
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file3 : listFiles) {
                if (file3 != null && file3.isDirectory()) {
                    d(file3);
                }
            }
        }
    }

    public static boolean e(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4f900a94c423060a553a6a574a6b187", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4f900a94c423060a553a6a574a6b187")).booleanValue();
        }
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile() && "__deleted__".equals(file2.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
