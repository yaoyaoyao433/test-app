package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v7.view.b;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AppCompatDialog extends Dialog implements a {
    private AppCompatDelegate a;

    @Override // android.support.v7.app.a
    public void onSupportActionModeFinished(android.support.v7.view.b bVar) {
    }

    @Override // android.support.v7.app.a
    public void onSupportActionModeStarted(android.support.v7.view.b bVar) {
    }

    @Override // android.support.v7.app.a
    @Nullable
    public android.support.v7.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().a(bundle);
    }

    @Override // android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        a().b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) a().a(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().d();
    }

    public final boolean b(int i) {
        return a().c(1);
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void invalidateOptionsMenu() {
        a().f();
    }

    private AppCompatDelegate a() {
        if (this.a == null) {
            this.a = AppCompatDelegate.a(this, this);
        }
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatDialog(android.content.Context r4, int r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L14
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 2130772337(0x7f010171, float:1.714779E38)
            r2 = 1
            r0.resolveAttribute(r1, r5, r2)
            int r5 = r5.resourceId
        L14:
            r3.<init>(r4, r5)
            android.support.v7.app.AppCompatDelegate r4 = r3.a()
            r5 = 0
            r4.a(r5)
            android.support.v7.app.AppCompatDelegate r4 = r3.a()
            r4.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDialog.<init>(android.content.Context, int):void");
    }
}
