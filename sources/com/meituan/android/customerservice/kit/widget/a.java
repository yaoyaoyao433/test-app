package com.meituan.android.customerservice.kit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final ViewGroup b;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        C0249a a();
    }

    public a(@NonNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12dcb61ee1af247ab53c52c8d957aaa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12dcb61ee1af247ab53c52c8d957aaa0");
        } else {
            this.b = viewGroup;
        }
    }

    public static void a(ViewGroup.LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        Object[] objArr = {layoutParams, typedArray, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12a0d7090873bd449d0fa997d6c56e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12a0d7090873bd449d0fa997d6c56e5a");
            return;
        }
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    public final void a(int i, int i2) {
        C0249a a2;
        boolean z;
        char c2 = 2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6356294fc5210ec7ad205243ec057254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6356294fc5210ec7ad205243ec057254");
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - this.b.getPaddingLeft()) - this.b.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - this.b.getPaddingTop()) - this.b.getPaddingBottom();
        int childCount = this.b.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.b.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = childAt;
                    objArr2[1] = marginLayoutParams;
                    objArr2[c2] = Integer.valueOf(size);
                    objArr2[3] = Integer.valueOf(size2);
                    ChangeQuickRedirect changeQuickRedirect2 = C0249a.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c7ec6b23abe07f105adffa394f37efa9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c7ec6b23abe07f105adffa394f37efa9");
                    } else {
                        a2.a(marginLayoutParams, size, size2);
                        a2.k.leftMargin = marginLayoutParams.leftMargin;
                        a2.k.topMargin = marginLayoutParams.topMargin;
                        a2.k.rightMargin = marginLayoutParams.rightMargin;
                        a2.k.bottomMargin = marginLayoutParams.bottomMargin;
                        MarginLayoutParamsCompat.setMarginStart(a2.k, MarginLayoutParamsCompat.getMarginStart(marginLayoutParams));
                        MarginLayoutParamsCompat.setMarginEnd(a2.k, MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams));
                        if (a2.d >= 0.0f) {
                            marginLayoutParams.leftMargin = Math.round(size * a2.d);
                        }
                        if (a2.e >= 0.0f) {
                            marginLayoutParams.topMargin = Math.round(size2 * a2.e);
                        }
                        if (a2.f >= 0.0f) {
                            marginLayoutParams.rightMargin = Math.round(size * a2.f);
                        }
                        if (a2.g >= 0.0f) {
                            marginLayoutParams.bottomMargin = Math.round(size2 * a2.g);
                        }
                        if (a2.h >= 0.0f) {
                            MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, Math.round(size * a2.h));
                            z = true;
                        } else {
                            z = false;
                        }
                        if (a2.i >= 0.0f) {
                            MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, Math.round(size * a2.i));
                            z = true;
                        }
                        if (z && childAt != null) {
                            MarginLayoutParamsCompat.resolveLayoutDirection(marginLayoutParams, ViewCompat.getLayoutDirection(childAt));
                        }
                    }
                } else {
                    a2.a(layoutParams, size, size2);
                }
            }
            i3++;
            c2 = 2;
        }
    }

    public static C0249a a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        C0249a c0249a = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5ec97605f1502f034f7e6c60e8d8638", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0249a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5ec97605f1502f034f7e6c60e8d8638");
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cs_layout_widthPercent, R.attr.cs_layout_heightPercent, R.attr.cs_layout_marginPercent, R.attr.cs_layout_marginLeftPercent, R.attr.cs_layout_marginTopPercent, R.attr.cs_layout_marginRightPercent, R.attr.cs_layout_marginBottomPercent, R.attr.cs_layout_marginStartPercent, R.attr.cs_layout_marginEndPercent, R.attr.cs_layout_aspectRatio});
        float fraction = obtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction, -1.0f)) {
            c0249a = new C0249a();
            c0249a.b = fraction;
        }
        float fraction2 = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction2, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.c = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction3, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.d = fraction3;
            c0249a.e = fraction3;
            c0249a.f = fraction3;
            c0249a.g = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction4, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.d = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction5, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.e = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction6, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.f = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction7, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.g = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction8, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.h = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction9, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.i = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (!com.meituan.android.customerservice.kit.utils.c.a(fraction10, -1.0f)) {
            if (c0249a == null) {
                c0249a = new C0249a();
            }
            c0249a.j = fraction10;
        }
        obtainStyledAttributes.recycle();
        return c0249a;
    }

    public final void a() {
        C0249a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bee5ee47e10c9eb651894e109096a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bee5ee47e10c9eb651894e109096a2");
            return;
        }
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = this.b.getChildAt(i).getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    Object[] objArr2 = {marginLayoutParams};
                    ChangeQuickRedirect changeQuickRedirect2 = C0249a.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "331680ce8fa63a0efa2473933d0a4d92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "331680ce8fa63a0efa2473933d0a4d92");
                    } else {
                        a2.a(marginLayoutParams);
                        marginLayoutParams.leftMargin = a2.k.leftMargin;
                        marginLayoutParams.topMargin = a2.k.topMargin;
                        marginLayoutParams.rightMargin = a2.k.rightMargin;
                        marginLayoutParams.bottomMargin = a2.k.bottomMargin;
                        MarginLayoutParamsCompat.setMarginStart(marginLayoutParams, MarginLayoutParamsCompat.getMarginStart(a2.k));
                        MarginLayoutParamsCompat.setMarginEnd(marginLayoutParams, MarginLayoutParamsCompat.getMarginEnd(a2.k));
                    }
                } else {
                    a2.a(layoutParams);
                }
            }
        }
    }

    public final boolean b() {
        C0249a a2;
        boolean z;
        boolean z2;
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b78537e4c6e0f64cb7a2e20efc06322c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b78537e4c6e0f64cb7a2e20efc06322c")).booleanValue();
        }
        int childCount = this.b.getChildCount();
        int i = 0;
        boolean z3 = false;
        while (i < childCount) {
            View childAt = this.b.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b) && (a2 = ((b) layoutParams).a()) != null) {
                Object[] objArr2 = new Object[2];
                objArr2[c2] = childAt;
                objArr2[1] = a2;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "87b9245f89243d1796203a379844dc1a", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "87b9245f89243d1796203a379844dc1a")).booleanValue();
                } else {
                    z = (childAt.getMeasuredWidthAndState() & (-16777216)) == 16777216 && a2.b >= 0.0f && a2.k.width == -2;
                }
                if (z) {
                    layoutParams.width = -2;
                    z3 = true;
                }
                Object[] objArr3 = {childAt, a2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5bd6e268822c7fa8a8c4762980608189", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5bd6e268822c7fa8a8c4762980608189")).booleanValue();
                } else {
                    z2 = (childAt.getMeasuredHeightAndState() & (-16777216)) == 16777216 && a2.c >= 0.0f && a2.k.height == -2;
                }
                if (z2) {
                    layoutParams.height = -2;
                    z3 = true;
                }
            }
            i++;
            c2 = 0;
        }
        return z3;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.kit.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0249a {
        public static ChangeQuickRedirect a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public float j;
        public final c k;

        public C0249a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ec2d42e3bab2e94428a7f987f6fd7d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ec2d42e3bab2e94428a7f987f6fd7d");
                return;
            }
            this.b = -1.0f;
            this.c = -1.0f;
            this.d = -1.0f;
            this.e = -1.0f;
            this.f = -1.0f;
            this.g = -1.0f;
            this.h = -1.0f;
            this.i = -1.0f;
            this.k = new c(0, 0);
        }

        public final void a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
            boolean z = false;
            Object[] objArr = {layoutParams, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd77e33a36186bf0f2275caa39abca1a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd77e33a36186bf0f2275caa39abca1a");
                return;
            }
            this.k.width = layoutParams.width;
            this.k.height = layoutParams.height;
            boolean z2 = (this.k.c || this.k.width == 0) && this.b < 0.0f;
            if ((this.k.b || this.k.height == 0) && this.c < 0.0f) {
                z = true;
            }
            if (this.b >= 0.0f) {
                layoutParams.width = Math.round(i * this.b);
            }
            if (this.c >= 0.0f) {
                layoutParams.height = Math.round(i2 * this.c);
            }
            if (this.j >= 0.0f) {
                if (z2) {
                    layoutParams.width = Math.round(layoutParams.height * this.j);
                    this.k.c = true;
                }
                if (z) {
                    layoutParams.height = Math.round(layoutParams.width / this.j);
                    this.k.b = true;
                }
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c0920e1626a6e6372217374e0463b1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c0920e1626a6e6372217374e0463b1") : String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.i));
        }

        public final void a(ViewGroup.LayoutParams layoutParams) {
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc63f7196d3b163944f2a75021efa15", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc63f7196d3b163944f2a75021efa15");
                return;
            }
            if (!this.k.c) {
                layoutParams.width = this.k.width;
            }
            if (!this.k.b) {
                layoutParams.height = this.k.height;
            }
            this.k.c = false;
            this.k.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public static ChangeQuickRedirect a;
        private boolean b;
        private boolean c;

        public c(int i, int i2) {
            super(0, 0);
            Object[] objArr = {0, 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fee91016a92b163602b21df07ccfaa13", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fee91016a92b163602b21df07ccfaa13");
            }
        }
    }
}
