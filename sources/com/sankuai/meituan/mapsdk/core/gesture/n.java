package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class n extends l<a> {
    public static ChangeQuickRedirect h;
    private static final Set<Integer> t;
    public float i;
    public float j;
    float s;
    private float u;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean a(n nVar);

        boolean a(n nVar, float f, float f2);
    }

    static {
        HashSet hashSet = new HashSet();
        t = hashSet;
        hashSet.add(3);
    }

    public n(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d109a8e2cf55519a6cd5cca83d2d59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d109a8e2cf55519a6cd5cca83d2d59");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    @NonNull
    public final Set<Integer> b() {
        return t;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final boolean c() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff68dd899704f2dfbe1a8d522f45488", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff68dd899704f2dfbe1a8d522f45488")).booleanValue();
        }
        super.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f096841e112994a41a95ae8477507ef", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f096841e112994a41a95ae8477507ef")).floatValue();
        } else {
            float y = this.e.getY(this.e.findPointerIndex(this.l.get(0).intValue()));
            float y2 = this.e.getY(this.e.findPointerIndex(this.l.get(1).intValue()));
            float f2 = (y + y2) / 2.0f;
            float y3 = this.d.getY(this.d.findPointerIndex(this.l.get(0).intValue()));
            float y4 = this.d.getY(this.d.findPointerIndex(this.l.get(1).intValue()));
            float f3 = (y3 + y4) / 2.0f;
            if ((y3 <= y || y4 <= y2) && (y3 >= y || y4 >= y2)) {
                d();
                f = 0.0f;
            } else {
                f = f3 - f2;
            }
        }
        this.j = f;
        this.i += this.j;
        if (k() && this.j != 0.0f) {
            return ((a) this.g).a(this, this.j, this.i);
        }
        if (a(3) && ((a) this.g).a(this)) {
            j();
            return true;
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf15943826d684e01d8fe3ff1fb1034", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf15943826d684e01d8fe3ff1fb1034")).booleanValue() : Math.abs(this.i) >= this.u && super.a(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final boolean g() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f633aba4af8cb16404f81c7b3ab6a0ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f633aba4af8cb16404f81c7b3ab6a0ef")).booleanValue();
        }
        if (!super.g()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa1b8dfec05c96b01db9805eab14316f", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa1b8dfec05c96b01db9805eab14316f")).booleanValue();
            } else {
                g gVar = this.m.get(new k(this.l.get(0), this.l.get(1)));
                double degrees = Math.toDegrees(Math.abs(Math.atan2(gVar.e, gVar.d)));
                z = degrees <= ((double) this.s) || 180.0d - degrees <= ((double) this.s);
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999159e1e04084a3ab7db4e287c6a4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999159e1e04084a3ab7db4e287c6a4e7");
        } else {
            super.e();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424587b4d2e0726199770577b510efeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424587b4d2e0726199770577b510efeb");
            return;
        }
        super.d();
        this.i = 0.0f;
    }

    public final void c(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf((int) R.dimen.mtmapsdk_defaultShovePixelThreshold)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8bd6de142af62e21d585484325a301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8bd6de142af62e21d585484325a301");
        } else {
            this.u = this.b.getResources().getDimension(R.dimen.mtmapsdk_defaultShovePixelThreshold);
        }
    }
}
