package com.meituan.robust.common;

import java.io.ByteArrayInputStream;
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
public final class TxtFileReaderAndWriter {
    private static final String BACKSLASH = "\\";
    private static final String SLASH = "/";

    private TxtFileReaderAndWriter() {
    }

    public static String readFileAsString(String str) {
        return new String(readFileAsBytes(str));
    }

    public static String readFileAsString(File file) {
        return new String(readFileAsBytes(file));
    }

    public static byte[] readFileAsBytes(String str) {
        return readFileAsBytes(new File(str));
    }

    public static byte[] readFileAsBytes(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            copyStream(fileInputStream, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static void writeFile(String str, String str2) {
        writeFile(str, str2.getBytes());
    }

    public static void writeFile(File file, String str) {
        writeFile(file, str.getBytes());
    }

    public static void writeFile(String str, byte[] bArr) {
        writeFile(new File(str), bArr);
    }

    public static void writeFile(File file, byte[] bArr) {
        writeFile(file, new ByteArrayInputStream(bArr));
    }

    public static void writeFile(File file, InputStream inputStream) {
        copyStream(inputStream, createFileOutputStream(file));
    }

    private static FileOutputStream createFileOutputStream(File file) {
        if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) {
        try {
            int read = inputStream.read();
            while (read >= 0) {
                outputStream.write(read);
                read = inputStream.read();
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void copyFile(File file, File file2) {
        try {
            copyStream(new FileInputStream(file), createFileOutputStream(file2));
        } catch (FileNotFoundException unused) {
        }
    }

    public static boolean exists(String str) {
        return new File(str).exists();
    }

    public static String getAbsolutePath(String str) {
        return replaceBackslash(new File(str).getAbsolutePath());
    }

    public static String getCanonicalPath(String str) {
        try {
            return replaceBackslash(new File(str).getCanonicalPath());
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean isAbsolute(String str) {
        return new File(str).isAbsolute();
    }

    public static String getParent(String str) {
        return replaceBackslash(new File(str).getParent());
    }

    private static String replaceBackslash(String str) {
        return str.replace("\\", "/");
    }

    public static int assertPresent(String str, int i, int i2, String... strArr) {
        validateArgs(i, strArr);
        int length = strArr.length;
        int i3 = 0;
        int i4 = -1;
        while (i3 < length) {
            String str2 = strArr[i3];
            int indexOf = str.indexOf(str2, i);
            assertTrue("Expected: index1 <= index for " + str2 + ", index1=" + i + ", index=" + indexOf, i <= indexOf);
            if (i2 >= 0) {
                assertTrue("Expected: index < index2 for " + str2 + ", index=" + indexOf + ", index2=" + i2, indexOf < i2);
            }
            i3++;
            i4 = indexOf;
        }
        return i4;
    }

    public static void assertNotPresent(String str, int i, int i2, String... strArr) {
        validateArgs(i, strArr);
        for (String str2 : strArr) {
            int indexOf = str.indexOf(str2, i);
            assertTrue("Expected: index < 0 || index >= index2 for " + str2 + ", index=" + indexOf + ", index1=" + i + ", index2=" + i2, indexOf < 0 || indexOf >= i2);
        }
    }

    private static void validateArgs(int i, String[] strArr) {
        assertTrue("Expected: index1 >= 0, index1=" + i, i >= 0);
        assertTrue("Expected: strings.length > 0", strArr.length > 0);
    }

    private static void assertTrue(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
