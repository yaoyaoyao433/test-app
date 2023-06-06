package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public int b;
    public short c;
    public String d;
    public String e;
    public String f;
    public boolean g;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856f0da1ea5096cb8bf03c3a4a75c47d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856f0da1ea5096cb8bf03c3a4a75c47d");
            return;
        }
        super.a(bArr);
        this.b = p();
        this.c = o();
        this.d = r();
        this.e = r();
        this.f = r();
        this.g = l().booleanValue();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26dea9c62d30a8f50b542aaeec37ac10", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26dea9c62d30a8f50b542aaeec37ac10");
        }
        return "PLvsLoginAddr{ip=" + this.b + ", port=" + ((int) this.c) + ", domain='" + this.d + "', longPollingAddr='" + this.e + "', ipv6='" + this.f + "', supportCr=" + this.g + '}';
    }
}
