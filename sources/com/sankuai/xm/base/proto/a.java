package com.sankuai.xm.base.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.e;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    public byte[][] b;
    private long c;
    private int d;
    private int e;
    private long f;

    public final byte[][] a() {
        return this.b;
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4735846c21fb3a3b9c145fb2d0ebd76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4735846c21fb3a3b9c145fb2d0ebd76");
            return;
        }
        super.a(bArr);
        this.c = q();
        this.b = u();
        this.d = p();
        this.e = p();
        this.f = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a856413e015281e7f53e24160782608", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a856413e015281e7f53e24160782608");
        }
        return "PMsgChatListRes{uid=" + this.c + ", chats=" + Arrays.toString(this.b) + ", next=" + this.d + ", rescode=" + this.e + ", requestId=" + this.f + '}';
    }
}
