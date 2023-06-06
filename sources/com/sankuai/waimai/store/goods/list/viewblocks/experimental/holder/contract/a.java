package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.sankuai.shangou.stone.whiteboard.e;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.delegate.c;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.d;
import com.sankuai.waimai.store.newwidgets.list.b;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a extends b {
    void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map);

    void a(Context context, View view, String str, GoodsSpu goodsSpu);

    void a(c.a aVar);

    void a(com.sankuai.waimai.store.goods.list.viewblocks.experimental.delegate.a aVar);

    void a(GoodsSpu goodsSpu, int i);

    void a(@NonNull RestMenuResponse.NavigateItem navigateItem);

    Map<String, Object> f();

    d g();

    int h();

    com.sankuai.waimai.store.platform.domain.manager.poi.a i();

    SCBaseActivity j();

    String k();

    RestMenuResponse l();

    e m();
}
