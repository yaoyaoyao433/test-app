package com.tencent.map.sdk.utilities.visualization.datamodels;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ScatterLatLng implements Parcelable {
    public static final Parcelable.Creator<ScatterLatLng> CREATOR = new Parcelable.Creator<ScatterLatLng>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng.1
        private static ScatterLatLng a(@NonNull Parcel parcel) {
            return new ScatterLatLng(parcel);
        }

        private static ScatterLatLng[] a(int i) {
            return new ScatterLatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ScatterLatLng[] newArray(int i) {
            return new ScatterLatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ScatterLatLng createFromParcel(@NonNull Parcel parcel) {
            return new ScatterLatLng(parcel);
        }
    };
    private static final double DEFAULT_INTENSITY = 1.0d;
    private static final int DEFAULT_TYPE = 0;
    private double mIntensity;
    private LatLng mPoint;
    private int mType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mPoint, i);
        parcel.writeInt(this.mType);
        parcel.writeDouble(this.mIntensity);
    }

    protected ScatterLatLng(Parcel parcel) {
        this.mPoint = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.mType = parcel.readInt();
        this.mIntensity = parcel.readDouble();
    }

    public ScatterLatLng(LatLng latLng, int i) {
        setPoint(latLng);
        setType(i);
        setIntensity(1.0d);
    }

    public ScatterLatLng(LatLng latLng, double d) {
        setPoint(latLng);
        setType(0);
        setIntensity(d);
    }

    public ScatterLatLng(LatLng latLng, int i, double d) {
        setPoint(latLng);
        setType(i);
        setIntensity(d);
    }

    public ScatterLatLng(LatLng latLng) {
        this(latLng, 0, 1.0d);
    }

    public void setPoint(LatLng latLng) {
        this.mPoint = latLng;
    }

    public LatLng getPoint() {
        return this.mPoint;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public int getType() {
        return this.mType;
    }

    public void setIntensity(double d) {
        this.mIntensity = d;
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ScatterLatLng) {
            if (obj == this) {
                return true;
            }
            if (this.mPoint != null) {
                ScatterLatLng scatterLatLng = (ScatterLatLng) obj;
                return this.mPoint.equals(scatterLatLng.mPoint) && this.mType == scatterLatLng.mType && this.mIntensity == scatterLatLng.mIntensity;
            }
            ScatterLatLng scatterLatLng2 = (ScatterLatLng) obj;
            return scatterLatLng2.mPoint == null && this.mType == scatterLatLng2.mType && this.mIntensity == scatterLatLng2.mIntensity;
        }
        return false;
    }

    public int hashCode() {
        if (this.mPoint != null) {
            return this.mPoint.hashCode() + ((int) (this.mType * 1000000.0d)) + ((int) (this.mIntensity * 1000000.0d));
        }
        return ((int) (this.mType * 1000000.0d)) + ((int) (this.mIntensity * 1000000.0d));
    }
}
