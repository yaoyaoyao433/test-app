package com.tencent.tencentmap.mapsdk.maps;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.tencentmap.mapsdk.maps.model.MapViewType;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TextureMapView extends MapView {
    public TextureMapView(Context context) {
        this(context, (TencentMapOptions) null);
    }

    public TextureMapView(Context context, TencentMapOptions tencentMapOptions) {
        super(context, tencentMapOptions);
    }

    public TextureMapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextureMapView(Context context, AttributeSet attributeSet, TencentMapOptions tencentMapOptions) {
        this(context, attributeSet, 0, tencentMapOptions);
    }

    public TextureMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TextureMapView(Context context, AttributeSet attributeSet, int i, TencentMapOptions tencentMapOptions) {
        super(context, attributeSet, i, tencentMapOptions);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView
    public final MapViewType getViewType() {
        return MapViewType.TextureView;
    }

    public void setOpaque(boolean z) {
        if (this.mMapDelegate != null) {
            this.mMapDelegate.setOpaque(z);
        }
    }

    @Override // android.view.View
    public boolean isOpaque() {
        if (this.mMapDelegate != null) {
            return this.mMapDelegate.isOpaque();
        }
        return true;
    }
}
