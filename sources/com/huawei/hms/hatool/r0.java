package com.huawei.hms.hatool;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.Deflater;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r0 {
    public static String a(File file) {
        String str;
        String str2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            o0 o0Var = new o0(1024);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                o0Var.a(bArr, read);
            }
            if (o0Var.b() == 0) {
                a((Closeable) fileInputStream);
                return "";
            }
            String str3 = new String(o0Var.a(), "UTF-8");
            a((Closeable) fileInputStream);
            return str3;
        } catch (FileNotFoundException unused3) {
            fileInputStream2 = fileInputStream;
            str = "hmsSdk";
            str2 = "getInfoFromFile(): No files need to be read";
            y.f(str, str2);
            a((Closeable) fileInputStream2);
            return "";
        } catch (IOException unused4) {
            fileInputStream2 = fileInputStream;
            str = "hmsSdk";
            str2 = "getInfoFromFile(): stream.read or new string exception";
            y.f(str, str2);
            a((Closeable) fileInputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            a((Closeable) fileInputStream2);
            throw th;
        }
    }

    public static String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            a((Closeable) byteArrayOutputStream);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                y.f("hmsSdk", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    public static void a(File file, String str) {
        FileOutputStream fileOutputStream;
        String str2;
        String str3;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes("UTF-8"));
                    fileOutputStream.flush();
                } catch (FileNotFoundException unused) {
                    str2 = "hmsSdk";
                    str3 = "saveInfoToFile(): No files need to be read";
                    y.f(str2, str3);
                    a((Closeable) fileOutputStream);
                } catch (IOException unused2) {
                    str2 = "hmsSdk";
                    str3 = "saveInfoToFile(): io exc from write info to file!";
                    y.f(str2, str3);
                    a((Closeable) fileOutputStream);
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                a((Closeable) fileOutputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileOutputStream = null;
        } catch (IOException unused4) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) fileOutputStream2);
            throw th;
        }
        a((Closeable) fileOutputStream);
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                y.f("hmsSdk", "closeStream(): Exception: close OutputStream error!");
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (Exception unused) {
            y.f("hmsSdk", "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission");
        }
        httpURLConnection.disconnect();
        y.a("hmsSdk", " connHttp disconnect");
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        a((OutputStream) byteArrayOutputStream);
        return byteArray;
    }
}
