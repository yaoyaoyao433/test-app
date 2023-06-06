package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public String d;
    public String e;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdae545bb96b09185a4674e20f6908e", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdae545bb96b09185a4674e20f6908e");
        }
        d(this.b);
        c(this.c);
        c(this.d);
        c(this.e);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e235cb52754091cbe6f74bca8d7bc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e235cb52754091cbe6f74bca8d7bc5");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = r();
        this.d = r();
        this.e = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ecfbb85273cf82606736a9686a7e43", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ecfbb85273cf82606736a9686a7e43");
        }
        return "PDynamicInfo{id=" + this.b + ", title='" + this.c + "', dxData='" + this.d + "', appData='" + this.e + "'}";
    }
}
