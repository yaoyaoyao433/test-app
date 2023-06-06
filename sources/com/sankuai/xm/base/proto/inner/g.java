package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ea23374a9538f7b5d12527be44bd7f", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ea23374a9538f7b5d12527be44bd7f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "787792c48b4fc72902c81c834b1750a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "787792c48b4fc72902c81c834b1750a5");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = r();
        this.d = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733cdf0bd210169d1f1e4f07c0830537", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733cdf0bd210169d1f1e4f07c0830537");
        }
        return "PEmotionInfo{uri='" + this.l.b + "'category='" + this.b + "', type='" + this.c + "', name='" + this.d + "'}";
    }
}
