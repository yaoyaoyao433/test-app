package com.sankuai.waimai.business.order.api.orderlist;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.widget.AbsListView;
import com.sankuai.waimai.business.order.api.model.OrderListResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IOrderListProvider {
    Class getGoldenCoinProgressViewManagerClass();

    Class getOrderListFragmentClass();

    d<BaseResponse<OrderListResponse>> getUncommentOrders();

    void onActivityResult(Fragment fragment, int i, int i2, Intent intent);

    void refreshViewByNewIntent(Fragment fragment, Intent intent);

    void setContentScrollListener(Fragment fragment, AbsListView.OnScrollListener onScrollListener);
}
