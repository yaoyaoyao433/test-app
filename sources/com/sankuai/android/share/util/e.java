package com.sankuai.android.share.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.BitmapTransformation;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends BitmapTransformation {
    public static ChangeQuickRedirect a;
    private int e;
    private int f;
    private int g;
    private a h;
    private boolean i;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892ad27d96f10baf793c2455077e09a9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892ad27d96f10baf793c2455077e09a9");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01078d0f35ee44b3fee55561295562fe", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01078d0f35ee44b3fee55561295562fe") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ea907f4db3d7747b9831e9a706b5a83", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ea907f4db3d7747b9831e9a706b5a83") : (a[]) values().clone();
        }
    }

    public e(Context context, int i, int i2, a aVar) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), 0, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0925ee340eb187ba874a2c65876913", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0925ee340eb187ba874a2c65876913");
            return;
        }
        this.e = i;
        this.f = this.e * 2;
        this.g = 0;
        this.h = aVar;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e726f9e75cd002bd065d12028839097e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e726f9e75cd002bd065d12028839097e");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap a2 = a(width, height, Bitmap.Config.ARGB_8888);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = a2;
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = width;
        float f2 = height;
        Object[] objArr2 = {canvas, paint, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "288b390fd0158afc76a1776bc3b8953d", RobustBitConfig.DEFAULT_VALUE)) {
            float f3 = f - this.g;
            float f4 = f2 - this.g;
            switch (this.h) {
                case ALL:
                    canvas.drawRoundRect(new RectF(this.g, this.g, f3, f4), this.e, this.e, paint);
                    a(canvas, f, f2);
                    break;
                case TOP_LEFT:
                    Object[] objArr3 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c13b734108642447919f3c8b7ba55467", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, this.g + this.e, f4), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c13b734108642447919f3c8b7ba55467");
                        break;
                    }
                case TOP_RIGHT:
                    Object[] objArr4 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "30618ef876f07cf2c77279864289db9b", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "30618ef876f07cf2c77279864289db9b");
                        break;
                    }
                case BOTTOM_LEFT:
                    Object[] objArr5 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d3537b3c9e74a4617afbf8148e796cf8", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, this.g + this.f, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d3537b3c9e74a4617afbf8148e796cf8");
                        break;
                    }
                case BOTTOM_RIGHT:
                    Object[] objArr6 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ea1bfefadf0ee7002592f01c65ea32a9", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ea1bfefadf0ee7002592f01c65ea32a9");
                        break;
                    }
                case TOP:
                    Object[] objArr7 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (!PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d47ac7ae270b1609c325fea8a2d8ffa4", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d47ac7ae270b1609c325fea8a2d8ffa4");
                        break;
                    }
                case BOTTOM:
                    Object[] objArr8 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (!PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "28977270565ed93e7002fd15b62f7f82", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, f4 - this.e, f3 - this.e, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "28977270565ed93e7002fd15b62f7f82");
                        break;
                    }
                case LEFT:
                    Object[] objArr9 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (!PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "09a72c84a15170c9492fc3c7cb652907", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, this.g + this.e, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "09a72c84a15170c9492fc3c7cb652907");
                        break;
                    }
                case RIGHT:
                    Object[] objArr10 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (!PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "b25187b4b28940ee8e510462637334fb", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "b25187b4b28940ee8e510462637334fb");
                        break;
                    }
                case OTHER_TOP_LEFT:
                    Object[] objArr11 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (!PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "bdfc1f8427dd1bdd3a465970891995ae", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4 - this.e), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, f4 - this.e, f3 - this.e, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "bdfc1f8427dd1bdd3a465970891995ae");
                        break;
                    }
                case OTHER_TOP_RIGHT:
                    Object[] objArr12 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect12 = a;
                    if (!PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "cc26385b22a7498df3b95e00c98f2f33", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, this.e + f3, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, f4 - this.e, f3 - this.e, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "cc26385b22a7498df3b95e00c98f2f33");
                        break;
                    }
                case OTHER_BOTTOM_LEFT:
                    Object[] objArr13 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect13 = a;
                    if (!PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "9dda65b8aaeb0afbc4ec91a89b7aa461", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3 - this.e, this.g + this.e), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "9dda65b8aaeb0afbc4ec91a89b7aa461");
                        break;
                    }
                case OTHER_BOTTOM_RIGHT:
                    Object[] objArr14 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (!PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "39733289445fc1963fa208d6a722aa3e", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g + this.e, f3, f4), paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, this.g + this.e, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3 - this.e, this.g + this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "39733289445fc1963fa208d6a722aa3e");
                        break;
                    }
                case DIAGONAL_FROM_TOP_LEFT:
                    Object[] objArr15 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect15 = a;
                    if (!PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "1d15dbff5bdf8cdff4bcce4c5b5e65f9", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, this.g + this.e), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "1d15dbff5bdf8cdff4bcce4c5b5e65f9");
                        break;
                    }
                case DIAGONAL_FROM_TOP_RIGHT:
                    Object[] objArr16 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect16 = a;
                    if (!PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "ae4f6bea34d8b573e8cda27313077be3", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, f4 - this.e, f3, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "ae4f6bea34d8b573e8cda27313077be3");
                        break;
                    }
                default:
                    canvas.drawRoundRect(new RectF(this.g, this.g, f3, f4), this.e, this.e, paint);
                    a(canvas, f, f2);
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "288b390fd0158afc76a1776bc3b8953d");
        }
        return bitmap2;
    }

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d7c3ff040766a5b752096c3e4290e15", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d7c3ff040766a5b752096c3e4290e15");
        }
        return "RoundedTransformation(radius=" + this.e + ", margin=" + this.g + ", diameter=" + this.f + ", cornerType=" + this.h.name() + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    private float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea9d0920b68506a7c557bf0b3ad3005e", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea9d0920b68506a7c557bf0b3ad3005e")).floatValue() : this.b.getResources().getDisplayMetrics().density;
    }

    private void a(Canvas canvas, float f, float f2) {
        Object[] objArr = {canvas, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb5c73803270a7a764b6757c20f8666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb5c73803270a7a764b6757c20f8666");
        } else if (this.i) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            float b = b() * 0.3f;
            paint.setStrokeWidth(b);
            paint.setColor(Color.parseColor("#C9C9C9"));
            float f3 = b / 2.0f;
            canvas.drawRoundRect(new RectF(this.g + f3, this.g + f3, (f - this.g) - f3, (f2 - this.g) - f3), this.e, this.e, paint);
        }
    }
}
