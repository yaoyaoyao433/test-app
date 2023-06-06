package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro;

import android.app.Activity;
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
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.i;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends a<View> {
    public static ChangeQuickRedirect a;
    private i b;
    private h c;

    public b(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56fb7ccc905f5790ca9c1c8153a22da0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56fb7ccc905f5790ca9c1c8153a22da0");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Poi.PoiCouponEntity poiCouponEntity;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d5ed257da271813ab494a1d9cd9302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d5ed257da271813ab494a1d9cd9302");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if ("poiInfo".equals(str)) {
                if (obj instanceof MachMap) {
                    MachMap machMap = (MachMap) obj;
                    if (machMap.containsKey("poi_coupon")) {
                        try {
                            poiCouponEntity = (Poi.PoiCouponEntity) new Gson().fromJson(com.sankuai.waimai.machpro.util.b.c((MachMap) machMap.get("poi_coupon")).toString(), (Class<Object>) Poi.PoiCouponEntity.class);
                        } catch (Exception e) {
                            e.printStackTrace();
                            poiCouponEntity = null;
                        }
                        if (poiCouponEntity != null) {
                            this.b = new i();
                            this.b.a = poiCouponEntity;
                            this.b.b = poiCouponEntity.getFoldPoiCouponItems();
                            this.c.a(this.b);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904b7f7c0e2e5f787cd2542475cc47fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904b7f7c0e2e5f787cd2542475cc47fd");
        }
        View inflate = LayoutInflater.from(this.mMachContext.getContext()).inflate(R.layout.wm_machpro_poi_coupon_fold_layout, (ViewGroup) null);
        this.c = new h(this.mMachContext.getContext(), inflate);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f41662e71d11ab049089998d024f7f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f41662e71d11ab049089998d024f7f4");
        } else if (this.mMachContext.getContext() instanceof WMRestaurantActivity) {
            final com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar = ((WMRestaurantActivity) this.mMachContext.getContext()).e;
            this.c.a(new h.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.a
                public final com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0210468054578a1fcb519c003266995f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0210468054578a1fcb519c003266995f") : new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a((Activity) b.this.mMachContext.getContext(), b(), bVar.w.a().b);
                }

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.a
                public final g b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dfd8b8fd26df59050e1ca34af0d4f347", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dfd8b8fd26df59050e1ca34af0d4f347") : bVar.u.a().b;
                }

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.h.a
                public final void a(View view, Poi.PoiCouponItem poiCouponItem) {
                    g b;
                    com.sankuai.waimai.business.restaurant.base.shopcart.b n;
                    boolean z = false;
                    Object[] objArr3 = {view, poiCouponItem};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6c5bd52fef0ade261d7cd91ba9ad6ec8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6c5bd52fef0ade261d7cd91ba9ad6ec8");
                    } else if (poiCouponItem == null) {
                    } else {
                        int i = poiCouponItem.mCouponType;
                        Object[] objArr4 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "37460c3363a3c18fada93699ba74de26", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "37460c3363a3c18fada93699ba74de26")).booleanValue();
                        } else if (i == 2 && (b = b()) != null && !(true ^ k.a().g(b.f())) && (n = k.a().n(b.f())) != null) {
                            z = n.k();
                        }
                        if (!z) {
                            if (b.this.b != null && b.this.b.a != null && b.this.b.a.isFloatCoupon()) {
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
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "134ef20c6136678af8db28af7b4a3848", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "134ef20c6136678af8db28af7b4a3848") : new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.b.1.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d2acfe84cd8cccab3e48ce66132062b0", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d2acfe84cd8cccab3e48ce66132062b0");
                            } else {
                                bVar.A.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(view.getId()));
                            }
                        }
                    };
                }
            });
            bVar.x.a(new com.meituan.android.cube.pga.action.b<Pair<Integer, Boolean>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.b.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Pair<Integer, Boolean> pair) {
                    Pair<Integer, Boolean> pair2 = pair;
                    Object[] objArr3 = {pair2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c048e2d297880029265caf0a923bba69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c048e2d297880029265caf0a923bba69");
                    } else {
                        b.this.c.a(((Integer) pair2.first).intValue(), ((Boolean) pair2.second).booleanValue());
                    }
                }
            }).a(a());
            bVar.C.b = new d<Boolean>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.b.3
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cube.pga.action.d
                /* renamed from: b */
                public Boolean a() {
                    boolean z = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e268c9d1b244b5b736e49331fe093484", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e268c9d1b244b5b736e49331fe093484");
                    }
                    Poi poi = bVar.v.a().b;
                    if (poi == null) {
                        try {
                            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("waimai_rest_ShopHeaderPoi").b("PoiShopCouponBlockGetPoiNull").b());
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
            bVar.z.a(new com.meituan.android.cube.pga.action.b<Poi>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.b.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Poi poi) {
                    Poi poi2 = poi;
                    Object[] objArr3 = {poi2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "40e96d9597df77933c69299a568022bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "40e96d9597df77933c69299a568022bd");
                        return;
                    }
                    b.this.c.a(poi2);
                    h unused = b.this.c;
                    h.f();
                }
            }).a(a());
            bVar.y.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.b.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Integer num) {
                    Object[] objArr3 = {num};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4290a0e9d66088091d36b01dd0088dda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4290a0e9d66088091d36b01dd0088dda");
                        return;
                    }
                    h unused = b.this.c;
                    h.f();
                }
            }).a(a());
            bVar.m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga.promotion.machpro.b.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7cd28453afb7132d84ff45c4d2d2f2ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7cd28453afb7132d84ff45c4d2d2f2ad");
                    } else {
                        b.this.c.e();
                    }
                }
            }).a(a());
        }
        return inflate;
    }
}
