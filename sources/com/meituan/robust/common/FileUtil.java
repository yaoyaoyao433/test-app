package com.meituan.robust.common;

import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class FileUtil {
    private static final FileCopyProcessor DEFAULT_FILE_COPY_PROCESSOR = new DefaultFileCopyProcessor();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface CacheProcessor {
        String keyProcess(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface FileCopyProcessor {
        boolean copyFileToFileProcess(String str, String str2, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum FileCopyType {
        PATH_TO_PATH,
        FILE_TO_PATH,
        FILE_TO_FILE
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface NoCacheFileFinder {
        List<String> findNoCacheFileList(Properties properties);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface NoCacheFileProcessor {
        boolean process(List<String> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ZipProcessor {
        InputStream zipEntryProcess(String str, InputStream inputStream);
    }

    private FileUtil() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class DefaultFileCopyProcessor implements FileCopyProcessor {
        DefaultFileCopyProcessor() {
        }

        @Override // com.meituan.robust.common.FileUtil.FileCopyProcessor
        public boolean copyFileToFileProcess(String str, String str2, boolean z) {
            try {
                if (z) {
                    String absolutePath = new File(str).getAbsolutePath();
                    String absolutePath2 = new File(str2).getAbsolutePath();
                    if (absolutePath.equals(absolutePath2)) {
                        absolutePath2 = absolutePath2 + "_copy";
                    }
                    FileUtil.createFile(absolutePath2);
                    FileInputStream fileInputStream = new FileInputStream(absolutePath);
                    FileOutputStream fileOutputStream = new FileOutputStream(absolutePath2);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        } else {
                            fileInputStream.close();
                            fileOutputStream.close();
                            return true;
                        }
                    }
                } else {
                    FileUtil.createDirectory(str2);
                    return true;
                }
            } catch (Exception e) {
                throw new FileCopyException(e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class FileCopyException extends RuntimeException {
        public FileCopyException(String str) {
            super(str);
        }

        public FileCopyException(Throwable th) {
            super(th);
        }

        public FileCopyException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static boolean isExist(String str) {
        return new File(str).exists();
    }

    public static boolean isHasFile(String str, String str2) {
        File file = new File(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add(file);
        while (!concurrentLinkedQueue.isEmpty()) {
            File file2 = (File) concurrentLinkedQueue.poll();
            if (file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    concurrentLinkedQueue.addAll(Arrays.asList(listFiles));
                }
            } else if (file2.isFile() && file2.getName().toLowerCase().endsWith(str2.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void createDirectory(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.setReadable(true, false);
        file.setWritable(true, true);
        file.mkdirs();
    }

    public static boolean createFile(String str) {
        File file = new File(str);
        createDirectory(file.getParent());
        try {
            file.setReadable(true, false);
            file.setWritable(true, true);
            return file.createNewFile();
        } catch (Exception e) {
            throw new FileUtilException(e);
        }
    }

    public static void deleteAllFile(String str) {
        File[] listFiles;
        if (str == null || "".equals(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add(file);
        while (!concurrentLinkedQueue.isEmpty()) {
            File file2 = (File) concurrentLinkedQueue.poll();
            if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                concurrentLinkedQueue.addAll(Arrays.asList(listFiles));
            }
            arrayList.add(file2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((File) arrayList.get(size)).delete();
        }
    }

    public static void copyFile(File file, File file2) throws IOException {
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
                fileOutputStream.flush();
            }
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public static void copyFile(String str, String str2) {
        copyFile(str, str2, FileCopyType.PATH_TO_PATH, DEFAULT_FILE_COPY_PROCESSOR);
    }

    public static void copyFile(String str, String str2, FileCopyType fileCopyType) {
        copyFile(str, str2, fileCopyType, DEFAULT_FILE_COPY_PROCESSOR);
    }

    public static void copyFile(String str, String str2, FileCopyType fileCopyType, FileCopyProcessor fileCopyProcessor) {
        switch (fileCopyType) {
            case FILE_TO_PATH:
                copyFileToPath(str, str2, fileCopyProcessor);
                return;
            case FILE_TO_FILE:
                copyFileToFile(str, str2, fileCopyProcessor);
                return;
            default:
                copyPathToPath(str, str2, fileCopyProcessor);
                return;
        }
    }

    public static void copyPathToPath(String str, String str2, FileCopyProcessor fileCopyProcessor) {
        File[] listFiles;
        File file = new File(str);
        File file2 = new File(str2);
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (absolutePath.equals(absolutePath2)) {
            absolutePath2 = absolutePath2 + "_copy";
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add(file);
        while (!concurrentLinkedQueue.isEmpty()) {
            File file3 = (File) concurrentLinkedQueue.poll();
            String absolutePath3 = file3.getAbsolutePath();
            String str3 = absolutePath2 + absolutePath3.substring(absolutePath.length());
            if (file3.isDirectory()) {
                if ((fileCopyProcessor != null ? fileCopyProcessor.copyFileToFileProcess(absolutePath3, str3, false) : true) && (listFiles = file3.listFiles()) != null) {
                    concurrentLinkedQueue.addAll(Arrays.asList(listFiles));
                }
            } else if (file3.isFile() && fileCopyProcessor != null) {
                fileCopyProcessor.copyFileToFileProcess(absolutePath3, str3, true);
            }
        }
    }

    private static void copyFileToPath(String str, String str2, FileCopyProcessor fileCopyProcessor) {
        File file = new File(str);
        File file2 = new File(str2);
        if (file.exists() && file.isFile()) {
            createDirectory(str2);
            String absolutePath = file.getAbsolutePath();
            copyFileToFile(absolutePath, file2.getAbsolutePath() + File.separator + file.getName(), fileCopyProcessor);
        }
    }

    public static List<String> unzip(String str, String str2) {
        return unzip(str, str2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r4 = r2.getInputStream(r0);
        r3 = r10 + "/" + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r0.isDirectory() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        createDirectory(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        createFile(r3);
        r0 = new java.io.FileOutputStream(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        r7 = new byte[1024];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        r8 = r4.read(r7, 0, 1024);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r8 == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
        r0.write(r7, 0, r8);
        r0.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
        r0.close();
        r1.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r4 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
        throw r10;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> unzip(java.lang.String r10, java.lang.String r11, java.util.List<java.lang.String> r12) {
        /*
            if (r11 == 0) goto Lc1
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Laf
            r1.<init>()     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Laf
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Laf
            r2.<init>(r10)     // Catch: java.lang.Throwable -> Lac java.lang.Exception -> Laf
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r10.<init>(r11)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.String r10 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.util.Enumeration r11 = r2.entries()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
        L1a:
            boolean r0 = r11.hasMoreElements()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r11.nextElement()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.String r3 = r0.getName()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r3 != 0) goto L2d
            goto L1a
        L2d:
            if (r3 == 0) goto L37
            java.lang.String r4 = "../"
            boolean r4 = r3.contains(r4)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r4 != 0) goto L1a
        L37:
            r4 = 1
            r5 = 0
            if (r12 == 0) goto L4a
            boolean r6 = r12.isEmpty()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r6 == 0) goto L42
            goto L4a
        L42:
            boolean r6 = r12.contains(r3)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r6 == 0) goto L49
            goto L4a
        L49:
            r4 = 0
        L4a:
            if (r4 == 0) goto L1a
            java.io.InputStream r4 = r2.getInputStream(r0)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r6.<init>()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r6.append(r10)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r6.append(r3)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            boolean r0 = r0.isDirectory()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            if (r0 == 0) goto L6e
            createDirectory(r3)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            goto L1a
        L6e:
            createFile(r3)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r6]     // Catch: java.lang.Throwable -> L94
        L7a:
            int r8 = r4.read(r7, r5, r6)     // Catch: java.lang.Throwable -> L94
            r9 = -1
            if (r8 == r9) goto L88
            r0.write(r7, r5, r8)     // Catch: java.lang.Throwable -> L94
            r0.flush()     // Catch: java.lang.Throwable -> L94
            goto L7a
        L88:
            if (r4 == 0) goto L8d
            r4.close()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
        L8d:
            r0.close()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            r1.add(r3)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            goto L1a
        L94:
            r10 = move-exception
            if (r4 == 0) goto L9a
            r4.close()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
        L9a:
            r0.close()     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
            throw r10     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> La9
        L9e:
            r2.close()     // Catch: java.lang.Exception -> La2
            goto La6
        La2:
            r10 = move-exception
            r10.printStackTrace()
        La6:
            return r1
        La7:
            r10 = move-exception
            goto Lb6
        La9:
            r10 = move-exception
            r0 = r2
            goto Lb0
        Lac:
            r10 = move-exception
            r2 = r0
            goto Lb6
        Laf:
            r10 = move-exception
        Lb0:
            com.meituan.robust.common.FileUtil$FileUtilException r11 = new com.meituan.robust.common.FileUtil$FileUtilException     // Catch: java.lang.Throwable -> Lac
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lac
            throw r11     // Catch: java.lang.Throwable -> Lac
        Lb6:
            if (r2 == 0) goto Lc0
            r2.close()     // Catch: java.lang.Exception -> Lbc
            goto Lc0
        Lbc:
            r11 = move-exception
            r11.printStackTrace()
        Lc0:
            throw r10
        Lc1:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "out put directory can not be null."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.robust.common.FileUtil.unzip(java.lang.String, java.lang.String, java.util.List):java.util.List");
    }

    public static void zip(String str, String str2) {
        zip(str, str2, "");
    }

    public static void zip(String str, String str2, String str3) {
        List<String> findMatchFile = findMatchFile(str2, str3);
        if (findMatchFile == null || findMatchFile.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = new File(str2).getAbsolutePath().length() + 1;
        for (String str4 : findMatchFile) {
            arrayList.add(new ZipEntryPath(str4, new ZipEntry(str4.substring(length, str4.length()).replace(CommonConstant.Symbol.SLASH_RIGHT, "/")), true));
        }
        zip(str, arrayList);
    }

    public static void zip(String str, List<ZipEntryPath> list) {
        zip(str, (String) null, list);
    }

    public static void zip(String str, String str2, List<ZipEntryPath> list) {
        zip(str, str2, list, null);
    }

    public static void zip(String str, String str2, ZipProcessor zipProcessor) {
        zip(str, str2, null, zipProcessor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: all -> 0x00a3, Exception -> 0x00a5, TryCatch #9 {Exception -> 0x00a5, all -> 0x00a3, blocks: (B:12:0x0048, B:13:0x004c, B:15:0x0052, B:19:0x0061, B:21:0x0069, B:23:0x006f, B:25:0x007e, B:28:0x008e, B:30:0x0094, B:31:0x0098), top: B:82:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0113 A[Catch: Exception -> 0x010f, TRY_LEAVE, TryCatch #1 {Exception -> 0x010f, blocks: (B:67:0x0105, B:71:0x0113), top: B:78:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zip(java.lang.String r7, java.lang.String r8, java.util.List<com.meituan.robust.common.FileUtil.ZipEntryPath> r9, com.meituan.robust.common.FileUtil.ZipProcessor r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.robust.common.FileUtil.zip(java.lang.String, java.lang.String, java.util.List, com.meituan.robust.common.FileUtil$ZipProcessor):void");
    }

    public static void mergeZip(String str, List<String> list) {
        ZipOutputStream zipOutputStream;
        createFile(str);
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
                if (list != null) {
                    try {
                        for (String str2 : list) {
                            if (isExist(str2)) {
                                ZipFile zipFile = new ZipFile(str2);
                                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                                while (entries.hasMoreElements()) {
                                    ZipEntry nextElement = entries.nextElement();
                                    String name = nextElement.getName();
                                    if (name != null && (name == null || !name.contains("../"))) {
                                        addZipEntry(zipOutputStream, nextElement, zipFile.getInputStream(nextElement));
                                    }
                                }
                                zipFile.close();
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        zipOutputStream2 = zipOutputStream;
                        throw new FileUtilException(e);
                    } catch (Throwable th) {
                        th = th;
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (Exception e2) {
                                throw new FileUtilException(e2);
                            }
                        }
                        throw th;
                    }
                }
                try {
                    zipOutputStream.close();
                } catch (Exception e3) {
                    throw new FileUtilException(e3);
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = zipOutputStream2;
        }
    }

    public static void addZipEntry(ZipOutputStream zipOutputStream, ZipEntry zipEntry, InputStream inputStream) throws Exception {
        try {
            zipOutputStream.putNextEntry(zipEntry);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
                zipOutputStream.flush();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            zipOutputStream.closeEntry();
        } catch (ZipException unused) {
            if (inputStream != null) {
                inputStream.close();
            }
            zipOutputStream.closeEntry();
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            zipOutputStream.closeEntry();
            throw th;
        }
    }

    public static byte[] readFile(String str) {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (FileNotFoundException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            copyStream(fileInputStream, byteArrayOutputStream);
            try {
                fileInputStream.close();
                try {
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                } catch (IOException e2) {
                    throw new FileUtilException(e2);
                }
            } catch (IOException e3) {
                throw new FileUtilException(e3);
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            fileInputStream2 = fileInputStream;
            throw new FileUtilException(e);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e5) {
                    throw new FileUtilException(e5);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e6) {
                throw new FileUtilException(e6);
            }
        }
    }

    public static void writeFile(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        createFile(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (FileNotFoundException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            copyStream(byteArrayInputStream, fileOutputStream);
            try {
                byteArrayInputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                    throw new FileUtilException(e2);
                }
            } catch (IOException e3) {
                throw new FileUtilException(e3);
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            throw new FileUtilException(e);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                byteArrayInputStream.close();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        throw new FileUtilException(e5);
                    }
                }
                throw th;
            } catch (IOException e6) {
                throw new FileUtilException(e6);
            }
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return;
        }
        try {
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = inputStream.read(bArr, 0, 1048576);
                if (read == -1) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                outputStream.flush();
            }
        } catch (Exception e) {
            throw new FileUtilException(e);
        }
    }

    public static void mergeFile(String str, List<String> list) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (list == null || str == null) {
            return;
        }
        FileInputStream fileInputStream2 = 0;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = fileInputStream2;
        }
        try {
            for (String str2 : list) {
                try {
                    try {
                        fileInputStream = new FileInputStream(str2);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    copyStream(fileInputStream, fileOutputStream);
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        throw new FileUtilException(e3);
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileInputStream2 = fileInputStream;
                    throw new FileUtilException(e);
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e5) {
                            throw new FileUtilException(e5);
                        }
                    }
                    throw th;
                }
            }
            try {
                fileOutputStream.close();
            } catch (IOException e6) {
                throw new FileUtilException(e6);
            }
        } catch (Exception e7) {
            e = e7;
            fileInputStream2 = fileOutputStream;
            throw new FileUtilException(e);
        } catch (Throwable th4) {
            th = th4;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e8) {
                    throw new FileUtilException(e8);
                }
            }
            throw th;
        }
    }

    public static List<String> findMatchFileDirectory(String str, String str2) {
        return findMatchFileOrMatchFileDirectory(str, str2, null, false, true);
    }

    public static List<String> findMatchFileDirectory(String str, String str2, boolean z) {
        return findMatchFileOrMatchFileDirectory(str, str2, null, false, z);
    }

    public static List<String> findMatchFileDirectory(String str, String str2, String str3) {
        return findMatchFileOrMatchFileDirectory(str, str2, str3, false, true);
    }

    public static List<String> findMatchFileDirectory(String str, String str2, String str3, boolean z) {
        return findMatchFileOrMatchFileDirectory(str, str2, str3, false, z);
    }

    public static List<String> findMatchFile(String str, String str2) {
        return findMatchFileOrMatchFileDirectory(str, str2, null, true, true);
    }

    public static List<String> findMatchFile(String str, String str2, boolean z) {
        return findMatchFileOrMatchFileDirectory(str, str2, null, true, z);
    }

    public static List<String> findMatchFile(String str, String str2, String str3) {
        return findMatchFileOrMatchFileDirectory(str, str2, str3, true, false);
    }

    public static List<String> findMatchFile(String str, String str2, String str3, boolean z) {
        return findMatchFileOrMatchFileDirectory(str, str2, str3, true, z);
    }

    private static List<String> findMatchFileOrMatchFileDirectory(String str, String str2, String str3, boolean z, boolean z2) {
        String nullToBlank = StringUtil.nullToBlank(str2);
        String nullToBlank2 = StringUtil.nullToBlank(str3);
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add(file);
        while (!concurrentLinkedQueue.isEmpty()) {
            File file2 = (File) concurrentLinkedQueue.poll();
            boolean z3 = false;
            if ((!file2.isHidden() || z2) ? true : true) {
                if (file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        concurrentLinkedQueue.addAll(Arrays.asList(listFiles));
                    }
                } else if (file2.isFile() && file2.getName().toLowerCase().endsWith(nullToBlank.toLowerCase())) {
                    if (z) {
                        arrayList.add(file2.getAbsolutePath() + nullToBlank2);
                    } else {
                        String str4 = file2.getParent() + nullToBlank2;
                        if (!arrayList.contains(str4)) {
                            arrayList.add(str4);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static Map<String, String> getZipEntryHashMap(String str) {
        ZipFile zipFile;
        HashMap hashMap = new HashMap();
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
                zipFile = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String name = nextElement.getName();
                if (name != null && (name == null || !name.contains("../"))) {
                    if (!nextElement.isDirectory()) {
                        hashMap.put(nextElement.getName(), nextElement.getCrc() + CommonConstant.Symbol.DOT + nextElement.getSize());
                    }
                }
            }
            try {
                zipFile.close();
                return hashMap;
            } catch (IOException e2) {
                throw new FileUtilException(e2);
            }
        } catch (Exception e3) {
            e = e3;
            throw new FileUtilException(e);
        } catch (Throwable th2) {
            th = th2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e4) {
                    throw new FileUtilException(e4);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void differZip(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.robust.common.FileUtil.differZip(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void generateSimpleFile(String str, String str2, Map<String, String> map) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            generateSimpleFile(fileInputStream, str2, map);
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                throw new FileUtilException(e2);
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            throw new FileUtilException(e);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e4) {
                    throw new FileUtilException(e4);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void generateSimpleFile(java.io.InputStream r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            java.lang.String r3 = "UTF-8"
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r6.<init>()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
        L16:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r2 == 0) goto L46
            java.util.Iterator r3 = r8.iterator()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
        L20:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r2 = r2.replace(r5, r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            goto L20
        L3d:
            r6.append(r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r2 = "\r\n"
            r6.append(r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            goto L16
        L46:
            createFile(r7)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            java.lang.String r7 = "UTF-8"
            byte[] r6 = r6.getBytes(r7)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r8.write(r6)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r8.flush()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r1.close()     // Catch: java.io.IOException -> L6c
            r8.close()     // Catch: java.lang.Exception -> L65
            return
        L65:
            r6 = move-exception
            com.meituan.robust.common.FileUtil$FileUtilException r7 = new com.meituan.robust.common.FileUtil$FileUtilException
            r7.<init>(r6)
            throw r7
        L6c:
            r6 = move-exception
            com.meituan.robust.common.FileUtil$FileUtilException r7 = new com.meituan.robust.common.FileUtil$FileUtilException
            r7.<init>(r6)
            throw r7
        L73:
            r6 = move-exception
            goto L8a
        L75:
            r6 = move-exception
            goto L7b
        L77:
            r6 = move-exception
            goto L8b
        L79:
            r6 = move-exception
            r8 = r0
        L7b:
            r0 = r1
            goto L82
        L7d:
            r6 = move-exception
            r1 = r0
            goto L8b
        L80:
            r6 = move-exception
            r8 = r0
        L82:
            com.meituan.robust.common.FileUtil$FileUtilException r7 = new com.meituan.robust.common.FileUtil$FileUtilException     // Catch: java.lang.Throwable -> L88
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L88
            throw r7     // Catch: java.lang.Throwable -> L88
        L88:
            r6 = move-exception
            r1 = r0
        L8a:
            r0 = r8
        L8b:
            if (r1 == 0) goto L98
            r1.close()     // Catch: java.io.IOException -> L91
            goto L98
        L91:
            r6 = move-exception
            com.meituan.robust.common.FileUtil$FileUtilException r7 = new com.meituan.robust.common.FileUtil$FileUtilException
            r7.<init>(r6)
            throw r7
        L98:
            if (r0 == 0) goto La5
            r0.close()     // Catch: java.lang.Exception -> L9e
            goto La5
        L9e:
            r6 = move-exception
            com.meituan.robust.common.FileUtil$FileUtilException r7 = new com.meituan.robust.common.FileUtil$FileUtilException
            r7.<init>(r6)
            throw r7
        La5:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.robust.common.FileUtil.generateSimpleFile(java.io.InputStream, java.lang.String, java.util.Map):void");
    }

    public static List<String> findFileListWithCache(List<String> list, Properties properties, String str, String str2, boolean z) {
        return findFileListWithCache(list, properties, str, str2, z, null);
    }

    public static List<String> findFileListWithCache(List<String> list, Properties properties, String str, String str2, boolean z, CacheProcessor cacheProcessor) {
        return findFileListWithCache(list, properties, str, str2, z, false, cacheProcessor);
    }

    public static List<String> findFileListWithCache(List<String> list, Properties properties, String str, String str2, boolean z, boolean z2, CacheProcessor cacheProcessor) {
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList();
        if (properties == null) {
            if (list != null && !list.isEmpty()) {
                for (String str5 : list) {
                    if (z) {
                        arrayList.addAll(findMatchFile(str5, str, z2));
                    } else {
                        arrayList.addAll(findMatchFileDirectory(str5, str, str2, z2));
                    }
                }
            }
        } else if (properties.isEmpty()) {
            ArrayList<String> arrayList2 = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (String str6 : list) {
                    arrayList2.addAll(findMatchFile(str6, str, z2));
                }
            }
            for (String str7 : arrayList2) {
                String keyProcess = cacheProcessor != null ? cacheProcessor.keyProcess(str7) : str7;
                try {
                    str4 = MD5.getHashString(new File(str7));
                } catch (IOException e) {
                    e.printStackTrace();
                    str4 = null;
                }
                properties.setProperty(keyProcess, str4);
            }
            if (z) {
                arrayList.addAll(arrayList2);
            } else if (list != null && !list.isEmpty()) {
                for (String str8 : list) {
                    arrayList.addAll(findMatchFileDirectory(str8, str, str2, z2));
                }
            }
        } else {
            ArrayList<String> arrayList3 = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (String str9 : list) {
                    arrayList3.addAll(findMatchFile(str9, str, z2));
                }
            }
            for (String str10 : arrayList3) {
                String keyProcess2 = cacheProcessor != null ? cacheProcessor.keyProcess(str10) : str10;
                try {
                    str3 = MD5.getHashString(new File(str10));
                } catch (IOException e2) {
                    e2.printStackTrace();
                    str3 = null;
                }
                if (properties.containsKey(keyProcess2)) {
                    if (!str3.equals(properties.getProperty(keyProcess2))) {
                        arrayList.add(str10);
                        properties.setProperty(keyProcess2, str3);
                    }
                } else {
                    arrayList.add(str10);
                    properties.setProperty(keyProcess2, str3);
                }
            }
        }
        return arrayList;
    }

    public static List<String> dealWithFileCache(String str, NoCacheFileFinder noCacheFileFinder, NoCacheFileProcessor noCacheFileProcessor) {
        Properties propertiesAutoCreate = getPropertiesAutoCreate(str);
        if (noCacheFileFinder == null) {
            throw new NullPointerException("noCacheFileFinder can not be null.");
        }
        List<String> findNoCacheFileList = noCacheFileFinder.findNoCacheFileList(propertiesAutoCreate);
        if (noCacheFileProcessor != null ? noCacheFileProcessor.process(findNoCacheFileList) : false) {
            saveProperties(propertiesAutoCreate, str);
        }
        return findNoCacheFileList;
    }

    public static Properties getPropertiesAutoCreate(String str) {
        if (!isExist(str)) {
            createFile(str);
        }
        return getProperties(str);
    }

    public static Properties getProperties(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        Properties properties = null;
        try {
            if (str != null) {
                try {
                    fileInputStream = new FileInputStream(str);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    properties = new Properties();
                    properties.load(fileInputStream);
                    try {
                        fileInputStream.close();
                    } catch (Exception e2) {
                        throw new FileUtilException(e2);
                    }
                } catch (Exception e3) {
                    e = e3;
                    throw new FileUtilException(e);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e4) {
                            throw new FileUtilException(e4);
                        }
                    }
                    throw th;
                }
            }
            return properties;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Properties getProperties(File file) {
        if (file != null) {
            return getProperties(file.getAbsolutePath());
        }
        return null;
    }

    public static void saveProperties(Properties properties, String str) {
        FileOutputStream fileOutputStream;
        if (properties == null || str == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            properties.store(fileOutputStream, (String) null);
            try {
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e2) {
                throw new FileUtilException(e2);
            }
        } catch (Exception e3) {
            e = e3;
            throw new FileUtilException(e);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (Exception e4) {
                    throw new FileUtilException(e4);
                }
            }
            throw th;
        }
    }

    private static void copyFileToFile(String str, String str2, FileCopyProcessor fileCopyProcessor) {
        if (fileCopyProcessor != null) {
            createFile(str2);
            fileCopyProcessor.copyFileToFileProcess(str, str2, true);
        }
    }

    public static void main(String[] strArr) {
        mergeZip("/D:/a/b.zip", Arrays.asList("/D:/a.zip", "/D:/b.zip"));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ZipEntryPath {
        private String fullFilename;
        private boolean replace;
        private ZipEntry zipEntry;

        public ZipEntryPath(String str, ZipEntry zipEntry) {
            this(str, zipEntry, false);
        }

        public ZipEntryPath(String str, ZipEntry zipEntry, boolean z) {
            this.fullFilename = null;
            this.zipEntry = null;
            this.replace = false;
            this.fullFilename = str;
            this.zipEntry = zipEntry;
            this.replace = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class FileUtilException extends RuntimeException {
        private static final long serialVersionUID = 3884649425767533205L;

        public FileUtilException(Throwable th) {
            super(th);
        }
    }
}
