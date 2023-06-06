package com.google.archivepatcher.applier;

import com.google.archivepatcher.shared.h;
import com.google.archivepatcher.shared.k;
import com.meituan.robust.common.CommonConstant;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static f a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte[] bytes = "GFbFv1_0".getBytes("US-ASCII");
        byte[] bArr = new byte[bytes.length];
        dataInputStream.readFully(bArr);
        if (!Arrays.equals(bytes, bArr)) {
            throw new g("Bad identifier");
        }
        dataInputStream.skip(4L);
        long a = a(dataInputStream.readLong(), "delta-friendly old file size");
        int a2 = (int) a(dataInputStream.readInt(), "old file uncompression instruction count");
        ArrayList arrayList = new ArrayList(a2);
        long j = -1;
        for (int i = 0; i < a2; i++) {
            long a3 = a(dataInputStream.readLong(), "old file uncompression range offset");
            long a4 = a(dataInputStream.readLong(), "old file uncompression range length");
            if (a3 < j) {
                throw new g("old file uncompression ranges out of order or overlapping");
            }
            arrayList.add(new k(a3, a4, null));
            j = a3 + a4;
        }
        int readInt = dataInputStream.readInt();
        a(readInt, "delta-friendly new file recompression instruction count");
        ArrayList arrayList2 = new ArrayList(readInt);
        long j2 = -1;
        int i2 = 0;
        while (i2 < readInt) {
            long a5 = a(dataInputStream.readLong(), "delta-friendly new file recompression range offset");
            long a6 = a(dataInputStream.readLong(), "delta-friendly new file recompression range length");
            if (a5 < j2) {
                throw new g("delta-friendly new file recompression ranges out of order or overlapping");
            }
            long j3 = a5 + a6;
            long j4 = a;
            a(dataInputStream.readByte(), h.a.DEFAULT_DEFLATE.b, h.a.DEFAULT_DEFLATE.b, "compatibility window id");
            arrayList2.add(new k(a5, a6, com.google.archivepatcher.shared.f.a((int) a(dataInputStream.readUnsignedByte(), 1L, 9L, "recompression level"), (int) a(dataInputStream.readUnsignedByte(), 0L, 2L, "recompression strategy"), ((int) a((long) dataInputStream.readUnsignedByte(), 0L, 1L, "recompression nowrap")) != 0)));
            i2++;
            a = j4;
            j2 = j3;
        }
        long j5 = a;
        int a7 = (int) a(dataInputStream.readInt(), 1L, 1L, "num delta records");
        ArrayList arrayList3 = new ArrayList(a7);
        for (int i3 = 0; i3 < a7; i3++) {
            arrayList3.add(new b(h.b.a((byte) a(dataInputStream.readByte(), h.b.BSDIFF.b, h.b.BSDIFF.b, "delta format")), new k(a(dataInputStream.readLong(), "delta-friendly old file work range offset"), a(dataInputStream.readLong(), "delta-friendly old file work range length"), null), new k(a(dataInputStream.readLong(), "delta-friendly new file work range offset"), a(dataInputStream.readLong(), "delta-friendly new file work range length"), null), a(dataInputStream.readLong(), "delta length")));
        }
        return new f(Collections.unmodifiableList(arrayList), j5, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList3));
    }

    private static final long a(long j, String str) throws g {
        if (j >= 0) {
            return j;
        }
        throw new g("Bad value for " + str + ": " + j);
    }

    private static final long a(long j, long j2, long j3, String str) throws g {
        if (j < j2 || j > j3) {
            throw new g("Bad value for " + str + ": " + j + " (valid range: [" + j2 + CommonConstant.Symbol.COMMA + j3 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
        return j;
    }
}
