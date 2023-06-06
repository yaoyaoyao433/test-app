package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kd {
    private static final int a = 4096;

    public static final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[102400];
                do {
                    int read = inputStream.read(bArr, 0, 102400);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } while (byteArrayOutputStream.size() < 102400);
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    a(byteArrayOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byteArrayOutputStream.flush();
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    a(byteArrayOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    public static final long a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            return -1L;
        }
        try {
            byte[] bArr = new byte[4096];
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            }
        } catch (IOException unused) {
            return -1L;
        }
    }

    private static int a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return a(bArr, new File(str));
    }

    public static int a(byte[] bArr, File file) {
        if (bArr == null || bArr.length == 0 || file.isDirectory()) {
            return 0;
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                int length = bArr.length;
                a(fileOutputStream2);
                return length;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                a(fileOutputStream);
                return 0;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                return true;
            }
            if (file.exists() && file.isFile()) {
                file.delete();
            }
            return file.mkdirs();
        } catch (Exception unused) {
            return false;
        }
    }

    public static final InputStream b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new File(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final InputStream a(File file) {
        try {
            if (file.exists() && file.isFile() && file.canRead()) {
                return new FileInputStream(file);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    private static boolean a(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.renameTo(new File(str2));
        }
        return false;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Stack stack = new Stack();
        stack.push(str);
        while (!stack.isEmpty()) {
            File file = new File((String) stack.peek());
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        if (listFiles.length == 0) {
                            file.delete();
                            stack.pop();
                        } else {
                            for (File file2 : listFiles) {
                                if (file2.isDirectory()) {
                                    stack.push(file2.getAbsolutePath());
                                } else {
                                    file2.delete();
                                }
                            }
                        }
                    }
                } else {
                    file.delete();
                    stack.pop();
                }
            } else {
                stack.pop();
            }
        }
        return true;
    }

    public static void a(Bitmap... bitmapArr) {
        if (bitmapArr != null) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }

    private static void a(byte[] bArr, OutputStream outputStream) {
        if (bArr == null || bArr.length == 0 || outputStream == null) {
            return;
        }
        try {
            outputStream.write(bArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean c(InputStream inputStream) {
        if (inputStream != null) {
            try {
                if (inputStream.available() > 0) {
                    return true;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
