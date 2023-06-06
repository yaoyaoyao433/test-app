package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class q extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public long b;
    public short c;
    public String d;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "740df288255b24241e96088cc189629b", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "740df288255b24241e96088cc189629b");
        }
        d(this.b);
        d(this.c);
        c(this.d);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9945bd000fecd65da5929d65ab8754a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9945bd000fecd65da5929d65ab8754a");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = o();
        this.d = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2551e460c3139db7c5b12a7e26dacaa", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2551e460c3139db7c5b12a7e26dacaa");
        }
        return "PRedPacketInfo{rpid=" + this.b + ", type=" + ((int) this.c) + ", greetings='" + this.d + "'}";
    }
}
