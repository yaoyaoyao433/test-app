package com.sankuai.xm.base.proto.syncread.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.f;
import com.sankuai.xm.base.proto.protobase.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.base.proto.syncread.a<com.sankuai.xm.base.proto.protobase.d> {
    public static ChangeQuickRedirect f;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae40e95e1341d46d7ba45d521fc5bfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae40e95e1341d46d7ba45d521fc5bfa");
        } else {
            this.y = new g();
        }
    }

    public final g e() {
        return (g) this.y;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f7ca76eeccc0c9e1ad32f674c31585", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f7ca76eeccc0c9e1ad32f674c31585");
        }
        return "PSyncRead2{uid=" + this.b + ", deviceType=" + ((int) this.c) + ", deviceId" + ((g) this.y).v() + '}';
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be2fcb013804812d21a82439131320d", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be2fcb013804812d21a82439131320d");
        }
        ((g) this.y).d(this.b);
        ((g) this.y).c(this.c);
        ((g) this.y).b(this.d);
        ((g) this.y).c(this.e);
        ((g) this.y).c(((g) this.y).v());
        return ((g) this.y).bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b51db228bfa0a5cbef30e0a4756c94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b51db228bfa0a5cbef30e0a4756c94");
            return;
        }
        ((g) this.y).a(bArr);
        this.b = ((g) this.y).q();
        this.c = ((g) this.y).m();
        this.d = ((g) this.y).u();
        this.e = ((g) this.y).r();
        ((g) this.y).b(((g) this.y).r());
    }

    @Override // com.sankuai.xm.base.proto.syncread.a
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49763c6f440ce93ecca744fbbe9e906", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49763c6f440ce93ecca744fbbe9e906")).intValue() : ((g) this.y).q.b;
    }

    @Override // com.sankuai.xm.base.proto.protobase.h
    public final /* bridge */ /* synthetic */ f v() {
        return (g) this.y;
    }
}
