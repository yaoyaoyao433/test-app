package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public int b;
    public short c;
    public String d;
    public int e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f73d765be1e1188d28f63f0151a96d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f73d765be1e1188d28f63f0151a96d2");
        } else {
            this.e = 0;
        }
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd0c754cdeac397ee2f624b0400641c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd0c754cdeac397ee2f624b0400641c");
            return;
        }
        super.a(ByteBuffer.wrap(bArr));
        this.b = p();
        this.c = o();
        this.d = r();
    }

    @Override // com.sankuai.xm.base.proto.protobase.f
    public final void a(ByteBuffer byteBuffer) {
        Object[] objArr = {byteBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86004f93dc0ea5a86fd7db406efe39c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86004f93dc0ea5a86fd7db406efe39c");
            return;
        }
        super.a(byteBuffer);
        this.b = p();
        this.c = o();
        this.d = r();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d970aeadc7de934a10d6bbf6bdc6d91f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d970aeadc7de934a10d6bbf6bdc6d91f")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && this.c == aVar.c && (this.d == aVar.d || (this.d != null && this.d.equals(aVar.d)));
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15c65f49665285a67985828320709d2b", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15c65f49665285a67985828320709d2b")).intValue() : Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Short.valueOf(this.c), this.d});
    }
}
