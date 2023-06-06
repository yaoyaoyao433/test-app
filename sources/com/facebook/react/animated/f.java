package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends s {
    private final l i;
    private final int j;
    private final double k;
    private final double l;
    private double m = 0.0d;

    public f(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        this.j = readableMap.getInt(TensorConfig.KEY_INPUT_ARRAY);
        this.k = readableMap.getDouble("min");
        this.l = readableMap.getDouble("max");
        this.f = 0.0d;
    }

    @Override // com.facebook.react.animated.b
    public final void a() {
        b a = this.i.a(this.j);
        if (a == null || !(a instanceof s)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        double b = ((s) a).b();
        double d = b - this.m;
        this.m = b;
        this.f = Math.min(Math.max(this.f + d, this.k), this.l);
    }
}
