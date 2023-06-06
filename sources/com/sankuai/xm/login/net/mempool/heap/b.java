package com.sankuai.xm.login.net.mempool.heap;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.login.net.mempool.base.b;
import com.sankuai.xm.login.net.mempool.base.g;
import com.sankuai.xm.login.net.mempool.base.h;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends g<ByteBuffer> {
    public static ChangeQuickRedirect l;
    protected ByteOrder m;

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final /* synthetic */ int a(Object obj, int i) {
        int i2;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        Object[] objArr = {byteBuffer, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2d8ccd406f420cb149883e3acf6165", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2d8ccd406f420cb149883e3acf6165")).intValue();
        }
        if (i > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        com.sankuai.xm.login.net.mempool.base.d<ByteBuffer> dVar = k().b;
        int i3 = 0;
        int i4 = 0;
        while (dVar != null) {
            if (dVar.d().remaining() < i) {
                int remaining = dVar.d().remaining();
                i2 = i - dVar.d().remaining();
                i = remaining;
            } else {
                i2 = 0;
            }
            i3 += i;
            byteBuffer.put(dVar.d().array(), dVar.d().position(), i);
            i4 += i;
            dVar = dVar.b();
            if (i2 <= 0) {
                break;
            }
            i = i2;
        }
        d(i4);
        return i3;
    }

    public b(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae5727b6e154100f8bcad4393dcd484", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae5727b6e154100f8bcad4393dcd484");
        } else {
            this.m = ByteOrder.BIG_ENDIAN;
        }
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc6f3ef5e8187ba4e2f9c934548cfd70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc6f3ef5e8187ba4e2f9c934548cfd70");
            return;
        }
        super.e();
        com.sankuai.xm.login.net.mempool.base.d dVar = this.g;
        int b = b();
        while (true) {
            if (dVar == null) {
                break;
            }
            ((ByteBuffer) dVar.d()).clear();
            if (b <= dVar.c()) {
                ((ByteBuffer) dVar.d()).limit(b);
                dVar = dVar.b();
                break;
            }
            b -= dVar.c();
            dVar = dVar.b();
        }
        while (dVar != null) {
            ((ByteBuffer) dVar.d()).limit(0);
            dVar = dVar.b();
        }
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67252b59ef863ce4fd070dddb248f16e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67252b59ef863ce4fd070dddb248f16e");
            return;
        }
        b(c());
        super.f();
    }

    public final void a(ByteOrder byteOrder) {
        Object[] objArr = {byteOrder};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a906e7d5b253616dccce8e03a8d3c29e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a906e7d5b253616dccce8e03a8d3c29e");
            return;
        }
        this.m = byteOrder;
        for (com.sankuai.xm.login.net.mempool.base.d dVar = this.g; dVar != null; dVar = dVar.b()) {
            ((ByteBuffer) dVar.d()).order(byteOrder);
        }
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864c9e14e0b108074ea24e3b1fb0e528", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864c9e14e0b108074ea24e3b1fb0e528");
            return;
        }
        super.b(i);
        for (com.sankuai.xm.login.net.mempool.base.d dVar = this.g; dVar != null; dVar = dVar.b()) {
            if (dVar.c() >= i) {
                ((ByteBuffer) dVar.d()).limit(i);
                for (com.sankuai.xm.login.net.mempool.base.d b = dVar.b(); b != null; b = b.b()) {
                    ((ByteBuffer) b.d()).limit(0);
                }
                return;
            }
            ((ByteBuffer) dVar.d()).limit(((ByteBuffer) dVar.d()).capacity());
            i -= dVar.c();
        }
        throw new IndexOutOfBoundsException("no more pages");
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final byte n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d798a033fb911671f32649f0b50ded2d", 6917529027641081856L)) {
            return ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d798a033fb911671f32649f0b50ded2d")).byteValue();
        }
        com.sankuai.xm.login.net.mempool.base.b<ByteBuffer>.a k = k();
        byte a = k.b.a(k.d);
        i();
        return a;
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final void a(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d8c044949c760b5c5303a39c5fb0f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d8c044949c760b5c5303a39c5fb0f3");
            return;
        }
        com.sankuai.xm.login.net.mempool.base.b<ByteBuffer>.a k = k();
        k.b.a(k.d, b);
        j();
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final byte g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c0be8a3859d4b7a5873b63848b1e167", 6917529027641081856L)) {
            return ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c0be8a3859d4b7a5873b63848b1e167")).byteValue();
        }
        e(i);
        com.sankuai.xm.login.net.mempool.base.b<ByteBuffer>.a f = f(i);
        return f.b.a(f.d);
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final byte h(int i) {
        com.sankuai.xm.login.net.mempool.base.b<ByteBuffer>.a f = f(i);
        return f.b.a(f.d);
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final void l() {
        com.sankuai.xm.login.net.mempool.base.b<T>.a aVar;
        com.sankuai.xm.login.net.mempool.base.b<T>.a aVar2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1430e42f286d0a6f4b86967caf1f56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1430e42f286d0a6f4b86967caf1f56");
            return;
        }
        int i = this.d;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = l;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4934ca8063d6f29f4fa643bab60026e", 6917529027641081856L)) {
            if (i < 0 || i > this.c) {
                throw new IndexOutOfBoundsException("index=" + i + " out of bounds (limit=" + this.c + CommonConstant.Symbol.BRACKET_RIGHT);
            }
            com.sankuai.xm.login.net.mempool.base.d dVar = this.g;
            int i2 = 0;
            while (dVar != null) {
                if (dVar.c() + i2 > i) {
                    aVar = new b.a();
                    aVar.b = dVar;
                    aVar.c = i2;
                    aVar.d = i - i2;
                } else if (dVar.c() + i2 == i && dVar.b() == null) {
                    aVar = new b.a();
                    aVar.b = dVar;
                    aVar.c = i2;
                    aVar.d = i - i2;
                } else {
                    ((ByteBuffer) dVar.d()).position(((ByteBuffer) dVar.d()).capacity());
                    i2 += dVar.c();
                    dVar = dVar.b();
                }
                while (dVar != null) {
                    ((ByteBuffer) dVar.d()).position(0);
                    dVar = dVar.b();
                }
                aVar2 = aVar;
            }
            throw new IndexOutOfBoundsException("no more pages");
        }
        aVar2 = (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4934ca8063d6f29f4fa643bab60026e");
        this.i = aVar2;
        m();
    }

    public final com.sankuai.xm.login.net.mempool.base.b<ByteBuffer> a(com.sankuai.xm.login.net.mempool.base.b<ByteBuffer> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e936bbefb27ca2af9a8a72d307c16d27", 6917529027641081856L)) {
            return (com.sankuai.xm.login.net.mempool.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e936bbefb27ca2af9a8a72d307c16d27");
        }
        if (bVar == this) {
            throw new IllegalArgumentException();
        }
        int g = bVar.g();
        if (g > g()) {
            throw new BufferOverflowException();
        }
        com.sankuai.xm.login.net.mempool.base.d<ByteBuffer> dVar = f(c()).b;
        int i = 0;
        while (dVar != null) {
            int min = Math.min(dVar.d().remaining(), g - i);
            int a = bVar.a((com.sankuai.xm.login.net.mempool.base.b<ByteBuffer>) dVar.d(), min);
            i += a;
            if (a >= min) {
                dVar = dVar.b();
                continue;
            }
            if (i >= g) {
                break;
            }
        }
        b(i, false);
        return this;
    }

    @Override // com.sankuai.xm.login.net.mempool.base.b
    public final com.sankuai.xm.login.net.mempool.base.b<ByteBuffer> a(com.sankuai.xm.login.net.mempool.base.b<ByteBuffer> bVar, int i, int i2) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d9bf577b989a7582d548cae20811a6", 6917529027641081856L)) {
            return (com.sankuai.xm.login.net.mempool.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d9bf577b989a7582d548cae20811a6");
        }
        a(i, i2, bVar.b());
        int c = bVar.c();
        int d = bVar.d();
        bVar.b(i2 + i);
        bVar.a(i);
        a(bVar);
        bVar.b(d);
        bVar.a(c);
        return this;
    }

    public final int r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9560c67c932750af381924300a11a91", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9560c67c932750af381924300a11a91")).intValue();
        }
        int c = c(4);
        byte b = this.m == ByteOrder.BIG_ENDIAN ? (byte) 1 : (byte) 0;
        Object[] objArr2 = {this, Integer.valueOf(c), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.login.net.mempool.utils.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f79cdcbf6dde21af2cdc26451fcc9a86", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f79cdcbf6dde21af2cdc26451fcc9a86")).intValue();
        }
        if (b != 0) {
            Object[] objArr3 = {this, Integer.valueOf(c)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.login.net.mempool.utils.a.a;
            return PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5fa7f395013069a06c21a712d038ba39", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5fa7f395013069a06c21a712d038ba39")).intValue() : com.sankuai.xm.login.net.mempool.utils.a.a(h(c), h(c + 1), h(c + 2), h(c + 3));
        }
        Object[] objArr4 = {this, Integer.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.login.net.mempool.utils.a.a;
        return PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "894826f0b8595c80411be961a38e4c34", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "894826f0b8595c80411be961a38e4c34")).intValue() : com.sankuai.xm.login.net.mempool.utils.a.a(h(c + 3), h(c + 2), h(c + 1), h(c));
    }

    public final int a(h<ByteBuffer> hVar) throws IOException {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd78a09da00d49b1d3961012e2e93fa2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd78a09da00d49b1d3961012e2e93fa2")).intValue();
        }
        if (h()) {
            com.sankuai.xm.login.net.mempool.base.d<ByteBuffer> dVar = k().b;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (dVar != null) {
                    int f = dVar.f();
                    if (f > 0) {
                        i2 = dVar.b(hVar);
                        if (i2 > 0) {
                            i += i2;
                            if (i2 < f) {
                                break;
                            }
                            dVar = dVar.b();
                            if (i >= g()) {
                                break;
                            }
                        } else {
                            com.sankuai.xm.login.d.d("TiBuffer::write:: write(stream): %s", Integer.valueOf(i2));
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            com.sankuai.xm.login.d.a("TiBuffer::write:: write: %s, position: %s, limit: %s, remain: %s", Integer.valueOf(i), Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(g()));
            if (i > 0) {
                b(i, false);
            }
            return i2 < 0 ? i2 : i;
        }
        return 0;
    }

    public final int b(h<ByteBuffer> hVar) throws IOException {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d286f7108fe340ef5ef5360ccf4070fb", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d286f7108fe340ef5ef5360ccf4070fb")).intValue();
        }
        if (h()) {
            com.sankuai.xm.login.net.mempool.base.d<ByteBuffer> dVar = k().b;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (dVar != null) {
                    int f = dVar.f();
                    if (f > 0) {
                        i2 = dVar.a(hVar);
                        if (i2 >= 0) {
                            i += i2;
                            if (i2 < f) {
                                break;
                            }
                            dVar = dVar.b();
                            if (i >= g()) {
                                break;
                            }
                        } else {
                            com.sankuai.xm.login.d.d("TiBuffer::read:: read(stream): %s", Integer.valueOf(i2));
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            com.sankuai.xm.login.d.a("TiBuffer::read:: read: %s, position: %s, limit: %s", Integer.valueOf(i), Integer.valueOf(this.d), Integer.valueOf(this.c));
            if (i > 0) {
                a(i, false);
            }
            return i2 < 0 ? i2 : i;
        }
        return 0;
    }
}
