package com.dianping.dataservice.impl;

import com.dianping.dataservice.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a implements e {
    public static ChangeQuickRedirect e;
    private Object a;
    protected Object f;

    public a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453faef5375c23d3a87cf3db37e47cd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453faef5375c23d3a87cf3db37e47cd4");
            return;
        }
        this.a = obj;
        this.f = obj2;
    }

    @Override // com.dianping.dataservice.e
    public final Object a() {
        return this.a;
    }
}
