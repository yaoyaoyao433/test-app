package com.reactnativecommunity.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.v4.graphics.ColorUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.d;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ARTVirtualNode extends ReactShadowNodeImpl {
    private static final float[] a = new float[9];
    private static final float[] i = new float[9];
    protected float b = 1.0f;
    @Nullable
    private Matrix j = new Matrix();
    protected int c = 0;
    protected float d = 1.0f;
    protected float e = 0.0f;
    protected float f = 0.0f;
    protected float g = 0.0f;
    protected final float h = d.a().density;

    public abstract void a(Canvas canvas, Paint paint, float f);

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public boolean isVirtual() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Canvas canvas) {
        canvas.save();
        if (this.j != null) {
            canvas.concat(this.j);
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.b = f;
        markUpdated();
    }

    @ReactProp(name = "transform")
    public void setTransform(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int a2 = b.a(readableArray, a);
            if (a2 == 6) {
                i[0] = a[0];
                i[1] = a[2];
                i[2] = a[4] * this.h;
                i[3] = a[1];
                i[4] = a[3];
                i[5] = a[5] * this.h;
                i[6] = 0.0f;
                i[7] = 0.0f;
                i[8] = 1.0f;
                if (this.j == null) {
                    this.j = new Matrix();
                }
                this.j.setValues(i);
            } else if (a2 != -1) {
                throw new JSApplicationIllegalArgumentException("Transform matrices must be of size 6");
            }
        } else {
            this.j = null;
        }
        markUpdated();
    }

    @ReactProp(name = "shadow")
    public void setShadow(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            this.d = (float) readableArray.getDouble(1);
            this.e = (float) readableArray.getDouble(2);
            this.f = (float) readableArray.getDouble(3);
            this.g = (float) readableArray.getDouble(4);
            int i2 = readableArray.getInt(0);
            if (this.d < 1.0f) {
                i2 = ColorUtils.setAlphaComponent(i2, (int) (this.d * 255.0f));
            }
            this.c = i2;
        } else {
            this.c = 0;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
        }
        markUpdated();
    }
}
