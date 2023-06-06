package com.meituan.roodesign.widgets.button;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.drawable.DrawableCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final RooButton b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    @Nullable
    PorterDuff.Mode i;
    @Nullable
    ColorStateList j;
    @Nullable
    ColorStateList k;
    @Nullable
    GradientDrawable l;
    @Nullable
    GradientDrawable m;
    boolean n;

    public b(RooButton rooButton) {
        Object[] objArr = {rooButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c3a3a53a64ca0b41f5d5bc630ddbc8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c3a3a53a64ca0b41f5d5bc630ddbc8d");
            return;
        }
        this.n = false;
        this.b = rooButton;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786911e4240aa0f830d0de270a0e7bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786911e4240aa0f830d0de270a0e7bfd");
            return;
        }
        this.n = true;
        this.b.setSupportBackgroundTintList(this.j);
        this.b.setSupportBackgroundTintMode(this.i);
    }

    private InsetDrawable a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6a021498f1e2776ab49c6610e0c794", RobustBitConfig.DEFAULT_VALUE) ? (InsetDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6a021498f1e2776ab49c6610e0c794") : new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ed29c691aa4ebcb59826364a7e3533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ed29c691aa4ebcb59826364a7e3533");
        } else if (this.l != null) {
            DrawableCompat.setTintList(this.l, this.j);
            if (this.i != null) {
                DrawableCompat.setTintMode(this.l, this.i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public Drawable c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "932e1650a929cddbe6def97fe995a6d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "932e1650a929cddbe6def97fe995a6d1");
        }
        this.l = new GradientDrawable();
        this.l.setCornerRadius(this.g + 1.0E-5f);
        this.l.setColor(-1);
        b();
        this.m = new GradientDrawable();
        this.m.setCornerRadius(this.g + 1.0E-5f);
        this.m.setColor(0);
        this.m.setStroke(this.h, this.k);
        return new a(a(new LayerDrawable(new Drawable[]{this.l, this.m})));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66697992c54ebfd543363e723f9ccd2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66697992c54ebfd543363e723f9ccd2f");
        } else if (this.m != null) {
            this.b.setInternalBackground(c());
        }
    }
}
