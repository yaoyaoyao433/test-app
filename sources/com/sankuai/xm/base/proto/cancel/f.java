package com.sankuai.xm.base.proto.cancel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends b {
    public static ChangeQuickRedirect v;

    @Override // com.sankuai.xm.base.proto.cancel.a, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca61b5892dd23e280a5339077de60dd5", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca61b5892dd23e280a5339077de60dd5");
        }
        u().a(26869831);
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
        u().c(this.s);
        return u().bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f61f8e831f2b7c862ea2293212d056", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f61f8e831f2b7c862ea2293212d056");
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
        this.s = u().r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd1f358918440ff550b14bd84d033c1c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd1f358918440ff550b14bd84d033c1c");
        }
        return "PPubCancelMsg{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toUid=" + this.e + ", pubUid=" + this.t + ", fromName='" + this.h + "', cts=" + this.j + ", msgId=" + this.k + ", toAppId=" + ((int) this.g) + ", direction=" + ((int) this.o) + ", extension='" + this.l + "', channel=" + ((int) this.m) + ", isforce=" + ((int) this.n) + ", actionSts=" + this.p + ", sessionSeqId=" + this.r + ", deviceId=" + this.s + '}';
    }
}
