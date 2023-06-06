package com.facebook.react.uimanager.layoutanimation;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a {
    private static final Map<d, BaseInterpolator> c = com.facebook.react.common.c.a(d.LINEAR, new LinearInterpolator(), d.EASE_IN, new AccelerateInterpolator(), d.EASE_OUT, new DecelerateInterpolator(), d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());
    @Nullable
    protected b a;
    protected int b;
    @Nullable
    private Interpolator d;
    private int e;

    @Nullable
    abstract Animation a(View view, int i, int i2, int i3, int i4);

    abstract boolean a();

    public final void b() {
        this.a = null;
        this.b = 0;
        this.e = 0;
        this.d = null;
    }

    public final void a(ReadableMap readableMap, int i) {
        BaseInterpolator baseInterpolator;
        this.a = readableMap.hasKey("property") ? b.a(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        this.b = i;
        this.e = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (!readableMap.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        d a = d.a(readableMap.getString("type"));
        if (a.equals(d.SPRING)) {
            baseInterpolator = new n(n.a(readableMap));
        } else {
            baseInterpolator = c.get(a);
        }
        if (baseInterpolator != null) {
            this.d = baseInterpolator;
            if (a()) {
                return;
            }
            throw new com.facebook.react.uimanager.i("Invalid layout animation : " + readableMap);
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + a);
    }

    @Nullable
    public final Animation b(View view, int i, int i2, int i3, int i4) {
        if (a()) {
            Animation a = a(view, i, i2, i3, i4);
            if (a != null) {
                a.setDuration(this.b * 1);
                a.setStartOffset(this.e * 1);
                a.setInterpolator(this.d);
            }
            return a;
        }
        return null;
    }
}
