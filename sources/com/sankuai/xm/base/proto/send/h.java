package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends b {
    public static ChangeQuickRedirect C;

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b02eefa69ec5f4ee3f4cc5b5a82ef7b6", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b02eefa69ec5f4ee3f4cc5b5a82ef7b6");
        }
        z().a(26869777);
        z().c(this.b);
        z().c(this.c);
        z().d(this.l);
        z().d(this.d);
        z().d(this.e);
        z().d(this.s);
        z().d(this.w);
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
        z().c(A());
        return z().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c766ab50c79e43205933ff0c1809c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c766ab50c79e43205933ff0c1809c1");
            return;
        }
        z().a(bArr);
        this.b = z().m();
        this.c = z().r();
        this.l = z().q();
        this.d = z().q();
        this.e = z().q();
        this.s = z().o();
        this.w = z().q();
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
        f(z().r());
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = C;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dda728e30c8d8c7d5ac6a318a0c5d3a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dda728e30c8d8c7d5ac6a318a0c5d3a");
        }
        return "PPubSendMsgKFReq{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', msgId=" + this.l + ", senderUid=" + this.d + ", receiverUid=" + this.e + ", toAppId=" + ((int) this.s) + ", pubUid=" + this.w + ", type=" + this.g + ", message=" + Arrays.toString(this.h) + ", fromName='" + this.i + "', cts=" + this.k + ", pushType=" + this.t + ", direction=" + ((int) this.u) + ", extension='" + this.m + "', retries=" + ((int) this.o) + ", toDeviceTypes=" + ((int) this.v) + ", channel=" + ((int) this.r) + ", sessionSeqId=" + this.z + ", deviceId=" + A() + '}';
    }
}
