package com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends a {
    public static ChangeQuickRedirect v;
    private com.sankuai.waimai.platform.widget.weather.e w;
    private View x;
    private List<Integer> y;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int c() {
        return R.drawable.wm_order_status_map_marker_rider_default_new;
    }

    public f(Context context, MTMap mTMap, LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar) {
        super(context, mTMap, latLng, str, bVar, null);
        Object[] objArr = {context, mTMap, latLng, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472db3917c16804a4d79958bf8290d6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472db3917c16804a4d79958bf8290d6b");
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a(LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar) {
        Object[] objArr = {latLng, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff99f1b63b50418078b68767c3c200c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff99f1b63b50418078b68767c3c200c3");
            return;
        }
        super.a(latLng, str, bVar);
        this.s = new MarkerOptions().anchor(1.0f, 1.0f).position(latLng).title("").draggable(false);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aadd535014121c59cc89b292d282bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aadd535014121c59cc89b292d282bea");
        } else if (this.h.c() && this.x != null && this.w != null) {
            this.w.a();
            this.w.a(this.h.d);
            this.w.e();
            z();
        } else {
            this.q = LayoutInflater.from(this.b).inflate(R.layout.wm_widget_weather, (ViewGroup) null);
            this.x = this.q.findViewById(R.id.weather_layout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.x.getLayoutParams();
            layoutParams.height = y();
            layoutParams.width = com.sankuai.waimai.platform.b.A().l();
            this.x.setLayoutParams(layoutParams);
            this.s.zIndex(0.0f);
            this.s.icon(BitmapDescriptorFactory.fromBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444)));
            if (this.o != null) {
                this.o.remove();
                if (this.w != null) {
                    this.w.d();
                    this.w = null;
                }
            }
            this.o = this.c.addMarker(this.s);
            int i = this.h.d;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = v;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4be0173aaedb8326c87625b4f6fb4293", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4be0173aaedb8326c87625b4f6fb4293");
            } else if (this.h.c()) {
                this.x.setVisibility(0);
                if (this.w == null) {
                    this.w = new com.sankuai.waimai.platform.widget.weather.e(this.x, this.b);
                }
                this.w.a(i);
                this.w.e();
                z();
            } else {
                this.x.setVisibility(8);
                if (this.w != null) {
                    this.w.f();
                }
                this.w = null;
            }
            if (this.o != null) {
                this.o.setInfoWindowEnable(true);
                this.o.showInfoWindow();
                this.o.setPositionByPixels(com.sankuai.waimai.platform.b.A().l() / 2, y());
            }
        }
    }

    private int y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097c6db78a047d09589a0f42b50cce90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097c6db78a047d09589a0f42b50cce90")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return com.sankuai.waimai.platform.b.A().m() + g.e(this.b);
        }
        return com.sankuai.waimai.platform.b.A().m();
    }

    private void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14561623f3b22183e1b4dd6cbd30053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14561623f3b22183e1b4dd6cbd30053");
            return;
        }
        if (this.y == null) {
            this.y = new ArrayList();
        }
        if (this.y.contains(Integer.valueOf(this.h.d))) {
            return;
        }
        c("b_waimai_gofwfvpy_mv").a(this.b).a();
        this.y.add(Integer.valueOf(this.h.d));
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6267748a20a4472eba9e1be7c3e0aa63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6267748a20a4472eba9e1be7c3e0aa63");
        } else if (this.w != null) {
            this.w.c();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1985725dbb7578d9b4a8d7c9c2b515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1985725dbb7578d9b4a8d7c9c2b515");
        } else if (this.w != null) {
            this.w.b();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e3f3422c2af9f50f575cee417078621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e3f3422c2af9f50f575cee417078621");
            return;
        }
        super.b();
        if (this.w != null) {
            this.w.d();
            this.w = null;
        }
    }

    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "756386e7023cd2ba72025e3e47569c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "756386e7023cd2ba72025e3e47569c3f");
            return;
        }
        if (this.o != null) {
            this.o.remove();
        }
        if (this.x != null) {
            this.x = null;
        }
        if (this.w != null) {
            this.w.d();
            this.w = null;
        }
    }
}
