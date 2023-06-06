package com.sankuai.waimai.machpro.component.scroll;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends ScrollView {
    public static ChangeQuickRedirect a;
    public boolean b;
    private boolean c;
    private boolean d;
    private OverScroller e;
    private b f;
    private View g;
    private boolean h;
    private boolean i;
    private final f j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private c o;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d3929b42b687c0a1a5f6b4603c116f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d3929b42b687c0a1a5f6b4603c116f");
            return;
        }
        this.c = false;
        this.d = false;
        this.i = false;
        this.j = new f();
        this.m = true;
        this.n = 0;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0584a45ae2c04f85c4069c4fa5f27f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0584a45ae2c04f85c4069c4fa5f27f");
            return;
        }
        try {
            if (this.e != null) {
                return;
            }
            Field declaredField = ScrollView.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            this.e = (OverScroller) declaredField.get(this);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("MPHorizontalScrollView call initScroller failed！ | " + e.getMessage());
        }
    }

    public final void setScrollListener(b bVar) {
        this.f = bVar;
    }

    public final void setPagingEnabled(boolean z) {
        this.i = z;
    }

    public final void setScrollEnbaled(boolean z) {
        this.m = z;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddc41d278bbea4b2ecb85075253a8ba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddc41d278bbea4b2ecb85075253a8ba2");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.d) {
            this.d = true;
        }
        if (this.f != null) {
            this.f.a(this, i, i2, i3, i4);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dad78dcba9da3571b8b1a9bc2319581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dad78dcba9da3571b8b1a9bc2319581");
        } else if (this.c || !this.d || this.e == null || !this.e.isFinished()) {
        } else {
            this.d = false;
            this.l = false;
            if (this.f != null) {
                this.f.a();
            }
        }
    }

    public final void setContentView(View view) {
        this.g = view;
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42db25927091dab6aab893a0450a5b4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42db25927091dab6aab893a0450a5b4b");
        } else if (this.i) {
            a(i);
        } else {
            super.fling(i);
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f0e36bf99bf538db18c3542fa1e7a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f0e36bf99bf538db18c3542fa1e7a8");
            return;
        }
        double snapInterval = getSnapInterval();
        double scrollY = getScrollY();
        double d = scrollY / snapInterval;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        int round = (int) Math.round(d);
        int round2 = (int) Math.round(b(i) / snapInterval);
        if (i > 0 && ceil == floor) {
            ceil++;
        } else if (i < 0 && floor == ceil) {
            floor--;
        }
        if (i > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d2 = round * snapInterval;
        if (d2 != scrollY) {
            this.h = true;
            this.l = true;
            smoothScrollTo(getScrollX(), (int) d2);
        }
    }

    private int getSnapInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5dc4772cf98cd3a935c697afd970bc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5dc4772cf98cd3a935c697afd970bc")).intValue() : getHeight();
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800db4a7f48ffe217af427f1a57cb598", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800db4a7f48ffe217af427f1a57cb598")).intValue();
        }
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        return overScroller.getFinalY();
    }

    private int getMaxScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c82d559726dc18c781c3d5786d920ff1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c82d559726dc18c781c3d5786d920ff1")).intValue() : Math.max(0, this.g.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0b62fe2292868a98a6ddab20a107e0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0b62fe2292868a98a6ddab20a107e0f")).booleanValue();
        }
        if (this.n == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb73cba25f01e4512b6f6338f0870a6a", RobustBitConfig.DEFAULT_VALUE)) {
                ViewParent parent = getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent instanceof c) {
                        this.o = (c) parent;
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb73cba25f01e4512b6f6338f0870a6a")).booleanValue();
            }
            this.n = z ? 1 : 2;
        }
        if (this.n == 1 && this.o != null) {
            this.o.a(true);
        }
        if (this.b) {
            motionEvent.setAction(0);
            this.b = false;
        }
        if (motionEvent.getAction() != 2) {
            this.k = true;
        }
        if (this.l) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9b8bbe1f14e051190caaf72de444320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9b8bbe1f14e051190caaf72de444320");
            return;
        }
        this.k = z;
        if (this.g instanceof ViewGroup) {
            ((ViewGroup) this.g).requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e508a5ed249801fc29a5d2ff33e3a23", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e508a5ed249801fc29a5d2ff33e3a23")).booleanValue();
        }
        if (this.k) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c724f624d05e780e95f7283d4812259", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c724f624d05e780e95f7283d4812259")).booleanValue();
        }
        if (this.m) {
            if (this.f != null) {
                this.f.a(true);
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 2:
                    this.h = false;
                    this.c = true;
                    break;
                case 1:
                case 3:
                    this.c = false;
                    if (this.f != null) {
                        this.f.a(false);
                    }
                    if (!this.h && this.i) {
                        f fVar = this.j;
                        Object[] objArr2 = {motionEvent};
                        ChangeQuickRedirect changeQuickRedirect2 = f.a;
                        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "97f419d9758b92aa1e939deb95d6ce87", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "97f419d9758b92aa1e939deb95d6ce87");
                        } else {
                            int action = motionEvent.getAction() & 255;
                            if (fVar.b == null) {
                                fVar.b = VelocityTracker.obtain();
                            }
                            fVar.b.addMovement(motionEvent);
                            if (action == 1 || action == 3) {
                                fVar.b.computeCurrentVelocity(1);
                                fVar.c = fVar.b.getXVelocity();
                                fVar.d = fVar.b.getYVelocity();
                                if (fVar.b != null) {
                                    fVar.b.recycle();
                                    fVar.b = null;
                                }
                            }
                        }
                        a((int) this.j.d);
                        break;
                    } else {
                        b();
                        break;
                    }
                    break;
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13ba11ff15d164d2d69ec327142d6f0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13ba11ff15d164d2d69ec327142d6f0b");
            return;
        }
        super.computeScroll();
        b();
    }
}
