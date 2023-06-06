package com.sankuai.waimai.store.manager.coupon;

import android.support.annotation.MainThread;
import com.google.gson.internal.LinkedTreeMap;
import com.meituan.msi.api.extension.medicine.CouponStateResponse;
import com.meituan.msi.api.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.activities.MutliPoiCouponItem;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c d;
    public List<b> b;
    public j<CouponStateResponse> c;
    private List<a> e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Poi.PoiCouponItem poiCouponItem);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(List<MutliPoiCouponItem> list, String str, int i);
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4f221a7b1fddff460d59adae5eda680", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4f221a7b1fddff460d59adae5eda680");
            return;
        }
        this.e = new ArrayList();
        this.b = new ArrayList();
    }

    @MainThread
    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "764291301c76b3479e6157bf59ebad18", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "764291301c76b3479e6157bf59ebad18");
        }
        if (d == null) {
            d = new c();
        }
        return d;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a0afb6bdee3c360bdd1e25c1519bbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a0afb6bdee3c360bdd1e25c1519bbb");
        } else if (this.e.contains(aVar)) {
        } else {
            this.e.add(aVar);
        }
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc404392f7e04c49847d73742f88ec9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc404392f7e04c49847d73742f88ec9f");
        } else {
            this.e.remove(aVar);
        }
    }

    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb1ba9b964b99a1b971358b5e037bc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb1ba9b964b99a1b971358b5e037bc4");
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).a(poiCouponItem);
        }
        if (this.c != null) {
            CouponStateResponse couponStateResponse = new CouponStateResponse();
            couponStateResponse.coupon_item = i.a(poiCouponItem);
            this.c.a(couponStateResponse);
        }
    }

    public final void a(List<MutliPoiCouponItem> list, String str, int i) {
        Object[] objArr = {list, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d3e5368138a54a0e081b4aaf7e42d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d3e5368138a54a0e081b4aaf7e42d6");
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.get(i2).a(list, str, i);
        }
    }

    public final void a(String str, String str2) throws Exception {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627d5f66fb276913bac48012fef8fc0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627d5f66fb276913bac48012fef8fc0f");
            return;
        }
        Map map = (Map) com.sankuai.waimai.store.order.a.e().k(str).y.get("tip_info");
        if (map == null) {
            throw new Exception("tipInfoMap == null");
        }
        List list = (List) map.get("coupon_info_list");
        LinkedTreeMap linkedTreeMap = (LinkedTreeMap) i.a(str2, Map.class);
        if (list == null || linkedTreeMap == null) {
            throw new Exception("couponInfoList == null || updateCoupon == null");
        }
        for (int i = 0; i < list.size(); i++) {
            LinkedTreeMap linkedTreeMap2 = (LinkedTreeMap) list.get(i);
            if (Objects.equals(linkedTreeMap.get("coupon_id"), linkedTreeMap2.get("coupon_id"))) {
                linkedTreeMap2.put("coupon_status", 1);
                return;
            }
        }
    }
}
