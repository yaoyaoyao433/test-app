package com.sankuai.waimai.store.platform.domain.manager.goods;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a f;
    public boolean b;
    public boolean c;
    public String d;
    public PoiCategory e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d56fbea8aa28c9d2c42d8d76b6a3d52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d56fbea8aa28c9d2c42d8d76b6a3d52");
        } else {
            this.d = "";
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27f7e918d41c40fcf60345305329cd0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27f7e918d41c40fcf60345305329cd0e");
        }
        if (f == null) {
            f = new a();
        }
        return f;
    }
}
