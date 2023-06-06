package com.dianping.nvnetwork.http.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends InputStream {
    public static ChangeQuickRedirect e;
    private InputStream a;
    private int b;
    private int c;
    InterfaceC0098a f;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvnetwork.http.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0098a {
        void a(int i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public a(InputStream inputStream, int i) {
        Object[] objArr = {inputStream, 4096};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04ad1f42beb388c950004ca52baf29d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04ad1f42beb388c950004ca52baf29d");
            return;
        }
        this.a = inputStream;
        this.c = 4096;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0b072971a884d55a111fe0eb87ad5f", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0b072971a884d55a111fe0eb87ad5f")).intValue() : this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63d885a9b5cf2f46f3af0d377a757be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63d885a9b5cf2f46f3af0d377a757be");
        } else {
            this.a.close();
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdaa3996bd239b28ff8aa576da70368d", 6917529027641081856L)) {
            throw new UnsupportedOperationException();
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdaa3996bd239b28ff8aa576da70368d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r2 > r11.c) goto L11;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read() throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.nvnetwork.http.impl.a.e
            java.lang.String r10 = "9eb9bd84c017918a996e24054d03c6d8"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L1f:
            java.io.InputStream r1 = r11.a
            int r1 = r1.read()
            if (r1 < 0) goto L31
            int r2 = r11.b
            int r2 = r2 + 1
            r11.b = r2
            int r3 = r11.c
            if (r2 <= r3) goto L3e
        L31:
            int r2 = r11.b
            r11.b = r0
            com.dianping.nvnetwork.http.impl.a$a r0 = r11.f
            if (r0 == 0) goto L3e
            com.dianping.nvnetwork.http.impl.a$a r0 = r11.f
            r0.a(r2)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.http.impl.a.read():int");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68fc26e0d4e82da371dc8be74b907ed0", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68fc26e0d4e82da371dc8be74b907ed0")).intValue();
        }
        int read = this.a.read(bArr, i, i2);
        if (read < 0) {
            int i3 = this.b;
            this.b = 0;
            if (this.f != null) {
                this.f.a(i3);
            }
            return read;
        }
        this.b += read;
        if (read < 2048 && available() == 0) {
            int i4 = this.b;
            this.b = 0;
            if (this.f != null) {
                this.f.a(i4);
            }
        }
        if (this.b > this.c) {
            int i5 = this.b;
            this.b %= this.c;
            if (this.f != null) {
                this.f.a(i5 - this.b);
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eedef86441b70bb64352ea577afc84f5", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eedef86441b70bb64352ea577afc84f5")).intValue() : read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24209160f732beb3dcf7c6f3ab296070", 6917529027641081856L)) {
            throw new IOException("not supported operation: reset");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24209160f732beb3dcf7c6f3ab296070");
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e5979a191d5e537c4292d41b205a42", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e5979a191d5e537c4292d41b205a42")).longValue();
        }
        throw new IOException("not supported operation: skip");
    }
}
