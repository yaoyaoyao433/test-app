package com.sankuai.xm.base.proto.cancel.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends a {
    public static ChangeQuickRedirect w;

    @Override // com.sankuai.xm.base.proto.cancel.a, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f015ef079f6345c40c097c43d350b86", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f015ef079f6345c40c097c43d350b86");
        }
        u().a(26279995);
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
        u().c(u().v());
        u().c(this.v);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05bb058619e0ccdd92181ef6ad3e2a88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05bb058619e0ccdd92181ef6ad3e2a88");
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
        this.v = u().r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "818db772238736c2c0e7660e55efbe30", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "818db772238736c2c0e7660e55efbe30");
        }
        return "PIMCancelMsg2{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toUid=" + this.e + ", fromName='" + this.h + "', cts=" + this.j + ", msgId=" + this.k + ", toAppId=" + ((int) this.g) + ", extension='" + this.l + "', channel=" + ((int) this.m) + ", isforce=" + ((int) this.n) + ", actionSts=" + this.p + ", sessionSeqId=" + this.r + ", deviceId=" + u().v() + ", Sid=" + this.v + '}';
    }
}
