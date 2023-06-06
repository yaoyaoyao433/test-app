package com.meituan.mtwebkit.internal;

import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.mtwebkit.internal.k;
import com.meituan.mtwebkit.internal.task.a;
import com.meituan.mtwebkit.internal.update.tasks.DDVersionInfoTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static final String b = com.meituan.mtwebkit.internal.a.c();
    private static int c = -1;
    private static Throwable d;
    private static FileLock e;
    private static FileLock f;
    private static PackageInfo g;
    private static Boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<T> {
        void a(int i, @Nullable Throwable th);

        void a(@NonNull T t);
    }

    public static /* synthetic */ void a(Throwable th, a aVar) {
        Object[] objArr = {th, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f46aa94d4410aa7808ab98f3b249ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f46aa94d4410aa7808ab98f3b249ede");
            return;
        }
        int a2 = a(th);
        if (99999 != a2) {
            th = th.getCause();
        }
        aVar.a(a2, th);
    }

    public static synchronized PackageInfo a() throws IOException {
        PackageInfo packageInfo;
        FileLock tryLock;
        synchronized (l.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "deacbfc37e75c9f5aeded9ad387ac20e", RobustBitConfig.DEFAULT_VALUE)) {
                return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "deacbfc37e75c9f5aeded9ad387ac20e");
            } else if (c != -1) {
                StringBuilder sb = new StringBuilder("requestPackageInfoImmediately被调用过,返回globalPackageInfo. status: ");
                sb.append(c);
                sb.append(" globalPackageInfo: ");
                sb.append(g != null ? Integer.valueOf(g.versionCode) : "为空");
                e.c("MTWebViewManager", sb.toString());
                return g;
            } else {
                c = 0;
                if (h.r()) {
                    e.c("MTWebViewManager", "因为降级, requestPackageInfoImmediately返回空");
                    g = null;
                    return null;
                }
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ee435e4f273545ff09ec318028147a67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ee435e4f273545ff09ec318028147a67")).booleanValue() : com.meituan.mtwebkit.internal.a.a().getFilesDir().getPath().contains("dkplugin")) {
                    e.c("MTWebViewManager", "监测到多开框架dkplugin，直接降级");
                    g = null;
                    return null;
                }
                i();
                try {
                    packageInfo = l();
                } catch (FileNotFoundException unused) {
                    a((Throwable) null, 8);
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    Object[] objArr3 = {packageInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "17e6e74cf94b734df1cc19e6af32f349", RobustBitConfig.DEFAULT_VALUE)) {
                        tryLock = (FileLock) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "17e6e74cf94b734df1cc19e6af32f349");
                    } else {
                        Object[] objArr4 = {packageInfo};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        tryLock = new RandomAccessFile(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "3814963624952e49ada09605f22b6d08", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "3814963624952e49ada09605f22b6d08") : new File(g.b(Integer.toString(packageInfo.versionCode)), b), "rw").getChannel().tryLock();
                        if (tryLock == null || !tryLock.isValid()) {
                            throw new IOException("lockHoldFile failed");
                        }
                    }
                    e = tryLock;
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ec73ca38138c6dd698ba8e1abfdfe806", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ec73ca38138c6dd698ba8e1abfdfe806");
                } else {
                    long l = h.l();
                    long a2 = DDVersionInfoTask.a("0.1.29");
                    if (a2 > l) {
                        h.q();
                        h.b(a2);
                    }
                }
                a(packageInfo);
                if (packageInfo != null) {
                    c = 2;
                }
                StringBuilder sb2 = new StringBuilder("requestPackageInfoImmediately, 本地包信息: ");
                sb2.append(packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : "为空");
                sb2.append(" status:");
                sb2.append(c);
                e.c("MTWebViewManager", sb2.toString());
                g = packageInfo;
                j();
                return packageInfo;
            }
        }
    }

    private static void a(PackageInfo packageInfo) {
        boolean z;
        File[] listFiles;
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91cd52a2af8fac38d0c0f95b0021eaf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91cd52a2af8fac38d0c0f95b0021eaf4");
            return;
        }
        Set<String> c2 = g.c();
        if (c2 == null) {
            return;
        }
        for (String str : c2) {
            if (packageInfo == null || !String.valueOf(packageInfo.versionCode).equals(str)) {
                File b2 = g.b(str);
                if (b2.exists() && b2.isDirectory() && (listFiles = b2.listFiles()) != null) {
                    for (File file : listFiles) {
                        if (!b.equals(file.getName()) && b(file)) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    new File(g.a(str), "extra.flag").delete();
                    c.a(g.a(str), c.b);
                }
            }
        }
    }

    private static void i() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "094ab4c67f814be29100061d661d2c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "094ab4c67f814be29100061d661d2c43");
        } else if (f != null) {
            throw new IllegalStateException("need release locker first");
        } else {
            FileLock lock = new RandomAccessFile(new File(g.a(), "mt_webview_data.lock"), "rw").getChannel().lock();
            if (lock == null || !lock.isValid()) {
                throw new IOException("lockGlobal failed");
            }
            f = lock;
        }
    }

    private static void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8171b0e3df1ea13c1713f0c7fa6c6f10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8171b0e3df1ea13c1713f0c7fa6c6f10");
        } else if (f == null) {
        } else {
            try {
                f.release();
                f = null;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4442ea86feb5f53fb321c4c6bfe900e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4442ea86feb5f53fb321c4c6bfe900e")).booleanValue();
        }
        try {
            FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
            if (tryLock != null) {
                tryLock.release();
                return false;
            }
        } catch (IOException unused) {
        }
        return true;
    }

    public static PackageInfo b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35273fe272a50d0e580cbf102b1a67c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35273fe272a50d0e580cbf102b1a67c5");
        }
        try {
            return a();
        } catch (Throwable th) {
            e.c("MTWebViewManager", "requestPackageInfoSafely,获取PackageInfo发生异常. " + th.getMessage());
            a(th, 7);
            return null;
        }
    }

    private static boolean a(@NonNull PackageInfo packageInfo, @NonNull InputStream inputStream) throws IOException {
        Object[] objArr = {packageInfo, inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19d03ee1d02647e50d165708d9e0aa1b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19d03ee1d02647e50d165708d9e0aa1b")).booleanValue();
        }
        File a2 = g.a(packageInfo.versionCode);
        File file = new File(a2, "extra.flag");
        if (file.exists() && file.lastModified() != 0) {
            return true;
        }
        File[] listFiles = a2.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                c.a(file2, c.b);
            }
            a2.mkdirs();
        }
        File b2 = g.b(packageInfo.versionCode);
        File c2 = g.c(packageInfo.versionCode);
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(b2));
            boolean b3 = com.meituan.mtwebkit.internal.a.b();
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name.startsWith("lib/")) {
                        if (b3 && name.startsWith("lib/arm64-v8a/")) {
                            c.a(zipInputStream, new File(c2, name.substring(14)));
                        } else if (!b3 && name.startsWith("lib/armeabi-v7a/")) {
                            c.a(zipInputStream, new File(c2, name.substring(16)));
                        } else {
                            e.c("MTWebViewManager", "found other abi so in apk: " + name);
                        }
                    } else {
                        ZipEntry zipEntry = new ZipEntry(nextEntry);
                        zipEntry.setCompressedSize(-1L);
                        zipOutputStream.putNextEntry(zipEntry);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                        zipOutputStream.closeEntry();
                    }
                } else {
                    zipOutputStream.close();
                    zipInputStream.close();
                    return c.a(file);
                }
            }
        } finally {
        }
    }

    public static PackageInfo a(File file) throws IOException, SignatureException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7b8031329e980d2c1d3136523ba3c81", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7b8031329e980d2c1d3136523ba3c81");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("file is null or not found");
        }
        PackageInfo packageArchiveInfo = com.meituan.mtwebkit.internal.a.a().getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 9408);
        if (packageArchiveInfo == null) {
            throw new IOException("package could not be parsed");
        }
        if (h.v() != 2) {
            b(packageArchiveInfo);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            b(packageArchiveInfo, fileInputStream);
            fileInputStream.close();
            return packageArchiveInfo;
        } finally {
        }
    }

    private static void b(PackageInfo packageInfo) throws SignatureException {
        String str;
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e11d4634fe2102bd0c1b4c8a405e8016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e11d4634fe2102bd0c1b4c8a405e8016");
            return;
        }
        try {
            int length = packageInfo.signatures.length;
            for (int i = 0; i < length; i++) {
                byte[] byteArray = packageInfo.signatures[i].toByteArray();
                if (byteArray != null) {
                    Object[] objArr2 = {byteArray};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b8a563836441f3efa6a6d72e947d3bf9", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b8a563836441f3efa6a6d72e947d3bf9");
                    } else {
                        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(byteArray);
                        byte[] digest = messageDigest.digest();
                        char[] cArr2 = new char[digest.length * 2];
                        int i2 = 0;
                        for (byte b2 : digest) {
                            int i3 = i2 + 1;
                            cArr2[i2] = cArr[(b2 >>> 4) & 15];
                            i2 = i3 + 1;
                            cArr2[i3] = cArr[b2 & 15];
                        }
                        str = new String(cArr2);
                    }
                    if ("638c81261479c2104ede3f2518e91725".equals(str)) {
                        return;
                    }
                }
            }
            throw new SignatureException("apk sign md5 not match");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    private static synchronized boolean b(PackageInfo packageInfo, InputStream inputStream) throws IOException {
        boolean z;
        synchronized (l.class) {
            Object[] objArr = {packageInfo, inputStream};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb196bc240f59cc948e7169e0484ecf2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb196bc240f59cc948e7169e0484ecf2")).booleanValue();
            }
            i();
            PackageInfo a2 = h.a();
            StringBuilder sb = new StringBuilder("setNewPackageInfoAndStreamInner, 旧包: ");
            sb.append(a2 != null ? a2.versionName : "为空");
            e.c("MTWebViewManager", sb.toString());
            Object[] objArr2 = {packageInfo, a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3152372b5dcd4f34676f7677f98cf68", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3152372b5dcd4f34676f7677f98cf68")).booleanValue();
            } else {
                if ((packageInfo == null && a2 == null) || (packageInfo != null && a2 != null && packageInfo.versionCode == a2.versionCode)) {
                    z = true;
                }
                z = false;
            }
            if (!z) {
                if (packageInfo != null) {
                    a(packageInfo, inputStream);
                }
                h.a(packageInfo);
                j();
                return true;
            }
            j();
            return false;
        }
    }

    public static synchronized int c() {
        int i;
        synchronized (l.class) {
            i = c;
        }
        return i;
    }

    public static synchronized Throwable d() {
        Throwable th;
        synchronized (l.class) {
            th = d;
            d = null;
        }
        return th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b<T> implements a<T> {
        public static ChangeQuickRedirect a;
        public Handler b;
        public a<T> c;

        public b(a<T> aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d211577a1b0814c4c5488220defcdc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d211577a1b0814c4c5488220defcdc");
            } else if (Looper.myLooper() == null && aVar != null) {
                throw new IllegalStateException("LoadedCallback must be set on a thread with a running Looper.");
            } else {
                if (aVar != null) {
                    this.b = new Handler();
                }
                this.c = aVar;
            }
        }

        @Override // com.meituan.mtwebkit.internal.l.a
        public final void a(@NonNull final T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d93089e308eff123bd6ae53f3d2ca50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d93089e308eff123bd6ae53f3d2ca50");
            } else if (this.c != null) {
                this.b.post(new Runnable() { // from class: com.meituan.mtwebkit.internal.l.b.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4e1c78ac656388cd870e8282e980808", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4e1c78ac656388cd870e8282e980808");
                        } else {
                            b.this.c.a(t);
                        }
                    }
                });
            }
        }

        @Override // com.meituan.mtwebkit.internal.l.a
        public final void a(final int i, final Throwable th) {
            Object[] objArr = {Integer.valueOf(i), th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2744f7afa0111e0f874ba1d5091590", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2744f7afa0111e0f874ba1d5091590");
            } else if (this.c != null) {
                this.b.post(new Runnable() { // from class: com.meituan.mtwebkit.internal.l.b.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "865dd7cd0bb8f1112e3e0016eb586635", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "865dd7cd0bb8f1112e3e0016eb586635");
                        } else {
                            b.this.c.a(i, th);
                        }
                    }
                });
            }
        }
    }

    public static void a(final int i, a<Boolean> aVar) {
        long s;
        Object[] objArr = {Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10c5f7d9a5e8001f1cdc999150193718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10c5f7d9a5e8001f1cdc999150193718");
        } else if (h.r()) {
        } else {
            long n = h.n();
            if (h.a() == null) {
                s = h.A();
            } else {
                s = h.s();
            }
            if (System.currentTimeMillis() - n <= s) {
                return;
            }
            if (!h.w() || k()) {
                h.d(System.currentTimeMillis());
                e.c("MTWebViewManager", "开始检查更新, 检查更新时机: " + i);
                com.meituan.mtwebkit.internal.task.a dVar = new com.meituan.mtwebkit.internal.update.tasks.d();
                com.meituan.mtwebkit.internal.update.tasks.a aVar2 = new com.meituan.mtwebkit.internal.update.tasks.a() { // from class: com.meituan.mtwebkit.internal.l.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mtwebkit.internal.update.tasks.a, com.meituan.mtwebkit.internal.task.a
                    /* renamed from: a */
                    public final com.meituan.mtwebkit.internal.update.model.a b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f46293f9ac6706cc1044baac24c4d326", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mtwebkit.internal.update.model.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f46293f9ac6706cc1044baac24c4d326") : new com.meituan.mtwebkit.internal.update.model.a(i);
                    }
                };
                Object[] objArr2 = {com.meituan.mtwebkit.internal.update.tasks.a.class, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mtwebkit.internal.task.a.c;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b282c888eadc5d44759aa6aac1944f3d", RobustBitConfig.DEFAULT_VALUE)) {
                    dVar = (com.meituan.mtwebkit.internal.task.a) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b282c888eadc5d44759aa6aac1944f3d");
                } else if (com.meituan.mtwebkit.internal.task.a.d.get() != null) {
                    throw new AssertionError("can not add task cache after any task getOut invoked");
                } else {
                    if (dVar.h == null) {
                        dVar.h = new a.b();
                    }
                    dVar.h.a.put(com.meituan.mtwebkit.internal.update.tasks.a.class, aVar2);
                }
                a(dVar, (a) null);
            }
        }
    }

    private static boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3567c2dbeddb5c45a3c1cd4d138fc364", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3567c2dbeddb5c45a3c1cd4d138fc364")).booleanValue();
        }
        if (h != null) {
            return h.booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.meituan.mtwebkit.internal.a.a().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    private static synchronized <T> void a(final com.meituan.mtwebkit.internal.task.a<T> aVar, a<T> aVar2) {
        synchronized (l.class) {
            Object[] objArr = {aVar, aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9aaec2a38f0134894c0d5a54375fa342", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9aaec2a38f0134894c0d5a54375fa342");
                return;
            }
            final b bVar = new b(aVar2);
            k.a.a.a(new Runnable() { // from class: com.meituan.mtwebkit.internal.l.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f18f9b3d5e72252311cf5a01b35d1f23", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f18f9b3d5e72252311cf5a01b35d1f23");
                        return;
                    }
                    try {
                        Object c2 = com.meituan.mtwebkit.internal.task.a.this.c();
                        if (c2 != null) {
                            bVar.a(c2);
                        } else {
                            bVar.a(1000, null);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        l.a(th, bVar);
                        i.a(th);
                    }
                }
            });
        }
    }

    public static int a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f348e91a378ce8ddc12c63999dd3cf4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f348e91a378ce8ddc12c63999dd3cf4")).intValue();
        }
        if (th instanceof com.meituan.mtwebkit.internal.task.c) {
            com.meituan.mtwebkit.internal.task.c cVar = (com.meituan.mtwebkit.internal.task.c) th;
            com.meituan.mtwebkit.internal.task.a<?> aVar = cVar.b;
            Throwable cause = cVar.getCause();
            if (aVar instanceof com.meituan.mtwebkit.internal.update.tasks.i) {
                return 2001;
            }
            if (aVar instanceof DDVersionInfoTask) {
                return 3000;
            }
            if (aVar instanceof com.meituan.mtwebkit.internal.update.tasks.h) {
                if (cause instanceof TimeoutException) {
                    return MapConstant.LayerPropertyFlag_MarkerSpacing;
                }
                return 4000;
            } else if (aVar instanceof com.meituan.mtwebkit.internal.update.tasks.e) {
                return cause instanceof SignatureException ? 5001 : 5000;
            } else if (aVar instanceof com.meituan.mtwebkit.internal.update.tasks.l) {
                if (cause instanceof IOException) {
                    return 2002;
                }
                return MapConstant.LayerPropertyFlag_HeatmapRadius;
            } else {
                return 99999;
            }
        }
        return 99999;
    }

    public static synchronized void b(Throwable th) {
        synchronized (l.class) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88736ff76d881596d1215f72dfe24074", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88736ff76d881596d1215f72dfe24074");
                return;
            }
            c = 6;
            d = th;
            g = null;
            if (e != null) {
                e.release();
                e = null;
            }
            i.a(th);
        }
    }

    public static synchronized void a(Throwable th, int i) {
        synchronized (l.class) {
            Object[] objArr = {th, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdca423704c67d5eb8c50aaaa47e9265", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdca423704c67d5eb8c50aaaa47e9265");
                return;
            }
            c = i;
            d = th;
            if (c == 8 || c == 7) {
                h.b();
            }
            if (th != null) {
                i.a(th);
            }
        }
    }

    public static synchronized PackageInfo e() {
        PackageInfo packageInfo;
        synchronized (l.class) {
            packageInfo = g;
        }
        return packageInfo;
    }

    public static boolean f() {
        Set<String> x;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05ce0215325dd2a6911f9e9a63579513", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05ce0215325dd2a6911f9e9a63579513")).booleanValue();
        }
        if (h.r()) {
            return false;
        }
        PackageInfo m = m();
        StringBuilder sb = new StringBuilder("checkPossibleSupportSameLayer: ");
        sb.append(m != null ? Integer.valueOf(m.versionCode) : "本地包不存在");
        e.c("MTWebViewManager", sb.toString());
        return (m == null || (x = h.x()) == null || x.contains(String.valueOf(m.versionCode))) ? false : true;
    }

    public static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a73499f570eca7acf7b6d79c62443c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a73499f570eca7acf7b6d79c62443c1")).booleanValue();
        }
        boolean f2 = f();
        e.c("MTWebViewManager", "checkPossibleSupportSameLayerAndDownloadMTWebViewInMMP: " + f2);
        a(3, (a<Boolean>) null);
        return f2;
    }

    private static PackageInfo l() throws FileNotFoundException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bcb3b86d69703a798165e777274e63b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bcb3b86d69703a798165e777274e63b");
        }
        PackageInfo a2 = h.a();
        StringBuilder sb = new StringBuilder("getLocalPackageInfoCanUsed, 本地包: ");
        sb.append(a2 != null ? Integer.valueOf(a2.versionCode) : "不存在");
        e.c("MTWebViewManager", sb.toString());
        if (a2 != null && !g.b(a2.versionCode).exists()) {
            e.c("MTWebViewManager", "getLocalPackageInfoCanUsed, apk not exist, throw exception");
            throw new FileNotFoundException("apk not exist");
        } else if (a2 == null || !h.b(a2)) {
            return a2;
        } else {
            e.c("MTWebViewManager", "getLocalPackageInfoCanUsed, 本地包在skip_versions列表中, 跳过");
            return null;
        }
    }

    private static synchronized PackageInfo m() {
        PackageInfo packageInfo;
        synchronized (l.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dee4cfea7843ae80d72666f90b933107", RobustBitConfig.DEFAULT_VALUE)) {
                return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dee4cfea7843ae80d72666f90b933107");
            }
            try {
                packageInfo = l();
            } catch (FileNotFoundException unused) {
                h.b();
                packageInfo = null;
            }
            return packageInfo;
        }
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8b96893bcbeba78c1fa0969ec8ee2da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8b96893bcbeba78c1fa0969ec8ee2da")).booleanValue() : (h.r() || m() == null) ? false : true;
    }
}
