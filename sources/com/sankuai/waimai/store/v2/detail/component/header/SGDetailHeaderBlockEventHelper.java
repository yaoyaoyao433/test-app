package com.sankuai.waimai.store.v2.detail.component.header;

import com.meituan.android.bus.annotation.Subscribe;
import com.sankuai.waimai.store.shopping.cart.Event.a;
import com.sankuai.waimai.store.v2.detail.component.pricebar.c;
import com.sankuai.waimai.store.v2.detail.component.pricebar.d;
import com.sankuai.waimai.store.v2.detail.component.pricebar.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SGDetailHeaderBlockEventHelper {
    @Subscribe
    void onSGDetailPriceBarAddEventReceive(a aVar);

    @Subscribe
    void onSGDetailPriceBarDecEventReceive(c cVar);

    @Subscribe
    void onSGDetailPriceBarMultiEventReceive(d dVar);

    @Subscribe
    void onSGDetailPriceBarUpdateSubscribeEventReceive(f fVar);
}
