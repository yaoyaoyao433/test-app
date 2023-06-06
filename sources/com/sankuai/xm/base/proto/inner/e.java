package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acad82cfb12ae52d995541dfab741126", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acad82cfb12ae52d995541dfab741126");
        }
        c(this.b);
        c(this.c);
        c(this.d);
        c(this.e);
        c(this.f);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad87071c0941b7bb17f765aead757a2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad87071c0941b7bb17f765aead757a2a");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = r();
        this.d = r();
        this.e = r();
        this.f = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0545ea270a8df20a0afdef0a9073c35f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0545ea270a8df20a0afdef0a9073c35f");
        }
        return "PCustomInfo{uri='" + this.l.b + "'templateName='" + this.b + "', contentTitle='" + this.c + "', content='" + this.d + "', linkName='" + this.e + "', link='" + this.f + "'}";
    }
}
