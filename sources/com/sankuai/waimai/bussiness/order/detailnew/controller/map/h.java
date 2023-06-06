package com.sankuai.waimai.bussiness.order.detailnew.controller.map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.Polyline;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.controller.map.e;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.p;
import com.sankuai.waimai.bussiness.order.detailnew.util.i;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.location.locatesdk.LocateSDK;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.imageloader.image.FixedSizeTransform;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.manager.location.geo.MafApi;
import com.sankuai.waimai.platform.domain.manager.location.model.SelfDeliveryRouteResponse;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends e {
    public static ChangeQuickRedirect a;
    private p B;
    private LatLng C;
    private i D;
    private LatLng E;
    private a F;
    private final int G;
    private boolean H;
    private Marker I;
    private Marker J;
    private Marker K;
    private Polyline L;
    private b M;
    private MTMap.CancelableCallback N;
    public com.sankuai.waimai.business.selfdelivery.a b;
    private n c;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final int b() {
        return 2;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public final View getInfoContents(Marker marker) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        return true;
    }

    public static /* synthetic */ LatLng a(h hVar, WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "5039ba1c5cb71101bbcff42f0eae0df1", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "5039ba1c5cb71101bbcff42f0eae0df1");
        }
        if (wMLocation == null) {
            return null;
        }
        return new LatLng(wMLocation.getLatitude(), wMLocation.getLongitude());
    }

    public static /* synthetic */ String a(h hVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "82e80047beff5a09d890010b9ae63baf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "82e80047beff5a09d890010b9ae63baf");
        }
        if (i < 1000) {
            return i + "m";
        } else if (i / 1000 >= 99) {
            return "99km+";
        } else {
            return new DecimalFormat("0.0").format(i / 1000.0f) + "km";
        }
    }

    public static /* synthetic */ void a(h hVar, LatLng latLng, LatLng latLng2) {
        String w;
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "c11754fb7456d9c1a3a52c6e6f0641a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "c11754fb7456d9c1a3a52c6e6f0641a9");
        } else if (latLng == null || latLng2 == null) {
        } else {
            rx.d<SelfDeliveryRouteResponse> route = ((MafApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) MafApi.class)).route(com.sankuai.waimai.config.a.a().c(), latLng.longitude + CommonConstant.Symbol.COMMA + latLng.latitude, latLng2.longitude + CommonConstant.Symbol.COMMA + latLng2.latitude, "WALKING");
            b.AbstractC1042b<SelfDeliveryRouteResponse> abstractC1042b = new b.AbstractC1042b<SelfDeliveryRouteResponse>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.h.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    SelfDeliveryRouteResponse selfDeliveryRouteResponse = (SelfDeliveryRouteResponse) obj;
                    Object[] objArr2 = {selfDeliveryRouteResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "273d8bbd93ba1dbf4d4a3e1cf26f0a65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "273d8bbd93ba1dbf4d4a3e1cf26f0a65");
                    } else if (selfDeliveryRouteResponse != null) {
                        com.sankuai.waimai.platform.domain.manager.location.model.a aVar = selfDeliveryRouteResponse.c;
                        if (aVar != null) {
                            if (aVar.c != null && aVar.c.size() > 1 && aVar.a < 99000) {
                                if (h.this.L != null) {
                                    h.this.L.remove();
                                }
                                PolylineOptions.SingleColorPattern singleColorPattern = new PolylineOptions.SingleColorPattern();
                                singleColorPattern.color(h.this.f.getResources().getColor(R.color.wm_order_status_self_delivery_line));
                                PolylineOptions width = new PolylineOptions().pattern(singleColorPattern).width(com.sankuai.waimai.foundation.utils.g.a(h.this.f, 6.0f));
                                width.setPoints(aVar.c);
                                h.this.L = h.this.e.addPolyline(width);
                                if (h.this.F != null) {
                                    a aVar2 = h.this.F;
                                    String a2 = h.a(h.this, aVar.a);
                                    Object[] objArr3 = {a2};
                                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "d287b2540b8cd16e41e36fee01f99cad", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "d287b2540b8cd16e41e36fee01f99cad");
                                    } else {
                                        aVar2.d.setVisibility(TextUtils.isEmpty(a2) ? 8 : 0);
                                        ah.a(aVar2.c, a2);
                                    }
                                }
                                h.this.c();
                                return;
                            }
                            onError(null);
                            return;
                        }
                        onError(null);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee367e1da1caf4ba56bec52434ccaf5e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee367e1da1caf4ba56bec52434ccaf5e");
                    } else {
                        h.this.c();
                    }
                }
            };
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "420aa9fc6b7a5fff0e955ee9732eb543", RobustBitConfig.DEFAULT_VALUE)) {
                w = PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "420aa9fc6b7a5fff0e955ee9732eb543");
            } else {
                w = (hVar.f == null || !(hVar.f instanceof BaseActivity)) ? "OrderStatusSelfDeliveryController" : ((BaseActivity) hVar.f).w();
            }
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(route, abstractC1042b, w);
        }
    }

    public static /* synthetic */ void g(h hVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "4e25537131ae331f15345dd688f736b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "4e25537131ae331f15345dd688f736b6");
        } else if (hVar.J == null) {
            hVar.J = hVar.a(com.sankuai.waimai.launcher.util.image.a.a(hVar.f.getResources(), (int) R.drawable.wm_order_status_map_self_delivery_start), hVar.C);
            if (hVar.J != null) {
                hVar.J.setInfoWindowEnable(false);
            }
        } else {
            hVar.J.setPosition(hVar.C);
        }
    }

    public h(Context context, ViewGroup viewGroup, MTMap mTMap, String str, e.a aVar, e.a aVar2) {
        super(context, viewGroup, mTMap, str, aVar, aVar2);
        Object[] objArr = {context, viewGroup, mTMap, str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5937fc479d350419bc6ff94874bf7a56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5937fc479d350419bc6ff94874bf7a56");
            return;
        }
        this.N = new MTMap.CancelableCallback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
            public final void onCancel() {
            }

            @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
            public final void onFinish() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db891ea782763222b76b027e9e891ea7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db891ea782763222b76b027e9e891ea7");
                } else if (h.this.K == null || !h.this.K.isInfoWindowShown()) {
                } else {
                    h.this.K.setInfoWindowEnable(true);
                    h.this.K.showInfoWindow();
                }
            }
        };
        this.D = new i(com.meituan.android.singleton.b.a);
        this.b = new com.sankuai.waimai.business.selfdelivery.a(context);
        this.G = com.sankuai.waimai.foundation.utils.g.a(this.f, 5.0f);
        h();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e39a51df277854ef7fbae47375b5218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e39a51df277854ef7fbae47375b5218");
            return;
        }
        super.h();
        this.D.a();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6978984397878642186f41a3da45fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6978984397878642186f41a3da45fc");
            return;
        }
        super.g();
        i iVar = this.D;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "fcf2bfee38ceeca432c7bc620bc9ed47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "fcf2bfee38ceeca432c7bc620bc9ed47");
        } else {
            if (iVar.c != null) {
                iVar.c.unregisterListener(iVar);
            }
            if (iVar.b != null) {
                iVar.b.clearAnimation();
            }
        }
        com.sankuai.waimai.foundation.location.v2.g.a().f();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12144a86563894d100f0f206d25516fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12144a86563894d100f0f206d25516fe");
            return;
        }
        com.sankuai.waimai.foundation.location.v2.g.a().f();
        super.a();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, String str, com.sankuai.waimai.business.order.api.detail.model.a aVar, n nVar, com.sankuai.waimai.business.order.api.detail.model.b bVar2, RiderInfo riderInfo) {
        Object[] objArr = {bVar, str, aVar, nVar, bVar2, riderInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3127b29ab2a751d81d18bcdb0b60c1d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3127b29ab2a751d81d18bcdb0b60c1d6");
            return;
        }
        super.a(bVar, str, aVar, nVar, bVar2, riderInfo);
        this.c = nVar;
        this.B = bVar.i;
        this.E = bVar2 == null ? null : bVar2.a();
        if (aVar != null && aVar.c()) {
            i();
        }
        if (this.B != null && this.B.d == 1) {
            if (bVar.k) {
                return;
            }
            this.H = true;
            Object[] objArr2 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce3f60416574375cb49efbe8de1a4064", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce3f60416574375cb49efbe8de1a4064");
            } else {
                if (this.K == null) {
                    this.K = a(com.sankuai.waimai.launcher.util.image.a.a(this.f.getResources(), (int) R.drawable.wm_order_status_map_self_delivery_end), this.E);
                    if (this.K != null) {
                        this.K.setInfoWindowEnable(false);
                    }
                    this.F = new a();
                    this.F.a(bVar2);
                }
                this.K.setInfoWindowEnable(true);
                this.K.showInfoWindow();
            }
            if (this.C == null) {
                super.d();
                this.e.moveCamera(CameraUpdateFactory.newLatLngZoom(this.E, 15.0f));
            }
            Object[] objArr3 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da907633f0781bcf41c8b1d6c777eae3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da907633f0781bcf41c8b1d6c777eae3");
                return;
            }
            if (this.M == null) {
                this.M = new b();
            }
            this.M.b = true;
            com.sankuai.waimai.foundation.location.v2.g a2 = com.sankuai.waimai.foundation.location.v2.g.a();
            final Context context = this.f;
            b bVar3 = this.M;
            k kVar = new k((Activity) this.f, "dj-d93fd6fdec4b5fca");
            Object[] objArr4 = {context, bVar3, Long.valueOf((long) MetricsAnrManager.ANR_THRESHOLD), "OrderStatusSelfDeliveryController", kVar};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.foundation.location.v2.g.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "7381fb055557247b5e913b0dbb2dd5a8", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "7381fb055557247b5e913b0dbb2dd5a8")).booleanValue();
                return;
            }
            final com.sankuai.waimai.foundation.location.v2.e eVar = a2.e;
            Object[] objArr5 = {context, bVar3, new Long((long) MetricsAnrManager.ANR_THRESHOLD), "OrderStatusSelfDeliveryController", kVar};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.foundation.location.v2.e.a;
            if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "e2e1de6818b532ce6d300875d60af5b0", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "e2e1de6818b532ce6d300875d60af5b0")).booleanValue();
                return;
            } else if (bVar3 != null) {
                eVar.c = com.sankuai.waimai.foundation.location.e.c().a(context, MetricsAnrManager.ANR_THRESHOLD, kVar);
                if (eVar.c != null) {
                    eVar.b = new WeakReference<>(bVar3);
                    Object[] objArr6 = {context};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.foundation.location.v2.e.a;
                    eVar.e = PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "90bbc43a527316786d68ff86fc858610", RobustBitConfig.DEFAULT_VALUE) ? (Loader.OnLoadCompleteListener) PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "90bbc43a527316786d68ff86fc858610") : new Loader.OnLoadCompleteListener<MtLocation>() { // from class: com.sankuai.waimai.foundation.location.v2.IntervalLocateDelegate$1
                        public static ChangeQuickRedirect a;

                        @Override // android.support.v4.content.Loader.OnLoadCompleteListener
                        public /* synthetic */ void onLoadComplete(@NonNull Loader<MtLocation> loader, @Nullable MtLocation mtLocation) {
                            WeakReference weakReference;
                            WeakReference weakReference2;
                            MtLocation mtLocation2 = mtLocation;
                            Object[] objArr7 = {loader, mtLocation2};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ffb1d5f8d2a5b0ae943d4455d8f90851", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ffb1d5f8d2a5b0ae943d4455d8f90851");
                                return;
                            }
                            weakReference = e.this.b;
                            if (weakReference != null) {
                                weakReference2 = e.this.b;
                                com.sankuai.waimai.foundation.location.v2.listener.b bVar4 = (com.sankuai.waimai.foundation.location.v2.listener.b) weakReference2.get();
                                if (bVar4 != null) {
                                    WMLocation wMLocation = new WMLocation(LocateSDK.MT);
                                    LocationResultCode locationResultCode = new LocationResultCode();
                                    wMLocation.setLocationResultCode(locationResultCode);
                                    wMLocation.setLocationSdk(LocateSDK.MT);
                                    if (mtLocation2 != null && mtLocation2.getLatitude() > 0.0d && mtLocation2.getLongitude() > 0.0d && mtLocation2.getStatusCode() == 0) {
                                        locationResultCode.a = 1200;
                                        wMLocation.setAccuracy(mtLocation2.getAccuracy());
                                        wMLocation.setLongitude(mtLocation2.getLongitude());
                                        wMLocation.setLatitude(mtLocation2.getLatitude());
                                        bVar4.a(wMLocation);
                                        return;
                                    }
                                    if (mtLocation2 != null) {
                                        if (mtLocation2.getStatusCode() != 3) {
                                            if (mtLocation2.getStatusCode() == 9) {
                                                if (!com.sankuai.waimai.foundation.location.e.c().a(context)) {
                                                    locationResultCode.a = 1203;
                                                } else {
                                                    locationResultCode.a = 1202;
                                                }
                                            }
                                        } else {
                                            locationResultCode.a = 1201;
                                        }
                                    } else {
                                        locationResultCode.a = 1204;
                                    }
                                    if (bVar4 != null) {
                                        bVar4.a(wMLocation);
                                        return;
                                    }
                                    return;
                                }
                                loader.stopLoading();
                            }
                        }
                    };
                    eVar.c.registerListener(com.sankuai.waimai.foundation.location.v2.e.d, eVar.e);
                    eVar.c.startLoading();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        j();
        super.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Marker a(Bitmap bitmap, LatLng latLng) {
        Object[] objArr = {bitmap, latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6f3f669051b0375d3f8c4cd956c13fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Marker) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6f3f669051b0375d3f8c4cd956c13fe");
        }
        if (latLng == null) {
            return null;
        }
        return this.e.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).title("").position(latLng).setInfoWindowOffset(0, this.G).draggable(false).icon(BitmapDescriptorFactory.fromBitmap(bitmap)));
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e
    public final void c() {
        Rect a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a2e610c1458b5830135484eaac7e73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a2e610c1458b5830135484eaac7e73");
            return;
        }
        int a3 = com.sankuai.waimai.foundation.utils.g.a(this.f, 140.0f);
        int a4 = com.sankuai.waimai.foundation.utils.g.a(this.f, 120.0f);
        int a5 = com.sankuai.waimai.foundation.utils.g.a(this.f, 120.0f);
        int m = ((int) (com.sankuai.waimai.platform.b.A().m() * 0.4d)) + com.sankuai.waimai.foundation.utils.g.a(this.f, 65.0f);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        if (this.C != null) {
            builder.include(this.C);
        }
        if (this.E != null) {
            builder.include(this.E);
        }
        if ((this.C != null && this.E != null) || (this.L != null && !com.sankuai.waimai.foundation.utils.d.a(this.L.getPoints()))) {
            if (this.L != null) {
                for (LatLng latLng : this.L.getPoints()) {
                    builder.include(latLng);
                }
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            int[] iArr = null;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a52ea38483dacc3a1e934d06a2d1ece7", RobustBitConfig.DEFAULT_VALUE)) {
                iArr = (int[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a52ea38483dacc3a1e934d06a2d1ece7");
            } else if (this.z != null && (a2 = this.z.a()) != null && this.F != null && this.F.b != null) {
                int width = this.F.b.getWidth();
                int height = this.F.b.getHeight();
                if (width == 0 || height == 0) {
                    this.F.b.measure(0, 0);
                    width = this.F.b.getMeasuredWidth();
                    height = this.F.b.getMeasuredHeight();
                }
                if (width != 0 && height != 0) {
                    iArr = new int[4];
                    int i = width / 2;
                    iArr[0] = (a2.left - 0) + i;
                    iArr[1] = (com.sankuai.waimai.platform.b.A().l() - a2.right) + i;
                    Drawable drawable = this.f.getDrawable(R.drawable.wm_order_status_map_self_delivery_start);
                    int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
                    iArr[2] = a2.top - 0;
                    iArr[2] = iArr[2] + (height - this.G);
                    float f = intrinsicHeight * 0.5f;
                    iArr[2] = (int) (iArr[2] + f);
                    iArr[3] = com.sankuai.waimai.platform.b.A().m() - a2.bottom;
                    iArr[3] = iArr[3] + ((int) Math.ceil(f));
                }
            }
            if (iArr != null && iArr.length == 4) {
                a4 = Math.max(a4, iArr[0]);
                a5 = Math.max(a5, iArr[1]);
                a3 = Math.max(a3, iArr[2]);
                m = Math.max(m, iArr[3]);
            }
            this.e.animateCamera(CameraUpdateFactory.newLatLngBoundsRect(builder.build(), a4, a5, a3, m), this.N);
            return;
        }
        this.e.animateCamera(CameraUpdateFactory.newLatLngZoom(this.E, 15.0f), this.N);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee819875f0160c152dcc77838d9f4f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee819875f0160c152dcc77838d9f4f8");
            return;
        }
        super.a();
        if (!this.i.c() && this.u != null) {
            ((com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.f) this.u).x();
        }
        if (this.H) {
            return;
        }
        if (this.i.c()) {
            if (this.K != null) {
                this.K.remove();
            }
            if (this.J != null) {
                this.J.remove();
            }
            if (this.I != null) {
                this.I.remove();
            }
            this.F = null;
            if (this.L != null) {
                this.L.remove();
            }
            k();
            return;
        }
        this.e.clear();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66839745c144e0466514fb05be9b4eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66839745c144e0466514fb05be9b4eaa");
            return;
        }
        super.a();
        if (this.u != null) {
            this.u.b();
        }
        this.e.clear();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public final View getInfoWindow(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "275112343263f5d93a26f4b752fc14fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "275112343263f5d93a26f4b752fc14fe");
        }
        if (!this.H) {
            return super.getInfoWindow(marker);
        }
        if (this.u != null && this.u.j() != null && marker.getId().equals(this.u.j().getId())) {
            return this.u.k();
        }
        if (this.F == null) {
            return null;
        }
        return this.F.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        View b;
        TextView c;
        TextView d;
        private ImageView f;
        private TextView g;
        private View h;
        private View i;

        public a() {
            Object[] objArr = {h.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b1e93f52782d6f7717ec45135fe292", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b1e93f52782d6f7717ec45135fe292");
                return;
            }
            this.b = LayoutInflater.from(h.this.f).inflate(R.layout.wm_order_status_layout_map_self_delivery_infowindow, (ViewGroup) null);
            this.f = (ImageView) this.b.findViewById(R.id.img_poi_avator);
            this.g = (TextView) this.b.findViewById(R.id.main_desc);
            this.c = (TextView) this.b.findViewById(R.id.sub_distance);
            this.h = this.b.findViewById(R.id.layout_desc);
            this.i = this.b.findViewById(R.id.layout_navigate);
            this.d = (TextView) this.b.findViewById(R.id.sub_desc);
        }

        public final void a(com.sankuai.waimai.business.order.api.detail.model.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0be29822bc9f44480b8c3d77bf005d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0be29822bc9f44480b8c3d77bf005d");
                return;
            }
            int a2 = com.sankuai.waimai.foundation.utils.g.a(h.this.f, 40.0f);
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.b = h.this.f;
            a3.f = ImageQualityUtil.a(0);
            b.C0608b a4 = a3.b(a2).a(a2).a(new FixedSizeTransform(a2, a2), new RoundAndCenterCropTransform(h.this.f, 1));
            a4.c = bVar == null ? null : bVar.d;
            a4.i = R.drawable.wm_order_status_map_marker_poi_default;
            a4.a(this.f);
            this.g.setText(h.this.c.b);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.h.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i;
                    int i2 = 0;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1489a4250318b1b8cf19fc9042bf5c2e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1489a4250318b1b8cf19fc9042bf5c2e");
                        return;
                    }
                    if (h.this.i != null) {
                        i2 = h.this.i.e;
                        i = h.this.i.x;
                    } else {
                        i = 0;
                    }
                    h.this.x.a(h.this.h, i2, i);
                }
            });
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.h.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21fa98cd65668aeecff34ab76577b1ed", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21fa98cd65668aeecff34ab76577b1ed");
                        return;
                    }
                    double d = h.this.C == null ? 0.0d : h.this.C.latitude;
                    double d2 = h.this.C == null ? 0.0d : h.this.C.longitude;
                    double d3 = h.this.E == null ? 0.0d : h.this.E.latitude;
                    double d4 = h.this.E != null ? h.this.E.longitude : 0.0d;
                    final com.sankuai.waimai.business.selfdelivery.a aVar = h.this.b;
                    Object[] objArr3 = {"WALKING", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.selfdelivery.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "01403a4d7c7a8fd08cd33d996858891f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "01403a4d7c7a8fd08cd33d996858891f");
                    } else {
                        ArrayList<LinearLayout> arrayList = new ArrayList();
                        if (aVar.a("com.tencent.map")) {
                            str = "qqmap://map/routeplan?type=" + ("WALKING".equals("WALKING") ? "walk" : "drive") + "&fromcoord=" + d + CommonConstant.Symbol.COMMA + d2 + "&tocoord=" + d3 + CommonConstant.Symbol.COMMA + d4;
                        } else {
                            str = aVar.b;
                        }
                        arrayList.add(aVar.a(R.drawable.wm_order_self_delivery_logo_tencent, aVar.c.getString(R.string.wm_order_self_delivery_qq_map), str, null));
                        if (aVar.a("com.autonavi.minimap")) {
                            arrayList.add(aVar.a(R.drawable.wm_order_self_delivery_logo_gaode, aVar.c.getString(R.string.wm_order_self_delivery_a_map), "amapuri://route/plan/?sourceApplication=nyx_super&dlat=" + d3 + "&dlon=" + d4 + "&dev=0&t=" + ("WALKING".equals("WALKING") ? 2 : 0), null));
                        }
                        if (aVar.a("com.baidu.BaiduMap")) {
                            arrayList.add(aVar.a(R.drawable.wm_order_self_delivery_logo_baidu, aVar.c.getString(R.string.wm_order_self_delivery_baidu_map), "baidumap://map/direction?origin=" + d + CommonConstant.Symbol.COMMA + d2 + "&destination=" + d3 + CommonConstant.Symbol.COMMA + d4 + "&mode=" + "WALKING".toLowerCase(), null));
                        }
                        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(aVar.c).inflate(R.layout.wm_order_self_delivery_choose_map, (ViewGroup) null);
                        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.map_close);
                        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.map_container);
                        if (arrayList.size() > 0) {
                            for (LinearLayout linearLayout3 : arrayList) {
                                linearLayout2.addView(linearLayout3);
                            }
                        } else {
                            linearLayout2.addView(aVar.a(R.drawable.wm_order_self_delivery_logo_tencent, aVar.c.getString(R.string.wm_order_self_delivery_qq_map_recommend), "", new View.OnClickListener() { // from class: com.sankuai.waimai.business.selfdelivery.a.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr4 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa739e7f3b6bc131d25347685da4494e", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa739e7f3b6bc131d25347685da4494e");
                                        return;
                                    }
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.VIEW");
                                    intent.setData(Uri.parse(aVar.b));
                                    aVar.c.startActivity(intent);
                                }
                            }));
                        }
                        Object[] objArr4 = {linearLayout, imageView};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.selfdelivery.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "a9f28ae71524a6edfcc4b823c4428605", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "a9f28ae71524a6edfcc4b823c4428605");
                        } else {
                            final CustomDialog a5 = new CustomDialog.a(aVar.c).a(linearLayout).a();
                            a5.show();
                            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.selfdelivery.a.2
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr5 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "42e2ca87ddd41950f1c5b1be6c23599e", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "42e2ca87ddd41950f1c5b1be6c23599e");
                                    } else if (a5 != null) {
                                        a5.cancel();
                                    }
                                }
                            });
                        }
                    }
                    JudasManualManager.a("b_ccsrnzw3").a("c_hgowsqb").a(h.this.f).a();
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b implements com.sankuai.waimai.foundation.location.v2.listener.b {
        public static ChangeQuickRedirect a;
        boolean b;

        private b() {
            Object[] objArr = {h.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "819e13715ac68ec5a331fccd2691a97e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "819e13715ac68ec5a331fccd2691a97e");
            }
        }

        @Override // com.sankuai.waimai.foundation.location.v2.listener.b
        public final void a(WMLocation wMLocation) {
            Object[] objArr = {wMLocation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc198f80957a5bdedeaf7704a4ab5dd1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc198f80957a5bdedeaf7704a4ab5dd1");
            } else if (wMLocation.getLocationResultCode() == null || wMLocation.getLocationResultCode().a != 1200) {
            } else {
                h.this.C = h.a(h.this, wMLocation);
                if (this.b) {
                    h.g(h.this);
                    h.a(h.this, h.this.C, h.this.E);
                }
                if (h.this.I != null || h.this.C == null) {
                    h.this.I.setPosition(h.a(h.this, wMLocation));
                    return;
                }
                h.this.I = h.this.a(com.sankuai.waimai.launcher.util.image.a.a(h.this.f.getResources(), (int) R.drawable.wm_order_status_map_self_delivery_walk), h.this.C);
                if (h.this.I != null) {
                    h.this.I.setInfoWindowEnable(false);
                }
                h.this.D.d = h.this.I;
            }
        }
    }
}
