package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.RequiresApi;
import android.util.Property;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public final class i implements k {
    @Override // android.support.transition.k
    public final <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofFloat(t, new m(property, path), 0.0f, 1.0f);
    }
}
