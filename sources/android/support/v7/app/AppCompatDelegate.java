package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.view.b;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class AppCompatDelegate {
    static int a = -1;
    private static boolean b = false;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    @interface ApplyableNightMode {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface NightMode {
    }

    @Nullable
    public abstract ActionBar a();

    @Nullable
    public abstract android.support.v7.view.b a(@NonNull b.a aVar);

    @Nullable
    public abstract <T extends View> T a(@IdRes int i);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(@Nullable Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(@Nullable CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(@LayoutRes int i);

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public abstract void c(Bundle bundle);

    public abstract boolean c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    @Nullable
    public abstract ActionBarDrawerToggle.a h();

    public abstract void i();

    public abstract boolean j();

    public static AppCompatDelegate a(Activity activity, a aVar) {
        return a(activity, activity.getWindow(), aVar);
    }

    public static AppCompatDelegate a(Dialog dialog, a aVar) {
        return a(dialog.getContext(), dialog.getWindow(), aVar);
    }

    private static AppCompatDelegate a(Context context, Window window, a aVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new c(context, window, aVar);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return new f(context, window, aVar);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return new e(context, window, aVar);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            return new d(context, window, aVar);
        }
        return new AppCompatDelegateImplV9(context, window, aVar);
    }

    public static void a(boolean z) {
        b = true;
    }

    public static boolean k() {
        return b;
    }
}
