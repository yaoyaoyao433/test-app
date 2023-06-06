package com.meituan.android.recce.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.touch.b;
import com.facebook.react.touch.c;
import com.facebook.react.touch.d;
import com.facebook.react.uimanager.ac;
import com.facebook.react.uimanager.ai;
import com.facebook.react.uimanager.aj;
import com.facebook.react.uimanager.ak;
import com.facebook.react.uimanager.ba;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.x;
import com.facebook.react.uimanager.y;
import com.facebook.react.uimanager.z;
import com.meituan.android.recce.views.anim.RecceAnim;
import com.meituan.android.recce.views.anim.RecceAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceViewGroup extends ViewGroup implements c, d, ac, ai, y, RecceAnim {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final String TAG = "RecceViewGroup";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    @Nullable
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    @Nullable
    private ChildrenLayoutChangeListener mChildrenLayoutChangeListener;
    @Nullable
    private Rect mClippingRect;
    private final ba mDrawingOrderHelper;
    @Nullable
    private Rect mHitSlopRect;
    private int mLayoutDirection;
    private boolean mNeedsOffscreenAlphaCompositing;
    @Nullable
    private b mOnInterceptTouchEventListener;
    @Nullable
    private String mOverflow;
    @Nullable
    private Path mPath;
    private x mPointerEvents;
    @Nullable
    private RecceViewBackgroundDrawable mReactBackgroundDrawable;
    private boolean mRemoveClippedSubviews;
    private RecceAnimator recceAnimator;

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public RecceViewGroup(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a89fba4c838790b31847c95d43e763e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a89fba4c838790b31847c95d43e763e3");
            return;
        }
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mPointerEvents = x.AUTO;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
        setClipChildren(false);
        this.mDrawingOrderHelper = new ba(this);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a655fa5bb2ed32708d9dc6ed0aa8540d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a655fa5bb2ed32708d9dc6ed0aa8540d");
            return;
        }
        q.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9ef193331677f4d7f79a43076bd415f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9ef193331677f4d7f79a43076bd415f");
        } else if (Build.VERSION.SDK_INT < 17 || this.mReactBackgroundDrawable == null) {
        } else {
            this.mReactBackgroundDrawable.setResolvedLayoutDirection(this.mLayoutDirection);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        Object[] objArr = {viewStructure};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caf888e482e46d1403fc50ec090a1c39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caf888e482e46d1403fc50ec090a1c39");
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f813486f688519815f451c112efecc3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f813486f688519815f451c112efecc3e");
        } else if (i == 0 && this.mReactBackgroundDrawable == null) {
        } else {
            getOrCreateReactViewBackground().setColor(i);
        }
    }

    public void setPressedBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48a3bb007d9bb60184a395582a5ea93d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48a3bb007d9bb60184a395582a5ea93d");
        } else if (i == 0 && this.mReactBackgroundDrawable == null) {
        } else {
            getOrCreateReactViewBackground().setPressedColor(i);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bb22f9d6b6100c02682dcb907b456c1", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bb22f9d6b6100c02682dcb907b456c1");
    }

    public void setTranslucentBackgroundDrawable(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79f69259c4e2b372f5c890e6055a8730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79f69259c4e2b372f5c890e6055a8730");
            return;
        }
        updateBackgroundDrawable(null);
        if (this.mReactBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    @Override // com.facebook.react.touch.d
    public void setOnInterceptTouchEventListener(b bVar) {
        this.mOnInterceptTouchEventListener = bVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a6b9557815dbf6d4a9cc59284bd1360", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a6b9557815dbf6d4a9cc59284bd1360")).booleanValue();
        }
        if ((this.mOnInterceptTouchEventListener != null && this.mOnInterceptTouchEventListener.a(this, motionEvent)) || this.mPointerEvents == x.NONE || this.mPointerEvents == x.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a94b2793493a96089a9f0f053914fd3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a94b2793493a96089a9f0f053914fd3")).booleanValue();
        }
        return !(this.mPointerEvents == x.NONE || this.mPointerEvents == x.BOX_NONE) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    public void setBorderWidth(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67ee0258275551f7556e0388681f7bee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67ee0258275551f7556e0388681f7bee");
        } else {
            getOrCreateReactViewBackground().setBorderWidth(i, f);
        }
    }

    public void setBorderColor(int i, float f, float f2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fbc599bbbb17ef51c0be8dd807bd983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fbc599bbbb17ef51c0be8dd807bd983");
        } else {
            getOrCreateReactViewBackground().setBorderColor(i, f, f2);
        }
    }

    public void setBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3419e8d346da889819623e50e78adeae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3419e8d346da889819623e50e78adeae");
            return;
        }
        RecceViewBackgroundDrawable orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.setRadius(f);
        if (Build.VERSION.SDK_INT < 18) {
            int i = orCreateReactViewBackground.hasRoundedBorders() ? 1 : 2;
            if (i != getLayerType()) {
                setLayerType(i, null);
            }
        }
    }

    public void setBorderRadius(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b58a9e8f04bd262357c4c7c6e1fbf6a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b58a9e8f04bd262357c4c7c6e1fbf6a1");
            return;
        }
        RecceViewBackgroundDrawable orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.setRadius(f, i);
        if (Build.VERSION.SDK_INT < 18) {
            int i2 = orCreateReactViewBackground.hasRoundedBorders() ? 1 : 2;
            if (i2 != getLayerType()) {
                setLayerType(i2, null);
            }
        }
    }

    public void setBorderStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fe542cfbe97d33c78c0759342252695", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fe542cfbe97d33c78c0759342252695");
        } else {
            getOrCreateReactViewBackground().setBorderStyle(str);
        }
    }

    public void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4bea774469b495badab9f97f30f5e4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4bea774469b495badab9f97f30f5e4a");
        } else if (z != this.mRemoveClippedSubviews) {
            this.mRemoveClippedSubviews = z;
            if (z) {
                this.mClippingRect = new Rect();
                z.a(this, this.mClippingRect);
                this.mAllChildrenCount = getChildCount();
                this.mAllChildren = new View[Math.max(12, this.mAllChildrenCount)];
                this.mChildrenLayoutChangeListener = new ChildrenLayoutChangeListener();
                for (int i = 0; i < this.mAllChildrenCount; i++) {
                    View childAt = getChildAt(i);
                    this.mAllChildren[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
                }
                updateClippingRect();
                return;
            }
            a.a(this.mClippingRect);
            a.a(this.mAllChildren);
            a.a(this.mChildrenLayoutChangeListener);
            for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            getDrawingRect(this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
            this.mAllChildren = null;
            this.mClippingRect = null;
            this.mAllChildrenCount = 0;
            this.mChildrenLayoutChangeListener = null;
        }
    }

    @Override // com.facebook.react.uimanager.y
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.y
    public void getClippingRect(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab901259c986f155c57e523dfc1f40df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab901259c986f155c57e523dfc1f40df");
        } else {
            rect.set(this.mClippingRect);
        }
    }

    @Override // com.facebook.react.uimanager.y
    public void updateClippingRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a46b3687c9a75c57d9e9c9d918c0067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a46b3687c9a75c57d9e9c9d918c0067");
        } else if (this.mRemoveClippedSubviews) {
            a.a(this.mClippingRect);
            a.a(this.mAllChildren);
            z.a(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    private void updateClippingToRect(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c41e36aea286ef5539082dec7f4fc852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c41e36aea286ef5539082dec7f4fc852");
            return;
        }
        a.a(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            updateSubviewClipStatus(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    private void updateSubviewClipStatus(Rect rect, int i, int i2) {
        boolean z = true;
        Object[] objArr = {rect, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25c694d3fb0792ef1c9881c3933751fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25c694d3fb0792ef1c9881c3933751fc");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View view = ((View[]) a.a(this.mAllChildren))[i];
        Rect rect2 = new Rect();
        rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = view.getAnimation();
        boolean z2 = (animation == null || animation.hasEnded()) ? false : true;
        if (!intersects && view.getParent() != null && !z2) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            super.addViewInLayout(view, i - i2, sDefaultLayoutParam, true);
            invalidate();
        } else if (!intersects) {
            z = false;
        }
        if (z && (view instanceof y)) {
            y yVar = (y) view;
            if (yVar.getRemoveClippedSubviews()) {
                yVar.updateClippingRect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubviewClipStatus(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da64f51241ff410d34ba611e66a1d18b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da64f51241ff410d34ba611e66a1d18b");
        } else if (this.mRemoveClippedSubviews && getParent() != null) {
            a.a(this.mClippingRect);
            a.a(this.mAllChildren);
            Rect rect = new Rect();
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (this.mClippingRect.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
                int i = 0;
                for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                    if (this.mAllChildren[i2] == view) {
                        updateSubviewClipStatus(this.mClippingRect, i2, i);
                        return;
                    }
                    if (this.mAllChildren[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        Object[] objArr = {view, rect, point};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdb999da67d672a766c6f9bc9de897ab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdb999da67d672a766c6f9bc9de897ab")).booleanValue() : com.facebook.react.config.a.g ? z.a(view, rect, point, this, this.mOverflow) : super.getChildVisibleRect(view, rect, point);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21232faf8702425f57381e252c149a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21232faf8702425f57381e252c149a86");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ccf189619d263ed5130e2cfc4484856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ccf189619d263ed5130e2cfc4484856");
            return;
        }
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2840a6cadc0bf82c81476ec25c3836a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2840a6cadc0bf82c81476ec25c3836a");
            return;
        }
        this.mDrawingOrderHelper.a(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a1f1e4406480bc583e97d18b5ea8b11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a1f1e4406480bc583e97d18b5ea8b11");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.mDrawingOrderHelper.b(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa6aa117282124172cb2eb28ea835378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa6aa117282124172cb2eb28ea835378");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.mDrawingOrderHelper.b(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09da5b2b13e38798e861ac73d045cac9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09da5b2b13e38798e861ac73d045cac9")).intValue();
        }
        int a = this.mDrawingOrderHelper.a(i, i2);
        return a >= i ? super.getChildDrawingOrder(i, i2) : a;
    }

    @Override // com.facebook.react.uimanager.ai
    public int getZIndexMappedChildIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11b955723608273142e7b4ddf09984cc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11b955723608273142e7b4ddf09984cc")).intValue() : this.mDrawingOrderHelper.a() ? this.mDrawingOrderHelper.a(getChildCount(), i) : i;
    }

    @Override // com.facebook.react.uimanager.ai
    public void updateDrawingOrder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "458bb31e897242a2f1e8eb40b206e0e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "458bb31e897242a2f1e8eb40b206e0e8");
            return;
        }
        this.mDrawingOrderHelper.b();
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ac
    public x getPointerEvents() {
        return this.mPointerEvents;
    }

    public void setPointerEvents(x xVar) {
        this.mPointerEvents = xVar;
    }

    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public View getChildAtWithSubviewClippingEnabled(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e46103d677a66f9d967374cf9b33fa7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e46103d677a66f9d967374cf9b33fa7") : ((View[]) a.a(this.mAllChildren))[i];
    }

    public void addViewWithSubviewClippingEnabled(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f7c4b8be9825b54fb9173cbce3ad345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f7c4b8be9825b54fb9173cbce3ad345");
        } else {
            addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
        }
    }

    public void addViewWithSubviewClippingEnabled(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c43c6f85aeba6e4c3720dadcbb7b2d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c43c6f85aeba6e4c3720dadcbb7b2d1");
            return;
        }
        a.a(this.mRemoveClippedSubviews);
        a.a(this.mClippingRect);
        a.a(this.mAllChildren);
        if (i < 0) {
            i = this.mAllChildrenCount;
        }
        addInArray(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.mAllChildren[i3].getParent() == null) {
                i2++;
            }
        }
        updateSubviewClipStatus(this.mClippingRect, i, i2);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    public void removeViewWithSubviewClippingEnabled(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63f3cbac5eeba386f661e03c9a8f7ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63f3cbac5eeba386f661e03c9a8f7ac1");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        a.a(this.mRemoveClippedSubviews);
        a.a(this.mClippingRect);
        a.a(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int indexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (this.mAllChildren[indexOfChildInAllChildren].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < indexOfChildInAllChildren; i2++) {
                if (this.mAllChildren[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(indexOfChildInAllChildren - i, 1);
        }
        removeFromArray(indexOfChildInAllChildren);
    }

    public void removeAllViewsWithSubviewClippingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ab466c3c7c794c7e3c0638afde81979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ab466c3c7c794c7e3c0638afde81979");
            return;
        }
        a.a(this.mRemoveClippedSubviews);
        a.a(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    private int indexOfChildInAllChildren(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c50d9cb0bb95d315ae1aadbdd4725f58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c50d9cb0bb95d315ae1aadbdd4725f58")).intValue();
        }
        int i = this.mAllChildrenCount;
        View[] viewArr = (View[]) a.a(this.mAllChildren);
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    private void addInArray(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a86693f453ab3968214e40d9f1c7b437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a86693f453ab3968214e40d9f1c7b437");
            return;
        }
        View[] viewArr = (View[]) a.a(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i == i2) {
            if (length == i2) {
                this.mAllChildren = new View[length + 12];
                System.arraycopy(viewArr, 0, this.mAllChildren, 0, length);
                viewArr = this.mAllChildren;
            }
            int i3 = this.mAllChildrenCount;
            this.mAllChildrenCount = i3 + 1;
            viewArr[i3] = view;
        } else if (i >= i2) {
            throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
        } else {
            if (length == i2) {
                this.mAllChildren = new View[length + 12];
                System.arraycopy(viewArr, 0, this.mAllChildren, 0, i);
                System.arraycopy(viewArr, i, this.mAllChildren, i + 1, i2 - i);
                viewArr = this.mAllChildren;
            } else {
                System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
            }
            viewArr[i] = view;
            this.mAllChildrenCount++;
        }
    }

    private void removeFromArray(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e4031a7c5833ed48d49dea1fe229236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e4031a7c5833ed48d49dea1fe229236");
            return;
        }
        View[] viewArr = (View[]) a.a(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        if (i == i2 - 1) {
            int i3 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i3;
            viewArr[i3] = null;
        } else if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(viewArr, i + 1, viewArr, i, (i2 - i) - 1);
            int i4 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i4;
            viewArr[i4] = null;
        }
    }

    @VisibleForTesting
    public int getBackgroundColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "007d3e30e294a36a269b7e8910a3fc8f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "007d3e30e294a36a269b7e8910a3fc8f")).intValue();
        }
        if (getBackground() != null) {
            return ((RecceViewBackgroundDrawable) getBackground()).getColor();
        }
        return 0;
    }

    private RecceViewBackgroundDrawable getOrCreateReactViewBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89bdf4db9c77bc7a0f23adae323fe816", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecceViewBackgroundDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89bdf4db9c77bc7a0f23adae323fe816");
        }
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new RecceViewBackgroundDrawable(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mReactBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                this.mLayoutDirection = com.facebook.react.modules.i18nmanager.a.a().a(getContext()) ? 1 : 0;
                this.mReactBackgroundDrawable.setResolvedLayoutDirection(this.mLayoutDirection);
            }
        }
        return this.mReactBackgroundDrawable;
    }

    @Override // com.facebook.react.touch.c
    @Nullable
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public void setHitSlopRect(@Nullable Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setOverflow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c68003217694e016bc4a8f7c16737709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c68003217694e016bc4a8f7c16737709");
            return;
        }
        this.mOverflow = str;
        invalidate();
    }

    @Nullable
    public String getOverflow() {
        return this.mOverflow;
    }

    public void updateBackgroundDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "507ea2a874c484678e9c1fa1b30eaa73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "507ea2a874c484678e9c1fa1b30eaa73");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6e8454546c3de77929d5e47b3e2d7cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6e8454546c3de77929d5e47b3e2d7cc");
            return;
        }
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            aj a = ak.a(this);
            if (a != null) {
                a.handleException(e);
            } else if (!(getContext() instanceof ReactContext)) {
                throw e;
            } else {
                ((ReactContext) getContext()).handleException(new i("StackOverflowException", this, e));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
        if (com.facebook.yoga.b.a(r6) == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dispatchOverflowDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.recce.views.view.RecceViewGroup.dispatchOverflowDraw(android.graphics.Canvas):void");
    }

    public void setOpacityIfPossible(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb80f16948d524ca077cf30a9d1aad10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb80f16948d524ca077cf30a9d1aad10");
            return;
        }
        this.mBackfaceOpacity = f;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibility(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b099c64ba23be89e37fd7d41cc467dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b099c64ba23be89e37fd7d41cc467dc");
            return;
        }
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab11ab1109e6bf01c5f24ad33e3fa69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab11ab1109e6bf01c5f24ad33e3fa69e");
        } else if (this.mBackfaceVisibility.equals("visible")) {
            setAlpha(this.mBackfaceOpacity);
        } else {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f) {
                z = true;
            }
            if (z) {
                setAlpha(this.mBackfaceOpacity);
            } else {
                setAlpha(0.0f);
            }
        }
    }

    @Override // com.meituan.android.recce.views.anim.RecceAnim
    public void start(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c7b35c4ed9b59441b8090564c52cf23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c7b35c4ed9b59441b8090564c52cf23");
        } else if (z) {
            getRecceAnimator().start();
        } else {
            getRecceAnimator().cancel();
        }
    }

    @Override // com.meituan.android.recce.views.anim.RecceAnim
    public void bindAnimData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4946490ffe1ab78c07e5d511314ce9f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4946490ffe1ab78c07e5d511314ce9f6");
        } else {
            getRecceAnimator().config(str);
        }
    }

    private RecceAnimator getRecceAnimator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85f7d734cbac77e4297efe8326c8c674", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecceAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85f7d734cbac77e4297efe8326c8c674");
        }
        if (this.recceAnimator == null) {
            this.recceAnimator = new RecceAnimator(this);
        }
        return this.recceAnimator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class ChildrenLayoutChangeListener implements View.OnLayoutChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final RecceViewGroup mParent;

        public ChildrenLayoutChangeListener(RecceViewGroup recceViewGroup) {
            Object[] objArr = {recceViewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c58afab977afc45f8a5cb55329d4fd8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c58afab977afc45f8a5cb55329d4fd8");
            } else {
                this.mParent = recceViewGroup;
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70f4fccf232e60aa995e80d1c5a9e994", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70f4fccf232e60aa995e80d1c5a9e994");
            } else if (this.mParent.getRemoveClippedSubviews()) {
                this.mParent.updateSubviewClipStatus(view);
            }
        }
    }
}
