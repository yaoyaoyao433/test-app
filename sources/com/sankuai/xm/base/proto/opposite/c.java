package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private String b;
    private long c;
    private long d;
    private long e;
    private byte f;
    private short g;
    private byte[][] h;

    public final long b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final byte[][] d() {
        return this.h;
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92cbb620c8197870d746b5258d392cac", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92cbb620c8197870d746b5258d392cac");
        }
        a(26279988);
        c(this.b);
        d(this.c);
        d(this.d);
        d(this.e);
        c(this.f);
        d(this.g);
        b(this.h);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb9b1509945198c7828a5505a51a9443", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb9b1509945198c7828a5505a51a9443");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = q();
        this.d = q();
        this.e = q();
        this.f = m();
        this.g = o();
        this.h = u();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b7812254c12887d9af19447e406935", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b7812254c12887d9af19447e406935");
        }
        return "PGroupOppositeSyncReadReceive{, oppositeUuid=" + this.b + ", fromUid=" + this.c + ", toGuid=" + this.d + ", cts=" + this.e + ", deviceType=" + ((int) this.f) + ", channel=" + ((int) this.g) + ", syncReadItems=" + Arrays.toString(this.h) + '}';
    }
}
