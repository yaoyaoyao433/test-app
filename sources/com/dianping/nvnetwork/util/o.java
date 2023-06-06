package com.dianping.nvnetwork.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class o extends InputStream {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f987319a73bc3bfa636976d88ab2aa7", 6917529027641081856L)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f987319a73bc3bfa636976d88ab2aa7");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c2810c0bb8ef56e8c2c0eb11cf2047", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c2810c0bb8ef56e8c2c0eb11cf2047")).intValue() : b().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2f86003131f9c09eb25b0d2f060b18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2f86003131f9c09eb25b0d2f060b18");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9abeefd3d25920540e69360ae516fe26", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9abeefd3d25920540e69360ae516fe26")).intValue() : b().read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d92347eda2cd2feb28f6c280a167145", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d92347eda2cd2feb28f6c280a167145")).intValue() : b().read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e55b617a21dd9edb127d6c7343e8f75f", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e55b617a21dd9edb127d6c7343e8f75f")).intValue() : b().read(bArr);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319033535186f54bd170f5f32a563083", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319033535186f54bd170f5f32a563083")).longValue() : b().skip(j);
    }
}
