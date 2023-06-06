package com.sankuai.waimai.bussiness.order.detailnew.controller.map;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.controller.map.e;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public final class g extends e {
    public static ChangeQuickRedirect a;
    private final a B;
    private final b b;
    private float c;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final int b() {
        return 5;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void e() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public final View getInfoContents(Marker marker) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        return true;
    }

    public g(Context context, ViewGroup viewGroup, MTMap mTMap, String str, e.a aVar, @Nullable e.a aVar2) {
        super(context, viewGroup, mTMap, str, aVar, aVar2);
        Object[] objArr = {context, viewGroup, mTMap, str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9127dec9dceb864ac29500496370a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9127dec9dceb864ac29500496370a1");
            return;
        }
        this.b = new b(this.e, this.f);
        this.B = new a(viewGroup);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, String str, com.sankuai.waimai.business.order.api.detail.model.a aVar, n nVar, com.sankuai.waimai.business.order.api.detail.model.b bVar2, RiderInfo riderInfo) {
        Object[] objArr = {bVar, str, aVar, nVar, bVar2, riderInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "068c501c1a9fd5f834bbdc9d7e52d13c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "068c501c1a9fd5f834bbdc9d7e52d13c");
            return;
        }
        super.a(bVar, str, aVar, nVar, bVar2, riderInfo);
        if (bVar == null) {
            return;
        }
        this.B.c = false;
        this.B.a(bVar, bVar2, aVar, str);
        c();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac7b0c7bc8e611f54e02f5e5af0575f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac7b0c7bc8e611f54e02f5e5af0575f9");
        } else if (this.k != null) {
            this.e.moveCamera(CameraUpdateFactory.newLatLngZoom(this.k.a(), 15.0f));
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c851514d645cc83b3c041d99ff094074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c851514d645cc83b3c041d99ff094074");
        } else {
            this.e.setPointToCenter(com.sankuai.waimai.platform.b.A().l() / 2, com.sankuai.waimai.platform.b.A().m() / 3);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d, com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChangeFinish(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0b38a21d0fd78af4645fc5d9a109597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0b38a21d0fd78af4645fc5d9a109597");
            return;
        }
        float scalePerPixel = this.e.getScalePerPixel();
        double a2 = com.sankuai.waimai.foundation.utils.g.a(this.f) * scalePerPixel;
        if (this.c != 0.0f) {
            this.b.a(a2);
            this.b.a(scalePerPixel / this.c);
        } else if (!this.b.n) {
            b bVar = this.b;
            bVar.g = this.f.getResources().getColor(R.color.wm_order_status_map_ripper_fill_color);
            bVar.i = com.sankuai.waimai.foundation.utils.g.a(this.f, 0.5f);
            bVar.h = this.f.getResources().getColor(R.color.wm_order_status_map_ripper_stroke_color);
            b a3 = bVar.a(4);
            a3.c = this.k.a();
            b a4 = a3.a(16000L);
            a4.e = 0.8f;
            a4.a(a2).a();
        }
        this.c = scalePerPixel;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public final View getInfoWindow(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d3a72b9114428fceefeaedf64669aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d3a72b9114428fceefeaedf64669aa");
        }
        if (this.B.c) {
            return super.getInfoWindow(marker);
        }
        return this.B.b;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97205f06fad45aeec0e7ab5b31ba28c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97205f06fad45aeec0e7ab5b31ba28c6");
            return;
        }
        a aVar = this.B;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "20028511c6e72e62d14d8a1502e9a360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "20028511c6e72e62d14d8a1502e9a360");
        } else if (aVar.d != null) {
            aVar.d.remove();
        }
        this.e.clear();
        this.b.b();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b81df6ad97aed240de2d4fe686855934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b81df6ad97aed240de2d4fe686855934");
            return;
        }
        f();
        super.a();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2c0fe2fb26e4446d11e0af1e7495de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2c0fe2fb26e4446d11e0af1e7495de");
        } else {
            this.b.b();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbab0ad45e4fd97ada44e012051de38b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbab0ad45e4fd97ada44e012051de38b");
        } else {
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public final class a {
        public static ChangeQuickRedirect a;
        View b;
        boolean c;
        Marker d;
        private View f;
        private ImageView g;

        private a(ViewGroup viewGroup) {
            Object[] objArr = {g.this, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a429586369477145a15a30344a2abb2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a429586369477145a15a30344a2abb2");
                return;
            }
            this.c = false;
            this.b = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_order_status_layout_map_prescription_drugs_infowindow, viewGroup, false);
            this.g = (ImageView) this.b.findViewById(R.id.img_map_avator);
            this.f = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_order_status_layout_map_marker_city_delicery, viewGroup, false);
        }

        void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, com.sankuai.waimai.business.order.api.detail.model.b bVar2, com.sankuai.waimai.business.order.api.detail.model.a aVar, String str) {
            Object[] objArr = {bVar, bVar2, aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6fcc16e6bf00e2bd3edd3a28d9cc25a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6fcc16e6bf00e2bd3edd3a28d9cc25a");
            } else if (bVar == null || bVar2 == null || bVar2.a() == null) {
            } else {
                LatLng a2 = bVar2.a();
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9e0e7f22da8527a21d550cda5fd8563", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9e0e7f22da8527a21d550cda5fd8563");
                } else if (this.d != null) {
                    this.d.setPosition(a2);
                } else {
                    MarkerOptions draggable = new MarkerOptions().anchor(0.5f, 0.5f).position(a2).title("").draggable(false);
                    draggable.icon(BitmapDescriptorFactory.fromView(this.f));
                    draggable.setInfoWindowOffset(com.sankuai.waimai.foundation.utils.g.a(this.b.getContext(), 1.0f), com.sankuai.waimai.foundation.utils.g.a(this.b.getContext(), 20.0f));
                    this.d = g.this.e.addMarker(draggable);
                    if (this.d != null) {
                        this.d.setInfoWindowEnable(true);
                        this.d.showInfoWindow();
                    }
                }
                b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a3.b = g.this.f;
                a3.c = bVar2.d;
                a3.i = R.drawable.wm_order_status_map_marker_poi_default;
                a3.j = R.drawable.wm_order_status_map_marker_poi_default;
                a3.a(this.g);
            }
        }
    }
}
