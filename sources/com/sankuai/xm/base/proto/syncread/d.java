package com.sankuai.xm.base.proto.syncread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends a<com.sankuai.xm.base.proto.protobase.c> {
    public static ChangeQuickRedirect f;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff095f4e1665376fffda87750e19246", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff095f4e1665376fffda87750e19246");
        } else {
            this.y = new com.sankuai.xm.base.proto.protobase.e();
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e1a9d865316e2e0d16b72ccf0765e6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e1a9d865316e2e0d16b72ccf0765e6");
        }
        return "PSyncRead{uid=" + this.b + ", deviceType=" + ((int) this.c) + ", deviceId=" + ((com.sankuai.xm.base.proto.protobase.e) this.y).h() + '}';
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbbd401acc6dc9aaa24db836015b970", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbbd401acc6dc9aaa24db836015b970");
        }
        ((com.sankuai.xm.base.proto.protobase.e) this.y).d(this.b);
        ((com.sankuai.xm.base.proto.protobase.e) this.y).c(this.c);
        ((com.sankuai.xm.base.proto.protobase.e) this.y).b(this.d);
        ((com.sankuai.xm.base.proto.protobase.e) this.y).c(this.e);
        ((com.sankuai.xm.base.proto.protobase.e) this.y).c(((com.sankuai.xm.base.proto.protobase.e) this.y).h());
        return ((com.sankuai.xm.base.proto.protobase.e) this.y).bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af33ac4d7447bff44b74456f7fba88ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af33ac4d7447bff44b74456f7fba88ce");
            return;
        }
        ((com.sankuai.xm.base.proto.protobase.e) this.y).a(bArr);
        this.b = ((com.sankuai.xm.base.proto.protobase.e) this.y).q();
        this.c = ((com.sankuai.xm.base.proto.protobase.e) this.y).m();
        this.d = ((com.sankuai.xm.base.proto.protobase.e) this.y).u();
        this.e = ((com.sankuai.xm.base.proto.protobase.e) this.y).r();
        ((com.sankuai.xm.base.proto.protobase.e) this.y).b(((com.sankuai.xm.base.proto.protobase.e) this.y).r());
    }

    @Override // com.sankuai.xm.base.proto.syncread.a
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "063396feed6031f56d9f9cfce34141f6", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "063396feed6031f56d9f9cfce34141f6")).intValue() : ((com.sankuai.xm.base.proto.protobase.e) this.y).l.b;
    }

    @Override // com.sankuai.xm.base.proto.protobase.h
    public final /* bridge */ /* synthetic */ com.sankuai.xm.base.proto.protobase.f v() {
        return (com.sankuai.xm.base.proto.protobase.e) this.y;
    }
}
