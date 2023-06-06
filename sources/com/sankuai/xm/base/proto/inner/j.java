package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public String d;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39090c5546f0f13b648021d6ed826903", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39090c5546f0f13b648021d6ed826903");
        }
        c(this.b);
        c(this.c);
        c(this.d);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f85024c53e299da77ff3d95a88e709f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f85024c53e299da77ff3d95a88e709f");
            return;
        }
        super.a(bArr);
        this.b = p();
        this.c = p();
        this.d = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d7cca62f7f24818cafec01b48810801", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d7cca62f7f24818cafec01b48810801");
        }
        return "PGPSInfo{uri='" + this.l.b + "'latitude='" + this.b + "', longitude='" + this.c + "', name='" + this.d + "'}";
    }
}
