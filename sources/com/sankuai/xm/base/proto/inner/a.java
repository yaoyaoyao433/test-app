package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public String b;
    public short c;
    public short d;
    public long e;
    public String f;
    public String g;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af0585a736f1f9d24a5f59fd98bb908", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af0585a736f1f9d24a5f59fd98bb908");
        }
        c(this.b);
        d(this.c);
        d(this.d);
        d(this.e);
        c(this.f);
        c(this.g);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3ed25807fe079e81aa13b35a0f1d84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3ed25807fe079e81aa13b35a0f1d84");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = o();
        this.d = o();
        this.e = q();
        this.f = r();
        this.g = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b196b21cb413e30ac39382ebf84cfb", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b196b21cb413e30ac39382ebf84cfb");
        }
        return "PAudioInfo{uri='" + this.l.b + "'url=" + this.b + ", codec='" + ((int) this.c) + "', duration=" + ((int) this.d) + ", stamp=" + this.e + ", token='" + this.f + "', custom='" + this.g + "'}";
    }
}
