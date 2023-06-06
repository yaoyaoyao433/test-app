package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.business.restaurant.base.manager.order.g b;

    public static /* synthetic */ boolean a(i iVar, double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "e038d323de2199532ad0605ce8cc8452", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "e038d323de2199532ad0605ce8cc8452")).booleanValue() : iVar.a(d, com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.food_collect_poi_min_price, 10.0d), d2, com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.food_collect_activity_min_price_rate, 0.9d));
    }

    public i(@NonNull com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34cc406f08ae2fb6496b5e5ad8c447d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34cc406f08ae2fb6496b5e5ad8c447d4");
        } else {
            this.b = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28983dcb08bcbe0aed5ec3d6ecf9ea17", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28983dcb08bcbe0aed5ec3d6ecf9ea17");
        }
        return "<font color='#FFA000'>" + str + "</font>";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e133c5dbe46bf20adff33984743eb964", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e133c5dbe46bf20adff33984743eb964")).booleanValue() : com.sankuai.waimai.foundation.utils.h.e(Double.valueOf(d2), Double.valueOf(0.0d)) && com.sankuai.waimai.foundation.utils.h.e(Double.valueOf(d3), Double.valueOf(0.0d)) && com.sankuai.waimai.foundation.utils.h.c(Double.valueOf(0.0d), Double.valueOf(d4)) && com.sankuai.waimai.foundation.utils.h.c(Double.valueOf(d4), Double.valueOf(1.0d)) && com.sankuai.waimai.foundation.utils.h.e(Double.valueOf(d3), Double.valueOf(d2)) && com.sankuai.waimai.foundation.utils.h.c(Double.valueOf(d3 * d4), Double.valueOf(d)) && com.sankuai.waimai.foundation.utils.h.b(Double.valueOf(d), Double.valueOf(d3));
    }
}
