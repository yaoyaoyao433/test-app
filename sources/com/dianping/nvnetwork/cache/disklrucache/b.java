package com.dianping.nvnetwork.cache.disklrucache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements Closeable {
    public static ChangeQuickRedirect a;
    final Charset b;
    int c;
    private final InputStream d;
    private byte[] e;
    private int f;

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
        Object[] objArr = {inputStream, charset};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bc99c900f7e95579b450ff3f1b01cdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bc99c900f7e95579b450ff3f1b01cdc");
        }
    }

    private b(InputStream inputStream, int i, Charset charset) {
        Object[] objArr = {inputStream, 8192, charset};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a772fedd5ed0021dbf111be29b6e05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a772fedd5ed0021dbf111be29b6e05");
        } else if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else {
            if (!charset.equals(c.b)) {
                throw new IllegalArgumentException("Unsupported encoding");
            }
            this.d = inputStream;
            this.b = charset;
            this.e = new byte[8192];
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9cb201fce718c2b8f27c6f001e9afd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9cb201fce718c2b8f27c6f001e9afd9");
            return;
        }
        synchronized (this.d) {
            if (this.e != null) {
                this.e = null;
                this.d.close();
            }
        }
    }

    public final String a() throws IOException {
        int i;
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff5a19e2720bbbe94d5d88e9c19d00da", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff5a19e2720bbbe94d5d88e9c19d00da");
        }
        synchronized (this.d) {
            if (this.e == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f >= this.c) {
                b();
            }
            for (int i3 = this.f; i3 != this.c; i3++) {
                if (this.e[i3] == 10) {
                    if (i3 != this.f) {
                        i2 = i3 - 1;
                        if (this.e[i2] == 13) {
                            String str = new String(this.e, this.f, i2 - this.f, this.b.name());
                            this.f = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    String str2 = new String(this.e, this.f, i2 - this.f, this.b.name());
                    this.f = i3 + 1;
                    return str2;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.c - this.f) + 80) { // from class: com.dianping.nvnetwork.cache.disklrucache.b.1
                public static ChangeQuickRedirect a;

                @Override // java.io.ByteArrayOutputStream
                public final String toString() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97a6d01fbb434128f7d94d1eb1d5159e", 6917529027641081856L)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97a6d01fbb434128f7d94d1eb1d5159e");
                    }
                    try {
                        return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, b.this.b.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byteArrayOutputStream.write(this.e, this.f, this.c - this.f);
                this.c = -1;
                b();
                i = this.f;
                while (i != this.c) {
                    if (this.e[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.f) {
                byteArrayOutputStream.write(this.e, this.f, i - this.f);
            }
            this.f = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    private void b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d2bef20b7eb2572d36097faf5ef69df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d2bef20b7eb2572d36097faf5ef69df");
            return;
        }
        int read = this.d.read(this.e, 0, this.e.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f = 0;
        this.c = read;
    }
}
