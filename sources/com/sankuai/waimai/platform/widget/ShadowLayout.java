package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShadowLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return 0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return 0;
    }

    public ShadowLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb274e22cc0c17d1c90f2176787d81c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb274e22cc0c17d1c90f2176787d81c");
            return;
        }
        this.g = true;
        this.h = false;
        a(context, (AttributeSet) null);
    }

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d919d17001de080a60b1ed8230c88bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d919d17001de080a60b1ed8230c88bb");
            return;
        }
        this.g = true;
        this.h = false;
        a(context, attributeSet);
    }

    public ShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c544353658faaf04dd6028b83dd18e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c544353658faaf04dd6028b83dd18e7");
            return;
        }
        this.g = true;
        this.h = false;
        a(context, attributeSet);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deecc8f22f1acfdd75086ff7aac4450a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deecc8f22f1acfdd75086ff7aac4450a");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (getBackground() == null || this.g || this.h) {
            this.h = false;
            a(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c714d8e0fbd4c82ca278f20a7ea796e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c714d8e0fbd4c82ca278f20a7ea796e3");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.h) {
            this.h = false;
            a(i3 - i, i4 - i2);
        }
    }

    public void setInvalidateShadowOnSizeChanged(boolean z) {
        this.g = z;
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e658a2312cafea08303d4c29a1a2cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e658a2312cafea08303d4c29a1a2cc");
            return;
        }
        b(context, attributeSet);
        int abs = (int) (this.c + Math.abs(this.e));
        int abs2 = (int) (this.c + Math.abs(this.f));
        setPadding(abs, abs2, abs, abs2);
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "312e48cc89d7a50b2e7cd1ad54822af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "312e48cc89d7a50b2e7cd1ad54822af3");
            return;
        }
        Bitmap a2 = a(i, i2, this.d, this.c, this.e, this.f, this.b, 0);
        if (a2 != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), a2);
            if (Build.VERSION.SDK_INT <= 16) {
                setBackgroundDrawable(bitmapDrawable);
            } else {
                setBackground(bitmapDrawable);
            }
        }
    }

    private void b(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853061cec0a0b99ec798796594ec8888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853061cec0a0b99ec798796594ec8888");
            return;
        }
        TypedArray a2 = a(context, attributeSet, new int[]{R.attr.shadowColor, R.attr.shadowRadius, R.attr.shadowDx, R.attr.shadowDy, R.attr.shadowRx, R.attr.shadowRy, R.attr.shadowShape, R.attr.shadowSide, R.attr.sl_cornerRadius, R.attr.sl_shadowRadius, R.attr.sl_shadowColor, R.attr.sl_dx, R.attr.sl_dy});
        if (a2 == null) {
            return;
        }
        try {
            this.d = a2.getDimension(8, getResources().getDimension(R.dimen.wm_shadow_default_corner_radius));
            this.c = a2.getDimension(9, getResources().getDimension(R.dimen.wm_shadow_default_radius));
            this.e = a2.getDimension(11, 0.0f);
            this.f = a2.getDimension(12, 0.0f);
            this.b = a2.getColor(10, getResources().getColor(R.color.wm_default_shadow_color));
        } finally {
            a2.recycle();
        }
    }

    private TypedArray a(Context context, AttributeSet attributeSet, int[] iArr) {
        Object[] objArr = {context, attributeSet, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603257261f81dee2a05fd8fb1ed1d15d", RobustBitConfig.DEFAULT_VALUE) ? (TypedArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603257261f81dee2a05fd8fb1ed1d15d") : context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private Bitmap a(int i, int i2, float f, float f2, float f3, float f4, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i3), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424a2a0c29bdd91e7549be3209bf328b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424a2a0c29bdd91e7549be3209bf328b");
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        if (createBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(f2, f2, i - f2, i2 - f2);
        if (f4 > 0.0f) {
            rectF.top += f4;
            rectF.bottom -= f4;
        } else if (f4 < 0.0f) {
            rectF.top += Math.abs(f4);
            rectF.bottom -= Math.abs(f4);
        }
        if (f3 > 0.0f) {
            rectF.left += f3;
            rectF.right -= f3;
        } else if (f3 < 0.0f) {
            rectF.left += Math.abs(f3);
            rectF.right -= Math.abs(f3);
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        if (!isInEditMode()) {
            paint.setShadowLayer(f2, f3, f4, i3);
        }
        canvas.drawRoundRect(rectF, f, f, paint);
        return createBitmap;
    }
}
