package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static int a(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String[] a() {
        return Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : Build.SUPPORTED_ABIS;
    }

    public static void a(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("could not delete: " + file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int read;
        int i2 = 0;
        while (i2 < Integer.MAX_VALUE && (read = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2))) != -1) {
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("cannot list directory " + file);
            }
            for (File file2 : listFiles) {
                b(file2);
            }
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, r.o);
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (th != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    } else {
                        randomAccessFile.close();
                    }
                    throw th2;
                }
            }
        }
    }

    public static int a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }
}
