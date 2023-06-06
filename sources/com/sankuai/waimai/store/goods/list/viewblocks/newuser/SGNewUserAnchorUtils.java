package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.gson.internal.LinkedTreeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGNewUserAnchorUtils {
    public static ChangeQuickRedirect a;
    LinkedHashMap<Integer, SecondStickyModel> b;
    private LinkedHashMap<Integer, int[]> c;

    public SGNewUserAnchorUtils(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07fe9a1a2d45452d9bba68e08791a10d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07fe9a1a2d45452d9bba68e08791a10d");
            return;
        }
        this.c = new LinkedHashMap<>();
        this.b = new LinkedHashMap<>();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e8b35472dd667707caedf60a8eb3383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e8b35472dd667707caedf60a8eb3383");
            return;
        }
        int[] iArr = {1, 2, 3, 4, 5, 6, 16, 17, 15};
        this.c.put(1, iArr);
        int[] iArr2 = {7, 8, 9, 10, 11, 12, 13, 14};
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        this.c.put(7, iArr2);
        int[] iArr3 = {16, 16, 5, 6, 17};
        Arrays.sort(iArr3);
        this.b.put(16, new SecondStickyModel(iArr3, iArr2, 0));
        int[] iArr4 = {8, 9, 10, 11, 12, 13, 14};
        Arrays.sort(iArr4);
        this.b.put(10, new SecondStickyModel(iArr4, new int[0], 0));
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SecondStickyModel {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int[] nextStickViewTypes;
        public int offset = 0;
        public int[] secondStickViewTypes;

        public SecondStickyModel(int[] iArr, int[] iArr2, int i) {
            this.secondStickViewTypes = iArr;
            this.nextStickViewTypes = iArr2;
        }
    }

    public final int a(int i, List<b> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678bb9dccd5f60ef89fa14f00dab5a11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678bb9dccd5f60ef89fa14f00dab5a11")).intValue();
        }
        if (this.b.size() <= 0 || com.sankuai.shangou.stone.util.a.b(list) || i <= 0) {
            return -1;
        }
        for (Map.Entry<Integer, SecondStickyModel> entry : this.b.entrySet()) {
            if (Arrays.binarySearch(entry.getValue().secondStickViewTypes, i) >= 0) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    public final int b(int i, List<b> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd40d6c924e89dbec6ca0a2b52166675", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd40d6c924e89dbec6ca0a2b52166675")).intValue();
        }
        if (this.c.size() <= 0 || com.sankuai.shangou.stone.util.a.b(list) || i <= 0) {
            return -1;
        }
        for (Map.Entry<Integer, int[]> entry : this.c.entrySet()) {
            if (Arrays.binarySearch(entry.getValue(), i) >= 0) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    public final int a(int i) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb97231eac9ed2a8c93d36863a6f1c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb97231eac9ed2a8c93d36863a6f1c5")).intValue();
        }
        if (this.c.size() <= 0 || i <= 0) {
            return -1;
        }
        for (Map.Entry<Integer, int[]> entry : this.c.entrySet()) {
            if (entry.getKey().intValue() == i) {
                z = true;
            } else if (z) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    public final int a(List<b> list, Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {list, poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ccaf344ebc1514930247dfe6696dab0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ccaf344ebc1514930247dfe6696dab0")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return -1;
        }
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) list); i++) {
            b bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (bVar != null && bVar.q == 10 && bVar.t != null && bVar.t.jsonData != null) {
                try {
                    Map<String, Object> map = bVar.t.jsonData;
                    if (map.get("coupon_list") instanceof ArrayList) {
                        List list2 = (List) map.get("coupon_list");
                        if (com.sankuai.shangou.stone.util.a.b(list2)) {
                            continue;
                        } else {
                            LinkedTreeMap linkedTreeMap = (LinkedTreeMap) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, 0);
                            if (poiCouponItem.mCouponId == new BigDecimal(((Double) linkedTreeMap.get("coupon_id")).doubleValue()).longValue()) {
                                HashMap hashMap = new HashMap();
                                linkedTreeMap.put("coupon_status", Integer.valueOf(poiCouponItem.mCouponStatus));
                                hashMap.put("coupon_id", Long.valueOf(poiCouponItem.mCouponId));
                                hashMap.put("coupon_status", Integer.valueOf(poiCouponItem.mCouponStatus));
                                if (poiCouponItem.mCouponStatus == 1) {
                                    linkedTreeMap.put("coupon_button_text", "去使用");
                                    hashMap.put("coupon_button_text", "去使用");
                                }
                                bVar.m = hashMap;
                                return i;
                            }
                            continue;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return -1;
    }

    public final SGNewUserLandResponse.HotSaleProductTabs a(List<b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8269346a897eb4487fae7df3944b08b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGNewUserLandResponse.HotSaleProductTabs) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8269346a897eb4487fae7df3944b08b");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) list); i++) {
            b bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (bVar != null && bVar.q == 16 && bVar.n != null) {
                return bVar.n;
            }
        }
        return null;
    }

    public final int b(List<b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa0abd6ae7292790a5834f045bca33f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa0abd6ae7292790a5834f045bca33f")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return -1;
        }
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) list); i++) {
            b bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (bVar != null && bVar.q == 16 && bVar.n != null) {
                return i;
            }
        }
        return -1;
    }

    public final int a(List<b> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5ac262e210f458274ecb4ac31c0f33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5ac262e210f458274ecb4ac31c0f33")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return -1;
        }
        for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) list); i++) {
            b bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (bVar != null && bVar.q == 16) {
                bVar.p = z;
                return i;
            }
        }
        return -1;
    }
}
