package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m<T> extends Property<T, Float> {
    private final Property<T, PointF> a;
    private final PathMeasure b;
    private final float c;
    private final float[] d;
    private final PointF e;
    private float f;

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Float f) {
        Float f2 = f;
        this.f = f2.floatValue();
        this.b.getPosTan(this.c * f2.floatValue(), this.d, null);
        this.e.x = this.d[0];
        this.e.y = this.d[1];
        this.a.set(obj, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.d = new float[2];
        this.e = new PointF();
        this.a = property;
        this.b = new PathMeasure(path, false);
        this.c = this.b.getLength();
    }

    @Override // android.util.Property
    public final /* synthetic */ Float get(Object obj) {
        return Float.valueOf(this.f);
    }
}
