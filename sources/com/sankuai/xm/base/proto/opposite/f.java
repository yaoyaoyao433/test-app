package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private long b;
    private byte c;
    private short d;
    private short e;
    private long[] f;

    public final long b() {
        return this.b;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8f0f34989df969363ca35025bf958e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8f0f34989df969363ca35025bf958e");
        } else {
            this.b = j;
        }
    }

    public final void a(byte b) {
        this.c = b;
    }

    public final short c() {
        return this.d;
    }

    public final void a(short s) {
        this.d = s;
    }

    public final short d() {
        return this.e;
    }

    public final void b(short s) {
        this.e = s;
    }

    public final long[] e() {
        return this.f;
    }

    public final void a(long[] jArr) {
        this.f = jArr;
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad1ebbf82f6936b5d1883eaec781567", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad1ebbf82f6936b5d1883eaec781567");
        }
        a(26279981);
        d(this.b);
        c(this.c);
        d(this.d);
        d(this.e);
        b(this.f);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcefc401fcfc334e589307b2f8482ac1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcefc401fcfc334e589307b2f8482ac1");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = m();
        this.d = o();
        this.e = o();
        this.f = s();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da88e560b6b5e75c011bfa4d62bfbecc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da88e560b6b5e75c011bfa4d62bfbecc");
        }
        return "PIMOppositeSyncReadItem{chatId=" + this.b + ", type=" + ((int) this.c) + ", peerAppId=" + ((int) this.d) + ", channel=" + ((int) this.e) + ", msgIds=" + this.f + '}';
    }
}
