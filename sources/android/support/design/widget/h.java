package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import java.util.ArrayList;
/* compiled from: ProGuard */
@RequiresApi(21)
/* loaded from: classes.dex */
public final class h extends g {
    private InsetDrawable r;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.g
    public final void a(int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.g
    public final void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.g
    public final boolean e() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(VisibilityAwareImageButton visibilityAwareImageButton, j jVar) {
        super(visibilityAwareImageButton, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.g
    public final void a(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable drawable;
        this.e = DrawableCompat.wrap(g());
        DrawableCompat.setTintList(this.e, colorStateList);
        if (mode != null) {
            DrawableCompat.setTintMode(this.e, mode);
        }
        if (i2 > 0) {
            this.g = a(i2, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.g, this.e});
        } else {
            this.g = null;
            drawable = this.e;
        }
        this.f = new RippleDrawable(ColorStateList.valueOf(i), drawable, null);
        this.h = this.f;
        this.p.a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.g
    public final void a(int i) {
        if (this.f instanceof RippleDrawable) {
            ((RippleDrawable) this.f).setColor(ColorStateList.valueOf(i));
        } else {
            super.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.g
    public final void a(float f, float f2) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.o.isEnabled()) {
                this.o.setElevation(f);
                if (this.o.isFocused() || this.o.isPressed()) {
                    this.o.setTranslationZ(f2);
                } else {
                    this.o.setTranslationZ(0.0f);
                }
            } else {
                this.o.setElevation(0.0f);
                this.o.setTranslationZ(0.0f);
            }
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.o, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, f2).setDuration(100L));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(k, animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(this.o, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, f2).setDuration(100L));
            animatorSet2.setInterpolator(a);
            stateListAnimator.addState(l, animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.o, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, this.o.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet3.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet3.setInterpolator(a);
            stateListAnimator.addState(m, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.play(ObjectAnimator.ofFloat(this.o, "elevation", 0.0f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, 0.0f).setDuration(0L));
            animatorSet4.setInterpolator(a);
            stateListAnimator.addState(n, animatorSet4);
            this.o.setStateListAnimator(stateListAnimator);
        }
        if (this.p.b()) {
            d();
        }
    }

    @Override // android.support.design.widget.g
    public final float a() {
        return this.o.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.g
    public final void c() {
        d();
    }

    @Override // android.support.design.widget.g
    final void b(Rect rect) {
        if (this.p.b()) {
            this.r = new InsetDrawable(this.f, rect.left, rect.top, rect.right, rect.bottom);
            this.p.a(this.r);
            return;
        }
        this.p.a(this.f);
    }

    @Override // android.support.design.widget.g
    final b f() {
        return new c();
    }

    @Override // android.support.design.widget.g
    final GradientDrawable h() {
        return new a();
    }

    @Override // android.support.design.widget.g
    final void a(Rect rect) {
        if (this.p.b()) {
            float a2 = this.p.a();
            float elevation = this.o.getElevation() + this.j;
            int ceil = (int) Math.ceil(i.b(elevation, a2, false));
            int ceil2 = (int) Math.ceil(i.a(elevation, a2, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends GradientDrawable {
        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }

        a() {
        }
    }
}
