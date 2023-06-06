package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.widget.CompoundButtonCompat;
import android.util.AttributeSet;
import android.widget.CompoundButton;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    private final CompoundButton c;
    private boolean f;
    ColorStateList a = null;
    PorterDuff.Mode b = null;
    private boolean d = false;
    private boolean e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(CompoundButton compoundButton) {
        this.c = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.c.getContext().obtainStyledAttributes(attributeSet, new int[]{16843015, R.attr.buttonTint, R.attr.buttonTintMode}, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                this.c.setButtonDrawable(android.support.v7.content.res.b.b(this.c.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                CompoundButtonCompat.setButtonTintList(this.c, obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                CompoundButtonCompat.setButtonTintMode(this.c, x.a(obtainStyledAttributes.getInt(2, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        this.a = colorStateList;
        this.d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@Nullable PorterDuff.Mode mode) {
        this.b = mode;
        this.e = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        b();
    }

    private void b() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.c);
        if (buttonDrawable != null) {
            if (this.d || this.e) {
                Drawable mutate = DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.d) {
                    DrawableCompat.setTintList(mutate, this.a);
                }
                if (this.e) {
                    DrawableCompat.setTintMode(mutate, this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.c.getDrawableState());
                }
                this.c.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        Drawable buttonDrawable;
        return (Build.VERSION.SDK_INT >= 17 || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.c)) == null) ? i : i + buttonDrawable.getIntrinsicWidth();
    }
}
