package com.sankuai.xm.base.proto.addition;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends a {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        int i = 0;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ee8577e804f4fcd9f7bdba233c17a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ee8577e804f4fcd9f7bdba233c17a5");
            return;
        }
        super.a(bArr);
        this.a = r();
        this.b = q();
        this.c = m();
        this.r = r();
        this.d = q();
        this.e = o();
        this.f = r();
        Map<K, V> a = a(0L, (short) 0);
        if (a != 0) {
            this.g = new long[a.size()];
            for (Long l2 : a.keySet()) {
                this.g[i] = l2.longValue();
                i++;
            }
        }
        this.i = q();
        this.j = p();
        this.k = l().booleanValue();
    }
}
