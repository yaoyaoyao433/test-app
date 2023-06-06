package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.j;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class i {
    protected View a;
    protected int b;
    PopupWindow.OnDismissListener c;
    private final Context d;
    private final MenuBuilder e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private j.a j;
    private h k;
    private final PopupWindow.OnDismissListener l;

    public i(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i) {
        this(context, menuBuilder, view, z, R.attr.actionOverflowMenuStyle, 0);
    }

    public i(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i, @StyleRes int i2) {
        this.b = GravityCompat.START;
        this.l = new PopupWindow.OnDismissListener() { // from class: android.support.v7.view.menu.i.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                i.this.d();
            }
        };
        this.d = context;
        this.e = menuBuilder;
        this.a = view;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    public final void a(boolean z) {
        this.i = z;
        if (this.k != null) {
            this.k.b(z);
        }
    }

    @NonNull
    public final h a() {
        h oVar;
        if (this.k == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                oVar = new CascadingMenuPopup(this.d, this.a, this.g, this.h, this.f);
            } else {
                oVar = new o(this.d, this.e, this.a, this.g, this.h, this.f);
            }
            oVar.a(this.e);
            oVar.a(this.l);
            oVar.a(this.a);
            oVar.a(this.j);
            oVar.b(this.i);
            oVar.a(this.b);
            this.k = oVar;
        }
        return this.k;
    }

    public final boolean b() {
        if (e()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2, boolean z, boolean z2) {
        h a = a();
        a.c(z2);
        if (z) {
            if ((GravityCompat.getAbsoluteGravity(this.b, ViewCompat.getLayoutDirection(this.a)) & 7) == 5) {
                i += this.a.getWidth();
            }
            a.b(i);
            a.c(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.e = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.d();
    }

    public final void c() {
        if (e()) {
            this.k.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        this.k = null;
        if (this.c != null) {
            this.c.onDismiss();
        }
    }

    public final boolean e() {
        return this.k != null && this.k.f();
    }

    public final void a(@Nullable j.a aVar) {
        this.j = aVar;
        if (this.k != null) {
            this.k.a(aVar);
        }
    }
}
