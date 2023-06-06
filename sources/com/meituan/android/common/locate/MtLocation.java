package com.meituan.android.common.locate;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class MtLocation implements Parcelable {
    public static final Parcelable.Creator<MtLocation> CREATOR = new Parcelable.Creator<MtLocation>() { // from class: com.meituan.android.common.locate.MtLocation.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final MtLocation createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e86cc69ae82f751fad1f2ea526d6ea94", RobustBitConfig.DEFAULT_VALUE) ? (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e86cc69ae82f751fad1f2ea526d6ea94") : new MtLocation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final MtLocation[] newArray(int i) {
            return new MtLocation[i];
        }
    };
    private static final int HAS_ALTITUDE_MASK = 1;
    private static final int HAS_BEARING_MASK = 4;
    private static final int HAS_HORIZONTAL_ACCURACY_MASK = 8;
    private static final int HAS_SPEED_MASK = 2;
    public static final int STATUS_AUTH_FAILED = 6;
    public static final int STATUS_CLIENT_EXCEPTION = 7;
    public static final int STATUS_HTTP_HIJACK_RESPONSE = 10;
    public static final int STATUS_INIT_FAILED = 8;
    public static final int STATUS_INVALID_PARAMETERS = 2;
    public static final int STATUS_JSON_ERROR = 4;
    public static final int STATUS_NETWORK_ERROR = 3;
    public static final int STATUS_NONE_GPS_SERVER = 14;
    public static final int STATUS_NONE_PERM_SERVER = 13;
    public static final int STATUS_NONE_TIME_OUT = 11;
    public static final int STATUS_NONE_WIFI_SCAN = 12;
    public static final int STATUS_PERMISSONS_ERROR = 9;
    public static final int STATUS_SERVER_ERROR = 5;
    public static final int STATUS_SINGLE_WIFI_WITHOUT_CELL = 1;
    public static final int STATUS_SUCCESS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private double mAltitude;
    private float mBearing;
    private float mBearingAccuracyDegrees;
    private Bundle mExtras;
    private int mFieldsMask;
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

    public MtLocation(Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a412ed53d93add19f0f5b688a161ec9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a412ed53d93add19f0f5b688a161ec9");
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
        this.mExtras = null;
        this.mVerticalAccuracyMeters = 0.0f;
        this.mSpeedAccuracyMetersPerSecond = 0.0f;
        this.mBearingAccuracyDegrees = 0.0f;
        this.mFieldsMask = 0;
        if (location == null) {
            return;
        }
        if (location.getLongitude() == 0.0d || location.getLatitude() == 0.0d) {
            this.mStatusCode = 7;
            return;
        }
        this.mStatusCode = 0;
        set(location);
    }

    public MtLocation(Location location, int i) {
        Object[] objArr = {location, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca0935a1ae1739ba98044729dde5b07e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca0935a1ae1739ba98044729dde5b07e");
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
        this.mExtras = null;
        this.mVerticalAccuracyMeters = 0.0f;
        this.mSpeedAccuracyMetersPerSecond = 0.0f;
        this.mBearingAccuracyDegrees = 0.0f;
        this.mFieldsMask = 0;
        if (location == null) {
            return;
        }
        this.mStatusCode = i;
        set(location);
    }

    public MtLocation(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d53f7db1fe0b39096c28da72ae036da3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d53f7db1fe0b39096c28da72ae036da3");
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
        this.mExtras = null;
        this.mVerticalAccuracyMeters = 0.0f;
        this.mSpeedAccuracyMetersPerSecond = 0.0f;
        this.mBearingAccuracyDegrees = 0.0f;
        this.mFieldsMask = 0;
        this.mStatusCode = parcel.readInt();
        this.mProvider = parcel.readString();
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.mHorizontalAccuracyMeters = parcel.readFloat();
        this.mBearing = parcel.readFloat();
        this.mSpeed = parcel.readFloat();
        this.mAltitude = parcel.readDouble();
        this.mTime = parcel.readLong();
        this.mExtras = parcel.readBundle();
        this.mVerticalAccuracyMeters = parcel.readFloat();
        this.mSpeedAccuracyMetersPerSecond = parcel.readFloat();
        this.mBearingAccuracyDegrees = parcel.readFloat();
        this.mIsFromMockProvider = parcel.readByte() != 0;
        this.mFieldsMask = parcel.readInt();
    }

    public MtLocation(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f540d4081ac902f921ad8109f279a24e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f540d4081ac902f921ad8109f279a24e");
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
        this.mExtras = null;
        this.mVerticalAccuracyMeters = 0.0f;
        this.mSpeedAccuracyMetersPerSecond = 0.0f;
        this.mBearingAccuracyDegrees = 0.0f;
        this.mFieldsMask = 0;
        if (mtLocation == null) {
            this.mProvider = "";
            return;
        }
        this.mStatusCode = mtLocation.mStatusCode;
        this.mProvider = mtLocation.mProvider;
        this.mLatitude = mtLocation.mLatitude;
        this.mLongitude = mtLocation.mLongitude;
        this.mHorizontalAccuracyMeters = mtLocation.mHorizontalAccuracyMeters;
        this.mBearing = mtLocation.mBearing;
        this.mSpeed = mtLocation.mSpeed;
        this.mTime = mtLocation.mTime;
        this.mAltitude = mtLocation.mAltitude;
        this.mVerticalAccuracyMeters = mtLocation.mVerticalAccuracyMeters;
        this.mSpeedAccuracyMetersPerSecond = mtLocation.mSpeedAccuracyMetersPerSecond;
        this.mBearingAccuracyDegrees = mtLocation.mBearingAccuracyDegrees;
        this.mIsFromMockProvider = mtLocation.mIsFromMockProvider;
        this.mFieldsMask = mtLocation.mFieldsMask;
        this.mExtras = mtLocation.mExtras != null ? new Bundle(mtLocation.mExtras) : null;
    }

    public MtLocation(MtLocation mtLocation, int i) {
        this(mtLocation);
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bd8d2a74eb77eefb936bed23c73affe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bd8d2a74eb77eefb936bed23c73affe");
        } else {
            this.mStatusCode = i;
        }
    }

    public MtLocation(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29225f67afb59cab2ada5db64e92bd63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29225f67afb59cab2ada5db64e92bd63");
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
        this.mExtras = null;
        this.mVerticalAccuracyMeters = 0.0f;
        this.mSpeedAccuracyMetersPerSecond = 0.0f;
        this.mBearingAccuracyDegrees = 0.0f;
        this.mFieldsMask = 0;
        this.mProvider = str;
    }

    public MtLocation(String str, int i) {
        this(str);
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f850c95e974ebc9777afbb8127bb0879", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f850c95e974ebc9777afbb8127bb0879");
        } else {
            this.mStatusCode = i;
        }
    }

    private void set(Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa35d756476367d4db45bec04bbb3b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa35d756476367d4db45bec04bbb3b49");
            return;
        }
        this.mProvider = location.getProvider();
        this.mLatitude = location.getLatitude();
        this.mLongitude = location.getLongitude();
        if (location.hasAccuracy()) {
            setAccuracy(location.getAccuracy());
        }
        if (location.hasBearing()) {
            setBearing(location.getBearing());
        }
        if (location.hasAltitude()) {
            setAltitude(location.getAltitude());
        }
        if (location.hasSpeed()) {
            setSpeed(location.getSpeed());
        }
        this.mTime = location.getTime();
        if (Build.VERSION.SDK_INT >= 18) {
            this.mIsFromMockProvider = location.isFromMockProvider();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.mVerticalAccuracyMeters = location.getVerticalAccuracyMeters();
            this.mSpeedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
            this.mBearingAccuracyDegrees = location.getBearingAccuracyDegrees();
        }
        this.mExtras = location.getExtras() == null ? null : new Bundle(location.getExtras());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getAccuracy() {
        return this.mHorizontalAccuracyMeters;
    }

    public double getAltitude() {
        return this.mAltitude;
    }

    public float getBearing() {
        return this.mBearing;
    }

    @RequiresApi(api = 26)
    public float getBearingAccuracyDegrees() {
        return this.mBearingAccuracyDegrees;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    @Deprecated
    public Location getLocation() {
        return null;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public float getSpeed() {
        return this.mSpeed;
    }

    @RequiresApi(api = 26)
    public float getSpeedAccuracyMetersPerSecond() {
        return this.mSpeedAccuracyMetersPerSecond;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public long getTime() {
        return this.mTime;
    }

    @RequiresApi(api = 26)
    public float getVerticalAccuracyMeters() {
        return this.mVerticalAccuracyMeters;
    }

    public boolean hasAccuracy() {
        return (this.mFieldsMask & 8) != 0;
    }

    public boolean hasAltitude() {
        return (this.mFieldsMask & 1) != 0;
    }

    public boolean hasBearing() {
        return (this.mFieldsMask & 4) != 0;
    }

    public boolean hasSpeed() {
        return (this.mFieldsMask & 2) != 0;
    }

    @RequiresApi(api = 18)
    public boolean isFromMockProvider() {
        return this.mIsFromMockProvider;
    }

    public void setAccuracy(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3c3ebb2bd4b43f8744c5316c42f98d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3c3ebb2bd4b43f8744c5316c42f98d2");
            return;
        }
        this.mHorizontalAccuracyMeters = f;
        this.mFieldsMask |= 8;
    }

    public void setAltitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b298e75aa0259f6cb182dca51995ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b298e75aa0259f6cb182dca51995ff3");
            return;
        }
        this.mAltitude = d;
        this.mFieldsMask |= 1;
    }

    public void setBearing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f720d0ba7b5c5a53884875122e5d4df2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f720d0ba7b5c5a53884875122e5d4df2");
            return;
        }
        while (f < 0.0f) {
            f += 360.0f;
        }
        while (f >= 360.0f) {
            f -= 360.0f;
        }
        this.mBearing = f;
        this.mFieldsMask |= 4;
    }

    @RequiresApi(api = 26)
    public void setBearingAccuracyDegrees(float f) {
        this.mBearingAccuracyDegrees = f;
    }

    public void setExtras(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a853ee7872e9cd7b8f9e8e0fab85f823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a853ee7872e9cd7b8f9e8e0fab85f823");
        } else {
            this.mExtras = bundle == null ? null : new Bundle(bundle);
        }
    }

    public void setLatitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14e29b0c39bb77be729817fc43c931e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14e29b0c39bb77be729817fc43c931e9");
        } else {
            this.mLatitude = d;
        }
    }

    public void setLongitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d94b5ab7d76a52182a3635b99d0f85d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d94b5ab7d76a52182a3635b99d0f85d");
        } else {
            this.mLongitude = d;
        }
    }

    public void setProvider(String str) {
        this.mProvider = str;
    }

    public void setSpeed(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c419cd71ac4b3eab8b14a0fcb3d1f55a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c419cd71ac4b3eab8b14a0fcb3d1f55a");
            return;
        }
        this.mSpeed = f;
        this.mFieldsMask |= 2;
    }

    @RequiresApi(api = 26)
    public void setSpeedAccuracyMetersPerSecond(float f) {
        this.mSpeedAccuracyMetersPerSecond = f;
    }

    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }

    public void setTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b5f1ea9b158255afa7b096e864d4f8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b5f1ea9b158255afa7b096e864d4f8e");
        } else {
            this.mTime = j;
        }
    }

    @RequiresApi(api = 26)
    public void setVerticalAccuracyMeters(float f) {
        this.mVerticalAccuracyMeters = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec0697f04ae9f904096b17014db48a2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec0697f04ae9f904096b17014db48a2e");
            return;
        }
        parcel.writeInt(this.mStatusCode);
        parcel.writeString(this.mProvider);
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeFloat(this.mHorizontalAccuracyMeters);
        parcel.writeFloat(this.mBearing);
        parcel.writeFloat(this.mSpeed);
        parcel.writeDouble(this.mAltitude);
        parcel.writeLong(this.mTime);
        parcel.writeBundle(this.mExtras);
        parcel.writeFloat(this.mVerticalAccuracyMeters);
        parcel.writeFloat(this.mSpeedAccuracyMetersPerSecond);
        parcel.writeFloat(this.mBearingAccuracyDegrees);
        parcel.writeByte(this.mIsFromMockProvider ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mFieldsMask);
    }
}
