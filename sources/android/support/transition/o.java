package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.RequiresApi;
import android.util.Property;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public final class o implements q {
    @Override // android.support.transition.q
    public final PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new m(property, path), 0.0f, 1.0f);
    }
}
