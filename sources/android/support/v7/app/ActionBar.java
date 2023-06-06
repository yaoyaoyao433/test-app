package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StringRes;
import android.support.v7.view.b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ActionBar {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface DisplayOptions {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface NavigationMode {
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract CharSequence d();
    }

    public abstract int a();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public android.support.v7.view.b a(b.a aVar) {
        return null;
    }

    public abstract void a(@StringRes int i);

    public abstract void a(int i, int i2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a(Configuration configuration) {
    }

    public abstract void a(@Nullable Drawable drawable);

    public abstract void a(View view, a aVar);

    public abstract void a(CharSequence charSequence);

    public abstract void a(boolean z);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    public abstract void b();

    public abstract void b(int i);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void b(CharSequence charSequence) {
    }

    public abstract void b(boolean z);

    public abstract void c();

    public void c(@StringRes int i) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void d(boolean z) {
    }

    public abstract boolean d();

    public Context e() {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void e(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void f(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean g() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean h() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
    }

    public void c(boolean z) {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int a;

        public a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931});
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.a = 0;
            this.a = 8388627;
        }

        public a(int i, int i2, int i3) {
            super(-1, -2);
            this.a = 0;
            this.a = 17;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
