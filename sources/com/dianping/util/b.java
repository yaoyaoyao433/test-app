package com.dianping.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends InputStream {
    public static ChangeQuickRedirect a;
    protected InputStream[] b;
    protected int c;
    protected int d;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public b(InputStream... inputStreamArr) {
        Object[] objArr = {inputStreamArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5607f2b44939eba5c688a976dd990b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5607f2b44939eba5c688a976dd990b2");
            return;
        }
        this.b = inputStreamArr;
        this.d = 0;
    }

    public final InputStream[] a() {
        return this.b;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1e04ca3fef05caaeb41c9a7834a372", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1e04ca3fef05caaeb41c9a7834a372")).intValue();
        }
        int length = this.b.length;
        int i = 0;
        for (int i2 = this.d; i2 < length; i2++) {
            int available = this.b[i2].available();
            if (available <= 0) {
                return 0;
            }
            i += available;
        }
        return i - this.c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f3c26591b995ba39fc387385561a162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f3c26591b995ba39fc387385561a162");
            return;
        }
        for (InputStream inputStream : this.b) {
            inputStream.close();
        }
        this.c = 0;
        this.d = 0;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a564dc11c3605cd7e0647285eeba0d", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException();
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a564dc11c3605cd7e0647285eeba0d");
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4def7f12407b27f97c507de5d8e8bbfc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4def7f12407b27f97c507de5d8e8bbfc")).intValue();
            }
            int read = this.b[this.d].read();
            if (read < 0) {
                if (this.d >= this.b.length - 1) {
                    return read;
                }
                this.d++;
                this.c = 0;
            } else {
                this.c++;
                return read;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabea02aa2ff806e9fca536eebd98027", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabea02aa2ff806e9fca536eebd98027")).intValue();
            }
            int read = this.b[this.d].read(bArr, i, i2);
            if (read < 0) {
                if (this.d >= this.b.length - 1) {
                    return read;
                }
                this.d++;
                this.c = 0;
            } else {
                this.c += read;
                return read;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8ff78fb884233e95ac6e47a97baa22b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8ff78fb884233e95ac6e47a97baa22b")).intValue() : read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54f9f73636532bbfabefb0e5eac8f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54f9f73636532bbfabefb0e5eac8f4c");
            return;
        }
        for (InputStream inputStream : this.b) {
            inputStream.reset();
        }
        this.c = 0;
        this.d = 0;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67a2fbc0bbf5c729e39c975ff4577ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67a2fbc0bbf5c729e39c975ff4577ed")).longValue();
        }
        throw new IOException("unsupported operation: skip");
    }
}
