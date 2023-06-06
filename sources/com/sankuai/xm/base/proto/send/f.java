package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends b {
    public static ChangeQuickRedirect C;

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8887932fe901e2b5137bea1e6390464d", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8887932fe901e2b5137bea1e6390464d");
        }
        z().a(26279937);
        z().c(this.b);
        z().c(this.c);
        z().d(this.d);
        z().d(this.e);
        z().c(this.g);
        z().b(this.h);
        z().c(this.i);
        z().d(this.k);
        z().d(this.l);
        z().d(this.s);
        z().c(this.m);
        z().d(this.n);
        z().c(this.o);
        z().c(this.p);
        z().a(Boolean.valueOf(this.q));
        z().d(this.r);
        z().d(this.z);
        z().c(this.A);
        z().c(A());
        return z().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c417c2a71a6f2448f7b4671030f7322", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c417c2a71a6f2448f7b4671030f7322");
            return;
        }
        z().a(bArr);
        this.b = z().m();
        this.c = z().r();
        this.d = z().q();
        this.e = z().q();
        this.g = z().p();
        this.h = z().n();
        this.i = z().r();
        this.k = z().q();
        this.l = z().q();
        this.s = z().o();
        this.m = z().r();
        this.n = z().q();
        this.o = z().m();
        this.p = z().p();
        this.q = z().l().booleanValue();
        this.r = z().o();
        this.z = z().q();
        this.A = z().r();
        f(z().r());
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "932c9d48d01419663cb2c659fd5fc749", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "932c9d48d01419663cb2c659fd5fc749");
        }
        return "PIMSendMsgReq{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toUid=" + this.e + ", type=" + this.g + ", message=" + Arrays.toString(this.h) + ", fromName='" + this.i + "', cts=" + this.k + ", msgId=" + this.l + ", toAppId=" + ((int) this.s) + ", extension='" + this.m + "', seqId=" + this.n + ", retries=" + ((int) this.o) + ", clusterId=" + this.p + ", receipt=" + this.q + ", channel=" + ((int) this.r) + ", sessionSeqId=" + this.z + ", deviceId=" + A() + '}';
    }
}
