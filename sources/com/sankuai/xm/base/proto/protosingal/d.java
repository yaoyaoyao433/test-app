package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public short b;
    public byte[] c;
    public byte[] d;

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a6be00ad21976f85687c19f8b7dbc4", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a6be00ad21976f85687c19f8b7dbc4");
        }
        a(196732);
        d(this.b);
        b(this.c);
        b(this.d);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4d93049b41c8c7546ae0720d8cc62a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4d93049b41c8c7546ae0720d8cc62a");
            return;
        }
        super.a(bArr);
        this.b = o();
        this.c = n();
        this.d = n();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c67d796e26f5ad6c202e887d5aa530f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c67d796e26f5ad6c202e887d5aa530f");
        }
        return "PExchangeReq={keyType=" + ((int) this.b) + ", key=" + this.c + ", extern=" + this.d + '}';
    }
}
