package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    @Nullable
    private d a;
    private View b;

    public e(View view) {
        this.b = view;
    }

    private d a() {
        if (this.a == null) {
            this.a = new d(this.b.getContext());
            Drawable background = this.b.getBackground();
            ViewCompat.setBackground(this.b, null);
            if (background == null) {
                ViewCompat.setBackground(this.b, this.a);
            } else {
                ViewCompat.setBackground(this.b, new LayerDrawable(new Drawable[]{this.a, background}));
            }
        }
        return this.a;
    }

    public final void a(int i) {
        if (i == 0 && this.a == null) {
            return;
        }
        a().a(i);
    }

    public final void a(int i, float f) {
        a().a(i, f);
    }

    public final void a(int i, float f, float f2) {
        a().a(i, f, f2);
    }

    public final void a(float f) {
        a().a(f);
    }

    public final void a(float f, int i) {
        a().a(f, i);
    }

    public final void a(@Nullable String str) {
        a().a(str);
    }
}
