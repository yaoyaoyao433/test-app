package com.sankuai.xm.base.proto.opposite.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends g {
    public static ChangeQuickRedirect a;
    private long b;
    private byte c;
    private short d;
    private short e;
    private long[] f;
    private String g;

    public final long b() {
        return this.b;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f6e4e14a830bff45cc64a8f966e1c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f6e4e14a830bff45cc64a8f966e1c0");
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

    public final String f() {
        return this.g;
    }

    public final void a(String str) {
        this.g = str;
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d798a9b09467db148d8acd7f658ded", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d798a9b09467db148d8acd7f658ded");
        }
        a(26279991);
        d(this.b);
        c(this.c);
        d(this.d);
        d(this.e);
        b(this.f);
        c(this.g);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "724039f9b04757a1a5207ac08898aa7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "724039f9b04757a1a5207ac08898aa7e");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = m();
        this.d = o();
        this.e = o();
        this.f = s();
        this.g = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2b0d69310eb67a39a46e00336d86ed6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2b0d69310eb67a39a46e00336d86ed6");
        }
        return "PIMOppositeSyncReadItem2{chatId=" + this.b + ", type=" + ((int) this.c) + ", peerAppId=" + ((int) this.d) + ", channel=" + ((int) this.e) + ", msgIds=" + this.f + '}';
    }
}
