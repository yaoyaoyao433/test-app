package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RestrictTo;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.Menu;
import android.view.MenuItem;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class l {
    public static Menu a(Context context, SupportMenu supportMenu) {
        return new m(context, supportMenu);
    }

    public static MenuItem a(Context context, SupportMenuItem supportMenuItem) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new MenuItemWrapperJB(context, supportMenuItem);
        }
        return new g(context, supportMenuItem);
    }
}
