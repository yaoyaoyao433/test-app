package com.sankuai.waimai.business.restaurant.base.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.c;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final e b;

    public b(@NonNull Context context, View view, c.a aVar, boolean z, String str) {
        Object[] objArr = {context, view, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3bd7211a3974612000febfd9af14797", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3bd7211a3974612000febfd9af14797");
        } else if (z) {
            this.b = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.template.a(context, view, aVar, str);
        } else {
            this.b = new c(context, (ViewGroup) view, aVar);
        }
    }

    public final void a(GoodsSpu goodsSpu, boolean z, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, int i, a.InterfaceC0850a interfaceC0850a, boolean z2) {
        Object[] objArr = {goodsSpu, Byte.valueOf(z ? (byte) 1 : (byte) 0), gVar, Integer.valueOf(i), interfaceC0850a, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c6135d9f892613b64934af89c2c82f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c6135d9f892613b64934af89c2c82f");
        } else {
            this.b.a(goodsSpu, z, gVar, i, interfaceC0850a, z2);
        }
    }

    public final View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13432b2940acdbcd01fcd55738296c2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13432b2940acdbcd01fcd55738296c2") : this.b.a();
    }
}
