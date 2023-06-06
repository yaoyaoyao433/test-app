package com.sankuai.waimai.store.base.net.wm;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.OrderListResponse;
import com.sankuai.waimai.business.order.api.model.g;
import com.sankuai.waimai.store.base.net.d;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.entity.RestRecommendPoi;
import com.sankuai.waimai.store.orderlist.model.OrderDeleteResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends d<WMApiService> {
    public static ChangeQuickRedirect a;

    public static a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c995a4200964a430ae2c9b2b8f7d6450", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c995a4200964a430ae2c9b2b8f7d6450");
        }
        a aVar = (a) com.sankuai.waimai.store.base.net.c.a(obj, a.class);
        if (aVar == null) {
            a aVar2 = new a();
            com.sankuai.waimai.store.base.net.c.a(obj, aVar2);
            return aVar2;
        }
        return aVar;
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2fed94c433e912851ce83c09df93a02", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2fed94c433e912851ce83c09df93a02") : new c();
    }

    public final void a(String str, int i, j<RestRecommendPoi> jVar) {
        Object[] objArr = {str, 1, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4571ba1c9057b537406c2cde1b38b92f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4571ba1c9057b537406c2cde1b38b92f");
        } else {
            a(jVar, ((WMApiService) this.d).getRestRecommendPoi(str, 1));
        }
    }

    public final void a(String str, String str2, int i, String str3, String str4, j<OrderListResponse> jVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, str4, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f521759c7f9f102fcd26364fb5216d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f521759c7f9f102fcd26364fb5216d7d");
        } else {
            a(jVar, ((WMApiService) this.d).getUserOrders(str, str2, i, str3, str4));
        }
    }

    public final void a(String str, String str2, j<OrderDeleteResponse> jVar) {
        Object[] objArr = {str, str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79432ebc34829661955da226c002ceeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79432ebc34829661955da226c002ceeb");
        } else {
            a(jVar, ((WMApiService) this.d).deleteOrder(str, str2));
        }
    }

    public final void a(String str, j<com.sankuai.waimai.store.orderlist.model.a> jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "929d23518ac0fef734927458b1a97baa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "929d23518ac0fef734927458b1a97baa");
        } else {
            a(jVar, ((WMApiService) this.d).confirmReceiveFood(str));
        }
    }

    public final void a(String str, String str2, int i, j<g> jVar) {
        Object[] objArr = {str, str2, 2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e5784add7bf72806ef3cc2c76ae06c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e5784add7bf72806ef3cc2c76ae06c3");
        } else {
            a(jVar, ((WMApiService) this.d).onekeyremind(str, str2, 2));
        }
    }
}
