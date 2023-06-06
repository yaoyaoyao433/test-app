package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.common.logging.a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.horcrux.svg.Brush;
import com.meituan.metrics.common.Constants;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class RadialGradientView extends DefinitionView {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private SVGLength mCx;
    private SVGLength mCy;
    private SVGLength mFx;
    private SVGLength mFy;
    private ReadableArray mGradient;
    private Brush.BrushUnits mGradientUnits;
    private Matrix mMatrix;
    private SVGLength mRx;
    private SVGLength mRy;

    public RadialGradientView(ReactContext reactContext) {
        super(reactContext);
        this.mMatrix = null;
    }

    @ReactProp(name = "fx")
    public void setFx(Dynamic dynamic) {
        this.mFx = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = "fy")
    public void setFy(Dynamic dynamic) {
        this.mFy = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = Constants.KEY_RX)
    public void setRx(Dynamic dynamic) {
        this.mRx = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.mRy = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = "cx")
    public void setCx(Dynamic dynamic) {
        this.mCx = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = "cy")
    public void setCy(Dynamic dynamic) {
        this.mCy = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(name = "gradient")
    public void setGradient(ReadableArray readableArray) {
        this.mGradient = readableArray;
        invalidate();
    }

    @ReactProp(name = "gradientUnits")
    public void setGradientUnits(int i) {
        switch (i) {
            case 0:
                this.mGradientUnits = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
                break;
            case 1:
                this.mGradientUnits = Brush.BrushUnits.USER_SPACE_ON_USE;
                break;
        }
        invalidate();
    }

    @ReactProp(name = "gradientTransform")
    public void setGradientTransform(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int matrixData = PropHelper.toMatrixData(readableArray, sRawMatrix, this.mScale);
            if (matrixData == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                }
                this.mMatrix.setValues(sRawMatrix);
            } else if (matrixData != -1) {
                a.c("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix = null;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            Brush brush = new Brush(Brush.BrushType.RADIAL_GRADIENT, new SVGLength[]{this.mFx, this.mFy, this.mRx, this.mRy, this.mCx, this.mCy}, this.mGradientUnits);
            brush.setGradientColors(this.mGradient);
            if (this.mMatrix != null) {
                brush.setGradientTransform(this.mMatrix);
            }
            SvgView svgView = getSvgView();
            if (this.mGradientUnits == Brush.BrushUnits.USER_SPACE_ON_USE) {
                brush.setUserSpaceBoundingBox(svgView.getCanvasBounds());
            }
            svgView.defineBrush(brush, this.mName);
        }
    }
}
