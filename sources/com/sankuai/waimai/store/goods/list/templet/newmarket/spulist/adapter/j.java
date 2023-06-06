package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface j extends com.sankuai.waimai.store.newwidgets.list.b {
    int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu);

    void a(int i, GoodsPoiCategory goodsPoiCategory, int i2);

    void a(long j);

    void a(View view);

    void a(View view, GoodsSpu goodsSpu);

    void a(View view, GoodsSpu goodsSpu, Map<String, String> map);

    void a(View view, GoodsPoiCategory goodsPoiCategory);

    void a(@NonNull k kVar, View view, HandPriceInfo handPriceInfo);

    void a(GoodsSpu goodsSpu);

    void a(GoodsSpu goodsSpu, int i);

    void a(GoodsSpu goodsSpu, View view);

    void a(GoodsSpu goodsSpu, View view, int i);

    void a(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i);

    void a(GoodsSpu goodsSpu, Map<String, String> map);

    void a(GoodsPoiCategory goodsPoiCategory, int i, List<Long> list);

    void a(GoodsPoiCategory goodsPoiCategory, View view, int i);

    void a(GoodsPoiCategory goodsPoiCategory, View view, String str, int i);

    void a(GoodsPoiCategory goodsPoiCategory, String str, int i);

    void a(boolean z, GoodsPoiCategory goodsPoiCategory);

    boolean a(GoodsPoiCategory goodsPoiCategory);

    k b(int i);

    void b(View view, GoodsSpu goodsSpu);

    void b(GoodsSpu goodsSpu, int i);

    void b(GoodsSpu goodsSpu, View view);

    boolean b(GoodsSpu goodsSpu);

    boolean b(GoodsPoiCategory goodsPoiCategory);

    boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu);

    void c(GoodsSpu goodsSpu, int i);

    void c(GoodsPoiCategory goodsPoiCategory);

    void c(boolean z);

    boolean c(GoodsSpu goodsSpu);

    boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu);

    void d(GoodsSpu goodsSpu, int i);

    void d(GoodsPoiCategory goodsPoiCategory);

    void e(GoodsSpu goodsSpu);

    void f(GoodsSpu goodsSpu);

    Context getContext();

    boolean h();

    boolean i();

    GoodsPoiCategory l();

    GoodsPoiCategory m();

    int n();

    int o();

    com.sankuai.waimai.store.platform.domain.manager.poi.a p();

    ViewGroup q();

    Map<String, String> t();
}
