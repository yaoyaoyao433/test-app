package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    private static final k a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new j();
        } else {
            a = new i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return a.a(t, property, path);
    }
}
