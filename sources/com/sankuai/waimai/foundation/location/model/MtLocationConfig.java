package com.sankuai.waimai.foundation.location.model;

import android.support.annotation.Keep;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MtLocationConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(LoadConfig.CACHE_VALIDITY_TIME)
    private long cacheValidTime;
    @SerializedName(LoadConfig.DELIVER_INTERVAL)
    private long deliverInterval;
    @SerializedName(LoadConfig.GPS_FIX_FIRST_WAIT)
    private long gpsFixFirstWait;
    @SerializedName(LoadConfig.GPS_MIN_TIME)
    private long gpsMinTime;
    @SerializedName(LoadConfig.IS_NEED_GPS)
    private boolean isNeedGps;
    @SerializedName(LoadConfig.LOCATION_TIMEOUT)
    private long locationTimeout;
    @SerializedName(JsBridgeResult.ARG_KEY_LOCATION_MODE)
    private int mode;
    @SerializedName("type")
    private String type;

    public String getType() {
        return this.type;
    }

    public int getMode() {
        return this.mode;
    }

    public LocationLoaderFactory.LoadStrategy getStrategyMode() {
        switch (this.mode) {
            case 2:
                return LocationLoaderFactory.LoadStrategy.useCache;
            case 3:
                return LocationLoaderFactory.LoadStrategy.refresh;
            case 4:
                return LocationLoaderFactory.LoadStrategy.newest;
            case 5:
                return LocationLoaderFactory.LoadStrategy.instant;
            case 6:
                return LocationLoaderFactory.LoadStrategy.accurate;
            case 7:
                return LocationLoaderFactory.LoadStrategy.timer;
            default:
                return LocationLoaderFactory.LoadStrategy.normal;
        }
    }

    public long getLocationTimeout() {
        return this.locationTimeout;
    }

    public long getCacheValidTime() {
        return this.cacheValidTime;
    }

    public long getGpsMinTime() {
        return this.gpsMinTime;
    }

    public long getDeliverInterval() {
        return this.deliverInterval;
    }

    public long getGpsFixFirstWait() {
        return this.gpsFixFirstWait;
    }

    public boolean isNeedGps() {
        return this.isNeedGps;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setMode(LocationLoaderFactory.LoadStrategy loadStrategy) {
        Object[] objArr = {loadStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dce2de0c163441b97df56cffa585f27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dce2de0c163441b97df56cffa585f27");
            return;
        }
        switch (loadStrategy) {
            case useCache:
                this.mode = 2;
                return;
            case refresh:
                this.mode = 3;
                return;
            case newest:
                this.mode = 4;
                return;
            case instant:
                this.mode = 5;
                return;
            case accurate:
                this.mode = 6;
                return;
            case timer:
                this.mode = 7;
                return;
            default:
                this.mode = 1;
                return;
        }
    }

    public void setLocationTimeout(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "823283b17ae6689f27d5dd7fd9355c4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "823283b17ae6689f27d5dd7fd9355c4e");
        } else {
            this.locationTimeout = j;
        }
    }

    public void setCacheValidTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "605d13f981dd24bbdae60035b5d61367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "605d13f981dd24bbdae60035b5d61367");
        } else {
            this.cacheValidTime = j;
        }
    }

    public void setGpsMinTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2362ff504c1313dd5ebafd1d6629c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2362ff504c1313dd5ebafd1d6629c82");
        } else {
            this.gpsMinTime = j;
        }
    }

    public void setDeliverInterval(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30740db1f04068e97d0d295769fa20ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30740db1f04068e97d0d295769fa20ec");
        } else {
            this.deliverInterval = j;
        }
    }

    public void setGpsFixFirstWait(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d3722f38ad1975e2c4f81f9daffecd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d3722f38ad1975e2c4f81f9daffecd6");
        } else {
            this.gpsFixFirstWait = j;
        }
    }

    public void setNeedGps(boolean z) {
        this.isNeedGps = z;
    }
}
