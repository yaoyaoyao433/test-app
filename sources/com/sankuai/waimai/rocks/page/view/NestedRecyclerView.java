package com.sankuai.waimai.rocks.page.view;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NestedRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    public HashSet<d> b;
    public e c;
    private a d;
    private HashSet<Object> e;
    private HashSet<b> f;
    private f g;
    private c h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private RecyclerView.k o;
    private boolean p;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public abstract RecyclerView a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(RecyclerView recyclerView, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e {
        public static ChangeQuickRedirect a;
    }

    public static /* synthetic */ void b(NestedRecyclerView nestedRecyclerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nestedRecyclerView, changeQuickRedirect, false, "481e65b4dde03cbb8100f4c7bbe9a5a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nestedRecyclerView, changeQuickRedirect, false, "481e65b4dde03cbb8100f4c7bbe9a5a1");
        } else if (nestedRecyclerView.getAdapter() == null || nestedRecyclerView.d == null) {
        } else {
            int tabPos = nestedRecyclerView.getTabPos();
            RecyclerView.LayoutManager layoutManager = nestedRecyclerView.getLayoutManager();
            if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (tabPos >= findFirstVisibleItemPosition && tabPos <= findLastVisibleItemPosition) {
                if (!nestedRecyclerView.p) {
                    Iterator<d> it = nestedRecyclerView.b.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    nestedRecyclerView.p = true;
                }
                View childAt = nestedRecyclerView.getChildAt(tabPos - findFirstVisibleItemPosition);
                if (childAt != null) {
                    if (childAt.getTop() <= nestedRecyclerView.j) {
                        nestedRecyclerView.setTabVisible(true);
                    } else {
                        nestedRecyclerView.setTabVisible(false);
                    }
                }
            } else if (tabPos < findFirstVisibleItemPosition) {
                nestedRecyclerView.setTabVisible(true);
            } else {
                nestedRecyclerView.setTabVisible(false);
            }
            if (nestedRecyclerView.canScrollVertically(1) || !nestedRecyclerView.canScrollVertically(-1)) {
                return;
            }
            nestedRecyclerView.setTabVisible(true);
        }
    }

    public NestedRecyclerView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d14bd870aa53a261553da6545ea1e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d14bd870aa53a261553da6545ea1e3");
            return;
        }
        this.b = new HashSet<>();
        this.e = new HashSet<>();
        this.f = new HashSet<>();
        this.m = false;
        this.n = false;
        this.c = null;
        this.o = new RecyclerView.k() { // from class: com.sankuai.waimai.rocks.page.view.NestedRecyclerView.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c9cef0896db73185e3bb29945adf57d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c9cef0896db73185e3bb29945adf57d");
                    return;
                }
                f.a(NestedRecyclerView.this.g, 1);
                Iterator it = NestedRecyclerView.this.e.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "798957bdaae560ae7e884034e03a21a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "798957bdaae560ae7e884034e03a21a7");
                } else {
                    f.a(NestedRecyclerView.this.g, 1);
                }
            }
        };
        a(context);
    }

    public NestedRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0ad9ca1301e04bd092dd625411ce1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0ad9ca1301e04bd092dd625411ce1e");
            return;
        }
        this.b = new HashSet<>();
        this.e = new HashSet<>();
        this.f = new HashSet<>();
        this.m = false;
        this.n = false;
        this.c = null;
        this.o = new RecyclerView.k() { // from class: com.sankuai.waimai.rocks.page.view.NestedRecyclerView.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c9cef0896db73185e3bb29945adf57d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c9cef0896db73185e3bb29945adf57d");
                    return;
                }
                f.a(NestedRecyclerView.this.g, 1);
                Iterator it = NestedRecyclerView.this.e.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "798957bdaae560ae7e884034e03a21a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "798957bdaae560ae7e884034e03a21a7");
                } else {
                    f.a(NestedRecyclerView.this.g, 1);
                }
            }
        };
        a(context);
    }

    public void setForbidCalibrate(boolean z) {
        this.n = z;
    }

    public a getChildRecyclerViewHelper() {
        return this.d;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b8a08b7d711d6e91363a85cbde8b7c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b8a08b7d711d6e91363a85cbde8b7c6");
            return;
        }
        setNestedScrollingEnabled(false);
        this.g = new f(context);
        this.h = new c();
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).findViewById(16908290);
        }
        addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.rocks.page.view.NestedRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77913ee297285f4f80652f1735d1db1e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77913ee297285f4f80652f1735d1db1e");
                    return;
                }
                if (NestedRecyclerView.this.o != null) {
                    NestedRecyclerView.this.o.onScrolled(recyclerView, i, i2);
                }
                NestedRecyclerView.b(NestedRecyclerView.this);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ae5dc7c00ea737b32da3e19610bd70f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ae5dc7c00ea737b32da3e19610bd70f");
                    return;
                }
                NestedRecyclerView.b(NestedRecyclerView.this);
                if (NestedRecyclerView.this.o != null) {
                    NestedRecyclerView.this.o.onScrollStateChanged(recyclerView, i);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a8d39f236ac2bab93d14b784309f505", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a8d39f236ac2bab93d14b784309f505");
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        boolean z;
        boolean z2 = true;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53cab00c5c283923cb2a718122808e05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53cab00c5c283923cb2a718122808e05")).booleanValue();
        }
        if (this.m) {
            return super.dispatchTouchEvent(motionEvent);
        }
        f fVar = this.g;
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "85f8067ea482b7489c283fbfcab74dd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "85f8067ea482b7489c283fbfcab74dd0");
        } else {
            if (fVar.d == null) {
                fVar.d = VelocityTracker.obtain();
            }
            fVar.d.addMovement(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
                c cVar = this.h;
                Object[] objArr3 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "bbf1f2611b7a2bdeb176bd73edbe2b05", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "bbf1f2611b7a2bdeb176bd73edbe2b05");
                } else {
                    cVar.b = motionEvent.getPointerId(0);
                    cVar.a(motionEvent, motionEvent.findPointerIndex(cVar.b));
                }
                f fVar2 = this.g;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "ebc6f38c6c4de006ca0dd6fb2a30d18f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "ebc6f38c6c4de006ca0dd6fb2a30d18f");
                } else {
                    fVar2.g = 2;
                    fVar2.a();
                }
                this.k = false;
                break;
            case 1:
                this.h.b = -1;
                f fVar3 = this.g;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = f.a;
                if (PatchProxy.isSupport(objArr5, fVar3, changeQuickRedirect5, false, "3f984b64b29daac7ae60db4fbe0c242c", RobustBitConfig.DEFAULT_VALUE)) {
                    bool = (Boolean) PatchProxy.accessDispatch(objArr5, fVar3, changeQuickRedirect5, false, "3f984b64b29daac7ae60db4fbe0c242c");
                } else if (fVar3.g == 0 || fVar3.g != 1) {
                    NestedRecyclerView.this.g.a();
                    bool = null;
                } else {
                    f fVar4 = NestedRecyclerView.this.g;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = f.a;
                    if (PatchProxy.isSupport(objArr6, fVar4, changeQuickRedirect6, false, "7412efed1f4b9657bd5aea5a5b29a9d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, fVar4, changeQuickRedirect6, false, "7412efed1f4b9657bd5aea5a5b29a9d4");
                    } else {
                        if (fVar4.f == 0) {
                            fVar4.f = fVar4.b.getScaledMinimumFlingVelocity();
                        }
                        if (fVar4.d == null) {
                            fVar4.d = VelocityTracker.obtain();
                        }
                        if (NestedRecyclerView.this.c != null) {
                            e eVar = NestedRecyclerView.this.c;
                            VelocityTracker velocityTracker = fVar4.d;
                            Object[] objArr7 = {velocityTracker};
                            ChangeQuickRedirect changeQuickRedirect7 = e.a;
                            if (PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "a2d167cbd5b9253dd8ad7a8c34e80c48", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, eVar, changeQuickRedirect7, false, "a2d167cbd5b9253dd8ad7a8c34e80c48");
                            } else {
                                velocityTracker.computeCurrentVelocity(1000);
                            }
                        } else {
                            fVar4.d.computeCurrentVelocity(1000);
                        }
                        int yVelocity = (int) fVar4.d.getYVelocity();
                        if (Math.abs(yVelocity) > fVar4.f) {
                            int i = -yVelocity;
                            Object[] objArr8 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect8 = f.a;
                            if (PatchProxy.isSupport(objArr8, fVar4, changeQuickRedirect8, false, "9cf8c634fe30c1310664d510d26d2b54", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, fVar4, changeQuickRedirect8, false, "9cf8c634fe30c1310664d510d26d2b54");
                            } else {
                                fVar4.e = 0;
                                NestedRecyclerView.this.a(2);
                                if (NestedRecyclerView.this.c != null) {
                                    e eVar2 = NestedRecyclerView.this.c;
                                    Scroller scroller = fVar4.c;
                                    int i2 = fVar4.e;
                                    Object[] objArr9 = {scroller, 0, Integer.valueOf(i2), 0, Integer.valueOf(i), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE};
                                    ChangeQuickRedirect changeQuickRedirect9 = e.a;
                                    if (PatchProxy.isSupport(objArr9, eVar2, changeQuickRedirect9, false, "a64a4747bea15aa9e89942e13afb5d6a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr9, eVar2, changeQuickRedirect9, false, "a64a4747bea15aa9e89942e13afb5d6a");
                                    } else {
                                        scroller.fling(0, i2, 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                    }
                                } else {
                                    fVar4.c.fling(0, fVar4.e, 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                }
                                NestedRecyclerView.this.post(fVar4);
                            }
                        } else {
                            NestedRecyclerView.this.a(0);
                        }
                    }
                    bool = Boolean.TRUE;
                }
                this.k = bool != null;
                return this.k || super.dispatchTouchEvent(motionEvent);
            case 2:
                c cVar2 = this.h;
                Object[] objArr10 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect10 = c.a;
                int intValue = PatchProxy.isSupport(objArr10, cVar2, changeQuickRedirect10, false, "f2f46ef7d7ee177e59c1c7da87ddd209", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr10, cVar2, changeQuickRedirect10, false, "f2f46ef7d7ee177e59c1c7da87ddd209")).intValue() : cVar2.b == -1 ? -1 : motionEvent.findPointerIndex(cVar2.b);
                if (intValue == -1) {
                    this.k = false;
                    return super.dispatchTouchEvent(motionEvent);
                }
                float x = motionEvent.getX(intValue);
                float y = motionEvent.getY(intValue);
                float f2 = y - this.h.e;
                this.h.e = y;
                f fVar5 = this.g;
                float f3 = this.h.c;
                float f4 = this.h.d;
                Object[] objArr11 = {motionEvent, Float.valueOf(f2), Float.valueOf(x), Float.valueOf(y), Float.valueOf(f3), Float.valueOf(f4)};
                ChangeQuickRedirect changeQuickRedirect11 = f.a;
                if (PatchProxy.isSupport(objArr11, fVar5, changeQuickRedirect11, false, "b40abff5781d5ffdcf789bf597971c22", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr11, fVar5, changeQuickRedirect11, false, "b40abff5781d5ffdcf789bf597971c22")).booleanValue();
                } else {
                    if (fVar5.g == 1) {
                        NestedRecyclerView.this.a(motionEvent, f2);
                    } else {
                        if (fVar5.g != 0 && fVar5.g == 2) {
                            float abs = Math.abs(x - f3);
                            float abs2 = Math.abs(y - f4);
                            if (abs > 0.01f || abs2 >= 0.01f) {
                                if (Math.abs(abs) >= fVar5.b.getScaledTouchSlop()) {
                                    fVar5.g = 0;
                                }
                                if (Math.abs(abs2) > fVar5.b.getScaledTouchSlop()) {
                                    fVar5.g = 1;
                                    NestedRecyclerView.this.a(1);
                                    NestedRecyclerView.this.a(motionEvent, f2);
                                } else {
                                    int i3 = fVar5.g;
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                }
                this.k = z;
                return this.k || super.dispatchTouchEvent(motionEvent);
            case 3:
                this.k = false;
                this.h.b = -1;
                this.g.a();
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                this.k = false;
                c cVar3 = this.h;
                Object[] objArr12 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect12 = c.a;
                if (!PatchProxy.isSupport(objArr12, cVar3, changeQuickRedirect12, false, "4fc88c2b80b6d52294d3f85657259f18", RobustBitConfig.DEFAULT_VALUE)) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex >= 0 && cVar3.b != actionIndex) {
                        cVar3.a(motionEvent, actionIndex);
                        cVar3.b = motionEvent.getPointerId(actionIndex);
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr12, cVar3, changeQuickRedirect12, false, "4fc88c2b80b6d52294d3f85657259f18");
                    break;
                }
                break;
            case 6:
                this.k = false;
                c cVar4 = this.h;
                Object[] objArr13 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect13 = c.a;
                if (PatchProxy.isSupport(objArr13, cVar4, changeQuickRedirect13, false, "e55a73eb3fd13e2ed3489c29d06561d9", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr13, cVar4, changeQuickRedirect13, false, "e55a73eb3fd13e2ed3489c29d06561d9")).booleanValue();
                } else {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == cVar4.b) {
                        int i4 = actionIndex2 == 0 ? 1 : 0;
                        cVar4.a(motionEvent, i4);
                        cVar4.b = motionEvent.getPointerId(i4);
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(cVar4.b);
                    if (findPointerIndex != -1) {
                        cVar4.a(motionEvent, findPointerIndex);
                        z2 = false;
                    }
                }
                if (z2) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff1b33048360cdbb3904674e20f559d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff1b33048360cdbb3904674e20f559d")).booleanValue();
        }
        if (this.m) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.k;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829e3c4f5e44d4e9297393eace394262", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829e3c4f5e44d4e9297393eace394262")).booleanValue();
        }
        if (this.m) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void a(int i) {
        NestedRecyclerView nestedRecyclerView = this;
        while (true) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, nestedRecyclerView, changeQuickRedirect, false, "fbb9f357c628a7cbc1a35e57e1085be9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, nestedRecyclerView, changeQuickRedirect, false, "fbb9f357c628a7cbc1a35e57e1085be9");
                return;
            }
            if (nestedRecyclerView.f != null) {
                Iterator<b> it = nestedRecyclerView.f.iterator();
                while (it.hasNext()) {
                    it.next().a(nestedRecyclerView, i);
                }
            }
            if (nestedRecyclerView.d == null || nestedRecyclerView.d.a() == null) {
                return;
            }
            nestedRecyclerView = (NestedRecyclerView) nestedRecyclerView.d.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MotionEvent motionEvent, float f2) {
        Object[] objArr = {motionEvent, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f74068421b99097fe93e60b86060b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f74068421b99097fe93e60b86060b23");
        } else if (this.l) {
        } else {
            if (f2 <= 0.0f || canScrollVertically(-1)) {
                if (motionEvent != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    try {
                        super.dispatchTouchEvent(obtain);
                    } catch (Exception unused) {
                    }
                }
                a(f2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eae7c2d5b12b5b7674204578c0121cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eae7c2d5b12b5b7674204578c0121cd")).booleanValue();
        }
        int i = (int) f2;
        if (!canScrollVertically(1)) {
            if (this.d != null) {
                RecyclerView a2 = this.d.a();
                if (a2 != null) {
                    a2.setNestedScrollingEnabled(false);
                }
                if (a2 != null && a2.getTag(R.id.nested_recycler_view_inner_recycler_listener) == null) {
                    a2.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.rocks.page.view.NestedRecyclerView.2
                        public static ChangeQuickRedirect a;

                        @Override // android.support.v7.widget.RecyclerView.k
                        public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
                            Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0dc5d8b9f7ad41614e1ae07d45649511", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0dc5d8b9f7ad41614e1ae07d45649511");
                                return;
                            }
                            super.onScrollStateChanged(recyclerView, i2);
                            if (NestedRecyclerView.this.o != null) {
                                NestedRecyclerView.this.o.onScrollStateChanged(recyclerView, i2);
                            }
                        }

                        @Override // android.support.v7.widget.RecyclerView.k
                        public final void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
                            Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8efd14069eeeb76a324aa2dd443d1549", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8efd14069eeeb76a324aa2dd443d1549");
                                return;
                            }
                            super.onScrolled(recyclerView, i2, i3);
                            if (NestedRecyclerView.this.o != null) {
                                NestedRecyclerView.this.o.onScrolled(recyclerView, i2, i3);
                            }
                        }
                    });
                    a2.setTag(R.id.nested_recycler_view_inner_recycler_listener, new Object());
                }
                if (a2 instanceof NestedRecyclerView) {
                    NestedRecyclerView nestedRecyclerView = (NestedRecyclerView) a2;
                    if (nestedRecyclerView.d != null && nestedRecyclerView.d.a() != null && nestedRecyclerView.d.a().getMeasuredHeight() != 0) {
                        if (nestedRecyclerView.a(i)) {
                            return true;
                        }
                        if (f2 < 0.0f && !b(1)) {
                            this.g.a();
                        }
                        c(i);
                        return b(f2);
                    }
                }
                if (a2 != null && a2.getMeasuredHeight() != 0) {
                    try {
                        if (!a2.canScrollVertically(-1)) {
                            if (f2 > 0.0f) {
                                c(i);
                                return b(f2);
                            }
                            a2.scrollBy(0, -i);
                            return a2.canScrollVertically(1);
                        } else if (!a2.canScrollVertically(1)) {
                            this.g.a();
                            a2.scrollBy(0, -i);
                            return a2.canScrollVertically(f2 > 0.0f ? -1 : 1);
                        } else {
                            a2.scrollBy(0, -i);
                            return true;
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
                c(i);
                return b(f2);
            }
            c(i);
            return b(f2);
        }
        c(i);
        return b(f2);
    }

    private boolean b(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa08f238b158021683a1c202ec2bd26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa08f238b158021683a1c202ec2bd26")).booleanValue();
        }
        return canScrollVertically(f2 > 0.0f ? -1 : 1);
    }

    private boolean b(int i) {
        NestedRecyclerView nestedRecyclerView = this;
        while (true) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, nestedRecyclerView, changeQuickRedirect, false, "8fa3f73dea380da39096fdf8030061fb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, nestedRecyclerView, changeQuickRedirect, false, "8fa3f73dea380da39096fdf8030061fb")).booleanValue();
            }
            if (nestedRecyclerView.d == null) {
                return nestedRecyclerView.canScrollVertically(i);
            }
            RecyclerView a2 = nestedRecyclerView.d.a();
            if (a2 instanceof NestedRecyclerView) {
                nestedRecyclerView = (NestedRecyclerView) a2;
            } else {
                return nestedRecyclerView.canScrollVertically(i);
            }
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32c1e6aa64789e8e135004ad9ee127d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32c1e6aa64789e8e135004ad9ee127d");
            return;
        }
        try {
            scrollBy(0, -i);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public int b;
        float c;
        float d;
        float e;

        public c() {
        }

        void a(MotionEvent motionEvent, int i) {
            Object[] objArr = {motionEvent, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b778b99f0653c8d4adb7e09b3033413a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b778b99f0653c8d4adb7e09b3033413a");
                return;
            }
            this.e = motionEvent.getY(i);
            this.d = motionEvent.getY(i);
            this.c = motionEvent.getX(i);
        }
    }

    public void setScrollVelocityHelper(e eVar) {
        this.c = eVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class f implements Runnable {
        public static ChangeQuickRedirect a;
        ViewConfiguration b;
        Scroller c;
        VelocityTracker d;
        int e;
        int f;
        int g;

        public static /* synthetic */ int a(f fVar, int i) {
            fVar.g = 1;
            return 1;
        }

        public f(Context context) {
            Object[] objArr = {NestedRecyclerView.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e32a30ccd6d37af149b8536663cf5e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e32a30ccd6d37af149b8536663cf5e");
                return;
            }
            this.b = ViewConfiguration.get(context);
            this.c = new Scroller(context);
            this.d = VelocityTracker.obtain();
            NestedRecyclerView.this.removeCallbacks(this);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcea4a34905427bb527a69785318f6ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcea4a34905427bb527a69785318f6ef");
            } else {
                this.c.abortAnimation();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:6:0x0018, B:8:0x0020, B:14:0x002e, B:15:0x004c), top: B:20:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #0 {Exception -> 0x0057, blocks: (B:6:0x0018, B:8:0x0020, B:14:0x002e, B:15:0x004c), top: B:20:0x0018 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r8 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.rocks.page.view.NestedRecyclerView.f.a
                java.lang.String r10 = "ecf2c49608090f172715ea893c478b86"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L18
                com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                return
            L18:
                android.widget.Scroller r1 = r11.c     // Catch: java.lang.Exception -> L57
                boolean r1 = r1.computeScrollOffset()     // Catch: java.lang.Exception -> L57
                if (r1 == 0) goto L2b
                android.widget.Scroller r1 = r11.c     // Catch: java.lang.Exception -> L57
                boolean r1 = r1.isFinished()     // Catch: java.lang.Exception -> L57
                if (r1 == 0) goto L29
                goto L2b
            L29:
                r1 = 0
                goto L2c
            L2b:
                r1 = 1
            L2c:
                if (r1 != 0) goto L4c
                android.widget.Scroller r0 = r11.c     // Catch: java.lang.Exception -> L57
                int r0 = r0.getCurrY()     // Catch: java.lang.Exception -> L57
                int r1 = r11.e     // Catch: java.lang.Exception -> L57
                int r0 = r0 - r1
                android.widget.Scroller r1 = r11.c     // Catch: java.lang.Exception -> L57
                int r1 = r1.getCurrY()     // Catch: java.lang.Exception -> L57
                r11.e = r1     // Catch: java.lang.Exception -> L57
                com.sankuai.waimai.rocks.page.view.NestedRecyclerView r1 = com.sankuai.waimai.rocks.page.view.NestedRecyclerView.this     // Catch: java.lang.Exception -> L57
                int r0 = -r0
                float r0 = (float) r0     // Catch: java.lang.Exception -> L57
                com.sankuai.waimai.rocks.page.view.NestedRecyclerView.a(r1, r0)     // Catch: java.lang.Exception -> L57
                com.sankuai.waimai.rocks.page.view.NestedRecyclerView r0 = com.sankuai.waimai.rocks.page.view.NestedRecyclerView.this     // Catch: java.lang.Exception -> L57
                r0.post(r11)     // Catch: java.lang.Exception -> L57
                goto L5b
            L4c:
                com.sankuai.waimai.rocks.page.view.NestedRecyclerView r1 = com.sankuai.waimai.rocks.page.view.NestedRecyclerView.this     // Catch: java.lang.Exception -> L57
                r1.a(r0)     // Catch: java.lang.Exception -> L57
                com.sankuai.waimai.rocks.page.view.NestedRecyclerView r0 = com.sankuai.waimai.rocks.page.view.NestedRecyclerView.this     // Catch: java.lang.Exception -> L57
                r0.removeCallbacks(r11)     // Catch: java.lang.Exception -> L57
                return
            L57:
                r0 = move-exception
                r0.printStackTrace()
            L5b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.rocks.page.view.NestedRecyclerView.f.run():void");
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1c40d3471313cc4738b0c558e03c527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1c40d3471313cc4738b0c558e03c527");
            return;
        }
        super.onDetachedFromWindow();
        if (this.g != null) {
            f fVar = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "73cfb66eff021b97be7ee4c0ca354695", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "73cfb66eff021b97be7ee4c0ca354695");
            } else if (fVar.d != null) {
                fVar.d.recycle();
                fVar.d = null;
            }
        }
    }

    public void setChildRecyclerViewHelper(a aVar) {
        this.d = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public void stopNestedScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2268467b56ff4f9d0410ae0b90663ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2268467b56ff4f9d0410ae0b90663ad");
            return;
        }
        super.stopNestedScroll();
        if (this.g != null) {
            this.g.a();
        }
    }

    public final void a(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea9fd9a83fe6eed2d05a206a913a432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea9fd9a83fe6eed2d05a206a913a432");
        } else {
            this.f.add(bVar);
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87617f679ebe9cdd607bc4a2bc1894e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87617f679ebe9cdd607bc4a2bc1894e1")).booleanValue();
        }
        try {
            return super.canScrollVertically(i);
        } catch (Exception unused) {
            return true;
        }
    }

    private void setTabVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10bb724015cc8f1d3156218ef228c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10bb724015cc8f1d3156218ef228c57");
        } else if (this.d == null || z == this.i) {
        } else {
            if (z) {
                Iterator<d> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(true);
                }
                a(true);
                if (!this.n) {
                    scrollBy(0, 5);
                }
            } else {
                Iterator<d> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().a(false);
                }
                a(false);
            }
            this.i = z;
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f063549fd6b4c4c1e305f916bbbbe22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f063549fd6b4c4c1e305f916bbbbe22");
        } else if (Build.VERSION.SDK_INT >= 19 && getAdapter() != null && this.d != null && (getLayoutManager() instanceof LinearLayoutManager)) {
            int findFirstVisibleItemPosition = ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition();
            for (int tabPos = getTabPos() - 1; tabPos >= findFirstVisibleItemPosition; tabPos--) {
                RecyclerView.s findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(tabPos);
                if (findViewHolderForAdapterPosition != null && getAdapter() != null) {
                    RecyclerView.a adapter = getAdapter();
                    if (z && findViewHolderForAdapterPosition.itemView.isAttachedToWindow()) {
                        adapter.onViewDetachedFromWindow(findViewHolderForAdapterPosition);
                    } else if (!z && findViewHolderForAdapterPosition.itemView.isAttachedToWindow()) {
                        adapter.onViewAttachedToWindow(findViewHolderForAdapterPosition);
                    }
                }
            }
        }
    }

    private int getTabPos() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "863255c3476565ba131736d31590b8c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "863255c3476565ba131736d31590b8c5")).intValue();
        }
        if (getAdapter() == null) {
            return -1;
        }
        return getAdapter().getItemCount() - 1;
    }

    public void setMountingDistance(int i) {
        this.j = i;
    }

    public void setForbidCustomScroll(boolean z) {
        this.m = z;
    }
}
