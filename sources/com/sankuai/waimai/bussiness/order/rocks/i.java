package com.sankuai.waimai.bussiness.order.rocks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderBaseRocksResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements rx.functions.h {
    public static ChangeQuickRedirect a;
    private final f b;

    private i(f fVar) {
        this.b = fVar;
    }

    public static rx.functions.h a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1502576e01a0a8d3a1b25ddc4a8ff17", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1502576e01a0a8d3a1b25ddc4a8ff17") : new i(fVar);
    }

    @Override // rx.functions.h
    public final Object a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c499f42a6ac807bbd92a5b0f93eb352e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c499f42a6ac807bbd92a5b0f93eb352e") : f.a(this.b, (OrderBaseRocksResponse) obj, (BaseResponse) obj2);
    }
}
