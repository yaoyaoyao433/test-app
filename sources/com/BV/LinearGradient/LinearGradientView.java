package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.w;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LinearGradientView extends View {
    private float mAngle;
    private float[] mAngleCenter;
    private float[] mBorderRadii;
    private int[] mColors;
    private float[] mEndPos;
    private float[] mLocations;
    private final Paint mPaint;
    private Path mPathForBorderRadius;
    private LinearGradient mShader;
    private int[] mSize;
    private float[] mStartPos;
    private RectF mTempRectForBorderRadius;
    private boolean mUseAngle;

    public LinearGradientView(Context context) {
        super(context);
        this.mPaint = new Paint(1);
        this.mStartPos = new float[]{0.0f, 0.0f};
        this.mEndPos = new float[]{0.0f, 1.0f};
        this.mUseAngle = false;
        this.mAngleCenter = new float[]{0.5f, 0.5f};
        this.mAngle = 45.0f;
        this.mSize = new int[]{0, 0};
        this.mBorderRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.mStartPos = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.mEndPos = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setColors(ReadableArray readableArray) {
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.mColors = iArr;
        drawGradient();
    }

    public void setLocations(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.mLocations = fArr;
        drawGradient();
    }

    public void setUseAngle(boolean z) {
        this.mUseAngle = z;
        drawGradient();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.mAngleCenter = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setAngle(float f) {
        this.mAngle = f;
        drawGradient();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = w.a((float) readableArray.getDouble(i));
        }
        this.mBorderRadii = fArr;
        updatePath();
        drawGradient();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.mSize = new int[]{i, i2};
        updatePath();
        drawGradient();
    }

    private float[] calculateGradientLocationWithAngle(float f) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d = (f - 90.0f) * 0.017453292f;
        return new float[]{((float) Math.cos(d)) * sqrt, ((float) Math.sin(d)) * sqrt};
    }

    private void drawGradient() {
        if (this.mColors != null) {
            if (this.mLocations == null || this.mColors.length == this.mLocations.length) {
                float[] fArr = this.mStartPos;
                float[] fArr2 = this.mEndPos;
                if (this.mUseAngle && this.mAngleCenter != null) {
                    float[] calculateGradientLocationWithAngle = calculateGradientLocationWithAngle(this.mAngle);
                    float[] fArr3 = {this.mAngleCenter[0] - (calculateGradientLocationWithAngle[0] / 2.0f), this.mAngleCenter[1] - (calculateGradientLocationWithAngle[1] / 2.0f)};
                    fArr2 = new float[]{this.mAngleCenter[0] + (calculateGradientLocationWithAngle[0] / 2.0f), this.mAngleCenter[1] + (calculateGradientLocationWithAngle[1] / 2.0f)};
                    fArr = fArr3;
                }
                this.mShader = new LinearGradient(this.mSize[0] * fArr[0], fArr[1] * this.mSize[1], fArr2[0] * this.mSize[0], fArr2[1] * this.mSize[1], this.mColors, this.mLocations, Shader.TileMode.CLAMP);
                this.mPaint.setShader(this.mShader);
                invalidate();
            }
        }
    }

    private void updatePath() {
        if (this.mPathForBorderRadius == null) {
            this.mPathForBorderRadius = new Path();
            this.mTempRectForBorderRadius = new RectF();
        }
        this.mPathForBorderRadius.reset();
        this.mTempRectForBorderRadius.set(0.0f, 0.0f, this.mSize[0], this.mSize[1]);
        this.mPathForBorderRadius.addRoundRect(this.mTempRectForBorderRadius, this.mBorderRadii, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mPathForBorderRadius == null) {
            canvas.drawPaint(this.mPaint);
        } else {
            canvas.drawPath(this.mPathForBorderRadius, this.mPaint);
        }
    }
}
