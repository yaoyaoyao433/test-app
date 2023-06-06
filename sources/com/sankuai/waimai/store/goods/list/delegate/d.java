package com.sankuai.waimai.store.goods.list.delegate;

import android.support.annotation.Nullable;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface d extends com.sankuai.waimai.store.goods.list.base.a {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void c();

        PrioritySmoothNestedScrollView e();
    }

    void a(long j);

    String b();

    com.sankuai.waimai.store.platform.domain.manager.poi.a d();

    @Nullable
    MetricsSpeedMeterTask j();

    SCBaseActivity k();

    String l();

    com.sankuai.shangou.stone.whiteboard.e m();

    SCShopCartDelegate n();
}
