package com.sankuai.meituan.retrofit2;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class w extends InputStream {
    public static ChangeQuickRedirect a;
    u b;
    private InputStream c;

    public w(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "025abbf1ae3048e06310e8e89999b3b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "025abbf1ae3048e06310e8e89999b3b9");
            return;
        }
        this.c = null;
        this.b = null;
        this.c = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7515721f76a3f093bd9d0bd0079ca864", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7515721f76a3f093bd9d0bd0079ca864")).intValue() : this.c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1baf8beb58cfd54a22c0b5d8b7bcac7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1baf8beb58cfd54a22c0b5d8b7bcac7");
            return;
        }
        this.c.close();
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c77e24ac0da16a3b345dbfe37aa4703", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c77e24ac0da16a3b345dbfe37aa4703");
        } else {
            this.c.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86da80187e42e3f17cffcf2bf21a16e1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86da80187e42e3f17cffcf2bf21a16e1")).booleanValue() : this.c.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19b6bf29842b3f8609d9d6e69101acca", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19b6bf29842b3f8609d9d6e69101acca")).intValue();
        }
        try {
            int read = this.c.read();
            if (this.b != null) {
                this.b.a(-1 != read ? 1 : -1);
            }
            return read;
        } catch (Throwable th) {
            if (this.b != null) {
                this.b.a(-1);
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read(@NonNull byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bdf37f00fc8b2321edf5874967f2ae2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bdf37f00fc8b2321edf5874967f2ae2")).intValue();
        }
        try {
            int read = this.c.read(bArr);
            if (this.b != null) {
                this.b.a(read);
            }
            return read;
        } catch (Throwable th) {
            if (this.b != null) {
                this.b.a(-1);
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b2319053ea59d09e763fb5c0df6e677", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b2319053ea59d09e763fb5c0df6e677")).intValue();
        }
        try {
            int read = this.c.read(bArr, i, i2);
            if (this.b != null) {
                this.b.a(read);
            }
            return read;
        } catch (Throwable th) {
            if (this.b != null) {
                this.b.a(-1);
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6045c264607805c8fabc4f97d30ded92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6045c264607805c8fabc4f97d30ded92");
        } else {
            this.c.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e835c6cc22c8113ddd239cb48b5cdc84", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e835c6cc22c8113ddd239cb48b5cdc84")).longValue() : this.c.skip(j);
    }
}
