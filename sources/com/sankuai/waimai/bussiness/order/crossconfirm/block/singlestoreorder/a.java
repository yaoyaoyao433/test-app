package com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder;

import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.Insurance;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
import com.sankuai.waimai.business.order.submit.model.FoodInsurance;
import com.sankuai.waimai.business.order.submit.model.PrivacyService;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.OrderCouponRequestParams;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.AdditionalBargainInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiAddressParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderCouponParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderInvoiceParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CodeDesc;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewInvoiceResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPoiResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.poi.Remind;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<c, e, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.a A;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.timeinsurance.a B;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.a C;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.additionalbargain.a D;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.discountpromotion.a E;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.a s;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.supplyinfo.a t;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.a u;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.a v;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.a w;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.a x;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.a y;
    private com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.b z;

    public static /* synthetic */ void a(a aVar, OrderCouponRequestParams orderCouponRequestParams) {
        String str;
        Object[] objArr = {orderCouponRequestParams};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a708839ee650a2373380b43ae5d45d93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a708839ee650a2373380b43ae5d45d93");
            return;
        }
        AddressItem addressItem = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) aVar.F()).A.a().b;
        if (aVar.n != 0) {
            d dVar = ((e) aVar.n).p;
            orderCouponRequestParams.addrLatitude = addressItem.lat;
            orderCouponRequestParams.addrLongitude = addressItem.lng;
            StringBuilder sb = new StringBuilder();
            sb.append(dVar.a);
            orderCouponRequestParams.poiId = sb.toString();
            orderCouponRequestParams.poiIdStr = dVar.b;
            orderCouponRequestParams.phone = addressItem.phone;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((com.sankuai.waimai.bussiness.order.crossconfirm.a) aVar.F()).T.a().c());
            orderCouponRequestParams.payType = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(dVar.h);
            orderCouponRequestParams.total = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(dVar.i);
            orderCouponRequestParams.originalPrice = sb4.toString();
            orderCouponRequestParams.canUseCouponPrice = String.valueOf(dVar.g);
            orderCouponRequestParams.orderToken = dVar.c;
            orderCouponRequestParams.productList = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.e(dVar.j);
            orderCouponRequestParams.skuIdArray = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.d(dVar.j);
            orderCouponRequestParams.businessType = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) aVar.F()).aL_();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "463b6d30dd1d42c065d9fc3c3c10ef36", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "463b6d30dd1d42c065d9fc3c3c10ef36");
            } else {
                str = aVar.n != 0 ? ((e) aVar.n).p.f : "";
            }
            orderCouponRequestParams.activityInfoCoupon = str;
            orderCouponRequestParams.otherPoiSelectedCouponViewIds = aVar.N();
            orderCouponRequestParams.poiAddressParam = new PoiAddressParam(addressItem);
            orderCouponRequestParams.poiOrderParams = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) aVar.F()).t.a().b;
        }
    }

    public static /* synthetic */ void a(a aVar, PoiOrderParam poiOrderParam) {
        String M;
        Object[] objArr = {poiOrderParam};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "7d4ebd3e26338e1eb40b6b0c3a2e46c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "7d4ebd3e26338e1eb40b6b0c3a2e46c7");
            return;
        }
        PoiOrderPreviewResult e = ((e) aVar.n).e();
        if (e != null) {
            int M2 = aVar.s.M();
            if (M2 <= 0) {
                M2 = e.mExpectedArrivalInfo != null ? e.mExpectedArrivalInfo.unixTime : 0;
            }
            int i = M2;
            boolean M3 = aVar.C.M();
            boolean M4 = aVar.B.M();
            int M5 = aVar.t.M();
            PoiOrderCouponParam M6 = aVar.M();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "99dca4756c27b54b21e2d7d459c209d4", RobustBitConfig.DEFAULT_VALUE)) {
                M = (String) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "99dca4756c27b54b21e2d7d459c209d4");
            } else {
                M = aVar.x.M();
                if (((e) aVar.n).p.e == 1 || ((e) aVar.n).p.e == 2) {
                    M = aVar.y.b(M);
                }
            }
            int M7 = aVar.z.M();
            String M8 = aVar.y.M();
            PoiOrderInvoiceParam poiOrderInvoiceParam = new PoiOrderInvoiceParam(e.invoiceInfo);
            poiOrderInvoiceParam.invoiceTitle = aVar.A.M();
            poiOrderInvoiceParam.invoiceType = aVar.A.N();
            poiOrderInvoiceParam.taxpayerIdNumber = aVar.A.O();
            List<AdditionalBargain.AdditionalBargainDetail> M9 = aVar.D.M();
            poiOrderParam.poiId = e.poiInfo.poiId;
            poiOrderParam.poiIdStr = e.poiInfo.poiIdStr;
            poiOrderParam.orderToken = e.orderToken;
            poiOrderParam.confirmSubmit = 0;
            poiOrderParam.expectedArrivalTime = i;
            ArrayList<OrderFoodInput> arrayList = new ArrayList<>();
            for (OrderFoodOutput orderFoodOutput : e.foodList) {
                if (orderFoodOutput != null) {
                    arrayList.add(new OrderFoodInput(orderFoodOutput));
                }
            }
            poiOrderParam.foodList = arrayList;
            poiOrderParam.privacySelected = M3 ? 1 : 0;
            poiOrderParam.insuranceSelected = M4 ? 1 : 0;
            poiOrderParam.giftInsurance = e.insurance != null ? e.insurance.purchaseType : 0;
            poiOrderParam.hasFoodSafetyInsurance = e.foodInsurance != null ? 1 : 0;
            poiOrderParam.noProductRemindsSelected = M5;
            poiOrderParam.stageShippingCallbackInfo = "";
            poiOrderParam.coupon = M6;
            poiOrderParam.callbackInfoReq = aVar.v.Q();
            poiOrderParam.caution = M;
            poiOrderParam.dinersCount = M7;
            poiOrderParam.bookingPhone = M8;
            poiOrderParam.invoice = poiOrderInvoiceParam;
            ArrayList<AdditionalBargainInput> arrayList2 = new ArrayList<>();
            if (M9 != null && M9.size() > 0) {
                for (AdditionalBargain.AdditionalBargainDetail additionalBargainDetail : M9) {
                    if (additionalBargainDetail != null) {
                        arrayList2.add(new AdditionalBargainInput(additionalBargainDetail));
                    }
                }
            }
            poiOrderParam.additionalBargainList = arrayList2;
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208ce9ced71ea748801218b7122ed302", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208ce9ced71ea748801218b7122ed302") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0334bf5197a247fe34d9e2cfca550625", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0334bf5197a247fe34d9e2cfca550625") : new c(m());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f705dd175704a7fd468fb2875f51de2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f705dd175704a7fd468fb2875f51de2f");
            return;
        }
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).y.a(new com.meituan.android.cube.pga.action.b<i.c<Long, PoiOrderParam>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Long, PoiOrderParam> cVar) {
                i.c<Long, PoiOrderParam> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "017dc6382958f8ec8a25c181d92ae14b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "017dc6382958f8ec8a25c181d92ae14b");
                } else if (cVar2.c.longValue() == ((e) a.this.n).p.a) {
                    a.a(a.this, cVar2.d);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).z.a(new com.meituan.android.cube.pga.action.b<i.c<Long, PoiOrderCouponParam>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Long, PoiOrderCouponParam> cVar) {
                i.c<Long, PoiOrderCouponParam> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "912a47c6faa70377382f5069530bc4a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "912a47c6faa70377382f5069530bc4a9");
                } else if (cVar2.c.longValue() == ((e) a.this.n).p.a) {
                    PoiOrderCouponParam M = a.this.M();
                    cVar2.d.couponViewId = M.couponViewId;
                    cVar2.d.goodsCouponViewId = M.goodsCouponViewId;
                    cVar2.d.poiCouponViewId = M.poiCouponViewId;
                    cVar2.d.selectedCouponsReq = M.selectedCouponsReq;
                    cVar2.d.sgItemCouponViewId = M.sgItemCouponViewId;
                    cVar2.d.shippingCouponViewId = M.shippingCouponViewId;
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).x.a(new com.meituan.android.cube.pga.action.b<i.c<Long, OrderCouponRequestParams>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Long, OrderCouponRequestParams> cVar) {
                i.c<Long, OrderCouponRequestParams> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4ba6b45d05489e79456758402838df4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4ba6b45d05489e79456758402838df4");
                } else if (cVar2.c.longValue() == ((e) a.this.n).p.a) {
                    a.a(a.this, cVar2.d);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86be813de6097e9b808e908586420977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86be813de6097e9b808e908586420977");
            return;
        }
        super.s();
        com.sankuai.waimai.bussiness.order.crossconfirm.block.closeinfo.a aVar = new com.sankuai.waimai.bussiness.order.crossconfirm.block.closeinfo.a(F());
        aVar.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, PoiOrderPreviewPoiResult>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.9
            @Override // com.meituan.android.cube.pga.action.c
            public final /* bridge */ /* synthetic */ PoiOrderPreviewPoiResult a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                if (poiOrderPreviewResult2 != null) {
                    return poiOrderPreviewResult2.poiInfo;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) aVar);
        c((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantinfo.a(F()));
        this.s = new com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        c((com.meituan.android.cube.pga.block.a) this.s);
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()));
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()));
        this.E = new com.sankuai.waimai.bussiness.order.crossconfirm.block.discountpromotion.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        a((com.meituan.android.cube.pga.block.a) this.E);
        this.u = new com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        a((com.meituan.android.cube.pga.block.a) this.u);
        this.v = new com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        a((com.meituan.android.cube.pga.block.a) this.v);
        this.w = new com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        a((com.meituan.android.cube.pga.block.a) this.w);
        com.sankuai.waimai.bussiness.order.crossconfirm.block.remindinfo.a aVar2 = new com.sankuai.waimai.bussiness.order.crossconfirm.block.remindinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        aVar2.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, List<Remind>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.10
            @Override // com.meituan.android.cube.pga.action.c
            public final /* bridge */ /* synthetic */ List<Remind> a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                if (poiOrderPreviewResult2 != null) {
                    return poiOrderPreviewResult2.remindInfos;
                }
                return null;
            }
        });
        c((com.meituan.android.cube.pga.block.a) aVar2);
        this.D = new com.sankuai.waimai.bussiness.order.crossconfirm.block.additionalbargain.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        this.D.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, AdditionalBargain>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.11
            @Override // com.meituan.android.cube.pga.action.c
            public final /* bridge */ /* synthetic */ AdditionalBargain a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                if (poiOrderPreviewResult2 != null) {
                    return poiOrderPreviewResult2.additionalBargain;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) this.D);
        this.B = new com.sankuai.waimai.bussiness.order.crossconfirm.block.timeinsurance.a((com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d) F());
        this.B.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, Insurance>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.12
            @Override // com.meituan.android.cube.pga.action.c
            public final /* bridge */ /* synthetic */ Insurance a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                if (poiOrderPreviewResult2 != null) {
                    return poiOrderPreviewResult2.insurance;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) this.B);
        this.C = new com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        this.C.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, PrivacyService>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.13
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ PrivacyService a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                Object[] objArr2 = {poiOrderPreviewResult2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c37d96772c0238f9c560bd27eaf8a14", RobustBitConfig.DEFAULT_VALUE)) {
                    return (PrivacyService) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c37d96772c0238f9c560bd27eaf8a14");
                }
                if (poiOrderPreviewResult2 != null) {
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.d dVar = (com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.d) a.this.C.G();
                    long j = ((e) a.this.n).p.a;
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.d.o;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "916c3d4ad484acb191b5134d0278ac1b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "916c3d4ad484acb191b5134d0278ac1b");
                    } else {
                        dVar.p = j;
                        dVar.r.a = j;
                    }
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.d dVar2 = (com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.d) a.this.C.G();
                    String str = ((e) a.this.n).p.c;
                    dVar2.q = str;
                    dVar2.r.b = str;
                    return poiOrderPreviewResult2.privacyService;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) this.C);
        com.sankuai.waimai.bussiness.order.crossconfirm.block.foodsecurity.a aVar3 = new com.sankuai.waimai.bussiness.order.crossconfirm.block.foodsecurity.a((com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d) F());
        aVar3.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, FoodInsurance>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.14
            @Override // com.meituan.android.cube.pga.action.c
            public final /* bridge */ /* synthetic */ FoodInsurance a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                if (poiOrderPreviewResult2 != null) {
                    return poiOrderPreviewResult2.foodInsurance;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) aVar3);
        com.sankuai.waimai.bussiness.order.crossconfirm.block.publicawelfare.a aVar4 = new com.sankuai.waimai.bussiness.order.crossconfirm.block.publicawelfare.a((com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d) F());
        aVar4.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, PoiOrderPreviewPoiResult>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.2
            @Override // com.meituan.android.cube.pga.action.c
            public final /* bridge */ /* synthetic */ PoiOrderPreviewPoiResult a(PoiOrderPreviewResult poiOrderPreviewResult) {
                return poiOrderPreviewResult.poiInfo;
            }
        });
        a((com.meituan.android.cube.pga.block.a) aVar4);
        this.y = new com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        a((com.meituan.android.cube.pga.block.a) this.y);
        this.x = new com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        this.x.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, FieldInfo>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ FieldInfo a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                Object[] objArr2 = {poiOrderPreviewResult2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "905475a45df4815ee3cc336a31612976", RobustBitConfig.DEFAULT_VALUE)) {
                    return (FieldInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "905475a45df4815ee3cc336a31612976");
                }
                if (poiOrderPreviewResult2 != null) {
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.d dVar = (com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.d) a.this.x.G();
                    long j = poiOrderPreviewResult2.poiInfo.poiId;
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.d.o;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "fe9a44e54e1c6064a8275befa02ef343", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "fe9a44e54e1c6064a8275befa02ef343");
                    } else {
                        dVar.p = j;
                        dVar.r.b = j;
                    }
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.d dVar2 = (com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.d) a.this.x.G();
                    String str = poiOrderPreviewResult2.poiInfo.poiIdStr;
                    dVar2.q = str;
                    dVar2.r.c = str;
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.d) a.this.x.G()).r.g = poiOrderPreviewResult2.index;
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.d) a.this.x.G()).r.e = poiOrderPreviewResult2.extendsInfo.remarkTagCallbackInfo;
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.d) a.this.x.G()).r.d = poiOrderPreviewResult2.orderToken;
                    return poiOrderPreviewResult2.remarkField;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) this.x);
        this.t = new com.sankuai.waimai.bussiness.order.crossconfirm.block.supplyinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        this.t.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, List<CodeDesc>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.4
            @Override // com.meituan.android.cube.pga.action.c
            public final /* bridge */ /* synthetic */ List<CodeDesc> a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                if (poiOrderPreviewResult2 != null) {
                    return poiOrderPreviewResult2.noProductReminds;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) this.t);
        this.z = new com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.b((com.sankuai.waimai.bussiness.order.crossconfirm.a) F(), false, 1);
        a((com.meituan.android.cube.pga.block.a) this.z);
        this.A = new com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        this.A.a(0, g.a(m(), 1.0f), 0, g.a(m(), 10.0f));
        this.A.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, PoiOrderPreviewInvoiceResult>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ PoiOrderPreviewInvoiceResult a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                Object[] objArr2 = {poiOrderPreviewResult2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f856dd34b9fe60a04289e6dd2e82e89", RobustBitConfig.DEFAULT_VALUE)) {
                    return (PoiOrderPreviewInvoiceResult) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f856dd34b9fe60a04289e6dd2e82e89");
                }
                if (poiOrderPreviewResult2 != null) {
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.d dVar = (com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.d) a.this.A.G();
                    double d = poiOrderPreviewResult2.total;
                    Object[] objArr3 = {Double.valueOf(d)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.d.o;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "abee58150445f692ca83325d7c7349e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "abee58150445f692ca83325d7c7349e9");
                    } else {
                        dVar.p.i = d;
                    }
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.d) a.this.A.G()).p.k = poiOrderPreviewResult2.index;
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.d dVar2 = (com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.d) a.this.A.G();
                    long j = poiOrderPreviewResult2.poiInfo != null ? poiOrderPreviewResult2.poiInfo.poiId : 0L;
                    Object[] objArr4 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.d.o;
                    if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "c5b08d3b51e05c59f9cb44eb078ce62e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "c5b08d3b51e05c59f9cb44eb078ce62e");
                    } else {
                        dVar2.p.b = j;
                    }
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.d) a.this.A.G()).p.c = poiOrderPreviewResult2.poiInfo != null ? poiOrderPreviewResult2.poiInfo.poiIdStr : "";
                    return poiOrderPreviewResult2.invoiceInfo;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) this.A);
        com.sankuai.waimai.bussiness.order.crossconfirm.block.poiprojectinfo.a aVar5 = new com.sankuai.waimai.bussiness.order.crossconfirm.block.poiprojectinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
        aVar5.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<PoiOrderPreviewResult, PoiOrderPreviewPoiResult>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a.6
            @Override // com.meituan.android.cube.pga.action.c
            public final /* bridge */ /* synthetic */ PoiOrderPreviewPoiResult a(PoiOrderPreviewResult poiOrderPreviewResult) {
                PoiOrderPreviewResult poiOrderPreviewResult2 = poiOrderPreviewResult;
                if (poiOrderPreviewResult2 != null) {
                    return poiOrderPreviewResult2.poiInfo;
                }
                return null;
            }
        });
        a((com.meituan.android.cube.pga.block.a) aVar5);
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.promotionalinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()));
        a(0, g.a(m(), 6.0f), 0, 0);
    }

    private void c(com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ddb0a81528cb6728803eb81ba70b0b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ddb0a81528cb6728803eb81ba70b0b8");
        } else {
            a(aVar, 0, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [com.meituan.android.cube.pga.type.a] */
    private void a(com.meituan.android.cube.pga.block.a aVar, int i, int i2) {
        Object[] objArr = {aVar, 0, 0};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f8d5681e11b3d77fba543d23a85ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f8d5681e11b3d77fba543d23a85ebd");
            return;
        }
        super.a(aVar);
        com.sankuai.waimai.bussiness.order.crossconfirm.block.line.a aVar2 = new com.sankuai.waimai.bussiness.order.crossconfirm.block.line.a(F());
        a(0, 0, 0, 0);
        aVar2.p = true;
        a((com.meituan.android.cube.pga.block.a) aVar2);
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "787049e664132c6f7b971c29f710ad05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "787049e664132c6f7b971c29f710ad05");
        } else {
            super.c(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public PoiOrderCouponParam M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896b559830c65accc33108fc9b93a204", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiOrderCouponParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896b559830c65accc33108fc9b93a204");
        }
        PoiOrderCouponParam poiOrderCouponParam = new PoiOrderCouponParam();
        poiOrderCouponParam.couponViewId = this.u.M();
        poiOrderCouponParam.goodsCouponViewId = this.v.M();
        poiOrderCouponParam.poiCouponViewId = this.v.N();
        poiOrderCouponParam.sgItemCouponViewId = this.v.O();
        poiOrderCouponParam.selectedCouponsReq = this.v.P();
        poiOrderCouponParam.shippingCouponViewId = this.w.M();
        return poiOrderCouponParam;
    }

    private String N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db0f2d63d3039d4eff442580e31020a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db0f2d63d3039d4eff442580e31020a");
        }
        LongSparseArray<PoiOrderCouponParam> longSparseArray = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).u.a().b;
        if (longSparseArray == null || longSparseArray.size() < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longSparseArray.size(); i++) {
            if (((e) this.n).p.a != longSparseArray.keyAt(i)) {
                String str = longSparseArray.valueAt(i).couponViewId;
                if (b(str)) {
                    sb.append(str);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
                String str2 = longSparseArray.valueAt(i).poiCouponViewId;
                if (b(str2)) {
                    sb.append(str2);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
                String str3 = longSparseArray.valueAt(i).goodsCouponViewId;
                if (b(str3)) {
                    sb.append(str3);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
                if (com.sankuai.waimai.foundation.utils.b.a(longSparseArray.valueAt(i).selectedCouponsReq)) {
                    List<f> list = longSparseArray.valueAt(i).selectedCouponsReq;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        f fVar = (f) com.sankuai.waimai.foundation.utils.b.a(list, i2);
                        if (fVar != null && fVar.a == 1 && !com.sankuai.waimai.foundation.utils.b.b(fVar.b)) {
                            for (int i3 = 0; i3 < fVar.b.size(); i3++) {
                                String str4 = (String) com.sankuai.waimai.foundation.utils.b.a(fVar.b, i3);
                                if (b(str4)) {
                                    sb.append(str4);
                                    sb.append(CommonConstant.Symbol.COMMA);
                                }
                            }
                        }
                    }
                } else {
                    String str5 = longSparseArray.valueAt(i).sgItemCouponViewId;
                    if (b(str5)) {
                        sb.append(str5);
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                    String str6 = longSparseArray.valueAt(i).shippingCouponViewId;
                    if (b(str6)) {
                        sb.append(str6);
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() > 1) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb.toString();
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f2532d490f2b2a87e61d3fdd4aeb63d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f2532d490f2b2a87e61d3fdd4aeb63d")).booleanValue() : (str == null || str.length() <= 0 || str.equals("0") || str.equals("-1")) ? false : true;
    }
}
