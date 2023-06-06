package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.ReturnCallback;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.bh;
import com.tencent.mapsdk.internal.bn;
import com.tencent.mapsdk.internal.jy;
import com.tencent.mapsdk.internal.rl;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class so extends sw implements TencentMap.OnCameraChangeListener {
    public TencentMap.OnMapPoiClickListener A;
    public Handler B;
    public TencentMap.CancelableCallback C;
    public TencentMap.OnCompassClickedListener D;
    public bh.a E;
    public TencentMap.OnCameraChangeListener F;
    public TencentMap.OnCameraChangeListener G;
    public Handler H;
    public long I;
    public Bitmap.Config J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    protected boolean U;
    protected boolean V;
    protected boolean W;
    protected boolean X;
    protected boolean Y;
    public int Z;
    private final bb aJ;
    private pq aK;
    private final fe aL;
    private fi aM;
    private nr aN;
    private GeoPoint aO;
    private boolean aP;
    private volatile boolean aQ;
    private boolean aR;
    private int aS;
    private int aT;
    private float aU;
    private final et aV;
    private ft aW;
    private pn aX;
    public int aa;
    public boolean ab;
    public boolean ac;
    public LatLng ad;
    public LatLng ae;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public boolean am;
    public ao an;
    public boolean ao;
    public ox ap;
    public TencentMap.OnTrafficEventClickListener aq;
    public List<ao> ar;
    public List<MapPoi> as;
    public List<bd> at;
    public final byte[] g;
    public String h;
    public boolean i;
    public int j;
    public rm k;
    public qm l;
    public rg m;
    public pw n;
    public ab o;
    public AnimationListener p;
    public List<ez> q;
    public List<ff> r;
    public TencentMap.OnMapClickListener s;
    public bc t;
    public List<TencentMap.OnCameraChangeListener> u;
    public TencentMap.OnMapLongClickListener v;
    public TencentMap.OnDismissCallback w;
    protected TencentMap.OnIndoorStateChangeListener x;
    public TencentMap.OnMarkerClickListener y;
    public TencentMap.OnInfoWindowClickListener z;

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingFocused() {
        return false;
    }

    public so(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        super(context, tencentMapOptions, viewGroup);
        this.g = new byte[0];
        this.h = "";
        this.i = false;
        this.j = 22;
        this.k = null;
        this.l = null;
        this.o = null;
        this.p = null;
        this.q = new CopyOnWriteArrayList();
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = new CopyOnWriteArrayList();
        this.v = null;
        this.w = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.aK = new si(this);
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.J = Bitmap.Config.RGB_565;
        this.K = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.M = Integer.MIN_VALUE;
        this.N = Integer.MIN_VALUE;
        this.O = 0.5f;
        this.P = 0.5f;
        this.Q = 0.5f;
        this.R = 0.5f;
        this.aO = null;
        this.aP = false;
        this.S = true;
        this.aQ = false;
        this.aR = false;
        this.aS = 0;
        this.aT = 0;
        this.T = false;
        this.U = true;
        this.V = true;
        this.W = true;
        this.X = true;
        this.Y = true;
        this.Z = 19;
        this.aa = 3;
        this.aU = 0.0f;
        this.ab = true;
        this.ac = true;
        this.ad = null;
        this.ae = null;
        this.af = 0;
        this.ag = 0;
        this.ah = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = false;
        this.an = null;
        this.ao = false;
        this.ar = new ArrayList();
        this.as = new ArrayList();
        this.at = new ArrayList();
        this.aL = new st(this);
        this.aV = new sm(this);
        this.aK = new si(this);
        this.aM = new sk(this);
        this.aJ = new sj(this);
        int[] d = hc.d(G());
        this.ak = d[0];
        this.al = d[1];
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final void O() {
        super.O();
        if (this.f != null) {
            this.aP = this.f.isHandDrawMapEnable();
            this.am = this.f.isMultipleInfoWindowEnable();
        }
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.bo
    public final void P() {
        super.P();
        this.k = new rm(this);
        rm rmVar = this.k;
        Context context = this.e;
        OverSeaSource overSeaSource = OverSeaSource.DEFAULT;
        rmVar.b = new rl();
        rl rlVar = rmVar.b;
        if (context != null) {
            rlVar.i = overSeaSource;
            jy.a((jy.g) new rl.AnonymousClass2(context, overSeaSource)).a((jy.b.a) Boolean.FALSE, (jy.a<jy.b.a>) null);
        }
        this.Z = ((VectorMap) this.e_).p();
        this.aa = ((VectorMap) this.e_).o();
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final void Q() {
        super.Q();
        if (this.aP) {
            y();
        }
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onCreated() {
        super.onCreated();
        this.B = new sg(this, jy.a("gesture"));
        this.aX = new pn((be) this.d_);
        ((VectorMap) this.e_).a(this.aK);
        a(this.aV);
        ((VectorMap) this.e_).a(this.aJ);
        ((VectorMap) this.e_).a(this.aM);
        ((VectorMap) this.e_).a(this.aK);
        ((VectorMap) this.e_).a(this.aL);
        ((VectorMap) this.e_).a((es) this);
        this.o = new ab(this, S().c);
    }

    private rm ab() {
        return this.k;
    }

    public final void e(int i, int i2) {
        if (this.r != null) {
            int size = this.r.size();
            for (int i3 = 0; i3 < size; i3++) {
                ff ffVar = this.r.get(i3);
                if (ffVar != null) {
                    ffVar.b(i, i2);
                }
            }
        }
        if (this.d_ != 0) {
            Iterator<er> it = ((mn) this.d_).J.a.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.so$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements Callback<er> {
        final /* synthetic */ er[] a;
        final /* synthetic */ GL10 b;

        AnonymousClass1(er[] erVarArr, GL10 gl10) {
            this.a = erVarArr;
            this.b = gl10;
        }

        @Override // com.tencent.map.tools.Callback
        public final /* synthetic */ void callback(er erVar) {
            er erVar2 = erVar;
            if (erVar2 instanceof av) {
                if (TextUtils.equals(erVar2.getId(), so.this.h)) {
                    if (!erVar2.isVisible() && !so.this.T) {
                        erVar2.releaseData();
                        return;
                    } else {
                        this.a[0] = erVar2;
                        return;
                    }
                }
                erVar2.a(this.b);
            }
        }

        private void a(er erVar) {
            if (erVar instanceof av) {
                if (TextUtils.equals(erVar.getId(), so.this.h)) {
                    if (!erVar.isVisible() && !so.this.T) {
                        erVar.releaseData();
                        return;
                    } else {
                        this.a[0] = erVar;
                        return;
                    }
                }
                erVar.a(this.b);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(Handler handler, Bitmap.Config config, int i) {
        this.H = handler;
        this.J = config;
        if (i > 0) {
            this.I = System.currentTimeMillis() + i;
        } else {
            this.I = Long.MAX_VALUE;
        }
        H();
        F();
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final rl d() {
        return this.k.b;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(String str) {
        b(str);
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void b(String str) {
        synchronized (this.g) {
            this.h = str;
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final String e() {
        return this.h;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean a(float f, float f2) {
        String c;
        if (this.t != null && (c = c(f, f2)) != null && c.trim().length() != 0) {
            this.t.a(c);
            return true;
        } else if (this.v == null || !this.aw) {
            return false;
        } else {
            this.v.onMapLongClick(kb.a(((VectorMap) this.e_).getProjection().a(new fm(f, f2))));
            return false;
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(ff ffVar) {
        if (this.r == null) {
            this.r = new ArrayList();
        }
        if (this.r.contains(ffVar)) {
            return;
        }
        this.r.add(ffVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x029c  */
    /* JADX WARN: Type inference failed for: r3v28, types: [com.tencent.tencentmap.mapsdk.maps.model.Marker] */
    @Override // com.tencent.mapsdk.internal.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(final float r13, final float r14) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.so.b(float, float):boolean");
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(boolean z) {
        this.i = z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void b(boolean z) {
        this.V = z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void c(boolean z) {
        this.U = z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void d(boolean z) {
        this.W = z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void e(boolean z) {
        this.X = z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void f(boolean z) {
        this.Y = z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void g(boolean z) {
        this.aw = z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void h(boolean z) {
        if (this.S != z) {
            fs fsVar = new fs();
            fsVar.f = 2;
            for (ez ezVar : this.q) {
                ezVar.a(fsVar);
            }
        }
        this.S = z;
        ad adVar = ((VectorMap) this.e_).o.i;
        adVar.G = z;
        adVar.z.f().b(adVar.G);
        ((VectorMap) this.e_).n();
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean f() {
        return this.S;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean g() {
        return this.V;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean h() {
        return this.W;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean i() {
        return this.X;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean j() {
        return this.Y;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final String c(final float f, final float f2) {
        final String[] strArr = {null};
        synchronized (this.g) {
            Util.where(((mn) this.d_).J.b(), new ReturnCallback<Boolean, er>() { // from class: com.tencent.mapsdk.internal.so.4
                @Override // com.tencent.map.tools.ReturnCallback
                public final /* synthetic */ Boolean callback(er erVar) {
                    er erVar2 = erVar;
                    if (erVar2 == null || !erVar2.isVisible()) {
                        return Boolean.FALSE;
                    }
                    if (!(erVar2 instanceof aw)) {
                        return Boolean.FALSE;
                    }
                    if (!erVar2.onTap(f, f2)) {
                        return Boolean.FALSE;
                    }
                    strArr[0] = erVar2.getId();
                    return Boolean.TRUE;
                }

                private Boolean a(er erVar) {
                    if (erVar == null || !erVar.isVisible()) {
                        return Boolean.FALSE;
                    }
                    if (!(erVar instanceof aw)) {
                        return Boolean.FALSE;
                    }
                    if (!erVar.onTap(f, f2)) {
                        return Boolean.FALSE;
                    }
                    strArr[0] = erVar.getId();
                    return Boolean.TRUE;
                }
            });
        }
        return strArr[0];
    }

    private boolean ac() {
        return this.k.b.e;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(bc bcVar) {
        this.t = bcVar;
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.t != null) {
            this.t.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        super.onResume();
        this.aA = 0;
        this.az = false;
        if (Z()) {
            if (this.aE instanceof View) {
                if (this.ap == null) {
                    this.ap = new ox((View) this.aE, this);
                }
                this.ap.onTalkBackActivate(this.aE.getView());
            }
        } else if (this.ap != null) {
            this.ap.onTalkBackDeActivate(this.aE.getView());
            this.ap = null;
        }
        if (this.o != null) {
            ab abVar = this.o;
            if (abVar.g != null) {
                String buidlingId = abVar.g.getBuidlingId();
                int activeLevelIndex = abVar.g.getActiveLevelIndex();
                List<IndoorLevel> levels = abVar.g.getLevels();
                if (levels == null || activeLevelIndex >= levels.size()) {
                    return;
                }
                String name = levels.get(activeLevelIndex).getName();
                if (hb.a(buidlingId) || hb.a(name)) {
                    return;
                }
                abVar.e.a(buidlingId, name);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        super.onDestroy();
        ((VectorMap) this.e_).a((es) null);
        if (this.u != null) {
            this.u.clear();
        }
        if (this.ap != null) {
            ox oxVar = this.ap;
            ((VectorMap) oxVar.c.e_).b(oxVar);
            oxVar.accessibleTouchItems.clear();
            oxVar.a.clear();
            oxVar.b.clear();
        }
        this.A = null;
        this.aq = null;
        this.aR = true;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void k() {
        if (this.B != null) {
            this.B.removeCallbacksAndMessages(null);
        }
        if (this.H != null) {
            this.H.removeCallbacksAndMessages(null);
        }
        if (this.r != null) {
            this.r.clear();
            this.r = null;
        }
        l();
        this.s = null;
        this.z = null;
        this.v = null;
        this.D = null;
        this.p = null;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(TencentMapGestureListener tencentMapGestureListener) {
        if (this.av == null) {
            this.av = new TencentMapGestureListenerList();
        }
        this.av.addListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void b(TencentMapGestureListener tencentMapGestureListener) {
        if (this.av == null) {
            return;
        }
        this.av.removeListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void j(boolean z) {
        this.T = z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(int i) {
        this.aT = i;
        a(this.aS, i);
        F();
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(int i, int i2) {
        this.aS = i;
        this.aT = i2;
        ((VectorMap) this.e_).c(i, i2);
        F();
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(bh.a aVar) {
        this.E = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f4, code lost:
        r5 = com.tencent.mapsdk.internal.pa.a(r0.getId(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f2, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc A[EDGE_INSN: B:68:0x00fc->B:61:0x00fc ?: BREAK  , SYNTHETIC] */
    @Override // com.tencent.mapsdk.internal.ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.so.d(float, float):boolean");
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void n() {
        if (this.q.isEmpty()) {
            return;
        }
        fs fsVar = new fs();
        fsVar.f = 0;
        fsVar.g = this.ab;
        fsVar.h = this.ac;
        for (ez ezVar : this.q) {
            ezVar.a(fsVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(float f) {
        if (this.aU == f) {
            return;
        }
        this.aU = f;
        if (this.q.isEmpty()) {
            return;
        }
        fs fsVar = new fs();
        fsVar.f = 1;
        fsVar.i = ((VectorMap) this.e_).r();
        fsVar.j = ((VectorMap) this.e_).getProjection().a(new Point(0, this.al / 2), new Point(this.ak, this.al / 2));
        for (ez ezVar : this.q) {
            ezVar.a(fsVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean o() {
        return this.ab;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean p() {
        return this.ac;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final pw q() {
        return this.n;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final ab r() {
        return this.o;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        if (this.aO == null) {
            GeoPoint q = ((VectorMap) this.e_).q();
            this.aO = new GeoPoint(q.getLatitudeE6(), q.getLongitudeE6());
        }
        this.aO.setLatitudeE6(i);
        this.aO.setLongitudeE6(i2);
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final GeoPoint s() {
        if (this.aO == null) {
            if (this.K == Integer.MIN_VALUE) {
                this.K = this.ak / 2;
            }
            if (this.L == Integer.MIN_VALUE) {
                this.L = this.al / 2;
            }
            this.aO = ((VectorMap) this.e_).getProjection().a(new fm(this.K, this.L));
        }
        return this.aO;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final int t() {
        return this.M;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final int u() {
        return this.N;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final int v() {
        return this.K;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final int w() {
        return this.L;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void c(int i, int i2) {
        this.K = i;
        this.L = i2;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void d(int i, int i2) {
        this.M = i;
        this.N = i2;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(ez ezVar) {
        this.q.remove(ezVar);
        this.q.add(ezVar);
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void b(ez ezVar) {
        this.q.remove(ezVar);
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(TencentMap.OnDismissCallback onDismissCallback) {
        this.w = onDismissCallback;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.x = onIndoorStateChangeListener;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.A = onMapPoiClickListener;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean x() {
        return this.aQ;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(rg rgVar) {
        this.m = rgVar;
    }

    private rg ad() {
        return this.m;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(pw pwVar) {
        this.n = pwVar;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void y() {
        if (this.l == null) {
            this.l = new qm(this);
        }
        this.l.a();
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void z() {
        if (this.l == null) {
            return;
        }
        this.l.b();
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean A() {
        return (this.l == null || this.l.b == null) ? false : true;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean B() {
        return this.ao;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void k(boolean z) {
        this.ao = z;
    }

    private void b(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        this.F = onCameraChangeListener;
    }

    private void c(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        this.G = onCameraChangeListener;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.u != null && onCameraChangeListener != null) {
            this.u.add(onCameraChangeListener);
        }
        if (!(onCameraChangeListener == null) || this.k.b.e) {
            ((VectorMap) this.e_).a(this.aJ);
        } else {
            ((VectorMap) this.e_).a((bb) null);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final pn M() {
        return this.aX;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(OverSeaTileProvider overSeaTileProvider) {
        if (this.k != null) {
            rm rmVar = this.k;
            if (rmVar.c != overSeaTileProvider) {
                kj.c(ki.h, "设置自定义海外图源，old[" + rmVar.c + "] to new[" + overSeaTileProvider + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                rmVar.c = overSeaTileProvider;
                rmVar.e = true;
                rmVar.b.k = rmVar.c;
                List<rp> c = rmVar.b.c();
                if (rmVar.a != null) {
                    rmVar.a.a(false, c);
                }
                rmVar.a();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.sx.m
    public final void a(GL10 gl10, EGLConfig eGLConfig) {
        kn.b(km.X);
        super.a(gl10, eGLConfig);
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.sx.m
    public final void a(GL10 gl10, int i, int i2) {
        super.a(gl10, i, i2);
        this.ak = i;
        this.al = i2;
        c((int) (this.ak * this.O), (int) (this.al * this.P));
        d((int) (this.ak * this.Q), (int) (this.al * this.R));
        if (this.E != null) {
            this.E.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.sx.m
    public final void T() {
        super.T();
        kn.d(km.X);
    }

    private void a(Handler handler, GL10 gl10) {
        if (this.m != null) {
            this.m.l();
        }
        b(handler, gl10);
        if (this.m != null) {
            this.m.m();
        }
    }

    private void b(TencentMapOptions tencentMapOptions) {
        String str;
        Context applicationContext = G().getApplicationContext();
        String str2 = S().c;
        this.aN = new sr(this, str2);
        this.aN.b();
        pi.a(applicationContext, str2);
        a(this.aN, qr.c());
        dh dhVar = (dh) ck.a(dh.class);
        VectorMap vectorMap = (VectorMap) this.e_;
        StringBuilder sb = new StringBuilder();
        String i = dhVar.i();
        if (TextUtils.isEmpty(i)) {
            str = null;
        } else {
            String j = dhVar.j();
            if (!TextUtils.isEmpty(j)) {
                sb.append(j);
                sb.append("://");
            }
            sb.append(i);
            str = sb.toString();
        }
        vectorMap.o.a(str);
        dn dnVar = (dn) ck.a(dn.class);
        String satelliteVersion = tencentMapOptions != null ? tencentMapOptions.getSatelliteVersion() : null;
        if (TextUtils.isEmpty(satelliteVersion)) {
            satelliteVersion = "0";
        }
        String satelliteUrl = ((cz) dnVar.h()).satelliteUrl("%d", "%d", "%d", satelliteVersion);
        if (!dnVar.c || TextUtils.isEmpty(satelliteUrl)) {
            return;
        }
        kj.c(ki.f, "satelliteUrl = ".concat(String.valueOf(satelliteUrl)));
        ((VectorMap) this.e_).o.b(satelliteUrl);
    }

    private void b(Handler handler, GL10 gl10) {
        if (gl10 == null || handler == null) {
            return;
        }
        int i = this.ak;
        int i2 = this.al;
        int i3 = i * i2;
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        gl10.glReadPixels(0, 0, i, i2, 6408, 5121, wrap);
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = iArr[(i4 * i) + i5];
                iArr2[(((i2 - i4) - 1) * i) + i5] = (i6 & (-16711936)) | ((i6 << 16) & 16711680) | ((i6 >> 16) & 255);
            }
        }
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(iArr2, i, i2, this.J);
        } catch (OutOfMemoryError unused) {
        }
        if (this.aE != null && !(this.aE instanceof sy) && this.m.k()) {
            bitmap = a(bitmap, this.m.j());
        }
        handler.sendMessage(handler.obtainMessage(0, bitmap));
    }

    private Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new Matrix(), null);
        canvas.drawBitmap(bitmap2, this.m.a().left, this.m.a().top, (Paint) null);
        return createBitmap;
    }

    public final ft U() {
        fu[] W = W();
        fu b = y.b(((VectorMap) this.e_).q());
        float r = ((VectorMap) this.e_).r();
        if (this.aW == null) {
            this.aW = new ft(b, W, r);
        } else {
            this.aW.a(b, W, r);
        }
        return this.aW;
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final void m(boolean z) {
        super.m(z);
        V();
    }

    private boolean a(fu[] fuVarArr) {
        fu[] W = W();
        if (W == null || fuVarArr == null) {
            return true;
        }
        return rj.a(W, fuVarArr);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public void onCameraChange(final CameraPosition cameraPosition) {
        this.ay = false;
        this.az = true;
        jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.so.5
            @Override // java.lang.Runnable
            public final void run() {
                if (so.this.u != null) {
                    for (TencentMap.OnCameraChangeListener onCameraChangeListener : so.this.u) {
                        if (onCameraChangeListener != null) {
                            onCameraChangeListener.onCameraChange(cameraPosition);
                        }
                    }
                }
                if (so.this.F != null) {
                    so.this.F.onCameraChange(cameraPosition);
                }
                if (so.this.G != null) {
                    so.this.G.onCameraChange(cameraPosition);
                }
            }
        });
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public void onCameraChangeFinished(final CameraPosition cameraPosition) {
        if (this.aA == 0 && this.ay) {
            this.az = false;
            jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.so.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (so.this.u != null) {
                        for (TencentMap.OnCameraChangeListener onCameraChangeListener : so.this.u) {
                            if (onCameraChangeListener != null) {
                                onCameraChangeListener.onCameraChangeFinished(cameraPosition);
                            }
                        }
                    }
                    if (so.this.F != null) {
                        so.this.F.onCameraChangeFinished(cameraPosition);
                    }
                    if (so.this.G != null) {
                        so.this.G.onCameraChangeFinished(cameraPosition);
                    }
                }
            });
        }
    }

    private List<ao> ae() {
        this.ar.clear();
        fu[] fuVarArr = {y.b(((VectorMap) this.e_).getProjection().a(new fm(0.0d, 0.0d))), y.b(((VectorMap) this.e_).getProjection().a(new fm(X(), Y())))};
        for (er erVar : this.aB.J.b) {
            if (erVar instanceof aw) {
                ao aoVar = ((aw) erVar).a;
                if (a(aoVar.getPosition(), fuVarArr)) {
                    this.ar.add(aoVar);
                }
            }
        }
        return this.ar;
    }

    private List<MapPoi> af() {
        this.as.clear();
        VectorMap vectorMap = (VectorMap) this.e_;
        this.as = vectorMap.o == null ? null : vectorMap.o.D();
        return this.as;
    }

    public static boolean a(LatLng latLng, fu[] fuVarArr) {
        if (latLng == null) {
            return false;
        }
        fu b = y.b(GeoPoint.from(latLng));
        return b.c >= fuVarArr[0].c && b.c <= fuVarArr[1].c && b.b <= fuVarArr[0].b && b.b >= fuVarArr[1].b;
    }

    private fu[] ag() {
        return new fu[]{y.b(((VectorMap) this.e_).getProjection().a(new fm(0.0d, 0.0d))), y.b(((VectorMap) this.e_).getProjection().a(new fm(X(), Y())))};
    }

    private void ah() {
        if (Z()) {
            if (this.aE instanceof View) {
                if (this.ap == null) {
                    this.ap = new ox((View) this.aE, this);
                }
                this.ap.onTalkBackActivate(this.aE.getView());
            }
        } else if (this.ap != null) {
            this.ap.onTalkBackDeActivate(this.aE.getView());
            this.ap = null;
        }
    }

    private void a(ot otVar) {
        if (this.ap != null) {
            this.ap.a(otVar);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (this.ap != null) {
            return this.ap.dispatchHoverEvent(motionEvent);
        }
        return false;
    }

    private void a(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        this.aq = onTrafficEventClickListener;
    }

    private void a(bd bdVar) {
        this.at.remove(bdVar);
        this.at.add(bdVar);
    }

    private void b(bd bdVar) {
        this.at.remove(bdVar);
    }

    public final void a(final boolean z, final List<rp> list) {
        jy.b(new Runnable() { // from class: com.tencent.mapsdk.internal.so.7
            @Override // java.lang.Runnable
            public final void run() {
                for (bd bdVar : so.this.at) {
                    bdVar.a(z, list);
                }
            }
        });
    }

    private boolean a(ay ayVar, float f, float f2) {
        if (!ayVar.isClickable() || this.aG == null) {
            return false;
        }
        this.aG.onPolylineClick(ayVar, ((mn) this.d_).n.fromScreenLocation(new Point((int) f, (int) f2)));
        return true;
    }

    private boolean a(ax axVar, float f, float f2) {
        if (!axVar.isClickable() || this.aH == null) {
            return false;
        }
        this.aH.onPolygonClick(axVar, ((mn) this.d_).n.fromScreenLocation(new Point((int) f, (int) f2)));
        return true;
    }

    private static boolean a(er erVar, float f, float f2) {
        if (erVar != null && erVar.isVisible() && erVar.handleOnTap()) {
            return erVar.onTap(f, f2);
        }
        return false;
    }

    private boolean ai() {
        if (this.B == null || !this.B.getLooper().getThread().isAlive()) {
            return false;
        }
        this.B.sendEmptyMessage(0);
        return true;
    }

    public final boolean n(boolean z) {
        if (this.B == null || !this.B.getLooper().getThread().isAlive()) {
            return false;
        }
        kj.b(ki.f, "send onStable Event");
        this.B.sendEmptyMessage(z ? 2 : 1);
        return true;
    }

    public final bn.b S() {
        return ((mn) this.d_).u();
    }

    private void b(GL10 gl10) {
        bi biVar;
        if (this.d_ == 0 || (biVar = ((mn) this.d_).J) == null) {
            return;
        }
        synchronized (this.g) {
            er[] erVarArr = {null};
            Util.foreach(biVar.b(), new AnonymousClass1(erVarArr, gl10));
            if (erVarArr[0] != null) {
                erVarArr[0].a(gl10);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.es
    public final void R() {
        ad adVar = ((VectorMap) this.e_).o.i;
        adVar.o();
        adVar.j();
        if (this.D != null) {
            this.D.onCompassClicked();
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final CameraPosition a() {
        VectorMap vectorMap = (VectorMap) this.e_;
        GeoPoint q = vectorMap.q();
        if (q != null) {
            if ((this.u == null || this.u.size() <= 0) && this.aV == null) {
                return null;
            }
            LatLng a = kb.a(q);
            float t = vectorMap.t();
            if (t < 0.0f) {
                t = (t % 360.0f) + 360.0f;
            }
            return CameraPosition.builder().zoom(vectorMap.o.t.a()).target(a).bearing(t).tilt(vectorMap.u()).build();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(TencentMapOptions tencentMapOptions) {
        String str;
        Context applicationContext = G().getApplicationContext();
        String str2 = S().c;
        this.aN = new sr(this, str2);
        this.aN.b();
        pi.a(applicationContext, str2);
        a(this.aN, qr.c());
        dh dhVar = (dh) ck.a(dh.class);
        VectorMap vectorMap = (VectorMap) this.e_;
        StringBuilder sb = new StringBuilder();
        String i = dhVar.i();
        if (TextUtils.isEmpty(i)) {
            str = null;
        } else {
            String j = dhVar.j();
            if (!TextUtils.isEmpty(j)) {
                sb.append(j);
                sb.append("://");
            }
            sb.append(i);
            str = sb.toString();
        }
        vectorMap.o.a(str);
        dn dnVar = (dn) ck.a(dn.class);
        String satelliteVersion = tencentMapOptions != null ? tencentMapOptions.getSatelliteVersion() : null;
        if (TextUtils.isEmpty(satelliteVersion)) {
            satelliteVersion = "0";
        }
        String satelliteUrl = ((cz) dnVar.h()).satelliteUrl("%d", "%d", "%d", satelliteVersion);
        if (dnVar.c && !TextUtils.isEmpty(satelliteUrl)) {
            kj.c(ki.f, "satelliteUrl = ".concat(String.valueOf(satelliteUrl)));
            ((VectorMap) this.e_).o.b(satelliteUrl);
        }
        if (!((VectorMap) this.e_).o.q) {
            ((VectorMap) this.e_).setMapStyle(0);
        } else {
            ((VectorMap) this.e_).setMapStyle(5);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final or c(String str) {
        if (this.d_ != 0) {
            er a = ((mn) this.d_).J.a(str);
            if (a instanceof av) {
                ap f_ = ((av) a).f_();
                if (f_ instanceof or) {
                    return (or) f_;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void i(boolean z) {
        if (!z || this.k.b.e) {
            ((VectorMap) this.e_).a(this.aJ);
        } else {
            ((VectorMap) this.e_).a((bb) null);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean d(String str) {
        ap f_;
        if (str == null) {
            return false;
        }
        bi biVar = this.aB.J;
        er remove = biVar.a.remove(str);
        if (remove != null) {
            biVar.b.remove(remove);
            biVar.c.remove(remove);
            biVar.d.remove(remove);
            if ((remove instanceof av) && (f_ = ((av) remove).f_()) != null) {
                biVar.e.remove(f_);
            }
        }
        boolean z = remove != null;
        if (z) {
            ((VectorMap) this.e_).n();
        }
        return z;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void m() {
        int r = ((VectorMap) this.e_).r();
        this.ab = true;
        this.ac = true;
        if (r <= this.aa) {
            this.ac = false;
        } else if (r >= this.Z) {
            this.ab = false;
        }
        if (this.q.isEmpty()) {
            return;
        }
        fs fsVar = new fs();
        fsVar.f = 0;
        fsVar.g = this.ab;
        fsVar.h = this.ac;
        for (ez ezVar : this.q) {
            ezVar.a(fsVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean e(float f, float f2) {
        IndoorMapPoi indoorMapPoi;
        TappedElement a = ((VectorMap) this.e_).a(f, f2);
        if (a != null) {
            int i = a.type;
            if (i == 4) {
                mn mnVar = this.aB;
                if (mnVar == null || mnVar.A == null) {
                    return false;
                }
                TrafficEvent a2 = mnVar.A.a((int) a.itemId);
                if (this.aq == null || a2 == null) {
                    return false;
                }
                this.aq.onTrafficEventClicked(a2);
                return true;
            }
            if (i != 8) {
                switch (i) {
                    case 0:
                        return false;
                    case 1:
                        if (this.A != null) {
                            if (a.itemType == 1) {
                                IndoorMapPoi indoorMapPoi2 = new IndoorMapPoi();
                                indoorMapPoi2.buildingName = a.buildingName;
                                indoorMapPoi2.buildingId = a.buildingId;
                                indoorMapPoi2.floorName = a.floorName;
                                indoorMapPoi = indoorMapPoi2;
                            } else {
                                indoorMapPoi = new MapPoi();
                            }
                            indoorMapPoi.name = a.name;
                            indoorMapPoi.position = kb.a(a.pixelX, a.pixelY).toLatLng();
                            indoorMapPoi.poiId = a.poiId;
                            this.A.onClicked(indoorMapPoi);
                            break;
                        }
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean a(TappedElement tappedElement) {
        mn mnVar = this.aB;
        if (mnVar == null || mnVar.A == null) {
            return false;
        }
        TrafficEvent a = mnVar.A.a((int) tappedElement.itemId);
        if (this.aq == null || a == null) {
            return false;
        }
        this.aq.onTrafficEventClicked(a);
        return true;
    }

    @Override // com.tencent.mapsdk.internal.sw, com.tencent.mapsdk.internal.sx.m
    public final boolean a(GL10 gl10) {
        bi biVar;
        boolean z = false;
        if (this.d_ != 0 && (biVar = ((mn) this.d_).J) != null) {
            synchronized (this.g) {
                er[] erVarArr = {null};
                Util.foreach(biVar.b(), new AnonymousClass1(erVarArr, gl10));
                if (erVarArr[0] != null) {
                    erVarArr[0].a(gl10);
                }
            }
        }
        boolean a = super.a(gl10);
        if (this.H != null && System.currentTimeMillis() > this.I) {
            kj.b(ki.f, "snapShot : 1");
            a(this.H, gl10);
            this.H = null;
        }
        if ((this.H != null || !this.ax) && this.e_ != 0 && ((VectorMap) this.e_).n && this.k != null && this.k.d) {
            if (this.aB != null) {
                mn mnVar = this.aB;
                if (mnVar.g != null ? mnVar.g.j() : false) {
                    z = true;
                }
            }
            if (z) {
                if (!this.ax) {
                    n(true);
                }
                kj.b(ki.f, "snapShot : 2");
                a(this.H, gl10);
                this.H = null;
            }
        }
        return a;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void l() {
        this.aB.J.a();
    }

    public final void V() {
        C c = this.d_;
        if (c != 0) {
            rj.a();
            c.e = !a(rj.c(rj.f));
            if (this.k != null) {
                this.k.b();
            }
            boolean l = c.l();
            if (this.m != null) {
                ft U = U();
                if (c.e && !c.f) {
                    rj.a();
                    U = new ft(y.b(new GeoPoint(new LatLng(39.908823d, 116.39747d))), rj.c(rj.f), 18.0f);
                }
                this.m.a(U, l);
                this.m.a(l);
            }
        }
    }

    public final fu[] W() {
        eq projection = ((VectorMap) this.e_).getProjection();
        if (projection == null) {
            return null;
        }
        fu[] fuVarArr = new fu[4];
        fm[] fmVarArr = new fm[4];
        float f = this.ak;
        float f2 = this.al;
        if (f <= 2.0f || f2 <= 2.0f) {
            return null;
        }
        fmVarArr[0] = new fm(0.0d, 0.0d);
        double d = f;
        fmVarArr[1] = new fm(d, 0.0d);
        double d2 = f2;
        fmVarArr[2] = new fm(d, d2);
        fmVarArr[3] = new fm(0.0d, d2);
        for (int i = 0; i < 4; i++) {
            fuVarArr[i] = y.b(projection.a(fmVarArr[i]));
        }
        return fuVarArr;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        return ((mn) this.d_).J.a(indoorBuilding);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingDeactivated() {
        return ((mn) this.d_).J.a((IndoorBuilding) null);
    }

    private boolean f(float f, float f2) {
        bi biVar = this.aB.J;
        List<er> list = biVar.b;
        boolean z = false;
        er erVar = null;
        boolean z2 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            erVar = list.get(size);
            z2 = a(erVar, f, f2);
            if (z2) {
                break;
            }
        }
        if (!z2) {
            List<er> list2 = biVar.c;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                erVar = list2.get(size2);
                z2 = a(erVar, f, f2);
                if (z2) {
                    break;
                }
            }
        }
        if (!z2) {
            ArrayList arrayList = new ArrayList();
            for (er erVar2 : biVar.a.values()) {
                if (erVar2 instanceof ax) {
                    arrayList.add((ax) erVar2);
                }
            }
            Collections.sort(arrayList, biVar.g);
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                erVar = (er) arrayList.get(size3);
                z2 = a(erVar, f, f2);
                if (z2) {
                    break;
                }
            }
        }
        if (z2) {
            if (erVar instanceof aw) {
                aw awVar = (aw) erVar;
                if (((VectorMap) this.e_) == null) {
                    return false;
                }
                if (awVar == null) {
                    b("");
                } else {
                    ao aoVar = awVar.a;
                    String id = aoVar.getId();
                    if (this.y == null || !this.y.onMarkerClick(awVar)) {
                        if (!awVar.isInfoWindowEnable()) {
                            return false;
                        }
                        if (!this.am) {
                            if (this.an == null) {
                                aoVar.showInfoWindow();
                                this.an = aoVar;
                            } else if (this.an == aoVar) {
                                if (aoVar.h() != null && aoVar.h().c()) {
                                    z = true;
                                }
                                if (z) {
                                    aoVar.hideInfoWindow();
                                    this.an = null;
                                } else {
                                    aoVar.showInfoWindow();
                                    this.an = aoVar;
                                }
                            } else {
                                this.an.hideInfoWindow();
                                aoVar.showInfoWindow();
                                this.an = aoVar;
                            }
                        } else {
                            if (aoVar.h() == null) {
                                aoVar.showInfoWindow();
                            } else if (aoVar.isInfoWindowShown()) {
                                aoVar.hideInfoWindow();
                            } else {
                                aoVar.showInfoWindow();
                                this.an = aoVar;
                            }
                            b(id);
                        }
                    }
                }
            } else if (erVar instanceof ay) {
                ay ayVar = (ay) erVar;
                if (!ayVar.isClickable() || this.aG == null) {
                    return false;
                }
                this.aG.onPolylineClick(ayVar, ((mn) this.d_).n.fromScreenLocation(new Point((int) f, (int) f2)));
            } else if (!(erVar instanceof ax)) {
                return false;
            } else {
                ax axVar = (ax) erVar;
                if (!axVar.isClickable() || this.aH == null) {
                    return false;
                }
                this.aH.onPolygonClick(axVar, ((mn) this.d_).n.fromScreenLocation(new Point((int) f, (int) f2)));
            }
            return true;
        }
        return z2;
    }

    private boolean a(aw awVar) {
        boolean z = false;
        if (((VectorMap) this.e_) == null) {
            return false;
        }
        if (awVar == null) {
            b("");
            return true;
        }
        ao aoVar = awVar.a;
        String id = aoVar.getId();
        if (this.y == null || !this.y.onMarkerClick(awVar)) {
            if (awVar.isInfoWindowEnable()) {
                if (!this.am) {
                    if (this.an == null) {
                        aoVar.showInfoWindow();
                        this.an = aoVar;
                        return true;
                    } else if (this.an == aoVar) {
                        if (aoVar.h() != null && aoVar.h().c()) {
                            z = true;
                        }
                        if (z) {
                            aoVar.hideInfoWindow();
                            this.an = null;
                        } else {
                            aoVar.showInfoWindow();
                            this.an = aoVar;
                        }
                        return true;
                    } else {
                        this.an.hideInfoWindow();
                        aoVar.showInfoWindow();
                        this.an = aoVar;
                        return true;
                    }
                }
                if (aoVar.h() == null) {
                    aoVar.showInfoWindow();
                } else if (aoVar.isInfoWindowShown()) {
                    aoVar.hideInfoWindow();
                } else {
                    aoVar.showInfoWindow();
                    this.an = aoVar;
                }
                b(id);
                return true;
            }
            return false;
        }
        return true;
    }
}
