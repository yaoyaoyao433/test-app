package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public byte h;
    public String i;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3f843d23101228debfb7dc279941cd", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3f843d23101228debfb7dc279941cd");
        }
        c(this.b);
        c(this.c);
        c(this.d);
        c(this.e);
        c(this.f);
        c(this.g);
        c(this.h);
        c(this.i);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76c998f4ef8e8d94cacb89230aeecf13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76c998f4ef8e8d94cacb89230aeecf13");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = r();
        this.d = r();
        this.e = r();
        this.f = r();
        this.g = p();
        this.h = m();
        this.i = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea111eba071dbf761e3ff2ebb2efe31", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea111eba071dbf761e3ff2ebb2efe31");
        }
        return "PIMImageInfo{thumbnail='" + this.b + "', normal='" + this.c + "', original='" + this.d + "', type='" + this.e + "', token='" + this.f + "', originSize='" + this.g + "', uploadImageType='" + ((int) this.h) + "', custom='" + this.i + "'}";
    }
}
