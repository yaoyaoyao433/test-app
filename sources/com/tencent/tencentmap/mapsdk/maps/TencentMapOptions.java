package com.tencent.tencentmap.mapsdk.maps;

import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.net.AdapterType;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.MapViewType;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle;
import java.lang.reflect.Field;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TencentMapOptions {
    public static final int LOGO_POSITION_BOTTOM_CENTER = 4;
    public static final int LOGO_POSITION_BOTTOM_LEFT = 0;
    public static final int LOGO_POSITION_BOTTOM_RIGHT = 1;
    public static final int LOGO_POSITION_TOP_CENTER = 5;
    public static final int LOGO_POSITION_TOP_LEFT = 3;
    public static final int LOGO_POSITION_TOP_RIGHT = 2;
    public static final int SCALEVIEW_POSITION_BOTTOM_CENTER = 4;
    public static final int SCALEVIEW_POSITION_BOTTOM_LEFT = 0;
    public static final int SCALEVIEW_POSITION_BOTTOM_RIGHT = 1;
    public static final int SCALEVIEW_POSITION_TOP_CENTER = 5;
    public static final int SCALEVIEW_POSITION_TOP_LEFT = 3;
    public static final int SCALEVIEW_POSITION_TOP_RIGHT = 2;
    public static final int ZOOM_POSITION_BOTTOM_LEFT = 0;
    public static final int ZOOM_POSITION_BOTTOM_RIGHT = 1;
    public static final int ZOOM_POSITION_TOP_LEFT = 3;
    public static final int ZOOM_POSITION_TOP_RIGHT = 2;
    private String customAssetsPath;
    private String customLocalPath;
    private String mCustomCacheRootPath;
    private String mCustomUserId;
    private String[] mDebugTags;
    private boolean mDisallowIntercept;
    private Object mExtSurface;
    private int mExtSurfaceHeight;
    private int mExtSurfaceWidth;
    private Callback<TencentMap> mMapCallback;
    private IMapKernel mMapKernel;
    private String mMapKey;
    private MapViewType mMapViewType;
    private Bundle mNetParams;
    private boolean mOfflineMapEnable;
    private TencentMap.OnMapLoadedCallback mOnMapLoadedCallback;
    private Object mProtocolDataDesc;
    private int mProtocolFrom;
    private String mSubId;
    private String mSubKey;
    private TrafficStyle mTrafficStyle;
    private Typeface mUserTypeface;
    private boolean isHandDrawMapEnable = false;
    private boolean isEnableMultipleInfoWindow = false;
    private String mSatelliteVersion = "0";
    private AdapterType mNetAdapterType = AdapterType.DEFAULT;
    private OverSeaSource mOverSeaSource = OverSeaSource.DEFAULT;
    private float mMapFrameRate = 60.0f;
    private boolean mOpaque = true;
    private boolean mForceHttps = true;
    private int mMaxIconMemoryCacheSize = 30;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface IMapKernel {
        String name();
    }

    public final boolean isForceHttps() {
        return this.mForceHttps;
    }

    public final TencentMapOptions setForceHttps(boolean z) {
        this.mForceHttps = z;
        return this;
    }

    public final String getCustomAssetsPath() {
        return this.customAssetsPath;
    }

    public final TencentMapOptions setCustomAssetsPath(String str) {
        this.customAssetsPath = str;
        return this;
    }

    public final String getCustomLocalPath() {
        return this.customLocalPath;
    }

    public final TencentMapOptions setCustomLocalPath(String str) {
        this.customLocalPath = str;
        return this;
    }

    public final String getCustomCacheRootPath() {
        return this.mCustomCacheRootPath;
    }

    public final TencentMapOptions setCustomCacheRootPath(String str) {
        this.mCustomCacheRootPath = str;
        return this;
    }

    public final TencentMapOptions setHandDrawMapEnable(boolean z) {
        this.isHandDrawMapEnable = z;
        return this;
    }

    public final boolean isHandDrawMapEnable() {
        return this.isHandDrawMapEnable;
    }

    public final Object getExtSurface() {
        return this.mExtSurface;
    }

    public final TencentMapOptions setExtSurface(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture) && !(obj instanceof SurfaceHolder)) {
            throw new IllegalArgumentException("Parameter Surface should be Surface,SurfaceTexture or SurfaceHolder");
        }
        this.mExtSurface = obj;
        return this;
    }

    public final TencentMapOptions setTypeface(Typeface typeface) {
        setTypeface(typeface, false);
        return this;
    }

    private void setTypeface(Typeface typeface, boolean z) {
        if (typeface == null) {
            return;
        }
        if (z) {
            try {
                Field declaredField = Typeface.class.getDeclaredField("DEFAULT");
                declaredField.setAccessible(true);
                declaredField.set(Typeface.DEFAULT, typeface);
                return;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return;
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
                return;
            }
        }
        this.mUserTypeface = typeface;
    }

    public final Typeface getTypeface() {
        return this.mUserTypeface == null ? Typeface.DEFAULT : this.mUserTypeface;
    }

    public final String[] getDebugTags() {
        return this.mDebugTags;
    }

    public final TencentMapOptions setExtSurfaceDimension(int i, int i2) {
        this.mExtSurfaceWidth = i;
        this.mExtSurfaceHeight = i2;
        return this;
    }

    public final int getExtSurfaceWidth() {
        return this.mExtSurfaceWidth;
    }

    public final int getExtSurfaceHeight() {
        return this.mExtSurfaceHeight;
    }

    public final TencentMapOptions setSubInfo(String str, String str2) {
        if (str != null) {
            this.mSubKey = str.trim();
        } else {
            this.mSubKey = "";
        }
        if (str2 != null) {
            this.mSubId = str2.trim();
        } else {
            this.mSubId = "";
        }
        return this;
    }

    public final String getSubId() {
        return this.mSubId;
    }

    public final String getSubKey() {
        return this.mSubKey;
    }

    public final TencentMapOptions setMapKey(String str) {
        this.mMapKey = str;
        return this;
    }

    public final String getMapKey() {
        return this.mMapKey;
    }

    public final TencentMapOptions openDebugLogByTags(String... strArr) {
        this.mDebugTags = strArr;
        return this;
    }

    public final TencentMapOptions setMultipleInfoWindowEnable(boolean z) {
        this.isEnableMultipleInfoWindow = z;
        return this;
    }

    public final boolean isMultipleInfoWindowEnable() {
        return this.isEnableMultipleInfoWindow;
    }

    public final TencentMapOptions setSatelliteVersion(String str) {
        this.mSatelliteVersion = str;
        return this;
    }

    public final String getSatelliteVersion() {
        return this.mSatelliteVersion;
    }

    public final TencentMapOptions setMapViewType(MapViewType mapViewType) {
        this.mMapViewType = mapViewType;
        return this;
    }

    public final MapViewType getMapViewType() {
        return this.mMapViewType;
    }

    public final TencentMapOptions setMapKernel(IMapKernel iMapKernel) {
        this.mMapKernel = iMapKernel;
        return this;
    }

    public final IMapKernel getMapKernel() {
        return this.mMapKernel;
    }

    public final TencentMapOptions setServiceProtocol(int i, Object obj) {
        this.mProtocolFrom = i;
        this.mProtocolDataDesc = obj;
        return this;
    }

    public final int getProtocolFrom() {
        return this.mProtocolFrom;
    }

    public final Object getProtocolDataDesc() {
        return this.mProtocolDataDesc;
    }

    public final TencentMapOptions setNetAdapter(AdapterType adapterType, Bundle bundle) {
        this.mNetAdapterType = adapterType;
        this.mNetParams = bundle;
        return this;
    }

    public final AdapterType getNetAdapterType() {
        return this.mNetAdapterType;
    }

    public final Bundle getNetParams() {
        return this.mNetParams;
    }

    public final TencentMapOptions setCustomUserID(String str) {
        this.mCustomUserId = str;
        return this;
    }

    public final String getCustomUserId() {
        return this.mCustomUserId;
    }

    public final TencentMapOptions setGetMapAsync(Callback<TencentMap> callback) {
        this.mMapCallback = callback;
        return this;
    }

    public final Callback<TencentMap> getMapAsyncCallback() {
        return this.mMapCallback;
    }

    public final TencentMapOptions setOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.mOnMapLoadedCallback = onMapLoadedCallback;
        return this;
    }

    public final TencentMap.OnMapLoadedCallback getOnMapLoadedCallback() {
        return this.mOnMapLoadedCallback;
    }

    public final TencentMapOptions setOfflineMapEnable(boolean z) {
        this.mOfflineMapEnable = z;
        return this;
    }

    public final boolean isOfflineMapEnable() {
        return this.mOfflineMapEnable;
    }

    public final TencentMapOptions setOverSeaSource(OverSeaSource overSeaSource) {
        this.mOverSeaSource = overSeaSource;
        return this;
    }

    public final OverSeaSource getOverSeaSource() {
        return this.mOverSeaSource;
    }

    public final TencentMapOptions setDisallowInterceptTouchEvent(boolean z) {
        this.mDisallowIntercept = z;
        return this;
    }

    public final boolean isDisallowInterceptTouchEvent() {
        return this.mDisallowIntercept;
    }

    public final TrafficStyle getTrafficStyle() {
        return this.mTrafficStyle;
    }

    public final TencentMapOptions setTrafficStyle(TrafficStyle trafficStyle) {
        this.mTrafficStyle = trafficStyle;
        return this;
    }

    public final float getMapFrameRate() {
        return this.mMapFrameRate;
    }

    public final TencentMapOptions setMapFrameRate(float f) {
        this.mMapFrameRate = f;
        return this;
    }

    public final boolean isOpaque() {
        return this.mOpaque;
    }

    public final TencentMapOptions setOpaque(boolean z) {
        this.mOpaque = z;
        return this;
    }

    public final int getMaxIconMemoryCacheSize() {
        return this.mMaxIconMemoryCacheSize;
    }

    public final TencentMapOptions setMaxIconMemoryCacheSize(int i) {
        this.mMaxIconMemoryCacheSize = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TencentMapOptions tencentMapOptions = (TencentMapOptions) obj;
        if (this.isHandDrawMapEnable == tencentMapOptions.isHandDrawMapEnable && this.mExtSurfaceWidth == tencentMapOptions.mExtSurfaceWidth && this.mExtSurfaceHeight == tencentMapOptions.mExtSurfaceHeight && this.isEnableMultipleInfoWindow == tencentMapOptions.isEnableMultipleInfoWindow && this.mProtocolFrom == tencentMapOptions.mProtocolFrom && this.mOfflineMapEnable == tencentMapOptions.mOfflineMapEnable && Float.compare(tencentMapOptions.mMapFrameRate, this.mMapFrameRate) == 0 && this.mForceHttps == tencentMapOptions.mForceHttps) {
            if (this.customAssetsPath == null ? tencentMapOptions.customAssetsPath == null : this.customAssetsPath.equals(tencentMapOptions.customAssetsPath)) {
                if (this.customLocalPath == null ? tencentMapOptions.customLocalPath == null : this.customLocalPath.equals(tencentMapOptions.customLocalPath)) {
                    if (this.mCustomCacheRootPath == null ? tencentMapOptions.mCustomCacheRootPath == null : this.mCustomCacheRootPath.equals(tencentMapOptions.mCustomCacheRootPath)) {
                        if (this.mExtSurface == null ? tencentMapOptions.mExtSurface == null : this.mExtSurface.equals(tencentMapOptions.mExtSurface)) {
                            if (this.mSubId == null ? tencentMapOptions.mSubId == null : this.mSubId.equals(tencentMapOptions.mSubId)) {
                                if (this.mSubKey == null ? tencentMapOptions.mSubKey == null : this.mSubKey.equals(tencentMapOptions.mSubKey)) {
                                    if (this.mMapKey == null ? tencentMapOptions.mMapKey == null : this.mMapKey.equals(tencentMapOptions.mMapKey)) {
                                        if (Arrays.equals(this.mDebugTags, tencentMapOptions.mDebugTags)) {
                                            if (this.mSatelliteVersion == null ? tencentMapOptions.mSatelliteVersion == null : this.mSatelliteVersion.equals(tencentMapOptions.mSatelliteVersion)) {
                                                if (this.mMapViewType != tencentMapOptions.mMapViewType) {
                                                    return false;
                                                }
                                                if (this.mMapKernel == null ? tencentMapOptions.mMapKernel == null : this.mMapKernel.equals(tencentMapOptions.mMapKernel)) {
                                                    if (this.mUserTypeface == null ? tencentMapOptions.mUserTypeface == null : this.mUserTypeface.equals(tencentMapOptions.mUserTypeface)) {
                                                        if (this.mProtocolDataDesc == null ? tencentMapOptions.mProtocolDataDesc == null : this.mProtocolDataDesc.equals(tencentMapOptions.mProtocolDataDesc)) {
                                                            if (this.mNetAdapterType != tencentMapOptions.mNetAdapterType) {
                                                                return false;
                                                            }
                                                            if (this.mNetParams == null ? tencentMapOptions.mNetParams == null : this.mNetParams.equals(tencentMapOptions.mNetParams)) {
                                                                if (this.mCustomUserId == null ? tencentMapOptions.mCustomUserId == null : this.mCustomUserId.equals(tencentMapOptions.mCustomUserId)) {
                                                                    if (this.mMapCallback == null ? tencentMapOptions.mMapCallback == null : this.mMapCallback.equals(tencentMapOptions.mMapCallback)) {
                                                                        if (this.mOverSeaSource != tencentMapOptions.mOverSeaSource) {
                                                                            return false;
                                                                        }
                                                                        return this.mTrafficStyle != null ? this.mTrafficStyle.equals(tencentMapOptions.mTrafficStyle) : tencentMapOptions.mTrafficStyle == null;
                                                                    }
                                                                    return false;
                                                                }
                                                                return false;
                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.customAssetsPath != null ? this.customAssetsPath.hashCode() : 0) * 31) + (this.customLocalPath != null ? this.customLocalPath.hashCode() : 0)) * 31) + (this.mCustomCacheRootPath != null ? this.mCustomCacheRootPath.hashCode() : 0)) * 31) + (this.isHandDrawMapEnable ? 1 : 0)) * 31) + (this.mExtSurface != null ? this.mExtSurface.hashCode() : 0)) * 31) + this.mExtSurfaceWidth) * 31) + this.mExtSurfaceHeight) * 31) + (this.mSubId != null ? this.mSubId.hashCode() : 0)) * 31) + (this.mSubKey != null ? this.mSubKey.hashCode() : 0)) * 31) + (this.mMapKey != null ? this.mMapKey.hashCode() : 0)) * 31) + (this.isEnableMultipleInfoWindow ? 1 : 0)) * 31) + Arrays.hashCode(this.mDebugTags)) * 31) + (this.mSatelliteVersion != null ? this.mSatelliteVersion.hashCode() : 0)) * 31) + (this.mMapViewType != null ? this.mMapViewType.hashCode() : 0)) * 31) + (this.mMapKernel != null ? this.mMapKernel.hashCode() : 0)) * 31) + (this.mUserTypeface != null ? this.mUserTypeface.hashCode() : 0)) * 31) + this.mProtocolFrom) * 31) + (this.mProtocolDataDesc != null ? this.mProtocolDataDesc.hashCode() : 0)) * 31) + (this.mNetAdapterType != null ? this.mNetAdapterType.hashCode() : 0)) * 31) + (this.mNetParams != null ? this.mNetParams.hashCode() : 0)) * 31) + (this.mCustomUserId != null ? this.mCustomUserId.hashCode() : 0)) * 31) + (this.mMapCallback != null ? this.mMapCallback.hashCode() : 0)) * 31) + (this.mOfflineMapEnable ? 1 : 0)) * 31) + (this.mOverSeaSource != null ? this.mOverSeaSource.hashCode() : 0)) * 31) + (this.mTrafficStyle != null ? this.mTrafficStyle.hashCode() : 0)) * 31) + (this.mMapFrameRate != 0.0f ? Float.floatToIntBits(this.mMapFrameRate) : 0)) * 31) + (this.mForceHttps ? 1 : 0);
    }

    public final String toString() {
        return "TencentMapOptions{customAssetsPath='" + this.customAssetsPath + "', customLocalPath='" + this.customLocalPath + "', mCustomCacheRootPath='" + this.mCustomCacheRootPath + "', isHandDrawMapEnable=" + this.isHandDrawMapEnable + ", mExtSurface=" + this.mExtSurface + ", mExtSurfaceWidth=" + this.mExtSurfaceWidth + ", mExtSurfaceHeight=" + this.mExtSurfaceHeight + ", mSubId='" + this.mSubId + "', mSubKey='" + this.mSubKey + "', mMapKey='" + this.mMapKey + "', isEnableMultipleInfoWindow=" + this.isEnableMultipleInfoWindow + ", mDebugTags=" + Arrays.toString(this.mDebugTags) + ", mSatelliteVersion='" + this.mSatelliteVersion + "', mMapViewType=" + this.mMapViewType + ", mMapKernel=" + this.mMapKernel + ", mUserTypeface=" + this.mUserTypeface + ", mProtocolFrom=" + this.mProtocolFrom + ", mProtocolDataDesc=" + this.mProtocolDataDesc + ", mNetAdapterType=" + this.mNetAdapterType + ", mNetParams=" + this.mNetParams + ", mCustomUserId='" + this.mCustomUserId + "', mMapCallback=" + this.mMapCallback + ", mOfflineMapEnable=" + this.mOfflineMapEnable + ", mOverSeaSource=" + this.mOverSeaSource + ", mTrafficStyle=" + this.mTrafficStyle + ", mMapFrameRate=" + this.mMapFrameRate + ", mForceHttps=" + this.mForceHttps + ", mDisallowIntercept=" + this.mDisallowIntercept + '}';
    }
}
