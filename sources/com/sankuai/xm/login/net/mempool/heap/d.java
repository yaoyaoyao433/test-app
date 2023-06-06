package com.sankuai.xm.login.net.mempool.heap;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.login.net.mempool.base.h;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends com.sankuai.xm.login.net.mempool.base.d<ByteBuffer> {
    public static ChangeQuickRedirect f;

    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final /* synthetic */ ByteBuffer e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d2044598bd1a10776859a10c98b5c7", 6917529027641081856L) ? (ByteBuffer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d2044598bd1a10776859a10c98b5c7") : ByteBuffer.allocate(this.d);
    }

    public static d d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c66cfb7c1cc3a054588060ae0b5875b0", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c66cfb7c1cc3a054588060ae0b5875b0") : new d(i);
    }

    public d(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ec74ef6d24e03f7edd32f296f85dfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ec74ef6d24e03f7edd32f296f85dfd");
        }
    }

    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52198a5b4a39c150e5a48b4e1bbebc34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52198a5b4a39c150e5a48b4e1bbebc34");
            return;
        }
        super.a();
        d().clear();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final int a(h<ByteBuffer> hVar) throws IOException {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98dccfaec6b33591f076262ee2003929", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98dccfaec6b33591f076262ee2003929")).intValue() : hVar.a(this.e);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final int b(h<ByteBuffer> hVar) throws IOException {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d4133e245cce05bb4914480992a3ce8", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d4133e245cce05bb4914480992a3ce8")).intValue() : hVar.b(this.e);
    }

    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final void a(int i, byte b) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490ccb39d4e39d100e5876b8fd404adf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490ccb39d4e39d100e5876b8fd404adf");
        } else {
            ((ByteBuffer) this.e).put(i, b);
        }
    }

    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final byte a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33833462362923c2aa3a76161d4b7420", 6917529027641081856L) ? ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33833462362923c2aa3a76161d4b7420")).byteValue() : ((ByteBuffer) this.e).get(i);
    }

    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a875524066d934e74cbfd397c088f4f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a875524066d934e74cbfd397c088f4f1");
        } else {
            ((ByteBuffer) this.e).position(((ByteBuffer) this.e).position() + i);
        }
    }

    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f972ab04629e0ccbb0add7817e526f2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f972ab04629e0ccbb0add7817e526f2a");
        } else {
            ((ByteBuffer) this.e).position(i);
        }
    }

    @Override // com.sankuai.xm.login.net.mempool.base.d
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c3aa141b59215a999c7c87cd9ee735", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c3aa141b59215a999c7c87cd9ee735")).intValue() : ((ByteBuffer) this.e).remaining();
    }
}
