package com.xiaomi.push;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/* loaded from: classes6.dex */
public final class b {
    public static final String[] a = {CommonConstant.File.JPG, "png", "bmp", CommonConstant.File.GIF, "webp"};

    public static String a(File file) {
        InputStreamReader inputStreamReader;
        StringWriter stringWriter = new StringWriter();
        try {
            inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
            try {
                try {
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            String stringWriter2 = stringWriter.toString();
                            a(inputStreamReader);
                            a(stringWriter);
                            return stringWriter2;
                        }
                        stringWriter.write(cArr, 0, read);
                    }
                } catch (IOException e) {
                    e = e;
                    com.xiaomi.channel.commonutils.logger.c.c("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    a(inputStreamReader);
                    a(stringWriter);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                a(inputStreamReader);
                a(stringWriter);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamReader = null;
            a(inputStreamReader);
            a(stringWriter);
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(File file, File file2) {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(file, false));
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException unused) {
            zipOutputStream = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            a(zipOutputStream, file2, null, null);
            a(zipOutputStream);
        } catch (FileNotFoundException unused2) {
            a(zipOutputStream);
        } catch (IOException e2) {
            e = e2;
            zipOutputStream2 = zipOutputStream;
            com.xiaomi.channel.commonutils.logger.c.a("zip file failure + " + e.getMessage());
            a(zipOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            a(zipOutputStream2);
            throw th;
        }
    }

    public static void a(File file, String str) {
        BufferedWriter bufferedWriter;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.c.c("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            a(bufferedWriter);
        } catch (IOException e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            com.xiaomi.channel.commonutils.logger.c.c("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
            a(bufferedWriter2);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            a(bufferedWriter2);
            throw th;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) {
        ZipEntry zipEntry;
        FileInputStream fileInputStream;
        if (str == null) {
            str = "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                    zipOutputStream.putNextEntry(new ZipEntry(str + File.separator));
                    String str2 = TextUtils.isEmpty(str) ? "" : str + File.separator;
                    for (int i = 0; i < listFiles.length; i++) {
                        a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName(), null);
                    }
                    File[] listFiles2 = file.listFiles(new c());
                    if (listFiles2 != null) {
                        for (File file2 : listFiles2) {
                            a(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
                        }
                    }
                    fileInputStream = null;
                } else {
                    if (TextUtils.isEmpty(str)) {
                        Date date = new Date();
                        zipEntry = new ZipEntry(String.valueOf(date.getTime()) + ".txt");
                    } else {
                        zipEntry = new ZipEntry(str);
                    }
                    zipOutputStream.putNextEntry(zipEntry);
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e) {
                        e = e;
                        fileInputStream2 = fileInputStream;
                        com.xiaomi.channel.commonutils.logger.c.d("zipFiction failed with exception:" + e.toString());
                        a(fileInputStream2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        a(fileInputStream2);
                        throw th;
                    }
                }
                a(fileInputStream);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }

    public static void b(File file, File file2) {
        FileInputStream fileInputStream;
        if (file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read < 0) {
                            fileInputStream.close();
                            fileOutputStream2.close();
                            return;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
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
            fileInputStream = null;
        }
    }

    public static boolean b(File file) {
        try {
            if (file.isDirectory()) {
                return false;
            }
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
