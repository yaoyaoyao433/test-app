package com.sankuai.xm.protobase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements b<com.sankuai.xm.login.net.mempool.heap.b> {
    public static ChangeQuickRedirect a;
    private int[] b;
    private int[] c;
    private int d;
    private int e;
    private int f;

    @Override // com.sankuai.xm.protobase.utils.b
    public final boolean b() {
        return false;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f02c64077921f944abdd457e599fa53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f02c64077921f944abdd457e599fa53");
            return;
        }
        this.b = new int[256];
        this.c = new int[256];
        this.e = 0;
        this.f = 0;
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final /* synthetic */ com.sankuai.xm.login.net.mempool.heap.b a(com.sankuai.xm.login.net.mempool.heap.b bVar) {
        com.sankuai.xm.login.net.mempool.heap.b bVar2 = bVar;
        char c = 1;
        char c2 = 0;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae278d40da91d4af10717d0aa62c9855", 6917529027641081856L)) {
            return (com.sankuai.xm.login.net.mempool.heap.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae278d40da91d4af10717d0aa62c9855");
        }
        Object[] objArr2 = {bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "355fb81edc4645df014ee9f982124699", 6917529027641081856L)) {
            return (com.sankuai.xm.login.net.mempool.heap.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "355fb81edc4645df014ee9f982124699");
        }
        int i = this.e;
        int i2 = this.f;
        int g = bVar2.g();
        int i3 = 0;
        while (i3 < g) {
            int i4 = (i + 1) & 255;
            int i5 = (i2 + this.b[i4]) & 255;
            int i6 = this.b[i4];
            int[] iArr = this.b;
            iArr[i4] = iArr[i5];
            this.b[i5] = i6;
            byte g2 = (byte) (this.b[(this.b[i4] + this.b[i5]) & 255] ^ bVar2.g(i3));
            Object[] objArr3 = new Object[2];
            objArr3[c2] = Integer.valueOf(i3);
            objArr3[c] = Byte.valueOf(g2);
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.login.net.mempool.heap.b.l;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "19938f0e236adba0236fba3f6bc330fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "19938f0e236adba0236fba3f6bc330fe");
            } else {
                bVar2.e(i3);
                com.sankuai.xm.login.net.mempool.base.b<ByteBuffer>.a f = bVar2.f(i3);
                f.b.a(f.d, g2);
            }
            i3++;
            i = i4;
            i2 = i5;
            c = 1;
            c2 = 0;
        }
        this.e = i;
        this.f = i2;
        return bVar2;
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c2e3c1a4d813892e69f2495ec55f871", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c2e3c1a4d813892e69f2495ec55f871");
        } else if (bArr.length > 0 && bArr.length <= 256) {
            this.d = bArr.length;
            for (int i = 0; i < 256; i++) {
                this.b[i] = i;
                this.c[i] = bArr[i % this.d];
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 256; i3++) {
                i2 = ((i2 + this.b[i3]) + this.c[i3]) % 256;
                int i4 = this.b[i3];
                int[] iArr = this.b;
                iArr[i3] = iArr[i2];
                this.b[i2] = i4;
            }
        }
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final byte[] b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b685b1fb26202d5ecdf296c2fc95a0f", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b685b1fb26202d5ecdf296c2fc95a0f");
        }
        if (bArr == null) {
            return bArr;
        }
        int i = this.e;
        int i2 = this.f;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.b[i]) & 255;
            int i4 = this.b[i];
            int[] iArr = this.b;
            iArr[i] = iArr[i2];
            this.b[i2] = i4;
            bArr[i3] = (byte) (this.b[(this.b[i] + this.b[i2]) & 255] ^ bArr[i3]);
        }
        this.e = i;
        this.f = i2;
        return bArr;
    }

    @Override // com.sankuai.xm.protobase.utils.b
    public final byte[] c(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848eea66251f894437cf8fb04b9d6d8f", 6917529027641081856L) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848eea66251f894437cf8fb04b9d6d8f") : b(bArr);
    }
}
