package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class kh {
    private static final String b = "LibaryLoaderHelper";
    static final /* synthetic */ boolean a = !kh.class.desiredAssertionStatus();
    private static boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, String str) {
        if (a || context != null) {
            File b2 = b(context, str);
            boolean exists = b2.exists();
            if (Log.isLoggable(b, 4)) {
                StringBuilder sb = new StringBuilder("libary:");
                sb.append(b2.getAbsolutePath());
                sb.append(" is exist:");
                sb.append(exists);
            }
            if (exists || b(context)) {
                try {
                    System.load(b2.getAbsolutePath());
                    return true;
                } catch (UnsatisfiedLinkError unused) {
                    return false;
                }
            }
            return false;
        }
        throw new AssertionError();
    }

    private static File a(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    private static File b(Context context, String str) {
        return new File(a(context), System.mapLibraryName(str));
    }

    private static boolean b(Context context) {
        String[] strArr;
        InputStream inputStream;
        if (c) {
            return false;
        }
        c = true;
        File a2 = a(context);
        a(a2);
        try {
            ZipFile zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir), 1);
            for (String str : kg.a) {
                ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str));
                if (entry == null) {
                    entry = zipFile.getEntry("lib/" + Build.CPU_ABI2 + "/" + System.mapLibraryName(str));
                }
                if (entry == null) {
                    zipFile.close();
                    a(a2);
                    return false;
                }
                File b2 = b(context, str);
                if (Log.isLoggable(b, 4)) {
                    new StringBuilder("Extracting native libraries into ").append(b2.getAbsolutePath());
                }
                if (!a && b2.exists()) {
                    throw new AssertionError();
                }
                try {
                    if (!b2.createNewFile()) {
                        throw new IOException();
                    }
                    FileOutputStream fileOutputStream = null;
                    try {
                        inputStream = zipFile.getInputStream(entry);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(b2);
                            try {
                                byte[] bArr = new byte[16384];
                                while (true) {
                                    int read = inputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                fileOutputStream2.close();
                                if (Build.VERSION.SDK_INT >= 9) {
                                    b2.setReadable(true, false);
                                    b2.setExecutable(true, false);
                                    b2.setWritable(true);
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                } catch (IOException e) {
                    if (b2.exists() && !b2.delete() && Log.isLoggable(b, 6)) {
                        Log.e(b, "Failed to delete " + b2.getAbsolutePath());
                    }
                    zipFile.close();
                    throw e;
                }
            }
            zipFile.close();
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable(b, 6)) {
                Log.e(b, "Failed to unpack native libraries", e2);
            }
            a(a2);
            return false;
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str) {
        ZipEntry entry = zipFile.getEntry("lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str));
        if (entry != null) {
            return entry;
        }
        return zipFile.getEntry("lib/" + Build.CPU_ABI2 + "/" + System.mapLibraryName(str));
    }

    private static void a(File file) {
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.getName();
                    if (!file2.delete() && Log.isLoggable(b, 6)) {
                        Log.e(b, "Failed to remove " + file2.getAbsolutePath());
                    }
                }
            }
            if (file.delete() || !Log.isLoggable(b, 6)) {
                return;
            }
            Log.e(b, "Failed to remove " + file.getAbsolutePath());
        } catch (Exception e) {
            if (Log.isLoggable(b, 6)) {
                Log.e(b, "Failed to remove old libs, ", e);
            }
        }
    }
}
