package com.meituan.android.uptodate.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.walle.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abbb9affa9dc1d5b0fb9c491e2d739a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abbb9affa9dc1d5b0fb9c491e2d739a6");
        }
        if (context == null || !a()) {
            return null;
        }
        File b = q.b(context, "ddUpdate", null, u.b);
        b.mkdirs();
        return b.getAbsolutePath();
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48fb2d53aba28f6fed3cc6e181406319", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48fb2d53aba28f6fed3cc6e181406319");
        }
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return a2;
        }
        return a2 + "/update_diff.apk";
    }

    public static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ead540c24981b9283ad67adc9e830052", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ead540c24981b9283ad67adc9e830052");
        }
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return a2;
        }
        return a2 + "/update_new.apk";
    }

    public static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97595eef52c61bc314f6b66afe94de05", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97595eef52c61bc314f6b66afe94de05");
        }
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return a2;
        }
        return a2 + "/update_new.apk.temp";
    }

    public static String e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad76062ddb7aaba74dcd89a06af76a92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad76062ddb7aaba74dcd89a06af76a92");
        }
        try {
            File file = new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).applicationInfo.sourceDir);
            if (file.exists()) {
                return a.a(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static File f(Context context) {
        boolean z = false;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c27a2a1d75e37f9a2d1168b3eb0c39b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c27a2a1d75e37f9a2d1168b3eb0c39b6");
        }
        if (context == null) {
            return null;
        }
        String h = h(context);
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).applicationInfo.sourceDir;
            if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(str) && a(str, h)) {
                File file = new File(h);
                File file2 = new File(str);
                if (file.length() > 0 && file.length() == file2.length()) {
                    if (file.exists()) {
                        try {
                            Object[] objArr2 = {file, (byte) 1};
                            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.walle.f.a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c88259ed7d22e17bafe1313414aa75c0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c88259ed7d22e17bafe1313414aa75c0");
                            } else {
                                Object[] objArr3 = {file, 1903654775, (byte) 1};
                                ChangeQuickRedirect changeQuickRedirect3 = i.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6c58eb322eaa1509770a73d493128411", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6c58eb322eaa1509770a73d493128411");
                                } else {
                                    i.a(file, new i.a() { // from class: com.meituan.android.walle.i.2
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.android.walle.i.a
                                        public final com.meituan.android.walle.a a(Map<Integer, ByteBuffer> map) {
                                            Object[] objArr4 = {map};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "01dc3ad0cdf36e484d77d6ada025d44c", RobustBitConfig.DEFAULT_VALUE)) {
                                                return (com.meituan.android.walle.a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "01dc3ad0cdf36e484d77d6ada025d44c");
                                            }
                                            com.meituan.android.walle.a aVar = new com.meituan.android.walle.a();
                                            for (Map.Entry<Integer, ByteBuffer> entry : map.entrySet()) {
                                                if (entry.getKey().intValue() != r1) {
                                                    aVar.a(new b(entry.getKey().intValue(), entry.getValue()));
                                                }
                                            }
                                            return aVar;
                                        }
                                    }, true);
                                }
                            }
                            z = true;
                        } catch (Exception unused) {
                        }
                    }
                    if (z) {
                        return file;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        g(context);
        return null;
    }

    private static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "535681dfd233e5fdbb9d8849f8cc67fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "535681dfd233e5fdbb9d8849f8cc67fb")).booleanValue();
        }
        try {
            File file = new File(str2);
            file.delete();
            file.createNewFile();
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static void g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbd690c99cf70ef484d92298efda62ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbd690c99cf70ef484d92298efda62ab");
        } else if (context == null) {
        } else {
            String h = h(context);
            if (TextUtils.isEmpty(h)) {
                return;
            }
            a(new File(h));
        }
    }

    public static String h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e48e4750fc1e8bff010cd8763965414", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e48e4750fc1e8bff010cd8763965414");
        }
        String a2 = a(context);
        return a2 + "/update_old.apk";
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3417f9c9f6425c499bd5f2d753f3e5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3417f9c9f6425c499bd5f2d753f3e5f")).booleanValue();
        }
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    private static void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f33650823d55e1917514f2e68016fbba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f33650823d55e1917514f2e68016fbba");
        } else if (file.exists() && file.isFile()) {
            file.delete();
        }
    }
}
