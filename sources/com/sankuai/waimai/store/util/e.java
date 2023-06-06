package com.sankuai.waimai.store.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1b8c626e1ac6f0b261f30ef007654ab", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1b8c626e1ac6f0b261f30ef007654ab") : new c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public int a;
        public int b;
        public float[] c;
        public int d;
        public float e;
        public float f;
        @ColorInt
        public int g;
        @ColorInt
        public int h;
        @ColorInt
        public int[] i;
        public int j;
        public GradientDrawable.Orientation k;

        public b() {
            this.a = -1;
            this.b = -1;
            this.c = null;
            this.j = 0;
            this.k = GradientDrawable.Orientation.BL_TR;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final b b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e036f31ad3dd06119246ee7ec49bc57", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e036f31ad3dd06119246ee7ec49bc57");
            } else {
                this.b = new b();
            }
        }

        public final Drawable a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b188e95364ebea985aff00827bc9a35a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b188e95364ebea985aff00827bc9a35a");
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(this.b.j);
            if (this.b.c != null) {
                float f = this.b.c[0];
                float f2 = this.b.c[1];
                float f3 = this.b.c[2];
                float f4 = this.b.c[3];
                gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
            } else {
                gradientDrawable.setCornerRadius(0.0f);
            }
            if (this.b.i != null && this.b.i.length > 0) {
                gradientDrawable.setOrientation(this.b.k);
                gradientDrawable.setColors(this.b.i);
            } else {
                gradientDrawable.setColor(this.b.g);
            }
            if (this.b.d > 0) {
                gradientDrawable.setStroke(this.b.d, this.b.h, this.b.e, this.b.f);
            }
            this.b.a = this.b.a >= 0 ? this.b.a : gradientDrawable.getBounds().width();
            this.b.b = this.b.b >= 0 ? this.b.b : gradientDrawable.getBounds().height();
            gradientDrawable.setSize(this.b.a, this.b.b);
            return gradientDrawable;
        }

        public final a a(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a79af096dfccac242edc57598a50c6", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a79af096dfccac242edc57598a50c6");
            }
            this.b.c = new float[]{f, f, f, f};
            return this;
        }

        public final a a(float f, float f2, float f3, float f4) {
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986d9f83ff4d46175bee61ebe1f232c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986d9f83ff4d46175bee61ebe1f232c1");
            }
            this.b.c = new float[]{f, f2, f4, f3};
            return this;
        }

        public final a a(@ColorInt int i) {
            this.b.h = i;
            return this;
        }

        public final a b(int i) {
            this.b.d = i;
            return this;
        }

        public final a c(@ColorInt int i) {
            this.b.g = i;
            return this;
        }

        public final a a(@NonNull GradientDrawable.Orientation orientation, @NonNull @ColorInt int[] iArr) {
            this.b.k = orientation;
            this.b.i = iArr;
            return this;
        }

        public final a d(int i) {
            if (i >= 0) {
                this.b.a = i;
            }
            return this;
        }

        public final a e(int i) {
            if (i >= 0) {
                this.b.b = i;
            }
            return this;
        }
    }

    public static Drawable a(Context context, @DrawableRes int i, @ColorInt int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47b1a27376f73113fd9fef79c6dba2b5", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47b1a27376f73113fd9fef79c6dba2b5") : a(ContextCompat.getDrawable(context, i), i2);
    }

    public static Drawable a(@NonNull Drawable drawable, @ColorInt int i) {
        Object[] objArr = {drawable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f72b10116ed96fee4e391b9d74916966", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f72b10116ed96fee4e391b9d74916966");
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        DrawableCompat.setTintList(mutate, ColorStateList.valueOf(i));
        return mutate;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public StateListDrawable b;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a271f7a6cd09df9ca55b680e7349ce42", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a271f7a6cd09df9ca55b680e7349ce42");
            } else {
                this.b = new StateListDrawable();
            }
        }

        public final c a(@NonNull int[] iArr, @NonNull Drawable drawable) {
            Object[] objArr = {iArr, drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1495a925a1d2d9e65b2421a22f7c153", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1495a925a1d2d9e65b2421a22f7c153");
            }
            this.b.addState(iArr, drawable);
            return this;
        }

        public final c a(@NonNull Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c08a85d50193885338a13ef9758a6f3", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c08a85d50193885338a13ef9758a6f3");
            }
            this.b.addState(new int[0], drawable);
            return this;
        }
    }

    public static Drawable b(@NonNull Context context, @ColorRes int i, @DimenRes int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00c8760cbc4553238dedd018b5f11ac4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00c8760cbc4553238dedd018b5f11ac4");
        }
        a aVar = new a();
        aVar.a(context.getResources().getDimensionPixelOffset(i2)).c(ContextCompat.getColor(context, i));
        return aVar.a();
    }

    public static Drawable a(@NonNull Context context, @ColorRes int[] iArr, @DimenRes int i) {
        Object[] objArr = {context, iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd97c11476a93dff1bce995cac1ed56b", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd97c11476a93dff1bce995cac1ed56b") : b(context, iArr, i, GradientDrawable.Orientation.LEFT_RIGHT);
    }

    public static Drawable b(@NonNull Context context, @ColorRes int[] iArr, @DimenRes int i) {
        Object[] objArr = {context, iArr, Integer.valueOf((int) R.dimen.wm_sc_common_dimen_0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81584fecc4d2138bf0eb90ebf74583a3", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81584fecc4d2138bf0eb90ebf74583a3") : b(context, iArr, R.dimen.wm_sc_common_dimen_0, GradientDrawable.Orientation.TOP_BOTTOM);
    }

    private static Drawable b(@NonNull Context context, @ColorRes int[] iArr, @DimenRes int i, GradientDrawable.Orientation orientation) {
        Object[] objArr = {context, iArr, Integer.valueOf(i), orientation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fdec47a68013d0ac0cfc9377335d257", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fdec47a68013d0ac0cfc9377335d257");
        }
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        if (iArr.length == 1) {
            return b(context, iArr[0], i);
        }
        int color = ContextCompat.getColor(context, iArr[0]);
        int color2 = ContextCompat.getColor(context, iArr[1]);
        a aVar = new a();
        aVar.a(context.getResources().getDimensionPixelOffset(i)).a(orientation, new int[]{color, color2});
        return aVar.a();
    }

    public static Drawable a(@NonNull Context context, @ColorInt int[] iArr, @DimenRes int i, GradientDrawable.Orientation orientation) {
        Object[] objArr = {context, iArr, Integer.valueOf(i), orientation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92fcfb2c057fe7c6c93efe2277d16efc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92fcfb2c057fe7c6c93efe2277d16efc");
        }
        a aVar = new a();
        aVar.a(context.getResources().getDimensionPixelOffset(i)).a(orientation, iArr);
        return aVar.a();
    }
}
