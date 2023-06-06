package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends b {
    public static ChangeQuickRedirect C;
    private long D;
    private String E;
    private byte F;
    private long[] G;

    public final long B() {
        return this.D;
    }

    public final String C() {
        return this.E;
    }

    public final byte D() {
        return this.F;
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf568a82468fcf9b6512d143450a26c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf568a82468fcf9b6512d143450a26c");
        }
        z().a(26279939);
        z().c(this.b);
        z().c(this.c);
        z().d(this.d);
        z().d(this.f);
        z().c(this.g);
        z().b(this.h);
        z().c(this.i);
        z().c(this.j);
        z().d(this.k);
        z().d(this.l);
        z().c(this.m);
        z().d(this.n);
        z().c(this.o);
        z().c(this.p);
        z().a(Boolean.valueOf(this.q));
        z().d(this.r);
        z().d(this.z);
        z().c(this.A);
        z().c(A());
        z().d(this.D);
        z().c(this.E);
        z().c(this.F);
        z().b(this.G);
        return z().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc05fc09c3112f10d26ed7377a43422d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc05fc09c3112f10d26ed7377a43422d");
            return;
        }
        z().a(bArr);
        this.b = z().m();
        this.c = z().r();
        this.d = z().q();
        this.f = z().q();
        this.g = z().p();
        this.h = z().n();
        this.i = z().r();
        this.j = z().r();
        this.k = z().q();
        this.l = z().q();
        this.m = z().r();
        this.n = z().q();
        this.o = z().m();
        this.p = z().p();
        this.q = z().l().booleanValue();
        this.r = z().o();
        this.z = z().q();
        this.A = z().r();
        f(z().r());
        this.D = z().q();
        this.E = z().r();
        this.F = z().m();
        this.G = z().s();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4de9edc9bdb5b054abd51299722c2bf3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4de9edc9bdb5b054abd51299722c2bf3");
        }
        return "PIMSendGroupMsgReq{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toGuid=" + this.f + ", type=" + this.g + ", message=" + Arrays.toString(this.h) + ", fromName='" + this.i + "', groupName='" + this.j + "', cts=" + this.k + ", msgId=" + this.l + ", extension='" + this.m + "', retries=" + ((int) this.o) + ", receipt=" + this.q + ", channel=" + ((int) this.r) + ", sessionSeqId=" + this.z + ", deviceId=" + A() + ", fromPubId=" + this.D + ", fromPubName='" + this.E + "', msgSourceType=" + ((int) this.F) + ", receiveUids=" + Arrays.toString(this.G) + '}';
    }
}
