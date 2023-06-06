package com.sankuai.meituan.kernel.net.msi.progress;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends ap {
    public static ChangeQuickRedirect a;
    private final ap b;
    private final b c;
    private BufferedInputStream d;

    public c(ap apVar, b bVar) {
        Object[] objArr = {apVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dfff03987b7abcbde4d82263a0492b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dfff03987b7abcbde4d82263a0492b0");
            return;
        }
        this.b = apVar;
        this.c = bVar;
    }

    @Override // com.sankuai.meituan.retrofit2.ap
    public final String contentType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a0fed108509775ec2c9407d3689507", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a0fed108509775ec2c9407d3689507") : this.b.contentType();
    }

    @Override // com.sankuai.meituan.retrofit2.ap
    public final long contentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f1874afeda76fd9f0a46fb509e648f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f1874afeda76fd9f0a46fb509e648f")).longValue() : this.b.contentLength();
    }

    @Override // com.sankuai.meituan.retrofit2.ap
    public final InputStream source() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79897cc2464af93cf8a0f06894beb6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79897cc2464af93cf8a0f06894beb6c");
        }
        if (this.d == null) {
            final InputStream source = this.b.source();
            Object[] objArr2 = {source};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            this.d = new BufferedInputStream(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c793b724615d7b36d6e911dbb42c4332", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c793b724615d7b36d6e911dbb42c4332") : new InputStream() { // from class: com.sankuai.meituan.kernel.net.msi.progress.c.1
                public static ChangeQuickRedirect a;
                public long b = 0;

                @Override // java.io.InputStream
                public final int read() throws IOException {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "252344a2a6302ba101140ac577f7154b", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "252344a2a6302ba101140ac577f7154b")).intValue();
                    }
                    int read = source.read();
                    a(1L);
                    return read;
                }

                @Override // java.io.InputStream
                public final int read(byte[] bArr) throws IOException {
                    Object[] objArr3 = {bArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "352c9937c149455ddb350974890c9bb5", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "352c9937c149455ddb350974890c9bb5")).intValue();
                    }
                    int read = source.read(bArr);
                    a(read);
                    return read;
                }

                @Override // java.io.InputStream
                public final int read(byte[] bArr, int i, int i2) throws IOException {
                    Object[] objArr3 = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d8f37e6b9d30e42f3d7b773d44e615b6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d8f37e6b9d30e42f3d7b773d44e615b6")).intValue();
                    }
                    int read = source.read(bArr, i, i2);
                    a(read);
                    return read;
                }

                @Override // java.io.InputStream
                public final long skip(long j) throws IOException {
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14218f27406f2d505be7230e69b35d35", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14218f27406f2d505be7230e69b35d35")).longValue();
                    }
                    long skip = source.skip(j);
                    a(skip);
                    return skip;
                }

                private void a(long j) {
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "74e1203d319c101282076e288bbfb640", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "74e1203d319c101282076e288bbfb640");
                        return;
                    }
                    int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                    this.b += i != 0 ? j : 0L;
                    c.this.c.a(this.b, c.this.b.contentLength(), i == 0);
                }
            });
        }
        return this.d;
    }
}
