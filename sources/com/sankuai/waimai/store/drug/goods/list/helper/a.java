package com.sankuai.waimai.store.drug.goods.list.helper;

import android.content.BroadcastReceiver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.coupon.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.i;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c.a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    public BroadcastReceiver c;
    public SCBaseActivity d;
    public InterfaceC1147a e;
    public a.b f;
    public String g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.goods.list.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1147a {
        ReactContext a();
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48e2d7e6b6613dc821aa6a86be52d2fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48e2d7e6b6613dc821aa6a86be52d2fa");
            return;
        }
        Poi.PoiCouponEntity poiCoupon = this.b.b.getPoiCoupon();
        if (poiCoupon == null || com.sankuai.shangou.stone.util.a.b(poiCoupon.getPoiCouponItems())) {
            return;
        }
        WritableMap createMap = Arguments.createMap();
        Iterator<Poi.PoiCouponItem> it = poiCoupon.getPoiCouponItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Poi.PoiCouponItem next = it.next();
            if (next != null && next.mCouponId == poiCouponItem.mCouponId) {
                next.copyValueFrom(poiCouponItem);
                createMap.putString("data", i.a(next));
                break;
            }
        }
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(this.e.a(), "MedPoiPageCouponListChanged", createMap);
    }
}
