package com.reactnativecommunity.art;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ARTShapeShadowNode extends ARTVirtualNode {
    @Nullable
    protected Path a;
    @Nullable
    private String i;
    @Nullable
    private float[] j;
    @Nullable
    private float[] k;
    private float l = 1.0f;
    private int m = 1;
    private int n = 1;

    @ReactProp(name = "d")
    public void setShapePath(@Nullable ReadableArray readableArray) {
        int i;
        float[] a = b.a(readableArray);
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i2 = 0;
        while (i2 < a.length) {
            int i3 = i2 + 1;
            int i4 = (int) a[i2];
            switch (i4) {
                case 0:
                    int i5 = i3 + 1;
                    i = i5 + 1;
                    path.moveTo(a[i3] * this.h, a[i5] * this.h);
                    break;
                case 1:
                    path.close();
                    i2 = i3;
                    continue;
                case 2:
                    int i6 = i3 + 1;
                    i = i6 + 1;
                    path.lineTo(a[i3] * this.h, a[i6] * this.h);
                    break;
                case 3:
                    int i7 = i3 + 1;
                    float f = a[i3] * this.h;
                    int i8 = i7 + 1;
                    float f2 = this.h * a[i7];
                    int i9 = i8 + 1;
                    float f3 = this.h * a[i8];
                    int i10 = i9 + 1;
                    float f4 = this.h * a[i9];
                    int i11 = i10 + 1;
                    path.cubicTo(f, f2, f3, f4, this.h * a[i10], a[i11] * this.h);
                    i2 = i11 + 1;
                    continue;
                case 4:
                    int i12 = i3 + 1;
                    float f5 = a[i3] * this.h;
                    int i13 = i12 + 1;
                    float f6 = a[i12] * this.h;
                    int i14 = i13 + 1;
                    float f7 = a[i13] * this.h;
                    int i15 = i14 + 1;
                    float degrees = (float) Math.toDegrees(a[i14]);
                    int i16 = i15 + 1;
                    float degrees2 = (float) Math.toDegrees(a[i15]);
                    int i17 = i16 + 1;
                    boolean z = a[i16] != 1.0f;
                    float f8 = degrees2 - degrees;
                    if (Math.abs(f8) >= 360.0f) {
                        path.addCircle(f5, f6, f7, z ? Path.Direction.CCW : Path.Direction.CW);
                    } else {
                        float f9 = f8 % 360.0f;
                        if (f9 < 0.0f) {
                            f9 += 360.0f;
                        }
                        if (z && f9 < 360.0f) {
                            f9 = (360.0f - f9) * (-1.0f);
                        }
                        path.arcTo(new RectF(f5 - f7, f6 - f7, f5 + f7, f6 + f7), degrees, f9);
                    }
                    i2 = i17;
                    continue;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("Unrecognized drawing instruction " + i4);
            }
            i2 = i;
        }
        this.a = path;
        markUpdated();
    }

    @ReactProp(name = "stroke")
    public void setStroke(@Nullable String str) {
        this.i = str;
        markUpdated();
    }

    @ReactProp(name = "strokeDash")
    public void setStrokeDash(@Nullable ReadableArray readableArray) {
        this.k = b.a(readableArray);
        markUpdated();
    }

    @ReactProp(name = "fill")
    public void setFill(@Nullable ReadableArray readableArray) {
        this.j = b.a(readableArray);
        markUpdated();
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(float f) {
        this.l = f;
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i) {
        this.m = i;
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i) {
        this.n = i;
        markUpdated();
    }

    @Override // com.reactnativecommunity.art.ARTVirtualNode
    public void a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.b;
        if (f2 > 0.01f) {
            a(canvas);
            if (this.a == null) {
                throw new JSApplicationIllegalArgumentException("Shapes should have a valid path (d) prop");
            }
            if (b(paint, f2)) {
                canvas.drawPath(this.a, paint);
            }
            if (a(paint, f2)) {
                canvas.drawPath(this.a, paint);
            }
            canvas.restore();
        }
        markUpdateSeen();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(Paint paint, float f) {
        if (this.l == 0.0f || this.i == null) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        switch (this.m) {
            case 0:
                paint.setStrokeCap(Paint.Cap.BUTT);
                break;
            case 1:
                paint.setStrokeCap(Paint.Cap.ROUND);
                break;
            case 2:
                paint.setStrokeCap(Paint.Cap.SQUARE);
                break;
            default:
                throw new JSApplicationIllegalArgumentException("strokeCap " + this.m + " unrecognized");
        }
        switch (this.n) {
            case 0:
                paint.setStrokeJoin(Paint.Join.MITER);
                break;
            case 1:
                paint.setStrokeJoin(Paint.Join.ROUND);
                break;
            case 2:
                paint.setStrokeJoin(Paint.Join.BEVEL);
                break;
            default:
                throw new JSApplicationIllegalArgumentException("strokeJoin " + this.n + " unrecognized");
        }
        paint.setStrokeWidth(this.l * this.h);
        paint.setColor(Color.parseColor(this.i));
        if (this.k != null && this.k.length > 0) {
            paint.setPathEffect(new DashPathEffect(this.k, 0.0f));
        }
        if (this.d > 0.0f) {
            paint.setShadowLayer(this.e, this.f, this.g, this.c);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(Paint paint, float f) {
        float f2;
        float f3;
        int[] iArr;
        float[] fArr;
        int i = 0;
        if (this.j == null || this.j.length <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        int i2 = (int) this.j[0];
        float f4 = 255.0f;
        switch (i2) {
            case 0:
                if (this.j.length > 4) {
                    f2 = 255.0f;
                    f3 = this.j[4] * f * 255.0f;
                } else {
                    f2 = 255.0f;
                    f3 = f * 255.0f;
                }
                paint.setARGB((int) f3, (int) (this.j[1] * f2), (int) (this.j[2] * f2), (int) (this.j[3] * f2));
                break;
            case 1:
                int i3 = 5;
                if (this.j.length < 5) {
                    com.facebook.common.logging.a.c("ReactNative", "[ARTShapeShadowNode setupFillPaint] expects 5 elements, received " + this.j.length);
                    return false;
                }
                float f5 = this.j[1] * this.h;
                float f6 = this.j[2] * this.h;
                float f7 = this.j[3] * this.h;
                float f8 = this.j[4] * this.h;
                int length = (this.j.length - 5) / 5;
                if (length > 0) {
                    int[] iArr2 = new int[length];
                    float[] fArr2 = new float[length];
                    while (i < length) {
                        fArr2[i] = this.j[(length * 4) + i3 + i];
                        int i4 = (i * 4) + i3;
                        iArr2[i] = Color.argb((int) (this.j[i4 + 3] * 255.0f), (int) (this.j[i4 + 0] * f4), (int) (this.j[i4 + 1] * f4), (int) (this.j[i4 + 2] * f4));
                        i++;
                        i3 = 5;
                        f4 = 255.0f;
                    }
                    iArr = iArr2;
                    fArr = fArr2;
                } else {
                    iArr = null;
                    fArr = null;
                }
                paint.setShader(new LinearGradient(f5, f6, f7, f8, iArr, fArr, Shader.TileMode.CLAMP));
                break;
            default:
                com.facebook.common.logging.a.c("ReactNative", "ART: Color type " + i2 + " not supported!");
                break;
        }
        if (this.d > 0.0f) {
            paint.setShadowLayer(this.e, this.f, this.g, this.c);
            return true;
        }
        return true;
    }
}
