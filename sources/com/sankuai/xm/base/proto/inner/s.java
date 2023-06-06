package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class s extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public String d;
    public short e;
    public short f;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4fc8ac21efabdb4791144a94850ea9", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4fc8ac21efabdb4791144a94850ea9");
        }
        d(this.b);
        c(this.c);
        c(this.d);
        d(this.e);
        d(this.f);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9942fbc8c20bb15671eed7feadbb0d25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9942fbc8c20bb15671eed7feadbb0d25");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = r();
        this.d = r();
        this.e = o();
        this.f = o();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db77b264af288e336063302c5fcc1ee", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db77b264af288e336063302c5fcc1ee");
        }
        return "PVCardInfo{uid=" + this.b + ", name='" + this.c + "', account='" + this.d + "', type='" + ((int) this.e) + "', subtype='" + ((int) this.f) + "'}";
    }
}
