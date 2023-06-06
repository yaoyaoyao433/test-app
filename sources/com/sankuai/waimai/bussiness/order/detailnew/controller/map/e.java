package com.sankuai.waimai.bussiness.order.detailnew.controller.map;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.LotteryInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class e extends d {
    public static ChangeQuickRedirect p;
    protected final a A;
    private LatLng a;
    protected com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a q;
    protected com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a r;
    protected com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a s;
    protected com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a t;
    protected com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a u;
    protected com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a v;
    protected com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a w;
    protected com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.a x;
    public com.sankuai.waimai.business.order.api.detail.block.a y;
    @Nullable
    protected final a z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        Rect a();
    }

    public e(Context context, ViewGroup viewGroup, MTMap mTMap, String str, a aVar, @Nullable a aVar2) {
        super(context, viewGroup, mTMap);
        Object[] objArr = {context, viewGroup, mTMap, str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff89a4d5e29706eafb4bc5271c1f4f66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff89a4d5e29706eafb4bc5271c1f4f66");
            return;
        }
        this.x = new com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.a(context, str);
        this.A = aVar;
        this.z = aVar2;
    }

    private void a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd2fc236c171a401d19ed139f79149e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd2fc236c171a401d19ed139f79149e");
            return;
        }
        RiderInfo riderInfo = this.g.c;
        if (riderInfo == null) {
            return;
        }
        int i = (int) this.l.m;
        int i2 = (i <= 180 || i >= 360) ? i + TXLiveConstants.RENDER_ROTATION_180 : i - TXLiveConstants.RENDER_ROTATION_180;
        double[] a2 = com.sankuai.waimai.bussiness.order.detailnew.util.f.a(latLng.latitude, latLng.longitude, i2, com.sankuai.waimai.bussiness.order.detailnew.util.f.a(i2, 13));
        riderInfo.f = (long) (a2[0] * 1000000.0d);
        riderInfo.g = (long) (a2[1] * 1000000.0d);
        this.a = riderInfo.a();
    }

    public final void i() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deed013d793ce81add59aaa2512e8ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deed013d793ce81add59aaa2512e8ab6");
            return;
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d979b99e53ce9c789214fc4a6dbba38f", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d979b99e53ce9c789214fc4a6dbba38f")).booleanValue();
        } else if (bVar.l != null) {
            z = bVar.l.c();
        }
        if (z) {
            LatLng fromScreenLocation = this.e.getProjection().fromScreenLocation(new Point(com.sankuai.waimai.platform.b.A().l() / 2, (int) (l() * 0.65d)));
            if (this.u == null) {
                this.u = new com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.f(this.f, this.e, fromScreenLocation, "", this.g);
            } else {
                this.u.a(fromScreenLocation, "", this.g);
            }
            this.u.a();
            return;
        }
        if (this.u != null) {
            this.u.b();
        }
        this.u = null;
    }

    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a31299ee66c485489ca72c5bba9e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a31299ee66c485489ca72c5bba9e70");
            return;
        }
        i();
        com.sankuai.waimai.business.order.api.detail.model.b bVar = this.k;
        if (bVar != null && bVar.a() != null) {
            if (this.j.a() && this.q == null) {
                a(bVar.a());
            }
            if (this.q == null) {
                this.q = new com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.b(this.f, this.e, bVar.a(), bVar.d, this.g, this.y, this.A);
            } else {
                this.q.a(bVar.a(), bVar.d, this.g);
            }
            this.q.a();
            if (this.i != null && this.i.g == 15) {
                a(this.i, this.q.s());
            } else if (this.q.t()) {
                com.sankuai.waimai.business.order.api.detail.model.a aVar = this.i;
                String s = this.q.s();
                Object[] objArr2 = {aVar, s};
                ChangeQuickRedirect changeQuickRedirect2 = p;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45f1bd32660fb05682244646511ae8d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45f1bd32660fb05682244646511ae8d7");
                } else {
                    a(aVar, s);
                }
            }
        } else {
            if (this.q != null) {
                this.q.b();
            }
            this.q = null;
        }
        r rVar = this.g.d;
        if (rVar != null && rVar.a() != null) {
            if (this.j.a() && this.r == null) {
                a(rVar.a());
            }
            if (this.r == null) {
                this.r = new com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.e(this.f, this.e, rVar.a(), rVar.b, this.g, this.y);
            } else {
                this.r.a(rVar.a(), rVar.b, this.g);
            }
            this.r.a();
        } else {
            if (this.r != null) {
                this.r.b();
            }
            this.r = null;
        }
        RiderInfo riderInfo = this.g.c;
        if (riderInfo != null && riderInfo.a() != null) {
            if (this.s == null) {
                this.s = new com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.c(this.f, this.e, riderInfo.a(), riderInfo.d, this.g, this.y, this.A);
            } else {
                this.s.a(this.a != null ? this.a : riderInfo.a(), riderInfo.d, this.g);
            }
            this.s.a();
            a(this.i, this.s.s());
            return;
        }
        if (this.s != null) {
            this.s.b();
        }
        this.s = null;
    }

    private void a(com.sankuai.waimai.business.order.api.detail.model.a aVar, String str, boolean z) {
        boolean z2;
        int i;
        int i2 = 0;
        Object[] objArr = {aVar, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e71282872fc007ab6ec78aa57944ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e71282872fc007ab6ec78aa57944ca");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = p;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05bceca39e931fc4a66f202e47d3ca08", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05bceca39e931fc4a66f202e47d3ca08")).booleanValue();
        } else {
            LotteryInfo lotteryInfo = this.g.b;
            z2 = (lotteryInfo == null || TextUtils.isEmpty(lotteryInfo.link)) ? false : true;
        }
        if (z2) {
            if (aVar != null) {
                i2 = aVar.e;
                i = aVar.v;
            } else {
                i = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("extra", this.g.b.report);
            JudasManualManager.b("b_waimai_akyk6r0n_mv").a("c_hgowsqb").a("loadType", this.g.k ? 2 : 1).a("order_status", i2).a("logo_icon", str).a("delivery_type", i).b(hashMap).a(this.f).a();
        }
    }

    public final void a(com.sankuai.waimai.business.order.api.detail.model.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467096c9248e17cccec7915ee4ae691e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467096c9248e17cccec7915ee4ae691e");
        } else {
            a(aVar, str, false);
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df86592ee5154a7a20e68247f82f28a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df86592ee5154a7a20e68247f82f28a");
        } else {
            this.e.setPointToCenter(com.sankuai.waimai.platform.b.A().l() / 2, com.sankuai.waimai.platform.b.A().m() / 3);
        }
    }

    public void c() {
        double d;
        double d2;
        LatLng latLng;
        com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a aVar;
        com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a aVar2;
        com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a aVar3;
        int i;
        com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a aVar4;
        int i2;
        LatLng latLng2;
        int i3;
        int i4;
        int i5;
        com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a aVar5;
        com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a aVar6;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5bd7a9ea375b84d5a6d5005d654b6e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5bd7a9ea375b84d5a6d5005d654b6e9");
            return;
        }
        int a2 = com.sankuai.waimai.foundation.utils.g.a(this.f, 120.0f);
        int a3 = com.sankuai.waimai.foundation.utils.g.a(this.f, 80.0f);
        int a4 = com.sankuai.waimai.foundation.utils.g.a(this.f, 80.0f);
        int m = ((int) (com.sankuai.waimai.platform.b.A().m() * 0.4d)) + com.sankuai.waimai.foundation.utils.g.a(this.f, 65.0f);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        LatLng latLng3 = new LatLng(0.0d, 0.0d);
        double d3 = -180.0d;
        double d4 = -90.0d;
        if (this.q != null) {
            builder.include(this.q.p());
            LatLng p2 = this.q.p();
            if (Double.compare(p2.latitude, -90.0d) > 0) {
                double d5 = p2.latitude;
                aVar5 = this.q;
                d4 = d5;
            } else {
                aVar5 = null;
            }
            if (Double.compare(p2.longitude, -180.0d) > 0) {
                double d6 = p2.longitude;
                aVar6 = this.q;
                d3 = d6;
            } else {
                aVar6 = null;
            }
            aVar3 = aVar6;
            double d7 = d3;
            d2 = 180.0d;
            if (Double.compare(p2.longitude, 180.0d) < 0) {
                double d8 = p2.longitude;
                latLng = p2;
                aVar2 = aVar5;
                aVar = this.q;
                d2 = d8;
            } else {
                latLng = p2;
                aVar2 = aVar5;
                aVar = null;
            }
            d = d7;
            i = 1;
        } else {
            d = -180.0d;
            d2 = 180.0d;
            latLng = latLng3;
            aVar = null;
            aVar2 = null;
            aVar3 = null;
            i = 0;
        }
        if (this.s != null) {
            builder.include(this.s.p());
            latLng2 = this.s.p();
            i2 = i + 1;
            aVar4 = aVar;
            if (Double.compare(latLng2.latitude, d4) > 0) {
                double d9 = latLng2.latitude;
                aVar2 = this.s;
                d4 = d9;
            }
            if (Double.compare(latLng2.longitude, d) > 0) {
                double d10 = latLng2.longitude;
                aVar3 = this.s;
                d = d10;
            }
            if (Double.compare(latLng2.longitude, d2) < 0) {
                d2 = latLng2.longitude;
                aVar4 = this.s;
            }
        } else {
            aVar4 = aVar;
            i2 = i;
            latLng2 = latLng;
        }
        if (this.r != null) {
            builder.include(this.r.p());
            latLng2 = this.r.p();
            i2++;
            if (Double.compare(latLng2.latitude, d4) > 0) {
                double d11 = latLng2.latitude;
                aVar2 = this.r;
                d4 = d11;
            }
            if (Double.compare(latLng2.longitude, d) > 0) {
                double d12 = latLng2.longitude;
                aVar3 = this.r;
                d = d12;
            }
            if (Double.compare(latLng2.longitude, d2) < 0) {
                d2 = latLng2.longitude;
                aVar4 = this.r;
            }
        }
        int i6 = i2;
        if (this.v != null) {
            builder.include(this.v.p());
            latLng2 = this.v.p();
            i3 = i6;
            if (Double.compare(latLng2.latitude, d4) > 0) {
                aVar2 = this.v;
            }
            if (Double.compare(latLng2.longitude, d) > 0) {
                aVar3 = this.v;
            }
            if (Double.compare(latLng2.longitude, d2) < 0) {
                aVar4 = this.v;
            }
        } else {
            i3 = i6;
        }
        if (this.w != null) {
            builder.include(this.w.p());
            latLng2 = this.w.p();
            if (Double.compare(latLng2.latitude, d4) > 0) {
                aVar2 = this.w;
            }
            if (Double.compare(latLng2.longitude, d) > 0) {
                aVar3 = this.w;
            }
            if (Double.compare(latLng2.longitude, d2) < 0) {
                aVar4 = this.w;
            }
        }
        Rect a5 = this.z != null ? this.z.a() : null;
        if (a5 != null) {
            if (aVar4 != null) {
                a3 = Math.max(a3, a5.left + (Math.max(aVar4.n(), aVar4.l()) / 2)) - 0;
            }
            if (aVar3 != null) {
                i4 = 0;
                a4 = Math.max(a4, (com.sankuai.waimai.platform.b.A().l() - a5.right) + (Math.max(aVar3.n(), aVar3.l()) / 2)) + 0;
            } else {
                i4 = 0;
            }
            m = Math.max(m, l() - a5.bottom) + i4;
            if (aVar2 != null) {
                int o = aVar2.o();
                int m2 = aVar2.m();
                if (o > 0) {
                    i5 = a5.top + o;
                } else {
                    i5 = a5.top + m2;
                }
                a2 = Math.max(a2, i5) - 0;
            }
        }
        builder.include(new LatLng(latLng2.latitude + 1.0E-5d, latLng2.longitude + 1.0E-5d));
        if (i3 == 1) {
            d();
            this.e.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng2, 15.0f));
            return;
        }
        this.e.setMaxZoomLevel(20.0f);
        this.e.animateCamera(CameraUpdateFactory.newLatLngBoundsRect(builder.build(), a3, a4, a2, m), 200L, new MTMap.CancelableCallback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.e.1
            @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
            public final void onCancel() {
            }

            @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
            public final void onFinish() {
            }
        });
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e8253dbc8027fb8961e6eef707df931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e8253dbc8027fb8961e6eef707df931");
            return;
        }
        if (this.u != null) {
            this.u.w();
        }
        super.h();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bedb9c9528317c4d3c76c68d510cd86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bedb9c9528317c4d3c76c68d510cd86");
            return;
        }
        if (this.u != null) {
            this.u.v();
        }
        super.g();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5273f9fc0544c86a30231081d271f44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5273f9fc0544c86a30231081d271f44");
            return;
        }
        if (this.q != null) {
            this.q.q();
        }
        if (this.s != null) {
            this.s.q();
        }
        if (this.r != null) {
            this.r.q();
        }
        if (this.t != null) {
            this.t.q();
        }
        if (this.u != null && !this.i.c()) {
            this.u.q();
        }
        if (this.v != null) {
            this.v.q();
        }
        if (this.w != null) {
            this.w.q();
        }
        super.a();
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f3ef98907ad7e0342df8e577afee78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f3ef98907ad7e0342df8e577afee78");
            return;
        }
        if (this.q != null) {
            this.q.b();
        }
        if (this.r != null) {
            this.r.b();
        }
        if (this.s != null) {
            this.s.b();
        }
        if (this.t != null) {
            this.t.b();
        }
        if (this.u != null && !this.i.c()) {
            this.u.b();
        }
        if (this.v != null) {
            this.v.b();
        }
        if (this.w != null) {
            this.w.b();
        }
    }

    private JudasManualManager.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83eed4e4a97eea097835efcee00a00b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JudasManualManager.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83eed4e4a97eea097835efcee00a00b9");
        }
        JudasManualManager.a a2 = JudasManualManager.b(str).a("c_hgowsqb").a("order_id", this.h);
        if (this.i != null) {
            a2.a("order_status", this.i.e).a("status_code", this.i.x).a("weather_type", this.i.d);
        }
        a2.a("support_care", this.g.o != null ? this.g.o.c : "0");
        return a2;
    }

    public final JudasManualManager.a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d26c91bd91af5974c82c337d83d2b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JudasManualManager.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d26c91bd91af5974c82c337d83d2b6");
        }
        if (this.i != null) {
            return a(str).a("poi_prepare_code", this.i.F).a("rider_delivery_code", this.i.E);
        }
        return a(str);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850e56fd707750a76f30466e2e44558a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850e56fd707750a76f30466e2e44558a");
        }
        if (this.s != null && this.s.j() != null && marker.getId().equals(this.s.j().getId())) {
            return this.s.k();
        }
        if (this.q != null && this.q.j() != null && marker.getId().equals(this.q.j().getId())) {
            return this.q.k();
        }
        if (this.r != null && this.r.j() != null && marker.getId().equals(this.r.j().getId())) {
            return this.r.k();
        }
        if (this.t != null && this.t.j() != null && marker.getId().equals(this.t.j().getId())) {
            return this.t.k();
        }
        if (this.u != null && this.u.j() != null && marker.getId().equals(this.u.j().getId())) {
            return this.u.k();
        }
        if (this.v != null && this.v.j() != null && marker.getId().equals(this.v.j().getId())) {
            return this.v.k();
        }
        if (this.w == null || this.w.j() == null || !marker.getId().equals(this.w.j().getId())) {
            return null;
        }
        return this.w.k();
    }

    public final int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd490af5a797411b9048965c4079c09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd490af5a797411b9048965c4079c09")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return com.sankuai.waimai.platform.b.A().m() + com.sankuai.waimai.foundation.utils.g.e(this.f);
        }
        return com.sankuai.waimai.platform.b.A().m();
    }
}
