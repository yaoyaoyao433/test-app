package com.sankuai.waimai.store.goods.detail.components.root;

import com.meituan.android.bus.annotation.Subscribe;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SGDetailRootTileBlockEventHelper {
    @Subscribe
    void onSGDetailActionBarBackEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.a aVar);

    @Subscribe
    void onSGDetailIndicatorClickEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b bVar);

    @Subscribe
    void onSGDetailMachEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.mach.b bVar);

    @Subscribe
    void onSGDetailMachSyncEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.mach.c cVar);
}
