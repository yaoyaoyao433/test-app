package com.sankuai.waimai.store.goods.list.base;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {
    void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map);

    void a(Context context, View view, String str, GoodsSpu goodsSpu);

    void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory);

    void a(GoodsSpu goodsSpu, long j, String str, String str2);

    void a(GoodsSpu goodsSpu, Poi poi);
}
