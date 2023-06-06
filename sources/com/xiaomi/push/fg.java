package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;
/* loaded from: classes6.dex */
public final class fg {
    public static final byte[] a = {80, 85, 83, 72};
    private short b;
    private byte c;
    private int d;
    private byte[] e;

    /* loaded from: classes6.dex */
    public interface b {
        byte[] a(byte[] bArr, int i);
    }

    /* loaded from: classes6.dex */
    public static final class c {
    }

    /* loaded from: classes6.dex */
    public static final class d implements b {
        @Override // com.xiaomi.push.fg.b
        public final byte[] a(byte[] bArr, int i) {
            GZIPInputStream gZIPInputStream = null;
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr), i);
                try {
                    byte[] bArr2 = new byte[i];
                    gZIPInputStream2.read(bArr2);
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private fg(byte b2, int i, byte[] bArr) {
        this((short) 1, b2, i, bArr);
    }

    private fg(short s, byte b2, int i, byte[] bArr) {
        this.b = (short) 1;
        this.b = s;
        this.c = b2;
        this.d = i;
        this.e = bArr;
    }

    private static boolean a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(byte[] bArr) {
        return a(a, bArr, a.length);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static final c a = new c();
        public static final d b = new d();

        public static byte[] a(byte[] bArr) {
            d dVar = b;
            if (fg.b(bArr)) {
                fg a2 = fg.a(bArr);
                return (a2.c == 0 || a2.c != 2) ? a2.e : dVar.a(a2.e, a2.d);
            }
            return bArr;
        }
    }

    public static fg a(byte[] bArr) {
        if (b(bArr)) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            order.getInt();
            short s = order.getShort();
            byte b2 = order.get();
            int i = order.getInt();
            byte[] bArr2 = new byte[order.getInt()];
            order.get(bArr2);
            return new fg(s, b2, i, bArr2);
        }
        return new fg((byte) 0, bArr.length, bArr);
    }
}
