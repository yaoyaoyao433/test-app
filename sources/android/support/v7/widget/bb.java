package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v7.app.AppCompatDelegate;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class bb extends Resources {
    private final WeakReference<Context> a;

    public static boolean a() {
        return AppCompatDelegate.k() && Build.VERSION.SDK_INT <= 20;
    }

    public bb(@NonNull Context context, @NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.a.get();
        if (context != null) {
            g a = g.a();
            Drawable a2 = a.a(context, i);
            if (a2 == null) {
                a2 = super.getDrawable(i);
            }
            if (a2 != null) {
                return a.a(context, i, false, a2);
            }
            return null;
        }
        return super.getDrawable(i);
    }
}
