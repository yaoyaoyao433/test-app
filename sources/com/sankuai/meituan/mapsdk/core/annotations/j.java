package com.sankuai.meituan.mapsdk.core.annotations;

import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.ArcOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class j extends d implements com.sankuai.meituan.mapsdk.core.interfaces.b {
    public static ChangeQuickRedirect y;
    public static final /* synthetic */ boolean z = !j.class.desiredAssertionStatus();
    private LatLng A;
    private LatLng B;
    private LatLng C;
    private float D;
    private int E;
    private double F;
    private double G;
    private double H;
    private LatLng I;
    private float J;
    private float[] K;
    private int[] L;
    private boolean M;

    public j(g gVar, ArcOptions arcOptions) {
        super(gVar);
        Object[] objArr = {gVar, arcOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e7c9daec22695fc473fb04b0ee6dae0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e7c9daec22695fc473fb04b0ee6dae0");
            return;
        }
        this.D = 10.0f;
        this.E = -16776961;
        this.M = false;
        String str = "";
        if (arcOptions == null) {
            str = "arcOptions == null";
        } else if ((arcOptions.getStartPoint() == null || arcOptions.getPassedPoint() == null || arcOptions.getEndPoint() == null) && arcOptions.getCenter() == null) {
            str = "unavailable startPoint, passedPoint, endPoint or centerPoint";
        }
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
        } else if (!z && arcOptions == null) {
            throw new AssertionError();
        } else {
            this.s.a(false);
            setVisible(arcOptions.isVisible());
            setLevel(arcOptions.getLevel());
            setZIndex(arcOptions.getZIndex());
            setStrokeWidth(arcOptions.getStrokeWidth());
            setStrokeColor(arcOptions.getStrokeColor());
            Object[] objArr2 = {arcOptions};
            ChangeQuickRedirect changeQuickRedirect2 = y;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0adefd9ee8e918213daa7dc92874461a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0adefd9ee8e918213daa7dc92874461a");
            } else if (!f()) {
                if (arcOptions.getStartPoint() != null && arcOptions.getPassedPoint() != null && arcOptions.getEndPoint() != null) {
                    LatLng startPoint = arcOptions.getStartPoint();
                    LatLng passedPoint = arcOptions.getPassedPoint();
                    LatLng endPoint = arcOptions.getEndPoint();
                    Object[] objArr3 = {startPoint, passedPoint, endPoint};
                    ChangeQuickRedirect changeQuickRedirect3 = y;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "76d29ea81ddfcd28a3a6d92d1805ca8c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "76d29ea81ddfcd28a3a6d92d1805ca8c");
                    } else if (!f() && startPoint != null && passedPoint != null && endPoint != null) {
                        this.A = startPoint;
                        this.B = passedPoint;
                        this.C = endPoint;
                        this.M = false;
                        if (!this.A.equals(this.B) && !this.A.equals(this.C) && !this.B.equals(this.C) && ((this.C.latitude - this.A.latitude) * (this.B.longitude - this.A.longitude)) - ((this.B.latitude - this.A.latitude) * (this.C.longitude - this.A.longitude)) != 0.0d) {
                            LatLng latLng = this.A;
                            LatLng latLng2 = this.B;
                            LatLng latLng3 = this.C;
                            Object[] objArr4 = {latLng, latLng2, latLng3};
                            ChangeQuickRedirect changeQuickRedirect4 = y;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "227b1531a1fa4ebc928ab46ab5bf8396", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "227b1531a1fa4ebc928ab46ab5bf8396");
                            } else {
                                com.sankuai.meituan.mapsdk.core.f fVar = (com.sankuai.meituan.mapsdk.core.f) this.j.b.getProjection().getIProjection();
                                PointD projectedMetersForLatLng = fVar.toProjectedMetersForLatLng(latLng);
                                PointD projectedMetersForLatLng2 = fVar.toProjectedMetersForLatLng(latLng2);
                                PointD projectedMetersForLatLng3 = fVar.toProjectedMetersForLatLng(latLng3);
                                double d = projectedMetersForLatLng.x;
                                double d2 = projectedMetersForLatLng2.x;
                                double d3 = projectedMetersForLatLng3.x;
                                double d4 = projectedMetersForLatLng.y;
                                double d5 = projectedMetersForLatLng2.y;
                                double d6 = projectedMetersForLatLng3.y;
                                double d7 = d - d2;
                                double d8 = d4 - d5;
                                double d9 = d - d3;
                                double d10 = d4 - d6;
                                double d11 = d * d;
                                double d12 = d4 * d4;
                                double d13 = ((d11 - (d2 * d2)) + (d12 - (d5 * d5))) / 2.0d;
                                double d14 = ((d11 - (d3 * d3)) + (d12 - (d6 * d6))) / 2.0d;
                                double d15 = (d8 * d9) - (d7 * d10);
                                double d16 = (-((d10 * d13) - (d8 * d14))) / d15;
                                double d17 = (-((d7 * d14) - (d9 * d13))) / d15;
                                this.I = fVar.fromProjectedMeters(new PointD(d16, d17));
                                if (this.I != null) {
                                    this.H = Math.hypot(d - d16, d4 - d17);
                                    double a = a(this.A, this.I, this.H);
                                    double a2 = a(this.B, this.I, this.H);
                                    double a3 = a(this.C, this.I, this.H);
                                    this.F = Math.min(a, a3);
                                    this.G = Math.max(a, a3);
                                    if (a2 > this.G || a2 < this.F) {
                                        double d18 = this.F;
                                        this.F = this.G;
                                        this.G = d18;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.I = arcOptions.getCenter();
                    this.H = arcOptions.getRadius();
                    this.F = ((arcOptions.getStartAngle() % 360.0f) / 180.0f) * 3.141592653589793d;
                    this.G = ((arcOptions.getEndAngle() % 360.0f) / 180.0f) * 3.141592653589793d;
                    com.sankuai.meituan.mapsdk.core.f fVar2 = (com.sankuai.meituan.mapsdk.core.f) this.j.b.getProjection().getIProjection();
                    PointD projectedMetersForLatLng4 = fVar2.toProjectedMetersForLatLng(this.I);
                    PointD pointD = new PointD((Math.cos(this.F) * this.H) + projectedMetersForLatLng4.x, projectedMetersForLatLng4.y - (Math.sin(this.F) * this.H));
                    PointD pointD2 = new PointD((Math.cos(this.G) * this.H) + projectedMetersForLatLng4.x, projectedMetersForLatLng4.y - (Math.sin(this.G) * this.H));
                    double d19 = this.G > this.F ? (this.F + this.G) / 2.0d : ((this.F + this.G) / 2.0d) + 3.141592653589793d;
                    PointD pointD3 = new PointD((Math.cos(d19) * this.H) + projectedMetersForLatLng4.x, projectedMetersForLatLng4.y - (Math.sin(d19) * this.H));
                    this.A = fVar2.fromProjectedMeters(pointD);
                    this.B = fVar2.fromProjectedMeters(pointD3);
                    this.C = fVar2.fromProjectedMeters(pointD2);
                }
                if (this.I != null && a(this.F) && a(this.G)) {
                    this.M = true;
                    this.u.a(com.sankuai.meituan.mapsdk.core.render.model.c.Point, this.I);
                    this.s.a(5000, (float) this.H);
                    this.s.a(5013, new float[]{(float) this.F, (float) this.G});
                }
            }
            setGradientColors(arcOptions.getGradientColorPercentage(), arcOptions.getGradientColors());
            this.s.a(5002, com.sankuai.meituan.mapsdk.core.render.b.f(0));
            this.s.a(5004, 0.0f);
            this.s.a(5001, 0);
            this.s.a(5008, 0);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.b
    public final LatLng h() {
        return this.C;
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.b
    public final LatLng i() {
        return this.B;
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.b
    public final LatLng j() {
        return this.A;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public int getStrokeColor() {
        return this.E;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "602617fac848a191b0e3f92665df9abc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "602617fac848a191b0e3f92665df9abc");
        } else if (f()) {
        } else {
            this.s.a(5010, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            this.s.a(5011, Color.alpha(i) / 255.0f);
            this.E = i;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public Object getTag() {
        return this.q;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public void setTag(Object obj) {
        this.q = obj;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public float getStrokeWidth() {
        return this.D;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab9de83a34f48a4b15a3672a0b6d0c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab9de83a34f48a4b15a3672a0b6d0c3");
        } else if (f()) {
        } else {
            this.s.a(5009, com.sankuai.meituan.mapsdk.core.utils.d.a(f));
            this.D = f;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public float[] getGradientColorPercentage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a444c0d4b1b716113bb763ec3efa618b", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a444c0d4b1b716113bb763ec3efa618b");
        }
        if (this.K == null) {
            return this.K;
        }
        return Arrays.copyOf(this.K, this.K.length);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public int[] getGradientColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52894207b8510d6a6e59cff4603c2aa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52894207b8510d6a6e59cff4603c2aa7");
        }
        if (this.L == null) {
            return this.L;
        }
        return Arrays.copyOf(this.L, this.L.length);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public void setGradientColors(float[] fArr, int[] iArr) {
        float[] fArr2;
        Object[] objArr = {fArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e083d8cdad652a7654ff70106ff0c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e083d8cdad652a7654ff70106ff0c90");
        } else if (fArr != null && fArr.length >= 2 && iArr != null && iArr.length >= 2 && fArr.length == iArr.length) {
            this.K = Arrays.copyOf(fArr, fArr.length);
            this.L = Arrays.copyOf(iArr, iArr.length);
            com.sankuai.meituan.mapsdk.core.render.model.f fVar = this.s;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = y;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5afa214efb9861a16312ad935e1d11a", RobustBitConfig.DEFAULT_VALUE)) {
                fArr2 = (float[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5afa214efb9861a16312ad935e1d11a");
            } else {
                int length = this.L.length;
                float[] fArr3 = new float[length * 5];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 5;
                    fArr3[i2] = this.K[i];
                    System.arraycopy(com.sankuai.meituan.mapsdk.core.render.b.f(this.L[i]), 0, fArr3, i2 + 1, 4);
                }
                fArr2 = fArr3;
            }
            fVar.a(5016, fArr2);
        }
    }

    private boolean a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = y;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3da76dae6d9a8ce781f55b83cdb719", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3da76dae6d9a8ce781f55b83cdb719")).booleanValue() : (Double.isNaN(d) || Double.isInfinite(d)) ? false : true;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.core.interfaces.a
    public void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0219fc0e8a8e4897a3c1c2fe78bd0b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0219fc0e8a8e4897a3c1c2fe78bd0b6");
        } else if (f()) {
        } else {
            this.J = com.sankuai.meituan.mapsdk.core.utils.a.a(f);
            this.s.a(5011, this.J);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d
    public final void a(boolean z2) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb6bad5ffb723c4e9c514665324a633d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb6bad5ffb723c4e9c514665324a633d");
        } else if (f()) {
        } else {
            if (z2) {
                this.s.a(5012, h.b);
            } else {
                this.s.a(5012, h.c);
            }
            this.c = z2;
        }
    }

    private double a(LatLng latLng, LatLng latLng2, double d) {
        Object[] objArr = {latLng, latLng2, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885766285cd6cc59376a757b0a4258f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885766285cd6cc59376a757b0a4258f1")).doubleValue();
        }
        com.sankuai.meituan.mapsdk.core.f fVar = (com.sankuai.meituan.mapsdk.core.f) this.j.b.getProjection().getIProjection();
        PointD projectedMetersForLatLng = fVar.toProjectedMetersForLatLng(latLng);
        PointD projectedMetersForLatLng2 = fVar.toProjectedMetersForLatLng(latLng2);
        double d2 = projectedMetersForLatLng.x - projectedMetersForLatLng2.x;
        double d3 = (2.0037508342789244E7d - projectedMetersForLatLng.y) - (2.0037508342789244E7d - projectedMetersForLatLng2.y);
        if ((d2 <= 0.0d || d3 <= 0.0d) && (d2 >= 0.0d || d3 >= 0.0d)) {
            return ((((Math.asin(Math.min(Math.abs(d2), d) / d) * 180.0d) / 3.141592653589793d) + (d3 > 0.0d ? 90.0d : 270.0d)) / 180.0d) * 3.141592653589793d;
        }
        return ((((Math.asin(Math.min(Math.abs(d3), d) / d) * 180.0d) / 3.141592653589793d) + (d3 <= 0.0d ? 180.0d : 0.0d)) / 180.0d) * 3.141592653589793d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x013a, code lost:
        if (r14.x > r11.x) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
        if (r14.x < r11.x) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0174, code lost:
        if ((r4 / r2) <= 0.01d) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.sankuai.meituan.mapsdk.maps.model.LatLngBounds getBounds() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.core.annotations.j.getBounds():com.sankuai.meituan.mapsdk.maps.model.LatLngBounds");
    }
}
