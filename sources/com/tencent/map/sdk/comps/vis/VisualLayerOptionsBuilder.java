package com.tencent.map.sdk.comps.vis;

import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Builder;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VisualLayerOptionsBuilder implements Builder<VisualLayerOptions> {
    protected final VisualLayerOptions mLayerOptions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VisualLayerOptionsBuilder(VisualLayerOptions visualLayerOptions) {
        this.mLayerOptions = visualLayerOptions;
    }

    public VisualLayerOptionsBuilder setLevel(int i) {
        this.mLayerOptions.mLevel = i;
        return this;
    }

    public VisualLayerOptionsBuilder setZIndex(int i) {
        this.mLayerOptions.mZIndex = i;
        return this;
    }

    public VisualLayerOptionsBuilder setAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.mLayerOptions.mAlpha = f;
        return this;
    }

    public VisualLayerOptionsBuilder setTimeInterval(@IntRange(from = 15) int i) {
        this.mLayerOptions.mTimeInternal = i;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Builder
    public VisualLayerOptions build() {
        return this.mLayerOptions;
    }
}
