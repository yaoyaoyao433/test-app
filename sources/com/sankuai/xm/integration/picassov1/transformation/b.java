package com.sankuai.xm.integration.picassov1.transformation;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.squareup.picasso.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements Transformation {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35460989b02276de4df82e49046aa46", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35460989b02276de4df82e49046aa46");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d94d79c5c07b675e5718917a2d132139", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d94d79c5c07b675e5718917a2d132139") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd24267dfcbf8cab339984b008b538ba", 6917529027641081856L) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd24267dfcbf8cab339984b008b538ba") : (a[]) values().clone();
        }
    }

    public b(int i, int i2) {
        this(i, 0, a.ALL);
        Object[] objArr = {Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b8b9c06216986a38d1d4e4496065ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b8b9c06216986a38d1d4e4496065ae");
        }
    }

    private b(int i, int i2, a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "544a0da0ec8c0d91068b7734db8546b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "544a0da0ec8c0d91068b7734db8546b1");
            return;
        }
        this.b = i;
        this.c = i * 2;
        this.d = i2;
        this.e = aVar;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a02dc8dfcf2325f930077b7b67177880", 6917529027641081856L)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a02dc8dfcf2325f930077b7b67177880");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = width;
        float f2 = height;
        Object[] objArr2 = {canvas, paint, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b637aa8cfd468c84924e370ce4bac6d3", 6917529027641081856L)) {
            float f3 = f - this.d;
            float f4 = f2 - this.d;
            switch (this.e) {
                case ALL:
                    canvas.drawRoundRect(new RectF(this.d, this.d, f3, f4), this.b, this.b, paint);
                    break;
                case TOP_LEFT:
                    Object[] objArr3 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e38f066a62a36983983e8bcf7e92c34a", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, this.d, this.d + this.c, this.d + this.c), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d + this.b, this.d + this.b, f4), paint);
                        canvas.drawRect(new RectF(this.d + this.b, this.d, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e38f066a62a36983983e8bcf7e92c34a");
                        break;
                    }
                case TOP_RIGHT:
                    Object[] objArr4 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bf1debe9a4d0eb7da08737f8e0cbd00e", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(f3 - this.c, this.d, f3, this.d + this.c), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d, f3 - this.b, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.b, this.d + this.b, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bf1debe9a4d0eb7da08737f8e0cbd00e");
                        break;
                    }
                case BOTTOM_LEFT:
                    Object[] objArr5 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fbab516c83fd77cfb79b9eac756794fc", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, f4 - this.c, this.d + this.c, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d, this.d + this.c, f4 - this.b), paint);
                        canvas.drawRect(new RectF(this.d + this.b, this.d, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fbab516c83fd77cfb79b9eac756794fc");
                        break;
                    }
                case BOTTOM_RIGHT:
                    Object[] objArr6 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8cc89bfc62266cd6145adff53b37bd84", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(f3 - this.c, f4 - this.c, f3, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d, f3 - this.b, f4), paint);
                        canvas.drawRect(new RectF(f3 - this.b, this.d, f3, f4 - this.b), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8cc89bfc62266cd6145adff53b37bd84");
                        break;
                    }
                case TOP:
                    Object[] objArr7 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (!PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "bdab7481c9e0be1be7642b1cb1ea6765", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, this.d, f3, this.d + this.c), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d + this.b, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "bdab7481c9e0be1be7642b1cb1ea6765");
                        break;
                    }
                case BOTTOM:
                    Object[] objArr8 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (!PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "adb2c0938329d962dc5c63098dca7702", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, f4 - this.c, f3, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d, f3, f4 - this.b), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "adb2c0938329d962dc5c63098dca7702");
                        break;
                    }
                case LEFT:
                    Object[] objArr9 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (!PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "a5ba044aed2fbb304924e439a3d6186b", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, this.d, this.d + this.c, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d + this.b, this.d, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "a5ba044aed2fbb304924e439a3d6186b");
                        break;
                    }
                case RIGHT:
                    Object[] objArr10 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (!PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "0cd2d839792dde29cf5456047e5159e7", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(f3 - this.c, this.d, f3, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d, f3 - this.b, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "0cd2d839792dde29cf5456047e5159e7");
                        break;
                    }
                case OTHER_TOP_LEFT:
                    Object[] objArr11 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (!PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "196903bc3616157bc66e043095e5f67f", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, f4 - this.c, f3, f4), this.b, this.b, paint);
                        canvas.drawRoundRect(new RectF(f3 - this.c, this.d, f3, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d, f3 - this.b, f4 - this.b), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "196903bc3616157bc66e043095e5f67f");
                        break;
                    }
                case OTHER_TOP_RIGHT:
                    Object[] objArr12 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect12 = a;
                    if (!PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "68addb3aa0d940bdff267078eb485077", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, this.d, this.d + this.c, f4), this.b, this.b, paint);
                        canvas.drawRoundRect(new RectF(this.d, f4 - this.c, f3, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d + this.b, this.d, f3, f4 - this.b), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "68addb3aa0d940bdff267078eb485077");
                        break;
                    }
                case OTHER_BOTTOM_LEFT:
                    Object[] objArr13 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect13 = a;
                    if (!PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "71e25f2b6c61d78dc7dfdc212ce8de72", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, this.d, f3, this.d + this.c), this.b, this.b, paint);
                        canvas.drawRoundRect(new RectF(f3 - this.c, this.d, f3, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d + this.b, f3 - this.b, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "71e25f2b6c61d78dc7dfdc212ce8de72");
                        break;
                    }
                case OTHER_BOTTOM_RIGHT:
                    Object[] objArr14 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (!PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "adb7bb7c73060ff6f69534f7cb33311b", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, this.d, f3, this.d + this.c), this.b, this.b, paint);
                        canvas.drawRoundRect(new RectF(this.d, this.d, this.d + this.c, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d + this.b, this.d + this.b, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "adb7bb7c73060ff6f69534f7cb33311b");
                        break;
                    }
                case DIAGONAL_FROM_TOP_LEFT:
                    Object[] objArr15 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect15 = a;
                    if (!PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "369fd6ae4f710a36255b5fd04c5e1b73", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(this.d, this.d, this.d + this.c, this.d + this.c), this.b, this.b, paint);
                        canvas.drawRoundRect(new RectF(f3 - this.c, f4 - this.c, f3, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d + this.b, f3 - this.c, f4), paint);
                        canvas.drawRect(new RectF(this.d + this.c, this.d, f3, f4 - this.b), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "369fd6ae4f710a36255b5fd04c5e1b73");
                        break;
                    }
                case DIAGONAL_FROM_TOP_RIGHT:
                    Object[] objArr16 = {canvas, paint, Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect16 = a;
                    if (!PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "df1337a8e7da3fd85280e5c65d35f42f", 6917529027641081856L)) {
                        canvas.drawRoundRect(new RectF(f3 - this.c, this.d, f3, this.d + this.c), this.b, this.b, paint);
                        canvas.drawRoundRect(new RectF(this.d, f4 - this.c, this.d + this.c, f4), this.b, this.b, paint);
                        canvas.drawRect(new RectF(this.d, this.d, f3 - this.b, f4 - this.b), paint);
                        canvas.drawRect(new RectF(this.d + this.b, this.d + this.b, f3, f4), paint);
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "df1337a8e7da3fd85280e5c65d35f42f");
                        break;
                    }
                default:
                    canvas.drawRoundRect(new RectF(this.d, this.d, f3, f4), this.b, this.b, paint);
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b637aa8cfd468c84924e370ce4bac6d3");
        }
        return createBitmap;
    }

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9a3f6258048defbe2a5b6cb34c8468", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9a3f6258048defbe2a5b6cb34c8468");
        }
        return "RoundedTransformation(radius=" + this.b + ", margin=" + this.d + ", diameter=" + this.c + ", cornerType=" + this.e.name() + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
