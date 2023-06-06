package com.sankuai.waimai.foundation.location.v2;

import android.support.annotation.Keep;
import com.google.gson.annotations.JsonAdapter;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.LocationSnifferReporter;
/* compiled from: ProGuard */
@Keep
@JsonAdapter(LocationTypeAdapter.class)
/* loaded from: classes4.dex */
public class WMLocation extends MtLocation {
    public static final String WM_LOCATION_ADD_ADDRSS = "wm_location_add_address";
    public static final String WM_LOCATION_MANAGER = "wm_location_manager";
    public static final String WM_LOCATION_NETWORK_CHECK = "wm_location_network_check";
    public static final String WM_MANUALLY_LOCATE_PROVIDER = "wm_manully_locate_provider";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean correctedWithHistoryAddress;
    private long createTime;
    public boolean hasLocatedPermission;
    private boolean mIsCache;
    private long mLocateDuration;
    private String mLocateSdk;
    private LocationResultCode mLocationResultCode;
    private transient LocationSnifferReporter mLocationSnifferReporter;

    public long getLocateDuration() {
        return this.mLocateDuration;
    }

    public void setLocateDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "123785c4d6e4ef42a02173e8474b796d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "123785c4d6e4ef42a02173e8474b796d");
        } else {
            this.mLocateDuration = j;
        }
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fb4f78e2eb30b94b91a51c74ca331ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fb4f78e2eb30b94b91a51c74ca331ce");
        } else {
            this.createTime = j;
        }
    }

    public void setLocationSnifferReporter(LocationSnifferReporter locationSnifferReporter) {
        this.mLocationSnifferReporter = locationSnifferReporter;
    }

    public LocationSnifferReporter getLocationSnifferReporter() {
        return this.mLocationSnifferReporter;
    }

    public LocationResultCode getLocationResultCode() {
        return this.mLocationResultCode;
    }

    public void setLocationResultCode(LocationResultCode locationResultCode) {
        this.mLocationResultCode = locationResultCode;
    }

    public WMLocation(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e9dd2f5032845cd77d8a88edd1c72be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e9dd2f5032845cd77d8a88edd1c72be");
        } else {
            this.hasLocatedPermission = true;
        }
    }

    public WMLocation(MtLocation mtLocation) {
        super(mtLocation);
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fb983c31fba9b3ae8997a04a193cfe4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fb983c31fba9b3ae8997a04a193cfe4");
        } else {
            this.hasLocatedPermission = true;
        }
    }

    public String getLocationSDK() {
        return this.mLocateSdk;
    }

    public void setLocationSdk(String str) {
        this.mLocateSdk = str;
    }

    public static WMLocation parse(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb2e330c0027632adc374d8dd3c2166d", RobustBitConfig.DEFAULT_VALUE) ? (WMLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb2e330c0027632adc374d8dd3c2166d") : (WMLocation) d.a().fromJson(str, (Class<Object>) WMLocation.class);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cf4ca953ec1b1e708987ef837237224", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cf4ca953ec1b1e708987ef837237224") : d.a().toJson(this);
    }

    public boolean isCache() {
        return this.mIsCache;
    }

    public void setIsCache(boolean z) {
        this.mIsCache = z;
    }

    public boolean isCorrectedWithHistoryAddress() {
        return this.correctedWithHistoryAddress;
    }

    public void setCorrectedWithHistoryAddress(boolean z) {
        this.correctedWithHistoryAddress = z;
    }

    public void setHasLocatedPermission(boolean z) {
        this.hasLocatedPermission = z;
    }

    public boolean isHasLocatedPermission() {
        return this.hasLocatedPermission;
    }
}
