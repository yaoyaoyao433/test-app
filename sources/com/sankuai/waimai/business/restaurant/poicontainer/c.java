package com.sankuai.waimai.business.restaurant.poicontainer;

import android.content.Intent;
import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c b;
    private com.sankuai.waimai.platform.shop.a c;

    @MainThread
    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2c070d2e4bc87f4792089a8c743c669", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2c070d2e4bc87f4792089a8c743c669");
        }
        if (b == null) {
            b = new c();
        }
        return b;
    }

    public final com.sankuai.waimai.platform.shop.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9dcc4078fe8485b53834d982cddbdf8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.shop.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9dcc4078fe8485b53834d982cddbdf8");
        }
        if (this.c == null) {
            this.c = new com.sankuai.waimai.platform.shop.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.c.1
                @Override // com.sankuai.waimai.platform.shop.a
                public final void a(Intent intent) {
                }
            };
        }
        return this.c;
    }
}
