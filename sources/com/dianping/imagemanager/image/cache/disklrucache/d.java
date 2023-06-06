package com.dianping.imagemanager.image.cache.disklrucache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements Closeable {
    public static ChangeQuickRedirect a;
    final Charset b;
    int c;
    private final InputStream d;
    private byte[] e;
    private int f;

    public d(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
        Object[] objArr = {inputStream, charset};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89fc58e129efe454411f42202ab43863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89fc58e129efe454411f42202ab43863");
        }
    }

    private d(InputStream inputStream, int i, Charset charset) {
        Object[] objArr = {inputStream, 8192, charset};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d25811a531f5bd744aef005048a2a98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d25811a531f5bd744aef005048a2a98");
        } else if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else {
            if (!charset.equals(e.b)) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ccb3a53d5876d05cf70f67377a66796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ccb3a53d5876d05cf70f67377a66796");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6662e7732fae3589d880f3f3bb3041ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6662e7732fae3589d880f3f3bb3041ab");
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
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.c - this.f) + 80) { // from class: com.dianping.imagemanager.image.cache.disklrucache.d.1
                public static ChangeQuickRedirect a;

                @Override // java.io.ByteArrayOutputStream
                public final String toString() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6efa577fe6d480bf8441dc5bcf389cff", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6efa577fe6d480bf8441dc5bcf389cff");
                    }
                    try {
                        return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, d.this.b.name());
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e22689487c403bd8a31af7ec0e13f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e22689487c403bd8a31af7ec0e13f45");
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
