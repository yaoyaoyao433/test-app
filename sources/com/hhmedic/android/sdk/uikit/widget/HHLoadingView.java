package com.hhmedic.android.sdk.uikit.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.hhmedic.android.sdk.uikit.utils.HHDisplayHelper;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHLoadingView extends View {
    private static final int DEGREE_PER_LINE = 30;
    private static final int LINE_COUNT = 12;
    private int mAnimateValue;
    private ValueAnimator mAnimator;
    private Paint mPaint;
    private int mPaintColor;
    private int mSize;
    private final ValueAnimator.AnimatorUpdateListener mUpdateListener;

    public HHLoadingView(Context context) {
        this(context, null);
    }

    public HHLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (int) R.attr.HHUILoadingStyle);
    }

    public HHLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAnimateValue = 0;
        this.mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.hhmedic.android.sdk.uikit.widget.HHLoadingView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                HHLoadingView.this.mAnimateValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                HHLoadingView.this.invalidate();
            }
        };
        this.mSize = HHDisplayHelper.dp2px(context, 32);
        this.mPaintColor = -1;
        initPaint();
    }

    public HHLoadingView(Context context, int i, int i2) {
        super(context);
        this.mAnimateValue = 0;
        this.mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.hhmedic.android.sdk.uikit.widget.HHLoadingView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                HHLoadingView.this.mAnimateValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                HHLoadingView.this.invalidate();
            }
        };
        this.mSize = i;
        this.mPaintColor = i2;
        initPaint();
    }

    private void initPaint() {
        this.mPaint = new Paint();
        this.mPaint.setColor(this.mPaintColor);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    public void setColor(int i) {
        this.mPaintColor = i;
        this.mPaint.setColor(i);
        invalidate();
    }

    public void setSize(int i) {
        this.mSize = i;
        requestLayout();
    }

    public void start() {
        if (this.mAnimator == null) {
            this.mAnimator = ValueAnimator.ofInt(0, 11);
            this.mAnimator.addUpdateListener(this.mUpdateListener);
            this.mAnimator.setDuration(600L);
            this.mAnimator.setRepeatMode(1);
            this.mAnimator.setRepeatCount(-1);
            this.mAnimator.setInterpolator(new LinearInterpolator());
            this.mAnimator.start();
        } else if (this.mAnimator.isStarted()) {
        } else {
            this.mAnimator.start();
        }
    }

    public void stop() {
        if (this.mAnimator != null) {
            this.mAnimator.removeUpdateListener(this.mUpdateListener);
            this.mAnimator.removeAllUpdateListeners();
            this.mAnimator.cancel();
            this.mAnimator = null;
        }
    }

    private void drawLoading(Canvas canvas, int i) {
        int i2 = this.mSize / 12;
        int i3 = this.mSize / 6;
        this.mPaint.setStrokeWidth(i2);
        canvas.rotate(i, this.mSize / 2, this.mSize / 2);
        canvas.translate(this.mSize / 2, this.mSize / 2);
        int i4 = 0;
        while (i4 < 12) {
            canvas.rotate(30.0f);
            i4++;
            this.mPaint.setAlpha((int) ((i4 * 255.0f) / 12.0f));
            int i5 = i2 / 2;
            canvas.translate(0.0f, ((-this.mSize) / 2) + i5);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i3, this.mPaint);
            canvas.translate(0.0f, (this.mSize / 2) - i5);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.mSize, this.mSize);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        drawLoading(canvas, this.mAnimateValue * 30);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        start();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            start();
        } else {
            stop();
        }
    }
}
