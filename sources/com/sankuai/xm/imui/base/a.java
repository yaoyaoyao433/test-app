package com.sankuai.xm.imui.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a<V> {
    public static ChangeQuickRedirect a;
    public V b;

    public a(V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9dba0658d2433bd79423c05a93780e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9dba0658d2433bd79423c05a93780e6");
        } else {
            this.b = v;
        }
    }

    public final V a() {
        return this.b;
    }

    public void b() {
        this.b = null;
    }
}
