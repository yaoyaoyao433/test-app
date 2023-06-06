package com.sankuai.waimai.store.base.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class k<T> implements j<T> {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.store.base.net.j
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77c59c9acefcf11eaf9f975d540c746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77c59c9acefcf11eaf9f975d540c746");
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public void a(com.sankuai.waimai.store.repository.net.b bVar) {
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public void a(T t) {
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public void b() {
    }
}
