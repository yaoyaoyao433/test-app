package com.sankuai.xm.base.proto.cancel.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends a {
    public static ChangeQuickRedirect w;

    @Override // com.sankuai.xm.base.proto.cancel.a, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dcee74de2fea8eaf451cddaec23a9a8", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dcee74de2fea8eaf451cddaec23a9a8");
        }
        u().a(26869833);
        u().c(this.b);
        u().c(this.c);
        u().d(this.d);
        u().d(this.e);
        u().d(this.t);
        u().c(this.h);
        u().d(this.j);
        u().d(this.k);
        u().d(this.g);
        u().c(this.o);
        u().c(this.l);
        u().d(this.m);
        u().d(this.n);
        u().d(this.p);
        u().d(this.r);
        u().c(this.v);
        u().c(this.s);
        return u().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d633cfdadd732c2128ec0e212cf337a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d633cfdadd732c2128ec0e212cf337a");
            return;
        }
        u().a(bArr);
        this.b = u().m();
        this.c = u().r();
        this.d = u().q();
        this.e = u().q();
        this.t = u().q();
        this.h = u().r();
        this.j = u().q();
        this.k = u().q();
        this.g = u().o();
        this.o = u().m();
        this.l = u().r();
        this.m = u().o();
        this.n = u().o();
        this.p = u().q();
        this.r = u().q();
        this.v = u().r();
        this.s = u().r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d969f7a161bf21b9521d46c674f911", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d969f7a161bf21b9521d46c674f911");
        }
        return "PPubCancelMsg2{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toUid=" + this.e + ", pubUid=" + this.t + ", fromName='" + this.h + "', cts=" + this.j + ", msgId=" + this.k + ", toAppId=" + ((int) this.g) + ", direction=" + ((int) this.o) + ", extension='" + this.l + "', channel=" + ((int) this.m) + ", isforce=" + ((int) this.n) + ", actionSts=" + this.p + ", sessionSeqId=" + this.r + ", Sid=" + this.v + ", deviceId=" + this.s + '}';
    }
}
