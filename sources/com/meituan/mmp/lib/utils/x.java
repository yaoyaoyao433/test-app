package com.meituan.mmp.lib.utils;

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
public final class x {
    public static ChangeQuickRedirect a;

    public static void a(Closeable... closeableArr) {
        Object[] objArr = {closeableArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4020477a5da8c3cd26e1897ce803f276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4020477a5da8c3cd26e1897ce803f276");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f16a0eb898bed77a3de23d8c5dabfcef", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f16a0eb898bed77a3de23d8c5dabfcef");
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.ByteBuffer a(java.io.File r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mmp.lib.utils.x.a
            java.lang.String r10 = "9cc60a3766505eac78a4b508d55e2daf"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11
            return r11
        L1e:
            boolean r0 = r11.exists()
            if (r0 != 0) goto L25
            return r2
        L25:
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4e java.io.FileNotFoundException -> L55
            java.lang.String r1 = "r"
            r0.<init>(r11, r1)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4e java.io.FileNotFoundException -> L55
            java.nio.channels.FileChannel r11 = r0.getChannel()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4e java.io.FileNotFoundException -> L55
            long r0 = r11.size()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4f java.io.FileNotFoundException -> L56
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4f java.io.FileNotFoundException -> L56
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4f java.io.FileNotFoundException -> L56
            r11.read(r0)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4f java.io.FileNotFoundException -> L56
            r0.flip()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4f java.io.FileNotFoundException -> L56
            r11.close()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L4f java.io.FileNotFoundException -> L56
            return r0
        L44:
            r0 = move-exception
            goto L48
        L46:
            r0 = move-exception
            r11 = r2
        L48:
            if (r11 == 0) goto L4d
            r11.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r0
        L4e:
            r11 = r2
        L4f:
            if (r11 == 0) goto L59
        L51:
            r11.close()     // Catch: java.io.IOException -> L59
            goto L59
        L55:
            r11 = r2
        L56:
            if (r11 == 0) goto L59
            goto L51
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.utils.x.a(java.io.File):java.nio.ByteBuffer");
    }

    public static boolean a(File file, ByteBuffer byteBuffer, boolean z) {
        FileChannel channel;
        Object[] objArr = {file, byteBuffer, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileChannel fileChannel = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7e3078da6884f99b02ea363d586c566", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7e3078da6884f99b02ea363d586c566")).booleanValue();
            }
            try {
                channel = new FileOutputStream(file, z).getChannel();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0c6ea36db4b5bfbe051418b4a6517e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0c6ea36db4b5bfbe051418b4a6517e5")).booleanValue();
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
