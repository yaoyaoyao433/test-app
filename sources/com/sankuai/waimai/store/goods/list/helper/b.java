package com.sankuai.waimai.store.goods.list.helper;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.method.Func0;
import com.sankuai.waimai.router.method.Func2;
import com.sankuai.waimai.router.method.Func7;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final Func2<Integer, List<Object>, Object> b;
    final Map<Poi.PoiCouponItem, Func2<Integer, List<Object>, Object>> c;
    @NonNull
    private final SCBaseActivity d;
    private final long e;
    private final Func0 f;

    private b(@NonNull SCBaseActivity sCBaseActivity, long j, boolean z) {
        Object[] objArr = {sCBaseActivity, new Long(j), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732580d343e70993a4c9bb4d0174f3ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732580d343e70993a4c9bb4d0174f3ce");
            return;
        }
        this.c = new HashMap();
        this.f = new Func0() { // from class: com.sankuai.waimai.store.goods.list.helper.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.method.Func0
            public final Object call() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d38f1a2058b3f45938665639bcb57dd", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d38f1a2058b3f45938665639bcb57dd");
                }
                b bVar = b.this;
                Object[] objArr3 = {-1};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "29fc8ee25e69b8d9f0d89ff9e97b2678", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "29fc8ee25e69b8d9f0d89ff9e97b2678");
                    return null;
                }
                for (Map.Entry<Poi.PoiCouponItem, Func2<Integer, List<Object>, Object>> entry : bVar.c.entrySet()) {
                    Poi.PoiCouponItem key = entry.getKey();
                    if (key != null) {
                        key.mtMemberStatus = 1;
                    }
                    Func2<Integer, List<Object>, Object> value = entry.getValue();
                    if (value != null) {
                        bVar.a(value, 6, 0);
                    }
                }
                bVar.a(bVar.b, -1, 0);
                return null;
            }
        };
        this.d = sCBaseActivity;
        this.e = j;
        this.b = b(new Poi.PoiCouponItem());
    }

    public b(@NonNull SCBaseActivity sCBaseActivity, long j) {
        this(sCBaseActivity, j, false);
        Object[] objArr = {sCBaseActivity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451da4fb8d78c3cd1d9da0bc4d3323fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451da4fb8d78c3cd1d9da0bc4d3323fa");
        }
    }

    private Func2<Integer, List<Object>, Object> b(@NonNull Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f74131be574dbfa8fb7a3c46dcf47e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Func2) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f74131be574dbfa8fb7a3c46dcf47e1");
        }
        try {
            Object[] objArr2 = {Long.valueOf(this.e), Double.valueOf(poiCouponItem.mCouponValue), this.d, this.d.w(), "", Integer.valueOf(poiCouponItem.mtMemberStatus == 1 ? 0 : 2), this.f};
            Object[] objArr3 = {"/scpoiexchangecouponhelperbridge", objArr2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.router.a.a;
            return (Func2) (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "0ff3236e6ebf270211812fcb9bf5d797", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "0ff3236e6ebf270211812fcb9bf5d797") : ((Func7) com.sankuai.waimai.router.a.a(Func7.class, "/scpoiexchangecouponhelperbridge")).call(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5], objArr2[6]));
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return null;
        }
    }

    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Func2<Integer, List<Object>, Object> b;
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "086084d0b18ce926b1d722f3395e50c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "086084d0b18ce926b1d722f3395e50c8");
        } else if (poiCouponItem == null || this.c.get(poiCouponItem) != null || (b = b(poiCouponItem)) == null) {
        } else {
            this.c.put(poiCouponItem, b);
        }
    }

    void a(Func2<Integer, List<Object>, Object> func2, int i, Object... objArr) {
        Object[] objArr2 = {func2, Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "ec55a32fba2a165bc300ca30e93ed81d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "ec55a32fba2a165bc300ca30e93ed81d");
        } else if (func2 == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(objArr));
            try {
                func2.call(Integer.valueOf(i), arrayList);
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
    }
}
