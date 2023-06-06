package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.widget.ImageViewCompat;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class h {
    private final ImageView a;
    private au b;
    private au c;
    private au d;

    public h(ImageView imageView) {
        this.a = imageView;
    }

    public final void a(AttributeSet attributeSet, int i) {
        int g;
        aw a = aw.a(this.a.getContext(), attributeSet, new int[]{16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode}, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (g = a.g(1, -1)) != -1 && (drawable = android.support.v7.content.res.b.b(this.a.getContext(), g)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                x.b(drawable);
            }
            if (a.f(2)) {
                ImageViewCompat.setImageTintList(this.a, a.e(2));
            }
            if (a.f(3)) {
                ImageViewCompat.setImageTintMode(this.a, x.a(a.a(3, -1), null));
            }
        } finally {
            a.a.recycle();
        }
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable b = android.support.v7.content.res.b.b(this.a.getContext(), i);
            if (b != null) {
                x.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new au();
        }
        this.c.a = colorStateList;
        this.c.d = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ColorStateList b() {
        if (this.c != null) {
            return this.c.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new au();
        }
        this.c.b = mode;
        this.c.c = true;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PorterDuff.Mode c() {
        if (this.c != null) {
            return this.c.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            x.b(drawable);
        }
        if (drawable != null) {
            if (e() && a(drawable)) {
                return;
            }
            if (this.c != null) {
                g.a(drawable, this.c, this.a.getDrawableState());
            } else if (this.b != null) {
                g.a(drawable, this.b, this.a.getDrawableState());
            }
        }
    }

    private boolean e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.b != null : i == 21;
    }

    private boolean a(@NonNull Drawable drawable) {
        if (this.d == null) {
            this.d = new au();
        }
        au auVar = this.d;
        auVar.a();
        ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.a);
        if (imageTintList != null) {
            auVar.d = true;
            auVar.a = imageTintList;
        }
        PorterDuff.Mode imageTintMode = ImageViewCompat.getImageTintMode(this.a);
        if (imageTintMode != null) {
            auVar.c = true;
            auVar.b = imageTintMode;
        }
        if (auVar.d || auVar.c) {
            g.a(drawable, auVar, this.a.getDrawableState());
            return true;
        }
        return false;
    }
}
