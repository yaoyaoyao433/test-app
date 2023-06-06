package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends FilterInputStream {
    public static ChangeQuickRedirect a;
    private long b;
    private long c;

    public d(InputStream inputStream) {
        super(inputStream);
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c00714b14f3151f453079609f4017d2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c00714b14f3151f453079609f4017d2f");
        } else {
            this.c = -1L;
        }
    }

    public final long a() {
        return this.b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0275da85f21334b158df6279be98a3f7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0275da85f21334b158df6279be98a3f7")).intValue();
        }
        int read = this.in.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb072913395b4a2a2d25ac63f6b061f9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb072913395b4a2a2d25ac63f6b061f9")).intValue();
        }
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c90a4cb490e0c0ce6423844ade96a279", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c90a4cb490e0c0ce6423844ade96a279")).longValue();
        }
        long skip = this.in.skip(j);
        this.b += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c60193e4337c3d383128ffe1b9f6654d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c60193e4337c3d383128ffe1b9f6654d");
            return;
        }
        this.in.mark(i);
        this.c = this.b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a1c0cbdc957c03fba3213d5f9420735", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a1c0cbdc957c03fba3213d5f9420735");
        } else if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else {
            if (this.c == -1) {
                throw new IOException("Mark not set");
            }
            this.in.reset();
            this.b = this.c;
        }
    }
}
