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
public final class o extends l<a> {
    public static ChangeQuickRedirect h;
    private static final Set<Integer> t;
    public float i;
    public float j;
    float s;
    private float u;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean a(o oVar);
    }

    static {
        HashSet hashSet = new HashSet();
        t = hashSet;
        hashSet.add(14);
    }

    public o(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae548e0bf665d0fe2f0dbbe4466c4c48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae548e0bf665d0fe2f0dbbe4466c4c48");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a69bd1c120db07fe65f94e145982878", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a69bd1c120db07fe65f94e145982878")).booleanValue();
        }
        super.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fd1a961c4871dd9343d3aa8bd78449e", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fd1a961c4871dd9343d3aa8bd78449e")).floatValue();
        } else {
            float x = this.e.getX(this.e.findPointerIndex(this.l.get(0).intValue()));
            float x2 = this.e.getX(this.e.findPointerIndex(this.l.get(1).intValue()));
            float f2 = (x + x2) / 2.0f;
            float x3 = this.d.getX(this.d.findPointerIndex(this.l.get(0).intValue()));
            float x4 = this.d.getX(this.d.findPointerIndex(this.l.get(1).intValue()));
            float f3 = (x3 + x4) / 2.0f;
            if ((x3 <= x || x4 <= x2) && (x3 >= x || x4 >= x2)) {
                d();
                f = 0.0f;
            } else {
                f = f3 - f2;
            }
        }
        this.j = f;
        this.i += this.j;
        if ((!k() || this.j == 0.0f) && a(14) && ((a) this.g).a(this)) {
            j();
            return true;
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac821fc8214cc1f507c8d2ad736c1852", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac821fc8214cc1f507c8d2ad736c1852")).booleanValue() : Math.abs(this.i) >= this.u && super.a(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final boolean g() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e4fcab2f90e6b68c956bfafb231eafd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e4fcab2f90e6b68c956bfafb231eafd")).booleanValue();
        }
        if (!super.g()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d59c3026f1dff74f49b31975aede00b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d59c3026f1dff74f49b31975aede00b")).booleanValue();
            } else {
                g gVar = this.m.get(new k(this.l.get(0), this.l.get(1)));
                z = Math.abs(Math.toDegrees(Math.abs(Math.atan2((double) gVar.e, (double) gVar.d))) - 90.0d) <= ((double) this.s);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8152c15e6c6fcfeb2658fb420e276b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8152c15e6c6fcfeb2658fb420e276b");
        } else {
            super.e();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed667b60009716d44bb316891837864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed667b60009716d44bb316891837864");
            return;
        }
        super.d();
        this.i = 0.0f;
    }

    public final void c(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf((int) R.dimen.mtmapsdk_defaultShovePixelThreshold)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694a57297fa5285e4f731c5f9475d078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694a57297fa5285e4f731c5f9475d078");
        } else {
            this.u = this.b.getResources().getDimension(R.dimen.mtmapsdk_defaultShovePixelThreshold);
        }
    }
}
