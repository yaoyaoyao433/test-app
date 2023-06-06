package com.sankuai.waimai.bussiness.order.detailnew.controller.map;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.controller.map.e;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.CityDeliveryArea;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderStreamStatus;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.foundation.utils.aa;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;
    private LatLng B;
    private a C;
    private b D;
    private float E;
    private com.sankuai.waimai.bussiness.order.detailnew.controller.c F;
    private boolean G;
    public CityDeliveryArea b;
    public com.sankuai.waimai.business.order.api.detail.model.b c;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final int b() {
        return 6;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public final View getInfoContents(Marker marker) {
        return null;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d, com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChange(CameraPosition cameraPosition) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        return true;
    }

    public c(Context context, ViewGroup viewGroup, MTMap mTMap, String str, e.a aVar, e.a aVar2) {
        super(context, viewGroup, mTMap, str, aVar, aVar2);
        Object[] objArr = {context, viewGroup, mTMap, str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf06359a62094ec00ce51af121d7012f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf06359a62094ec00ce51af121d7012f");
            return;
        }
        this.G = true;
        this.F = new com.sankuai.waimai.bussiness.order.detailnew.controller.c((Activity) context, str, null);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, String str, com.sankuai.waimai.business.order.api.detail.model.a aVar, n nVar, com.sankuai.waimai.business.order.api.detail.model.b bVar2, RiderInfo riderInfo) {
        Object[] objArr = {bVar, str, aVar, nVar, bVar2, riderInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2824d5879936ad00f4ecdf73f33cef82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2824d5879936ad00f4ecdf73f33cef82");
            return;
        }
        super.a(bVar, str, aVar, nVar, bVar2, riderInfo);
        this.b = bVar.g;
        this.c = bVar2;
        if (this.b != null && this.b.showPosition == 1 && bVar != null && bVar.d != null) {
            this.B = bVar.d.a();
        } else if (bVar2 != null) {
            this.B = bVar2.a();
        }
        if (this.b != null) {
            if (aVar != null && aVar.c()) {
                i();
            }
            if (this.B != null) {
                m();
                this.C = new a(bVar2.d, this.B, this.b);
                a aVar2 = this.C;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "c7a637439e86330cc947c8b694476ab0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "c7a637439e86330cc947c8b694476ab0");
                } else {
                    aVar2.a();
                }
            } else {
                if (this.C != null && this.D != null) {
                    this.D.b();
                }
                m();
                this.C = null;
            }
            c();
            return;
        }
        this.C = null;
        f();
        j();
        super.c();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d, com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChangeFinish(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b22d177a86c83686cfe4a6d3084d8c53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b22d177a86c83686cfe4a6d3084d8c53");
        } else if (this.D == null) {
        } else {
            float scalePerPixel = this.e.getScalePerPixel();
            double a2 = com.sankuai.waimai.foundation.utils.g.a(this.f) * scalePerPixel;
            com.sankuai.waimai.foundation.utils.log.a.e("map_log_pixel", "distance: " + a2 + " pixel: " + this.e.getScalePerPixel(), new Object[0]);
            if (this.E != 0.0f) {
                this.D.a(a2);
                this.D.a(scalePerPixel / this.E);
            } else if (!this.D.n) {
                b bVar = this.D;
                bVar.g = this.f.getResources().getColor(R.color.wm_order_status_map_ripper_fill_color);
                bVar.i = com.sankuai.waimai.foundation.utils.g.a(this.f, 0.5f);
                bVar.h = this.f.getResources().getColor(R.color.wm_order_status_map_ripper_stroke_color);
                b a3 = bVar.a(4);
                a3.c = this.B;
                b a4 = a3.a(16000L);
                a4.e = 0.8f;
                a4.a(a2).a();
            }
            this.E = scalePerPixel;
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46cacafe7ed5b7c1d8222d56f866ef32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46cacafe7ed5b7c1d8222d56f866ef32");
        } else if (this.C != null) {
            this.C.b();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public final View getInfoWindow(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99117323715f740f238dd11e167b5f03", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99117323715f740f238dd11e167b5f03");
        }
        if (this.u != null && this.u.j() != null && marker.getId().equals(this.u.j().getId())) {
            return this.u.k();
        }
        if (this.C == null) {
            return super.getInfoWindow(marker);
        }
        return this.C.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        Marker b;
        View c;
        TextView d;
        TextView e;
        com.sankuai.waimai.platform.utils.time.a f;
        private View h;
        private LatLng i;
        private CityDeliveryArea j;
        private TextView k;
        private TextView l;
        private TextView m;
        private TextView n;
        private ImageView o;
        private ImageView p;
        private ImageView q;
        private View r;
        private View s;
        private View t;
        private View u;
        private List<View> v;

        public static /* synthetic */ void a(a aVar, int i, long j, int i2) {
            Object[] objArr = {Integer.valueOf(i), new Long(j), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b827384ae02b4959c13e3ec6ce70aa0d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b827384ae02b4959c13e3ec6ce70aa0d");
            } else if (i != 0 || i2 <= 0 || j <= 0 || TextUtils.isEmpty(c.this.h) || c.this.i == null) {
            } else {
                int d = (int) (((aVar.d() - j) / 1000) / 60);
                String str = c.this.h + "order_confirm_city_delivery_no_rider_alert";
                boolean b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(c.this.f, str, false);
                if (!c.this.G || b || d < i2) {
                    return;
                }
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(c.this.f, str, true);
                new RooAlertDialog.a(new ContextThemeWrapper(c.this.f, 2131558962)).b(R.string.wm_order_status_no_rider_response_tip).a(R.string.wm_order_status_continue_waiting, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.c.a.3
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2871150bfb1fb0724dfe676adf5d7976", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2871150bfb1fb0724dfe676adf5d7976");
                        } else {
                            dialogInterface.dismiss();
                        }
                    }
                }).b(R.string.wm_order_title_activity_order_cancel_refund, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.c.a.4
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef61843d999d68a1e41871c53b34152a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef61843d999d68a1e41871c53b34152a");
                            return;
                        }
                        if (c.this.F != null) {
                            c.this.F.a(c.this.h, i.b(c.this.i.o), false);
                        }
                        dialogInterface.dismiss();
                    }
                }).a(false).b();
            }
        }

        public a(String str, LatLng latLng, CityDeliveryArea cityDeliveryArea) {
            Object[] objArr = {c.this, str, latLng, cityDeliveryArea};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94054364b3cf163c8f64cca44180bad5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94054364b3cf163c8f64cca44180bad5");
                return;
            }
            this.v = new ArrayList();
            this.i = latLng;
            this.j = cityDeliveryArea;
            this.c = LayoutInflater.from(c.this.f).inflate(R.layout.wm_order_status_layout_map_city_delivery_infowindow, (ViewGroup) null);
            this.k = (TextView) this.c.findViewById(R.id.txt_order_submit);
            this.l = (TextView) this.c.findViewById(R.id.txt_order_rider);
            this.m = (TextView) this.c.findViewById(R.id.txt_order_poi);
            this.n = (TextView) this.c.findViewById(R.id.txt_tip);
            this.d = (TextView) this.c.findViewById(R.id.txt_time);
            this.e = (TextView) this.c.findViewById(R.id.txt_time_left_desc);
            this.o = (ImageView) this.c.findViewById(R.id.img_dot_1);
            this.p = (ImageView) this.c.findViewById(R.id.img_dot_2);
            this.q = (ImageView) this.c.findViewById(R.id.img_dot_3);
            this.r = this.c.findViewById(R.id.img_line_half_1);
            this.s = this.c.findViewById(R.id.img_line_half_2);
            this.t = this.c.findViewById(R.id.img_line_half_3);
            this.u = this.c.findViewById(R.id.img_line_half_4);
            this.h = LayoutInflater.from(c.this.f).inflate(R.layout.wm_order_status_layout_map_marker_city_delicery, (ViewGroup) null);
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd8ca9419375589a1e178ad2f6ee714", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd8ca9419375589a1e178ad2f6ee714");
                return;
            }
            MarkerOptions draggable = new MarkerOptions().anchor(0.5f, 0.5f).position(this.i).title("").draggable(false);
            draggable.icon(BitmapDescriptorFactory.fromView(this.h));
            draggable.setInfoWindowOffset(com.sankuai.waimai.foundation.utils.g.a(c.this.f, 1.0f), com.sankuai.waimai.foundation.utils.g.a(c.this.f, 20.0f));
            this.b = c.this.e.addMarker(draggable);
            c();
            this.b.setInfoWindowEnable(true);
            this.b.showInfoWindow();
        }

        private void a(TextView textView, ImageView imageView, List<View> list, String str, boolean z) {
            Object[] objArr = {textView, imageView, list, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ae82552305ec372278e6daff74d3d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ae82552305ec372278e6daff74d3d3");
                return;
            }
            textView.setText(str);
            if (z) {
                textView.setTextColor(c.this.f.getResources().getColor(R.color.wm_order_detail_city_delivery_explain_text));
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.wm_order_status_city_delivery_dot_red);
                    imageView.getLayoutParams().width = com.sankuai.waimai.foundation.utils.g.a(c.this.f, 9.0f);
                    imageView.getLayoutParams().height = com.sankuai.waimai.foundation.utils.g.a(c.this.f, 9.0f);
                }
                if (list != null) {
                    for (View view : list) {
                        if (view != null) {
                            view.setBackgroundResource(R.color.wm_order_detail_city_delivery_explain_text);
                        }
                    }
                    return;
                }
                return;
            }
            textView.setTextColor(c.this.f.getResources().getColor(R.color.wm_common_text_auxiliary));
            if (imageView != null) {
                imageView.setImageResource(R.drawable.wm_order_status_city_delivery_dot_black);
                imageView.getLayoutParams().width = com.sankuai.waimai.foundation.utils.g.a(c.this.f, 5.0f);
                imageView.getLayoutParams().height = com.sankuai.waimai.foundation.utils.g.a(c.this.f, 5.0f);
            }
            for (View view2 : list) {
                if (view2 != null) {
                    view2.setBackgroundResource(R.color.wm_order_status_map_line_default_color);
                }
            }
        }

        private void a(int i, String str, boolean z) {
            Object[] objArr = {Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72dc701924003eee4e72e881927d5ac7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72dc701924003eee4e72e881927d5ac7");
                return;
            }
            this.v.clear();
            switch (i) {
                case 0:
                    this.v.add(this.r);
                    a(this.k, this.o, this.v, str, z);
                    return;
                case 1:
                    this.v.add(this.s);
                    this.v.add(this.t);
                    a(this.l, this.p, this.v, str, z);
                    return;
                case 2:
                    this.v.add(this.u);
                    a(this.m, this.q, this.v, str, z);
                    return;
                default:
                    return;
            }
        }

        private void c() {
            boolean z;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1d8ada1be8013aa94dabc04d58e82b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1d8ada1be8013aa94dabc04d58e82b5");
            } else if (this.j != null) {
                if (com.sankuai.waimai.foundation.utils.b.a(this.j.mCityDeliveryStatusStreams)) {
                    z = false;
                    for (OrderStreamStatus orderStreamStatus : this.j.mCityDeliveryStatusStreams) {
                        if (orderStreamStatus != null && orderStreamStatus.currentActive == 1 && orderStreamStatus.statusText.equals("提交订单")) {
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                if (z && c.a(this.j.mainDesc)) {
                    this.e.setVisibility(8);
                    this.d.setText("");
                }
                if (!aa.a(this.j.mainDesc)) {
                    if (!z || !this.j.mainDesc.contains("highlight")) {
                        c.this.G = true;
                        this.n.setTextColor(c.this.f.getResources().getColor(R.color.wm_order_status_main_text_color));
                        this.n.setTextSize(2, 16.0f);
                        this.n.setTypeface(Typeface.DEFAULT);
                        this.n.setText(this.j.mainDesc);
                    } else {
                        c.this.G = false;
                        Spanned a2 = c.a(this.j.mainDesc, "#FF8000");
                        this.n.setTextColor(c.this.f.getResources().getColor(R.color.wm_order_status_main_text_color));
                        this.n.setTextSize(2, 12.0f);
                        this.n.setTypeface(Typeface.DEFAULT_BOLD);
                        this.n.setText(a2);
                    }
                }
                this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.c.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i;
                        int i2 = 0;
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f304df16937275dcdc433582f8bb6b2", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f304df16937275dcdc433582f8bb6b2");
                            return;
                        }
                        if (c.this.i != null) {
                            i2 = c.this.i.e;
                            i = c.this.i.x;
                        } else {
                            i = 0;
                        }
                        c.this.x.a(c.this.h, i2, i);
                    }
                });
                List<OrderStreamStatus> list = this.j.mCityDeliveryStatusStreams;
                if (list == null || list.size() == 0) {
                    if (this.f != null) {
                        b();
                    }
                    if (c.this.D != null) {
                        c.this.D.b();
                        return;
                    }
                    return;
                }
                for (int i = 0; i < 3 && i < list.size(); i++) {
                    OrderStreamStatus orderStreamStatus2 = list.get(i);
                    com.sankuai.waimai.foundation.utils.log.a.e("map_log", "cur: " + i, new Object[0]);
                    boolean z2 = orderStreamStatus2.currentActive == 1;
                    boolean z3 = orderStreamStatus2.highLighten == 1;
                    int i2 = orderStreamStatus2.alertWaitTime;
                    String str = orderStreamStatus2.statusText;
                    long j = orderStreamStatus2.operateTime * 1000;
                    a(i, str, z3);
                    if (z2 && this.f == null) {
                        long d = (((orderStreamStatus2.countDownTime * 60) * 1000) + j) - d();
                        if (d <= 0) {
                            if (c.this.i.c == 1) {
                                com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.bussiness.order.detailnew.event.a("00:00", com.sankuai.waimai.bussiness.order.detailnew.event.a.b));
                            }
                        } else {
                            this.f = new com.sankuai.waimai.platform.utils.time.a(d, 1000L, i, j, i2) { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.c.a.2
                                public static ChangeQuickRedirect a;
                                public final /* synthetic */ int b;
                                public final /* synthetic */ long c;
                                public final /* synthetic */ int d;

                                {
                                    this.b = i;
                                    this.c = j;
                                    this.d = i2;
                                }

                                @Override // com.sankuai.waimai.platform.utils.time.a
                                public final void a(long j2) {
                                    String[] b;
                                    String str2;
                                    Object[] objArr2 = {new Long(j2)};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "826d35ce7e63675a57fe1e652928dbaf", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "826d35ce7e63675a57fe1e652928dbaf");
                                        return;
                                    }
                                    long j3 = j2 / 1000;
                                    if (com.sankuai.waimai.platform.utils.time.b.b(j3) == null) {
                                        str2 = "00:00";
                                    } else {
                                        str2 = b[1] + CommonConstant.Symbol.COLON + b[2];
                                    }
                                    a.this.e.setVisibility(0);
                                    a.this.d.setText(str2);
                                    if (c.this.i.c == 1) {
                                        com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.bussiness.order.detailnew.event.a(str2, com.sankuai.waimai.bussiness.order.detailnew.event.a.b, j3));
                                    }
                                    a.a(a.this, this.b, this.c, this.d);
                                }

                                @Override // com.sankuai.waimai.platform.utils.time.a
                                public final void a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acbae2dc2abf7d3d4251a24e67538794", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acbae2dc2abf7d3d4251a24e67538794");
                                        return;
                                    }
                                    a.this.d.setText("00:00");
                                    com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.bussiness.order.detailnew.event.a("00:00", com.sankuai.waimai.bussiness.order.detailnew.event.a.b));
                                    a.this.d.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.c.a.2.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e94c816269ec9b7941195f220c85073", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e94c816269ec9b7941195f220c85073");
                                                return;
                                            }
                                            com.sankuai.waimai.business.order.api.detail.block.a aVar = c.this.y;
                                            if (aVar != null) {
                                                aVar.b(false);
                                            }
                                        }
                                    });
                                }
                            };
                            this.f.b();
                        }
                    }
                }
            }
        }

        private long d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225bc87cecc4bc4634a574630ba9f90e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225bc87cecc4bc4634a574630ba9f90e")).longValue() : com.meituan.android.time.c.b();
        }

        void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a30cc9943889c95a7add02874882a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a30cc9943889c95a7add02874882a3");
            } else if (this.f != null) {
                this.f.cancel();
            }
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5551c075e72781f2c23364f18100e8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5551c075e72781f2c23364f18100e8c");
            return;
        }
        if (this.C != null) {
            a aVar = this.C;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8d5ec0e04d1ee135c4d36e804f181517", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8d5ec0e04d1ee135c4d36e804f181517");
            } else if (aVar.f != null) {
                aVar.f.cancel();
            }
        }
        if (this.u != null) {
            this.u.q();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b2ede87224dfd0204898054df698f8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b2ede87224dfd0204898054df698f8b");
            return;
        }
        d();
        this.e.moveCamera(CameraUpdateFactory.newLatLngZoom(this.B, 15.0f));
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e4a9a45173c21e8696905c8c6464dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e4a9a45173c21e8696905c8c6464dd");
        } else {
            this.e.setPointToCenter(com.sankuai.waimai.platform.b.A().l() / 2, (int) (com.sankuai.waimai.platform.b.A().m() * 0.37d));
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec807bf44eacbcf7e3dc28d0f0f5a3a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec807bf44eacbcf7e3dc28d0f0f5a3a1");
            return;
        }
        if (!this.i.c() && this.u != null) {
            ((com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.f) this.u).x();
        }
        if (this.C != null) {
            a aVar = this.C;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cbec1b64a796cc17bb9e3de5b597cf17", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cbec1b64a796cc17bb9e3de5b597cf17");
            } else {
                aVar.b.remove();
            }
        }
        if (this.b == null && this.e != null) {
            this.e.clear();
        }
        super.a();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6edbb87a7296ad7bdd51cb05cf8af51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6edbb87a7296ad7bdd51cb05cf8af51");
            return;
        }
        if (this.u != null) {
            this.u.b();
        }
        e();
        m();
        if (this.D != null) {
            this.D.b();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "498bc09f32b35f303d56e2c317758cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "498bc09f32b35f303d56e2c317758cc4");
        } else if (this.D != null) {
            this.D.b();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d93ebcf0c73cf2a28e64458783195ceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d93ebcf0c73cf2a28e64458783195ceb");
        } else if (this.D != null) {
            this.D.a();
        }
    }

    public static boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4775bfe166af401777406553aa8daa5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4775bfe166af401777406553aa8daa5a")).booleanValue();
        }
        if (str.contains("<highlight>") && str.contains("</highlight>")) {
            int indexOf = str.indexOf("<highlight>");
            int indexOf2 = str.indexOf("</highlight>");
            return indexOf != -1 && indexOf2 != -1 && indexOf <= indexOf2 && aa.a(str.substring(indexOf + "<highlight>".length(), indexOf2));
        }
        return false;
    }

    public static Spanned a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15ee934569b0bded2b4626719d64113b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15ee934569b0bded2b4626719d64113b");
        }
        String replace = str.replace("<highlight>", "<font color=" + str2 + ">").replace("</highlight>", "</font>");
        Object[] objArr2 = {replace};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ea15a8c900e782a4db2b4cdb92489dda", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ea15a8c900e782a4db2b4cdb92489dda");
        }
        if (Build.VERSION.SDK_INT < 24) {
            return Html.fromHtml(replace);
        }
        return Html.fromHtml(replace, 0);
    }
}
