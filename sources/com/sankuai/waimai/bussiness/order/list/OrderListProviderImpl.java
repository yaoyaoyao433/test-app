package com.sankuai.waimai.bussiness.order.list;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.widget.AbsListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.OrderListResponse;
import com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider;
import com.sankuai.waimai.bussiness.order.list.net.OrderListApi;
import com.sankuai.waimai.bussiness.order.list.rn.GoldenCoinProgressViewManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderListProviderImpl implements IOrderListProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider
    public void setContentScrollListener(Fragment fragment, AbsListView.OnScrollListener onScrollListener) {
        Object[] objArr = {fragment, onScrollListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "702ade40bac5bff7ffc5f34612bdc873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "702ade40bac5bff7ffc5f34612bdc873");
        }
    }

    @Override // com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider
    public Class getOrderListFragmentClass() {
        return OrderListRNFragment.class;
    }

    @Override // com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider
    public Class getGoldenCoinProgressViewManagerClass() {
        return GoldenCoinProgressViewManager.class;
    }

    @Override // com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider
    public void refreshViewByNewIntent(Fragment fragment, Intent intent) {
        Object[] objArr = {fragment, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35c53479362b2e165827354f40e63e9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35c53479362b2e165827354f40e63e9d");
        } else if (fragment instanceof OrderListRNFragment) {
            OrderListRNFragment orderListRNFragment = (OrderListRNFragment) fragment;
            Object[] objArr2 = {intent};
            ChangeQuickRedirect changeQuickRedirect3 = OrderListRNFragment.a;
            if (PatchProxy.isSupport(objArr2, orderListRNFragment, changeQuickRedirect3, false, "19b85cffe8cc8eb090a1443999ed9cfc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, orderListRNFragment, changeQuickRedirect3, false, "19b85cffe8cc8eb090a1443999ed9cfc");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = OrderListRNFragment.a;
            if (PatchProxy.isSupport(objArr3, orderListRNFragment, changeQuickRedirect4, false, "c08d458405258eed992fc5e580c6eefe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, orderListRNFragment, changeQuickRedirect4, false, "c08d458405258eed992fc5e580c6eefe");
            } else if (((WMRNBaseFragment) orderListRNFragment).j == null) {
                i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_list_refresh").c("not_attached_to_activity").b());
            } else {
                int a = com.sankuai.waimai.foundation.router.a.a(((WMRNBaseFragment) orderListRNFragment).j.getIntent(), "ordertype", "ordertype", 1);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", a - 1);
                orderListRNFragment.a("onTabSwitch", createMap);
            }
            orderListRNFragment.q();
        }
    }

    @Override // com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider
    public void onActivityResult(Fragment fragment, int i, int i2, Intent intent) {
        Object[] objArr = {fragment, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbaea964dc8a873a756c631df74b7ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbaea964dc8a873a756c631df74b7ef0");
        } else {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider
    public d<BaseResponse<OrderListResponse>> getUncommentOrders() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbbc61c770ef6721bb906632e577c0fe", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbbc61c770ef6721bb906632e577c0fe") : ((OrderListApi) b.a((Class<Object>) OrderListApi.class)).getUserOrders("", "", "0", 1);
    }
}
