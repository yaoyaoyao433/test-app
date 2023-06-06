package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public int b;
    public byte c;

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2de23d4cb06ecd5134f2b0479524c7", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2de23d4cb06ecd5134f2b0479524c7");
        }
        a(196733);
        c(this.b);
        c(this.c);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f23e7dbaf0b042ae16fca0b4ebefb91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f23e7dbaf0b042ae16fca0b4ebefb91");
            return;
        }
        super.a(bArr);
        this.b = p();
        this.c = m();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babb7936786a0d073998f31c57916fec", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babb7936786a0d073998f31c57916fec");
        }
        return "PExchangeRes={rescode=" + this.b + ", isencryed=" + ((int) this.c) + '}';
    }
}
