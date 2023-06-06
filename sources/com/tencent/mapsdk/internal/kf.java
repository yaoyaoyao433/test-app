package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipError;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kf {
    private static final int a = 49152;

    public static File a(File file, String str) throws Exception {
        if (file == null || !file.exists()) {
            return null;
        }
        File file2 = new File(str, file.getName() + MRNBundleManager.MRN_BUNDLE_SUFFIX);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
        try {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        a(file3, zipOutputStream, file.getName());
                    }
                }
            } else {
                a(file, zipOutputStream, (String) null);
            }
            fileOutputStream.flush();
            zipOutputStream.finish();
            return file2;
        } finally {
            fileOutputStream.close();
            zipOutputStream.close();
        }
    }

    private static void a(File file, ZipOutputStream zipOutputStream, String str) throws IOException {
        String str2;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (!file2.isDirectory()) {
                        str2 = str;
                    } else if (TextUtils.isEmpty(str)) {
                        str2 = file2.getName();
                    } else {
                        str2 = str + File.separator + file2.getName();
                    }
                    a(file2, zipOutputStream, str2);
                }
                return;
            }
            return;
        }
        byte[] bArr = new byte[a];
        FileInputStream fileInputStream = new FileInputStream(file);
        zipOutputStream.setLevel(9);
        zipOutputStream.setMethod(8);
        zipOutputStream.putNextEntry(new ZipEntry(TextUtils.isEmpty(str) ? file.getName() : str + File.separator + file.getName()));
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            }
        }
    }

    public static void b(File file, String str) throws ZipException, IOException, ZipError {
        a(file, str, (FilenameFilter) null);
    }

    public static void a(File file, String str, FilenameFilter filenameFilter) throws ZipException, IOException, ZipError {
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file);
        byte[] bArr = new byte[a];
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (name == null || !name.contains("../")) {
                if (filenameFilter == null || filenameFilter.accept(file2, nextElement.getName())) {
                    if (nextElement.isDirectory()) {
                        new File(str + File.separator + nextElement.getName()).mkdir();
                    } else {
                        InputStream inputStream = zipFile.getInputStream(nextElement);
                        File file3 = new File(str + File.separator + nextElement.getName());
                        if (!file3.exists()) {
                            File parentFile = file3.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            file3.createNewFile();
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        inputStream.close();
                        fileOutputStream.close();
                    }
                }
            }
        }
        zipFile.close();
    }

    private static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        try {
            deflaterOutputStream.write(bArr, 0, bArr.length);
            deflaterOutputStream.finish();
            deflaterOutputStream.flush();
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] b(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static byte[] a(byte[] bArr, int i) {
        int read;
        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr, 0, i));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        do {
            try {
                try {
                    read = inflaterInputStream.read(bArr2);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                        continue;
                    }
                } catch (IOException unused) {
                    inflaterInputStream.close();
                    return null;
                }
            } catch (IOException unused2) {
                return null;
            }
        } while (read > 0);
        try {
            inflaterInputStream.close();
        } catch (IOException unused3) {
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused4) {
        }
        return byteArray;
    }

    private static void c(File file, String str) {
        try {
            a(new FileInputStream(file), new File(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void a(InputStream inputStream, File file) throws ZipException, IOException {
        if (!file.exists()) {
            file.mkdirs();
        }
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        byte[] bArr = new byte[a];
        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
            if (nextEntry.isDirectory()) {
                String name = nextEntry.getName();
                String substring = name.substring(0, name.length() - 1);
                new File(file + File.separator + substring).mkdir();
            } else {
                File file2 = new File(file, File.separator + nextEntry.getName());
                if (!file2.exists()) {
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file2.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }
        inputStream.close();
        zipInputStream.close();
    }

    public static boolean a(File[] fileArr, File file, String str) {
        boolean z = false;
        if (fileArr != null && fileArr.length > 0) {
            File a2 = kc.a(file, str);
            for (File file2 : fileArr) {
                try {
                    kc.b(file2, a2);
                } catch (Throwable th) {
                    kc.f(a2);
                    throw th;
                }
            }
            try {
                a(a2, file.getAbsolutePath());
                kc.f(a2);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                kc.f(a2);
            }
        }
        return z;
    }

    public static byte[] a(InputStream inputStream) {
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2 = null;
        if (inputStream != null) {
            try {
                try {
                    gZIPInputStream = new GZIPInputStream(inputStream);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] b = kd.b(gZIPInputStream);
                kd.a((Closeable) gZIPInputStream);
                return b;
            } catch (IOException e2) {
                e = e2;
                gZIPInputStream2 = gZIPInputStream;
                e.printStackTrace();
                kd.a((Closeable) gZIPInputStream2);
                return new byte[0];
            } catch (Throwable th2) {
                th = th2;
                gZIPInputStream2 = gZIPInputStream;
                kd.a((Closeable) gZIPInputStream2);
                throw th;
            }
        }
        kd.a((Closeable) gZIPInputStream2);
        return new byte[0];
    }

    private static byte[] c(byte[] bArr) {
        return a(new ByteArrayInputStream(bArr));
    }
}
