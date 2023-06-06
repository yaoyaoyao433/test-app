package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro;

import android.app.Activity;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.Gson;
import com.meituan.android.cube.pga.action.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMRestaurantExpandCouponComponent extends a<View> {
    public static ChangeQuickRedirect a;
    private h b;
    private Poi.PoiCouponEntity c;

    @JSMethod(methodName = "expose")
    @Keep
    public void expose() {
    }

    public WMRestaurantExpandCouponComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "098924daf5e9a630c54323c374a254cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "098924daf5e9a630c54323c374a254cf");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c4b52a15d78a5c17ada01cda0d4ea4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c4b52a15d78a5c17ada01cda0d4ea4d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if ("poiInfo".equals(str)) {
                if (obj instanceof MachMap) {
                    MachMap machMap = (MachMap) obj;
                    if (machMap.containsKey("poi_coupon")) {
                        try {
                            this.c = (Poi.PoiCouponEntity) new Gson().fromJson(com.sankuai.waimai.machpro.util.b.c((MachMap) machMap.get("poi_coupon")).toString(), (Class<Object>) Poi.PoiCouponEntity.class);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (this.c != null) {
                            this.b.a(this.c);
                            this.b.a(400);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            super.updateAttribute(str, obj);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public View createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3790d263369096072a0ce372acedb0fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3790d263369096072a0ce372acedb0fb");
        }
        View inflate = LayoutInflater.from(this.mMachContext.getContext()).inflate(R.layout.wm_machpro_poi_coupon_expand_layout, (ViewGroup) null);
        this.b = new h(this.mMachContext.getContext(), inflate);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9585ce6886882361c2be84646cbfd0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9585ce6886882361c2be84646cbfd0a");
        } else if (this.mMachContext.getContext() instanceof WMRestaurantActivity) {
            final com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar = ((WMRestaurantActivity) this.mMachContext.getContext()).e;
            bVar.u.a();
            this.b.a(new h.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.WMRestaurantExpandCouponComponent.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.a
                public final com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "df7487af3628732b25d400d016ba622c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "df7487af3628732b25d400d016ba622c") : new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a((Activity) WMRestaurantExpandCouponComponent.this.mMachContext.getContext(), b(), bVar.w.a().b);
                }

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.a
                public final g b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "805f2f48d759d0f6865fbb61a3e59b63", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "805f2f48d759d0f6865fbb61a3e59b63") : bVar.u.a().b;
                }

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.a
                public final void a(View view, Poi.PoiCouponItem poiCouponItem) {
                    g b;
                    com.sankuai.waimai.business.restaurant.base.shopcart.b n;
                    boolean z = false;
                    Object[] objArr3 = {view, poiCouponItem};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eece7e0e43321450a51bb3eb5355dc89", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eece7e0e43321450a51bb3eb5355dc89");
                    } else if (poiCouponItem == null) {
                    } else {
                        int i = poiCouponItem.mCouponType;
                        Object[] objArr4 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "167bf71bff2e8fe21338100d3b7981a0", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "167bf71bff2e8fe21338100d3b7981a0")).booleanValue();
                        } else if (i == 2 && (b = b()) != null && !(true ^ k.a().g(b.f())) && (n = k.a().n(b.f())) != null) {
                            z = n.k();
                        }
                        if (!z) {
                            if (WMRestaurantExpandCouponComponent.this.c != null && WMRestaurantExpandCouponComponent.this.c.isFloatCoupon()) {
                                bVar.M.a.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(poiCouponItem.mCouponType));
                                return;
                            } else {
                                bVar.H.c.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                                return;
                            }
                        }
                        bVar.F.j.a((com.meituan.android.cube.pga.common.b<Object>) null);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.a
                public final View.OnClickListener c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f12fb0d021cc4afe509d7fb7746da7f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f12fb0d021cc4afe509d7fb7746da7f") : new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.WMRestaurantExpandCouponComponent.1.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "55a4a67a20874d6f44359b708ba99765", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "55a4a67a20874d6f44359b708ba99765");
                            } else {
                                bVar.A.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(view.getId()));
                            }
                        }
                    };
                }
            });
            bVar.x.a(new com.meituan.android.cube.pga.action.b<Pair<Integer, Boolean>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.WMRestaurantExpandCouponComponent.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Pair<Integer, Boolean> pair) {
                    Pair<Integer, Boolean> pair2 = pair;
                    Object[] objArr3 = {pair2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a71a000f8943b8bb20501703c73de19", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a71a000f8943b8bb20501703c73de19");
                    } else {
                        WMRestaurantExpandCouponComponent.this.b.a(((Integer) pair2.first).intValue(), ((Boolean) pair2.second).booleanValue());
                    }
                }
            }).a(a());
            bVar.C.b = new d<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.WMRestaurantExpandCouponComponent.3
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cube.pga.action.d
                /* renamed from: b */
                public Boolean a() {
                    boolean z = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d36920d5c2ad180206631aacb81068d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d36920d5c2ad180206631aacb81068d");
                    }
                    Poi poi = bVar.v.a().b;
                    if (poi == null) {
                        try {
                            i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("waimai_rest_ShopHeaderPoi").b("PoiShopCouponBlockGetPoiNull").b());
                        } catch (Exception unused) {
                        }
                        return Boolean.FALSE;
                    }
                    Poi.PoiCouponEntity poiCoupon = poi.getPoiCoupon();
                    if (poiCoupon != null && (com.sankuai.waimai.foundation.utils.b.a(poiCoupon.getPoiCouponItems()) || com.sankuai.waimai.foundation.utils.b.a(poiCoupon.getFoldPoiCouponItems()))) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
            bVar.z.a(new com.meituan.android.cube.pga.action.b<Poi>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.WMRestaurantExpandCouponComponent.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Poi poi) {
                    Poi poi2 = poi;
                    Object[] objArr3 = {poi2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5fce24d40d38e4bee5b7ee8a7a7b673a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5fce24d40d38e4bee5b7ee8a7a7b673a");
                        return;
                    }
                    WMRestaurantExpandCouponComponent.this.b.a(poi2);
                    h unused = WMRestaurantExpandCouponComponent.this.b;
                    h.f();
                }
            }).a(a());
            bVar.y.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.WMRestaurantExpandCouponComponent.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Integer num) {
                    Object[] objArr3 = {num};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33ed9ba748e6d089eaa76e4bf44ca0e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33ed9ba748e6d089eaa76e4bf44ca0e4");
                        return;
                    }
                    h unused = WMRestaurantExpandCouponComponent.this.b;
                    h.f();
                }
            }).a(a());
            bVar.m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.WMRestaurantExpandCouponComponent.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0aa09daeb6b4d7a28d91209292efa31c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0aa09daeb6b4d7a28d91209292efa31c");
                    } else {
                        WMRestaurantExpandCouponComponent.this.b.e();
                    }
                }
            }).a(a());
        }
        return inflate;
    }
}
