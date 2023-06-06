package com.meituan.msc.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class as extends InputStream {
    public static ChangeQuickRedirect a;
    public Enumeration<? extends InputStream> b;
    public InputStream c;

    public as(Enumeration<? extends InputStream> enumeration) {
        Object[] objArr = {enumeration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55aaca8e089f65259b371bf8ca62524e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55aaca8e089f65259b371bf8ca62524e");
            return;
        }
        this.b = enumeration;
        b();
    }

    private void a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d99d2786579203204c56ae1decd50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d99d2786579203204c56ae1decd50a");
            return;
        }
        if (this.c != null) {
            this.c.close();
        }
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c276dde24b636a0cb2eb6ff3a8f37ce6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c276dde24b636a0cb2eb6ff3a8f37ce6");
        } else if (this.b.hasMoreElements()) {
            this.c = this.b.nextElement();
            if (this.c == null) {
                throw new NullPointerException();
            }
        } else {
            this.c = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fcc97d1b52001a4b6d86c18a7d71ad4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fcc97d1b52001a4b6d86c18a7d71ad4")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecffae707bd7e3b43e3708519393bef6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecffae707bd7e3b43e3708519393bef6")).intValue();
        }
        while (this.c != null) {
            int read = this.c.read();
            if (read != -1) {
                return read;
            }
            a();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5713fb688e31684d0c7e82811afa480", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5713fb688e31684d0c7e82811afa480")).intValue();
        }
        if (this.c == null) {
            return -1;
        }
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int read = this.c.read(bArr, i, i2);
            if (read > 0) {
                return read;
            }
            a();
        } while (this.c != null);
        return -1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0dfba38e0b217045b665396069e7bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0dfba38e0b217045b665396069e7bc");
            return;
        }
        do {
            a();
        } while (this.c != null);
    }
}
