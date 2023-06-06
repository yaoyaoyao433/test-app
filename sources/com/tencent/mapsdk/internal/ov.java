package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.hw;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.py;
import com.tencent.mapsdk.internal.sh;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ov extends or<ar> implements ar {
    private final int A;
    private hw B;
    private float C;
    private a D;
    private float E;
    private int F;
    private PolylineOptions.Text G;
    private boolean H;
    private boolean I;
    private float J;
    private boolean K;
    private boolean L;
    private int M;
    private GeoPoint N;
    private String O;
    private int P;
    private List<Integer> Q;
    private final float R;
    private boolean S;
    private Animation T;
    private PolylineOptions U;
    private List<LatLng> V;
    private final ba W;
    private String X;
    private boolean Y;
    private hw.b Z;
    public py a;
    private pz n;
    private Polyline o;
    private final List<a> p;
    private final List<GeoPoint> q;
    private float r;
    private final mn s;
    private boolean t;
    private int[] u;
    private int[] v;
    private int[] w;
    private int x;
    private PolylineOptions.ColorType y;
    private BitmapDescriptor z;

    private static int b(int i) {
        if (i != 6) {
            if (i != 33) {
                switch (i) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    case 4:
                        return 4;
                }
            }
            return 33;
        }
        return 6;
    }

    private static int c(int i) {
        if (i >= 12) {
            i = 11;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    private ar t() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ap f_() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean handleOnTap() {
        return true;
    }

    public ov(ba baVar) {
        super(baVar);
        this.a = null;
        this.n = null;
        this.o = null;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = -7829368;
        this.z = null;
        this.A = 12;
        this.D = null;
        this.E = 1.0f;
        this.F = 0;
        this.H = false;
        this.I = true;
        this.J = 0.0f;
        this.K = false;
        this.L = false;
        this.M = -1;
        this.N = null;
        this.P = (int) (hc.a(this.l.G()) * 100.0f);
        this.X = sx.a;
        this.Z = new hw.b() { // from class: com.tencent.mapsdk.internal.ov.3
            @Override // com.tencent.mapsdk.internal.hw.b
            public final void a(float f, float f2) {
            }

            @Override // com.tencent.mapsdk.internal.hw.b
            public final void a(float f, float f2, float f3, float f4) {
            }

            @Override // com.tencent.mapsdk.internal.hw.b
            public final void a(int i, int i2) {
            }

            @Override // com.tencent.mapsdk.internal.hw.b
            public final void a(float f) {
                ov.this.C = f;
            }

            @Override // com.tencent.mapsdk.internal.hw.b
            public final void b(float f) {
                ov.this.E = f;
            }
        };
        this.W = baVar;
        this.s = baVar.b();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.R = this.s.getContext().getResources().getDisplayMetrics().density;
    }

    private void a(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor.getBitmap(this.W.G()) != null) {
            this.O = bitmapDescriptor.getFormater().getBitmapId();
        }
    }

    private void a(int i) {
        this.P = i;
    }

    private void a(List<LatLng> list) {
        int size;
        this.V = list;
        if (list != null && (size = list.size()) > 0) {
            this.J = 0.0f;
            this.p.clear();
            a aVar = null;
            for (int i = 0; i < size; i++) {
                LatLng latLng = list.get(i);
                if (latLng != null) {
                    a aVar2 = new a(GeoPoint.from(latLng));
                    if (aVar != null) {
                        this.J += aVar != null ? (float) (Math.hypot(aVar2.getLatitudeE6() - aVar.getLatitudeE6(), aVar2.getLongitudeE6() - aVar.getLongitudeE6()) + 0.0d) : 0.0f;
                        aVar2.a = this.J;
                        aVar2.b = aVar.b + 1;
                    }
                    this.p.add(aVar2);
                    aVar = aVar2;
                }
            }
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setPolylineOptions(PolylineOptions polylineOptions) {
        if (this.s == null || polylineOptions == null) {
            return;
        }
        this.m = true;
        this.U = polylineOptions;
        if (polylineOptions.getWidth() == -1.0f) {
            setStrokeWidth(this.R * 9.0f);
        } else {
            setStrokeWidth(polylineOptions.getWidth());
        }
        setStrokeColor(polylineOptions.getColor());
        setZIndex(polylineOptions.getZIndex());
        setVisible(polylineOptions.isVisible());
        this.C = polylineOptions.getAlpha();
        q();
        setArrow(polylineOptions.isArrow());
        setColorTexture(polylineOptions.getColorTexture());
        c(polylineOptions.getLineCap());
        d(polylineOptions.getPattern());
        this.r = polylineOptions.getBorderWidth();
        setClickable(polylineOptions.isClickable());
        this.w = polylineOptions.getBorderColors();
        this.c_ = polylineOptions.getIndoorInfo();
        this.F = polylineOptions.getLineType();
        this.j = polylineOptions.getLevel();
        this.x = polylineOptions.getEraseColor();
        if (polylineOptions.isAbovePillar() && this.j == 0) {
            this.j = 2;
        }
        a(polylineOptions.getPoints());
        if (polylineOptions.getArrowTexture() != null) {
            BitmapDescriptor arrowTexture = polylineOptions.getArrowTexture();
            if (arrowTexture.getBitmap(this.W.G()) != null) {
                this.O = arrowTexture.getFormater().getBitmapId();
            }
        }
        this.P = polylineOptions.getArrowSpacing();
        this.I = polylineOptions.isRoad();
        Animation animation = polylineOptions.getAnimation();
        if (animation != null) {
            a(((hf) animation).a);
        }
        int[][] colors = polylineOptions.getColors();
        if (colors != null && colors.length == 2) {
            int[] iArr = colors[0];
            int[] iArr2 = colors[1];
            if (iArr != null && iArr2 != null) {
                setColors(iArr, iArr2);
            }
        }
        this.y = a(polylineOptions.getColorType());
        setText(polylineOptions.getText());
        setGradientEnable(polylineOptions.isGradientEnable());
        r();
        d();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final PolylineOptions getPolylineOptions() {
        return this.U;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setPoints(List<LatLng> list) {
        a(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void appendPoint(LatLng... latLngArr) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.addAll(Arrays.asList(latLngArr));
        a(this.V);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void appendPoints(List<LatLng> list) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.addAll(list);
        a(this.V);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setAboveMaskLayer(boolean z) {
        if (this.H != z) {
            this.H = z;
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final boolean isAboveMaskLayer() {
        return this.H;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final List<Integer> getPattern() {
        return this.Q;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void pattern(List<Integer> list) {
        d(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void eraseTo(int i, LatLng latLng) {
        a(i, latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void eraseColor(int i) {
        if (this.x != i) {
            this.x = i;
            if (this.U != null) {
                this.U.eraseColor(i);
            }
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void setAnimation(Animation animation) {
        if ((animation instanceof AlphaAnimation) || (animation instanceof EmergeAnimation) || (animation instanceof IAlphaAnimation) || (animation instanceof IEmergeAnimation)) {
            this.T = animation;
        } else {
            kj.b("Unsupported animation, only AlphaAnimation and EmergeAnimation allowed.");
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final boolean startAnimation() {
        hf a2;
        if (this.T == null || (a2 = ie.a(this.s.C(), this.T)) == null) {
            return false;
        }
        a(a2.a);
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline, com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void startAnimation(Animation animation) {
        setAnimation(animation);
        startAnimation();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setArrow(boolean z) {
        if (this.t != z) {
            this.t = z;
            if (this.U != null) {
                this.U.arrow(z);
            }
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColorTexture(String str) {
        setColorTexture(BitmapDescriptorFactory.fromAsset(str));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final int getColor() {
        return getStrokeColor();
    }

    private void d() {
        if (Thread.currentThread().getName().contains(this.X)) {
            e();
        } else {
            this.s.a(new mn.a() { // from class: com.tencent.mapsdk.internal.ov.1
                @Override // com.tencent.mapsdk.internal.mn.a
                public final void a(GL10 gl10) {
                    ov.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.s == null || this.q.size() < 2 || !isVisible()) {
            return;
        }
        py pyVar = this.a;
        fq g = g();
        if (g.a()) {
            if (pyVar == null) {
                pyVar = new py(this, this.W, g);
                pyVar.c_ = this.c_;
                this.s.k.a(pyVar);
                this.a = pyVar;
            } else {
                pyVar.a(g);
            }
            pyVar.a(this.M, this.N);
            this.s.v = true;
        }
    }

    private void f() {
        if (this.s == null || !this.S) {
            return;
        }
        this.S = false;
        if (this.G == null && this.n != null) {
            this.n.a();
            this.n = null;
            return;
        }
        sh shVar = this.s.g;
        if (this.G != null) {
            if (this.n == null) {
                if (this.q == null || this.q.size() < 2) {
                    return;
                }
                this.n = new pz(shVar, (GeoPoint[]) this.q.toArray(new GeoPoint[this.q.size()]), this.G);
                return;
            }
            pz pzVar = this.n;
            PolylineOptions.Text text = this.G;
            if (pzVar.b == null || pzVar.a <= 0) {
                return;
            }
            sh shVar2 = pzVar.b;
            shVar2.a(new sh.AnonymousClass48(pzVar.a, text));
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColorTexture(BitmapDescriptor bitmapDescriptor) {
        if (this.s == null || bitmapDescriptor == null || bitmapDescriptor.getFormater() == null) {
            return;
        }
        this.z = bitmapDescriptor;
        this.z.getBitmap(this.s.getContext());
        this.y = PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setGradientEnable(boolean z) {
        if (this.F == 0 && this.I) {
            this.Y = z;
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final boolean isGradientEnable() {
        return this.Y;
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void h_() {
        if (this.a != null) {
            this.a.remove();
            this.a = null;
        }
        if (this.n != null) {
            this.n.a();
            this.n = null;
        }
        if (this.p != null) {
            this.p.clear();
        }
        if (this.q != null) {
            this.q.clear();
        }
    }

    private PolylineOptions.ColorType a(PolylineOptions.ColorType colorType) {
        if (colorType != PolylineOptions.ColorType.LINE_COLOR_NONE) {
            return colorType;
        }
        if (this.u == null || this.u.length <= 0) {
            return (this.f < 0 || this.f >= 12) ? PolylineOptions.ColorType.LINE_COLOR_ARGB : PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
        }
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            if (this.u[i] < 0 || this.u[i] >= 12) {
                return PolylineOptions.ColorType.LINE_COLOR_ARGB;
            }
        }
        return PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
    }

    private fq g() {
        fq fqVar = new fq();
        if (this.s == null) {
            return fqVar;
        }
        if (this.z != null && this.z.getFormater() != null) {
            fqVar.y = this.z.getFormater().getBitmapId();
        }
        b c = c(this.q);
        fqVar.w = this.t;
        fqVar.I = this.P;
        fqVar.a(this.q);
        fqVar.N = this.x;
        if (this.F == 0) {
            int a2 = a(this.s.getContext(), this.z);
            if (a2 > 0) {
                float f = a2;
                if (this.d <= f) {
                    f = this.d;
                }
                fqVar.x = f;
            } else {
                fqVar.x = this.d;
            }
        } else {
            fqVar.x = this.d;
        }
        if (this.y == PolylineOptions.ColorType.LINE_COLOR_ARGB) {
            fqVar.v = true;
            if (this.r * 2.0f >= this.d) {
                this.r = this.d / 3.0f;
            }
            fqVar.u = this.r;
        }
        int[] iArr = this.w;
        if (this.I) {
            fqVar.a(c.a);
            if (this.r > 0.0f && iArr != null && iArr.length > 0) {
                fqVar.a(c.b, iArr);
            } else {
                fqVar.b(c.b);
            }
        } else {
            fqVar.a(new int[]{0});
            if (this.r <= 0.0f || iArr == null || iArr.length <= 0) {
                fqVar.b(new int[]{this.f});
            } else {
                fqVar.a(new int[]{this.f}, new int[]{iArr[0]});
            }
        }
        fqVar.A = this.C;
        fqVar.C = this.F;
        fqVar.G = (int) this.g;
        fqVar.D = this.H;
        fqVar.E = this.K;
        fqVar.z = this.L;
        fqVar.B = this.I;
        fqVar.H = this.O;
        fqVar.b(this.Q);
        fqVar.M = this.j;
        fqVar.O = this.Y;
        return fqVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ov)) {
            return TextUtils.equals(this.b_, ((ov) obj).b_);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void j_() {
        this.X = Thread.currentThread().getName();
        if (this.s != null && isVisible()) {
            if (p()) {
                if (this.p.size() >= 2) {
                    this.q.clear();
                    this.q.addAll(this.p);
                }
                d();
            }
            if (this.s != null && this.B != null && this.B.d) {
                this.B.b();
                if (this.B instanceof hy) {
                    this.q.clear();
                    List<GeoPoint> list = this.q;
                    List<a> list2 = this.p;
                    ArrayList arrayList = new ArrayList();
                    if (list2 != null && list2.size() >= 2) {
                        float f = this.D.a;
                        float f2 = this.J - this.D.a;
                        float f3 = f - (this.E * f);
                        float f4 = f + (f2 * this.E);
                        a aVar = null;
                        int i = 0;
                        while (true) {
                            if (i >= list2.size()) {
                                break;
                            }
                            a aVar2 = list2.get(i);
                            if (aVar2.a > f3 && aVar2.a < f4) {
                                if (aVar != null && aVar.a < f3) {
                                    a a2 = a(aVar, aVar2, (f3 - aVar.a) / (aVar2.a - aVar.a));
                                    a2.b = aVar.b;
                                    arrayList.add(a2);
                                }
                                arrayList.add(aVar2);
                            } else if (aVar2.a > f4) {
                                if (aVar != null && aVar.a < f4) {
                                    a a3 = a(aVar, aVar2, (f4 - aVar.a) / (aVar2.a - aVar.a));
                                    a3.b = aVar2.b;
                                    arrayList.add(a3);
                                }
                            } else if (Float.compare(aVar2.a, f3) == 0 || Float.compare(aVar2.a, f4) == 0) {
                                arrayList.add(aVar2);
                            }
                            i++;
                            aVar = aVar2;
                        }
                    }
                    list.addAll(arrayList);
                    if (this.q.size() >= 2) {
                        d();
                    }
                } else if (this.B instanceof hv) {
                    d();
                }
                this.s.v = true;
                if (this.B.e) {
                    this.B.a((hw.b) null);
                    this.B = null;
                }
            }
            if (this.s == null || !this.S) {
                return;
            }
            this.S = false;
            if (this.G == null && this.n != null) {
                this.n.a();
                this.n = null;
                return;
            }
            sh shVar = this.s.g;
            if (this.G != null) {
                if (this.n == null) {
                    if (this.q == null || this.q.size() < 2) {
                        return;
                    }
                    this.n = new pz(shVar, (GeoPoint[]) this.q.toArray(new GeoPoint[this.q.size()]), this.G);
                    return;
                }
                pz pzVar = this.n;
                PolylineOptions.Text text = this.G;
                if (pzVar.b == null || pzVar.a <= 0) {
                    return;
                }
                sh shVar2 = pzVar.b;
                shVar2.a(new sh.AnonymousClass48(pzVar.a, text));
            }
        }
    }

    private boolean h() {
        int i = 0;
        if (this.s == null || this.B == null || !this.B.d) {
            return false;
        }
        this.B.b();
        if (this.B instanceof hy) {
            this.q.clear();
            List<GeoPoint> list = this.q;
            List<a> list2 = this.p;
            ArrayList arrayList = new ArrayList();
            if (list2 != null && list2.size() >= 2) {
                float f = this.D.a;
                float f2 = this.J - this.D.a;
                float f3 = f - (this.E * f);
                float f4 = f + (f2 * this.E);
                a aVar = null;
                while (true) {
                    if (i >= list2.size()) {
                        break;
                    }
                    a aVar2 = list2.get(i);
                    if (aVar2.a > f3 && aVar2.a < f4) {
                        if (aVar != null && aVar.a < f3) {
                            a a2 = a(aVar, aVar2, (f3 - aVar.a) / (aVar2.a - aVar.a));
                            a2.b = aVar.b;
                            arrayList.add(a2);
                        }
                        arrayList.add(aVar2);
                    } else if (aVar2.a > f4) {
                        if (aVar != null && aVar.a < f4) {
                            a a3 = a(aVar, aVar2, (f4 - aVar.a) / (aVar2.a - aVar.a));
                            a3.b = aVar2.b;
                            arrayList.add(a3);
                        }
                    } else if (Float.compare(aVar2.a, f3) == 0 || Float.compare(aVar2.a, f4) == 0) {
                        arrayList.add(aVar2);
                    }
                    i++;
                    aVar = aVar2;
                }
            }
            list.addAll(arrayList);
            if (this.q.size() >= 2) {
                d();
            }
        } else if (this.B instanceof hv) {
            d();
        }
        this.s.v = true;
        if (this.B.e) {
            this.B.a((hw.b) null);
            this.B = null;
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f, float f2) {
        if (this.s == null || !isVisible() || this.a == null) {
            return false;
        }
        return this.a.onTap(f, f2);
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.ep
    public final void o() {
        super.o();
        if (this.a != null) {
            this.a.o();
        }
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.ep
    public final void a(IndoorBuilding indoorBuilding) {
        super.a(indoorBuilding);
        if (this.a != null) {
            this.a.a(indoorBuilding);
        }
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void q() {
        super.q();
        if (this.a != null) {
            this.a.q();
        }
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z) {
        super.setVisible(z);
        if (this.a != null) {
            this.a.setVisible(z);
        }
    }

    private static float a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (geoPoint2 != null) {
            return (float) (Math.hypot(geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6(), geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6()) + 0.0d);
        }
        return 0.0f;
    }

    private ArrayList<GeoPoint> b(List<a> list) {
        ArrayList<GeoPoint> arrayList = new ArrayList<>();
        if (list == null || list.size() < 2) {
            return arrayList;
        }
        float f = this.D.a;
        float f2 = this.J - this.D.a;
        float f3 = f - (this.E * f);
        float f4 = f + (f2 * this.E);
        a aVar = null;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            a aVar2 = list.get(i);
            if (aVar2.a > f3 && aVar2.a < f4) {
                if (aVar != null && aVar.a < f3) {
                    a a2 = a(aVar, aVar2, (f3 - aVar.a) / (aVar2.a - aVar.a));
                    a2.b = aVar.b;
                    arrayList.add(a2);
                }
                arrayList.add(aVar2);
            } else if (aVar2.a > f4) {
                if (aVar != null && aVar.a < f4) {
                    a a3 = a(aVar, aVar2, (f4 - aVar.a) / (aVar2.a - aVar.a));
                    a3.b = aVar2.b;
                    arrayList.add(a3);
                }
            } else if (Float.compare(aVar2.a, f3) == 0 || Float.compare(aVar2.a, f4) == 0) {
                arrayList.add(aVar2);
            }
            i++;
            aVar = aVar2;
        }
        return arrayList;
    }

    private static a a(a aVar, a aVar2, float f) {
        a aVar3 = new a();
        int longitudeE6 = aVar2.getLongitudeE6() - aVar.getLongitudeE6();
        aVar3.setLatitudeE6(aVar.getLatitudeE6() + Math.round((aVar2.getLatitudeE6() - aVar.getLatitudeE6()) * f));
        aVar3.setLongitudeE6(aVar.getLongitudeE6() + Math.round(longitudeE6 * f));
        aVar3.a = aVar.a + ((aVar2.a - aVar.a) * f);
        return aVar3;
    }

    private b c(List<GeoPoint> list) {
        int[] iArr;
        if (this.u == null || this.v == null || list == null || this.u.length == 0 || this.v.length == 0 || list.isEmpty()) {
            int i = this.f;
            if (this.y == PolylineOptions.ColorType.LINE_COLOR_TEXTURE) {
                i = c(i);
            }
            b bVar = new b(1);
            bVar.a(0, i);
            return bVar;
        }
        TreeSet treeSet = new TreeSet(new Comparator<Integer>() { // from class: com.tencent.mapsdk.internal.ov.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Integer num, Integer num2) {
                return num.compareTo(num2);
            }

            private static int a(Integer num, Integer num2) {
                return num.compareTo(num2);
            }
        });
        for (int i2 : this.v) {
            if (i2 >= 0 && i2 < list.size()) {
                treeSet.add(Integer.valueOf(i2));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 : this.u) {
            arrayList.add(Integer.valueOf(i3));
        }
        Integer[] numArr = (Integer[]) treeSet.toArray(new Integer[0]);
        if (numArr[0].intValue() != 0) {
            treeSet.add(0);
            arrayList.add(0, Integer.valueOf(this.u[0]));
        }
        if (numArr[numArr.length - 1].intValue() != list.size() - 1) {
            treeSet.add(Integer.valueOf(list.size() - 1));
            if (numArr.length > this.u.length) {
                arrayList.add(arrayList.size() - 1, Integer.valueOf(this.u[this.u.length - 1]));
            }
        }
        ArrayList arrayList2 = new ArrayList(treeSet);
        int size = arrayList2.size();
        b bVar2 = new b(size);
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > arrayList.size() - 1) {
                bVar2.a(((Integer) arrayList2.get(i4)).intValue(), ((Integer) arrayList.get(arrayList.size() - 1)).intValue());
            } else {
                bVar2.a(((Integer) arrayList2.get(i4)).intValue(), ((Integer) arrayList.get(i4)).intValue());
            }
        }
        return bVar2;
    }

    private static float a(a aVar, a aVar2, GeoPoint geoPoint, a aVar3) {
        int latitudeE6;
        float f;
        float f2;
        int longitudeE6 = aVar.getLongitudeE6();
        int latitudeE62 = aVar.getLatitudeE6();
        int longitudeE62 = aVar2.getLongitudeE6();
        int latitudeE63 = aVar2.getLatitudeE6();
        int longitudeE63 = geoPoint.getLongitudeE6();
        int i = longitudeE62 - longitudeE6;
        int i2 = longitudeE63 - longitudeE6;
        int i3 = latitudeE63 - latitudeE62;
        int latitudeE64 = geoPoint.getLatitudeE6() - latitudeE62;
        float f3 = (i * i2) + (i3 * latitudeE64);
        if (f3 <= 0.0f) {
            aVar3.setLatitudeE6(aVar.getLatitudeE6());
            aVar3.setLongitudeE6(aVar.getLongitudeE6());
            aVar3.a = aVar.a;
            return (float) Math.hypot(i2, latitudeE64);
        }
        double d = (i * i) + (i3 * i3);
        double d2 = f3;
        if (d2 >= d) {
            aVar3.setLatitudeE6(aVar2.getLatitudeE6());
            aVar3.setLongitudeE6(aVar2.getLongitudeE6());
            aVar3.a = aVar2.a;
            return (float) Math.hypot(longitudeE63 - longitudeE62, latitudeE6 - latitudeE63);
        }
        float f4 = (float) (d2 / d);
        aVar3.setLongitudeE6(Math.round(longitudeE6 + (i * f4)));
        aVar3.setLatitudeE6(Math.round(latitudeE62 + (i3 * f4)));
        aVar3.a = aVar.a + ((aVar2.a - aVar.a) * f4);
        return (float) Math.hypot(longitudeE63 - f, latitudeE6 - f2);
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.en
    public final void j() {
        d();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColors(int[] iArr, int[] iArr2) {
        this.u = iArr;
        this.v = iArr2;
        this.y = a(PolylineOptions.ColorType.LINE_COLOR_NONE);
        this.I = true;
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final int[][] getColors() {
        if (this.u == null || this.v == null) {
            return null;
        }
        int[][] iArr = (int[][]) Array.newInstance(int.class, 2, Math.max(this.u.length, this.v.length));
        iArr[0] = this.u;
        iArr[1] = this.v;
        return iArr;
    }

    private int[] i() {
        return this.w;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void cleanTurnArrow() {
        if (this.a == null) {
            return;
        }
        this.a.d();
        d();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void arrowSpacing(int i) {
        if (this.P != i) {
            this.P = i;
            if (this.U != null) {
                this.U.arrowSpacing(i);
            }
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final List<LatLng> getPoints() {
        return this.V;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setWidth(float f) {
        if (f < 0.0f) {
            f = 1.0f;
        }
        if (f > 128.0f) {
            f = 128.0f;
        }
        setStrokeWidth(f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final float getWidth() {
        return this.d;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setBorderColors(int[] iArr) {
        if (this.w != iArr) {
            this.w = iArr;
            if (this.U != null) {
                this.U.borderColors(iArr);
            }
            q();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColor(int i) {
        setStrokeColor(i);
        if (this.U != null) {
            this.U.color(i);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void addTurnArrow(int i, int i2) {
        if (this.a == null) {
            return;
        }
        this.a.d();
        py pyVar = this.a;
        pyVar.s = new py.a();
        pyVar.s.a = i;
        pyVar.s.b = i2;
        pyVar.q();
        d();
    }

    private void a(Polyline polyline) {
        this.o = polyline;
    }

    private Polyline u() {
        return this.o;
    }

    private float v() {
        return this.C;
    }

    @Override // com.tencent.mapsdk.internal.ar
    public final void a(float f) {
        this.C = f;
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final PolylineOptions.Text getText() {
        return this.G;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setText(PolylineOptions.Text text) {
        if (this.G != text) {
            this.G = text;
            this.S = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.ar
    public final void a(int i, LatLng latLng) {
        GeoPoint from = GeoPoint.from(latLng);
        if (i == -1 || from == null) {
            return;
        }
        this.M = i;
        this.N = from;
        if (this.a != null) {
            this.a.a(this.M, this.N);
        }
        if (this.s != null) {
            this.s.v = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.ar
    public final void b(boolean z) {
        this.K = z;
        if (this.a != null) {
            this.a.a.E = z;
        }
        q();
    }

    private void c(boolean z) {
        this.L = z;
        q();
    }

    private void d(List<Integer> list) {
        this.Q = list;
        q();
    }

    private void b(float f) {
        this.r = f;
    }

    @Override // com.tencent.mapsdk.internal.ar
    public final Rect l_() {
        Rect rect;
        py pyVar = this.a;
        ArrayList<GeoPoint> arrayList = pyVar.a.l;
        if (arrayList != null && !arrayList.isEmpty() && pyVar.p >= 0 && pyVar.p < arrayList.size()) {
            List<GeoPoint> subList = arrayList.subList(pyVar.p, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                GeoPoint geoPoint = subList.get(0);
                int longitudeE6 = geoPoint.getLongitudeE6();
                int longitudeE62 = geoPoint.getLongitudeE6();
                int latitudeE6 = geoPoint.getLatitudeE6();
                int latitudeE62 = geoPoint.getLatitudeE6();
                int size = subList.size();
                for (int i = 0; i < size; i++) {
                    GeoPoint geoPoint2 = subList.get(i);
                    if (geoPoint2 != null) {
                        int latitudeE63 = geoPoint2.getLatitudeE6();
                        int longitudeE63 = geoPoint2.getLongitudeE6();
                        if (longitudeE63 < longitudeE6) {
                            longitudeE6 = longitudeE63;
                        } else if (longitudeE63 > longitudeE62) {
                            longitudeE62 = longitudeE63;
                        }
                        if (latitudeE63 < latitudeE62) {
                            latitudeE62 = latitudeE63;
                        } else if (latitudeE63 > latitudeE6) {
                            latitudeE6 = latitudeE63;
                        }
                    }
                }
                rect = new Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
            }
            if (rect != null) {
                pyVar.a.F = rect;
            }
        }
        return pyVar.a.F;
    }

    @Override // com.tencent.mapsdk.internal.ar
    public final void a(hw hwVar) {
        if (this.B != null) {
            this.B.b = false;
            this.B.a((hw.b) null);
        }
        if (hwVar instanceof hy) {
            a((hy) hwVar);
        } else if (hwVar instanceof hv) {
            a((hv) hwVar);
        } else {
            this.B = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.ar
    public final void a(boolean z) {
        c(z);
    }

    private void a(hy hyVar) {
        if (this.s == null) {
            return;
        }
        this.B = hyVar;
        GeoPoint from = GeoPoint.from(hyVar.i);
        this.D = a(from);
        if (this.D == null) {
            kj.c("Error, start point not found. [p=" + from + "] [offsetGeoPoints=" + this.p + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return;
        }
        hyVar.a(this.Z);
        hyVar.a((GeoPoint) null, (GeoPoint) null);
        this.s.v = true;
    }

    private void a(hv hvVar) {
        this.B = hvVar;
        this.B.a(this.Z);
        this.B.a((GeoPoint) null, (GeoPoint) null);
        if (this.s != null) {
            this.s.v = true;
        }
    }

    private a a(GeoPoint geoPoint) {
        a aVar = new a();
        a aVar2 = null;
        if (this.p != null && this.p.size() >= 2 && geoPoint != null) {
            a aVar3 = this.p.get(0);
            int i = 1;
            float f = Float.MAX_VALUE;
            while (i < this.p.size()) {
                a aVar4 = this.p.get(i);
                float a2 = a(aVar3, aVar4, geoPoint, aVar);
                if (a2 < f) {
                    f = a2;
                    aVar2 = aVar;
                    aVar = new a();
                }
                i++;
                aVar3 = aVar4;
            }
        }
        return aVar2;
    }

    private py w() {
        return this.a;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    public final List<Boundable<eq>> getGroupBounds() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.a);
        return arrayList;
    }

    private static int a(Context context, BitmapDescriptor bitmapDescriptor) {
        Bitmap bitmap;
        int height;
        if (context == null || bitmapDescriptor == null || (bitmap = bitmapDescriptor.getBitmap(context)) == null || (height = bitmap.getHeight()) <= 0) {
            return 0;
        }
        return (int) ((Math.pow(2.0d, 25.0d) / Math.pow(height, 2.0d)) / hc.a(context));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends GeoPoint {
        float a;
        int b;

        public a() {
            this.a = 0.0f;
            this.b = 0;
        }

        public a(GeoPoint geoPoint) {
            super(geoPoint);
            this.a = 0.0f;
            this.b = 0;
        }

        @Override // com.tencent.map.lib.models.GeoPoint
        public final String toString() {
            return super.toString() + CommonConstant.Symbol.COMMA + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b {
        int[] a;
        int[] b;
        int c;
        int d;

        b(int i) {
            this.d = i;
            this.a = new int[i];
            this.b = new int[i];
        }

        public final void a(int i, int i2) {
            if (this.c >= this.d) {
                return;
            }
            this.a[this.c] = i;
            this.b[this.c] = i2;
            this.c++;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setEraseable(boolean z) {
        this.K = z;
        if (this.a != null) {
            this.a.a.E = z;
        }
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final Rect getVisibleRect() {
        Rect rect;
        py pyVar = this.a;
        ArrayList<GeoPoint> arrayList = pyVar.a.l;
        if (arrayList != null && !arrayList.isEmpty() && pyVar.p >= 0 && pyVar.p < arrayList.size()) {
            List<GeoPoint> subList = arrayList.subList(pyVar.p, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                GeoPoint geoPoint = subList.get(0);
                int longitudeE6 = geoPoint.getLongitudeE6();
                int longitudeE62 = geoPoint.getLongitudeE6();
                int latitudeE6 = geoPoint.getLatitudeE6();
                int latitudeE62 = geoPoint.getLatitudeE6();
                int size = subList.size();
                for (int i = 0; i < size; i++) {
                    GeoPoint geoPoint2 = subList.get(i);
                    if (geoPoint2 != null) {
                        int latitudeE63 = geoPoint2.getLatitudeE6();
                        int longitudeE63 = geoPoint2.getLongitudeE6();
                        if (longitudeE63 < longitudeE6) {
                            longitudeE6 = longitudeE63;
                        } else if (longitudeE63 > longitudeE62) {
                            longitudeE62 = longitudeE63;
                        }
                        if (latitudeE63 < latitudeE62) {
                            latitudeE62 = latitudeE63;
                        } else if (latitudeE63 > latitudeE6) {
                            latitudeE6 = latitudeE63;
                        }
                    }
                }
                rect = new Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
            }
            if (rect != null) {
                pyVar.a.F = rect;
            }
        }
        return pyVar.a.F;
    }

    public final int hashCode() {
        return this.b_.hashCode();
    }
}
