package com.sankuai.waimai.bussiness.order.detailnew.preload;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderBaseRocksResponse;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import com.sankuai.waimai.bussiness.order.rocks.o;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.preload.PreloadRunnable;
import com.sankuai.waimai.platform.preload.d;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.platform.utils.i;
import com.sankuai.waimai.platform.utils.sharedpreference.a;
import java.util.Map;
import rx.functions.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderDetailNetworkPreLoader implements PreloadRunnable<o> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.preload.PreloadRunnable
    public void run(Bundle bundle, Uri uri, d<o> dVar) {
        Object[] objArr = {bundle, uri, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01525c60707e2f716ad397d99a59ef0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01525c60707e2f716ad397d99a59ef0f");
            return;
        }
        e a = e.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "a3e403dc2744f774a3c56d69c9f7f743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "a3e403dc2744f774a3c56d69c9f7f743");
        } else if (a.b == null) {
            a.b = a.j();
        }
        if (bundle == null || !e.a().a(uri.getPath())) {
            dVar.cancel();
        } else if (bundle != null && bundle.getInt("_wm_preload_page_id_overridable_", 0) != 0) {
            dVar.cancel();
        } else {
            String string = bundle.getString("hash_id");
            if (TextUtils.isEmpty(string)) {
                string = uri.getQueryParameter("hash_id");
                if (TextUtils.isEmpty(string)) {
                    string = uri.getQueryParameter("oid");
                    if (TextUtils.isEmpty(string)) {
                        dVar.cancel();
                        return;
                    }
                }
            }
            preRequestRocks(string, dVar);
        }
    }

    private void preRequestRocks(String str, final d<o> dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dc199f15907aec3a45c65bfbebbd005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dc199f15907aec3a45c65bfbebbd005");
            return;
        }
        OrderApi orderApi = (OrderApi) b.a((Class<Object>) OrderApi.class);
        int i = i.a(com.meituan.android.singleton.b.a) ? 1 : 2;
        rx.d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<o>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.preload.OrderDetailNetworkPreLoader.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(o oVar) {
                o oVar2 = oVar;
                Object[] objArr2 = {oVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a10b113abee87d897902c70da881207e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a10b113abee87d897902c70da881207e");
                } else {
                    dVar.a(oVar2);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "35bca4b284aa07ed09e06de7ca11dd56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "35bca4b284aa07ed09e06de7ca11dd56");
                } else if (aVar != null) {
                    dVar.a(new o(aVar.b(), aVar.a()));
                } else {
                    dVar.a(new o(0, "预加载异常，请重试"));
                }
            }
        }, rx.d.b(orderApi.getOrderStatusInfoRocks(str, "", i, com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.domain.manager.user.a.i().d() + "_aoi_addr_tip", (String) null)).b(rx.schedulers.a.e()), orderApi.getOrderDetailRocks(str).b(rx.schedulers.a.e()), new h<BaseResponse<OrderRocksServerModel>, OrderBaseRocksResponse<Map<String, Object>>, o>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.preload.OrderDetailNetworkPreLoader.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.h
            public final /* synthetic */ o a(BaseResponse<OrderRocksServerModel> baseResponse, OrderBaseRocksResponse<Map<String, Object>> orderBaseRocksResponse) {
                BaseResponse<OrderRocksServerModel> baseResponse2 = baseResponse;
                OrderBaseRocksResponse<Map<String, Object>> orderBaseRocksResponse2 = orderBaseRocksResponse;
                Object[] objArr2 = {baseResponse2, orderBaseRocksResponse2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa0f5a267340ec7d6fc693c8467371a1", RobustBitConfig.DEFAULT_VALUE)) {
                    return (o) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa0f5a267340ec7d6fc693c8467371a1");
                }
                if (baseResponse2 == null || orderBaseRocksResponse2 == null) {
                    throw new com.sankuai.waimai.platform.modular.network.error.a("预加载异常，请重试");
                }
                if (!baseResponse2.isSuccess()) {
                    a.AbstractC1040a a2 = new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_rocks_view");
                    StringBuilder sb = new StringBuilder();
                    sb.append(baseResponse2.code);
                    a.AbstractC1040a b = a2.b(sb.toString());
                    com.sankuai.waimai.platform.capacity.log.i.d(b.c("订单状态页面加载失败, " + baseResponse2.msg).b(true).b());
                    throw new com.sankuai.waimai.platform.modular.network.error.a(baseResponse2.code, baseResponse2.msg);
                } else if (!orderBaseRocksResponse2.isSuccess()) {
                    throw new com.sankuai.waimai.platform.modular.network.error.a(orderBaseRocksResponse2.code, orderBaseRocksResponse2.msg);
                } else {
                    return new o(orderBaseRocksResponse2.data, baseResponse2.data);
                }
            }
        }).a(rx.android.schedulers.a.a()));
    }
}
