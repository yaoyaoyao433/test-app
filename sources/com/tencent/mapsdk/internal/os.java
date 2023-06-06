package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class os extends or<an> implements an, eo {
    static final float n = 5.0f;
    private static AtomicInteger y = new AtomicInteger(0);
    private View A;
    private int B;
    private qa o;
    private Bitmap p;
    private int q;
    private int r;
    private GeoPoint s;
    private so t;
    private ao u;
    private boolean v;
    private float w;
    private float x;
    private boolean z;

    private an t() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ap f_() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.en
    public final void j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public os(so soVar, ao aoVar) {
        super(soVar);
        this.p = null;
        this.q = 0;
        this.r = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = 0.5f;
        this.x = 0.5f;
        this.z = false;
        this.t = soVar;
        this.u = aoVar;
        if (this.t == null || this.u == null || this.u.getOptions() == null) {
            return;
        }
        i();
        if (((VectorMap) this.t.e_).o.l != null) {
            this.o = new qa(this, this.t, b(this.u.getOptions()));
            kj.a("create InfoWindowView:" + this.A);
            a(gx.a(this.A));
        }
    }

    private void h() {
        if (this.t == null || this.u == null || this.u.getOptions() == null) {
            return;
        }
        i();
        if (((VectorMap) this.t.e_).o.l == null) {
            return;
        }
        this.o = new qa(this, this.t, b(this.u.getOptions()));
        kj.a("create InfoWindowView:" + this.A);
        a(gx.a(this.A));
    }

    private void i() {
        if (this.t == null || this.t.G() == null) {
            return;
        }
        this.A = a(this.t.G(), (be) this.t.d_, this, this.u != null ? this.u.g() : null, this.u);
        if (this.A != null) {
            this.A.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.q = this.A.getMeasuredWidth();
            this.r = this.A.getMeasuredHeight();
            this.A.layout(0, 0, this.A.getMeasuredWidth(), this.A.getMeasuredHeight());
        }
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final View g() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View a(Context context, be beVar, eo eoVar, TencentMap.InfoWindowAdapter infoWindowAdapter, Marker marker) {
        if (context == null || eoVar == null || marker == null || beVar == null) {
            return null;
        }
        String title = marker.getTitle();
        String snippet = marker.getSnippet();
        if (infoWindowAdapter == null) {
            if (hb.a(title) && hb.a(snippet)) {
                return null;
            }
            return a(context, beVar, eoVar, title, snippet);
        }
        LinearLayout linearLayout = (LinearLayout) eoVar.g();
        if (linearLayout == null) {
            linearLayout = a(context);
        }
        aw awVar = (aw) beVar.c().d.a(marker.getId(), aw.class);
        if (awVar == null) {
            return null;
        }
        View infoWindow = infoWindowAdapter.getInfoWindow(awVar);
        if (infoWindow != null) {
            if (infoWindow.getParent() == linearLayout) {
                return linearLayout;
            }
            if (infoWindow.getParent() instanceof ViewGroup) {
                ((ViewGroup) infoWindow.getParent()).removeAllViews();
            }
            linearLayout.setBackgroundDrawable(null);
            linearLayout.removeAllViews();
            linearLayout.addView(infoWindow);
            return linearLayout;
        }
        View infoContents = infoWindowAdapter.getInfoContents(awVar);
        if (infoContents != null) {
            if (infoContents.getParent() == linearLayout) {
                return linearLayout;
            }
            if (infoContents.getParent() instanceof ViewGroup) {
                ((ViewGroup) infoContents.getParent()).removeAllViews();
            }
            a(linearLayout, "marker_infowindow.9.png");
            linearLayout.removeAllViews();
            linearLayout.addView(infoContents);
            return linearLayout;
        } else if (hb.a(title) && hb.a(snippet)) {
            return null;
        } else {
            a(linearLayout, "marker_infowindow.9.png");
            linearLayout.removeAllViews();
            a(beVar, linearLayout, eo.b, title);
            a(beVar, linearLayout, eo.c, snippet);
            return linearLayout;
        }
    }

    private static View a(Context context, TencentMapContext tencentMapContext, eo eoVar, String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) eoVar.g();
        if (linearLayout == null) {
            linearLayout = a(context);
        } else {
            linearLayout.removeAllViews();
        }
        a(linearLayout, "marker_infowindow.9.png");
        a(tencentMapContext, linearLayout, eo.b, str);
        a(tencentMapContext, linearLayout, eo.c, str2);
        return linearLayout;
    }

    private static LinearLayout a(Context context) {
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag(eo.a);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private static void a(ViewGroup viewGroup, String str) {
        if (TextUtils.isEmpty(str)) {
            viewGroup.setBackgroundDrawable(null);
        }
        Bitmap b = gx.b(viewGroup.getContext(), str);
        if (b != null) {
            viewGroup.setBackgroundDrawable(new NinePatchDrawable(viewGroup.getContext().getResources(), b, b.getNinePatchChunk(), new Rect(10, 10, 10, 30), null));
        }
    }

    private static void a(TencentMapContext tencentMapContext, LinearLayout linearLayout, String str, String str2) {
        if (linearLayout == null || linearLayout.getContext() == null) {
            return;
        }
        Context context = linearLayout.getContext();
        TextView textView = (TextView) linearLayout.findViewWithTag(str);
        if (TextUtils.isEmpty(str2)) {
            if (textView != null) {
                linearLayout.removeView(textView);
                return;
            }
            return;
        }
        if (textView == null) {
            textView = new mk(context, tencentMapContext);
            textView.setTag(str);
            textView.setGravity(3);
            textView.setTextColor(-16777216);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        textView.setText(str2);
    }

    private qb b(MarkerOptions markerOptions) {
        int infoWindowOffsetX = markerOptions.getInfoWindowOffsetX();
        int infowindowOffsetY = markerOptions.getInfowindowOffsetY();
        d();
        e();
        float f = this.w - ((infoWindowOffsetX * 1.0f) / this.q);
        float f2 = this.x - ((infowindowOffsetY * 1.0f) / this.r);
        qb qbVar = new qb();
        qbVar.i = GeoPoint.from(markerOptions.getPosition());
        qbVar.m = markerOptions.getAlpha();
        qb a = qbVar.a(f, f2);
        a.n = false;
        a.s = (int) markerOptions.getZIndex();
        a.t = markerOptions.getLevel();
        a.u = this.v;
        a.v = true;
        return a;
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void a(MarkerOptions markerOptions) {
        if (markerOptions == null || this.o == null) {
            return;
        }
        setVisible(markerOptions.isVisible());
        setLevel(markerOptions.getLevel());
        i();
        qb b = b(markerOptions);
        if (b == null) {
            return;
        }
        this.o.a(b);
        a(gx.a(this.A));
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void a(LatLng latLng) {
        if (latLng == null) {
            return;
        }
        if (this.s == null) {
            this.s = GeoPoint.from(latLng);
        } else {
            this.s.setLatitudeE6((int) (latLng.latitude * 1000000.0d));
            this.s.setLongitudeE6((int) (latLng.longitude * 1000000.0d));
        }
        if (this.o != null) {
            this.o.a(this.s);
        }
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void b(boolean z) {
        this.z = z;
        if (this.t == null || this.t.e_ == 0) {
            return;
        }
        ((VectorMap) this.t.e_).o.v = true;
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final boolean c() {
        return this.z && this.p != null;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final Rect getScreenBound(eq eqVar) {
        if (this.o == null) {
            return null;
        }
        return this.o.a(eqVar);
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final Rect getBound(eq eqVar) {
        if (this.o != null) {
            return this.o.b(eqVar);
        }
        return new Rect(0, 0, 0, 0);
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void d() {
        if (this.u == null || this.t.G() == null) {
            return;
        }
        int width = this.u.getWidth(this.t.G());
        float infoWindowAnchorU = this.u.getOptions() != null ? this.u.getOptions().getInfoWindowAnchorU() : 0.5f;
        int i = this.q;
        if (i == 0) {
            i = 1;
        }
        this.w = infoWindowAnchorU + ((width * (this.u.getAnchorU() - 0.5f)) / i);
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void e() {
        if (this.u == null || this.t.G() == null) {
            return;
        }
        int height = (int) (this.u.getHeight(this.t.G()) * this.u.getAnchorV());
        int i = this.r;
        float infoWindowAnchorV = this.u.getOptions() != null ? this.u.getOptions().getInfoWindowAnchorV() : 1.0f;
        if (i == 0) {
            i = 1;
        }
        float f = i;
        this.x = (height + (infoWindowAnchorV * f)) / f;
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void a(boolean z) {
        this.v = z;
        if (this.o != null) {
            this.o.a(z);
        }
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void a(int i, int i2) {
        if (this.o != null) {
            a(true);
            this.o.a(new GeoPoint(i2, i));
        }
    }

    private void a(Bitmap bitmap) {
        this.p = bitmap;
        if (bitmap == null) {
            return;
        }
        kj.a("setBitmapAssist:".concat(String.valueOf(bitmap)));
        StringBuilder sb = new StringBuilder();
        sb.append(bitmap.hashCode() + y.getAndIncrement());
        String sb2 = sb.toString();
        if (this.o != null) {
            this.o.a(sb2, bitmap);
        }
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void j_() {
        if (this.h && this.o != null) {
            this.o.j_();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.or
    public final void s() {
        super.s();
        if (this.o == null || this.o.f() == this.B) {
            return;
        }
        kj.b(ki.f, "设置主从绑定关系：" + this.u.a() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.o.f());
        this.B = this.o.f();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f, float f2) {
        if (this.o == null) {
            return false;
        }
        return this.o.onTap(f, f2);
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        if (this.p != null) {
            this.p.recycle();
            this.p = null;
        }
        this.u = null;
        this.t = null;
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void h_() {
        releaseData();
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void i_() {
        int i;
        int i2 = 0;
        if (this.u == null || this.u.getOptions() == null) {
            i = 0;
        } else {
            i2 = this.u.getOptions().getInfoWindowOffsetX();
            i = this.u.getOptions().getInfowindowOffsetY();
        }
        d();
        e();
        float f = this.w - ((i2 * 1.0f) / this.q);
        float f2 = this.x - ((i * 1.0f) / this.r);
        if (this.o != null) {
            this.o.a(f, f2);
        }
    }

    @Override // com.tencent.mapsdk.internal.eo
    public final void f() {
        if (this.u == null) {
            return;
        }
        a(this.u.getOptions());
    }
}
