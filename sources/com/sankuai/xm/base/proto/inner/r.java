package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class r extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public boolean e;
    public short f;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4317740eb6c985832aed500d566cf2de", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4317740eb6c985832aed500d566cf2de");
        }
        c(this.b);
        c(this.c);
        c(this.d);
        a(Boolean.valueOf(this.e));
        d(this.f);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab46ef79c46d42af3f089ee331c67e4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab46ef79c46d42af3f089ee331c67e4c");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = r();
        this.d = p();
        this.e = l().booleanValue();
        this.f = o();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b45d5438d74d64caea1e5ccb5a4277", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b45d5438d74d64caea1e5ccb5a4277");
        }
        return "PIMTextInfo{text=" + this.b + ", font_name='" + this.c + "', font_size=" + this.d + ", bold=" + this.e + ", cipher_type=" + ((int) this.f) + '}';
    }
}
