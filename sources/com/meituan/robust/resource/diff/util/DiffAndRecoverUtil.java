package com.meituan.robust.resource.diff.util;

import com.meituan.robust.tools.jbdiff.JBDiff;
import com.meituan.robust.tools.jbdiff.JBPatch;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DiffAndRecoverUtil {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;

    public static void diff(File file, File file2, File file3) throws IOException {
        JBDiff.bsdiff(file, file2, file3);
    }

    public static void recover(InputStream inputStream, InputStream inputStream2, File file) throws IOException {
        if (inputStream == null) {
            throw new IOException("old input stream is null");
        }
        if (file == null) {
            throw new IOException("new file is null");
        }
        if (inputStream2 == null) {
            throw new IOException("diff input stream is null");
        }
        byte[] byteArray = toByteArray(inputStream);
        byte[] byteArray2 = toByteArray(inputStream2);
        if (file.exists()) {
            file.delete();
        }
        byte[] bspatch = JBPatch.bspatch(byteArray, byteArray.length, byteArray2, byteArray2.length);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bspatch);
            fileOutputStream.close();
        } catch (Throwable unused) {
            fileOutputStream.close();
        }
    }

    public static void recover(File file, File file2, File file3) {
        if (file == null || file2 == null || file3 == null || !file.exists() || !file2.exists()) {
            return;
        }
        if (file3.exists()) {
            file3.delete();
        }
        try {
            recover(new FileInputStream(file), new FileInputStream(file2), file3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    private static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copyLarge(inputStream, outputStream, new byte[4096]);
    }

    private static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
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
}
