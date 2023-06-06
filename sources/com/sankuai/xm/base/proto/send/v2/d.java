package com.sankuai.xm.base.proto.send.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends a {
    public static ChangeQuickRedirect D;

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa82ee376e739b489cf2a535ad3a4b0b", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa82ee376e739b489cf2a535ad3a4b0b");
        }
        z().a(26869822);
        z().c(this.b);
        z().c(this.c);
        z().d(this.l);
        z().d(this.d);
        z().d(this.e);
        z().d(this.s);
        z().c(this.g);
        z().b(this.h);
        z().c(this.i);
        z().d(this.k);
        z().c(this.t);
        z().c(this.u);
        z().c(this.m);
        z().c(this.o);
        z().c(this.v);
        z().d(this.r);
        z().d(this.z);
        z().c(this.A);
        z().c(B());
        z().c(this.C);
        return z().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99363161635f9d984ac6f050de884b6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99363161635f9d984ac6f050de884b6b");
            return;
        }
        z().a(bArr);
        this.b = z().m();
        this.c = z().r();
        this.l = z().q();
        this.d = z().q();
        this.e = z().q();
        this.s = z().o();
        this.g = z().p();
        this.h = z().n();
        this.i = z().r();
        this.k = z().q();
        this.t = z().p();
        this.u = z().m();
        this.m = z().r();
        this.o = z().m();
        this.v = z().m();
        this.r = z().o();
        this.z = z().q();
        this.A = z().r();
        g(z().r());
        this.C = z().r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6b591b09b6a95de26ed8db43105eae", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6b591b09b6a95de26ed8db43105eae");
        }
        return "PPubSendMsgReq2{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', msgId=" + this.l + ", fromUid=" + this.d + ", toUid=" + this.e + ", toAppId=" + ((int) this.s) + ", type=" + this.g + ", message=" + Arrays.toString(this.h) + ", fromName='" + this.i + "', cts=" + this.k + ", pushType=" + this.t + ", direction=" + ((int) this.u) + ", extension='" + this.m + "', retries=" + ((int) this.o) + ", toDeviceTypes=" + ((int) this.v) + ", channel=" + ((int) this.r) + ", sessionSeqId=" + this.z + ", deviceId=" + B() + ", Sid=" + this.C + '}';
    }
}
