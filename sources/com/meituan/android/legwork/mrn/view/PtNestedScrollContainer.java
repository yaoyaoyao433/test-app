package com.meituan.android.legwork.mrn.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PtNestedScrollContainer extends CoordinatorLayout {
    public static ChangeQuickRedirect i = null;
    private static int r = 1;
    private static int s;
    @Nullable
    public View j;
    @Nullable
    public View k;
    @Nullable
    public View l;
    public int m;
    public int n;
    public int o;
    public float p;
    public Interpolator q;
    private int t;
    private int u;
    private boolean v;
    private PtNestedScrollContainerBehavior<View> w;
    private final Runnable x;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public static /* synthetic */ void a(PtNestedScrollContainer ptNestedScrollContainer, int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, ptNestedScrollContainer, changeQuickRedirect, false, "8941a0208b93749bf753c423ffa782bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, ptNestedScrollContainer, changeQuickRedirect, false, "8941a0208b93749bf753c423ffa782bd");
        } else if (ptNestedScrollContainer.getContext() == null || ptNestedScrollContainer.u == i2) {
        } else {
            ptNestedScrollContainer.u = i2;
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("isSuckTop", i2);
            ((RCTEventEmitter) ((ReactContext) ptNestedScrollContainer.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(ptNestedScrollContainer.getId(), "suckTopChange", createMap);
        }
    }

    public PtNestedScrollContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b1661618b81d3d3c0bbfb57b0b85ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b1661618b81d3d3c0bbfb57b0b85ef");
            return;
        }
        this.q = new AccelerateInterpolator();
        this.t = 0;
        this.u = -1;
        this.w = new PtNestedScrollContainerBehavior<View>() { // from class: com.meituan.android.legwork.mrn.view.PtNestedScrollContainer.1
            public static ChangeQuickRedirect a;
            private a c;

            @Override // android.support.design.widget.CoordinatorLayout.a
            public boolean onStartNestedScroll(@Nonnull CoordinatorLayout coordinatorLayout, @Nonnull View view, @Nonnull View view2, @Nonnull View view3, int i2, int i3) {
                return (i2 & 2) != 0;
            }

            @Override // com.meituan.android.legwork.mrn.view.PtNestedScrollContainerBehavior
            public final void a(a aVar) {
                this.c = aVar;
            }

            @Override // android.support.design.widget.CoordinatorLayout.a
            public void onNestedPreScroll(@Nonnull CoordinatorLayout coordinatorLayout, @Nonnull View view, @Nonnull View view2, int i2, int i3, @Nonnull int[] iArr, int i4) {
                Object[] objArr2 = {coordinatorLayout, view, view2, Integer.valueOf(i2), Integer.valueOf(i3), iArr, Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11b8ea44bedea0a7c4de83e2db184a0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11b8ea44bedea0a7c4de83e2db184a0f");
                } else if (PtNestedScrollContainer.this.j == null || PtNestedScrollContainer.this.k == null || PtNestedScrollContainer.this.l == null) {
                } else {
                    int top = PtNestedScrollContainer.this.j.getTop();
                    if (i3 < 0) {
                        if (top >= 0 || view2.canScrollVertically(-1)) {
                            if (top == 0) {
                                if (view2 instanceof ReactNestedScrollView) {
                                    ((ReactNestedScrollView) view2).b();
                                }
                                if (this.c != null) {
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        int i5 = top - i3;
                        if (i5 > 0) {
                            PtNestedScrollContainer.this.setScrollHeaderTop(0);
                            iArr[1] = iArr[1] + top;
                        } else {
                            PtNestedScrollContainer.this.setScrollHeaderTop(i5);
                            iArr[1] = iArr[1] + i3;
                            PtNestedScrollContainer.a(PtNestedScrollContainer.this, PtNestedScrollContainer.s);
                        }
                        if (this.c != null) {
                            PtNestedScrollContainer.this.j.getTop();
                        }
                    } else if (top > (-PtNestedScrollContainer.this.m) + PtNestedScrollContainer.this.o) {
                        int i6 = top - i3;
                        if (i6 < (-PtNestedScrollContainer.this.m) + PtNestedScrollContainer.this.o) {
                            PtNestedScrollContainer.this.setScrollHeaderTop((-PtNestedScrollContainer.this.m) + PtNestedScrollContainer.this.o);
                            iArr[1] = iArr[1] + ((top + PtNestedScrollContainer.this.m) - PtNestedScrollContainer.this.o);
                            PtNestedScrollContainer.a(PtNestedScrollContainer.this, PtNestedScrollContainer.r);
                        } else {
                            PtNestedScrollContainer.this.setScrollHeaderTop(i6);
                            iArr[1] = iArr[1] + i3;
                            if (i6 == (-PtNestedScrollContainer.this.m) + PtNestedScrollContainer.this.o) {
                                PtNestedScrollContainer.a(PtNestedScrollContainer.this, PtNestedScrollContainer.r);
                            }
                        }
                        if (this.c != null) {
                            PtNestedScrollContainer.this.j.getTop();
                        }
                    }
                }
            }

            @Override // android.support.design.widget.CoordinatorLayout.a
            public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i2, int i3, int i4, int i5, int i6) {
                Object[] objArr2 = {coordinatorLayout, view, view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0592b6b5ae00d5ab6cfcd2716185c191", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0592b6b5ae00d5ab6cfcd2716185c191");
                } else if (PtNestedScrollContainer.this.j == null || PtNestedScrollContainer.this.k == null || PtNestedScrollContainer.this.l == null) {
                } else {
                    int top = PtNestedScrollContainer.this.j.getTop();
                    if (i5 < 0) {
                        if (top >= 0 || view2.canScrollVertically(-1)) {
                            if (top == 0) {
                                if (view2 instanceof ReactNestedScrollView) {
                                    ((ReactNestedScrollView) view2).b();
                                }
                                if (this.c != null) {
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        int i7 = top - i5;
                        if (i7 > 0) {
                            PtNestedScrollContainer.this.setScrollHeaderTop(0);
                        } else {
                            PtNestedScrollContainer.this.setScrollHeaderTop(i7);
                            PtNestedScrollContainer.a(PtNestedScrollContainer.this, PtNestedScrollContainer.s);
                        }
                        if (this.c != null) {
                            PtNestedScrollContainer.this.j.getTop();
                        }
                    } else if (top > (-PtNestedScrollContainer.this.m) + PtNestedScrollContainer.this.o) {
                        int i8 = top - i5;
                        if (i8 < (-PtNestedScrollContainer.this.m) + PtNestedScrollContainer.this.o) {
                            PtNestedScrollContainer.this.setScrollHeaderTop((-PtNestedScrollContainer.this.m) + PtNestedScrollContainer.this.o);
                            PtNestedScrollContainer.a(PtNestedScrollContainer.this, PtNestedScrollContainer.r);
                        } else {
                            PtNestedScrollContainer.this.setScrollHeaderTop(i8);
                            if (i8 == (-PtNestedScrollContainer.this.m) + PtNestedScrollContainer.this.o) {
                                PtNestedScrollContainer.a(PtNestedScrollContainer.this, PtNestedScrollContainer.r);
                            }
                        }
                        if (this.c != null) {
                            PtNestedScrollContainer.this.j.getTop();
                        }
                    }
                }
            }
        };
        this.x = d.a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        CoordinatorLayout.c cVar;
        Object[] objArr = {view, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8c3c86b701fadb85dba11088cc77a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8c3c86b701fadb85dba11088cc77a8b");
            return;
        }
        super.addView(view, i2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9cd396185b06a0017e200f7ada5c7b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9cd396185b06a0017e200f7ada5c7b4");
        } else {
            this.j = com.facebook.react.uimanager.util.a.a(this, "SCROLL_HEADER_NATIVE_ID");
            this.k = com.facebook.react.uimanager.util.a.a(this, "PIN_HEADER_NATIVE_ID");
            this.l = com.facebook.react.uimanager.util.a.a(this, "CONTENT_CONTAINER_NATIVE_ID");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = i;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5380f4c9216e6952f8dbec8cedca927a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5380f4c9216e6952f8dbec8cedca927a");
        } else if (this.j == null || (cVar = (CoordinatorLayout.c) this.j.getLayoutParams()) == null || cVar.a() != null) {
        } else {
            cVar.a(this.w);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eb5ecea092378f14880d751fcb816f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eb5ecea092378f14880d751fcb816f2");
        } else {
            super.removeViewAt(i2);
        }
    }

    public void setScrollHeaderTop(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd0cd43ed97be58eafc7075534fad9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd0cd43ed97be58eafc7075534fad9c");
        } else if (this.j == null || this.l == null || this.k == null) {
        } else {
            this.t = i2;
            this.j.setTop(i2);
            int i3 = this.m + i2;
            int height = this.l.getHeight() + i3;
            this.l.setTop(i3);
            this.l.setBottom(height);
            float max = Math.max(Math.min((-i2) / (this.m - this.o), 1.0f), 0.0f);
            float alpha = this.k.getAlpha();
            float interpolation = this.q.getInterpolation(max);
            if (interpolation > alpha && interpolation > this.p) {
                a(true);
            } else if (interpolation <= alpha && interpolation < this.p) {
                a(false);
            }
            this.k.setAlpha(interpolation);
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d9f663cb4d0b37082198c02202ec33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d9f663cb4d0b37082198c02202ec33");
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344abfcbe7261b20de4f502d46d09832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344abfcbe7261b20de4f502d46d09832");
        } else if (this.k == null || this.j == null || this.l == null) {
        } else {
            this.k.layout(0, 0, this.k.getMeasuredWidth(), this.k.getMeasuredHeight());
            this.j.layout(0, 0, this.j.getMeasuredWidth(), this.j.getMeasuredHeight());
            this.l.layout(0, this.m, this.l.getMeasuredWidth(), this.l.getMeasuredHeight() + this.m);
            if (this.n != 0 && this.t < 0 && this.n != this.m && this.n - this.o == (-this.t)) {
                this.t = this.o - this.m;
            }
            this.k.setAlpha(this.q.getInterpolation(Math.max(Math.min((-getScrollY()) / (this.m - this.o), 1.0f), 0.0f)));
            if (this.t != 0) {
                setScrollHeaderTop(this.t);
            }
        }
    }

    public void setScrollListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b804e41507015d63cf14934e04e3bc4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b804e41507015d63cf14934e04e3bc4c");
        } else if (this.w != null) {
            this.w.a(aVar);
        }
    }

    public void setScrollHeaderHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49a510c4455ae4051da0f02248ada95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49a510c4455ae4051da0f02248ada95");
            return;
        }
        this.n = this.m;
        this.m = Math.round(w.a(f));
        if (this.n == 0 || this.m == this.n) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8d5bcdd29dbefde7b5665bfebfcf1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8d5bcdd29dbefde7b5665bfebfcf1c");
            return;
        }
        super.requestLayout();
        post(this.x);
    }

    public static /* synthetic */ void a(PtNestedScrollContainer ptNestedScrollContainer) {
        Object[] objArr = {ptNestedScrollContainer};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3122514a2f766760ac39f5144d7551d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3122514a2f766760ac39f5144d7551d0");
            return;
        }
        ptNestedScrollContainer.measure(View.MeasureSpec.makeMeasureSpec(ptNestedScrollContainer.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ptNestedScrollContainer.getHeight(), 1073741824));
        ptNestedScrollContainer.layout(ptNestedScrollContainer.getLeft(), ptNestedScrollContainer.getTop(), ptNestedScrollContainer.getRight(), ptNestedScrollContainer.getBottom());
    }

    public void setPinHeaderHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55724c8037e0bbe0df8548271517d760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55724c8037e0bbe0df8548271517d760");
        } else {
            this.o = Math.round(w.a(f));
        }
    }

    public void setPinHeaderShowAlpha(float f) {
        this.p = f;
    }

    public static /* synthetic */ void c(PtNestedScrollContainer ptNestedScrollContainer, ValueAnimator valueAnimator) {
        Object[] objArr = {ptNestedScrollContainer, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72deda6bffecb115ad818d8ede4d444a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72deda6bffecb115ad818d8ede4d444a");
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ptNestedScrollContainer.l.setTop(intValue);
        ptNestedScrollContainer.l.setBottom(ptNestedScrollContainer.l.getHeight() + intValue);
    }

    public static /* synthetic */ void b(PtNestedScrollContainer ptNestedScrollContainer, ValueAnimator valueAnimator) {
        Object[] objArr = {ptNestedScrollContainer, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e85afab30be274a00db2b4ca3a125f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e85afab30be274a00db2b4ca3a125f17");
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ptNestedScrollContainer.l.setTop(intValue);
        ptNestedScrollContainer.l.setBottom(ptNestedScrollContainer.l.getHeight() + intValue);
    }

    public static /* synthetic */ void a(PtNestedScrollContainer ptNestedScrollContainer, ValueAnimator valueAnimator) {
        Object[] objArr = {ptNestedScrollContainer, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98345c1adf0ba57cde1d0629513193ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98345c1adf0ba57cde1d0629513193ab");
        } else {
            ptNestedScrollContainer.setScrollHeaderTop(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "111628092bdfc74b68104e34564701b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "111628092bdfc74b68104e34564701b3");
        } else if (getContext() == null || this.v == z) {
        } else {
            this.v = z;
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("show", z);
            ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "pinHeaderShowChange", createMap);
        }
    }
}
