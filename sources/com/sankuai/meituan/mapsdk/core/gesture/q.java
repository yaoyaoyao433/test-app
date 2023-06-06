package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class q extends l<a> {
    public static ChangeQuickRedirect h;
    private static final Set<Integer> j;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private boolean G;
    float i;
    private final GestureDetectorCompat s;
    private boolean t;
    private PointF u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(q qVar, float f, float f2);

        boolean a(q qVar);

        boolean b(q qVar);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.a
    public final /* bridge */ /* synthetic */ AndroidGesturesManager a() {
        return super.a();
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final /* bridge */ /* synthetic */ void a(float f) {
        super.a(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final /* bridge */ /* synthetic */ void b(@DimenRes int i) {
        super.b(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final /* bridge */ /* synthetic */ int h() {
        return super.h();
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final /* bridge */ /* synthetic */ PointF i() {
        return super.i();
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    public final /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public static /* synthetic */ boolean a(q qVar, boolean z) {
        qVar.t = true;
        return true;
    }

    static {
        HashSet hashSet = new HashSet();
        j = hashSet;
        hashSet.add(1);
        j.add(15);
    }

    public q(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db893a20a034917280bed7168af43ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db893a20a034917280bed7168af43ad");
        } else {
            this.s = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.meituan.mapsdk.core.gesture.q.1
                public static ChangeQuickRedirect a;

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                    Object[] objArr2 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c47b688c30d47412c63d7da9dbe695ca", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c47b688c30d47412c63d7da9dbe695ca")).booleanValue();
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        q.a(q.this, true);
                        q.this.u = new PointF(motionEvent.getX(), motionEvent.getY());
                    }
                    return true;
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final boolean c() {
        float f;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d89f0f1f689c6c939758f9afacbd20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d89f0f1f689c6c939758f9afacbd20")).booleanValue();
        }
        super.c();
        if (super.k() && this.t && super.h() > 1) {
            e();
            return false;
        }
        PointF i = this.t ? this.u : super.i();
        this.z = 0.0f;
        this.A = 0.0f;
        for (int i2 = 0; i2 < super.h(); i2++) {
            this.z += Math.abs(this.d.getX(i2) - i.x);
            this.A += Math.abs(this.d.getY(i2) - i.y);
        }
        this.z *= 2.0f;
        this.A *= 2.0f;
        if (this.t) {
            this.y = this.A;
        } else {
            this.y = (float) Math.hypot(this.z, this.A);
        }
        if (this.v == 0.0f) {
            this.v = this.y;
            this.w = this.z;
            this.x = this.A;
        }
        this.E = Math.abs(this.v - this.y);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc795684e2ae3181ceb5a3d00bb9a201", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc795684e2ae3181ceb5a3d00bb9a201")).floatValue();
        } else if (this.t) {
            boolean z2 = (this.d.getY() < this.u.y && this.y < this.B) || (this.d.getY() > this.u.y && this.y > this.B);
            float abs = Math.abs(1.0f - (this.y / this.B)) * 0.5f;
            if (this.B > 0.0f) {
                f = z2 ? abs + 1.0f : 1.0f - abs;
            }
            f = 1.0f;
        } else {
            if (this.B > 0.0f) {
                f = this.y / this.B;
            }
            f = 1.0f;
        }
        this.i = f;
        this.G = this.i < 1.0f;
        if (super.k() && this.y > 0.0f && Float.compare(this.i, 1.0f) != 0) {
            z = ((a) this.g).b(this);
        } else if (a(this.t ? 15 : 1) && this.E >= this.F && (z = ((a) this.g).a(this))) {
            j();
        }
        this.B = this.y;
        this.C = this.z;
        this.D = this.A;
        return z;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b405aa9d732aa94b327cbb8a852a8eb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b405aa9d732aa94b327cbb8a852a8eb5");
            return;
        }
        super.e();
        ((a) this.g).a(this, this.q, this.r);
        this.t = false;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451ae543660a8359f19ac760b54d61d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451ae543660a8359f19ac760b54d61d5");
            return;
        }
        super.d();
        this.v = 0.0f;
        this.E = 0.0f;
        this.y = 0.0f;
        this.B = 0.0f;
        this.i = 1.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l, com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e196f796128ca0de5666f2416b030db7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e196f796128ca0de5666f2416b030db7")).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.t) {
            if (actionMasked == 5 || actionMasked == 3) {
                if (!super.k()) {
                    this.t = false;
                } else {
                    super.l();
                }
            } else if (!super.k() && actionMasked == 1) {
                this.t = false;
            }
        }
        return this.s.onTouchEvent(motionEvent) | super.a(motionEvent);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59d36f0055d413db2932a5a6e3d8565", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59d36f0055d413db2932a5a6e3d8565")).booleanValue();
        }
        if (super.g()) {
            return true;
        }
        return !this.t && super.h() < 2;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    @NonNull
    public final Set<Integer> b() {
        return j;
    }

    public final void c(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf((int) R.dimen.mtmapsdk_defaultScaleSpanSinceStartThreshold)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc78420bd1fbb42d6f9adb67370fd81b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc78420bd1fbb42d6f9adb67370fd81b");
        } else {
            this.F = this.b.getResources().getDimension(R.dimen.mtmapsdk_defaultScaleSpanSinceStartThreshold);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f67ac8d1fb798f6473f357476ee869", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f67ac8d1fb798f6473f357476ee869")).intValue() : (!super.k() || this.t) ? 1 : 2;
    }
}
