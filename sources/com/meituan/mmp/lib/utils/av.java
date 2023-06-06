package com.meituan.mmp.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class av extends InputStream {
    public static ChangeQuickRedirect a;
    public Enumeration<? extends InputStream> b;
    public InputStream c;

    public av(Enumeration<? extends InputStream> enumeration) {
        Object[] objArr = {enumeration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c8153cacd9979b769cccdfcbac045e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c8153cacd9979b769cccdfcbac045e");
            return;
        }
        this.b = enumeration;
        b();
    }

    private void a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b478343be891c09c111df314dea944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b478343be891c09c111df314dea944");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb4a055ac7315802dd1da90adcfa2cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb4a055ac7315802dd1da90adcfa2cc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db484d4aeb84a02979f443d1b40a9b30", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db484d4aeb84a02979f443d1b40a9b30")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f1e967e931958a7976a2d0a400aa7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f1e967e931958a7976a2d0a400aa7b")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e86312c66f88a778e35ed7c0443cfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e86312c66f88a778e35ed7c0443cfb")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b491b8b91b1f691ceb59a8b6957319bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b491b8b91b1f691ceb59a8b6957319bb");
            return;
        }
        do {
            a();
        } while (this.c != null);
    }
}
