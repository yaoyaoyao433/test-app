package com.tencent.map.lib.models;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class GroundOverlayInfo {
    protected Bitmap mBitmap;
    protected int mBitmapHeight;
    protected int mBitmapWidth;
    protected LatLngBounds mLatLngBounds;
    protected int mZIndex;
    protected float mAlpha = 1.0f;
    protected boolean mVisibility = true;
    protected int mLevel = 1;

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
        if (this.mBitmap != null) {
            this.mBitmapWidth = this.mBitmap.getWidth();
            this.mBitmapHeight = this.mBitmap.getHeight();
        }
    }

    public void setLatLngBounds(LatLngBounds latLngBounds) {
        this.mLatLngBounds = latLngBounds;
    }

    public void setAlpha(float f) {
        this.mAlpha = f;
    }

    public void setVisibility(boolean z) {
        this.mVisibility = z;
    }

    public void setZIndex(int i) {
        this.mZIndex = i;
    }

    public void setLevel(int i) {
        this.mLevel = i;
    }

    public boolean checkValid() {
        return this.mBitmap != null;
    }
}
