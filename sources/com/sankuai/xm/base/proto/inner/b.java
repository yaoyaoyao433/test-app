package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public long i;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92955a47c3846a86cfb50910be585721", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92955a47c3846a86cfb50910be585721");
        }
        d(this.b);
        d(this.c);
        c(this.d);
        c(this.e);
        c(this.f);
        c(this.g);
        c(this.h);
        d(this.i);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d9b1e28f732ec6cbfc2c8982a5e368d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d9b1e28f732ec6cbfc2c8982a5e368d");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = q();
        this.d = r();
        this.e = r();
        this.f = r();
        this.g = r();
        this.h = r();
        this.i = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258f9d605079f76f1ba8f61c2b07069f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258f9d605079f76f1ba8f61c2b07069f");
        }
        return "PCalendarInfo{uri='" + this.l.b + "'dtstart='" + this.b + "', dtend='" + this.c + "', summary='" + this.d + "', location='" + this.e + "', trigger='" + this.f + "', participant='" + this.g + "', remark='" + this.h + "', calendarID='" + this.i + "'}";
    }
}
