package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ow extends av<an> implements an, eo, of {
    private so d;
    private View e;
    private GeoPoint j;
    private boolean k;
    private boolean l;
    private ao o;
    private int f = 0;
    private int g = 0;
    private float h = 0.5f;
    private float i = 0.5f;
    private boolean m = false;
    private final fm n = new fm();

    private an n() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void a(MarkerOptions markerOptions) {
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.mapsdk.internal.el
    public final void a(GL10 gl10) {
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ an f_() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ow(so soVar, ao aoVar) {
        this.d = soVar;
        this.o = aoVar;
        j();
        if (this.d != null && this.d.G() != null) {
            this.e = os.a(this.d.G(), (be) this.d.d_, this, this.o != null ? this.o.g() : null, this.o);
            if (this.o != null) {
                a(this.o.getPosition());
            }
        }
        this.k = true;
    }

    private void j() {
        if (this.d == null || this.d.e_ == 0) {
            return;
        }
        ((VectorMap) this.d.e_).a((of) this);
    }

    private void k() {
        if (this.d == null || this.d.e_ == 0) {
            return;
        }
        mn mnVar = ((VectorMap) this.d.e_).o;
        if (mnVar.I.isEmpty()) {
            return;
        }
        mnVar.I.remove(this);
    }

    private void l() {
        if (this.d == null || this.d.G() == null) {
            return;
        }
        this.e = os.a(this.d.G(), (be) this.d.d_, this, this.o != null ? this.o.g() : null, this.o);
        if (this.o != null) {
            a(this.o.getPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        final View view;
        VectorMap vectorMap;
        ViewGroup o;
        so soVar = this.d;
        if (soVar == null || (view = this.e) == null || (vectorMap = (VectorMap) soVar.e_) == null || vectorMap.getProjection() == null || (o = o()) == null) {
            return;
        }
        o.post(new Runnable() { // from class: com.tencent.mapsdk.internal.ow.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!ow.this.k) {
                    view.setVisibility(8);
                    return;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                ow.this.f = view.getMeasuredWidth();
                ow.this.g = view.getMeasuredHeight();
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                ViewGroup viewGroup = ow.this.d.d;
                Rect screenBound = ow.this.getScreenBound(((VectorMap) ow.this.d.e_).getProjection());
                if (screenBound == null) {
                    return;
                }
                if (view.getParent() == null) {
                    viewGroup.addView(view);
                }
                Rect rect = new Rect();
                viewGroup.getLocalVisibleRect(rect);
                if (rect.isEmpty()) {
                    view.setVisibility(8);
                    return;
                }
                if (rect.intersect(screenBound)) {
                    view.setVisibility(0);
                }
                view.setX(screenBound.left);
                view.setY(screenBound.top);
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void b(boolean z) {
        if (this.e == null) {
            return;
        }
        this.k = z;
        m();
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final boolean c() {
        return this.k && this.e != null && this.e.getVisibility() == 0;
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void d() {
        if (this.o == null || this.d.G() == null) {
            return;
        }
        int width = this.o.getWidth(this.d.G());
        float infoWindowAnchorU = this.o.getOptions() != null ? this.o.getOptions().getInfoWindowAnchorU() : 0.5f;
        int i = this.f;
        if (i == 0) {
            i = 1;
        }
        this.h = infoWindowAnchorU + ((width * (this.o.getAnchorU() - 0.5f)) / i);
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void e() {
        if (this.o == null || this.d.G() == null) {
            return;
        }
        int height = (int) (this.o.getHeight(this.d.G()) * this.o.getAnchorV());
        int i = this.g;
        float infoWindowAnchorV = this.o.getOptions() != null ? this.o.getOptions().getInfoWindowAnchorV() : 1.0f;
        if (i == 0) {
            i = 1;
        }
        float f = i;
        this.i = (height + (infoWindowAnchorV * f)) / f;
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void a(LatLng latLng) {
        if (latLng == null) {
            return;
        }
        if (this.j == null) {
            this.j = GeoPoint.from(latLng);
        } else {
            this.j.setLatitudeE6((int) (latLng.latitude * 1000000.0d));
            this.j.setLongitudeE6((int) (latLng.longitude * 1000000.0d));
        }
        m();
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void a(boolean z) {
        this.m = z;
        if (z) {
            k();
        } else {
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void a(int i, int i2) {
        a(true);
        this.n.a(i, i2);
        m();
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void i_() {
        m();
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void f() {
        so soVar = this.d;
        if (soVar == null) {
            return;
        }
        final TencentMap.InfoWindowAdapter g = this.o != null ? this.o.g() : null;
        final Context G = soVar.G();
        final be beVar = (be) soVar.d_;
        ViewGroup o = o();
        if (o != null) {
            o.post(new Runnable() { // from class: com.tencent.mapsdk.internal.ow.2
                @Override // java.lang.Runnable
                public final void run() {
                    ow.this.e = os.a(G, beVar, ow.this, g, ow.this.o);
                    ow.this.m();
                }
            });
        }
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final View g() {
        return this.e;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final Rect getScreenBound(eq eqVar) {
        fm a;
        int i;
        if (eqVar == null || this.e == null) {
            return null;
        }
        if (this.m) {
            a = this.n;
        } else {
            a = eqVar.a(this.j);
        }
        if (a == null) {
            return null;
        }
        int i2 = 0;
        if (this.o == null || this.o.getOptions() == null) {
            i = 0;
        } else {
            i2 = this.o.getOptions().getInfoWindowOffsetX();
            i = this.o.getOptions().getInfowindowOffsetY();
        }
        d();
        e();
        float f = this.h - ((i2 * 1.0f) / this.f);
        float f2 = this.i - ((i * 1.0f) / this.g);
        int i3 = (int) (a.a - (this.f * f));
        int i4 = (int) (a.b - (this.g * f2));
        return new Rect(i3, i4, this.f + i3, this.g + i4);
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final Rect getBound(eq eqVar) {
        Rect screenBound = getScreenBound(eqVar);
        if (screenBound == null || eqVar == null) {
            return null;
        }
        GeoPoint a = eqVar.a(new fm(screenBound.left, screenBound.top));
        GeoPoint a2 = eqVar.a(new fm(screenBound.right, screenBound.bottom));
        if (a == null || a2 == null) {
            return null;
        }
        return new Rect(a.getLongitudeE6(), a.getLatitudeE6(), a2.getLongitudeE6(), a2.getLatitudeE6());
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f, float f2) {
        Rect screenBound;
        if (this.e == null || !this.k || this.d == null || this.d.e_ == 0 || ((VectorMap) this.d.e_).getProjection() == null || (screenBound = getScreenBound(((VectorMap) this.d.e_).getProjection())) == null || screenBound.isEmpty()) {
            return false;
        }
        return screenBound.contains((int) f, (int) f2);
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final boolean isVisible() {
        return c();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void remove() {
        final View view = this.e;
        if (view == null) {
            return;
        }
        final ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).post(new Runnable() { // from class: com.tencent.mapsdk.internal.ow.3
                @Override // java.lang.Runnable
                public final void run() {
                    ((ViewGroup) parent).removeView(view);
                    if (view instanceof ViewGroup) {
                        ((ViewGroup) view).removeAllViews();
                    }
                    ow.this.releaseData();
                }
            });
        }
        this.l = true;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final boolean isRemoved() {
        return this.l;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z) {
        b(z);
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        k();
    }

    @Override // com.tencent.mapsdk.internal.of
    public final void h() {
        m();
    }

    @Override // com.tencent.mapsdk.internal.of
    public final void i() {
        m();
    }

    private ViewGroup o() {
        so soVar = this.d;
        if (soVar == null) {
            return null;
        }
        return soVar.d;
    }
}
