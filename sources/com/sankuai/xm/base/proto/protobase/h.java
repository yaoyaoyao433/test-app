package com.sankuai.xm.base.proto.protobase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class h<T extends a> implements b<T> {
    public static ChangeQuickRedirect x;
    protected f<T> y;

    public abstract f<T> v();

    @Override // com.sankuai.xm.base.proto.protobase.b
    /* renamed from: y */
    public final T x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c678d9ec91d87711378b5fba4765519", 6917529027641081856L) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c678d9ec91d87711378b5fba4765519") : (T) v().x();
    }
}
