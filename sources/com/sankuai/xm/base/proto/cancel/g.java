package com.sankuai.xm.base.proto.cancel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends b {
    public static ChangeQuickRedirect v;

    @Override // com.sankuai.xm.base.proto.cancel.a, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2370d668199f1129dee99b0d3750ab", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2370d668199f1129dee99b0d3750ab");
        }
        u().a(26869809);
        u().c(this.b);
        u().c(this.c);
        u().d(this.d);
        u().d(this.e);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21618d254a6fa66197b26b28c4f901f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21618d254a6fa66197b26b28c4f901f9");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c943c934c355af5ddea961369796a2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c943c934c355af5ddea961369796a2");
        }
        return "PPubCancelMsg{deviceType=" + ((int) this.b) + ", msgUuid='" + this.c + "', fromUid=" + this.d + ", toUid=" + this.e + ", fromName='" + this.h + "', cts=" + this.j + ", msgId=" + this.k + ", toAppId=" + ((int) this.g) + ", direction=" + ((int) this.o) + ", extension='" + this.l + "', channel=" + ((int) this.m) + ", isforce=" + ((int) this.n) + ", actionSts=" + this.p + ", sessionSeqId=" + this.r + ", deviceId=" + this.s + '}';
    }
}
