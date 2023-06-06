package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class f extends l<a> {
    public static ChangeQuickRedirect h;
    private static final Set<Integer> s;
    public float i;
    public float j;
    private final Map<Integer, e> t;
    private PointF u;
    private boolean v;
    private float w;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean a(f fVar);

        boolean a(f fVar, float f, float f2);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final int f() {
        return 1;
    }

    static {
        HashSet hashSet = new HashSet();
        s = hashSet;
        hashSet.add(13);
    }

    public f(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cd7f6a211e4af360735cd879ab3df03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cd7f6a211e4af360735cd879ab3df03");
        } else {
            this.t = new HashMap();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    @NonNull
    public final Set<Integer> b() {
        return s;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l, com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9083f0f33bbf68d5a65090656a2df4f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9083f0f33bbf68d5a65090656a2df4f2")).booleanValue();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 5:
                this.v = true;
                this.t.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new e(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
                break;
            case 1:
                this.t.clear();
                break;
            case 3:
                this.t.clear();
                break;
            case 6:
                this.v = true;
                this.t.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
                break;
        }
        return super.a(motionEvent);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115da1098e1b18168be2ce8aa720b769", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115da1098e1b18168be2ce8aa720b769")).booleanValue();
        }
        super.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        char c = 1;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f04403c5e8360920081d57d5769b40a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f04403c5e8360920081d57d5769b40a");
        } else {
            for (Integer num : this.l) {
                int intValue = num.intValue();
                e eVar = this.t.get(Integer.valueOf(intValue));
                float x = this.d.getX(this.d.findPointerIndex(intValue));
                float y = this.d.getY(this.d.findPointerIndex(intValue));
                Object[] objArr3 = new Object[2];
                objArr3[0] = Float.valueOf(x);
                objArr3[c] = Float.valueOf(y);
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "1ba1eb77536f3b8844f43efaeedf440a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "1ba1eb77536f3b8844f43efaeedf440a");
                } else {
                    eVar.d = eVar.f;
                    eVar.e = eVar.g;
                    eVar.f = x;
                    eVar.g = y;
                    eVar.h = eVar.d - eVar.f;
                    eVar.i = eVar.e - eVar.g;
                    eVar.j = eVar.b - eVar.f;
                    eVar.k = eVar.c - eVar.g;
                }
                c = 1;
            }
        }
        if (k()) {
            PointF i = i();
            this.i = this.u.x - i.x;
            this.j = this.u.y - i.y;
            this.u = i;
            if (this.v) {
                this.v = false;
                return ((a) this.g).a(this, 0.0f, 0.0f);
            }
            return ((a) this.g).a(this, this.i, this.j);
        } else if (a(13) && ((a) this.g).a(this)) {
            j();
            this.u = i();
            this.v = false;
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.mapsdk.core.gesture.f.h
            java.lang.String r10 = "0c2d2a014f89bffa978f1f955c281941"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            java.util.Map<java.lang.Integer, com.sankuai.meituan.mapsdk.core.gesture.e> r1 = r11.t
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            com.sankuai.meituan.mapsdk.core.gesture.e r2 = (com.sankuai.meituan.mapsdk.core.gesture.e) r2
            if (r2 == 0) goto L43
            float r3 = r2.j
            float r3 = java.lang.Math.abs(r3)
            float r4 = r11.w
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L4f
        L43:
            float r2 = r2.k
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11.w
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L29
        L4f:
            r0 = 1
            return r0
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.core.gesture.f.m():boolean");
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "219c0e06698114a54e280f6716a536c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "219c0e06698114a54e280f6716a536c0")).booleanValue() : super.a(i) && m();
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbf58900ede32b416e13a477ca74c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbf58900ede32b416e13a477ca74c63");
        } else {
            super.d();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a822035049bf54b0c7e02dd7ec5a5cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a822035049bf54b0c7e02dd7ec5a5cf");
        } else {
            super.e();
        }
    }
}
