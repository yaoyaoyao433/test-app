package com.meituan.roodesign.widgets.label;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooLabel extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    @Nullable
    private Drawable b;
    @Px
    private int c;
    @Px
    private int d;
    @Px
    private int e;
    private int f;
    private b g;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface IconGravity {
    }

    public RooLabel(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2436a2d8de74b7b03119a5548fb9c879", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2436a2d8de74b7b03119a5548fb9c879");
        }
    }

    public RooLabel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooLabelStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44390ae776910c6d2b6dfe7a57287634", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44390ae776910c6d2b6dfe7a57287634");
        }
    }

    public RooLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aacb944541bde75fcdb0ee55a6d56200", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aacb944541bde75fcdb0ee55a6d56200");
            return;
        }
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, new int[]{16843782, R.attr.backgroundColor, R.attr.cornerRadius, R.attr.strokeWidth, R.attr.icon, R.attr.iconSize, R.attr.iconPadding, R.attr.cornerRadiusTopStart, R.attr.cornerRadiusTopEnd, R.attr.cornerRadiusBottomStart, R.attr.cornerRadiusBottomEnd}, i, 2131559115);
        this.e = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.b = com.meituan.roodesign.widgets.resources.b.b(context2, obtainStyledAttributes, 4);
        this.c = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f = 1;
        this.g = new b(this);
        b bVar = this.g;
        Object[] objArr2 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "007143daad5e1ae6c5fa36001d1240b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "007143daad5e1ae6c5fa36001d1240b3");
        } else {
            bVar.c = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            bVar.d = obtainStyledAttributes.getDimensionPixelSize(7, bVar.c);
            bVar.e = obtainStyledAttributes.getDimensionPixelSize(8, bVar.c);
            bVar.f = obtainStyledAttributes.getDimensionPixelSize(9, bVar.c);
            bVar.g = obtainStyledAttributes.getDimensionPixelSize(10, bVar.c);
            bVar.h = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            bVar.i = obtainStyledAttributes.getColor(0, -1);
            bVar.j = obtainStyledAttributes.getColor(1, 0);
            bVar.b.setInternalBackground(bVar.a());
        }
        obtainStyledAttributes.recycle();
        setSingleLine();
        setIncludeFontPadding(false);
        setCompoundDrawablePadding(this.e);
        a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cfb34c96b189d5c35dd84b1bf06e8f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cfb34c96b189d5c35dd84b1bf06e8f2");
            return;
        }
        super.onMeasure(i, i2);
        if (this.b == null || this.f != 2) {
            return;
        }
        int measuredWidth = (((((getMeasuredWidth() - ((int) getPaint().measureText(getText().toString()))) - ViewCompat.getPaddingEnd(this)) - (this.c == 0 ? this.b.getIntrinsicWidth() : this.c)) - this.e) - ViewCompat.getPaddingStart(this)) / 2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "417a17d5bb22bac4ee0dff9400c0b36f", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "417a17d5bb22bac4ee0dff9400c0b36f")).booleanValue();
        } else if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        }
        if (z) {
            measuredWidth = -measuredWidth;
        }
        if (this.d != measuredWidth) {
            this.d = measuredWidth;
            a();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1230b65b2c54437e4433c45b04820031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1230b65b2c54437e4433c45b04820031");
        } else if (b()) {
            b bVar = this.g;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a3f6bdd90f0437b1f47db4dafe425d3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a3f6bdd90f0437b1f47db4dafe425d3e");
            } else if (bVar.j != i) {
                bVar.j = i;
                if (bVar.k != null) {
                    bVar.k.setColor(i);
                }
            }
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31543f2a983eacd24c9ca8c2eaab6a78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31543f2a983eacd24c9ca8c2eaab6a78");
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d17ddec66f6c84e2369eceae98917d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d17ddec66f6c84e2369eceae98917d");
        } else {
            setBackgroundDrawable(i != 0 ? android.support.v7.content.res.b.b(getContext(), i) : null);
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "861601338b697bd80d46069ba29a8899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "861601338b697bd80d46069ba29a8899");
            return;
        }
        if (b()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            this.g.l = true;
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setIconPadding(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dffa15813c0a26d57539fbc49ccfaccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dffa15813c0a26d57539fbc49ccfaccd");
        } else if (this.e != i) {
            this.e = i;
            setCompoundDrawablePadding(i);
        }
    }

    @Px
    public int getIconPadding() {
        return this.e;
    }

    public void setIconSize(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488e4bac57aae6d1ed37a769312c0e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488e4bac57aae6d1ed37a769312c0e01");
        } else if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else {
            if (this.c != i) {
                this.c = i;
                a();
            }
        }
    }

    @Px
    public int getIconSize() {
        return this.c;
    }

    public void setIcon(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423d190ff3d6625af968a0e5d1abd5a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423d190ff3d6625af968a0e5d1abd5a3");
        } else if (this.b != drawable) {
            this.b = drawable;
            a();
        }
    }

    public void setIconResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "063a388e58544cd50679d1c4a49e9d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "063a388e58544cd50679d1c4a49e9d3a");
        } else {
            setIcon(i != 0 ? android.support.v7.content.res.b.b(getContext(), i) : null);
        }
    }

    public Drawable getIcon() {
        return this.b;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a4546780edaeed9f60532c97646479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a4546780edaeed9f60532c97646479");
            return;
        }
        if (this.b != null) {
            this.b = this.b.mutate();
            this.b.setBounds(this.d, 0, this.d + (this.c != 0 ? this.c : this.b.getIntrinsicWidth()), this.c != 0 ? this.c : this.b.getIntrinsicHeight());
        }
        TextViewCompat.setCompoundDrawablesRelative(this, this.b, null, null, null);
    }

    public void setInternalBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088c569b1b1d975ceb3fe09760ef0309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088c569b1b1d975ceb3fe09760ef0309");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setStrokeColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b7f5deeff5ddb09c920727496aab2bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b7f5deeff5ddb09c920727496aab2bc");
        } else if (b()) {
            b bVar = this.g;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e81de5de39c5b822f1ed3b1e1bf7c25a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e81de5de39c5b822f1ed3b1e1bf7c25a");
            } else if (bVar.i != i) {
                bVar.i = i;
                bVar.b();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "983ea538d15dd58fbdb1a7e7f3cc8d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "983ea538d15dd58fbdb1a7e7f3cc8d13");
        } else if (b()) {
            setStrokeColor(getContext().getResources().getColor(i));
        }
    }

    @ColorInt
    public int getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98fd85b7a1f812c7d7179bef45c08b59", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98fd85b7a1f812c7d7179bef45c08b59")).intValue();
        }
        if (b()) {
            return this.g.i;
        }
        return -1;
    }

    public void setStrokeWidth(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2864e0a4bc01c2a86c90ad993b81689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2864e0a4bc01c2a86c90ad993b81689");
        } else if (b()) {
            b bVar = this.g;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "d38caede56649be586e085b830574674", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "d38caede56649be586e085b830574674");
            } else if (bVar.h != i) {
                bVar.h = i;
                bVar.b();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d46c5b24e82e8c0fc77dd817ed3fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d46c5b24e82e8c0fc77dd817ed3fc3");
        } else if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Px
    public int getStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd38a1d3017c8cf369ad03b7618888b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd38a1d3017c8cf369ad03b7618888b0")).intValue();
        }
        if (b()) {
            return this.g.h;
        }
        return 0;
    }

    public void setCornerRadius(@Px int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f2ab82235a806f9b2068a47c43184a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f2ab82235a806f9b2068a47c43184a");
        } else if (b()) {
            b bVar = this.g;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "3c62c58d3aabaff08511eca3705ba947", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "3c62c58d3aabaff08511eca3705ba947");
            } else if (bVar.c != i) {
                bVar.c = i;
                bVar.c();
            }
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3672239edeb8be67d9246c9dcd8364c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3672239edeb8be67d9246c9dcd8364c4");
        } else if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Px
    public int getCornerRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "858f44508ecf8f6425cf2b8d6c82e5da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "858f44508ecf8f6425cf2b8d6c82e5da")).intValue();
        }
        if (b()) {
            return this.g.c;
        }
        return 0;
    }

    @Px
    public int getCornerRadiusTopStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e566b168e0283fe53d8861bf621f74a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e566b168e0283fe53d8861bf621f74a6")).intValue();
        }
        if (b()) {
            return this.g.d;
        }
        return 0;
    }

    @Px
    public int getCornerRadiusTopEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de10bebb0fd81c83d01902a7d10903fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de10bebb0fd81c83d01902a7d10903fa")).intValue();
        }
        if (b()) {
            return this.g.e;
        }
        return 0;
    }

    @Px
    public int getCornerRadiusBottomStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e4a86a7f5185e48dc9c81563f1b979", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e4a86a7f5185e48dc9c81563f1b979")).intValue();
        }
        if (b()) {
            return this.g.f;
        }
        return 0;
    }

    @Px
    public int getCornerRadiusBottomEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc21e2f72ae2e3b82a40f31cfbd1ca9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc21e2f72ae2e3b82a40f31cfbd1ca9d")).intValue();
        }
        if (b()) {
            return this.g.g;
        }
        return 0;
    }

    public final void a(@Px int i, @Px int i2, @Px int i3, @Px int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d2eafa9290edd6bfdd35803222ea35f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d2eafa9290edd6bfdd35803222ea35f");
        } else if (b()) {
            this.g.a(i, i2, i3, i4);
        }
    }

    public int getIconGravity() {
        return this.f;
    }

    public void setIconGravity(int i) {
        this.f = i;
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c737334c9df08210bd4b7812c62a24d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c737334c9df08210bd4b7812c62a24d")).booleanValue() : (this.g == null || this.g.l) ? false : true;
    }
}
