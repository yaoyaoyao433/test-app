package com.sankuai.xm.base.proto.cancel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends b {
    public static ChangeQuickRedirect v;

    @Override // com.sankuai.xm.base.proto.cancel.a, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1480139f94635a68e29d415b4b202c91", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1480139f94635a68e29d415b4b202c91");
        }
        u().a(26280237);
        u().c(this.b);
        u().c(this.c);
        u().d(this.d);
        u().d(this.e);
        u().c(this.h);
        u().d(this.j);
        u().d(this.k);
        u().d(this.g);
        u().c(this.l);
        u().d(this.m);
        u().d(this.n);
        u().d(this.p);
        u().d(this.r);
        u().c(u().h());
        return u().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29b764ddb012ffd6d85f1ba0118b6ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29b764ddb012ffd6d85f1ba0118b6ef");
            return;
        }
        u().a(bArr);
        this.b = u().m();
        this.c = u().r();
        this.d = u().q();
        this.e = u().q();
        this.h = u().r();
        this.j = u().q();
        this.k = u().q();
        this.g = u().o();
        this.l = u().r();
        this.m = u().o();
        this.n = u().o();
        this.p = u().q();
        this.r = u().q();
        u().b(u().r());
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9817cea9ef3c3c662af51183f65fcd58", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9817cea9ef3c3c662af51183f65fcd58");
        }
        return "PIMCancelMsg{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toUid=" + this.e + ", fromName='" + this.h + "', cts=" + this.j + ", msgId=" + this.k + ", toAppId=" + ((int) this.g) + ", extension='" + this.l + "', channel=" + ((int) this.m) + ", isforce=" + ((int) this.n) + ", actionSts=" + this.p + ", sessionSeqId=" + this.r + ", deviceId=" + u().h() + '}';
    }
}
