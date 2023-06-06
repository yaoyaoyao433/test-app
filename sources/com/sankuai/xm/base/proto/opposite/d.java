package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private String b;
    private long c;
    private byte d;
    private long e;
    private byte[][] f;

    public final String b() {
        return this.b;
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59a0700e87a5a5f7eabeec60e8862124", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59a0700e87a5a5f7eabeec60e8862124");
        }
        a(26279987);
        c(this.b);
        d(this.c);
        c(this.d);
        d(this.e);
        b(this.f);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc12b06bd55e9263c008367d454ee30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc12b06bd55e9263c008367d454ee30");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = q();
        this.d = m();
        this.e = q();
        this.f = u();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c334b300461dcd965405d81536a2c80b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c334b300461dcd965405d81536a2c80b");
        }
        return "PGroupOppositeSyncReadRes{, oppositeUuid=" + this.b + ", fromUid=" + this.e + ", cts=" + this.c + ", deviceType=" + ((int) this.d) + ", syncReadItems=" + Arrays.toString(this.f) + '}';
    }
}
