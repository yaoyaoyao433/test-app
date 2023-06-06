package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public long h;
    public String i;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c333377c01ec3fdb8d1fa497c4a32f7", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c333377c01ec3fdb8d1fa497c4a32f7");
        }
        c(this.b);
        c(this.c);
        c(this.d);
        c(this.e);
        c(this.f);
        c(this.g);
        d(this.h);
        c(this.i);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc7124a2ceeebd7a9b346755e8f7e6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc7124a2ceeebd7a9b346755e8f7e6f");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = r();
        this.d = r();
        this.e = r();
        this.f = p();
        this.g = r();
        this.h = q();
        this.i = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b703eb85c6b88e6ca4472dd91accc5ee", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b703eb85c6b88e6ca4472dd91accc5ee");
        }
        return "PFileInfo{uri='" + this.l.b + "'id='" + this.b + "', url='" + this.c + "', name='" + this.d + "', format='" + this.e + "', size=" + this.f + ", token='" + this.g + "', lsize=" + this.h + ", custom='" + this.i + "'}";
    }
}
