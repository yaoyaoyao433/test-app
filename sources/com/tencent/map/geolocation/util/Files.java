package com.tencent.map.geolocation.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Files {
    private static void write0(CharSequence charSequence, File file, Charset charset, boolean z) throws IOException {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, z), charset));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedWriter.append(charSequence);
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    private static void write0(byte[] bArr, File file, boolean z) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, z));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (IOException e) {
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public static void append(byte[] bArr, File file) throws IOException {
        write0(bArr, file, true);
    }

    public static void append(CharSequence charSequence, File file, Charset charset) throws IOException {
        write0(charSequence, file, charset, true);
    }

    public static void write(CharSequence charSequence, File file, Charset charset) throws IOException {
        write0(charSequence, file, charset, false);
    }

    public static void write(byte[] bArr, File file) throws IOException {
        write0(bArr, file, false);
    }

    public static byte[] toByteArray(File file) throws IOException {
        if (!file.exists()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedInputStream bufferedInputStream = null;
        byte[] bArr = new byte[4096];
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                while (true) {
                    try {
                        int read = bufferedInputStream2.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            bufferedInputStream2.close();
                            byteArrayOutputStream.close();
                            return byteArray;
                        }
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        byteArrayOutputStream.close();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public static String toString(File file, Charset charset) throws IOException {
        return file.length() == 0 ? "" : new String(toByteArray(file), charset.name());
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
        BufferedReader bufferedReader;
        if (file.length() == 0) {
            return Collections.emptyList();
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
            } catch (IOException e) {
                throw e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    arrayList.add(readLine);
                } else {
                    bufferedReader.close();
                    return arrayList;
                }
            }
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] fun_fe7b2b264010df956d4b71eefd61ddcd(android.content.Context r3) {
        /*
            android.content.res.AssetManager r3 = r3.getAssets()
            r0 = 0
            java.lang.String r1 = "TencentLocationComp/constants.dat"
            java.io.InputStream r3 = r3.open(r1)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            int r1 = r3.available()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
            r3.read(r1)     // Catch: java.io.IOException -> L1f java.lang.Throwable -> L3f
            if (r3 == 0) goto L1e
            r3.close()     // Catch: java.io.IOException -> L1a
            goto L1e
        L1a:
            r3 = move-exception
            r3.printStackTrace()
        L1e:
            return r1
        L1f:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L30
        L24:
            goto L40
        L26:
            r1 = move-exception
            r2 = r0
            r0 = r3
            r3 = r1
            r1 = r2
            goto L30
        L2c:
            r3 = r0
            goto L40
        L2e:
            r3 = move-exception
            r1 = r0
        L30:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r3 = move-exception
            r3.printStackTrace()
        L3d:
            return r1
        L3e:
            r3 = r0
        L3f:
            r0 = r1
        L40:
            if (r3 == 0) goto L4a
            r3.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r3 = move-exception
            r3.printStackTrace()
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.util.Files.fun_fe7b2b264010df956d4b71eefd61ddcd(android.content.Context):byte[]");
    }
}
