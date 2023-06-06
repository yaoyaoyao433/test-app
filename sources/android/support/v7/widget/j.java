package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends i {
    final SeekBar b;
    Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.i
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        aw a = aw.a(this.b.getContext(), attributeSet, new int[]{16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode}, i, 0);
        Drawable b = a.b(0);
        if (b != null) {
            this.b.setThumb(b);
        }
        Drawable a2 = a.a(1);
        if (this.c != null) {
            this.c.setCallback(null);
        }
        this.c = a2;
        if (a2 != null) {
            a2.setCallback(this.b);
            DrawableCompat.setLayoutDirection(a2, ViewCompat.getLayoutDirection(this.b));
            if (a2.isStateful()) {
                a2.setState(this.b.getDrawableState());
            }
            a();
        }
        this.b.invalidate();
        if (a.f(3)) {
            this.e = x.a(a.a(3, -1), this.e);
            this.g = true;
        }
        if (a.f(2)) {
            this.d = a.e(2);
            this.f = true;
        }
        a.a.recycle();
        a();
    }

    private void a() {
        if (this.c != null) {
            if (this.f || this.g) {
                this.c = DrawableCompat.wrap(this.c.mutate());
                if (this.f) {
                    DrawableCompat.setTintList(this.c, this.d);
                }
                if (this.g) {
                    DrawableCompat.setTintMode(this.c, this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }
}
