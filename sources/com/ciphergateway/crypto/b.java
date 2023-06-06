package com.ciphergateway.crypto;

import android.annotation.SuppressLint;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
@SuppressLint({"DefaultLocale"})
/* loaded from: classes.dex */
public class b {
    private static File a;

    private b() {
    }

    static {
        String substring;
        try {
            File b = b("nativeutils");
            if (a()) {
                substring = b.getPath().substring(0, b.getPath().lastIndexOf(CommonConstant.Symbol.SLASH_RIGHT));
            } else {
                substring = b.getPath().substring(0, b.getPath().lastIndexOf("/"));
            }
            File[] listFiles = new File(substring).listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].getName().startsWith("nativeutils") && listFiles[i].isDirectory()) {
                    a(listFiles[i]);
                }
            }
        } catch (Exception unused) {
            System.err.println("Temp folder delete faild");
        }
    }

    public static void a(String str) throws IOException {
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("The path has to be absolute (start with '/').");
        }
        String[] split = str.split("/");
        String str2 = split.length > 1 ? split[split.length - 1] : null;
        if (str2 == null || str2.length() < 3) {
            throw new IllegalArgumentException("The filename has to be at least 3 characters long.");
        }
        if (a == null) {
            File b = b("nativeutils");
            a = b;
            b.deleteOnExit();
        }
        File file = new File(a, str2);
        try {
            InputStream resourceAsStream = b.class.getResourceAsStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[200];
            while (true) {
                int read = resourceAsStream.read(bArr, 0, 200);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    resourceAsStream.close();
                    fileOutputStream.close();
                    try {
                        try {
                            System.load(file.getAbsolutePath());
                            return;
                        } catch (Exception unused) {
                            file.delete();
                            throw new FileNotFoundException("File " + a + " was not found " + str2);
                        }
                    } finally {
                        file.deleteOnExit();
                    }
                }
            }
        } catch (IOException e) {
            file.delete();
            throw e;
        } catch (NullPointerException unused2) {
            file.delete();
            throw new FileNotFoundException("File " + str + " was not found inside JAR.");
        }
    }

    private static File b(String str) throws IOException {
        String property = System.getProperty("java.io.tmpdir");
        File file = new File(property, str + System.nanoTime());
        if (file.mkdir()) {
            return file;
        }
        throw new IOException("Failed to create temp directory " + file.getName());
    }

    private static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    public static boolean a() {
        return System.getProperty("os.name").toLowerCase().indexOf("windows") >= 0;
    }

    public static boolean b() {
        return System.getProperty("java.vm.name").toLowerCase().indexOf("dalvik") >= 0;
    }

    public static boolean c() {
        return System.getProperty("os.arch").toLowerCase().indexOf("aarch") >= 0;
    }

    public static boolean d() {
        return System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0 && System.getProperty("os.arch").toLowerCase().indexOf("amd64") >= 0;
    }

    public static boolean e() {
        String lowerCase = System.getProperty("os.name").toLowerCase();
        return lowerCase.indexOf("mac") >= 0 && lowerCase.indexOf("os") > 0;
    }
}
