package com.meituan.android.soloader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static String[] a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return a(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    private static String[] a(FileChannel fileChannel) throws IOException {
        long a2;
        long c;
        int c2;
        long j;
        long j2;
        long a3;
        long j3;
        long j4;
        long a4;
        long a5;
        String sb;
        long j5;
        long a6;
        long a7;
        long a8;
        long a9;
        long b;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (b(fileChannel, allocate, 0L) != 1179403647) {
            throw new a("file is not ELF");
        }
        boolean z = d(fileChannel, allocate, 4L) == 1;
        if (d(fileChannel, allocate, 5L) == 2) {
            allocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z) {
            a2 = b(fileChannel, allocate, 28L);
        } else {
            a2 = a(fileChannel, allocate, 32L);
        }
        if (z) {
            c = c(fileChannel, allocate, 44L);
        } else {
            c = c(fileChannel, allocate, 56L);
        }
        if (z) {
            c2 = c(fileChannel, allocate, 42L);
        } else {
            c2 = c(fileChannel, allocate, 54L);
        }
        if (c == 65535) {
            if (z) {
                a9 = b(fileChannel, allocate, 32L);
            } else {
                a9 = a(fileChannel, allocate, 40L);
            }
            if (z) {
                b = b(fileChannel, allocate, a9 + 28);
            } else {
                b = b(fileChannel, allocate, a9 + 44);
            }
            c = b;
        }
        long j6 = a2;
        long j7 = 0;
        while (true) {
            if (j7 >= c) {
                j = 0;
                break;
            } else if (b(fileChannel, allocate, j6 + 0) != 2) {
                j6 += c2;
                j7++;
            } else if (z) {
                j = b(fileChannel, allocate, j6 + 4);
            } else {
                j = a(fileChannel, allocate, j6 + 8);
            }
        }
        long j8 = 0;
        if (j == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j9 = j;
        long j10 = 0;
        int i = 0;
        while (true) {
            if (z) {
                j2 = j10;
                a3 = b(fileChannel, allocate, j9 + j8);
            } else {
                j2 = j10;
                a3 = a(fileChannel, allocate, j9 + j8);
            }
            if (a3 == 1) {
                if (i == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i++;
                j10 = j2;
            } else if (a3 != 5) {
                j10 = j2;
            } else if (z) {
                j10 = b(fileChannel, allocate, j9 + 4);
            } else {
                j10 = a(fileChannel, allocate, j9 + 8);
            }
            j9 += z ? 8L : 16L;
            j8 = 0;
            if (a3 == 0) {
                if (j10 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= c) {
                        j3 = j;
                        j4 = 0;
                        break;
                    }
                    if (b(fileChannel, allocate, a2 + j8) == 1) {
                        if (z) {
                            a6 = b(fileChannel, allocate, a2 + 8);
                        } else {
                            a6 = a(fileChannel, allocate, a2 + 16);
                        }
                        if (z) {
                            j5 = c;
                            j3 = j;
                            a7 = b(fileChannel, allocate, a2 + 20);
                        } else {
                            j5 = c;
                            j3 = j;
                            a7 = a(fileChannel, allocate, a2 + 40);
                        }
                        if (a6 <= j10 && j10 < a7 + a6) {
                            if (z) {
                                a8 = b(fileChannel, allocate, a2 + 4);
                            } else {
                                a8 = a(fileChannel, allocate, a2 + 8);
                            }
                            j4 = a8 + (j10 - a6);
                        }
                    } else {
                        j5 = c;
                        j3 = j;
                    }
                    a2 += c2;
                    i2++;
                    c = j5;
                    j = j3;
                    j8 = 0;
                }
                long j11 = 0;
                if (j4 == 0) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i];
                int i3 = 0;
                while (true) {
                    if (z) {
                        a4 = b(fileChannel, allocate, j3 + j11);
                    } else {
                        a4 = a(fileChannel, allocate, j3 + j11);
                    }
                    if (a4 == 1) {
                        if (z) {
                            a5 = b(fileChannel, allocate, j3 + 4);
                        } else {
                            a5 = a(fileChannel, allocate, j3 + 8);
                        }
                        long j12 = a5 + j4;
                        Object[] objArr = {fileChannel, allocate, new Long(j12)};
                        ChangeQuickRedirect changeQuickRedirect = a;
                        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce1c48328426eb964877c4e169b43e45", RobustBitConfig.DEFAULT_VALUE)) {
                            sb = (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce1c48328426eb964877c4e169b43e45");
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                long j13 = j12 + 1;
                                short d = d(fileChannel, allocate, j12);
                                if (d == 0) {
                                    break;
                                }
                                sb2.append((char) d);
                                j12 = j13;
                            }
                            sb = sb2.toString();
                        }
                        strArr[i3] = sb;
                        if (i3 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i3++;
                    }
                    j3 += z ? 8L : 16L;
                    if (a4 == 0) {
                        if (i3 == strArr.length) {
                            return strArr;
                        }
                        throw new a("malformed DT_NEEDED section");
                    }
                    j11 = 0;
                }
            }
        }
    }

    private static void a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int read;
        long j2 = j;
        Object[] objArr = {fileChannel, byteBuffer, Integer.valueOf(i), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "222e06295eb74cee01044fc609b317be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "222e06295eb74cee01044fc609b317be");
            return;
        }
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j2)) != -1) {
            j2 += read;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    private static long a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        Object[] objArr = {fileChannel, byteBuffer, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d951454a54ff23e11e057ddb6ef02f62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d951454a54ff23e11e057ddb6ef02f62")).longValue();
        }
        a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static long b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        Object[] objArr = {fileChannel, byteBuffer, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "621edfeddac9b1255d981acae56a483c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "621edfeddac9b1255d981acae56a483c")).longValue();
        }
        a(fileChannel, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static int c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        Object[] objArr = {fileChannel, byteBuffer, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c285cec928250ec35f81202d8449d51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c285cec928250ec35f81202d8449d51")).intValue();
        }
        a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & ISelectionInterface.HELD_NOTHING;
    }

    private static short d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        Object[] objArr = {fileChannel, byteBuffer, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28fde29d57f3645f7aa51a851802e9ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28fde29d57f3645f7aa51a851802e9ed")).shortValue();
        }
        a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }
}
