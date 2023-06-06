package com.sankuai.waimai.store.poi.list.refactor;

import android.arch.lifecycle.k;
import android.arch.lifecycle.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiLocationAddress;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiRequestError;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiPageViewModel extends o {
    public static ChangeQuickRedirect a;
    public k<PoiResult> b;
    public k<PoiVerticalityDataResponse> c;
    public k<com.sankuai.waimai.store.param.a> d;
    public k<Boolean> e;
    public k<Boolean> f;
    public k<PoiRequestError> g;
    public k<PoiLocationAddress> h;
    public k<Boolean> i;
    public k<com.sankuai.waimai.store.widgets.twolevel.c> j;
    private k<GetMenuResponse> k;

    public PoiPageViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9db2ad8cc6a39d328dc544801e277dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9db2ad8cc6a39d328dc544801e277dc");
            return;
        }
        this.b = new k<>();
        this.c = new k<>();
        this.d = new k<>();
        this.e = new k<>();
        this.f = new k<>();
        this.k = new k<>();
        this.g = new k<>();
        this.h = new k<>();
        this.i = new k<>();
        this.j = new k<>();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c597e3bd6fbad6c9343097d9ef74202", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c597e3bd6fbad6c9343097d9ef74202")).booleanValue();
        }
        Boolean a2 = this.i.a();
        return a2 != null && a2.booleanValue();
    }

    public final void a(com.sankuai.waimai.store.widgets.twolevel.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ed1181ac058145213fc8c418cf29f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ed1181ac058145213fc8c418cf29f0d");
        } else {
            this.j.b((k<com.sankuai.waimai.store.widgets.twolevel.c>) cVar);
        }
    }
}
