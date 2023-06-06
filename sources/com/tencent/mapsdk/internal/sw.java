package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.z;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class sw extends bo<mn, VectorMap> implements ba, nu, oh {
    private static final int j = 10;
    private static final int k = 16;
    public int aA;
    public mn aB;
    public float aC;
    public int aD;
    protected bu aE;
    public volatile boolean aF;
    protected TencentMap.OnPolylineClickListener aG;
    protected TencentMap.OnPolygonClickListener aH;
    public TencentMap.InfoWindowAdapter aI;
    public List<TencentMap.OnMapLoadedCallback> au;
    public TencentMapGestureListenerList av;
    public boolean aw;
    protected volatile boolean ax;
    public volatile boolean ay;
    public volatile boolean az;
    private po g;
    private mo h;
    private volatile boolean i;
    private boolean l;

    public void T() {
    }

    static /* synthetic */ int b(sw swVar) {
        int i = swVar.aD;
        swVar.aD = i + 1;
        return i;
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final /* synthetic */ bu b(mn mnVar, ViewGroup viewGroup) {
        bu szVar;
        mn mnVar2 = mnVar;
        switch (this.d_.a.getMapViewType()) {
            case TextureView:
                szVar = new sz(mnVar2);
                break;
            case RenderLayer:
                szVar = new sy(mnVar2);
                break;
            default:
                szVar = new ta(mnVar2);
                break;
        }
        if (viewGroup != null) {
            viewGroup.addView(szVar.getView());
        }
        return szVar;
    }

    public sw(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        super(context, tencentMapOptions, viewGroup);
        this.au = new CopyOnWriteArrayList();
        this.av = null;
        this.aw = true;
        this.ax = false;
        this.ay = false;
        this.az = false;
        this.aA = 0;
        this.aC = 0.5f;
        this.aD = 0;
        this.aE = null;
    }

    @Override // com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onCreated() {
        super.onCreated();
        this.aE = getMapRenderView();
        this.g = new po(this);
        this.aF = true;
        VectorMap vectorMap = (VectorMap) this.e_;
        if (vectorMap.o != null) {
            vectorMap.o.G = this;
        }
    }

    private mn b(Context context, TencentMapOptions tencentMapOptions) {
        this.aB = new mn(context, tencentMapOptions, this);
        return this.aB;
    }

    @Override // com.tencent.mapsdk.internal.bo
    public void P() {
        super.P();
        a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.bo
    /* renamed from: a */
    public VectorMap b(mn mnVar) {
        return new VectorMap(mnVar);
    }

    private bu a(mn mnVar, ViewGroup viewGroup) {
        bu szVar;
        switch (this.d_.a.getMapViewType()) {
            case TextureView:
                szVar = new sz(mnVar);
                break;
            case RenderLayer:
                szVar = new sy(mnVar);
                break;
            default:
                szVar = new ta(mnVar);
                break;
        }
        if (viewGroup != null) {
            viewGroup.addView(szVar.getView());
        }
        return szVar;
    }

    private void S() {
        if (this.aE != null) {
            this.aE.d();
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(et etVar) {
        this.g.a(etVar);
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void b(et etVar) {
        po poVar = this.g;
        synchronized (poVar.a) {
            poVar.a.b(etVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final mn b() {
        return this.aB;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final mm c() {
        return this.aB.l;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(nw nwVar) {
        this.aB.a(nwVar);
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(nr nrVar, le leVar) {
        if (this.aB.a(this.e.getApplicationContext(), nrVar, leVar, this)) {
            ad adVar = this.aB.i;
            GeoPoint geoPoint = new GeoPoint(ad.n, ad.m);
            v vVar = adVar.A;
            Rect g = adVar.z.g();
            int latitudeE6 = geoPoint.getLatitudeE6();
            int longitudeE6 = geoPoint.getLongitudeE6();
            vVar.n = g;
            vVar.c = GeometryConstants.BOUNDARY_WORLD;
            vVar.c(13);
            vVar.a(0);
            vVar.a(latitudeE6, longitudeE6, false);
            adVar.z.f().b(adVar.G);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final nr C() {
        if (this.aB == null) {
            return null;
        }
        return this.aB.u;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void a(float f, float f2, float f3) {
        if (this.aB != null) {
            float f4 = this.aB.i.A.b.p;
            float b = b(f3);
            boolean z = ((double) Math.abs(f4 - b)) > 1.0E-4d;
            this.aD = 0;
            jy.a(new AnonymousClass1((f2 - this.aC) / 10.0f, f, f2, f3, z, b));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.sw$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements Runnable {
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ boolean e;
        final /* synthetic */ float f;

        public AnonymousClass1(float f, float f2, float f3, float f4, boolean z, float f5) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sw.this.aC += this.a;
            sw.a(sw.this, this.b, sw.this.aC);
            if (sw.b(sw.this) < 10) {
                jy.a(this, 16L);
                return;
            }
            sw.a(sw.this, this.b, this.c);
            if (this.d < 3.0f || this.d > 20.0f) {
                return;
            }
            if (this.e) {
                sw.this.aB.i.a((int) this.d, new Runnable() { // from class: com.tencent.mapsdk.internal.sw.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        sw.this.aB.i.a(AnonymousClass1.this.f);
                    }
                });
                return;
            }
            sw.this.aB.i.a(this.f);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void l(boolean z) {
        this.aB.g.g(z);
    }

    @Override // com.tencent.mapsdk.internal.ba, com.tencent.mapsdk.internal.oe
    public int getEGLContextHash() {
        EGLContext eglGetCurrentContext;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (egl10 == null || (eglGetCurrentContext = egl10.eglGetCurrentContext()) == null) {
            return 0;
        }
        return eglGetCurrentContext.hashCode();
    }

    @Override // com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        super.onResume();
        if (this.h != null) {
            mo moVar = this.h;
            moVar.a = false;
            synchronized (moVar) {
                moVar.notifyAll();
            }
        }
        mn mnVar = this.aB;
        if (mnVar.g != null) {
            mnVar.v = true;
            mnVar.B = true;
            mnVar.f(mnVar.B);
            if (!mnVar.w) {
                ad adVar = mnVar.i;
                if (adVar.o != null) {
                    adVar.o.b();
                }
            } else {
                z zVar = mnVar.i.o;
                if (zVar.d != null) {
                    zVar.d.destroy();
                }
                zVar.d = new z.a();
                zVar.d.start();
                mnVar.w = false;
            }
            if (mnVar.m != null) {
                mnVar.m.getMapRenderView().d();
            }
            if (mnVar.p) {
                mnVar.g.k();
            }
            if (mnVar.q && mnVar.j != null) {
                mnVar.j.b();
            }
            if (mnVar.A != null) {
                qz qzVar = mnVar.A;
                qzVar.g = false;
                synchronized (qzVar.j) {
                    qzVar.j.notifyAll();
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onPause() {
        super.onPause();
        if (this.h != null) {
            this.h.a = true;
        }
        mn mnVar = this.aB;
        if (mnVar.g != null) {
            mnVar.v = false;
            mnVar.B = false;
            mnVar.f(mnVar.B);
            if (mnVar.A != null) {
                mnVar.A.g = true;
            }
            ad adVar = mnVar.i;
            if (adVar.o != null) {
                adVar.o.a();
            }
            mnVar.g.l();
            if (!mnVar.q || mnVar.j == null) {
                return;
            }
            mnVar.j.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void D() {
        if (this.h == null && this.aB != null) {
            this.h = new mo(this.aB);
        }
        if (this.i) {
            return;
        }
        try {
            this.h.start();
            this.i = true;
        } catch (Exception e) {
            kj.a("startTextureCreatorIfNeed failed", e);
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void E() {
        U();
        if (this.aB != null) {
            getEGLContextHash();
            this.aB.z();
        }
    }

    private void U() {
        if (this.h != null) {
            while (!this.h.b) {
                try {
                    this.h.a = true;
                    this.h.a();
                    this.h.join();
                } catch (InterruptedException e) {
                    kj.a(Log.getStackTraceString(e));
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.h = null;
        this.i = false;
    }

    @Override // com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        super.onDestroy();
    }

    private void n(boolean z) {
        if (this.aE != null) {
            this.aE.setZOrderMediaOverlay(z);
        }
    }

    public final int X() {
        if (this.aE != null) {
            return this.aE.getWidth();
        }
        return Integer.MAX_VALUE;
    }

    public final int Y() {
        if (this.aE != null) {
            return this.aE.getHeight();
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g != null) {
            return this.g.onTouch(null, motionEvent);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void F() {
        if (this.aE != null) {
            this.aE.d();
        }
        if (this.aB != null) {
            this.aB.v = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final Context G() {
        return this.e;
    }

    public void a(GL10 gl10, EGLConfig eGLConfig) {
        mn mnVar = this.aB;
        if (mnVar.g == null || mnVar.h == null) {
            return;
        }
        mnVar.h.a();
    }

    public void a(GL10 gl10, int i, int i2) {
        mn mnVar = this.aB;
        if (mnVar.g != null) {
            mnVar.v = true;
            mnVar.o.set(0, 0, i, i2);
            mnVar.a(0, 0, i, i2, false);
            mnVar.i.n();
        }
    }

    public boolean a(GL10 gl10) {
        return this.aB.a(gl10);
    }

    @Override // com.tencent.mapsdk.internal.nu
    public final boolean b(int i) {
        if (this.aB != null) {
            mn mnVar = this.aB;
            if (i != mn.b.AboveToplayer.g || mnVar.F == null) {
                return false;
            }
            mnVar.F.onDrawFrame();
            return true;
        }
        return false;
    }

    private void a(float f, float f2, boolean z) {
        this.aB.i.b(f, f2, z);
    }

    public static float b(float f) {
        int i = (int) f;
        return (1 << (i - 3)) * 3.0517578E-5f * ((float) Math.pow(2.0d, f - i));
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final void H() {
        if (this.aB != null) {
            this.aB.v = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean I() {
        if (this.aB != null) {
            mn mnVar = this.aB;
            if (mnVar.g != null ? mnVar.g.j() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean J() {
        if (this.aB == null) {
            return false;
        }
        return this.aB.E();
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final TencentMapOptions K() {
        return this.f;
    }

    @Override // com.tencent.mapsdk.internal.ba
    public final boolean N() {
        return this.ax;
    }

    @Override // com.tencent.mapsdk.internal.oh
    public final void m_() {
        if (this.aF) {
            long currentTimeMillis = System.currentTimeMillis();
            gs gsVar = ((mn) this.d_).d;
            if (gsVar != null) {
                gsVar.a().a(true, currentTimeMillis);
            }
            this.aF = false;
        }
    }

    public final void aa() {
        if (!this.ax) {
            jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.sw.2
                @Override // java.lang.Runnable
                public final void run() {
                    for (TencentMap.OnMapLoadedCallback onMapLoadedCallback : sw.this.au) {
                        if (onMapLoadedCallback != null) {
                            onMapLoadedCallback.onMapLoaded();
                        }
                    }
                }
            });
        }
        this.ax = true;
    }

    private void V() {
        long currentTimeMillis = System.currentTimeMillis();
        gs gsVar = ((mn) this.d_).d;
        if (gsVar != null) {
            gsVar.a().a(true, currentTimeMillis);
        }
        this.aF = false;
    }

    private void W() {
        this.aF = true;
    }

    public final void a(TencentMap.OnPolylineClickListener onPolylineClickListener) {
        this.aG = onPolylineClickListener;
    }

    public final void a(TencentMap.OnPolygonClickListener onPolygonClickListener) {
        this.aH = onPolygonClickListener;
    }

    private void a(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        this.aI = infoWindowAdapter;
    }

    private TencentMap.InfoWindowAdapter ab() {
        return this.aI;
    }

    private void ac() {
        this.ay = true;
        if (this.av == null || !this.aw) {
            return;
        }
        this.av.onMapStable();
    }

    public final boolean Z() {
        Context context = this.e;
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        if (Build.VERSION.SDK_INT < 14) {
            return isEnabled;
        }
        return isEnabled && accessibilityManager.isTouchExplorationEnabled();
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final /* synthetic */ mn a(Context context, TencentMapOptions tencentMapOptions) {
        this.aB = new mn(context, tencentMapOptions, this);
        return this.aB;
    }

    static /* synthetic */ void a(sw swVar, float f, float f2) {
        swVar.aB.i.b(f, f2, true);
    }
}
