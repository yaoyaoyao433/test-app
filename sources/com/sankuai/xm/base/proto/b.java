package com.sankuai.xm.base.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;
    private long b;
    private int c;
    private String d;
    private long e;
    private short f;

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final long d() {
        return this.e;
    }

    public final short e() {
        return this.f;
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a30ebbfbcc2433c9a1ffad88a8b116", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a30ebbfbcc2433c9a1ffad88a8b116");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = p();
        this.d = r();
        this.e = q();
        this.f = o();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ddc5a55efa10ba02b13e70eee274146", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ddc5a55efa10ba02b13e70eee274146");
        }
        return "PNotice{uri='" + this.l.b + "'toUid=" + this.b + ", type=" + this.c + ", data='" + this.d + "', cts=" + this.e + ", channel=" + ((int) this.f) + '}';
    }
}
