package com.sankuai.xm.base.proto.cancel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends b {
    public static ChangeQuickRedirect v;

    @Override // com.sankuai.xm.base.proto.cancel.a, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e6624a6251f46eb8d57aeb1ed1368c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e6624a6251f46eb8d57aeb1ed1368c");
        }
        u().a(26280239);
        u().c(this.b);
        u().c(this.c);
        u().d(this.d);
        u().d(this.f);
        u().c(this.h);
        u().c(this.i);
        u().d(this.j);
        u().d(this.k);
        u().c(this.l);
        u().d(this.m);
        u().d(this.n);
        u().d(this.p);
        u().d(this.q);
        u().d(this.r);
        u().c(u().h());
        return u().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4af0fd557d5e02168bafcca4e986913f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4af0fd557d5e02168bafcca4e986913f");
            return;
        }
        u().a(bArr);
        this.b = u().m();
        this.c = u().r();
        this.d = u().q();
        this.f = u().q();
        this.h = u().r();
        this.i = u().r();
        this.j = u().q();
        this.k = u().q();
        this.l = u().r();
        this.m = u().o();
        this.n = u().o();
        this.p = u().q();
        this.q = u().q();
        this.r = u().q();
        u().b(u().r());
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e657075e69d600882735e97700d150", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e657075e69d600882735e97700d150");
        }
        return "PIMCancelGroupMsg{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toGuid=" + this.f + ", fromName='" + this.h + "', groupName='" + this.i + "', cts=" + this.j + ", msgId=" + this.k + ", extension='" + this.l + "', channel=" + ((int) this.m) + ", isforce=" + ((int) this.n) + ", actionSts=" + this.p + ", adminUid=" + this.q + ", sessionSeqId=" + this.r + ", deviceId=" + u().h() + '}';
    }
}
