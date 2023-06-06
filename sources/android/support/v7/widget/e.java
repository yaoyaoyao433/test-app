package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    private final View a;
    private au d;
    private au e;
    private au f;
    private int c = -1;
    private final g b = g.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(AttributeSet attributeSet, int i) {
        aw a = aw.a(this.a.getContext(), attributeSet, new int[]{16842964, R.attr.backgroundTint, R.attr.backgroundTintMode}, i, 0);
        try {
            if (a.f(0)) {
                this.c = a.g(0, -1);
                ColorStateList b = this.b.b(this.a.getContext(), this.c);
                if (b != null) {
                    b(b);
                }
            }
            if (a.f(1)) {
                ViewCompat.setBackgroundTintList(this.a, a.e(1));
            }
            if (a.f(2)) {
                ViewCompat.setBackgroundTintMode(this.a, x.a(a.a(2, -1), null));
            }
        } finally {
            a.a.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        this.c = i;
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Drawable drawable) {
        this.c = -1;
        b((ColorStateList) null);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new au();
        }
        this.e.a = colorStateList;
        this.e.d = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ColorStateList a() {
        if (this.e != null) {
            return this.e.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new au();
        }
        this.e.b = mode;
        this.e.c = true;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PorterDuff.Mode b() {
        if (this.e != null) {
            return this.e.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (d() && b(background)) {
                return;
            }
            if (this.e != null) {
                g.a(background, this.e, this.a.getDrawableState());
            } else if (this.d != null) {
                g.a(background, this.d, this.a.getDrawableState());
            }
        }
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new au();
            }
            this.d.a = colorStateList;
            this.d.d = true;
        } else {
            this.d = null;
        }
        c();
    }

    private boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    private boolean b(@NonNull Drawable drawable) {
        if (this.f == null) {
            this.f = new au();
        }
        au auVar = this.f;
        auVar.a();
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(this.a);
        if (backgroundTintList != null) {
            auVar.d = true;
            auVar.a = backgroundTintList;
        }
        PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(this.a);
        if (backgroundTintMode != null) {
            auVar.c = true;
            auVar.b = backgroundTintMode;
        }
        if (auVar.d || auVar.c) {
            g.a(drawable, auVar, this.a.getDrawableState());
            return true;
        }
        return false;
    }
}
