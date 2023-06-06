package com.meituan.android.customerservice.channel.upload;

import com.facebook.react.modules.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.u;
import com.squareup.okhttp.y;
import java.io.IOException;
import okio.m;
import okio.r;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends y {
    public static ChangeQuickRedirect a;
    final i b;
    private final y c;
    private okio.d d;
    private long e;

    public b(y yVar, i iVar) {
        Object[] objArr = {yVar, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d2a6ddde5fc81121a18de0aa497c11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d2a6ddde5fc81121a18de0aa497c11");
            return;
        }
        this.e = 0L;
        this.c = yVar;
        this.b = iVar;
    }

    @Override // com.squareup.okhttp.y
    public final u contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b115cee1ce8457a4b9f22104f080dff", RobustBitConfig.DEFAULT_VALUE) ? (u) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b115cee1ce8457a4b9f22104f080dff") : this.c.contentType();
    }

    @Override // com.squareup.okhttp.y
    public final long contentLength() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569326535bd2561fa534da47afd8add0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569326535bd2561fa534da47afd8add0")).longValue();
        }
        if (this.e == 0) {
            this.e = this.c.contentLength();
        }
        return this.e;
    }

    @Override // com.squareup.okhttp.y
    public final void writeTo(okio.d dVar) throws IOException {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ef312f0262aa54d7a18b154ddf3395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ef312f0262aa54d7a18b154ddf3395");
            return;
        }
        if (this.d == null) {
            Object[] objArr2 = {dVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.d = m.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e88517260c5a0ed1b71c777862e9b64", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e88517260c5a0ed1b71c777862e9b64") : m.a(new com.facebook.react.modules.network.b(dVar.b()) { // from class: com.meituan.android.customerservice.channel.upload.b.1
                public static ChangeQuickRedirect b;

                @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
                public final void write(byte[] bArr, int i, int i2) throws IOException {
                    Object[] objArr3 = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff336eec74c8be93cfa0f613b14032cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff336eec74c8be93cfa0f613b14032cc");
                        return;
                    }
                    super.write(bArr, i, i2);
                    b();
                }

                @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
                public final void write(int i) throws IOException {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b52a50ac50452a7a8e202e2bf9be0182", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b52a50ac50452a7a8e202e2bf9be0182");
                        return;
                    }
                    super.write(i);
                    b();
                }

                private void b() throws IOException {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8f57bbc500c973eef0ecb076849693b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8f57bbc500c973eef0ecb076849693b2");
                        return;
                    }
                    long a2 = a();
                    long contentLength = b.this.contentLength();
                    b.this.b.a(a2, contentLength, a2 == contentLength);
                }
            }));
        }
        contentLength();
        this.c.writeTo(this.d);
        this.d.flush();
    }
}
