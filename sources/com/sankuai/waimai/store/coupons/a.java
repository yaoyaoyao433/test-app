package com.sankuai.waimai.store.coupons;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.ActivityItem;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.h;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Object h = new Object();
    private static volatile a i;
    public Poi.PoiCouponItem b;
    public h c;
    public Poi.CouponTabInfo d;
    public List<Poi.CouponCategoryList> e;
    public Object f;
    public String g;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42a7751b2c6a450fd3c13d2dcffb1a83", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42a7751b2c6a450fd3c13d2dcffb1a83");
        }
        if (i == null) {
            synchronized (h) {
                if (i == null) {
                    i = new a();
                }
            }
        }
        return i;
    }

    public final void a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e3f635be5ee154d3b05a3ceab00601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e3f635be5ee154d3b05a3ceab00601");
        } else {
            a(context, aVar, 1);
        }
    }

    public final void a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, Poi.CouponTabInfo couponTabInfo, List<Poi.CouponCategoryList> list, int i2) {
        Object[] objArr = {context, aVar, couponTabInfo, list, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a39cae4a0618d1aa6f168baaa742e87e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a39cae4a0618d1aa6f168baaa742e87e");
        } else {
            a(context, aVar, couponTabInfo, 0L, list, null, 1, null);
        }
    }

    public final void a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, Poi.CouponTabInfo couponTabInfo, long j, List<Poi.CouponCategoryList> list, List<ActivityItem> list2, int i2, GoodsSpu goodsSpu) {
        Object[] objArr = {context, aVar, couponTabInfo, 0L, list, list2, Integer.valueOf(i2), goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8679d466f2a254b72b2cd1c8304bbabd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8679d466f2a254b72b2cd1c8304bbabd");
            return;
        }
        this.d = couponTabInfo;
        this.e = list;
        this.f = null;
        if (this.c != null) {
            this.f = this.c.i;
        }
        g.a((SCBaseActivity) context, aVar, this.c, i2, goodsSpu, this.g);
        this.c = null;
    }

    public final Map<String, String> a(Context context, String str) {
        com.sankuai.waimai.store.platform.domain.manager.poi.a l;
        String a2;
        boolean z = false;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3e419a1d9de421280515dbb658e26fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3e419a1d9de421280515dbb658e26fd");
        }
        HashMap hashMap = new HashMap();
        if (context instanceof BaseMemberActivity) {
            Object[] objArr2 = {hashMap, str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "435c767577c1462936b9f8ed2177f9b1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "435c767577c1462936b9f8ed2177f9b1")).booleanValue();
            } else if (!TextUtils.isEmpty(str) && (l = com.sankuai.waimai.store.order.a.e().l(str)) != null && l.b != null) {
                hashMap.put("wm_poi_id", String.valueOf(l.f()));
                hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, l.h());
                hashMap.put("stid", l.b.abExpInfo);
                Object[] objArr3 = {l};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f9d3b65cfbe5d53ad23642ed2ad2b9fa", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f9d3b65cfbe5d53ad23642ed2ad2b9fa");
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("poi_info", l.b);
                    Poi.PoiCouponEntity poiCouponEntity = new Poi.PoiCouponEntity();
                    poiCouponEntity.couponTabInfo = this.d;
                    poiCouponEntity.couponCategoryLists = this.e;
                    hashMap2.put("poi_discount_info", poiCouponEntity);
                    hashMap2.put("product_tags", this.f);
                    a2 = i.a(hashMap2);
                }
                hashMap.put("data", a2);
                z = true;
            }
            if (z) {
                hashMap.put("cid", b.a(context));
                return hashMap;
            }
        }
        return !(context instanceof SCBaseActivity) ? hashMap : hashMap;
    }

    public final void a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i2) {
        Poi.PoiCouponEntity poiCoupon;
        Object[] objArr = {context, aVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d76835abf1ff6214354e2d2eb0caab07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d76835abf1ff6214354e2d2eb0caab07");
        } else if (aVar == null || (poiCoupon = aVar.b.getPoiCoupon()) == null) {
        } else {
            a(context, aVar, poiCoupon.couponTabInfo, 0L, poiCoupon.getPoiCouponCategoryList(), aVar.b.getBottomActivities(), i2, null);
        }
    }
}
