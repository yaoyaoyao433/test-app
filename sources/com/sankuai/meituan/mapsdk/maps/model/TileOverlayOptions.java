package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TileOverlayOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean a;
    private volatile String b;
    private int c;
    private volatile String d;
    private int e;
    private TileProvider f;

    public TileOverlayOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2254ebdd52e9486044ce1e92110b197", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2254ebdd52e9486044ce1e92110b197");
            return;
        }
        this.a = true;
        this.e = 1;
    }

    public final TileOverlayOptions betterQuality(boolean z) {
        this.a = z;
        return this;
    }

    public final TileOverlayOptions diskCacheDir(String str) {
        this.b = str;
        return this;
    }

    public final TileOverlayOptions maxMemoryCacheSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "761cbf195bcb28d64b5ea83d3d2caa18", RobustBitConfig.DEFAULT_VALUE)) {
            return (TileOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "761cbf195bcb28d64b5ea83d3d2caa18");
        }
        if (i < 0) {
            i = 0;
        }
        this.c = i * 1024;
        return this;
    }

    public final TileOverlayOptions versionInfo(String str) {
        this.d = str;
        return this;
    }

    public final TileOverlayOptions zIndex(int i) {
        this.e = i;
        return this;
    }

    public final TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.f = tileProvider;
        return this;
    }

    public final boolean isBetterQuality() {
        return this.a;
    }

    public final String getDiskCacheDir() {
        return this.b;
    }

    public final int getMaxMemoryCacheSize() {
        return this.c;
    }

    public final String getVersionInfo() {
        return this.d;
    }

    public final int getZIndex() {
        return this.e;
    }

    public final TileProvider getTileProvider() {
        return this.f;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8d30511b2ded71fec9945446841c338", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8d30511b2ded71fec9945446841c338");
        }
        return "TileOverlayOptions{mBetterQuality=" + this.a + ", mDiskCacheDir='" + this.b + "', mMaxMemoryCacheSize=" + this.c + ", mVersionInfo='" + this.d + "', mZIndex=" + this.e + ", mTileProvider=" + this.f + '}';
    }
}
