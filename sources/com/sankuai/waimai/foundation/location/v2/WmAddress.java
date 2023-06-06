package com.sankuai.waimai.foundation.location.v2;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class WmAddress {
    private static final int BASE_CODE = 1000;
    public static final int CHECK_ADDRESS_ERROR_REGEO_FAILED = 1208;
    public static final int CHECK_ADDRESS_ERROR_REGEO_SUCCESS = 1207;
    public static final int CHECK_ADDRESS_MATCH_REGEO_FAILED = 1209;
    public static final int CHECK_ADDRESS_NOT_LOGIN_REGEO_FAILED = 1203;
    public static final int CHECK_ADDRESS_NOT_LOGIN_REGEO_SUCCESS = 1204;
    public static final int CHECK_ADDRESS_NO_MATCH_REGEO_FAILED = 1206;
    public static final int CHECK_ADDRESS_NO_MATCH_REGEO_SUCCESS = 1205;
    public static final int CHECK_ADDRESS_REGEO_UNKNOWN = 1408;
    public static final int LOCATE_FAILED = 1202;
    public static final int NONE = 1000;
    public static final int REGEO_FAILED = 1201;
    public static final int SUCCESS = 1200;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String address;
    private long createTime;
    private long mLastRefreshTime;
    private City mMafCity;
    private City mMeitaunCity;
    private int mStatusCode;
    private WMLocation mWMLocation;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface StatusCode {
    }

    public WmAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f840c2e731ba95586099cb199d6aa75b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f840c2e731ba95586099cb199d6aa75b");
        } else {
            this.mStatusCode = 1000;
        }
    }

    public long getLastRefreshTime() {
        return this.mLastRefreshTime;
    }

    public void setLastRefreshTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ad22fb8f8a6488cd687bf47c6aebe1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ad22fb8f8a6488cd687bf47c6aebe1b");
        } else {
            this.mLastRefreshTime = j;
        }
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2d7089c97b77c00a2db0eb806ddb2a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2d7089c97b77c00a2db0eb806ddb2a0");
        } else {
            this.createTime = j;
        }
    }

    public void setWMLocation(WMLocation wMLocation) {
        this.mWMLocation = wMLocation;
    }

    public void setMeitaunCity(City city) {
        this.mMeitaunCity = city;
    }

    public void setMafCity(City city) {
        this.mMafCity = city;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public WMLocation getWMLocation() {
        return this.mWMLocation;
    }

    public City getMeitaunCity() {
        return this.mMeitaunCity;
    }

    public City getMafCity() {
        return this.mMafCity;
    }

    public String getAddress() {
        return this.address;
    }

    public static WmAddress parse(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da9178688310de3e61337e31c2a0e255", RobustBitConfig.DEFAULT_VALUE)) {
            return (WmAddress) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da9178688310de3e61337e31c2a0e255");
        }
        try {
            return (WmAddress) d.a().fromJson(str, (Class<Object>) WmAddress.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public boolean hasAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "287682de626a6fec6bc9e3a0fc3c0743", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "287682de626a6fec6bc9e3a0fc3c0743")).booleanValue() : !TextUtils.isEmpty(this.address);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6cb502714cebf4c4b12f0f4f6606bef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6cb502714cebf4c4b12f0f4f6606bef") : d.a().toJson(this);
    }
}
