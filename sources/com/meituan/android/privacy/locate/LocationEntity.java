package com.meituan.android.privacy.locate;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class LocationEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String adCode;
    private String address;
    private String city;
    private String country;
    private String detail;
    private String district;
    private long dpCityId;
    private String dpName;
    private String from;
    private String gpsQuality;
    private double gpslat;
    private double gpslng;
    private boolean hasAccuracy;
    private boolean hasAltitude;
    private boolean hasBearing;
    private boolean hasExtras;
    private boolean hasSpeed;
    private float heading;
    private String indoor;
    private double mAltitude;
    private float mBearing;
    private float mBearingAccuracyDegrees;
    private float mHorizontalAccuracyMeters;
    private boolean mIsFromMockProvider;
    private double mLatitude;
    private double mLongitude;
    private String mProvider;
    private float mSpeed;
    private float mSpeedAccuracyMetersPerSecond;
    private int mStatusCode;
    private long mTime;
    private float mVerticalAccuracyMeters;
    private String mallFloor;
    private String mallId;
    private String mallIdType;
    private String mallName;
    private String mallType;
    private String mallWeight;
    private long mtCityId;
    private String province;
    private int reqType;
    private String townCode;
    private String townShip;

    public LocationEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd2d8511a30647a02b250341415d4972", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd2d8511a30647a02b250341415d4972");
            return;
        }
        this.mStatusCode = 0;
        this.mLatitude = 0.0d;
        this.mLongitude = 0.0d;
        this.mHorizontalAccuracyMeters = 0.0f;
        this.mBearing = 0.0f;
        this.mSpeed = 0.0f;
        this.mAltitude = 0.0d;
        this.mTime = 0L;
        this.mVerticalAccuracyMeters = 0.0f;
        this.mSpeedAccuracyMetersPerSecond = 0.0f;
        this.mBearingAccuracyDegrees = 0.0f;
    }

    public MtLocation toMtLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "907ebba84b8dd9cf222a90d285bad226", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "907ebba84b8dd9cf222a90d285bad226");
        }
        MtLocation mtLocation = new MtLocation(this.mProvider, this.mStatusCode);
        mtLocation.setLatitude(this.mLatitude);
        mtLocation.setLongitude(this.mLongitude);
        if (this.hasAccuracy) {
            mtLocation.setAccuracy(this.mHorizontalAccuracyMeters);
        }
        if (this.hasBearing) {
            mtLocation.setBearing(this.mBearing);
        }
        if (this.hasSpeed) {
            mtLocation.setSpeed(this.mSpeed);
        }
        if (this.hasAltitude) {
            mtLocation.setAltitude(this.mAltitude);
        }
        mtLocation.setTime(this.mTime);
        if (Build.VERSION.SDK_INT >= 26) {
            mtLocation.setVerticalAccuracyMeters(this.mVerticalAccuracyMeters);
            mtLocation.setSpeedAccuracyMetersPerSecond(this.mSpeedAccuracyMetersPerSecond);
            mtLocation.setBearingAccuracyDegrees(this.mBearingAccuracyDegrees);
        }
        if (this.hasExtras) {
            Bundle bundle = new Bundle();
            bundle.putString("from", this.from);
            bundle.putInt(GearsLocator.REQ_TYPE, this.reqType);
            bundle.putDouble("gpslat", this.gpslat);
            bundle.putDouble("gpslng", this.gpslng);
            bundle.putFloat("heading", this.heading);
            bundle.putString(GearsLocator.ADDRESS, this.address);
            bundle.putString(GearsLocator.COUNTRY, this.country);
            bundle.putString("province", this.province);
            bundle.putString("city", this.city);
            bundle.putString(GearsLocator.DETAIL, this.detail);
            bundle.putString(GearsLocator.DISTRICT, this.district);
            bundle.putString(GearsLocator.AD_CODE, this.adCode);
            bundle.putString(GearsLocator.TOWN_CODE, this.townCode);
            bundle.putString(GearsLocator.TOWN_SHIP, this.townShip);
            bundle.putLong(GearsLocator.MT_CITY_ID, this.mtCityId);
            bundle.putLong(GearsLocator.DP_CITY_ID, this.dpCityId);
            bundle.putString(GearsLocator.DP_NAME, this.dpName);
            bundle.putString("id", this.mallId);
            bundle.putString("name", this.mallName);
            bundle.putString(GearsLocator.MALL_ID_TYPE, this.mallIdType);
            if (this.mallWeight != null) {
                try {
                    bundle.putDouble(GearsLocator.MALL_WEIGHT, Double.parseDouble(this.mallWeight));
                } catch (Throwable unused) {
                }
            }
            if (this.mallType != null) {
                try {
                    bundle.putInt("type", Integer.parseInt(this.mallType));
                } catch (Throwable unused2) {
                }
            }
            if (this.mallFloor != null) {
                try {
                    bundle.putInt(GearsLocator.MALL_FLOOR, Integer.parseInt(this.mallFloor));
                } catch (Throwable unused3) {
                }
            }
            bundle.putString("gpsQuality", this.gpsQuality);
            bundle.putString(GearsLocator.INDOOR, this.indoor);
            mtLocation.setExtras(bundle);
            return mtLocation;
        }
        return mtLocation;
    }

    public static LocationEntity toEntity(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "10bb680a7d5804726b1cd022c2d38308", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationEntity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "10bb680a7d5804726b1cd022c2d38308");
        }
        if (mtLocation == null) {
            return null;
        }
        LocationEntity locationEntity = new LocationEntity();
        locationEntity.mStatusCode = mtLocation.getStatusCode();
        locationEntity.mProvider = mtLocation.getProvider();
        locationEntity.mLatitude = mtLocation.getLatitude();
        locationEntity.mLongitude = mtLocation.getLongitude();
        locationEntity.hasAccuracy = mtLocation.hasAccuracy();
        locationEntity.mHorizontalAccuracyMeters = mtLocation.getAccuracy();
        locationEntity.hasBearing = mtLocation.hasBearing();
        locationEntity.mBearing = mtLocation.getBearing();
        locationEntity.hasSpeed = mtLocation.hasSpeed();
        locationEntity.mSpeed = mtLocation.getSpeed();
        locationEntity.hasAltitude = mtLocation.hasAltitude();
        locationEntity.mAltitude = mtLocation.getAltitude();
        locationEntity.mTime = mtLocation.getTime();
        if (Build.VERSION.SDK_INT >= 26) {
            locationEntity.mVerticalAccuracyMeters = mtLocation.getVerticalAccuracyMeters();
            locationEntity.mSpeedAccuracyMetersPerSecond = mtLocation.getSpeedAccuracyMetersPerSecond();
            locationEntity.mBearingAccuracyDegrees = mtLocation.getBearingAccuracyDegrees();
        }
        locationEntity.mIsFromMockProvider = mtLocation.isFromMockProvider();
        Bundle extras = mtLocation.getExtras();
        if (extras == null) {
            locationEntity.hasExtras = false;
            return locationEntity;
        }
        locationEntity.hasExtras = true;
        locationEntity.from = extras.getString("from");
        locationEntity.reqType = extras.getInt(GearsLocator.REQ_TYPE);
        locationEntity.gpslat = extras.getDouble("gpslat");
        locationEntity.gpslng = extras.getDouble("gpslng");
        locationEntity.heading = extras.getFloat("heading");
        locationEntity.address = extras.getString(GearsLocator.ADDRESS);
        locationEntity.country = extras.getString(GearsLocator.COUNTRY);
        locationEntity.province = extras.getString("province");
        locationEntity.city = extras.getString("city");
        locationEntity.detail = extras.getString(GearsLocator.DETAIL);
        locationEntity.district = extras.getString(GearsLocator.DISTRICT);
        locationEntity.adCode = extras.getString(GearsLocator.AD_CODE);
        locationEntity.townCode = extras.getString(GearsLocator.TOWN_CODE);
        locationEntity.townShip = extras.getString(GearsLocator.TOWN_SHIP);
        locationEntity.mtCityId = extras.getLong(GearsLocator.MT_CITY_ID);
        locationEntity.dpCityId = extras.getLong(GearsLocator.DP_CITY_ID);
        locationEntity.dpName = extras.getString(GearsLocator.DP_NAME);
        locationEntity.mallId = extras.getString("id");
        locationEntity.mallName = extras.getString("name");
        locationEntity.mallIdType = extras.getString(GearsLocator.MALL_ID_TYPE);
        Object obj = extras.get(GearsLocator.MALL_WEIGHT);
        if (obj instanceof Double) {
            locationEntity.mallWeight = String.valueOf(obj);
        }
        Object obj2 = extras.get("type");
        if (obj2 instanceof Integer) {
            locationEntity.mallType = String.valueOf(obj2);
        }
        Object obj3 = extras.get(GearsLocator.MALL_FLOOR);
        if (obj3 instanceof Integer) {
            locationEntity.mallFloor = String.valueOf(obj3);
        }
        locationEntity.gpsQuality = extras.getString("gpsQuality");
        locationEntity.indoor = extras.getString(GearsLocator.INDOOR);
        return locationEntity;
    }
}
