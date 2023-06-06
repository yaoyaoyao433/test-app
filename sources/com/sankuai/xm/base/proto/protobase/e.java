package com.sankuai.xm.base.proto.protobase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends f<c> {
    public static ChangeQuickRedirect k;
    public c l;
    protected String m;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53484058a63613de080bd630076829d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53484058a63613de080bd630076829d");
            return;
        }
        this.l = new c();
        this.m = null;
    }

    public final int g() {
        return this.l.b;
    }

    public final void a(int i) {
        this.l.b = i;
    }

    public final void c(short s) {
        this.l.c = s;
    }

    public final void b(String str) {
        this.m = str;
    }

    public final String h() {
        return this.m;
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ee2a4a560cb15474b98a979cf9bcfe", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ee2a4a560cb15474b98a979cf9bcfe");
        }
        b(0);
        this.l.a = this.p.position();
        this.p.putInt(0, this.l.a);
        this.p.putInt(4, this.l.b);
        this.p.putShort(8, this.l.c);
        byte[] bArr = new byte[this.l.a];
        this.p.position(0);
        this.p.get(bArr);
        this.p = null;
        return bArr;
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "169244e9e7e9a3834ba788c1f2743cfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "169244e9e7e9a3834ba788c1f2743cfe");
            return;
        }
        this.o = ByteBuffer.wrap(bArr);
        this.l.a = p();
        this.l.b = p();
        this.l.c = o();
    }

    @Override // com.sankuai.xm.base.proto.protobase.b
    public final /* bridge */ /* synthetic */ Object x() {
        return this.l;
    }
}
