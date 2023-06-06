package com.sankuai.waimai.business.ugc.machpro.nestedscroll;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import java.util.LinkedList;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPNestedScrollContainer extends CoordinatorLayout {
    public static ChangeQuickRedirect i;
    NestedScrollView j;
    MPComponent k;
    View l;
    MPComponent m;
    int n;
    int o;
    final a p;
    private final MPNestedScrollComponent q;
    private Boolean r;
    private int s;
    private RecyclerView t;
    private int u;
    private boolean v;
    private ViewPager w;
    private boolean x;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(int i, int i2);
    }

    public static /* synthetic */ void d(MPNestedScrollContainer mPNestedScrollContainer) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, mPNestedScrollContainer, changeQuickRedirect, false, "647826c8b280eca774348a57ac42cc49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPNestedScrollContainer, changeQuickRedirect, false, "647826c8b280eca774348a57ac42cc49");
        } else if (!mPNestedScrollContainer.x && mPNestedScrollContainer.t == null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(mPNestedScrollContainer);
            while (!linkedList.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) linkedList.remove(0);
                if (viewGroup instanceof ViewPager) {
                    mPNestedScrollContainer.x = true;
                    mPNestedScrollContainer.w = (ViewPager) viewGroup;
                    return;
                } else if ((viewGroup instanceof RecyclerView) && !mPNestedScrollContainer.x) {
                    mPNestedScrollContainer.t = (RecyclerView) viewGroup;
                    return;
                } else {
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        if (viewGroup.getChildAt(i2) instanceof ViewGroup) {
                            linkedList.add((ViewGroup) viewGroup.getChildAt(i2));
                        }
                    }
                }
            }
        }
    }

    public MPNestedScrollContainer(Context context, MPNestedScrollComponent mPNestedScrollComponent) {
        super(context);
        Object[] objArr = {context, mPNestedScrollComponent};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5776ed2b8f5b916e5edaa87fa871f095", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5776ed2b8f5b916e5edaa87fa871f095");
            return;
        }
        this.p = new a();
        this.u = 0;
        this.v = false;
        this.x = false;
        this.q = mPNestedScrollComponent;
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1f3880228a4382a843ef36d0051e8b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1f3880228a4382a843ef36d0051e8b7");
        } else {
            super.removeViewAt(i2);
        }
    }

    public void setScrollHeaderTop(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a61816710d50dbfba557f0e8d4f4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a61816710d50dbfba557f0e8d4f4bb");
        } else if (this.j == null || this.l == null) {
        } else {
            this.u = i2;
            this.j.setTop(i2);
            int i3 = i2 + this.n;
            int height = this.l.getHeight() + i3;
            this.l.setTop(i3);
            this.l.setBottom(height);
        }
    }

    public void setListenStickyChange(Boolean bool) {
        this.r = bool;
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569866a9f9e730cde70ac0d7dc263808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569866a9f9e730cde70ac0d7dc263808");
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad5c1f24efea5d412f938570fe6f6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad5c1f24efea5d412f938570fe6f6d9");
        } else if (this.j == null || this.l == null) {
        } else {
            this.k.getYogaNode().a(getMeasuredWidth(), Float.NaN);
            this.j.measure(View.MeasureSpec.makeMeasureSpec(Math.round(this.k.getYogaNode().s()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(this.k.getYogaNode().t()), 1073741824));
            this.j.layout(0, 0, this.j.getMeasuredWidth(), this.j.getMeasuredHeight());
            this.n = this.j.getHeight();
            this.m.getYogaNode().a(getMeasuredWidth(), Float.NaN);
            this.l.measure(View.MeasureSpec.makeMeasureSpec(Math.round(this.m.getYogaNode().s()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(this.m.getYogaNode().t()), 1073741824));
            this.l.layout(0, this.n, this.l.getMeasuredWidth(), getMeasuredHeight() + this.n);
            if (this.s != 0 && this.u < 0 && this.s != this.n && this.s - this.o == (-this.u)) {
                this.u = this.o - this.n;
            }
            if (this.u != 0) {
                setScrollHeaderTop(this.u);
            }
        }
    }

    public void setScrollListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371ef1a02d6a16f8af56dcb1a963089b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371ef1a02d6a16f8af56dcb1a963089b");
        } else {
            this.p.b = bVar;
        }
    }

    private void a() {
        RecyclerView a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e9ad1eba0a4e8ba49b5d22df199920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e9ad1eba0a4e8ba49b5d22df199920");
        } else if (this.w != null) {
            int currentItem = this.w.getCurrentItem();
            for (int i2 = 0; i2 < this.w.getChildCount(); i2++) {
                if (i2 != currentItem && (this.w.getChildAt(i2) instanceof ViewGroup) && (a2 = a((ViewGroup) this.w.getChildAt(i2))) != null) {
                    a2.scrollToPosition(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RecyclerView a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11326388880d246451fd8a9e9623cff5", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11326388880d246451fd8a9e9623cff5");
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup2 = (ViewGroup) linkedList.remove(0);
            if (viewGroup2 instanceof RecyclerView) {
                return (RecyclerView) viewGroup2;
            }
            for (int i2 = 0; i2 < viewGroup2.getChildCount(); i2++) {
                if (viewGroup2.getChildAt(i2) instanceof ViewGroup) {
                    linkedList.add((ViewGroup) viewGroup2.getChildAt(i2));
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends CoordinatorLayout.a<View> {
        public static ChangeQuickRedirect a;
        b b;

        @Override // android.support.design.widget.CoordinatorLayout.a
        public final boolean onStartNestedScroll(@Nonnull CoordinatorLayout coordinatorLayout, @Nonnull View view, @Nonnull View view2, @Nonnull View view3, int i, int i2) {
            return (i & 2) != 0;
        }

        private a() {
            Object[] objArr = {MPNestedScrollContainer.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c908780ae026e28a7f865a94e3552836", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c908780ae026e28a7f865a94e3552836");
            }
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            Object[] objArr = {coordinatorLayout, view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8601924867a97a9d6608f05aab778b18", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8601924867a97a9d6608f05aab778b18")).booleanValue();
            }
            if (motionEvent.getActionMasked() == 0) {
                if (MPNestedScrollContainer.this.j != null) {
                    ViewCompat.stopNestedScroll(MPNestedScrollContainer.this.j, 1);
                }
                if (MPNestedScrollContainer.this.t != null) {
                    ViewCompat.stopNestedScroll(MPNestedScrollContainer.this.t, 1);
                    if (MPNestedScrollContainer.this.l.getTop() > motionEvent.getRawY()) {
                        MPNestedScrollContainer.this.t.stopScroll();
                    }
                }
                MPNestedScrollContainer.d(MPNestedScrollContainer.this);
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public final boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, float f, float f2, boolean z) {
            Object[] objArr = {coordinatorLayout, view, view2, Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58ca53d65c247ddd906d4c4c7cbcf50", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58ca53d65c247ddd906d4c4c7cbcf50")).booleanValue();
            }
            if (view2 == MPNestedScrollContainer.this.j) {
                if (MPNestedScrollContainer.this.t == null && MPNestedScrollContainer.this.w != null && (MPNestedScrollContainer.this.w.getChildAt(MPNestedScrollContainer.this.w.getCurrentItem()) instanceof ViewGroup)) {
                    MPNestedScrollContainer.this.t = MPNestedScrollContainer.this.a((ViewGroup) MPNestedScrollContainer.this.w.getChildAt(MPNestedScrollContainer.this.w.getCurrentItem()));
                }
                if (f2 > 0.0f && MPNestedScrollContainer.this.t != null) {
                    MPNestedScrollContainer.this.t.fling((int) f, (int) f2);
                }
            }
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public final void onNestedPreScroll(@Nonnull CoordinatorLayout coordinatorLayout, @Nonnull View view, @Nonnull View view2, int i, int i2, @Nonnull int[] iArr, int i3) {
            Object[] objArr = {coordinatorLayout, view, view2, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ce5710aa920d88e3c896d80098079c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ce5710aa920d88e3c896d80098079c");
            } else if (MPNestedScrollContainer.this.j == null || MPNestedScrollContainer.this.l == null) {
            } else {
                int top = MPNestedScrollContainer.this.j.getTop();
                if (i2 < 0) {
                    if (top >= 0 || !MPNestedScrollContainer.this.c(view2)) {
                        if (top == 0 && view2 == MPNestedScrollContainer.this.j) {
                            ViewCompat.stopNestedScroll(MPNestedScrollContainer.this.j, 1);
                            return;
                        }
                        return;
                    }
                    int i4 = top - i2;
                    if (i4 > 0) {
                        MPNestedScrollContainer.this.setScrollHeaderTop(0);
                        iArr[1] = iArr[1] + top;
                    } else {
                        MPNestedScrollContainer.this.setScrollHeaderTop(i4);
                        iArr[1] = iArr[1] + i2;
                        MPNestedScrollContainer.this.a(false);
                    }
                    if (this.b != null) {
                        this.b.a(-MPNestedScrollContainer.this.j.getTop(), i2);
                    }
                } else if (top > (-MPNestedScrollContainer.this.n) + MPNestedScrollContainer.this.o) {
                    int i5 = top - i2;
                    if (i5 < (-MPNestedScrollContainer.this.n) + MPNestedScrollContainer.this.o) {
                        MPNestedScrollContainer.this.setScrollHeaderTop((-MPNestedScrollContainer.this.n) + MPNestedScrollContainer.this.o);
                        iArr[1] = iArr[1] + ((top + MPNestedScrollContainer.this.n) - MPNestedScrollContainer.this.o);
                        MPNestedScrollContainer.this.a(true);
                    } else {
                        MPNestedScrollContainer.this.setScrollHeaderTop(i5);
                        iArr[1] = iArr[1] + i2;
                        if (i5 == (-MPNestedScrollContainer.this.n) + MPNestedScrollContainer.this.o) {
                            MPNestedScrollContainer.this.a(true);
                        }
                    }
                    if (this.b != null) {
                        this.b.a(-MPNestedScrollContainer.this.j.getTop(), i2);
                    }
                }
            }
        }

        @Override // android.support.design.widget.CoordinatorLayout.a
        public final void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2, int i3, int i4, int i5) {
            Object[] objArr = {coordinatorLayout, view, view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "259c48bc2f91f274be36a0f708f6c0ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "259c48bc2f91f274be36a0f708f6c0ff");
            } else if (MPNestedScrollContainer.this.j == null || MPNestedScrollContainer.this.l == null) {
            } else {
                int top = MPNestedScrollContainer.this.j.getTop();
                if (i4 < 0) {
                    if (top >= 0 || !MPNestedScrollContainer.this.c(view2)) {
                        if (top == 0 && view2 == MPNestedScrollContainer.this.j) {
                            ViewCompat.stopNestedScroll(MPNestedScrollContainer.this.j, 1);
                            return;
                        }
                        return;
                    }
                    int i6 = top - i4;
                    if (i6 > 0) {
                        MPNestedScrollContainer.this.setScrollHeaderTop(0);
                    } else {
                        MPNestedScrollContainer.this.setScrollHeaderTop(i6);
                        MPNestedScrollContainer.this.a(false);
                    }
                    if (this.b != null) {
                        this.b.a(-MPNestedScrollContainer.this.j.getTop(), i4);
                    }
                } else if (top > (-MPNestedScrollContainer.this.n) + MPNestedScrollContainer.this.o) {
                    int i7 = top - i4;
                    if (i7 < (-MPNestedScrollContainer.this.n) + MPNestedScrollContainer.this.o) {
                        MPNestedScrollContainer.this.setScrollHeaderTop((-MPNestedScrollContainer.this.n) + MPNestedScrollContainer.this.o);
                        MPNestedScrollContainer.this.a(true);
                    } else {
                        MPNestedScrollContainer.this.setScrollHeaderTop(i7);
                        if (i7 == (-MPNestedScrollContainer.this.n) + MPNestedScrollContainer.this.o) {
                            MPNestedScrollContainer.this.a(true);
                        }
                    }
                    if (this.b != null) {
                        this.b.a(-MPNestedScrollContainer.this.j.getTop(), i4);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c156f77448449854fed56575c5ee2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c156f77448449854fed56575c5ee2e")).booleanValue();
        }
        try {
            if (this.w != null && (this.w.getChildAt(this.w.getCurrentItem()) instanceof ViewGroup)) {
                this.t = a((ViewGroup) this.w.getChildAt(this.w.getCurrentItem()));
            }
            return this.t != null ? this.t.computeVerticalScrollOffset() == 0 : !view.canScrollVertically(-1);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("MPNestedScrollContainer | " + e.getMessage());
            return false;
        }
    }

    public void setScrollHeaderHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37842fd793dbf79ad6cdd86cd3eb2089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37842fd793dbf79ad6cdd86cd3eb2089");
            return;
        }
        this.s = this.n;
        this.n = Math.round(f);
        if (this.s == 0 || this.n == this.s) {
            return;
        }
        requestLayout();
    }

    public void setStickyHeaderHeight(int i2) {
        this.o = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae5227841603a6c183d10577deb7466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae5227841603a6c183d10577deb7466");
        } else if (this.v == z) {
        } else {
            if (this.v) {
                a();
            }
            if (this.r.booleanValue()) {
                this.v = z;
                MachMap machMap = new MachMap();
                machMap.put("isSticky", Boolean.valueOf(this.v));
                MachArray machArray = new MachArray();
                machArray.add(machMap);
                this.q.dispatchEvent("stickyChange", machArray);
            }
        }
    }
}
