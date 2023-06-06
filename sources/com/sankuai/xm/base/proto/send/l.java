package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l extends b {
    public static ChangeQuickRedirect C;

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85aa34bda4ac2e1f18af960ecf5bf217", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85aa34bda4ac2e1f18af960ecf5bf217");
        }
        z().a(26869769);
        z().c(this.b);
        z().c(this.c);
        z().d(this.d);
        z().d(this.e);
        z().b(this.h);
        z().d(this.k);
        z().d(this.l);
        z().d(this.s);
        z().d((short) this.t);
        z().c(this.u);
        z().c(this.o);
        z().c(this.v);
        z().c(A());
        return z().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d96dfdb87d022f252b44884eac854a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d96dfdb87d022f252b44884eac854a");
            return;
        }
        z().a(bArr);
        this.b = z().m();
        this.c = z().r();
        this.d = z().q();
        this.e = z().q();
        this.h = z().n();
        this.k = z().q();
        this.l = z().q();
        this.s = z().o();
        this.t = z().o();
        this.u = z().m();
        this.o = z().m();
        this.v = z().m();
        f(z().r());
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363bd6243fee5f585c30c98eb98e7487", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363bd6243fee5f585c30c98eb98e7487");
        }
        return "PPubSendTTReq{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toUid=" + this.e + ", cts=" + this.k + ", msgId=" + this.l + ", toAppId=" + ((int) this.s) + ", pushType=" + this.t + ", direction=" + ((int) this.u) + ", retries=" + ((int) this.o) + ", toDeviceTypes=" + ((int) this.v) + ", deviceId=" + A() + '}';
    }
}
