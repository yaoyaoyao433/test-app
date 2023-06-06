package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.j;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface u {
    ViewPropertyAnimatorCompat a(int i, long j);

    ViewGroup a();

    void a(int i);

    void a(Drawable drawable);

    void a(j.a aVar, MenuBuilder.a aVar2);

    void a(ap apVar);

    void a(Menu menu, j.a aVar);

    void a(View view);

    void a(Window.Callback callback);

    void a(CharSequence charSequence);

    void a(boolean z);

    Context b();

    void b(int i);

    void b(Drawable drawable);

    void b(CharSequence charSequence);

    void c(int i);

    boolean c();

    void d();

    void d(int i);

    CharSequence e();

    void e(int i);

    boolean f();

    boolean g();

    boolean h();

    boolean i();

    boolean j();

    void k();

    void l();

    int m();

    int n();

    int o();

    Menu p();
}
