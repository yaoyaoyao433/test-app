package com.dianping.picasso.view.gesturehandler;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoGestureDetector {
    private static final int DOUBLE_TAP_MIN_TIME = 40;
    private static final int LONG_PRESS = 2;
    private static final int SHOW_PRESS = 1;
    private static final int TAP = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private GestureHandler doubleTapGestureHandler;
    private GestureHandler longPressGestureHandler;
    private boolean mAlwaysInTapRegion;
    private MotionEvent mCurrentDownEvent;
    private boolean mDeferConfirmSingleTap;
    private int mDoubleTapSlopSquare;
    private float mDownFocusX;
    private float mDownFocusY;
    private boolean mFirstPanGestureState;
    private final Handler mHandler;
    private boolean mInLongPress;
    private boolean mInPanGestureState;
    private boolean mInPressGestureState;
    private boolean mIsLongPressEnabled;
    private float mLastFocusX;
    private float mLastFocusY;
    private MotionEvent mPreviousUpEvent;
    private boolean mStillDown;
    private int mTouchSlopSquare;
    private VelocityTracker mVelocityTracker;
    private GestureHandler panGestureHandler;
    private GestureHandler pressGestureHandler;
    private GestureHandler singleTapGestureHandler;
    private static final int LONG_PRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
    private static final int TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
    private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    private static final int mMaximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class MyGestureHandler extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        public MyGestureHandler() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a125bd0a9fe67972c33c0b0174976628", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a125bd0a9fe67972c33c0b0174976628");
                return;
            }
            switch (message.what) {
                case 1:
                    if (PicassoGestureDetector.this.pressGestureHandler != null) {
                        PicassoGestureDetector.this.pressGestureHandler.handle(PicassoGestureDetector.this.mCurrentDownEvent, 0);
                        PicassoGestureDetector.this.pressGestureHandler.handle(PicassoGestureDetector.this.mCurrentDownEvent, 1);
                    }
                    PicassoGestureDetector.this.mInPressGestureState = true;
                    return;
                case 2:
                    PicassoGestureDetector.this.mHandler.removeMessages(3);
                    PicassoGestureDetector.this.mDeferConfirmSingleTap = false;
                    PicassoGestureDetector.this.mInLongPress = true;
                    PicassoGestureDetector.this.mInPressGestureState = true;
                    if (PicassoGestureDetector.this.longPressGestureHandler != null) {
                        PicassoGestureDetector.this.longPressGestureHandler.handle(PicassoGestureDetector.this.mCurrentDownEvent, 0);
                        PicassoGestureDetector.this.longPressGestureHandler.handle(PicassoGestureDetector.this.mCurrentDownEvent, 1);
                        return;
                    }
                    return;
                case 3:
                    if (PicassoGestureDetector.this.singleTapGestureHandler != null) {
                        if (!PicassoGestureDetector.this.mStillDown) {
                            PicassoGestureDetector.this.singleTapGestureHandler.handle(PicassoGestureDetector.this.mCurrentDownEvent);
                            return;
                        } else {
                            PicassoGestureDetector.this.mDeferConfirmSingleTap = true;
                            return;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public PicassoGestureDetector(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22c4af4faf47ee476998eaaf624219a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22c4af4faf47ee476998eaaf624219a1");
            return;
        }
        this.mHandler = new MyGestureHandler();
        this.mFirstPanGestureState = true;
        this.mIsLongPressEnabled = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
        this.mDoubleTapSlopSquare = scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64b473dfc00cc359a25cd677b085c76d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64b473dfc00cc359a25cd677b085c76d")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = action & 255;
        if (i == 5) {
            cancelTaps();
        } else {
            switch (i) {
                case 0:
                    break;
                case 1:
                    this.mStillDown = false;
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    if (this.mInPressGestureState) {
                        this.mInPressGestureState = false;
                        if (this.pressGestureHandler != null) {
                            this.pressGestureHandler.handle(motionEvent, 2);
                        }
                        if (this.mInLongPress && this.longPressGestureHandler != null) {
                            this.longPressGestureHandler.handle(motionEvent, 2);
                        }
                    }
                    if (this.mInPanGestureState && this.panGestureHandler != null) {
                        this.panGestureHandler.handle(motionEvent, 2);
                    }
                    if (this.mInLongPress) {
                        this.mHandler.removeMessages(3);
                        this.mInLongPress = false;
                    } else if (this.mAlwaysInTapRegion && this.mDeferConfirmSingleTap && this.singleTapGestureHandler != null) {
                        this.singleTapGestureHandler.handle(motionEvent);
                    }
                    if (this.mPreviousUpEvent != null) {
                        this.mPreviousUpEvent.recycle();
                    }
                    this.mPreviousUpEvent = obtain;
                    if (this.mVelocityTracker != null) {
                        this.mVelocityTracker.recycle();
                        this.mVelocityTracker = null;
                    }
                    this.mDeferConfirmSingleTap = false;
                    this.mHandler.removeMessages(1);
                    this.mHandler.removeMessages(2);
                    return false;
                case 2:
                    if (this.mInLongPress) {
                        return false;
                    }
                    float f = rawX - this.mLastFocusX;
                    float f2 = rawY - this.mLastFocusY;
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (this.mAlwaysInTapRegion) {
                        int i2 = (int) (rawX - this.mDownFocusX);
                        int i3 = (int) (rawY - this.mDownFocusY);
                        if ((i2 * i2) + (i3 * i3) > this.mTouchSlopSquare) {
                            if (this.panGestureHandler != null) {
                                startPan(motionEvent);
                                z = this.panGestureHandler.handlePan(motionEvent, f, f2, xVelocity, yVelocity);
                                this.mInPanGestureState = true;
                            } else {
                                z = false;
                            }
                            this.mLastFocusX = rawX;
                            this.mLastFocusY = rawY;
                            this.mAlwaysInTapRegion = false;
                            this.mHandler.removeMessages(3);
                            this.mHandler.removeMessages(1);
                            this.mHandler.removeMessages(2);
                            break;
                        } else {
                            return false;
                        }
                    } else if (Math.abs(f) >= 1.0f || Math.abs(f2) >= 1.0f) {
                        if (this.panGestureHandler != null) {
                            startPan(motionEvent);
                            z2 = this.panGestureHandler.handlePan(motionEvent, f, f2, xVelocity, yVelocity);
                            this.mInPanGestureState = true;
                        }
                        this.mLastFocusX = rawX;
                        this.mLastFocusY = rawY;
                        return z2;
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    cancel();
                    return false;
                default:
                    return false;
            }
            return z;
        }
        boolean hasMessages = this.mHandler.hasMessages(3);
        if (hasMessages) {
            this.mHandler.removeMessages(3);
        }
        if (this.doubleTapGestureHandler != null && this.mCurrentDownEvent != null && this.mPreviousUpEvent != null && hasMessages && isConsideredDoubleTap(this.mCurrentDownEvent, this.mPreviousUpEvent, motionEvent)) {
            z = this.doubleTapGestureHandler.handle(this.mCurrentDownEvent) | false;
        } else {
            this.mHandler.sendEmptyMessageDelayed(3, this.doubleTapGestureHandler != null ? DOUBLE_TAP_TIMEOUT : 0L);
            z = false;
        }
        this.mLastFocusX = rawX;
        this.mDownFocusX = rawX;
        this.mLastFocusY = rawY;
        this.mDownFocusY = rawY;
        if (this.mCurrentDownEvent != null) {
            this.mCurrentDownEvent.recycle();
        }
        this.mCurrentDownEvent = MotionEvent.obtain(motionEvent);
        this.mAlwaysInTapRegion = true;
        this.mStillDown = true;
        this.mInLongPress = false;
        this.mInPressGestureState = false;
        this.mInPanGestureState = false;
        this.mDeferConfirmSingleTap = false;
        if (this.mIsLongPressEnabled) {
            this.mHandler.removeMessages(2);
            this.mHandler.sendEmptyMessageAtTime(2, this.mCurrentDownEvent.getDownTime() + LONG_PRESS_TIMEOUT);
        }
        this.mHandler.sendEmptyMessageAtTime(1, this.mCurrentDownEvent.getDownTime() + TAP_TIMEOUT);
        return z;
    }

    private void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8e170dbbbc6ecbf86dc5bfcab8d5ad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8e170dbbbc6ecbf86dc5bfcab8d5ad5");
            return;
        }
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(3);
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        this.mStillDown = false;
        this.mAlwaysInTapRegion = false;
        this.mDeferConfirmSingleTap = false;
        this.mInLongPress = false;
        this.mInPressGestureState = false;
        this.mInPanGestureState = false;
    }

    private void cancelTaps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bebe94a365c96492ee76d088bc4ce7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bebe94a365c96492ee76d088bc4ce7f");
            return;
        }
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(3);
        this.mAlwaysInTapRegion = false;
        this.mDeferConfirmSingleTap = false;
        this.mInLongPress = false;
        this.mInPressGestureState = false;
        this.mInPanGestureState = false;
    }

    private void startPan(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c280890afe228c160feac0ba998f7f1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c280890afe228c160feac0ba998f7f1f");
        } else if (!this.mFirstPanGestureState || this.panGestureHandler == null) {
        } else {
            this.panGestureHandler.handle(motionEvent, 0);
            this.mFirstPanGestureState = false;
        }
    }

    private boolean isConsideredDoubleTap(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
        Object[] objArr = {motionEvent, motionEvent2, motionEvent3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c85fdbdf53dbe3726b44c2df65770e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c85fdbdf53dbe3726b44c2df65770e7")).booleanValue();
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime > DOUBLE_TAP_TIMEOUT || eventTime < 40) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
        int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
        return (x * x) + (y * y) < this.mDoubleTapSlopSquare;
    }

    public void addPressGestureHandler(GestureHandler gestureHandler) {
        this.pressGestureHandler = gestureHandler;
    }

    public void addLongPressGestureHandler(GestureHandler gestureHandler) {
        this.longPressGestureHandler = gestureHandler;
    }

    public void addPanGestureHandler(GestureHandler gestureHandler) {
        this.panGestureHandler = gestureHandler;
    }

    public void addSingleTapGestureHandler(GestureHandler gestureHandler) {
        this.singleTapGestureHandler = gestureHandler;
    }

    public void addDoubleTapGestureHandler(GestureHandler gestureHandler) {
        this.doubleTapGestureHandler = gestureHandler;
    }

    public boolean needStartGestureDetector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2422a0858721676301dfdb77fa6e63f0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2422a0858721676301dfdb77fa6e63f0")).booleanValue() : (this.pressGestureHandler == null && this.longPressGestureHandler == null && this.panGestureHandler == null && this.singleTapGestureHandler == null && this.doubleTapGestureHandler == null) ? false : true;
    }
}
