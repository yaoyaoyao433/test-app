package com.dianping.picasso.view.scroller;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
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
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CustomizedScrollView extends ViewGroup implements NestedScrollingChild2, NestedScrollingParent2, ScrollingView {
    private static final AccessibilityDelegate ACCESSIBILITY_DELEGATE = new AccessibilityDelegate();
    public static final int ANIMATED_SCROLL_GAP = 250;
    private static final int INVALID_POINTER = -1;
    public static final float MAX_SCROLL_FACTOR = 0.5f;
    public static final int SCROLL_ORIENTATION_BOTH = 3;
    public static final int SCROLL_ORIENTATION_HORIZONTAL = 1;
    public static final int SCROLL_ORIENTATION_NONE = 0;
    public static final int SCROLL_ORIENTATION_VERTICAL = 2;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "CustomizedScrollView";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean DEBUG;
    private int mActivePointerId;
    private final NestedScrollingChildHelper mChildHelper;
    private boolean mChildLayoutCenter;
    private View mChildToScrollTo;
    private EdgeEffectCompat mEdgeGlowBottom;
    private EdgeEffectCompat mEdgeGlowLeft;
    private EdgeEffectCompat mEdgeGlowRight;
    private EdgeEffectCompat mEdgeGlowTop;
    private boolean mFillViewportH;
    private boolean mFillViewportV;
    private final FrameLayout mFrameLayout;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionX;
    private int mLastMotionY;
    private long mLastScroll;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedXOffset;
    private int mNestedYOffset;
    private OnScrollChangeListener mOnScrollChangeListener;
    private List<OnScrollChangeListener> mOnScrollChangeListeners;
    private OnScrollEndListener mOnScrollEndListener;
    private final NestedScrollingParentHelper mParentHelper;
    private SavedState mSavedState;
    private final int[] mScrollConsumed;
    private boolean mScrollEnable;
    private final int[] mScrollOffset;
    private int mScrollOrientation;
    private int mScrollState;
    private OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnScrollChangeListener {
        void onScrollChange(CustomizedScrollView customizedScrollView, int i, int i2, int i3, int i4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnScrollEndListener {
        void onScrollEnd(CustomizedScrollView customizedScrollView, int i, int i2);
    }

    private static int clamp(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3251d2f8f7978a1886095151716fb6cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3251d2f8f7978a1886095151716fb6cb")).intValue();
        }
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public void setChildLayoutCenter(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e249e296ab93a1c5ab7b25ae4099f1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e249e296ab93a1c5ab7b25ae4099f1e");
        } else if (this.mChildLayoutCenter != z) {
            this.mChildLayoutCenter = z;
            requestLayout();
        }
    }

    public void setScrollOrientation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a1906438dabb9e012af3ff88d06c352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a1906438dabb9e012af3ff88d06c352");
            return;
        }
        this.mScrollOrientation = i;
        requestLayout();
    }

    public int getScrollOrientation() {
        return this.mScrollOrientation;
    }

    public CustomizedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "138e75f30824b98dc3434355d8794519", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "138e75f30824b98dc3434355d8794519");
            return;
        }
        this.DEBUG = false;
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mScrollState = 0;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mScrollEnable = true;
        initScrollView();
        this.mChildLayoutCenter = false;
        this.mFillViewportH = true;
        this.mFillViewportV = true;
        this.mScrollOrientation = 3;
        this.mParentHelper = new NestedScrollingParentHelper(this);
        this.mChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, ACCESSIBILITY_DELEGATE);
        this.mFrameLayout = new FrameLayout(context);
        addView(this.mFrameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    public FrameLayout getChildFrame() {
        return this.mFrameLayout;
    }

    public void showIndicator(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7693fbb4ddfcafb72cfb778b1a6eb786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7693fbb4ddfcafb72cfb778b1a6eb786");
            return;
        }
        setHorizontalScrollBarEnabled(z);
        setVerticalScrollBarEnabled(z);
    }

    public void setScrollEnable(boolean z) {
        this.mScrollEnable = z;
    }

    public void setScrollEndListener(OnScrollEndListener onScrollEndListener) {
        this.mOnScrollEndListener = onScrollEndListener;
    }

    public void addScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        Object[] objArr = {onScrollChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ae39bcbdd20ea2f782a098e418a4f6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ae39bcbdd20ea2f782a098e418a4f6d");
            return;
        }
        if (this.mOnScrollChangeListeners == null) {
            this.mOnScrollChangeListeners = new ArrayList();
        }
        this.mOnScrollChangeListeners.add(onScrollChangeListener);
    }

    public void removeScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        Object[] objArr = {onScrollChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60aa18073b6874cd5cbf8a27c07a064a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60aa18073b6874cd5cbf8a27c07a064a");
        } else if (this.mOnScrollChangeListeners != null) {
            this.mOnScrollChangeListeners.remove(onScrollChangeListener);
        }
    }

    public void setContentOffset(final int i, final int i2, final boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8154bee27fb7b7f062fdbae711f0c4ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8154bee27fb7b7f062fdbae711f0c4ea");
        } else if (i >= 0 || i2 >= 0) {
            post(new Runnable() { // from class: com.dianping.picasso.view.scroller.CustomizedScrollView.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "545985442066812ac9308bc09cb7d5ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "545985442066812ac9308bc09cb7d5ce");
                    } else {
                        CustomizedScrollView.this.syncSetContentOffset(i, i2, z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncSetContentOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4062f64e6cb4846a863863729e80c4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4062f64e6cb4846a863863729e80c4b");
        } else if (i >= 0 || i2 >= 0) {
            if (z) {
                smoothScrollTo(i, i2);
            } else {
                scrollTo(i, i2);
            }
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "494f7aa5f5909a70dae1fc058ed36db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "494f7aa5f5909a70dae1fc058ed36db3");
        } else {
            this.mChildHelper.setNestedScrollingEnabled(z);
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b400b98c4af92f6dd7919e51615380d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b400b98c4af92f6dd7919e51615380d")).booleanValue() : this.mChildHelper.isNestedScrollingEnabled();
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07e7abe82fb85488fbc7525e75fe259d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07e7abe82fb85488fbc7525e75fe259d")).booleanValue() : this.mChildHelper.startNestedScroll(i, i2);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c82c1db88a9700548ddb344dafeac00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c82c1db88a9700548ddb344dafeac00");
        } else {
            this.mChildHelper.stopNestedScroll(i);
        }
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1fc2a194801ac2d646156054f59442d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1fc2a194801ac2d646156054f59442d")).booleanValue() : this.mChildHelper.hasNestedScrollingParent(i);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iArr, Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b300c33b6abd9cf6626d7a9c1b1e14cc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b300c33b6abd9cf6626d7a9c1b1e14cc")).booleanValue() : this.mChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, iArr2, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0269ec4cae2d5a1a14f0a7c8e10420d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0269ec4cae2d5a1a14f0a7c8e10420d")).booleanValue() : this.mChildHelper.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aced9c4106632ffa949970bce9d87de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aced9c4106632ffa949970bce9d87de")).booleanValue() : this.mChildHelper.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c98c8f61353f00f77b53fb9e9f26296b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c98c8f61353f00f77b53fb9e9f26296b")).booleanValue() : this.mChildHelper.dispatchNestedPreFling(f, f2);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bb87a95dda665bdf9e289b45fd08f6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bb87a95dda665bdf9e289b45fd08f6b")).booleanValue();
        }
        if (this.mScrollEnable) {
            return ((i & 2) != 0 && canScrollVertically()) || ((i & 1) != 0 && canScrollHorizontally());
        }
        return false;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "830f527d3382059aa8dde4d86dc562d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "830f527d3382059aa8dde4d86dc562d7");
            return;
        }
        this.mParentHelper.onNestedScrollAccepted(view, view2, i);
        boolean canScrollHorizontally = canScrollHorizontally();
        int i3 = canScrollHorizontally;
        if (canScrollVertically()) {
            i3 = (canScrollHorizontally ? 1 : 0) | 2;
        }
        startNestedScroll(i3, i2);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf6d13af3c503a9e2f01612cf7ae71e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf6d13af3c503a9e2f01612cf7ae71e1");
            return;
        }
        this.mParentHelper.onStopNestedScroll(view, i);
        stopNestedScroll();
    }

    public boolean canScrollHorizontally() {
        return (this.mScrollOrientation & 1) == 1;
    }

    public boolean canScrollVertically() {
        return (this.mScrollOrientation & 2) == 2;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a297d217f56752159870b920c8bb6d12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a297d217f56752159870b920c8bb6d12");
            return;
        }
        int scrollY = getScrollY();
        int scrollX = getScrollX();
        scrollBy(canScrollHorizontally() ? i3 : 0, canScrollVertically() ? i4 : 0);
        int scrollY2 = getScrollY() - scrollY;
        int scrollX2 = getScrollX() - scrollX;
        dispatchNestedScroll(scrollX2, scrollY2, i3 - scrollX2, i4 - scrollY2, null, i5);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1e9c3511616ad0e7a36e05ae6b8f222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1e9c3511616ad0e7a36e05ae6b8f222");
        } else {
            dispatchNestedPreScroll(i, i2, iArr, null, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0eca91e2630ccc3132cfd77dace5902", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0eca91e2630ccc3132cfd77dace5902")).booleanValue();
        }
        if (z) {
            return false;
        }
        fling((int) f, (int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec839b84f2ea48f6d53932513460ba6a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec839b84f2ea48f6d53932513460ba6a")).booleanValue() : dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5506ee13feec7d41a0f6bf62e552c0b8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5506ee13feec7d41a0f6bf62e552c0b8")).intValue() : this.mParentHelper.getNestedScrollAxes();
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54764fddae163ff0280f1ada399e3170", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54764fddae163ff0280f1ada399e3170")).floatValue();
        }
        if (getChildCount() == 0 || !canScrollHorizontally()) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int scrollX = getScrollX();
        if (scrollX < horizontalFadingEdgeLength) {
            return scrollX / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1f294b603b9af7ec0a4ae90420d868e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1f294b603b9af7ec0a4ae90420d868e")).floatValue();
        }
        if (getChildCount() == 0 || !canScrollVertically()) {
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
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fb5342121a6340fb70c391f91eefb76", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fb5342121a6340fb70c391f91eefb76")).floatValue();
        }
        if (getChildCount() == 0 || !canScrollVertically()) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c21b4327e660766f3e9933923a8b9efb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c21b4327e660766f3e9933923a8b9efb")).floatValue();
        }
        if (getChildCount() == 0 || !canScrollHorizontally()) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int right = (getChildAt(0).getRight() - getScrollX()) - (getWidth() - getPaddingRight());
        if (right < horizontalFadingEdgeLength) {
            return right / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmountY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3bcbe4bba260b82f2a730619f0cfa90", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3bcbe4bba260b82f2a730619f0cfa90")).intValue() : (int) (getHeight() * 0.5f);
    }

    public int getMaxScrollAmountX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf3c7470391ef8f3ef95d58152c6fa53", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf3c7470391ef8f3ef95d58152c6fa53")).intValue() : (int) (getWidth() * 0.5f);
    }

    private void initScrollView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "697a58185f8beffd7fa9bcf47e348495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "697a58185f8beffd7fa9bcf47e348495");
            return;
        }
        this.mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "493d37ed5c186f1c965e57acc62f4ff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "493d37ed5c186f1c965e57acc62f4ff9");
        } else if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "053d9838c13f27d732fb184953eba325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "053d9838c13f27d732fb184953eba325");
        } else if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "191140caea5c1ac25eb2cf155c701f25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "191140caea5c1ac25eb2cf155c701f25");
        } else if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9431d5ac92ba93e6b536376246f20a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9431d5ac92ba93e6b536376246f20a0");
        } else if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public void setScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.mOnScrollChangeListener = onScrollChangeListener;
    }

    private boolean canScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22cfc4f62a720a36ea74432dd7f1de11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22cfc4f62a720a36ea74432dd7f1de11")).booleanValue();
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight();
            return (getWidth() < (childAt.getWidth() + getPaddingLeft()) + getPaddingRight()) || canScrollHorizontally() || (getHeight() < (height + getPaddingTop()) + getPaddingBottom()) || canScrollVertically();
        }
        return false;
    }

    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.mSmoothScrollingEnabled = z;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9727bd62f9bb5c41f275434748f9423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9727bd62f9bb5c41f275434748f9423");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.mOnScrollChangeListener != null) {
            this.mOnScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
        }
        if (this.mOnScrollChangeListeners != null) {
            for (OnScrollChangeListener onScrollChangeListener : this.mOnScrollChangeListeners) {
                onScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af61dd5c6b97e83fe7804a82ba99ccc4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af61dd5c6b97e83fe7804a82ba99ccc4")).booleanValue() : super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f43cb6bf80d24e4684a9031612d37d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f43cb6bf80d24e4684a9031612d37d2")).booleanValue();
        }
        this.mTempRect.setEmpty();
        if (!canScroll()) {
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
                        if (canScrollVertically()) {
                            if (!keyEvent.isAltPressed()) {
                                return arrowScrollVertically(33);
                            }
                            return fullScrollVertically(33);
                        }
                        return false;
                    case 20:
                        if (canScrollVertically()) {
                            if (!keyEvent.isAltPressed()) {
                                return arrowScrollVertically(130);
                            }
                            return fullScrollVertically(130);
                        }
                        return false;
                    case 21:
                        if (canScrollHorizontally()) {
                            if (!keyEvent.isAltPressed()) {
                                return arrowScrollHorizontally(17);
                            }
                            return fullScrollHorizontally(17);
                        }
                        return false;
                    case 22:
                        if (canScrollHorizontally()) {
                            if (!keyEvent.isAltPressed()) {
                                return arrowScrollHorizontally(130);
                            }
                            return fullScrollHorizontally(130);
                        }
                        return false;
                    default:
                        return false;
                }
            } else if (canScrollHorizontally()) {
                pageScrollHorizontally(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            } else if (canScrollVertically()) {
                pageScrollVertically(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean inChild(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d60f8605f49a558e027f5c9274d49fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d60f8605f49a558e027f5c9274d49fc")).booleanValue();
        }
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    private void initOrResetVelocityTracker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7f6b22b56c8cd6e7fcbc1e923259bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7f6b22b56c8cd6e7fcbc1e923259bcd");
        } else if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            this.mVelocityTracker.clear();
        }
    }

    private void initVelocityTrackerIfNotExists() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac2e5d5abb370e02bc2897c460ffdc9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac2e5d5abb370e02bc2897c460ffdc9f");
        } else if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void recycleVelocityTracker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc2764bc96ba146bb394a63e322e81dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc2764bc96ba146bb394a63e322e81dd");
        } else if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c21b4c6b7d331731a2ce0c3af8bbcc17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c21b4c6b7d331731a2ce0c3af8bbcc17");
            return;
        }
        if (z) {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    private void setScrollState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c8bad95e8037d2bfb99aaa2982f83f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c8bad95e8037d2bfb99aaa2982f83f9");
        } else if (i == this.mScrollState) {
        } else {
            this.mScrollState = i;
        }
    }

    private void cancelTouch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b02fbaeff44950e88aea4a861ff0550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b02fbaeff44950e88aea4a861ff0550");
            return;
        }
        resetTouch();
        setScrollState(0);
    }

    private void resetTouch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9abc91c4260aba10394d82b07419c486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9abc91c4260aba10394d82b07419c486");
            return;
        }
        recycleVelocityTracker();
        stopNestedScroll(0);
        releaseGlows();
    }

    private void releaseGlows() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dbfee89f26d7455d4bc9b8f2eb7b07a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dbfee89f26d7455d4bc9b8f2eb7b07a");
            return;
        }
        boolean onRelease = this.mEdgeGlowLeft != null ? this.mEdgeGlowLeft.onRelease() : false;
        if (this.mEdgeGlowTop != null) {
            onRelease |= this.mEdgeGlowTop.onRelease();
        }
        if (this.mEdgeGlowRight != null) {
            onRelease |= this.mEdgeGlowRight.onRelease();
        }
        if (this.mEdgeGlowBottom != null) {
            onRelease |= this.mEdgeGlowBottom.onRelease();
        }
        if (onRelease) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9813342d0a545eace31a532d5e3551d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9813342d0a545eace31a532d5e3551d9")).booleanValue();
        }
        if (this.mScrollEnable) {
            int action = motionEvent.getAction();
            if (action == 2 && this.mScrollState == 1) {
                return true;
            }
            setScrollState(0);
            int canScrollHorizontally = canScrollHorizontally();
            boolean canScrollVertically = canScrollVertically();
            int i = action & 255;
            if (i != 6) {
                switch (i) {
                    case 0:
                        int y = (int) motionEvent.getY();
                        int x = (int) motionEvent.getX();
                        if (!inChild(x, y)) {
                            setScrollState(0);
                            recycleVelocityTracker();
                            break;
                        } else {
                            this.mLastMotionY = y;
                            this.mLastMotionX = x;
                            this.mInitialTouchY = this.mLastMotionY;
                            this.mInitialTouchX = this.mLastMotionX;
                            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                            initOrResetVelocityTracker();
                            this.mVelocityTracker.addMovement(motionEvent);
                            this.mScroller.computeScrollOffset();
                            if (this.mScrollState == 2) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                setScrollState(1);
                            }
                            if (canScrollVertically) {
                                canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                            }
                            startNestedScroll(canScrollHorizontally, 0);
                            toggleDisableParentIntercept(true);
                            break;
                        }
                    case 1:
                        recycleVelocityTracker();
                        stopNestedScroll(0);
                        toggleDisableParentIntercept(false);
                        break;
                    case 2:
                        int i2 = this.mActivePointerId;
                        if (i2 != -1) {
                            int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i2);
                            if (findPointerIndex == -1) {
                                Log.e(TAG, "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                                break;
                            } else {
                                int y2 = (int) MotionEventCompat.getY(motionEvent, findPointerIndex);
                                int x2 = (int) MotionEventCompat.getX(motionEvent, findPointerIndex);
                                if (this.mScrollState != 1) {
                                    int i3 = x2 - this.mInitialTouchX;
                                    int i4 = y2 - this.mInitialTouchY;
                                    if (canScrollHorizontally == 0 || Math.abs(i3) <= this.mTouchSlop) {
                                        z = false;
                                    } else {
                                        this.mLastMotionX = this.mInitialTouchX + (this.mTouchSlop * (i3 < 0 ? -1 : 1));
                                        z = true;
                                    }
                                    if (canScrollVertically && Math.abs(i4) > this.mTouchSlop) {
                                        this.mLastMotionY = this.mInitialTouchY + (this.mTouchSlop * (i4 >= 0 ? 1 : -1));
                                        z = true;
                                    }
                                    initVelocityTrackerIfNotExists();
                                    this.mVelocityTracker.addMovement(motionEvent);
                                    this.mNestedYOffset = 0;
                                    if (z) {
                                        setScrollState(1);
                                        toggleDisallowInterceptTouchEvent(true);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        cancelTouch();
                        toggleDisableParentIntercept(false);
                        break;
                }
            } else {
                onSecondaryPointerUp(motionEvent);
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0139, code lost:
        if (canScrollHorizontally(-1) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013b, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014c, code lost:
        if (canScrollVertically(-1) == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.picasso.view.scroller.CustomizedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6d055306a9ea10255e9bb52a631d36c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6d055306a9ea10255e9bb52a631d36c")).booleanValue();
        }
        if (MotionEventCompat.getActionMasked(motionEvent) == 0 && !this.mScroller.isFinished()) {
            stopScroll();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void toggleDisableParentIntercept(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "618a626dbd37a12056b4942edbeb9785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "618a626dbd37a12056b4942edbeb9785");
            return;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof PicassoScrollViewParentInterface) {
                ((PicassoScrollViewParentInterface) parent).disableParentIntercept(z);
            }
        }
    }

    private void toggleDisallowInterceptTouchEvent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbc6a97b5f167edf2dd18a45805ed727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbc6a97b5f167edf2dd18a45805ed727");
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed037e973323af68332c4451542fe3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed037e973323af68332c4451542fe3c4");
            return;
        }
        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (MotionEventCompat.getPointerId(motionEvent, action) == this.mActivePointerId) {
            int i = action != 0 ? 0 : 1;
            int y = (int) MotionEventCompat.getY(motionEvent, i);
            this.mLastMotionY = y;
            this.mInitialTouchX = y;
            int x = (int) MotionEventCompat.getX(motionEvent, i);
            this.mLastMotionX = x;
            this.mInitialTouchY = x;
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3c97af0b5fe851d0678e27a1d094965", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3c97af0b5fe851d0678e27a1d094965")).booleanValue();
        }
        if ((MotionEventCompat.getSource(motionEvent) & 2) != 0 && motionEvent.getAction() == 8) {
            float axisValue = MotionEventCompat.getAxisValue(motionEvent, 9);
            float axisValue2 = MotionEventCompat.getAxisValue(motionEvent, 10);
            if (axisValue != 0.0f) {
                int scrollY = getScrollY();
                int scrollX = getScrollX();
                if (canScrollHorizontally()) {
                    int scrollRangeX = getScrollRangeX();
                    i = scrollX - ((int) (axisValue2 * getHorizontalScrollFactorCompat()));
                    if (i < 0) {
                        i = 0;
                    } else if (i > scrollRangeX) {
                        i = scrollRangeX;
                    }
                } else {
                    i = scrollX;
                }
                if (canScrollVertically()) {
                    int scrollRangeY = getScrollRangeY();
                    i2 = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                    if (i2 < 0) {
                        i2 = 0;
                    } else if (i2 > scrollRangeY) {
                        i2 = scrollRangeY;
                    }
                } else {
                    i2 = scrollY;
                }
                if (i2 != scrollY || i != scrollX) {
                    super.scrollTo(i, i2);
                    return true;
                }
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "699800832dd1e605818a1b876d8a074f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "699800832dd1e605818a1b876d8a074f")).floatValue();
        }
        if (this.mVerticalScrollFactor == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.mVerticalScrollFactor;
    }

    private float getHorizontalScrollFactorCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfa789583c4241fd4812e1ef72d32f75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfa789583c4241fd4812e1ef72d32f75")).floatValue();
        }
        if (this.mVerticalScrollFactor == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.mVerticalScrollFactor;
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eccfeaadc3c3481bbad5dcec75303d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eccfeaadc3c3481bbad5dcec75303d0");
        } else {
            super.scrollTo(i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean overScrollByCompat(int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.picasso.view.scroller.CustomizedScrollView.overScrollByCompat(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollRangeY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4d2dff3a1935b02e3515ecb43bd0b91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4d2dff3a1935b02e3515ecb43bd0b91")).intValue();
        }
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollRangeX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc35fb2e26da12bb95ddc8f208d3f487", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc35fb2e26da12bb95ddc8f208d3f487")).intValue();
        }
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
        }
        return 0;
    }

    private View findFocusableViewInBoundsVertically(boolean z, int i, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94578c97011e6c2f0abd191d50c3e6f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94578c97011e6c2f0abd191d50c3e6f4");
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View findFocusableViewInBoundsHorizontally(boolean r16, int r17, int r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r17
            r0 = 3
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r16)
            r10 = 0
            r9[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r11 = 1
            r9[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r12 = 2
            r9[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.picasso.view.scroller.CustomizedScrollView.changeQuickRedirect
            java.lang.String r14 = "f3e4f78d94a10508b6d4b6134fd6688e"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r9
            r1 = r15
            r2 = r13
            r4 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L33
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r15, r13, r10, r14)
            android.view.View r0 = (android.view.View) r0
            return r0
        L33:
            java.util.ArrayList r0 = r15.getFocusables(r12)
            r1 = 0
            int r2 = r0.size()
            r3 = r1
            r1 = 0
            r4 = 0
        L3f:
            if (r1 >= r2) goto L8b
            java.lang.Object r5 = r0.get(r1)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getLeft()
            int r9 = r5.getRight()
            if (r8 >= r9) goto L86
            if (r6 >= r9) goto L86
            if (r8 >= r6) goto L5b
            r12 = r18
            if (r9 >= r12) goto L5d
            r13 = 1
            goto L5e
        L5b:
            r12 = r18
        L5d:
            r13 = 0
        L5e:
            if (r3 != 0) goto L63
            r3 = r5
            r4 = r13
            goto L88
        L63:
            if (r16 == 0) goto L6b
            int r14 = r3.getTop()
            if (r6 < r14) goto L73
        L6b:
            if (r16 != 0) goto L75
            int r6 = r3.getBottom()
            if (r9 <= r6) goto L75
        L73:
            r6 = 1
            goto L76
        L75:
            r6 = 0
        L76:
            if (r4 == 0) goto L7d
            if (r13 == 0) goto L88
            if (r6 == 0) goto L88
            goto L84
        L7d:
            if (r13 == 0) goto L82
            r3 = r5
            r4 = 1
            goto L88
        L82:
            if (r6 == 0) goto L88
        L84:
            r3 = r5
            goto L88
        L86:
            r12 = r18
        L88:
            int r1 = r1 + 1
            goto L3f
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.picasso.view.scroller.CustomizedScrollView.findFocusableViewInBoundsHorizontally(boolean, int, int):android.view.View");
    }

    public boolean pageScrollHorizontally(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c3f9c43aa3dbff6f152359641148193", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c3f9c43aa3dbff6f152359641148193")).booleanValue();
        }
        boolean z = i == 130;
        int width = getWidth();
        if (z) {
            this.mTempRect.left = getScrollX() + width;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.mTempRect.left + width > childAt.getRight()) {
                    this.mTempRect.left = childAt.getRight() - width;
                }
            }
        } else {
            this.mTempRect.left = getScrollY() - width;
            if (this.mTempRect.left < 0) {
                this.mTempRect.left = 0;
            }
        }
        this.mTempRect.right = this.mTempRect.left + width;
        return scrollAndFocusHorizontally(i, this.mTempRect.left, this.mTempRect.right);
    }

    public boolean pageScrollVertically(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bb69befd7e4967a38903adf15163189", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bb69befd7e4967a38903adf15163189")).booleanValue();
        }
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.mTempRect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.mTempRect.top + height > childAt.getBottom()) {
                    this.mTempRect.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.mTempRect.top = getScrollY() - height;
            if (this.mTempRect.top < 0) {
                this.mTempRect.top = 0;
            }
        }
        this.mTempRect.bottom = this.mTempRect.top + height;
        return scrollAndFocusVertically(i, this.mTempRect.top, this.mTempRect.bottom);
    }

    public boolean fullScrollVertically(int i) {
        int childCount;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c447f9a9f806b4bc35934368362e8d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c447f9a9f806b4bc35934368362e8d2")).booleanValue();
        }
        boolean z = i == 130;
        int height = getHeight();
        this.mTempRect.top = 0;
        this.mTempRect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.mTempRect.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            this.mTempRect.top = this.mTempRect.bottom - height;
        }
        return scrollAndFocusVertically(i, this.mTempRect.top, this.mTempRect.bottom);
    }

    public boolean fullScrollHorizontally(int i) {
        int childCount;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1624db3bb78cf287e6f099d521dc8d2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1624db3bb78cf287e6f099d521dc8d2e")).booleanValue();
        }
        boolean z = i == 66;
        int width = getWidth();
        this.mTempRect.left = 0;
        this.mTempRect.right = width;
        if (z && (childCount = getChildCount()) > 0) {
            this.mTempRect.right = getChildAt(childCount - 1).getRight() + getPaddingLeft();
            this.mTempRect.left = this.mTempRect.right - width;
        }
        return scrollAndFocusHorizontally(i, this.mTempRect.left, this.mTempRect.right);
    }

    private boolean scrollAndFocusHorizontally(int i, int i2, int i3) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d2f1d518827e7aeed9c6e2a7762e8a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d2f1d518827e7aeed9c6e2a7762e8a1")).booleanValue();
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i4 = width + scrollX;
        boolean z2 = i == 17;
        View findFocusableViewInBoundsHorizontally = findFocusableViewInBoundsHorizontally(z2, i2, i3);
        if (findFocusableViewInBoundsHorizontally == null) {
            findFocusableViewInBoundsHorizontally = this;
        }
        if (i2 < scrollX || i3 > i4) {
            doScrollX(z2 ? i2 - scrollX : i3 - i4);
            z = true;
        }
        if (findFocusableViewInBoundsHorizontally != findFocus()) {
            findFocusableViewInBoundsHorizontally.requestFocus(i);
        }
        return z;
    }

    private boolean scrollAndFocusVertically(int i, int i2, int i3) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e8d940dad15860bec915706ceae845", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e8d940dad15860bec915706ceae845")).booleanValue();
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        View findFocusableViewInBoundsVertically = findFocusableViewInBoundsVertically(z2, i2, i3);
        if (findFocusableViewInBoundsVertically == null) {
            findFocusableViewInBoundsVertically = this;
        }
        if (i2 < scrollY || i3 > i4) {
            doScrollY(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (findFocusableViewInBoundsVertically != findFocus()) {
            findFocusableViewInBoundsVertically.requestFocus(i);
        }
        return z;
    }

    public boolean arrowScrollHorizontally(int i) {
        int right;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12241125ee52847899d6c752b2faa2e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12241125ee52847899d6c752b2faa2e0")).booleanValue();
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmountX = getMaxScrollAmountX();
        if (findNextFocus != null && isWithinDeltaOfScreenX(findNextFocus, maxScrollAmountX, getWidth())) {
            findNextFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(findNextFocus, this.mTempRect);
            doScrollX(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect)[0]);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollX() < maxScrollAmountX) {
                maxScrollAmountX = getScrollX();
            } else if (i == 130 && getChildCount() > 0 && (right = getChildAt(0).getRight() - ((getScrollX() + getWidth()) - getPaddingRight())) < maxScrollAmountX) {
                maxScrollAmountX = right;
            }
            if (maxScrollAmountX == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmountX = -maxScrollAmountX;
            }
            doScrollX(maxScrollAmountX);
        }
        if (findFocus != null && findFocus.isFocused() && isOffScreenX(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public boolean arrowScrollVertically(int i) {
        int bottom;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af5091c277f9d18ae426da1fd61c9171", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af5091c277f9d18ae426da1fd61c9171")).booleanValue();
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmountY = getMaxScrollAmountY();
        if (findNextFocus != null && isWithinDeltaOfScreenY(findNextFocus, maxScrollAmountY, getHeight())) {
            findNextFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(findNextFocus, this.mTempRect);
            doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect)[1]);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmountY) {
                maxScrollAmountY = getScrollY();
            } else if (i == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom())) < maxScrollAmountY) {
                maxScrollAmountY = bottom;
            }
            if (maxScrollAmountY == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmountY = -maxScrollAmountY;
            }
            doScrollY(maxScrollAmountY);
        }
        if (findFocus != null && findFocus.isFocused() && isOffScreenY(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private boolean isOffScreenX(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50a76e81a3d8326d7e19af9ed771d579", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50a76e81a3d8326d7e19af9ed771d579")).booleanValue() : !isWithinDeltaOfScreenX(view, 0, getWidth());
    }

    private boolean isOffScreenY(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3de3c8a0e1030009d4437986cee3a690", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3de3c8a0e1030009d4437986cee3a690")).booleanValue() : !isWithinDeltaOfScreenY(view, 0, getHeight());
    }

    private boolean isWithinDeltaOfScreenX(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d3adc048d8d40db72ac1eda8bab4d6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d3adc048d8d40db72ac1eda8bab4d6f")).booleanValue();
        }
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return this.mTempRect.right + i >= getScrollX() && this.mTempRect.left - i <= getScrollX() + i2;
    }

    private boolean isWithinDeltaOfScreenY(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92795c443efb7917188235168c182c0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92795c443efb7917188235168c182c0c")).booleanValue();
        }
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return this.mTempRect.bottom + i >= getScrollY() && this.mTempRect.top - i <= getScrollY() + i2;
    }

    private void doScrollXY(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c364292d5004561a725037b890f083d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c364292d5004561a725037b890f083d");
        } else {
            doScrollXY(iArr[0], iArr[1]);
        }
    }

    private void doScrollXY(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac0259549baec9de6d7d335692189283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac0259549baec9de6d7d335692189283");
        } else if (i == 0 && i2 == 0) {
        } else {
            if (this.mSmoothScrollingEnabled) {
                smoothScrollBy(i, i2);
            } else {
                scrollBy(i, i2);
            }
        }
    }

    private void doScrollY(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6db4e5efad096d0cded4c64c0fd1f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6db4e5efad096d0cded4c64c0fd1f58");
        } else if (i != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothScrollBy(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private void doScrollX(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a1615fecd1951ae75725b22678f25c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a1615fecd1951ae75725b22678f25c0");
        } else if (i != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothScrollBy(i, 0);
            } else {
                scrollBy(i, 0);
            }
        }
    }

    public final void smoothScrollBy(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b51bd445e1cc3ac95b84c8abf427384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b51bd445e1cc3ac95b84c8abf427384");
        } else if (getChildCount() == 0) {
        } else {
            if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
                setScrollState(2);
                int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
                int height2 = getChildAt(0).getHeight();
                int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
                int width2 = getChildAt(0).getWidth();
                int max = Math.max(0, height2 - height);
                int max2 = Math.max(0, width2 - width);
                int scrollY = getScrollY();
                int scrollX = getScrollX();
                this.mScroller.startScroll(scrollX, scrollY, Math.max(0, Math.min(i + scrollX, max2)) - scrollX, Math.max(0, Math.min(i2 + scrollY, max)) - scrollY);
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                setScrollState(0);
                if (!this.mScroller.isFinished()) {
                    this.mScroller.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void smoothScrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b663ddfe4eaf533b9fdd8a218385a2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b663ddfe4eaf533b9fdd8a218385a2e");
        } else {
            smoothScrollBy(i - getScrollX(), i2 - getScrollY());
        }
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c516710dfa488c4badf6a1192aa4142", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c516710dfa488c4badf6a1192aa4142")).intValue();
        }
        if (!canScrollVertically()) {
            return super.computeVerticalScrollRange();
        }
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeVerticalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72de7c6a65c63e3755b4e321a2a48704", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72de7c6a65c63e3755b4e321a2a48704")).intValue() : Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeVerticalScrollExtent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e8f0b2d833deece0f85ab10728edc03", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e8f0b2d833deece0f85ab10728edc03")).intValue() : super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84430a8a713871d66db703c18e5aea5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84430a8a713871d66db703c18e5aea5b")).intValue();
        }
        if (!canScrollHorizontally()) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        if (childCount == 0) {
            return width;
        }
        int right = getChildAt(0).getRight();
        int scrollX = getScrollX();
        int max = Math.max(0, right - width);
        return scrollX < 0 ? right - scrollX : scrollX > max ? right + (scrollX - max) : right;
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a2eb51d169f4c15123dd0de6c4605d2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a2eb51d169f4c15123dd0de6c4605d2")).intValue() : Math.max(0, super.computeHorizontalScrollOffset());
    }

    @Override // android.view.View, android.support.v4.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d19adf196b13289ebe233cb38dc970d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d19adf196b13289ebe233cb38dc970d")).intValue() : super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d28a6409eaa0f40a8a1d2b65f7666ab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d28a6409eaa0f40a8a1d2b65f7666ab7");
        } else if (getChildCount() == 0) {
        } else {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int paddingLeft = getPaddingLeft() + marginLayoutParams.leftMargin;
            int paddingTop = getPaddingTop() + marginLayoutParams.topMargin;
            if (this.mChildLayoutCenter) {
                if (getMeasuredWidth() > childAt.getMeasuredWidth()) {
                    paddingLeft = (getMeasuredWidth() - childAt.getMeasuredWidth()) / 2;
                }
                if (getMeasuredHeight() > childAt.getMeasuredHeight()) {
                    paddingTop = (getMeasuredHeight() - childAt.getMeasuredHeight()) / 2;
                }
            }
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
            this.mIsLayoutDirty = false;
            if (this.mChildToScrollTo != null && isViewDescendantOf(this.mChildToScrollTo, this)) {
                scrollToChild(this.mChildToScrollTo);
            }
            this.mChildToScrollTo = null;
            if (!this.mIsLaidOut) {
                if (this.mSavedState != null) {
                    scrollTo(this.mSavedState.scrollXPosition, this.mSavedState.scrollYPosition);
                    this.mSavedState = null;
                }
                int i5 = i4 - i2;
                int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - ((i5 - getPaddingBottom()) - getPaddingTop()));
                int max2 = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredWidth() : 0) - ((i5 - getPaddingRight()) - getPaddingLeft()));
                int scrollY = getScrollY();
                int scrollX = getScrollX();
                if (getScrollY() <= max) {
                    max = getScrollY() < 0 ? 0 : scrollY;
                }
                if (getScrollX() <= max2) {
                    max2 = getScrollX() < 0 ? 0 : scrollX;
                }
                if (max2 != getScrollX() || max != getScrollY()) {
                    scrollTo(max2, max);
                }
            }
            scrollTo(getScrollX(), getScrollY());
            this.mIsLaidOut = true;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.MarginLayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b985f495fa1460d44987e82523596c9", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.MarginLayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b985f495fa1460d44987e82523596c9") : new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.MarginLayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cad3f945fc04aef18959b29d4bd1715", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.MarginLayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cad3f945fc04aef18959b29d4bd1715") : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int childMeasureSpec;
        int childMeasureSpec2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bab2f50acfbbc7728b5f9557a0a13b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bab2f50acfbbc7728b5f9557a0a13b8");
        } else if (getChildCount() == 0) {
        } else {
            View childAt = getChildAt(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int paddingLeft = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + getPaddingLeft() + getPaddingRight();
            int paddingTop = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + getPaddingTop() + getPaddingBottom();
            int max = Math.max(paddingTop, getSuggestedMinimumHeight());
            int max2 = Math.max(paddingLeft, getSuggestedMinimumWidth());
            if (canScrollVertically()) {
                childMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
            } else {
                childMeasureSpec = getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
            }
            if (canScrollHorizontally()) {
                childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
            } else {
                childMeasureSpec2 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width);
            }
            childAt.measure(childMeasureSpec2, childMeasureSpec);
            int combineMeasuredStates = Build.VERSION.SDK_INT >= 11 ? combineMeasuredStates(0, childAt.getMeasuredState()) : 0;
            int max3 = Math.max(max2, childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            int max4 = Math.max(Math.max(max, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin), getSuggestedMinimumHeight());
            int resolveSizeAndState = ViewCompat.resolveSizeAndState(Math.max(max3, getSuggestedMinimumWidth()), i, combineMeasuredStates);
            int resolveSizeAndState2 = ViewCompat.resolveSizeAndState(max4, i2, combineMeasuredStates << 16);
            setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
            if (View.MeasureSpec.getMode(i2) == 0 || !this.mFillViewportV || childAt.getMeasuredHeight() >= (i6 = resolveSizeAndState2 - paddingTop) || (i3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824)) == childMeasureSpec) {
                i3 = childMeasureSpec;
            } else {
                z = true;
            }
            if (View.MeasureSpec.getMode(i) == 0 || !this.mFillViewportH || childAt.getMeasuredWidth() >= (i5 = resolveSizeAndState - paddingLeft) || (i4 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824)) == childMeasureSpec2) {
                i4 = childMeasureSpec2;
            } else {
                z = true;
            }
            if (z) {
                childAt.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "809c38ffdf26a7b41480aabf6758a9c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "809c38ffdf26a7b41480aabf6758a9c5");
        } else if (this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                int scrollRangeY = getScrollRangeY();
                int scrollRangeX = getScrollRangeX();
                int overScrollMode = ViewCompat.getOverScrollMode(this);
                boolean z = (overScrollMode == 0 || (overScrollMode == 1 && scrollRangeY > 0)) || (overScrollMode == 0 || (overScrollMode == 1 && scrollRangeX > 0));
                overScrollByCompat(currX - scrollX, currY - scrollY, scrollX, scrollY, scrollRangeX, scrollRangeY, 0, 0, false);
                if (z) {
                    ensureGlows();
                    if (currY <= 0 && scrollY > 0) {
                        this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
                    } else if (currY >= scrollRangeY && scrollY < scrollRangeY) {
                        this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
                    }
                    if (currX <= 0 && scrollX > 0) {
                        this.mEdgeGlowLeft.onAbsorb((int) this.mScroller.getCurrVelocity());
                    } else if (currX >= scrollRangeX && scrollX < scrollRangeX) {
                        this.mEdgeGlowRight.onAbsorb((int) this.mScroller.getCurrVelocity());
                    }
                }
            }
            if (this.mScroller.isFinished()) {
                setScrollState(0);
                if (this.mOnScrollEndListener != null) {
                    this.mOnScrollEndListener.onScrollEnd(this, getScrollX(), getScrollY());
                    return;
                }
                return;
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void scrollToChild(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a640f0db4d776b4d09d0d59d947dcf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a640f0db4d776b4d09d0d59d947dcf0");
            return;
        }
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int[] computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (computeScrollDeltaToGetChildRectOnScreen[0] == 0 && computeScrollDeltaToGetChildRectOnScreen[1] == 0) {
            return;
        }
        scrollBy(computeScrollDeltaToGetChildRectOnScreen[0], computeScrollDeltaToGetChildRectOnScreen[1]);
    }

    private boolean scrollToChildRect(Rect rect, boolean z) {
        Object[] objArr = {rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "338b620cd338864cdace4283454dfd2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "338b620cd338864cdace4283454dfd2f")).booleanValue();
        }
        int[] computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = (computeScrollDeltaToGetChildRectOnScreen[0] == 0 && computeScrollDeltaToGetChildRectOnScreen[1] == 0) ? false : true;
        if (z2) {
            if (z) {
                scrollBy(computeScrollDeltaToGetChildRectOnScreen[0], computeScrollDeltaToGetChildRectOnScreen[1]);
            } else {
                smoothScrollBy(computeScrollDeltaToGetChildRectOnScreen[0], computeScrollDeltaToGetChildRectOnScreen[1]);
            }
        }
        return z2;
    }

    public int[] computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ebaaada2fd1dad4bf4c8e192a9c07e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ebaaada2fd1dad4bf4c8e192a9c07e0");
        }
        if (getChildCount() == 0) {
            return new int[]{0, 0};
        }
        int height = getHeight();
        int width = getWidth();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int scrollX = getScrollX();
        int i8 = scrollX + width;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.left > 0) {
            scrollX += horizontalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i7 -= verticalFadingEdgeLength;
        }
        if (rect.right < getChildAt(0).getWidth()) {
            i8 -= horizontalFadingEdgeLength;
        }
        if (rect.bottom > i7 && rect.top > scrollY) {
            if (rect.height() > height) {
                i6 = (rect.top - scrollY) + 0;
            } else {
                i6 = (rect.bottom - i7) + 0;
            }
            i = Math.min(i6, getChildAt(0).getBottom() - i7);
        } else if (rect.top >= scrollY || rect.bottom >= i7) {
            i = 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i7 - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            i = Math.max(i2, -getScrollY());
        }
        if (rect.right > i8 && rect.left > scrollX) {
            if (rect.width() > width) {
                i5 = (rect.left - scrollX) + 0;
            } else {
                i5 = (rect.right - i8) + 0;
            }
            i3 = Math.min(i5, getChildAt(0).getRight() - i8);
        } else if (rect.left >= scrollX || rect.right >= i8) {
            i3 = 0;
        } else {
            if (rect.width() > width) {
                i4 = 0 - (i8 - rect.right);
            } else {
                i4 = 0 - (scrollX - rect.left);
            }
            i3 = Math.max(i4, -getScrollX());
        }
        return new int[]{i3, i};
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a36e1de95a1740e78b5e14d8ee309f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a36e1de95a1740e78b5e14d8ee309f0");
            return;
        }
        if (!this.mIsLayoutDirty) {
            scrollToChild(view2);
        } else {
            this.mChildToScrollTo = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        Object[] objArr = {Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ab14690efc589b959279f0a34b6c9a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ab14690efc589b959279f0a34b6c9a0")).booleanValue();
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
        if (findNextFocusFromRect == null) {
            return false;
        }
        if (canScrollHorizontally()) {
            if (isOffScreenX(findNextFocusFromRect)) {
                return false;
            }
        } else if (canScrollVertically() && isOffScreenY(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Object[] objArr = {view, rect, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1f1491ee77038bc2513cf57a4ec412c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1f1491ee77038bc2513cf57a4ec412c")).booleanValue();
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return scrollToChildRect(rect, z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "887918aef6dc81354328ae11a47e0676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "887918aef6dc81354328ae11a47e0676");
            return;
        }
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbb4df67eebb4a5e56ff29d6aa938cf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbb4df67eebb4a5e56ff29d6aa938cf3");
            return;
        }
        super.onAttachedToWindow();
        this.mIsLaidOut = false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f11862bd114f33d79a0bbceccd37d810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f11862bd114f33d79a0bbceccd37d810");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus) {
            return;
        }
        if (isWithinDeltaOfScreenX(findFocus, 0, i3) || isWithinDeltaOfScreenY(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(findFocus, this.mTempRect);
            doScrollXY(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
        }
    }

    private static boolean isViewDescendantOf(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "828d6356e00d359f56259d1c91ad7ccc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "828d6356e00d359f56259d1c91ad7ccc")).booleanValue();
        }
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && isViewDescendantOf((View) parent, view2);
    }

    public void stopScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5be2b7eae4421600985da57dd28c40dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5be2b7eae4421600985da57dd28c40dc");
            return;
        }
        setScrollState(0);
        fling(0, 0);
        this.mScroller.abortAnimation();
    }

    public boolean fling(int i, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01d450b5da72b5409cc1a653a5d8a58a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01d450b5da72b5409cc1a653a5d8a58a")).booleanValue();
        }
        boolean canScrollHorizontally = canScrollHorizontally();
        boolean canScrollVertically = canScrollVertically();
        int i3 = (!canScrollHorizontally || Math.abs(i) < this.mMinimumVelocity) ? 0 : i;
        int i4 = (!canScrollVertically || Math.abs(i2) < this.mMinimumVelocity) ? 0 : i2;
        float f = i3;
        float f2 = i4;
        if (!dispatchNestedPreFling(f, f2)) {
            int scrollY = getScrollY();
            int scrollX = getScrollX();
            boolean z2 = ((scrollY > 0 || i4 > 0) && (scrollY < getScrollRangeY() || i4 < 0)) || ((scrollX > 0 || i3 > 0) && (scrollX < getScrollRangeX() || i3 < 0));
            dispatchNestedFling(f, f2, z2);
            if (z2) {
                setScrollState(2);
                this.mScroller.fling(getScrollX(), getScrollY(), Math.max(-this.mMaximumVelocity, Math.min(i3, this.mMaximumVelocity)), Math.max(-this.mMaximumVelocity, Math.min(i4, this.mMaximumVelocity)), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, ((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
                ViewCompat.postInvalidateOnAnimation(this);
                z = true;
            }
        }
        if (!z && this.mOnScrollEndListener != null) {
            this.mOnScrollEndListener.onScrollEnd(this, getScrollX(), getScrollY());
        }
        return z;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f9c26862ba37817919043f4ad88218a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f9c26862ba37817919043f4ad88218a");
        } else if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int clamp = clamp(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int clamp2 = clamp(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (clamp == getScrollX() && clamp2 == getScrollY()) {
                return;
            }
            super.scrollTo(clamp, clamp2);
        }
    }

    private void ensureGlows() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9ab7f935b07402f0140ba6f3f3d96a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9ab7f935b07402f0140ba6f3f3d96a6");
        } else if (ViewCompat.getOverScrollMode(this) != 2) {
            if (this.mEdgeGlowTop == null) {
                Context context = getContext();
                this.mEdgeGlowTop = new EdgeEffectCompat(context);
                this.mEdgeGlowBottom = new EdgeEffectCompat(context);
                this.mEdgeGlowLeft = new EdgeEffectCompat(context);
                this.mEdgeGlowRight = new EdgeEffectCompat(context);
            }
        } else {
            this.mEdgeGlowTop = null;
            this.mEdgeGlowBottom = null;
            this.mEdgeGlowLeft = null;
            this.mEdgeGlowRight = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38ff0a3842739d237003f0becfcb2ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38ff0a3842739d237003f0becfcb2ffc");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.mEdgeGlowTop != null) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (!this.mEdgeGlowTop.isFinished()) {
                int save = canvas.save();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft() + scrollX, Math.min(0, scrollY));
                this.mEdgeGlowTop.setSize(width, getHeight());
                if (this.mEdgeGlowTop.draw(canvas)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.mEdgeGlowBottom.isFinished()) {
                int save2 = canvas.save();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((-width2) + getPaddingLeft() + scrollX, Math.max(getScrollRangeY(), scrollY) + height);
                canvas.rotate(180.0f, width2, 0.0f);
                this.mEdgeGlowBottom.setSize(width2, height);
                if (this.mEdgeGlowBottom.draw(canvas)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                canvas.restoreToCount(save2);
            }
            if (!this.mEdgeGlowLeft.isFinished()) {
                int save3 = canvas.save();
                int width3 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(270.0f);
                canvas.translate(((-height2) + getPaddingTop()) - scrollY, Math.min(0, scrollX));
                this.mEdgeGlowLeft.setSize(height2, width3);
                if (this.mEdgeGlowLeft.draw(canvas)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                canvas.restoreToCount(save3);
            }
            if (this.mEdgeGlowRight.isFinished()) {
                return;
            }
            int save4 = canvas.save();
            int width4 = getWidth();
            int height3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((-getPaddingTop()) + scrollY, -(Math.max(getScrollRangeX(), scrollX) + width4));
            this.mEdgeGlowRight.setSize(height3, width4);
            if (this.mEdgeGlowRight.draw(canvas)) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            canvas.restoreToCount(save4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b8f5f8ed5411e775abf991e49c0497d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b8f5f8ed5411e775abf991e49c0497d");
            return;
        }
        super.onDetachedFromWindow();
        stopScroll();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df8ee4761fcf2fe5af305e3193cef8f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df8ee4761fcf2fe5af305e3193cef8f6");
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.mSavedState = savedState;
            requestLayout();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8eb5a61a62290fd9b3fd8124e625545", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8eb5a61a62290fd9b3fd8124e625545");
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollYPosition = getScrollY();
        savedState.scrollXPosition = getScrollX();
        return savedState;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.dianping.picasso.view.scroller.CustomizedScrollView.SavedState.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e205bf96f9f63f4095f116afe98d519", RobustBitConfig.DEFAULT_VALUE) ? (SavedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e205bf96f9f63f4095f116afe98d519") : new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        public int scrollXPosition;
        public int scrollYPosition;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            Object[] objArr = {parcelable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43d5c2e56a0c07600f9c1230a8a9c5f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43d5c2e56a0c07600f9c1230a8a9c5f7");
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2296969cd1367cca3f63f7dec7003aad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2296969cd1367cca3f63f7dec7003aad");
                return;
            }
            this.scrollYPosition = parcel.readInt();
            this.scrollXPosition = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f72fc933d0c2e9da4bfac68e8b4f0268", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f72fc933d0c2e9da4bfac68e8b4f0268");
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollYPosition);
            parcel.writeInt(this.scrollXPosition);
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cdf770d8991222c9af0717667c370e5", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cdf770d8991222c9af0717667c370e5");
            }
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollXPosition=" + this.scrollXPosition + " scrollYPosition=" + this.scrollYPosition + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            Object[] objArr = {view, Integer.valueOf(i), bundle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd8aaf676db0afc045922943d2304fd0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd8aaf676db0afc045922943d2304fd0")).booleanValue();
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            CustomizedScrollView customizedScrollView = (CustomizedScrollView) view;
            if (customizedScrollView.isEnabled()) {
                if (i == 4096) {
                    int height = (customizedScrollView.getHeight() - customizedScrollView.getPaddingBottom()) - customizedScrollView.getPaddingTop();
                    int width = (customizedScrollView.getWidth() - customizedScrollView.getPaddingRight()) - customizedScrollView.getPaddingLeft();
                    int min = Math.min(customizedScrollView.getScrollY() + height, customizedScrollView.getScrollRangeY());
                    int min2 = Math.min(customizedScrollView.getScrollX() + width, customizedScrollView.getScrollRangeX());
                    if (min == customizedScrollView.getScrollY() && min2 == customizedScrollView.getScrollX()) {
                        return false;
                    }
                    customizedScrollView.smoothScrollTo(min2, min);
                    return true;
                } else if (i != 8192) {
                    return false;
                } else {
                    int height2 = (customizedScrollView.getHeight() - customizedScrollView.getPaddingBottom()) - customizedScrollView.getPaddingTop();
                    int width2 = (customizedScrollView.getWidth() - customizedScrollView.getPaddingRight()) - customizedScrollView.getPaddingLeft();
                    int max = Math.max(customizedScrollView.getScrollY() - height2, 0);
                    int min3 = Math.min(customizedScrollView.getScrollX() - width2, 0);
                    if (max == customizedScrollView.getScrollY() && min3 == customizedScrollView.getScrollX()) {
                        return false;
                    }
                    customizedScrollView.smoothScrollTo(min3, max);
                    return true;
                }
            }
            return false;
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Object[] objArr = {view, accessibilityNodeInfoCompat};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92290d188ee978198e1f69864f69b709", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92290d188ee978198e1f69864f69b709");
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            CustomizedScrollView customizedScrollView = (CustomizedScrollView) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (customizedScrollView.isEnabled()) {
                int scrollRangeY = customizedScrollView.getScrollRangeY();
                int scrollRangeX = customizedScrollView.getScrollRangeX();
                if (scrollRangeY > 0 || scrollRangeX > 0) {
                    accessibilityNodeInfoCompat.setScrollable(true);
                    if (customizedScrollView.getScrollY() > 0 || customizedScrollView.getScrollX() > 0) {
                        accessibilityNodeInfoCompat.addAction(8192);
                    }
                    if (customizedScrollView.getScrollY() < scrollRangeY || customizedScrollView.getScrollX() < scrollRangeX) {
                        accessibilityNodeInfoCompat.addAction(4096);
                    }
                }
            }
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z = false;
            Object[] objArr = {view, accessibilityEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b07fcb591895951901ea139f51b58c6c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b07fcb591895951901ea139f51b58c6c");
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            CustomizedScrollView customizedScrollView = (CustomizedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            AccessibilityRecordCompat asRecord = AccessibilityEventCompat.asRecord(accessibilityEvent);
            asRecord.setScrollable(((customizedScrollView.getScrollRangeY() > 0) || (customizedScrollView.getScrollRangeX() > 0)) ? true : true);
            asRecord.setScrollX(customizedScrollView.getScrollX());
            asRecord.setScrollY(customizedScrollView.getScrollY());
            asRecord.setMaxScrollX(customizedScrollView.getScrollRangeX());
            asRecord.setMaxScrollY(customizedScrollView.getScrollRangeY());
        }
    }

    public void setFillViewportH(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d57bba84fb155b60ef1f60804959dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d57bba84fb155b60ef1f60804959dff");
        } else if (this.mFillViewportH != z) {
            this.mFillViewportH = z;
            requestLayout();
        }
    }

    public void setFillViewportV(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a2d1cb3d204f6f88525254dc8f1bea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a2d1cb3d204f6f88525254dc8f1bea3");
        } else if (this.mFillViewportV != z) {
            this.mFillViewportV = z;
            requestLayout();
        }
    }

    public void setFillViewportHV(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5117d3392196769193599ed09547447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5117d3392196769193599ed09547447");
        } else if (this.mFillViewportH == z && this.mFillViewportV == z2) {
        } else {
            this.mFillViewportH = z;
            this.mFillViewportV = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a6e3a6a65c8e91f2c0bae04438fdb27", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a6e3a6a65c8e91f2c0bae04438fdb27")).booleanValue() : i > 0 ? getScrollX() < getScrollRangeX() : getScrollX() > 0 && getScrollRangeX() > 0;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66ff50b3862d418910fa069c48c0107b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66ff50b3862d418910fa069c48c0107b")).booleanValue() : i > 0 ? getScrollY() < getScrollRangeY() : getScrollY() > 0 && getScrollRangeY() > 0;
    }
}
