package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public final List<com.airbnb.lottie.model.a> a = new ArrayList();
    public PointF b;
    public boolean c;

    public l(PointF pointF, boolean z, List<com.airbnb.lottie.model.a> list) {
        this.b = pointF;
        this.c = z;
        this.a.addAll(list);
    }

    public l() {
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }
}
