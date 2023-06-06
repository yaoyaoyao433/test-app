package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.liteav.q;
import com.tencent.liteav.renderer.TXCFocusIndicatorView;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCloudVideoView extends FrameLayout implements View.OnTouchListener {
    private static final int FOCUS_AREA_SIZE_DP = 70;
    private static final String TAG = "TXCloudVideoView";
    private float mBottom;
    private q mCapture;
    private int mCaptureHeight;
    private int mCaptureWidth;
    private int mCurrentScale;
    protected TXDashBoard mDashBoard;
    private boolean mFocus;
    private int mFocusAreaSize;
    protected TXCFocusIndicatorView mFocusIndicatorView;
    protected TXCGLSurfaceView mGLSurfaceView;
    private float mLeft;
    private float mRight;
    private ScaleGestureDetector mScaleGestureDetector;
    private ScaleGestureDetector.OnScaleGestureListener mScaleGestureListener;
    protected SurfaceView mSurfaceView;
    private float mTop;
    private a mTouchFocusRunnable;
    private String mUserId;
    protected TextureView mVideoView;
    private boolean mZoom;

    private int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void setMirror(boolean z) {
    }

    public void setRenderMode(int i) {
    }

    public void setRenderRotation(int i) {
    }

    public TXCloudVideoView(Context context) {
        this(context, null);
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCaptureWidth = 0;
        this.mCaptureHeight = 0;
        this.mLeft = 0.0f;
        this.mRight = 0.0f;
        this.mTop = 0.0f;
        this.mBottom = 0.0f;
        this.mFocusAreaSize = 0;
        this.mUserId = "";
        this.mFocus = false;
        this.mZoom = false;
        this.mCurrentScale = 1;
        this.mScaleGestureDetector = null;
        this.mScaleGestureListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.2
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                int e = TXCloudVideoView.this.mCapture != null ? TXCloudVideoView.this.mCapture.e() : 0;
                if (e > 0) {
                    float scaleFactor = scaleGestureDetector.getScaleFactor();
                    if (scaleFactor > 1.0f) {
                        scaleFactor = ((0.2f / e) * (e - TXCloudVideoView.this.mCurrentScale)) + 1.0f;
                        if (scaleFactor <= 1.1f) {
                            scaleFactor = 1.1f;
                        }
                    } else if (scaleFactor < 1.0f) {
                        scaleFactor = 1.0f - ((0.2f / e) * TXCloudVideoView.this.mCurrentScale);
                        if (scaleFactor >= 0.9f) {
                            scaleFactor = 0.9f;
                        }
                    }
                    int round = Math.round(TXCloudVideoView.this.mCurrentScale * scaleFactor);
                    if (round == TXCloudVideoView.this.mCurrentScale) {
                        if (scaleFactor > 1.0f) {
                            round++;
                        } else if (scaleFactor < 1.0f) {
                            round--;
                        }
                    }
                    if (round < e) {
                        e = round;
                    }
                    if (e <= 1) {
                        e = 1;
                    }
                    if (scaleFactor > 1.0f) {
                        if (e < TXCloudVideoView.this.mCurrentScale) {
                            e = TXCloudVideoView.this.mCurrentScale;
                        }
                    } else if (scaleFactor < 1.0f && e > TXCloudVideoView.this.mCurrentScale) {
                        e = TXCloudVideoView.this.mCurrentScale;
                    }
                    TXCloudVideoView.this.mCurrentScale = e;
                    if (TXCloudVideoView.this.mCapture != null) {
                        TXCloudVideoView.this.mCapture.a(TXCloudVideoView.this.mCurrentScale);
                    }
                }
                return false;
            }
        };
        this.mTouchFocusRunnable = new a();
        this.mDashBoard = new TXDashBoard(context);
        this.mScaleGestureDetector = new ScaleGestureDetector(context, this.mScaleGestureListener);
    }

    public TXCloudVideoView(SurfaceView surfaceView) {
        this(surfaceView.getContext(), null);
        this.mSurfaceView = surfaceView;
    }

    public void addVideoView(TXCGLSurfaceView tXCGLSurfaceView) {
        if (this.mGLSurfaceView != null) {
            removeView(this.mGLSurfaceView);
        }
        this.mGLSurfaceView = tXCGLSurfaceView;
        addView(this.mGLSurfaceView);
        resetLogView();
    }

    public void addVideoView(TextureView textureView) {
        if (this.mVideoView != null) {
            removeView(this.mVideoView);
        }
        this.mVideoView = textureView;
        addView(this.mVideoView);
        resetLogView();
    }

    public void removeVideoView() {
        if (this.mVideoView != null) {
            removeView(this.mVideoView);
            this.mVideoView = null;
        }
        if (this.mGLSurfaceView != null) {
            removeView(this.mGLSurfaceView);
            this.mGLSurfaceView = null;
        }
        this.mSurfaceView = null;
    }

    public void removeFocusIndicatorView() {
        if (this.mFocusIndicatorView != null) {
            removeView(this.mFocusIndicatorView);
            this.mFocusIndicatorView = null;
        }
    }

    public TextureView getVideoView() {
        return this.mVideoView;
    }

    public TXCGLSurfaceView getGLSurfaceView() {
        return this.mGLSurfaceView;
    }

    public SurfaceView getSurfaceView() {
        return this.mSurfaceView;
    }

    public TextureView getHWVideoView() {
        return this.mVideoView;
    }

    public void clearLastFrame(boolean z) {
        if (z) {
            setVisibility(8);
        }
    }

    public void onTouchFocus(int i, int i2) {
        if (this.mGLSurfaceView == null) {
            return;
        }
        if (i < 0 || i2 < 0) {
            if (this.mFocusIndicatorView != null) {
                this.mFocusIndicatorView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.mFocusIndicatorView == null) {
            this.mFocusIndicatorView = new TXCFocusIndicatorView(getContext());
            this.mFocusIndicatorView.setVisibility(0);
            addView(this.mFocusIndicatorView);
        } else if (indexOfChild(this.mFocusIndicatorView) != getChildCount() - 1) {
            removeView(this.mFocusIndicatorView);
            addView(this.mFocusIndicatorView);
        }
        Rect touchRect = getTouchRect(i, i2, this.mGLSurfaceView.getWidth(), this.mGLSurfaceView.getHeight(), 1.0f);
        this.mFocusIndicatorView.show(touchRect.left, touchRect.top, touchRect.right - touchRect.left);
    }

    private Rect getTouchRect(int i, int i2, int i3, int i4, float f) {
        if (this.mFocusAreaSize == 0 && this.mGLSurfaceView != null) {
            this.mFocusAreaSize = (int) ((this.mGLSurfaceView.getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
        }
        int intValue = Float.valueOf(this.mFocusAreaSize * f).intValue();
        int i5 = intValue / 2;
        int clamp = clamp(i - i5, 0, i3 - intValue);
        int clamp2 = clamp(i2 - i5, 0, i4 - intValue);
        return new Rect(clamp, clamp2, clamp + intValue, intValue + clamp2);
    }

    public void disableLog(boolean z) {
        if (this.mDashBoard != null) {
            this.mDashBoard.a(z);
        }
    }

    public void showLog(boolean z) {
        if (this.mDashBoard != null) {
            this.mDashBoard.setShowLevel(z ? 2 : 0);
        }
    }

    public void clearLog() {
        if (this.mDashBoard != null) {
            this.mDashBoard.a();
        }
    }

    public void setLogText(Bundle bundle, Bundle bundle2, int i) {
        if (this.mDashBoard != null) {
            this.mDashBoard.a(bundle, bundle2, i);
        }
    }

    protected void resetLogView() {
        if (this.mDashBoard != null) {
            removeView(this.mDashBoard);
            addView(this.mDashBoard);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateDbMargin();
        if (this.mDashBoard != null) {
            this.mDashBoard.setStatusTextSize((float) (px2dip(getContext(), getWidth()) / 30.0d));
            this.mDashBoard.setEventTextSize((float) (px2dip(getContext(), getWidth()) / 25.0d));
        }
        if (this.mCaptureWidth == 0 || this.mCaptureHeight == 0) {
            return;
        }
        updateVideoViewSize(this.mCaptureWidth, this.mCaptureHeight);
    }

    public void updateVideoViewSize(int i, int i2) {
        View view;
        int width;
        FrameLayout.LayoutParams layoutParams;
        if (this.mGLSurfaceView != null) {
            view = this.mGLSurfaceView;
        } else if (this.mVideoView == null) {
            return;
        } else {
            view = this.mVideoView;
        }
        int width2 = getWidth();
        int height = getHeight();
        if (i2 == 0 || height == 0) {
            return;
        }
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
        float f = (i * 1.0f) / i2;
        float f2 = width2;
        float f3 = height;
        int i3 = 0;
        if (f > (1.0f * f2) / f3) {
            height = (int) (f2 / f);
            i3 = (getHeight() - height) / 2;
            width = 0;
        } else {
            width2 = (int) (f3 * f);
            width = (getWidth() - width2) / 2;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            if (layoutParams.width == width2 && layoutParams.height == height) {
                return;
            }
            layoutParams.width = width2;
            layoutParams.height = height;
        } else {
            layoutParams = new FrameLayout.LayoutParams(width2, height);
        }
        layoutParams.leftMargin = width;
        layoutParams.topMargin = i3;
        view.setLayoutParams(layoutParams);
    }

    public void setDashBoardStatusInfo(CharSequence charSequence) {
        if (this.mDashBoard != null) {
            this.mDashBoard.a(charSequence);
        }
    }

    public void appendEventInfo(String str) {
        if (this.mDashBoard != null) {
            this.mDashBoard.a(str);
        }
    }

    public void showVideoDebugLog(int i) {
        if (this.mDashBoard != null) {
            this.mDashBoard.setShowLevel(i);
        }
    }

    public void setLogMargin(float f, float f2, float f3, float f4) {
        this.mLeft = f;
        this.mRight = f2;
        this.mTop = f3;
        this.mBottom = f4;
        if (this.mDashBoard != null) {
            this.mDashBoard.a((int) this.mLeft, (int) this.mTop, (int) this.mRight, (int) this.mBottom);
        }
    }

    public void setLogMarginRatio(final float f, final float f2, final float f3, final float f4) {
        getWidth();
        getHeight();
        postDelayed(new Runnable() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView.this.mLeft = TXCloudVideoView.this.getWidth() * f;
                TXCloudVideoView.this.mRight = TXCloudVideoView.this.getWidth() * f2;
                TXCloudVideoView.this.mTop = TXCloudVideoView.this.getHeight() * f3;
                TXCloudVideoView.this.mBottom = TXCloudVideoView.this.getHeight() * f4;
                if (TXCloudVideoView.this.mDashBoard != null) {
                    TXCloudVideoView.this.mDashBoard.a((int) TXCloudVideoView.this.mLeft, (int) TXCloudVideoView.this.mTop, (int) TXCloudVideoView.this.mRight, (int) TXCloudVideoView.this.mBottom);
                }
            }
        }, 100L);
    }

    public String getUserId() {
        return this.mUserId;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void updateDbMargin() {
        if (this.mDashBoard != null) {
            this.mDashBoard.a((int) this.mLeft, (int) this.mTop, (int) this.mRight, (int) this.mBottom);
        }
    }

    public void start(boolean z, boolean z2, q qVar) {
        this.mFocus = z;
        this.mZoom = z2;
        if (this.mFocus || this.mZoom) {
            setOnTouchListener(this);
            this.mCapture = qVar;
        }
        if (this.mGLSurfaceView != null) {
            this.mGLSurfaceView.setVisibility(0);
        }
    }

    public void stop(boolean z) {
        if (this.mFocus || this.mZoom) {
            setOnTouchListener(null);
        }
        this.mCapture = null;
        if (!z || this.mGLSurfaceView == null) {
            return;
        }
        this.mGLSurfaceView.setVisibility(8);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            this.mTouchFocusRunnable.a(view);
            this.mTouchFocusRunnable.a(motionEvent);
            postDelayed(this.mTouchFocusRunnable, 100L);
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2) {
            removeCallbacks(this.mTouchFocusRunnable);
            onTouchFocus(-1, -1);
            if (this.mScaleGestureDetector != null && this.mZoom) {
                this.mScaleGestureDetector.onTouchEvent(motionEvent);
            }
        }
        if (this.mZoom && motionEvent.getAction() == 0) {
            performClick();
        }
        return this.mZoom;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        private View b;
        private MotionEvent c;

        private a() {
        }

        public void a(View view) {
            this.b = view;
        }

        public void a(MotionEvent motionEvent) {
            this.c = motionEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TXCloudVideoView.this.mCapture != null && TXCloudVideoView.this.mFocus) {
                TXCloudVideoView.this.mCapture.a(this.c.getX() / this.b.getWidth(), this.c.getY() / this.b.getHeight());
            }
            if (TXCloudVideoView.this.mFocus) {
                TXCloudVideoView.this.onTouchFocus((int) this.c.getX(), (int) this.c.getY());
            }
        }
    }
}
