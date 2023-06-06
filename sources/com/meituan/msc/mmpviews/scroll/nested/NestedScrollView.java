package com.meituan.msc.mmpviews.scroll.nested;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingChild2, NestedScrollingParent2, ScrollingView {
    public static ChangeQuickRedirect d;
    private static final AccessibilityDelegate x = new AccessibilityDelegate();
    private static final int[] y = {16843130};
    private final NestedScrollingChildHelper A;
    private float B;
    private a C;
    private Set<View> D;
    private long a;
    private final Rect b;
    private OverScroller c;
    private EdgeEffect e;
    private EdgeEffect f;
    private int g;
    private boolean h;
    private boolean i;
    private View j;
    private boolean k;
    private VelocityTracker l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int[] s;
    private final int[] t;
    private int u;
    private int v;
    private SavedState w;
    private final NestedScrollingParentHelper z;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    private static int b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a90bada05a7ed9dcf817236dc25524ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a90bada05a7ed9dcf817236dc25524ee")).intValue();
        }
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0990fe6bf2e29e78bb89e6289adc442c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0990fe6bf2e29e78bb89e6289adc442c");
        }
    }

    private NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a317d441bf4b3d2dedd7d29a4f9a2d4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a317d441bf4b3d2dedd7d29a4f9a2d4c");
        }
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2a1d94327dc66c4b529e89477be49d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2a1d94327dc66c4b529e89477be49d");
            return;
        }
        this.b = new Rect();
        this.h = true;
        this.i = false;
        this.j = null;
        this.k = false;
        this.n = true;
        this.r = -1;
        this.s = new int[2];
        this.t = new int[2];
        this.D = new HashSet();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac50066ecab3e27116c4fcb0920597b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac50066ecab3e27116c4fcb0920597b1");
        } else {
            this.c = new OverScroller(getContext());
            setFocusable(true);
            setDescendantFocusability(262144);
            setWillNotDraw(false);
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            this.o = viewConfiguration.getScaledTouchSlop();
            this.p = viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = viewConfiguration.getScaledMaximumFlingVelocity();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.z = new NestedScrollingParentHelper(this);
        this.A = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, x);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87a47830156e482d56a2d67d56cc2392", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87a47830156e482d56a2d67d56cc2392")).booleanValue() : this.A.startNestedScroll(i, i2);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4312f4f4a4e0a97ccfb4ad751efbd0f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4312f4f4a4e0a97ccfb4ad751efbd0f0");
        } else {
            this.A.stopNestedScroll(i);
        }
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236563d648dc30339bbf4ec62122615a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236563d648dc30339bbf4ec62122615a")).booleanValue() : this.A.hasNestedScrollingParent(i);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iArr, Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4719887a13602ee38fc4932caca3652", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4719887a13602ee38fc4932caca3652")).booleanValue() : this.A.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, iArr2, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc760884972a9d5e9250f9684a196b39", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc760884972a9d5e9250f9684a196b39")).booleanValue() : this.A.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be312bcdb6d7edf4403277db403d69b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be312bcdb6d7edf4403277db403d69b");
        } else {
            this.A.setNestedScrollingEnabled(z);
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9a62355101ea36e00c43ffa87504d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9a62355101ea36e00c43ffa87504d3")).booleanValue() : this.A.isNestedScrollingEnabled();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7b31cf39b132a11ccaa4dae0cc4d30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7b31cf39b132a11ccaa4dae0cc4d30")).booleanValue() : startNestedScroll(i, 0);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void stopNestedScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29981e20177339447f4e6896068e6f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29981e20177339447f4e6896068e6f29");
        } else {
            stopNestedScroll(0);
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e371b6fb29d5e8440e78180392133e5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e371b6fb29d5e8440e78180392133e5")).booleanValue() : hasNestedScrollingParent(0);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "193e9367eed1445a84c67853891108b5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "193e9367eed1445a84c67853891108b5")).booleanValue() : dispatchNestedScroll(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d75902d967212152a7682937ce4e36e4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d75902d967212152a7682937ce4e36e4")).booleanValue() : dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338594e1b4f46f2c6caea121a8dd658c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338594e1b4f46f2c6caea121a8dd658c")).booleanValue() : this.A.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "364ac999b996ea0db274dc67777ff02a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "364ac999b996ea0db274dc67777ff02a")).booleanValue() : this.A.dispatchNestedPreFling(f, f2);
    }

    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a69ec2f069b25342353bf1c5a273005e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a69ec2f069b25342353bf1c5a273005e")).booleanValue();
        }
        this.D.add(view2);
        return (i & 2) != 0;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191eb5171023f09942bc09b109586e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191eb5171023f09942bc09b109586e6d");
            return;
        }
        this.z.onNestedScrollAccepted(view, view2, i, i2);
        startNestedScroll(2, i2);
        this.D.remove(view2);
    }

    public void onStopNestedScroll(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee5da2be31916b501188f8750181f62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee5da2be31916b501188f8750181f62");
            return;
        }
        this.z.onStopNestedScroll(view, i);
        stopNestedScroll(i);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e296895f6329f5d01e640d9af2ada82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e296895f6329f5d01e640d9af2ada82d");
            return;
        }
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null, i5);
    }

    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1892da417f9dded58ac613b1f4b9c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1892da417f9dded58ac613b1f4b9c9");
        } else {
            dispatchNestedPreScroll(i, i2, iArr, null, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f8f42146d2bea031e0fdfc03d3fe81a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f8f42146d2bea031e0fdfc03d3fe81a")).booleanValue() : onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22a7f22e29bcfe45358dc4776da2e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22a7f22e29bcfe45358dc4776da2e0f");
        } else {
            onNestedScrollAccepted(view, view2, i, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779b43749eeccefccf4cc4c5f88743ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779b43749eeccefccf4cc4c5f88743ca");
        } else {
            onStopNestedScroll(view, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f05c3a74141847a16b95fbae07072e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f05c3a74141847a16b95fbae07072e7");
        } else {
            onNestedScroll(view, i, i2, i3, i4, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6686f536994a975c4aaf215e2c7a3f74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6686f536994a975c4aaf215e2c7a3f74");
        } else {
            onNestedPreScroll(view, i, i2, iArr, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9dde477dd980209c6f1044650facc53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9dde477dd980209c6f1044650facc53")).booleanValue();
        }
        if (z) {
            return false;
        }
        e((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f79daee9f65f2e45e1729fa14d1c9e5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f79daee9f65f2e45e1729fa14d1c9e5")).booleanValue() : dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556963f648e2bec5d9ff2cc5728c8364", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556963f648e2bec5d9ff2cc5728c8364")).intValue() : this.z.getNestedScrollAxes();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fccdfcc1509fc79f3c8653fd061d4e5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fccdfcc1509fc79f3c8653fd061d4e5a")).floatValue();
        }
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd40d71f4930731a6ea1ac83eecc2e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd40d71f4930731a6ea1ac83eecc2e6")).floatValue();
        }
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99c1c2e8f6d1532f5b0e227426bfe76", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99c1c2e8f6d1532f5b0e227426bfe76")).intValue() : (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8693498312bc979402fa2195f73a3ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8693498312bc979402fa2195f73a3ee9");
        } else if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea8e95963d4d52480de2383806768b22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea8e95963d4d52480de2383806768b22");
        } else if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cea67c3e17b12328c41b9e8a0b1f153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cea67c3e17b12328c41b9e8a0b1f153");
        } else if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99bfcbb9dd77969241b3bec57e5f3fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99bfcbb9dd77969241b3bec57e5f3fc");
        } else if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public void setOnScrollChangeListener(@Nullable a aVar) {
        this.C = aVar;
    }

    public void setFillViewport(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d8be8d5437dae7eab7794c269bf07d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d8be8d5437dae7eab7794c269bf07d");
        } else if (z != this.m) {
            this.m = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b57c14bb0c515a7df4e49aad2f1e704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b57c14bb0c515a7df4e49aad2f1e704");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e5f4c569916683950e984d4c019a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e5f4c569916683950e984d4c019a1b");
            return;
        }
        super.onMeasure(i, i2);
        if (this.m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "659c6d9f18cebdcdc08f389a18493566", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "659c6d9f18cebdcdc08f389a18493566")).booleanValue() : super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean a(@NonNull KeyEvent keyEvent) {
        boolean z;
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3609997693c781f2b28e1deddb01e5a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3609997693c781f2b28e1deddb01e5a2")).booleanValue();
        }
        this.b.setEmpty();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cd179d6f9ed45baec139b6cbe1a4e27", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cd179d6f9ed45baec139b6cbe1a4e27")).booleanValue();
        } else {
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 62) {
                switch (keyCode) {
                    case 19:
                        if (!keyEvent.isAltPressed()) {
                            return b(33);
                        }
                        return a(33);
                    case 20:
                        if (!keyEvent.isAltPressed()) {
                            return b(130);
                        }
                        return a(130);
                    default:
                        return false;
                }
            }
            int i = keyEvent.isShiftPressed() ? 33 : 130;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "42038360bc89a8c5ab41c14851091a3c", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "42038360bc89a8c5ab41c14851091a3c")).booleanValue();
                return false;
            }
            boolean z2 = i == 130;
            int height = getHeight();
            if (z2) {
                this.b.top = getScrollY() + height;
                int childCount = getChildCount();
                if (childCount > 0) {
                    View childAt2 = getChildAt(childCount - 1);
                    int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                    if (this.b.top + height > bottom) {
                        this.b.top = bottom - height;
                    }
                }
            } else {
                this.b.top = getScrollY() - height;
                if (this.b.top < 0) {
                    this.b.top = 0;
                }
            }
            this.b.bottom = this.b.top + height;
            a(i, this.b.top, this.b.bottom);
            return false;
        } else {
            return false;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7f813c9ed47aa77fa8452558cbbfdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7f813c9ed47aa77fa8452558cbbfdf");
        } else if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1218a2abe408badbaed3633cda6205eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1218a2abe408badbaed3633cda6205eb");
        } else if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72518fa5cdcf151c7def614c17225f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72518fa5cdcf151c7def614c17225f6");
            return;
        }
        if (z) {
            b();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f78bb2d75c9d1a4c85d03740c72cf8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f78bb2d75c9d1a4c85d03740c72cf8")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.k) {
            return true;
        }
        int i = action & 255;
        if (i != 6) {
            switch (i) {
                case 0:
                    int y2 = (int) motionEvent.getY();
                    int x2 = (int) motionEvent.getX();
                    Object[] objArr2 = {Integer.valueOf(x2), Integer.valueOf(y2)};
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "558dcc3f89c1300ea677e963c79f49c2", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "558dcc3f89c1300ea677e963c79f49c2")).booleanValue();
                    } else {
                        if (getChildCount() > 0) {
                            int scrollY = getScrollY();
                            View childAt = getChildAt(0);
                            if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (!z) {
                        this.k = false;
                        b();
                        break;
                    } else {
                        this.g = y2;
                        this.r = motionEvent.getPointerId(0);
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = d;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ea37a92bc277623bc2b2dacc10bada1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ea37a92bc277623bc2b2dacc10bada1");
                        } else if (this.l == null) {
                            this.l = VelocityTracker.obtain();
                        } else {
                            this.l.clear();
                        }
                        this.l.addMovement(motionEvent);
                        this.c.computeScrollOffset();
                        this.k = !this.c.isFinished();
                        startNestedScroll(2, 0);
                        break;
                    }
                    break;
                case 1:
                case 3:
                    this.k = false;
                    this.r = -1;
                    b();
                    if (this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                    stopNestedScroll(0);
                    break;
                case 2:
                    int i2 = this.r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                            break;
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.g) > this.o && (getNestedScrollAxes() & 2) == 0) {
                                this.k = true;
                                this.g = y3;
                                a();
                                this.l.addMovement(motionEvent);
                                this.u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        }
                    }
                    break;
            }
        } else {
            a(motionEvent);
        }
        return this.k;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f2ae9d4ae836ea31a6ea5bf37ef0d3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f2ae9d4ae836ea31a6ea5bf37ef0d3d")).booleanValue();
        }
        a();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u = 0;
        }
        obtain.offsetLocation(0.0f, this.u);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z = !this.c.isFinished();
                    this.k = z;
                    if (z && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!this.c.isFinished()) {
                        this.c.abortAnimation();
                    }
                    this.g = (int) motionEvent.getY();
                    this.r = motionEvent.getPointerId(0);
                    startNestedScroll(2, 0);
                    break;
                } else {
                    return false;
                }
            case 1:
                VelocityTracker velocityTracker = this.l;
                velocityTracker.computeCurrentVelocity(1000, this.q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.r);
                if (Math.abs(yVelocity) > this.p) {
                    e(-yVelocity);
                } else if (this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                this.r = -1;
                c();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.r + " in onTouchEvent");
                    break;
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i = this.g - y2;
                    if (dispatchNestedPreScroll(0, i, this.t, this.s, 0)) {
                        i -= this.t[1];
                        obtain.offsetLocation(0.0f, this.s[1]);
                        this.u += this.s[1];
                    }
                    if (!this.k && Math.abs(i) > this.o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.k = true;
                        if (i > 0) {
                            i -= this.o;
                        } else {
                            i += this.o;
                        }
                    }
                    int i2 = i;
                    if (this.k) {
                        this.g = y2 - this.s[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (a(0, i2, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(0)) {
                            this.l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!dispatchNestedScroll(0, scrollY2, 0, i2 - scrollY2, this.s, 0)) {
                            if (z2) {
                                d();
                                int i3 = scrollY + i2;
                                if (i3 < 0) {
                                    EdgeEffectCompat.onPull(this.e, i2 / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                    if (!this.f.isFinished()) {
                                        this.f.onRelease();
                                    }
                                } else if (i3 > scrollRange) {
                                    EdgeEffectCompat.onPull(this.f, i2 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                    if (!this.e.isFinished()) {
                                        this.e.onRelease();
                                    }
                                }
                                if (this.e != null && (!this.e.isFinished() || !this.f.isFinished())) {
                                    ViewCompat.postInvalidateOnAnimation(this);
                                    break;
                                }
                            }
                        } else {
                            this.g -= this.s[1];
                            obtain.offsetLocation(0.0f, this.s[1]);
                            this.u += this.s[1];
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (this.k && getChildCount() > 0 && this.c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                this.r = -1;
                c();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.g = (int) motionEvent.getY(actionIndex);
                this.r = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                a(motionEvent);
                this.g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.r));
                break;
        }
        if (this.l != null) {
            this.l.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbceef907facd3d69dce4beb34fb247e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbceef907facd3d69dce4beb34fb247e");
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r) {
            int i = actionIndex != 0 ? 0 : 1;
            this.g = (int) motionEvent.getY(i);
            this.r = motionEvent.getPointerId(i);
            if (this.l != null) {
                this.l.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2948ecad7a80e7df209f8bdc1d38742", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2948ecad7a80e7df209f8bdc1d38742")).booleanValue();
        }
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    verticalScrollFactorCompat = 0;
                } else if (verticalScrollFactorCompat > scrollRange) {
                    verticalScrollFactorCompat = scrollRange;
                }
                if (verticalScrollFactorCompat != scrollY) {
                    super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                    return true;
                }
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c14dc8776073fb34e076a659de469fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c14dc8776073fb34e076a659de469fe")).floatValue();
        }
        if (this.B == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.B = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.B;
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8bfd9f246ff539f8e0fc03b554eaec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8bfd9f246ff539f8e0fc03b554eaec");
        } else {
            super.scrollTo(i, i2);
        }
    }

    private boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        Object[] objArr = {0, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 0, Integer.valueOf(i6), 0, 0, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7bdb1ffb9bfb1c9450b722595a9382f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7bdb1ffb9bfb1c9450b722595a9382f")).booleanValue();
        }
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i9 = i3 + 0;
        int i10 = i4 + i2;
        int i11 = i6 + 0;
        if (i9 <= 0 && i9 >= 0) {
            z2 = false;
        } else {
            i9 = 0;
            z2 = true;
        }
        if (i10 > i11) {
            z3 = true;
        } else if (i10 < 0) {
            z3 = true;
            i11 = 0;
        } else {
            i11 = i10;
            z3 = false;
        }
        if (z3 && !hasNestedScrollingParent(1)) {
            this.c.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    public int getScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e215bd748b1cc58e221812c158e333", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e215bd748b1cc58e221812c158e333")).intValue();
        }
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    private View a(boolean z, int i, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ef874a5759f244e1f3b5b2d036301e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ef874a5759f244e1f3b5b2d036301e");
        }
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private boolean a(int i) {
        int childCount;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e8af26b825deca777924a1fca98a02", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e8af26b825deca777924a1fca98a02")).booleanValue();
        }
        boolean z = i == 130;
        int height = getHeight();
        this.b.top = 0;
        this.b.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            this.b.top = this.b.bottom - height;
        }
        return a(i, this.b.top, this.b.bottom);
    }

    private boolean a(int i, int i2, int i3) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b085a345fe8617fc844ca9b43c263531", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b085a345fe8617fc844ca9b43c263531")).booleanValue();
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        View a2 = a(z2, i2, i3);
        if (a2 == null) {
            a2 = this;
        }
        if (i2 < scrollY || i3 > i4) {
            c(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a2 != findFocus()) {
            a2.requestFocus(i);
        }
        return z;
    }

    private boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f945cf2fe68cf4131f565239288e17cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f945cf2fe68cf4131f565239288e17cf")).booleanValue();
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && a(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.b);
            offsetDescendantRectToMyCoords(findNextFocus, this.b);
            c(b(this.b));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            c(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91dad6c83f819fd25bc0ff68bd2af1e0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91dad6c83f819fd25bc0ff68bd2af1e0")).booleanValue() : !a(view, 0, getHeight());
    }

    private boolean a(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abff10be0b2746a495feee70b4d0681d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abff10be0b2746a495feee70b4d0681d")).booleanValue();
        }
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        return this.b.bottom + i >= getScrollY() && this.b.top - i <= getScrollY() + i2;
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b44f59b7e95c46e2ae3921e5e7ffa4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b44f59b7e95c46e2ae3921e5e7ffa4c");
        } else if (i != 0) {
            if (this.n) {
                b(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b9c5dea6691d5fec04dff74a32e681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b9c5dea6691d5fec04dff74a32e681");
        } else if (getChildCount() == 0) {
        } else {
            if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.v = getScrollY();
                this.c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                if (!this.c.isFinished()) {
                    this.c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e199dd16b383f1032fd4d3148b56ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e199dd16b383f1032fd4d3148b56ad6");
        } else {
            b(i - getScrollX(), i2 - getScrollY());
        }
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028e08b53e1ce8fa7f98f7b311371fe4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028e08b53e1ce8fa7f98f7b311371fe4")).intValue();
        }
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd7221581508aa2ce7689dc228e2f64", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd7221581508aa2ce7689dc228e2f64")).intValue() : Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeVerticalScrollExtent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54064e32e0fab840f924c34a080cf51e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54064e32e0fab840f924c34a080cf51e")).intValue() : super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf66dd96599fe38b28ce43d6d2e0197d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf66dd96599fe38b28ce43d6d2e0197d")).intValue() : super.computeHorizontalScrollRange();
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "704bcb718ac2797a834c88778b53345e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "704bcb718ac2797a834c88778b53345e")).intValue() : super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollExtent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7b2db32463acb8211c856c1f1900de", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7b2db32463acb8211c856c1f1900de")).intValue() : super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11e48a0dcd07c12eb34a586c86615c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11e48a0dcd07c12eb34a586c86615c5f");
        } else {
            view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b632aa6906b4a3298c5eb660175ccced", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b632aa6906b4a3298c5eb660175ccced");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42ef05ec66f9e8a2d2f9222e8c20efe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42ef05ec66f9e8a2d2f9222e8c20efe");
        } else if (this.c.computeScrollOffset()) {
            this.c.getCurrX();
            int currY = this.c.getCurrY();
            int i = currY - this.v;
            if (dispatchNestedPreScroll(0, i, this.t, null, 1)) {
                i -= this.t[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                if (!dispatchNestedScroll(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        d();
                        if (currY <= 0 && scrollY > 0) {
                            this.e.onAbsorb((int) this.c.getCurrVelocity());
                        } else if (currY >= scrollRange && scrollY < scrollRange) {
                            this.f.onAbsorb((int) this.c.getCurrVelocity());
                        }
                    }
                }
            }
            this.v = currY;
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            if (this.D.size() > 0 && hasNestedScrollingParent(1)) {
                stopNestedScroll(1);
            }
            this.v = 0;
        }
    }

    private void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b15e9d5104a50c5ef34db0e57f0936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b15e9d5104a50c5ef34db0e57f0936");
            return;
        }
        view.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(view, this.b);
        int b = b(this.b);
        if (b != 0) {
            scrollBy(0, b);
        }
    }

    public final int b(Rect rect) {
        int i;
        int i2;
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f2de7080eaa6beb0bff0e1a202e5b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f2de7080eaa6beb0bff0e1a202e5b5")).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = (rect.top - scrollY) + 0;
            } else {
                i2 = (rect.bottom - i4) + 0;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44bbea7470572b24d87216c727fc3678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44bbea7470572b24d87216c727fc3678");
            return;
        }
        if (!this.h) {
            b(view2);
        } else {
            this.j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        Object[] objArr = {Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c3bf41b56773efcb6ac2ab87b5ed49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c3bf41b56773efcb6ac2ab87b5ed49")).booleanValue();
        }
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || a(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Object[] objArr = {view, rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdc89d4976fbf5bd431bc69d82cf66c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdc89d4976fbf5bd431bc69d82cf66c1")).booleanValue();
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        Object[] objArr2 = {rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd4c2c2897efb5f9361816c98d5ae160", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd4c2c2897efb5f9361816c98d5ae160")).booleanValue();
        }
        int b = b(rect);
        boolean z2 = b != 0;
        if (z2) {
            if (z) {
                scrollBy(0, b);
            } else {
                b(0, b);
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be9a288c49704c574f011c4ca97ed2c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be9a288c49704c574f011c4ca97ed2c5");
            return;
        }
        this.h = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d98fc64294f738a525b4ab2989e268a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d98fc64294f738a525b4ab2989e268a");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.h = false;
        if (this.j != null && a(this.j, this)) {
            b(this.j);
        }
        this.j = null;
        if (!this.i) {
            if (this.w != null) {
                scrollTo(getScrollX(), this.w.b);
                this.w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c5cd2528bca2679253ee14895260e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c5cd2528bca2679253ee14895260e1");
            return;
        }
        super.onAttachedToWindow();
        this.i = false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a366f1f507a25868cc31fc66b46a5f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a366f1f507a25868cc31fc66b46a5f7");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !a(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.b);
        offsetDescendantRectToMyCoords(findFocus, this.b);
        c(b(this.b));
    }

    private static boolean a(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a58ae09a5724c74aaed56e88c72c2ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a58ae09a5724c74aaed56e88c72c2ab")).booleanValue();
        }
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a398791a644d0145c36df76c1bf6b771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a398791a644d0145c36df76c1bf6b771");
        } else if (getChildCount() > 0) {
            startNestedScroll(2, 1);
            this.c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.v = getScrollY();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void e(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e603c029b8454615c4bd1c70183b4bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e603c029b8454615c4bd1c70183b4bc");
            return;
        }
        int scrollY = getScrollY();
        if ((scrollY <= 0 && i <= 0) || (scrollY >= getScrollRange() && i >= 0)) {
            z = false;
        }
        float f = i;
        if (dispatchNestedPreFling(0.0f, f)) {
            return;
        }
        dispatchNestedFling(0.0f, f, z);
        d(i);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c722d53993d1dfe3063ff501ecdedbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c722d53993d1dfe3063ff501ecdedbe");
            return;
        }
        this.k = false;
        b();
        stopNestedScroll(0);
        if (this.e != null) {
            this.e.onRelease();
            this.f.onRelease();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17eba3c38a60a82a4f01555a576c3888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17eba3c38a60a82a4f01555a576c3888");
        } else if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b = b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b2 = b(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b == getScrollX() && b2 == getScrollY()) {
                return;
            }
            super.scrollTo(b, b2);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5aaab74fe6a73aa0a7b6375e90461ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5aaab74fe6a73aa0a7b6375e90461ef");
        } else if (getOverScrollMode() != 2) {
            if (this.e == null) {
                Context context = getContext();
                this.e = new EdgeEffect(context);
                this.f = new EdgeEffect(context);
            }
        } else {
            this.e = null;
            this.f = null;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        int i = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "232fb4c345daddf18d87d07e4dfe5ae8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "232fb4c345daddf18d87d07e4dfe5ae8");
            return;
        }
        super.draw(canvas);
        if (this.e != null) {
            int scrollY = getScrollY();
            if (!this.e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.e.setSize(width, height);
                if (this.e.draw(canvas)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f.setSize(width2, height2);
            if (this.f.draw(canvas)) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61a4c8ecec0cdafca458115bda51e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61a4c8ecec0cdafca458115bda51e06");
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.w = savedState;
            requestLayout();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53cabfae5f94c3bcfec1bd6b7ba7cfa9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53cabfae5f94c3bcfec1bd6b7ba7cfa9");
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = getScrollY();
        return savedState;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.meituan.msc.mmpviews.scroll.nested.NestedScrollView.SavedState.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bcc9e2b2ec3f59dcd082c5bc59437bd", RobustBitConfig.DEFAULT_VALUE) ? (SavedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bcc9e2b2ec3f59dcd082c5bc59437bd") : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public static ChangeQuickRedirect a;
        public int b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            Object[] objArr = {parcelable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba5dbfd0dc1aec68cf30c3fd2de9443", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba5dbfd0dc1aec68cf30c3fd2de9443");
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67fa22911f9e987d073dc2c0a061643", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67fa22911f9e987d073dc2c0a061643");
            } else {
                this.b = parcel.readInt();
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be12afcfe244efcb4c3f860888e3d0c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be12afcfe244efcb4c3f860888e3d0c3");
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb3fc6208c8c24da3b1d8f56b4dc86d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb3fc6208c8c24da3b1d8f56b4dc86d");
            }
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.b + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public static ChangeQuickRedirect a;

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int max;
            Object[] objArr = {view, Integer.valueOf(i), bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c3f28f8564f01389b02db6d2c3c1b7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c3f28f8564f01389b02db6d2c3c1b7")).booleanValue();
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i == 4096) {
                    int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.a(0, min);
                        return true;
                    }
                    return false;
                } else if (i == 8192 && (max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0)) != nestedScrollView.getScrollY()) {
                    nestedScrollView.a(0, max);
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            Object[] objArr = {view, accessibilityNodeInfoCompat};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a729a65bc78415c2fec050bec149d4a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a729a65bc78415c2fec050bec149d4a8");
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            Object[] objArr = {view, accessibilityEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66b49e0e00093750a97660d7bfb9141b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66b49e0e00093750a97660d7bfb9141b");
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AccessibilityRecordCompat.setMaxScrollX(accessibilityEvent, nestedScrollView.getScrollX());
            AccessibilityRecordCompat.setMaxScrollY(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }
}
