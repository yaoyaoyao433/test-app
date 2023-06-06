package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
/* compiled from: ProGuard */
@RequiresApi(9)
/* loaded from: classes.dex */
public class k {
    final TextView a;
    @NonNull
    final m b;
    private au c;
    private au d;
    private au e;
    private au f;
    private int g = 0;
    private Typeface h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 17) {
            return new l(textView);
        }
        return new k(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(TextView textView) {
        this.a = textView;
        this.b = new m(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        boolean z;
        ColorStateList colorStateList2;
        boolean z2;
        ColorStateList colorStateList3;
        boolean z3;
        int resourceId;
        ColorStateList colorStateList4;
        ColorStateList colorStateList5;
        Context context = this.a.getContext();
        g a = g.a();
        aw a2 = aw.a(context, attributeSet, new int[]{16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667}, i, 0);
        int g = a2.g(0, -1);
        if (a2.f(3)) {
            this.c = a(context, a, a2.g(3, 0));
        }
        if (a2.f(1)) {
            this.d = a(context, a, a2.g(1, 0));
        }
        if (a2.f(4)) {
            this.e = a(context, a, a2.g(4, 0));
        }
        if (a2.f(2)) {
            this.f = a(context, a, a2.g(2, 0));
        }
        a2.a.recycle();
        boolean z4 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            aw a3 = aw.a(context, g, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily});
            if (z4 || !a3.f(11)) {
                z = false;
                z2 = false;
            } else {
                z2 = a3.a(11, false);
                z = true;
            }
            a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList4 = a3.f(3) ? a3.e(3) : null;
                colorStateList3 = a3.f(4) ? a3.e(4) : null;
                colorStateList5 = a3.f(5) ? a3.e(5) : null;
            } else {
                colorStateList4 = null;
                colorStateList5 = null;
                colorStateList3 = null;
            }
            a3.a.recycle();
            ColorStateList colorStateList6 = colorStateList5;
            colorStateList2 = colorStateList4;
            colorStateList = colorStateList6;
        } else {
            colorStateList = null;
            z = false;
            colorStateList2 = null;
            z2 = false;
            colorStateList3 = null;
        }
        aw a4 = aw.a(context, attributeSet, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily}, i, 0);
        if (z4 || !a4.f(11)) {
            z3 = z2;
        } else {
            z3 = a4.a(11, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.f(3)) {
                colorStateList2 = a4.e(3);
            }
            if (a4.f(4)) {
                colorStateList3 = a4.e(4);
            }
            if (a4.f(5)) {
                colorStateList = a4.e(5);
            }
        }
        ColorStateList colorStateList7 = colorStateList;
        ColorStateList colorStateList8 = colorStateList2;
        ColorStateList colorStateList9 = colorStateList3;
        a(context, a4);
        a4.a.recycle();
        if (colorStateList8 != null) {
            this.a.setTextColor(colorStateList8);
        }
        if (colorStateList9 != null) {
            this.a.setHintTextColor(colorStateList9);
        }
        if (colorStateList7 != null) {
            this.a.setLinkTextColor(colorStateList7);
        }
        if (!z4 && z) {
            a(z3);
        }
        if (this.h != null) {
            this.a.setTypeface(this.h, this.g);
        }
        m mVar = this.b;
        TypedArray obtainStyledAttributes = mVar.g.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.textAllCaps, R.attr.autoSizeTextType, R.attr.autoSizeStepGranularity, R.attr.autoSizePresetSizes, R.attr.autoSizeMinTextSize, R.attr.autoSizeMaxTextSize, R.attr.fontFamily}, i, 0);
        if (obtainStyledAttributes.hasValue(2)) {
            mVar.a = obtainStyledAttributes.getInt(2, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(3) ? obtainStyledAttributes.getDimension(3, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(5) ? obtainStyledAttributes.getDimension(5, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(6) ? obtainStyledAttributes.getDimension(6, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(4) && (resourceId = obtainStyledAttributes.getResourceId(4, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = obtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                mVar.e = m.a(iArr);
                mVar.a();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (mVar.e()) {
            if (mVar.a == 1) {
                if (!mVar.f) {
                    DisplayMetrics displayMetrics = mVar.g.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    mVar.a(dimension2, dimension3, dimension);
                }
                mVar.b();
            }
        } else {
            mVar.a = 0;
        }
        if (Build.VERSION.SDK_INT < 26 || this.b.a == 0) {
            return;
        }
        int[] iArr2 = this.b.e;
        if (iArr2.length > 0) {
            if (this.a.getAutoSizeStepGranularity() != -1.0f) {
                this.a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.b.c), Math.round(this.b.d), Math.round(this.b.b), 0);
            } else {
                this.a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
            }
        }
    }

    private void a(Context context, aw awVar) {
        this.g = awVar.a(2, this.g);
        if (awVar.f(10) || awVar.f(12)) {
            this.h = null;
            int i = awVar.f(10) ? 10 : 12;
            if (!context.isRestricted()) {
                try {
                    this.h = awVar.a(i, this.g, this.a);
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.h == null) {
                this.h = Typeface.create(awVar.d(i), this.g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Context context, int i) {
        ColorStateList e;
        aw a = aw.a(context, i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily});
        if (a.f(11)) {
            a(a.a(11, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.f(3) && (e = a.e(3)) != null) {
            this.a.setTextColor(e);
        }
        a(context, a);
        a.a.recycle();
        if (this.h != null) {
            this.a.setTypeface(this.h, this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.c == null && this.d == null && this.e == null && this.f == null) {
            return;
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        a(compoundDrawables[0], this.c);
        a(compoundDrawables[1], this.d);
        a(compoundDrawables[2], this.e);
        a(compoundDrawables[3], this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Drawable drawable, au auVar) {
        if (drawable == null || auVar == null) {
            return;
        }
        g.a(drawable, auVar, this.a.getDrawableState());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static au a(Context context, g gVar, int i) {
        ColorStateList b = gVar.b(context, i);
        if (b != null) {
            au auVar = new au();
            auVar.d = true;
            auVar.a = b;
            return auVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(boolean z, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT < 26) {
            this.b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(int i, float f) {
        if (Build.VERSION.SDK_INT >= 26 || this.b.d()) {
            return;
        }
        b(i, f);
    }

    private void b(int i, float f) {
        this.b.a(i, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        this.b.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.b.a(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.b.a(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.b.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return Math.round(this.b.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        return Math.round(this.b.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        return Math.round(this.b.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] f() {
        return this.b.e;
    }
}
