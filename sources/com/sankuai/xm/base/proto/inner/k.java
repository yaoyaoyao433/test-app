package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public byte[] b;
    public int c;
    public String d;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bac4e9a0609284a8da898fa927ec3c66", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bac4e9a0609284a8da898fa927ec3c66");
        }
        b(this.b);
        c(this.c);
        c(this.d);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058f3a322e8d1ce2484d0b9d62d23e9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058f3a322e8d1ce2484d0b9d62d23e9f");
            return;
        }
        super.a(bArr);
        this.b = n();
        this.c = p();
        this.d = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a77eac08b960bd31b6fd5b13a27de86", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a77eac08b960bd31b6fd5b13a27de86");
        }
        return "PGeneralInfo{uri='" + this.l.b + "'data='" + Arrays.toString(this.b) + "'type='" + this.c + "summary='" + this.d + "'}";
    }
}
