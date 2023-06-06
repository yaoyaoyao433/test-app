package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.meituan.passport.UserCenter;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsLogReport;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
@SuppressLint({"NewApi"})
/* loaded from: classes6.dex */
public class FileUtil {
    public static String a = null;
    public static final a b = new a() { // from class: com.tencent.smtt.utils.FileUtil.2
        @Override // com.tencent.smtt.utils.FileUtil.a
        public final boolean a(File file, File file2) {
            return file.length() == file2.length() && file.lastModified() == file2.lastModified();
        }
    };
    private static final int c = 4;
    private static RandomAccessFile d;

    /* loaded from: classes6.dex */
    public interface a {
        boolean a(File file, File file2);
    }

    /* loaded from: classes6.dex */
    public interface b {
        boolean a(InputStream inputStream, ZipEntry zipEntry, String str) throws Exception;
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException, OutOfMemoryError {
        if (inputStream == null) {
            return -1L;
        }
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static File a(Context context, String str) {
        File file = new File(context.getFilesDir(), "tbs");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.canWrite()) {
            TbsLog.e("FileHelper", "getPermanentTbsFile -- no permission!");
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                TbsLog.e("FileHelper", "getPermanentTbsFile -- exception: " + e);
                return null;
            }
        }
        return file2;
    }

    public static File a(Context context, boolean z, String str) {
        String d2 = z ? d(context) : c(context);
        if (d2 == null) {
            return null;
        }
        File file = new File(d2);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.canWrite()) {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return file2;
        }
        return null;
    }

    public static String a(Context context, int i) {
        return a(context, context.getApplicationInfo().packageName, i, true);
    }

    public static String a(Context context, String str, int i, boolean z) {
        if (context == null) {
            return "";
        }
        String str2 = "";
        try {
            str2 = Environment.getExternalStorageDirectory() + File.separator;
        } catch (Exception e) {
            TbsLog.i(e);
        }
        switch (i) {
            case 1:
                if (str2.equals("")) {
                    return str2;
                }
                return str2 + UserCenter.OAUTH_TYPE_QQ + File.separator + "tbs" + File.separator + str;
            case 2:
                if (str2.equals("")) {
                    return str2;
                }
                return str2 + "tbs" + File.separator + "backup" + File.separator + str;
            case 3:
                if (str2.equals("")) {
                    return str2;
                }
                return str2 + UserCenter.OAUTH_TYPE_QQ + File.separator + "tbs" + File.separator + "backup" + File.separator + str;
            case 4:
                if (str2.equals("")) {
                    return b(context, "stable");
                }
                String str3 = str2 + UserCenter.OAUTH_TYPE_QQ + File.separator + "tbs" + File.separator + "stable" + File.separator + str;
                if (z) {
                    File file = new File(str3);
                    if (file.exists() && file.canWrite()) {
                        return str3;
                    }
                    if (file.exists()) {
                        return b(context, "stable");
                    }
                    try {
                        file.mkdirs();
                    } catch (SecurityException e2) {
                        TbsLog.i(e2);
                    }
                    return !file.canWrite() ? b(context, "stable") : str3;
                }
                return str3;
            case 5:
                if (str2.equals("")) {
                    return str2;
                }
                return str2 + UserCenter.OAUTH_TYPE_QQ + File.separator + "tbs" + File.separator + str;
            case 6:
                if (a != null) {
                    return a;
                }
                String b2 = b(context, "tbslog");
                a = b2;
                return b2;
            case 7:
                if (str2.equals("")) {
                    return str2;
                }
                return str2 + UserCenter.OAUTH_TYPE_QQ + File.separator + "tbs" + File.separator + "backup" + File.separator + "core";
            case 8:
                return b(context, "env");
            default:
                return "";
        }
    }

    public static FileLock a(Context context, FileOutputStream fileOutputStream) {
        FileLock tryLock;
        if (fileOutputStream == null) {
            return null;
        }
        try {
            tryLock = fileOutputStream.getChannel().tryLock();
        } catch (OverlappingFileLockException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (tryLock.isValid()) {
            return tryLock;
        }
        return null;
    }

    public static synchronized void a(Context context, FileLock fileLock) {
        synchronized (FileUtil.class) {
            TbsLog.i("FileHelper", "releaseTbsCoreRenameFileLock -- lock: " + fileLock);
            FileChannel channel = fileLock.channel();
            if (channel != null && channel.isOpen()) {
                try {
                    fileLock.release();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void a(File file, boolean z) {
        a(file, z, false);
    }

    public static void a(File file, boolean z, String str) {
        try {
            if (file.getAbsolutePath().contains("stable")) {
                r.a("delete_file", "path_" + file.getAbsolutePath() + "_stack_" + Log.getStackTraceString(new Throwable()));
            }
        } catch (Throwable th) {
            TbsLog.i("FileUtils", "stack is " + Log.getStackTraceString(th));
        }
        TbsLog.i("FileUtils", "delete file,ignore=" + z + "except" + str + file + Log.getStackTraceString(new Throwable()));
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (!file2.getName().equals(str)) {
                a(file2, z);
            }
        }
        if (z) {
            return;
        }
        file.delete();
    }

    public static void a(File file, boolean z, boolean z2) {
        try {
            if (file.getAbsolutePath().contains("stable")) {
                r.a("delete_file", "path_" + file.getAbsolutePath() + "_stack_" + Log.getStackTraceString(new Throwable()));
            }
        } catch (Throwable unused) {
            TbsLog.i("FileUtils", "stack is " + Log.getStackTraceString(new Throwable()));
        }
        TbsLog.i("FileUtils", "delete file,ignore=" + z + "isSoftLink=" + z2);
        if (file == null) {
            return;
        }
        if (z2 || file.exists()) {
            if ((z2 && !file.isDirectory()) || file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                a(file2, z, z2);
            }
            if (z) {
                return;
            }
            file.delete();
        }
    }

    public static void a(FileLock fileLock, FileOutputStream fileOutputStream) {
        if (fileLock != null) {
            try {
                FileChannel channel = fileLock.channel();
                if (channel != null && channel.isOpen()) {
                    fileLock.release();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return context != null && com.sankuai.meituan.takeoutnew.util.aop.f.a(context.getApplicationContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        b(file);
        return file.mkdirs();
    }

    public static boolean a(File file, File file2) throws Exception {
        return a(file.getPath(), file2.getPath());
    }

    public static boolean a(File file, File file2, FileFilter fileFilter) throws Exception {
        return a(file, file2, fileFilter, b);
    }

    public static boolean a(File file, File file2, FileFilter fileFilter, a aVar) throws Exception {
        if (file == null || file2 == null) {
            return false;
        }
        TbsLog.e("FileHelper", "copyFiles src is " + file.getAbsolutePath() + " dst is " + file2.getAbsolutePath());
        if (file.exists()) {
            if (file.isFile()) {
                return b(file, file2, fileFilter, aVar);
            }
            File[] listFiles = file.listFiles(fileFilter);
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file3 : listFiles) {
                if (!a(file3, new File(file2, file3.getName()), fileFilter)) {
                    z = false;
                }
            }
            return z;
        }
        return false;
    }

    private static boolean a(String str, long j, long j2, long j3) throws Exception {
        FileInputStream fileInputStream;
        File file = new File(str);
        if (file.length() != j) {
            TbsLog.e("FileHelper", "file size doesn't match: " + file.length() + " vs " + j);
            return true;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                CRC32 crc32 = new CRC32();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    crc32.update(bArr, 0, read);
                }
                long value = crc32.getValue();
                TbsLog.i("FileHelper", file.getName() + ": crc = " + value + ", zipCrc = " + j3);
                if (value != j3) {
                    fileInputStream.close();
                    return true;
                }
                fileInputStream.close();
                return false;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static boolean a(String str, String str2) throws Exception {
        return a(str, str2, Build.CPU_ABI, Build.VERSION.SDK_INT >= 8 ? Build.CPU_ABI2 : null, PropertyUtils.getQuickly("ro.product.cpu.upgradeabi", "armeabi"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r6.regionMatches(com.tencent.smtt.utils.FileUtil.c, r14, 0, r14.length()) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        if (r6.charAt(com.tencent.smtt.utils.FileUtil.c + r14.length()) != '/') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r3 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r4 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x000e, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x000e, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x000e, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x000e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.tencent.smtt.utils.FileUtil.b r15) throws java.lang.Exception {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> Ld0
            r1.<init>(r11)     // Catch: java.lang.Throwable -> Ld0
            java.util.Enumeration r11 = r1.entries()     // Catch: java.lang.Throwable -> Lce
            r0 = 1
            r2 = 0
            r3 = 0
            r4 = 0
        Le:
            boolean r5 = r11.hasMoreElements()     // Catch: java.lang.Throwable -> Lce
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r11.nextElement()     // Catch: java.lang.Throwable -> Lce
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> Lce
            if (r6 == 0) goto Le
            java.lang.String r7 = "../"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lce
            if (r7 != 0) goto Le
            java.lang.String r7 = "lib/"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> Lce
            if (r7 != 0) goto L38
            java.lang.String r7 = "assets/"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> Lce
            if (r7 == 0) goto Le
        L38:
            r7 = 47
            int r8 = r6.lastIndexOf(r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r8 = r6.substring(r8)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r9 = ".so"
            boolean r9 = r8.endsWith(r9)     // Catch: java.lang.Throwable -> Lce
            if (r9 == 0) goto La5
            int r9 = com.tencent.smtt.utils.FileUtil.c     // Catch: java.lang.Throwable -> Lce
            int r10 = r12.length()     // Catch: java.lang.Throwable -> Lce
            boolean r9 = r6.regionMatches(r9, r12, r2, r10)     // Catch: java.lang.Throwable -> Lce
            if (r9 == 0) goto L65
            int r9 = com.tencent.smtt.utils.FileUtil.c     // Catch: java.lang.Throwable -> Lce
            int r10 = r12.length()     // Catch: java.lang.Throwable -> Lce
            int r9 = r9 + r10
            char r9 = r6.charAt(r9)     // Catch: java.lang.Throwable -> Lce
            if (r9 != r7) goto L65
            r3 = 1
            goto La5
        L65:
            if (r13 == 0) goto L86
            int r9 = com.tencent.smtt.utils.FileUtil.c     // Catch: java.lang.Throwable -> Lce
            int r10 = r13.length()     // Catch: java.lang.Throwable -> Lce
            boolean r9 = r6.regionMatches(r9, r13, r2, r10)     // Catch: java.lang.Throwable -> Lce
            if (r9 == 0) goto L86
            int r9 = com.tencent.smtt.utils.FileUtil.c     // Catch: java.lang.Throwable -> Lce
            int r10 = r13.length()     // Catch: java.lang.Throwable -> Lce
            int r9 = r9 + r10
            char r9 = r6.charAt(r9)     // Catch: java.lang.Throwable -> Lce
            if (r9 != r7) goto L86
            if (r3 == 0) goto L84
            r4 = 1
            goto Le
        L84:
            r4 = 1
            goto La5
        L86:
            if (r14 == 0) goto Le
            int r9 = com.tencent.smtt.utils.FileUtil.c     // Catch: java.lang.Throwable -> Lce
            int r10 = r14.length()     // Catch: java.lang.Throwable -> Lce
            boolean r9 = r6.regionMatches(r9, r14, r2, r10)     // Catch: java.lang.Throwable -> Lce
            if (r9 == 0) goto Le
            int r9 = com.tencent.smtt.utils.FileUtil.c     // Catch: java.lang.Throwable -> Lce
            int r10 = r14.length()     // Catch: java.lang.Throwable -> Lce
            int r9 = r9 + r10
            char r6 = r6.charAt(r9)     // Catch: java.lang.Throwable -> Lce
            if (r6 != r7) goto Le
            if (r3 != 0) goto Le
            if (r4 != 0) goto Le
        La5:
            java.io.InputStream r6 = r1.getInputStream(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = r8.substring(r0)     // Catch: java.lang.Throwable -> Lc3
            boolean r5 = r15.a(r6, r5, r7)     // Catch: java.lang.Throwable -> Lc3
            if (r5 != 0) goto Lbc
            if (r6 == 0) goto Lb8
            r6.close()     // Catch: java.lang.Throwable -> Lce
        Lb8:
            r1.close()
            return r2
        Lbc:
            if (r6 == 0) goto Le
            r6.close()     // Catch: java.lang.Throwable -> Lce
            goto Le
        Lc3:
            r11 = move-exception
            if (r6 == 0) goto Lc9
            r6.close()     // Catch: java.lang.Throwable -> Lce
        Lc9:
            throw r11     // Catch: java.lang.Throwable -> Lce
        Lca:
            r1.close()
            return r0
        Lce:
            r11 = move-exception
            goto Ld2
        Ld0:
            r11 = move-exception
            r1 = r0
        Ld2:
            if (r1 == 0) goto Ld7
            r1.close()
        Ld7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.smtt.utils.FileUtil$b):boolean");
    }

    private static boolean a(String str, final String str2, String str3, String str4, String str5) throws Exception {
        return a(str, str3, str4, str5, new b() { // from class: com.tencent.smtt.utils.FileUtil.1
            @Override // com.tencent.smtt.utils.FileUtil.b
            public final boolean a(InputStream inputStream, ZipEntry zipEntry, String str6) throws Exception {
                try {
                    return FileUtil.b(inputStream, zipEntry, str2, str6);
                } catch (Exception e) {
                    throw new Exception("copyFileIfChanged Exception", e);
                }
            }
        });
    }

    public static FileOutputStream b(Context context, boolean z, String str) {
        File a2 = a(context, z, str);
        if (a2 != null) {
            try {
                return new FileOutputStream(a2);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static String b(Context context, String str) {
        if (context == null) {
            return "";
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        try {
            try {
                return context.getExternalFilesDir(str).getAbsolutePath();
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        } catch (Throwable unused) {
            return Environment.getExternalStorageDirectory() + File.separator + "Android" + File.separator + "data" + File.separator + context.getApplicationInfo().packageName + File.separator + "files" + File.separator + str;
        }
    }

    public static void b(File file) {
        a(file, false);
    }

    public static boolean b(Context context) {
        long a2 = r.a();
        boolean z = a2 >= TbsDownloadConfig.getInstance(context).getDownloadMinFreeSpace();
        if (!z) {
            TbsLog.e(TbsDownloader.LOGTAG, "[TbsApkDwonloader.hasEnoughFreeSpace] freeSpace too small,  freeSpace = " + a2);
        }
        return z;
    }

    public static boolean b(File file, File file2) throws Exception {
        return a(file, file2, (FileFilter) null);
    }

    private static boolean b(File file, File file2, FileFilter fileFilter, a aVar) throws Exception {
        FileChannel fileChannel;
        if (file == null || file2 == null) {
            return false;
        }
        if (fileFilter != null && !fileFilter.accept(file)) {
            return false;
        }
        FileChannel fileChannel2 = null;
        try {
            if (file.exists() && file.isFile()) {
                if (file2.exists()) {
                    if (aVar != null && aVar.a(file, file2)) {
                        return true;
                    }
                    b(file2);
                }
                File parentFile = file2.getParentFile();
                if (parentFile.isFile()) {
                    b(parentFile);
                }
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    return false;
                }
                FileChannel channel = new FileInputStream(file).getChannel();
                try {
                    fileChannel = new FileOutputStream(file2).getChannel();
                    try {
                        long size = channel.size();
                        if (fileChannel.transferFrom(channel, 0L, size) == size) {
                            if (channel != null) {
                                channel.close();
                            }
                            if (fileChannel != null) {
                                fileChannel.close();
                            }
                            return true;
                        }
                        b(file2);
                        if (channel != null) {
                            channel.close();
                        }
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileChannel2 = channel;
                        th = th;
                        if (fileChannel2 != null) {
                            fileChannel2.close();
                        }
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = null;
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public static boolean b(InputStream inputStream, ZipEntry zipEntry, String str, String str2) throws Exception {
        FileOutputStream fileOutputStream;
        a(new File(str));
        String str3 = str + File.separator + str2;
        File file = new File(str3);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            if (a(str3, zipEntry.getSize(), zipEntry.getTime(), zipEntry.getCrc())) {
                TbsLog.e("FileHelper", "file is different: " + str3);
                return false;
            } else if (file.setLastModified(zipEntry.getTime())) {
                return true;
            } else {
                TbsLog.e("FileHelper", "Couldn't set time for dst file " + file);
                return true;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            b(file);
            throw new IOException("Couldn't write dst file " + file, e);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    public static String c(Context context) {
        if (!context.getApplicationInfo().packageName.contains("com.tencent.mobileqq") && !context.getApplicationInfo().packageName.contains("com.tencent.mm")) {
            return Environment.getExternalStorageDirectory() + File.separator + "tbs" + File.separator + "file_locks";
        }
        return Environment.getExternalStorageDirectory() + File.separator + "Android" + File.separator + "data" + File.separator + context.getApplicationInfo().packageName + File.separator + "file_locks";
    }

    public static boolean c(File file) {
        return file != null && file.exists() && file.isFile() && file.length() > 0;
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException, OutOfMemoryError {
        long a2 = a(inputStream, outputStream);
        if (a2 > 2147483647L) {
            return -1;
        }
        return (int) a2;
    }

    public static FileOutputStream d(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("File '" + file + "' could not be created");
            }
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
        }
        return new FileOutputStream(file);
    }

    static String d(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_private");
        if (file.isDirectory() || file.mkdir()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static FileLock e(Context context) {
        FileLock fileLock;
        String str;
        StringBuilder sb;
        TbsLog.i("FileHelper", "getTbsCoreLoadFileLock #1");
        File a2 = a(context, "tbs_rename_lock");
        TbsLog.i("FileHelper", "getTbsCoreLoadFileLock #4 " + a2);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(a2.getAbsolutePath(), com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
            d = randomAccessFile;
            fileLock = randomAccessFile.getChannel().tryLock(0L, Long.MAX_VALUE, true);
        } catch (Throwable th) {
            TbsLog.e("FileHelper", "getTbsCoreLoadFileLock -- exception: " + th);
            fileLock = null;
        }
        if (fileLock == null) {
            fileLock = g(context);
        }
        if (fileLock == null) {
            str = "FileHelper";
            sb = new StringBuilder("getTbsCoreLoadFileLock -- failed: ");
        } else {
            str = "FileHelper";
            sb = new StringBuilder("getTbsCoreLoadFileLock -- success: ");
        }
        sb.append("tbs_rename_lock");
        TbsLog.i(str, sb.toString());
        return fileLock;
    }

    public static FileLock f(Context context) {
        FileLock fileLock;
        String str;
        StringBuilder sb;
        File a2 = a(context, "tbs_rename_lock");
        TbsLog.i("FileHelper", "getTbsCoreRenameFileLock #1 " + a2);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(a2.getAbsolutePath(), "rw");
            d = randomAccessFile;
            fileLock = randomAccessFile.getChannel().tryLock(0L, Long.MAX_VALUE, false);
        } catch (Throwable unused) {
            TbsLog.e("FileHelper", "getTbsCoreRenameFileLock -- excpetion: tbs_rename_lock");
            fileLock = null;
        }
        if (fileLock == null) {
            str = "FileHelper";
            sb = new StringBuilder("getTbsCoreRenameFileLock -- failed: ");
        } else {
            str = "FileHelper";
            sb = new StringBuilder("getTbsCoreRenameFileLock -- success: ");
        }
        sb.append("tbs_rename_lock");
        TbsLog.i(str, sb.toString());
        return fileLock;
    }

    private static FileLock g(Context context) {
        FileLock fileLock = null;
        try {
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
            tbsLogInfo.setErrorCode(803);
            File a2 = a(context, "tbs_rename_lock");
            if (TbsDownloadConfig.getInstance(context).getTbsCoreLoadRenameFileLockWaitEnable()) {
                FileLock fileLock2 = null;
                int i = 0;
                while (i < 20 && fileLock2 == null) {
                    try {
                        try {
                            Thread.sleep(100L);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(a2.getAbsolutePath(), com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
                        d = randomAccessFile;
                        fileLock2 = randomAccessFile.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                    } catch (Throwable unused) {
                    }
                    i++;
                }
                try {
                    if (fileLock2 != null) {
                        tbsLogInfo.setErrorCode(802);
                    } else {
                        tbsLogInfo.setErrorCode(801);
                    }
                    TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_SDK_REPORT_INFO, tbsLogInfo);
                    StringBuilder sb = new StringBuilder("getTbsCoreLoadFileLock,retry num=");
                    sb.append(i);
                    sb.append("success=");
                    sb.append(fileLock2 == null);
                    TbsLog.i("FileHelper", sb.toString());
                    return fileLock2;
                } catch (Exception e2) {
                    e = e2;
                    fileLock = fileLock2;
                    e.printStackTrace();
                    return fileLock;
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }
}
