package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class w extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public short b;
    public byte[] c;
    public String d;
    private long e;
    private long f;

    public w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3acc345b4cfbfaf071cf6603de79e34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3acc345b4cfbfaf071cf6603de79e34");
            return;
        }
        this.b = (short) 0;
        this.e = 0L;
        this.c = null;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972955e2d0651306d6e354a351ad9e2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972955e2d0651306d6e354a351ad9e2b");
        } else {
            this.e = j;
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e0eae4b10d861e2796aaac4ee5a9ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e0eae4b10d861e2796aaac4ee5a9ea");
        } else {
            this.f = j;
        }
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4b8f603383a9e3098549ce4407e6225", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4b8f603383a9e3098549ce4407e6225");
        }
        a(1966080026);
        d(this.b);
        d(this.e);
        b(this.c);
        c(this.r);
        d(this.f);
        c(this.d);
        return super.bS_();
    }
}
