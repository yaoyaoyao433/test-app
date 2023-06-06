package com.sankuai.waimai.store.goods.list.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.coupon.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.i;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c.a {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    SCBaseActivity c;
    a.b d;
    String e;
    private BroadcastReceiver f;
    private InterfaceC1183a g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1183a {
        ReactContext a();
    }

    public final void a(com.sankuai.waimai.store.goods.list.delegate.d dVar, InterfaceC1183a interfaceC1183a) {
        Object[] objArr = {dVar, interfaceC1183a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59546318c19d39eac10649e5ca861b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59546318c19d39eac10649e5ca861b3c");
            return;
        }
        this.c = dVar.k();
        this.e = dVar.l();
        this.b = dVar.d();
        this.g = interfaceC1183a;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0f21451fa08bc3433b4c027e8df0c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0f21451fa08bc3433b4c027e8df0c47");
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("medicine:show_coupon_panel_view");
            intentFilter.addAction("medicine:show_member_coupon_alert_view");
            intentFilter.addAction("medicine:coupon_list_item_did_change");
            this.f = new BroadcastReceiver() { // from class: com.sankuai.waimai.store.goods.list.helper.MrnPoiCouponHelper$1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Poi.PoiCouponItem poiCouponItem;
                    Poi.PoiCouponEntity poiCoupon;
                    Object[] objArr3 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a98338a4a20ded26145a94cb20a065c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a98338a4a20ded26145a94cb20a065c5");
                        return;
                    }
                    String action = intent.getAction();
                    Bundle extras = intent.getExtras();
                    if (extras == null || a.this.c == null || !a.this.c.x()) {
                        return;
                    }
                    String string = extras.getString("data");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        if (com.sankuai.waimai.store.order.a.e().b(jSONObject.optString("poiId"), String.valueOf(a.this.b.f()))) {
                            if ("medicine:show_coupon_panel_view".equals(action)) {
                                String optString = jSONObject.optString("selectedTab");
                                if (!"0".equals(optString) && !TextUtils.isEmpty(optString)) {
                                    if ("1".equals(optString)) {
                                        com.sankuai.waimai.store.coupons.a.a().a(a.this.c, a.this.b, 0);
                                        return;
                                    }
                                    return;
                                }
                                com.sankuai.waimai.store.coupons.a.a().a(a.this.c, a.this.b);
                            } else if ("medicine:show_member_coupon_alert_view".equals(action)) {
                                a.this.d.a(a.this.b.f(), a.this.b.h(), a.this.e, null);
                            } else {
                                if ("medicine:coupon_list_item_did_change".equals(action) && (poiCouponItem = (Poi.PoiCouponItem) i.a(jSONObject.optString("couponListItem"), Poi.PoiCouponItem.class)) != null && (poiCoupon = a.this.b.b.getPoiCoupon()) != null && !com.sankuai.shangou.stone.util.a.b(poiCoupon.getPoiCouponItems())) {
                                    Iterator<Poi.PoiCouponItem> it = a.this.b.b.getPoiCoupon().getPoiCouponItems().iterator();
                                    while (it.hasNext()) {
                                        Poi.PoiCouponItem next = it.next();
                                        if (next != null && next.mCouponId == poiCouponItem.mCouponId) {
                                            next.copyValueFrom(poiCouponItem);
                                            com.sankuai.waimai.store.manager.coupon.c.a().a(next);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            this.c.registerReceiver(this.f, intentFilter);
        }
        this.d = new com.sankuai.waimai.store.coupon.c(new com.sankuai.waimai.store.coupon.b(this.c));
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d985b15c72c9f763275199a28de030a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d985b15c72c9f763275199a28de030a3");
            return;
        }
        this.c.unregisterReceiver(this.f);
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9bededae9eb8c3f2d829d37a4bcc633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9bededae9eb8c3f2d829d37a4bcc633");
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
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(this.g.a(), "MedPoiPageCouponListChanged", createMap);
    }
}
