package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private long b;
    private byte c;
    private long d;
    private short e;
    private short f;
    private long g;

    public final long b() {
        return this.b;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab3401e4117ea04fe5ba5b59d4ab2ccd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab3401e4117ea04fe5ba5b59d4ab2ccd");
        } else {
            this.b = j;
        }
    }

    public final void a(byte b) {
        this.c = b;
    }

    public final long c() {
        return this.d;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e67eef67509d9f57fbea7f57c6fae02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e67eef67509d9f57fbea7f57c6fae02");
        } else {
            this.d = j;
        }
    }

    public final short d() {
        return this.e;
    }

    public final void a(short s) {
        this.e = s;
    }

    public final short e() {
        return this.f;
    }

    public final void b(short s) {
        this.f = s;
    }

    public final long f() {
        return this.g;
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8ecc8962894e46b8b6ca8470a3e5604", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8ecc8962894e46b8b6ca8470a3e5604");
        } else {
            this.g = j;
        }
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe28c98b69cd913babbb76f0512e756c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe28c98b69cd913babbb76f0512e756c");
        }
        a(26869817);
        d(this.b);
        c(this.c);
        d(this.d);
        d(this.e);
        d(this.f);
        d(this.g);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf839a73e993f7fced29785e9be9d9af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf839a73e993f7fced29785e9be9d9af");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = m();
        this.d = q();
        this.e = o();
        this.f = o();
        this.g = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c698ac6ae7c2fcb48d961c4a8f7839f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c698ac6ae7c2fcb48d961c4a8f7839f");
        }
        return "PPubOppositeSyncReadItem{chatId=" + this.b + ", type=" + ((int) this.c) + ", peerUid=" + this.d + ", peerAppId=" + ((int) this.e) + ", channel=" + ((int) this.f) + ", sts=" + this.g + '}';
    }
}
