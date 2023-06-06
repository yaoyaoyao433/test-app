package com.tencent.map.sdk.comps.vis;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Removable;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Visible;
import com.tencent.tencentmap.mapsdk.maps.model.IOverlay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface VisualLayer extends Alphable, Levelable, Removable, Visible, IOverlay {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnLayerStatusChangedListener {

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public @interface LayerStatus {
            public static final int ERR_AUTH = 2;
            public static final int ERR_DATA_AVAILABLE = 4;
            public static final int ERR_DATA_DECODE = 3;
            public static final int ERR_NETWORK = 1;
            public static final int OK = 0;
        }

        void onLayerLoadFinish(int i);
    }

    void addLayerStatusChangedListener(OnLayerStatusChangedListener onLayerStatusChangedListener);

    void clearCache();

    void removeLayerStatusChangedListener(OnLayerStatusChangedListener onLayerStatusChangedListener);

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    void setLevel(int i);

    void setTimeInterval(int i);
}
