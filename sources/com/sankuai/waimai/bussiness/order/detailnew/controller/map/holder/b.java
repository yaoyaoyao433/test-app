package com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.sankuai.waimai.bussiness.order.detailnew.controller.map.e;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a {
    public static ChangeQuickRedirect v;
    private List<Integer> A;
    private e.a B;
    private int C;
    private int w;
    private String x;
    private String y;
    private boolean z;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int c() {
        return R.drawable.wm_order_status_map_marker_poi_default;
    }

    public b(Context context, MTMap mTMap, LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, com.sankuai.waimai.business.order.api.detail.block.a aVar, e.a aVar2) {
        super(context, mTMap, latLng, str, bVar, aVar);
        Object[] objArr = {context, mTMap, latLng, str, bVar, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12bfe89c82a67d14435e0ef97b460168", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12bfe89c82a67d14435e0ef97b460168");
            return;
        }
        this.B = aVar2;
        this.w = g.a(this.b, 71.0f);
        this.C = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_box_image_width);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a(LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar) {
        Object[] objArr = {latLng, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "198752cb38878ed024e8df42a82da87b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "198752cb38878ed024e8df42a82da87b");
            return;
        }
        super.a(latLng, str, bVar);
        if (this.i != null) {
            this.x = this.i.d;
            this.y = this.i.j;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38afae6db739001359a6fa546e7b73a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38afae6db739001359a6fa546e7b73a")).intValue();
        }
        if (this.k.a != 0 || this.k.e == 1) {
            return 0;
        }
        if (this.h == null || this.h.g != 15) {
            if ((this.i == null || this.i.o != 1 || this.h == null || this.h.g != 10) && r() && t()) {
                return g.a(this.b, -50.0f);
            }
            return 0;
        }
        return 0;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "768f0c7eb841eb2036ef28d00b8e4046", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "768f0c7eb841eb2036ef28d00b8e4046")).intValue();
        }
        if (this.j != null && !TextUtils.isEmpty(this.j.j)) {
            return this.w - g.a(this.b, 5.0f);
        }
        if (this.j != null && (this.j.i == 1 || this.j.i == 2 || this.j.i == 3)) {
            return g.a(this.b, 15.0f);
        }
        return super.f();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3abe0063a4407be3e4d60ffb64b0c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3abe0063a4407be3e4d60ffb64b0c5a");
        } else if (this.k.a == 0 && this.k.e != 1) {
            a(R.layout.wm_order_status_layout_map_poi_infowindow);
        } else if (this.k.e != 1 && this.h != null && this.h.g == 10 && !TextUtils.isEmpty(this.k.g)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = v;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12ed761845b2b9bceea0fdc7b98e1246", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12ed761845b2b9bceea0fdc7b98e1246");
                return;
            }
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_order_status_layout_map_marker_poi_progress, (ViewGroup) null);
            this.q = inflate;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_simple_info_window_container);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.img_map_avator);
            ((TextView) inflate.findViewById(R.id.txt_poi_bubble_sub_desc)).setText(com.sankuai.waimai.bussiness.order.detailnew.util.e.a(this.k.g, "#FF8000"));
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.img_poi_pot);
            View findViewById = inflate.findViewById(R.id.view_oval_point);
            if (this.j != null && !TextUtils.isEmpty(this.j.j)) {
                findViewById.setVisibility(8);
                linearLayout.setBackgroundResource(R.drawable.wm_order_status_map_infowindow);
            } else {
                findViewById.setVisibility(0);
            }
            if (inflate.getWidth() == 0 || inflate.getHeight() == 0) {
                inflate.measure(0, 0);
                this.t = inflate.getMeasuredWidth();
                this.u = inflate.getMeasuredHeight();
            }
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.b = this.b;
            a.c = this.n;
            a.f = ImageQualityUtil.a(0);
            a.j = R.drawable.wm_order_status_map_marker_poi_default;
            a.a(imageView);
            a(imageView2);
            if (this.o != null) {
                this.o.remove();
            }
            this.s.icon(BitmapDescriptorFactory.fromBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444)));
            int a2 = g.a(this.b, 10.0f);
            if (this.j != null && !TextUtils.isEmpty(this.j.j)) {
                a2 = this.w;
            }
            this.s.setInfoWindowOffset(0, a2);
            this.o = this.c.addMarker(this.s);
            if (this.o != null) {
                this.o.setInfoWindowEnable(true);
                this.o.showInfoWindow();
            }
        } else {
            a(R.layout.wm_order_status_layout_map_marker_poi, false);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ba654afd63933b9955d6dfd2c85e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ba654afd63933b9955d6dfd2c85e5a");
            return;
        }
        this.o.setIcon(BitmapDescriptorFactory.fromBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void h() {
        int i;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d70a5e03d403f33798fd05bcad17db67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d70a5e03d403f33798fd05bcad17db67");
            return;
        }
        super.h();
        boolean z = this.i != null && this.i.o == 1;
        ViewGroup viewGroup = (ViewGroup) this.q.findViewById(R.id.infoWindowContainerWrapper);
        if (z && this.h != null && (this.h.g == 10 || this.h.g == 15)) {
            viewGroup.setPadding(0, 0, g.a(this.b, 90.0f), 0);
        }
        TextView textView = (TextView) this.q.findViewById(R.id.sub_time_desc_suffix);
        if (this.k.d != null) {
            ah.a(textView, this.k.d.e);
        } else {
            textView.setVisibility(8);
        }
        if (this.z || this.q.getVisibility() != 0) {
            return;
        }
        if (this.h != null) {
            i2 = this.h.e;
            i = this.h.x;
        } else {
            i = 0;
        }
        JudasManualManager.b("b_waimai_8ut4vsp1_mv").a("c_hgowsqb").a("order_id", this.e).a("order_status", i2).a("status_code", i).a(this.b).a();
        this.z = true;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void i() {
        int width;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e0624fda02ce432b24be6e22d50aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e0624fda02ce432b24be6e22d50aa7");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.q.findViewById(R.id.rider_arrive_layout);
        ImageView imageView = (ImageView) this.q.findViewById(R.id.img_map_box_poi_left);
        ImageView imageView2 = (ImageView) this.q.findViewById(R.id.img_poi_pot);
        View findViewById = this.q.findViewById(R.id.infoWindowContainerWrapper);
        a(imageView2);
        a((LinearLayout) this.q.findViewById(R.id.safe_deliver_container), this.q.findViewById(R.id.safe_deliver_container_bg), this.i);
        View findViewById2 = this.q.findViewById(R.id.view_oval_point);
        if (this.j != null) {
            com.sankuai.waimai.business.order.api.detail.model.b bVar = this.j;
            if (bVar.i == 1 || bVar.i == 2 || bVar.i == 3) {
                findViewById2.setVisibility(0);
                findViewById2.setBackgroundResource(R.drawable.wm_order_detail_map_circle_marker);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
                marginLayoutParams.width = g.a(this.b, 12.0f);
                marginLayoutParams.height = g.a(this.b, 12.0f);
                marginLayoutParams.bottomMargin = g.a(this.b, 3.0f);
                findViewById2.setLayoutParams(marginLayoutParams);
                boolean z = this.i == null && this.i.o == 1;
                boolean z2 = (z || this.h == null || this.h.g != 10) ? false : true;
                if (this.h == null && (this.h.g == 15 || z2)) {
                    imageView.setVisibility(8);
                    relativeLayout.setVisibility(0);
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                    layoutParams.addRule(3, R.id.rider_arrive_layout);
                    imageView2.setLayoutParams(layoutParams);
                    ImageView imageView3 = (ImageView) this.q.findViewById(R.id.rider_arrive_poi_img);
                    ImageView imageView4 = (ImageView) this.q.findViewById(R.id.img_map_box);
                    ((ImageView) this.q.findViewById(R.id.img_map_avator)).setVisibility(8);
                    findViewById2.setVisibility(8);
                    b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a.b = this.b;
                    a.c = this.n;
                    a.f = ImageQualityUtil.a(0);
                    a.j = R.drawable.wm_order_status_map_marker_poi_default;
                    a.a((ImageView) this.q.findViewById(R.id.img_poi_avatar));
                    if (z) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView3.getLayoutParams();
                        layoutParams2.width = g.a(this.b, 45.0f);
                        layoutParams2.height = g.a(this.b, 30.0f);
                        layoutParams2.setMargins(0, g.a(this.b, 5.0f), g.a(this.b, 90.0f), 0);
                        imageView3.setLayoutParams(layoutParams2);
                    } else {
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageView3.getLayoutParams();
                        int dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_rider_car_width);
                        layoutParams3.width = dimensionPixelOffset;
                        layoutParams3.height = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_order_detail_rider_car_height);
                        int a2 = g.a(this.b, 60.0f);
                        layoutParams3.setMargins(0, g.a(this.b, 5.0f) * (-1), a2, 0);
                        imageView3.setLayoutParams(layoutParams3);
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
                        int i = this.C + (dimensionPixelOffset / 2);
                        Object[] objArr2 = {findViewById};
                        ChangeQuickRedirect changeQuickRedirect2 = v;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e121dd5233325ae2821c92a4dce6a2d", RobustBitConfig.DEFAULT_VALUE)) {
                            width = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e121dd5233325ae2821c92a4dce6a2d")).intValue();
                        } else if (findViewById.getWidth() == 0) {
                            findViewById.measure(0, 0);
                            width = findViewById.getMeasuredWidth();
                        } else {
                            width = findViewById.getWidth();
                        }
                        layoutParams4.setMargins(Math.max(((i - (width / 2)) * 2) + a2, 0), g.a(this.b, 5.0f) * (-1), 0, 0);
                        findViewById.setLayoutParams(layoutParams4);
                    }
                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a3.b = this.b;
                    a3.c = this.y;
                    a3.f = ImageQualityUtil.a(0);
                    a3.a(imageView3);
                    if (r()) {
                        a(imageView4, this.d.b.left_icon_url, this.B.a());
                        return;
                    } else {
                        imageView4.setVisibility(8);
                        return;
                    }
                }
                relativeLayout.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                layoutParams5.addRule(3, R.id.infoWindowContainerWrapper);
                imageView2.setLayoutParams(layoutParams5);
                if (!r() && t()) {
                    a(imageView, this.d.b.left_icon_url, this.B.a());
                } else {
                    imageView.setVisibility(8);
                }
                super.i();
            }
        }
        if (this.j != null && !TextUtils.isEmpty(this.j.j)) {
            findViewById2.setVisibility(8);
        } else {
            findViewById2.setBackgroundResource(R.drawable.wm_order_detail_oval_bg);
            findViewById2.setVisibility(0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
            marginLayoutParams2.width = g.a(this.b, 14.0f);
            marginLayoutParams2.height = g.a(this.b, 5.0f);
            marginLayoutParams2.bottomMargin = g.a(this.b, 7.0f);
            findViewById2.setLayoutParams(marginLayoutParams2);
        }
        if (this.i == null) {
        }
        if (z) {
        }
        if (this.h == null) {
        }
        relativeLayout.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams52 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        layoutParams52.addRule(3, R.id.infoWindowContainerWrapper);
        imageView2.setLayoutParams(layoutParams52);
        if (!r()) {
        }
        imageView.setVisibility(8);
        super.i();
    }

    private void a(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "055d65c91bd2a758fec82ba863e11c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "055d65c91bd2a758fec82ba863e11c5c");
        } else if (this.j == null || TextUtils.isEmpty(this.j.j)) {
            imageView.setVisibility(8);
        } else {
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.b = this.b;
            a.f = ImageQualityUtil.a(0);
            b.C0608b a2 = a.a(this.w, this.w);
            a2.j = R.drawable.wm_order_status_rider_box_left_icon;
            a2.c = this.j.j;
            a2.a(imageView);
            imageView.setVisibility(0);
            x();
        }
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7124a9afb79659085a9d6024dfa02aac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7124a9afb79659085a9d6024dfa02aac");
            return;
        }
        if (this.A == null) {
            this.A = new ArrayList();
        }
        int i = this.h != null ? this.h.F : 0;
        if (this.A.contains(Integer.valueOf(i))) {
            return;
        }
        b("b_waimai_mbl88lcs_mv").a(this.b).a();
        this.A.add(Integer.valueOf(i));
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf3358f8daaf778d8f79a1c44c882dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf3358f8daaf778d8f79a1c44c882dc");
        } else {
            super.q();
        }
    }
}
