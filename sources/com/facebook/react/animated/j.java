package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends s {
    private final l i;
    private final int j;
    private final double k;

    public j(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        this.j = readableMap.getInt(TensorConfig.KEY_INPUT_ARRAY);
        this.k = readableMap.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.b
    public final void a() {
        b a = this.i.a(this.j);
        if (a != null && (a instanceof s)) {
            this.f = ((((s) a).b() % this.k) + this.k) % this.k;
            return;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
    }
}
