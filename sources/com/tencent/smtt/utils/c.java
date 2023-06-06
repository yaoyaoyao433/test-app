package com.tencent.smtt.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes6.dex */
public class c implements Closeable {
    private final RandomAccessFile a;
    private final File b;
    private final byte[] c;
    private boolean d;

    public c(File file) throws FileNotFoundException {
        this.c = new byte[8];
        this.b = file;
        this.a = new RandomAccessFile(this.b, com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
    }

    public c(String str) throws FileNotFoundException {
        this(new File(str));
    }

    public final int a(byte[] bArr) throws IOException {
        return this.a.read(bArr);
    }

    public final int a(char[] cArr) throws IOException {
        byte[] bArr = new byte[cArr.length];
        int read = this.a.read(bArr);
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        return read;
    }

    public final short a() throws IOException {
        short readShort = this.a.readShort();
        if (this.d) {
            return (short) (((readShort & 65280) >>> 8) | ((readShort & 255) << 8));
        }
        return readShort;
    }

    public void a(long j) throws IOException {
        this.a.seek(j);
    }

    public void a(boolean z) {
        this.d = z;
    }

    public final int b() throws IOException {
        int readInt = this.a.readInt();
        if (this.d) {
            return ((readInt & (-16777216)) >>> 24) | ((readInt & 255) << 24) | ((65280 & readInt) << 8) | ((16711680 & readInt) >>> 8);
        }
        return readInt;
    }

    public final long c() throws IOException {
        if (this.d) {
            this.a.readFully(this.c, 0, 8);
            return (this.c[7] << 56) | ((this.c[6] & 255) << 48) | ((this.c[5] & 255) << 40) | ((this.c[4] & 255) << 32) | ((this.c[3] & 255) << 24) | ((this.c[2] & 255) << 16) | ((this.c[1] & 255) << 8) | (this.c[0] & 255);
        }
        return this.a.readLong();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
