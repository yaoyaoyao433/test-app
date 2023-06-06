package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.event.handler;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.drug.coupon.MemberCouponEntry;
import com.sankuai.waimai.store.drug.coupon.a;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.h;
import com.sankuai.waimai.store.mach.event.b;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.d;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    Context b;
    com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    c d;
    private a.b e;

    public static /* synthetic */ void a(a aVar, Context context, com.sankuai.waimai.store.repository.net.b bVar, Dialog dialog) {
        Object[] objArr = {context, bVar, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5e5707fd006e5b316049b46b84e18524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5e5707fd006e5b316049b46b84e18524");
            return;
        }
        d.a(dialog);
        if (bVar == null) {
            am.a(aVar.b, aVar.b.getString(R.string.wm_sc_common_net_error_info));
            return;
        }
        String message = bVar.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = aVar.b.getString(R.string.wm_sc_common_net_error_info);
        }
        am.a(aVar.b, message);
    }

    public a(Context context, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, c cVar) {
        Object[] objArr = {context, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bdaefd887e40902f9ac335cecfbaf9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bdaefd887e40902f9ac335cecfbaf9f");
            return;
        }
        this.b = context;
        this.c = aVar;
        this.d = cVar;
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, final Map<String, Object> map) {
        Map<String, Object> a2;
        Poi.PoiCouponItem poiCouponItem;
        Boolean bool;
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb672ce4949bc944ae9fcaa1d89f56a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb672ce4949bc944ae9fcaa1d89f56a2");
        } else if ("supermarket_poi_coupon_button_click".equals(str)) {
            com.sankuai.waimai.store.drug.coupons.b.a(this.b, this.c);
        } else if ("shop_header_logo_clicked".equals(str)) {
            if (this.c.c()) {
                com.sankuai.waimai.store.drug.util.d.a(this.b, this.c.g(), this.c.h(), 101, this.c.b, 1, this.d.n());
            }
        } else if ("shop_header_score_clicked".equals(str)) {
            if (this.c.c()) {
                com.sankuai.waimai.store.drug.util.d.a(this.b, this.c.g(), this.c.h(), 101, this.c.b, 0, this.d.n());
            }
        } else if ("shop_header_rootview_clicked".equals(str)) {
            if (this.c == null || this.c.b == null || this.c.b.getNewPoiLabels() == null) {
                return;
            }
            if (map != null && map.size() > 0 && (bool = (Boolean) p.a(map.get("isFusionSuperMarket"), Boolean.class)) != null) {
                bool.booleanValue();
            }
            if (this.b == null || !(this.b instanceof SCBaseActivity)) {
                return;
            }
            com.sankuai.waimai.store.drug.util.d.a((SCBaseActivity) this.b, this.c.b.getNewPoiLabels(), this.c.b.getRestBulletin());
        } else if ("poi_header_coupon_receive_click".equals(str)) {
            b(map);
        } else if ("drug_poi_header_coupon_receive_click".equals(str)) {
            b(map);
        } else if ("poi_header_coupon_tab_dialog_click".equals(str)) {
            a(map);
        } else if ("drug_poi_header_coupon_tab_dialog_click".equals(str)) {
            a(map);
        } else if (!"poi_header_newuser_coupon_receive".equals(str)) {
            if ("poi_load_shopcart_account".equals(str)) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d7542c9a1b6ae0b7b19b5a940a0bb85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d7542c9a1b6ae0b7b19b5a940a0bb85");
                } else if (aVar == null || (a2 = h.a(this.c)) == null) {
                } else {
                    aVar.b("poi_update_shopcart_account", a2);
                }
            } else if ("poi_click_foods_item".equals(str)) {
                Object[] objArr3 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb98bb43c1a605d23cc92ffda38ebeb4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb98bb43c1a605d23cc92ffda38ebeb4");
                } else if (map == null || map.get("good_spu") == null) {
                } else {
                    al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.event.handler.a.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.util.al.b
                        public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                            GoodsSpu goodsSpu2 = goodsSpu;
                            Object[] objArr4 = {goodsSpu2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7e5642fca201df0a07161873e72dde3b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7e5642fca201df0a07161873e72dde3b");
                            } else if (goodsSpu2 == null || a.this.c == null || a.this.d == null || a.this.b == null) {
                            } else {
                                com.sankuai.waimai.store.drug.util.d.a(a.this.b, goodsSpu2, a.this.c.b);
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.sankuai.waimai.store.util.al.b
                        /* renamed from: b */
                        public GoodsSpu a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d75261e9a6a9fbf94ef5b7e098c68526", RobustBitConfig.DEFAULT_VALUE)) {
                                return (GoodsSpu) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d75261e9a6a9fbf94ef5b7e098c68526");
                            }
                            String a3 = i.a(map.get("good_spu"));
                            GoodsSpu goodsSpu = new GoodsSpu();
                            try {
                                goodsSpu.parseJson((!i.a(a3) || TextUtils.isEmpty(a3)) ? new JSONObject() : new JSONObject(a3));
                            } catch (JSONException e) {
                                com.sankuai.shangou.stone.util.log.a.a(e);
                            }
                            return goodsSpu;
                        }
                    }, this.d.l());
                }
            }
        } else {
            Object[] objArr4 = {map};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2bbfbaf3e49965ea636c14289ddedd0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2bbfbaf3e49965ea636c14289ddedd0a");
            } else if (this.b == null || this.c == null || map == null) {
            } else {
                try {
                    Poi.PoiCouponItem poiCouponItem2 = (Poi.PoiCouponItem) i.a(new JSONObject(map).getJSONObject("couponItem").toString(), Poi.PoiCouponItem.class);
                    if (poiCouponItem2 == null || this.c.b == null || this.c.b.getNewUserRegion() == null || (poiCouponItem = this.c.b.getNewUserRegion().newUserCoupon) == null) {
                        return;
                    }
                    poiCouponItem.mCouponStatus = poiCouponItem2.mCouponStatus;
                    poiCouponItem.mCouponValue = poiCouponItem2.mCouponValue;
                    poiCouponItem.exchangeCouponPrefix = poiCouponItem2.exchangeCouponPrefix;
                    poiCouponItem.mCouponButtonText = poiCouponItem2.mCouponButtonText;
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poilist.event.b(String.valueOf(poiCouponItem.mCouponId), String.valueOf(poiCouponItem.mCouponStatus)));
                    if (TextUtils.isEmpty(poiCouponItem.mSchemeUrl)) {
                        return;
                    }
                    com.sankuai.waimai.store.router.d.a(this.b, poiCouponItem.mSchemeUrl + "&poi_id=" + this.c.g() + "&poi_id_str=" + this.c.h() + "&coupon_value=" + poiCouponItem.mCouponValue + "&condition_text=" + poiCouponItem.mCouponConditionText);
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10f61f2fd422334541ac2b5eabb52ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10f61f2fd422334541ac2b5eabb52ad");
        } else if (map == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(map);
                int i = jSONObject.getInt("selectedIndex");
                i.a(jSONObject.optString("couponItem"), Poi.PoiCouponItem.class);
                if (i == 0) {
                    i = 1;
                } else if (i == 1) {
                    i = 0;
                }
                com.sankuai.waimai.store.drug.coupons.b.a(this.b, this.c, i);
            } catch (JSONException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaeddb2854009c515cf3add0938c54db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaeddb2854009c515cf3add0938c54db");
        } else if (this.b == null || this.c == null || map == null) {
        } else {
            try {
                Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) i.a(new JSONObject(map).getJSONObject("couponItem").toString(), Poi.PoiCouponItem.class);
                if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
                    com.sankuai.waimai.store.manager.user.a.a(this.b, new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.event.handler.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afbdaf8735d9bdb72414fbff1339193a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afbdaf8735d9bdb72414fbff1339193a");
                            } else {
                                com.sankuai.waimai.store.manager.poi.a.a().a(a.this.c.d());
                            }
                        }
                    });
                } else if (poiCouponItem != null) {
                    a(poiCouponItem);
                }
            } catch (JSONException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private void a(@NonNull final Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9cc42295fa691daca0935efd1d90c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9cc42295fa691daca0935efd1d90c8");
        } else if (poiCouponItem.isCouponHasGone()) {
        } else {
            long g = this.c.g();
            String h = this.c.h();
            if (poiCouponItem.couponShowType == 4) {
                com.sankuai.waimai.store.drug.coupons.b.a(this.b, this.c, 0);
            } else if (poiCouponItem.mCouponStatus == 0) {
                if (this.e == null) {
                    this.e = new com.sankuai.waimai.store.drug.coupon.d(new MemberCouponEntry(this.b));
                }
                if (poiCouponItem.mCouponType == 20016 || (this.c.b.getPoiCoupon() != null && this.c.b.getPoiCoupon().poiMemberGrade == 1 && poiCouponItem.mCouponType == 20054)) {
                    if (this.d != null) {
                        this.e.a(g, this.c.d(), this.d.l(), (Dialog) null, 1, poiCouponItem);
                    }
                } else if (poiCouponItem.couponShowType == 9 || poiCouponItem.couponShowType == 12) {
                    a(d.a(this.b), poiCouponItem);
                } else if (this.d == null) {
                } else {
                    final Dialog a2 = d.a(this.b);
                    com.sankuai.waimai.store.drug.goods.list.utils.b.a(this.d.l(), g, h, poiCouponItem, new k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.event.handler.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(Object obj) {
                            Poi.PoiCouponItem poiCouponItem2 = (Poi.PoiCouponItem) obj;
                            Object[] objArr2 = {poiCouponItem2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c843aa78fc54dc0de0d778c6279b49a0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c843aa78fc54dc0de0d778c6279b49a0");
                                return;
                            }
                            super.a((AnonymousClass2) poiCouponItem2);
                            d.a(a2);
                            poiCouponItem.copyValueFrom(poiCouponItem2);
                            com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem);
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                            Object[] objArr2 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "582c80fd997e4cf53e8d4020c1a3016d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "582c80fd997e4cf53e8d4020c1a3016d");
                                return;
                            }
                            super.a(bVar);
                            d.a(a2);
                            String message = bVar.getMessage();
                            if (TextUtils.isEmpty(message)) {
                                message = a.this.b.getString(R.string.wm_sc_common_net_error_info);
                            }
                            am.a(a.this.b, message);
                        }
                    });
                }
            } else if (poiCouponItem.mCouponStatus == 1) {
                String str = poiCouponItem.mSchemeUrl;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.sankuai.waimai.store.router.d.a(this.b, str);
            }
        }
    }

    private void a(@NonNull final Dialog dialog, @NonNull final Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {dialog, poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4778465a3369cbf33e2f43f420c1316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4778465a3369cbf33e2f43f420c1316");
        } else {
            com.sankuai.waimai.store.drug.goods.list.utils.b.a(this.d.l(), new k<Poi.MemberToken>() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.event.handler.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    Poi.MemberToken memberToken = (Poi.MemberToken) obj;
                    Object[] objArr2 = {memberToken};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98d49f40933e1d57908cf3bfe1857713", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98d49f40933e1d57908cf3bfe1857713");
                        return;
                    }
                    super.a((AnonymousClass4) memberToken);
                    if (memberToken == null || TextUtils.isEmpty(memberToken.token)) {
                        a.a(a.this, a.this.b, null, dialog);
                        return;
                    }
                    final a aVar = a.this;
                    final Dialog dialog2 = dialog;
                    final Poi.PoiCouponItem poiCouponItem2 = poiCouponItem;
                    String str = memberToken.token;
                    Object[] objArr3 = {dialog2, poiCouponItem2, str};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "6ade437828c53ae01b255beb2348670e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "6ade437828c53ae01b255beb2348670e");
                        return;
                    }
                    String l = aVar.d.l();
                    String valueOf = String.valueOf(poiCouponItem2.mActivityId);
                    long g = aVar.c.g();
                    String h = aVar.c.h();
                    int i = poiCouponItem2.mCouponScore;
                    k<Poi.PoiCouponItem> kVar = new k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.event.handler.a.5
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(Object obj2) {
                            Poi.PoiCouponItem poiCouponItem3 = (Poi.PoiCouponItem) obj2;
                            Object[] objArr4 = {poiCouponItem3};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ccea22053fb69b2f32c147c6ce66864b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ccea22053fb69b2f32c147c6ce66864b");
                                return;
                            }
                            super.a((AnonymousClass5) poiCouponItem3);
                            d.a(dialog2);
                            poiCouponItem2.copyMainValueFrom(poiCouponItem3);
                            com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem2);
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                            Object[] objArr4 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "602de52f8a65f8c3aa649eaec5e8dff1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "602de52f8a65f8c3aa649eaec5e8dff1");
                                return;
                            }
                            super.a(bVar);
                            d.a(dialog2);
                            a.a(a.this, a.this.b, bVar, dialog2);
                        }
                    };
                    Object[] objArr4 = {l, str, valueOf, new Long(g), h, Integer.valueOf(i), kVar};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.goods.list.utils.b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "989ccd7a478604b8fde96e6412d8f244", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "989ccd7a478604b8fde96e6412d8f244");
                        return;
                    }
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.drug.goods.list.utils.b.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "50609a72090ac9133a7c8fa9b3b9477a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "50609a72090ac9133a7c8fa9b3b9477a")).booleanValue() : com.sankuai.waimai.store.config.d.h().a("marketingc/exchangeCoupon", true)) {
                        com.sankuai.waimai.store.drug.base.net.b.a(l).a(str, valueOf, i, g, h, kVar);
                    } else {
                        com.sankuai.waimai.store.drug.base.net.c.a(l).a(str, valueOf, i, g, h, kVar);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "991b22b898a952ca01a450162d21d28a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "991b22b898a952ca01a450162d21d28a");
                        return;
                    }
                    super.a(bVar);
                    d.a(dialog);
                    a.a(a.this, a.this.b, bVar, dialog);
                }
            });
        }
    }
}
