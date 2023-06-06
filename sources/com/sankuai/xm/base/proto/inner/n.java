package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public short b;
    public String c;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6896d952c7d5311266ad374be1853b82", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6896d952c7d5311266ad374be1853b82");
        }
        d(this.b);
        c(this.c);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac632768cce2aea84488de8e8398872c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac632768cce2aea84488de8e8398872c");
            return;
        }
        super.a(bArr);
        this.b = o();
        this.c = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "606dde94c332964933bf86b2765be9dc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "606dde94c332964933bf86b2765be9dc");
        }
        return "PIMMultiLinkInfo{num=" + ((int) this.b) + ", links=" + this.c + '}';
    }
}
