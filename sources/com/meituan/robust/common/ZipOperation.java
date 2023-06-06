package com.meituan.robust.common;

import com.meituan.robust.common.CommonConstant;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ZipOperation {
    private static final int BUFFER_SIZE = 8192;

    public static void zipFiles(Collection<File> collection, File file) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 8192));
        for (File file2 : collection) {
            if (file2.exists()) {
                zipFile(file2, zipOutputStream, "");
            }
        }
        zipOutputStream.close();
    }

    private static void zipFile(File file, ZipOutputStream zipOutputStream, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.trim().length() == 0 ? "" : File.separator);
        sb.append(file.getName());
        String sb2 = sb.toString();
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                zipFile(file2, zipOutputStream, sb2);
            }
            return;
        }
        byte[] readContents = readContents(file);
        if (sb2.contains(CommonConstant.Symbol.SLASH_RIGHT)) {
            sb2 = sb2.replace(CommonConstant.Symbol.SLASH_RIGHT, "/");
        }
        ZipEntry zipEntry = new ZipEntry(sb2);
        zipEntry.setMethod(8);
        zipOutputStream.putNextEntry(zipEntry);
        zipOutputStream.write(readContents);
        zipOutputStream.flush();
        zipOutputStream.closeEntry();
    }

    private static byte[] readContents(File file) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    byteArrayOutputStream.write(bArr2);
                } else {
                    bufferedInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }

    public static void zipInputDir(File file, File file2) throws IOException {
        File[] listFiles = file.listFiles();
        ArrayList arrayList = new ArrayList();
        for (File file3 : listFiles) {
            arrayList.add(file3);
        }
        zipFiles(arrayList, file2);
    }
}
