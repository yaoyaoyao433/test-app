package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TileOverlayOptions {
    private volatile String mDiskCacheDir;
    private int mMaxMemoryCacheSize;
    private TileProvider mTileProvider;
    private volatile String mVersionInfo;
    private int mZIndex = 1;
    private boolean mBetterQuality = true;

    public final TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.mTileProvider = tileProvider;
        return this;
    }

    public final TileOverlayOptions diskCacheDir(String str) {
        this.mDiskCacheDir = str;
        return this;
    }

    public final TileOverlayOptions maxMemoryCacheSize(int i) {
        this.mMaxMemoryCacheSize = i;
        return this;
    }

    public final TileOverlayOptions versionInfo(String str) {
        this.mVersionInfo = str;
        return this;
    }

    public final TileOverlayOptions zIndex(int i) {
        this.mZIndex = i;
        return this;
    }

    public final TileOverlayOptions betterQuality(boolean z) {
        this.mBetterQuality = z;
        return this;
    }

    public final TileProvider getTileProvider() {
        return this.mTileProvider;
    }

    public final int getZIndex() {
        return this.mZIndex;
    }

    public final boolean isBetterQuality() {
        return this.mBetterQuality;
    }

    public final String getDiskCacheDir() {
        return this.mDiskCacheDir;
    }

    public final String getVersionInfo() {
        return this.mVersionInfo;
    }

    public final int getMaxMemoryCacheSize(TencentMapContext tencentMapContext) {
        if (this.mMaxMemoryCacheSize == 0) {
            return tencentMapContext.getScreenPixels() * 4;
        }
        return this.mMaxMemoryCacheSize;
    }

    public final String toString() {
        return "{mDiskCacheDir='" + this.mDiskCacheDir + "', mVersionInfo='" + this.mVersionInfo + "', mZIndex=" + this.mZIndex + ", mBetterQuality=" + this.mBetterQuality + ", mMaxMemoryCacheSize=" + this.mMaxMemoryCacheSize + '}';
    }
}
