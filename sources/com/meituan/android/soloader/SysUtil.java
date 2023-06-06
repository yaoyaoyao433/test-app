package com.meituan.android.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class SysUtil {
    public static ChangeQuickRedirect a;

    public static int a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce6e26f8dd4886c304a54cd2cb6c9394", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce6e26f8dd4886c304a54cd2cb6c9394")).intValue();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void a(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ab8a239780d82ce47dd4bfd2047abe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ab8a239780d82ce47dd4bfd2047abe9");
            return;
        }
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

    /* compiled from: ProGuard */
    @TargetApi(21)
    @DoNotOptimize
    /* loaded from: classes3.dex */
    static final class LollipopSysdeps {
        public static ChangeQuickRedirect a;

        @DoNotOptimize
        public static String[] getSupportedAbis() {
            return Build.SUPPORTED_ABIS;
        }

        @DoNotOptimize
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            Object[] objArr = {fileDescriptor, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad049ab57da5637e1155e42d3cc09e36", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad049ab57da5637e1155e42d3cc09e36");
                return;
            }
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && e.errno != OsConstants.ENOSYS && e.errno != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }
    }

    public static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        Object[] objArr = {randomAccessFile, inputStream, Integer.MAX_VALUE, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b52ac5ec15df378f5927758d6acdcd43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b52ac5ec15df378f5927758d6acdcd43")).intValue();
        }
        int i2 = 0;
        while (i2 < Integer.MAX_VALUE) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    public static void b(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79ece453007c3aec791580dc24b1d771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79ece453007c3aec791580dc24b1d771");
        } else if (file.isDirectory()) {
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
            } finally {
            }
        }
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dc63319dc04f8f92126e256b248c9c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dc63319dc04f8f92126e256b248c9c6")).intValue();
        }
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
