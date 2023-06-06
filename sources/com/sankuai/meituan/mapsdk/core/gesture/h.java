package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.support.annotation.DimenRes;
import android.support.annotation.UiThread;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public abstract class h<L> extends a<L> {
    public static ChangeQuickRedirect k;
    private final float h;
    private float i;
    private PointF j;
    public final List<Integer> l;
    public final HashMap<k, g> m;
    private final j n;
    private DisplayMetrics o;

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public int f() {
        return 2;
    }

    public h(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa87ea917f64765ce9b45b64634a6dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa87ea917f64765ce9b45b64634a6dd");
            return;
        }
        this.l = new ArrayList();
        this.m = new HashMap<>();
        this.j = new PointF();
        this.n = new j();
        this.h = ViewConfiguration.get(context).getScaledEdgeSlop();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0182 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
    @Override // com.sankuai.meituan.mapsdk.core.gesture.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.core.gesture.h.a(android.view.MotionEvent):boolean");
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ad52c7ab037ac1a449ca0634fc5fa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ad52c7ab037ac1a449ca0634fc5fa9");
        } else if (this.c != null) {
            this.o = new DisplayMetrics();
            Display defaultDisplay = this.c.getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(this.o);
            } else {
                defaultDisplay.getMetrics(this.o);
            }
        } else {
            this.o = this.b.getResources().getDisplayMetrics();
        }
    }

    private boolean b(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c7104ca41a935c7bc76b5fe88f0ad4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c7104ca41a935c7bc76b5fe88f0ad4")).booleanValue();
        }
        for (Integer num : this.l) {
            if (motionEvent.findPointerIndex(num.intValue()) != -1) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a45e208f19d05191878f9fa62fca3b9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a45e208f19d05191878f9fa62fca3b9d")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "984ab5cf8cd9e9ab15174eb1ed1d2a4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "984ab5cf8cd9e9ab15174eb1ed1d2a4d")).booleanValue();
        }
        Iterator<g> it = this.m.values().iterator();
        while (it.hasNext()) {
            if (it.next().f < this.i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.a
    public boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b479ed9ff91c4b40a6ec71bdad393a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b479ed9ff91c4b40a6ec71bdad393a")).booleanValue() : super.a(i) && !g();
    }

    private void e() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da59dc9be83ec2075ae279c5e0608d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da59dc9be83ec2075ae279c5e0608d0");
            return;
        }
        this.m.clear();
        while (i < this.l.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.l.size(); i3++) {
                if (this.e.getPointerCount() > Math.max(i, i3) && this.d.getPointerCount() > Math.max(i, i3)) {
                    int intValue = this.l.get(i).intValue();
                    int intValue2 = this.l.get(i3).intValue();
                    float x = this.e.getX(this.e.findPointerIndex(intValue));
                    float y = this.e.getY(this.e.findPointerIndex(intValue));
                    float x2 = this.e.getX(this.e.findPointerIndex(intValue2)) - x;
                    float y2 = this.e.getY(this.e.findPointerIndex(intValue2)) - y;
                    float x3 = this.d.getX(this.d.findPointerIndex(intValue));
                    float y3 = this.d.getY(this.d.findPointerIndex(intValue));
                    this.m.put(new k(Integer.valueOf(intValue), Integer.valueOf(intValue2)), new g(x2, y2, this.d.getX(this.d.findPointerIndex(intValue2)) - x3, this.d.getY(this.d.findPointerIndex(intValue2)) - y3));
                }
            }
            i = i2;
        }
    }

    public int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d211c10519522ba408a382ddab9bf47", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d211c10519522ba408a382ddab9bf47")).intValue() : this.l.size();
    }

    public PointF i() {
        return this.j;
    }

    public void a(float f) {
        this.i = f;
    }

    public void b(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55407dbb980343db350abf7b842701b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55407dbb980343db350abf7b842701b8");
        } else {
            a(this.b.getResources().getDimension(i));
        }
    }
}
