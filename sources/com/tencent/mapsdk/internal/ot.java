package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.ReturnCallback;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.internal.hl;
import com.tencent.mapsdk.internal.hw;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ot extends or<ao> implements ao {
    protected GeoPoint A;
    protected float B;
    protected float C;
    protected float D;
    public boolean E;
    public so F;
    public eo G;
    private boolean H;
    private int I;
    private int J;
    private boolean K;
    private GeoPoint L;
    private qa M;
    private AnimationListener N;
    private hw O;
    private TencentMap.OnMarkerClickListener P;
    private boolean Q;
    private LatLng R;
    private Collision[] S;
    private int T;
    private final hw.b U;
    protected Object a;
    protected Bitmap n;
    boolean o;
    protected final Object p;
    float q;
    float r;
    protected boolean s;
    protected float t;
    protected float u;
    protected float v;
    protected MarkerOptions w;
    protected String x;
    protected GeoPoint y;
    protected GeoPoint z;

    private ao C() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ap f_() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    @Deprecated
    public final TencentMap.OnMarkerDragListener getOnDragListener() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean handleOnTap() {
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    @Deprecated
    public final boolean isInfoWindowAutoOverturn() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.en
    public final void j() {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    @Deprecated
    public final boolean onTapMapViewBubbleHidden() {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    @Deprecated
    public final void setOnTapMapViewBubbleHidden(boolean z) {
    }

    public ot(so soVar) {
        super(soVar);
        this.a = null;
        this.n = null;
        this.o = false;
        this.p = new Object();
        this.q = 0.5f;
        this.r = 0.5f;
        this.s = false;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = -1.0f;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = 1.0f;
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = false;
        this.L = null;
        this.F = null;
        this.N = null;
        this.O = null;
        this.U = new hw.b() { // from class: com.tencent.mapsdk.internal.ot.1
            @Override // com.tencent.mapsdk.internal.hw.b
            public final void b(float f) {
            }

            @Override // com.tencent.mapsdk.internal.hw.b
            public final void a(float f, float f2, float f3, float f4) {
                ot.this.setRotation(f);
                ot.this.t = f2;
                ot.this.u = f3;
                ot.this.v = f4;
                ot.this.s = true;
                if (ot.this.M != null) {
                    ot.this.M.a((int) ot.this.getRotation());
                }
            }

            @Override // com.tencent.mapsdk.internal.hw.b
            public final void a(float f) {
                ot.this.B = f;
                if (ot.this.M != null) {
                    ot.this.M.a(ot.this.B);
                    ot.this.w.alpha(ot.this.B);
                }
                if (ot.this.G != null) {
                    ot.this.G.a(ot.this.w);
                }
            }

            @Override // com.tencent.mapsdk.internal.hw.b
            public final void a(int i, int i2) {
                if (ot.this.F == null || ot.this.y == null) {
                    return;
                }
                GeoPoint geoPoint = new GeoPoint();
                if (ot.this.K && ot.this.L != null && ot.this.F.e_ != 0) {
                    GeoPoint a = ((VectorMap) ot.this.F.e_).getProjection().a(new fm(ot.this.I, ot.this.J));
                    geoPoint.setLatitudeE6(i + (a.getLatitudeE6() - ot.this.L.getLatitudeE6()));
                    geoPoint.setLongitudeE6(i2 + (a.getLongitudeE6() - ot.this.L.getLongitudeE6()));
                    fm a2 = ((VectorMap) ot.this.F.e_).getProjection().a(geoPoint);
                    ot.this.y.setLatitudeE6((int) a2.b);
                    ot.this.y.setLongitudeE6((int) a2.a);
                } else {
                    ot.this.y.setLatitudeE6(i + 0);
                    ot.this.y.setLongitudeE6(i2 + 0);
                }
                if (ot.this.w != null) {
                    ot.this.w.position(kb.a(ot.this.y));
                }
                if (ot.this.M != null) {
                    ot.this.M.a(ot.this.y);
                }
                if (ot.this.G != null) {
                    ot.this.G.a(kb.a(ot.this.y));
                }
            }

            @Override // com.tencent.mapsdk.internal.hw.b
            public final void a(float f, float f2) {
                ot.this.C = f;
                ot.this.D = f2;
                if (ot.this.M != null) {
                    ot.this.M.b(ot.this.C, ot.this.D);
                }
                if (ot.this.G != null) {
                    ot.this.refreshInfoWindow();
                }
            }
        };
        this.F = soVar;
        setClickable(true);
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.en
    public final int a() {
        if (this.M != null) {
            return this.M.a();
        }
        return super.a();
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final eo h() {
        return this.G;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0133  */
    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setMarkerOptions(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r8) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ot.setMarkerOptions(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions):void");
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final MarkerOptions getOptions() {
        return this.w;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        so soVar = this.F;
        if (soVar == null) {
            return;
        }
        BitmapDescriptor defaultMarker = BitmapDescriptorFactory.defaultMarker(soVar.d_);
        so soVar2 = this.F;
        if (soVar2 != null) {
            if (bitmapDescriptor == null && defaultMarker != null) {
                bitmapDescriptor = defaultMarker;
            }
            if (bitmapDescriptor != null) {
                if (this.M != null) {
                    a(soVar2.G(), bitmapDescriptor.getFormater());
                }
                if (this.w != null) {
                    this.w.icon(bitmapDescriptor);
                }
                if (this.G != null) {
                    this.G.f();
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final void a(BitmapDescriptor bitmapDescriptor, BitmapDescriptor bitmapDescriptor2) {
        so soVar = this.F;
        if (soVar == null) {
            return;
        }
        if (bitmapDescriptor == null && bitmapDescriptor2 != null) {
            bitmapDescriptor = bitmapDescriptor2;
        }
        if (bitmapDescriptor == null) {
            return;
        }
        if (this.M != null) {
            a(soVar.G(), bitmapDescriptor.getFormater());
        }
        if (this.w != null) {
            this.w.icon(bitmapDescriptor);
        }
        if (this.G != null) {
            this.G.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, BitmapDescriptor.BitmapFormator bitmapFormator) {
        if (bitmapFormator != null) {
            Bitmap bitmap = bitmapFormator.getBitmap(context);
            if (this.x == null || !this.x.equals(bitmapFormator.getBitmapId())) {
                a(bitmapFormator.getBitmapId());
                a(bitmap);
            }
        }
    }

    private void a(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return;
        }
        if (this.y == null) {
            this.y = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        } else {
            this.y.setLatitudeE6(geoPoint.getLatitudeE6());
            this.y.setLongitudeE6(geoPoint.getLongitudeE6());
        }
        if (this.M != null) {
            this.M.a(this.y);
        }
        if (this.G != null) {
            this.G.a(kb.a(this.y));
        }
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setLevel(int i) {
        super.setLevel(i);
        if (this.M != null) {
            this.M.setLevel(i);
        }
        if (this.w != null) {
            this.w.level(i);
        }
    }

    private void t() {
        if (this.F == null || !this.E) {
            return;
        }
        a(this.F.s());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setPosition(LatLng latLng) {
        this.R = latLng;
        if (latLng != null) {
            a(GeoPoint.from(latLng));
        }
        if (this.w != null) {
            this.w.position(latLng);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowEnable(boolean z) {
        if (this.w != null) {
            this.w.infoWindowEnable(z);
        }
        if (this.G == null || !this.G.c()) {
            return;
        }
        this.G.b(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowEnable() {
        if (this.w != null) {
            return this.w.isInfoWindowEnable();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInMapCenterState() {
        return this.E;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final LatLng getPosition() {
        return this.R;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setTitle(String str) {
        if (this.w != null) {
            this.w.title(str);
        }
        if (this.G != null) {
            this.G.f();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final String getTitle() {
        if (this.w != null) {
            return this.w.getTitle();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setSnippet(String str) {
        if (this.w != null) {
            this.w.snippet(str);
        }
        if (this.G != null) {
            this.G.f();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final String getSnippet() {
        if (this.w != null) {
            return this.w.getSnippet();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.tencentmap.mapsdk.maps.interfaces.Rotatable
    public final void setRotation(float f) {
        super.setRotation(f);
        if (this.M != null) {
            this.M.a((int) getRotation());
        }
        if (this.w != null) {
            this.w.rotation(f);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final void setAnchor(float f, float f2) {
        if (this.w != null) {
            this.w.anchor(f, f2);
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.q = f;
        this.r = f2;
        if (this.M != null) {
            this.M.a(this.q, this.r);
        }
        if (this.G != null) {
            this.G.i_();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final float getAnchorU() {
        return this.w.getAnchorU();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final float getAnchorV() {
        return this.w.getAnchorV();
    }

    private void a(String str) {
        synchronized (this.p) {
            this.x = str;
        }
    }

    private void b(Bitmap bitmap) {
        synchronized (this.p) {
            this.n = bitmap;
            if (this.x == null) {
                this.x = bitmap.toString();
            }
            if (this.M != null) {
                this.M.a(this.x, this.n);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final void a(LatLng latLng) {
        so soVar = this.F;
        setPosition(latLng);
        if (!getId().equals(soVar != null ? soVar.h : "") || this.G == null) {
            return;
        }
        this.G.a(latLng);
    }

    @Override // com.tencent.mapsdk.internal.ao
    @Deprecated
    public final void a(boolean z) {
        so soVar = this.F;
        if (soVar != null) {
            soVar.i = z;
        }
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final void a(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        b(bitmap);
        u();
    }

    private void u() {
        synchronized (this.p) {
            if (this.n != null && !this.n.isRecycled()) {
                this.o = true;
            }
        }
    }

    private String v() {
        return "GLMarkerOverlay-" + this.b_;
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void j_() {
        if (this.F == null) {
            return;
        }
        if (!isVisible()) {
            releaseData();
            return;
        }
        if (this.F != null && this.E) {
            a(this.F.s());
        }
        if (this.F != null && this.O != null) {
            this.O.b();
            this.K = this.O.b;
            if (this.K && this.F.e_ != 0) {
                ((VectorMap) this.F.e_).o.v = true;
            }
        }
        if (this.F == null || this.F.e_ == 0) {
            return;
        }
        if (((VectorMap) this.F.e_).o.l != null && this.M != null) {
            this.M.j_();
        }
        if (this.Q && (this.G == null || !this.G.c())) {
            showInfoWindow();
        }
        if (this.G == null || !this.G.c()) {
            return;
        }
        this.G.a((GL10) null);
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f, float f2) {
        if (this.F == null || !isClickable() || this.M == null) {
            return false;
        }
        boolean onTap = this.M.onTap(f, f2);
        if (onTap && this.P != null) {
            this.P.onMarkerClick(this);
        }
        return onTap;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z) {
        super.setVisible(z);
        if (this.M != null) {
            this.M.setVisible(z);
        }
        if (this.F == null || this.F.e_ == 0) {
            return;
        }
        ((VectorMap) this.F.e_).o.v = true;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        if (this.G != null) {
            this.G.remove();
            this.G = null;
        }
        if (this.M != null) {
            this.M.h();
        }
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void h_() {
        so soVar = this.F;
        if (soVar != null) {
            if (getId().equals(soVar.h)) {
                soVar.b("");
            }
        }
        if (this.M != null) {
            this.M.h();
        }
        if (this.G != null) {
            this.G.remove();
        }
        this.F = null;
    }

    private void a(hw hwVar) {
        this.O = hwVar;
        if (this.O != null) {
            this.O.a(this.U);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void setAnimation(Animation animation) {
        hf a;
        so soVar = this.F;
        if (soVar == null || (a = ie.a(soVar.d_, animation)) == null) {
            return;
        }
        this.O = a.a;
        if (this.O != null) {
            this.O.a(this.U);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final boolean startAnimation() {
        if (this.F == null || this.O == null) {
            return false;
        }
        GeoPoint geoPoint = this.y;
        if (this.H && this.F.e_ != 0) {
            geoPoint = ((VectorMap) this.F.e_).getProjection().a(new fm(this.I, this.J));
            this.L = new GeoPoint(geoPoint);
        }
        return this.O.a(geoPoint, this.A);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void startAnimation(Animation animation) {
        setAnimation(animation);
        startAnimation();
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av
    public final Rect b(eq eqVar) {
        return w();
    }

    private Rect w() {
        if (this.M != null && this.F != null && this.F.e_ != 0) {
            return this.M.b(((VectorMap) this.F.e_).getProjection());
        }
        return new Rect();
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final Rect i() {
        if (this.M != null && this.F != null && this.F.e_ != 0) {
            return this.M.a(((VectorMap) this.F.e_).getProjection());
        }
        return new Rect();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible
    public final void setContentDescription(String str) {
        if (this.w != null) {
            this.w.contentDescription(str);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible
    public final String getContentDescription() {
        if (this.w == null) {
            return null;
        }
        return this.w.getContentDescription();
    }

    private boolean x() {
        if (this.F == null || this.O == null) {
            return false;
        }
        this.O.b();
        this.K = this.O.b;
        if (this.K && this.F.e_ != 0) {
            ((VectorMap) this.F.e_).o.v = true;
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final void a(AnimationListener animationListener) {
        this.N = animationListener;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.tencentmap.mapsdk.maps.interfaces.Draggable
    public final void setDraggable(boolean z) {
        super.setDraggable(z);
        if (this.w != null) {
            this.w.draggable(z);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final float getAlpha() {
        return this.B;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final void setAlpha(float f) {
        this.B = f;
        if (this.w != null) {
            this.w.alpha(f);
        }
        if (this.M != null) {
            this.M.a(f);
        }
        q();
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(float f) {
        this.g = f;
        if (this.w != null) {
            this.w.zIndex(f);
        }
        if (this.M != null) {
            this.M.setZIndex((int) f);
        }
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFastLoad(boolean z) {
        if (this.M == null) {
            return;
        }
        this.M.c(z);
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isFastLoad() {
        if (this.M == null) {
            return false;
        }
        return this.M.i();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getWidth(Context context) {
        Bitmap bitmap;
        BitmapDescriptor icon = this.w.getIcon();
        if (icon == null || (bitmap = icon.getFormater().getBitmap(context)) == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getHeight(Context context) {
        Bitmap bitmap;
        BitmapDescriptor icon = this.w.getIcon();
        if (icon == null || (bitmap = icon.getFormater().getBitmap(context)) == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    @Deprecated
    public final int getDisplayLevel() {
        return getLevel();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowAnchor(float f, float f2) {
        if (this.w != null) {
            this.w.infoWindowAnchor(f, f2);
        }
        if (this.G != null) {
            this.G.f();
        }
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowOffset(int i, int i2) {
        if (this.w != null) {
            this.w.infoWindowOffset(i, i2);
        }
        if (this.G != null) {
            this.G.f();
        }
        q();
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final void b(boolean z) {
        this.E = z;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFixingPointEnable(boolean z) {
        this.H = z;
        if (this.M != null) {
            this.M.a(z);
        }
        if (this.G != null) {
            if (z) {
                this.G.a(this.I, this.J);
            } else {
                this.G.a(false);
            }
        }
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFixingPoint(int i, int i2) {
        this.I = i;
        this.J = i2;
        if (this.M != null) {
            setFixingPointEnable(true);
            this.M.a(new GeoPoint(this.J, this.I));
        }
        if (this.G != null) {
            this.G.a(i, i2);
        }
    }

    private boolean y() {
        return this.H;
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final Point c() {
        return new Point(this.I, this.J);
    }

    private int c(boolean z) {
        if (this.n == null || this.M == null) {
            return 0;
        }
        int height = this.n.getHeight();
        if (!z) {
            return (int) (height * this.M.e());
        }
        return (int) (height * (1.0f - this.M.e()));
    }

    private int z() {
        if (this.n == null || this.M == null) {
            return 0;
        }
        float width = this.n.getWidth();
        return (int) ((this.M.d() * width) - (width * 0.5f));
    }

    private boolean A() {
        return this.K;
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final void a(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        this.P = onMarkerClickListener;
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final TencentMap.OnMarkerClickListener d() {
        return this.P;
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final List<LatLng> e() {
        VectorMap vectorMap;
        Rect bound;
        so soVar = this.F;
        if (soVar == null || (vectorMap = (VectorMap) soVar.e_) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Rect w = w();
        if (w != null) {
            LatLng latLng = new LatLng(w.top / 1000000.0d, w.left / 1000000.0d);
            LatLng latLng2 = new LatLng(w.bottom / 1000000.0d, w.left / 1000000.0d);
            LatLng latLng3 = new LatLng(w.top / 1000000.0d, w.right / 1000000.0d);
            LatLng latLng4 = new LatLng(w.bottom / 1000000.0d, w.right / 1000000.0d);
            arrayList.add(latLng);
            arrayList.add(latLng2);
            arrayList.add(latLng3);
            arrayList.add(latLng4);
        }
        eo eoVar = this.G;
        if (eoVar != null && eoVar.c() && (bound = eoVar.getBound(vectorMap.getProjection())) != null) {
            LatLng latLng5 = new LatLng(bound.top / 1000000.0d, bound.left / 1000000.0d);
            LatLng latLng6 = new LatLng(bound.bottom / 1000000.0d, bound.left / 1000000.0d);
            LatLng latLng7 = new LatLng(bound.top / 1000000.0d, bound.right / 1000000.0d);
            LatLng latLng8 = new LatLng(bound.bottom / 1000000.0d, bound.right / 1000000.0d);
            arrayList.add(latLng5);
            arrayList.add(latLng6);
            arrayList.add(latLng7);
            arrayList.add(latLng8);
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final List<Boundable<eq>> f() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.M);
        eo eoVar = this.G;
        if (eoVar != null && eoVar.c()) {
            arrayList.add(this.G);
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final TencentMap.InfoWindowAdapter g() {
        if (this.F != null) {
            return this.F.aI;
        }
        return null;
    }

    private Boundable<eq> B() {
        return this.M;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final Rect getScreenBound(eq eqVar) {
        if (this.M == null) {
            return null;
        }
        Rect a = this.M.a(eqVar);
        Rect screenBound = this.G != null ? this.G.getScreenBound(eqVar) : null;
        if (a == null) {
            return screenBound;
        }
        if (screenBound == null) {
            return a;
        }
        return new Rect(Math.min(a.left, screenBound.left), Math.min(a.top, screenBound.top), Math.max(a.right, screenBound.right), Math.max(a.bottom, screenBound.bottom));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r8) {
        /*
            r7 = this;
            com.tencent.mapsdk.internal.so r0 = r7.F
            if (r0 == 0) goto Ldd
            if (r8 == 0) goto Ldd
            com.tencent.mapsdk.internal.qa r0 = r7.M
            if (r0 == 0) goto Lc
            goto Ldd
        Lc:
            com.tencent.mapsdk.internal.qb r0 = new com.tencent.mapsdk.internal.qb
            r0.<init>()
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r1 = r8.getPosition()
            com.tencent.map.lib.models.GeoPoint r1 = com.tencent.map.lib.models.GeoPoint.from(r1)
            r0.i = r1
            float r1 = r8.getAlpha()
            r0.m = r1
            float r1 = r8.getAnchorU()
            float r2 = r8.getAnchorV()
            r0.a(r1, r2)
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            r2 = 20
            byte[] r2 = new byte[r2]
            r1.nextBytes(r2)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            r2 = 0
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r3 = r8.getIcon()     // Catch: java.lang.NullPointerException -> L60
            com.tencent.mapsdk.internal.so r4 = r7.F     // Catch: java.lang.NullPointerException -> L60
            android.content.Context r4 = r4.G()     // Catch: java.lang.NullPointerException -> L60
            android.graphics.Bitmap r3 = r3.getBitmap(r4)     // Catch: java.lang.NullPointerException -> L60
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r2 = r8.getIcon()     // Catch: java.lang.NullPointerException -> L5b
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r2 = r2.getFormater()     // Catch: java.lang.NullPointerException -> L5b
            java.lang.String r2 = r2.getBitmapId()     // Catch: java.lang.NullPointerException -> L5b
            r1 = r2
            r2 = r3
            goto L64
        L5b:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L61
        L60:
            r3 = move-exception
        L61:
            r3.printStackTrace()
        L64:
            r3 = 1
            android.graphics.Bitmap[] r4 = new android.graphics.Bitmap[r3]
            r5 = 0
            r4[r5] = r2
            com.tencent.mapsdk.internal.qb r1 = r0.a(r1, r4)
            float r2 = r8.getRotation()
            int r2 = (int) r2
            r1.o = r2
            boolean r2 = r8.isFlat()
            r1.n = r2
            float r2 = r8.getZIndex()
            int r2 = (int) r2
            r1.s = r2
            boolean r2 = r7.H
            r1.u = r2
            r1.y = r5
            com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem r2 = com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.POI
            boolean r2 = r7.isCollisionBy(r2)
            r1.x = r2
            boolean r2 = r8.isClockwise()
            r1.z = r2
            boolean r2 = r8.isFastLoad()
            r1.v = r2
            int r2 = r8.getLevel()
            r1.t = r2
            com.tencent.mapsdk.internal.qa r1 = new com.tencent.mapsdk.internal.qa
            com.tencent.mapsdk.internal.so r2 = r7.F
            r1.<init>(r7, r2, r0)
            r7.M = r1
            boolean r0 = r8.isIconLooperEnable()
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = r8.getIcon()
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor$BitmapFormator r1 = r1.getFormater()
            int r1 = r1.activeSize()
            if (r1 <= r3) goto Ldc
            r1 = -1
            r7.T = r1
            com.tencent.mapsdk.internal.hl r1 = new com.tencent.mapsdk.internal.hl
            r1.<init>()
            int r8 = r8.getIconLooperDuration()
            long r2 = (long) r8
            r1.a(r2)
            com.tencent.mapsdk.internal.ot$2 r8 = new com.tencent.mapsdk.internal.ot$2
            r8.<init>()
            r1.a(r8)
            com.tencent.mapsdk.internal.qa r8 = r7.M
            r8.q = r1
            r1.a(r0)
        Ldc:
            return
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ot.a(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions):void");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ot$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass2 extends hl.a {
        AnonymousClass2() {
        }

        @Override // com.tencent.mapsdk.internal.hl.a
        public final void a(float f) {
            super.a(f);
            if (ot.this.M == null || ot.this.F == null || ot.this.w == null) {
                return;
            }
            BitmapDescriptor icon = ot.this.w.getIcon();
            int round = Math.round(icon.getFormater().activeSize() * f);
            if (round != ot.this.T) {
                ot.this.a(ot.this.F.G(), icon.getFormater());
                icon.getFormater().nextActiveIndex();
                ot.this.T = round;
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void hideInfoWindow() {
        if (this.F == null) {
            return;
        }
        this.F.b("");
        ((VectorMap) this.F.e_).o.v = true;
        synchronized (this.F.g) {
            if (this.G == null) {
                return;
            }
            this.G.b(false);
            this.Q = false;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void showInfoWindow() {
        if (this.F == null || this.w == null) {
            return;
        }
        synchronized (this.F.g) {
            if (this.G == null) {
                if (this.w.isViewInfowindow()) {
                    this.G = new ow(this.F, this);
                } else {
                    this.G = new os(this.F, this);
                }
            } else {
                this.G.f();
            }
            if (this.H) {
                this.G.a(this.I, this.J);
            }
            if ((this.w == null || !this.w.isInfoWindowEnable() || ((this.G == null || this.G.g() == null) && hb.a(this.w.getTitle()) && hb.a(this.w.getSnippet()))) ? false : true) {
                this.G.b(true);
                this.Q = true;
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void refreshInfoWindow() {
        if (isInfoWindowEnable() && this.G != null && this.G.c()) {
            this.G.f();
        }
    }

    private boolean D() {
        if (this.w == null || !this.w.isInfoWindowEnable()) {
            return false;
        }
        return ((this.G == null || this.G.g() == null) && hb.a(this.w.getTitle()) && hb.a(this.w.getSnippet())) ? false : true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowShown() {
        if (this.F == null || this.w == null || this.G == null) {
            return false;
        }
        return this.G.c();
    }

    private boolean E() {
        if (this.F == null) {
            return false;
        }
        Rect i = i();
        return i.left >= 0 && i.top >= 0 && i.right <= this.F.X() && i.bottom <= this.F.Y();
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(Object obj) {
        this.a = obj;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final Object getTag() {
        return this.a;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.en
    public final boolean k() {
        return this.a != null && pe.b.equals(this.a.toString());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final void setCollisions(Collision... collisionArr) {
        this.S = collisionArr;
        qa qaVar = this.M;
        if (qaVar == null) {
            return;
        }
        qaVar.b(isCollisionBy(MarkerCollisionItem.POI));
        qaVar.g();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final boolean isCollisionBy(final Collision collision) {
        if (this.S != null) {
            return Util.where(this.S, new ReturnCallback<Boolean, Collision>() { // from class: com.tencent.mapsdk.internal.ot.3
                @Override // com.tencent.map.tools.ReturnCallback
                public final /* synthetic */ Boolean callback(Collision collision2) {
                    return Boolean.valueOf(collision2 == collision);
                }

                private Boolean a(Collision collision2) {
                    return Boolean.valueOf(collision2 == collision);
                }
            });
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInMapCenterState(boolean z) {
        this.E = z;
    }

    @Override // com.tencent.mapsdk.internal.ao
    public final boolean b() {
        return this.H;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    public final /* synthetic */ Rect getBound(eq eqVar) {
        return w();
    }
}
