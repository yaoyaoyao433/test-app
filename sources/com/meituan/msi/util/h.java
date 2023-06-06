package com.meituan.msi.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static void a(Closeable... closeableArr) {
        Object[] objArr = {closeableArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6130347c1ff0d6cc7c158670a0aa731d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6130347c1ff0d6cc7c158670a0aa731d");
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b68a21e886999b3b254b8c10fb2e96f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b68a21e886999b3b254b8c10fb2e96f");
        }
        if (byteBuffer == null) {
            return new byte[0];
        }
        if (!byteBuffer.isDirect()) {
            return byteBuffer.array();
        }
        int position = byteBuffer.position();
        byteBuffer.position(0);
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer a(java.io.File r11, long r12, long r14) throws com.meituan.msi.bean.ApiException {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            r8 = 1
            r0[r8] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r14)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msi.util.h.a
            java.lang.String r10 = "4fe0c28bddadd3fba50922a4264e184a"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11
            return r11
        L2e:
            boolean r0 = r11.exists()
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == 0) goto Lb4
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La8 java.io.FileNotFoundException -> Laf
            java.lang.String r3 = "r"
            r0.<init>(r11, r3)     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La8 java.io.FileNotFoundException -> Laf
            r0.seek(r12)     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La8 java.io.FileNotFoundException -> Laf
            java.nio.channels.FileChannel r11 = r0.getChannel()     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La8 java.io.FileNotFoundException -> Laf
            r3 = 0
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 != 0) goto L52
            long r14 = r11.size()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            goto L52
        L50:
            r12 = move-exception
            goto La2
        L52:
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 < 0) goto L8b
            long r5 = r11.size()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 > 0) goto L8b
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 < 0) goto L76
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L76
            long r14 = r14 - r12
            int r12 = (int) r14     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            r11.read(r12)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            r12.flip()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            r11.close()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            return r12
        L76:
            com.meituan.msi.bean.ApiException r14 = new com.meituan.msi.bean.ApiException     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            java.lang.String r0 = "invalid position "
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            r15.append(r12)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            java.lang.String r12 = r15.toString()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            r14.<init>(r1, r12)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            throw r14     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
        L8b:
            com.meituan.msi.bean.ApiException r12 = new com.meituan.msi.bean.ApiException     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            java.lang.String r0 = "invalid length "
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            r13.append(r14)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            r12.<init>(r1, r13)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
            throw r12     // Catch: java.lang.Throwable -> L50 java.io.IOException -> La9 java.io.FileNotFoundException -> Lb0
        La0:
            r12 = move-exception
            r11 = r2
        La2:
            if (r11 == 0) goto La7
            r11.close()     // Catch: java.io.IOException -> La7
        La7:
            throw r12
        La8:
            r11 = r2
        La9:
            if (r11 == 0) goto Lb3
        Lab:
            r11.close()     // Catch: java.io.IOException -> Lb3
            goto Lb3
        Laf:
            r11 = r2
        Lb0:
            if (r11 == 0) goto Lb3
            goto Lab
        Lb3:
            return r2
        Lb4:
            com.meituan.msi.bean.ApiException r12 = new com.meituan.msi.bean.ApiException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "no such file "
            r13.<init>(r14)
            java.lang.String r11 = r11.getName()
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r1, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.util.h.a(java.io.File, long, long):java.nio.ByteBuffer");
    }

    public static boolean a(File file, ByteBuffer byteBuffer, boolean z) {
        FileChannel channel;
        Object[] objArr = {file, byteBuffer, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileChannel fileChannel = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b862bc106f616147bd3d5419c1d562d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b862bc106f616147bd3d5419c1d562d")).booleanValue();
            }
            try {
                channel = new FileOutputStream(file, true).getChannel();
            } catch (FileNotFoundException e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            }
            try {
                channel.write(byteBuffer);
                byteBuffer.compact();
                channel.close();
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused) {
                        return false;
                    }
                }
                return true;
            } catch (FileNotFoundException e3) {
                e = e3;
                fileChannel = channel;
                e.printStackTrace();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused2) {
                    }
                }
                return false;
            } catch (IOException e4) {
                e = e4;
                fileChannel = channel;
                e.printStackTrace();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileChannel = channel;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused4) {
                        return false;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {inputStream, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "828f8b83349e2db210920603f96edb5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "828f8b83349e2db210920603f96edb5a")).booleanValue();
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        a(inputStream, fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException unused) {
                a(inputStream, fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                a(inputStream, fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }
}
