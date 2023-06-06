package com.sankuai.waimai.store.im.base.net;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.g;
import com.sankuai.waimai.store.base.net.e;
import com.sankuai.waimai.store.base.net.h;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.platform.domain.core.im.MessageUnreadInfoResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiSimpleResultResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.base.net.d<WMIMApiService> {
    public static ChangeQuickRedirect a;

    public static d a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e2742b08840f70de2547b6b6ead6fd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e2742b08840f70de2547b6b6ead6fd6");
        }
        d dVar = (d) com.sankuai.waimai.store.base.net.c.a(obj, d.class);
        if (dVar == null) {
            d dVar2 = new d();
            com.sankuai.waimai.store.base.net.c.a(obj, dVar2);
            return dVar2;
        }
        return dVar;
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dbc90fa391af792a744d9730067ba02", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dbc90fa391af792a744d9730067ba02") : new e() { // from class: com.sankuai.waimai.store.im.base.net.d.1
            public static ChangeQuickRedirect d;

            @Override // com.sankuai.waimai.store.base.net.e, com.sankuai.waimai.store.base.net.b
            public final h e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "893973207f9cf21b5dc65acc9130ca73", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "893973207f9cf21b5dc65acc9130ca73") : new com.sankuai.waimai.store.base.net.wm.b();
            }
        };
    }

    public final void a(long j, String str, int i, j<com.sankuai.waimai.store.im.poi.ordersimplelist.c> jVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ab4d9a5b559d819d67a716c33a2c87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ab4d9a5b559d819d67a716c33a2c87");
        } else {
            a(jVar, ((WMIMApiService) this.d).getSimpleList(j, str, i));
        }
    }

    public final void a(String str, j<PoiSimpleResultResponse> jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f4442ac4d87e1014a1dc13dfd939f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f4442ac4d87e1014a1dc13dfd939f9a");
        } else {
            a(jVar, ((WMIMApiService) this.d).getSimpleList(str));
        }
    }

    public final void a(String str, String str2, int i, j<g> jVar) {
        Object[] objArr = {str, str2, 1, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595cec04d280de31fd5e15837400fdfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595cec04d280de31fd5e15837400fdfe");
        } else {
            a(jVar, ((WMIMApiService) this.d).onekeyremind(str, str2, 1));
        }
    }

    public final void a(int i, j<MessageUnreadInfoResponse> jVar) {
        Object[] objArr = {2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79d54183fe2d1ef1b2efd0ec1a34c4c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79d54183fe2d1ef1b2efd0ec1a34c4c3");
        } else {
            a(jVar, ((WMIMApiService) this.d).getMessageUnReadNum(2));
        }
    }
}
