package com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.controller.map.e;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    public static ChangeQuickRedirect v;
    private String A;
    private RiderInfo.RiderConditionTipsCarouseData B;
    private ViewTreeObserver.OnGlobalLayoutListener C;
    private boolean D;
    private double E;
    private int F;
    private int G;
    private View H;
    protected ImageView w;
    ImageView x;
    Bitmap y;
    e.a z;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int c() {
        return R.drawable.wm_order_status_map_marker_rider_default_new;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void i() {
    }

    public c(Context context, MTMap mTMap, LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, com.sankuai.waimai.business.order.api.detail.block.a aVar, e.a aVar2) {
        super(context, mTMap, latLng, str, bVar, aVar);
        Object[] objArr = {context, mTMap, latLng, str, bVar, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2fdd66a356120188d2e9171214f0ebe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2fdd66a356120188d2e9171214f0ebe");
            return;
        }
        this.z = aVar2;
        this.A = bVar.c.j;
        this.E = bVar.c.m;
        this.G = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_box_image_width);
        this.F = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_rider_car_width);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a(LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar) {
        Object[] objArr = {latLng, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2114ea03efc4419f6fa2ba1990a5e5ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2114ea03efc4419f6fa2ba1990a5e5ec");
            return;
        }
        super.a(latLng, str, bVar);
        if (this.i != null) {
            this.A = this.i.j;
            this.E = this.i.m;
            if (this.i.n != null) {
                this.B = this.i.n.riderOverheadDesc;
            }
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea6002f6f611ef2f046b51b34b87264a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea6002f6f611ef2f046b51b34b87264a");
            return;
        }
        this.t = g.a(this.b, 65.0f);
        this.u = g.a(this.b, 65.0f);
        this.s.setInfoWindowOffset(0, f());
        this.s.zIndex(2.14748365E9f);
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_order_status_layout_map_rider_infowindow, (ViewGroup) null);
        this.q = inflate;
        this.H = inflate.findViewById(R.id.infoWindowContainer);
        this.w = (ImageView) inflate.findViewById(R.id.img_map_box);
        this.x = (ImageView) inflate.findViewById(R.id.marker_rider_avator);
        if (this.k != null && !TextUtils.isEmpty(this.k.b)) {
            ah.a((TextView) this.q.findViewById(R.id.main_desc), this.k.b);
            a((LinearLayout) this.q.findViewById(R.id.safe_deliver_container), this.q.findViewById(R.id.safe_deliver_container_bg), this.i);
            n();
            o();
        }
        this.x.setVisibility(0);
        if (this.y != null) {
            this.x.setImageBitmap(this.y);
        }
        b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a.b = this.b;
        a.f = ImageQualityUtil.a(0);
        b.C0608b a2 = a.a(this.t, this.u);
        a2.j = R.drawable.wm_order_status_rider_car_icon;
        a2.c = this.A;
        a2.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b71364ac9e043ef596d9da7221e3527c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b71364ac9e043ef596d9da7221e3527c");
                } else if (bitmap == null) {
                    a();
                } else {
                    c.this.y = bitmap;
                    c.this.x.setImageBitmap(bitmap);
                }
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c8d58469f333b2d48cd183aa22b767e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c8d58469f333b2d48cd183aa22b767e");
                } else {
                    c.this.x.setImageResource(R.drawable.wm_order_status_rider_car_icon);
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams.width = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_rider_car_width);
        layoutParams.height = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_rider_car_height);
        layoutParams.topMargin = g.a(this.b, 8.0f) * (-1);
        this.x.setLayoutParams(layoutParams);
        this.s.icon(BitmapDescriptorFactory.fromBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444)));
        if (this.o != null) {
            this.o.remove();
        }
        this.o = this.c.addMarker(this.s);
        if (this.o != null) {
            this.o.setInfoWindowEnable(false);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "888e9db1ebfa9cc39bb9223473e5f786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "888e9db1ebfa9cc39bb9223473e5f786");
        } else if (r()) {
            if (this.E >= 0.0d && this.E < 180.0d) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
                layoutParams2.leftMargin = Math.max(((this.G + (this.F / 2)) - (b(this.H) / 2)) * 2, 0);
                this.H.setLayoutParams(layoutParams2);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.w.getLayoutParams();
                layoutParams3.addRule(9);
                layoutParams3.leftMargin = Math.max(b(this.H) / 2, this.G + (this.F / 2)) + (this.F / 2);
                this.w.setLayoutParams(layoutParams3);
            }
            final String str = this.d.b.icon;
            final String str2 = this.d.b.link;
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.b = this.b;
            a3.j = R.drawable.wm_order_status_rider_box_icon;
            a3.c = str;
            a3.a(this.w);
            this.w.setVisibility(0);
            this.C = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.c.2
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09007a707d1a7324b20c0069415926bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09007a707d1a7324b20c0069415926bf");
                    } else if (c.this.z == null) {
                    } else {
                        Rect rect = new Rect();
                        c.this.w.getGlobalVisibleRect(rect);
                        if (Rect.intersects(rect, c.this.z.a())) {
                            c.this.w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            c.this.a(c.this.h, str, true);
                        }
                    }
                }
            };
            this.w.getViewTreeObserver().addOnGlobalLayoutListener(this.C);
            this.w.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.c.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5ecdf767ce5514cce2a5654aa59b46e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5ecdf767ce5514cce2a5654aa59b46e");
                        return;
                    }
                    c.this.a(str);
                    com.sankuai.waimai.foundation.router.a.a(c.this.b, str2);
                }
            });
        } else {
            this.w.setVisibility(8);
        }
        h();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void h() {
        int i;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90bf5a107a1543330d63b76e3d423421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90bf5a107a1543330d63b76e3d423421");
            return;
        }
        if (u()) {
            super.h();
            a(this.q);
            if (this.o != null) {
                this.o.setInfoWindowEnable(true);
                this.o.showInfoWindow();
            }
        }
        if (this.D || this.q.getVisibility() != 0) {
            return;
        }
        if (this.h != null) {
            i2 = this.h.e;
            i = this.h.x;
        } else {
            i = 0;
        }
        JudasManualManager.b("b_waimai_8ut4vsp1_mv").a("c_hgowsqb").a("order_id", this.e).a("order_status", i2).a("status_code", i).a(this.b).a();
        this.D = true;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d930cde90855ff7babee19fed04461f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d930cde90855ff7babee19fed04461f9")).intValue();
        }
        if (r()) {
            return g.a(this.b, 51.0f);
        }
        return g.a(this.b, 21.0f);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2097ab177fe7b58fdbb9418a9e5e7fa5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2097ab177fe7b58fdbb9418a9e5e7fa5")).intValue();
        }
        if (u()) {
            return super.n();
        }
        return 0;
    }

    private int b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f414772b2fb1ba744b9e3d0f84c1f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f414772b2fb1ba744b9e3d0f84c1f4")).intValue();
        }
        if (view.getWidth() == 0) {
            view.measure(0, 0);
            return view.getMeasuredWidth();
        }
        return view.getWidth();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888d7758b02b46e25dc0c343a56c840c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888d7758b02b46e25dc0c343a56c840c")).intValue();
        }
        if (u()) {
            return super.o();
        }
        return 0;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "292d3b78ca6dd4c40dca6ad5e71c0b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "292d3b78ca6dd4c40dca6ad5e71c0b03");
            return;
        }
        super.q();
        if (this.w == null || this.C == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.w.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.C);
        }
    }
}
