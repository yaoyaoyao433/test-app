package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p extends s {
    private final l i;
    private final int[] j;

    public p(ReadableMap readableMap, l lVar) {
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
                s sVar = (s) a;
                double b = sVar.b();
                if (i == 0) {
                    this.f = b;
                } else {
                    this.f -= sVar.b();
                }
            } else {
                throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
            }
        }
    }
}
