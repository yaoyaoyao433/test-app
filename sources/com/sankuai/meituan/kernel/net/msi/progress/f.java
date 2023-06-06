package com.sankuai.meituan.kernel.net.msi.progress;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements ak {
    public static ChangeQuickRedirect a;
    private final ak b;
    private final e c;
    private BufferedOutputStream d;

    public f(ak akVar, e eVar) {
        Object[] objArr = {akVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a2755e2d9bc4962c0e5c741e261a3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a2755e2d9bc4962c0e5c741e261a3d");
            return;
        }
        this.b = akVar;
        this.c = eVar;
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final String contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5411bcf9d46b78332f2e96778ad9fd3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5411bcf9d46b78332f2e96778ad9fd3") : this.b.contentType();
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final long contentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a12e914757e75e2c68054dc8144e4625", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a12e914757e75e2c68054dc8144e4625")).longValue() : this.b.contentLength();
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final void writeTo(final OutputStream outputStream) throws IOException {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda3c994f7126f5e3336868d2f336a07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda3c994f7126f5e3336868d2f336a07");
            return;
        }
        if (this.d == null) {
            Object[] objArr2 = {outputStream};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.d = new BufferedOutputStream(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2008e353e15d542678dc6bd5ece3f45", RobustBitConfig.DEFAULT_VALUE) ? (OutputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2008e353e15d542678dc6bd5ece3f45") : new OutputStream() { // from class: com.sankuai.meituan.kernel.net.msi.progress.f.1
                public static ChangeQuickRedirect a;
                public long b = 0;
                public long c = 0;

                @Override // java.io.OutputStream
                public final void write(int i) throws IOException {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21967afd583c890483f766f9268f4be8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21967afd583c890483f766f9268f4be8");
                        return;
                    }
                    outputStream.write(i);
                    a(1L);
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr) throws IOException {
                    Object[] objArr3 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "572333a336e85aa950805310e61a9a28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "572333a336e85aa950805310e61a9a28");
                        return;
                    }
                    outputStream.write(bArr);
                    a(bArr.length);
                }

                @Override // java.io.OutputStream
                public final void write(byte[] bArr, int i, int i2) throws IOException {
                    Object[] objArr3 = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d8eef07266dd455e59570d8e1e1e42e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d8eef07266dd455e59570d8e1e1e42e");
                        return;
                    }
                    outputStream.write(bArr, i, i2);
                    a(i2);
                }

                private void a(long j) {
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "111269eff1938ac963825f09ed1021ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "111269eff1938ac963825f09ed1021ee");
                        return;
                    }
                    this.b += j;
                    if (this.c == 0) {
                        this.c = f.this.contentLength();
                    }
                    f.this.c.a(this.b, this.c, this.b == this.c);
                }
            });
        }
        this.b.writeTo(this.d);
        this.d.flush();
    }
}
