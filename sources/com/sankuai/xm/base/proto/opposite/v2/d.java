package com.sankuai.xm.base.proto.opposite.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends g {
    public static ChangeQuickRedirect a;
    private long b;
    private byte c;
    private long d;
    private short e;
    private short f;
    private long g;
    private String h;

    public final long b() {
        return this.b;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62cead05c12f1b7625932e3f5cfbc3e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62cead05c12f1b7625932e3f5cfbc3e1");
        } else {
            this.b = j;
        }
    }

    public final void a(byte b) {
        this.c = b;
    }

    public final long c() {
        return this.d;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c597d71c0e6576442b51b3cc60029ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c597d71c0e6576442b51b3cc60029ad");
        } else {
            this.d = j;
        }
    }

    public final short d() {
        return this.e;
    }

    public final void a(short s) {
        this.e = s;
    }

    public final short e() {
        return this.f;
    }

    public final void b(short s) {
        this.f = s;
    }

    public final long f() {
        return this.g;
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8efeca6b69b7215e8343504a6f20f3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8efeca6b69b7215e8343504a6f20f3c");
        } else {
            this.g = j;
        }
    }

    public final String g() {
        return this.h;
    }

    public final void a(String str) {
        this.h = str;
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4030e14b0cbafb98d83ac7a7ed328554", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4030e14b0cbafb98d83ac7a7ed328554");
        }
        a(26869826);
        d(this.b);
        c(this.c);
        d(this.d);
        d(this.e);
        d(this.f);
        d(this.g);
        c(this.h);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e56637cabfd787124010ffcdff8b4bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e56637cabfd787124010ffcdff8b4bc");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = m();
        this.d = q();
        this.e = o();
        this.f = o();
        this.g = q();
        this.h = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa9a4dfd930c593fd550ad5156af9fa", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa9a4dfd930c593fd550ad5156af9fa");
        }
        return "PPubOppositeSyncReadItem2{chatId=" + this.b + ", type=" + ((int) this.c) + ", peerUid=" + this.d + ", peerAppId=" + ((int) this.e) + ", channel=" + ((int) this.f) + ", sts=" + this.g + ", sid=" + this.h + '}';
    }
}
