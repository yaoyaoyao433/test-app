package com.sankuai.xm.base.proto.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public int d;
    public String e;
    private byte f;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb33ea75c780291a2d3c883c8c50035", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb33ea75c780291a2d3c883c8c50035");
        }
        a(72155147);
        d(this.b);
        d(this.c);
        c(this.d);
        c(this.f);
        c(this.e);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b99c002c6a66bb2dc6b0094a88953841", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b99c002c6a66bb2dc6b0094a88953841");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = q();
        this.d = p();
        this.f = m();
        this.e = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be993a049a0e5120fb503439a3de7279", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be993a049a0e5120fb503439a3de7279");
        }
        return "PDataSendClientRes{messageId=" + this.b + ", cts=" + this.c + ", resCode=" + this.d + ", deviceType=" + ((int) this.f) + ", messageUuid='" + this.e + "'}";
    }
}
