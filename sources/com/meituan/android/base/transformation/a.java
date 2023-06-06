package com.meituan.android.base.transformation;

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
import com.tencent.rtmp.TXLiveConstants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends BitmapTransformation {
    public static ChangeQuickRedirect a;
    private int e;
    private int f;
    private int g;
    private EnumC0184a h;
    private boolean i;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.base.transformation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0184a {
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

        EnumC0184a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac63493601455258d6fa72dcd4c402fb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac63493601455258d6fa72dcd4c402fb");
            }
        }

        public static EnumC0184a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4550086b22c26795c7d8a74017271b3b", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0184a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4550086b22c26795c7d8a74017271b3b") : (EnumC0184a) Enum.valueOf(EnumC0184a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0184a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af6fefe3ec94acf1c38498f0a6cba651", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0184a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af6fefe3ec94acf1c38498f0a6cba651") : (EnumC0184a[]) values().clone();
        }
    }

    public a(Context context, int i, int i2) {
        this(context, TXLiveConstants.RENDER_ROTATION_180, 0, EnumC0184a.ALL);
        Object[] objArr = {context, Integer.valueOf((int) TXLiveConstants.RENDER_ROTATION_180), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d31c475f95d8166d86e8a700a10567f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d31c475f95d8166d86e8a700a10567f");
        }
    }

    private a(Context context, int i, int i2, EnumC0184a enumC0184a) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), enumC0184a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72fe3841de81603ed8beb1a5bfa08a46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72fe3841de81603ed8beb1a5bfa08a46");
            return;
        }
        this.e = i;
        this.f = this.e * 2;
        this.g = i2;
        this.h = enumC0184a;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee58e8eba6f9bef6d43b9471be71346", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee58e8eba6f9bef6d43b9471be71346");
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
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc255d4bef5057d5939e3d773a23b1f7", RobustBitConfig.DEFAULT_VALUE)) {
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
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "22cc59f2922c38dd934f4fe03e66ac10", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, this.g + this.e, f4), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "22cc59f2922c38dd934f4fe03e66ac10");
                        break;
                    }
                case TOP_RIGHT:
                    Object[] objArr4 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d2fe0810c3449bc98d33199a1ef397f2", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d2fe0810c3449bc98d33199a1ef397f2");
                        break;
                    }
                case BOTTOM_LEFT:
                    Object[] objArr5 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "aac3587155abd5250ae785d6e868b356", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, this.g + this.f, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "aac3587155abd5250ae785d6e868b356");
                        break;
                    }
                case BOTTOM_RIGHT:
                    Object[] objArr6 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "75122a277de6155b3987b18210ab1d86", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "75122a277de6155b3987b18210ab1d86");
                        break;
                    }
                case TOP:
                    Object[] objArr7 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (!PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "03b28444b276d338b66b0c597621fb1d", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "03b28444b276d338b66b0c597621fb1d");
                        break;
                    }
                case BOTTOM:
                    Object[] objArr8 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (!PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "bf47f127725e9b679b55a7d3843c4964", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, f4 - this.e, f3 - this.e, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "bf47f127725e9b679b55a7d3843c4964");
                        break;
                    }
                case LEFT:
                    Object[] objArr9 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (!PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "fec284f08b5eed2b998554a60ba721e9", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, this.g + this.e, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "fec284f08b5eed2b998554a60ba721e9");
                        break;
                    }
                case RIGHT:
                    Object[] objArr10 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (!PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "db8c94660fc7d35032d7a31f16a66785", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "db8c94660fc7d35032d7a31f16a66785");
                        break;
                    }
                case OTHER_TOP_LEFT:
                    Object[] objArr11 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (!PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "60a556e3d20839ada7a9a8f9b6c38c6a", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4 - this.e), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, f4 - this.e, f3 - this.e, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "60a556e3d20839ada7a9a8f9b6c38c6a");
                        break;
                    }
                case OTHER_TOP_RIGHT:
                    Object[] objArr12 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect12 = a;
                    if (!PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "1e90d5acf23e5846a99fc2f3054849e1", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, this.e + f3, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, f4 - this.e, f3 - this.e, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "1e90d5acf23e5846a99fc2f3054849e1");
                        break;
                    }
                case OTHER_BOTTOM_LEFT:
                    Object[] objArr13 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect13 = a;
                    if (!PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "5fd598a8e88e3a581a9b38a128e2c0f6", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3 - this.e, this.g + this.e), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "5fd598a8e88e3a581a9b38a128e2c0f6");
                        break;
                    }
                case OTHER_BOTTOM_RIGHT:
                    Object[] objArr14 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (!PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "cab75d27472bc3e7b8318c2a54bb9eb6", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g + this.e, f3, f4), paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, this.g + this.e, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3 - this.e, this.g + this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "cab75d27472bc3e7b8318c2a54bb9eb6");
                        break;
                    }
                case DIAGONAL_FROM_TOP_LEFT:
                    Object[] objArr15 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect15 = a;
                    if (!PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "d0a7c9b1a908abda64357184d8099be0", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(this.g, this.g, this.g + this.f, this.g + this.f), 180.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(f3 - this.f, f4 - this.f, f3, f4), 0.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g + this.e, f3 - this.e, f4), paint);
                        canvas.drawRect(new RectF(this.g + this.e, this.g, f3, this.g + this.e), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "d0a7c9b1a908abda64357184d8099be0");
                        break;
                    }
                case DIAGONAL_FROM_TOP_RIGHT:
                    Object[] objArr16 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect16 = a;
                    if (!PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "eead0651381dbe2fb2f4c17fa153b9d2", RobustBitConfig.DEFAULT_VALUE)) {
                        canvas.drawArc(new RectF(f3 - this.f, this.g, f3, this.g + this.f), 270.0f, 90.0f, true, paint);
                        canvas.drawArc(new RectF(this.g, f4 - this.f, this.g + this.f, f4), 90.0f, 90.0f, true, paint);
                        canvas.drawRect(new RectF(this.g, this.g, f3 - this.e, f4 - this.e), paint);
                        canvas.drawRect(new RectF(this.g + this.e, f4 - this.e, f3, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.e, this.g + this.e, f3, f4 - this.e), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "eead0651381dbe2fb2f4c17fa153b9d2");
                        break;
                    }
                default:
                    canvas.drawRoundRect(new RectF(this.g, this.g, f3, f4), this.e, this.e, paint);
                    a(canvas, f, f2);
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc255d4bef5057d5939e3d773a23b1f7");
        }
        return bitmap2;
    }

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15c589b1fbcfea791e515b3e175fcd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15c589b1fbcfea791e515b3e175fcd7");
        }
        return "RoundedTransformation(radius=" + this.e + ", margin=" + this.g + ", diameter=" + this.f + ", cornerType=" + this.h.name() + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    private void a(Canvas canvas, float f, float f2) {
        Object[] objArr = {canvas, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e12d7df8fc5eade1b6ee9ff326660ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e12d7df8fc5eade1b6ee9ff326660ee");
        } else if (this.i) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            float f3 = com.meituan.android.base.a.a * 0.3f;
            paint.setStrokeWidth(f3);
            paint.setColor(Color.parseColor("#C9C9C9"));
            float f4 = f3 / 2.0f;
            canvas.drawRoundRect(new RectF(this.g + f4, this.g + f4, (f - this.g) - f4, (f2 - this.g) - f4), this.e, this.e, paint);
        }
    }
}
