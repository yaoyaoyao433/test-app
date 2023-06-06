package com.meituan.roodesign.widgets.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.internal.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooButton extends AppCompatButton {
    public static ChangeQuickRedirect a;
    @Nullable
    private final b b;
    @Px
    private int c;
    private PorterDuff.Mode d;
    private ColorStateList e;
    private Drawable f;
    @Px
    private int g;
    @Px
    private int h;
    private int i;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface IconGravity {
    }

    public void setIconGravitation(int i) {
    }

    public RooButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "003566e5591bb183a593cde61d9bc0a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "003566e5591bb183a593cde61d9bc0a8");
        }
    }

    public RooButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooButtonStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e27b4ed2f060b7d2ce8aad3cd5dae22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e27b4ed2f060b7d2ce8aad3cd5dae22");
        }
    }

    public RooButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42f37781ca56c3d1afc86b24489b863d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42f37781ca56c3d1afc86b24489b863d");
            return;
        }
        setLayerType(1, null);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16843191, 16843192, 16843193, 16843194, 16843237, R.attr.cornerRadius, R.attr.strokeColor, R.attr.strokeWidth, R.attr.icon, R.attr.iconTint, R.attr.iconTintMode, R.attr.iconSize, R.attr.iconPadding, R.attr.iconGravitation, R.attr.backgroundTint, R.attr.backgroundTintMode}, i, 2131559093);
        this.c = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.d = d.a(obtainStyledAttributes.getInt(10, -1), PorterDuff.Mode.SRC_IN);
        this.e = com.meituan.roodesign.widgets.resources.b.a(getContext(), obtainStyledAttributes, 9);
        this.f = com.meituan.roodesign.widgets.resources.b.b(getContext(), obtainStyledAttributes, 8);
        this.i = obtainStyledAttributes.getInteger(13, 1);
        this.g = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.b = new b(this);
        b bVar = this.b;
        Object[] objArr2 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c8c9fb5b706bf97219445ed5ddbf9d51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c8c9fb5b706bf97219445ed5ddbf9d51");
        } else {
            bVar.c = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            bVar.d = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            bVar.e = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            bVar.f = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            bVar.g = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            bVar.h = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            bVar.i = d.a(obtainStyledAttributes.getInt(15, -1), PorterDuff.Mode.SRC_IN);
            bVar.j = com.meituan.roodesign.widgets.resources.b.a(bVar.b.getContext(), obtainStyledAttributes, 14);
            bVar.k = com.meituan.roodesign.widgets.resources.b.a(bVar.b.getContext(), obtainStyledAttributes, 6);
            int paddingStart = ViewCompat.getPaddingStart(bVar.b);
            int paddingTop = bVar.b.getPaddingTop();
            int paddingEnd = ViewCompat.getPaddingEnd(bVar.b);
            int paddingBottom = bVar.b.getPaddingBottom();
            if (bVar.j == null) {
                bVar.a();
            } else {
                bVar.b.setInternalBackground(bVar.c());
            }
            ViewCompat.setPaddingRelative(bVar.b, paddingStart + bVar.c, paddingTop + bVar.e, paddingEnd + bVar.d, paddingBottom + bVar.f);
        }
        obtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.c);
        a();
    }

    @Override // android.support.v7.widget.AppCompatButton, android.support.v4.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f121a8a8fad75fd4d8b9111fad226b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f121a8a8fad75fd4d8b9111fad226b6b");
        } else if (b()) {
            b bVar = this.b;
            Object[] objArr2 = {colorStateList};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "53c85c510d6b0dd1431a43010536b3b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "53c85c510d6b0dd1431a43010536b3b7");
            } else if (bVar.j != colorStateList) {
                bVar.j = colorStateList;
                bVar.b();
            }
        } else if (this.b != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.support.v4.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b58cde6dcef1947f22e5c99a84f84bbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorStateList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b58cde6dcef1947f22e5c99a84f84bbf");
        }
        if (!b()) {
            return super.getSupportBackgroundTintList();
        }
        return this.b.j;
    }

    @Override // android.support.v7.widget.AppCompatButton, android.support.v4.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Object[] objArr = {mode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36e1402d478d4d2cbafae1438245c159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36e1402d478d4d2cbafae1438245c159");
        } else if (b()) {
            b bVar = this.b;
            Object[] objArr2 = {mode};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e8d7a73355e5a2a0edeb25b8edc0c701", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e8d7a73355e5a2a0edeb25b8edc0c701");
            } else if (bVar.i != mode) {
                bVar.i = mode;
                bVar.b();
            }
        } else if (this.b != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.support.v4.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f9f3d0e932bbd471e3d94aace46fa5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (PorterDuff.Mode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f9f3d0e932bbd471e3d94aace46fa5f");
        }
        if (!b()) {
            return super.getSupportBackgroundTintMode();
        }
        return this.b.i;
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57208fccf84a97cbf90921558311df14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57208fccf84a97cbf90921558311df14");
        } else {
            setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "411aef214e13aa5de521fb5f801e5635", RobustBitConfig.DEFAULT_VALUE) ? (ColorStateList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "411aef214e13aa5de521fb5f801e5635") : getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Object[] objArr = {mode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d93c1a45dd0e7b78e99f59cbf1d6075c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d93c1a45dd0e7b78e99f59cbf1d6075c");
        } else {
            setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44007d8db36114695263d51c2c8cbdd", RobustBitConfig.DEFAULT_VALUE) ? (PorterDuff.Mode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44007d8db36114695263d51c2c8cbdd") : getSupportBackgroundTintMode();
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206d7d52130bcaefd0f9b383b4d16902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206d7d52130bcaefd0f9b383b4d16902");
        } else if (b()) {
            b bVar = this.b;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "269bf785e042c000ed5b8a3339bd807e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "269bf785e042c000ed5b8a3339bd807e");
            } else if (bVar.l != null) {
                bVar.l.setColor(i);
            }
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab7f1c9af7731ed3c21bf0cb955945b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab7f1c9af7731ed3c21bf0cb955945b");
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed0d877516d084519b03b063672773f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed0d877516d084519b03b063672773f");
        } else {
            setBackgroundDrawable(i != 0 ? android.support.v7.content.res.b.b(getContext(), i) : null);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e535c0d13f2fa7dc5e12865e1ffe52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e535c0d13f2fa7dc5e12865e1ffe52b");
            return;
        }
        if (b()) {
            if (drawable != getBackground()) {
                this.b.a();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5887964037813ce5015713d92ae0f552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5887964037813ce5015713d92ae0f552");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.support.v7.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cebef31c83317784074d856e1a7de67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cebef31c83317784074d856e1a7de67");
        } else {
            super.drawableStateChanged();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e169afec05b17aab523800fe5540f7b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e169afec05b17aab523800fe5540f7b1");
            return;
        }
        super.onMeasure(i, i2);
        if (this.f == null || this.i != 2) {
            return;
        }
        int measuredWidth = (((((getMeasuredWidth() - ((int) getPaint().measureText(getText().toString()))) - ViewCompat.getPaddingEnd(this)) - (this.g == 0 ? this.f.getIntrinsicWidth() : this.g)) - this.c) - ViewCompat.getPaddingStart(this)) / 2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d2483fb7bdbc10c8061baaf04e1844d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d2483fb7bdbc10c8061baaf04e1844d")).booleanValue();
        } else if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        }
        if (z) {
            measuredWidth = -measuredWidth;
        }
        if (this.h != measuredWidth) {
            this.h = measuredWidth;
            a();
        }
    }

    public void setInternalBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a38e3be493a5e6bdaa59e7817bfecfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a38e3be493a5e6bdaa59e7817bfecfc");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setIconPadding(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "701b627b85e0fc4cae10c97cb8228036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "701b627b85e0fc4cae10c97cb8228036");
        } else if (this.c != i) {
            this.c = i;
            setCompoundDrawablePadding(i);
        }
    }

    @Px
    public int getIconPadding() {
        return this.c;
    }

    public void setIconSize(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f41d7d8bb9cb5ea683413584ca3bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f41d7d8bb9cb5ea683413584ca3bef");
        } else if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else {
            if (this.g != i) {
                this.g = i;
                a();
            }
        }
    }

    @Px
    public int getIconSize() {
        return this.g;
    }

    public void setIcon(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35834c89734abca7027e6e76fcb5118e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35834c89734abca7027e6e76fcb5118e");
        } else if (this.f != drawable) {
            this.f = drawable;
            a();
        }
    }

    public void setIcon(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8814f266742deb3302ed9bba53c4d92c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8814f266742deb3302ed9bba53c4d92c");
        } else {
            setIcon(i != 0 ? android.support.v7.content.res.b.b(getContext(), i) : null);
        }
    }

    public Drawable getIcon() {
        return this.f;
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8837aa9b4cec4ec74ae734f223f9815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8837aa9b4cec4ec74ae734f223f9815");
        } else if (this.e != colorStateList) {
            this.e = colorStateList;
            a();
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26363ec17a2ec4dd7bd95bed81b44d46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26363ec17a2ec4dd7bd95bed81b44d46");
        } else {
            setIconTint(android.support.v7.content.res.b.a(getContext(), i));
        }
    }

    public ColorStateList getIconTint() {
        return this.e;
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        Object[] objArr = {mode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399835e9fc51f544537f45ce2227c453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399835e9fc51f544537f45ce2227c453");
        } else if (this.d != mode) {
            this.d = mode;
            a();
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.d;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181ae9d5782a683bdb62e9dcda3527a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181ae9d5782a683bdb62e9dcda3527a8");
            return;
        }
        if (this.f != null) {
            this.f = this.f.mutate();
            DrawableCompat.setTintList(this.f, this.e);
            if (this.d != null) {
                DrawableCompat.setTintMode(this.f, this.d);
            }
            this.f.setBounds(this.h, 0, this.h + (this.g != 0 ? this.g : this.f.getIntrinsicWidth()), this.g != 0 ? this.g : this.f.getIntrinsicHeight());
        }
        TextViewCompat.setCompoundDrawablesRelative(this, this.f, null, null, null);
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0a5f19b6d7613a8e22e84e65a7db00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0a5f19b6d7613a8e22e84e65a7db00");
        } else if (b()) {
            b bVar = this.b;
            Object[] objArr2 = {colorStateList};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "412e0fe57c3de00dbce5a53f07c98e92", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "412e0fe57c3de00dbce5a53f07c98e92");
            } else if (bVar.k != colorStateList) {
                bVar.k = colorStateList;
                bVar.d();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46db3d67927d1facba35e33b462db7cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46db3d67927d1facba35e33b462db7cd");
        } else if (b()) {
            setStrokeColor(android.support.v7.content.res.b.a(getContext(), i));
        }
    }

    public ColorStateList getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "617f44a36e3c6909d542e703b845d3c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorStateList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "617f44a36e3c6909d542e703b845d3c7");
        }
        if (b()) {
            return this.b.k;
        }
        return null;
    }

    public void setStrokeWidth(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8774cd2dcdb1f1716c731a8044e4bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8774cd2dcdb1f1716c731a8044e4bc6");
        } else if (b()) {
            b bVar = this.b;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f87f4453fbfb00fe3ef23799e8fc9686", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f87f4453fbfb00fe3ef23799e8fc9686");
            } else if (bVar.h != i) {
                bVar.h = i;
                bVar.d();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b94316bb033d31881d33bfd96387ebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b94316bb033d31881d33bfd96387ebe");
        } else if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Px
    public int getStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28e67aaa12673a1c77106cae651804bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28e67aaa12673a1c77106cae651804bd")).intValue();
        }
        if (b()) {
            return this.b.h;
        }
        return 0;
    }

    public void setCornerRadius(@Px int i) {
        GradientDrawable gradientDrawable;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a467099f88ef533a90ba4a0a09215553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a467099f88ef533a90ba4a0a09215553");
        } else if (b()) {
            b bVar = this.b;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "564802131464ec399086b25488cbb87f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "564802131464ec399086b25488cbb87f");
            } else if (bVar.g != i) {
                bVar.g = i;
                if (bVar.l == null || bVar.m == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT == 21) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    GradientDrawable gradientDrawable2 = null;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "86abd2d2d7deda3b8ae3c8ec08f71fbb", RobustBitConfig.DEFAULT_VALUE)) {
                        gradientDrawable = (GradientDrawable) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "86abd2d2d7deda3b8ae3c8ec08f71fbb");
                    } else {
                        gradientDrawable = bVar.b.getBackground() != null ? (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((LayerDrawable) bVar.b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0) : null;
                    }
                    float f = i + 1.0E-5f;
                    gradientDrawable.setCornerRadius(f);
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "9fde0fd094504e12bebe5d2ca2688675", RobustBitConfig.DEFAULT_VALUE)) {
                        gradientDrawable2 = (GradientDrawable) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "9fde0fd094504e12bebe5d2ca2688675");
                    } else if (bVar.b.getBackground() != null) {
                        gradientDrawable2 = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((LayerDrawable) bVar.b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
                    }
                    gradientDrawable2.setCornerRadius(f);
                }
                float f2 = i + 1.0E-5f;
                bVar.l.setCornerRadius(f2);
                bVar.m.setCornerRadius(f2);
            }
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba2fdd82cb56ef1dd1e95c6c9144de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba2fdd82cb56ef1dd1e95c6c9144de9");
        } else if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Px
    public int getCornerRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd9ff54d55f4c62938bc5fc3749b245e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd9ff54d55f4c62938bc5fc3749b245e")).intValue();
        }
        if (b()) {
            return this.b.g;
        }
        return 0;
    }

    public int getIconGravitation() {
        return this.i;
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce7be2573dbd6031faf68e0341327f5f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce7be2573dbd6031faf68e0341327f5f")).booleanValue() : (this.b == null || this.b.n) ? false : true;
    }
}
