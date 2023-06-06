package com.sankuai.waimai.store.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    private final Paint b;
    private EnumC1338a c;
    private final RectF d;
    private final RectF e;
    private float f;
    private boolean g;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC1338a {
        LEFT,
        UP,
        RIGHT,
        DOWN;
        
        public static ChangeQuickRedirect a;

        EnumC1338a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6531f4643e12c47d4225f7a8cb138ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6531f4643e12c47d4225f7a8cb138ff");
            }
        }

        public static EnumC1338a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e4e008081e42f61b98edc7a3ce0495c", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1338a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e4e008081e42f61b98edc7a3ce0495c") : (EnumC1338a) Enum.valueOf(EnumC1338a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC1338a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74628cbf76bed5286e3ebd2d04367c97", RobustBitConfig.DEFAULT_VALUE) ? (EnumC1338a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74628cbf76bed5286e3ebd2d04367c97") : (EnumC1338a[]) values().clone();
        }
    }

    private a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1e64a7cadea4b426422d006eb02d68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1e64a7cadea4b426422d006eb02d68");
            return;
        }
        this.b = new Paint();
        this.c = EnumC1338a.LEFT;
        this.d = new RectF(0.0f, 0.0f, i, i2);
        this.e = new RectF(this.d);
        this.b.setStrokeCap(Paint.Cap.ROUND);
        this.b.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b0e4b581befee447daefcc83807c4ff", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b0e4b581befee447daefcc83807c4ff")).intValue() : (int) this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2aa489d528571f6efd0feecc155d10b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2aa489d528571f6efd0feecc155d10b")).intValue() : (int) this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff9afcaaa5aec85524d9eae5491720f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff9afcaaa5aec85524d9eae5491720f");
            return;
        }
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8a146cce71f42f815659625c297987c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8a146cce71f42f815659625c297987c");
            return;
        }
        this.e.set(this.d);
        float strokeWidth = this.b.getStrokeWidth() / 8.0f;
        float f = 4.0f * strokeWidth;
        this.e.inset(f, f);
        float f2 = (this.e.left + this.e.right) / 2.0f;
        float f3 = (this.e.top + this.e.bottom) / 2.0f;
        Path path = new Path();
        try {
            switch (this.c) {
                case LEFT:
                    if (this.g) {
                        this.b.setStyle(Paint.Style.FILL_AND_STROKE);
                        path.moveTo(this.e.right, this.e.top);
                        path.lineTo(this.e.right, this.e.bottom);
                        path.lineTo(this.e.left, f3 - strokeWidth);
                        canvas.drawPath(path, this.b);
                        break;
                    } else {
                        this.b.setStyle(Paint.Style.STROKE);
                        canvas.drawLine(this.e.left, f3 - strokeWidth, this.e.right, this.e.top, this.b);
                        canvas.drawLine(this.e.left, f3 + strokeWidth, this.e.right, this.e.bottom, this.b);
                        break;
                    }
                case RIGHT:
                    if (this.g) {
                        this.b.setStyle(Paint.Style.FILL_AND_STROKE);
                        path.moveTo(this.e.left, this.e.top);
                        path.lineTo(this.e.left, this.e.bottom);
                        path.lineTo(this.e.right, f3 - strokeWidth);
                        canvas.drawPath(path, this.b);
                        break;
                    } else {
                        this.b.setStyle(Paint.Style.STROKE);
                        canvas.drawLine(this.e.left, this.e.top, this.e.right, f3 - strokeWidth, this.b);
                        canvas.drawLine(this.e.left, this.e.bottom, this.e.right, f3 + strokeWidth, this.b);
                        break;
                    }
                case UP:
                    if (this.g) {
                        this.b.setStyle(Paint.Style.FILL_AND_STROKE);
                        path.moveTo(this.e.left, this.e.bottom);
                        path.lineTo(this.e.right, this.e.bottom);
                        path.lineTo(f2 - strokeWidth, this.e.top);
                        canvas.drawPath(path, this.b);
                        break;
                    } else {
                        this.b.setStyle(Paint.Style.STROKE);
                        canvas.drawLine(f2 - strokeWidth, this.e.top, this.e.left, this.e.bottom, this.b);
                        canvas.drawLine(f2 + strokeWidth, this.e.top, this.e.right, this.e.bottom, this.b);
                        break;
                    }
                default:
                    if (this.g) {
                        this.b.setStyle(Paint.Style.FILL_AND_STROKE);
                        path.moveTo(this.e.left, this.e.top);
                        path.lineTo(this.e.right, this.e.top);
                        path.lineTo(f2 - strokeWidth, this.e.bottom);
                        canvas.drawPath(path, this.b);
                        break;
                    } else {
                        this.b.setStyle(Paint.Style.STROKE);
                        canvas.drawLine(this.e.left, this.e.top, f2 - strokeWidth, this.e.bottom, this.b);
                        canvas.drawLine(this.e.right, this.e.top, f2 + strokeWidth, this.e.bottom, this.b);
                        break;
                    }
            }
        } finally {
            path.close();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2988a4705195298d3336d87659700d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2988a4705195298d3336d87659700d1e");
        } else {
            this.d.set(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a2904eb31efcaaa0a23bb03720968c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a2904eb31efcaaa0a23bb03720968c");
        } else {
            this.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "577cf34d42e96e897adb5101a6646fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "577cf34d42e96e897adb5101a6646fa4");
        } else {
            this.b.setColorFilter(colorFilter);
        }
    }

    private static a a(int i, int i2, @ColorInt int i3, float f, @NonNull EnumC1338a enumC1338a) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), enumC1338a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b05338e3a45ca3de334ff0a98e3c2f35", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b05338e3a45ca3de334ff0a98e3c2f35");
        }
        a aVar = new a(i, i2);
        Object[] objArr2 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ff7a8e82f0fc8bd41dc6a06059392337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ff7a8e82f0fc8bd41dc6a06059392337");
        } else {
            aVar.b.setColor(i3);
            aVar.invalidateSelf();
        }
        Object[] objArr3 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "93b91ad7d67db32acafc5b77effa2eee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "93b91ad7d67db32acafc5b77effa2eee");
        } else {
            aVar.f = f;
            aVar.b.setStrokeWidth(aVar.f);
            aVar.invalidateSelf();
        }
        Object[] objArr4 = {enumC1338a};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "3ce994da53217c93976a1215f6a42afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "3ce994da53217c93976a1215f6a42afb");
        } else {
            aVar.c = enumC1338a;
            aVar.invalidateSelf();
        }
        return aVar;
    }

    public static a a(@NonNull Context context, @DimenRes int i, @DimenRes int i2, @ColorRes int i3, @DimenRes int i4, @NonNull EnumC1338a enumC1338a) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), enumC1338a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d22b1e6feba87fae27e39a3a901c6ddf", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d22b1e6feba87fae27e39a3a901c6ddf") : a(a(context, i), a(context, i2), c(context, i3), b(context, i4), enumC1338a);
    }

    public static a a(@NonNull Context context, @DimenRes int i, @DimenRes int i2, @ColorRes int i3, @NonNull EnumC1338a enumC1338a) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), enumC1338a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acc892fe64198dcd88dff796c933b6db", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acc892fe64198dcd88dff796c933b6db") : a(a(context, i), a(context, i2), c(context, i3), b(context, R.dimen.wm_sc_common_dimen_1), enumC1338a);
    }

    private static int a(@NonNull Context context, @DimenRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc5113418ee538ab29b1578167f98396", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc5113418ee538ab29b1578167f98396")).intValue() : context.getResources().getDimensionPixelSize(i);
    }

    private static float b(@NonNull Context context, @DimenRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "847467f64c5f133ce43d048e301ca5d4", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "847467f64c5f133ce43d048e301ca5d4")).floatValue() : context.getResources().getDimension(i);
    }

    private static int c(@NonNull Context context, @ColorRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0001725eb1146e26545625f4b51f254", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0001725eb1146e26545625f4b51f254")).intValue() : ContextCompat.getColor(context, i);
    }
}
