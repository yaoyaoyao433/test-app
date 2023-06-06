package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m extends ByteArrayOutputStream {
    public static ChangeQuickRedirect a;
    private final f b;

    public m(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba4402664b9ed868964127feb8ed2810", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba4402664b9ed868964127feb8ed2810");
            return;
        }
        this.b = fVar;
        this.buf = this.b.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6babe07c9c8521385179cf4e75bf9afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6babe07c9c8521385179cf4e75bf9afb");
            return;
        }
        this.b.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07b0b2a2c8d7fa2cb2d78e77b4dae701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07b0b2a2c8d7fa2cb2d78e77b4dae701");
            return;
        }
        this.b.a(this.buf);
        super.finalize();
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97217c7532669fbf2628ce6fd45b8b32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97217c7532669fbf2628ce6fd45b8b32");
        } else if (this.count + i <= this.buf.length) {
        } else {
            byte[] a2 = this.b.a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a2, 0, this.count);
            this.b.a(this.buf);
            this.buf = a2;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122ccce430d319aea7d83ac02aaa7742", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122ccce430d319aea7d83ac02aaa7742");
            return;
        }
        a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b2f6aa0b53d2781bc538405d02e0d36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b2f6aa0b53d2781bc538405d02e0d36");
            return;
        }
        a(1);
        super.write(i);
    }
}
