package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends s {
    private final l i;
    private final int[] j;

    public g(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        ReadableArray array = readableMap.getArray(TensorConfig.KEY_INPUT_ARRAY);
        this.j = new int[array.size()];
        for (int i = 0; i < this.j.length; i++) {
            this.j[i] = array.getInt(i);
        }
    }

    @Override // com.facebook.react.animated.b
    public final void a() {
        for (int i = 0; i < this.j.length; i++) {
            b a = this.i.a(this.j[i]);
            if (a != null && (a instanceof s)) {
                double b = ((s) a).b();
                if (i == 0) {
                    this.f = b;
                } else if (b == 0.0d) {
                    throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node");
                } else {
                    this.f /= b;
                }
            } else {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node");
            }
        }
    }
}
