package com.meituan.android.soloader;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public ZipFile a;
        public ZipEntry b;

        public a(ZipFile zipFile, ZipEntry zipEntry) {
            this.a = zipFile;
            this.b = zipEntry;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.meituan.android.soloader.b.a a(android.content.Context r20, java.lang.String[] r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.soloader.b.a(android.content.Context, java.lang.String[], java.lang.String):com.meituan.android.soloader.b$a");
    }

    public static void a(Context context, String[] strArr, String str, File file) throws FileNotFoundException {
        a aVar;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        long a2;
        Object[] objArr = {context, strArr, str, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "884327baf51220d2520c341ca6c65d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "884327baf51220d2520c341ca6c65d28");
            return;
        }
        try {
            aVar = a(context, strArr, str);
            try {
                if (aVar == null) {
                    throw new FileNotFoundException(str);
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i >= 5) {
                        if (aVar != null) {
                            try {
                                if (aVar.a != null) {
                                    aVar.a.close();
                                    return;
                                }
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = aVar.a.getInputStream(aVar.b);
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        a2 = a(inputStream, fileOutputStream);
                                        fileOutputStream.getFD().sync();
                                    } catch (FileNotFoundException unused2) {
                                        a(inputStream);
                                        a(fileOutputStream);
                                        i = i2;
                                    } catch (IOException unused3) {
                                        a(inputStream);
                                        a(fileOutputStream);
                                        i = i2;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream2 = fileOutputStream;
                                        a(inputStream);
                                        a(fileOutputStream2);
                                        throw th;
                                    }
                                } catch (FileNotFoundException unused4) {
                                    fileOutputStream = null;
                                } catch (IOException unused5) {
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (FileNotFoundException unused6) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (IOException unused7) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                            if (a2 == file.length()) {
                                a(inputStream);
                                a(fileOutputStream);
                                file.setReadable(true, false);
                                file.setExecutable(true, false);
                                file.setWritable(true);
                                if (aVar != null) {
                                    try {
                                        if (aVar.a != null) {
                                            aVar.a.close();
                                            return;
                                        }
                                        return;
                                    } catch (IOException unused8) {
                                        return;
                                    }
                                }
                                return;
                            }
                            a(inputStream);
                            a(fileOutputStream);
                        }
                    } catch (IOException unused9) {
                    }
                    i = i2;
                }
            } catch (Throwable th4) {
                th = th4;
                if (aVar != null) {
                    try {
                        if (aVar.a != null) {
                            aVar.a.close();
                        }
                    } catch (IOException unused10) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            aVar = null;
        }
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10a55c9788df6cae8d85178d8a6444e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10a55c9788df6cae8d85178d8a6444e3")).longValue();
        }
        long j = 0;
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                outputStream.flush();
                return j;
            }
        }
    }

    private static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e002a88de7efc6c5f839983ccc3ea0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e002a88de7efc6c5f839983ccc3ea0e");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
