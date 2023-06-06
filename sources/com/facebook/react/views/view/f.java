package com.facebook.react.views.view;

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
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.annotations.VisibleForTesting;
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
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f extends ViewGroup implements com.facebook.react.touch.c, com.facebook.react.touch.d, ac, ai, y {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    @Nullable
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    @Nullable
    private a mChildrenLayoutChangeListener;
    @Nullable
    private Rect mClippingRect;
    private final ba mDrawingOrderHelper;
    @Nullable
    private Rect mHitSlopRect;
    private int mLayoutDirection;
    private boolean mNeedsOffscreenAlphaCompositing;
    @Nullable
    private com.facebook.react.touch.b mOnInterceptTouchEventListener;
    @Nullable
    private String mOverflow;
    @Nullable
    private Path mPath;
    private x mPointerEvents;
    @Nullable
    private d mReactBackgroundDrawable;
    private boolean mRemoveClippedSubviews;

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a implements View.OnLayoutChangeListener {
        private final f a;

        private a(f fVar) {
            this.a = fVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.a.getRemoveClippedSubviews()) {
                this.a.updateSubviewClipStatus(view);
            }
        }
    }

    public f(Context context) {
        super(context);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mPointerEvents = x.AUTO;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
        setClipChildren(false);
        this.mDrawingOrderHelper = new ba(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        q.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT < 17 || this.mReactBackgroundDrawable == null) {
            return;
        }
        this.mReactBackgroundDrawable.b(this.mLayoutDirection);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        super.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (i == 0 && this.mReactBackgroundDrawable == null) {
            return;
        }
        getOrCreateReactViewBackground().a(i);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    public void setTranslucentBackgroundDrawable(@Nullable Drawable drawable) {
        updateBackgroundDrawable(null);
        if (this.mReactBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    @Override // com.facebook.react.touch.d
    public void setOnInterceptTouchEventListener(com.facebook.react.touch.b bVar) {
        this.mOnInterceptTouchEventListener = bVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((this.mOnInterceptTouchEventListener != null && this.mOnInterceptTouchEventListener.a(this, motionEvent)) || this.mPointerEvents == x.NONE || this.mPointerEvents == x.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.mPointerEvents == x.NONE || this.mPointerEvents == x.BOX_NONE) ? false : true;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    public void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().a(i, f);
    }

    public void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().a(i, f, f2);
    }

    public void setBorderRadius(float f) {
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.a(f);
        if (Build.VERSION.SDK_INT < 18) {
            int i = orCreateReactViewBackground.a() ? 1 : 2;
            if (i != getLayerType()) {
                setLayerType(i, null);
            }
        }
    }

    public void setBorderRadius(float f, int i) {
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.a(f, i);
        if (Build.VERSION.SDK_INT < 18) {
            int i2 = orCreateReactViewBackground.a() ? 1 : 2;
            if (i2 != getLayerType()) {
                setLayerType(i2, null);
            }
        }
    }

    public void setBorderStyle(@Nullable String str) {
        getOrCreateReactViewBackground().a(str);
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z;
        if (z) {
            this.mClippingRect = new Rect();
            z.a(this, this.mClippingRect);
            this.mAllChildrenCount = getChildCount();
            this.mAllChildren = new View[Math.max(12, this.mAllChildrenCount)];
            this.mChildrenLayoutChangeListener = new a();
            for (int i = 0; i < this.mAllChildrenCount; i++) {
                View childAt = getChildAt(i);
                this.mAllChildren[i] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        com.facebook.infer.annotation.a.a(this.mClippingRect);
        com.facebook.infer.annotation.a.a(this.mAllChildren);
        com.facebook.infer.annotation.a.a(this.mChildrenLayoutChangeListener);
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

    @Override // com.facebook.react.uimanager.y
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.y
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // com.facebook.react.uimanager.y
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            com.facebook.infer.annotation.a.a(this.mClippingRect);
            com.facebook.infer.annotation.a.a(this.mAllChildren);
            z.a(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    private void updateClippingToRect(Rect rect) {
        com.facebook.infer.annotation.a.a(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            updateSubviewClipStatus(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    private void updateSubviewClipStatus(Rect rect, int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        View view = ((View[]) com.facebook.infer.annotation.a.a(this.mAllChildren))[i];
        Rect rect2 = new Rect();
        rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = view.getAnimation();
        boolean z = true;
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
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        com.facebook.infer.annotation.a.a(this.mClippingRect);
        com.facebook.infer.annotation.a.a(this.mAllChildren);
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

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        if (com.facebook.react.config.a.g) {
            return z.a(view, rect, point, this, this.mOverflow);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.mDrawingOrderHelper.a(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.mDrawingOrderHelper.b(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        this.mDrawingOrderHelper.b(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int a2 = this.mDrawingOrderHelper.a(i, i2);
        if (a2 >= i) {
            com.facebook.common.logging.a.c("[ReactViewGroup@getChildDrawingOrder]", "getChildDrawingOrder:" + i + StringUtil.SPACE + i2);
            return super.getChildDrawingOrder(i, i2);
        }
        return a2;
    }

    @Override // com.facebook.react.uimanager.ai
    public int getZIndexMappedChildIndex(int i) {
        return this.mDrawingOrderHelper.a() ? this.mDrawingOrderHelper.a(getChildCount(), i) : i;
    }

    @Override // com.facebook.react.uimanager.ai
    public void updateDrawingOrder() {
        this.mDrawingOrderHelper.b();
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.a());
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ac
    public x getPointerEvents() {
        return this.mPointerEvents;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPointerEvents(x xVar) {
        this.mPointerEvents = xVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View getChildAtWithSubviewClippingEnabled(int i) {
        return ((View[]) com.facebook.infer.annotation.a.a(this.mAllChildren))[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addViewWithSubviewClippingEnabled(View view, int i) {
        addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
    }

    void addViewWithSubviewClippingEnabled(View view, int i, ViewGroup.LayoutParams layoutParams) {
        com.facebook.infer.annotation.a.a(this.mRemoveClippedSubviews);
        com.facebook.infer.annotation.a.a(this.mClippingRect);
        com.facebook.infer.annotation.a.a(this.mAllChildren);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        com.facebook.infer.annotation.a.a(this.mRemoveClippedSubviews);
        com.facebook.infer.annotation.a.a(this.mClippingRect);
        com.facebook.infer.annotation.a.a(this.mAllChildren);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAllViewsWithSubviewClippingEnabled() {
        com.facebook.infer.annotation.a.a(this.mRemoveClippedSubviews);
        com.facebook.infer.annotation.a.a(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    private int indexOfChildInAllChildren(View view) {
        int i = this.mAllChildrenCount;
        View[] viewArr = (View[]) com.facebook.infer.annotation.a.a(this.mAllChildren);
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    private void addInArray(View view, int i) {
        View[] viewArr = (View[]) com.facebook.infer.annotation.a.a(this.mAllChildren);
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
        } else if (i < i2) {
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
        } else {
            throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
        }
    }

    private void removeFromArray(int i) {
        View[] viewArr = (View[]) com.facebook.infer.annotation.a.a(this.mAllChildren);
        int i2 = this.mAllChildrenCount;
        if (i == i2 - 1) {
            int i3 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i3;
            viewArr[i3] = null;
        } else if (i >= 0 && i < i2) {
            System.arraycopy(viewArr, i + 1, viewArr, i, (i2 - i) - 1);
            int i4 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i4;
            viewArr[i4] = null;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @VisibleForTesting
    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((d) getBackground()).a;
        }
        return 0;
    }

    private d getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new d(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mReactBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                this.mLayoutDirection = com.facebook.react.modules.i18nmanager.a.a().a(getContext()) ? 1 : 0;
                this.mReactBackgroundDrawable.b(this.mLayoutDirection);
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
        this.mOverflow = str;
        invalidate();
    }

    @Nullable
    public String getOverflow() {
        return this.mOverflow;
    }

    private void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            aj a2 = ak.a(this);
            if (a2 != null) {
                a2.handleException(e);
            } else if (getContext() instanceof ReactContext) {
                ((ReactContext) getContext()).handleException(new i("StackOverflowException", this, e));
            } else {
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x014a, code lost:
        if (com.facebook.yoga.b.a(r10) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dispatchOverflowDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.f.dispatchOverflowDraw(android.graphics.Canvas):void");
    }

    public void setOpacityIfPossible(float f) {
        this.mBackfaceOpacity = f;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals("visible")) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f) {
            setAlpha(this.mBackfaceOpacity);
        } else {
            setAlpha(0.0f);
        }
    }
}
