package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private long b;
    private String c;
    private byte d;

    public final String b() {
        return this.c;
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e68809ccd3d1c91309eafcf98930f14a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e68809ccd3d1c91309eafcf98930f14a");
        }
        a(26279982);
        d(this.b);
        c(this.c);
        c(this.d);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d9a0b8714e0507532b0dc555476b088", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d9a0b8714e0507532b0dc555476b088");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = r();
        this.d = m();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cbbf9d734c2d2c285932151b2d29fc9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cbbf9d734c2d2c285932151b2d29fc9");
        }
        return "PIMOppositeSyncReadRes{uid=" + this.b + ", msgUuid=" + this.c + ", deviceType=" + ((int) this.d) + '}';
    }
}
