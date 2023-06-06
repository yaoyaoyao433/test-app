package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.WindowManager;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.map.lib.models.AnnocationText;
import com.tencent.map.lib.models.AnnocationTextResult;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.IndoorCellInfo;
import com.tencent.map.lib.models.MaskLayer;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.map.lib.models.SubMarkerInfo;
import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.sh;
import com.tencent.mapsdk.internal.z;
import com.tencent.tencentmap.mapsdk.maps.CustomRender;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider;
import java.io.File;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mn extends br implements be, fg {
    private static final int K = 50;
    private static final int L = 6;
    private static final int N = 100;
    private static final int O = 100;
    private static final float P = 2.0f;
    public qz A;
    public boolean B;
    public Rect C;
    public int D;
    public int E;
    public CustomRender F;
    public oh G;
    public qh H;
    public List<of> I;
    public bi J;
    private final int M;
    private final LinkedBlockingQueue<a> Q;
    private nw R;
    private kw<Integer, Integer> S;
    private boolean T;
    private boolean U;
    private int V;
    private int W;
    private float X;
    private float Y;
    private boolean Z;
    private Rect aa;
    private boolean ab;
    private int ac;
    private String ad;
    public sh g;
    public ly h;
    public ad i;
    public qv j;
    public bj k;
    public mm l;
    public ba m;
    public eq n;
    public Rect o;
    public boolean p;
    public boolean q;
    public w r;
    public e s;
    public v t;
    public nr u;
    public volatile boolean v;
    public boolean w;
    public ns x;
    public c y;
    public d z;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(GL10 gl10);
    }

    @Override // com.tencent.mapsdk.internal.fg
    public final void d_() {
    }

    public static /* synthetic */ boolean e(mn mnVar) {
        mnVar.v = true;
        return true;
    }

    private sh F() {
        return this.g;
    }

    public mn(Context context, TencentMapOptions tencentMapOptions, bo boVar) {
        super(context, tencentMapOptions, boVar);
        this.v = false;
        this.w = true;
        this.T = true;
        this.B = true;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = 0.5f;
        this.Y = 0.5f;
        this.Z = true;
        this.D = 18;
        this.E = 14;
        this.m = (ba) boVar;
        this.J = new bi(this.m, this);
        this.g = new sh(context, this);
        this.t = new v(this);
        this.o = new Rect();
        this.k = new bj(this.J, this);
        this.m.a(this.k);
        this.H = new qh(getContext(), this);
        this.n = new y(this);
        this.i = new ad(this);
        this.g.f = this.i;
        this.h = new ly();
        this.l = new mm(this, this.g);
        this.s = new e(this, (byte) 0);
        this.Q = new LinkedBlockingQueue<>();
        this.I = new CopyOnWriteArrayList();
        if (getContext() != null) {
            this.M = (int) ((getContext().getResources().getDisplayMetrics().density * 6.0f) + 0.5d);
        } else {
            this.M = 6;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        if (this.o != null) {
            this.o.set(0, 0, width, height);
        }
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final Map<Class<? extends TencentMapComponent.Component>, Class<? extends TencentMapComponent.Component>> q() {
        HashMap hashMap = new HashMap();
        hashMap.put(dw.class, rf.class);
        return hashMap;
    }

    public final boolean a(Context context, nr nrVar, le leVar, nu nuVar) {
        this.u = nrVar;
        nw c2 = nrVar.c();
        this.R = c2;
        this.x = nrVar.e();
        this.r = new w(context, this, c2, this.x);
        if (this.j == null) {
            this.j = new qv(this, leVar);
        }
        boolean a2 = a(context, nuVar);
        if (a2) {
            if (this.a != null) {
                this.g.a(this.a.getTrafficStyle());
            }
            sh shVar = this.g;
            if (0 != shVar.e) {
                shVar.a(new sh.AnonymousClass121());
            }
            this.g.f(true);
            this.g.a(20);
            this.g.b(3);
            this.i.a(this);
            b(this.M, this.M);
        }
        return a2;
    }

    private boolean a(Context context, nu nuVar) {
        String c2 = this.R.c();
        String a2 = this.R.a();
        String b2 = this.R.b();
        try {
            if (!this.u.a()) {
                c2 = this.R.d();
            }
            String str = c2;
            kj.b(ki.f, "newEngine config:".concat(String.valueOf(str)));
            this.r.a();
            return this.g.a(context, nuVar, this.r, str, a2, b2);
        } finally {
            this.r.b();
        }
    }

    public final void a(nw nwVar) {
        if (nwVar == null) {
            return;
        }
        this.R = nwVar;
        if (this.g != null) {
            String c2 = this.R.c();
            String a2 = this.R.a();
            String b2 = this.R.b();
            kj.b(ki.f, "resetMapPath config:".concat(String.valueOf(c2)));
            if (hb.a(b2) || hb.a(a2)) {
                return;
            }
            try {
                this.r.a();
                sh shVar = this.g;
                shVar.a(new sh.AnonymousClass28(c2, a2, b2));
            } finally {
                this.r.b();
            }
        }
    }

    private boolean G() {
        if (this.g == null) {
            return false;
        }
        sh shVar = this.g;
        if (shVar.e == 0) {
            return false;
        }
        if (System.currentTimeMillis() - shVar.k > 560) {
            shVar.d.nativeClearDownloadURLCache(shVar.e);
            shVar.k = System.currentTimeMillis();
        }
        return shVar.d.nativeGenerateTextures(shVar.e);
    }

    private le H() {
        return this.u.d();
    }

    private ly I() {
        return this.h;
    }

    private void J() {
        if (this.g == null) {
            return;
        }
        this.v = true;
        this.B = true;
        f(this.B);
        if (!this.w) {
            ad adVar = this.i;
            if (adVar.o != null) {
                adVar.o.b();
            }
        } else {
            z zVar = this.i.o;
            if (zVar.d != null) {
                zVar.d.destroy();
            }
            zVar.d = new z.a();
            zVar.d.start();
            this.w = false;
        }
        if (this.m != null) {
            this.m.getMapRenderView().d();
        }
        if (this.p) {
            this.g.k();
        }
        if (this.q && this.j != null) {
            this.j.b();
        }
        if (this.A != null) {
            qz qzVar = this.A;
            qzVar.g = false;
            synchronized (qzVar.j) {
                qzVar.j.notifyAll();
            }
        }
    }

    private void K() {
        if (this.g == null) {
            return;
        }
        this.v = false;
        this.B = false;
        f(this.B);
        if (this.A != null) {
            this.A.g = true;
        }
        ad adVar = this.i;
        if (adVar.o != null) {
            adVar.o.a();
        }
        this.g.l();
        if (!this.q || this.j == null) {
            return;
        }
        this.j.a();
    }

    private void L() {
        if (!this.q || this.j == null) {
            return;
        }
        this.j.a();
    }

    private void M() {
        if (!this.q || this.j == null) {
            return;
        }
        this.j.b();
    }

    public final void z() {
        Context context;
        File[] listFiles;
        if (this.H != null) {
            qh qhVar = this.H;
            if (qhVar.g != null && !qhVar.g.isEmpty()) {
                for (qc qcVar : (qc[]) qhVar.g.values().toArray(new qc[qhVar.g.keySet().size()])) {
                    qcVar.remove();
                }
            }
        }
        if (getContext() != null) {
            File file = new File(mi.a(context, (TencentMapOptions) null).b().getPath() + "/tile/");
            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (File file2 : listFiles) {
                    if (currentTimeMillis - file2.lastModified() > TimeUnit.DAYS.toMillis(7L)) {
                        kc.b(file2);
                    }
                }
            }
        }
        a((od) null);
        this.G = null;
        this.i.b(this);
        this.I.clear();
        if (this.z != null) {
            d dVar = this.z;
            mn.this.b(dVar);
        }
        ad adVar = this.i;
        if (adVar.o != null) {
            z zVar = adVar.o;
            if (zVar.d != null) {
                zVar.d.destroy();
            }
        }
        this.w = true;
        if (this.A != null) {
            qz qzVar = this.A;
            qzVar.h = true;
            qzVar.f = false;
            synchronized (qzVar.j) {
                qzVar.j.notifyAll();
            }
        }
        if (this.k != null) {
            this.k.b();
        }
        if (this.j != null) {
            this.j.c();
        }
        if (this.g != null) {
            sh shVar = this.g;
            if (shVar.g != null) {
                shVar.g.b(shVar.h);
                shVar.g.a();
            }
            if (shVar.e != 0) {
                long j = shVar.e;
                shVar.e = 0L;
                synchronized (shVar.l) {
                    shVar.d.nativeDestroyEngine(j);
                }
            }
            shVar.j = null;
            shVar.d.destory();
        }
    }

    private void N() {
        if (this.g == null) {
            return;
        }
        a(new a() { // from class: com.tencent.mapsdk.internal.mn.1
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                if (mn.this.g != null) {
                    mn.this.h.a(gl10);
                }
            }
        });
    }

    public final void a(a aVar) {
        try {
            this.Q.put(aVar);
        } catch (InterruptedException e2) {
            kj.a(e2.getMessage(), e2);
            Thread.currentThread().interrupt();
        }
    }

    private void j(boolean z) {
        this.g.g(z);
    }

    @Override // com.tencent.mapsdk.internal.be
    public final ad a() {
        return this.i;
    }

    @Override // com.tencent.mapsdk.internal.be
    public final v e() {
        return this.t;
    }

    @Override // com.tencent.mapsdk.internal.be
    public final bj c() {
        return this.k;
    }

    @Override // com.tencent.mapsdk.internal.be
    public final sh f() {
        return this.g;
    }

    @Override // com.tencent.mapsdk.internal.be
    public final eq d() {
        return this.n;
    }

    @Override // com.tencent.mapsdk.internal.be
    public final Rect g() {
        return this.o;
    }

    @Override // com.tencent.mapsdk.internal.be
    public final float h() {
        if (getContext() == null) {
            return 1.0f;
        }
        return hc.a(getContext());
    }

    private w O() {
        return this.r;
    }

    private void P() {
        if (this.g == null || this.h == null) {
            return;
        }
        this.h.a();
    }

    private void c(int i, int i2) {
        if (this.g == null) {
            return;
        }
        this.v = true;
        this.o.set(0, 0, i, i2);
        a(0, 0, i, i2, false);
        this.i.n();
    }

    private void a(Rect rect) {
        if (this.o == null || rect == null) {
            return;
        }
        this.C = rect;
        a(rect.left, rect.bottom, (this.o.width() - rect.right) - rect.left, (this.o.height() - rect.bottom) - rect.top, true);
    }

    public final void a(int i, int i2, int i3, int i4, boolean z) {
        this.g.a(i, i2, i3, i4);
        this.V = i3;
        this.W = i4;
        if (z) {
            a(this.X, this.Y, this.Z);
        }
    }

    private Rect Q() {
        return this.C;
    }

    public final void a(float f2, float f3, boolean z) {
        this.X = f2;
        this.Y = f3;
        double d2 = f2;
        double d3 = f3;
        if (this.o != null) {
            if (this.W > 0) {
                d3 = 0.5d - (((0.5d - d3) * this.o.height()) / this.W);
            }
            if (this.V > 0) {
                d2 = 0.5d - (((0.5d - d2) * this.o.width()) / this.V);
            }
        }
        this.g.a((float) d2, (float) d3, z);
    }

    private void d(int i, int i2) {
        if (this.o != null) {
            this.o.set(0, 0, i, i2);
        }
    }

    private void b(GL10 gl10) {
        if (this.Q.size() == 0) {
            return;
        }
        boolean z = true;
        while (z) {
            a poll = this.Q.poll();
            if (poll != null) {
                try {
                    poll.a(gl10);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                z = false;
            }
        }
    }

    private boolean d(int i) {
        if (i == b.AboveToplayer.g && this.F != null) {
            this.F.onDrawFrame();
            return true;
        }
        return false;
    }

    public final boolean a(GL10 gl10) {
        Collection<mq> values;
        if (this.g == null) {
            return false;
        }
        bj bjVar = this.k;
        if (bjVar.i != null && (values = bjVar.i.values()) != null && !values.isEmpty()) {
            for (mq mqVar : values) {
                mqVar.d();
            }
        }
        this.i.o.g();
        if (this.Q.size() != 0) {
            boolean z = true;
            while (z) {
                a poll = this.Q.poll();
                if (poll != null) {
                    try {
                        poll.a(gl10);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    z = false;
                }
            }
        }
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass169());
        sh shVar2 = this.g;
        boolean z2 = ((Boolean) shVar2.a((CallbackRunnable<sh.AnonymousClass170>) new sh.AnonymousClass170(), (sh.AnonymousClass170) Boolean.FALSE)).booleanValue() || this.v;
        if (z2) {
            f c2 = this.s.c();
            if (c2 != null) {
                if (this.s != null && this.g.j()) {
                    this.s.a(gl10, this.l);
                }
            } else {
                this.k.d.h.a(gl10);
            }
            long currentTimeMillis = System.currentTimeMillis();
            sh shVar3 = this.g;
            ((Boolean) shVar3.a((CallbackRunnable<sh.AnonymousClass84>) new sh.AnonymousClass84(), (sh.AnonymousClass84) Boolean.FALSE)).booleanValue();
            this.v = false;
            if (!this.m.N()) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Object c3 = kn.c(km.X, "nativeTotalTime");
                long longValue = c3 != null ? ((Long) c3).longValue() : 0L;
                kn.a(km.X, "nativeTime", Long.valueOf(currentTimeMillis2));
                kn.a(km.X, "nativeTotalTime", Long.valueOf(longValue + currentTimeMillis2));
                kn.e(km.X);
            }
            if (!this.s.b() && c2 != null) {
                if (!c2.c()) {
                    if (this.g.j() || c2.e >= 100) {
                        c2.e = 0;
                        this.s.a(gl10);
                    } else {
                        c2.e++;
                    }
                } else {
                    c2.e = 0;
                }
            }
        }
        if (this.l != null) {
            this.l.a();
        }
        return z2;
    }

    private void R() {
        this.v = true;
    }

    private int S() {
        if (this.g != null) {
            return this.g.e();
        }
        return -1;
    }

    private void T() {
        if (this.g != null) {
            this.g.d();
        }
    }

    private void U() {
        if (this.g != null) {
            this.g.f();
        }
    }

    private boolean V() {
        return this.q;
    }

    private void a(qs qsVar) {
        if (this.j != null) {
            qv qvVar = this.j;
            if (qvVar.b == null || qsVar == null) {
                return;
            }
            qu quVar = qvVar.b;
            if (quVar.a == null || qsVar == null) {
                return;
            }
            quVar.a.add(qsVar);
        }
    }

    private void b(qs qsVar) {
        if (this.j != null) {
            qv qvVar = this.j;
            if (qvVar.b == null || qsVar == null) {
                return;
            }
            qu quVar = qvVar.b;
            if (quVar.a == null || qsVar == null) {
                return;
            }
            quVar.a.remove(qsVar);
        }
    }

    public final void a(boolean z) {
        if (this.j != null) {
            this.q = z;
            if (z) {
                if (this.g != null) {
                    sh shVar = this.g;
                    shVar.a(new sh.AnonymousClass96());
                }
                qv qvVar = this.j;
                if (qvVar.a != null) {
                    qvVar.a.i.a(qvVar);
                    if (qvVar.b == null) {
                        qvVar.b = new qu(qvVar.a, qvVar.c);
                    }
                    try {
                        qvVar.b.start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
            if (this.g != null) {
                sh shVar2 = this.g;
                shVar2.a(new sh.AnonymousClass97());
            }
            this.j.c();
        }
    }

    private void a(int[] iArr, int i, boolean z) {
        if (this.g == null || iArr == null || i == 0) {
            return;
        }
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass125(iArr, i, z));
    }

    private void a(int[] iArr, int i) {
        if (this.g == null || iArr == null || i == 0) {
            return;
        }
        this.g.a(iArr, i);
    }

    public final int a(PolygonInfo polygonInfo) {
        if (this.g == null || polygonInfo == null) {
            return -1;
        }
        sh shVar = this.g;
        int intValue = ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass46>) new sh.AnonymousClass46(polygonInfo), (sh.AnonymousClass46) 0)).intValue();
        if (this.S == null) {
            this.S = new kw<>();
        }
        this.S.a(Integer.valueOf(intValue), Integer.valueOf(polygonInfo.borderLineId));
        return intValue;
    }

    public final void b(PolygonInfo polygonInfo) {
        if (this.g == null || polygonInfo == null) {
            return;
        }
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass82(polygonInfo));
    }

    private void a(int i, boolean z) {
        if (this.g == null || this.S == null) {
            return;
        }
        Integer a2 = this.S.a((kw<Integer, Integer>) Integer.valueOf(i));
        int intValue = a2 != null ? a2.intValue() : 0;
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass83(i, intValue, z));
    }

    public final void a(int i) {
        if (this.g == null || this.S == null) {
            return;
        }
        Integer a2 = this.S.a((kw<Integer, Integer>) Integer.valueOf(i));
        int intValue = a2 != null ? a2.intValue() : 0;
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass85(i, intValue));
    }

    private Circle a(CircleOptions circleOptions) {
        if (this.J == null) {
            return null;
        }
        return this.J.a(circleOptions);
    }

    public final Polyline a(PolylineOptions polylineOptions) {
        if (this.J == null || polylineOptions == null) {
            return null;
        }
        return this.J.a(polylineOptions);
    }

    private Marker a(MarkerOptions markerOptions) {
        if (this.J == null || markerOptions == null) {
            return null;
        }
        return this.J.a(markerOptions);
    }

    private int a(int i, int i2, int i3, int i4, int i5, float f2) {
        if (this.g == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > 255) {
            i = 255;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > 255) {
            i2 = 255;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > 255) {
            i3 = 255;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > 255) {
            i4 = 255;
        }
        MaskLayer maskLayer = new MaskLayer();
        maskLayer.color = new int[]{i, i2, i3, 255 - i4};
        if (this.o != null) {
            maskLayer.width = this.o.width();
            maskLayer.height = this.o.height();
        }
        maskLayer.zIndex = f2;
        maskLayer.layer = i5;
        sh shVar = this.g;
        return ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass86>) new sh.AnonymousClass86(maskLayer), (sh.AnonymousClass86) 0)).intValue();
    }

    private void e(int i, int i2) {
        if (this.g == null) {
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > 255) {
            i2 = 255;
        }
        int i3 = 255 - i2;
        if (i3 == 0) {
            i3 = 1;
        }
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass87(i, i3));
    }

    private void e(int i) {
        if (this.g == null) {
            return;
        }
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass88(i));
    }

    private void a(List<MapRouteSection> list, List<GeoPoint> list2) {
        if (this.z == null) {
            this.z = new d();
        }
        d dVar = this.z;
        dVar.a = list;
        dVar.b = list2;
        mn.this.g.a(list, list2);
    }

    private void W() {
        if (this.z == null) {
            this.z = new d();
        }
        d dVar = this.z;
        mn.this.g.u();
        dVar.a = null;
        dVar.b = null;
    }

    private AnnocationTextResult a(AnnocationText annocationText) {
        sh shVar = this.g;
        return (AnnocationTextResult) shVar.a(new sh.AnonymousClass22(annocationText), (sh.AnonymousClass22) null);
    }

    private int b(fo foVar) {
        if (this.k == null || foVar.u == null) {
            return -1;
        }
        ni niVar = (ni) this.k.a((bj) a(foVar));
        if (niVar != null) {
            return niVar.c();
        }
        return -1;
    }

    private void c(fo foVar) {
        mp a2;
        if (this.k != null) {
            nk a3 = a(foVar);
            bj bjVar = this.k;
            int i = foVar.a;
            mq mqVar = bjVar.i.get(a3.getClass());
            if (mqVar == null || (a2 = mqVar.a(i)) == null) {
                return;
            }
            a2.a((mp) a3);
            mqVar.a(a2);
        }
    }

    private void f(int i) {
        mp a2;
        if (this.k == null || (a2 = this.k.a(ni.class, i)) == null) {
            return;
        }
        a2.remove();
    }

    public static nk a(fo foVar) {
        nk nkVar = new nk(foVar.u, foVar.b);
        if (!TextUtils.isEmpty(foVar.h)) {
            SubMarkerInfo subMarkerInfo = new SubMarkerInfo();
            subMarkerInfo.iconName(foVar.h);
            subMarkerInfo.iconWidth(foVar.i);
            subMarkerInfo.iconHeight(foVar.j);
            subMarkerInfo.avoidAnnotation(true);
            subMarkerInfo.avoidOtherMarker(true);
            nkVar.subMarkerInfo(subMarkerInfo);
        }
        nkVar.iconWidth(foVar.c);
        nkVar.iconHeight(foVar.d);
        nkVar.avoidAnnotation(true);
        nkVar.avoidOtherMarker(true);
        nkVar.scale(foVar.g, foVar.g);
        nkVar.priority(foVar.r);
        nkVar.displayLevel(2);
        nkVar.minScaleLevel(foVar.s);
        nkVar.maxScaleLevel(foVar.t);
        return nkVar;
    }

    private void f(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass53(i, i2));
    }

    private void g(int i) {
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass54(i));
    }

    private List<Integer> a(Rect rect, int i) {
        sh shVar = this.g;
        return (List) shVar.a(new sh.AnonymousClass23(rect, i), (sh.AnonymousClass23) null);
    }

    private boolean X() {
        if (this.g == null) {
            return false;
        }
        sh shVar = this.g;
        return ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass139>) new sh.AnonymousClass139(A()), (sh.AnonymousClass139) 0)).intValue() == 1;
    }

    private void h(int i) {
        if (this.g == null) {
            return;
        }
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass150(i));
    }

    public final String A() {
        return a(this.i.A.m);
    }

    public final String a(GeoPoint geoPoint) {
        return this.g == null ? "" : this.g.a(geoPoint);
    }

    private String[] Y() {
        Rect q = this.i.q();
        Point[] pointArr = {new Point(q.centerX(), q.centerY()), new Point(q.left, q.top), new Point(q.left, q.bottom), new Point(q.right, q.top), new Point(q.right, q.bottom)};
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 5; i++) {
            Point point = pointArr[i];
            String a2 = a(new GeoPoint(point.y, point.x));
            if (!hb.a(a2)) {
                hashSet.add(a2);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    public final void a(String str) {
        if (this.g != null) {
            sh shVar = this.g;
            if (shVar.e != 0) {
                shVar.a(new sh.AnonymousClass31(str));
            }
        }
    }

    public final void b(String str) {
        if (this.g != null) {
            this.ad = str;
            sh shVar = this.g;
            if (shVar.e != 0) {
                shVar.a(new sh.AnonymousClass32(str));
            }
        }
    }

    private static Point[] b(Rect rect) {
        return new Point[]{new Point(rect.centerX(), rect.centerY()), new Point(rect.left, rect.top), new Point(rect.left, rect.bottom), new Point(rect.right, rect.top), new Point(rect.right, rect.bottom)};
    }

    private void Z() {
        if (this.g != null) {
            this.g.k();
            this.p = true;
        }
    }

    private void aa() {
        if (this.g != null) {
            this.g.l();
            this.p = false;
        }
    }

    private boolean ab() {
        return this.p;
    }

    private boolean ac() {
        return this.U;
    }

    public final void b(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        if (this.g != null) {
            this.g.a(z);
        }
    }

    private void ad() {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass96());
        }
    }

    private void ae() {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass97());
        }
    }

    private boolean c(String str) {
        if (this.g == null) {
            return false;
        }
        sh shVar = this.g;
        return ((Boolean) shVar.a((CallbackRunnable<sh.AnonymousClass91>) new sh.AnonymousClass91(str), (sh.AnonymousClass91) Boolean.FALSE)).booleanValue();
    }

    private void a(er erVar, int i, int i2, fh fhVar) {
        Rect bound = erVar.getBound(this.n);
        if (erVar == null || bound == null || i <= 0 || i2 <= 0 || fhVar == null) {
            return;
        }
        this.s.a(erVar, bound, fhVar, i, i2);
    }

    private void a(er erVar, Rect rect, int i, int i2, fh fhVar) {
        if (erVar == null || rect == null || i <= 0 || i2 <= 0 || fhVar == null) {
            return;
        }
        this.s.a(erVar, rect, fhVar, i, i2);
    }

    private void a(Rect rect, int i, int i2, fh fhVar) {
        if (rect == null || i <= 0 || i2 <= 0 || fhVar == null) {
            return;
        }
        this.s.a(null, rect, fhVar, i, i2);
    }

    private void af() {
        this.s.a();
    }

    private void ag() {
        this.v = true;
    }

    public final void c(boolean z) {
        this.T = z;
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass116(z));
        }
    }

    private boolean ah() {
        return ((double) this.i.i()) > 1.0E-10d;
    }

    private void k(boolean z) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass116(z));
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass16(i2, i, i3, i4));
        }
    }

    public final void a(GeoPoint geoPoint, float f2, float f3, boolean z) {
        if (this.g != null) {
            this.g.a(geoPoint, f2, f3, z);
        }
    }

    public final void a(boolean z, boolean z2) {
        if (this.g != null) {
            sh shVar = this.g;
            if (0 == shVar.e || shVar.j == null) {
                return;
            }
            shVar.a(new sh.AnonymousClass119(false, z, false, z2));
        }
    }

    public final void a(float f2) {
        if (this.g != null) {
            this.g.a(f2);
        }
    }

    private void l(boolean z) {
        sh shVar = this.g;
        if (0 != shVar.e) {
            shVar.a(new sh.AnonymousClass149(z));
        }
    }

    private void a(Rect rect, Rect rect2, boolean z) {
        if (this.g != null) {
            this.g.a(rect, rect2, z);
        }
    }

    public final void d(boolean z) {
        if (this.g != null) {
            kj.b(ki.f, "setIndoorEnabled:".concat(String.valueOf(z)));
            this.g.c(z);
        }
    }

    private void i(int i) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass135(i));
        }
    }

    private String[] ai() {
        if (this.g != null) {
            sh shVar = this.g;
            return (String[]) shVar.a(new sh.AnonymousClass137(), (sh.AnonymousClass137) null);
        }
        return null;
    }

    private void a(List<IndoorCellInfo> list) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass76(list));
        }
    }

    private void aj() {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass77());
        }
    }

    private String ak() {
        if (this.g != null) {
            sh shVar = this.g;
            return (String) shVar.a(new sh.AnonymousClass141(), (sh.AnonymousClass141) null);
        }
        return null;
    }

    private String b(GeoPoint geoPoint) {
        if (this.g != null) {
            sh shVar = this.g;
            return (String) shVar.a(new sh.AnonymousClass142(geoPoint), (sh.AnonymousClass142) null);
        }
        return null;
    }

    private Rect al() {
        if (this.g != null) {
            sh shVar = this.g;
            return (Rect) shVar.a(new sh.AnonymousClass140(), (sh.AnonymousClass140) null);
        }
        return null;
    }

    private void m(boolean z) {
        if (this.g != null) {
            sh shVar = this.g;
            if (shVar.e != 0) {
                shVar.a(new sh.AnonymousClass145(z));
            }
        }
    }

    public final void a(String[] strArr) {
        if (this.g != null) {
            sh shVar = this.g;
            if (shVar.e != 0) {
                shVar.a(new sh.AnonymousClass146(strArr));
            }
        }
    }

    public final int a(String str, float f2, float f3) {
        if (this.g != null) {
            return this.g.a(str, f2, f3);
        }
        return 0;
    }

    private void j(int i) {
        if (this.g != null) {
            sh shVar = this.g;
            if (0 != shVar.e) {
                shVar.a(new sh.AnonymousClass148(i));
            }
        }
    }

    public final void e(boolean z) {
        if (this.g != null) {
            this.g.e(z);
        }
    }

    private void g(int i, int i2) {
        this.E = i;
        this.D = i2;
    }

    private void a(GeoPoint geoPoint, RectF rectF, boolean z) {
        if (rectF != null && this.C != null) {
            rectF.left -= this.C.left;
            rectF.top -= this.C.top;
            rectF.right -= this.C.right;
            rectF.bottom -= this.C.bottom;
        }
        if (this.g != null) {
            sh shVar = this.g;
            int i = this.E;
            int i2 = this.D;
            if (0 == shVar.e || shVar.j == null) {
                return;
            }
            shVar.j.a(new sh.AnonymousClass166(rectF, geoPoint, i, i2, z));
        }
    }

    public final void b(int i) {
        if (this.g != null) {
            this.g.a(i);
        }
        if (this.t != null) {
            this.t.b.o = i;
        }
    }

    private void k(int i) {
        if (this.g != null) {
            this.g.b(i);
        }
        if (this.t != null) {
            this.t.b.n = i;
        }
    }

    private void a(int i, int i2, int i3) {
        if (this.g != null) {
            sh shVar = this.g;
            if (0 == shVar.e || shVar.j == null) {
                return;
            }
            shVar.a(new sh.AnonymousClass160(i, i2, i3));
        }
    }

    public final void a(od odVar) {
        if (this.g != null) {
            this.g.i = odVar;
        }
    }

    @Deprecated
    private int a(TileOverlayCallback tileOverlayCallback, boolean z) {
        if (this.g != null) {
            return this.g.a(tileOverlayCallback, z);
        }
        return -1;
    }

    @Deprecated
    private void h(int i, int i2) {
        if (this.g != null) {
            this.g.b(i, i2);
        }
    }

    @Deprecated
    private void b(int i, int i2, int i3) {
        if (this.g == null) {
            return;
        }
        this.g.a(i, i2, i3);
    }

    @Deprecated
    private void l(int i) {
        if (this.g != null) {
            this.g.d(i);
            this.v = true;
        }
    }

    @Deprecated
    private void m(int i) {
        if (this.g != null) {
            this.g.e(i);
        }
    }

    @Deprecated
    private boolean am() {
        if (this.g != null) {
            return this.g.t();
        }
        return false;
    }

    @Deprecated
    private void n(boolean z) {
        if (this.g != null) {
            this.g.h(z);
        }
    }

    private void a(oe oeVar) {
        if (this.g != null) {
            this.g.d.setMapCallbackGetGLContext(oeVar);
        }
    }

    public final void a(int i, int i2) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass17(i, i2));
        }
    }

    private void i(int i, int i2) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass18(i, i2));
        }
    }

    private void o(boolean z) {
        ad adVar = this.i;
        adVar.G = z;
        adVar.z.f().b(adVar.G);
    }

    private void p(boolean z) {
        if (this.g != null) {
            this.g.b(z);
        }
        this.v = true;
    }

    public final void b(int i, int i2) {
        if (this.g != null) {
            this.g.a(i + 50, i2 + 50);
        }
    }

    private void d(String str) {
        if (this.g != null) {
            sh shVar = this.g;
            if (0 != shVar.e) {
                shVar.a(new sh.AnonymousClass129(str));
            }
        }
    }

    private void e(String str) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass25(str));
        }
    }

    private void a(int i, float f2) {
        if (this.g != null) {
            this.g.a(i, f2);
        }
    }

    public final void f(boolean z) {
        if (this.g == null) {
            return;
        }
        this.g.i(z);
    }

    private void a(Language language) {
        if (this.y == null) {
            this.y = new c();
        }
        c cVar = this.y;
        if (mn.this.g != null) {
            sh shVar = mn.this.g;
            shVar.a(new sh.AnonymousClass26(language.ordinal()));
            mn.this.v = true;
            mn.this.v = true;
            cVar.a(language);
        }
    }

    public final Language B() {
        if (this.y == null) {
            this.y = new c();
        }
        return this.y.a();
    }

    public final void a(fa faVar) {
        if (this.y == null) {
            this.y = new c();
        }
        this.y.a(faVar);
    }

    public final void a(of ofVar) {
        if (this.I != null) {
            this.I.add(ofVar);
        }
    }

    private void b(of ofVar) {
        if (this.I.isEmpty()) {
            return;
        }
        this.I.remove(ofVar);
    }

    public final void b(fa faVar) {
        if (this.y == null) {
            this.y = new c();
        }
        this.y.b(faVar);
    }

    public final TappedElement a(float f2, float f3) {
        if (this.g != null) {
            return this.g.a(f2, f3);
        }
        return null;
    }

    public final String toString() {
        return this.t != null ? this.t.toString() : "";
    }

    private mm an() {
        return this.l;
    }

    private float a(double d2, GeoPoint geoPoint) {
        if (geoPoint == null || this.t == null || this.n == null) {
            return 0.0f;
        }
        double metersPerPixel = this.n.metersPerPixel(geoPoint.getLatitudeE6() / 1000000.0d);
        if (metersPerPixel != 0.0d) {
            return (float) (d2 / metersPerPixel);
        }
        return 0.0f;
    }

    private qz ao() {
        return this.A;
    }

    public final void g(boolean z) {
        if (this.A == null) {
            this.A = new qz(this);
        }
        qz qzVar = this.A;
        qzVar.f = z;
        if (z) {
            try {
                synchronized (qzVar.j) {
                    qzVar.j.start();
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        qzVar.f = false;
        synchronized (qzVar.j) {
            qzVar.j.notifyAll();
        }
    }

    private nr ap() {
        return this.u;
    }

    private String aq() {
        return this.ad;
    }

    private void a(CustomRender customRender) {
        this.F = customRender;
        this.v = true;
    }

    private VectorHeatOverlay a(VectorHeatOverlayOptions vectorHeatOverlayOptions) {
        if (this.g == null) {
            return null;
        }
        if (this.d != null) {
            this.d.h().a();
        }
        return (VectorHeatOverlay) this.k.a((bj) new mu(vectorHeatOverlayOptions));
    }

    public final <V extends VectorOverlay> V a(VectorOverlayProvider vectorOverlayProvider) {
        if (this.g == null) {
            return null;
        }
        if (!(vectorOverlayProvider instanceof AggregationOverlayProvider)) {
            if (!(vectorOverlayProvider instanceof GradientVectorOverlayProvider)) {
                if (!(vectorOverlayProvider instanceof ArcLineOverlayProvider)) {
                    if (!(vectorOverlayProvider instanceof DotScatterPlotOverlayProvider)) {
                        if (!(vectorOverlayProvider instanceof BitmapScatterPlotOverlayProvider)) {
                            if (vectorOverlayProvider instanceof TrailOverlayProvider) {
                                if (this.d != null) {
                                    this.d.m().a++;
                                }
                                return (no) this.k.a((bj) new nq((TrailOverlayProvider) vectorOverlayProvider));
                            }
                            return null;
                        }
                        if (this.d != null) {
                            this.d.l().a++;
                        }
                        return (nl) this.k.a((bj) new nn(this.g.z(), (BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
                    }
                    if (this.d != null) {
                        this.d.k().a++;
                    }
                    return (nl) this.k.a((bj) new nn(this.g.z(), (DotScatterPlotOverlayProvider) vectorOverlayProvider));
                }
                if (this.d != null) {
                    this.d.j().a++;
                }
                return (mw) this.k.a((bj) new my((ArcLineOverlayProvider) vectorOverlayProvider));
            }
            if (this.d != null) {
                this.d.i().a++;
            }
            return (nc) this.k.a((bj) new ne((GradientVectorOverlayProvider) vectorOverlayProvider));
        }
        if (this.d != null) {
            this.d.h().a();
        }
        return (mt) this.k.a((bj) new mu((AggregationOverlayProvider) vectorOverlayProvider));
    }

    private void a(VectorOverlay vectorOverlay, VectorOverlayProvider vectorOverlayProvider) {
        if (this.g == null) {
            return;
        }
        if (vectorOverlayProvider instanceof AggregationOverlayProvider) {
            mt mtVar = (mt) this.k.a(mt.class, ((mt) vectorOverlay).c());
            if (mtVar != null) {
                mtVar.a((mt) new mu((AggregationOverlayProvider) vectorOverlayProvider));
            } else {
                a(vectorOverlayProvider);
            }
        } else if (vectorOverlayProvider instanceof GradientVectorOverlayProvider) {
            nc ncVar = (nc) this.k.a(nc.class, ((nc) vectorOverlay).c());
            if (ncVar != null) {
                ncVar.a((nc) new ne((GradientVectorOverlayProvider) vectorOverlayProvider));
            } else {
                a(vectorOverlayProvider);
            }
        } else if (vectorOverlayProvider instanceof ArcLineOverlayProvider) {
            mw mwVar = (mw) this.k.a(mw.class, ((mw) vectorOverlay).c());
            if (mwVar != null) {
                mwVar.a((mw) new my((ArcLineOverlayProvider) vectorOverlayProvider));
            } else {
                a(vectorOverlayProvider);
            }
        } else if (vectorOverlayProvider instanceof DotScatterPlotOverlayProvider) {
            nl nlVar = (nl) this.k.a(nl.class, ((nl) vectorOverlay).c());
            if (nlVar != null) {
                nlVar.a((nl) new nn(this.g.z(), (DotScatterPlotOverlayProvider) vectorOverlayProvider));
            } else {
                a(vectorOverlayProvider);
            }
        } else if (vectorOverlayProvider instanceof BitmapScatterPlotOverlayProvider) {
            nl nlVar2 = (nl) this.k.a(nl.class, ((nl) vectorOverlay).c());
            if (nlVar2 != null) {
                nlVar2.a((nl) new nn(this.g.z(), (BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
            } else {
                a(vectorOverlayProvider);
            }
        } else if (vectorOverlayProvider instanceof TrailOverlayProvider) {
            no noVar = (no) this.k.a(no.class, ((no) vectorOverlay).c());
            if (noVar != null) {
                noVar.a((no) new nq((TrailOverlayProvider) vectorOverlayProvider));
            } else {
                a(vectorOverlayProvider);
            }
        }
    }

    private GroundOverlay a(GroundOverlayOptions groundOverlayOptions) {
        if (this.g == null) {
            return null;
        }
        if (this.d != null) {
            this.d.n().a++;
        }
        return (GroundOverlay) this.k.a((bj) new nb(this.g.z(), groundOverlayOptions));
    }

    private IntersectionOverlay a(IntersectionOverlayOptions intersectionOverlayOptions) {
        if (this.g == null) {
            return null;
        }
        return (IntersectionOverlay) this.k.a((bj) new nh(intersectionOverlayOptions));
    }

    private static boolean n(int i) {
        return v.b(i);
    }

    @Override // com.tencent.mapsdk.internal.bn, com.tencent.mapsdk.internal.be
    public final boolean l() {
        return v.b(this.i.m());
    }

    public final void c(int i) {
        if (this.i != null) {
            this.i.b(i);
        }
    }

    public final bn C() {
        if (this.m == null) {
            return null;
        }
        return this.m.getMapContext();
    }

    private void o(int i) {
        sh shVar = this.g;
        shVar.a(new sh.AnonymousClass134(i));
    }

    private void a(OverSeaTileProvider overSeaTileProvider) {
        if (this.m == null) {
            return;
        }
        this.m.a(overSeaTileProvider);
    }

    private void a(TrafficStyle trafficStyle) {
        if (this.g == null) {
            return;
        }
        this.g.a(trafficStyle);
    }

    private bi ar() {
        return this.J;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum b {
        UnderMainMap(2),
        Under3DBuiding(4),
        UnderHandDraw(6),
        UnderPoi(8),
        UnderToplayer(10),
        AboveToplayer(12);
        
        public int g;

        b(int i) {
            this.g = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class e {
        private final ArrayList<f> b;
        private f c;

        /* synthetic */ e(mn mnVar, byte b) {
            this();
        }

        private e() {
            this.b = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(er erVar, Rect rect, fh fhVar, int i, int i2) {
            f fVar = new f(mn.this, erVar, rect, fhVar, i, i2, (byte) 0);
            synchronized (this.b) {
                this.b.add(fVar);
            }
            kj.a("snapshot addSnapshotRequest");
            mn.this.v = true;
        }

        private f d() {
            f fVar;
            synchronized (this.b) {
                fVar = this.b.size() > 0 ? this.b.get(0) : null;
            }
            return fVar;
        }

        public final synchronized void a() {
            kj.a("snapshot cancel");
            synchronized (this.b) {
                this.b.clear();
            }
            if (this.c != null) {
                f fVar = this.c;
                fVar.j = 1;
                fVar.e = 0;
            }
        }

        public final boolean b() {
            boolean z;
            synchronized (this.b) {
                z = this.b == null || this.b.isEmpty();
            }
            return z;
        }

        public final synchronized f c() {
            this.c = d();
            if (this.c == null) {
                return null;
            }
            if (!this.c.c()) {
                mn.this.i.e();
                Rect rect = this.c.i;
                int i = this.c.g;
                int i2 = this.c.h;
                Rect rect2 = new Rect();
                int a = (int) (hc.a(mn.this.getContext()) * 20.0f);
                int width = ((mn.this.o.width() - i) / 2) + a;
                rect2.right = width;
                rect2.left = width;
                int height = ((mn.this.o.height() - i2) / 2) + a;
                rect2.bottom = height;
                rect2.top = height;
                mn.this.i.c(rect, rect2);
                return this.c;
            }
            a(this.c);
            return null;
        }

        public final synchronized void a(GL10 gl10, mm mmVar) {
            if (mn.this.g == null) {
                return;
            }
            er erVar = this.c.f;
            if (erVar != null) {
                erVar.a(gl10);
            }
            mmVar.a();
        }

        public final synchronized void a(GL10 gl10) {
            if (this.c != null && !this.c.c()) {
                a(gl10, this.c.g, this.c.h);
                a(this.c);
            }
        }

        private void a(f fVar) {
            if (fVar == null || fVar.a()) {
                return;
            }
            fVar.b();
            synchronized (this.b) {
                this.b.remove(fVar);
            }
            mn.this.i.f();
        }

        private Bitmap a(GL10 gl10, int i, int i2) {
            int i3 = i * i2;
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            IntBuffer wrap = IntBuffer.wrap(iArr);
            wrap.position(0);
            gl10.glReadPixels((mn.this.o.width() - i) / 2, (mn.this.o.height() - i2) / 2, i, i2, 6408, 5121, wrap);
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = iArr[(i4 * i) + i5];
                    iArr2[(((i2 - i4) - 1) * i) + i5] = (i6 & (-16711936)) | ((i6 << 16) & 16711680) | ((i6 >> 16) & 255);
                }
            }
            try {
                return Bitmap.createBitmap(iArr2, i, i2, Bitmap.Config.RGB_565);
            } catch (OutOfMemoryError unused) {
                return Bitmap.createBitmap(iArr2, i, i2, Bitmap.Config.RGB_565);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class f {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        int e;
        er f;
        int g;
        int h;
        Rect i;
        int j;
        private fh l;

        /* synthetic */ f(mn mnVar, er erVar, Rect rect, fh fhVar, int i, int i2, byte b2) {
            this(erVar, rect, fhVar, i, i2);
        }

        private static /* synthetic */ int b(f fVar) {
            fVar.e = 0;
            return 0;
        }

        private static /* synthetic */ int c(f fVar) {
            int i = fVar.e;
            fVar.e = i + 1;
            return i;
        }

        private f(er erVar, Rect rect, fh fhVar, int i, int i2) {
            this.e = 0;
            this.f = erVar;
            this.i = rect;
            this.l = fhVar;
            this.g = i;
            this.h = i2;
            this.j = 0;
        }

        public final synchronized boolean a() {
            return this.j == 2;
        }

        public final synchronized void b() {
            this.j = 2;
            this.e = 0;
        }

        public final boolean c() {
            return this.j == 1;
        }

        private void d() {
            this.j = 1;
            this.e = 0;
        }

        private boolean e() {
            StringBuilder sb = new StringBuilder("is processing:");
            sb.append(this.j == 3);
            kj.a(sb.toString());
            return this.j == 3;
        }

        private void a(int i) {
            this.j = i;
        }
    }

    private void a(et etVar) {
        if (this.m != null) {
            this.m.a(etVar);
        }
    }

    private void b(et etVar) {
        if (this.m != null) {
            this.m.b(etVar);
        }
    }

    public final void h(boolean z) {
        if (this.g != null) {
            this.g.j(z);
        }
    }

    public final void i(boolean z) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass34(z));
        }
    }

    private void q(boolean z) {
        if (this.g != null) {
            sh shVar = this.g;
            shVar.a(new sh.AnonymousClass36(z));
        }
    }

    private void r(boolean z) {
        if (this.i != null) {
            this.i.L = z;
        }
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final String v() {
        if (this.g != null) {
            sh shVar = this.g;
            return (String) shVar.a((CallbackRunnable<sh.AnonymousClass37>) new sh.AnonymousClass37(), (sh.AnonymousClass37) "");
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final String w() {
        if (this.g != null) {
            sh shVar = this.g;
            return (String) shVar.a((CallbackRunnable<sh.AnonymousClass38>) new sh.AnonymousClass38(), (sh.AnonymousClass38) "");
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final bs y() {
        return this.g;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class c {
        private List<fa> b = new CopyOnWriteArrayList();

        public c() {
        }

        private void b(Language language) {
            if (mn.this.g != null) {
                sh shVar = mn.this.g;
                shVar.a(new sh.AnonymousClass26(language.ordinal()));
                mn.e(mn.this);
                mn.this.v = true;
                a(language);
            }
        }

        public final Language a() {
            if (mn.this.g != null) {
                if (mn.this.g.v() == 1) {
                    return Language.en;
                }
                return Language.zh;
            }
            return Language.zh;
        }

        public final void a(fa faVar) {
            if (faVar == null) {
                return;
            }
            synchronized (this.b) {
                if (!this.b.contains(faVar)) {
                    this.b.add(faVar);
                }
            }
        }

        public final void b(fa faVar) {
            if (faVar == null) {
                return;
            }
            this.b.remove(faVar);
        }

        public final synchronized void a(Language language) {
            for (fa faVar : this.b) {
                if (faVar != null) {
                    faVar.a(language);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class d implements fa {
        public List<MapRouteSection> a;
        public List<GeoPoint> b;

        public d() {
            mn.this.a(this);
        }

        private void a() {
            mn.this.b(this);
        }

        private void a(List<MapRouteSection> list, List<GeoPoint> list2) {
            this.a = list;
            this.b = list2;
            mn.this.g.a(list, list2);
        }

        private void b() {
            mn.this.g.u();
            this.a = null;
            this.b = null;
        }

        @Override // com.tencent.mapsdk.internal.fa
        public final void a(Language language) {
            if (language != Language.zh) {
                mn.this.g.u();
            } else if (this.a == null || this.b == null) {
            } else {
                mn.this.g.a(this.a, this.b);
            }
        }
    }

    @Deprecated
    private boolean as() {
        if (this.g != null) {
            return this.g.j();
        }
        return false;
    }

    public final void a(String str, String str2) {
        if (this.g == null) {
            return;
        }
        this.g.a(str, str2);
    }

    public final ArrayList<MapPoi> D() {
        if (this.g == null) {
            return null;
        }
        return this.g.w();
    }

    private int f(String str) {
        if (this.g == null) {
            return -1;
        }
        sh shVar = this.g;
        return ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass40>) new sh.AnonymousClass40(str), (sh.AnonymousClass40) (-1))).intValue();
    }

    private String at() {
        if (this.g == null) {
            return null;
        }
        sh shVar = this.g;
        return (String) shVar.a(new sh.AnonymousClass41(), (sh.AnonymousClass41) null);
    }

    private String au() {
        if (this.g == null) {
            return null;
        }
        return this.g.a();
    }

    public final boolean E() {
        if (this.g == null) {
            return false;
        }
        sh shVar = this.g;
        return ((Boolean) shVar.a((CallbackRunnable<sh.AnonymousClass43>) new sh.AnonymousClass43(1), (sh.AnonymousClass43) Boolean.FALSE)).booleanValue();
    }

    public final void a(LatLngBounds latLngBounds, int i) {
        if (this.g == null) {
            return;
        }
        if (latLngBounds == null || latLngBounds.isEmptySpan()) {
            this.g.a((double[]) null, (double[]) null, 0);
        } else {
            this.g.a(new double[]{latLngBounds.getLonWest(), latLngBounds.getLatSouth(), latLngBounds.getLonEast(), latLngBounds.getLatNorth()}, new double[]{0.0d, 0.0d, this.V, this.W}, i);
        }
    }

    private void a(oh ohVar) {
        this.G = ohVar;
    }

    private void av() {
        if (this.G != null) {
            this.G.m_();
        }
    }

    private void aw() {
        if (this.I == null || this.I.isEmpty()) {
            return;
        }
        for (of ofVar : this.I) {
            ofVar.h();
        }
    }

    private void ax() {
        if (this.I == null || this.I.isEmpty()) {
            return;
        }
        for (of ofVar : this.I) {
            ofVar.i();
        }
    }

    private qh ay() {
        return this.H;
    }

    private void g(String str) {
        if (this.x == null) {
            return;
        }
        this.x.a(str);
    }

    @Override // com.tencent.mapsdk.internal.be
    public final Object i() {
        return this.a.getExtSurface();
    }

    @Override // com.tencent.mapsdk.internal.be
    public final int j() {
        return this.a.getExtSurfaceWidth();
    }

    @Override // com.tencent.mapsdk.internal.be
    public final int k() {
        return this.a.getExtSurfaceHeight();
    }

    @Override // com.tencent.mapsdk.internal.be
    public final float m() {
        return this.a.getMapFrameRate();
    }

    @Override // com.tencent.mapsdk.internal.be
    public final boolean n() {
        return this.a.isOpaque();
    }
}
