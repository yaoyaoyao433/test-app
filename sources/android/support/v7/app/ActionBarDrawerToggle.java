package android.support.v7.app;

import android.support.annotation.StringRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {
    boolean a;
    private final a b;
    private DrawerArrowDrawable c;
    private boolean d;
    private final int e;
    private final int f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(@StringRes int i);
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        if (this.d) {
            a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            a(0.0f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        a(1.0f);
        if (this.a) {
            a(this.f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        a(0.0f);
        if (this.a) {
            a(this.e);
        }
    }

    private void a(int i) {
        this.b.a(i);
    }

    private void a(float f) {
        if (f == 1.0f) {
            this.c.a(true);
        } else if (f == 0.0f) {
            this.c.a(false);
        }
        this.c.a(f);
    }
}
