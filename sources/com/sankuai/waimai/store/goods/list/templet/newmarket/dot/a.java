package com.sankuai.waimai.store.goods.list.templet.newmarket.dot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e
    public final void a() {
    }

    public a(@NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.e eVar, @NonNull Context context) {
        super(eVar, context);
        Object[] objArr = {eVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec979815eb2b5340ab221850f243d8d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec979815eb2b5340ab221850f243d8d2");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, View view) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d1311d5f98ab744ece2b8e4aca92ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d1311d5f98ab744ece2b8e4aca92ea");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            if (this.d.x() != null) {
                hashMap.put("poi_id", this.d.x().d());
            }
            hashMap.put("stid", c());
            a(hashMap, goodsPoiCategory);
            a(hashMap);
            c cVar = this.c;
            cVar.a("b_waimai_sg_qnihe1m1_mv", hashMap, view, goodsPoiCategory.getTagCode() + "b_waimai_sg_qnihe1m1_mv");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e
    public final void a(GoodsPoiCategory goodsPoiCategory, int i) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ccb432eda8bd9220b4c29496a06063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ccb432eda8bd9220b4c29496a06063");
        } else if (goodsPoiCategory == null) {
        } else {
            HashMap hashMap = new HashMap();
            if (this.d.x() != null) {
                hashMap.put("poi_id", this.d.x().d());
            }
            hashMap.put("stid", c());
            a(hashMap, goodsPoiCategory);
            a(hashMap);
            this.c.a("b_waimai_sg_qnihe1m1_mc", hashMap);
        }
    }
}
