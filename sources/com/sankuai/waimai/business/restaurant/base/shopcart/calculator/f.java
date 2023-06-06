package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.dianping.titans.utils.LocalIdUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.restaurant.base.RestaurantSP;
import com.sankuai.waimai.business.restaurant.base.manager.order.c;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.RequiredTagInfo;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartPrice;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.e;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.l;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends g {
    public static ChangeQuickRedirect a;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a extends Serializable {
        void a(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, List<c.a> list, com.sankuai.waimai.business.restaurant.base.shopcart.e eVar);
    }

    public static /* synthetic */ String a(f fVar, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, boolean z) {
        String str;
        Object[] objArr = {gVar, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "a33554d23d707e22742003a3a4a72005", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "a33554d23d707e22742003a3a4a72005");
        }
        int i = gVar.C;
        String str2 = "";
        if (i != -1) {
            if (i != com.sankuai.waimai.business.restaurant.base.manager.order.g.G) {
                char c = z ? bVar.e() == 0 ? (char) 2 : (char) 1 : (char) 65535;
                if (i == com.sankuai.waimai.business.restaurant.base.manager.order.g.D && c == 65535) {
                    str = "已将购物车的全部商品同步至当前门店";
                } else if (i == com.sankuai.waimai.business.restaurant.base.manager.order.g.D && c == 1) {
                    str = "部分商品已同步加入该门店购物车";
                } else if ((i != com.sankuai.waimai.business.restaurant.base.manager.order.g.D || c != 2) && (i != com.sankuai.waimai.business.restaurant.base.manager.order.g.E || c != 65535)) {
                    if (i == com.sankuai.waimai.business.restaurant.base.manager.order.g.F && c == 65535) {
                        str = "部分商品已同步加入该门店购物车";
                    } else if (i == com.sankuai.waimai.business.restaurant.base.manager.order.g.F && c == 1) {
                        str = "部分商品已同步加入该门店购物车";
                    } else {
                        int i2 = com.sankuai.waimai.business.restaurant.base.manager.order.g.F;
                    }
                }
                str2 = str;
            }
            gVar.C = -1;
        }
        return str2;
    }

    public static /* synthetic */ boolean a(f fVar, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.g gVar2, String str) {
        Object[] objArr = {gVar, bVar, gVar2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "53f182382abb7e43fd27523e8ce7310b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "53f182382abb7e43fd27523e8ce7310b")).booleanValue();
        }
        Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        int i = gVar2.a;
        if (i == 603) {
            if (TextUtils.isEmpty(str) && b != null) {
                String f = gVar.f();
                String str2 = gVar2.b;
                Object[] objArr2 = {b, f, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "f57242100db346438364468bfcf3f911", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "f57242100db346438364468bfcf3f911");
                } else {
                    new RooAlertDialog.a(new ContextThemeWrapper(b, 2131558962)).a(com.meituan.android.singleton.b.a.getString(R.string.takeout_dialog_title_tips)).b(str2).a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_i_know), (DialogInterface.OnClickListener) null).b();
                    l.a(AppUtil.generatePageInfoKey(b), f);
                }
            }
            return false;
        } else if (i != 605) {
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(gVar2.b) && b != null) {
                ae.b(b, gVar2.b);
            }
            if (!TextUtils.isEmpty(str) && b != null) {
                ae.b(b, str);
            }
            return false;
        } else if (bVar.B == 1) {
            if (bVar.A == 0) {
                if (b != null && gVar2.d != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(gVar2.d.a);
                    ae.b(b, b.getString(R.string.wm_shopcart_sku_Count_Threshold, new Object[]{gVar.h(), sb.toString()}));
                }
                return true;
            }
            return false;
        } else if (bVar.A != 0 || gVar2.d == null) {
            return false;
        } else {
            com.sankuai.waimai.business.restaurant.base.shopcart.c cVar = new com.sankuai.waimai.business.restaurant.base.shopcart.c();
            cVar.a = gVar.f();
            cVar.b = gVar2.d.a;
            com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(cVar);
            return false;
        }
    }

    public f(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "294ccc1dd0580c57feb8aae4a80807d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "294ccc1dd0580c57feb8aae4a80807d7");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.calculator.g
    public final void a(final com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, final com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, final List<c.a> list, final com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.e eVar2;
        RequiredTagInfo requiredTagInfo;
        boolean z = false;
        Object[] objArr = {gVar, bVar, list, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5472d8224307594f55c7451fb9bee536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5472d8224307594f55c7451fb9bee536");
        } else if (h.a().e) {
        } else {
            com.sankuai.waimai.business.restaurant.base.log.c.b(LocalIdUtils.FROM_SERVER);
            com.sankuai.waimai.business.restaurant.base.log.a d = com.sankuai.waimai.business.restaurant.base.log.a.d();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.log.a.a;
            if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "744bb9db52237377db96cdcb8a25d4e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "744bb9db52237377db96cdcb8a25d4e8");
            } else {
                d.b++;
            }
            if (eVar != null) {
                eVar.a();
            }
            if (gVar == null) {
                if (eVar != null) {
                    eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a("poiHelper is null"));
                }
                com.sankuai.waimai.business.restaurant.base.log.c.c("poiHelper is null");
            } else if (gVar.g == null) {
                if (eVar != null) {
                    eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a("poi is null"));
                }
                com.sankuai.waimai.business.restaurant.base.log.c.c("poi is null");
            } else {
                final boolean z2 = gVar.J;
                gVar.a(false);
                if (bVar == null) {
                    if (eVar != null) {
                        eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a("CartData is null"));
                    }
                    com.sankuai.waimai.business.restaurant.base.log.c.c("CartData is null");
                } else if (bVar.j()) {
                    com.sankuai.waimai.business.restaurant.base.log.c.a(0L);
                    Object[] objArr3 = {bVar, gVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b206f89cd7a70b57b0e7483ed4fec91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b206f89cd7a70b57b0e7483ed4fec91");
                    } else {
                        ShopCartPrice shopCartPrice = bVar.e;
                        if (shopCartPrice == null) {
                            shopCartPrice = new ShopCartPrice();
                            bVar.e = shopCartPrice;
                        }
                        com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(shopCartPrice);
                        bVar.f = new com.sankuai.waimai.business.restaurant.base.shopcart.tip.c();
                    }
                    if (bVar.v != null) {
                        bVar.v = null;
                        bVar.a(0.0d);
                    }
                    if (eVar != null) {
                        eVar.a(bVar);
                    }
                } else if (!p.a(com.meituan.android.singleton.b.a)) {
                    if (eVar != null) {
                        eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_bad_net_retry_later_1)));
                    }
                    com.sankuai.waimai.business.restaurant.base.log.c.b();
                } else if (com.sankuai.waimai.platform.model.c.a().b() == 3) {
                    eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(""));
                    com.sankuai.waimai.business.restaurant.base.util.b.a();
                } else {
                    h.a().e = true;
                    Object[] objArr4 = {gVar, bVar, list};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "59d9aaf7183c4edbc76a2ba5a688c451", RobustBitConfig.DEFAULT_VALUE)) {
                        eVar2 = (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.e) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "59d9aaf7183c4edbc76a2ba5a688c451");
                    } else {
                        eVar2 = new com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.e();
                        String f = gVar.f();
                        long a2 = com.sankuai.waimai.platform.domain.core.poi.b.a(f);
                        Object[] objArr5 = {new Long(a2)};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.e.a;
                        if (PatchProxy.isSupport(objArr5, eVar2, changeQuickRedirect5, false, "abadca6fcafd04368d0da1eba72e49c5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, eVar2, changeQuickRedirect5, false, "abadca6fcafd04368d0da1eba72e49c5");
                        } else {
                            eVar2.b = a2;
                        }
                        eVar2.c = f;
                        eVar2.j = gVar.b();
                        eVar2.k = gVar.c();
                        double q = gVar.q();
                        Object[] objArr6 = {Double.valueOf(q)};
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.e.a;
                        if (PatchProxy.isSupport(objArr6, eVar2, changeQuickRedirect6, false, "fa9a68c294237ab38092510b223fe777", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, eVar2, changeQuickRedirect6, false, "fa9a68c294237ab38092510b223fe777");
                        } else {
                            eVar2.e = q;
                        }
                        double d2 = gVar.g.shippingFee;
                        Object[] objArr7 = {Double.valueOf(d2)};
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.e.a;
                        if (PatchProxy.isSupport(objArr7, eVar2, changeQuickRedirect7, false, "f2a435bdf23ef9746453bb675138cd1d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, eVar2, changeQuickRedirect7, false, "f2a435bdf23ef9746453bb675138cd1d");
                        } else {
                            eVar2.d = d2;
                        }
                        eVar2.g = bVar.g;
                        JsonObject jsonObject = new JsonObject();
                        StringBuilder sb = new StringBuilder();
                        sb.append(gVar.A());
                        jsonObject.addProperty("merchantbrandId", sb.toString());
                        e.a aVar = new e.a();
                        aVar.a = jsonObject.toString();
                        eVar2.n = aVar;
                        eVar2.m = new ShopCartMemberInfo.MemberVpParam();
                        ArrayList arrayList = new ArrayList();
                        com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(arrayList, bVar.b, 0, list);
                        eVar2.f = arrayList;
                        if (k.a().h(f) != null && (requiredTagInfo = k.a().n(f).n) != null) {
                            eVar2.h = requiredTagInfo.hasRequiredTag;
                        }
                        if (com.sankuai.waimai.business.restaurant.base.abtest.a.b() && bVar.t != null) {
                            com.sankuai.waimai.business.restaurant.base.shopcart.f fVar = bVar.t;
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.restaurant.base.shopcart.f.a;
                            if (PatchProxy.isSupport(objArr8, fVar, changeQuickRedirect8, false, "af9b4becc214c74be8e8b7165032b920", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr8, fVar, changeQuickRedirect8, false, "af9b4becc214c74be8e8b7165032b920")).booleanValue();
                            } else {
                                long elapsedRealtime = SystemClock.elapsedRealtime() - fVar.c;
                                long a3 = RestaurantSP.a() * 1000;
                                if (!TextUtils.isEmpty(fVar.b) && a3 > 0 && elapsedRealtime < a3) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                bVar.b();
                            } else {
                                eVar2.i = bVar.t.b;
                            }
                        }
                    }
                    if (bVar.v != null) {
                        eVar2.m = bVar.v.getMemberVpParam();
                        bVar.v.setMemberVpParam(null);
                    }
                    eVar2.l = gVar.k ? 1 : 0;
                    rx.d<BaseResponse<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.f>> netPriceCalculatorResult = ((ShopCartApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) ShopCartApiService.class)).getNetPriceCalculatorResult(com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJson(eVar2), gVar.m ? "1" : "0", gVar.y);
                    final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("food_calculate_time");
                    createCustomSpeedMeterTask.recordStep("food_calculate_time_start");
                    final long currentTimeMillis = System.currentTimeMillis();
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(netPriceCalculatorResult, new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.f>>() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.calculator.f.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            BaseResponse baseResponse = (BaseResponse) obj;
                            Object[] objArr9 = {baseResponse};
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "0d9c19a3dd419435a134c28c880d01c7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "0d9c19a3dd419435a134c28c880d01c7");
                                return;
                            }
                            if (baseResponse != null) {
                                if (baseResponse.code == 0 && baseResponse.data != 0) {
                                    com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.f fVar2 = (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.f) baseResponse.data;
                                    try {
                                        String f2 = gVar.f();
                                        String str = fVar2.b;
                                        if (!f2.equals(str)) {
                                            GlobalCartManager.getInstance().addNewPoiId(f2, str);
                                            a.C1052a.a("shoppingcart_calculateprice", f2, str);
                                            com.sankuai.waimai.platform.domain.core.poi.b.a(fVar2.a, str);
                                        }
                                        RequiredTagInfo updateRequiredTagInfo = RequiredTagInfo.updateRequiredTagInfo(k.a().n(f2).n, fVar2.q);
                                        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(f2);
                                        if (bVar != n && n != null) {
                                            n.n = updateRequiredTagInfo;
                                        }
                                        bVar.n = updateRequiredTagInfo;
                                        com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(bVar, fVar2);
                                        bVar.x = 1;
                                        com.sankuai.waimai.business.restaurant.base.log.c.a(System.currentTimeMillis() - currentTimeMillis);
                                        createCustomSpeedMeterTask.recordStep("food_calculate_time_end");
                                        com.sankuai.meituan.takeoutnew.util.aop.h.a(createCustomSpeedMeterTask);
                                        com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.g gVar2 = fVar2.z;
                                        String a4 = f.a(f.this, gVar, bVar, gVar2 != null);
                                        if (gVar2 == null) {
                                            if (!TextUtils.isEmpty(a4)) {
                                                ae.a(com.sankuai.waimai.foundation.utils.activity.a.a().b(), a4);
                                            }
                                            if (eVar != null) {
                                                h.a().a(com.sankuai.waimai.foundation.utils.activity.a.a().c(), gVar.f(), gVar.A(), gVar.q(), bVar, z2);
                                                eVar.a(bVar);
                                            }
                                        } else if (f.a(f.this, gVar, bVar, gVar2, a4)) {
                                            if (eVar != null) {
                                                eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(""));
                                            }
                                        } else if (eVar != null) {
                                            h.a().a(com.sankuai.waimai.foundation.utils.activity.a.a().c(), gVar.f(), gVar.A(), gVar.q(), bVar, z2);
                                            eVar.a(bVar);
                                        }
                                        bVar.n();
                                    } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
                                        if (eVar != null) {
                                            eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(""));
                                        }
                                        com.sankuai.waimai.business.restaurant.base.log.c.a(System.currentTimeMillis() - currentTimeMillis, -9998, com.sankuai.waimai.business.restaurant.base.log.b.a(e));
                                        return;
                                    }
                                } else if (baseResponse.code == 4 && f.this.b != null) {
                                    if (eVar != null) {
                                        eVar.b();
                                    }
                                    com.sankuai.waimai.business.restaurant.base.log.c.a(System.currentTimeMillis() - currentTimeMillis, baseResponse.code, "LocalBackupActive");
                                    f.this.b.a(gVar, bVar, list, eVar);
                                } else {
                                    com.sankuai.waimai.business.restaurant.base.log.c.a(System.currentTimeMillis() - currentTimeMillis, baseResponse.code, "unknow");
                                    if (eVar != null) {
                                        eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(""));
                                    }
                                }
                            } else if (eVar != null) {
                                com.sankuai.waimai.business.restaurant.base.log.c.a(System.currentTimeMillis() - currentTimeMillis, -9997, "response is null");
                                eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(""));
                            } else {
                                com.sankuai.waimai.business.restaurant.base.log.c.a(System.currentTimeMillis() - currentTimeMillis, -9996, "response is null");
                            }
                            h.a().e = false;
                        }

                        @Override // rx.j
                        public final void onStart() {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "18b6061e9ded4ef653e5c1a044821f8c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "18b6061e9ded4ef653e5c1a044821f8c");
                                return;
                            }
                            super.onStart();
                            if (eVar != null) {
                                eVar.a();
                            }
                        }

                        @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
                        public final void onCompleted() {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "184581270e62362fe0ecc4adc229b7d4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "184581270e62362fe0ecc4adc229b7d4");
                                return;
                            }
                            super.onCompleted();
                            bVar.n();
                            h.a().e = false;
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr9 = {th};
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "f6e058d9363f4384e9408c6ccf38e0d5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "f6e058d9363f4384e9408c6ccf38e0d5");
                                return;
                            }
                            if (eVar != null) {
                                eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(""));
                            }
                            com.sankuai.waimai.business.restaurant.base.log.c.a(System.currentTimeMillis() - currentTimeMillis, -9999, com.sankuai.waimai.business.restaurant.base.log.b.a(th));
                            h.a().e = false;
                        }
                    }, "NetPriceCalculator");
                }
            }
        }
    }
}
