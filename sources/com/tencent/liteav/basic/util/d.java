package com.tencent.liteav.basic.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    public static boolean a(long j) {
        return true;
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }

    public static long a(File file) {
        return a(file, 5);
    }

    public static long a(File file, int i) {
        File[] listFiles;
        long j = 0;
        if (i <= 0) {
            return 0L;
        }
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    j += a(file2, i - 1);
                } else {
                    j += file2.length();
                }
            }
        } catch (Exception e) {
            TXCLog.i("FileUtil", "getFolderSize exception " + e.toString());
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()
            r0 = 0
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L23
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L23
            a(r2, r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            a(r2)
            r3.flush()     // Catch: java.io.IOException -> L1a
            r3.close()     // Catch: java.io.IOException -> L1a
        L1a:
            return
        L1b:
            r4 = move-exception
            goto L21
        L1d:
            r4 = move-exception
            goto L25
        L1f:
            r4 = move-exception
            r3 = r0
        L21:
            r0 = r2
            goto L41
        L23:
            r4 = move-exception
            r3 = r0
        L25:
            r0 = r2
            goto L2c
        L27:
            r4 = move-exception
            r3 = r0
            goto L41
        L2a:
            r4 = move-exception
            r3 = r0
        L2c:
            java.lang.String r2 = "FileUtil"
            java.lang.String r1 = "copy asset file failed."
            com.tencent.liteav.basic.log.TXCLog.e(r2, r1, r4)     // Catch: java.lang.Throwable -> L40
            a(r0)
            if (r3 == 0) goto L3f
            r3.flush()     // Catch: java.io.IOException -> L3e
            r3.close()     // Catch: java.io.IOException -> L3e
        L3e:
            return
        L3f:
            return
        L40:
            r4 = move-exception
        L41:
            a(r0)
            if (r3 == 0) goto L4c
            r3.flush()     // Catch: java.io.IOException -> L4c
            r3.close()     // Catch: java.io.IOException -> L4c
        L4c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.util.d.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    public static String b(String str) {
        File file = new File(str);
        StringBuilder sb = new StringBuilder("");
        BufferedReader bufferedReader = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            bufferedReader2.close();
                            String sb2 = sb.toString();
                            try {
                                bufferedReader2.close();
                                return sb2;
                            } catch (IOException e) {
                                throw new RuntimeException("IOException occurred. ", e);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        throw new RuntimeException("IOException occurred. ", e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                throw new RuntimeException("IOException occurred. ", e3);
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.OutputStream, java.io.FileOutputStream] */
    public static void a(String str, byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                str = new FileOutputStream(new File((String) str));
                try {
                    bufferedOutputStream = new BufferedOutputStream(str);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(bArr);
                try {
                    bufferedOutputStream.close();
                    str.close();
                } catch (Exception unused) {
                }
            } catch (Exception e2) {
                e = e2;
                bufferedOutputStream2 = bufferedOutputStream;
                TXCLog.e("FileUtil", "write file failed.", e);
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                if (str != 0) {
                    str.close();
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused3) {
                        throw th;
                    }
                }
                if (str != 0) {
                    str.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            str = 0;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            for (String str2 : context.getAssets().list("")) {
                if (str2.equals(str.trim())) {
                    TXCLog.i("isAssetFileExists", str + " exist");
                    return true;
                }
            }
            TXCLog.i("isAssetFileExists", str + " not exist");
            return false;
        } catch (IOException unused) {
            TXCLog.i("isAssetFileExists", str + " not exist");
            return false;
        }
    }

    public static String b(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = context.getAssets().open(str);
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            if (inputStream.read(bArr) <= 0) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return "";
            }
            inputStream.close();
            String str2 = new String(bArr, "utf-8");
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return str2;
        } catch (IOException e2) {
            e = e2;
            inputStream2 = inputStream;
            TXCLog.e("FileUtil", "read asset file failed.", e);
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                    return "";
                } catch (IOException unused3) {
                    return "";
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
