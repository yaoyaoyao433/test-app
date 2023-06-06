package com.sankuai.waimai.store.v2.detail.component.root;

import com.meituan.android.bus.annotation.Subscribe;
import com.sankuai.waimai.store.v2.detail.component.pricebar.d;
import com.sankuai.waimai.store.v2.detail.component.pricebar.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SGDetailRootBlockEventHelper {
    @Subscribe
    void onSGDetailActionBarBackEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.a aVar);

    @Subscribe
    void onSGDetailIndicatorClickEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b bVar);

    @Subscribe
    void onSGDetailMachEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.mach.b bVar);

    @Subscribe
    void onSGDetailPriceBarAddEventReceive(com.sankuai.waimai.store.shopping.cart.Event.a aVar);

    @Subscribe
    void onSGDetailPriceBarDecEventReceive(com.sankuai.waimai.store.v2.detail.component.pricebar.c cVar);

    @Subscribe
    void onSGDetailPriceBarMultiEventReceive(d dVar);

    @Subscribe
    void onSGDetailPriceBarUpdateSubscribeEventReceive(f fVar);
}
