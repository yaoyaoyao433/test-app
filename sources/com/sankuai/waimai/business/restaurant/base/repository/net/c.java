package com.sankuai.waimai.business.restaurant.base.repository.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c<T> implements b<T> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5281699f974d804886aba810d890a272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5281699f974d804886aba810d890a272");
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
    public void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
    public void a(T t) {
    }

    @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
    public void b() {
    }
}
