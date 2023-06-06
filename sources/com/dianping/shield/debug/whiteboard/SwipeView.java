package com.dianping.shield.debug.whiteboard;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SwipeView extends LinearLayout {
    private static final String STATE_FLING_LEFT = "state_fling_left";
    private static final String STATE_FLING_RIGHT = "state_fling_right";
    private static final String STATE_SCROLL = "state_scroll";
    private static final String STATE_SINGLETAPUP = "state_singleTapUp";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static SwipeView swipeView;
    private boolean haveShowRight;
    private GestureDetector.OnGestureListener mGesListener;
    private GestureDetector mGestureDetector;
    private int mHiddenWidth;
    private int mMoveWidth;
    private Scroller mScroller;
    private int mTouchSlop;
    private String state;

    public SwipeView(Context context) {
        super(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df48b73e8a9e979c087a81d0e9d2dad3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df48b73e8a9e979c087a81d0e9d2dad3");
            return;
        }
        this.state = "";
        this.haveShowRight = false;
        this.mMoveWidth = 0;
        this.mHiddenWidth = 0;
        this.mGesListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.dianping.shield.debug.whiteboard.SwipeView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1dc7b093ee162189394b66243d1326b6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1dc7b093ee162189394b66243d1326b6")).booleanValue();
                }
                SwipeView.this.getParent().requestDisallowInterceptTouchEvent(true);
                SwipeView.this.state = SwipeView.STATE_SCROLL;
                SwipeView.this.actionMove(((int) (motionEvent2.getX() - motionEvent.getX())) / 10, 0);
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                int i;
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f79df2d14a0103c29505b0ebb1ffbbc5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f79df2d14a0103c29505b0ebb1ffbbc5")).booleanValue();
                }
                SwipeView.this.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent2.getX() - motionEvent.getX() < 0.0f) {
                    SwipeView.this.state = SwipeView.STATE_FLING_LEFT;
                    i = -SwipeView.this.mHiddenWidth;
                } else {
                    SwipeView.this.state = SwipeView.STATE_FLING_RIGHT;
                    i = SwipeView.this.mHiddenWidth;
                }
                SwipeView.this.actionMove(i, 0);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9ed264c9a1546cc9a874b922bdc5bba5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9ed264c9a1546cc9a874b922bdc5bba5");
                } else {
                    super.onLongPress(motionEvent);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ca76c67222ec7644e1a77a041b9fa11b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ca76c67222ec7644e1a77a041b9fa11b")).booleanValue();
                }
                SwipeView.this.state = SwipeView.STATE_SINGLETAPUP;
                return false;
            }
        };
        initView(context);
    }

    public SwipeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cf1c742925cb16d46a4971b519c1b3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cf1c742925cb16d46a4971b519c1b3f");
            return;
        }
        this.state = "";
        this.haveShowRight = false;
        this.mMoveWidth = 0;
        this.mHiddenWidth = 0;
        this.mGesListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.dianping.shield.debug.whiteboard.SwipeView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1dc7b093ee162189394b66243d1326b6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1dc7b093ee162189394b66243d1326b6")).booleanValue();
                }
                SwipeView.this.getParent().requestDisallowInterceptTouchEvent(true);
                SwipeView.this.state = SwipeView.STATE_SCROLL;
                SwipeView.this.actionMove(((int) (motionEvent2.getX() - motionEvent.getX())) / 10, 0);
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                int i;
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f79df2d14a0103c29505b0ebb1ffbbc5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f79df2d14a0103c29505b0ebb1ffbbc5")).booleanValue();
                }
                SwipeView.this.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent2.getX() - motionEvent.getX() < 0.0f) {
                    SwipeView.this.state = SwipeView.STATE_FLING_LEFT;
                    i = -SwipeView.this.mHiddenWidth;
                } else {
                    SwipeView.this.state = SwipeView.STATE_FLING_RIGHT;
                    i = SwipeView.this.mHiddenWidth;
                }
                SwipeView.this.actionMove(i, 0);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9ed264c9a1546cc9a874b922bdc5bba5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9ed264c9a1546cc9a874b922bdc5bba5");
                } else {
                    super.onLongPress(motionEvent);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ca76c67222ec7644e1a77a041b9fa11b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ca76c67222ec7644e1a77a041b9fa11b")).booleanValue();
                }
                SwipeView.this.state = SwipeView.STATE_SINGLETAPUP;
                return false;
            }
        };
        initView(context);
    }

    public SwipeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96bbe2850cdc2bbcc9f46b4b77a5ac9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96bbe2850cdc2bbcc9f46b4b77a5ac9a");
            return;
        }
        this.state = "";
        this.haveShowRight = false;
        this.mMoveWidth = 0;
        this.mHiddenWidth = 0;
        this.mGesListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.dianping.shield.debug.whiteboard.SwipeView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1dc7b093ee162189394b66243d1326b6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1dc7b093ee162189394b66243d1326b6")).booleanValue();
                }
                SwipeView.this.getParent().requestDisallowInterceptTouchEvent(true);
                SwipeView.this.state = SwipeView.STATE_SCROLL;
                SwipeView.this.actionMove(((int) (motionEvent2.getX() - motionEvent.getX())) / 10, 0);
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                int i2;
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f79df2d14a0103c29505b0ebb1ffbbc5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f79df2d14a0103c29505b0ebb1ffbbc5")).booleanValue();
                }
                SwipeView.this.getParent().requestDisallowInterceptTouchEvent(true);
                if (motionEvent2.getX() - motionEvent.getX() < 0.0f) {
                    SwipeView.this.state = SwipeView.STATE_FLING_LEFT;
                    i2 = -SwipeView.this.mHiddenWidth;
                } else {
                    SwipeView.this.state = SwipeView.STATE_FLING_RIGHT;
                    i2 = SwipeView.this.mHiddenWidth;
                }
                SwipeView.this.actionMove(i2, 0);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9ed264c9a1546cc9a874b922bdc5bba5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9ed264c9a1546cc9a874b922bdc5bba5");
                } else {
                    super.onLongPress(motionEvent);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ca76c67222ec7644e1a77a041b9fa11b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ca76c67222ec7644e1a77a041b9fa11b")).booleanValue();
                }
                SwipeView.this.state = SwipeView.STATE_SINGLETAPUP;
                return false;
            }
        };
        initView(context);
    }

    private void initView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d586577ce5a379236535e9244515e1e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d586577ce5a379236535e9244515e1e9");
            return;
        }
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mScroller = new Scroller(context, new LinearInterpolator(context, null));
        this.mGestureDetector = new GestureDetector(context, this.mGesListener);
        this.mGestureDetector.setIsLongpressEnabled(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c484f49852695d494b5270d0168d94c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c484f49852695d494b5270d0168d94c")).booleanValue();
        }
        this.mGestureDetector.onTouchEvent(motionEvent);
        return !this.state.equals(STATE_SINGLETAPUP);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a80bc95290db21d444ea9fdaa26d495c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a80bc95290db21d444ea9fdaa26d495c")).booleanValue();
        }
        this.mGestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            if (this.state.equals(STATE_SINGLETAPUP)) {
                return false;
            }
            if (this.state.equals(STATE_SCROLL)) {
                i = getScrollX();
            } else if (this.state.equals(STATE_FLING_LEFT)) {
                i = this.mHiddenWidth;
            }
            actionUp(i);
            this.state = "";
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void actionMove(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e06dc6f8704f74a0b662d52a3795acaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e06dc6f8704f74a0b662d52a3795acaf");
        } else if (swipeView != null && swipeView != this && this.haveShowRight) {
            closeMenu();
        } else if (i < 0 && Math.abs(i2) < this.mTouchSlop / 10) {
            int abs = Math.abs(i);
            if (this.mMoveWidth >= this.mHiddenWidth) {
                abs = 0;
            } else if (this.mMoveWidth + abs > this.mHiddenWidth) {
                abs = this.mHiddenWidth - this.mMoveWidth;
            }
            smoothScrollBy(abs, 0, 0);
            this.mMoveWidth += abs;
        } else if (i > 0) {
            int abs2 = Math.abs(i);
            if (this.mMoveWidth <= 0) {
                abs2 = 0;
            } else if (this.mMoveWidth - abs2 < 0) {
                abs2 = this.mMoveWidth;
            }
            smoothScrollBy(0 - abs2, 0, 0);
            this.mMoveWidth -= abs2;
        }
    }

    private void actionUp(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed1e1cc81882da0d8e90e99212796212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed1e1cc81882da0d8e90e99212796212");
            return;
        }
        if (swipeView != null && swipeView != this) {
            closeMenu();
        }
        if (this.mHiddenWidth >= this.mMoveWidth) {
            int i2 = this.mHiddenWidth - this.mMoveWidth;
            if (i > this.mHiddenWidth / 2) {
                smoothScrollBy(i2, 0, 100);
                this.mMoveWidth = this.mHiddenWidth;
                this.haveShowRight = true;
                swipeView = this;
                return;
            }
            smoothScrollBy(0 - this.mMoveWidth, 0, 100);
            this.mMoveWidth = 0;
            this.haveShowRight = false;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23812fbb76b7887ecb48bb99c7e73ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23812fbb76b7887ecb48bb99c7e73ee9");
            return;
        }
        if (this.mScroller.computeScrollOffset()) {
            scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54b5dbeb27503a2f731ad720e8b65562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54b5dbeb27503a2f731ad720e8b65562");
        } else {
            smoothScrollBy(i - this.mScroller.getFinalX(), i2 - this.mScroller.getFinalY(), i3);
        }
    }

    public void smoothScrollBy(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a53c49ef3ef26d8a07e0887ef8c5dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a53c49ef3ef26d8a07e0887ef8c5dc7");
            return;
        }
        this.mScroller.startScroll(this.mScroller.getFinalX(), this.mScroller.getFinalY(), i, i2, i3);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cf495cea74d775487bf52a1ad5240c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cf495cea74d775487bf52a1ad5240c6");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mHiddenWidth == 0) {
            this.mHiddenWidth = getChildAt(1).getMeasuredWidth();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9436d9253bf4d0022ed62b11c2cfd68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9436d9253bf4d0022ed62b11c2cfd68");
            return;
        }
        super.onDetachedFromWindow();
        if (swipeView != null) {
            swipeView.closeMenu();
            swipeView = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dd7006b0fe66aa8b8f1ba4894d5ab8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dd7006b0fe66aa8b8f1ba4894d5ab8b");
            return;
        }
        super.onAttachedToWindow();
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    public void closeMenu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa005a9bce11bcae3150393c5950ddc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa005a9bce11bcae3150393c5950ddc1");
        } else {
            swipeView.closeMenus();
        }
    }

    public void closeMenus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28fa708268b09bbf4852bd0e03dba620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28fa708268b09bbf4852bd0e03dba620");
            return;
        }
        smoothScrollTo(0, this.mScroller.getFinalY(), 200);
        this.mMoveWidth = 0;
        this.haveShowRight = false;
    }
}
