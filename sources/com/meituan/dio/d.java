package com.meituan.dio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends InputStream {
    public static ChangeQuickRedirect a;
    protected int b;
    protected final int c;
    protected final InputStream d;
    protected final a e;

    public d(InputStream inputStream, a aVar) throws IOException {
        Object[] objArr = {inputStream, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2e7fe7db2f607da417da4ea60d365e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2e7fe7db2f607da417da4ea60d365e");
            return;
        }
        this.b = 0;
        if (inputStream == null) {
            throw new NullPointerException("inputStream can't be null");
        }
        if (aVar == null) {
            throw new NullPointerException("dioEntry can't be null");
        }
        this.d = inputStream;
        this.e = aVar;
        int c = aVar.c();
        this.c = aVar.b();
        c = c < 0 ? 0 : c;
        if (this.c < 0) {
            throw new IllegalArgumentException("The param is not illegal");
        }
        if (c > 0) {
            long skip = this.d.skip(c - 1);
            a();
            if (skip + 1 != c) {
                throw new EOFException("Wrong length");
            }
        }
    }

    private void a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6510eb9f18a8815eb36f016f27039f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6510eb9f18a8815eb36f016f27039f1");
            return;
        }
        int read = this.d.read();
        if (read != -1 && ((read & 255) ^ TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_1) != 0) {
            throw new EOFException("Wrong sep char");
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b56a99ee2f86f66dd5be58a0496c2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b56a99ee2f86f66dd5be58a0496c2e")).intValue();
        }
        if (this.b >= this.c) {
            return -1;
        }
        int read = this.d.read();
        if (this.e.d().c) {
            read ^= -85;
        }
        this.b++;
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18fe92b4f7ba0983b9aa99cf2069b908", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18fe92b4f7ba0983b9aa99cf2069b908")).intValue() : read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a371960215623415ef9b1b359519ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a371960215623415ef9b1b359519ee")).intValue();
        }
        int i3 = this.c - this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i3 < i2) {
            i2 = i3 + 1;
        }
        int read = this.d.read(bArr, i, i2);
        if (read <= 0) {
            return read;
        }
        this.b += read;
        if (this.b == this.c) {
            a();
        } else if (this.b > this.c) {
            read--;
            if (((bArr[read] & 255) ^ TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_1) != 0) {
                throw new EOFException("Wrong sep char");
            }
        }
        if (this.e.d().c) {
            com.meituan.dio.utils.g.a(bArr, i, read, (byte) -85);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f56450de3ab549fffa68c41cbfa1db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f56450de3ab549fffa68c41cbfa1db")).longValue();
        }
        if (j >= 0) {
            long j2 = this.c - this.b;
            if (j2 < j) {
                j = j2;
            }
            long skip = this.d.skip(j);
            if (skip <= 0) {
                return skip;
            }
            this.b = (int) (this.b + skip);
            return skip;
        }
        if (this.b < (-j)) {
            j = -this.b;
        }
        long skip2 = this.d.skip(j);
        this.b = (int) (this.b + skip2);
        return skip2;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.c - this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12c61f9eadc8bb3ceff740c6beb9799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12c61f9eadc8bb3ceff740c6beb9799");
        } else {
            this.d.close();
        }
    }
}
