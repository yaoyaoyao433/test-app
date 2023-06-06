package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class t extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public int e;
    public short f;
    public short g;
    public long h;
    public String i;
    public String j;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b844826daa3e345370c9d5e279c05c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b844826daa3e345370c9d5e279c05c");
        }
        c(this.b);
        c(this.c);
        c(this.d);
        c(this.e);
        d(this.f);
        d(this.g);
        d(this.h);
        c(this.i);
        c(this.j);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b708323fc7f578542f0dae188b1a24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b708323fc7f578542f0dae188b1a24");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = r();
        this.d = p();
        this.e = p();
        this.f = o();
        this.g = o();
        this.h = q();
        this.i = r();
        this.j = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b0098477380034071eeedecb1bcb6f5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b0098477380034071eeedecb1bcb6f5");
        }
        return "PIMVideoInfo{videoUrl=" + this.b + ", screenshotUrl=" + this.c + ", duration=" + this.d + ", size=" + this.e + ", width=" + ((int) this.f) + ", height=" + ((int) this.g) + ", timestamp=" + this.h + ", token='" + this.i + "', custom='" + this.j + "'}";
    }
}
