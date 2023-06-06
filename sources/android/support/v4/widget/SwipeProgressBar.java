package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.dianping.shield.entity.ExposeAction;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class SwipeProgressBar {
    private static final int ANIMATION_DURATION_MS = 2000;
    private static final int COLOR1 = -1291845632;
    private static final int COLOR2 = Integer.MIN_VALUE;
    private static final int COLOR3 = 1291845632;
    private static final int COLOR4 = 436207616;
    private static final int FINISH_ANIMATION_DURATION_MS = 1000;
    private static final Interpolator INTERPOLATOR = new FastOutSlowInInterpolator();
    private long mFinishTime;
    private View mParent;
    private boolean mRunning;
    private long mStartTime;
    private float mTriggerPercentage;
    private final Paint mPaint = new Paint();
    private final RectF mClipRect = new RectF();
    private Rect mBounds = new Rect();
    private int mColor1 = COLOR1;
    private int mColor2 = Integer.MIN_VALUE;
    private int mColor3 = COLOR3;
    private int mColor4 = COLOR4;

    SwipeProgressBar(View view) {
        this.mParent = view;
    }

    final void setColorScheme(int i, int i2, int i3, int i4) {
        this.mColor1 = i;
        this.mColor2 = i2;
        this.mColor3 = i3;
        this.mColor4 = i4;
    }

    final void setTriggerPercentage(float f) {
        this.mTriggerPercentage = f;
        this.mStartTime = 0L;
        ViewCompat.postInvalidateOnAnimation(this.mParent, this.mBounds.left, this.mBounds.top, this.mBounds.right, this.mBounds.bottom);
    }

    final void start() {
        if (this.mRunning) {
            return;
        }
        this.mTriggerPercentage = 0.0f;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mRunning = true;
        this.mParent.postInvalidate();
    }

    final void stop() {
        if (this.mRunning) {
            this.mTriggerPercentage = 0.0f;
            this.mFinishTime = AnimationUtils.currentAnimationTimeMillis();
            this.mRunning = false;
            this.mParent.postInvalidate();
        }
    }

    final boolean isRunning() {
        return this.mRunning || this.mFinishTime > 0;
    }

    final void draw(Canvas canvas) {
        float f;
        int width = this.mBounds.width();
        int height = this.mBounds.height();
        int i = width / 2;
        int i2 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.mBounds);
        if (this.mRunning || this.mFinishTime > 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = (currentAnimationTimeMillis - this.mStartTime) % ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
            long j2 = (currentAnimationTimeMillis - this.mStartTime) / ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
            float f2 = ((float) j) / 20.0f;
            boolean z = false;
            if (this.mRunning) {
                f = f2;
            } else {
                f = f2;
                if (currentAnimationTimeMillis - this.mFinishTime >= 1000) {
                    this.mFinishTime = 0L;
                    return;
                }
                float f3 = i;
                float interpolation = INTERPOLATOR.getInterpolation((((float) ((currentAnimationTimeMillis - this.mFinishTime) % 1000)) / 10.0f) / 100.0f) * f3;
                this.mClipRect.set(f3 - interpolation, 0.0f, f3 + interpolation, height);
                canvas.saveLayerAlpha(this.mClipRect, 0, 0);
                z = true;
            }
            if (j2 == 0) {
                canvas.drawColor(this.mColor1);
            } else if (f >= 0.0f && f < 25.0f) {
                canvas.drawColor(this.mColor4);
            } else if (f >= 25.0f && f < 50.0f) {
                canvas.drawColor(this.mColor1);
            } else if (f >= 50.0f && f < 75.0f) {
                canvas.drawColor(this.mColor2);
            } else {
                canvas.drawColor(this.mColor3);
            }
            int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i3 >= 0 && f <= 25.0f) {
                drawCircle(canvas, i, i2, this.mColor1, ((f + 25.0f) * 2.0f) / 100.0f);
            }
            if (i3 >= 0 && f <= 50.0f) {
                drawCircle(canvas, i, i2, this.mColor2, (f * 2.0f) / 100.0f);
            }
            if (f >= 25.0f && f <= 75.0f) {
                drawCircle(canvas, i, i2, this.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f && f <= 100.0f) {
                drawCircle(canvas, i, i2, this.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f && f <= 100.0f) {
                drawCircle(canvas, i, i2, this.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (this.mTriggerPercentage > 0.0f && z) {
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                canvas.clipRect(this.mBounds);
                drawTrigger(canvas, i, i2);
                save = save2;
            }
            ViewCompat.postInvalidateOnAnimation(this.mParent, this.mBounds.left, this.mBounds.top, this.mBounds.right, this.mBounds.bottom);
        } else if (this.mTriggerPercentage > 0.0f && this.mTriggerPercentage <= 1.0d) {
            drawTrigger(canvas, i, i2);
        }
        canvas.restoreToCount(save);
    }

    private void drawTrigger(Canvas canvas, int i, int i2) {
        this.mPaint.setColor(this.mColor1);
        float f = i;
        canvas.drawCircle(f, i2, this.mTriggerPercentage * f, this.mPaint);
    }

    private void drawCircle(Canvas canvas, float f, float f2, int i, float f3) {
        this.mPaint.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = INTERPOLATOR.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.mPaint);
        canvas.restore();
    }

    final void setBounds(int i, int i2, int i3, int i4) {
        this.mBounds.left = i;
        this.mBounds.top = i2;
        this.mBounds.right = i3;
        this.mBounds.bottom = i4;
    }
}
