package com.meituan.msc.views.gradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNLinearGradientView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;
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

    public RNLinearGradientView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f85fce20f9b7139221052acee0bcb0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f85fce20f9b7139221052acee0bcb0a");
            return;
        }
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
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94e766e7c38b531b9d763a84460cc5e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94e766e7c38b531b9d763a84460cc5e8");
            return;
        }
        this.mStartPos = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setEndPosition(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7689bc3954a50b4b2f4e264ebbcec2fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7689bc3954a50b4b2f4e264ebbcec2fe");
            return;
        }
        this.mEndPos = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setColors(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7a5cbeb283ea7b29b2b9dca5b8cda66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7a5cbeb283ea7b29b2b9dca5b8cda66");
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.mColors = iArr;
        drawGradient();
    }

    public void setLocations(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd623e67b2c49cb4f8fdc35ca0217973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd623e67b2c49cb4f8fdc35ca0217973");
            return;
        }
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.mLocations = fArr;
        drawGradient();
    }

    public void setUseAngle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09bee1a20d1074cac419bfa054cee93c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09bee1a20d1074cac419bfa054cee93c");
            return;
        }
        this.mUseAngle = z;
        drawGradient();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "106a86f631d235bcc2481385244442af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "106a86f631d235bcc2481385244442af");
            return;
        }
        this.mAngleCenter = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        drawGradient();
    }

    public void setAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "802e98e3cba282ca5d5ae334af5705af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "802e98e3cba282ca5d5ae334af5705af");
            return;
        }
        this.mAngle = f;
        drawGradient();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8ecc592aed8a56601485937c1c338b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8ecc592aed8a56601485937c1c338b0");
            return;
        }
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = s.a((float) readableArray.getDouble(i));
        }
        this.mBorderRadii = fArr;
        updatePath();
        drawGradient();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3312f45267e6ce6337ea03a568383bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3312f45267e6ce6337ea03a568383bd7");
            return;
        }
        this.mSize = new int[]{i, i2};
        updatePath();
        drawGradient();
    }

    private float[] calculateGradientLocationWithAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14301a864ff6c0db230f0ec3457f6581", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14301a864ff6c0db230f0ec3457f6581");
        }
        float sqrt = (float) Math.sqrt(2.0d);
        double d = (f - 90.0f) * 0.017453292f;
        return new float[]{((float) Math.cos(d)) * sqrt, ((float) Math.sin(d)) * sqrt};
    }

    private void drawGradient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "724c8749320ca138d91af8f15f19dcbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "724c8749320ca138d91af8f15f19dcbb");
        } else if (this.mColors != null) {
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
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28173bb05d740b3fb72059e88c1146ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28173bb05d740b3fb72059e88c1146ca");
            return;
        }
        if (this.mPathForBorderRadius == null) {
            this.mPathForBorderRadius = new Path();
            this.mTempRectForBorderRadius = new RectF();
        }
        this.mPathForBorderRadius.reset();
        this.mTempRectForBorderRadius.set(0.0f, 0.0f, this.mSize[0], this.mSize[1]);
        this.mPathForBorderRadius.addRoundRect(this.mTempRectForBorderRadius, this.mBorderRadii, Path.Direction.CW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65003061947e6303de9882b18166da72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65003061947e6303de9882b18166da72");
            return;
        }
        super.onDraw(canvas);
        if (this.mPathForBorderRadius == null) {
            canvas.drawPaint(this.mPaint);
        } else {
            canvas.drawPath(this.mPathForBorderRadius, this.mPaint);
        }
    }
}
