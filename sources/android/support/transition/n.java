package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    private static final q a;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new p();
        } else {
            a = new o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return a.a(property, path);
    }
}
