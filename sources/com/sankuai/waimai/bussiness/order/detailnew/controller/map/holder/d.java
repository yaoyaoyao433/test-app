package com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends a {
    public static ChangeQuickRedirect v;
    private LinearLayout A;
    private String B;
    private e.a C;
    private TextView w;
    private TextView x;
    private ImageView y;
    private FrameLayout z;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int c() {
        return 0;
    }

    public d(Context context, MTMap mTMap, LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, com.sankuai.waimai.business.order.api.detail.block.a aVar, e.a aVar2) {
        super(context, mTMap, latLng, str, bVar, aVar);
        Object[] objArr = {context, mTMap, latLng, str, bVar, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1c2e4a45ff14a11a7f8ed48904fb7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1c2e4a45ff14a11a7f8ed48904fb7f");
        } else {
            this.C = aVar2;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a(LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar) {
        Object[] objArr = {latLng, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d73cbabd95f400f0c6725f7f6c20c77c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d73cbabd95f400f0c6725f7f6c20c77c");
            return;
        }
        super.a(latLng, str, bVar);
        if (bVar.c != null) {
            this.B = bVar.c.j;
        }
        this.s.anchor(0.5f, 0.5f);
        if (this.k != null && !TextUtils.isEmpty(this.k.b) && this.w != null) {
            this.w.setText(this.k.b);
        }
        x();
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21694bbe3090e94a1a7f987667a6dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21694bbe3090e94a1a7f987667a6dad");
        } else if (this.k != null && this.k.d != null && !TextUtils.isEmpty(this.k.d.b)) {
            if (this.x != null) {
                this.x.setVisibility(0);
                this.x.setText(this.k.d.b);
            }
        } else if (this.x != null) {
            this.x.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e84691b54f1a194482ed9f4d7b3d762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e84691b54f1a194482ed9f4d7b3d762");
        } else {
            a(R.layout.wm_order_status_layout_map_rider_withoutlog_infowindow);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0665c25117a559c12c6690be0a49104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0665c25117a559c12c6690be0a49104");
            return;
        }
        this.s.anchor(0.5f, 0.5f);
        int a = r() ? g.a(this.b, -50.0f) : 0;
        if (this.h != null && this.h.g == 15) {
            this.s.setInfoWindowOffset(a, g.a(this.b, 93.0f));
        } else {
            this.s.setInfoWindowOffset(a, g.a(this.b, 30.0f));
        }
        if (this.o != null) {
            this.o.remove();
        }
        this.o = this.c.addMarker(this.s);
        Bitmap createBitmap = Bitmap.createBitmap(this.t, this.u, Bitmap.Config.ALPHA_8);
        this.o.setIcon(BitmapDescriptorFactory.fromBitmap(createBitmap));
        this.t = createBitmap.getWidth();
        this.u = createBitmap.getHeight();
        this.q = LayoutInflater.from(this.b).inflate(i, (ViewGroup) null);
        this.w = (TextView) this.q.findViewById(R.id.status_desc);
        this.x = (TextView) this.q.findViewById(R.id.time__detail_desc);
        this.z = (FrameLayout) this.q.findViewById(R.id.status_container);
        this.A = (LinearLayout) this.q.findViewById(R.id.status_inner);
        this.y = (ImageView) this.q.findViewById(R.id.status_drone_img);
        y();
        if (this.k != null && !TextUtils.isEmpty(this.k.b)) {
            this.w.setText(this.k.b);
        }
        x();
        if (this.i.o == 1) {
            this.y.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = this.B;
            a2.f = ImageQualityUtil.a(0);
            a2.a(this.y);
        } else {
            this.y.setVisibility(8);
        }
        ImageView imageView = (ImageView) this.q.findViewById(R.id.img_map_box_status_left);
        if (r()) {
            a(imageView, this.d.b.left_icon_url, this.C.a());
        } else {
            imageView.setVisibility(8);
        }
        if (this.o != null) {
            this.o.setInfoWindowEnable(true);
            this.o.showInfoWindow();
        }
        if (this.k.e == 1) {
            if (this.i != null && this.i.o == 1) {
                this.z.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.d.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55a817228e55e1abcb11a10660d08555", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55a817228e55e1abcb11a10660d08555");
                            return;
                        }
                        d.this.a(d.this.e, d.this.f, d.this.g);
                        JudasManualManager.a("b_waimai_xzfwgkj1_mc").a("c_hgowsqb").a("order_id", d.this.e).a("order_status", d.this.f).a("status_code", d.this.g).a(d.this.b).a();
                    }
                });
            } else {
                this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.d.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd533ab934721b5d177958aabd691443", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd533ab934721b5d177958aabd691443");
                            return;
                        }
                        d.this.a(d.this.e, d.this.f, d.this.g);
                        JudasManualManager.a("b_waimai_xzfwgkj1_mc").a("c_hgowsqb").a("order_id", d.this.e).a("order_status", d.this.f).a("status_code", d.this.g).a(d.this.b).a();
                    }
                });
            }
        }
    }

    private void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0583b0f45dc4b63b97b304b26423871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0583b0f45dc4b63b97b304b26423871");
        } else if (this.h != null && this.h.g == 15) {
            this.z.setBackgroundResource(R.drawable.wm_order_status_map_infowindow_up);
        } else {
            this.z.setBackgroundResource(R.drawable.wm_order_status_map_infowindow);
        }
    }
}
