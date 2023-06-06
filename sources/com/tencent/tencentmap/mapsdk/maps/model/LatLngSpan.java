package com.tencent.tencentmap.mapsdk.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LatLngSpan implements Parcelable {
    public static final Parcelable.Creator<LatLngSpan> CREATOR = new Parcelable.Creator<LatLngSpan>() { // from class: com.tencent.tencentmap.mapsdk.maps.model.LatLngSpan.1
        private static LatLngSpan a(@NonNull Parcel parcel) {
            return new LatLngSpan(parcel);
        }

        private static LatLngSpan[] a(int i) {
            return new LatLngSpan[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LatLngSpan[] newArray(int i) {
            return new LatLngSpan[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLngSpan createFromParcel(@NonNull Parcel parcel) {
            return new LatLngSpan(parcel);
        }
    };
    private double mLatitudeSpan;
    private double mLongitudeSpan;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LatLngSpan(@NonNull Parcel parcel) {
        this.mLatitudeSpan = parcel.readDouble();
        this.mLongitudeSpan = parcel.readDouble();
    }

    public LatLngSpan(double d, double d2) {
        this.mLatitudeSpan = d;
        this.mLongitudeSpan = d2;
    }

    public double getLatitudeSpan() {
        return this.mLatitudeSpan;
    }

    public void setLatitudeSpan(double d) {
        this.mLatitudeSpan = d;
    }

    public double getLongitudeSpan() {
        return this.mLongitudeSpan;
    }

    public void setLongitudeSpan(double d) {
        this.mLongitudeSpan = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngSpan) {
            LatLngSpan latLngSpan = (LatLngSpan) obj;
            return this.mLongitudeSpan == latLngSpan.getLongitudeSpan() && this.mLatitudeSpan == latLngSpan.getLatitudeSpan();
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitudeSpan);
        parcel.writeDouble(this.mLongitudeSpan);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mLatitudeSpan);
        long doubleToLongBits2 = Double.doubleToLongBits(this.mLongitudeSpan);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }
}
