package com.sankuai.waimai.bussiness.order.detailnew.controller.map;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.Arc;
import com.sankuai.meituan.mapsdk.maps.model.ArcOptions;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import com.sankuai.meituan.mapsdk.maps.model.Projection;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.controller.map.e;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends e {
    public static ChangeQuickRedirect a;
    private float B;
    private float C;
    private boolean D;
    private Handler E;
    private boolean F;
    private boolean G;
    private Runnable H;
    private Arc I;
    private Arc J;
    private PointD K;
    private double L;
    private LatLng M;
    private e.a N;
    private List<Integer> O;
    private Runnable P;
    private b b;
    private a c;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final int b() {
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public final View getInfoContents(Marker marker) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        return true;
    }

    public static /* synthetic */ Arc a(f fVar, double d, double d2) {
        double d3;
        double d4;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "649caa0f6dde274282b864d69e6a9fe9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Arc) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "649caa0f6dde274282b864d69e6a9fe9");
        }
        if (d > d2) {
            d4 = d;
            d3 = d2;
        } else {
            d3 = d;
            d4 = d2;
        }
        return fVar.e.addArcEnhance(new ArcOptions(fVar.M, fVar.L, (float) d3, (float) d4).strokeWidth(15.0f).strokeColor(Color.argb(255, 255, 128, 0)).level(2));
    }

    public f(Context context, ViewGroup viewGroup, MTMap mTMap, String str, e.a aVar, e.a aVar2, e.a aVar3) {
        super(context, viewGroup, mTMap, str, aVar, aVar2);
        Object[] objArr = {context, viewGroup, mTMap, str, aVar, aVar2, aVar3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20a04ac7ddc01b81a24da2c1fcc8e096", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20a04ac7ddc01b81a24da2c1fcc8e096");
            return;
        }
        this.D = false;
        this.E = new Handler(Looper.getMainLooper());
        this.F = false;
        this.G = false;
        this.P = new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.f.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2898b0044f50b63093d52801732e030e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2898b0044f50b63093d52801732e030e");
                } else if (f.this.D) {
                    f.this.n();
                }
            }
        };
        this.N = aVar3;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, String str, com.sankuai.waimai.business.order.api.detail.model.a aVar, n nVar, com.sankuai.waimai.business.order.api.detail.model.b bVar2, RiderInfo riderInfo) {
        Object[] objArr = {bVar, str, aVar, nVar, bVar2, riderInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234b65c44e8905a6b2068c432ced90ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234b65c44e8905a6b2068c432ced90ef");
            return;
        }
        super.a(bVar, str, aVar, nVar, bVar2, riderInfo);
        this.G = true;
        this.E.removeCallbacks(this.H);
        j();
        if (this.k != null && (this.k.i == 1 || this.k.i == 2 || this.k.i == 3)) {
            if (this.c != null) {
                this.c.b();
                this.c = null;
            }
            this.c = new a(this.e, this.f);
            this.E.removeCallbacks(this.P);
            this.E.postDelayed(this.P, 1000L);
            if (nVar != null && this.b != null) {
                this.b.b();
                this.b = null;
            }
        } else if (nVar != null && nVar.f == 1) {
            if (this.b != null) {
                this.b.b();
                this.b = null;
            }
            this.b = new b(this.e, this.f);
            this.E.removeCallbacks(this.P);
            this.E.postDelayed(this.P, 1000L);
            if (this.k != null && this.c != null) {
                this.c.b();
                this.c = null;
            }
        } else if (this.k != null || nVar != null) {
            this.E.removeCallbacks(this.P);
            if (this.k != null && this.c != null) {
                this.c.b();
                this.c = null;
            }
            if (nVar != null && this.b != null) {
                this.b.b();
                this.b = null;
            }
        }
        if (nVar != null && nVar.e == 1) {
            c();
        } else {
            super.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.detailnew.controller.map.f.c():void");
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d70b59f7bd7871b6bf003808a5fc8a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d70b59f7bd7871b6bf003808a5fc8a16");
            return;
        }
        super.j();
        if (this.j == null || this.j.e != 1 || this.k == null || this.k.a() == null || this.g == null || this.g.d == null || this.g.d.a() == null) {
            return;
        }
        this.F = true;
        this.G = false;
        b(this.k.a(), this.g.d.a());
        a(this.g, this.k, this.i);
        b(this.g, this.k, this.i);
    }

    private void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, com.sankuai.waimai.business.order.api.detail.model.b bVar2, com.sankuai.waimai.business.order.api.detail.model.a aVar) {
        Object[] objArr = {bVar, bVar2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac8378b2a09e036e7a760fb0b6c2c19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac8378b2a09e036e7a760fb0b6c2c19");
            return;
        }
        LatLng a2 = bVar2.a();
        LatLng f = (aVar != null ? aVar.g : -1) == 15 ? a2 : f(a2, bVar.d.a());
        if (this.t == null) {
            this.t = new com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.d(this.f, this.e, f, bVar2.d, bVar, this.y, this.A);
        } else {
            this.t.a(f, bVar2.d, bVar);
        }
        this.t.a();
        a(aVar, this.t.s());
    }

    private void b(com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, com.sankuai.waimai.business.order.api.detail.model.b bVar2, com.sankuai.waimai.business.order.api.detail.model.a aVar) {
        Object[] objArr = {bVar, bVar2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ebe2d67708edb266b7e6102f63f7aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ebe2d67708edb266b7e6102f63f7aec");
            return;
        }
        LatLng a2 = bVar2.a();
        LatLng a3 = bVar.d.a();
        LatLng f = f(a2, a3);
        int i = aVar != null ? aVar.g : -1;
        if (i == -1 || i == 15) {
            return;
        }
        if (i != 20) {
            if (i == 10) {
                a3 = a2;
            } else {
                f = a2;
            }
        }
        a(f, a3);
    }

    private void a(final LatLng latLng, final LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ada36252a3ee4c999a30ffef40188f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ada36252a3ee4c999a30ffef40188f");
            return;
        }
        this.H = new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.f.2
            public static ChangeQuickRedirect a;
            public int b = 0;
            public int c = 10;
            public double d;
            public double e;
            public double f;
            public double g;
            public double h;

            {
                this.d = f.this.a(latLng);
                this.e = f.this.a(latLng2);
                this.f = this.d;
                this.g = this.d;
                this.h = this.e - this.d;
                if (Math.abs(this.d - this.e) > 180.0d) {
                    if (this.d < this.e) {
                        this.d += 360.0d;
                    } else {
                        this.e += 360.0d;
                    }
                }
                this.h = this.e - this.d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81737f50f6d462c982a2e8a23a10a9a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81737f50f6d462c982a2e8a23a10a9a7");
                    return;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "18c3847023a5cd9c01eb470e46980307", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "18c3847023a5cd9c01eb470e46980307");
                } else {
                    this.b++;
                    if (this.b < 4) {
                        this.f = this.d;
                        this.g += this.h / this.c;
                    } else if (this.b <= this.c - 4) {
                        this.f += this.h / this.c;
                        this.g += this.h / this.c;
                    } else {
                        this.f += this.h / this.c;
                        this.g += this.h / this.c;
                        if (this.b >= this.c) {
                            this.g = this.e;
                            if (this.b == this.c + 4) {
                                this.b = 0;
                                this.f = this.d;
                                this.g = this.d;
                            }
                        }
                    }
                }
                f.this.m();
                if (f.this.G) {
                    return;
                }
                if (this.f != this.g) {
                    f.this.J = f.a(f.this, this.f, this.g);
                }
                f.this.E.postDelayed(this, 50L);
            }
        };
        this.E.postDelayed(this.H, 50L);
    }

    private void b(LatLng latLng, LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bcf915dc3264ce7a64562497d3d2d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bcf915dc3264ce7a64562497d3d2d01");
            return;
        }
        if (this.I != null) {
            this.I.remove();
        }
        c(latLng, latLng2);
        e(latLng, latLng2);
        double a2 = a(latLng);
        double a3 = a(latLng2);
        if (Math.abs(a2 - a3) > 180.0d) {
            if (a2 < a3) {
                a2 += 360.0d;
            } else {
                a3 += 360.0d;
            }
        }
        if (a2 > a3) {
            double d = a2;
            a2 = a3;
            a3 = d;
        }
        this.I = this.e.addArcEnhance(new ArcOptions(this.M, this.L, (float) a2, (float) a3).strokeWidth(15.0f).strokeColor(Color.argb(77, 255, (int) TbsListener.ErrorCode.STARTDOWNLOAD_3, 0)).level(2));
    }

    private void c(LatLng latLng, LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420ba723709aebc0b6bb9f3717b2343e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420ba723709aebc0b6bb9f3717b2343e");
        } else {
            this.L = d(latLng, latLng2);
        }
    }

    private double d(LatLng latLng, LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bac3c90c5528f522018acf70fa15313", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bac3c90c5528f522018acf70fa15313")).doubleValue();
        }
        Projection projection = this.e.getProjection();
        PointD projectedMetersForLatLng = projection.toProjectedMetersForLatLng(latLng);
        PointD projectedMetersForLatLng2 = projection.toProjectedMetersForLatLng(latLng2);
        return Math.sqrt(Math.pow(projectedMetersForLatLng.x - projectedMetersForLatLng2.x, 2.0d) + Math.pow(projectedMetersForLatLng.y - projectedMetersForLatLng2.y, 2.0d));
    }

    private void e(LatLng latLng, LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "231f4484ea7c07b78a49a4bfa2fa5b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "231f4484ea7c07b78a49a4bfa2fa5b90");
            return;
        }
        Projection projection = this.e.getProjection();
        PointD projectedMetersForLatLng = projection.toProjectedMetersForLatLng(latLng);
        PointD projectedMetersForLatLng2 = projection.toProjectedMetersForLatLng(latLng2);
        double d = projectedMetersForLatLng.x;
        double d2 = projectedMetersForLatLng2.x;
        double d3 = projectedMetersForLatLng.y;
        double d4 = projectedMetersForLatLng2.y;
        if (d == d2) {
            this.K = new PointD(d - ((this.L / 2.0d) * Math.sqrt(3.0d)), (d3 + d4) / 2.0d);
            this.M = projection.fromProjectedMeters(this.K);
            return;
        }
        double d5 = d2 - d;
        double pow = (((Math.pow(d2, 2.0d) - Math.pow(d, 2.0d)) + Math.pow(d4, 2.0d)) - Math.pow(d3, 2.0d)) / (d5 * 2.0d);
        double d6 = (d4 - d3) / d5;
        double pow2 = Math.pow(d6, 2.0d) + 1.0d;
        double d7 = d * 2.0d;
        double d8 = ((d7 * d6) - ((pow * 2.0d) * d6)) - (d3 * 2.0d);
        double sqrt = ((-d8) + Math.sqrt(Math.pow(d8, 2.0d) - ((4.0d * pow2) * ((((Math.pow(d, 2.0d) - (d7 * pow)) + Math.pow(pow, 2.0d)) + Math.pow(d3, 2.0d)) - Math.pow(this.L, 2.0d))))) / (pow2 * 2.0d);
        this.K = new PointD(pow - (d6 * sqrt), sqrt);
        this.M = projection.fromProjectedMeters(this.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e604f9459ebbd28b4604b5e7d15272", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e604f9459ebbd28b4604b5e7d15272")).doubleValue();
        }
        PointD projectedMetersForLatLng = this.e.getProjection().toProjectedMetersForLatLng(latLng);
        double d = projectedMetersForLatLng.x - this.K.x;
        double d2 = this.K.y - projectedMetersForLatLng.y;
        if ((d <= 0.0d || d2 <= 0.0d) && (d >= 0.0d || d2 >= 0.0d)) {
            return ((Math.asin(Math.min(Math.abs(d), this.L) / this.L) * 180.0d) / 3.141592653589793d) + (d2 > 0.0d ? 90.0d : 270.0d);
        }
        return ((Math.asin(Math.min(Math.abs(d2), this.L) / this.L) * 180.0d) / 3.141592653589793d) + (d2 > 0.0d ? 0.0d : 180.0d);
    }

    private LatLng f(LatLng latLng, LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b42268f08ac3f8b0914247fcf8b72b", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b42268f08ac3f8b0914247fcf8b72b");
        }
        Projection projection = this.e.getProjection();
        double radians = Math.toRadians(a(latLng));
        double radians2 = Math.toRadians(a(latLng2));
        double d = (radians + radians2) / 2.0d;
        if (Math.abs(radians - radians2) > 3.141592653589793d) {
            d = ((radians2 + 6.283185307179586d) + radians) / 2.0d;
        }
        return projection.fromProjectedMeters(new PointD((Math.cos(d) * this.L) + this.K.x, this.K.y - (Math.sin(d) * this.L)));
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22f30b85595e7b641a5fcefdb5792139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22f30b85595e7b641a5fcefdb5792139");
            return;
        }
        super.a();
        if (this.e == null) {
            return;
        }
        if (!this.i.c() && (this.b == null || this.c == null)) {
            this.e.clear();
        } else {
            k();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0b6364cbf599b06e3d38e72db2d609e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0b6364cbf599b06e3d38e72db2d609e");
            return;
        }
        if (this.I != null) {
            this.I.remove();
        }
        m();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc413bccd2d0b1716cff67ff9dac4abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc413bccd2d0b1716cff67ff9dac4abe");
            return;
        }
        if (this.u != null) {
            this.u.b();
        }
        e();
        this.E.removeCallbacks(this.P);
        this.E.removeCallbacks(this.H);
        m();
        if (this.c != null) {
            this.c.b();
        }
        if (this.b != null) {
            this.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5436f8f152485b8c4ba79ebfa21883da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5436f8f152485b8c4ba79ebfa21883da");
        } else if (this.J != null) {
            this.J.remove();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
    public final View getInfoWindow(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761898ab825681eaeac86f96650b6687", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761898ab825681eaeac86f96650b6687") : super.getInfoWindow(marker);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d, com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChange(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9c0f561d1b35033dcfeb03ea779753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9c0f561d1b35033dcfeb03ea779753");
            return;
        }
        super.onCameraChange(cameraPosition);
        this.D = false;
        this.E.removeCallbacks(this.P);
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.d, com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChangeFinish(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6550b3e2d93ef26198195e7931a6c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6550b3e2d93ef26198195e7931a6c8");
            return;
        }
        super.onCameraChangeFinish(cameraPosition);
        float scalePerPixel = this.e.getScalePerPixel();
        if (this.k != null && (this.k.i == 1 || this.k.i == 2 || this.k.i == 3)) {
            if (this.c == null) {
                this.D = true;
                return;
            } else if (this.C != 0.0f && this.c.g) {
                this.c.a(scalePerPixel);
                this.c.f = scalePerPixel / this.C;
            } else {
                this.C = scalePerPixel;
                n();
            }
        } else if (this.b == null) {
            this.D = true;
            return;
        } else {
            if (this.B != 0.0f && this.b.n) {
                this.b.a(com.sankuai.waimai.foundation.utils.g.a(this.f) * scalePerPixel);
                this.b.a(scalePerPixel / this.B);
            }
            n();
        }
        this.B = scalePerPixel;
        this.D = true;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3388533207206f75f3f3c8bf9de1cd3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3388533207206f75f3f3c8bf9de1cd3e");
            return;
        }
        if (this.O == null) {
            this.O = new ArrayList();
        }
        if (this.O.contains(Integer.valueOf(i)) || this.i == null) {
            return;
        }
        b("b_waimai_68duxuei_mv").a("calling_rider_strength", i).a(this.f).a();
        this.O.add(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eba6bbfa0147627490017548e064dbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eba6bbfa0147627490017548e064dbd");
        } else if (this.k != null && ((this.k.i == 1 || this.k.i == 2 || this.k.i == 3) && !this.c.g)) {
            int i = this.k.i;
            float scalePerPixel = this.e.getScalePerPixel();
            a aVar = this.c;
            aVar.b = this.k.a();
            aVar.a(scalePerPixel).a(i).a();
            a(i);
        } else if (this.b == null || this.j == null || this.j.f != 1 || this.b.n) {
        } else {
            float scalePerPixel2 = this.e.getScalePerPixel();
            b bVar = this.b;
            bVar.g = this.f.getResources().getColor(R.color.wm_order_status_map_ripper_fill_color);
            bVar.i = com.sankuai.waimai.foundation.utils.g.a(this.f, 0.5f);
            bVar.h = this.f.getResources().getColor(R.color.wm_order_status_map_ripper_stroke_color);
            b a2 = bVar.a(4);
            a2.c = this.k.a();
            b a3 = a2.a(16000L);
            a3.e = 0.9f;
            a3.a(com.sankuai.waimai.foundation.utils.g.a(this.f) * scalePerPixel2).a();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652bfcf3e792438101cc6345671be5fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652bfcf3e792438101cc6345671be5fb");
            return;
        }
        super.g();
        this.E.removeCallbacks(this.P);
        if (this.c != null) {
            this.c.b();
        }
        if (this.b != null) {
            this.b.b();
        }
        this.G = true;
        this.E.removeCallbacks(this.H);
        m();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e, com.sankuai.waimai.bussiness.order.detailnew.controller.map.d
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a18a93c110098f9832973a8fd0b25c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a18a93c110098f9832973a8fd0b25c0");
            return;
        }
        super.h();
        if (this.c != null && this.k != null && ((this.k.i == 1 || this.k.i == 2 || this.k.i == 3) && !this.c.g)) {
            this.c.a();
        }
        if (this.b != null && this.j != null && this.j.f == 1 && !this.b.n) {
            this.b.a();
        }
        if (this.F) {
            this.G = false;
            this.E.postDelayed(this.H, 50L);
        }
    }
}
