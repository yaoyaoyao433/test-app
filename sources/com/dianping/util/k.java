package com.dianping.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class k extends InputStream {
    public static ChangeQuickRedirect c;
    private InputStream a;
    private IOException b;

    public abstract InputStream a() throws IOException;

    @Override // java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    private synchronized InputStream b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d043b5319fe3e0d6a3a5e201beb56b", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d043b5319fe3e0d6a3a5e201beb56b");
        } else if (this.b != null) {
            throw this.b;
        } else {
            if (this.a == null) {
                try {
                    this.a = a();
                } catch (IOException e) {
                    this.b = e;
                    throw this.b;
                }
            }
            return this.a;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf0adcebd959f58ce643a18d5f1f81df", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf0adcebd959f58ce643a18d5f1f81df")).intValue() : b().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45dee7edc4db7bf677f4c77939c38151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45dee7edc4db7bf677f4c77939c38151");
        } else if (this.a == null) {
        } else {
            b().close();
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.a = null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f14d9d56d2c1effaaa328f187d16cff8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f14d9d56d2c1effaaa328f187d16cff8")).intValue() : b().read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "304a41d26bcddbc867ace6e6557828cb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "304a41d26bcddbc867ace6e6557828cb")).intValue() : b().read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd40b6e7755e814a95fa8d23681799f3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd40b6e7755e814a95fa8d23681799f3")).intValue() : b().read(bArr);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83bbbdcd3923681b41be03a56d74cbe", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83bbbdcd3923681b41be03a56d74cbe")).longValue() : b().skip(j);
    }
}
