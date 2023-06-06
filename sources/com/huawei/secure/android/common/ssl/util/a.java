package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    private static final Uri a = Uri.parse("content://com.huawei.hwid");
    private static final String[] b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    private static void a(InputStream inputStream, Context context) {
        if (context == null) {
            return;
        }
        String c = c(context);
        if (!new File(c).exists() && !TextUtils.isEmpty(c)) {
            File file = new File(c);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    f.a("BksUtil", "create directory  failed");
                }
            } else {
                f.a("BksUtil");
            }
        }
        File file2 = new File(c, "hmsrootcas.bks");
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            f.a("BksUtil");
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        e.a((Closeable) fileOutputStream2);
                        return;
                    }
                }
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                try {
                    f.a("BksUtil", " IOException");
                    e.a((Closeable) fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    e.a((OutputStream) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                e.a((OutputStream) fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static InputStream b(Context context) {
        if (d(context)) {
            f.a("BksUtil");
            try {
                return new FileInputStream(c(context) + File.separator + "hmsrootcas.bks");
            } catch (FileNotFoundException unused) {
                f.a("BksUtil", "FileNotFoundExceptio: ");
                return null;
            }
        }
        return null;
    }

    private static boolean d(Context context) {
        return new File(c(context) + File.separator + "hmsrootcas.bks").exists();
    }

    private static boolean a(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = "hms version code is : " + str;
        f.a("BksUtil");
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        int i = 0;
        while (i < max) {
            if (i < length) {
                try {
                    parseInt = Integer.parseInt(split[i]);
                } catch (Exception e) {
                    f.a("BksUtil", " exception : " + e.getMessage());
                    return i >= length2;
                }
            } else {
                parseInt = 0;
            }
            int parseInt2 = i < length2 ? Integer.parseInt(split2[i]) : 0;
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
            i++;
        }
        return true;
    }

    private static boolean a(Context context, String str) {
        byte[] b2 = b(context, str);
        for (String str2 : b) {
            if (str2.equalsIgnoreCase(a(b2))) {
                return true;
            }
        }
        return false;
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            Log.e("BksUtil", "NoSuchAlgorithmException" + e.getMessage());
            return "";
        }
    }

    private static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            f.a("BksUtil", "inputstraem exception");
            return "";
        }
    }

    private static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + "aegis";
        }
        return context.getApplicationContext().getFilesDir() + File.separator + "aegis";
    }

    private static byte[] b(Context context, String str) {
        PackageInfo packageInfo;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                    return packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("BksUtil", "PackageManager.NameNotFoundException : " + e.getMessage());
            } catch (Exception e2) {
                Log.e("BksUtil", "get pm exception : " + e2.getMessage());
            }
            return new byte[0];
        }
        Log.e("BksUtil", "packageName is null or context is null");
        return new byte[0];
    }

    private static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static synchronized InputStream a(Context context) {
        InputStream inputStream;
        ByteArrayInputStream byteArrayInputStream;
        synchronized (a.class) {
            f.a("BksUtil");
            if (context != null) {
                c.a(context);
            }
            Context context2 = c.a;
            ByteArrayInputStream byteArrayInputStream2 = null;
            if (context2 == null) {
                f.a("BksUtil", MonitorManager.CONTEXT_IS_NULL_MSG);
                return null;
            } else if (!a(g.a("com.huawei.hwid")) && !a(g.a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                f.a("BksUtil", "hms version code is too low : " + g.a("com.huawei.hwid"));
                return null;
            } else if (!a(context2, "com.huawei.hwid") && !"E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(a(b(context2, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)))) {
                f.a("BksUtil", "hms sign error");
                return null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    inputStream = context2.getContentResolver().openInputStream(Uri.withAppendedPath(a, "files/hmsrootcas.bks"));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        th = th;
                        byteArrayInputStream = null;
                        e.a(inputStream);
                        e.a((OutputStream) byteArrayOutputStream);
                        e.a((InputStream) byteArrayInputStream);
                        throw th;
                    }
                    try {
                        String string = h.a(context2).getString("bks_hash", "");
                        String c = c(byteArrayOutputStream.toByteArray());
                        if (d(context2) && string.equals(c)) {
                            f.a("BksUtil");
                        } else {
                            f.a("BksUtil");
                            a(byteArrayInputStream, context2);
                            h.a(context2).edit().putString("bks_hash", c).apply();
                        }
                        e.a(inputStream);
                        e.a((OutputStream) byteArrayOutputStream);
                        e.a((Closeable) byteArrayInputStream);
                    } catch (Exception unused2) {
                        byteArrayInputStream2 = byteArrayInputStream;
                        try {
                            f.a("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider");
                            e.a(inputStream);
                            e.a((OutputStream) byteArrayOutputStream);
                            e.a((Closeable) byteArrayInputStream2);
                            return b(context2);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayInputStream = byteArrayInputStream2;
                            e.a(inputStream);
                            e.a((OutputStream) byteArrayOutputStream);
                            e.a((InputStream) byteArrayInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        e.a(inputStream);
                        e.a((OutputStream) byteArrayOutputStream);
                        e.a((InputStream) byteArrayInputStream);
                        throw th;
                    }
                } catch (Exception unused3) {
                    inputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                }
                return b(context2);
            }
        }
    }
}
