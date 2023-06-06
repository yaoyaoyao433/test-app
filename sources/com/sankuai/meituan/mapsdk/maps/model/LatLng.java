package com.sankuai.meituan.mapsdk.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.FloatRange;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new Parcelable.Creator<LatLng>() { // from class: com.sankuai.meituan.mapsdk.maps.model.LatLng.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatLng createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0ba10126ce60e2fc165aa117af75a8a", RobustBitConfig.DEFAULT_VALUE)) {
                return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0ba10126ce60e2fc165aa117af75a8a");
            }
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            parcel.readDouble();
            return new LatLng(readDouble2, readDouble);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public final double altitude;
    public final double latitude;
    public final double longitude;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng(@FloatRange(from = -90.0d, to = 90.0d) double d, @FloatRange(from = -180.0d, to = 180.0d) double d2, double d3) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91ca1b7ec43ccc3b705b29cd1babf69e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91ca1b7ec43ccc3b705b29cd1babf69e");
        } else if (Double.isNaN(d) || Double.isInfinite(d) || Double.isNaN(d2) || Double.isInfinite(d2)) {
            this.latitude = 39.90850304161814d;
            this.longitude = 116.39747477070638d;
            this.altitude = d3;
        } else if (d < -90.0d || d > 90.0d) {
            this.latitude = 39.90850304161814d;
            this.longitude = 116.39747477070638d;
            this.altitude = d3;
        } else if (d2 < -180.0d || d2 > 180.0d) {
            this.latitude = 39.90850304161814d;
            this.longitude = 116.39747477070638d;
            this.altitude = d3;
        } else {
            this.latitude = d;
            this.longitude = d2;
            this.altitude = d3;
        }
    }

    public LatLng(double d, double d2) {
        this(d, d2, 0.0d);
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "351c0c633661f42deb232446b4785ffb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "351c0c633661f42deb232446b4785ffb");
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9d32c0e74b5199ebb678fc47ec8b984", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9d32c0e74b5199ebb678fc47ec8b984");
        }
        return "lat/lng: (" + this.latitude + CommonConstant.Symbol.COMMA + this.longitude + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "677455fa1e605bb1b5c9cba14b8457fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "677455fa1e605bb1b5c9cba14b8457fc")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Math.abs(latLng.latitude - this.latitude) <= 1.0E-7d && Math.abs(latLng.longitude - this.longitude) <= 1.0E-7d && Math.abs(latLng.altitude - this.altitude) <= 1.0E-7d;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be650cb69cb337010cbc9056e926c29c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be650cb69cb337010cbc9056e926c29c")).intValue();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        long doubleToLongBits3 = Double.doubleToLongBits(this.altitude);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "705938da752a7f7f063afcaf43a8ed98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "705938da752a7f7f063afcaf43a8ed98");
            return;
        }
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.altitude);
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c162f99872699a8471406ac5f635d853", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c162f99872699a8471406ac5f635d853")).booleanValue() : this.longitude >= -180.0d && this.longitude <= 180.0d && !Double.isNaN(this.longitude) && !Double.isInfinite(this.longitude) && this.latitude >= -90.0d && this.latitude <= 90.0d && !Double.isNaN(this.latitude) && !Double.isInfinite(this.latitude);
    }
}
